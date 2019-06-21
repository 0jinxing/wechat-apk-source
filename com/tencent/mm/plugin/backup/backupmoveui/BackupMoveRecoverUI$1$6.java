package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupMoveRecoverUI$1$6
  implements View.OnClickListener
{
  BackupMoveRecoverUI$1$6(BackupMoveRecoverUI.1 param1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17365);
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      paramView = new android/content/ComponentName;
      paramView.<init>("com.android.settings", "com.android.settings.Settings$TetherSettingsActivity");
      localIntent.setComponent(paramView);
      this.jvd.jvc.startActivity(localIntent);
      AppMethodBeat.o(17365);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
      {
        ab.e("MicroMsg.BackupMoveRecoverUI", "jump to Settings$TetherSettingsActivity failed");
        this.jvd.jvc.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        AppMethodBeat.o(17365);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.6
 * JD-Core Version:    0.6.2
 */