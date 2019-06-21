package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cp$a
{
  private db a;
  private float b;
  private float c = 1.4E-45F;
  private float d = 1.4E-45F;

  public final a a(float paramFloat)
  {
    this.b = paramFloat;
    return this;
  }

  public final a a(db paramdb)
  {
    this.a = paramdb;
    return this;
  }

  public final cp a()
  {
    AppMethodBeat.i(100951);
    cp localcp = new cp(this.a, this.b, this.c, this.d);
    AppMethodBeat.o(100951);
    return localcp;
  }

  public final a b(float paramFloat)
  {
    this.c = paramFloat;
    return this;
  }

  public final a c(float paramFloat)
  {
    this.d = paramFloat;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cp.a
 * JD-Core Version:    0.6.2
 */