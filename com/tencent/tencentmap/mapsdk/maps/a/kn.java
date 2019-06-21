package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class kn<T, S extends kt>
{
  private static final mf<kt, Boolean> d;
  private final kj<T, S> a;
  private final kf b;
  private int c;

  static
  {
    AppMethodBeat.i(100260);
    d = new mf()
    {
      public final Boolean a(kt paramAnonymouskt)
      {
        return Boolean.TRUE;
      }
    };
    AppMethodBeat.o(100260);
  }

  private kn(kf paramkf)
  {
    this(null, 0, paramkf);
  }

  private kn(kj<T, S> paramkj, int paramInt, kf paramkf)
  {
    this.a = paramkj;
    this.c = paramInt;
    this.b = paramkf;
  }

  public static kn.a a(int paramInt)
  {
    AppMethodBeat.i(100254);
    kn.a locala = new kn.a(null).a(paramInt);
    AppMethodBeat.o(100254);
    return locala;
  }

  public static mf<kt, Boolean> a(ky paramky)
  {
    AppMethodBeat.i(100258);
    paramky = new kn.1(paramky);
    AppMethodBeat.o(100258);
    return paramky;
  }

  public final kn<T, S> a(kg<? extends T, ? extends S> paramkg)
  {
    AppMethodBeat.i(100255);
    if (this.a != null)
    {
      paramkg = this.a.a(paramkg);
      if (paramkg.size() == 1)
      {
        paramkg = (kj)paramkg.get(0);
        paramkg = new kn(paramkg, this.c + 1, this.b);
        AppMethodBeat.o(100255);
      }
    }
    while (true)
    {
      return paramkg;
      paramkg = new kl(paramkg, this.b);
      break;
      ArrayList localArrayList = new ArrayList();
      Collections.addAll(localArrayList, new kg[] { paramkg });
      paramkg = new kn(new ki(localArrayList, this.b), this.c + 1, this.b);
      AppMethodBeat.o(100255);
    }
  }

  public final kn<T, S> a(T paramT, S paramS)
  {
    AppMethodBeat.i(100256);
    paramT = a(kg.a(paramT, paramS));
    AppMethodBeat.o(100256);
    return paramT;
  }

  final lv<kg<T, S>> a(mf<? super kt, Boolean> parammf)
  {
    AppMethodBeat.i(100257);
    if (this.a != null)
    {
      parammf = lv.a(new km(this.a, parammf));
      AppMethodBeat.o(100257);
    }
    while (true)
    {
      return parammf;
      parammf = lv.a();
      AppMethodBeat.o(100257);
    }
  }

  public final lv<kg<T, S>> b(ky paramky)
  {
    AppMethodBeat.i(100259);
    paramky = a(a(paramky));
    AppMethodBeat.o(100259);
    return paramky;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kn
 * JD-Core Version:    0.6.2
 */