package com.qq.taf.jce;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public final class JceUtil
{
  private static final byte[] highDigits;
  private static final int iConstant = 37;
  private static final int iTotal = 17;
  private static final byte[] lowDigits;

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
    for (int i = 0; ; i++)
    {
      if (i >= 256)
      {
        highDigits = arrayOfByte2;
        lowDigits = arrayOfByte3;
        return;
      }
      arrayOfByte2[i] = ((byte)arrayOfByte1[(i >>> 4)]);
      arrayOfByte3[i] = ((byte)arrayOfByte1[(i & 0xF)]);
    }
  }

  public static int compareTo(byte paramByte1, byte paramByte2)
  {
    if (paramByte1 < paramByte2)
      paramByte1 = -1;
    while (true)
    {
      return paramByte1;
      if (paramByte1 > paramByte2)
        paramByte1 = 1;
      else
        paramByte1 = 0;
    }
  }

  public static int compareTo(char paramChar1, char paramChar2)
  {
    if (paramChar1 < paramChar2)
      paramChar1 = 'ð¿¿';
    while (true)
    {
      return paramChar1;
      if (paramChar1 > paramChar2)
        paramChar1 = '\001';
      else
        paramChar1 = '\000';
    }
  }

  public static int compareTo(double paramDouble1, double paramDouble2)
  {
    int i;
    if (paramDouble1 < paramDouble2)
      i = -1;
    while (true)
    {
      return i;
      if (paramDouble1 > paramDouble2)
        i = 1;
      else
        i = 0;
    }
  }

  public static int compareTo(float paramFloat1, float paramFloat2)
  {
    int i;
    if (paramFloat1 < paramFloat2)
      i = -1;
    while (true)
    {
      return i;
      if (paramFloat1 > paramFloat2)
        i = 1;
      else
        i = 0;
    }
  }

  public static int compareTo(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
      paramInt1 = -1;
    while (true)
    {
      return paramInt1;
      if (paramInt1 > paramInt2)
        paramInt1 = 1;
      else
        paramInt1 = 0;
    }
  }

  public static int compareTo(long paramLong1, long paramLong2)
  {
    int i;
    if (paramLong1 < paramLong2)
      i = -1;
    while (true)
    {
      return i;
      if (paramLong1 > paramLong2)
        i = 1;
      else
        i = 0;
    }
  }

  public static <T extends Comparable<T>> int compareTo(T paramT1, T paramT2)
  {
    AppMethodBeat.i(117087);
    int i = paramT1.compareTo(paramT2);
    AppMethodBeat.o(117087);
    return i;
  }

  public static <T extends Comparable<T>> int compareTo(List<T> paramList1, List<T> paramList2)
  {
    AppMethodBeat.i(117088);
    paramList1 = paramList1.iterator();
    paramList2 = paramList2.iterator();
    int i;
    if ((!paramList1.hasNext()) || (!paramList2.hasNext()))
    {
      i = compareTo(paramList1.hasNext(), paramList2.hasNext());
      AppMethodBeat.o(117088);
    }
    while (true)
    {
      return i;
      i = ((Comparable)paramList1.next()).compareTo((Comparable)paramList2.next());
      if (i == 0)
        break;
      AppMethodBeat.o(117088);
    }
  }

  public static int compareTo(short paramShort1, short paramShort2)
  {
    if (paramShort1 < paramShort2)
      paramShort1 = -1;
    while (true)
    {
      return paramShort1;
      if (paramShort1 > paramShort2)
        paramShort1 = 1;
      else
        paramShort1 = 0;
    }
  }

  public static int compareTo(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    int j;
    if (paramBoolean1)
    {
      j = 1;
      if (!paramBoolean2)
        break label21;
    }
    while (true)
    {
      return j - i;
      j = 0;
      break;
      label21: i = 0;
    }
  }

  public static int compareTo(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(117091);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfByte1.length) || (i >= paramArrayOfByte2.length))
      {
        j = compareTo(paramArrayOfByte1.length, paramArrayOfByte2.length);
        AppMethodBeat.o(117091);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfByte1[j], paramArrayOfByte2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117091);
        j = k;
      }
      i++;
    }
  }

  public static int compareTo(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    AppMethodBeat.i(117092);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfChar1.length) || (i >= paramArrayOfChar2.length))
      {
        j = compareTo(paramArrayOfChar1.length, paramArrayOfChar2.length);
        AppMethodBeat.o(117092);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfChar1[j], paramArrayOfChar2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117092);
        j = k;
      }
      i++;
    }
  }

  public static int compareTo(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    AppMethodBeat.i(117097);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfDouble1.length) || (i >= paramArrayOfDouble2.length))
      {
        j = compareTo(paramArrayOfDouble1.length, paramArrayOfDouble2.length);
        AppMethodBeat.o(117097);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfDouble1[j], paramArrayOfDouble2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117097);
        j = k;
      }
      i++;
    }
  }

  public static int compareTo(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(117096);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfFloat1.length) || (i >= paramArrayOfFloat2.length))
      {
        j = compareTo(paramArrayOfFloat1.length, paramArrayOfFloat2.length);
        AppMethodBeat.o(117096);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfFloat1[j], paramArrayOfFloat2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117096);
        j = k;
      }
      i++;
    }
  }

  public static int compareTo(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(117094);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfInt1.length) || (i >= paramArrayOfInt2.length))
      {
        j = compareTo(paramArrayOfInt1.length, paramArrayOfInt2.length);
        AppMethodBeat.o(117094);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfInt1[j], paramArrayOfInt2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117094);
        j = k;
      }
      i++;
    }
  }

  public static int compareTo(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    AppMethodBeat.i(117095);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfLong1.length) || (i >= paramArrayOfLong2.length))
      {
        j = compareTo(paramArrayOfLong1.length, paramArrayOfLong2.length);
        AppMethodBeat.o(117095);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfLong1[j], paramArrayOfLong2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117095);
        j = k;
      }
      i++;
    }
  }

  public static <T extends Comparable<T>> int compareTo(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    AppMethodBeat.i(117089);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfT1.length) || (i >= paramArrayOfT2.length))
      {
        j = compareTo(paramArrayOfT1.length, paramArrayOfT2.length);
        AppMethodBeat.o(117089);
      }
      while (true)
      {
        return j;
        int k = paramArrayOfT1[j].compareTo(paramArrayOfT2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117089);
        j = k;
      }
      i++;
    }
  }

  public static int compareTo(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    AppMethodBeat.i(117093);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfShort1.length) || (i >= paramArrayOfShort2.length))
      {
        j = compareTo(paramArrayOfShort1.length, paramArrayOfShort2.length);
        AppMethodBeat.o(117093);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfShort1[j], paramArrayOfShort2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117093);
        j = k;
      }
      i++;
    }
  }

  public static int compareTo(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    AppMethodBeat.i(117090);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if ((j >= paramArrayOfBoolean1.length) || (i >= paramArrayOfBoolean2.length))
      {
        j = compareTo(paramArrayOfBoolean1.length, paramArrayOfBoolean2.length);
        AppMethodBeat.o(117090);
      }
      while (true)
      {
        return j;
        int k = compareTo(paramArrayOfBoolean1[j], paramArrayOfBoolean2[i]);
        if (k == 0)
          break;
        AppMethodBeat.o(117090);
        j = k;
      }
      i++;
    }
  }

  public static boolean equals(byte paramByte1, byte paramByte2)
  {
    if (paramByte1 == paramByte2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean equals(char paramChar1, char paramChar2)
  {
    if (paramChar1 == paramChar2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean equals(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 == paramDouble2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean equals(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == paramFloat2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean equals(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean equals(long paramLong1, long paramLong2)
  {
    if (paramLong1 == paramLong2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(117086);
    boolean bool = paramObject1.equals(paramObject2);
    AppMethodBeat.o(117086);
    return bool;
  }

  public static boolean equals(short paramShort1, short paramShort2)
  {
    if (paramShort1 == paramShort2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean equals(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == paramBoolean2);
    for (paramBoolean1 = true; ; paramBoolean1 = false)
      return paramBoolean1;
  }

  public static String getHexdump(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(117106);
    int i = paramByteBuffer.remaining();
    if (i == 0)
    {
      paramByteBuffer = "empty";
      AppMethodBeat.o(117106);
      return paramByteBuffer;
    }
    StringBuffer localStringBuffer = new StringBuffer(paramByteBuffer.remaining() * 3 - 1);
    int j = paramByteBuffer.position();
    int k = paramByteBuffer.get() & 0xFF;
    localStringBuffer.append((char)highDigits[k]);
    localStringBuffer.append((char)lowDigits[k]);
    i--;
    while (true)
    {
      if (i <= 0)
      {
        paramByteBuffer.position(j);
        paramByteBuffer = localStringBuffer.toString();
        AppMethodBeat.o(117106);
        break;
      }
      localStringBuffer.append(' ');
      k = paramByteBuffer.get() & 0xFF;
      localStringBuffer.append((char)highDigits[k]);
      localStringBuffer.append((char)lowDigits[k]);
      i--;
    }
  }

  public static String getHexdump(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(117105);
    paramArrayOfByte = getHexdump(ByteBuffer.wrap(paramArrayOfByte));
    AppMethodBeat.o(117105);
    return paramArrayOfByte;
  }

  public static byte[] getJceBufArray(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(117104);
    byte[] arrayOfByte = new byte[paramByteBuffer.position()];
    System.arraycopy(paramByteBuffer.array(), 0, arrayOfByte, 0, arrayOfByte.length);
    AppMethodBeat.o(117104);
    return arrayOfByte;
  }

  public static int hashCode(byte paramByte)
  {
    return paramByte + 629;
  }

  public static int hashCode(char paramChar)
  {
    return paramChar + 'Éµ';
  }

  public static int hashCode(double paramDouble)
  {
    AppMethodBeat.i(117098);
    int i = hashCode(Double.doubleToLongBits(paramDouble));
    AppMethodBeat.o(117098);
    return i;
  }

  public static int hashCode(float paramFloat)
  {
    AppMethodBeat.i(117100);
    int i = Float.floatToIntBits(paramFloat);
    AppMethodBeat.o(117100);
    return i + 629;
  }

  public static int hashCode(int paramInt)
  {
    return paramInt + 629;
  }

  public static int hashCode(long paramLong)
  {
    return (int)(paramLong >> 32 ^ paramLong) + 629;
  }

  public static int hashCode(Object paramObject)
  {
    AppMethodBeat.i(117103);
    int i;
    if (paramObject == null)
    {
      i = 629;
      AppMethodBeat.o(117103);
    }
    while (true)
    {
      return i;
      if (paramObject.getClass().isArray())
      {
        if ((paramObject instanceof long[]))
        {
          i = hashCode((long[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof int[]))
        {
          i = hashCode((int[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof short[]))
        {
          i = hashCode((short[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof char[]))
        {
          i = hashCode((char[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof byte[]))
        {
          i = hashCode((byte[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof double[]))
        {
          i = hashCode((double[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof float[]))
        {
          i = hashCode((float[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof boolean[]))
        {
          i = hashCode((boolean[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        if ((paramObject instanceof JceStruct[]))
        {
          i = hashCode((JceStruct[])paramObject);
          AppMethodBeat.o(117103);
          continue;
        }
        paramObject = (Object[])paramObject;
        break;
      }
      if ((paramObject instanceof JceStruct))
      {
        i = paramObject.hashCode();
        AppMethodBeat.o(117103);
      }
      else
      {
        i = paramObject.hashCode() + 629;
        AppMethodBeat.o(117103);
      }
    }
  }

  public static int hashCode(short paramShort)
  {
    return paramShort + 629;
  }

  public static int hashCode(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 0; ; i = 1)
      return i + 629;
  }

  public static int hashCode(byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = 629;
      return i;
    }
    int j = 17;
    for (int k = 0; ; k++)
    {
      i = j;
      if (k >= paramArrayOfByte.length)
        break;
      j = j * 37 + paramArrayOfByte[k];
    }
  }

  public static int hashCode(char[] paramArrayOfChar)
  {
    int i;
    if (paramArrayOfChar == null)
    {
      i = 629;
      return i;
    }
    int j = 17;
    for (int k = 0; ; k++)
    {
      i = j;
      if (k >= paramArrayOfChar.length)
        break;
      j = j * 37 + paramArrayOfChar[k];
    }
  }

  public static int hashCode(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(117099);
    if (paramArrayOfDouble == null)
    {
      i = 629;
      AppMethodBeat.o(117099);
      return i;
    }
    int i = 17;
    for (int j = 0; ; j++)
    {
      if (j >= paramArrayOfDouble.length)
      {
        AppMethodBeat.o(117099);
        break;
      }
      i = i * 37 + (int)(Double.doubleToLongBits(paramArrayOfDouble[j]) ^ Double.doubleToLongBits(paramArrayOfDouble[j]) >> 32);
    }
  }

  public static int hashCode(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(117101);
    if (paramArrayOfFloat == null)
    {
      i = 629;
      AppMethodBeat.o(117101);
      return i;
    }
    int i = 17;
    for (int j = 0; ; j++)
    {
      if (j >= paramArrayOfFloat.length)
      {
        AppMethodBeat.o(117101);
        break;
      }
      i = i * 37 + Float.floatToIntBits(paramArrayOfFloat[j]);
    }
  }

  public static int hashCode(int[] paramArrayOfInt)
  {
    int i;
    if (paramArrayOfInt == null)
    {
      i = 629;
      return i;
    }
    int j = 17;
    for (int k = 0; ; k++)
    {
      i = j;
      if (k >= paramArrayOfInt.length)
        break;
      j = j * 37 + paramArrayOfInt[k];
    }
  }

  public static int hashCode(long[] paramArrayOfLong)
  {
    int i;
    if (paramArrayOfLong == null)
    {
      i = 629;
      return i;
    }
    int j = 17;
    for (int k = 0; ; k++)
    {
      i = j;
      if (k >= paramArrayOfLong.length)
        break;
      j = j * 37 + (int)(paramArrayOfLong[k] ^ paramArrayOfLong[k] >> 32);
    }
  }

  public static int hashCode(JceStruct[] paramArrayOfJceStruct)
  {
    AppMethodBeat.i(117102);
    if (paramArrayOfJceStruct == null)
    {
      i = 629;
      AppMethodBeat.o(117102);
      return i;
    }
    int i = 17;
    for (int j = 0; ; j++)
    {
      if (j >= paramArrayOfJceStruct.length)
      {
        AppMethodBeat.o(117102);
        break;
      }
      i = i * 37 + paramArrayOfJceStruct[j].hashCode();
    }
  }

  public static int hashCode(short[] paramArrayOfShort)
  {
    int i;
    if (paramArrayOfShort == null)
    {
      i = 629;
      return i;
    }
    int j = 17;
    for (int k = 0; ; k++)
    {
      i = j;
      if (k >= paramArrayOfShort.length)
        break;
      j = j * 37 + paramArrayOfShort[k];
    }
  }

  public static int hashCode(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null)
      i = 629;
    int j;
    int k;
    do
    {
      return i;
      j = 17;
      k = 0;
      i = j;
    }
    while (k >= paramArrayOfBoolean.length);
    if (paramArrayOfBoolean[k] != 0);
    for (int i = 0; ; i = 1)
    {
      j = i + j * 37;
      k++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.JceUtil
 * JD-Core Version:    0.6.2
 */