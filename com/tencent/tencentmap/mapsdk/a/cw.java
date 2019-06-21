package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class cw
{
  private String a;
  private String b;
  private int c;
  private List<cy> d;

  public cw(String paramString1, String paramString2, List<cy> paramList, int paramInt)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.d = paramList;
    this.c = paramInt;
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final List<cy> c()
  {
    return this.d;
  }

  public final int d()
  {
    return this.c;
  }

  public final String toString()
  {
    AppMethodBeat.i(100976);
    String str;
    if ((this.a == null) || (this.d == null) || (this.d.size() <= this.c))
    {
      str = "";
      AppMethodBeat.o(100976);
    }
    while (true)
    {
      return str;
      str = this.a + "_" + ((cy)this.d.get(this.c)).a();
      AppMethodBeat.o(100976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cw
 * JD-Core Version:    0.6.2
 */