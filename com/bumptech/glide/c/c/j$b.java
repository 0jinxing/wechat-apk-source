package com.bumptech.glide.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$b
  implements i
{
  private final String value;

  j$b(String paramString)
  {
    this.value = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(92078);
    boolean bool;
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      bool = this.value.equals(paramObject.value);
      AppMethodBeat.o(92078);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92078);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92079);
    int i = this.value.hashCode();
    AppMethodBeat.o(92079);
    return i;
  }

  public final String nh()
  {
    return this.value;
  }

  public final String toString()
  {
    AppMethodBeat.i(92077);
    String str = "StringHeaderFactory{value='" + this.value + '\'' + '}';
    AppMethodBeat.o(92077);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.j.b
 * JD-Core Version:    0.6.2
 */