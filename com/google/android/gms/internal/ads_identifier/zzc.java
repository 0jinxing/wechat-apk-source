package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzc
{
  private static final ClassLoader zzd;

  static
  {
    AppMethodBeat.i(115350);
    zzd = zzc.class.getClassLoader();
    AppMethodBeat.o(115350);
  }

  public static void zza(Parcel paramParcel, boolean paramBoolean)
  {
    AppMethodBeat.i(115349);
    paramParcel.writeInt(1);
    AppMethodBeat.o(115349);
  }

  public static boolean zza(Parcel paramParcel)
  {
    AppMethodBeat.i(115348);
    boolean bool;
    if (paramParcel.readInt() != 0)
    {
      bool = true;
      AppMethodBeat.o(115348);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115348);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads_identifier.zzc
 * JD-Core Version:    0.6.2
 */