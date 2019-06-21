package com.tencent.mm.plugin.setting.ui.fixtools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(3)
public class FixToolsUI extends MMPreference
{
  private f ehK;

  public final int JC()
  {
    return 2131165241;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(126885);
    if (paramPreference.mKey.equals("fix_tools_uplog"))
      if (com.tencent.mm.plugin.setting.model.a.cir().fPO)
      {
        MMWizardActivity.J(this, new Intent(this.mController.ylL, FixToolsUpLogUploadingUI.class));
        AppMethodBeat.o(126885);
      }
    while (true)
    {
      return bool;
      paramf = new Intent(this.mController.ylL, FixToolsUplogUI.class);
      paramf.putExtra("entry_fix_tools_uplog", 9);
      MMWizardActivity.J(this, paramf);
      break;
      if (paramPreference.mKey.equals("fix_tools_db_recover"))
      {
        paramf = new Intent().setClassName(this.mController.ylL, "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
        paramf.putExtra("scene", 2);
        this.mController.ylL.startActivity(paramf);
        AppMethodBeat.o(126885);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(126885);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126884);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    setMMTitle(2131299885);
    SettingsAboutMMHeaderPreference localSettingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference)this.ehK.aqO("fix_tools_micromsg_header");
    String str = g.ar(this.mController.ylL, d.vxo);
    paramBundle = str;
    if (d.vxr)
      paramBundle = str + " " + getString(2131296513);
    localSettingsAboutMMHeaderPreference.qlS = paramBundle;
    int i = getIntent().getIntExtra("entry_fix_tools", 2);
    h.pYm.a(873L, i, 1L, false);
    h.pYm.a(873L, 0L, 1L, false);
    setBackBtn(new FixToolsUI.1(this));
    AppMethodBeat.o(126884);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI
 * JD-Core Version:    0.6.2
 */