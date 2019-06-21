package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class km<T, S extends kt>
  implements lv.a<kg<T, S>>
{
  private final kj<T, S> a;
  private final mf<? super kt, Boolean> b;

  km(kj<T, S> paramkj, mf<? super kt, Boolean> parammf)
  {
    this.a = paramkj;
    this.b = parammf;
  }

  public final void a(ly<? super kg<T, S>> paramly)
  {
    AppMethodBeat.i(100245);
    paramly.a(new km.a(this.a, this.b, paramly));
    AppMethodBeat.o(100245);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.km
 * JD-Core Version:    0.6.2
 */