package com.tencent.mm.plugin.qmessage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Map;
import junit.framework.Assert;

public final class f
  implements com.tencent.mm.ai.e
{
  public final void a(e.c paramc)
  {
    AppMethodBeat.i(24086);
    o.ahl().x(paramc.cKd);
    AppMethodBeat.o(24086);
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(24085);
    cm localcm = parama.eAB;
    if (localcm == null)
    {
      ab.e("MicroMsg.QMsgExtension", "onPreAddMessage cmdAM is null");
      parama = null;
      AppMethodBeat.o(24085);
    }
    while (true)
    {
      return parama;
      if ((localcm.nao == 36) || (localcm.nao == 39))
        break;
      ab.e("MicroMsg.QMsgExtension", "onPreAddMessage cmdAM.type:%d", new Object[] { Integer.valueOf(localcm.nao) });
      parama = null;
      AppMethodBeat.o(24085);
    }
    Object localObject1 = aa.a(localcm.vED);
    String str1 = aa.a(localcm.vEB);
    Object localObject2 = aa.a(localcm.vEC);
    ab.d("MicroMsg.QMsgExtension", "parseQMsg content:".concat(String.valueOf(localObject1)));
    aw.ZK();
    String str2 = (String)c.Ry().get(2, null);
    label149: bi localbi;
    if (str2.equals(str1))
    {
      aw.ZK();
      localbi = c.XO().Q((String)localObject2, localcm.ptF);
      ab.d("MicroMsg.QMsgExtension", "dkmsgid parseQMsg svrid:%d localid:%d", new Object[] { Long.valueOf(localcm.ptF), Long.valueOf(localbi.field_msgId) });
      if ((localbi.field_msgId != 0L) && (localbi.field_createTime + 604800000L < bf.q(str1, localcm.pcX)))
      {
        ab.w("MicroMsg.QMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(localcm.ptF), Long.valueOf(localbi.field_msgId) });
        bf.fm(localbi.field_msgId);
        localbi.setMsgId(0L);
      }
      if (localbi.field_msgId != 0L)
        break label1076;
      localbi = new bi();
      localbi.eI(localcm.ptF);
      localbi.eJ(bf.q(str1, localcm.pcX));
    }
    label793: label1073: label1076: 
    while (true)
    {
      localbi.setType(localcm.nao);
      localbi.ju((String)localObject2);
      Object localObject3 = g.cca().Vb((String)localObject2);
      if ((localObject3 == null) || (bo.nullAsNil(((d)localObject3).getUsername()).length() <= 0))
      {
        localObject3 = new d();
        ((d)localObject3).username = ((String)localObject2);
        ((d)localObject3).psK = 1;
        ((d)localObject3).bJt = 9;
        if (!g.cca().a((d)localObject3))
          ab.e("MicroMsg.QMsgExtension", "parseQMsg : insert QContact failed : username = " + ((d)localObject3).getUsername());
      }
      long l1 = -1L;
      long l2 = l1;
      if (localcm.vEE == 2)
      {
        l2 = l1;
        if (localbi.field_msgId == 0L)
        {
          localObject3 = aa.a(localcm.vEF);
          PString localPString = new PString();
          PInt localPInt = new PInt();
          localObject2 = new PInt();
          l1 = o.ahl().a((byte[])localObject3, localcm.ptF, false, "", localPString, localPInt, (PInt)localObject2);
          l2 = l1;
          if (l1 > 0L)
          {
            localbi.jv(localPString.value);
            localbi.hZ(localPInt.value);
            localbi.ia(((PInt)localObject2).value);
            l2 = l1;
          }
        }
      }
      boolean bool;
      label596: label618: int i;
      if (localcm.nao == 36)
      {
        Assert.assertTrue(true);
        if (bo.nullAsNil((String)localObject1).length() <= 0)
          break label953;
        bool = true;
        Assert.assertTrue(bool);
        if (bo.nullAsNil(localbi.field_talker).length() <= 0)
          break label959;
        bool = true;
        Assert.assertTrue(bool);
        i = 0;
        aw.ZK();
        localObject2 = c.XM().aoO(localbi.field_talker);
        if ((localObject2 != null) && (bo.nullAsNil(((ap)localObject2).field_username).length() > 0))
          break label1073;
        i = 1;
        localObject2 = new ad(localbi.field_talker);
      }
      while (true)
      {
        localObject3 = new f.a((byte)0);
        localObject1 = br.z((String)localObject1, "msg");
        if (localObject1 != null)
        {
          ((f.a)localObject3).eoz = ((String)((Map)localObject1).get(".msg.from.displayname"));
          ((f.a)localObject3).content = ((String)((Map)localObject1).get(".msg.content.t"));
        }
        if (((f.a)localObject3).eoz == null)
        {
          localObject1 = "";
          label749: ((ad)localObject2).iz((String)localObject1);
          if (((f.a)localObject3).content != null)
            break label974;
          localObject1 = "";
          label767: localbi.setContent((String)localObject1);
          if (i == 0)
            break label983;
          aw.ZK();
          c.XM().Z((ad)localObject2);
          aw.ZK();
          if ((!c.XU().has(str1)) && (!str2.equals(str1)))
            break label1006;
          i = 1;
          label823: if (i == 0)
            break label1012;
          localbi.hO(1);
          i = localcm.jBT;
          label840: localbi.setStatus(i);
          localbi.ix(localcm.vEG);
          bf.a(localbi, parama);
          if (localbi.field_msgId != 0L)
            break label1041;
          localbi.setMsgId(bf.l(localbi));
          if (localcm.vEE == 2)
          {
            parama = o.ahl().b(Long.valueOf(l2));
            parama.fG((int)localbi.field_msgId);
            o.ahl().a(Long.valueOf(l2), parama);
          }
        }
        for (parama = new e.b(localbi, true); ; parama = new e.b(localbi, false))
        {
          AppMethodBeat.o(24085);
          break;
          localObject2 = str1;
          break label149;
          label953: bool = false;
          break label596;
          label959: bool = false;
          break label618;
          localObject1 = ((f.a)localObject3).eoz;
          break label749;
          label974: localObject1 = ((f.a)localObject3).content;
          break label767;
          label983: aw.ZK();
          c.XM().b(((ap)localObject2).field_username, (ad)localObject2);
          break label793;
          label1006: i = 0;
          break label823;
          label1012: localbi.hO(0);
          if (localcm.jBT > 3)
          {
            i = localcm.jBT;
            break label840;
          }
          i = 3;
          break label840;
          aw.ZK();
          c.XO().b(localcm.ptF, localbi);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.a.f
 * JD-Core Version:    0.6.2
 */