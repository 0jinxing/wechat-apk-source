package com.google.android.exoplayer2.source;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class p
{
  public static final p bhZ;
  private int aBR;
  public final o[] bia;
  public final int length;

  static
  {
    AppMethodBeat.i(95558);
    bhZ = new p(new o[0]);
    AppMethodBeat.o(95558);
  }

  public p(o[] paramArrayOfo)
  {
    AppMethodBeat.i(95555);
    this.bia = paramArrayOfo;
    this.length = paramArrayOfo.length;
    AppMethodBeat.o(95555);
  }

  public final int a(o paramo)
  {
    int i = 0;
    if (i < this.length)
      if (this.bia[i] != paramo);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95557);
    if (this == paramObject)
      AppMethodBeat.o(95557);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95557);
        bool = false;
      }
      else
      {
        paramObject = (p)paramObject;
        if ((this.length == paramObject.length) && (Arrays.equals(this.bia, paramObject.bia)))
        {
          AppMethodBeat.o(95557);
        }
        else
        {
          AppMethodBeat.o(95557);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95556);
    if (this.aBR == 0)
      this.aBR = Arrays.hashCode(this.bia);
    int i = this.aBR;
    AppMethodBeat.o(95556);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.p
 * JD-Core Version:    0.6.2
 */