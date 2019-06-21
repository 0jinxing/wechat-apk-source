package com.tencent.mm.plugin.sns.ui.album;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.LoadingMoreView;

final class a$c extends RecyclerView.v
{
  LoadingMoreView rFu;

  public a$c(a parama, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(39962);
    this.rFu = null;
    this.rFu = ((LoadingMoreView)paramView.findViewById(2131827666));
    AppMethodBeat.o(39962);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.a.c
 * JD-Core Version:    0.6.2
 */