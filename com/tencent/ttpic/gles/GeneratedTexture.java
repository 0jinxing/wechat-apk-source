package com.tencent.ttpic.gles;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class GeneratedTexture
{
  private static final int BLACK = 0;
  private static final int BLUE = 16711680;
  private static final int BYTES_PER_PIXEL = 4;
  private static final int CYAN = 16776960;
  private static final int FORMAT = 6408;
  private static final int GREEN = 65280;
  private static final int[] GRID;
  private static final int HALF = -2147483648;
  private static final int LOW = 1073741824;
  private static final int MAGENTA = 16711935;
  private static final int OPAQUE = -16777216;
  private static final int RED = 255;
  private static final int TEX_SIZE = 64;
  private static final int TRANSP = 0;
  private static final int WHITE = 16777215;
  private static final int YELLOW = 65535;
  private static final ByteBuffer sCoarseImageData;
  private static final ByteBuffer sFineImageData;

  static
  {
    AppMethodBeat.i(49997);
    GRID = new int[] { -16776961, -16711681, -16711936, -65281, -1, 1073742079, 1073807104, -16711681, -65281, 65280, -2147483393, -16777216, -256, -65281, -256, -65536 };
    sCoarseImageData = generateCoarseData();
    sFineImageData = generateFineData();
    AppMethodBeat.o(49997);
  }

  private static void checkerPattern(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    while (paramInt2 < paramInt4)
    {
      int i = paramInt1;
      if (i < paramInt3)
      {
        int j = paramInt2 * 64 * 4 + i * 4;
        if ((paramInt2 & paramInt7 ^ i & paramInt7) == 0);
        for (int k = paramInt5; ; k = paramInt6)
        {
          int m = k >> 24 & 0xFF;
          float f = m / 255.0F;
          paramArrayOfByte[j] = ((byte)(byte)(int)((k & 0xFF) * f));
          paramArrayOfByte[(j + 1)] = ((byte)(byte)(int)((k >> 8 & 0xFF) * f));
          paramArrayOfByte[(j + 2)] = ((byte)(byte)(int)((k >> 16 & 0xFF) * f));
          paramArrayOfByte[(j + 3)] = ((byte)(byte)m);
          i++;
          break;
        }
      }
      paramInt2++;
    }
  }

  public static int createTestTexture(GeneratedTexture.Image paramImage)
  {
    AppMethodBeat.i(49994);
    switch (GeneratedTexture.1.$SwitchMap$com$tencent$ttpic$gles$GeneratedTexture$Image[paramImage.ordinal()])
    {
    default:
      paramImage = new RuntimeException("unknown image");
      AppMethodBeat.o(49994);
      throw paramImage;
    case 1:
    case 2:
    }
    for (paramImage = sCoarseImageData; ; paramImage = sFineImageData)
    {
      int i = GlUtil.createImageTexture(paramImage, 64, 64, 6408);
      AppMethodBeat.o(49994);
      return i;
    }
  }

  private static ByteBuffer generateCoarseData()
  {
    AppMethodBeat.i(49995);
    byte[] arrayOfByte = new byte[16384];
    int i = 0;
    if (i < 16384)
    {
      int j = i / 4 / 64;
      int k = i / 4;
      j /= 16;
      k = k % 64 / 16;
      j = GRID[(j * 4 + k)];
      if (i == 0)
        j = -1;
      while (true)
      {
        k = j >> 24 & 0xFF;
        float f = k / 255.0F;
        arrayOfByte[i] = ((byte)(byte)(int)((j & 0xFF) * f));
        arrayOfByte[(i + 1)] = ((byte)(byte)(int)((j >> 8 & 0xFF) * f));
        arrayOfByte[(i + 2)] = ((byte)(byte)(int)((j >> 16 & 0xFF) * f));
        arrayOfByte[(i + 3)] = ((byte)(byte)k);
        i += 4;
        break;
        if (i == 16380)
          j = -1;
      }
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(16384);
    localByteBuffer.put(arrayOfByte);
    localByteBuffer.position(0);
    AppMethodBeat.o(49995);
    return localByteBuffer;
  }

  private static ByteBuffer generateFineData()
  {
    AppMethodBeat.i(49996);
    byte[] arrayOfByte = new byte[16384];
    checkerPattern(arrayOfByte, 0, 0, 32, 32, -16776961, -65536, 1);
    checkerPattern(arrayOfByte, 32, 32, 64, 64, -16776961, -16711936, 2);
    checkerPattern(arrayOfByte, 0, 32, 32, 64, -65536, -16711936, 4);
    checkerPattern(arrayOfByte, 32, 0, 64, 32, -1, -16777216, 8);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(16384);
    localByteBuffer.put(arrayOfByte);
    localByteBuffer.position(0);
    AppMethodBeat.o(49996);
    return localByteBuffer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.gles.GeneratedTexture
 * JD-Core Version:    0.6.2
 */