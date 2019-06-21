package com.google.android.exoplayer2.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class g
  implements d
{
  private int aOn = -1;
  private ByteBuffer aQL = aPG;
  private int aRj = -1;
  int[] aRk;
  private int[] aRl;
  private boolean aRm;
  private boolean active;
  private ByteBuffer buffer = aPG;

  public final void flush()
  {
    this.aQL = aPG;
    this.aRm = false;
  }

  public final void g(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(94692);
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = (j - i) / (this.aOn * 2) * this.aRl.length * 2;
    if (this.buffer.capacity() < k)
      this.buffer = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
    while (i < j)
    {
      int[] arrayOfInt = this.aRl;
      int m = arrayOfInt.length;
      k = 0;
      while (true)
        if (k < m)
        {
          int n = arrayOfInt[k];
          this.buffer.putShort(paramByteBuffer.getShort(n * 2 + i));
          k++;
          continue;
          this.buffer.clear();
          break;
        }
      i += this.aOn * 2;
    }
    paramByteBuffer.position(j);
    this.buffer.flip();
    this.aQL = this.buffer;
    AppMethodBeat.o(94692);
  }

  public final boolean isActive()
  {
    return this.active;
  }

  public final boolean qf()
  {
    if ((this.aRm) && (this.aQL == aPG));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int qk()
  {
    if (this.aRl == null);
    for (int i = this.aOn; ; i = this.aRl.length)
      return i;
  }

  public final void ql()
  {
    this.aRm = true;
  }

  public final ByteBuffer qm()
  {
    ByteBuffer localByteBuffer = this.aQL;
    this.aQL = aPG;
    return localByteBuffer;
  }

  public final boolean r(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(94691);
    int i;
    if (!Arrays.equals(this.aRk, this.aRl))
    {
      i = 1;
      this.aRl = this.aRk;
      if (this.aRl != null)
        break label56;
      this.active = false;
      AppMethodBeat.o(94691);
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      label56: d.a locala;
      if (paramInt3 != 2)
      {
        locala = new d.a(paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(94691);
        throw locala;
      }
      if ((i == 0) && (this.aRj == paramInt1) && (this.aOn == paramInt2))
      {
        AppMethodBeat.o(94691);
        i = 0;
      }
      else
      {
        this.aRj = paramInt1;
        this.aOn = paramInt2;
        if (paramInt2 != this.aRl.length);
        int j;
        for (i = 1; ; i = 0)
        {
          this.active = i;
          j = 0;
          if (j >= this.aRl.length)
            break label232;
          k = this.aRl[j];
          if (k < paramInt2)
            break;
          locala = new d.a(paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(94691);
          throw locala;
        }
        i = this.active;
        if (k != j);
        for (int k = 1; ; k = 0)
        {
          this.active = (k | i);
          j++;
          break;
        }
        label232: AppMethodBeat.o(94691);
        i = 1;
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(94693);
    flush();
    this.buffer = aPG;
    this.aOn = -1;
    this.aRj = -1;
    this.aRl = null;
    this.active = false;
    AppMethodBeat.o(94693);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.g
 * JD-Core Version:    0.6.2
 */