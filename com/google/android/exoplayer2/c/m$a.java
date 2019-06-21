package com.google.android.exoplayer2.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class m$a
{
  public final int aRX;
  public final int aRY;
  public final int aTb;
  public final byte[] aTc;

  public m$a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    this.aTb = paramInt1;
    this.aTc = paramArrayOfByte;
    this.aRX = paramInt2;
    this.aRY = paramInt3;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95066);
    if (this == paramObject)
      AppMethodBeat.o(95066);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95066);
        bool = false;
      }
      else
      {
        paramObject = (a)paramObject;
        if ((this.aTb == paramObject.aTb) && (this.aRX == paramObject.aRX) && (this.aRY == paramObject.aRY) && (Arrays.equals(this.aTc, paramObject.aTc)))
        {
          AppMethodBeat.o(95066);
        }
        else
        {
          AppMethodBeat.o(95066);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95067);
    int i = this.aTb;
    int j = Arrays.hashCode(this.aTc);
    int k = this.aRX;
    int m = this.aRY;
    AppMethodBeat.o(95067);
    return ((i * 31 + j) * 31 + k) * 31 + m;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.m.a
 * JD-Core Version:    0.6.2
 */