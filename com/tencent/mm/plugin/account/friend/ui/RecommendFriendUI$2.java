package com.tencent.mm.plugin.account.friend.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class RecommendFriendUI$2
  implements MenuItem.OnMenuItemClickListener
{
  RecommendFriendUI$2(RecommendFriendUI paramRecommendFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(108629);
    int i = RecommendFriendUI.b(this.gye).aqw().length;
    h.a(this.gye.mController.ylL, this.gye.mController.ylL.getResources().getQuantityString(2131361808, i, new Object[] { Integer.valueOf(i) }), this.gye.getString(2131297061), new RecommendFriendUI.2.1(this), new RecommendFriendUI.2.2(this));
    AppMethodBeat.o(108629);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.2
 * JD-Core Version:    0.6.2
 */