package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.r;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends RecyclerView.m
{
  RecyclerView.r aoC;
  private int ape;
  private int iXP;
  private float ibD;
  BizTimeLineHotListView jQE;
  private f.b jQF;
  f.a jQG;
  private int jis;
  int jiy;
  private int joj;
  private int jok;
  RecyclerView.r jol;
  int jom;
  private boolean joo;
  LinearLayoutManager jop;
  private boolean joq;
  private boolean jos;
  private boolean jot;
  private boolean jou;
  Context mContext;
  int mOffsetX;

  public f(int paramInt)
  {
    AppMethodBeat.i(14351);
    this.jok = 0;
    this.jiy = 0;
    this.ibD = ViewConfiguration.get(com.tencent.mm.sdk.platformtools.ah.getContext()).getScaledTouchSlop();
    this.jQF = null;
    this.ape = -1;
    this.joo = false;
    this.joq = false;
    this.jis = 0;
    this.jQG = null;
    this.iXP = 0;
    this.jos = false;
    this.jot = false;
    this.jou = false;
    this.jis = paramInt;
    AppMethodBeat.o(14351);
  }

  private void aSa()
  {
    this.joo = false;
    this.joq = false;
    this.jQF = null;
    this.ape = -1;
  }

  private int qZ(int paramInt)
  {
    if (paramInt == 0);
    for (paramInt = 0; ; paramInt = this.jom * paramInt + this.jis)
      return paramInt;
  }

  private int ra(int paramInt)
  {
    int i;
    if (this.jis != 0)
    {
      i = paramInt / this.jom;
      j = i;
      if (paramInt % this.jom == 0)
      {
        j = i;
        if (paramInt == 0);
      }
    }
    for (int j = i - 1; ; j = paramInt / this.jom)
      return j;
  }

  public static int rb(int paramInt)
  {
    AppMethodBeat.i(14357);
    if (paramInt == 0)
    {
      paramInt = 0;
      AppMethodBeat.o(14357);
    }
    while (true)
    {
      return paramInt;
      paramInt = a.getCompletelyCountPerPage() * paramInt + 1;
      AppMethodBeat.o(14357);
    }
  }

  public static int rc(int paramInt)
  {
    AppMethodBeat.i(14358);
    int i = a.getCompletelyCountPerPage();
    AppMethodBeat.o(14358);
    return (paramInt + 1) * i + 1;
  }

  final void N(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(14356);
    if ((this.jQE != null) && ((this.jot) || (paramBoolean)))
    {
      this.jol.ape = paramInt;
      this.jou = true;
      this.jQE.getLayoutManager().a(this.jol);
    }
    AppMethodBeat.o(14356);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14352);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    this.jok += paramInt1;
    if ((this.jQG != null) && ((paramInt1 != 0) || (paramInt2 != 0)))
      this.jQG.sj(this.jok);
    this.mOffsetX += paramInt1;
    AppMethodBeat.o(14352);
  }

  final void aSb()
  {
    AppMethodBeat.i(14354);
    if (this.joo)
    {
      ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollAnimationEnd");
      aSa();
    }
    AppMethodBeat.o(14354);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(14353);
    super.c(paramRecyclerView, paramInt);
    ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged newState: %d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    if ((paramInt == 0) && (this.iXP != 2))
    {
      i = qY(this.mOffsetX);
      if ((this.jQE != null) && (this.jot))
      {
        this.aoC.ape = i;
        this.jou = true;
        this.jQE.getLayoutManager().a(this.aoC);
      }
      this.jos = true;
    }
    while (true)
    {
      this.iXP = paramInt;
      AppMethodBeat.o(14353);
      return;
      if ((!this.jos) && (paramInt == 2))
      {
        this.jos = true;
      }
      else if (paramInt == 0)
      {
        this.joj = this.mOffsetX;
        this.jos = false;
        int j = this.jiy;
        i = this.jop.iQ();
        ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged firstPos: %d", new Object[] { Integer.valueOf(i) });
        boolean bool;
        if (i != -1)
        {
          this.jiy = (i / this.jom);
          ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged mCurPage: %d, firstVisible: %d", new Object[] { Integer.valueOf(this.jiy), Integer.valueOf(i) });
          if ((j != this.jiy) && (this.jQG != null))
          {
            paramRecyclerView = this.jQG;
            if (!this.jot)
            {
              bool = true;
              label252: paramRecyclerView.fy(bool);
            }
          }
          else
          {
            label260: this.jot = false;
            this.jok = 0;
            if (!this.joq)
              break label579;
            ab.d("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo scrollMore");
            this.jQE.getAdapter().ar(this.jQE.getDataCount(), 5);
            paramRecyclerView = this.jQF;
            this.joq = false;
            int k = this.jQE.getDataCount();
            j = k / this.jom;
            i = j;
            if (k % this.jom == 0)
              i = j + 1;
            int m = i + 1;
            j = this.jom * m;
            i = j;
            if (j <= 0)
              i = 0;
            ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo smoothScrollToLastPage allCount: %d, lastPage: %d, targetPos: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
            this.jQF = paramRecyclerView;
            this.joo = true;
            j = ra(i);
            this.ape = rb(j);
            this.jiy = ra(this.jop.iR());
            ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", new Object[] { Integer.valueOf(this.jiy), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.ape) });
            if (j != this.jiy)
              break label567;
            aSb();
          }
        }
        while (true)
        {
          if (!this.jou)
            break label584;
          ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo scrollBy x: -1, y: 0");
          this.jou = false;
          this.jQE.scrollBy(-1, 0);
          break;
          bool = false;
          break label252;
          ab.e("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", new Object[] { Integer.valueOf(this.jiy) });
          break label260;
          label567: N(this.ape, true);
          continue;
          label579: aSb();
        }
      }
      else
      {
        label584: if (paramInt == 1)
        {
          ab.i("MicroMsg.BizTimeLineViewPagerHelper", "SCROLL_STATE_DRAGGING");
          this.jot = true;
        }
      }
    }
  }

  final int qY(int paramInt)
  {
    AppMethodBeat.i(14355);
    int i = this.jiy;
    float f = this.jQE.getWidth();
    int j = this.jiy;
    ab.d("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo getOffsetToPosition offset: %d, mTmpOffset: %d, diff: %d, width: %s, mTouchSlop: %s, curPage: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.joj), Integer.valueOf(paramInt - this.joj), Float.valueOf(f), Float.valueOf(this.ibD), Integer.valueOf(this.jiy) });
    if (paramInt - this.joj >= f / 2.0F)
    {
      i = ra(this.jop.iS());
      int k = this.jQE.getAdapter().getItemCount();
      int m = k / this.jom;
      paramInt = m;
      if (k % this.jom != 0)
        paramInt = m + 1;
      i = Math.max(Math.min(i, paramInt - 1), -1);
      if (i - j <= 1)
        break label334;
      paramInt = j + 1;
    }
    while (true)
    {
      ab.i("MicroMsg.BizTimeLineViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(rb(paramInt)) });
      paramInt = qZ(paramInt);
      AppMethodBeat.o(14355);
      while (true)
      {
        return paramInt;
        if ((paramInt - this.joj < 0) || (paramInt - this.joj >= this.ibD))
          break;
        ab.i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo [getOffsetToPosition] targetPage: %s targetPos: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(qZ(i)) });
        paramInt = qZ(i);
        AppMethodBeat.o(14355);
      }
      if (paramInt - this.joj > -f / 2.0F)
        break;
      i = ra(this.jop.iQ());
      break;
      label334: paramInt = i;
      if (j - i > 1)
        paramInt = j - 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.f
 * JD-Core Version:    0.6.2
 */