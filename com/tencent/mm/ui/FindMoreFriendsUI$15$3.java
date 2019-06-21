package com.tencent.mm.ui;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.IconPreference;

final class FindMoreFriendsUI$15$3
  implements Runnable
{
  FindMoreFriendsUI$15$3(FindMoreFriendsUI.15 param15, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29229);
    FindMoreFriendsUI.a(this.yhL.yhB, true);
    IconPreference localIconPreference = (IconPreference)FindMoreFriendsUI.a(this.yhL.yhB).aqO("more_tab_game_recommend");
    if (this.yhL.yhK == 3)
    {
      localIconPreference.ey(this.yhL.yhB.getString(2131296988), 2130839673);
      FindMoreFriendsUI.b(localIconPreference, 0, 8, false, 8, 8, 8);
      FindMoreFriendsUI.c(this.yhL.val$appId, this.yhL.tCw, this.yhL.sCm, this.yhL.fkA, 1);
    }
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(858L, 12L, 1L, false);
      if (this.jbl == 2)
        com.tencent.mm.plugin.report.service.h.pYm.a(858L, 14L, 1L, false);
      AppMethodBeat.o(29229);
      return;
      if (this.yhL.yhK == 4)
      {
        localIconPreference.av(this.yhL.gUZ, -1, Color.parseColor("#8c8c8c"));
        FindMoreFriendsUI.b(localIconPreference, 8, 0, true, 8, 8, 8);
        FindMoreFriendsUI.c(this.yhL.val$appId, this.yhL.tCw, this.yhL.sCm, this.yhL.fkA, 2);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.15.3
 * JD-Core Version:    0.6.2
 */