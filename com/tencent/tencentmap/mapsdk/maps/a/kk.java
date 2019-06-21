package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class kk<T, S extends kt>
{
  private final kj<T, S> a;
  private final int b;

  kk(kj<T, S> paramkj, int paramInt)
  {
    this.a = paramkj;
    this.b = paramInt;
  }

  final kj<T, S> a()
  {
    return this.a;
  }

  final int b()
  {
    return this.b;
  }

  final kk<T, S> c()
  {
    AppMethodBeat.i(100235);
    kk localkk = new kk(this.a, this.b + 1);
    AppMethodBeat.o(100235);
    return localkk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kk
 * JD-Core Version:    0.6.2
 */