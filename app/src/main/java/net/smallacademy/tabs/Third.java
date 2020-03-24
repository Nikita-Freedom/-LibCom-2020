package net.smallacademy.tabs;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.LibForumNew.R;
import com.google.android.material.snackbar.Snackbar;

import net.smallacademy.tabs.API.APIHelper;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Third extends Fragment {
    private RecyclerView recipesList;
    private RecipeAdapter recipeAdapter;
    private SwipeRefreshLayout swipeRefresh;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_third, null);
        recipesList = v.findViewById(R.id.list);
        recipesList.setLayoutManager(new LinearLayoutManager(getContext()));
        swipeRefresh = v.findViewById(R.id.swipe_refresh);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener()

        {
            @Override
            public void onRefresh () {
                swipeRefresh.setRefreshing(true);
                loadRecipes();
            }
        });

        recipeAdapter =new RecipeAdapter();
        recipesList.setAdapter(recipeAdapter);
        recipeAdapter.setRecipeAdapterListener(new RecipeAdapter.RecipeAdapterListener()

        {
            @Override
            public void onClick (Recipe recipe){
                Intent intent = new Intent(getContext(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.RECIPE_URL, recipe.content);
                startActivity(intent);
            }
        });

        swipeRefresh.setRefreshing(true);
        loadRecipes();
        return v;
    }
    private void loadRecipes() {
        APIHelper.getInstance().getRecipes3(14, new APIHelper.APIHelperCallback<List<Recipe>>() {
            @Override
            public void onResponse(List<Recipe> response) {
                recipeAdapter.setData(response);
                recipeAdapter.notifyDataSetChanged();
                swipeRefresh.setRefreshing(false);
            }

            @Override
            public void onError() {
                Snackbar.make(recipesList, "Проверьте подключение к интернету", Snackbar.LENGTH_LONG).show();
                swipeRefresh.setRefreshing(false);
            }
        });
    }

}
