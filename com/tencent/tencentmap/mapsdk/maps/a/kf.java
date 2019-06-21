package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class kf
{
  private final int a;
  private final int b;
  private final kq c;
  private final ko d;

  public kf(int paramInt1, int paramInt2, ko paramko, kq paramkq)
  {
    AppMethodBeat.i(100218);
    if ((paramkq == null) || (paramko == null) || (paramInt2 <= 2) || (paramInt1 <= 0) || (paramInt1 >= paramInt2))
    {
      paramko = new IllegalArgumentException();
      AppMethodBeat.o(100218);
      throw paramko;
    }
    this.d = paramko;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramkq;
    AppMethodBeat.o(100218);
  }

  public final int a()
  {
    return this.a;
  }

  public final int b()
  {
    return this.b;
  }

  public final kq c()
  {
    return this.c;
  }

  public final ko d()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kf
 * JD-Core Version:    0.6.2
 */