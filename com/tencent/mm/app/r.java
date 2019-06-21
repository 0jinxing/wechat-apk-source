package com.tencent.mm.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class r
{
  static final Bundle aY(Context paramContext)
  {
    AppMethodBeat.i(3240);
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      AppMethodBeat.o(3240);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SetupBaseBuildInfo", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(3240);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.r
 * JD-Core Version:    0.6.2
 */