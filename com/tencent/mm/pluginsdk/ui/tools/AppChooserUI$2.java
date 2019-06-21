package com.tencent.mm.pluginsdk.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class AppChooserUI$2
  implements DialogInterface.OnClickListener
{
  AppChooserUI$2(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125855);
    if ((AppChooserUI.c(this.vty) != null) && (AppChooserUI.c(this.vty).vtC != null))
    {
      g.RP().Ry().set(AppChooserUI.a(this.vty, 274528), AppChooserUI.c(this.vty).vtC.activityInfo.packageName);
      AppChooserUI.a(this.vty, AppChooserUI.c(this.vty).vtC.activityInfo.packageName, true);
    }
    AppMethodBeat.o(125855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.2
 * JD-Core Version:    0.6.2
 */