package com.google.android.gms.internal.firebase_messaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzg extends zza
  implements zze
{
  zzg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.iid.IMessengerCompat");
  }

  public final void send(Message paramMessage)
  {
    AppMethodBeat.i(108677);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramMessage);
    transactOneway(1, localParcel);
    AppMethodBeat.o(108677);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.firebase_messaging.zzg
 * JD-Core Version:    0.6.2
 */