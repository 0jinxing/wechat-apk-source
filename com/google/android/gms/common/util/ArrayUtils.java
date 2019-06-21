package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

@VisibleForTesting
public final class ArrayUtils
{
  public static int[] appendToArray(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(90021);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0));
    for (paramArrayOfInt = new int[1]; ; paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length + 1))
    {
      paramArrayOfInt[(paramArrayOfInt.length - 1)] = paramInt;
      AppMethodBeat.o(90021);
      return paramArrayOfInt;
    }
  }

  public static <T> T[] appendToArray(T[] paramArrayOfT, T paramT)
  {
    AppMethodBeat.i(90020);
    if ((paramArrayOfT == null) && (paramT == null))
    {
      paramArrayOfT = new IllegalArgumentException("Cannot generate array of generic type w/o class info");
      AppMethodBeat.o(90020);
      throw paramArrayOfT;
    }
    if (paramArrayOfT == null);
    for (paramArrayOfT = (Object[])Array.newInstance(paramT.getClass(), 1); ; paramArrayOfT = Arrays.copyOf(paramArrayOfT, paramArrayOfT.length + 1))
    {
      paramArrayOfT[(paramArrayOfT.length - 1)] = paramT;
      AppMethodBeat.o(90020);
      return paramArrayOfT;
    }
  }

  public static <T> T[] concat(T[][] paramArrayOfT)
  {
    AppMethodBeat.i(90018);
    if (paramArrayOfT.length == 0)
    {
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass(), 0);
      AppMethodBeat.o(90018);
    }
    while (true)
    {
      return paramArrayOfT;
      int i = 0;
      int j = 0;
      while (i < paramArrayOfT.length)
      {
        j += paramArrayOfT[i].length;
        i++;
      }
      Object[] arrayOfObject = Arrays.copyOf(paramArrayOfT[0], j);
      j = paramArrayOfT[0].length;
      for (i = 1; i < paramArrayOfT.length; i++)
      {
        T[] arrayOfT = paramArrayOfT[i];
        System.arraycopy(arrayOfT, 0, arrayOfObject, j, arrayOfT.length);
        j += arrayOfT.length;
      }
      AppMethodBeat.o(90018);
      paramArrayOfT = arrayOfObject;
    }
  }

  public static byte[] concatByteArrays(byte[][] paramArrayOfByte)
  {
    AppMethodBeat.i(90019);
    if (paramArrayOfByte.length == 0)
    {
      paramArrayOfByte = new byte[0];
      AppMethodBeat.o(90019);
    }
    while (true)
    {
      return paramArrayOfByte;
      int i = 0;
      int j = 0;
      while (i < paramArrayOfByte.length)
      {
        j += paramArrayOfByte[i].length;
        i++;
      }
      byte[] arrayOfByte1 = Arrays.copyOf(paramArrayOfByte[0], j);
      i = paramArrayOfByte[0].length;
      for (j = 1; j < paramArrayOfByte.length; j++)
      {
        byte[] arrayOfByte2 = paramArrayOfByte[j];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i, arrayOfByte2.length);
        i += arrayOfByte2.length;
      }
      AppMethodBeat.o(90019);
      paramArrayOfByte = arrayOfByte1;
    }
  }

  public static boolean contains(byte[] paramArrayOfByte, byte paramByte)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramArrayOfByte == null)
    {
      bool2 = bool1;
      return bool2;
    }
    int i = paramArrayOfByte.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      if (paramArrayOfByte[j] == paramByte)
      {
        bool2 = true;
        break;
      }
    }
  }

  public static boolean contains(char[] paramArrayOfChar, char paramChar)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramArrayOfChar == null)
    {
      bool2 = bool1;
      return bool2;
    }
    int i = paramArrayOfChar.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      if (paramArrayOfChar[j] == paramChar)
      {
        bool2 = true;
        break;
      }
    }
  }

  public static boolean contains(double[] paramArrayOfDouble, double paramDouble)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramArrayOfDouble == null)
    {
      bool2 = bool1;
      return bool2;
    }
    int i = paramArrayOfDouble.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      if (paramArrayOfDouble[j] == paramDouble)
      {
        bool2 = true;
        break;
      }
    }
  }

  public static boolean contains(float[] paramArrayOfFloat, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramArrayOfFloat == null)
    {
      bool2 = bool1;
      return bool2;
    }
    int i = paramArrayOfFloat.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      float f = paramArrayOfFloat[j];
      if ((paramFloat1 - paramFloat2 <= f) && (f <= paramFloat1 + paramFloat2))
      {
        bool2 = true;
        break;
      }
    }
  }

  public static boolean contains(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramArrayOfInt == null)
    {
      bool2 = bool1;
      return bool2;
    }
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      if (paramArrayOfInt[j] == paramInt)
      {
        bool2 = true;
        break;
      }
    }
  }

  public static <T> boolean contains(T[] paramArrayOfT, T paramT)
  {
    AppMethodBeat.i(90000);
    boolean bool;
    if (indexOf(paramArrayOfT, paramT) >= 0)
    {
      bool = true;
      AppMethodBeat.o(90000);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90000);
    }
  }

  public static boolean contains(short[] paramArrayOfShort, short paramShort)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramArrayOfShort == null)
    {
      bool2 = bool1;
      return bool2;
    }
    int i = paramArrayOfShort.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      if (paramArrayOfShort[j] == paramShort)
      {
        bool2 = true;
        break;
      }
    }
  }

  public static boolean contains(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramArrayOfBoolean == null)
    {
      bool2 = bool1;
      return bool2;
    }
    int i = paramArrayOfBoolean.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      if (paramArrayOfBoolean[j] == paramBoolean)
      {
        bool2 = true;
        break;
      }
    }
  }

  public static boolean containsIgnoreCase(String[] paramArrayOfString, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(90001);
    if (paramArrayOfString == null)
      AppMethodBeat.o(90001);
    while (true)
    {
      return bool;
      int i = paramArrayOfString.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label82;
        String str = paramArrayOfString[j];
        if (str == paramString)
        {
          AppMethodBeat.o(90001);
          bool = true;
          break;
        }
        if ((str != null) && (str.equalsIgnoreCase(paramString)))
        {
          AppMethodBeat.o(90001);
          bool = true;
          break;
        }
      }
      label82: AppMethodBeat.o(90001);
    }
  }

  public static boolean equalsAnyOrder(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    AppMethodBeat.i(90002);
    boolean bool;
    if (paramArrayOfObject1 == paramArrayOfObject2)
    {
      AppMethodBeat.o(90002);
      bool = true;
    }
    while (true)
    {
      return bool;
      int i;
      if (paramArrayOfObject1 == null)
      {
        i = 0;
        label25: if (paramArrayOfObject2 != null)
          break label57;
      }
      label57: for (int j = 0; ; j = paramArrayOfObject2.length)
      {
        if ((i != 0) || (j != 0))
          break label64;
        AppMethodBeat.o(90002);
        bool = true;
        break;
        i = paramArrayOfObject1.length;
        break label25;
      }
      label64: if (i != j)
      {
        AppMethodBeat.o(90002);
        bool = false;
      }
      else
      {
        zza localzza = new zza(i);
        j = paramArrayOfObject1.length;
        for (i = 0; i < j; i++)
          localzza.zzb(paramArrayOfObject1[i]);
        j = paramArrayOfObject2.length;
        for (i = 0; i < j; i++)
          localzza.zzc(paramArrayOfObject2[i]);
        paramArrayOfObject1 = localzza.zzzb.values().iterator();
        while (true)
          if (paramArrayOfObject1.hasNext())
            if (((zza)paramArrayOfObject1.next()).count != 0)
            {
              AppMethodBeat.o(90002);
              bool = false;
              break;
            }
        AppMethodBeat.o(90002);
        bool = true;
      }
    }
  }

  public static <T> int indexOf(T[] paramArrayOfT, T paramT)
  {
    int i = 0;
    AppMethodBeat.i(89999);
    int j;
    if (paramArrayOfT != null)
    {
      j = paramArrayOfT.length;
      if (i >= j)
        break label47;
      if (!Objects.equal(paramArrayOfT[i], paramT))
        break label41;
      AppMethodBeat.o(89999);
    }
    while (true)
    {
      return i;
      j = 0;
      break;
      label41: i++;
      break;
      label47: i = -1;
      AppMethodBeat.o(89999);
    }
  }

  public static <T> ArrayList<T> newArrayList()
  {
    AppMethodBeat.i(90027);
    ArrayList localArrayList = new ArrayList();
    AppMethodBeat.o(90027);
    return localArrayList;
  }

  public static <T> int rearrange(T[] paramArrayOfT, Predicate<T> paramPredicate)
  {
    AppMethodBeat.i(90026);
    int i;
    if ((paramArrayOfT == null) || (paramArrayOfT.length == 0))
    {
      AppMethodBeat.o(90026);
      i = 0;
    }
    while (true)
    {
      return i;
      int j = paramArrayOfT.length;
      int k = 0;
      int m;
      for (i = 0; k < j; i = m)
      {
        m = i;
        if (paramPredicate.apply(paramArrayOfT[k]))
        {
          if (i != k)
          {
            T ? = paramArrayOfT[i];
            paramArrayOfT[i] = paramArrayOfT[k];
            paramArrayOfT[k] = ?;
          }
          m = i + 1;
        }
        k++;
      }
      AppMethodBeat.o(90026);
    }
  }

  public static int[] removeAll(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(90023);
    if (paramArrayOfInt1 == null)
    {
      paramArrayOfInt1 = null;
      AppMethodBeat.o(90023);
    }
    while (true)
    {
      return paramArrayOfInt1;
      if ((paramArrayOfInt2 != null) && (paramArrayOfInt2.length != 0))
        break;
      paramArrayOfInt1 = Arrays.copyOf(paramArrayOfInt1, paramArrayOfInt1.length);
      AppMethodBeat.o(90023);
    }
    int[] arrayOfInt = new int[paramArrayOfInt1.length];
    int i;
    int j;
    int k;
    label62: int m;
    int n;
    if (paramArrayOfInt2.length == 1)
    {
      i = paramArrayOfInt1.length;
      j = 0;
      k = 0;
      m = k;
      if (j >= i)
        break label164;
      n = paramArrayOfInt1[j];
      if (paramArrayOfInt2[0] == n)
        break label182;
      m = k + 1;
      arrayOfInt[k] = n;
      k = m;
    }
    label164: label179: label182: 
    while (true)
    {
      j++;
      break label62;
      i = paramArrayOfInt1.length;
      j = 0;
      k = 0;
      label117: m = k;
      if (j < i)
      {
        n = paramArrayOfInt1[j];
        if (contains(paramArrayOfInt2, n))
          break label179;
        m = k + 1;
        arrayOfInt[k] = n;
        k = m;
      }
      while (true)
      {
        j++;
        break label117;
        paramArrayOfInt1 = resize(arrayOfInt, m);
        AppMethodBeat.o(90023);
        break;
      }
    }
  }

  public static <T> T[] removeAll(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    AppMethodBeat.i(90022);
    if (paramArrayOfT1 == null)
    {
      paramArrayOfT1 = null;
      AppMethodBeat.o(90022);
    }
    while (true)
    {
      return paramArrayOfT1;
      if ((paramArrayOfT2 != null) && (paramArrayOfT2.length != 0))
        break;
      paramArrayOfT1 = Arrays.copyOf(paramArrayOfT1, paramArrayOfT1.length);
      AppMethodBeat.o(90022);
    }
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT2.getClass().getComponentType(), paramArrayOfT1.length);
    int i;
    int j;
    int k;
    label73: int m;
    T ?;
    if (paramArrayOfT2.length == 1)
    {
      i = paramArrayOfT1.length;
      j = 0;
      k = 0;
      m = k;
      if (j >= i)
        break label178;
      ? = paramArrayOfT1[j];
      if (Objects.equal(paramArrayOfT2[0], ?))
        break label196;
      m = k + 1;
      arrayOfObject[k] = ?;
      k = m;
    }
    label131: label178: label193: label196: 
    while (true)
    {
      j++;
      break label73;
      i = paramArrayOfT1.length;
      j = 0;
      k = 0;
      m = k;
      if (j < i)
      {
        ? = paramArrayOfT1[j];
        if (contains(paramArrayOfT2, ?))
          break label193;
        m = k + 1;
        arrayOfObject[k] = ?;
        k = m;
      }
      while (true)
      {
        j++;
        break label131;
        paramArrayOfT1 = resize(arrayOfObject, m);
        AppMethodBeat.o(90022);
        break;
      }
    }
  }

  public static int[] resize(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(90025);
    int[] arrayOfInt;
    if (paramArrayOfInt == null)
    {
      arrayOfInt = null;
      AppMethodBeat.o(90025);
    }
    while (true)
    {
      return arrayOfInt;
      arrayOfInt = paramArrayOfInt;
      if (paramInt != paramArrayOfInt.length)
        arrayOfInt = Arrays.copyOf(paramArrayOfInt, paramInt);
      AppMethodBeat.o(90025);
    }
  }

  public static <T> T[] resize(T[] paramArrayOfT, int paramInt)
  {
    AppMethodBeat.i(90024);
    Object localObject;
    if (paramArrayOfT == null)
    {
      localObject = null;
      AppMethodBeat.o(90024);
    }
    while (true)
    {
      return localObject;
      localObject = paramArrayOfT;
      if (paramInt != paramArrayOfT.length)
        localObject = Arrays.copyOf(paramArrayOfT, paramInt);
      AppMethodBeat.o(90024);
    }
  }

  public static <T> ArrayList<T> toArrayList(Collection<T> paramCollection)
  {
    AppMethodBeat.i(90029);
    if (paramCollection == null)
    {
      paramCollection = null;
      AppMethodBeat.o(90029);
    }
    while (true)
    {
      return paramCollection;
      paramCollection = new ArrayList(paramCollection);
      AppMethodBeat.o(90029);
    }
  }

  public static <T> ArrayList<T> toArrayList(T[] paramArrayOfT)
  {
    AppMethodBeat.i(90028);
    int i = paramArrayOfT.length;
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(paramArrayOfT[j]);
    AppMethodBeat.o(90028);
    return localArrayList;
  }

  public static long[] toLongArray(Collection<Long> paramCollection)
  {
    AppMethodBeat.i(90032);
    if ((paramCollection == null) || (paramCollection.size() == 0))
    {
      paramCollection = new long[0];
      AppMethodBeat.o(90032);
    }
    while (true)
    {
      return paramCollection;
      long[] arrayOfLong = new long[paramCollection.size()];
      paramCollection = paramCollection.iterator();
      for (int i = 0; paramCollection.hasNext(); i++)
        arrayOfLong[i] = ((Long)paramCollection.next()).longValue();
      AppMethodBeat.o(90032);
      paramCollection = arrayOfLong;
    }
  }

  public static long[] toLongArray(Long[] paramArrayOfLong)
  {
    int i = 0;
    AppMethodBeat.i(90033);
    if (paramArrayOfLong == null)
    {
      paramArrayOfLong = new long[0];
      AppMethodBeat.o(90033);
    }
    while (true)
    {
      return paramArrayOfLong;
      long[] arrayOfLong = new long[paramArrayOfLong.length];
      while (i < paramArrayOfLong.length)
      {
        arrayOfLong[i] = paramArrayOfLong[i].longValue();
        i++;
      }
      AppMethodBeat.o(90033);
      paramArrayOfLong = arrayOfLong;
    }
  }

  public static int[] toPrimitiveArray(Collection<Integer> paramCollection)
  {
    AppMethodBeat.i(90030);
    if ((paramCollection == null) || (paramCollection.size() == 0))
    {
      paramCollection = new int[0];
      AppMethodBeat.o(90030);
    }
    while (true)
    {
      return paramCollection;
      int[] arrayOfInt = new int[paramCollection.size()];
      paramCollection = paramCollection.iterator();
      for (int i = 0; paramCollection.hasNext(); i++)
        arrayOfInt[i] = ((Integer)paramCollection.next()).intValue();
      AppMethodBeat.o(90030);
      paramCollection = arrayOfInt;
    }
  }

  public static int[] toPrimitiveArray(Integer[] paramArrayOfInteger)
  {
    int i = 0;
    AppMethodBeat.i(90031);
    if (paramArrayOfInteger == null)
    {
      paramArrayOfInteger = new int[0];
      AppMethodBeat.o(90031);
    }
    while (true)
    {
      return paramArrayOfInteger;
      int[] arrayOfInt = new int[paramArrayOfInteger.length];
      while (i < paramArrayOfInteger.length)
      {
        arrayOfInt[i] = paramArrayOfInteger[i].intValue();
        i++;
      }
      AppMethodBeat.o(90031);
      paramArrayOfInteger = arrayOfInt;
    }
  }

  public static String[] toStringArray(Collection<String> paramCollection)
  {
    AppMethodBeat.i(90034);
    if ((paramCollection == null) || (paramCollection.size() == 0))
    {
      paramCollection = new String[0];
      AppMethodBeat.o(90034);
    }
    while (true)
    {
      return paramCollection;
      paramCollection = (String[])paramCollection.toArray(new String[paramCollection.size()]);
      AppMethodBeat.o(90034);
    }
  }

  public static Boolean[] toWrapperArray(boolean[] paramArrayOfBoolean)
  {
    AppMethodBeat.i(90009);
    if (paramArrayOfBoolean == null)
    {
      paramArrayOfBoolean = null;
      AppMethodBeat.o(90009);
    }
    while (true)
    {
      return paramArrayOfBoolean;
      int i = paramArrayOfBoolean.length;
      Boolean[] arrayOfBoolean = new Boolean[i];
      for (int j = 0; j < i; j++)
        arrayOfBoolean[j] = Boolean.valueOf(paramArrayOfBoolean[j]);
      AppMethodBeat.o(90009);
      paramArrayOfBoolean = arrayOfBoolean;
    }
  }

  public static Byte[] toWrapperArray(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90008);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(90008);
    }
    while (true)
    {
      return paramArrayOfByte;
      int i = paramArrayOfByte.length;
      Byte[] arrayOfByte = new Byte[i];
      for (int j = 0; j < i; j++)
        arrayOfByte[j] = Byte.valueOf(paramArrayOfByte[j]);
      AppMethodBeat.o(90008);
      paramArrayOfByte = arrayOfByte;
    }
  }

  public static Character[] toWrapperArray(char[] paramArrayOfChar)
  {
    AppMethodBeat.i(90004);
    if (paramArrayOfChar == null)
    {
      paramArrayOfChar = null;
      AppMethodBeat.o(90004);
    }
    while (true)
    {
      return paramArrayOfChar;
      int i = paramArrayOfChar.length;
      Character[] arrayOfCharacter = new Character[i];
      for (int j = 0; j < i; j++)
        arrayOfCharacter[j] = Character.valueOf(paramArrayOfChar[j]);
      AppMethodBeat.o(90004);
      paramArrayOfChar = arrayOfCharacter;
    }
  }

  public static Double[] toWrapperArray(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(90006);
    if (paramArrayOfDouble == null)
    {
      paramArrayOfDouble = null;
      AppMethodBeat.o(90006);
    }
    while (true)
    {
      return paramArrayOfDouble;
      int i = paramArrayOfDouble.length;
      Double[] arrayOfDouble = new Double[i];
      for (int j = 0; j < i; j++)
        arrayOfDouble[j] = Double.valueOf(paramArrayOfDouble[j]);
      AppMethodBeat.o(90006);
      paramArrayOfDouble = arrayOfDouble;
    }
  }

  public static Float[] toWrapperArray(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(90007);
    if (paramArrayOfFloat == null)
    {
      paramArrayOfFloat = null;
      AppMethodBeat.o(90007);
    }
    while (true)
    {
      return paramArrayOfFloat;
      int i = paramArrayOfFloat.length;
      Float[] arrayOfFloat = new Float[i];
      for (int j = 0; j < i; j++)
        arrayOfFloat[j] = Float.valueOf(paramArrayOfFloat[j]);
      AppMethodBeat.o(90007);
      paramArrayOfFloat = arrayOfFloat;
    }
  }

  public static Integer[] toWrapperArray(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(90003);
    if (paramArrayOfInt == null)
    {
      paramArrayOfInt = null;
      AppMethodBeat.o(90003);
    }
    while (true)
    {
      return paramArrayOfInt;
      int i = paramArrayOfInt.length;
      Integer[] arrayOfInteger = new Integer[i];
      for (int j = 0; j < i; j++)
        arrayOfInteger[j] = Integer.valueOf(paramArrayOfInt[j]);
      AppMethodBeat.o(90003);
      paramArrayOfInt = arrayOfInteger;
    }
  }

  public static Long[] toWrapperArray(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(90005);
    if (paramArrayOfLong == null)
    {
      paramArrayOfLong = null;
      AppMethodBeat.o(90005);
    }
    while (true)
    {
      return paramArrayOfLong;
      int i = paramArrayOfLong.length;
      Long[] arrayOfLong = new Long[i];
      for (int j = 0; j < i; j++)
        arrayOfLong[j] = Long.valueOf(paramArrayOfLong[j]);
      AppMethodBeat.o(90005);
      paramArrayOfLong = arrayOfLong;
    }
  }

  public static Short[] toWrapperArray(short[] paramArrayOfShort)
  {
    AppMethodBeat.i(90010);
    if (paramArrayOfShort == null)
    {
      paramArrayOfShort = null;
      AppMethodBeat.o(90010);
    }
    while (true)
    {
      return paramArrayOfShort;
      int i = paramArrayOfShort.length;
      Short[] arrayOfShort = new Short[i];
      for (int j = 0; j < i; j++)
        arrayOfShort[j] = Short.valueOf(paramArrayOfShort[j]);
      AppMethodBeat.o(90010);
      paramArrayOfShort = arrayOfShort;
    }
  }

  public static void writeArray(StringBuilder paramStringBuilder, double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(90015);
    int i = paramArrayOfDouble.length;
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Double.toString(paramArrayOfDouble[j]));
    }
    AppMethodBeat.o(90015);
  }

  public static void writeArray(StringBuilder paramStringBuilder, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(90014);
    int i = paramArrayOfFloat.length;
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Float.toString(paramArrayOfFloat[j]));
    }
    AppMethodBeat.o(90014);
  }

  public static void writeArray(StringBuilder paramStringBuilder, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(90012);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Integer.toString(paramArrayOfInt[j]));
    }
    AppMethodBeat.o(90012);
  }

  public static void writeArray(StringBuilder paramStringBuilder, long[] paramArrayOfLong)
  {
    AppMethodBeat.i(90013);
    int i = paramArrayOfLong.length;
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Long.toString(paramArrayOfLong[j]));
    }
    AppMethodBeat.o(90013);
  }

  public static <T> void writeArray(StringBuilder paramStringBuilder, T[] paramArrayOfT)
  {
    AppMethodBeat.i(90011);
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(paramArrayOfT[j].toString());
    }
    AppMethodBeat.o(90011);
  }

  public static void writeArray(StringBuilder paramStringBuilder, boolean[] paramArrayOfBoolean)
  {
    AppMethodBeat.i(90016);
    int i = paramArrayOfBoolean.length;
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Boolean.toString(paramArrayOfBoolean[j]));
    }
    AppMethodBeat.o(90016);
  }

  public static void writeStringArray(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    AppMethodBeat.i(90017);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append("\"").append(paramArrayOfString[j]).append("\"");
    }
    AppMethodBeat.o(90017);
  }

  static final class zza
  {
    HashMap<Object, zza> zzzb;

    zza(int paramInt)
    {
      AppMethodBeat.i(89995);
      this.zzzb = new HashMap(paramInt);
      AppMethodBeat.o(89995);
    }

    private final zza zzd(Object paramObject)
    {
      AppMethodBeat.i(89998);
      zza localzza1 = (zza)this.zzzb.get(paramObject);
      zza localzza2 = localzza1;
      if (localzza1 == null)
      {
        localzza2 = new zza();
        this.zzzb.put(paramObject, localzza2);
      }
      AppMethodBeat.o(89998);
      return localzza2;
    }

    final void zzb(Object paramObject)
    {
      AppMethodBeat.i(89996);
      paramObject = zzd(paramObject);
      paramObject.count += 1;
      AppMethodBeat.o(89996);
    }

    final void zzc(Object paramObject)
    {
      AppMethodBeat.i(89997);
      paramObject = zzd(paramObject);
      paramObject.count -= 1;
      AppMethodBeat.o(89997);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.ArrayUtils
 * JD-Core Version:    0.6.2
 */