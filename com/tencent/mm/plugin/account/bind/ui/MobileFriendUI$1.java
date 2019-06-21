package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileFriendUI$1
  implements DialogInterface.OnClickListener
{
  MobileFriendUI$1(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13719);
    this.gtZ.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    this.gtZ.finish();
    AppMethodBeat.o(13719);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.1
 * JD-Core Version:    0.6.2
 */