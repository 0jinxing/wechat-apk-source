package com.tencent.mm.pluginsdk.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppChooserUI$3
  implements DialogInterface.OnClickListener
{
  AppChooserUI$3(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125856);
    if ((AppChooserUI.c(this.vty) != null) && (AppChooserUI.c(this.vty).vtC != null))
      AppChooserUI.a(this.vty, AppChooserUI.c(this.vty).vtC.activityInfo.packageName, false);
    AppMethodBeat.o(125856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.3
 * JD-Core Version:    0.6.2
 */