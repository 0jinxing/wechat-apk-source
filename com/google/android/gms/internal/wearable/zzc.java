package com.google.android.gms.internal.wearable;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzc
{
  private static final ClassLoader zzd;

  static
  {
    AppMethodBeat.i(70673);
    zzd = zzc.class.getClassLoader();
    AppMethodBeat.o(70673);
  }

  public static <T extends Parcelable> T zza(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    AppMethodBeat.i(70670);
    if (paramParcel.readInt() == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(70670);
    }
    while (true)
    {
      return paramParcel;
      paramParcel = (Parcelable)paramCreator.createFromParcel(paramParcel);
      AppMethodBeat.o(70670);
    }
  }

  public static void zza(Parcel paramParcel, IInterface paramIInterface)
  {
    AppMethodBeat.i(70672);
    if (paramIInterface == null)
    {
      paramParcel.writeStrongBinder(null);
      AppMethodBeat.o(70672);
    }
    while (true)
    {
      return;
      paramParcel.writeStrongBinder(paramIInterface.asBinder());
      AppMethodBeat.o(70672);
    }
  }

  public static void zza(Parcel paramParcel, Parcelable paramParcelable)
  {
    AppMethodBeat.i(70671);
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      AppMethodBeat.o(70671);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(1);
      paramParcelable.writeToParcel(paramParcel, 0);
      AppMethodBeat.o(70671);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzc
 * JD-Core Version:    0.6.2
 */