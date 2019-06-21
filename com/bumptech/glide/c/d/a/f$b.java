package com.bumptech.glide.c.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class f$b
{
  final ByteBuffer aEY;

  f$b(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(92199);
    this.aEY = ((ByteBuffer)ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.BIG_ENDIAN).limit(paramInt));
    AppMethodBeat.o(92199);
  }

  private boolean aS(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92202);
    boolean bool;
    if (this.aEY.remaining() - paramInt1 >= paramInt2)
    {
      bool = true;
      AppMethodBeat.o(92202);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92202);
    }
  }

  final int dg(int paramInt)
  {
    AppMethodBeat.i(92200);
    if (aS(paramInt, 4))
    {
      paramInt = this.aEY.getInt(paramInt);
      AppMethodBeat.o(92200);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(92200);
    }
  }

  final short dh(int paramInt)
  {
    AppMethodBeat.i(92201);
    if (aS(paramInt, 2))
    {
      paramInt = this.aEY.getShort(paramInt);
      AppMethodBeat.o(92201);
    }
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      return i;
      paramInt = -1;
      AppMethodBeat.o(92201);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.f.b
 * JD-Core Version:    0.6.2
 */