package com.tencent.mm.memory;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o$b
  implements Comparable
{
  private String fdU;
  public int height;
  public int width;

  public o$b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115407);
    this.width = paramInt1;
    this.height = paramInt2;
    this.fdU = String.format("SightBitmapSize: [%s, %s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(115407);
  }

  public final int compareTo(Object paramObject)
  {
    int i;
    if (paramObject == null)
      i = 0;
    while (true)
    {
      return i;
      if ((paramObject instanceof b))
      {
        if ((this.width == ((b)paramObject).width) && (this.height == ((b)paramObject).height))
        {
          i = 0;
        }
        else
        {
          i = this.width;
          if (this.height * i > ((b)paramObject).width * ((b)paramObject).height)
            i = 1;
          else
            i = -1;
        }
      }
      else
        i = 0;
    }
  }

  public final String toString()
  {
    return this.fdU;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.o.b
 * JD-Core Version:    0.6.2
 */