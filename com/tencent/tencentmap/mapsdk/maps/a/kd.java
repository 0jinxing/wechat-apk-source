package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class kd
{
  private static <T, S extends kt> a<kk<T, S>> a(mf<? super kt, Boolean> parammf, ly<? super kg<T, S>> paramly, a<kk<T, S>> parama, kk<T, S> paramkk)
  {
    AppMethodBeat.i(100204);
    kg localkg = (kg)((ki)paramkk.a()).a().get(paramkk.b());
    if (((Boolean)parammf.a(localkg.b())).booleanValue())
      paramly.a(localkg);
    for (long l = a.b(parama) - 1L; ; l = a.b(parama))
    {
      parammf = a.a(a.a(parama).d().b(paramkk.c()), l);
      AppMethodBeat.o(100204);
      return parammf;
    }
  }

  private static <S extends kt, T> kz<kk<T, S>> a(kz<kk<T, S>> paramkz)
  {
    AppMethodBeat.i(100205);
    paramkz = paramkz.d();
    if (!paramkz.b())
    {
      kk localkk = (kk)paramkz.c();
      paramkz = paramkz.d().b(localkk.c());
    }
    while (true)
    {
      AppMethodBeat.o(100205);
      return paramkz;
    }
  }

  private static <S extends kt, T> kz<kk<T, S>> a(mf<? super kt, Boolean> parammf, kz<kk<T, S>> paramkz, kk<T, S> paramkk)
  {
    AppMethodBeat.i(100206);
    kj localkj = (kj)((kl)paramkk.a()).a().get(paramkk.b());
    if (((Boolean)parammf.a(localkj.b())).booleanValue());
    for (parammf = paramkz.b(new kk(localkj, 0)); ; parammf = paramkz.d().b(paramkk.c()))
    {
      AppMethodBeat.o(100206);
      return parammf;
    }
  }

  private static <S extends kt, T> kz<kk<T, S>> a(mf<? super kt, Boolean> parammf, ly<? super kg<T, S>> paramly, a<kk<T, S>> parama)
  {
    AppMethodBeat.i(100203);
    kk localkk;
    if (!a.a(parama).b())
    {
      localkk = (kk)a.a(parama).c();
      if (paramly.c())
      {
        parammf = kz.a();
        AppMethodBeat.o(100203);
      }
    }
    while (true)
    {
      return parammf;
      if (a.b(parama) <= 0L)
      {
        parammf = a.a(parama);
        AppMethodBeat.o(100203);
      }
      else
      {
        if (localkk.b() == localkk.a().c())
        {
          parama = a.a(a(a.a(parama)), a.b(parama));
          break;
        }
        if ((localkk.a() instanceof kl))
        {
          parama = a.a(a(parammf, a.a(parama), localkk), a.b(parama));
          break;
        }
        parama = a(parammf, paramly, parama, localkk);
        break;
        parammf = a.a(parama);
        AppMethodBeat.o(100203);
      }
    }
  }

  static <T, S extends kt> kz<kk<T, S>> a(mf<? super kt, Boolean> parammf, ly<? super kg<T, S>> paramly, kz<kk<T, S>> paramkz, long paramLong)
  {
    AppMethodBeat.i(100202);
    parammf = a(parammf, paramly, a.a(paramkz, paramLong));
    AppMethodBeat.o(100202);
    return parammf;
  }

  static class a<T>
  {
    private final kz<T> a;
    private final long b;

    a(kz<T> paramkz, long paramLong)
    {
      this.a = paramkz;
      this.b = paramLong;
    }

    static <T> a<T> a(kz<T> paramkz, long paramLong)
    {
      AppMethodBeat.i(100201);
      paramkz = new a(paramkz, paramLong);
      AppMethodBeat.o(100201);
      return paramkz;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kd
 * JD-Core Version:    0.6.2
 */