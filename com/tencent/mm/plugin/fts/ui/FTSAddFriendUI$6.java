package com.tencent.mm.plugin.fts.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.f;

final class FTSAddFriendUI$6
  implements DialogInterface.OnCancelListener
{
  FTSAddFriendUI$6(FTSAddFriendUI paramFTSAddFriendUI, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(61730);
    g.Rg().c(this.mIc);
    g.Rg().b(106, FTSAddFriendUI.i(this.mIb));
    FTSAddFriendUI.j(this.mIb);
    AppMethodBeat.o(61730);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.6
 * JD-Core Version:    0.6.2
 */