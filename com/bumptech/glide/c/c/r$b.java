package com.bumptech.glide.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$b<Model, Data>
{
  final Class<Data> aBd;
  private final Class<Model> aEE;
  final o<? extends Model, ? extends Data> aEF;

  public r$b(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo)
  {
    this.aEE = paramClass;
    this.aBd = paramClass1;
    this.aEF = paramo;
  }

  public final boolean t(Class<?> paramClass)
  {
    AppMethodBeat.i(92118);
    boolean bool = this.aEE.isAssignableFrom(paramClass);
    AppMethodBeat.o(92118);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.r.b
 * JD-Core Version:    0.6.2
 */