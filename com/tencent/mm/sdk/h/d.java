package com.tencent.mm.sdk.h;

import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public static boolean ha(Context paramContext)
  {
    AppMethodBeat.i(65376);
    boolean bool;
    if (paramContext == null)
    {
      bool = false;
      AppMethodBeat.o(65376);
    }
    while (true)
    {
      return bool;
      bool = paramContext.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
      AppMethodBeat.o(65376);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.h.d
 * JD-Core Version:    0.6.2
 */