package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.f;
import com.tencent.mm.model.bf;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.voip.b;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.cpm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class o
  implements com.tencent.mm.ai.e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(4456);
    cm localcm = parama.eAB;
    String str1 = aa.a(localcm.vEB);
    Object localObject1 = aa.a(localcm.vEC);
    String str2 = aa.a(localcm.vED);
    ab.d("MicroMsg.VoipExtension", "voip msg, from: %s, content: %s", new Object[] { str1, str2 });
    Object localObject2 = ((j)g.K(j.class)).bOr();
    Object localObject3 = (String)g.RP().Ry().get(2, "");
    if (((String)localObject3).length() <= 0)
    {
      parama = null;
      AppMethodBeat.o(4456);
      return parama;
    }
    if (((String)localObject3).equals(str1))
    {
      localObject1 = ((h)localObject2).Q((String)localObject1, localcm.ptF);
      if (((cy)localObject1).field_msgId != 0L)
        break label1141;
      localObject1 = new bi();
      ((bi)localObject1).eI(localcm.ptF);
      ((bi)localObject1).eJ(bf.q(str1, localcm.pcX));
    }
    label361: label754: label1141: 
    while (true)
    {
      int i;
      while (true)
      {
        b.cIj();
        localObject3 = r.abW(str2);
        if (localObject3 != null)
          break label455;
        ab.e("MicroMsg.VoipExtension", "parse voip message failed, voipMessage is null!");
        try
        {
          localObject1 = br.z(str2, "voipwarnmsg");
          if ((localObject1 != null) && (((Map)localObject1).get(".voipwarnmsg.type") != null) && (bo.getInt((String)((Map)localObject1).get(".voipwarnmsg.type"), 0) == 1))
          {
            parama = (String)((Map)localObject1).get(".voipwarnmsg.warntips");
            if ((parama != null) && (!parama.equals("")))
            {
              ab.i("MicroMsg.VoipExtension", "got risk tips back:".concat(String.valueOf(parama)));
              if (((Map)localObject1).get(".voipwarnmsg.roomid") != null)
              {
                if (f.ME())
                  break label361;
                ab.i("MicroMsg.VoipExtension", "set voipmsg not notification...");
              }
              while (bo.getInt((String)((Map)localObject1).get(".voipwarnmsg.roomid"), 0) == b.cIj().sSP.sNl.sPp.nwu)
              {
                b.cIj().sRK = parama;
                localObject1 = b.cIj();
                for (i = 0; i < 2; i++)
                {
                  localObject2 = new com/tencent/mm/plugin/voip/model/r$4;
                  ((r.4)localObject2).<init>((r)localObject1, parama);
                  al.n((Runnable)localObject2, 1000L);
                }
                localObject1 = str1;
                break;
              }
              ab.i("MicroMsg.VoipExtension", "wrong roomid,now return..");
              parama = null;
              AppMethodBeat.o(4456);
            }
          }
        }
        catch (Exception parama)
        {
          ab.printErrStackTrace("MicroMsg.VoipExtension", parama, "", new Object[0]);
          ab.e("MicroMsg.VoipExtension", "parse voip message error: %s", new Object[] { parama.getMessage() });
          parama = null;
          AppMethodBeat.o(4456);
        }
      }
      break;
      Object localObject4;
      if (((o.a)localObject3).status == o.a.sQW)
      {
        i = 1;
        if (i == 0)
          break label658;
        ab.i("MicroMsg.VoipExtension", "recv voip cancel message");
        localObject4 = b.cIj();
        if ((str2 != null) && (str2.length() != 0))
          break label539;
      }
      while (true)
        if (((o.a)localObject3).sQS == b.cIj().sSV)
        {
          ab.i("MicroMsg.VoipExtension", "already ignore the invite, don't add the message to db");
          parama = null;
          AppMethodBeat.o(4456);
          break;
          i = 0;
          break label469;
          localObject2 = new o.a();
          if ((((o.a)localObject2).parse(str2)) && (((o.a)localObject2).status == 2))
          {
            ((r)localObject4).Gv(((o.a)localObject2).sQS);
            localObject4 = ((r)localObject4).sSP;
            ab.i("MicroMsg.Voip.VoipServiceEx", "onCancelInviteMessage, roomId: " + ((o.a)localObject2).sQS);
            if ((((s)localObject4).sNl.sPu != null) && (((o.a)localObject2).sQS == ((s)localObject4).sNl.sPu.wem))
            {
              ((s)localObject4).cKn();
              ((s)localObject4).sNl.shutdown();
              continue;
              if (((o.a)localObject3).status == o.a.sQY);
              for (i = 1; ; i = 0)
              {
                if (i == 0)
                  break label694;
                parama = null;
                AppMethodBeat.o(4456);
                break;
              }
              if (((o.a)localObject3).status == o.a.sQV);
              for (i = 1; ; i = 0)
              {
                if (i == 0)
                  break label754;
                ab.i("MicroMsg.VoipExtension", "recv voip invite delay");
                b.cIj().ad(((o.a)localObject3).sQS, ((o.a)localObject3).sQT);
                parama = null;
                AppMethodBeat.o(4456);
                break;
              }
              if (((o.a)localObject3).cJi())
              {
                ab.i("MicroMsg.VoipExtension", "receive invite busy message");
                ((bi)localObject1).eI(0L);
              }
              else
              {
                parama = null;
                AppMethodBeat.o(4456);
                break;
              }
            }
          }
        }
      ((bi)localObject1).setType(localcm.nao);
      if (((o.a)localObject3).cJh())
      {
        localObject2 = bi.xZc;
        ((bi)localObject1).setContent((String)localObject2);
        ((bi)localObject1).hO(0);
        ((bi)localObject1).ju(str1);
        if (localcm.jBT <= 3)
          break label1035;
        i = localcm.jBT;
        ((bi)localObject1).setStatus(i);
        if (!((o.a)localObject3).cJi())
          break label1041;
        ((bi)localObject1).ix(ah.getContext().getString(2131304351));
        bf.a((bi)localObject1, parama);
        ab.d("MicroMsg.VoipExtension", "voipMessage==null: %b", new Object[] { localObject3 });
        if (((cy)localObject1).field_msgId != 0L)
          break label1097;
        if (localObject3 != null)
          break label1135;
        parama = new o.a();
        parama.parse(str2);
      }
      while (true)
      {
        ab.d("MicroMsg.VoipExtension", "add or update msg, roomid: %s", new Object[] { Integer.valueOf(parama.sQS) });
        if (b.cIj().sSU.get(Integer.valueOf(parama.sQS)) == null)
        {
          ((bi)localObject1).setMsgId(bf.l((bi)localObject1));
          b.cIj().sSU.put(Integer.valueOf(parama.sQS), Long.valueOf(((cy)localObject1).field_msgId));
        }
        for (parama = new e.b((bi)localObject1, true); ; parama = new e.b((bi)localObject1, false))
        {
          AppMethodBeat.o(4456);
          break;
          localObject2 = bi.xZb;
          break label812;
          i = 3;
          break label845;
          ((bi)localObject1).ix(null);
          break label874;
          ((j)g.K(j.class)).bOr().a(((Long)b.cIj().sSU.get(Integer.valueOf(parama.sQS))).longValue(), (bi)localObject1);
          break label1007;
          ((j)g.K(j.class)).bOr().b(localcm.ptF, (bi)localObject1);
        }
        parama = (e.a)localObject3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.o
 * JD-Core Version:    0.6.2
 */