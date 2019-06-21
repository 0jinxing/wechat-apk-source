package com.bumptech.glide.c.c;

import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;

public final class m$a<A>
{
  private static final Queue<a<?>> aEo;
  private A axb;
  private int height;
  private int width;

  static
  {
    AppMethodBeat.i(92095);
    aEo = j.dn(0);
    AppMethodBeat.o(92095);
  }

  public static <A> a<A> Z(A paramA)
  {
    AppMethodBeat.i(92091);
    synchronized (aEo)
    {
      a locala = (a)aEo.poll();
      ??? = locala;
      if (locala == null)
        ??? = new a();
      ((a)???).axb = paramA;
      ((a)???).width = 0;
      ((a)???).height = 0;
      AppMethodBeat.o(92091);
      return ???;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(92093);
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      if ((this.width == paramObject.width) && (this.height == paramObject.height) && (this.axb.equals(paramObject.axb)))
      {
        bool = true;
        AppMethodBeat.o(92093);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(92093);
      continue;
      AppMethodBeat.o(92093);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92094);
    int i = this.height;
    int j = this.width;
    int k = this.axb.hashCode();
    AppMethodBeat.o(92094);
    return (i * 31 + j) * 31 + k;
  }

  public final void release()
  {
    AppMethodBeat.i(92092);
    synchronized (aEo)
    {
      aEo.offer(this);
      AppMethodBeat.o(92092);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.m.a
 * JD-Core Version:    0.6.2
 */