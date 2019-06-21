package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

public final class ke
{
  public static final Comparator<kw<?>> a;
  public static final Comparator<kw<?>> b;

  static
  {
    AppMethodBeat.i(100217);
    a = a(kh.a);
    b = new Comparator()
    {
      public final int a(kw<?> paramAnonymouskw1, kw<?> paramAnonymouskw2)
      {
        AppMethodBeat.i(100207);
        int i = Float.valueOf(paramAnonymouskw1.c()).compareTo(Float.valueOf(paramAnonymouskw2.c()));
        AppMethodBeat.o(100207);
        return i;
      }
    };
    AppMethodBeat.o(100217);
  }

  public static <T extends kv> Comparator<kv> a(ky paramky)
  {
    AppMethodBeat.i(100213);
    paramky = a(kh.a(paramky));
    AppMethodBeat.o(100213);
    return paramky;
  }

  public static <R, T extends Comparable<T>> Comparator<R> a(mf<R, T> parammf)
  {
    AppMethodBeat.i(100215);
    parammf = new ke.3(parammf);
    AppMethodBeat.o(100215);
    return parammf;
  }

  public static <T> Comparator<T> a(Comparator<T>[] paramArrayOfComparator)
  {
    AppMethodBeat.i(100216);
    paramArrayOfComparator = new ke.4(paramArrayOfComparator);
    AppMethodBeat.o(100216);
    return paramArrayOfComparator;
  }

  public static Comparator<kv> b(ky paramky)
  {
    AppMethodBeat.i(100214);
    paramky = new ke.2(paramky);
    AppMethodBeat.o(100214);
    return paramky;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ke
 * JD-Core Version:    0.6.2
 */