package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.os.Bundle;
import android.widget.TimePicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.notification.PluginNotification;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.sql.Time;
import java.text.DateFormat;

public class SettingsActiveTimeUI extends MMPreference
{
  private boolean csi;
  private com.tencent.mm.ui.base.preference.f ehK;
  private Preference jyO;
  private Preference jyP;
  private int qmE;
  private int qmF;
  private int qmG;
  private int qmH;
  private boolean qmI;
  private final TimePickerDialog.OnTimeSetListener qmJ;

  public SettingsActiveTimeUI()
  {
    AppMethodBeat.i(127156);
    this.qmI = false;
    this.csi = false;
    this.qmJ = new TimePickerDialog.OnTimeSetListener()
    {
      public final void onTimeSet(TimePicker paramAnonymousTimePicker, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(127155);
        if (SettingsActiveTimeUI.a(SettingsActiveTimeUI.this))
        {
          SettingsActiveTimeUI.a(SettingsActiveTimeUI.this, paramAnonymousInt1);
          SettingsActiveTimeUI.b(SettingsActiveTimeUI.this, paramAnonymousInt2);
          SettingsActiveTimeUI.b(SettingsActiveTimeUI.this);
        }
        while (true)
        {
          SettingsActiveTimeUI.this.initView();
          AppMethodBeat.o(127155);
          return;
          SettingsActiveTimeUI.c(SettingsActiveTimeUI.this, paramAnonymousInt1);
          SettingsActiveTimeUI.d(SettingsActiveTimeUI.this, paramAnonymousInt2);
          SettingsActiveTimeUI.c(SettingsActiveTimeUI.this);
        }
      }
    };
    AppMethodBeat.o(127156);
  }

  private static String c(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(127162);
    String str1 = aa.h(paramContext.getSharedPreferences(ah.doA(), 0));
    String str2 = aa.dor();
    if ((!str1.equalsIgnoreCase("zh_CN")) && ((!str1.equalsIgnoreCase("language_default")) || (!"zh_CN".equalsIgnoreCase(str2))))
    {
      paramContext = DateFormat.getTimeInstance(3, aa.amw(str1)).format(new Time(paramInt1, paramInt2, 0));
      AppMethodBeat.o(127162);
      return paramContext;
    }
    if (paramInt1 > 12);
    for (int i = paramInt1 - 12; ; i = paramInt1)
    {
      paramContext = com.tencent.mm.pluginsdk.f.h.r(paramContext, paramInt1 * 3600000L + paramInt2 * 60000L) + String.format("%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(127162);
      break;
    }
  }

  private void ciM()
  {
    AppMethodBeat.i(127163);
    this.jyP = this.ehK.aqO("settings_active_begin_time");
    this.qmE = com.tencent.mm.m.f.MT();
    this.qmF = com.tencent.mm.m.f.MV();
    this.jyP.setSummary(c(this, this.qmE, this.qmF));
    this.jyO = this.ehK.aqO("settings_active_end_time");
    this.qmG = com.tencent.mm.m.f.MS();
    this.qmH = com.tencent.mm.m.f.MU();
    this.jyO.setSummary(c(this, this.qmG, this.qmH));
    AppMethodBeat.o(127163);
  }

  private void setActive()
  {
    AppMethodBeat.i(127164);
    if (!com.tencent.mm.m.f.MR());
    for (boolean bool = true; ; bool = false)
    {
      this.csi = bool;
      ((CheckBoxPreference)this.ehK.aqO("settings_active_silence_time")).uOT = this.csi;
      AppMethodBeat.o(127164);
      return;
    }
  }

  public final int JC()
  {
    return 2131165279;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(127159);
    boolean bool2;
    if (paramPreference.mKey.equals("settings_active_begin_time"))
    {
      this.qmI = true;
      showDialog(1);
      AppMethodBeat.o(127159);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (paramPreference.mKey.equals("settings_active_end_time"))
      {
        this.qmI = false;
        showDialog(1);
        AppMethodBeat.o(127159);
        bool2 = bool1;
      }
      else
      {
        if (paramPreference.mKey.equals("settings_active_silence_time"))
        {
          paramPreference = (CheckBoxPreference)this.ehK.aqO("settings_active_silence_time");
          if (!paramPreference.isChecked())
          {
            bool2 = true;
            label110: com.tencent.mm.m.f.bU(bool2);
            PluginNotification.createActiveTimeNotification();
            paramf = com.tencent.mm.plugin.report.service.h.pYm;
            if (!paramPreference.isChecked())
              break label179;
          }
          label179: for (int i = 1; ; i = 2)
          {
            paramf.e(11351, new Object[] { Integer.valueOf(0), Integer.valueOf(i) });
            initView();
            AppMethodBeat.o(127159);
            bool2 = bool1;
            break;
            bool2 = false;
            break label110;
          }
        }
        AppMethodBeat.o(127159);
        bool2 = false;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127158);
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165279);
    ciM();
    setActive();
    if (this.csi)
    {
      this.jyP.setEnabled(true);
      this.jyO.setEnabled(true);
    }
    while (true)
    {
      if (!this.csi)
      {
        this.ehK.d(this.jyP);
        this.ehK.d(this.jyO);
      }
      this.ehK.ce("settings_active_time_full", true);
      this.ehK.notifyDataSetChanged();
      setBackBtn(new SettingsActiveTimeUI.1(this));
      AppMethodBeat.o(127158);
      return;
      this.jyP.setEnabled(false);
      this.jyO.setEnabled(false);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127157);
    super.onCreate(paramBundle);
    setMMTitle(2131303030);
    this.ehK = this.yCw;
    initView();
    AppMethodBeat.o(127157);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(127160);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = null;
      AppMethodBeat.o(127160);
    case 1:
    }
    while (true)
    {
      return localObject;
      if (this.qmI)
      {
        localObject = new TimePickerDialog(this.mController.ylL, this.qmJ, this.qmE, this.qmF, false);
        AppMethodBeat.o(127160);
      }
      else
      {
        localObject = new TimePickerDialog(this.mController.ylL, this.qmJ, this.qmG, this.qmH, false);
        AppMethodBeat.o(127160);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127165);
    super.onDestroy();
    au.kB(2);
    AppMethodBeat.o(127165);
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    AppMethodBeat.i(127161);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(127161);
    case 1:
    }
    while (true)
    {
      return;
      if (this.qmI)
      {
        ((TimePickerDialog)paramDialog).updateTime(this.qmE, this.qmF);
        AppMethodBeat.o(127161);
      }
      else
      {
        ((TimePickerDialog)paramDialog).updateTime(this.qmG, this.qmH);
        AppMethodBeat.o(127161);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI
 * JD-Core Version:    0.6.2
 */