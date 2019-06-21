package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class g extends h
{
  private static final int bat;
  private static final byte[] bau;
  private boolean bav;

  static
  {
    AppMethodBeat.i(95049);
    bat = v.aT("Opus");
    bau = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
    AppMethodBeat.o(95049);
  }

  private static void c(List<byte[]> paramList, int paramInt)
  {
    AppMethodBeat.i(95048);
    long l = paramInt * 1000000000L / 48000L;
    paramList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(l).array());
    AppMethodBeat.o(95048);
  }

  public static boolean r(l paraml)
  {
    boolean bool = false;
    AppMethodBeat.i(95044);
    if (paraml.tB() < bau.length)
      AppMethodBeat.o(95044);
    while (true)
    {
      return bool;
      byte[] arrayOfByte = new byte[bau.length];
      paraml.readBytes(arrayOfByte, 0, bau.length);
      bool = Arrays.equals(arrayOfByte, bau);
      AppMethodBeat.o(95044);
    }
  }

  protected final boolean a(l paraml, long paramLong, h.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(95047);
    if (!this.bav)
    {
      byte[] arrayOfByte = Arrays.copyOf(paraml.data, paraml.limit);
      int i = arrayOfByte[9];
      int j = arrayOfByte[11];
      int k = arrayOfByte[10];
      paraml = new ArrayList(3);
      paraml.add(arrayOfByte);
      c(paraml, (j & 0xFF) << 8 | k & 0xFF);
      c(paraml, 3840);
      parama.aOv = Format.a(null, "audio/opus", -1, -1, i & 0xFF, 48000, paraml, null, null);
      this.bav = true;
      AppMethodBeat.o(95047);
      return bool;
    }
    if (paraml.readInt() == bat);
    for (bool = true; ; bool = false)
    {
      paraml.setPosition(0);
      AppMethodBeat.o(95047);
      break;
    }
  }

  protected final void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(95045);
    super.reset(paramBoolean);
    if (paramBoolean)
      this.bav = false;
    AppMethodBeat.o(95045);
  }

  protected final long s(l paraml)
  {
    AppMethodBeat.i(95046);
    paraml = paraml.data;
    int i = paraml[0] & 0xFF;
    int j;
    int k;
    switch (i & 0x3)
    {
    default:
      j = paraml[1] & 0x3F;
      i >>= 3;
      k = i & 0x3;
      if (i >= 16)
        i = 2500 << k;
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      long l = U(i * j);
      AppMethodBeat.o(95046);
      return l;
      j = 1;
      break;
      j = 2;
      break;
      if (i >= 12)
        i = 10000 << (k & 0x1);
      else if (k == 3)
        i = 60000;
      else
        i = 10000 << k;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.g
 * JD-Core Version:    0.6.2
 */