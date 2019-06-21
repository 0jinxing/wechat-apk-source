package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.h;

final class FindMoreFriendsUI$21$1
  implements Runnable
{
  FindMoreFriendsUI$21$1(FindMoreFriendsUI.21 param21)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29237);
    aw.ZK();
    c.Ry().set(68377, "");
    if (FindMoreFriendsUI.a(this.yhO.yhB) != null)
      FindMoreFriendsUI.a(this.yhO.yhB).notifyDataSetChanged();
    AppMethodBeat.o(29237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.21.1
 * JD-Core Version:    0.6.2
 */