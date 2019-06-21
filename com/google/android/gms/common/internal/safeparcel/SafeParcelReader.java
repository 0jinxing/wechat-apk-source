package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader
{
  public static BigDecimal createBigDecimal(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89750);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89750);
    }
    while (true)
    {
      return paramParcel;
      byte[] arrayOfByte = paramParcel.createByteArray();
      int j = paramParcel.readInt();
      paramParcel.setDataPosition(paramInt + i);
      paramParcel = new BigDecimal(new BigInteger(arrayOfByte), j);
      AppMethodBeat.o(89750);
    }
  }

  public static BigDecimal[] createBigDecimalArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89764);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89764);
    }
    while (true)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      BigDecimal[] arrayOfBigDecimal = new BigDecimal[k];
      for (paramInt = 0; paramInt < k; paramInt++)
      {
        byte[] arrayOfByte = paramParcel.createByteArray();
        int m = paramParcel.readInt();
        arrayOfBigDecimal[paramInt] = new BigDecimal(new BigInteger(arrayOfByte), m);
      }
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89764);
      paramParcel = arrayOfBigDecimal;
    }
  }

  public static BigInteger createBigInteger(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89745);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89745);
    }
    while (true)
    {
      return paramParcel;
      byte[] arrayOfByte = paramParcel.createByteArray();
      paramParcel.setDataPosition(i + paramInt);
      paramParcel = new BigInteger(arrayOfByte);
      AppMethodBeat.o(89745);
    }
  }

  public static BigInteger[] createBigIntegerArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89761);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89761);
    }
    while (true)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      BigInteger[] arrayOfBigInteger = new BigInteger[k];
      for (paramInt = 0; paramInt < k; paramInt++)
        arrayOfBigInteger[paramInt] = new BigInteger(paramParcel.createByteArray());
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89761);
      paramParcel = arrayOfBigInteger;
    }
  }

  public static boolean[] createBooleanArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89757);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89757);
    }
    while (true)
    {
      return paramParcel;
      boolean[] arrayOfBoolean = paramParcel.createBooleanArray();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89757);
      paramParcel = arrayOfBoolean;
    }
  }

  public static ArrayList<Boolean> createBooleanList(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89767);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89767);
    }
    while (true)
    {
      return paramParcel;
      ArrayList localArrayList = new ArrayList();
      int k = paramParcel.readInt();
      paramInt = 0;
      if (paramInt < k)
      {
        if (paramParcel.readInt() != 0);
        for (boolean bool = true; ; bool = false)
        {
          localArrayList.add(Boolean.valueOf(bool));
          paramInt++;
          break;
        }
      }
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89767);
      paramParcel = localArrayList;
    }
  }

  public static Bundle createBundle(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89754);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89754);
    }
    while (true)
    {
      return paramParcel;
      Bundle localBundle = paramParcel.readBundle();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89754);
      paramParcel = localBundle;
    }
  }

  public static byte[] createByteArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89755);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89755);
    }
    while (true)
    {
      return paramParcel;
      byte[] arrayOfByte = paramParcel.createByteArray();
      paramParcel.setDataPosition(paramInt + i);
      AppMethodBeat.o(89755);
      paramParcel = arrayOfByte;
    }
  }

  public static byte[][] createByteArrayArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89756);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89756);
    }
    while (true)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      byte[][] arrayOfByte = new byte[k][];
      for (paramInt = 0; paramInt < k; paramInt++)
        arrayOfByte[paramInt] = paramParcel.createByteArray();
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89756);
      paramParcel = arrayOfByte;
    }
  }

  public static SparseArray<byte[]> createByteArraySparseArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89778);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89778);
    }
    while (true)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      SparseArray localSparseArray = new SparseArray(k);
      for (paramInt = 0; paramInt < k; paramInt++)
        localSparseArray.append(paramParcel.readInt(), paramParcel.createByteArray());
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89778);
      paramParcel = localSparseArray;
    }
  }

  public static char[] createCharArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89758);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89758);
    }
    while (true)
    {
      return paramParcel;
      char[] arrayOfChar = paramParcel.createCharArray();
      paramParcel.setDataPosition(paramInt + i);
      AppMethodBeat.o(89758);
      paramParcel = arrayOfChar;
    }
  }

  public static double[] createDoubleArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89763);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89763);
    }
    while (true)
    {
      return paramParcel;
      double[] arrayOfDouble = paramParcel.createDoubleArray();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89763);
      paramParcel = arrayOfDouble;
    }
  }

  public static ArrayList<Double> createDoubleList(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89781);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89781);
    }
    while (true)
    {
      return paramParcel;
      ArrayList localArrayList = new ArrayList();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localArrayList.add(Double.valueOf(paramParcel.readDouble()));
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89781);
      paramParcel = localArrayList;
    }
  }

  public static SparseArray<Double> createDoubleSparseArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89772);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89772);
    }
    while (true)
    {
      return paramParcel;
      SparseArray localSparseArray = new SparseArray();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localSparseArray.append(paramParcel.readInt(), Double.valueOf(paramParcel.readDouble()));
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89772);
      paramParcel = localSparseArray;
    }
  }

  public static float[] createFloatArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89762);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89762);
    }
    while (true)
    {
      return paramParcel;
      float[] arrayOfFloat = paramParcel.createFloatArray();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89762);
      paramParcel = arrayOfFloat;
    }
  }

  public static ArrayList<Float> createFloatList(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89780);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89780);
    }
    while (true)
    {
      return paramParcel;
      ArrayList localArrayList = new ArrayList();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localArrayList.add(Float.valueOf(paramParcel.readFloat()));
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89780);
      paramParcel = localArrayList;
    }
  }

  public static SparseArray<Float> createFloatSparseArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89771);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89771);
    }
    while (true)
    {
      return paramParcel;
      SparseArray localSparseArray = new SparseArray();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localSparseArray.append(paramParcel.readInt(), Float.valueOf(paramParcel.readFloat()));
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89771);
      paramParcel = localSparseArray;
    }
  }

  public static IBinder[] createIBinderArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89766);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89766);
    }
    while (true)
    {
      return paramParcel;
      IBinder[] arrayOfIBinder = paramParcel.createBinderArray();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89766);
      paramParcel = arrayOfIBinder;
    }
  }

  public static ArrayList<IBinder> createIBinderList(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89783);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89783);
    }
    while (true)
    {
      return paramParcel;
      ArrayList localArrayList = paramParcel.createBinderArrayList();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89783);
      paramParcel = localArrayList;
    }
  }

  public static SparseArray<IBinder> createIBinderSparseArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89777);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89777);
    }
    while (true)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      SparseArray localSparseArray = new SparseArray(k);
      for (paramInt = 0; paramInt < k; paramInt++)
        localSparseArray.append(paramParcel.readInt(), paramParcel.readStrongBinder());
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89777);
      paramParcel = localSparseArray;
    }
  }

  public static int[] createIntArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89759);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89759);
    }
    while (true)
    {
      return paramParcel;
      int[] arrayOfInt = paramParcel.createIntArray();
      paramParcel.setDataPosition(paramInt + i);
      AppMethodBeat.o(89759);
      paramParcel = arrayOfInt;
    }
  }

  public static ArrayList<Integer> createIntegerList(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89768);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89768);
    }
    while (true)
    {
      return paramParcel;
      ArrayList localArrayList = new ArrayList();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localArrayList.add(Integer.valueOf(paramParcel.readInt()));
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89768);
      paramParcel = localArrayList;
    }
  }

  public static long[] createLongArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89760);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89760);
    }
    while (true)
    {
      return paramParcel;
      long[] arrayOfLong = paramParcel.createLongArray();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89760);
      paramParcel = arrayOfLong;
    }
  }

  public static ArrayList<Long> createLongList(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89779);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89779);
    }
    while (true)
    {
      return paramParcel;
      ArrayList localArrayList = new ArrayList();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localArrayList.add(Long.valueOf(paramParcel.readLong()));
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89779);
      paramParcel = localArrayList;
    }
  }

  public static Parcel createParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89786);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89786);
    }
    while (true)
    {
      return paramParcel;
      Parcel localParcel = Parcel.obtain();
      localParcel.appendFrom(paramParcel, paramInt, i);
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89786);
      paramParcel = localParcel;
    }
  }

  public static Parcel[] createParcelArray(Parcel paramParcel, int paramInt)
  {
    Parcel[] arrayOfParcel = null;
    AppMethodBeat.i(89787);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      AppMethodBeat.o(89787);
    for (paramParcel = arrayOfParcel; ; paramParcel = arrayOfParcel)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      arrayOfParcel = new Parcel[k];
      paramInt = 0;
      if (paramInt < k)
      {
        int m = paramParcel.readInt();
        if (m != 0)
        {
          int n = paramParcel.dataPosition();
          Parcel localParcel = Parcel.obtain();
          localParcel.appendFrom(paramParcel, n, m);
          arrayOfParcel[paramInt] = localParcel;
          paramParcel.setDataPosition(m + n);
        }
        while (true)
        {
          paramInt++;
          break;
          arrayOfParcel[paramInt] = null;
        }
      }
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89787);
    }
  }

  public static ArrayList<Parcel> createParcelList(Parcel paramParcel, int paramInt)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(89788);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      AppMethodBeat.o(89788);
    for (paramParcel = localArrayList; ; paramParcel = localArrayList)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      localArrayList = new ArrayList();
      paramInt = 0;
      if (paramInt < k)
      {
        int m = paramParcel.readInt();
        if (m != 0)
        {
          int n = paramParcel.dataPosition();
          Parcel localParcel = Parcel.obtain();
          localParcel.appendFrom(paramParcel, n, m);
          localArrayList.add(localParcel);
          paramParcel.setDataPosition(m + n);
        }
        while (true)
        {
          paramInt++;
          break;
          localArrayList.add(null);
        }
      }
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89788);
    }
  }

  public static SparseArray<Parcel> createParcelSparseArray(Parcel paramParcel, int paramInt)
  {
    SparseArray localSparseArray = null;
    AppMethodBeat.i(89775);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      AppMethodBeat.o(89775);
    for (paramParcel = localSparseArray; ; paramParcel = localSparseArray)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      localSparseArray = new SparseArray();
      paramInt = 0;
      if (paramInt < k)
      {
        int m = paramParcel.readInt();
        int n = paramParcel.readInt();
        if (n != 0)
        {
          int i1 = paramParcel.dataPosition();
          Parcel localParcel = Parcel.obtain();
          localParcel.appendFrom(paramParcel, i1, n);
          localSparseArray.append(m, localParcel);
          paramParcel.setDataPosition(i1 + n);
        }
        while (true)
        {
          paramInt++;
          break;
          localSparseArray.append(m, null);
        }
      }
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89775);
    }
  }

  public static <T extends Parcelable> T createParcelable(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    AppMethodBeat.i(89753);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89753);
    }
    while (true)
    {
      return paramParcel;
      paramCreator = (Parcelable)paramCreator.createFromParcel(paramParcel);
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89753);
      paramParcel = paramCreator;
    }
  }

  public static SparseBooleanArray createSparseBooleanArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89769);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89769);
    }
    while (true)
    {
      return paramParcel;
      SparseBooleanArray localSparseBooleanArray = paramParcel.readSparseBooleanArray();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89769);
      paramParcel = localSparseBooleanArray;
    }
  }

  public static SparseIntArray createSparseIntArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89770);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89770);
    }
    while (true)
    {
      return paramParcel;
      SparseIntArray localSparseIntArray = new SparseIntArray();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localSparseIntArray.append(paramParcel.readInt(), paramParcel.readInt());
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89770);
      paramParcel = localSparseIntArray;
    }
  }

  public static SparseLongArray createSparseLongArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89773);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89773);
    }
    while (true)
    {
      return paramParcel;
      SparseLongArray localSparseLongArray = new SparseLongArray();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localSparseLongArray.append(paramParcel.readInt(), paramParcel.readLong());
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89773);
      paramParcel = localSparseLongArray;
    }
  }

  public static String createString(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89751);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89751);
    }
    while (true)
    {
      return paramParcel;
      String str = paramParcel.readString();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89751);
      paramParcel = str;
    }
  }

  public static String[] createStringArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89765);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89765);
    }
    while (true)
    {
      return paramParcel;
      String[] arrayOfString = paramParcel.createStringArray();
      paramParcel.setDataPosition(paramInt + i);
      AppMethodBeat.o(89765);
      paramParcel = arrayOfString;
    }
  }

  public static ArrayList<String> createStringList(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89782);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89782);
    }
    while (true)
    {
      return paramParcel;
      ArrayList localArrayList = paramParcel.createStringArrayList();
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89782);
      paramParcel = localArrayList;
    }
  }

  public static SparseArray<String> createStringSparseArray(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89774);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89774);
    }
    while (true)
    {
      return paramParcel;
      SparseArray localSparseArray = new SparseArray();
      int k = paramParcel.readInt();
      for (paramInt = 0; paramInt < k; paramInt++)
        localSparseArray.append(paramParcel.readInt(), paramParcel.readString());
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89774);
      paramParcel = localSparseArray;
    }
  }

  public static <T> T[] createTypedArray(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    AppMethodBeat.i(89784);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89784);
    }
    while (true)
    {
      return paramParcel;
      paramCreator = paramParcel.createTypedArray(paramCreator);
      paramParcel.setDataPosition(paramInt + i);
      AppMethodBeat.o(89784);
      paramParcel = paramCreator;
    }
  }

  public static <T> ArrayList<T> createTypedList(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    AppMethodBeat.i(89785);
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89785);
    }
    while (true)
    {
      return paramParcel;
      paramCreator = paramParcel.createTypedArrayList(paramCreator);
      paramParcel.setDataPosition(i + paramInt);
      AppMethodBeat.o(89785);
      paramParcel = paramCreator;
    }
  }

  public static <T> SparseArray<T> createTypedSparseArray(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    Object localObject = null;
    AppMethodBeat.i(89776);
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      AppMethodBeat.o(89776);
    SparseArray localSparseArray;
    for (paramParcel = localObject; ; paramParcel = localSparseArray)
    {
      return paramParcel;
      int k = paramParcel.readInt();
      localSparseArray = new SparseArray();
      paramInt = 0;
      if (paramInt < k)
      {
        int m = paramParcel.readInt();
        if (paramParcel.readInt() != 0);
        for (localObject = paramCreator.createFromParcel(paramParcel); ; localObject = null)
        {
          localSparseArray.append(m, localObject);
          paramInt++;
          break;
        }
      }
      paramParcel.setDataPosition(j + i);
      AppMethodBeat.o(89776);
    }
  }

  public static void ensureAtEnd(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89790);
    if (paramParcel.dataPosition() != paramInt)
    {
      paramParcel = new ParseException(37 + "Overread allowed size end=" + paramInt, paramParcel);
      AppMethodBeat.o(89790);
      throw paramParcel;
    }
    AppMethodBeat.o(89790);
  }

  public static int getFieldId(int paramInt)
  {
    return 0xFFFF & paramInt;
  }

  public static boolean readBoolean(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89736);
    zza(paramParcel, paramInt, 4);
    boolean bool;
    if (paramParcel.readInt() != 0)
    {
      bool = true;
      AppMethodBeat.o(89736);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(89736);
    }
  }

  public static Boolean readBooleanObject(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89737);
    int i = readSize(paramParcel, paramInt);
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89737);
      return paramParcel;
    }
    zza(paramParcel, paramInt, i, 4);
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      paramParcel = Boolean.valueOf(bool);
      AppMethodBeat.o(89737);
      break;
    }
  }

  public static byte readByte(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89738);
    zza(paramParcel, paramInt, 4);
    byte b = (byte)paramParcel.readInt();
    AppMethodBeat.o(89738);
    return b;
  }

  public static char readChar(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89739);
    zza(paramParcel, paramInt, 4);
    char c = (char)paramParcel.readInt();
    AppMethodBeat.o(89739);
    return c;
  }

  public static double readDouble(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89748);
    zza(paramParcel, paramInt, 8);
    double d = paramParcel.readDouble();
    AppMethodBeat.o(89748);
    return d;
  }

  public static Double readDoubleObject(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89749);
    int i = readSize(paramParcel, paramInt);
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89749);
    }
    while (true)
    {
      return paramParcel;
      zza(paramParcel, paramInt, i, 8);
      paramParcel = Double.valueOf(paramParcel.readDouble());
      AppMethodBeat.o(89749);
    }
  }

  public static float readFloat(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89746);
    zza(paramParcel, paramInt, 4);
    float f = paramParcel.readFloat();
    AppMethodBeat.o(89746);
    return f;
  }

  public static Float readFloatObject(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89747);
    int i = readSize(paramParcel, paramInt);
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89747);
    }
    while (true)
    {
      return paramParcel;
      zza(paramParcel, paramInt, i, 4);
      paramParcel = Float.valueOf(paramParcel.readFloat());
      AppMethodBeat.o(89747);
    }
  }

  public static int readHeader(Parcel paramParcel)
  {
    AppMethodBeat.i(89730);
    int i = paramParcel.readInt();
    AppMethodBeat.o(89730);
    return i;
  }

  public static IBinder readIBinder(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89752);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89752);
    }
    while (true)
    {
      return paramParcel;
      IBinder localIBinder = paramParcel.readStrongBinder();
      paramParcel.setDataPosition(paramInt + i);
      AppMethodBeat.o(89752);
      paramParcel = localIBinder;
    }
  }

  public static int readInt(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89741);
    zza(paramParcel, paramInt, 4);
    paramInt = paramParcel.readInt();
    AppMethodBeat.o(89741);
    return paramInt;
  }

  public static Integer readIntegerObject(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89742);
    int i = readSize(paramParcel, paramInt);
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89742);
    }
    while (true)
    {
      return paramParcel;
      zza(paramParcel, paramInt, i, 4);
      paramParcel = Integer.valueOf(paramParcel.readInt());
      AppMethodBeat.o(89742);
    }
  }

  public static void readList(Parcel paramParcel, int paramInt, List paramList, ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(89789);
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      AppMethodBeat.o(89789);
    while (true)
    {
      return;
      paramParcel.readList(paramList, paramClassLoader);
      paramParcel.setDataPosition(paramInt + i);
      AppMethodBeat.o(89789);
    }
  }

  public static long readLong(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89743);
    zza(paramParcel, paramInt, 8);
    long l = paramParcel.readLong();
    AppMethodBeat.o(89743);
    return l;
  }

  public static Long readLongObject(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89744);
    int i = readSize(paramParcel, paramInt);
    if (i == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(89744);
    }
    while (true)
    {
      return paramParcel;
      zza(paramParcel, paramInt, i, 8);
      paramParcel = Long.valueOf(paramParcel.readLong());
      AppMethodBeat.o(89744);
    }
  }

  public static short readShort(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89740);
    zza(paramParcel, paramInt, 4);
    short s = (short)paramParcel.readInt();
    AppMethodBeat.o(89740);
    return s;
  }

  public static int readSize(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89731);
    if ((paramInt & 0xFFFF0000) != -65536)
    {
      paramInt = paramInt >> 16 & 0xFFFF;
      AppMethodBeat.o(89731);
    }
    while (true)
    {
      return paramInt;
      paramInt = paramParcel.readInt();
      AppMethodBeat.o(89731);
    }
  }

  public static void skipUnknownField(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89732);
    paramParcel.setDataPosition(readSize(paramParcel, paramInt) + paramParcel.dataPosition());
    AppMethodBeat.o(89732);
  }

  public static int validateObjectHeader(Parcel paramParcel)
  {
    AppMethodBeat.i(89735);
    int i = readHeader(paramParcel);
    int j = readSize(paramParcel, i);
    int k = paramParcel.dataPosition();
    if (getFieldId(i) != 20293)
    {
      String str = String.valueOf(Integer.toHexString(i));
      if (str.length() != 0);
      for (str = "Expected object header. Got 0x".concat(str); ; str = new String("Expected object header. Got 0x"))
      {
        paramParcel = new ParseException(str, paramParcel);
        AppMethodBeat.o(89735);
        throw paramParcel;
      }
    }
    j = k + j;
    if ((j < k) || (j > paramParcel.dataSize()))
    {
      paramParcel = new ParseException(54 + "Size read is invalid start=" + k + " end=" + j, paramParcel);
      AppMethodBeat.o(89735);
      throw paramParcel;
    }
    AppMethodBeat.o(89735);
    return j;
  }

  private static void zza(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(89733);
    paramInt1 = readSize(paramParcel, paramInt1);
    if (paramInt1 != paramInt2)
    {
      String str = Integer.toHexString(paramInt1);
      paramParcel = new ParseException(String.valueOf(str).length() + 46 + "Expected size " + paramInt2 + " got " + paramInt1 + " (0x" + str + ")", paramParcel);
      AppMethodBeat.o(89733);
      throw paramParcel;
    }
    AppMethodBeat.o(89733);
  }

  private static void zza(Parcel paramParcel, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(89734);
    if (paramInt2 != paramInt3)
    {
      String str = Integer.toHexString(paramInt2);
      paramParcel = new ParseException(String.valueOf(str).length() + 46 + "Expected size " + paramInt3 + " got " + paramInt2 + " (0x" + str + ")", paramParcel);
      AppMethodBeat.o(89734);
      throw paramParcel;
    }
    AppMethodBeat.o(89734);
  }

  public static class ParseException extends RuntimeException
  {
    public ParseException(String paramString, Parcel paramParcel)
    {
      super();
      AppMethodBeat.i(89729);
      AppMethodBeat.o(89729);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.SafeParcelReader
 * JD-Core Version:    0.6.2
 */