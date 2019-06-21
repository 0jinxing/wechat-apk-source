package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.nio.ByteOrder;

public class BytesTransUtil
{
  private static BytesTransUtil instance = null;
  private String TAG = "BytesTransUtil";

  public static BytesTransUtil getInstance()
  {
    AppMethodBeat.i(105543);
    if (instance == null)
      instance = new BytesTransUtil();
    BytesTransUtil localBytesTransUtil = instance;
    AppMethodBeat.o(105543);
    return localBytesTransUtil;
  }

  public int[] Bytes2Ints(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105558);
    int[] arrayOfInt = new int[paramArrayOfByte.length / 4];
    for (int i = 0; i < arrayOfInt.length; i++)
    {
      byte[] arrayOfByte = new byte[4];
      for (int j = 0; j < 4; j++)
        arrayOfByte[j] = ((byte)paramArrayOfByte[(i * 4 + j)]);
      arrayOfInt[i] = getInt(arrayOfByte);
      System.out.println("2out->" + arrayOfInt[i]);
    }
    AppMethodBeat.o(105558);
    return arrayOfInt;
  }

  public long[] Bytes2Longs(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105560);
    long[] arrayOfLong = new long[paramArrayOfByte.length / 8];
    for (int i = 0; i < arrayOfLong.length; i++)
    {
      byte[] arrayOfByte = new byte[8];
      for (int j = 0; j < 8; j++)
        arrayOfByte[j] = ((byte)paramArrayOfByte[(i * 8 + j)]);
      arrayOfLong[i] = getLong(arrayOfByte);
    }
    AppMethodBeat.o(105560);
    return arrayOfLong;
  }

  public short[] Bytes2Shorts(short[] paramArrayOfShort, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105555);
    byte[] arrayOfByte = new byte[2];
    for (int i = 0; i < paramArrayOfShort.length; i++)
    {
      System.arraycopy(paramArrayOfByte, i * 2, arrayOfByte, 0, 2);
      paramArrayOfShort[i] = getShort(arrayOfByte);
    }
    AppMethodBeat.o(105555);
    return paramArrayOfShort;
  }

  public byte[] Ints2Bytes(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(105559);
    byte[] arrayOfByte1 = new byte[paramArrayOfInt.length * 4];
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      byte[] arrayOfByte2 = getBytes(paramArrayOfInt[i]);
      System.out.println("1out->" + paramArrayOfInt[i]);
      for (int j = 0; j < 4; j++)
        arrayOfByte1[(i * 4 + j)] = ((byte)arrayOfByte2[j]);
    }
    AppMethodBeat.o(105559);
    return arrayOfByte1;
  }

  public byte[] Longs2Bytes(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(105561);
    byte[] arrayOfByte1 = new byte[paramArrayOfLong.length * 8];
    for (int i = 0; i < paramArrayOfLong.length; i++)
    {
      byte[] arrayOfByte2 = getBytes(paramArrayOfLong[i]);
      for (int j = 0; j < 8; j++)
        arrayOfByte1[(i * 8 + j)] = ((byte)arrayOfByte2[j]);
    }
    AppMethodBeat.o(105561);
    return arrayOfByte1;
  }

  public void Shorts2Bytes(short[] paramArrayOfShort, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105557);
    for (int i = 0; i < paramArrayOfShort.length; i++)
      System.arraycopy(getBytes(paramArrayOfShort[i]), 0, paramArrayOfByte, i * 2, 2);
    AppMethodBeat.o(105557);
  }

  public byte[] Shorts2Bytes(short[] paramArrayOfShort)
  {
    AppMethodBeat.i(105556);
    byte[] arrayOfByte = new byte[paramArrayOfShort.length * 2];
    Shorts2Bytes(paramArrayOfShort, arrayOfByte);
    AppMethodBeat.o(105556);
    return arrayOfByte;
  }

  public byte[] getBytes(int paramInt)
  {
    AppMethodBeat.i(105549);
    byte[] arrayOfByte = getBytes(paramInt, testCPU());
    AppMethodBeat.o(105549);
    return arrayOfByte;
  }

  public byte[] getBytes(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(105545);
    byte[] arrayOfByte = new byte[4];
    if (paramBoolean)
      for (i = 3; i >= 0; i--)
      {
        arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
        paramInt >>= 8;
      }
    System.out.println("1");
    for (int i = 0; i < 4; i++)
    {
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
      paramInt >>= 8;
    }
    AppMethodBeat.o(105545);
    return arrayOfByte;
  }

  public byte[] getBytes(long paramLong)
  {
    AppMethodBeat.i(105551);
    byte[] arrayOfByte = getBytes(paramLong, testCPU());
    AppMethodBeat.o(105551);
    return arrayOfByte;
  }

  public byte[] getBytes(long paramLong, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[8];
    if (paramBoolean)
      for (i = 7; i >= 0; i--)
      {
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong & 0xFF));
        paramLong >>= 8;
      }
    for (int i = 0; i < 8; i++)
    {
      arrayOfByte[i] = ((byte)(byte)(int)(paramLong & 0xFF));
      paramLong >>= 8;
    }
    return arrayOfByte;
  }

  public byte[] getBytes(short paramShort)
  {
    AppMethodBeat.i(105550);
    byte[] arrayOfByte = getBytes(paramShort, testCPU());
    AppMethodBeat.o(105550);
    return arrayOfByte;
  }

  public byte[] getBytes(short paramShort, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[2];
    if (paramBoolean)
    {
      short s = 1;
      i = paramShort;
      for (paramShort = s; paramShort >= 0; paramShort--)
      {
        arrayOfByte[paramShort] = ((byte)(byte)(i & 0xFF));
        i = (short)(i >> 8);
      }
    }
    for (int i = 0; i < 2; i++)
    {
      arrayOfByte[i] = ((byte)(byte)(paramShort & 0xFF));
      paramShort = (short)(paramShort >> 8);
    }
    return arrayOfByte;
  }

  public int getInt(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105552);
    int i = getInt(paramArrayOfByte, testCPU());
    AppMethodBeat.o(105552);
    return i;
  }

  public int getInt(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(105547);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new IllegalArgumentException("byte array is null!");
      AppMethodBeat.o(105547);
      throw paramArrayOfByte;
    }
    if (paramArrayOfByte.length > 4)
    {
      paramArrayOfByte = new IllegalArgumentException("byte array size > 4 !");
      AppMethodBeat.o(105547);
      throw paramArrayOfByte;
    }
    int k;
    if (paramBoolean)
    {
      i = 0;
      for (j = 0; ; j++)
      {
        k = i;
        if (j >= paramArrayOfByte.length)
          break;
        i = i << 8 | paramArrayOfByte[j] & 0xFF;
      }
    }
    int j = paramArrayOfByte.length - 1;
    int i = 0;
    while (true)
    {
      k = i;
      if (j < 0)
        break;
      i = i << 8 | paramArrayOfByte[j] & 0xFF;
      j--;
    }
    AppMethodBeat.o(105547);
    return k;
  }

  public long getLong(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105554);
    long l = getLong(paramArrayOfByte, testCPU());
    AppMethodBeat.o(105554);
    return l;
  }

  public long getLong(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(105548);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new IllegalArgumentException("byte array is null!");
      AppMethodBeat.o(105548);
      throw paramArrayOfByte;
    }
    if (paramArrayOfByte.length > 8)
    {
      paramArrayOfByte = new IllegalArgumentException("byte array size > 8 !");
      AppMethodBeat.o(105548);
      throw paramArrayOfByte;
    }
    long l1 = 0L;
    long l2;
    if (paramBoolean)
      for (i = 0; ; i++)
      {
        l2 = l1;
        if (i >= paramArrayOfByte.length)
          break;
        l1 = l1 << 8 | paramArrayOfByte[i] & 0xFF;
      }
    for (int i = paramArrayOfByte.length - 1; ; i--)
    {
      l2 = l1;
      if (i < 0)
        break;
      l1 = l1 << 8 | paramArrayOfByte[i] & 0xFF;
    }
    AppMethodBeat.o(105548);
    return l2;
  }

  public short getShort(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105553);
    short s = getShort(paramArrayOfByte, testCPU());
    AppMethodBeat.o(105553);
    return s;
  }

  public short getShort(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(105546);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new IllegalArgumentException("byte array is null!");
      AppMethodBeat.o(105546);
      throw paramArrayOfByte;
    }
    if (paramArrayOfByte.length > 2)
    {
      paramArrayOfByte = new IllegalArgumentException("byte array size > 2 !");
      AppMethodBeat.o(105546);
      throw paramArrayOfByte;
    }
    short s2;
    if (paramBoolean)
    {
      s1 = 0;
      for (i = 0; ; i++)
      {
        s2 = s1;
        if (i >= paramArrayOfByte.length)
          break;
        s1 = (short)((short)(s1 << 8) | paramArrayOfByte[i] & 0xFF);
      }
    }
    int i = paramArrayOfByte.length - 1;
    short s1 = 0;
    while (true)
    {
      s2 = s1;
      if (i < 0)
        break;
      s1 = (short)((short)(s1 << 8) | paramArrayOfByte[i] & 0xFF);
      i--;
    }
    AppMethodBeat.o(105546);
    return s2;
  }

  public boolean testCPU()
  {
    AppMethodBeat.i(105544);
    boolean bool;
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN)
    {
      bool = true;
      AppMethodBeat.o(105544);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105544);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.BytesTransUtil
 * JD-Core Version:    0.6.2
 */