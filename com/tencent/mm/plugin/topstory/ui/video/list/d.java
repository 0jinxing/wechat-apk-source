package com.tencent.mm.plugin.topstory.ui.video.list;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.am;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.f;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends com.tencent.mm.plugin.topstory.ui.video.d
{
  private static View e(b paramb)
  {
    AppMethodBeat.i(2026);
    int i = 0;
    View localView;
    RecyclerView.v localv;
    if (i < paramb.getRecyclerView().getChildCount())
    {
      localView = paramb.getRecyclerView().getChildAt(i);
      localv = paramb.getRecyclerView().aZ(localView);
      if ((localView.getTag() != null) && (localView.getTag().equals("video")) && (localView.getTop() > 0) && (localv.kj() >= 0))
      {
        AppMethodBeat.o(2026);
        paramb = localView;
      }
    }
    while (true)
    {
      return paramb;
      ab.i("MicroMsg.TopStory.TopStoryHItemViewController", "findTargetPlayView index:%s, top:%s, pos:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(localView.getTop()), Integer.valueOf(localv.kj()) });
      i++;
      break;
      paramb = null;
      AppMethodBeat.o(2026);
    }
  }

  public static RecyclerView.v f(b paramb)
  {
    AppMethodBeat.i(2027);
    View localView = e(paramb);
    if (localView != null)
    {
      paramb = paramb.getRecyclerView().aZ(localView);
      AppMethodBeat.o(2027);
    }
    while (true)
    {
      return paramb;
      paramb = null;
      AppMethodBeat.o(2027);
    }
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(2023);
    RecyclerView localRecyclerView = paramb.getRecyclerView();
    Object localObject = f(paramb);
    int i;
    if ((localObject instanceof h))
    {
      localObject = (h)localObject;
      if (localObject != null)
      {
        i = ((h)localObject).cFP();
        if ((i != paramb.cFY()) && (paramb.cFV().sFw))
          paramb.cFV().stopPlay();
        paramb.cFO();
        label154: for (int j = 0; ; j++)
        {
          if (j >= localRecyclerView.getChildCount())
            break label187;
          localObject = localRecyclerView.getChildAt(j);
          if (((View)localObject).getTag() != null)
          {
            localObject = (h)paramb.getRecyclerView().aZ((View)localObject);
            if (((h)localObject).cFP() != i)
              break;
            ((h)localObject).cHk();
            ((h)localObject).cFN();
            if (!paramb.cFV().sFw)
              ((h)localObject).sGZ.cGn();
          }
        }
      }
    }
    else
    {
      AppMethodBeat.o(2023);
    }
    while (true)
    {
      return;
      i = -1;
      break;
      ((h)localObject).cHj();
      ((h)localObject).sGZ.cGo();
      break label154;
      label187: AppMethodBeat.o(2023);
    }
  }

  public final void a(b paramb, int paramInt)
  {
    AppMethodBeat.i(2025);
    int i = 0;
    View localView;
    for (Object localObject = null; i < paramb.getRecyclerView().getChildCount(); localObject = localView)
    {
      localView = paramb.getRecyclerView().getChildAt(i);
      localObject = localView;
      if (RecyclerView.bo(localView) == paramInt)
        break;
      i++;
    }
    if (localObject != null)
    {
      paramInt = paramb.cFX().bf(localObject);
      i = paramb.cGd();
      paramb.getRecyclerView().a(0, paramInt - i, null);
    }
    AppMethodBeat.o(2025);
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(2024);
    Object localObject = f(paramb);
    if ((localObject instanceof h))
    {
      localObject = (h)localObject;
      if (!paramb.cFV().sFw)
      {
        if (!paramb.cFQ().isConnected())
          break label91;
        ((h)localObject).mc(true);
      }
    }
    while (true)
    {
      ((h)localObject).cFN();
      paramb.FD(((h)localObject).cFP());
      paramb.cFR().cGS();
      AppMethodBeat.o(2024);
      while (true)
      {
        return;
        AppMethodBeat.o(2024);
      }
      label91: ((h)localObject).sGZ.cGr();
      paramb.cFV().stopPlay();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.d
 * JD-Core Version:    0.6.2
 */