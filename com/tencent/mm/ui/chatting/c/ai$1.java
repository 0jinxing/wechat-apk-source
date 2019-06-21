package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.setting.model.j;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bs;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.o;
import java.util.HashMap;
import java.util.LinkedList;

final class ai$1
  implements Runnable
{
  ai$1(ai paramai, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31681);
    if (this.yRT.cgL == null)
    {
      ab.w("MicroMsg.ChattingUI.SendTextComponent", "NULL == mChattingContext");
      AppMethodBeat.o(31681);
    }
    Object localObject;
    String str1;
    int i;
    String str2;
    String str3;
    while (true)
    {
      return;
      g.BN(20);
      if (ai.a(this.yRT))
      {
        this.yRT.cgL.dFu();
        localObject = new com.tencent.mm.ap.a(this.yRT.cgL.sRl.field_username, this.bOC);
        aw.Rg().a((m)localObject, 0);
        AppMethodBeat.o(31681);
      }
      else
      {
        if ((((com.tencent.mm.ui.chatting.c.b.h)this.yRT.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).getCount() == 0) && (ad.aow(this.yRT.cgL.getTalkerUserName())))
          bv.aaq().c(10076, new Object[] { Integer.valueOf(1) });
        str1 = this.yRT.cgL.getTalkerUserName();
        i = com.tencent.mm.model.t.nK(str1);
        str2 = this.bOC;
        str3 = ((com.tencent.mm.ui.chatting.c.b.t)this.yRT.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).aro(str1);
        if (!bo.isNullOrNil(str3))
          break;
        ab.w("MicroMsg.ChattingUI.SendTextComponent", "tempUser is null");
        AppMethodBeat.o(31681);
      }
    }
    o localo = (o)this.yRT.cgL.aF(o.class);
    int j = str2.lastIndexOf(' ');
    if ((j > 0) && (j == str2.length() - 1))
    {
      localObject = str2.substring(0, j);
      ab.w("MicroMsg.ChattingUI.SendTextComponent", "delete @ last char! index:".concat(String.valueOf(j)));
    }
    while (true)
    {
      ChatFooter localChatFooter = localo.dDX();
      j = this.bVn;
      if (localChatFooter.vna.vof.containsKey(str1))
        if (((LinkedList)localChatFooter.vna.vof.get(str1)).size() > 0)
          j = 291;
      while (true)
      {
        localObject = new com.tencent.mm.modelmulti.h(str3, (String)localObject, i, j, localo.dDX().hJ(str1, str2));
        ((com.tencent.mm.ui.chatting.c.b.t)this.yRT.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).g((com.tencent.mm.modelmulti.h)localObject);
        aw.Rg().a((m)localObject, 0);
        if (com.tencent.mm.model.t.nG(str1))
        {
          localObject = new j(q.Mc(), this.bOC + " key " + bs.dut() + " local key " + bs.dus() + "NetType:" + at.getNetTypeString(this.yRT.cgL.yTx.getContext().getApplicationContext()) + " hasNeon: " + n.LC() + " isArmv6: " + n.LE() + " isArmv7: " + n.LD());
          aw.Rg().a((m)localObject, 0);
        }
        AppMethodBeat.o(31681);
        break;
      }
      localObject = str2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ai.1
 * JD-Core Version:    0.6.2
 */