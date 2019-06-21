package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dc
{
  public final db a;
  public final db b;

  public dc(db paramdb1, db paramdb2)
  {
    this.a = paramdb1;
    this.b = paramdb2;
  }

  static double a(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(100996);
    paramDouble1 = c(paramDouble1, paramDouble2);
    AppMethodBeat.o(100996);
    return paramDouble1;
  }

  public static dc.a a()
  {
    AppMethodBeat.i(100994);
    dc.a locala = new dc.a();
    AppMethodBeat.o(100994);
    return locala;
  }

  static double b(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(100997);
    paramDouble1 = d(paramDouble1, paramDouble2);
    AppMethodBeat.o(100997);
    return paramDouble1;
  }

  private static double c(double paramDouble1, double paramDouble2)
  {
    return (paramDouble1 - paramDouble2 + 360.0D) % 360.0D;
  }

  private static double d(double paramDouble1, double paramDouble2)
  {
    return (paramDouble2 - paramDouble1 + 360.0D) % 360.0D;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(100995);
    if (this == paramObject)
      AppMethodBeat.o(100995);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof dc))
      {
        AppMethodBeat.o(100995);
        bool = false;
      }
      else
      {
        paramObject = (dc)paramObject;
        if ((this.a.equals(paramObject.a)) && (this.b.equals(paramObject.b)))
        {
          AppMethodBeat.o(100995);
        }
        else
        {
          AppMethodBeat.o(100995);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dc
 * JD-Core Version:    0.6.2
 */