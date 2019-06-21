package com.tencent.mm.plugin.sns.ui.album;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.widget.QDisFadeImageView;
import com.tencent.mm.ui.widget.QImageView.a;

final class c$b extends RecyclerView.v
{
  public ImageView iNr;
  public QDisFadeImageView rFF;

  public c$b(c paramc, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(39981);
    this.rFF = null;
    this.iNr = null;
    this.rFF = ((QDisFadeImageView)paramView.findViewById(2131827668));
    this.iNr = ((ImageView)paramView.findViewById(2131827669));
    this.iNr.setImageDrawable(ah.e(this.iNr.getContext().getResources().getDrawable(2131231426), -1));
    this.rFF.setScaleType(QImageView.a.zNT);
    this.rFF.setOnClickListener(new c.b.1(this, paramc));
    AppMethodBeat.o(39981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.c.b
 * JD-Core Version:    0.6.2
 */