package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.k;
import com.tencent.mm.modelstat.m;
import com.tencent.mm.modelstat.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SettingsNetStatUI extends MMPreference
{
  private f ehK;
  private long period;

  private void ciX()
  {
    AppMethodBeat.i(127347);
    Object localObject1 = q.aks().me((int)(this.period / 86400000L));
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = new k();
    this.period = q.aks().akl();
    this.ehK.aqO("settings_netstat_info").setTitle(getString(2131303307, new Object[] { DateFormat.format(getString(2131299952, new Object[] { "" }), this.period).toString() }));
    localObject1 = this.ehK.aqO("settings_netstat_mobile");
    ab.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic mobile out:%d in:%d", new Object[] { Integer.valueOf(((k)localObject2).fTu), Integer.valueOf(((k)localObject2).fTi) });
    ((Preference)localObject1).setSummary(k(this, ((k)localObject2).fTu + ((k)localObject2).fTi));
    ((Preference)localObject1).NW(8);
    localObject1 = this.ehK.aqO("settings_netstat_wifi");
    ab.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic wifi out:%d in:%d", new Object[] { Integer.valueOf(((k)localObject2).fTv), Integer.valueOf(((k)localObject2).fTj) });
    ((Preference)localObject1).setSummary(k(this, ((k)localObject2).fTv + ((k)localObject2).fTj));
    ((Preference)localObject1).NW(8);
    ((NetStatPreference)this.ehK.aqO("settings_netstat_mobile_detail")).qkW = false;
    ((NetStatPreference)this.ehK.aqO("settings_netstat_wifi_detail")).qkW = true;
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(127347);
  }

  private static String k(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(127348);
    paramContext = paramContext.getString(2131303306, new Object[] { bo.ga(paramLong) });
    AppMethodBeat.o(127348);
    return paramContext;
  }

  public final int JC()
  {
    return 2131165284;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }

  public final boolean aqT()
  {
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(127346);
    setMMTitle(2131303309);
    q.aks().akk();
    this.ehK = this.yCw;
    this.period = q.aks().akl();
    Preference localPreference = this.ehK.aqO("settings_netstat_info");
    String str = new SimpleDateFormat(getString(2131299952), Locale.US).format(new Date(this.period));
    localPreference.setTitle(getString(2131303307, new Object[] { str }));
    ab.i("MicroMsg.SettingsNetStatUI", "title datatime = ".concat(String.valueOf(str)));
    ab.d("MicroMsg.SettingsNetStatUI", "title datatime = ".concat(String.valueOf(str)));
    setBackBtn(new SettingsNetStatUI.1(this));
    addTextOptionMenu(0, getString(2131303310), new SettingsNetStatUI.2(this));
    AppMethodBeat.o(127346);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127344);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127344);
  }

  public void onResume()
  {
    AppMethodBeat.i(127345);
    super.onResume();
    ciX();
    AppMethodBeat.o(127345);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI
 * JD-Core Version:    0.6.2
 */