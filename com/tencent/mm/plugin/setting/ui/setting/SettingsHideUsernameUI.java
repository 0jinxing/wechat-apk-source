package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsHideUsernameUI extends MMPreference
{
  private f ehK;
  private boolean imK;
  private long kFU;
  private int qmL;
  private CheckBoxPreference qnm;
  private String username;

  private void ciO()
  {
    AppMethodBeat.i(127234);
    if (this.imK)
    {
      this.qnm.setSummary(getString(2131303256));
      AppMethodBeat.o(127234);
    }
    while (true)
    {
      return;
      if (this.qnm.isEnabled())
      {
        this.qnm.setSummary(getString(2131303254));
        AppMethodBeat.o(127234);
      }
      else
      {
        this.qnm.setSummary(getString(2131303255));
        AppMethodBeat.o(127234);
      }
    }
  }

  public final int JC()
  {
    return 2131165275;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(127233);
    if (paramPreference.mKey.equals("settings_show_username"))
    {
      if (!((CheckBoxPreference)paramPreference).isChecked())
        bool2 = true;
      this.imK = bool2;
      ciO();
      AppMethodBeat.o(127233);
    }
    for (bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      AppMethodBeat.o(127233);
    }
  }

  public final void initView()
  {
    boolean bool1 = true;
    AppMethodBeat.i(127232);
    setMMTitle(2131303337);
    this.ehK.aqO("settings_my_username").setSummary(this.username);
    CheckBoxPreference localCheckBoxPreference;
    if ((this.kFU & 0x4000) != 0L)
    {
      bool2 = true;
      this.imK = bool2;
      ab.d("MicroMsg.SettingsHideUsernameUI", "is hide: %s", new Object[] { Boolean.valueOf(bool2) });
      this.qnm = ((CheckBoxPreference)this.ehK.aqO("settings_show_username"));
      this.qnm.yDf = false;
      localCheckBoxPreference = this.qnm;
      if (bool2)
        break label148;
    }
    label148: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localCheckBoxPreference.uOT = bool2;
      if (bo.isNullOrNil(r.YB()))
        this.qnm.setEnabled(false);
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127232);
      return;
      bool2 = false;
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127231);
    super.onCreate(paramBundle);
    this.username = r.YA();
    if (bo.isNullOrNil(this.username))
      this.username = r.Yz();
    this.ehK = this.yCw;
    this.kFU = r.YE();
    this.qmL = r.YF();
    initView();
    setBackBtn(new SettingsHideUsernameUI.1(this));
    AppMethodBeat.o(127231);
  }

  public void onPause()
  {
    int i = 0;
    int j = 1;
    AppMethodBeat.i(127236);
    super.onPause();
    ab.d("MicroMsg.SettingsHideUsernameUI", "hide: %s", new Object[] { Boolean.valueOf(this.imK) });
    if ((this.kFU & 0x4000) != 0L)
      i = 1;
    if (i != this.imK)
    {
      if (!this.imK)
        break label194;
      this.kFU |= 16384L;
    }
    for (this.qmL |= 512; ; this.qmL &= -513)
    {
      g.RQ();
      g.RP().Ry().set(147457, Long.valueOf(this.kFU));
      g.RQ();
      g.RP().Ry().set(40, Integer.valueOf(this.qmL));
      act localact = new act();
      localact.wkw = 46;
      if (this.imK)
        j = 2;
      localact.pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, localact));
      AppMethodBeat.o(127236);
      return;
      label194: this.kFU &= -16385L;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(127235);
    super.onResume();
    ciO();
    AppMethodBeat.o(127235);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsHideUsernameUI
 * JD-Core Version:    0.6.2
 */