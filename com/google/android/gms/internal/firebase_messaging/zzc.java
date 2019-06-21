package com.google.android.gms.internal.firebase_messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzc
{
  private static final ClassLoader zzd;

  static
  {
    AppMethodBeat.i(108676);
    zzd = zzc.class.getClassLoader();
    AppMethodBeat.o(108676);
  }

  public static void zza(Parcel paramParcel, Parcelable paramParcelable)
  {
    AppMethodBeat.i(108675);
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      AppMethodBeat.o(108675);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(1);
      paramParcelable.writeToParcel(paramParcel, 0);
      AppMethodBeat.o(108675);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.firebase_messaging.zzc
 * JD-Core Version:    0.6.2
 */