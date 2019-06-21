package com.tencent.mm.plugin.subapp.ui.friend;

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

final class FMessageConversationUI$2
  implements View.OnClickListener
{
  FMessageConversationUI$2(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25359);
    Intent localIntent = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
    paramView = null;
    if (Build.VERSION.SDK_INT >= 21)
      paramView = ActivityOptions.makeSceneTransitionAnimation(this.stR, new Pair[0]).toBundle();
    d.b(this.stR.mController.ylL, ".ui.FTSAddFriendUI", localIntent, paramView);
    AppMethodBeat.o(25359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI.2
 * JD-Core Version:    0.6.2
 */