package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

final class MediaBrowserCompat$h$a$1
  implements Runnable
{
  MediaBrowserCompat$h$a$1(MediaBrowserCompat.h.a parama, ComponentName paramComponentName, IBinder paramIBinder)
  {
  }

  public final void run()
  {
    if (MediaBrowserCompat.DEBUG)
    {
      new StringBuilder("MediaServiceConnection.onServiceConnected name=").append(this.val$name).append(" binder=").append(this.Ie);
      this.If.Ic.dump();
    }
    if (!this.If.N("onServiceConnected"));
    while (true)
    {
      return;
      this.If.Ic.HV = new MediaBrowserCompat.j(this.Ie, this.If.Ic.HR);
      this.If.Ic.HW = new Messenger(this.If.Ic.HS);
      this.If.Ic.HS.a(this.If.Ic.HW);
      this.If.Ic.mState = 2;
      try
      {
        if (MediaBrowserCompat.DEBUG)
          this.If.Ic.dump();
        MediaBrowserCompat.j localj = this.If.Ic.HV;
        Context localContext = this.If.Ic.mContext;
        Messenger localMessenger = this.If.Ic.HW;
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("data_package_name", localContext.getPackageName());
        localBundle.putBundle("data_root_hints", localj.HR);
        localj.a(1, localBundle, localMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        new StringBuilder("RemoteException during connect for ").append(this.If.Ic.HY);
      }
      if (MediaBrowserCompat.DEBUG)
        this.If.Ic.dump();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.h.a.1
 * JD-Core Version:    0.6.2
 */