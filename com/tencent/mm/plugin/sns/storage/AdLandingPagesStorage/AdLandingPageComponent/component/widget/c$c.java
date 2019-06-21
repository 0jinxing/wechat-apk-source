package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$c extends RecyclerView.m
{
  RecyclerView iJP;
  private LinearLayoutManager qYS;
  int qYT;
  private int qYU;
  private int qYV;
  private long qYW;
  Runnable qYX;

  public c$c(c paramc, RecyclerView paramRecyclerView, LinearLayoutManager paramLinearLayoutManager)
  {
    AppMethodBeat.i(37481);
    this.qYT = 2147483647;
    this.qYU = -1;
    this.qYV = -1;
    this.qYW = 0L;
    this.qYX = new c.c.1(this);
    this.iJP = paramRecyclerView;
    this.qYS = paramLinearLayoutManager;
    AppMethodBeat.o(37481);
  }

  private void cpo()
  {
    AppMethodBeat.i(37482);
    this.iJP.getHandler().removeCallbacks(this.qYX);
    AppMethodBeat.o(37482);
  }

  private void fn(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37485);
    c.a(this.rcG, paramInt1, paramInt2);
    AppMethodBeat.o(37485);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37484);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    AppMethodBeat.o(37484);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(37483);
    super.c(paramRecyclerView, paramInt);
    if (paramInt != this.qYT)
    {
      if (paramInt != 1)
        cpo();
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      this.qYT = paramInt;
      ab.d("RecyclerViewExposureMgr", "state ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(37483);
      return;
      this.rcG.cpX();
      if (this.qYT == 2)
      {
        int i = this.qYS.iQ();
        int j = this.qYS.iS();
        if (j < this.qYU)
        {
          fn(j, this.qYU);
        }
        else if (i > this.qYV)
        {
          fn(this.qYV, i);
          continue;
          cpo();
          this.iJP.postDelayed(this.qYX, 100L);
          continue;
          this.qYU = this.qYS.iQ();
          this.qYV = this.qYS.iS();
          this.qYW = System.currentTimeMillis();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c.c
 * JD-Core Version:    0.6.2
 */