package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzy
{
  final Messenger zzab;
  final MessengerCompat zzcj;

  zzy(IBinder paramIBinder)
  {
    AppMethodBeat.i(57617);
    String str = paramIBinder.getInterfaceDescriptor();
    if ("android.os.IMessenger".equals(str))
    {
      this.zzab = new Messenger(paramIBinder);
      this.zzcj = null;
      AppMethodBeat.o(57617);
    }
    while (true)
    {
      return;
      if (!"com.google.android.gms.iid.IMessengerCompat".equals(str))
        break;
      this.zzcj = new MessengerCompat(paramIBinder);
      this.zzab = null;
      AppMethodBeat.o(57617);
    }
    paramIBinder = String.valueOf(str);
    if (paramIBinder.length() != 0)
      "Invalid interface descriptor: ".concat(paramIBinder);
    while (true)
    {
      paramIBinder = new RemoteException();
      AppMethodBeat.o(57617);
      throw paramIBinder;
      new String("Invalid interface descriptor: ");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzy
 * JD-Core Version:    0.6.2
 */