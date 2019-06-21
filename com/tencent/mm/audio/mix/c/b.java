package com.tencent.mm.audio.mix.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class b
{
  public static boolean ckT = false;

  public static void Dq()
  {
    AppMethodBeat.i(137008);
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN)
    {
      ckT = true;
      AppMethodBeat.o(137008);
    }
    while (true)
    {
      return;
      ckT = false;
      AppMethodBeat.o(137008);
    }
  }

  public static void a(int paramInt, byte[] paramArrayOfByte, byte[][] paramArrayOfByte1)
  {
    AppMethodBeat.i(137011);
    if (paramArrayOfByte1.length <= 1)
    {
      AppMethodBeat.o(137011);
      return;
    }
    int i = paramArrayOfByte.length / 2;
    Arrays.fill(paramArrayOfByte1[0], 0, paramArrayOfByte1[0].length, (byte)0);
    Arrays.fill(paramArrayOfByte1[1], 0, paramArrayOfByte1[1].length, (byte)0);
    switch (paramInt)
    {
    default:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(137011);
      break;
      int j = 0;
      for (paramInt = 0; paramInt < i; paramInt += 2)
      {
        paramArrayOfByte1[0][j] = ((byte)paramArrayOfByte[paramInt]);
        paramArrayOfByte1[1][j] = ((byte)paramArrayOfByte[(paramInt + 1)]);
        j++;
      }
      AppMethodBeat.o(137011);
      break;
      for (paramInt = 0; paramInt < i; paramInt += 2)
      {
        paramArrayOfByte1[0][paramInt] = ((byte)paramArrayOfByte[(paramInt * 2)]);
        paramArrayOfByte1[0][(paramInt + 1)] = ((byte)paramArrayOfByte[(paramInt * 2 + 1)]);
        paramArrayOfByte1[1][paramInt] = ((byte)paramArrayOfByte[(paramInt * 2 + 2)]);
        paramArrayOfByte1[1][(paramInt + 1)] = ((byte)paramArrayOfByte[(paramInt * 2 + 3)]);
      }
    }
  }

  public static byte[] a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = null;
    int i = 0;
    int j = 0;
    AppMethodBeat.i(137012);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null) || (paramArrayOfByte1.length == 0) || (paramArrayOfByte2.length == 0))
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioConvertHelper", "sourceFirstByteArray or sourceSecondByteArray is null");
      AppMethodBeat.o(137012);
    }
    for (paramArrayOfByte1 = arrayOfByte; ; paramArrayOfByte1 = arrayOfByte)
    {
      return paramArrayOfByte1;
      if (paramArrayOfByte1.length == paramArrayOfByte2.length)
        break;
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioConvertHelper", "sourceFirstByteArray and sourceSecondByteArray length is not same");
      AppMethodBeat.o(137012);
    }
    int k = paramArrayOfByte1.length;
    arrayOfByte = new byte[k * 2];
    switch (paramInt)
    {
    default:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(137012);
      paramArrayOfByte1 = arrayOfByte;
      break;
      while (j < k)
      {
        arrayOfByte[j] = ((byte)paramArrayOfByte1[j]);
        arrayOfByte[(j + 1)] = ((byte)paramArrayOfByte2[j]);
        j += 2;
      }
      while (i < k)
      {
        arrayOfByte[(i * 2)] = ((byte)paramArrayOfByte1[i]);
        arrayOfByte[(i * 2 + 1)] = ((byte)paramArrayOfByte1[(i + 1)]);
        arrayOfByte[(i * 2 + 2)] = ((byte)paramArrayOfByte2[i]);
        arrayOfByte[(i * 2 + 3)] = ((byte)paramArrayOfByte2[(i + 1)]);
        i += 2;
      }
    }
  }

  public static byte[] b(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(137009);
    if (paramInt1 == paramInt2)
      AppMethodBeat.o(137009);
    while (true)
    {
      label17: return paramArrayOfByte;
      int j = paramArrayOfByte.length;
      switch (paramInt1)
      {
      default:
      case 1:
      case 3:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(137009);
        break;
        switch (paramInt2)
        {
        default:
          break;
        case 2:
          arrayOfByte1 = new byte[j * 2];
          for (paramInt1 = 0; paramInt1 < j; paramInt1++)
          {
            byte[] arrayOfByte2 = a.getBytes((short)(paramArrayOfByte[paramInt1] * 256), ckT);
            arrayOfByte1[(paramInt1 * 2)] = ((byte)arrayOfByte2[0]);
            arrayOfByte1[(paramInt1 * 2 + 1)] = ((byte)arrayOfByte2[1]);
          }
          AppMethodBeat.o(137009);
          paramArrayOfByte = arrayOfByte1;
          break label17;
          switch (paramInt2)
          {
          case 2:
          default:
          case 1:
          case 3:
          }
          break;
        }
      }
      paramInt2 = j / 2;
      byte[] arrayOfByte1 = new byte[paramInt2];
      for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
        arrayOfByte1[paramInt1] = ((byte)(byte)(a.a(paramArrayOfByte[(paramInt1 * 2)], paramArrayOfByte[(paramInt1 * 2 + 1)], ckT) / 256));
      AppMethodBeat.o(137009);
      paramArrayOfByte = arrayOfByte1;
    }
  }

  public static byte[] c(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(137010);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(137010);
    while (true)
    {
      return paramArrayOfByte;
      if (paramInt1 == paramInt2)
        AppMethodBeat.o(137010);
      else
        switch (paramInt3)
        {
        default:
          AppMethodBeat.o(137010);
        case 1:
        case 2:
        case 3:
        }
    }
    int m = paramArrayOfByte.length;
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(137010);
      break;
      switch (paramInt2)
      {
      default:
        break;
      case 2:
        arrayOfByte1 = new byte[m * 2];
        paramInt1 = k;
        paramInt2 = i;
        switch (paramInt3)
        {
        default:
        case 1:
        case 3:
        case 2:
        }
        while (true)
        {
          AppMethodBeat.o(137010);
          paramArrayOfByte = arrayOfByte1;
          break;
          while (paramInt1 < m)
          {
            paramInt2 = paramArrayOfByte[paramInt1];
            arrayOfByte1[(paramInt1 * 2)] = ((byte)paramInt2);
            arrayOfByte1[(paramInt1 * 2 + 1)] = ((byte)paramInt2);
            paramInt1++;
          }
          while (paramInt2 < m)
          {
            paramInt1 = paramArrayOfByte[paramInt2];
            paramInt3 = paramArrayOfByte[(paramInt2 + 1)];
            arrayOfByte1[(paramInt2 * 2)] = ((byte)paramInt1);
            arrayOfByte1[(paramInt2 * 2 + 1)] = ((byte)paramInt3);
            arrayOfByte1[(paramInt2 * 2 + 2)] = ((byte)paramInt1);
            arrayOfByte1[(paramInt2 * 2 + 3)] = ((byte)paramInt3);
            paramInt2 += 2;
          }
        }
        switch (paramInt2)
        {
        default:
        case 1:
        }
        break;
      }
    }
    paramInt2 = m / 2;
    byte[] arrayOfByte1 = new byte[paramInt2];
    paramInt1 = j;
    switch (paramInt3)
    {
    default:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(137010);
      paramArrayOfByte = arrayOfByte1;
      break;
      while (paramInt1 < paramInt2)
      {
        arrayOfByte1[paramInt1] = ((byte)(byte)((short)((short)paramArrayOfByte[(paramInt1 * 2)] + (short)paramArrayOfByte[(paramInt1 * 2 + 1)]) >> 1));
        paramInt1 += 2;
      }
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1 += 2)
      {
        byte b1 = paramArrayOfByte[(paramInt1 * 2)];
        byte b2 = paramArrayOfByte[(paramInt1 * 2 + 1)];
        byte b3 = paramArrayOfByte[(paramInt1 * 2 + 2)];
        byte b4 = paramArrayOfByte[(paramInt1 * 2 + 3)];
        boolean bool = ckT;
        paramInt3 = a.a(b1, b2, bool);
        i = a.a(b3, b4, bool);
        byte[] arrayOfByte2 = a.getBytes((short)(paramInt3 / 2 + i / 2), bool);
        arrayOfByte1[paramInt1] = ((byte)arrayOfByte2[0]);
        arrayOfByte1[(paramInt1 + 1)] = ((byte)arrayOfByte2[1]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.c.b
 * JD-Core Version:    0.6.2
 */