package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.r;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class e extends RecyclerView.m
{
  RecyclerView.r aoC;
  private int ape;
  private int iXP;
  private float ibD;
  private int jis;
  public int jiy;
  public BaseAppBrandRecentView joi;
  public int joj;
  public int jok;
  RecyclerView.r jol;
  public int jom;
  private e.b jon;
  private boolean joo;
  LinearLayoutManager jop;
  public boolean joq;
  e.a jor;
  private boolean jos;
  private boolean jot;
  private boolean jou;
  Context mContext;
  public int mOffsetX;

  public e(int paramInt)
  {
    AppMethodBeat.i(134392);
    this.jok = 0;
    this.jiy = 0;
    this.ibD = ViewConfiguration.get(ah.getContext()).getScaledTouchSlop();
    this.jon = null;
    this.ape = -1;
    this.joo = false;
    this.joq = false;
    this.jis = 0;
    this.jor = null;
    this.iXP = 0;
    this.jos = false;
    this.jot = false;
    this.jou = false;
    this.jis = paramInt;
    AppMethodBeat.o(134392);
  }

  private void aSa()
  {
    this.joo = false;
    this.joq = false;
    this.jon = null;
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
    AppMethodBeat.i(134399);
    if (paramInt == 0)
    {
      paramInt = 0;
      AppMethodBeat.o(134399);
    }
    while (true)
    {
      return paramInt;
      int i = b.getCompletelyCountPerPage();
      b.aPf();
      paramInt = i * paramInt + 1;
      AppMethodBeat.o(134399);
    }
  }

  public static int rc(int paramInt)
  {
    AppMethodBeat.i(134400);
    int i = b.getCompletelyCountPerPage();
    b.aPf();
    AppMethodBeat.o(134400);
    return (paramInt + 1) * i + 1;
  }

  public static int rd(int paramInt)
  {
    AppMethodBeat.i(134401);
    int i = paramInt / b.getCompletelyCountPerPage();
    int j = i;
    if (paramInt % b.getCompletelyCountPerPage() == 0)
    {
      j = i;
      if (paramInt != 0)
        j = i - 1;
    }
    AppMethodBeat.o(134401);
    return j;
  }

  final void N(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(134398);
    if ((this.joi != null) && ((this.jot) || (paramBoolean)))
    {
      this.jol.ape = paramInt;
      this.jou = true;
      this.joi.getLayoutManager().a(this.jol);
    }
    AppMethodBeat.o(134398);
  }

  public final void a(int paramInt, e.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(134397);
    this.jon = paramb;
    this.joo = true;
    int i = ra(paramInt);
    this.ape = rb(i);
    this.jiy = ra(this.jop.iR());
    ab.i("ViewPagerHelper", "alvinluo fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", new Object[] { Integer.valueOf(this.jiy), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.ape) });
    if ((i == this.jiy) && (!paramBoolean))
    {
      aSb();
      AppMethodBeat.o(134397);
    }
    while (true)
    {
      return;
      N(this.ape, true);
      AppMethodBeat.o(134397);
    }
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134393);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    this.jok += paramInt1;
    if (this.jor != null)
      this.jor.e(paramRecyclerView, this.jok);
    this.mOffsetX += paramInt1;
    AppMethodBeat.o(134393);
  }

  final void aSb()
  {
    AppMethodBeat.i(134395);
    if (this.joo)
    {
      ab.i("ViewPagerHelper", "alvinluo onScrollAnimationEnd");
      if (this.jon != null)
        this.jon.aQe();
      aSa();
    }
    AppMethodBeat.o(134395);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(134394);
    super.c(paramRecyclerView, paramInt);
    ab.i("ViewPagerHelper", "alvinluo onScrollStateChanged newState: %d", new Object[] { Integer.valueOf(paramInt) });
    if (this.jor != null)
      this.jor.h(paramRecyclerView, paramInt, this.jok);
    int i;
    if ((paramInt == 0) && (this.iXP != 2))
    {
      i = qY(this.mOffsetX);
      if ((this.joi != null) && (this.jot))
      {
        this.aoC.ape = i;
        this.jou = true;
        this.joi.getLayoutManager().a(this.aoC);
      }
      this.jos = true;
    }
    while (true)
    {
      this.iXP = paramInt;
      AppMethodBeat.o(134394);
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
        ab.i("ViewPagerHelper", "alvinluo onScrollStateChanged firstPos: %d", new Object[] { Integer.valueOf(i) });
        boolean bool;
        if (i != -1)
        {
          this.jiy = (i / this.jom);
          ab.i("ViewPagerHelper", "alvinluo onScrollStateChanged mCurPage: %d, firstVisible: %d", new Object[] { Integer.valueOf(this.jiy), Integer.valueOf(i) });
          if ((j != this.jiy) && (this.jor != null))
          {
            paramRecyclerView = this.jor;
            i = this.jiy;
            if (!this.jot)
            {
              bool = true;
              label277: paramRecyclerView.L(i, bool);
            }
          }
          else
          {
            label286: this.jot = false;
            this.jok = 0;
            if (!this.joq)
              break label394;
            ab.d("ViewPagerHelper", "alvinluo scrollMore");
            b.aPf();
            this.joq = false;
            a(0, this.jon, true);
            aSb();
          }
        }
        while (true)
        {
          if (!this.jou)
            break label399;
          ab.i("ViewPagerHelper", "alvinluo scrollBy x: -1, y: 0");
          this.jou = false;
          this.joi.scrollBy(-1, 0);
          break;
          bool = false;
          break label277;
          ab.e("ViewPagerHelper", "alvinluo onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", new Object[] { Integer.valueOf(this.jiy) });
          break label286;
          label394: aSb();
        }
      }
      else
      {
        label399: if (paramInt == 1)
        {
          ab.i("ViewPagerHelper", "SCROLL_STATE_DRAGGING");
          this.jot = true;
        }
      }
    }
  }

  final int qY(int paramInt)
  {
    AppMethodBeat.i(134396);
    int i = this.jiy;
    float f = this.joi.getWidth();
    int j = this.jiy;
    ab.d("ViewPagerHelper", "alvinluo getOffsetToPosition offset: %d, mTmpOffset: %d, diff: %d, width: %s, mTouchSlop: %s, curPage: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.joj), Integer.valueOf(paramInt - this.joj), Float.valueOf(f), Float.valueOf(this.ibD), Integer.valueOf(this.jiy) });
    if (paramInt - this.joj >= f / 2.0F)
    {
      i = ra(this.jop.iS());
      int k = this.joi.getAdapter().getItemCount();
      int m = k / this.jom;
      paramInt = m;
      if (k % this.jom != 0)
        paramInt = m + 1;
      i = Math.max(Math.min(i, paramInt - 1), -1);
      if (i - j <= 1)
        break label331;
      paramInt = j + 1;
    }
    while (true)
    {
      ab.i("ViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(rb(paramInt)) });
      paramInt = qZ(paramInt);
      AppMethodBeat.o(134396);
      while (true)
      {
        return paramInt;
        if ((paramInt - this.joj < 0) || (paramInt - this.joj >= this.ibD))
          break;
        ab.i("ViewPagerHelper", "alvinluo [getOffsetToPosition] targetPage: %s targetPos: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(qZ(i)) });
        paramInt = qZ(i);
        AppMethodBeat.o(134396);
      }
      if (paramInt - this.joj > -f / 2.0F)
        break;
      i = ra(this.jop.iQ());
      break;
      label331: paramInt = i;
      if (j - i > 1)
        paramInt = j - 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.e
 * JD-Core Version:    0.6.2
 */