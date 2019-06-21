package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface n
{
  public static enum a
  {
    static
    {
      AppMethodBeat.i(101782);
      gXV = new a("NONE", 0);
      gXW = new a("UNKNOWN", 1);
      gXX = new a("MISSING_PARAMS", 2);
      gXY = new a("NO_SUCH_KEY", 3);
      gXZ = new a("QUOTA_REACHED", 4);
      gYa = new a[] { gXV, gXW, gXX, gXY, gXZ };
      AppMethodBeat.o(101782);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.n
 * JD-Core Version:    0.6.2
 */