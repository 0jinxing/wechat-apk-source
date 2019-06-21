package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;

public class SettingsChattingUI extends MMPreference
{
  private f ehK;
  private boolean isDeleteCancel = false;
  private ProgressDialog qlZ = null;

  public final int JC()
  {
    return 2131165281;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(127219);
    paramf = paramPreference.mKey;
    int i = -1;
    boolean bool3;
    switch (paramf.hashCode())
    {
    default:
      switch (i)
      {
      default:
        AppMethodBeat.o(127219);
        bool3 = false;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      break;
    case -1439483675:
    case 624882802:
    case -1565531065:
    case -1776646462:
    case 1789437336:
    case -1550690765:
    case -409015247:
    }
    while (true)
    {
      return bool3;
      if (!paramf.equals("settings_voice_play_mode"))
        break;
      i = 0;
      break;
      if (!paramf.equals("settings_enter_button_send"))
        break;
      i = 1;
      break;
      if (!paramf.equals("settings_bak_chat"))
        break;
      i = 2;
      break;
      if (!paramf.equals("settings_chatting_bg"))
        break;
      i = 3;
      break;
      if (!paramf.equals("settings_emoji_manager"))
        break;
      i = 4;
      break;
      if (!paramf.equals("settings_reset"))
        break;
      i = 5;
      break;
      if (!paramf.equals("settings_recovery"))
        break;
      i = 6;
      break;
      boolean bool4 = ((Boolean)g.RP().Ry().get(26, Boolean.FALSE)).booleanValue();
      if (!bool4);
      for (bool3 = true; ; bool3 = false)
      {
        ab.d("MicroMsg.SettingsChattingUI", "set voice mode from %B to %B", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool3) });
        paramf = g.RP().Ry();
        bool3 = bool1;
        if (!bool4)
          bool3 = true;
        paramf.set(26, Boolean.valueOf(bool3));
        AppMethodBeat.o(127219);
        bool3 = bool2;
        break;
      }
      paramf = (CheckBoxPreference)this.ehK.aqO("settings_enter_button_send");
      if (paramf != null)
      {
        bool3 = paramf.isChecked();
        ab.d("MicroMsg.SettingsChattingUI", "set enter button send : %s", new Object[] { Boolean.valueOf(bool3) });
        g.RP().Ry().set(66832, Boolean.valueOf(bool3));
      }
      AppMethodBeat.o(127219);
      bool3 = bool2;
      continue;
      paramf = new Intent().setClassName(this.mController.ylL, "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI");
      MMWizardActivity.J(this.mController.ylL, paramf);
      AppMethodBeat.o(127219);
      bool3 = bool2;
      continue;
      paramf = new Intent();
      paramf.setClass(this, SettingsChattingBackgroundUI.class);
      this.mController.ylL.startActivity(paramf);
      AppMethodBeat.o(127219);
      bool3 = bool2;
      continue;
      paramf = new Intent();
      paramf.putExtra("10931", 2);
      d.b(this.mController.ylL, "emoji", ".ui.EmojiMineUI", paramf);
      AppMethodBeat.o(127219);
      bool3 = bool2;
      continue;
      h.d(this.mController.ylL, getResources().getString(2131303235), "", getString(2131296871), getString(2131296868), new SettingsChattingUI.2(this), null);
      AppMethodBeat.o(127219);
      bool3 = bool2;
      continue;
      paramf = new Intent().setClassName(this.mController.ylL, "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
      paramf.putExtra("scene", 1);
      this.mController.ylL.startActivity(paramf);
      AppMethodBeat.o(127219);
      bool3 = bool2;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127217);
    setMMTitle(2131303060);
    this.ehK = this.yCw;
    if (g.RP().Ry().getInt(89, 0) != 2)
      this.ehK.aqP("settings_recovery");
    setBackBtn(new SettingsChattingUI.1(this));
    AppMethodBeat.o(127217);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127216);
    super.onCreate(paramBundle);
    if (!g.RN().QY())
    {
      finish();
      AppMethodBeat.o(127216);
    }
    while (true)
    {
      return;
      initView();
      AppMethodBeat.o(127216);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(127218);
    super.onResume();
    Object localObject = (CheckBoxPreference)this.ehK.aqO("settings_voice_play_mode");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).uOT = ((Boolean)g.RP().Ry().get(26, Boolean.FALSE)).booleanValue();
      ((Preference)localObject).yDf = false;
    }
    localObject = (CheckBoxPreference)this.ehK.aqO("settings_enter_button_send");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).uOT = ((Boolean)g.RP().Ry().get(66832, Boolean.FALSE)).booleanValue();
      ((Preference)localObject).yDf = false;
    }
    localObject = this.ehK.aqO("settings_text_size");
    if (localObject != null)
      ((Preference)localObject).setSummary(getString(SetTextSizeUI.eN(this)));
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(127218);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI
 * JD-Core Version:    0.6.2
 */