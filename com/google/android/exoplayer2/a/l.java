package com.google.android.exoplayer2.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class l
  implements d
{
  private int aOn;
  private ByteBuffer aQL;
  private k aRT;
  private ShortBuffer aRU;
  long aRV;
  long aRW;
  private int aRj;
  private boolean aRm;
  private ByteBuffer buffer;
  float pitch;
  float speed;

  public l()
  {
    AppMethodBeat.i(94728);
    this.speed = 1.0F;
    this.pitch = 1.0F;
    this.aOn = -1;
    this.aRj = -1;
    this.buffer = aPG;
    this.aRU = this.buffer.asShortBuffer();
    this.aQL = aPG;
    AppMethodBeat.o(94728);
  }

  public final void flush()
  {
    AppMethodBeat.i(94733);
    this.aRT = new k(this.aRj, this.aOn);
    this.aRT.speed = this.speed;
    this.aRT.pitch = this.pitch;
    this.aQL = aPG;
    this.aRV = 0L;
    this.aRW = 0L;
    this.aRm = false;
    AppMethodBeat.o(94733);
  }

  public final void g(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(94731);
    Object localObject1;
    int i;
    Object localObject2;
    int j;
    int k;
    if (paramByteBuffer.hasRemaining())
    {
      localObject1 = paramByteBuffer.asShortBuffer();
      i = paramByteBuffer.remaining();
      this.aRV += i;
      localObject2 = this.aRT;
      j = ((ShortBuffer)localObject1).remaining() / ((k)localObject2).aRy;
      k = ((k)localObject2).aRy;
      ((k)localObject2).dA(j);
      ((ShortBuffer)localObject1).get(((k)localObject2).aRE, ((k)localObject2).aRL * ((k)localObject2).aRy, k * j * 2 / 2);
      ((k)localObject2).aRL += j;
      ((k)localObject2).qE();
      paramByteBuffer.position(paramByteBuffer.position() + i);
    }
    int m = this.aRT.aRM * this.aOn * 2;
    if (m > 0)
    {
      if (this.buffer.capacity() >= m)
        break label316;
      this.buffer = ByteBuffer.allocateDirect(m).order(ByteOrder.nativeOrder());
      this.aRU = this.buffer.asShortBuffer();
    }
    while (true)
    {
      paramByteBuffer = this.aRT;
      localObject2 = this.aRU;
      i = Math.min(((ShortBuffer)localObject2).remaining() / paramByteBuffer.aRy, paramByteBuffer.aRM);
      ((ShortBuffer)localObject2).put(paramByteBuffer.aRG, 0, paramByteBuffer.aRy * i);
      paramByteBuffer.aRM -= i;
      localObject1 = paramByteBuffer.aRG;
      j = paramByteBuffer.aRy;
      localObject2 = paramByteBuffer.aRG;
      k = paramByteBuffer.aRM;
      System.arraycopy(localObject1, i * j, localObject2, 0, paramByteBuffer.aRy * k);
      this.aRW += m;
      this.buffer.limit(m);
      this.aQL = this.buffer;
      AppMethodBeat.o(94731);
      return;
      label316: this.buffer.clear();
      this.aRU.clear();
    }
  }

  public final boolean isActive()
  {
    AppMethodBeat.i(94730);
    boolean bool;
    if ((Math.abs(this.speed - 1.0F) >= 0.01F) || (Math.abs(this.pitch - 1.0F) >= 0.01F))
    {
      bool = true;
      AppMethodBeat.o(94730);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94730);
    }
  }

  public final boolean qf()
  {
    if ((this.aRm) && ((this.aRT == null) || (this.aRT.aRM == 0)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int qk()
  {
    return this.aOn;
  }

  public final void ql()
  {
    AppMethodBeat.i(94732);
    k localk = this.aRT;
    int i = localk.aRL;
    float f = localk.speed / localk.pitch;
    int j = localk.aRM + (int)((i / f + localk.aRN) / localk.pitch + 0.5F);
    localk.dA(localk.aRB * 2 + i);
    for (int k = 0; k < localk.aRB * 2 * localk.aRy; k++)
      localk.aRE[(localk.aRy * i + k)] = ((short)0);
    localk.aRL += localk.aRB * 2;
    localk.qE();
    if (localk.aRM > j)
      localk.aRM = j;
    localk.aRL = 0;
    localk.aRO = 0;
    localk.aRN = 0;
    this.aRm = true;
    AppMethodBeat.o(94732);
  }

  public final ByteBuffer qm()
  {
    ByteBuffer localByteBuffer = this.aQL;
    this.aQL = aPG;
    return localByteBuffer;
  }

  public final boolean r(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(94729);
    if (paramInt3 != 2)
    {
      d.a locala = new d.a(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(94729);
      throw locala;
    }
    boolean bool;
    if ((this.aRj == paramInt1) && (this.aOn == paramInt2))
    {
      bool = false;
      AppMethodBeat.o(94729);
    }
    while (true)
    {
      return bool;
      this.aRj = paramInt1;
      this.aOn = paramInt2;
      bool = true;
      AppMethodBeat.o(94729);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(94734);
    this.aRT = null;
    this.buffer = aPG;
    this.aRU = this.buffer.asShortBuffer();
    this.aQL = aPG;
    this.aOn = -1;
    this.aRj = -1;
    this.aRV = 0L;
    this.aRW = 0L;
    this.aRm = false;
    AppMethodBeat.o(94734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.l
 * JD-Core Version:    0.6.2
 */