package me.imid.swipebacklayout.lib;

import android.graphics.drawable.Drawable;
import android.support.v4.widget.p;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class SwipeBackLayout$c extends a.a
{
  private boolean BTn;

  private SwipeBackLayout$c(SwipeBackLayout paramSwipeBackLayout)
  {
  }

  public final void N(int paramInt)
  {
    AppMethodBeat.i(91207);
    super.N(paramInt);
    if ((SwipeBackLayout.c(this.BTo) != null) && (!SwipeBackLayout.c(this.BTo).isEmpty()))
    {
      Iterator localIterator = SwipeBackLayout.c(this.BTo).iterator();
      while (localIterator.hasNext())
        ((SwipeBackLayout.a)localIterator.next()).h(paramInt, SwipeBackLayout.i(this.BTo));
    }
    AppMethodBeat.o(91207);
  }

  public final boolean PG(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(91200);
    int j = SwipeBackLayout.b(this.BTo).iu(SwipeBackLayout.a(this.BTo), paramInt);
    if (j != 0)
    {
      if (SwipeBackLayout.b(this.BTo).iu(1, paramInt))
        SwipeBackLayout.a(this.BTo, 1);
      while ((SwipeBackLayout.c(this.BTo) != null) && (!SwipeBackLayout.c(this.BTo).isEmpty()))
      {
        Iterator localIterator = SwipeBackLayout.c(this.BTo).iterator();
        while (localIterator.hasNext())
        {
          SwipeBackLayout.a locala = (SwipeBackLayout.a)localIterator.next();
          SwipeBackLayout.d(this.BTo);
          locala.xv();
        }
        if (SwipeBackLayout.b(this.BTo).iu(2, paramInt))
          SwipeBackLayout.a(this.BTo, 2);
        else if (SwipeBackLayout.b(this.BTo).iu(8, paramInt))
          SwipeBackLayout.a(this.BTo, 8);
      }
      this.BTn = true;
    }
    if ((SwipeBackLayout.a(this.BTo) == 1) || (SwipeBackLayout.a(this.BTo) == 2))
      if (!SwipeBackLayout.b(this.BTo).it(2, paramInt))
      {
        paramInt = 1;
        i = paramInt;
      }
    while (true)
    {
      AppMethodBeat.o(91200);
      return j & i;
      paramInt = 0;
      break;
      if (SwipeBackLayout.a(this.BTo) == 8)
      {
        if (SwipeBackLayout.b(this.BTo).it(1, paramInt))
          i = 0;
      }
      else if (SwipeBackLayout.a(this.BTo) != 11)
        i = 0;
    }
  }

  public final void a(View paramView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(91204);
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    if ((SwipeBackLayout.d(this.BTo) & 0x1) != 0)
      if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (SwipeBackLayout.i(this.BTo) > SwipeBackLayout.j(this.BTo))))
      {
        j = i + SwipeBackLayout.f(this.BTo).getIntrinsicWidth() + 10;
        i = 0;
      }
    while (true)
    {
      label114: boolean bool;
      if ((SwipeBackLayout.c(this.BTo) != null) && (!SwipeBackLayout.c(this.BTo).isEmpty()))
      {
        paramView = SwipeBackLayout.c(this.BTo).iterator();
        if (paramView.hasNext())
        {
          SwipeBackLayout.a locala = (SwipeBackLayout.a)paramView.next();
          if (j != 0)
          {
            bool = true;
            label142: if (!locala.ba(bool))
              break label321;
            AppMethodBeat.o(91204);
          }
        }
      }
      label321: int n;
      int i1;
      while (true)
      {
        return;
        j = 0;
        break;
        if ((SwipeBackLayout.d(this.BTo) & 0x2) != 0)
        {
          if ((paramFloat1 < 0.0F) || ((paramFloat1 == 0.0F) && (SwipeBackLayout.i(this.BTo) > SwipeBackLayout.j(this.BTo))));
          for (j = -(i + SwipeBackLayout.f(this.BTo).getIntrinsicWidth() + 10); ; j = 0)
          {
            i = 0;
            break;
          }
        }
        if ((SwipeBackLayout.d(this.BTo) & 0x8) == 0)
          break label656;
        if ((paramFloat2 < 0.0F) || ((paramFloat2 == 0.0F) && (SwipeBackLayout.i(this.BTo) > SwipeBackLayout.j(this.BTo))));
        for (j = -(SwipeBackLayout.h(this.BTo).getIntrinsicHeight() + j + 10); ; j = 0)
        {
          i = j;
          j = 0;
          break;
        }
        bool = false;
        break label142;
        break label114;
        paramView = SwipeBackLayout.b(this.BTo);
        if (!paramView.SV)
        {
          paramView = new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
          AppMethodBeat.o(91204);
          throw paramView;
        }
        k = (int)paramView.mVelocityTracker.getXVelocity(paramView.mActivePointerId);
        m = (int)paramView.mVelocityTracker.getYVelocity(paramView.mActivePointerId);
        n = paramView.SU.getLeft();
        i1 = paramView.SU.getTop();
        j -= n;
        i -= i1;
        if ((j != 0) || (i != 0))
          break label455;
        paramView.jlU.qN.abortAnimation();
        paramView.ba(0);
        this.BTo.invalidate();
        AppMethodBeat.o(91204);
      }
      label455: int k = a.i(k, (int)paramView.SQ, (int)paramView.SP);
      int m = a.i(m, (int)paramView.SQ, (int)paramView.SP);
      int i2 = Math.abs(j);
      int i3 = Math.abs(i);
      int i4 = Math.abs(k);
      int i5 = Math.abs(m);
      int i6 = i4 + i5;
      int i7 = i2 + i3;
      if (k != 0)
      {
        paramFloat1 = i4 / i6;
        label544: if (m == 0)
          break label645;
      }
      label645: for (paramFloat2 = i5 / i6; ; paramFloat2 = i3 / i7)
      {
        k = paramView.h(j, k, paramView.BTq.dJm());
        m = paramView.h(i, m, paramView.BTq.bL());
        float f = k;
        m = (int)(paramFloat2 * m + paramFloat1 * f);
        paramView.jlU.startScroll(n, i1, j, i, m);
        paramView.ba(2);
        break;
        paramFloat1 = i2 / i7;
        break label544;
      }
      label656: i = 0;
      j = 0;
    }
  }

  public final int bL()
  {
    AppMethodBeat.i(91202);
    int i = SwipeBackLayout.a(this.BTo);
    AppMethodBeat.o(91202);
    return i & 0x8;
  }

  public final int c(View paramView, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(91206);
    if ((SwipeBackLayout.d(this.BTo) & 0x8) != 0)
      i = Math.min(0, Math.max(paramInt, -paramView.getHeight()));
    AppMethodBeat.o(91206);
    return i;
  }

  public final int d(View paramView, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(91205);
    if ((SwipeBackLayout.d(this.BTo) & 0x1) != 0)
      i = Math.min(paramView.getWidth(), Math.max(paramInt, 0));
    while (true)
    {
      AppMethodBeat.o(91205);
      return i;
      if ((SwipeBackLayout.d(this.BTo) & 0x2) != 0)
        i = Math.min(0, Math.max(paramInt, -paramView.getWidth()));
    }
  }

  public final int dJm()
  {
    AppMethodBeat.i(91201);
    int i = SwipeBackLayout.a(this.BTo);
    AppMethodBeat.o(91201);
    return i & 0x3;
  }

  public final void o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(91203);
    super.o(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((SwipeBackLayout.d(this.BTo) & 0x1) != 0)
      SwipeBackLayout.a(this.BTo, Math.abs(paramInt1 / (SwipeBackLayout.e(this.BTo).getWidth() + SwipeBackLayout.f(this.BTo).getIntrinsicWidth())));
    while (true)
    {
      SwipeBackLayout.b(this.BTo, paramInt1);
      SwipeBackLayout.c(this.BTo, paramInt2);
      this.BTo.invalidate();
      if ((SwipeBackLayout.i(this.BTo) < SwipeBackLayout.j(this.BTo)) && (!this.BTn))
        this.BTn = true;
      if ((SwipeBackLayout.c(this.BTo) == null) || (SwipeBackLayout.c(this.BTo).isEmpty()))
        break;
      paramView = SwipeBackLayout.c(this.BTo).iterator();
      while (paramView.hasNext())
        ((SwipeBackLayout.a)paramView.next()).h(SwipeBackLayout.b(this.BTo).SG, SwipeBackLayout.i(this.BTo));
      if ((SwipeBackLayout.d(this.BTo) & 0x2) != 0)
        SwipeBackLayout.a(this.BTo, Math.abs(paramInt1 / (SwipeBackLayout.e(this.BTo).getWidth() + SwipeBackLayout.g(this.BTo).getIntrinsicWidth())));
      else if ((SwipeBackLayout.d(this.BTo) & 0x8) != 0)
        SwipeBackLayout.a(this.BTo, Math.abs(paramInt2 / (SwipeBackLayout.e(this.BTo).getHeight() + SwipeBackLayout.h(this.BTo).getIntrinsicHeight())));
    }
    if ((SwipeBackLayout.c(this.BTo) != null) && (!SwipeBackLayout.c(this.BTo).isEmpty()) && (SwipeBackLayout.b(this.BTo).SG == 1) && (SwipeBackLayout.i(this.BTo) >= SwipeBackLayout.j(this.BTo)) && (this.BTn))
    {
      this.BTn = false;
      paramView = SwipeBackLayout.c(this.BTo).iterator();
      while (paramView.hasNext())
        paramView.next();
    }
    if ((SwipeBackLayout.i(this.BTo) >= 1.0F) && (SwipeBackLayout.c(this.BTo) != null) && (!SwipeBackLayout.c(this.BTo).isEmpty()))
    {
      Iterator localIterator = SwipeBackLayout.c(this.BTo).iterator();
      while (localIterator.hasNext())
      {
        paramView = (SwipeBackLayout.a)localIterator.next();
        if ((paramView instanceof SwipeBackLayout.b))
          ((SwipeBackLayout.b)paramView).aJd();
      }
    }
    AppMethodBeat.o(91203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     me.imid.swipebacklayout.lib.SwipeBackLayout.c
 * JD-Core Version:    0.6.2
 */