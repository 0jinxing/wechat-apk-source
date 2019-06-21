package com.google.b.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private final b[] bAJ;
  int bAK;
  private final int height;
  private final int width;

  a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57229);
    this.bAJ = new b[paramInt1];
    int i = 0;
    int j = this.bAJ.length;
    while (i < j)
    {
      this.bAJ[i] = new b((paramInt2 + 4) * 17 + 1);
      i++;
    }
    this.width = (paramInt2 * 17);
    this.height = paramInt1;
    this.bAK = -1;
    AppMethodBeat.o(57229);
  }

  public final byte[][] bG(int paramInt1, int paramInt2)
  {
    int i = this.height;
    int j = this.width;
    byte[][] arrayOfByte = new byte[i * paramInt2][j * paramInt1];
    int k = this.height * paramInt2;
    for (j = 0; j < k; j++)
    {
      b localb = this.bAJ[(j / paramInt2)];
      byte[] arrayOfByte1 = new byte[localb.bAL.length * paramInt1];
      for (i = 0; i < arrayOfByte1.length; i++)
        arrayOfByte1[i] = ((byte)localb.bAL[(i / paramInt1)]);
      arrayOfByte[(k - j - 1)] = arrayOfByte1;
    }
    return arrayOfByte;
  }

  final b vJ()
  {
    return this.bAJ[this.bAK];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.e.a.a
 * JD-Core Version:    0.6.2
 */