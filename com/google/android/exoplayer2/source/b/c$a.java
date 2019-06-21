package com.google.android.exoplayer2.source.b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.source.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class c$a extends c
{
  public final String biC;
  byte[] result;

  public c$a(f paramf, i parami, Format paramFormat, int paramInt, Object paramObject, byte[] paramArrayOfByte, String paramString)
  {
    super(paramf, parami, paramFormat, paramInt, paramObject, paramArrayOfByte);
    this.biC = paramString;
  }

  public final void f(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(125899);
    this.result = Arrays.copyOf(paramArrayOfByte, paramInt);
    AppMethodBeat.o(125899);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.c.a
 * JD-Core Version:    0.6.2
 */