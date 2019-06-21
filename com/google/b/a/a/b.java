package com.google.b.a.a;

import com.google.b.b.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b extends g
{
  private final short byo;
  private final short byp;

  b(g paramg, int paramInt1, int paramInt2)
  {
    super(paramg);
    AppMethodBeat.i(57192);
    this.byo = ((short)(short)paramInt1);
    this.byp = ((short)(short)paramInt2);
    AppMethodBeat.o(57192);
  }

  public final void a(a parama, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57193);
    int i = 0;
    if (i < this.byp)
    {
      if ((i == 0) || ((i == 31) && (this.byp <= 62)))
      {
        parama.bA(31, 5);
        if (this.byp <= 62)
          break label83;
        parama.bA(this.byp - 31, 16);
      }
      while (true)
      {
        parama.bA(paramArrayOfByte[(this.byo + i)], 8);
        i++;
        break;
        label83: if (i == 0)
          parama.bA(Math.min(this.byp, 31), 5);
        else
          parama.bA(this.byp - 31, 5);
      }
    }
    AppMethodBeat.o(57193);
  }

  public final String toString()
  {
    AppMethodBeat.i(57194);
    String str = "<" + this.byo + "::" + (this.byo + this.byp - 1) + '>';
    AppMethodBeat.o(57194);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.b.a.a.b
 * JD-Core Version:    0.6.2
 */