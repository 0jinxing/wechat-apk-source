package com.google.b.a.a;

import com.google.b.b.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e extends g
{
  private final short byx;
  private final short value;

  e(g paramg, int paramInt1, int paramInt2)
  {
    super(paramg);
    AppMethodBeat.i(57137);
    this.value = ((short)(short)paramInt1);
    this.byx = ((short)(short)paramInt2);
    AppMethodBeat.o(57137);
  }

  final void a(a parama, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57138);
    parama.bA(this.value, this.byx);
    AppMethodBeat.o(57138);
  }

  public final String toString()
  {
    AppMethodBeat.i(57139);
    int i = this.value;
    int j = this.byx;
    int k = this.byx;
    String str = "<" + Integer.toBinaryString(i & (1 << j) - 1 | 1 << k | 1 << this.byx).substring(1) + '>';
    AppMethodBeat.o(57139);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.b.a.a.e
 * JD-Core Version:    0.6.2
 */