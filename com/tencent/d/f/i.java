package com.tencent.d.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.d.e.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  public static a cd(Context paramContext, String paramString)
  {
    AppMethodBeat.i(114621);
    a locala = new a();
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      locala.ceO = paramString;
      locala.versionName = paramContext.versionName;
      locala.versionCode = paramContext.versionCode;
      label45: AppMethodBeat.o(114621);
      return locala;
    }
    catch (Throwable paramContext)
    {
      break label45;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.i
 * JD-Core Version:    0.6.2
 */