package com.example.tutorial_libri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private Context mCtx;    //this context we will use to inflate the layout
    private List<Libro> BookList;

    //costruttore
    public BookAdapter(Context mCtx, List<Libro> bookList) {
        this.mCtx = mCtx;
        BookList = bookList;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_libro, null);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BookViewHolder  holder, int position) {
        //getting the product of the specified position
        Libro book = BookList.get(position);
        //binding the data with the viewholder views
        holder.textViewTitolo.setText(book.getTitolo());
        holder.textViewPrezzo.setText(String.valueOf(book.getPrezzo()));
    }

    @Override
    public int getItemCount() {
        return BookList.size();
    }


    class BookViewHolder extends RecyclerView.ViewHolder {        //Un ViewHolder descrive la visualizzazione di un elemento e i metadati sulla sua posizione all'interno di RecyclerView

        TextView textViewTitolo, textViewPrezzo;
        ImageView imageView;

        public BookViewHolder(View itemView) {
            super(itemView);

            textViewTitolo = itemView.findViewById(R.id.textView_titolo);
            textViewPrezzo = itemView.findViewById(R.id.textView_prezzo);

            imageView = itemView.findViewById(R.id.imageView);

        }

    }


}
