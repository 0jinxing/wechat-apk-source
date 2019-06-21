package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.am;
import android.support.v7.widget.an;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends an
{
  public Context context;
  public View oaV;

  public static View h(RecyclerView.i parami)
  {
    Object localObject = null;
    View localView = null;
    AppMethodBeat.i(42467);
    int i = parami.getChildCount();
    if (i == 0)
    {
      AppMethodBeat.o(42467);
      localObject = localView;
      return localObject;
    }
    am localam = am.d(parami);
    int j;
    label55: int m;
    if (parami.getClipToPadding())
    {
      j = localam.je() + localam.jg() / 2;
      int k = 2147483647;
      m = 0;
      label62: if (m >= i)
        break label129;
      localView = parami.getChildAt(m);
      int n = Math.abs(localam.bf(localView) + localam.bj(localView) / 2 - j);
      if (n >= k)
        break label137;
      localObject = localView;
      k = n;
    }
    label129: label137: 
    while (true)
    {
      m++;
      break label62;
      j = localam.getEnd() / 2;
      break label55;
      AppMethodBeat.o(42467);
      break;
    }
  }

  public final int a(RecyclerView.i parami, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(42466);
    if (parami.getItemCount() == 0)
    {
      AppMethodBeat.o(42466);
      paramInt1 = -1;
    }
    while (true)
    {
      return paramInt1;
      View localView1 = h(parami);
      if (localView1 == null)
      {
        AppMethodBeat.o(42466);
        paramInt1 = -1;
      }
      else
      {
        View localView2 = localView1;
        if (this.oaV != null)
        {
          localView2 = localView1;
          if (this.oaV != localView1)
            localView2 = this.oaV;
        }
        paramInt2 = RecyclerView.i.bt(localView2);
        ab.d("CusPager", "pos: %s", new Object[] { Integer.valueOf(paramInt2) });
        if ((paramInt1 >= 100) && (paramInt2 + 1 < parami.getItemCount()))
        {
          paramInt1 = paramInt2 + 1;
          AppMethodBeat.o(42466);
        }
        else if ((paramInt1 <= -100) && (paramInt2 - 1 >= 0))
        {
          paramInt1 = paramInt2 - 1;
          AppMethodBeat.o(42466);
        }
        else
        {
          AppMethodBeat.o(42466);
          paramInt1 = paramInt2;
        }
      }
    }
  }

  public final View a(RecyclerView.i parami)
  {
    AppMethodBeat.i(42465);
    View localView1 = super.a(parami);
    int i = 0;
    int j = 0;
    int k = 0;
    View localView2;
    if (i < parami.getChildCount())
    {
      localView2 = parami.getChildAt(i);
      if (localView2 != localView1)
        break label122;
      j = i;
    }
    label122: 
    while (true)
    {
      if (localView2 == this.oaV)
        k = i;
      i++;
      break;
      if (j - k > 1)
      {
        parami = parami.bW(k + 1);
        AppMethodBeat.o(42465);
      }
      while (true)
      {
        return parami;
        if (j - k < -1)
        {
          parami = parami.bW(k - 1);
          AppMethodBeat.o(42465);
        }
        else
        {
          AppMethodBeat.o(42465);
          parami = localView1;
        }
      }
    }
  }

  public final RecyclerView.r g(RecyclerView.i parami)
  {
    AppMethodBeat.i(42468);
    parami = new a.1(this, this.context, parami);
    AppMethodBeat.o(42468);
    return parami;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.a
 * JD-Core Version:    0.6.2
 */