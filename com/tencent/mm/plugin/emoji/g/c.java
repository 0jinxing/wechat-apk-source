package com.tencent.mm.plugin.emoji.g;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.emoji.f.k;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import java.util.Map;

public final class c
  implements bz.a
{
  public static void a(a parama)
  {
    AppMethodBeat.i(53161);
    if (parama == null)
    {
      ab.w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "xml is null.");
      AppMethodBeat.o(53161);
    }
    while (true)
    {
      return;
      if (parama.kXf > 0)
      {
        g.RP().Ry().set(208899, Boolean.TRUE);
        com.tencent.mm.x.c.PK().x(262147, true);
      }
      if (parama.kXg > 0)
      {
        g.RP().Ry().set(208913, Boolean.TRUE);
        com.tencent.mm.x.c.PK().x(262149, true);
      }
      if (!bo.isNullOrNil(parama.thumburl))
      {
        ab.d("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "Thumb URL %s", new Object[] { parama.thumburl });
        g.RP().Ry().set(229633, parama.thumburl);
        g.RP().Ry().set(229634, System.currentTimeMillis());
        AppMethodBeat.o(53161);
      }
      else
      {
        g.RP().Ry().set(229633, "");
        g.RP().Ry().set(229634, "");
        AppMethodBeat.o(53161);
      }
    }
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(53160);
    parama = parama.eAB;
    String str1;
    if (parama.nao == 10002)
    {
      parama = aa.a(parama.vED);
      if (bo.isNullOrNil(parama))
      {
        ab.w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "msg content is null");
        AppMethodBeat.o(53160);
        return;
      }
      parama = br.z(parama, "sysmsg");
      if ((parama != null) && (parama.size() > 0))
      {
        str1 = (String)parama.get(".sysmsg.$type");
        if ((bo.isNullOrNil(str1)) || (!str1.equalsIgnoreCase("emotionstore")));
      }
    }
    while (true)
    {
      try
      {
        str1 = (String)parama.get(".sysmsg.emotionstore.productid");
        Object localObject1 = (String)parama.get(".sysmsg.emotionstore.newcount");
        String str2 = (String)parama.get(".sysmsg.emotionstore.freecount");
        Object localObject2 = (String)parama.get(".sysmsg.emotionstore.thumburl");
        if (bo.isNullOrNil((String)localObject1))
          break label431;
        i = Integer.valueOf((String)localObject1).intValue();
        if (TextUtils.isEmpty(str2))
          break label425;
        j = Integer.valueOf(str2).intValue();
        localObject1 = new com/tencent/mm/plugin/emoji/g/c$a;
        ((a)localObject1).<init>(this, i, j, (String)localObject2, str1);
        if (!bo.isNullOrNil(str1))
        {
          ab.i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "new xml productid is %s. now try to get download flag", new Object[] { str1 });
          localObject2 = new com/tencent/mm/plugin/emoji/f/k;
          ((k)localObject2).<init>(str1, (a)localObject1);
          g.RO().eJo.a((m)localObject2, 0);
          str1 = (String)parama.get(".sysmsg.personalemotion.newcount");
          if ((!bo.isNullOrNil(str1)) && (Integer.valueOf(str1).intValue() > 0))
            g.RP().Ry().set(ac.a.xJj, Boolean.TRUE);
          parama = (String)parama.get(".sysmsg.personalemoji.emojicount");
          if ((!bo.isNullOrNil(parama)) && (Integer.valueOf(parama).intValue() > 0))
            g.RP().Ry().set(ac.a.xJn, Boolean.TRUE);
          AppMethodBeat.o(53160);
          break;
        }
        a((a)localObject1);
        continue;
      }
      catch (Exception parama)
      {
        ab.e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "onRecieveMsg:%s", new Object[] { bo.l(parama) });
        AppMethodBeat.o(53160);
      }
      break;
      ab.e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not emoji message type :".concat(String.valueOf(str1)));
      AppMethodBeat.o(53160);
      break;
      ab.i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.nao) });
      AppMethodBeat.o(53160);
      break;
      label425: int j = 0;
      continue;
      label431: int i = 0;
    }
  }

  public final class a
  {
    private String cud;
    int kXf;
    int kXg;
    String thumburl;

    public a(int paramInt1, int paramString1, String paramString2, String arg5)
    {
      this.kXf = paramInt1;
      this.kXg = paramString1;
      this.thumburl = paramString2;
      Object localObject;
      this.cud = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.g.c
 * JD-Core Version:    0.6.2
 */