package com.google.android.exoplayer2.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class g
{
  private int aBR;
  public final f[] bpE;
  public final int length;

  public g(f[] paramArrayOff)
  {
    AppMethodBeat.i(95781);
    this.bpE = paramArrayOff;
    this.length = paramArrayOff.length;
    AppMethodBeat.o(95781);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(95784);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(95784);
    }
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
        AppMethodBeat.o(95784);
      }
      else
      {
        paramObject = (g)paramObject;
        bool = Arrays.equals(this.bpE, paramObject.bpE);
        AppMethodBeat.o(95784);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95783);
    if (this.aBR == 0)
      this.aBR = (Arrays.hashCode(this.bpE) + 527);
    int i = this.aBR;
    AppMethodBeat.o(95783);
    return i;
  }

  public final f[] ti()
  {
    AppMethodBeat.i(95782);
    f[] arrayOff = (f[])this.bpE.clone();
    AppMethodBeat.o(95782);
    return arrayOff;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.g
 * JD-Core Version:    0.6.2
 */