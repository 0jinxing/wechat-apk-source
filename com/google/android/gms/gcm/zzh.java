package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gcm.zzd;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzh extends zzd
  implements zzg
{
  zzh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
  }

  public final void zzf(int paramInt)
  {
    AppMethodBeat.i(70030);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    localParcel.writeInt(paramInt);
    transactAndReadExceptionReturnVoid(2, localParcel);
    AppMethodBeat.o(70030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.zzh
 * JD-Core Version:    0.6.2
 */