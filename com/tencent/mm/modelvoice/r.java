package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class r
  implements e
{
  private static Set<c> gan;

  static
  {
    AppMethodBeat.i(116657);
    gan = new HashSet();
    AppMethodBeat.o(116657);
  }

  public static void b(c paramc)
  {
    AppMethodBeat.i(116654);
    gan.remove(paramc);
    AppMethodBeat.o(116654);
  }

  public static void c(c paramc)
  {
    AppMethodBeat.i(116653);
    if (!gan.contains(paramc))
      gan.add(paramc);
    AppMethodBeat.o(116653);
  }

  public final void a(e.c paramc)
  {
    AppMethodBeat.i(116656);
    paramc = paramc.cKd;
    ab.d("MicroMsg.VoiceMsgExtension", "onPreDelMessage " + paramc.field_imgPath + " " + paramc.field_talker);
    if (!t.nv(paramc.field_talker))
      q.uT(paramc.field_imgPath);
    AppMethodBeat.o(116656);
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(116655);
    cm localcm = parama.eAB;
    if (localcm == null)
    {
      ab.e("MicroMsg.VoiceMsgExtension", "onPreAddMessage cmdAM is null , give up.");
      parama = null;
      AppMethodBeat.o(116655);
      return parama;
    }
    ab.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg srvId:" + localcm.ptF);
    Object localObject1 = aa.a(localcm.vEB);
    if (((String)localObject1).equals(com.tencent.mm.model.r.Yz()));
    for (Object localObject2 = aa.a(localcm.vEC); ; localObject2 = localObject1)
    {
      Object localObject3 = ((j)g.K(j.class)).bOr().Q((String)localObject2, localcm.ptF);
      if ((((cy)localObject3).field_msgId != 0L) && (((cy)localObject3).field_createTime + 604800000L < bf.q((String)localObject2, localcm.pcX)))
      {
        ab.w("MicroMsg.VoiceMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d", new Object[] { Long.valueOf(localcm.ptF) });
        bf.r((String)localObject2, localcm.ptF);
        localObject3 = m.ama().fZ(localcm.ptF);
        if ((localObject3 != null) && (!bo.isNullOrNil(((p)localObject3).fileName)))
          q.uT(((p)localObject3).fileName);
      }
      p localp = new p();
      localp.cIS = ((String)localObject2);
      localp.createTime = localcm.pcX;
      localp.cKK = localcm.ptF;
      localp.dqJ = localcm.vEG;
      ab.d("MicroMsg.VoiceMsgExtension", "voiceMsgExtension, onPreAddMessage.(MsgSource : %s)", new Object[] { localcm.vEG });
      localObject3 = aa.a(localcm.vED);
      if (t.kH((String)localObject1))
      {
        localObject1 = bf.oz((String)localObject3);
        ab.i("MicroMsg.VoiceMsgExtension", "chatroom voicemsg, new content=".concat(String.valueOf(localObject1)));
      }
      while (true)
      {
        int i;
        while (true)
        {
          localObject3 = br.z((String)localObject1, "msg");
          if (localObject3 == null)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(111L, 227L, 1L, false);
            parama = null;
            AppMethodBeat.o(116655);
            break;
          }
          try
          {
            localp.fVG = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$length")).intValue();
            localp.clientId = ((String)((Map)localObject3).get(".msg.voicemsg.$clientmsgid"));
            i = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$endflag")).intValue();
            j = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$cancelflag")).intValue();
            localp.gaf = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$voicelength")).intValue();
            localp.fWW = ((String)((Map)localObject3).get(".msg.voicemsg.$fromusername"));
            localObject1 = (String)((Map)localObject3).get(".msg.commenturl");
            localp.fZe = Integer.valueOf(bo.bc((String)((Map)localObject3).get(".msg.voicemsg.$forwardflag"), "0")).intValue();
            localp.fYX = ((String)((Map)localObject3).get(".msg.voicemsg.$voiceformat"));
            localp.gah = bo.getLong((String)((Map)localObject3).get(".msg.voicemsg.$bufid"), 0L);
            if (j != 1)
              break label672;
            ab.v("MicroMsg.VoiceMsgExtension", "cancelFlag = 1 srvId:" + localcm.ptF);
            parama = m.ama().fZ(localp.cKK);
            if (parama != null)
              q.uR(parama.fileName);
            parama = null;
            AppMethodBeat.o(116655);
          }
          catch (Exception parama)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(111L, 227L, 1L, false);
            ab.e("MicroMsg.VoiceMsgExtension", "parsing voice msg xml failed");
            ab.e("MicroMsg.VoiceMsgExtension", "exception:%s", new Object[] { bo.l(parama) });
            parama = null;
            AppMethodBeat.o(116655);
          }
        }
        break;
        label672: if (i == 1)
        {
          ab.v("MicroMsg.VoiceMsgExtension", "endFlag = 1 srvId:" + localcm.ptF);
          localp.frO = localp.fVG;
        }
        localp.bJt = 284334;
        localObject3 = aa.a(localcm.vEF);
        if (localObject3 != null)
          ab.d("MicroMsg.VoiceMsgExtension", "Voice Buf Len:" + localObject3.length + " srvId:" + localcm.ptF);
        int j = q.a(localp, (byte[])localObject3, localcm.jBT, (String)localObject1, localcm.vEG, parama);
        if (j > 0)
        {
          ab.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d]", new Object[] { Integer.valueOf(j), Long.valueOf(localcm.ptF), Integer.valueOf(localcm.vEI) });
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 228L, 1L, false);
          localObject1 = ((j)g.K(j.class)).bOr().Q(localp.cIS, localp.cKK);
          ((bi)localObject1).Mr(0);
          localObject3 = gan.iterator();
          while (true)
          {
            parama = (e.a)localObject1;
            if (!((Iterator)localObject3).hasNext())
              break;
            al.d(new r.1(this, (c)((Iterator)localObject3).next(), localp));
          }
        }
        ab.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d], stack[%s]", new Object[] { Integer.valueOf(j), Long.valueOf(localcm.ptF), Integer.valueOf(localcm.vEI), bo.dpG() });
        parama = null;
        if (parama != null)
        {
          localObject1 = ((j)g.K(j.class)).XR().aoZ((String)localObject2);
          if (localObject1 != null)
          {
            ((ak)localObject1).jk(16777216);
            ((j)g.K(j.class)).XR().a((ak)localObject1, (String)localObject2);
          }
        }
        if ((parama != null) && (parama.field_msgId > 0L));
        for (boolean bool = true; ; bool = false)
        {
          parama = new e.b(parama, bool);
          AppMethodBeat.o(116655);
          break;
        }
        localObject1 = localObject3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.r
 * JD-Core Version:    0.6.2
 */