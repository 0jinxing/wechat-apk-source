package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AddMoreFriendsUI$3
  implements View.OnClickListener
{
  AddMoreFriendsUI$3(AddMoreFriendsUI paramAddMoreFriendsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25506);
    Intent localIntent = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
    paramView = null;
    if (Build.VERSION.SDK_INT >= 21)
      paramView = ActivityOptions.makeSceneTransitionAnimation(this.svf, new Pair[0]).toBundle();
    d.b(this.svf.mController.ylL, ".ui.FTSAddFriendUI", localIntent, paramView);
    AppMethodBeat.o(25506);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI.3
 * JD-Core Version:    0.6.2
 */