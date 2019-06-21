package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.f.a;

final class MediaBrowserServiceCompat$d$1
  implements Runnable
{
  MediaBrowserServiceCompat$d$1(MediaBrowserServiceCompat.d paramd, MediaBrowserServiceCompat.e parame, String paramString, Bundle paramBundle, int paramInt)
  {
  }

  public final void run()
  {
    IBinder localIBinder = this.IH.asBinder();
    this.IL.Iu.Io.remove(localIBinder);
    MediaBrowserServiceCompat.b localb = new MediaBrowserServiceCompat.b(this.IL.Iu);
    localb.Iw = this.II;
    localb.Ix = this.IJ;
    localb.Iy = this.IH;
    localb.Iz = this.IL.Iu.dJ();
    if (localb.Iz == null)
      new StringBuilder("No root for client ").append(this.II).append(" from service ").append(getClass().getName());
    while (true)
    {
      try
      {
        this.IH.dO();
        return;
      }
      catch (RemoteException localRemoteException1)
      {
        new StringBuilder("Calling onConnectFailed() failed. Ignoring. pkg=").append(this.II);
        continue;
      }
      try
      {
        this.IL.Iu.Io.put(localRemoteException1, localb);
        localRemoteException1.linkToDeath(localb, 0);
        if (this.IL.Iu.Ir != null)
          this.IH.a(localb.Iz.Ib, this.IL.Iu.Ir, localb.Iz.mExtras);
      }
      catch (RemoteException localRemoteException2)
      {
        new StringBuilder("Calling onConnect() failed. Dropping client. pkg=").append(this.II);
        this.IL.Iu.Io.remove(localRemoteException1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.d.1
 * JD-Core Version:    0.6.2
 */