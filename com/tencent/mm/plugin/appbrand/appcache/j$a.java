package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.a;

public enum j$a
{
  public static boolean kR(int paramInt)
  {
    AppMethodBeat.i(101718);
    boolean bool = a.contains(j.gSv, paramInt);
    AppMethodBeat.o(101718);
    return bool;
  }

  public static boolean np(int paramInt)
  {
    AppMethodBeat.i(101717);
    boolean bool = a.contains(j.gSu, paramInt);
    AppMethodBeat.o(101717);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.j.a
 * JD-Core Version:    0.6.2
 */