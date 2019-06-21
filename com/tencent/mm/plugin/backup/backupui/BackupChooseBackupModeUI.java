package com.tencent.mm.plugin.backup.backupui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.backup.backupmoveui.BackupUI;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(3)
public class BackupChooseBackupModeUI extends MMPreference
{
  private f ehK;

  public final int JC()
  {
    return 2131165195;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(17724);
    if (paramPreference.mKey.equals("backup_move_to_device"))
    {
      MMWizardActivity.J(this, new Intent(this.mController.ylL, BackupUI.class));
      AppMethodBeat.o(17724);
    }
    while (true)
    {
      return bool;
      if (paramPreference.mKey.equals("backup_to_pc"))
      {
        paramf = new Intent();
        paramf.putExtra("title", getString(2131297285));
        paramf.putExtra("rawUrl", getString(2131305825, new Object[] { aa.dor() }));
        paramf.putExtra("showShare", false);
        paramf.putExtra("neverGetA8Key", true);
        d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        AppMethodBeat.o(17724);
      }
      else
      {
        AppMethodBeat.o(17724);
        bool = false;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17723);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    setMMTitle(2131297364);
    setBackBtn(new BackupChooseBackupModeUI.1(this));
    AppMethodBeat.o(17723);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17725);
    ab.d("MicroMsg.BackupChooseBackupModeUI", "BackupChooseBackupModeUI onDestroy.");
    super.onDestroy();
    b.aSZ().aTd().cancel();
    com.tencent.mm.plugin.backup.d.a locala = b.aSZ().aTd();
    ab.i("MicroMsg.BackupMoveChooseServer", "clearChooseData");
    locala.jsV = null;
    locala.jsX = null;
    locala.jsW = null;
    locala.jsZ = false;
    locala.jsY = false;
    AppMethodBeat.o(17725);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI
 * JD-Core Version:    0.6.2
 */