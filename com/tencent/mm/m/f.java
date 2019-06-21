package com.tencent.mm.m;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public final class f extends a
{
  private static String TAG = "MicroMsg.NotificationConfig";

  public static boolean Nn()
  {
    AppMethodBeat.i(77677);
    boolean bool = com.tencent.mm.kernel.a.jP(com.tencent.mm.kernel.a.QW());
    AppMethodBeat.o(77677);
    return bool;
  }

  public static boolean No()
  {
    AppMethodBeat.i(77679);
    boolean bool = r.ku(Mz().getInt("notification.status.webonline.push.open", 0));
    AppMethodBeat.o(77679);
    return bool;
  }

  public static int Np()
  {
    AppMethodBeat.i(77682);
    int i;
    if (!g.RK())
    {
      ab.w(TAG, "getUnReadTalkerCount, but mmcore not ready");
      i = 0;
      AppMethodBeat.o(77682);
    }
    while (true)
    {
      return i;
      i = u.nS(t.fkP);
      AppMethodBeat.o(77682);
    }
  }

  public static List<String> Nq()
  {
    AppMethodBeat.i(77683);
    List localList = u.P(t.fkP, -1);
    AppMethodBeat.o(77683);
    return localList;
  }

  public static int Nr()
  {
    AppMethodBeat.i(77684);
    int i;
    if (!g.RK())
    {
      ab.w(TAG, "getUnReadMsgCoun, but mmcore not ready");
      i = 0;
      AppMethodBeat.o(77684);
      return i;
    }
    String str = t.fkP;
    ArrayList localArrayList = new ArrayList();
    if (!g.RK())
      ab.w(TAG, "getUnReadTalkerCount, but mmcore not ready");
    while (true)
    {
      i = u.e(str, localArrayList);
      AppMethodBeat.o(77684);
      break;
      if (!g.RP().Ry().getBoolean(ac.a.xON, true))
      {
        localArrayList.add("notifymessage");
        ab.d(TAG, "add service notify message into show unread count blacklist.");
      }
      if (!g.RP().Ry().getBoolean(ac.a.xOO, true))
      {
        localArrayList.add("appbrandcustomerservicemsg");
        ab.d(TAG, "add wxa custom session notify message into show unread count blacklist.");
      }
    }
  }

  public static boolean Ns()
  {
    AppMethodBeat.i(77691);
    boolean bool = ((Boolean)g.RP().Ry().get(73217, Boolean.TRUE)).booleanValue();
    AppMethodBeat.o(77691);
    return bool;
  }

  public static boolean Nt()
  {
    AppMethodBeat.i(77692);
    boolean bool = ((Boolean)g.RP().Ry().get(73218, Boolean.TRUE)).booleanValue();
    AppMethodBeat.o(77692);
    return bool;
  }

  public static void bL(boolean paramBoolean)
  {
    AppMethodBeat.i(77664);
    Mz().edit().putBoolean("settings_new_msg_notification", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveNewMsgNotification: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77664);
  }

  public static void bM(boolean paramBoolean)
  {
    AppMethodBeat.i(77665);
    Mz().edit().putBoolean("settings_new_voip_msg_notification", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveNewVoIPMsgNotification: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77665);
  }

  public static void bN(boolean paramBoolean)
  {
    AppMethodBeat.i(77666);
    Mz().edit().putBoolean("settings_show_detail", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShowDetail: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77666);
  }

  public static void bO(boolean paramBoolean)
  {
    AppMethodBeat.i(77667);
    Mz().edit().putBoolean("settings_sound", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsSound: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77667);
  }

  public static void bP(boolean paramBoolean)
  {
    AppMethodBeat.i(77668);
    Mz().edit().putBoolean("settings_shake", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShake: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77668);
  }

  public static void bQ(boolean paramBoolean)
  {
    AppMethodBeat.i(77670);
    Mz().edit().putBoolean("settings_special_scene_sound", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsSoundInSpecialScene: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77670);
  }

  public static void bR(boolean paramBoolean)
  {
    AppMethodBeat.i(77671);
    Mz().edit().putBoolean("settings_special_scene_shake", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShakeInSpecialScene: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77671);
  }

  public static void bS(boolean paramBoolean)
  {
    AppMethodBeat.i(77672);
    Mz().edit().putBoolean("settings_voip_scene_sound", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsSoundInVoip: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77672);
  }

  public static void bT(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77675);
    SharedPreferences localSharedPreferences = Mz();
    localSharedPreferences.edit().putInt("settings_active_begin_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_begin_time_min", paramInt2).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveActiveBegine: %d:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(77675);
  }

  public static void bT(boolean paramBoolean)
  {
    AppMethodBeat.i(77673);
    Mz().edit().putBoolean("settings_voip_scene_shake", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShakeInVoip: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77673);
  }

  public static void bU(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77676);
    SharedPreferences localSharedPreferences = Mz();
    localSharedPreferences.edit().putInt("settings_active_end_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_end_time_min", paramInt2).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveActiveEnd: %d:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(77676);
  }

  public static void bU(boolean paramBoolean)
  {
    AppMethodBeat.i(77674);
    Mz().edit().putBoolean("settings_active_time_full", paramBoolean).commit();
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsActiveTime: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(77674);
  }

  public static boolean i(bi parambi)
  {
    AppMethodBeat.i(77690);
    boolean bool;
    if (parambi == null)
    {
      bool = false;
      AppMethodBeat.o(77690);
    }
    while (true)
    {
      return bool;
      bool = parambi.apB(r.Yz());
      AppMethodBeat.o(77690);
    }
  }

  public static void iZ(int paramInt)
  {
    AppMethodBeat.i(77678);
    Mz().edit().putInt("notification.status.webonline.push.open", paramInt).commit();
    AppMethodBeat.o(77678);
  }

  public static boolean ja(int paramInt)
  {
    if ((paramInt == 50) || (paramInt == 53));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void kA(String paramString)
  {
    AppMethodBeat.i(77669);
    a.kA(paramString);
    ab.i(TAG, "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", new Object[] { paramString });
    AppMethodBeat.o(77669);
  }

  public static boolean kD(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(77680);
    ui localui = new ui();
    localui.cQx.cAd = 1;
    localui.cQx.content = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localui);
    if ((localui.cQy.type == 2) || (paramString.equals(bi.xZc)))
      AppMethodBeat.o(77680);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77680);
    }
  }

  public static boolean kE(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(77681);
    ui localui = new ui();
    localui.cQx.cAd = 1;
    localui.cQx.content = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localui);
    if ((localui.cQy.type == 3) || (paramString.equals(bi.xZb)))
      AppMethodBeat.o(77681);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77681);
    }
  }

  public static int kF(String paramString)
  {
    AppMethodBeat.i(77685);
    int i = u.ac(paramString, null);
    AppMethodBeat.o(77685);
    return i;
  }

  public static boolean kG(String paramString)
  {
    AppMethodBeat.i(77686);
    boolean bool = ad.mR(paramString);
    AppMethodBeat.o(77686);
    return bool;
  }

  public static boolean kH(String paramString)
  {
    AppMethodBeat.i(77687);
    boolean bool = t.mN(paramString);
    AppMethodBeat.o(77687);
    return bool;
  }

  public static boolean kI(String paramString)
  {
    AppMethodBeat.i(77688);
    boolean bool;
    if ((t.nN(paramString)) || ((t.kH(paramString)) && (!t.nM(paramString))) || ((t.mP(paramString)) && (!t.nM(paramString))))
    {
      bool = true;
      AppMethodBeat.o(77688);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77688);
    }
  }

  public static int kJ(String paramString)
  {
    AppMethodBeat.i(77689);
    int i = ((j)g.K(j.class)).XR().apo(paramString);
    AppMethodBeat.o(77689);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.m.f
 * JD-Core Version:    0.6.2
 */