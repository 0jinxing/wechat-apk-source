package com.tencent.mm.plugin.collect.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.cb;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.collect.model.d;
import com.tencent.mm.plugin.collect.model.d.a;
import com.tencent.mm.plugin.collect.model.t;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class a$1
  implements bz.a
{
  a$1(a parama)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(40906);
    a.bgv();
    Object localObject1;
    Object localObject2;
    long l;
    if (a.bgw() != null)
    {
      localObject1 = aa.a(parama.eAB.vED);
      a.bgv();
      localObject2 = a.bgw();
      l = parama.eAB.pcX;
      ab.v("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] content:".concat(String.valueOf(localObject1)));
      if (bo.isNullOrNil((String)localObject1))
      {
        ab.d("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] Msg content empty");
        AppMethodBeat.o(40906);
      }
    }
    while (true)
    {
      return;
      localObject1 = br.z((String)localObject1, "sysmsg");
      int i = bo.getInt((String)((Map)localObject1).get(".sysmsg.paymsg.PayMsgType"), 0);
      if ((i != 9) && (i != 26))
      {
        ab.i("MicroMsg.CollectPayerMsgMgr", "Not ftf collect msg type, ignore; type=".concat(String.valueOf(i)));
        AppMethodBeat.o(40906);
      }
      else
      {
        parama = new t();
        parama.username = bo.nullAsNil((String)((Map)localObject1).get(".sysmsg.paymsg.username"));
        parama.kCJ = (bo.getDouble((String)((Map)localObject1).get(".sysmsg.paymsg.fee"), 0.0D) / 100.0D);
        parama.cuZ = bo.nullAsNil((String)((Map)localObject1).get(".sysmsg.paymsg.feetype"));
        parama.timestamp = bo.getInt((String)((Map)localObject1).get(".sysmsg.paymsgtimestamp"), (int)bo.anT());
        parama.cAa = bo.nullAsNil((String)((Map)localObject1).get(".sysmsg.paymsg.transid"));
        parama.eoz = bo.nullAsNil((String)((Map)localObject1).get(".sysmsg.paymsg.displayname"));
        parama.scene = bo.getInt((String)((Map)localObject1).get(".sysmsg.paymsg.scene"), 1);
        parama.status = bo.getInt((String)((Map)localObject1).get(".sysmsg.paymsg.status"), 0);
        parama.msgType = i;
        parama.kCK = bo.nullAsNil((String)((Map)localObject1).get(".sysmsg.paymsg.outtradeno"));
        parama.type = bo.nullAsNil((String)((Map)localObject1).get(".sysmsg.paymsg.type"));
        localObject1 = bo.nullAsNil((String)((Map)localObject1).get(".sysmsg.paymsg.voice_content"));
        Iterator localIterator = ((d)localObject2).kaD.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (d.a)localIterator.next();
          if (localObject2 != null)
            ((d.a)localObject2).a(parama);
        }
        if (parama.status == 1)
        {
          localObject2 = new bx();
          ((bx)localObject2).cuX.cuY = ((int)Math.round(parama.kCJ * 100.0D));
          ((bx)localObject2).cuX.cuZ = parama.cuZ;
          ((bx)localObject2).cuX.cvb = parama.type;
          ((bx)localObject2).cuX.cva = parama.kCK;
          ((bx)localObject2).cuX.cvc = (cb.aaE() - l * 1000L);
          ((bx)localObject2).cuX.cvd = 1;
          ((bx)localObject2).cuX.cve = ((String)localObject1);
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject2);
        }
        AppMethodBeat.o(40906);
        continue;
        ab.w("MicroMsg.SubCoreCollect", "func[onRecieveMsg] payerMsgMgr null");
        AppMethodBeat.o(40906);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.a.a.1
 * JD-Core Version:    0.6.2
 */