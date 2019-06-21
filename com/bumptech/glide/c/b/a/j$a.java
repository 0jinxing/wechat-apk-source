package com.bumptech.glide.c.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$a
  implements m
{
  private final j.b aCE;
  private Class<?> aCF;
  int size;

  j$a(j.b paramb)
  {
    this.aCE = paramb;
  }

  final void c(int paramInt, Class<?> paramClass)
  {
    this.size = paramInt;
    this.aCF = paramClass;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      bool2 = bool1;
      if (this.size == paramObject.size)
      {
        bool2 = bool1;
        if (this.aCF == paramObject.aCF)
          bool2 = true;
      }
    }
    return bool2;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91927);
    int i = this.size;
    if (this.aCF != null);
    for (int j = this.aCF.hashCode(); ; j = 0)
    {
      AppMethodBeat.o(91927);
      return j + i * 31;
    }
  }

  public final void mQ()
  {
    AppMethodBeat.i(91926);
    this.aCE.a(this);
    AppMethodBeat.o(91926);
  }

  public final String toString()
  {
    AppMethodBeat.i(91925);
    String str = "Key{size=" + this.size + "array=" + this.aCF + '}';
    AppMethodBeat.o(91925);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.j.a
 * JD-Core Version:    0.6.2
 */