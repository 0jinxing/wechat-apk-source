package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryBaseVideoUI$3 extends RecyclerView.m
{
  TopStoryBaseVideoUI$3(TopStoryBaseVideoUI paramTopStoryBaseVideoUI)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1720);
    if ((!this.sEv.sEf) || (paramInt2 == 0))
      AppMethodBeat.o(1720);
    while (true)
    {
      return;
      this.sEv.cGG();
      AppMethodBeat.o(1720);
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(1719);
    if (!this.sEv.sEf)
    {
      AppMethodBeat.o(1719);
      return;
    }
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(1719);
      break;
      if (this.sEv.sEt)
      {
        this.sEv.sEe.b(this.sEv);
        AppMethodBeat.o(1719);
        break;
      }
      this.sEv.sEa.b(this.sEv);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.3
 * JD-Core Version:    0.6.2
 */