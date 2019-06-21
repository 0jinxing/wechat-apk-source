package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.setting.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsPluginsNotifyUI extends MMPreference
{
  private f ehK;
  private int state;

  private void Cq(int paramInt)
  {
    AppMethodBeat.i(127396);
    this.state = paramInt;
    if ((this.state == 1) || (this.state == 0))
    {
      g.RP().Ry().set(8200, Boolean.TRUE);
      if (this.state == 1)
      {
        g.RP().Ry().set(8201, Integer.valueOf(22));
        g.RP().Ry().set(8208, Integer.valueOf(8));
        ((j)g.K(j.class)).XL().c(new k(true, 22, 8));
      }
    }
    while (true)
    {
      ciB();
      AppMethodBeat.o(127396);
      return;
      g.RP().Ry().set(8201, Integer.valueOf(0));
      g.RP().Ry().set(8208, Integer.valueOf(0));
      ((j)g.K(j.class)).XL().c(new k(true, 0, 0));
      continue;
      g.RP().Ry().set(8200, Boolean.FALSE);
      ((j)g.K(j.class)).XL().c(new k());
    }
  }

  private void ciB()
  {
    AppMethodBeat.i(127395);
    this.ehK.removeAll();
    Preference localPreference = new Preference(this);
    localPreference.setTitle(2131303201);
    localPreference.setKey("settings_plugings_disturb_on");
    localPreference.setLayoutResource(2130970127);
    if (this.state == 0)
    {
      localPreference.setWidgetLayoutResource(2130970197);
      this.ehK.b(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(2131303202);
      localPreference.setKey("settings_plugings_disturb_on_night");
      localPreference.setLayoutResource(2130970127);
      if (this.state != 1)
        break label221;
      localPreference.setWidgetLayoutResource(2130970197);
      label105: this.ehK.b(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(2131303200);
      localPreference.setKey("settings_plugings_disturb_off");
      localPreference.setLayoutResource(2130970127);
      if (this.state != 2)
        break label230;
      localPreference.setWidgetLayoutResource(2130970197);
    }
    while (true)
    {
      this.ehK.b(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(2131303203);
      localPreference.setLayoutResource(2130970184);
      this.ehK.b(localPreference);
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127395);
      return;
      localPreference.setWidgetLayoutResource(2130970198);
      break;
      label221: localPreference.setWidgetLayoutResource(2130970198);
      break label105;
      label230: localPreference.setWidgetLayoutResource(2130970198);
    }
  }

  private int getState()
  {
    AppMethodBeat.i(127392);
    g.RQ();
    Boolean localBoolean = Boolean.valueOf(bo.e((Boolean)g.RP().Ry().get(8200, null)));
    g.RQ();
    int i = bo.a((Integer)g.RP().Ry().get(8201, null), 22);
    g.RQ();
    int j = bo.a((Integer)g.RP().Ry().get(8208, null), 8);
    int k;
    if (localBoolean.booleanValue())
      if (i == j)
        k = 0;
    for (this.state = k; ; this.state = 2)
    {
      ab.d("ui.settings.SettingsPlugingsNotify", localBoolean + "st " + i + " ed " + j + "  state " + this.state);
      k = this.state;
      AppMethodBeat.o(127392);
      return k;
      k = 1;
      break;
    }
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127394);
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_plugings_disturb_on"))
      Cq(0);
    if (paramf.equals("settings_plugings_disturb_on_night"))
      Cq(1);
    if (paramf.equals("settings_plugings_disturb_off"))
      Cq(2);
    AppMethodBeat.o(127394);
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(127397);
    this.state = getState();
    this.ehK = this.yCw;
    setMMTitle(2131303204);
    setBackBtn(new SettingsPluginsNotifyUI.1(this));
    AppMethodBeat.o(127397);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127391);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127391);
  }

  public void onResume()
  {
    AppMethodBeat.i(127393);
    super.onResume();
    ciB();
    AppMethodBeat.o(127393);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsNotifyUI
 * JD-Core Version:    0.6.2
 */