package com.example.testagendatest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//import android.graphics.Color;
//import android.graphics.PorterDuff;
//import androidx.appcompat.app.AlertController;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

private List<ListElement> mData;
private LayoutInflater mInflater;
private Context context;
final ListAdapter.OnItemClickListener listener;

public interface OnItemClickListener {

    void onItemClick(ListElement item);

}


    public ListAdapter(List<ListElement> itemList, Context context, ListAdapter.OnItemClickListener listener){

    this.mInflater= LayoutInflater.from(context);
    this.context= context;
    this.mData= itemList;
    this.listener= listener;

}

@Override
    public int getItemCount(){ return mData.size();}

@Override

    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

    View view=mInflater.from(parent.getContext()).inflate(R.layout.list_element,parent, false);

    return new ListAdapter.ViewHolder(view);


}

@Override

    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){


holder.card.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade));

    holder.bindData(mData.get(position));

}

public void setItems(List<ListElement> items){ mData = items; }


public class ViewHolder extends RecyclerView.ViewHolder{

   // ImageView iconImage;
    TextView Nombrepaciente, tratamiento, dia;
    CardView card;


    ViewHolder( View itemView){

        super(itemView);

        //iconImage= itemView.findViewById(R.id.iconImageView);
        Nombrepaciente=itemView.findViewById(R.id.nombrePaciente);
        tratamiento=itemView.findViewById(R.id.tratamiento);
        dia=itemView.findViewById(R.id.dia);
        card = itemView.findViewById(R.id.cardview);

    }

void bindData(final ListElement item){


        //iconImage.setColorFilter(Color.parseColor(item.getColor(), PorterDuff.Mode.SRC_IN));// es para apis mayores o iguales a 30
        Nombrepaciente.setText(item.getName());
        tratamiento.setText(item.getTratamiento());
        dia.setText(item.getDia());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listener.onItemClick(item);



            }
        });
}




}



}
