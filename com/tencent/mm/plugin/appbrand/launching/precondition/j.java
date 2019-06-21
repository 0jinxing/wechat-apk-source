package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.backgroundfetch.b;
import com.tencent.mm.plugin.appbrand.backgroundfetch.g;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.launching.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class j
{
  static String Co(String paramString)
  {
    AppMethodBeat.i(132082);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(132082);
    }
    while (true)
    {
      return paramString;
      ComponentName localComponentName = new ComponentName(ah.getContext(), paramString);
      PackageManager localPackageManager = ah.getContext().getPackageManager();
      if (localPackageManager == null)
      {
        paramString = "";
        AppMethodBeat.o(132082);
      }
      else
      {
        try
        {
          paramString = localPackageManager.getActivityInfo(localComponentName, 128);
          if (paramString == null)
          {
            paramString = "";
            AppMethodBeat.o(132082);
          }
          else
          {
            paramString = paramString.processName;
            AppMethodBeat.o(132082);
          }
        }
        catch (PackageManager.NameNotFoundException paramString)
        {
          try
          {
            paramString = localPackageManager.getServiceInfo(localComponentName, 128);
            if (paramString == null)
            {
              paramString = "";
              AppMethodBeat.o(132082);
            }
            else
            {
              paramString = paramString.processName;
              AppMethodBeat.o(132082);
            }
          }
          catch (PackageManager.NameNotFoundException paramString)
          {
            paramString = "";
            AppMethodBeat.o(132082);
          }
        }
      }
    }
  }

  static void b(Context paramContext, AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(132083);
    ab.i("MicroMsg.AppBrand.PreconditionUtil", "startAppOnInitConfigGot, %s", new Object[] { paramAppBrandInitConfigWC });
    if (b.a(paramAppBrandInitConfigWC))
      b.a(paramAppBrandInitConfigWC.appId, paramAppBrandInitConfigWC.username, paramAppBrandInitConfigWC.gVs, paramAppBrandInitConfigWC.hgC, paramAppBrandStatObject.scene, new g());
    c.a(paramAppBrandInitConfigWC, paramAppBrandStatObject);
    com.tencent.mm.plugin.appbrand.launching.f.a(paramContext, paramAppBrandInitConfigWC, paramAppBrandStatObject);
    com.tencent.mm.plugin.appbrand.config.f.ayD().a(paramAppBrandInitConfigWC.username, paramAppBrandInitConfigWC);
    AppMethodBeat.o(132083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.j
 * JD-Core Version:    0.6.2
 */