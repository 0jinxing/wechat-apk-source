package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecommendFriendUI$6
  implements DialogInterface.OnClickListener
{
  RecommendFriendUI$6(RecommendFriendUI paramRecommendFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(108633);
    this.gye.finish();
    AppMethodBeat.o(108633);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.6
 * JD-Core Version:    0.6.2
 */