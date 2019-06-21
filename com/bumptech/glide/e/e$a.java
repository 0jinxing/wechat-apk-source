package com.bumptech.glide.e;

import com.bumptech.glide.c.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a<T, R>
{
  final Class<R> aAf;
  private final Class<T> aBd;
  final k<T, R> aES;

  public e$a(Class<T> paramClass, Class<R> paramClass1, k<T, R> paramk)
  {
    this.aBd = paramClass;
    this.aAf = paramClass1;
    this.aES = paramk;
  }

  public final boolean e(Class<?> paramClass1, Class<?> paramClass2)
  {
    AppMethodBeat.i(92440);
    boolean bool;
    if ((this.aBd.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.aAf)))
    {
      bool = true;
      AppMethodBeat.o(92440);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92440);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e.e.a
 * JD-Core Version:    0.6.2
 */