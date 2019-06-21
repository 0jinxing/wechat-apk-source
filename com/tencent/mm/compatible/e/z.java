package com.tencent.mm.compatible.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class z
{
  public final int height;
  public final int width;

  public z(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (this == paramObject)
      {
        bool2 = true;
      }
      else
      {
        bool2 = bool1;
        if ((paramObject instanceof z))
        {
          paramObject = (z)paramObject;
          bool2 = bool1;
          if (this.width == paramObject.width)
          {
            bool2 = bool1;
            if (this.height == paramObject.height)
              bool2 = true;
          }
        }
      }
    }
  }

  public final int hashCode()
  {
    return this.height ^ (this.width << 16 | this.width >>> 16);
  }

  public final String toString()
  {
    AppMethodBeat.i(93019);
    String str = this.width + "x" + this.height;
    AppMethodBeat.o(93019);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.z
 * JD-Core Version:    0.6.2
 */