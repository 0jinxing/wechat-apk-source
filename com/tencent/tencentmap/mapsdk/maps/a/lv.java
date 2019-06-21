package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class lv<T>
{
  private static final mj b;
  private static final lv<Object> c;
  final a<T> a;

  static
  {
    AppMethodBeat.i(100490);
    b = ml.a().c();
    c = a(new lv.1());
    AppMethodBeat.o(100490);
  }

  protected lv(a<T> parama)
  {
    this.a = parama;
  }

  public static final <T> lv<T> a()
  {
    return c;
  }

  public static final <T> lv<T> a(a<T> parama)
  {
    AppMethodBeat.i(100486);
    parama = new lv(b.a(parama));
    AppMethodBeat.o(100486);
    return parama;
  }

  public final lz a(ly<? super T> paramly)
  {
    AppMethodBeat.i(100489);
    if (paramly == null)
    {
      paramly = new IllegalArgumentException("observer can not be null");
      AppMethodBeat.o(100489);
      throw paramly;
    }
    if (this.a == null)
    {
      paramly = new IllegalStateException("onSubscribe function can not be null.");
      AppMethodBeat.o(100489);
      throw paramly;
    }
    paramly.d();
    Object localObject = paramly;
    if (!(paramly instanceof mh))
      localObject = new mh(paramly);
    try
    {
      b.a(this, this.a).a(localObject);
      paramly = b.a((lz)localObject);
      AppMethodBeat.o(100489);
      return paramly;
    }
    catch (Throwable paramly)
    {
      while (true)
      {
        mb.a(paramly);
        try
        {
          ((ly)localObject).a(b.a(paramly));
          paramly = mm.a();
          AppMethodBeat.o(100489);
        }
        catch (md paramly)
        {
          AppMethodBeat.o(100489);
          throw paramly;
        }
        catch (Throwable localThrowable)
        {
          paramly = new RuntimeException("Error occurred attempting to subscribe [" + paramly.getMessage() + "] and then again while trying to pass to onError.", localThrowable);
          b.a(paramly);
          AppMethodBeat.o(100489);
        }
      }
    }
    throw paramly;
  }

  public final void a(me<? super T> paramme)
  {
    AppMethodBeat.i(100487);
    b(paramme);
    AppMethodBeat.o(100487);
  }

  public final lz b(me<? super T> paramme)
  {
    AppMethodBeat.i(100488);
    if (paramme == null)
    {
      paramme = new IllegalArgumentException("onNext can not be null");
      AppMethodBeat.o(100488);
      throw paramme;
    }
    paramme = a(new lv.2(this, paramme));
    AppMethodBeat.o(100488);
    return paramme;
  }

  public static abstract interface a<T> extends me<ly<? super T>>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lv
 * JD-Core Version:    0.6.2
 */