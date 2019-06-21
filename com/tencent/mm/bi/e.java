package com.tencent.mm.bi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.a.je;
import com.tencent.mm.g.a.nb;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.z;

public final class e
  implements com.tencent.mm.ai.e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    int i = 0;
    AppMethodBeat.i(16632);
    Object localObject1 = parama.eAB;
    Object localObject2 = aa.a(((cm)localObject1).vEB);
    if ((!"fmessage".equals(localObject2)) && (((cm)localObject1).nao != 37))
      AppMethodBeat.o(16632);
    Object localObject4;
    while (true)
    {
      return null;
      localObject3 = aa.a(((cm)localObject1).vED);
      parama = bi.d.apF((String)localObject3);
      localObject4 = r.Yz();
      if ((parama.svN != null) && (parama.svN.equals(localObject4)))
      {
        ab.d("MicroMsg.VerifyMessageExtension", "onPreAddMessage, verify scene:%d, content:%s", new Object[] { Integer.valueOf(parama.scene), localObject3 });
        ab.e("MicroMsg.VerifyMessageExtension", "fromUserName is self, simply drop this msg");
        AppMethodBeat.o(16632);
      }
      else
      {
        localObject4 = new h();
        ((h)localObject4).username = parama.svN;
        ((h)localObject4).dtR = 3;
        ((h)localObject4).cB(true);
        ((h)localObject4).bJt = -1;
        ((h)localObject4).frW = parama.xZk;
        ((h)localObject4).frV = parama.xZl;
        ab.d("MicroMsg.VerifyMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { parama.svN, ((h)localObject4).ack(), ((h)localObject4).acl() });
        o.act().b((h)localObject4);
        if (bo.isNullOrNil(parama.svN))
          break label514;
        if (parama.scene == 18)
        {
          d.a((cm)localObject1, parama);
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.Ry().set(73729, Integer.valueOf(1));
          com.tencent.mm.model.aw.ZK();
          localObject2 = com.tencent.mm.model.c.XM().aoO(parama.xZx);
          if ((localObject2 == null) || ((int)((com.tencent.mm.n.a)localObject2).ewQ <= 0))
            ao.a.flu.a(parama.xZx, null, new e.1(this, parama));
          while (true)
          {
            AppMethodBeat.o(16632);
            break;
            localObject3 = ((ap)localObject2).field_username;
            if ((localObject3 != null) && (!t.mX((String)localObject3)))
            {
              ((ad)localObject2).setUsername(parama.xZx);
              ((ad)localObject2).iH(null);
              com.tencent.mm.model.aw.ZK();
              com.tencent.mm.model.c.XM().b((String)localObject3, (ad)localObject2);
            }
            localObject3 = new je();
            ((je)localObject3).cEq.cEr = parama.xZx;
            ((je)localObject3).cEq.type = 1;
            com.tencent.mm.sdk.b.a.xxA.m((b)localObject3);
          }
        }
        if (!bf.kE(parama.scene))
          break;
        d.b((cm)localObject1, parama);
        com.tencent.mm.model.aw.ZK();
        com.tencent.mm.model.c.Ry().set(73730, Integer.valueOf(1));
        AppMethodBeat.o(16632);
      }
    }
    if (parama.scene == 48)
    {
      localObject4 = new nb();
      ((nb)localObject4).cJf.cJh = ((String)localObject3);
      ((nb)localObject4).cJf.talker = parama.svN;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject4);
    }
    label514: Object localObject3 = new ax();
    ((ax)localObject3).field_createTime = c.q((String)localObject2, ((cm)localObject1).pcX);
    if (((cm)localObject1).jBT == 4)
      i = 2;
    ((ax)localObject3).field_isSend = (i + 0);
    ((ax)localObject3).field_msgContent = aa.a(((cm)localObject1).vED);
    ((ax)localObject3).field_svrId = ((cm)localObject1).ptF;
    ((ax)localObject3).field_talker = parama.svN;
    com.tencent.mm.model.aw.ZK();
    localObject2 = com.tencent.mm.model.c.XM().aoO(parama.chatroomName);
    if ((localObject2 != null) && ((int)((com.tencent.mm.n.a)localObject2).ewQ != -1))
      ((ax)localObject3).field_chatroomName = parama.chatroomName;
    switch (parama.cAd)
    {
    case 3:
    case 4:
    default:
      ((ax)localObject3).field_type = 1;
      label674: if (!bo.isNullOrNil(parama.xZx))
      {
        ((ax)localObject3).field_encryptTalker = parama.xZx;
        if (d.akP().QR(parama.xZx) != null)
        {
          parama = d.akO();
          localObject1 = ((ax)localObject3).field_encryptTalker;
          localObject2 = ((ax)localObject3).field_talker;
          localObject2 = "update fmessage_msginfo set talker = '" + bo.vA((String)localObject2) + "'  where talker = '" + bo.vA((String)localObject1) + "'";
          parama.bSd.hY("fmessage_msginfo", (String)localObject2);
          d.akP().p(0L, ((ax)localObject3).field_encryptTalker);
        }
        d.akO().b((ax)localObject3);
      }
      break;
    case 2:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(16632);
      break;
      ((ax)localObject3).field_type = 1;
      break label674;
      ((ax)localObject3).field_type = 2;
      break label674;
      ((ax)localObject3).field_type = 3;
      break label674;
      ab.e("MicroMsg.VerifyMessageExtension", "it should not go in here");
      parama = d.akP().apu(((ax)localObject3).field_talker);
      if (parama != null)
      {
        ((ax)localObject3).field_encryptTalker = parama.field_talker;
        ((ax)localObject3).field_talker = parama.field_talker;
      }
      d.akO().b((ax)localObject3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bi.e
 * JD-Core Version:    0.6.2
 */