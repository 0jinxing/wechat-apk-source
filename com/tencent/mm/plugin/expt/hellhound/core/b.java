package com.tencent.mm.plugin.expt.hellhound.core;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.regex.Pattern;

public final class b
{
  public static boolean KN(String paramString)
  {
    AppMethodBeat.i(73346);
    boolean bool = Pattern.matches("^(" + "com.tencent.mm.plugin.appbrand.ui.AppBrandUI" + ")[0-9]*$", paramString);
    AppMethodBeat.o(73346);
    return bool;
  }

  public static boolean bqo()
  {
    AppMethodBeat.i(73345);
    Context localContext = ah.getContext();
    String str = ((h)com.tencent.mm.kernel.g.RM().Rn()).eHT;
    boolean bool;
    if (str == null)
    {
      bool = false;
      AppMethodBeat.o(73345);
    }
    while (true)
    {
      return bool;
      bool = localContext.getPackageName().equals(str);
      AppMethodBeat.o(73345);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.b
 * JD-Core Version:    0.6.2
 */