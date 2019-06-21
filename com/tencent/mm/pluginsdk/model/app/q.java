package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.pluginsdk.permission.a;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.pluginsdk.permission.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.k;
import java.io.File;

public final class q
{
  private static void a(Context paramContext, Intent paramIntent, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(79352);
    ab.i("MicroMsg.ApplicationUtil", "installApp");
    if ((paramBoolean) && (Build.BRAND.equals("vivo")))
    {
      paramIntent.putExtra("installDir", true);
      ab.i("MicroMsg.ApplicationUtil", "is vivo, try to prevent the interception");
    }
    try
    {
      if ((Build.VERSION.SDK_INT >= 26) && (!paramContext.getPackageManager().canRequestPackageInstalls()))
      {
        ab.i("MicroMsg.ApplicationUtil", "request install apk permission");
        Intent localIntent = new android/content/Intent;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("package:");
        localIntent.<init>("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse(paramContext.getPackageName()));
        String str1 = ah.getContext().getString(2131301936);
        String str2 = ah.getContext().getString(2131300626);
        localObject = new com/tencent/mm/pluginsdk/model/app/q$1;
        ((q.1)localObject).<init>(paramContext, paramIntent, parama);
        b.a(localIntent, str1, str2, (d)localObject);
        AppMethodBeat.o(79352);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.ApplicationUtil", "install directly");
        paramContext.startActivity(paramIntent);
        if (parama != null)
          parama.dT(true);
        AppMethodBeat.o(79352);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ApplicationUtil", paramContext, "install app failed! %s", new Object[] { paramIntent });
        if (parama != null)
          parama.dT(false);
      }
    }
  }

  public static void a(Context paramContext, Uri paramUri, a parama)
  {
    AppMethodBeat.i(79354);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    k.a(paramContext, localIntent, paramUri, "application/vnd.android.package-archive");
    localIntent.addFlags(268435456);
    a(paramContext, localIntent, parama, false);
    AppMethodBeat.o(79354);
  }

  public static void a(Context paramContext, File paramFile, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(79353);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    k.a(paramContext, localIntent, paramFile, "application/vnd.android.package-archive");
    localIntent.addFlags(268435456);
    a(paramContext, localIntent, parama, paramBoolean);
    AppMethodBeat.o(79353);
  }

  public static String aiQ(String paramString)
  {
    AppMethodBeat.i(79351);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString.toLowerCase());
    localStringBuffer.append("mMHc ItnStR");
    paramString = g.x(localStringBuffer.toString().getBytes());
    AppMethodBeat.o(79351);
    return paramString;
  }

  public static String aiR(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(79358);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(79358);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = ah.getContext().getPackageManager();
      try
      {
        localObject2 = ((PackageManager)localObject2).getPackageArchiveInfo(paramString, 0);
        if (localObject2 != null)
          break label94;
        localObject2 = new java/lang/RuntimeException;
        ((RuntimeException)localObject2).<init>("info is null; ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(79358);
        throw ((Throwable)localObject2);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.ApplicationUtil", "get package name from archive file path, failed : %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(79358);
        paramString = localObject1;
      }
      continue;
      label94: ab.i("MicroMsg.ApplicationUtil", "get package name from archive filepath  :%s, package name is : %s", new Object[] { paramString, ((PackageInfo)localObject2).packageName });
      paramString = ((PackageInfo)localObject2).packageName;
      AppMethodBeat.o(79358);
    }
  }

  public static int aiS(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(79359);
    int j;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(79359);
      j = i;
    }
    while (true)
    {
      return j;
      Object localObject = ah.getContext().getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getPackageArchiveInfo(paramString, 0);
        if (localObject != null)
          break label94;
        localObject = new java/lang/RuntimeException;
        ((RuntimeException)localObject).<init>("info is null; ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(79359);
        throw ((Throwable)localObject);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.ApplicationUtil", "get package version code from archive file path, failed : %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(79359);
        j = i;
      }
      continue;
      label94: ab.i("MicroMsg.ApplicationUtil", "get package version code from archive filepath  :%s, package version code is : %d", new Object[] { paramString, Integer.valueOf(((PackageInfo)localObject).versionCode) });
      j = ((PackageInfo)localObject).versionCode;
      AppMethodBeat.o(79359);
    }
  }

  public static boolean by(Context paramContext, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(79355);
    Uri localUri = Uri.parse(paramString);
    Intent localIntent = new Intent("android.intent.action.VIEW", localUri);
    localIntent.addFlags(268435456);
    if (getPackageInfo(paramContext, "com.android.vending") != null)
    {
      ab.v("MicroMsg.ApplicationUtil", "installAppWithGP, gp is installed, url = %s", new Object[] { paramString });
      localIntent.setPackage("com.android.vending");
    }
    try
    {
      while (true)
      {
        paramContext.startActivity(localIntent);
        AppMethodBeat.o(79355);
        return bool;
        ab.v("MicroMsg.ApplicationUtil", "installAppWithGP, gp is not installed, url = %s", new Object[] { paramString });
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ApplicationUtil", "installAppWithGP first, ex = %s", new Object[] { paramString.getMessage() });
        try
        {
          paramString = new android/content/Intent;
          paramString.<init>("android.intent.action.VIEW", localUri);
          paramString.addFlags(268435456);
          paramContext.startActivity(paramString);
          AppMethodBeat.o(79355);
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.ApplicationUtil", "installAppWithGP second, ex = %s", new Object[] { paramContext.getMessage() });
          AppMethodBeat.o(79355);
          bool = false;
        }
      }
    }
  }

  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(79357);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ApplicationUtil", "getPackageInfo, packageName is null");
      AppMethodBeat.o(79357);
      paramContext = localObject2;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
        AppMethodBeat.o(79357);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        while (true)
        {
          ab.w("MicroMsg.ApplicationUtil", "app not installed, packageName = ".concat(String.valueOf(paramString)));
          paramContext = localObject1;
        }
      }
    }
  }

  public static boolean u(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79356);
    boolean bool;
    if (getPackageInfo(paramContext, paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(79356);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79356);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.q
 * JD-Core Version:    0.6.2
 */