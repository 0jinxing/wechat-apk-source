package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class ki<T, S extends kt>
  implements kj<T, S>
{
  private final List<kg<T, S>> a;
  private final ky b;
  private final kf c;

  ki(List<kg<T, S>> paramList, kf paramkf)
  {
    AppMethodBeat.i(100230);
    this.a = paramList;
    this.c = paramkf;
    this.b = ks.a(paramList);
    AppMethodBeat.o(100230);
  }

  private List<kj<T, S>> a(kw<kg<T, S>> paramkw)
  {
    AppMethodBeat.i(100234);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new ki(paramkw.a().a(), this.c));
    localArrayList.add(new ki(paramkw.b().a(), this.c));
    AppMethodBeat.o(100234);
    return localArrayList;
  }

  final List<kg<T, S>> a()
  {
    return this.a;
  }

  public final List<kj<T, S>> a(kg<? extends T, ? extends S> paramkg)
  {
    AppMethodBeat.i(100233);
    paramkg = ks.a(this.a, paramkg);
    if (paramkg.size() <= this.c.a())
    {
      paramkg = Collections.singletonList(new ki(paramkg, this.c));
      AppMethodBeat.o(100233);
    }
    while (true)
    {
      return paramkg;
      paramkg = a(this.c.c().a(paramkg, this.c.b()));
      AppMethodBeat.o(100233);
    }
  }

  public final void a(mf<? super kt, Boolean> parammf, ly<? super kg<T, S>> paramly)
  {
    AppMethodBeat.i(100231);
    if (!((Boolean)parammf.a(b().a())).booleanValue())
      AppMethodBeat.o(100231);
    while (true)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label109;
        kg localkg = (kg)localIterator.next();
        if (paramly.c())
        {
          AppMethodBeat.o(100231);
          break;
        }
        if (((Boolean)parammf.a(localkg.b())).booleanValue())
          paramly.a(localkg);
      }
      label109: AppMethodBeat.o(100231);
    }
  }

  public final kt b()
  {
    return this.b;
  }

  public final int c()
  {
    AppMethodBeat.i(100232);
    int i = this.a.size();
    AppMethodBeat.o(100232);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ki
 * JD-Core Version:    0.6.2
 */