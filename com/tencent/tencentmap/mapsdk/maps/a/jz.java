package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class jz
{
  public double a;
  public double b;

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(100154);
    if (this == paramObject)
      AppMethodBeat.o(100154);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(100154);
        bool = false;
      }
      else
      {
        paramObject = (jz)paramObject;
        if (Double.compare(paramObject.a, this.a) != 0)
        {
          AppMethodBeat.o(100154);
          bool = false;
        }
        else if (Double.compare(paramObject.b, this.b) != 0)
        {
          AppMethodBeat.o(100154);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(100154);
        }
      }
    }
  }

  public int hashCode()
  {
    long l1 = 0L;
    AppMethodBeat.i(100155);
    if (this.a != 0.0D);
    for (long l2 = Double.doubleToLongBits(this.a); ; l2 = 0L)
    {
      long l3 = (int)l2 * 31;
      l2 = l1;
      if (this.b != 0.0D)
        l2 = Double.doubleToLongBits(this.b);
      int i = (int)(l3 + l2);
      AppMethodBeat.o(100155);
      return i;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(100156);
    String str = this.a + "," + this.b;
    AppMethodBeat.o(100156);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jz
 * JD-Core Version:    0.6.2
 */