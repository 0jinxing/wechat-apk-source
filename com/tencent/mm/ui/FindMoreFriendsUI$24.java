package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gy;
import com.tencent.mm.pluginsdk.c.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.base.preference.h;

final class FindMoreFriendsUI$24 extends a
{
  FindMoreFriendsUI$24(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void j(b paramb)
  {
    AppMethodBeat.i(29244);
    if ((paramb instanceof gy))
    {
      FindMoreFriendsUI.g(this.yhB);
      FindMoreFriendsUI.a(this.yhB).notifyDataSetChanged();
    }
    AppMethodBeat.o(29244);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.24
 * JD-Core Version:    0.6.2
 */