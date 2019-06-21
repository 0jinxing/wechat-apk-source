package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$c extends RecyclerView.m
{
  RecyclerView iJP;
  private LinearLayoutManager qYS;
  int qYT;
  private int qYU;
  private int qYV;
  private long qYW;
  Runnable qYX;

  public b$c(b paramb, RecyclerView paramRecyclerView, LinearLayoutManager paramLinearLayoutManager)
  {
    AppMethodBeat.i(37019);
    this.qYT = 2147483647;
    this.qYU = -1;
    this.qYV = -1;
    this.qYW = 0L;
    this.qYX = new b.c.1(this);
    this.iJP = paramRecyclerView;
    this.qYS = paramLinearLayoutManager;
    AppMethodBeat.o(37019);
  }

  private void cpo()
  {
    AppMethodBeat.i(37020);
    this.iJP.getHandler().removeCallbacks(this.qYX);
    AppMethodBeat.o(37020);
  }

  private void h(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(37023);
    ab.d("AdLandingCarouselComp", "flyingItems start %d, end %d, timeExposure %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
    b.a(this.qYP, paramInt1, paramInt2, paramLong);
    AppMethodBeat.o(37023);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37022);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    AppMethodBeat.o(37022);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(37021);
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
      ab.d("AdLandingCarouselComp", "state ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(37021);
      return;
      b.a(this.qYP);
      if (this.qYT == 2)
      {
        int i = this.qYS.iQ();
        int j = this.qYS.iS();
        if (j < this.qYU)
        {
          h(j, this.qYU, System.currentTimeMillis() - this.qYW);
        }
        else if (i > this.qYV)
        {
          h(this.qYV, i, System.currentTimeMillis() - this.qYW);
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
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b.c
 * JD-Core Version:    0.6.2
 */