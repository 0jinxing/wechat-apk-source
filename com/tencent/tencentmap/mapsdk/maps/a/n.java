package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public final class n
{
  private static final byte[] a = arrayOfByte2;
  private static final byte[] b = arrayOfByte3;

  static
  {
    byte[] arrayOfByte1 = new byte[16];
    arrayOfByte1[0] = 48;
    arrayOfByte1[1] = 49;
    arrayOfByte1[2] = 50;
    arrayOfByte1[3] = 51;
    arrayOfByte1[4] = 52;
    arrayOfByte1[5] = 53;
    arrayOfByte1[6] = 54;
    arrayOfByte1[7] = 55;
    arrayOfByte1[8] = 56;
    arrayOfByte1[9] = 57;
    arrayOfByte1[10] = 65;
    arrayOfByte1[11] = 66;
    arrayOfByte1[12] = 67;
    arrayOfByte1[13] = 68;
    arrayOfByte1[14] = 69;
    arrayOfByte1[15] = 70;
    arrayOfByte1;
    byte[] arrayOfByte2 = new byte[256];
    byte[] arrayOfByte3 = new byte[256];
    for (int i = 0; i < 256; i++)
    {
      arrayOfByte2[i] = ((byte)arrayOfByte1[(i >>> 4)]);
      arrayOfByte3[i] = ((byte)arrayOfByte1[(i & 0xF)]);
    }
  }

  public static boolean a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(100520);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject1 == paramObject2)
      {
        bool = true;
        AppMethodBeat.o(100520);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100520);
      continue;
      bool = paramObject1.equals(paramObject2);
      AppMethodBeat.o(100520);
    }
  }

  public static boolean a(short paramShort1, short paramShort2)
  {
    if (paramShort1 == paramShort2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static byte[] a(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(100521);
    byte[] arrayOfByte = new byte[paramByteBuffer.position()];
    System.arraycopy(paramByteBuffer.array(), 0, arrayOfByte, 0, arrayOfByte.length);
    AppMethodBeat.o(100521);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.n
 * JD-Core Version:    0.6.2
 */