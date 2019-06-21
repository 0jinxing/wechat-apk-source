package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$b
{
  private final h aLw;
  private final String name;

  e$b(String paramString, h paramh)
  {
    this.name = paramString;
    this.aLw = paramh;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70538);
    if (this == paramObject)
      AppMethodBeat.o(70538);
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(70538);
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        AppMethodBeat.o(70538);
        bool = false;
      }
      else
      {
        paramObject = (b)paramObject;
        if ((this.name.equals(paramObject.name)) && (this.aLw.equals(paramObject.aLw)))
        {
          AppMethodBeat.o(70538);
        }
        else
        {
          AppMethodBeat.o(70538);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70537);
    int i = this.name.hashCode();
    int j = this.aLw.hashCode();
    AppMethodBeat.o(70537);
    return (i + 31) * 31 + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.e.b
 * JD-Core Version:    0.6.2
 */