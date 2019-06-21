package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.a.je;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.z;

public final class b
  implements e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(27234);
    cm localcm = parama.eAB;
    if ((localcm == null) || (localcm.nao != 47))
    {
      ab.f("MicroMsg.EmojiExtension", "parseEmojiMsg failed, invalid cmdAM");
      AppMethodBeat.o(27234);
      return null;
    }
    Object localObject1 = aa.a(localcm.vEB);
    Object localObject2 = aa.a(localcm.vEC);
    aw.ZK();
    if (((String)c.Ry().get(2, null)).equals(localObject1))
    {
      localObject1 = localObject2;
      label81: localObject2 = aa.a(localcm.vED);
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a((String)localObject1, (String)localObject2, localcm.ptF, localcm.vEG, parama);
      localObject1 = com.tencent.mm.model.bf.oE(localcm.vEG);
      if (localObject1 != null)
      {
        ab.i("MicroMsg.EmojiExtension", "bizClientMsgId = %s", new Object[] { ((bf.b)localObject1).fmt });
        if ((((bf.b)localObject1).fmx != null) && (((bf.b)localObject1).scene == 1))
        {
          parama = aa.a(localcm.vEB);
          aw.ZK();
          c.Ry().set(73729, Integer.valueOf(1));
          localObject2 = new com.tencent.mm.storage.bf();
          ((com.tencent.mm.storage.bf)localObject2).field_content = ah.getContext().getString(2131301646);
          ((com.tencent.mm.storage.bf)localObject2).field_createtime = bo.anT();
          ((com.tencent.mm.storage.bf)localObject2).field_imgpath = "";
          ((com.tencent.mm.storage.bf)localObject2).field_sayhicontent = ((com.tencent.mm.storage.bf)localObject2).field_content;
          ((com.tencent.mm.storage.bf)localObject2).field_sayhiuser = parama;
          ((com.tencent.mm.storage.bf)localObject2).field_scene = 18;
          if (localcm.jBT <= 3)
            break label361;
        }
      }
    }
    label361: for (int i = localcm.jBT; ; i = 3)
    {
      ((com.tencent.mm.storage.bf)localObject2).field_status = i;
      ((com.tencent.mm.storage.bf)localObject2).field_svrid = localcm.ptF;
      ((com.tencent.mm.storage.bf)localObject2).field_talker = parama;
      ((com.tencent.mm.storage.bf)localObject2).field_type = localcm.nao;
      ((com.tencent.mm.storage.bf)localObject2).field_isSend = 0;
      ((com.tencent.mm.storage.bf)localObject2).field_sayhiencryptuser = parama;
      ((com.tencent.mm.storage.bf)localObject2).field_ticket = ((bf.b)localObject1).fmx;
      com.tencent.mm.bi.d.akQ().a((com.tencent.mm.storage.bf)localObject2);
      localObject1 = new je();
      ((je)localObject1).cEq.cEr = parama;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      AppMethodBeat.o(27234);
      break;
      break label81;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.b
 * JD-Core Version:    0.6.2
 */