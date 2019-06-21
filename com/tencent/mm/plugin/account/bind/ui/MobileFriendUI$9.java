package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class MobileFriendUI$9
  implements DialogInterface.OnCancelListener
{
  MobileFriendUI$9(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13727);
    if (MobileFriendUI.a(this.gtZ) != null)
      g.Rg().c(MobileFriendUI.a(this.gtZ));
    AppMethodBeat.o(13727);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.9
 * JD-Core Version:    0.6.2
 */