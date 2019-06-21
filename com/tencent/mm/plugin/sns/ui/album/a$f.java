package com.tencent.mm.plugin.sns.ui.album;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$f extends RecyclerView.v
{
  TextView gnf;
  GridLayoutManager iYH;
  c rFA;
  RecyclerView rFB;
  private LinearLayout rvN;
  TextView timeTv;

  public a$f(a parama, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(39965);
    this.rFA = null;
    this.gnf = null;
    this.timeTv = null;
    this.rFB = null;
    this.iYH = null;
    this.rvN = null;
    this.gnf = ((TextView)paramView.findViewById(2131827662));
    this.timeTv = ((TextView)paramView.findViewById(2131827664));
    this.rFB = ((RecyclerView)paramView.findViewById(2131827665));
    this.iYH = new GridLayoutManager(3);
    this.rFA = new c();
    this.rFA.rFE = parama.rFq;
    AppMethodBeat.o(39965);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.a.f
 * JD-Core Version:    0.6.2
 */