package com.google.b.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b
{
  final byte[] bAL;
  private int bAM;

  b(int paramInt)
  {
    AppMethodBeat.i(57157);
    this.bAL = new byte[paramInt];
    this.bAM = 0;
    AppMethodBeat.o(57157);
  }

  final void d(boolean paramBoolean, int paramInt)
  {
    int i = 0;
    if (i < paramInt)
    {
      int j = this.bAM;
      this.bAM = (j + 1);
      byte[] arrayOfByte = this.bAL;
      if (paramBoolean);
      for (int k = 1; ; k = 0)
      {
        arrayOfByte[j] = ((byte)(byte)k);
        i++;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.e.a.b
 * JD-Core Version:    0.6.2
 */