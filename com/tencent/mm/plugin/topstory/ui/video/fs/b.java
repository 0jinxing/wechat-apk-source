package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.r.b;
import android.support.v7.widget.ah;
import android.support.v7.widget.am;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.widget.g;

public final class b extends g
{
  private am amf;
  private am amg;

  private static int a(RecyclerView.i parami, View paramView, am paramam)
  {
    AppMethodBeat.i(1866);
    int i = paramam.bf(paramView);
    int j = paramam.bj(paramView) / 2;
    if (parami.getClipToPadding());
    for (int k = paramam.je() + paramam.jg() / 2; ; k = paramam.getEnd() / 2)
    {
      AppMethodBeat.o(1866);
      return j + i - k;
    }
  }

  private static View a(RecyclerView.i parami, am paramam)
  {
    View localView1 = null;
    View localView2 = null;
    AppMethodBeat.i(1867);
    int i = parami.getChildCount();
    if (i == 0)
    {
      AppMethodBeat.o(1867);
      return localView2;
    }
    int j;
    label49: int m;
    if (parami.getClipToPadding())
    {
      j = paramam.je() + paramam.jg() / 2;
      int k = 2147483647;
      m = 0;
      localView2 = localView1;
      label58: if (m >= i)
        break label123;
      localView1 = parami.getChildAt(m);
      int n = Math.abs(paramam.bf(localView1) + paramam.bj(localView1) / 2 - j);
      if (n >= k)
        break label132;
      localView2 = localView1;
      k = n;
    }
    label132: 
    while (true)
    {
      m++;
      break label58;
      j = paramam.getEnd() / 2;
      break label49;
      label123: AppMethodBeat.o(1867);
      break;
    }
  }

  private am b(RecyclerView.i parami)
  {
    AppMethodBeat.i(1869);
    if ((this.amf == null) || (this.amf.getLayoutManager() != parami))
      this.amf = am.e(parami);
    parami = this.amf;
    AppMethodBeat.o(1869);
    return parami;
  }

  private am c(RecyclerView.i parami)
  {
    AppMethodBeat.i(1870);
    if ((this.amg == null) || (this.amg.getLayoutManager() != parami))
      this.amg = am.d(parami);
    parami = this.amg;
    AppMethodBeat.o(1870);
    return parami;
  }

  private static View c(RecyclerView.i parami, am paramam)
  {
    View localView1 = null;
    View localView2 = null;
    AppMethodBeat.i(1868);
    int i = parami.getChildCount();
    if (i == 0)
    {
      AppMethodBeat.o(1868);
      return localView2;
    }
    int j = 2147483647;
    int k = 0;
    localView2 = localView1;
    label38: if (k < i)
    {
      localView1 = parami.getChildAt(k);
      int m = paramam.bf(localView1);
      if (m >= j)
        break label87;
      localView2 = localView1;
      j = m;
    }
    label87: 
    while (true)
    {
      k++;
      break label38;
      AppMethodBeat.o(1868);
      break;
    }
  }

  public final int a(RecyclerView.i parami, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = -1;
    AppMethodBeat.i(1864);
    if ((Math.abs(paramInt2) <= 500) || (Math.abs(paramInt1) >= Math.abs(paramInt2)))
    {
      AppMethodBeat.o(1864);
      paramInt1 = j;
    }
    while (true)
    {
      return paramInt1;
      int k = parami.getItemCount();
      if (k == 0)
      {
        AppMethodBeat.o(1864);
        paramInt1 = j;
      }
      else
      {
        View localView = null;
        if (parami.iH())
          localView = c(parami, b(parami));
        while (true)
        {
          if (localView != null)
            break label126;
          AppMethodBeat.o(1864);
          paramInt1 = j;
          break;
          if (parami.iG())
            localView = c(parami, c(parami));
        }
        label126: int m = RecyclerView.i.bt(localView);
        if (m == -1)
        {
          AppMethodBeat.o(1864);
          paramInt1 = j;
        }
        else
        {
          if (parami.iG())
            if (paramInt1 > 0)
              paramInt1 = 1;
          while (true)
          {
            paramInt2 = i;
            if ((parami instanceof RecyclerView.r.b))
            {
              parami = ((RecyclerView.r.b)parami).bX(k - 1);
              paramInt2 = i;
              if (parami != null)
                if (parami.x >= 0.0F)
                {
                  paramInt2 = i;
                  if (parami.y >= 0.0F);
                }
                else
                {
                  paramInt2 = 1;
                }
            }
            if (paramInt2 == 0)
              break label271;
            if (paramInt1 == 0)
              break label259;
            paramInt1 = m - 1;
            AppMethodBeat.o(1864);
            break;
            paramInt1 = 0;
            continue;
            if (paramInt2 > 0)
              paramInt1 = 1;
            else
              paramInt1 = 0;
          }
          label259: AppMethodBeat.o(1864);
          paramInt1 = m;
          continue;
          label271: if (paramInt1 != 0)
          {
            paramInt1 = m + 1;
            AppMethodBeat.o(1864);
          }
          else
          {
            AppMethodBeat.o(1864);
            paramInt1 = m;
          }
        }
      }
    }
  }

  public final View a(RecyclerView.i parami)
  {
    AppMethodBeat.i(1863);
    if (parami.iH())
    {
      parami = a(parami, b(parami));
      AppMethodBeat.o(1863);
    }
    while (true)
    {
      return parami;
      if (parami.iG())
      {
        parami = a(parami, c(parami));
        AppMethodBeat.o(1863);
      }
      else
      {
        parami = null;
        AppMethodBeat.o(1863);
      }
    }
  }

  public final int[] a(RecyclerView.i parami, View paramView)
  {
    AppMethodBeat.i(1862);
    int[] arrayOfInt = new int[2];
    if (parami.iG())
    {
      arrayOfInt[0] = a(parami, paramView, c(parami));
      if (!parami.iH())
        break label65;
      arrayOfInt[1] = a(parami, paramView, b(parami));
    }
    while (true)
    {
      AppMethodBeat.o(1862);
      return arrayOfInt;
      arrayOfInt[0] = 0;
      break;
      label65: arrayOfInt[1] = 0;
    }
  }

  public final ah f(RecyclerView.i parami)
  {
    AppMethodBeat.i(1865);
    if (!(parami instanceof RecyclerView.r.b))
    {
      parami = null;
      AppMethodBeat.o(1865);
    }
    while (true)
    {
      return parami;
      parami = new b.1(this, this.aiB.getContext());
      AppMethodBeat.o(1865);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.b
 * JD-Core Version:    0.6.2
 */