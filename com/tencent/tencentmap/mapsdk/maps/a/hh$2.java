package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

class hh$2
  implements Runnable
{
  hh$2(hh paramhh, byte[] paramArrayOfByte, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(99532);
    try
    {
      if (this.a == null)
        hh.a(this.c).c(this.b);
      hh.a(this.c).a(this.b, this.a);
      AppMethodBeat.o(99532);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(99532);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hh.2
 * JD-Core Version:    0.6.2
 */