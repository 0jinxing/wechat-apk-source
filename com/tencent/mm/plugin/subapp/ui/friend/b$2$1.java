package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;

final class b$2$1
  implements a.a
{
  b$2$1(b.2 param2, com.tencent.mm.pluginsdk.ui.preference.b paramb, ad paramad)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(25346);
    if (paramBoolean1)
    {
      com.tencent.mm.model.aw.ZK();
      paramString2 = c.XM().aoO(this.stA.username);
      paramString1 = paramString2;
      if ((int)paramString2.ewQ == 0)
      {
        paramString2 = this.stB;
        com.tencent.mm.model.aw.ZK();
        paramString1 = paramString2;
        if (!c.XM().Z(paramString2))
        {
          ab.e("MicroMsg.FMessageConversationUI", "canAddContact fail, insert fail");
          AppMethodBeat.o(25346);
        }
      }
    }
    while (true)
    {
      return;
      t.q(paramString1);
      d.akP().ep(this.stA.username, 1);
      h.bQ(b.a(this.stC.stz), b.a(this.stC.stz).getString(2131296524));
      b.a(this.stC.stz, this.stA.username);
      while (true)
      {
        this.stC.stz.notifyDataSetChanged();
        AppMethodBeat.o(25346);
        break;
        if (!paramBoolean2)
          break label189;
        d.akP().ep(this.stA.username, 2);
      }
      label189: ab.e("MicroMsg.FMessageConversationUI", "canAddContact fail, username = " + this.stA.username);
      AppMethodBeat.o(25346);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.b.2.1
 * JD-Core Version:    0.6.2
 */