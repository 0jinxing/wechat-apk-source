package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.plugin.card.sharecard.a.c;
import com.tencent.mm.plugin.card.sharecard.a.c.a;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class am$7$1
  implements Runnable
{
  am$7$1(am.7 param7, String paramString, e.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87940);
    Object localObject1 = am.bbg();
    Object localObject2 = this.gUV;
    ab.i("MicroMsg.ShareCardMsgMgr", "sharecard onReceiveMsg msgId is ".concat(String.valueOf(this.fkt.eAB.ptF)));
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject2 = br.z((String)localObject2, "sysmsg");
      if (localObject2 == null)
      {
        localObject1 = null;
        if (localObject1 != null)
          break label174;
        ab.e("MicroMsg.ShareCardMsgMgr", "card msg == null");
        AppMethodBeat.o(87940);
      }
    }
    while (true)
    {
      return;
      localObject1 = new c.a((c)localObject1);
      String str = (String)((Map)localObject2).get(".sysmsg.notifysharecard.state_flag");
      if ((!TextUtils.isEmpty(str)) && (l.isNumeric(str)));
      for (((c.a)localObject1).kfy = Integer.valueOf(str).intValue(); ; ((c.a)localObject1).kfy = 0)
      {
        ((c.a)localObject1).username = ((String)((Map)localObject2).get(".sysmsg.notifysharecard.username"));
        ((c.a)localObject1).cMC = ((String)((Map)localObject2).get(".sysmsg.notifysharecard.card_id"));
        break;
      }
      label174: if (TextUtils.isEmpty(((c.a)localObject1).cMC))
        ab.e("MicroMsg.ShareCardMsgMgr", "card id == null");
      ab.i("MicroMsg.ShareCardMsgMgr", "sharecard doSyncNetScene card id is " + ((c.a)localObject1).cMC);
      am.bbd().bbr();
      l.beD();
      AppMethodBeat.o(87940);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.am.7.1
 * JD-Core Version:    0.6.2
 */