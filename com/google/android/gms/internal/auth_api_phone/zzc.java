package com.google.android.gms.internal.auth_api_phone;

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
    AppMethodBeat.i(80430);
    zzd = com.google.android.gms.internal.auth-api-phone.zzc.class.getClassLoader();
    AppMethodBeat.o(80430);
  }

  public static <T extends Parcelable> T zza(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    AppMethodBeat.i(80428);
    if (paramParcel.readInt() == 0)
    {
      paramParcel = null;
      AppMethodBeat.o(80428);
    }
    while (true)
    {
      return paramParcel;
      paramParcel = (Parcelable)paramCreator.createFromParcel(paramParcel);
      AppMethodBeat.o(80428);
    }
  }

  public static void zza(Parcel paramParcel, IInterface paramIInterface)
  {
    AppMethodBeat.i(80429);
    if (paramIInterface == null)
    {
      paramParcel.writeStrongBinder(null);
      AppMethodBeat.o(80429);
    }
    while (true)
    {
      return;
      paramParcel.writeStrongBinder(paramIInterface.asBinder());
      AppMethodBeat.o(80429);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzc
 * JD-Core Version:    0.6.2
 */