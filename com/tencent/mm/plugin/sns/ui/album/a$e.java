package com.tencent.mm.plugin.sns.ui.album;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.imageview.WeImageView;

final class a$e extends RecyclerView.v
{
  private TextView rFw;
  private WeImageView rFx;

  public a$e(a parama, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(39964);
    this.rFw = null;
    this.rFx = null;
    this.rFw = ((TextView)paramView.findViewById(2131827670));
    this.rFx = ((WeImageView)paramView.findViewById(2131827671));
    this.rFw.setOnClickListener(new a.e.1(this, parama));
    AppMethodBeat.o(39964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.a.e
 * JD-Core Version:    0.6.2
 */