package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class GoogleFriendUI$3
  implements a.a
{
  GoogleFriendUI$3(GoogleFriendUI paramGoogleFriendUI)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(13652);
    ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "MicroMsg.AddContact ok:%b hasSentVerify:%b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if ((paramBoolean1) || (paramBoolean2))
    {
      ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString2 });
      ((o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).aj(paramString2, 1);
    }
    while (true)
    {
      GoogleFriendUI.a(this.gtp).KC();
      AppMethodBeat.o(13652);
      return;
      ((o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).aj(paramString2, 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.3
 * JD-Core Version:    0.6.2
 */