package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.d;
import com.tencent.mm.plugin.topstory.ui.video.f;
import com.tencent.mm.plugin.topstory.ui.video.h;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;

public final class c extends d
{
  public final void a(b paramb)
  {
    AppMethodBeat.i(1871);
    RecyclerView localRecyclerView = paramb.getRecyclerView();
    Object localObject = c(paramb);
    int i;
    if ((localObject instanceof g))
    {
      localObject = (g)localObject;
      if (localObject != null)
      {
        i = ((g)localObject).kj();
        if ((i != paramb.cFY()) && (paramb.cFV().sFw))
        {
          paramb.cFV().stopPlay();
          if (localObject != null)
            paramb.cFR().e(((g)localObject).sAX);
        }
        paramb.cFO();
        label167: for (int j = 0; ; j++)
        {
          if (j >= localRecyclerView.getChildCount())
            break label196;
          localObject = localRecyclerView.getChildAt(j);
          if (((View)localObject).getTag() != null)
          {
            localObject = (g)paramb.getRecyclerView().aZ((View)localObject);
            if (((g)localObject).kj() != i)
              break;
            ((g)localObject).cFN();
            if (!paramb.cFV().sFw)
              ((g)localObject).sGq.cGn();
          }
        }
      }
    }
    else
    {
      AppMethodBeat.o(1871);
    }
    while (true)
    {
      return;
      i = -1;
      break;
      ((g)localObject).sGq.cGo();
      break label167;
      label196: AppMethodBeat.o(1871);
    }
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(1872);
    h localh = c(paramb);
    if ((localh != null) && ((localh instanceof g)))
      if (!paramb.cFV().sFw)
      {
        if (!paramb.cFQ().isConnected())
          break label87;
        paramb.cGe();
        localh.mc(true);
      }
    while (true)
    {
      localh.cFN();
      paramb.FD(localh.cFP());
      paramb.cFR().cGS();
      AppMethodBeat.o(1872);
      return;
      label87: localh.cGA().cGr();
      paramb.cFV().stopPlay();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.c
 * JD-Core Version:    0.6.2
 */