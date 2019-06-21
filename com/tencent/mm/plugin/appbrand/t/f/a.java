package com.tencent.mm.plugin.appbrand.t.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class a
{
  private static final byte[] iTG = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] iTH = { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
  private static final byte[] iTI = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  private static final byte[] iTJ = { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
  private static final byte[] iTK = { 45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
  private static final byte[] iTL = { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };

  private static String G(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(73273);
    if (paramArrayOfByte == null)
    {
      ab.i("MicroMsg.AppBrandNetWork.Base64", "Cannot serialize a null array.");
      paramArrayOfByte = new byte[0];
    }
    try
    {
      while (true)
      {
        Object localObject = new java/lang/String;
        ((String)localObject).<init>(paramArrayOfByte, "US-ASCII");
        AppMethodBeat.o(73273);
        paramArrayOfByte = (byte[])localObject;
        return paramArrayOfByte;
        if (paramInt < 0)
        {
          ab.i("MicroMsg.AppBrandNetWork.Base64", "Cannot have length offset: ".concat(String.valueOf(paramInt)));
          paramArrayOfByte = new byte[0];
        }
        else if (paramInt + 0 > paramArrayOfByte.length)
        {
          ab.i("MicroMsg.AppBrandNetWork.Base64", "off + len > source.length  ");
          paramArrayOfByte = new byte[0];
        }
        else
        {
          int i = paramInt / 3;
          if (paramInt % 3 > 0);
          for (int j = 4; ; j = 0)
          {
            localObject = new byte[j + i * 4];
            j = 0;
            i = 0;
            while (i < paramInt - 2)
            {
              a(paramArrayOfByte, i + 0, 3, (byte[])localObject, j);
              i += 3;
              j += 4;
            }
          }
          int k = j;
          if (i < paramInt)
          {
            a(paramArrayOfByte, i + 0, paramInt - i, (byte[])localObject, j);
            k = j + 4;
          }
          if (k <= localObject.length - 1)
          {
            paramArrayOfByte = new byte[k];
            System.arraycopy(localObject, 0, paramArrayOfByte, 0, k);
          }
          else
          {
            paramArrayOfByte = (byte[])localObject;
          }
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        paramArrayOfByte = new String(paramArrayOfByte);
        AppMethodBeat.o(73273);
      }
    }
  }

  private static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i = 0;
    byte[] arrayOfByte = iTG;
    int j;
    int k;
    if (paramInt2 > 0)
    {
      j = paramArrayOfByte1[paramInt1] << 24 >>> 8;
      if (paramInt2 <= 1)
        break label104;
      k = paramArrayOfByte1[(paramInt1 + 1)] << 24 >>> 16;
      label41: if (paramInt2 > 2)
        i = paramArrayOfByte1[(paramInt1 + 2)] << 24 >>> 24;
      paramInt1 = i | (k | j);
      switch (paramInt2)
      {
      default:
      case 3:
      case 2:
      case 1:
      }
    }
    while (true)
    {
      return paramArrayOfByte2;
      j = 0;
      break;
      label104: k = 0;
      break label41;
      paramArrayOfByte2[paramInt3] = ((byte)arrayOfByte[(paramInt1 >>> 18)]);
      paramArrayOfByte2[(paramInt3 + 1)] = ((byte)arrayOfByte[(paramInt1 >>> 12 & 0x3F)]);
      paramArrayOfByte2[(paramInt3 + 2)] = ((byte)arrayOfByte[(paramInt1 >>> 6 & 0x3F)]);
      paramArrayOfByte2[(paramInt3 + 3)] = ((byte)arrayOfByte[(paramInt1 & 0x3F)]);
      continue;
      paramArrayOfByte2[paramInt3] = ((byte)arrayOfByte[(paramInt1 >>> 18)]);
      paramArrayOfByte2[(paramInt3 + 1)] = ((byte)arrayOfByte[(paramInt1 >>> 12 & 0x3F)]);
      paramArrayOfByte2[(paramInt3 + 2)] = ((byte)arrayOfByte[(paramInt1 >>> 6 & 0x3F)]);
      paramArrayOfByte2[(paramInt3 + 3)] = ((byte)61);
      continue;
      paramArrayOfByte2[paramInt3] = ((byte)arrayOfByte[(paramInt1 >>> 18)]);
      paramArrayOfByte2[(paramInt3 + 1)] = ((byte)arrayOfByte[(paramInt1 >>> 12 & 0x3F)]);
      paramArrayOfByte2[(paramInt3 + 2)] = ((byte)61);
      paramArrayOfByte2[(paramInt3 + 3)] = ((byte)61);
    }
  }

  public static String an(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(73272);
    Object localObject = null;
    try
    {
      paramArrayOfByte = G(paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(73272);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.f.a
 * JD-Core Version:    0.6.2
 */