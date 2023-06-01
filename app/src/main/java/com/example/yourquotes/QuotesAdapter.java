package com.example.yourquotes;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.MyViewHolder> {
    QuotesActivity quotesActivity;
    ArrayList<QuotesModelclass> quotelist;
    QuotesInterface quotesInterface;
    public QuotesAdapter(QuotesActivity quotesActivity, ArrayList<QuotesModelclass> quotelist, QuotesInterface quotesInterface) {
        this.quotesActivity=quotesActivity;
        this.quotelist=quotelist;
        this.quotesInterface=quotesInterface;
    }

    @NonNull
    @Override
    public QuotesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(quotesActivity).inflate(R.layout.quotes_item_file,parent,false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }
    @Override
    public void onBindViewHolder(@NonNull QuotesAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        int p;
        p=position;
        holder.txtquote.setText( quotelist.get(position).getQuotes());
        holder.imgCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quotesInterface.Clickcpy(quotelist.get(p).quotes);
            }
        });
       holder.imgShare.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               quotesInterface.Clickshare(quotelist.get(p).quotes);
           }
       });

//        holder.imgCategory.setImageResource(categorylist.get(position).getCategoryimg());


//        holder.imgShare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//                Intent p = new Intent(Intent.ACTION_SEND);
//                p.setType("text/plain");
//
//                ActionBarPolicy quoteslist;
//                String shyari_item = quoteslist.get( position ).Quoets;
//                p.putExtra(Intent.EXTRA_TEXT, shyari_item);
//                Intent chooser = Intent.createChooser(p, "Share");
//                chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                QuotesActivity.startActivity(chooser);
//
//            }
//        });
    }
    @Override
    public int getItemCount() {
        return quotelist.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtquote;
        ImageView imgCopy , imgShare;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtquote=itemView.findViewById(R.id.txtquote);
            imgCopy=itemView.findViewById(R.id.imgCopy);
            imgShare=itemView.findViewById(R.id.imgShare);
        }
    }
}
