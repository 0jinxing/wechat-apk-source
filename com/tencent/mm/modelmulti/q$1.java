package com.tencent.mm.modelmulti;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.LinkedList;

final class q$1
  implements Runnable
{
  q$1(int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16513);
    q.access$000();
    q.sS(e.eSn + "/testaddmsg.txt");
    if ((q.aia().size() <= 0) || (q.aib().size() <= 0))
    {
      ab.e("MicroMsg.TestSyncAddMsg", "syncAddMsg get source failed cmd:%d contact:%d", new Object[] { Integer.valueOf(q.aib().size()), Integer.valueOf(q.aia().size()) });
      AppMethodBeat.o(16513);
    }
    while (true)
    {
      return;
      new com.tencent.mm.sdk.platformtools.ap(aw.RS().oAl.getLooper(), new ap.a()
      {
        int fJI;

        public final boolean BI()
        {
          AppMethodBeat.i(16512);
          if (this.fJI <= 0)
            AppMethodBeat.o(16512);
          for (boolean bool = false; ; bool = true)
          {
            return bool;
            this.fJI -= 1;
            t.b localb = new t.b();
            localb.vyH.vTR = new tc();
            int i = bo.gV(q.1.this.fJH, 1);
            int j = 0;
            while (true)
              if (j < i)
              {
                cm localcm = (cm)q.aib().get(bo.gV(q.aib().size() - 1, 0));
                localcm.vEB = new bts().alV(((ad)q.aia().get(bo.gV(q.aia().size() - 1, 0))).field_username);
                localcm.pcX = ((int)bo.anT());
                localcm.ptF = Math.abs((int)bo.anU() % 10000000);
                try
                {
                  tb localtb = new com/tencent/mm/protocal/protobuf/tb;
                  localtb.<init>();
                  Object localObject = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
                  ((SKBuiltinBuffer_t)localObject).<init>();
                  localtb.wau = ((SKBuiltinBuffer_t)localObject);
                  localtb.wau.setBuffer(localcm.toByteArray());
                  localtb.wat = 5;
                  localb.vyH.vTR.jBw.add(localtb);
                  localObject = localb.vyH.vTR;
                  ((tc)localObject).jBv += 1;
                  ab.d("MicroMsg.TestSyncAddMsg", "syncAddMsg  loop:%d cnt:[%d,%d] cmdList:%d id:%d u:%s", new Object[] { Integer.valueOf(this.fJI), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localb.vyH.vTR.jBw.size()), Long.valueOf(localcm.ptF), localcm.vEB.wVI });
                  j++;
                }
                catch (Exception localException)
                {
                  while (true)
                  {
                    ab.d("MicroMsg.TestSyncAddMsg", localException.getMessage());
                    ab.printErrStackTrace("MicroMsg.TestSyncAddMsg", localException, "", new Object[0]);
                  }
                }
              }
            localb.vyH.vQe = 0;
            bek localbek = localb.vyH;
            aw.ZK();
            localbek.vTO = aa.ad(bo.anf(bo.nullAsNil((String)c.Ry().get(8195, new byte[0]))));
            localb.vyH.Ret = 0;
            localb.vyH.jBT = 0;
            n.ahW().a(localb, 0, bo.anT());
            AppMethodBeat.o(16512);
          }
        }
      }
      , true).ae(3000L, 3000L);
      AppMethodBeat.o(16513);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.q.1
 * JD-Core Version:    0.6.2
 */