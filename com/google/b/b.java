package com.google.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public final int height;
  public final int width;

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      bool2 = bool1;
      if (this.width == paramObject.width)
      {
        bool2 = bool1;
        if (this.height == paramObject.height)
          bool2 = true;
      }
    }
    return bool2;
  }

  public final int hashCode()
  {
    return this.width * 32713 + this.height;
  }

  public final String toString()
  {
    AppMethodBeat.i(57216);
    String str = this.width + "x" + this.height;
    AppMethodBeat.o(57216);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.b.b
 * JD-Core Version:    0.6.2
 */