package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class dt
{
  public byte[] a;
  public String b = "GBK";

  public String toString()
  {
    AppMethodBeat.i(101110);
    try
    {
      String str1 = new java/lang/String;
      str1.<init>(this.a, this.b);
      AppMethodBeat.o(101110);
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str2 = "";
        AppMethodBeat.o(101110);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dt
 * JD-Core Version:    0.6.2
 */