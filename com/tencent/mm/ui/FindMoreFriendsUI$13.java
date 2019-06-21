package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.al;

final class FindMoreFriendsUI$13
  implements Runnable
{
  FindMoreFriendsUI$13(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29225);
    mz localmz = new mz();
    a.xxA.m(localmz);
    al.d(new FindMoreFriendsUI.13.1(this, localmz));
    AppMethodBeat.o(29225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.13
 * JD-Core Version:    0.6.2
 */