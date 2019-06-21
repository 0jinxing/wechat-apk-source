package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g extends h
{
  private final String string;

  g(String paramString)
  {
    AppMethodBeat.i(70580);
    if (paramString == null)
    {
      paramString = new NullPointerException("string is null");
      AppMethodBeat.o(70580);
      throw paramString;
    }
    this.string = paramString;
    AppMethodBeat.o(70580);
  }

  final void a(i parami)
  {
    AppMethodBeat.i(70581);
    parami.writeString(this.string);
    AppMethodBeat.o(70581);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(70583);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(70583);
    }
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(70583);
      }
      else if (getClass() != paramObject.getClass())
      {
        AppMethodBeat.o(70583);
      }
      else
      {
        paramObject = (g)paramObject;
        bool = this.string.equals(paramObject.string);
        AppMethodBeat.o(70583);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70582);
    int i = this.string.hashCode();
    AppMethodBeat.o(70582);
    return i;
  }

  public final boolean isString()
  {
    return true;
  }

  public final String pq()
  {
    return this.string;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.g
 * JD-Core Version:    0.6.2
 */