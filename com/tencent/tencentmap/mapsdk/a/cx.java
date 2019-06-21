package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class cx
{
  private String a;
  private String b;

  public cx(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public String toString()
  {
    AppMethodBeat.i(100977);
    String str = this.a + "_" + this.b;
    AppMethodBeat.o(100977);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cx
 * JD-Core Version:    0.6.2
 */