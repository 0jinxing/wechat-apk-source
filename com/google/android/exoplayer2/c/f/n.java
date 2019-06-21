package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class n
{
  private boolean bbV;
  private final int bcT;
  boolean bcU;
  public byte[] bcV;
  public int bcW;

  public n(int paramInt)
  {
    AppMethodBeat.i(95140);
    this.bcT = paramInt;
    this.bcV = new byte[''];
    this.bcV[2] = ((byte)1);
    AppMethodBeat.o(95140);
  }

  public final void ei(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(95141);
    if (!this.bbV)
    {
      bool2 = true;
      a.checkState(bool2);
      if (paramInt != this.bcT)
        break label63;
    }
    label63: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.bbV = bool2;
      if (this.bbV)
      {
        this.bcW = 3;
        this.bcU = false;
      }
      AppMethodBeat.o(95141);
      return;
      bool2 = false;
      break;
    }
  }

  public final boolean ej(int paramInt)
  {
    boolean bool = false;
    if (!this.bbV);
    while (true)
    {
      return bool;
      this.bcW -= paramInt;
      this.bbV = false;
      this.bcU = true;
      bool = true;
    }
  }

  public final void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95142);
    if (!this.bbV)
      AppMethodBeat.o(95142);
    while (true)
    {
      return;
      paramInt2 -= paramInt1;
      if (this.bcV.length < this.bcW + paramInt2)
        this.bcV = Arrays.copyOf(this.bcV, (this.bcW + paramInt2) * 2);
      System.arraycopy(paramArrayOfByte, paramInt1, this.bcV, this.bcW, paramInt2);
      this.bcW = (paramInt2 + this.bcW);
      AppMethodBeat.o(95142);
    }
  }

  public final void reset()
  {
    this.bbV = false;
    this.bcU = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.n
 * JD-Core Version:    0.6.2
 */