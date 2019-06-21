package com.bumptech.glide.c.d.b;

import com.bumptech.glide.c.b.u;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements u<byte[]>
{
  private final byte[] wR;

  public b(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(92283);
    this.wR = ((byte[])i.d(paramArrayOfByte, "Argument must not be null"));
    AppMethodBeat.o(92283);
  }

  public final int getSize()
  {
    return this.wR.length;
  }

  public final Class<byte[]> mK()
  {
    return [B.class;
  }

  public final void recycle()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.b.b
 * JD-Core Version:    0.6.2
 */