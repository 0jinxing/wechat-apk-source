package com.tencent.mm.plugin.account.friend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1$1
  implements g.a
{
  e$1$1(e.1 param1)
  {
  }

  public final void e(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(108587);
    paramString = ((ap)((a)g.M(a.class)).getQQListStg()).ge(p.cB(paramString));
    if (paramString != null)
    {
      paramString.frT = 2;
      ab.d("MicroMsg.QQFriendAdapter", "qq friend onSendInviteEmail:%s", new Object[] { paramString.toString() });
      ((ap)((a)g.M(a.class)).getQQListStg()).a(paramString.gwC, paramString);
      this.gxK.gxJ.KC();
      AppMethodBeat.o(108587);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.QQFriendAdapter", "cpan qq friedn is null. qq:%s", new Object[] { paramString });
      AppMethodBeat.o(108587);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.e.1.1
 * JD-Core Version:    0.6.2
 */