package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareImageRedirectUI$2
  implements DialogInterface.OnClickListener
{
  ShareImageRedirectUI$2(ShareImageRedirectUI paramShareImageRedirectUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34929);
    this.zHp.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    this.zHp.finish();
    AppMethodBeat.o(34929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImageRedirectUI.2
 * JD-Core Version:    0.6.2
 */