package com.example.immadisairaj.recyclerapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {
    private List<Fruit> fruitList;

    public FruitAdapter(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public FruitAdapter.FruitViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new FruitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_list, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.FruitViewHolder fruitViewHolder, int i) {
        int image = fruitList.get(i).getImage();
        String name = fruitList.get(i).getName();

        fruitViewHolder.imageView.setImageResource(image);
        fruitViewHolder.textView.setText(name);
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    class FruitViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_fruit)
        ImageView imageView;

        @BindView(R.id.tv_fruit)
        TextView textView;

        FruitViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
