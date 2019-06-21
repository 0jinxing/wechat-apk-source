package com.bumptech.glide.h.a;

import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import android.support.v4.f.k.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class a
{
  private static final a.d<Object> aIi;

  static
  {
    AppMethodBeat.i(92625);
    aIi = new a.1();
    AppMethodBeat.o(92625);
  }

  public static <T extends a.c> k.a<T> a(int paramInt, a.a<T> parama)
  {
    AppMethodBeat.i(92621);
    parama = a(new k.c(paramInt), parama);
    AppMethodBeat.o(92621);
    return parama;
  }

  private static <T extends a.c> k.a<T> a(k.a<T> parama, a.a<T> parama1)
  {
    AppMethodBeat.i(92623);
    parama = a(parama, parama1, aIi);
    AppMethodBeat.o(92623);
    return parama;
  }

  private static <T> k.a<T> a(k.a<T> parama, a.a<T> parama1, a.d<T> paramd)
  {
    AppMethodBeat.i(92624);
    parama = new a.b(parama, parama1, paramd);
    AppMethodBeat.o(92624);
    return parama;
  }

  public static <T extends a.c> k.a<T> a(a.a<T> parama)
  {
    AppMethodBeat.i(92620);
    parama = a(new k.b(150), parama);
    AppMethodBeat.o(92620);
    return parama;
  }

  public static <T> k.a<List<T>> op()
  {
    AppMethodBeat.i(92622);
    k.a locala = a(new k.c(20), new a.2(), new a.3());
    AppMethodBeat.o(92622);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.a.a
 * JD-Core Version:    0.6.2
 */