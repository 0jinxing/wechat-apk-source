package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class hp extends m
{
  public String a = "";
  public int b = 0;
  public String c = "";

  public hp()
  {
  }

  public hp(String paramString1, int paramInt, String paramString2)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
  }

  public final void readFrom(k paramk)
  {
    AppMethodBeat.i(99566);
    this.a = paramk.a(0, true);
    this.b = paramk.a(this.b, 1, true);
    this.c = paramk.a(2, false);
    AppMethodBeat.o(99566);
  }

  public final void writeTo(l paraml)
  {
    AppMethodBeat.i(99565);
    paraml.a(this.a, 0);
    paraml.a(this.b, 1);
    if (this.c != null)
      paraml.a(this.c, 2);
    AppMethodBeat.o(99565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hp
 * JD-Core Version:    0.6.2
 */