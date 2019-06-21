package com.bumptech.glide.c.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class f$a
  implements f.c
{
  private final ByteBuffer byteBuffer;

  f$a(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(92193);
    this.byteBuffer = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
    AppMethodBeat.o(92193);
  }

  public final int nn()
  {
    AppMethodBeat.i(92194);
    int i = np();
    int j = np();
    AppMethodBeat.o(92194);
    return i << 8 & 0xFF00 | j & 0xFF;
  }

  public final short no()
  {
    AppMethodBeat.i(92195);
    short s = (short)(np() & 0xFF);
    AppMethodBeat.o(92195);
    return s;
  }

  public final int np()
  {
    AppMethodBeat.i(92198);
    int i;
    if (this.byteBuffer.remaining() <= 0)
    {
      i = -1;
      AppMethodBeat.o(92198);
    }
    while (true)
    {
      return i;
      i = this.byteBuffer.get();
      AppMethodBeat.o(92198);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(92197);
    paramInt = Math.min(paramInt, this.byteBuffer.remaining());
    if (paramInt == 0)
    {
      paramInt = -1;
      AppMethodBeat.o(92197);
    }
    while (true)
    {
      return paramInt;
      this.byteBuffer.get(paramArrayOfByte, 0, paramInt);
      AppMethodBeat.o(92197);
    }
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(92196);
    int i = (int)Math.min(this.byteBuffer.remaining(), paramLong);
    this.byteBuffer.position(this.byteBuffer.position() + i);
    paramLong = i;
    AppMethodBeat.o(92196);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.f.a
 * JD-Core Version:    0.6.2
 */