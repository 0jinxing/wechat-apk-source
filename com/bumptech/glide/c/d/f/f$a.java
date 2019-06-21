package com.bumptech.glide.c.d.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$a<Z, R>
{
  final e<Z, R> aBf;
  private final Class<Z> aGt;
  private final Class<R> aGu;

  f$a(Class<Z> paramClass, Class<R> paramClass1, e<Z, R> parame)
  {
    this.aGt = paramClass;
    this.aGu = paramClass1;
    this.aBf = parame;
  }

  public final boolean e(Class<?> paramClass1, Class<?> paramClass2)
  {
    AppMethodBeat.i(92365);
    boolean bool;
    if ((this.aGt.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.aGu)))
    {
      bool = true;
      AppMethodBeat.o(92365);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92365);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.f.f.a
 * JD-Core Version:    0.6.2
 */