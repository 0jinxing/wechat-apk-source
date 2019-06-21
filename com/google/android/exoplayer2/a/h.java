package com.google.android.exoplayer2.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public final class h
{
  private static final int[] aRn = { 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8 };
  private static final int[] aRo = { -1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1 };
  private static final int[] aRp = { 64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680 };

  public static Format a(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    AppMethodBeat.i(94694);
    paramArrayOfByte = new k(paramArrayOfByte);
    paramArrayOfByte.ee(60);
    int i = paramArrayOfByte.ed(6);
    int j = aRn[i];
    i = paramArrayOfByte.ed(4);
    int k = aRo[i];
    i = paramArrayOfByte.ed(5);
    if (i >= aRp.length)
    {
      i = -1;
      paramArrayOfByte.ee(10);
      if (paramArrayOfByte.ed(2) <= 0)
        break label121;
    }
    label121: for (int m = 1; ; m = 0)
    {
      paramArrayOfByte = Format.a(paramString1, "audio/vnd.dts", i, -1, j + m, k, null, null, paramString2);
      AppMethodBeat.o(94694);
      return paramArrayOfByte;
      i = aRp[i] * 1000 / 2;
      break;
    }
  }

  public static int h(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(94695);
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.get(i + 4);
    i = paramByteBuffer.get(i + 5);
    AppMethodBeat.o(94695);
    return (((i & 0xFC) >> 2 | (j & 0x1) << 6) + 1) * 32;
  }

  public static int k(byte[] paramArrayOfByte)
  {
    return (((paramArrayOfByte[4] & 0x1) << 6 | (paramArrayOfByte[5] & 0xFC) >> 2) + 1) * 32;
  }

  public static int l(byte[] paramArrayOfByte)
  {
    return ((paramArrayOfByte[5] & 0x2) << 12 | (paramArrayOfByte[6] & 0xFF) << 4 | (paramArrayOfByte[7] & 0xF0) >> 4) + 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.h
 * JD-Core Version:    0.6.2
 */