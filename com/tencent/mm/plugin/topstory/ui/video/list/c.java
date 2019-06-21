package com.tencent.mm.plugin.topstory.ui.video.list;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.r.b;
import android.support.v7.widget.ah;
import android.support.v7.widget.am;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.widget.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends g
{
  private am amf;
  private am amg;
  b sDo;

  public c(b paramb)
  {
    this.sDo = paramb;
  }

  private int a(View paramView, am paramam)
  {
    AppMethodBeat.i(2019);
    int i = paramam.bf(paramView);
    int j = this.sDo.cGd();
    AppMethodBeat.o(2019);
    return i - j;
  }

  private static View a(RecyclerView.i parami, am paramam)
  {
    View localView1 = null;
    View localView2 = null;
    AppMethodBeat.i(2020);
    int i = parami.getChildCount();
    if (i == 0)
    {
      AppMethodBeat.o(2020);
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
      label123: AppMethodBeat.o(2020);
      break;
    }
  }

  private am b(RecyclerView.i parami)
  {
    AppMethodBeat.i(2021);
    if ((this.amf == null) || (this.amf.getLayoutManager() != parami))
      this.amf = am.e(parami);
    parami = this.amf;
    AppMethodBeat.o(2021);
    return parami;
  }

  private am c(RecyclerView.i parami)
  {
    AppMethodBeat.i(2022);
    if ((this.amg == null) || (this.amg.getLayoutManager() != parami))
      this.amg = am.d(parami);
    parami = this.amg;
    AppMethodBeat.o(2022);
    return parami;
  }

  public final int a(RecyclerView.i parami, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(2017);
    if ((Math.abs(paramInt2) <= 500) || (Math.abs(paramInt1) >= Math.abs(paramInt2)))
    {
      AppMethodBeat.o(2017);
      paramInt1 = i;
    }
    int j;
    int k;
    while (true)
    {
      return paramInt1;
      j = parami.getItemCount();
      if (j == 0)
      {
        AppMethodBeat.o(2017);
        paramInt1 = i;
      }
      else
      {
        k = this.sDo.cFY() + 1;
        if (k != -1)
          break;
        AppMethodBeat.o(2017);
        paramInt1 = i;
      }
    }
    boolean bool;
    if (parami.iG())
      if (paramInt1 > 0)
      {
        bool = true;
        label109: if (!(parami instanceof RecyclerView.r.b))
          break label283;
        parami = ((RecyclerView.r.b)parami).bX(j - 1);
        if (parami == null)
          break label283;
        if ((parami.x >= 0.0F) && (parami.y >= 0.0F))
          break label257;
        paramInt1 = 1;
      }
    while (true)
    {
      label154: if (paramInt1 != 0)
      {
        if (bool)
          break label275;
        paramInt1 = k + 1;
      }
      while (true)
      {
        ab.i("MicroMsg.TopStory.TopStoryVideoPagerSnapHelper", "findTargetSnapPosition velocityY: %d centerPosition: %d forwardDirection: %b result: %d currentPlayPos: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(k), Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(this.sDo.cFY() + 1) });
        AppMethodBeat.o(2017);
        break;
        bool = false;
        break label109;
        if (paramInt2 > 0)
        {
          bool = true;
          break label109;
        }
        bool = false;
        break label109;
        label257: paramInt1 = 0;
        break label154;
        if (bool)
          paramInt1 = k + 1;
        else
          label275: paramInt1 = k - 1;
      }
      label283: paramInt1 = 0;
    }
  }

  public final View a(RecyclerView.i parami)
  {
    AppMethodBeat.i(2016);
    if (parami.iH())
    {
      parami = a(parami, b(parami));
      AppMethodBeat.o(2016);
    }
    while (true)
    {
      return parami;
      if (parami.iG())
      {
        parami = a(parami, c(parami));
        AppMethodBeat.o(2016);
      }
      else
      {
        parami = null;
        AppMethodBeat.o(2016);
      }
    }
  }

  public final int[] a(RecyclerView.i parami, View paramView)
  {
    AppMethodBeat.i(2015);
    int[] arrayOfInt = new int[2];
    if (parami.iG())
    {
      arrayOfInt[0] = a(paramView, c(parami));
      if (!parami.iH())
        break label65;
      arrayOfInt[1] = a(paramView, b(parami));
    }
    while (true)
    {
      AppMethodBeat.o(2015);
      return arrayOfInt;
      arrayOfInt[0] = 0;
      break;
      label65: arrayOfInt[1] = 0;
    }
  }

  public final ah f(RecyclerView.i parami)
  {
    AppMethodBeat.i(2018);
    if (!(parami instanceof RecyclerView.r.b))
    {
      parami = null;
      AppMethodBeat.o(2018);
    }
    while (true)
    {
      return parami;
      parami = new c.1(this, this.aiB.getContext());
      AppMethodBeat.o(2018);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.c
 * JD-Core Version:    0.6.2
 */