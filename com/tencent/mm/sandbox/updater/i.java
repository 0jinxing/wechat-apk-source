package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  private static final long[] vdB = { 0L, 259200000L, 604800000L };

  public static void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4)
  {
    AppMethodBeat.i(28920);
    MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().putString("update_downloaded_pack_md5_key", paramString1).putString("update_downloaded_pack_sig_key", paramString2).putString("update_downloaded_pack_desc_key", paramString3).putInt("update_downloaded_pack_size_key", paramInt1).putInt("update_downloaded_pack_download_mode", paramInt2).putInt("update_downloaded_pack_update_type", paramInt3).putString("update_download_not_auto_download_range", paramString4).commit();
    ab.i("MicroMsg.UpdateUtil", "summerupdate putDownloadedPackInfo md5: %s size: %s range: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString4 });
    AppMethodBeat.o(28920);
  }

  public static boolean amc(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(28923);
    String[] arrayOfString = dnx();
    int j;
    if (arrayOfString != null)
    {
      int i = arrayOfString.length;
      j = 0;
      if (j < i)
        if (arrayOfString[j].equals(paramString))
        {
          bool = true;
          AppMethodBeat.o(28923);
        }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(28923);
    }
  }

  public static long amd(String paramString)
  {
    AppMethodBeat.i(28930);
    long l = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_flowstat_prefs", com.tencent.mm.compatible.util.h.Mu()).getLong(paramString, 0L);
    ab.i("MicroMsg.UpdateUtil", "getPackFlowStat pack %s, flow %s", new Object[] { paramString, Long.valueOf(l) });
    AppMethodBeat.o(28930);
    return l;
  }

  public static void ap(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(28913);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
    localIntent.putExtra("intent_extra_is_silence_stat", false);
    localIntent.putExtra("intent_extra_opcode", paramInt);
    paramContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
    AppMethodBeat.o(28913);
  }

  public static void aq(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(28914);
    d(paramContext, paramInt, 0);
    AppMethodBeat.o(28914);
  }

  public static void d(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(28915);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
    localIntent.putExtra("intent_extra_is_silence_stat", true);
    localIntent.putExtra("intent_extra_opcode", paramInt1);
    if (paramInt1 == 2)
      localIntent.putExtra("intent_extra_install_dialog_times", paramInt2);
    paramContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
    AppMethodBeat.o(28915);
  }

  public static String dhU()
  {
    AppMethodBeat.i(28916);
    String str = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getString("update_downloaded_pack_md5_key", null);
    AppMethodBeat.o(28916);
    return str;
  }

  public static void dnA()
  {
    AppMethodBeat.i(28927);
    MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().remove("update_downloading_in_silence").commit();
    ab.i("MicroMsg.UpdateUtil", "removeUnfinishDownloadingInSilence");
    AppMethodBeat.o(28927);
  }

  public static void dnB()
  {
    AppMethodBeat.i(28928);
    MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().clear().commit();
    ab.i("MicroMsg.UpdateUtil", "clearUpdateConfigPrefs");
    AppMethodBeat.o(28928);
  }

  public static String dns()
  {
    AppMethodBeat.i(28917);
    String str = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getString("update_downloaded_pack_sig_key", null);
    AppMethodBeat.o(28917);
    return str;
  }

  public static String dnt()
  {
    AppMethodBeat.i(28918);
    String str = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getString("update_downloaded_pack_desc_key", null);
    AppMethodBeat.o(28918);
    return str;
  }

  public static int dnu()
  {
    AppMethodBeat.i(28919);
    int i = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("update_downloaded_pack_download_mode", 0);
    AppMethodBeat.o(28919);
    return i;
  }

  public static int dnv()
  {
    AppMethodBeat.i(28921);
    int i = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("update_downloaded_cancel_times", 0);
    ab.i("MicroMsg.UpdateUtil", "getIgnoreDownloadedPackTimes times %s", new Object[] { Integer.valueOf(i) });
    AppMethodBeat.o(28921);
    return i;
  }

  public static void dnw()
  {
    int i = 0;
    AppMethodBeat.i(28922);
    SharedPreferences localSharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu());
    int j = localSharedPreferences.getInt("update_downloaded_cancel_times", 0);
    ab.i("MicroMsg.UpdateUtil", "putIgnoreDownloadedPack times %s", new Object[] { Integer.valueOf(j) });
    if (j >= vdB.length - 1)
    {
      String str = dhU();
      Object localObject = null;
      if (!bo.isNullOrNil(str))
      {
        String[] arrayOfString = dnx();
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(str);
        localObject = localStringBuffer;
        if (arrayOfString != null)
        {
          j = arrayOfString.length;
          while (true)
          {
            localObject = localStringBuffer;
            if (i >= j)
              break;
            localObject = arrayOfString[i];
            if (!bo.isNullOrNil(localObject))
            {
              localStringBuffer.append(":");
              localStringBuffer.append(localObject);
            }
            i++;
          }
        }
      }
      localSharedPreferences.edit().clear().commit();
      if (localObject != null)
        localSharedPreferences.edit().putString("update_downloaded_ignored_pack", localObject.toString()).commit();
      AppMethodBeat.o(28922);
    }
    while (true)
    {
      return;
      localSharedPreferences.edit().putLong("update_downloaded_cancel_ts", System.currentTimeMillis()).putInt("update_downloaded_cancel_times", j + 1).commit();
      AppMethodBeat.o(28922);
    }
  }

  private static String[] dnx()
  {
    String[] arrayOfString = null;
    AppMethodBeat.i(28924);
    String str = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getString("update_downloaded_ignored_pack", null);
    if (bo.isNullOrNil(str))
      AppMethodBeat.o(28924);
    while (true)
    {
      return arrayOfString;
      arrayOfString = str.split(":");
      AppMethodBeat.o(28924);
    }
  }

  public static void dny()
  {
    AppMethodBeat.i(28925);
    MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().putLong("update_downloading_in_silence", System.currentTimeMillis()).putBoolean("update_download_start_one_immediate", false).commit();
    ab.i("MicroMsg.UpdateUtil", "putDowningInSilence");
    AppMethodBeat.o(28925);
  }

  public static void dnz()
  {
    AppMethodBeat.i(28926);
    MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().putBoolean("update_download_start_one_immediate", true).commit();
    ab.i("MicroMsg.UpdateUtil", "putOneDownloadTask");
    AppMethodBeat.o(28926);
  }

  public static int g(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(28912);
    int i = com.tencent.mm.c.h.b(com.tencent.mm.pluginsdk.f.i.en(paramContext), paramString1, paramString2, paramString3);
    AppMethodBeat.o(28912);
    return i;
  }

  public static long y(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(28929);
    SharedPreferences localSharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "update_flowstat_prefs", com.tencent.mm.compatible.util.h.Mu());
    long l = localSharedPreferences.getLong(paramString, 0L);
    ab.i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flowUp %s, flowDown %s", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    ab.i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flow %s", new Object[] { paramString, Long.valueOf(l) });
    paramLong1 = l + (paramLong1 + paramLong2);
    localSharedPreferences.edit().putLong(paramString, paramLong1).commit();
    AppMethodBeat.o(28929);
    return paramLong1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.i
 * JD-Core Version:    0.6.2
 */