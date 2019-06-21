package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.am;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class d
{
  public static final h c(b paramb)
  {
    Object localObject1 = null;
    AppMethodBeat.i(1709);
    int i = paramb.getLayoutManager().getChildCount();
    label39: int j;
    label75: int m;
    Object localObject2;
    if (i == 0)
    {
      paramb = null;
      if (!(paramb instanceof h))
      {
        AppMethodBeat.o(1709);
        paramb = localObject1;
        return paramb;
      }
    }
    else if (paramb.getLayoutManager().getClipToPadding())
    {
      j = paramb.cFX().je() + paramb.cFX().jg() / 2;
      int k = 2147483647;
      m = 0;
      localObject2 = null;
      label85: if (m >= i)
        break label172;
      View localView = paramb.getLayoutManager().getChildAt(m);
      int n = Math.abs(paramb.cFX().bf(localView) + paramb.cFX().bj(localView) / 2 - j);
      if (n >= k)
        break label201;
      localObject2 = localView;
      k = n;
    }
    label172: label201: 
    while (true)
    {
      m++;
      break label85;
      j = paramb.cFX().getEnd() / 2;
      break label75;
      paramb = paramb.getRecyclerView().aZ(localObject2);
      break;
      paramb = (h)paramb;
      AppMethodBeat.o(1709);
      break label39;
    }
  }

  public void a(b paramb)
  {
  }

  public void a(b paramb, int paramInt)
  {
  }

  public void b(b paramb)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.d
 * JD-Core Version:    0.6.2
 */