package com.tencent.mm.plugin.hp.d;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.protocal.protobuf.che;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class d
{
  private static String nus = "tinker-boots-install-info";
  private static String nut = "tinker-boots-last-show";
  private static String nuu = "tinker-boots-show-time";
  private static String nuv = "";

  public static String OJ(String paramString)
  {
    AppMethodBeat.i(90693);
    paramString = bGC() + paramString + ".apk";
    AppMethodBeat.o(90693);
    return paramString;
  }

  public static void a(che paramche)
  {
    AppMethodBeat.i(90689);
    try
    {
      ah.getContext().getSharedPreferences("tinker_patch_share_config", h.Mu()).edit().putString(nus, Base64.encodeToString(paramche.toByteArray(), 0)).apply();
      ab.d("MicroMsg.UpdateUtil", "save tinker install update info.");
      AppMethodBeat.o(90689);
      return;
    }
    catch (Exception paramche)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.UpdateUtil", paramche, "", new Object[0]);
    }
  }

  public static void aC(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90688);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    localIntent.setDataAndType(Uri.fromFile(new File(paramString)), "application/vnd.android.package-archive");
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(90688);
  }

  public static void bGA()
  {
    AppMethodBeat.i(90690);
    ab.i("MicroMsg.UpdateUtil", "clearInstallUpdateInfo.");
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("tinker_patch_share_config", h.Mu());
    localSharedPreferences.edit().putString(nus, "").apply();
    localSharedPreferences.edit().putLong(nut, 0L).apply();
    localSharedPreferences.edit().putInt(nuu, 0).apply();
    AppMethodBeat.o(90690);
  }

  public static void bGB()
  {
    AppMethodBeat.i(90691);
    com.tencent.mm.sdk.g.d.xDG.execute(new d.1());
    AppMethodBeat.o(90691);
  }

  public static String bGC()
  {
    AppMethodBeat.i(90692);
    if (bo.isNullOrNil(nuv))
      nuv = com.tencent.mm.compatible.util.e.euQ + "bsdiff/";
    String str = nuv;
    AppMethodBeat.o(90692);
    return str;
  }

  public static String en(Context paramContext)
  {
    AppMethodBeat.i(90687);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo.sourceDir;
      AppMethodBeat.o(90687);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.UpdateUtil", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(90687);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.d.d
 * JD-Core Version:    0.6.2
 */