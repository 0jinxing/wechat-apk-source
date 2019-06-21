package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jb;
import com.tencent.mm.pluginsdk.c.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.h;

final class FindMoreFriendsUI$20 extends a
{
  FindMoreFriendsUI$20(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void j(b paramb)
  {
    AppMethodBeat.i(29236);
    ab.d("MicroMsg.FindMoreFriendsUI", "onMStorageNotifyEvent, %s ", new Object[] { paramb });
    if ((paramb instanceof jb))
    {
      FindMoreFriendsUI.e(this.yhB);
      if (FindMoreFriendsUI.a(this.yhB) != null)
        FindMoreFriendsUI.a(this.yhB).notifyDataSetChanged();
    }
    AppMethodBeat.o(29236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.20
 * JD-Core Version:    0.6.2
 */