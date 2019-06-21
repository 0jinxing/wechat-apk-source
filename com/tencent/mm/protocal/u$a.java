package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class u$a extends l.d
  implements l.b
{
  public byte[] cAG = null;
  public long fJB = -1L;

  public final byte[] ZT()
  {
    AppMethodBeat.i(58860);
    byte[] arrayOfByte = new byte[this.cAG.length + 8];
    int i = (int)(bo.anU() - this.fJB);
    arrayOfByte[0] = ((byte)(byte)(i >> 24 & 0xFF));
    arrayOfByte[1] = ((byte)(byte)(i >> 16 & 0xFF));
    arrayOfByte[2] = ((byte)(byte)(i >> 8 & 0xFF));
    arrayOfByte[3] = ((byte)(byte)(i & 0xFF));
    arrayOfByte[4] = ((byte)(byte)(this.cAG.length >> 24 & 0xFF));
    arrayOfByte[5] = ((byte)(byte)(this.cAG.length >> 16 & 0xFF));
    arrayOfByte[6] = ((byte)(byte)(this.cAG.length >> 8 & 0xFF));
    arrayOfByte[7] = ((byte)(byte)(this.cAG.length & 0xFF));
    System.arraycopy(this.cAG, 0, arrayOfByte, 8, this.cAG.length);
    bo.ca(arrayOfByte);
    AppMethodBeat.o(58860);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 268369922;
  }

  public final boolean adr()
  {
    return false;
  }

  public final int getCmdId()
  {
    return 1000000190;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.u.a
 * JD-Core Version:    0.6.2
 */