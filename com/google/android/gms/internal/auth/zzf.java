package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzf
{
  private static final ClassLoader zzg;

  static
  {
    AppMethodBeat.i(77124);
    zzg = zzf.class.getClassLoader();
    AppMethodBeat.o(77124);
  }

  public static <T extends Parcelable> T zzd(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    AppMethodBeat.i(77121);
    if (paramParcel.readInt() == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(77121);
    }
    while (true)
    {
      return paramParcel;
      paramParcel = (Parcelable)paramCreator.createFromParcel(paramParcel);
      AppMethodBeat.o(77121);
    }
  }

  public static void zzd(Parcel paramParcel, IInterface paramIInterface)
  {
    AppMethodBeat.i(77123);
    if (paramIInterface == null)
    {
      paramParcel.writeStrongBinder(null);
      AppMethodBeat.o(77123);
    }
    while (true)
    {
      return;
      paramParcel.writeStrongBinder(paramIInterface.asBinder());
      AppMethodBeat.o(77123);
    }
  }

  public static void zzd(Parcel paramParcel, Parcelable paramParcelable)
  {
    AppMethodBeat.i(77122);
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      AppMethodBeat.o(77122);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(1);
      paramParcelable.writeToParcel(paramParcel, 0);
      AppMethodBeat.o(77122);
    }
  }

  public static void zzd(Parcel paramParcel, boolean paramBoolean)
  {
    AppMethodBeat.i(77120);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      AppMethodBeat.o(77120);
      return;
    }
  }

  public static boolean zzd(Parcel paramParcel)
  {
    AppMethodBeat.i(77119);
    boolean bool;
    if (paramParcel.readInt() != 0)
    {
      bool = true;
      AppMethodBeat.o(77119);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77119);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzf
 * JD-Core Version:    0.6.2
 */