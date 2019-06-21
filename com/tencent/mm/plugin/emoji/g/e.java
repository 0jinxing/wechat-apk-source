package com.tencent.mm.plugin.emoji.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.a;
import java.util.Map;

public final class e
  implements bz.a
{
  public final void a(e.a parama)
  {
    AppMethodBeat.i(53163);
    parama = parama.eAB;
    if (parama.nao == 10002)
    {
      parama = aa.a(parama.vED);
      if (bo.isNullOrNil(parama))
      {
        ab.w("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "msg content is null");
        AppMethodBeat.o(53163);
      }
    }
    while (true)
    {
      return;
      Object localObject = br.z(parama, "sysmsg");
      if ((localObject != null) && (((Map)localObject).size() > 0))
      {
        localObject = (String)((Map)localObject).get(".sysmsg.$type");
        if ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).equalsIgnoreCase("NewRecommendEmotion")))
        {
          parama = d.JG(parama);
          j.getEmojiStorageMgr().xYo.duF();
          j.getEmojiStorageMgr().xYo.ak(parama);
          AppMethodBeat.o(53163);
        }
        else
        {
          ab.e("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not emoji message type :".concat(String.valueOf(localObject)));
        }
      }
      else
      {
        AppMethodBeat.o(53163);
        continue;
        ab.i("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.nao) });
        AppMethodBeat.o(53163);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.g.e
 * JD-Core Version:    0.6.2
 */