package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public final class kz<T>
  implements Iterable<T>
{
  private static kz<?> c;
  private final T a;
  private final kz<T> b;

  static
  {
    AppMethodBeat.i(100296);
    c = new kz();
    AppMethodBeat.o(100296);
  }

  public kz()
  {
    this(null, null);
  }

  public kz(T paramT, kz<T> paramkz)
  {
    this.a = paramT;
    this.b = paramkz;
  }

  public static <S> kz<S> a()
  {
    return c;
  }

  public static <T> kz<T> a(T paramT)
  {
    AppMethodBeat.i(100293);
    paramT = new kz(paramT, a());
    AppMethodBeat.o(100293);
    return paramT;
  }

  public final kz<T> b(T paramT)
  {
    AppMethodBeat.i(100294);
    paramT = new kz(paramT, this);
    AppMethodBeat.o(100294);
    return paramT;
  }

  public final boolean b()
  {
    if (this.a == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final T c()
  {
    return this.a;
  }

  public final kz<T> d()
  {
    return this.b;
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(100295);
    kz.a locala = new kz.a(this);
    AppMethodBeat.o(100295);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kz
 * JD-Core Version:    0.6.2
 */