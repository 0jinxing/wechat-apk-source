package com.google.android.exoplayer2;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class t
{
  public static final t aOE;
  public final int aOF;

  static
  {
    AppMethodBeat.i(95392);
    aOE = new t(0);
    AppMethodBeat.o(95392);
  }

  public t(int paramInt)
  {
    this.aOF = paramInt;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95391);
    if (this == paramObject)
      AppMethodBeat.o(95391);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95391);
        bool = false;
      }
      else
      {
        paramObject = (t)paramObject;
        if (this.aOF == paramObject.aOF)
        {
          AppMethodBeat.o(95391);
        }
        else
        {
          AppMethodBeat.o(95391);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return this.aOF;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.t
 * JD-Core Version:    0.6.2
 */