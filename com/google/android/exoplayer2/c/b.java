package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.util.Arrays;

public final class b
  implements f
{
  private static final byte[] aSE = new byte[4096];
  private final com.google.android.exoplayer2.h.f aSF;
  private final long aSG;
  private byte[] aSH;
  private int aSI;
  private int aSJ;
  private long position;

  public b(com.google.android.exoplayer2.h.f paramf, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(94842);
    this.aSF = paramf;
    this.position = paramLong1;
    this.aSG = paramLong2;
    this.aSH = new byte[65536];
    AppMethodBeat.o(94842);
  }

  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(94856);
    if (Thread.interrupted())
    {
      paramArrayOfByte = new InterruptedException();
      AppMethodBeat.o(94856);
      throw paramArrayOfByte;
    }
    paramInt1 = this.aSF.read(paramArrayOfByte, paramInt1 + paramInt3, paramInt2 - paramInt3);
    if (paramInt1 == -1)
      if ((paramInt3 == 0) && (paramBoolean))
      {
        AppMethodBeat.o(94856);
        paramInt1 = i;
      }
    while (true)
    {
      return paramInt1;
      paramArrayOfByte = new EOFException();
      AppMethodBeat.o(94856);
      throw paramArrayOfByte;
      paramInt1 = paramInt3 + paramInt1;
      AppMethodBeat.o(94856);
    }
  }

  private int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(94854);
    if (this.aSJ == 0)
      AppMethodBeat.o(94854);
    for (paramInt1 = i; ; paramInt1 = paramInt2)
    {
      return paramInt1;
      paramInt2 = Math.min(this.aSJ, paramInt2);
      System.arraycopy(this.aSH, 0, paramArrayOfByte, paramInt1, paramInt2);
      dK(paramInt2);
      AppMethodBeat.o(94854);
    }
  }

  private void dI(int paramInt)
  {
    AppMethodBeat.i(94852);
    paramInt = this.aSI + paramInt;
    if (paramInt > this.aSH.length)
    {
      paramInt = v.u(this.aSH.length * 2, 65536 + paramInt, paramInt + 524288);
      this.aSH = Arrays.copyOf(this.aSH, paramInt);
    }
    AppMethodBeat.o(94852);
  }

  private int dJ(int paramInt)
  {
    AppMethodBeat.i(94853);
    paramInt = Math.min(this.aSJ, paramInt);
    dK(paramInt);
    AppMethodBeat.o(94853);
    return paramInt;
  }

  private void dK(int paramInt)
  {
    AppMethodBeat.i(94855);
    this.aSJ -= paramInt;
    this.aSI = 0;
    byte[] arrayOfByte = this.aSH;
    if (this.aSJ < this.aSH.length - 524288)
      arrayOfByte = new byte[this.aSJ + 65536];
    System.arraycopy(this.aSH, paramInt, arrayOfByte, 0, this.aSJ);
    this.aSH = arrayOfByte;
    AppMethodBeat.o(94855);
  }

  private void dL(int paramInt)
  {
    if (paramInt != -1)
      this.position += paramInt;
  }

  private boolean q(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(94850);
    dI(paramInt);
    int i = Math.min(this.aSJ - this.aSI, paramInt);
    while (i < paramInt)
    {
      int j = a(this.aSH, this.aSI, paramInt, i, paramBoolean);
      i = j;
      if (j == -1)
      {
        paramBoolean = false;
        AppMethodBeat.o(94850);
      }
    }
    while (true)
    {
      return paramBoolean;
      this.aSI += paramInt;
      this.aSJ = Math.max(this.aSJ, this.aSI);
      paramBoolean = true;
      AppMethodBeat.o(94850);
    }
  }

  public final boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(94844);
    for (int i = c(paramArrayOfByte, paramInt1, paramInt2); (i < paramInt2) && (i != -1); i = a(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean));
    dL(i);
    if (i != -1)
    {
      paramBoolean = true;
      AppMethodBeat.o(94844);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(94844);
    }
  }

  public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94849);
    b(paramArrayOfByte, paramInt1, paramInt2, false);
    AppMethodBeat.o(94849);
  }

  public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(94848);
    if (!q(paramInt2, paramBoolean))
    {
      paramBoolean = false;
      AppMethodBeat.o(94848);
    }
    while (true)
    {
      return paramBoolean;
      System.arraycopy(this.aSH, this.aSI - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
      paramBoolean = true;
      AppMethodBeat.o(94848);
    }
  }

  public final int dF(int paramInt)
  {
    AppMethodBeat.i(94846);
    int i = dJ(paramInt);
    int j = i;
    if (i == 0)
      j = a(aSE, 0, Math.min(paramInt, aSE.length), 0, true);
    dL(j);
    AppMethodBeat.o(94846);
    return j;
  }

  public final void dG(int paramInt)
  {
    AppMethodBeat.i(94847);
    for (int i = dJ(paramInt); (i < paramInt) && (i != -1); i = a(aSE, -i, Math.min(paramInt, aSE.length + i), i, false));
    dL(i);
    AppMethodBeat.o(94847);
  }

  public final void dH(int paramInt)
  {
    AppMethodBeat.i(94851);
    q(paramInt, false);
    AppMethodBeat.o(94851);
  }

  public final long getLength()
  {
    return this.aSG;
  }

  public final long getPosition()
  {
    return this.position;
  }

  public final void qY()
  {
    this.aSI = 0;
  }

  public final long qZ()
  {
    return this.position + this.aSI;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94843);
    int i = c(paramArrayOfByte, paramInt1, paramInt2);
    int j = i;
    if (i == 0)
      j = a(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    dL(j);
    AppMethodBeat.o(94843);
    return j;
  }

  public final void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94845);
    a(paramArrayOfByte, paramInt1, paramInt2, false);
    AppMethodBeat.o(94845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.b
 * JD-Core Version:    0.6.2
 */