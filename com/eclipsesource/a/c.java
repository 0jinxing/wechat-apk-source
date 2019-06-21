package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c extends h
{
  private final boolean aLn;
  private final boolean aLo;
  private final boolean aLp;
  private final String value;

  c(String paramString)
  {
    AppMethodBeat.i(70518);
    this.value = paramString;
    this.aLn = "null".equals(paramString);
    this.aLo = "true".equals(paramString);
    this.aLp = "false".equals(paramString);
    AppMethodBeat.o(70518);
  }

  final void a(i parami)
  {
    AppMethodBeat.i(70519);
    parami.an(this.value);
    AppMethodBeat.o(70519);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(70522);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(70522);
    }
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(70522);
      }
      else if (getClass() != paramObject.getClass())
      {
        AppMethodBeat.o(70522);
      }
      else
      {
        paramObject = (c)paramObject;
        bool = this.value.equals(paramObject.value);
        AppMethodBeat.o(70522);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70520);
    int i = this.value.hashCode();
    AppMethodBeat.o(70520);
    return i;
  }

  public final boolean isBoolean()
  {
    if ((this.aLo) || (this.aLp));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean oO()
  {
    AppMethodBeat.i(70521);
    boolean bool;
    if (this.aLn)
    {
      bool = super.oO();
      AppMethodBeat.o(70521);
    }
    while (true)
    {
      return bool;
      bool = this.aLo;
      AppMethodBeat.o(70521);
    }
  }

  public final String toString()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.c
 * JD-Core Version:    0.6.2
 */