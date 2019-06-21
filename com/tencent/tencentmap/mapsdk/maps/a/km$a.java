package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicLong;

class km$a<T, S extends kt>
  implements lx
{
  private final ly<? super kg<T, S>> a;
  private final kj<T, S> b;
  private final mf<? super kt, Boolean> c;
  private volatile kz<kk<T, S>> d;
  private final AtomicLong e;

  km$a(kj<T, S> paramkj, mf<? super kt, Boolean> parammf, ly<? super kg<T, S>> paramly)
  {
    AppMethodBeat.i(100241);
    this.e = new AtomicLong(0L);
    this.b = paramkj;
    this.c = parammf;
    this.a = paramly;
    this.d = kz.a(new kk(paramkj, 0));
    AppMethodBeat.o(100241);
  }

  private void a()
  {
    AppMethodBeat.i(100243);
    this.e.set(9223372036854775807L);
    this.b.a(this.c, this.a);
    if (!this.a.c())
      this.a.a();
    AppMethodBeat.o(100243);
  }

  private void b(long paramLong)
  {
    AppMethodBeat.i(100244);
    if (this.e.getAndAdd(paramLong) == 0L);
    while (true)
    {
      paramLong = this.e.get();
      this.d = kd.a(this.c, this.a, this.d, paramLong);
      if (this.d.b())
      {
        if (!this.a.c())
          this.a.a();
        else
          AppMethodBeat.o(100244);
      }
      else
        while (true)
        {
          return;
          if (this.e.addAndGet(-paramLong) != 0L)
            break;
          AppMethodBeat.o(100244);
          continue;
          AppMethodBeat.o(100244);
        }
    }
  }

  public void a(long paramLong)
  {
    AppMethodBeat.i(100242);
    if (paramLong != 0L);
    try
    {
      long l = this.e.get();
      if (l == 9223372036854775807L)
        AppMethodBeat.o(100242);
      while (true)
      {
        return;
        if (paramLong != 9223372036854775807L)
          break;
        a();
        AppMethodBeat.o(100242);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        this.a.a(localRuntimeException);
        AppMethodBeat.o(100242);
        continue;
        b(paramLong);
        AppMethodBeat.o(100242);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.km.a
 * JD-Core Version:    0.6.2
 */