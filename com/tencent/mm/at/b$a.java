package com.tencent.mm.at;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.bi;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Stack;

final class b$a extends ak
{
  private WeakReference<b> fDk;

  public b$a(b paramb, Looper paramLooper)
  {
    super(paramLooper);
    AppMethodBeat.i(78157);
    this.fDk = new WeakReference(paramb);
    AppMethodBeat.o(78157);
  }

  public final void handleMessage(Message arg1)
  {
    AppMethodBeat.i(78158);
    b localb = (b)this.fDk.get();
    if ((localb != null) && (1 == ???.what))
    {
      boolean bool = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIR, false);
      ??? = new ui();
      ???.cQx.cAd = 2;
      com.tencent.mm.sdk.b.a.xxA.m(???);
      if (((!???.cQy.cQz) && (!com.tencent.mm.r.a.Oo())) || (!bool))
        if ((!localb.fCY) && (System.currentTimeMillis() - localb.fCZ > 1200000L))
        {
          ab.i("MicroMsg.AutoGetBigImgLogic", "running to long in blackground");
          AppMethodBeat.o(78158);
        }
    }
    while (true)
    {
      return;
      if ((localb.fCW != 0L) || (localb.fCV.size() <= 0) || (localb.fDa != 0) || (localb.fDb))
      {
        ab.i("MicroMsg.AutoGetBigImgLogic", "curMsgId: " + localb.fCW + " size: " + localb.fCV.size() + " cnt: " + localb.fDa + " pauseOnMonitor: " + localb.fDb);
        AppMethodBeat.o(78158);
      }
      else
      {
        bi localbi;
        synchronized (localb.fCV)
        {
          localb.fCW = ((Long)localb.fCV.pop()).longValue();
          localbi = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(localb.fCW);
          ??? = o.ahl().fI(localbi.field_msgSvrId);
          if (???.dJA == 1)
          {
            ab.i("MicroMsg.AutoGetBigImgLogic", localb.fCW + " already has hd thumb");
            localb.fCW = 0L;
            localb.start();
            AppMethodBeat.o(78158);
          }
        }
        ab.i("MicroMsg.AutoGetBigImgLogic", "start download cdnautostart " + locala.fCW + "  image_" + localbi.field_msgId);
        f.afx().fyQ.add("image_" + localbi.field_msgId);
        o.ahm().a(???.fDy, localbi.field_msgId, 0, Long.valueOf(locala.fCW), locala.fCX, locala);
        AppMethodBeat.o(78158);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.b.a
 * JD-Core Version:    0.6.2
 */