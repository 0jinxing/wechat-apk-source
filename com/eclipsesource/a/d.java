package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d extends h
{
  private final String string;

  d(String paramString)
  {
    AppMethodBeat.i(70523);
    if (paramString == null)
    {
      paramString = new NullPointerException("string is null");
      AppMethodBeat.o(70523);
      throw paramString;
    }
    this.string = paramString;
    AppMethodBeat.o(70523);
  }

  final void a(i parami)
  {
    AppMethodBeat.i(70524);
    parami.ao(this.string);
    AppMethodBeat.o(70524);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(70529);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(70529);
    }
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(70529);
      }
      else if (getClass() != paramObject.getClass())
      {
        AppMethodBeat.o(70529);
      }
      else
      {
        paramObject = (d)paramObject;
        bool = this.string.equals(paramObject.string);
        AppMethodBeat.o(70529);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70528);
    int i = this.string.hashCode();
    AppMethodBeat.o(70528);
    return i;
  }

  public final boolean isNumber()
  {
    return true;
  }

  public final int oP()
  {
    AppMethodBeat.i(70525);
    int i = Integer.parseInt(this.string, 10);
    AppMethodBeat.o(70525);
    return i;
  }

  public final long oQ()
  {
    AppMethodBeat.i(70526);
    long l = Long.parseLong(this.string, 10);
    AppMethodBeat.o(70526);
    return l;
  }

  public final double oR()
  {
    AppMethodBeat.i(70527);
    double d = Double.parseDouble(this.string);
    AppMethodBeat.o(70527);
    return d;
  }

  public final String toString()
  {
    return this.string;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.d
 * JD-Core Version:    0.6.2
 */