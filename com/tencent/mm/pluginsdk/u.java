package com.tencent.mm.pluginsdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class u
{
  private static boolean vaB = false;
  public String mTag = "";
  public boolean vaA = false;

  public u(String paramString)
  {
    this.mTag = paramString;
  }

  public static void dgS()
  {
    vaB = true;
  }

  public final boolean cM(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(105838);
    if (vaB)
    {
      ab.i("MicroMsg.SplashOptimizing", "[%s], check cancel", new Object[] { this.mTag });
      AppMethodBeat.o(105838);
    }
    while (true)
    {
      return bool;
      if (this.vaA)
      {
        ab.i("MicroMsg.SplashOptimizing", "[%s], recreate activity, skip this %s", new Object[] { this.mTag, paramString });
        AppMethodBeat.o(105838);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(105838);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.u
 * JD-Core Version:    0.6.2
 */