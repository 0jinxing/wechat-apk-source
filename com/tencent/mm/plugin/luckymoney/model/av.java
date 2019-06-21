package com.tencent.mm.plugin.luckymoney.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.vg;
import com.tencent.mm.g.a.vg.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class av
  implements f
{
  boolean nZr;
  public aq nZs;
  public an nZt;
  private af nZu;
  public com.tencent.mm.sdk.b.c nZv;

  public av()
  {
    AppMethodBeat.i(42428);
    this.nZv = new av.1(this);
    a.xxA.c(this.nZv);
    AppMethodBeat.o(42428);
  }

  private static void a(k paramk, long paramLong, String paramString)
  {
    AppMethodBeat.i(42431);
    vg localvg = new vg();
    localvg.cSe.action = 2;
    localvg.cSf.cuQ = paramLong;
    localvg.cSf.cSh = paramk.cSh;
    localvg.cSf.cSi = paramk.nXb;
    localvg.cSf.cSj = new ArrayList();
    if (t.kH(paramString))
    {
      paramk = paramk.nXj.iterator();
      while (paramk.hasNext())
      {
        paramString = (w)paramk.next();
        paramString = o.acv().qc(paramString.nYa) + "=" + paramString.nXZ + "=" + paramString.nXM;
        localvg.cSf.cSj.add(paramString);
      }
    }
    a.xxA.a(localvg, Looper.getMainLooper());
    AppMethodBeat.o(42431);
  }

  private static void jd(long paramLong)
  {
    AppMethodBeat.i(42430);
    vg localvg = new vg();
    localvg.cSe.action = 2;
    localvg.cSf.cuQ = paramLong;
    localvg.cSf.cSh = 0L;
    localvg.cSf.cSi = "";
    a.xxA.a(localvg, Looper.getMainLooper());
    AppMethodBeat.o(42430);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42429);
    g.RQ();
    g.RO().eJo.b(1581, this);
    g.RQ();
    g.RO().eJo.b(1685, this);
    g.RQ();
    g.RO().eJo.b(1585, this);
    if ((paramm instanceof aq))
    {
      paramString = (aq)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        this.nZr = false;
        jd(paramString.cvx);
        AppMethodBeat.o(42429);
      }
    }
    while (true)
    {
      return;
      if (paramString.cRU == 4)
      {
        if (this.nZu != null)
        {
          g.RQ();
          g.RO().eJo.c(this.nZu);
          this.nZu = null;
        }
        g.RQ();
        g.RO().eJo.a(1585, this);
        this.nZu = new af(paramString.nSX, 11, 0, paramString.cRS, "v1.0");
        this.nZu.talker = paramString.talker;
        this.nZu.cvx = paramString.cvx;
        g.RQ();
        g.RO().eJo.a(this.nZu, 0);
        ab.i("MicroMsg.Wear.WearLuckyLogic", "start to get detail");
        AppMethodBeat.o(42429);
      }
      else if ((paramString.cRV != 1) && (paramString.cRU != 5) && (paramString.cRU != 1))
      {
        if (this.nZt != null)
        {
          g.RQ();
          g.RO().eJo.c(this.nZt);
          this.nZt = null;
        }
        g.RQ();
        g.RO().eJo.a(1685, this);
        this.nZt = new an(paramString.msgType, paramString.cdf, paramString.nSX, paramString.cRS, x.bLC(), r.YB(), paramString.talker, "v1.0", paramString.nZl);
        this.nZt.cvx = paramString.cvx;
        g.RQ();
        g.RO().eJo.a(this.nZt, 0);
        ab.i("MicroMsg.Wear.WearLuckyLogic", "start to open lucky");
        AppMethodBeat.o(42429);
      }
      else
      {
        this.nZr = false;
        ab.i("MicroMsg.Wear.WearLuckyLogic", "receive lucky already");
        jd(paramString.cvx);
        AppMethodBeat.o(42429);
        continue;
        if ((paramm instanceof an))
        {
          this.nZr = false;
          paramString = (an)paramm;
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            jd(paramString.cvx);
            AppMethodBeat.o(42429);
          }
          else
          {
            paramm = paramString.nYn;
            if (paramm.cRV == 2)
            {
              a(paramm, paramString.cvx, paramString.talker);
              AppMethodBeat.o(42429);
            }
            else
            {
              jd(paramString.cvx);
              AppMethodBeat.o(42429);
            }
          }
        }
        else if ((paramm instanceof af))
        {
          this.nZr = false;
          paramString = (af)paramm;
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            jd(paramString.cvx);
            AppMethodBeat.o(42429);
          }
          else
          {
            a(paramString.nYn, paramString.cvx, paramString.talker);
          }
        }
        else
        {
          AppMethodBeat.o(42429);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.av
 * JD-Core Version:    0.6.2
 */