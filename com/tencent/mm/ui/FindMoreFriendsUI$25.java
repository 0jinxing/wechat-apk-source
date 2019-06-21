package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.pluginsdk.c.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.base.preference.h;

final class FindMoreFriendsUI$25 extends a
{
  FindMoreFriendsUI$25(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void j(b paramb)
  {
    AppMethodBeat.i(29245);
    if ((paramb instanceof qm))
    {
      FindMoreFriendsUI.h(this.yhB);
      FindMoreFriendsUI.a(this.yhB).notifyDataSetChanged();
    }
    AppMethodBeat.o(29245);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.25
 * JD-Core Version:    0.6.2
 */