package br.com.bossini.pessoal_usjt_ads3anmca_app_helpdesk_viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChamadoViewHolder extends RecyclerView.ViewHolder {
    public ImageView filaIconImageView;
    public TextView statusChamadoNaFilaTextView;
    public TextView dataAberturaChamadoNaFilaTextView;
    public TextView dataFechamentoChamadoNaFilaTextView;
    public TextView descricaoChamadoNaFilaTextView;
    public ChamadoViewHolder (View v){
        super (v);
        filaIconImageView =v.findViewById(R.id.filaIconImageView);
        descricaoChamadoNaFilaTextView =
                v.findViewById(R.id.descricaoChamadoNaFilaTextView);
        statusChamadoNaFilaTextView =
                v.findViewById(R.id.statusChamadoNaFilaTextView);
        dataAberturaChamadoNaFilaTextView =
                v.findViewById(R.id.dataAberturaChamadoNaFilaTextView);
        dataFechamentoChamadoNaFilaTextView =
                v.findViewById(R.id.dataFechamentoChamadoNaFilaTextView);
    }
}
