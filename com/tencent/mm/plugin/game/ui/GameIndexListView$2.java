package com.tencent.mm.plugin.game.ui;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.game.d.as;
import com.tencent.mm.plugin.game.d.bc;
import com.tencent.mm.plugin.game.d.y;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class GameIndexListView$2
  implements w.a
{
  GameIndexListView$2(GameIndexListView paramGameIndexListView)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(111970);
    ab.i("MicroMsg.GameIndexListView", "doCgi, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      GameIndexListView.a(this.njk, (bc)paramb.fsH.fsP);
      paramb = GameIndexListView.b(this.njk);
      bool = GameIndexListView.c(this.njk);
      if ((paramb != null) && (!bo.ek(paramb.nbU)))
        break label177;
      paramString = null;
    }
    while (true)
    {
      GameIndexListView.d(this.njk);
      com.tencent.mm.plugin.game.model.ad.a(GameIndexListView.b(this.njk));
      if (!GameIndexListView.b(this.njk).nbW)
        this.njk.fh(false);
      if (!bo.ek(paramString))
      {
        paramb = GameIndexListView.e(this.njk);
        paramb.njl.addAll(paramString);
        paramb.aop.notifyChanged();
      }
      AppMethodBeat.o(111970);
      return 0;
      label177: paramString = new LinkedList();
      if ((bool) && (!bo.isNullOrNil(paramb.mZM)))
      {
        paramm = new d();
        paramm.type = 2000;
        paramm.mVG = paramb.mZM;
        paramString.add(paramm);
      }
      paramm = paramb.nbU.iterator();
      while (paramm.hasNext())
      {
        paramb = (com.tencent.mm.plugin.game.d.ad)paramm.next();
        d locald;
        if (paramb.mZQ == 7)
        {
          if ((paramb.naG != null) && (!bo.ek(paramb.naG.mZK)))
          {
            if (!bo.isNullOrNil(paramb.naG.Title))
            {
              locald = new d();
              locald.mVH = paramb;
              locald.type = 1000;
              paramString.add(locald);
            }
            Iterator localIterator = paramb.naG.mZK.iterator();
            while (localIterator.hasNext())
            {
              y localy = (y)localIterator.next();
              locald = new d();
              locald.mVH = paramb;
              locald.type = 1001;
              locald.mVI = paramb.naG.mZK.indexOf(localy);
              paramString.add(locald);
            }
            locald = new d();
            locald.mVH = paramb;
            locald.type = 1002;
            paramString.add(locald);
          }
        }
        else
        {
          locald = new d();
          locald.type = paramb.mZQ;
          locald.position = paramb.mZN;
          locald.mVH = paramb;
          paramString.add(locald);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexListView.2
 * JD-Core Version:    0.6.2
 */