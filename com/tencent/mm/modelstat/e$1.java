package com.tencent.mm.modelstat;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class e$1
  implements Runnable
{
  e$1(e parame, boolean paramBoolean1, float paramFloat1, float paramFloat2, int paramInt1, boolean paramBoolean2, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78716);
    try
    {
      boolean bool;
      if (g.RN().QY())
      {
        g.RN();
        bool = a.QT();
        if (!bool);
      }
      else
      {
        AppMethodBeat.o(78716);
      }
      while (true)
      {
        return;
        long l = bo.anU();
        if ((e.a(this.fSs) != 0L) && (l - e.a(this.fSs) < 1800000L))
        {
          ab.e("MicroMsg.IndoorReporter", "Ignore this Report,Another Report is Running & not timeout:%d.", new Object[] { Long.valueOf(l - e.a(this.fSs)) });
          AppMethodBeat.o(78716);
        }
        else
        {
          if (this.fSn)
            localObject1 = e.b(this.fSs);
          label114: for (int i = 0; ; i++)
          {
            if (i >= ((List)localObject1).size())
              break label782;
            if ((e.F(this.fSo, ((Float)((Pair)((List)localObject1).get(i)).first).floatValue())) && (e.F(this.fSp, ((Float)((Pair)((List)localObject1).get(i)).second).floatValue())))
            {
              localObject1 = (Pair)((List)localObject1).get(i);
              if (localObject1 != null)
                break label243;
              ab.d("MicroMsg.IndoorReporter", "Ignore this report, no hit any Point");
              AppMethodBeat.o(78716);
              break;
              localObject1 = e.c(this.fSs);
              break label114;
            }
          }
          label243: e.a(this.fSs, l);
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          Object localObject4 = new com/tencent/mm/a/p;
          g.RN();
          ((p)localObject4).<init>(a.QF());
          localObject4 = ((p)localObject4).toString() + "_" + e.a(this.fSs);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          Object localObject1 = ((StringBuilder)localObject3).append(((Pair)localObject1).first).append(",").append(((Pair)localObject1).second).append(",").append(this.fwD).append(",");
          if (this.fSq)
          {
            i = 1;
            label371: if (!this.fSn)
              break label677;
          }
          Object localObject5;
          label677: for (int j = 10; ; j = 20)
          {
            localObject1 = j + i + "," + this.fSo + "," + this.fSp + ",0," + this.fSr + "," + e.a(this.fSs) + ",";
            localObject3 = new com/tencent/mm/modelstat/e$c;
            ((e.c)localObject3).<init>(this.fSs);
            localObject5 = ah.getContext();
            i = e.d(this.fSs);
            j = e.e(this.fSs);
            if (((e.c)localObject3).bJj == null)
              ((e.c)localObject3).bJj = ((WifiManager)((Context)localObject5).getSystemService("wifi"));
            ((e.c)localObject3).fSL = i;
            ((e.c)localObject3).fSk = j;
            ((e.c)localObject3).startTime = bo.anU();
            ((e.c)localObject3).fSM = true;
            ((e.c)localObject3).thread.start();
            localObject5 = new com/tencent/mm/modelstat/e$b;
            ((e.b)localObject5).<init>(this.fSs);
            bool = ((e.b)localObject5).A(ah.getContext(), e.f(this.fSs));
            if (bool)
              break label684;
            ab.e("MicroMsg.IndoorReporter", "Ignore this report. Error:start wifi:%b sensor:%b  ", new Object[] { Boolean.TRUE, Boolean.valueOf(bool) });
            ((e.b)localObject5).akg();
            ((e.c)localObject3).akg();
            localObject3 = h.pYm;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            ((h)localObject3).X(13381, (String)localObject1 + (String)localObject4 + ",-10002,ERROR:StartFailed.");
            AppMethodBeat.o(78716);
            break;
            i = 2;
            break label371;
          }
          label684: ap localap = new com/tencent/mm/sdk/platformtools/ap;
          g.RQ();
          Looper localLooper = g.RS().oAl.getLooper();
          e.1.1 local1 = new com/tencent/mm/modelstat/e$1$1;
          local1.<init>(this, (e.b)localObject5, (e.c)localObject3, (String)localObject1, (String)localObject4);
          localap.<init>(localLooper, local1, true);
          localap.ae(3000L, 3000L);
          AppMethodBeat.o(78716);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.IndoorReporter", "reprot Start exception:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(78716);
        continue;
        label782: Object localObject2 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.e.1
 * JD-Core Version:    0.6.2
 */