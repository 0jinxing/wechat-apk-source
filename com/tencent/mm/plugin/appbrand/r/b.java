package com.tencent.mm.plugin.appbrand.r;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(91136);
    if (paramString == null)
    {
      ab.e("Luggage.AndroidPackageUtil", "getPackageInfo fail, packageName is null");
      AppMethodBeat.o(91136);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
        AppMethodBeat.o(91136);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.printErrStackTrace("Luggage.AndroidPackageUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(91136);
        paramContext = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.b
 * JD-Core Version:    0.6.2
 */