package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Wrappers
{
  private static Wrappers zzabb;
  private PackageManagerWrapper zzaba = null;

  static
  {
    AppMethodBeat.i(90330);
    zzabb = new Wrappers();
    AppMethodBeat.o(90330);
  }

  public static PackageManagerWrapper packageManager(Context paramContext)
  {
    AppMethodBeat.i(90329);
    paramContext = zzabb.getPackageManagerWrapper(paramContext);
    AppMethodBeat.o(90329);
    return paramContext;
  }

  @VisibleForTesting
  public static void resetForTests()
  {
    AppMethodBeat.i(90328);
    zzabb = new Wrappers();
    AppMethodBeat.o(90328);
  }

  public static void setWrappers(Wrappers paramWrappers)
  {
    zzabb = paramWrappers;
  }

  @VisibleForTesting
  public PackageManagerWrapper getPackageManagerWrapper(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(90327);
      if (this.zzaba == null)
        if (paramContext.getApplicationContext() != null)
          break label49;
      while (true)
      {
        PackageManagerWrapper localPackageManagerWrapper = new com/google/android/gms/common/wrappers/PackageManagerWrapper;
        localPackageManagerWrapper.<init>(paramContext);
        this.zzaba = localPackageManagerWrapper;
        paramContext = this.zzaba;
        AppMethodBeat.o(90327);
        return paramContext;
        label49: paramContext = paramContext.getApplicationContext();
      }
    }
    finally
    {
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.wrappers.Wrappers
 * JD-Core Version:    0.6.2
 */