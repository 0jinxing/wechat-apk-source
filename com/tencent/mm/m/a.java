package com.tencent.mm.m;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.h.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public class a
{
  private static int evN = -1;
  public static final String evO = null;
  private static String evP = "";
  private static SharedPreferences evQ = null;
  private static NotificationChannel evR;
  private static String evS = evO;
  private static boolean evT = false;
  private static boolean evU = false;

  public static SharedPreferences MA()
  {
    AppMethodBeat.i(77632);
    SharedPreferences localSharedPreferences = aa.anh();
    AppMethodBeat.o(77632);
    return localSharedPreferences;
  }

  public static boolean MB()
  {
    AppMethodBeat.i(77633);
    boolean bool;
    if (d.iW(26))
    {
      bool = true;
      AppMethodBeat.o(77633);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77633);
    }
  }

  public static boolean MC()
  {
    AppMethodBeat.i(77634);
    boolean bool = Mz().getBoolean("settings_new_msg_notification", true);
    AppMethodBeat.o(77634);
    return bool;
  }

  public static boolean MD()
  {
    AppMethodBeat.i(77635);
    boolean bool;
    if (!y.L(ah.getContext()).areNotificationsEnabled())
    {
      AppMethodBeat.o(77635);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (d.iW(26))
      {
        if (evR == null)
          evR = ((NotificationManager)ah.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(My());
        if ((evR != null) && (evR.getImportance() <= 0))
        {
          AppMethodBeat.o(77635);
          bool = false;
        }
      }
      else
      {
        bool = true;
        AppMethodBeat.o(77635);
      }
    }
  }

  public static boolean ME()
  {
    AppMethodBeat.i(77636);
    boolean bool = Mz().getBoolean("settings_new_voip_msg_notification", true);
    AppMethodBeat.o(77636);
    return bool;
  }

  public static boolean MF()
  {
    AppMethodBeat.i(77637);
    boolean bool = Mz().getBoolean("settings_show_detail", true);
    AppMethodBeat.o(77637);
    return bool;
  }

  public static boolean MG()
  {
    AppMethodBeat.i(77638);
    boolean bool1 = Mz().getBoolean("settings_sound", true);
    boolean bool3;
    if (d.iW(26))
      if (evN == 0)
      {
        boolean bool2 = MH();
        bool3 = bool2;
        if (bool1 != bool2)
        {
          f.bO(bool2);
          bool3 = bool2;
        }
      }
    while (true)
    {
      AppMethodBeat.o(77638);
      return bool3;
      bool3 = ML();
      continue;
      bool3 = bool1;
    }
  }

  public static boolean MH()
  {
    AppMethodBeat.i(77639);
    NotificationChannel localNotificationChannel;
    boolean bool;
    if (d.iW(26))
    {
      localNotificationChannel = ((NotificationManager)ah.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(My());
      if ((localNotificationChannel != null) && (localNotificationChannel.getImportance() < 3))
      {
        AppMethodBeat.o(77639);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      if ((localNotificationChannel != null) && (localNotificationChannel.getSound() == null))
      {
        AppMethodBeat.o(77639);
        bool = false;
        continue;
        int i = y.L(ah.getContext()).getImportance();
        if ((i < 3) && (i != -1000))
        {
          AppMethodBeat.o(77639);
          bool = false;
        }
      }
      else
      {
        bool = true;
        AppMethodBeat.o(77639);
      }
    }
  }

  public static boolean MI()
  {
    AppMethodBeat.i(77640);
    boolean bool1 = Mz().getBoolean("settings_shake", true);
    boolean bool3;
    if (d.iW(26))
      if (evN == 0)
      {
        boolean bool2 = MJ();
        bool3 = bool2;
        if (bool2 != bool1)
        {
          f.bP(bool2);
          bool3 = bool2;
        }
      }
    while (true)
    {
      AppMethodBeat.o(77640);
      return bool3;
      bool3 = MM();
      continue;
      bool3 = bool1;
    }
  }

  public static boolean MJ()
  {
    AppMethodBeat.i(77641);
    boolean bool;
    if (d.iW(26))
    {
      NotificationChannel localNotificationChannel = ((NotificationManager)ah.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(My());
      if ((localNotificationChannel == null) || ((localNotificationChannel.getImportance() >= 3) && (localNotificationChannel.shouldVibrate())))
        break label91;
      AppMethodBeat.o(77641);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = y.L(ah.getContext()).getImportance();
      if ((i < 3) && (i != -1000))
      {
        AppMethodBeat.o(77641);
        bool = false;
      }
      else
      {
        label91: bool = true;
        AppMethodBeat.o(77641);
      }
    }
  }

  public static String MK()
  {
    AppMethodBeat.i(77642);
    String str1;
    String str2;
    RingtoneManager localRingtoneManager;
    String str3;
    if (!d.iW(26))
    {
      str1 = Mz().getString("settings.ringtone", evO);
      str2 = str1;
      if (str1 != evO)
      {
        str2 = str1;
        if (!str1.equals(evS))
        {
          localRingtoneManager = new RingtoneManager(ah.getContext());
          localRingtoneManager.setType(2);
          str2 = str1;
          str3 = str1;
        }
      }
    }
    while (true)
    {
      try
      {
        if (localRingtoneManager.getRingtonePosition(Uri.parse(str1)) < 0)
        {
          str3 = str1;
          str2 = evO;
          str3 = str2;
          kA(str2);
          str3 = str2;
          ab.i("MicroMsg.BaseNotificationConfig", "reset ringTone");
        }
        evS = str2;
        AppMethodBeat.o(77642);
        return str2;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.BaseNotificationConfig", localException, "ringTone() Exception:%s", new Object[] { localException.getMessage() });
        localObject = str3;
        continue;
      }
      Object localObject = ((NotificationManager)ah.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(My());
      if ((localObject != null) && (((NotificationChannel)localObject).getSound() != null))
      {
        localObject = ((NotificationChannel)localObject).getSound().toString();
        AppMethodBeat.o(77642);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(77642);
      }
    }
  }

  public static boolean ML()
  {
    AppMethodBeat.i(77644);
    SharedPreferences localSharedPreferences = Mz();
    boolean bool = localSharedPreferences.getBoolean("settings_special_scene_sound", localSharedPreferences.getBoolean("settings_sound", true));
    AppMethodBeat.o(77644);
    return bool;
  }

  public static boolean MM()
  {
    AppMethodBeat.i(77645);
    SharedPreferences localSharedPreferences = Mz();
    boolean bool = localSharedPreferences.getBoolean("settings_special_scene_shake", localSharedPreferences.getBoolean("settings_shake", true));
    AppMethodBeat.o(77645);
    return bool;
  }

  public static boolean MN()
  {
    AppMethodBeat.i(77646);
    SharedPreferences localSharedPreferences = Mz();
    boolean bool = localSharedPreferences.getBoolean("settings_voip_scene_sound", MG());
    if (!evT)
    {
      evT = true;
      localSharedPreferences.edit().putBoolean("settings_voip_scene_sound", bool).commit();
    }
    AppMethodBeat.o(77646);
    return bool;
  }

  public static boolean MO()
  {
    AppMethodBeat.i(77647);
    SharedPreferences localSharedPreferences = Mz();
    boolean bool = localSharedPreferences.getBoolean("settings_voip_scene_shake", MI());
    if (!evU)
    {
      evU = true;
      localSharedPreferences.edit().putBoolean("settings_voip_scene_shake", bool).commit();
    }
    AppMethodBeat.o(77647);
    return bool;
  }

  public static int MP()
  {
    return evN;
  }

  public static void MQ()
  {
    AppMethodBeat.i(77648);
    if (b.dqw())
    {
      evN = 1;
      ab.i("MicroMsg.BaseNotificationConfig", "iniSpecialSceneSwitchEnable() mSpecialSceneSwitchEnable:%s", new Object[] { Integer.valueOf(evN) });
      AppMethodBeat.o(77648);
      return;
    }
    int i = Mz().getInt("special_scene_enable", -1);
    if (bo.gW(i, -1));
    for (evN = 0; ; evN = i)
    {
      ab.i("MicroMsg.BaseNotificationConfig", "iniSpecialSceneSwitchEnable() sceneEnable:%s mSpecialSceneSwitchEnable:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(evN) });
      AppMethodBeat.o(77648);
      break;
    }
  }

  public static boolean MR()
  {
    AppMethodBeat.i(77649);
    boolean bool = Mz().getBoolean("settings_active_time_full", true);
    AppMethodBeat.o(77649);
    return bool;
  }

  public static int MS()
  {
    AppMethodBeat.i(77650);
    int i = Mz().getInt("settings_active_begin_time_hour", 8);
    AppMethodBeat.o(77650);
    return i;
  }

  public static int MT()
  {
    AppMethodBeat.i(77651);
    int i = Mz().getInt("settings_active_end_time_hour", 23);
    AppMethodBeat.o(77651);
    return i;
  }

  public static int MU()
  {
    AppMethodBeat.i(77652);
    int i = Mz().getInt("settings_active_begin_time_min", 0);
    AppMethodBeat.o(77652);
    return i;
  }

  public static int MV()
  {
    AppMethodBeat.i(77653);
    int i = Mz().getInt("settings_active_end_time_min", 0);
    AppMethodBeat.o(77653);
    return i;
  }

  private static String My()
  {
    AppMethodBeat.i(77630);
    if (bo.isNullOrNil(evP))
      evP = com.tencent.mm.kernel.a.Mz().getString("message_channel_id", "message_channel_new_id");
    String str = evP;
    AppMethodBeat.o(77630);
    return str;
  }

  protected static SharedPreferences Mz()
  {
    AppMethodBeat.i(77631);
    SharedPreferences localSharedPreferences;
    if (evQ != null)
    {
      localSharedPreferences = evQ;
      AppMethodBeat.o(77631);
    }
    while (true)
    {
      return localSharedPreferences;
      localSharedPreferences = com.tencent.mm.kernel.a.Mz();
      evQ = localSharedPreferences;
      AppMethodBeat.o(77631);
    }
  }

  public static boolean bS(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(77654);
    if (MR())
      AppMethodBeat.o(77654);
    while (true)
    {
      return bool;
      int i = MS();
      int j = MU();
      int k = MT();
      int m = MV();
      if ((i == k) && (j == m))
      {
        AppMethodBeat.o(77654);
        bool = false;
      }
      else if ((i == k) && (j < m))
      {
        if ((paramInt1 == i) && (paramInt2 > j) && (paramInt2 < m))
        {
          AppMethodBeat.o(77654);
        }
        else
        {
          AppMethodBeat.o(77654);
          bool = false;
        }
      }
      else if (k > i)
      {
        if (((paramInt1 > i) && (paramInt1 < k)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)))
        {
          AppMethodBeat.o(77654);
        }
        else
        {
          AppMethodBeat.o(77654);
          bool = false;
        }
      }
      else if ((k < i) || ((i == k) && (j > m)))
      {
        if (((paramInt1 > i) && (paramInt1 <= 23)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)) || ((paramInt1 > 0) && (paramInt1 < k)))
        {
          AppMethodBeat.o(77654);
        }
        else
        {
          AppMethodBeat.o(77654);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(77654);
      }
    }
  }

  static void kA(String paramString)
  {
    AppMethodBeat.i(77643);
    Mz().edit().putString("settings.ringtone", paramString).commit();
    AppMethodBeat.o(77643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.m.a
 * JD-Core Version:    0.6.2
 */