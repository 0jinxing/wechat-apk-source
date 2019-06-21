package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.y;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.e.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsNotificationUI extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private HashMap<Integer, Integer> gsc;
  private int status;

  public SettingsNotificationUI()
  {
    AppMethodBeat.i(127356);
    this.gsc = new HashMap();
    AppMethodBeat.o(127356);
  }

  private void a(com.tencent.mm.pluginsdk.permission.d paramd)
  {
    AppMethodBeat.i(127363);
    Intent localIntent = new Intent();
    if (com.tencent.mm.compatible.util.d.iW(26))
    {
      if ((com.tencent.mm.sdk.h.b.dqw()) && ((!com.tencent.mm.sdk.h.b.dqv()) || ((com.tencent.mm.sdk.h.b.dqv()) && (!com.tencent.mm.sdk.h.b.dqx()))))
      {
        ab.i("MicroMsg.SettingsNotificationUI", "openSysSetting() ifNotificationChannelSupportNativeActionJump = false");
        localIntent = new Intent("android.intent.action.MAIN");
        localIntent.setClassName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
        localIntent.putExtra("appName", ah.getContext().getResources().getString(2131296982));
        localIntent.putExtra("packageName", getPackageName());
        com.tencent.mm.pluginsdk.permission.b.a(localIntent, paramd);
        AppMethodBeat.o(127363);
        return;
      }
      ab.i("MicroMsg.SettingsNotificationUI", "openSysSetting() native notificationchannel jump");
      if (y.L(this.mController.ylL).areNotificationsEnabled())
      {
        localIntent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        localIntent.putExtra("android.provider.extra.CHANNEL_ID", com.tencent.mm.bo.a.My());
      }
      while (true)
      {
        localIntent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        com.tencent.mm.pluginsdk.permission.b.a(localIntent, paramd);
        AppMethodBeat.o(127363);
        break;
        localIntent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
      }
    }
    if (com.tencent.mm.compatible.util.d.iW(21))
    {
      localIntent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
      localIntent.putExtra("app_package", getPackageName());
      localIntent.putExtra("app_uid", getApplicationInfo().uid);
      localIntent.addFlags(268435456);
    }
    while (true)
    {
      startActivity(localIntent);
      AppMethodBeat.o(127363);
      break;
      localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
      localIntent.addCategory("android.intent.category.DEFAULT");
      localIntent.setData(Uri.fromParts("package", getPackageName(), null));
      localIntent.addFlags(268435456);
    }
  }

  public final int JC()
  {
    return 2131165285;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127361);
    paramf = paramPreference.mKey;
    boolean bool;
    if (paramf.equals("settings_new_msg_notification"))
    {
      if ((com.tencent.mm.compatible.util.d.iW(26)) && (!com.tencent.mm.m.f.MD()))
      {
        e.a locala = new e.a(this.mController.ylL);
        locala.asL(getString(2131302980)).re(false);
        locala.c(new SettingsNotificationUI.2(this)).show();
      }
    }
    else
    {
      if (!paramf.equals("settings_new_voip_msg_notification"))
        break label280;
      if (((CheckBoxPreference)paramPreference).isChecked())
        break label250;
      com.tencent.mm.ui.base.h.a(this.mController.ylL, false, this.mController.ylL.getString(2131303179), "", this.mController.ylL.getString(2131303178), this.mController.ylL.getString(2131303129), new SettingsNotificationUI.3(this), new SettingsNotificationUI.4(this), 2131689665, 0);
      bool = true;
      AppMethodBeat.o(127361);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.m.f.bL(((CheckBoxPreference)paramPreference).isChecked());
      initView();
      if (((CheckBoxPreference)paramPreference).isChecked())
        com.tencent.mm.plugin.report.service.h.pYm.a(500L, 0L, 1L, false);
      while (true)
      {
        au.k(true, false);
        bool = true;
        AppMethodBeat.o(127361);
        break;
        com.tencent.mm.plugin.report.service.h.pYm.a(500L, 1L, 1L, false);
      }
      label250: com.tencent.mm.m.f.bM(true);
      com.tencent.mm.plugin.report.service.h.pYm.a(500L, 2L, 1L, false);
      au.k(false, true);
      initView();
      break;
      label280: if (paramf.equals("settings_voip_notification_sound"))
      {
        bool = ((CheckBoxPreference)paramPreference).isChecked();
        g.RP().Ry().set(73217, Boolean.valueOf(bool));
        g.RP().Ry().set(73218, Boolean.valueOf(bool));
        paramf = com.tencent.mm.plugin.report.service.h.pYm;
        if (bool);
        for (long l = 8L; ; l = 9L)
        {
          paramf.a(500L, l, 1L, false);
          ab.i("MicroMsg.SettingsNotificationUI", "void sound checkbox %b", new Object[] { Boolean.valueOf(bool) });
          bool = true;
          AppMethodBeat.o(127361);
          break;
        }
      }
      if (paramf.equals("settings_sound"))
      {
        com.tencent.mm.m.f.bO(((CheckBoxPreference)paramPreference).isChecked());
        initView();
        if (((CheckBoxPreference)paramPreference).isChecked())
          com.tencent.mm.plugin.report.service.h.pYm.a(500L, 10L, 1L, false);
        while (true)
        {
          bool = true;
          AppMethodBeat.o(127361);
          break;
          com.tencent.mm.plugin.report.service.h.pYm.a(500L, 11L, 1L, false);
        }
      }
      if (paramf.equals("settings_shake"))
      {
        com.tencent.mm.m.f.bP(((CheckBoxPreference)paramPreference).isChecked());
        initView();
        if (((CheckBoxPreference)paramPreference).isChecked())
          com.tencent.mm.plugin.report.service.h.pYm.a(500L, 16L, 1L, false);
        while (true)
        {
          bo.z(this, ((CheckBoxPreference)paramPreference).isChecked());
          bool = true;
          AppMethodBeat.o(127361);
          break;
          com.tencent.mm.plugin.report.service.h.pYm.a(500L, 17L, 1L, false);
        }
      }
      if (paramf.equals("settings_show_detail"))
      {
        bool = ((CheckBoxPreference)paramPreference).isChecked();
        com.tencent.mm.m.f.bN(bool);
        if (!bool)
        {
          bool = true;
          label592: ab.d("MicroMsg.SettingsNotificationUI", "switch change : open = " + bool + " item value = 2048 functionId = 10");
          if (!bool)
            break label681;
          this.status |= 2048;
          label638: if (!bool)
            break label696;
        }
        label681: label696: for (int i = 1; ; i = 2)
        {
          this.gsc.put(Integer.valueOf(10), Integer.valueOf(i));
          bool = true;
          AppMethodBeat.o(127361);
          break;
          bool = false;
          break label592;
          this.status &= -2049;
          break label638;
        }
      }
      if (paramf.equals("settings_notification_ringtone"))
      {
        startActivity(new Intent(this.mController.ylL, SettingsRingtoneUI.class));
        bool = true;
        AppMethodBeat.o(127361);
      }
      else if (paramf.equals("settings_notification_sound_and_shake"))
      {
        a(new SettingsNotificationUI.5(this));
        bool = true;
        AppMethodBeat.o(127361);
      }
      else if (paramf.equals("settings_special_scene_notification_sound_and_shake"))
      {
        paramf = new Intent();
        paramf.setClass(this, SettingsSpecialSceneNotificationUI.class);
        startActivity(paramf);
        bool = true;
        AppMethodBeat.o(127361);
      }
      else if (paramf.equals("settings_voip_sound_and_shake"))
      {
        paramf = new Intent();
        paramf.setClass(this, SettingsVoipSoundVibrateUI.class);
        startActivity(paramf);
        bool = true;
        AppMethodBeat.o(127361);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(127361);
      }
    }
  }

  public final void initView()
  {
    boolean bool1 = false;
    AppMethodBeat.i(127358);
    this.ehK = this.yCw;
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165285);
    Object localObject;
    boolean bool2;
    if (com.tencent.mm.compatible.util.d.iW(26))
    {
      this.ehK.ce("settings_notification_top", true);
      this.ehK.ce("settings_notification_title", false);
      this.ehK.ce("settings_notification_sound_shake", false);
      this.ehK.ce("settings_voip_sound_and_shake", false);
      localObject = (CheckBoxPreference)this.ehK.aqO("settings_new_msg_notification");
      if (!com.tencent.mm.compatible.util.d.iW(26))
        break label374;
      if ((!com.tencent.mm.m.f.MC()) || (!com.tencent.mm.m.f.MD()))
        break label369;
      bool2 = true;
      label133: ((CheckBoxPreference)localObject).uOT = bool2;
      label138: ((CheckBoxPreference)this.ehK.aqO("settings_new_voip_msg_notification")).uOT = com.tencent.mm.m.f.ME();
      if (!((CheckBoxPreference)localObject).isChecked())
        break label619;
      if (!com.tencent.mm.compatible.util.d.iW(26))
        break label389;
      this.ehK.ce("settings_notification_sound_and_shake", false);
      this.ehK.ce("settings_sound", true);
      this.ehK.ce("settings_shake", true);
      this.ehK.ce("settings_notification_ringtone", true);
      com.tencent.mm.m.a.MQ();
      ab.i("MicroMsg.SettingsNotificationUI", "initView() mSpecialSceneSwitchEnable:%s", new Object[] { Integer.valueOf(com.tencent.mm.m.a.MP()) });
      localObject = this.ehK;
      if (com.tencent.mm.m.a.MP() != 1)
        break label384;
      bool2 = bool1;
      label264: ((com.tencent.mm.ui.base.preference.f)localObject).ce("settings_special_scene_notification_sound_and_shake", bool2);
      ((CheckBoxPreference)this.ehK.aqO("settings_show_detail")).uOT = com.tencent.mm.m.f.MF();
    }
    while (true)
    {
      setBackBtn(new SettingsNotificationUI.1(this));
      AppMethodBeat.o(127358);
      return;
      this.ehK.ce("settings_notification_top", false);
      this.ehK.ce("settings_notification_title", true);
      this.ehK.ce("settings_notification_sound_shake", true);
      this.ehK.ce("settings_voip_sound_and_shake", true);
      break;
      label369: bool2 = false;
      break label133;
      label374: ((CheckBoxPreference)localObject).uOT = com.tencent.mm.m.f.MC();
      break label138;
      label384: bool2 = true;
      break label264;
      label389: localObject = (CheckBoxPreference)this.ehK.aqO("settings_sound");
      ((CheckBoxPreference)localObject).uOT = com.tencent.mm.m.f.MG();
      if (((CheckBoxPreference)localObject).isChecked())
      {
        localObject = this.ehK.aqO("settings_notification_ringtone");
        if (com.tencent.mm.compatible.util.d.iW(26))
        {
          String str = com.tencent.mm.m.f.MK();
          if (str != com.tencent.mm.m.f.evO)
            ((Preference)localObject).setSummary(RingtoneManager.getRingtone(this, Uri.parse(str)).getTitle(this));
        }
      }
      while (true)
      {
        ((CheckBoxPreference)this.ehK.aqO("settings_shake")).uOT = com.tencent.mm.m.f.MI();
        this.ehK.ce("settings_notification_sound_and_shake", true);
        this.ehK.ce("settings_special_scene_notification_title", true);
        this.ehK.ce("settings_specail_scene_sound", true);
        this.ehK.ce("settings_specail_scene_shake", true);
        this.ehK.ce("settings_special_scene_notification_sound_and_shake", true);
        break;
        ((Preference)localObject).setSummary(getString(2131303185));
        continue;
        if (localObject != null)
        {
          ((Preference)localObject).setSummary(this.ehZ.getString("settings.ringtone.name", getString(2131303185)));
          continue;
          this.ehK.aqP("settings_notification_ringtone");
        }
      }
      label619: this.ehK.aqP("settings_show_detail");
      this.ehK.aqP("settings_sound");
      this.ehK.aqP("settings_notification_ringtone");
      this.ehK.aqP("settings_shake");
      this.ehK.aqP("settings_active_time");
      this.ehK.aqP("settings_notification_sound_and_shake");
      this.ehK.aqP("settings_special_scene_notification_sound_and_shake");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127357);
    super.onCreate(paramBundle);
    this.status = r.YD();
    setMMTitle(2131303183);
    AppMethodBeat.o(127357);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127362);
    super.onDestroy();
    au.kB(3);
    AppMethodBeat.o(127362);
  }

  public void onPause()
  {
    AppMethodBeat.i(127359);
    super.onPause();
    g.RP().Ry().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.gsc.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new act();
      ((act)localObject).wkw = i;
      ((act)localObject).pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, (com.tencent.mm.bt.a)localObject));
      ab.d("MicroMsg.SettingsNotificationUI", "switch  " + i + " " + j);
    }
    this.gsc.clear();
    AppMethodBeat.o(127359);
  }

  public void onResume()
  {
    AppMethodBeat.i(127360);
    super.onResume();
    initView();
    AppMethodBeat.o(127360);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI
 * JD-Core Version:    0.6.2
 */