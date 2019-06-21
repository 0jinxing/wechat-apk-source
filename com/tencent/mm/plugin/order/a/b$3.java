package com.tencent.mm.plugin.order.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.order.b.a;
import com.tencent.mm.plugin.order.model.j;
import com.tencent.mm.protocal.protobuf.bjn;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

final class b$3
  implements bz.a
{
  b$3(b paramb)
  {
  }

  public final void a(final e.a parama)
  {
    AppMethodBeat.i(43730);
    final String str = aa.a(parama.eAB.vED);
    ab.i("MicroMsg.SubCoreWalletOrder", "MallPayMsg:".concat(String.valueOf(str)));
    b.a(this.pbF).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(43729);
        Object localObject1 = b.bYU();
        Object localObject2 = str;
        Object localObject3 = parama.eAB.ptD;
        j localj;
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          localj = com.tencent.mm.plugin.order.model.c.Ut((String)localObject2);
          if (localj == null)
          {
            ab.i("MicroMsg.MallPayMsgManager", "payMsg == null");
            AppMethodBeat.o(43729);
            return;
          }
          if ((!TextUtils.isEmpty(localj.pde)) || (!TextUtils.isEmpty(localj.pdv)) || (!TextUtils.isEmpty(localj.pdu)) || (!TextUtils.isEmpty(localj.cJh)) || (!TextUtils.isEmpty(localj.pdq)) || (!TextUtils.isEmpty(localj.pdr)) || (!TextUtils.isEmpty(localj.pdp)) || (!TextUtils.isEmpty(localj.pdt)) || (!TextUtils.isEmpty(localj.pds)) || (!TextUtils.isEmpty(localj.pdo)))
            if ((localj.pdo != null) && (com.tencent.mm.plugin.order.c.c.isNumeric(localj.pdo)))
            {
              int i = Integer.valueOf(localj.pdo).intValue();
              if ((i != 2) && (i != 1));
            }
            else
            {
              if (!TextUtils.isEmpty(localj.pdq))
                break label473;
              localj.cJb = ((String)localObject3);
              label240: ab.i("MicroMsg.MallPayMsgManager", "msgid: " + localj.cJb);
              ab.i("MicroMsg.MallPayMsgManager", "msgType: " + localj.pdo);
              if (((com.tencent.mm.plugin.order.model.c)localObject1).Uv(localj.cJb))
                break label503;
              ((com.tencent.mm.plugin.order.model.c)localObject1).kbM.add(localj);
              ((com.tencent.mm.plugin.order.model.c)localObject1).a(localj, (String)localObject2, "0");
              label323: ((com.tencent.mm.plugin.order.model.c)localObject1).bYY();
              localObject1 = b.bYR();
              if (localj != null)
              {
                localObject2 = new bjn();
                if ((TextUtils.isEmpty(localj.pdq)) || (!com.tencent.mm.plugin.order.c.c.isNumeric(localj.pdq)))
                  break label579;
                ((bjn)localObject2).pcX = Integer.valueOf(localj.pdq).intValue();
              }
            }
        }
        for (((bjn)localObject2).pcZ = Integer.valueOf(localj.pdq).intValue(); ; ((bjn)localObject2).pcZ = ((int)(System.currentTimeMillis() / 1000L)))
        {
          ((bjn)localObject2).pdc = 100000;
          ((bjn)localObject2).pde = localj.pde;
          ((bjn)localObject2).pcU = localj.cJb;
          ((bjn)localObject2).pcY = localj.pds;
          ((bjn)localObject2).wMU = -1;
          ((bjn)localObject2).pdf = localj.pdp;
          ((bjn)localObject2).pdg = localj.pds;
          ((bjn)localObject2).pdh = localj.cJh;
          ((b)localObject1).bYS();
          AppMethodBeat.o(43729);
          break;
          label473: localj.cJb = ((String)localObject3 + localj.pdq);
          break label240;
          label503: ab.e("MicroMsg.MallPayMsgManager", "msg for id " + localj.cJb + " is exist!!");
          localObject3 = ((com.tencent.mm.plugin.order.model.c)localObject1).Ux(localj.cJb);
          ((com.tencent.mm.plugin.order.model.c)localObject1).Uu(localj.cJb);
          ((com.tencent.mm.plugin.order.model.c)localObject1).kbM.add(localj);
          ((com.tencent.mm.plugin.order.model.c)localObject1).a(localj, (String)localObject2, ((a)localObject3).field_isRead);
          break label323;
          label579: ((bjn)localObject2).pcX = ((int)(System.currentTimeMillis() / 1000L));
        }
      }
    });
    AppMethodBeat.o(43730);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.a.b.3
 * JD-Core Version:    0.6.2
 */