package com.tencent.xweb;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.b.b;

public final class c
{
  private static c ALT;
  static b.b ALU;

  private c(Context paramContext)
  {
    AppMethodBeat.i(3803);
    if (ALU != null)
      ALU.init(paramContext);
    AppMethodBeat.o(3803);
  }

  public static c dTT()
  {
    try
    {
      AppMethodBeat.i(3802);
      if (ALT == null)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
        AppMethodBeat.o(3802);
        throw localIllegalStateException;
      }
    }
    finally
    {
    }
    c localc = ALT;
    AppMethodBeat.o(3802);
    return localc;
  }

  public static c jx(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(3801);
      if (ALT == null)
      {
        c localc = new com/tencent/xweb/c;
        localc.<init>(paramContext.getApplicationContext());
        ALT = localc;
      }
      paramContext = ALT;
      AppMethodBeat.o(3801);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void sync()
  {
    AppMethodBeat.i(3804);
    if (ALU != null)
      ALU.sync();
    AppMethodBeat.o(3804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.c
 * JD-Core Version:    0.6.2
 */