package com.google.android.exoplayer2.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class j
  implements d
{
  private int aOn = -1;
  private ByteBuffer aQL = aPG;
  private int aRj = -1;
  private boolean aRm;
  private ByteBuffer buffer = aPG;
  private int encoding = 0;

  public final void flush()
  {
    this.aQL = aPG;
    this.aRm = false;
  }

  public final void g(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(94720);
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    switch (this.encoding)
    {
    default:
      paramByteBuffer = new IllegalStateException();
      AppMethodBeat.o(94720);
      throw paramByteBuffer;
    case 3:
      k *= 2;
      label81: if (this.buffer.capacity() < k)
        this.buffer = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
      break;
    case -2147483648:
    case 1073741824:
    }
    int m;
    while (true)
    {
      m = i;
      k = i;
      switch (this.encoding)
      {
      default:
        paramByteBuffer = new IllegalStateException();
        AppMethodBeat.o(94720);
        throw paramByteBuffer;
        k = k / 3 * 2;
        break label81;
        k /= 2;
        break label81;
        this.buffer.clear();
      case 3:
      case -2147483648:
      case 1073741824:
      }
    }
    while (m < j)
    {
      this.buffer.put((byte)0);
      this.buffer.put((byte)((paramByteBuffer.get(m) & 0xFF) - 128));
      m++;
      continue;
      while (k < j)
      {
        this.buffer.put(paramByteBuffer.get(k + 1));
        this.buffer.put(paramByteBuffer.get(k + 2));
        k += 3;
      }
    }
    while (true)
      if (i < j)
      {
        this.buffer.put(paramByteBuffer.get(i + 2));
        this.buffer.put(paramByteBuffer.get(i + 3));
        i += 4;
      }
      else
      {
        paramByteBuffer.position(paramByteBuffer.limit());
        this.buffer.flip();
        this.aQL = this.buffer;
        AppMethodBeat.o(94720);
        return;
      }
  }

  public final boolean isActive()
  {
    if ((this.encoding != 0) && (this.encoding != 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean qf()
  {
    if ((this.aRm) && (this.aQL == aPG));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int qk()
  {
    return this.aOn;
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
    AppMethodBeat.i(94719);
    if ((paramInt3 != 3) && (paramInt3 != 2) && (paramInt3 != -2147483648) && (paramInt3 != 1073741824))
    {
      d.a locala = new d.a(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(94719);
      throw locala;
    }
    boolean bool;
    if ((this.aRj == paramInt1) && (this.aOn == paramInt2) && (this.encoding == paramInt3))
    {
      bool = false;
      AppMethodBeat.o(94719);
    }
    while (true)
    {
      return bool;
      this.aRj = paramInt1;
      this.aOn = paramInt2;
      this.encoding = paramInt3;
      if (paramInt3 == 2)
        this.buffer = aPG;
      bool = true;
      AppMethodBeat.o(94719);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(94721);
    flush();
    this.buffer = aPG;
    this.aRj = -1;
    this.aOn = -1;
    this.encoding = 0;
    AppMethodBeat.o(94721);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.j
 * JD-Core Version:    0.6.2
 */