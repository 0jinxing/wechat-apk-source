package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.internal.gcm.zzd;
import com.google.android.gms.internal.gcm.zze;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzm extends zzd
  implements zzl
{
  zzm(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.iid.IMessengerCompat");
  }

  public final void send(Message paramMessage)
  {
    AppMethodBeat.i(57575);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzd(localParcel, paramMessage);
    transactOneway(1, localParcel);
    AppMethodBeat.o(57575);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzm
 * JD-Core Version:    0.6.2
 */