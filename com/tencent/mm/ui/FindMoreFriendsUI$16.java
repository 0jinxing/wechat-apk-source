package com.tencent.mm.ui;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FindMoreFriendsUI$16
  implements Runnable
{
  FindMoreFriendsUI$16(FindMoreFriendsUI paramFindMoreFriendsUI, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29232);
    this.yhM.setVisibility(8);
    this.yhM.startAnimation(AnimationUtils.loadAnimation(this.yhB.getContext(), 2131034181));
    AppMethodBeat.o(29232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.16
 * JD-Core Version:    0.6.2
 */