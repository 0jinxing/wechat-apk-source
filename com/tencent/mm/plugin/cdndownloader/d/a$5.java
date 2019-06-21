package com.tencent.mm.plugin.cdndownloader.d;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class a$5 extends n.a
{
  a$5(a parama)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(897);
    a locala = this.ktp;
    ab.i("MicroMsg.CDNDownloadClient", "notifyNetworkChange: ".concat(String.valueOf(paramInt)));
    if (locala.kti != null);
    while (true)
    {
      try
      {
        locala.kti.tr(paramInt);
        AppMethodBeat.o(897);
        return;
      }
      catch (RemoteException localRemoteException)
      {
      }
      AppMethodBeat.o(897);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.d.a.5
 * JD-Core Version:    0.6.2
 */