package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;

final class FindMoreFriendsUI$18
  implements Runnable
{
  FindMoreFriendsUI$18(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29234);
    FindMoreFriendsUI.a(this.yhB, r.YD());
    FindMoreFriendsUI.b(this.yhB, r.YK());
    FindMoreFriendsUI.a(this.yhB, r.YE());
    long l = System.currentTimeMillis();
    FindMoreFriendsUI.y(this.yhB);
    ab.i("MicroMsg.FindMoreFriendsUI", "[updateStatus] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(29234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.18
 * JD-Core Version:    0.6.2
 */