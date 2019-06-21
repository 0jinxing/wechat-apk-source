package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.aa;

final class RecommendFriendUI$5
  implements DialogInterface.OnCancelListener
{
  RecommendFriendUI$5(RecommendFriendUI paramRecommendFriendUI, aa paramaa)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(108632);
    g.Rg().c(this.gyg);
    this.gye.finish();
    AppMethodBeat.o(108632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.5
 * JD-Core Version:    0.6.2
 */