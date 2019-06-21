package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class kl<T, S extends kt>
  implements kj<T, S>
{
  private final List<? extends kj<T, S>> a;
  private final ky b;
  private final kf c;

  kl(List<? extends kj<T, S>> paramList, kf paramkf)
  {
    AppMethodBeat.i(100236);
    if (paramList.isEmpty())
    {
      paramList = new IllegalArgumentException();
      AppMethodBeat.o(100236);
      throw paramList;
    }
    this.c = paramkf;
    this.a = paramList;
    this.b = ks.a(paramList);
    AppMethodBeat.o(100236);
  }

  private List<kj<T, S>> a(kw<? extends kj<T, S>> paramkw)
  {
    AppMethodBeat.i(100240);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new kl(paramkw.a().a(), this.c));
    localArrayList.add(new kl(paramkw.b().a(), this.c));
    AppMethodBeat.o(100240);
    return localArrayList;
  }

  final List<? extends kj<T, S>> a()
  {
    return this.a;
  }

  public final List<kj<T, S>> a(kg<? extends T, ? extends S> paramkg)
  {
    AppMethodBeat.i(100239);
    kj localkj = this.c.d().a(paramkg.b().a(), this.a);
    paramkg = localkj.a(paramkg);
    paramkg = ks.a(this.a, localkj, paramkg);
    if (paramkg.size() <= this.c.a())
    {
      paramkg = Collections.singletonList(new kl(paramkg, this.c));
      AppMethodBeat.o(100239);
    }
    while (true)
    {
      return paramkg;
      paramkg = a(this.c.c().a(paramkg, this.c.b()));
      AppMethodBeat.o(100239);
    }
  }

  public final void a(mf<? super kt, Boolean> parammf, ly<? super kg<T, S>> paramly)
  {
    AppMethodBeat.i(100237);
    if (!((Boolean)parammf.a(b().a())).booleanValue())
      AppMethodBeat.o(100237);
    while (true)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label92;
        kj localkj = (kj)localIterator.next();
        if (paramly.c())
        {
          AppMethodBeat.o(100237);
          break;
        }
        localkj.a(parammf, paramly);
      }
      label92: AppMethodBeat.o(100237);
    }
  }

  public final kt b()
  {
    return this.b;
  }

  public final int c()
  {
    AppMethodBeat.i(100238);
    int i = this.a.size();
    AppMethodBeat.o(100238);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kl
 * JD-Core Version:    0.6.2
 */