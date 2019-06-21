package com.tencent.mm.pluginsdk.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.c.b;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.protocal.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;
import java.util.List;

public final class i
{
  private static String nus = "tinker-boots-install-info";
  private static String nut = "tinker-boots-last-show";
  private static String nuu = "tinker-boots-show-time";
  private static String nuv = "";
  private static final long[] vdB = { 0L, 259200000L, 604800000L };

  public static void aC(Context paramContext, String paramString)
  {
    AppMethodBeat.i(27443);
    q.a(paramContext, new File(paramString), null, false);
    AppMethodBeat.o(27443);
  }

  public static String dhU()
  {
    AppMethodBeat.i(27437);
    String str = ah.getContext().getSharedPreferences("update_config_prefs", h.Mu()).getString("update_downloaded_pack_md5_key", null);
    AppMethodBeat.o(27437);
    return str;
  }

  public static int dhV()
  {
    AppMethodBeat.i(27438);
    int i = ah.getContext().getSharedPreferences("update_config_prefs", h.Mu()).getInt("update_downloaded_pack_update_type", 3);
    AppMethodBeat.o(27438);
    return i;
  }

  public static boolean dhW()
  {
    boolean bool = true;
    AppMethodBeat.i(27439);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("update_config_prefs", h.Mu());
    long l1 = localSharedPreferences.getLong("update_downloaded_cancel_ts", 0L);
    int i = localSharedPreferences.getInt("update_downloaded_cancel_times", 0);
    ab.i("MicroMsg.UpdateUtil", "checkIgnoreDownloadedPack last: %s times: %s", new Object[] { Long.valueOf(l1), Integer.valueOf(i) });
    if (i > vdB.length - 1)
      AppMethodBeat.o(27439);
    while (true)
    {
      return bool;
      long l2 = vdB[i];
      if (System.currentTimeMillis() - l1 > l2)
      {
        AppMethodBeat.o(27439);
        bool = false;
      }
      else if (System.currentTimeMillis() - l1 < 0L)
      {
        ab.e("MicroMsg.UpdateUtil", "user modify mobile time. we just remove the config.");
        ah.getContext().getSharedPreferences("update_config_prefs", h.Mu()).edit().clear().commit();
        ab.i("MicroMsg.UpdateUtil", "clearUpdateConfigPrefs");
        AppMethodBeat.o(27439);
      }
      else
      {
        AppMethodBeat.o(27439);
      }
    }
  }

  public static boolean dhX()
  {
    boolean bool1 = false;
    AppMethodBeat.i(27440);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("update_config_prefs", h.Mu());
    long l = localSharedPreferences.getLong("update_downloading_in_silence", 0L);
    boolean bool2 = localSharedPreferences.getBoolean("update_download_start_one_immediate", false);
    ab.i("MicroMsg.UpdateUtil", "hasUnfinishDownloadingInSilence unfinish %s", new Object[] { Long.valueOf(l) });
    if ((bool2) || ((l != 0L) && (System.currentTimeMillis() - l > 3600000L)))
    {
      AppMethodBeat.o(27440);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(27440);
    }
  }

  // ERROR //
  public static com.tencent.mm.protocal.protobuf.che dhY()
  {
    // Byte code:
    //   0: sipush 27444
    //   3: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 67	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   9: ldc 173
    //   11: invokestatic 75	com/tencent/mm/compatible/util/h:Mu	()I
    //   14: invokevirtual 81	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   17: getstatic 23	com/tencent/mm/pluginsdk/f/i:nus	Ljava/lang/String;
    //   20: ldc 33
    //   22: invokeinterface 89 3 0
    //   27: astore_0
    //   28: aload_0
    //   29: invokestatic 179	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   32: ifne +78 -> 110
    //   35: new 181	com/tencent/mm/protocal/protobuf/che
    //   38: astore_1
    //   39: aload_1
    //   40: invokespecial 183	com/tencent/mm/protocal/protobuf/che:<init>	()V
    //   43: aload_1
    //   44: aload_0
    //   45: iconst_0
    //   46: invokestatic 189	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   49: invokevirtual 193	com/tencent/mm/protocal/protobuf/che:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   52: checkcast 181	com/tencent/mm/protocal/protobuf/che
    //   55: astore_0
    //   56: aload_0
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull +29 -> 88
    //   62: sipush 27444
    //   65: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: aload_1
    //   69: areturn
    //   70: astore_0
    //   71: aconst_null
    //   72: astore_1
    //   73: ldc 108
    //   75: aload_0
    //   76: ldc 195
    //   78: iconst_0
    //   79: anewarray 4	java/lang/Object
    //   82: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: goto -27 -> 58
    //   88: ldc 108
    //   90: ldc 201
    //   92: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: sipush 27444
    //   98: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: aconst_null
    //   102: astore_1
    //   103: goto -35 -> 68
    //   106: astore_0
    //   107: goto -34 -> 73
    //   110: aconst_null
    //   111: astore_1
    //   112: goto -54 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   35	43	70	java/lang/Exception
    //   43	56	106	java/lang/Exception
  }

  public static boolean dhZ()
  {
    boolean bool = true;
    AppMethodBeat.i(27445);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("tinker_patch_share_config", h.Mu());
    long l1 = localSharedPreferences.getLong(nut, 0L);
    int i = localSharedPreferences.getInt(nuu, 0);
    long l2 = System.currentTimeMillis();
    ab.d("MicroMsg.UpdateUtil", "isNeedShowTinkerDialog now:%d last:%d time:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(i) });
    if ((l2 - l1 > 21600000L) && (i < 3))
      AppMethodBeat.o(27445);
    while (true)
    {
      return bool;
      AppMethodBeat.o(27445);
      bool = false;
    }
  }

  public static void dia()
  {
    AppMethodBeat.i(27446);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("tinker_patch_share_config", h.Mu());
    localSharedPreferences.edit().putLong(nut, System.currentTimeMillis()).apply();
    int i = localSharedPreferences.getInt(nuu, 0);
    localSharedPreferences.edit().putInt(nuu, i + 1).apply();
    AppMethodBeat.o(27446);
  }

  public static String en(Context paramContext)
  {
    AppMethodBeat.i(27442);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo.sourceDir;
      AppMethodBeat.o(27442);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.UpdateUtil", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(27442);
      }
    }
  }

  public static String fN(Context paramContext)
  {
    AppMethodBeat.i(27441);
    paramContext = en(paramContext);
    if ((paramContext == null) || (!new File(paramContext).exists()))
    {
      paramContext = null;
      AppMethodBeat.o(27441);
    }
    while (true)
    {
      return paramContext;
      a locala = a.cL(paramContext);
      if ((locala != null) && (locala.cdc != null))
      {
        paramContext = locala.cdc.apkMd5;
        AppMethodBeat.o(27441);
      }
      else
      {
        paramContext = g.cz(paramContext);
        AppMethodBeat.o(27441);
      }
    }
  }

  public static String[] getShortIps()
  {
    int i = 0;
    AppMethodBeat.i(27447);
    Object localObject;
    if ((ae.gii != null) && (ae.gii.length() > 0))
    {
      localObject = new String[1];
      localObject[0] = ae.gii;
      AppMethodBeat.o(27447);
    }
    while (true)
    {
      return localObject;
      localObject = ah.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
      if ((localObject != null) && (((String)localObject).length() > 0));
      while (true)
      {
        List localList = o.akF((String)localObject);
        localObject = new String[localList.size()];
        while (i < localList.size())
        {
          localObject[i] = ((o)localList.get(i)).nJq;
          i++;
        }
        localObject = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
      }
      AppMethodBeat.o(27447);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.i
 * JD-Core Version:    0.6.2
 */