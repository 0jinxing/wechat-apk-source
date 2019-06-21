package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class SafeParcelWriter
{
  public static int beginObjectHeader(Parcel paramParcel)
  {
    AppMethodBeat.i(89794);
    int i = zza(paramParcel, 20293);
    AppMethodBeat.o(89794);
    return i;
  }

  public static void finishObjectHeader(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89795);
    zzb(paramParcel, paramInt);
    AppMethodBeat.o(89795);
  }

  public static void writeBigDecimal(Parcel paramParcel, int paramInt, BigDecimal paramBigDecimal, boolean paramBoolean)
  {
    AppMethodBeat.i(89810);
    if (paramBigDecimal == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89810);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeByteArray(paramBigDecimal.unscaledValue().toByteArray());
      paramParcel.writeInt(paramBigDecimal.scale());
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89810);
    }
  }

  public static void writeBigDecimalArray(Parcel paramParcel, int paramInt, BigDecimal[] paramArrayOfBigDecimal, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(89824);
    if (paramArrayOfBigDecimal == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89824);
    }
    while (true)
    {
      return;
      int j = zza(paramParcel, paramInt);
      int k = paramArrayOfBigDecimal.length;
      paramParcel.writeInt(k);
      for (paramInt = i; paramInt < k; paramInt++)
      {
        paramParcel.writeByteArray(paramArrayOfBigDecimal[paramInt].unscaledValue().toByteArray());
        paramParcel.writeInt(paramArrayOfBigDecimal[paramInt].scale());
      }
      zzb(paramParcel, j);
      AppMethodBeat.o(89824);
    }
  }

  public static void writeBigInteger(Parcel paramParcel, int paramInt, BigInteger paramBigInteger, boolean paramBoolean)
  {
    AppMethodBeat.i(89805);
    if (paramBigInteger == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89805);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeByteArray(paramBigInteger.toByteArray());
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89805);
    }
  }

  public static void writeBigIntegerArray(Parcel paramParcel, int paramInt, BigInteger[] paramArrayOfBigInteger, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(89821);
    if (paramArrayOfBigInteger == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89821);
    }
    while (true)
    {
      return;
      int j = zza(paramParcel, paramInt);
      int k = paramArrayOfBigInteger.length;
      paramParcel.writeInt(k);
      for (paramInt = i; paramInt < k; paramInt++)
        paramParcel.writeByteArray(paramArrayOfBigInteger[paramInt].toByteArray());
      zzb(paramParcel, j);
      AppMethodBeat.o(89821);
    }
  }

  public static void writeBoolean(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(89796);
    zzb(paramParcel, paramInt, 4);
    if (paramBoolean);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(89796);
      return;
    }
  }

  public static void writeBooleanArray(Parcel paramParcel, int paramInt, boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    AppMethodBeat.i(89817);
    if (paramArrayOfBoolean == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89817);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeBooleanArray(paramArrayOfBoolean);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89817);
    }
  }

  public static void writeBooleanList(Parcel paramParcel, int paramInt, List<Boolean> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89827);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89827);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      paramInt = 0;
      if (paramInt < j)
      {
        if (((Boolean)paramList.get(paramInt)).booleanValue());
        for (int k = 1; ; k = 0)
        {
          paramParcel.writeInt(k);
          paramInt++;
          break;
        }
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89827);
    }
  }

  public static void writeBooleanObject(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1)
  {
    int i = 0;
    AppMethodBeat.i(89797);
    if (paramBoolean == null)
    {
      if (paramBoolean1)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89797);
    }
    while (true)
    {
      return;
      zzb(paramParcel, paramInt, 4);
      paramInt = i;
      if (paramBoolean.booleanValue())
        paramInt = 1;
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(89797);
    }
  }

  public static void writeBundle(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(89814);
    if (paramBundle == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89814);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeBundle(paramBundle);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89814);
    }
  }

  public static void writeByte(Parcel paramParcel, int paramInt, byte paramByte)
  {
    AppMethodBeat.i(89798);
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramByte);
    AppMethodBeat.o(89798);
  }

  public static void writeByteArray(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(89815);
    if (paramArrayOfByte == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89815);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeByteArray(paramArrayOfByte);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89815);
    }
  }

  public static void writeByteArrayArray(Parcel paramParcel, int paramInt, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(89816);
    if (paramArrayOfByte == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89816);
    }
    while (true)
    {
      return;
      int j = zza(paramParcel, paramInt);
      int k = paramArrayOfByte.length;
      paramParcel.writeInt(k);
      for (paramInt = i; paramInt < k; paramInt++)
        paramParcel.writeByteArray(paramArrayOfByte[paramInt]);
      zzb(paramParcel, j);
      AppMethodBeat.o(89816);
    }
  }

  public static void writeByteArraySparseArray(Parcel paramParcel, int paramInt, SparseArray<byte[]> paramSparseArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89850);
    if (paramSparseArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89850);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramSparseArray.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
        paramParcel.writeByteArray((byte[])paramSparseArray.valueAt(paramInt));
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89850);
    }
  }

  public static void writeChar(Parcel paramParcel, int paramInt, char paramChar)
  {
    AppMethodBeat.i(89799);
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramChar);
    AppMethodBeat.o(89799);
  }

  public static void writeCharArray(Parcel paramParcel, int paramInt, char[] paramArrayOfChar, boolean paramBoolean)
  {
    AppMethodBeat.i(89818);
    if (paramArrayOfChar == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89818);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeCharArray(paramArrayOfChar);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89818);
    }
  }

  public static void writeDouble(Parcel paramParcel, int paramInt, double paramDouble)
  {
    AppMethodBeat.i(89808);
    zzb(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble);
    AppMethodBeat.o(89808);
  }

  public static void writeDoubleArray(Parcel paramParcel, int paramInt, double[] paramArrayOfDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(89823);
    if (paramArrayOfDouble == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89823);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeDoubleArray(paramArrayOfDouble);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89823);
    }
  }

  public static void writeDoubleList(Parcel paramParcel, int paramInt, List<Double> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89831);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89831);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
        paramParcel.writeDouble(((Double)paramList.get(paramInt)).doubleValue());
      zzb(paramParcel, i);
      AppMethodBeat.o(89831);
    }
  }

  public static void writeDoubleObject(Parcel paramParcel, int paramInt, Double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(89809);
    if (paramDouble == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89809);
    }
    while (true)
    {
      return;
      zzb(paramParcel, paramInt, 8);
      paramParcel.writeDouble(paramDouble.doubleValue());
      AppMethodBeat.o(89809);
    }
  }

  public static void writeDoubleSparseArray(Parcel paramParcel, int paramInt, SparseArray<Double> paramSparseArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89842);
    if (paramSparseArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89842);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramSparseArray.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
        paramParcel.writeDouble(((Double)paramSparseArray.valueAt(paramInt)).doubleValue());
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89842);
    }
  }

  public static void writeFloat(Parcel paramParcel, int paramInt, float paramFloat)
  {
    AppMethodBeat.i(89806);
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
    AppMethodBeat.o(89806);
  }

  public static void writeFloatArray(Parcel paramParcel, int paramInt, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(89822);
    if (paramArrayOfFloat == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89822);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeFloatArray(paramArrayOfFloat);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89822);
    }
  }

  public static void writeFloatList(Parcel paramParcel, int paramInt, List<Float> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89830);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89830);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
        paramParcel.writeFloat(((Float)paramList.get(paramInt)).floatValue());
      zzb(paramParcel, i);
      AppMethodBeat.o(89830);
    }
  }

  public static void writeFloatObject(Parcel paramParcel, int paramInt, Float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(89807);
    if (paramFloat == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89807);
    }
    while (true)
    {
      return;
      zzb(paramParcel, paramInt, 4);
      paramParcel.writeFloat(paramFloat.floatValue());
      AppMethodBeat.o(89807);
    }
  }

  public static void writeFloatSparseArray(Parcel paramParcel, int paramInt, SparseArray<Float> paramSparseArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89843);
    if (paramSparseArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89843);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramSparseArray.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
        paramParcel.writeFloat(((Float)paramSparseArray.valueAt(paramInt)).floatValue());
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89843);
    }
  }

  public static void writeIBinder(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    AppMethodBeat.i(89812);
    if (paramIBinder == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89812);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeStrongBinder(paramIBinder);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89812);
    }
  }

  public static void writeIBinderArray(Parcel paramParcel, int paramInt, IBinder[] paramArrayOfIBinder, boolean paramBoolean)
  {
    AppMethodBeat.i(89826);
    if (paramArrayOfIBinder == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89826);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeBinderArray(paramArrayOfIBinder);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89826);
    }
  }

  public static void writeIBinderList(Parcel paramParcel, int paramInt, List<IBinder> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89833);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89833);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeBinderList(paramList);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89833);
    }
  }

  public static void writeIBinderSparseArray(Parcel paramParcel, int paramInt, SparseArray<IBinder> paramSparseArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89849);
    if (paramSparseArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89849);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramSparseArray.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
        paramParcel.writeStrongBinder((IBinder)paramSparseArray.valueAt(paramInt));
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89849);
    }
  }

  public static void writeInt(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(89801);
    zzb(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
    AppMethodBeat.o(89801);
  }

  public static void writeIntArray(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(89819);
    if (paramArrayOfInt == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89819);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeIntArray(paramArrayOfInt);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89819);
    }
  }

  public static void writeIntegerList(Parcel paramParcel, int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89828);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89828);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
        paramParcel.writeInt(((Integer)paramList.get(paramInt)).intValue());
      zzb(paramParcel, i);
      AppMethodBeat.o(89828);
    }
  }

  public static void writeIntegerObject(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean)
  {
    AppMethodBeat.i(89802);
    if (paramInteger == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89802);
    }
    while (true)
    {
      return;
      zzb(paramParcel, paramInt, 4);
      paramParcel.writeInt(paramInteger.intValue());
      AppMethodBeat.o(89802);
    }
  }

  public static void writeList(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89840);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89840);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeList(paramList);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89840);
    }
  }

  public static void writeLong(Parcel paramParcel, int paramInt, long paramLong)
  {
    AppMethodBeat.i(89803);
    zzb(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
    AppMethodBeat.o(89803);
  }

  public static void writeLongArray(Parcel paramParcel, int paramInt, long[] paramArrayOfLong, boolean paramBoolean)
  {
    AppMethodBeat.i(89820);
    if (paramArrayOfLong == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89820);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeLongArray(paramArrayOfLong);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89820);
    }
  }

  public static void writeLongList(Parcel paramParcel, int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89829);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89829);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
        paramParcel.writeLong(((Long)paramList.get(paramInt)).longValue());
      zzb(paramParcel, i);
      AppMethodBeat.o(89829);
    }
  }

  public static void writeLongObject(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(89804);
    if (paramLong == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89804);
    }
    while (true)
    {
      return;
      zzb(paramParcel, paramInt, 8);
      paramParcel.writeLong(paramLong.longValue());
      AppMethodBeat.o(89804);
    }
  }

  public static void writeParcel(Parcel paramParcel1, int paramInt, Parcel paramParcel2, boolean paramBoolean)
  {
    AppMethodBeat.i(89837);
    if (paramParcel2 == null)
    {
      if (paramBoolean)
        zzb(paramParcel1, paramInt, 0);
      AppMethodBeat.o(89837);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel1, paramInt);
      paramParcel1.appendFrom(paramParcel2, 0, paramParcel2.dataSize());
      zzb(paramParcel1, paramInt);
      AppMethodBeat.o(89837);
    }
  }

  public static void writeParcelArray(Parcel paramParcel, int paramInt, Parcel[] paramArrayOfParcel, boolean paramBoolean)
  {
    AppMethodBeat.i(89838);
    if (paramArrayOfParcel == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89838);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramArrayOfParcel.length;
      paramParcel.writeInt(j);
      paramInt = 0;
      if (paramInt < j)
      {
        Parcel localParcel = paramArrayOfParcel[paramInt];
        if (localParcel != null)
        {
          paramParcel.writeInt(localParcel.dataSize());
          paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
        }
        while (true)
        {
          paramInt++;
          break;
          paramParcel.writeInt(0);
        }
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89838);
    }
  }

  public static void writeParcelList(Parcel paramParcel, int paramInt, List<Parcel> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89839);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89839);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      paramInt = 0;
      if (paramInt < j)
      {
        Parcel localParcel = (Parcel)paramList.get(paramInt);
        if (localParcel != null)
        {
          paramParcel.writeInt(localParcel.dataSize());
          paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
        }
        while (true)
        {
          paramInt++;
          break;
          paramParcel.writeInt(0);
        }
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89839);
    }
  }

  public static void writeParcelSparseArray(Parcel paramParcel, int paramInt, SparseArray<Parcel> paramSparseArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89847);
    if (paramSparseArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89847);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramSparseArray.size();
      paramParcel.writeInt(j);
      paramInt = 0;
      if (paramInt < j)
      {
        paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
        Parcel localParcel = (Parcel)paramSparseArray.valueAt(paramInt);
        if (localParcel != null)
        {
          paramParcel.writeInt(localParcel.dataSize());
          paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
        }
        while (true)
        {
          paramInt++;
          break;
          paramParcel.writeInt(0);
        }
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89847);
    }
  }

  public static void writeParcelable(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(89813);
    if (paramParcelable == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt1, 0);
      AppMethodBeat.o(89813);
    }
    while (true)
    {
      return;
      paramInt1 = zza(paramParcel, paramInt1);
      paramParcelable.writeToParcel(paramParcel, paramInt2);
      zzb(paramParcel, paramInt1);
      AppMethodBeat.o(89813);
    }
  }

  public static void writeShort(Parcel paramParcel, int paramInt, short paramShort)
  {
    AppMethodBeat.i(89800);
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramShort);
    AppMethodBeat.o(89800);
  }

  public static void writeSparseBooleanArray(Parcel paramParcel, int paramInt, SparseBooleanArray paramSparseBooleanArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89841);
    if (paramSparseBooleanArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89841);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeSparseBooleanArray(paramSparseBooleanArray);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89841);
    }
  }

  public static void writeSparseIntArray(Parcel paramParcel, int paramInt, SparseIntArray paramSparseIntArray, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(89844);
    if (paramSparseIntArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89844);
    }
    while (true)
    {
      return;
      int j = zza(paramParcel, paramInt);
      int k = paramSparseIntArray.size();
      paramParcel.writeInt(k);
      for (paramInt = i; paramInt < k; paramInt++)
      {
        paramParcel.writeInt(paramSparseIntArray.keyAt(paramInt));
        paramParcel.writeInt(paramSparseIntArray.valueAt(paramInt));
      }
      zzb(paramParcel, j);
      AppMethodBeat.o(89844);
    }
  }

  public static void writeSparseLongArray(Parcel paramParcel, int paramInt, SparseLongArray paramSparseLongArray, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(89845);
    if (paramSparseLongArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89845);
    }
    while (true)
    {
      return;
      int j = zza(paramParcel, paramInt);
      int k = paramSparseLongArray.size();
      paramParcel.writeInt(k);
      for (paramInt = i; paramInt < k; paramInt++)
      {
        paramParcel.writeInt(paramSparseLongArray.keyAt(paramInt));
        paramParcel.writeLong(paramSparseLongArray.valueAt(paramInt));
      }
      zzb(paramParcel, j);
      AppMethodBeat.o(89845);
    }
  }

  public static void writeString(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(89811);
    if (paramString == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89811);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeString(paramString);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89811);
    }
  }

  public static void writeStringArray(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    AppMethodBeat.i(89825);
    if (paramArrayOfString == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89825);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeStringArray(paramArrayOfString);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89825);
    }
  }

  public static void writeStringList(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89832);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89832);
    }
    while (true)
    {
      return;
      paramInt = zza(paramParcel, paramInt);
      paramParcel.writeStringList(paramList);
      zzb(paramParcel, paramInt);
      AppMethodBeat.o(89832);
    }
  }

  public static void writeStringSparseArray(Parcel paramParcel, int paramInt, SparseArray<String> paramSparseArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89846);
    if (paramSparseArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89846);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramSparseArray.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
        paramParcel.writeString((String)paramSparseArray.valueAt(paramInt));
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89846);
    }
  }

  public static <T extends Parcelable> void writeTypedArray(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(89834);
    if (paramArrayOfT == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt1, 0);
      AppMethodBeat.o(89834);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt1);
      int j = paramArrayOfT.length;
      paramParcel.writeInt(j);
      paramInt1 = 0;
      if (paramInt1 < j)
      {
        T ? = paramArrayOfT[paramInt1];
        if (? == null)
          paramParcel.writeInt(0);
        while (true)
        {
          paramInt1++;
          break;
          zza(paramParcel, ?, paramInt2);
        }
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89834);
    }
  }

  public static <T extends Parcelable> void writeTypedList(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(89835);
    if (paramList == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89835);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      paramInt = 0;
      if (paramInt < j)
      {
        Parcelable localParcelable = (Parcelable)paramList.get(paramInt);
        if (localParcelable == null)
          paramParcel.writeInt(0);
        while (true)
        {
          paramInt++;
          break;
          zza(paramParcel, localParcelable, 0);
        }
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89835);
    }
  }

  public static <T extends Parcelable> void writeTypedSparseArray(Parcel paramParcel, int paramInt, SparseArray<T> paramSparseArray, boolean paramBoolean)
  {
    AppMethodBeat.i(89848);
    if (paramSparseArray == null)
    {
      if (paramBoolean)
        zzb(paramParcel, paramInt, 0);
      AppMethodBeat.o(89848);
    }
    while (true)
    {
      return;
      int i = zza(paramParcel, paramInt);
      int j = paramSparseArray.size();
      paramParcel.writeInt(j);
      paramInt = 0;
      if (paramInt < j)
      {
        paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
        Parcelable localParcelable = (Parcelable)paramSparseArray.valueAt(paramInt);
        if (localParcelable == null)
          paramParcel.writeInt(0);
        while (true)
        {
          paramInt++;
          break;
          zza(paramParcel, localParcelable, 0);
        }
      }
      zzb(paramParcel, i);
      AppMethodBeat.o(89848);
    }
  }

  private static int zza(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89792);
    paramParcel.writeInt(0xFFFF0000 | paramInt);
    paramParcel.writeInt(0);
    paramInt = paramParcel.dataPosition();
    AppMethodBeat.o(89792);
    return paramInt;
  }

  private static <T extends Parcelable> void zza(Parcel paramParcel, T paramT, int paramInt)
  {
    AppMethodBeat.i(89836);
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
    AppMethodBeat.o(89836);
  }

  private static void zzb(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89793);
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
    AppMethodBeat.o(89793);
  }

  private static void zzb(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(89791);
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(0xFFFF0000 | paramInt1);
      paramParcel.writeInt(paramInt2);
      AppMethodBeat.o(89791);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(paramInt2 << 16 | paramInt1);
      AppMethodBeat.o(89791);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.SafeParcelWriter
 * JD-Core Version:    0.6.2
 */