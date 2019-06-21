package com.tencent.mm.compatible.util;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class l
{
  public static boolean IN()
  {
    AppMethodBeat.i(93105);
    boolean bool;
    if (bo.bc(Build.MANUFACTURER, "").toLowerCase().indexOf("samsung".toLowerCase()) >= 0)
    {
      bool = true;
      AppMethodBeat.o(93105);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(93105);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.l
 * JD-Core Version:    0.6.2
 */