package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ao
{
  final Messenger bwC;
  final zzi bwZ;

  ao(IBinder paramIBinder)
  {
    AppMethodBeat.i(108834);
    String str = paramIBinder.getInterfaceDescriptor();
    if ("android.os.IMessenger".equals(str))
    {
      this.bwC = new Messenger(paramIBinder);
      this.bwZ = null;
      AppMethodBeat.o(108834);
    }
    while (true)
    {
      return;
      if (!"com.google.android.gms.iid.IMessengerCompat".equals(str))
        break;
      this.bwZ = new zzi(paramIBinder);
      this.bwC = null;
      AppMethodBeat.o(108834);
    }
    paramIBinder = String.valueOf(str);
    if (paramIBinder.length() != 0)
      "Invalid interface descriptor: ".concat(paramIBinder);
    while (true)
    {
      paramIBinder = new RemoteException();
      AppMethodBeat.o(108834);
      throw paramIBinder;
      new String("Invalid interface descriptor: ");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.ao
 * JD-Core Version:    0.6.2
 */