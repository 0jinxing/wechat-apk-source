package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;

final class FindMoreFriendsUI$17
  implements Runnable
{
  FindMoreFriendsUI$17(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29233);
    ab.i("MicroMsg.FindMoreFriendsUI", "status %d (%d), extStatus %d (%d), pluginFlag %d (%d)", new Object[] { Integer.valueOf(FindMoreFriendsUI.v(this.yhB)), Integer.valueOf(r.YD()), Long.valueOf(FindMoreFriendsUI.w(this.yhB)), Long.valueOf(r.YE()), Integer.valueOf(FindMoreFriendsUI.x(this.yhB)), Integer.valueOf(r.YK()) });
    FindMoreFriendsUI.a(this.yhB, r.YE());
    FindMoreFriendsUI.a(this.yhB, r.YD());
    FindMoreFriendsUI.b(this.yhB, r.YK());
    FindMoreFriendsUI.y(this.yhB);
    AppMethodBeat.o(29233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.17
 * JD-Core Version:    0.6.2
 */