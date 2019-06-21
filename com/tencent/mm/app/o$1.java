package com.tencent.mm.app;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.splash.d;

final class o$1
  implements d
{
  public final boolean cV(String paramString)
  {
    AppMethodBeat.i(138004);
    boolean bool = o.cW(paramString);
    AppMethodBeat.o(138004);
    return bool;
  }

  public final Activity m(Activity paramActivity)
  {
    AppMethodBeat.i(138005);
    paramActivity = o.l(paramActivity);
    AppMethodBeat.o(138005);
    return paramActivity;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.o.1
 * JD-Core Version:    0.6.2
 */