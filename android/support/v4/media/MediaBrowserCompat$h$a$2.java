package android.support.v4.media;

import android.content.ComponentName;

final class MediaBrowserCompat$h$a$2
  implements Runnable
{
  MediaBrowserCompat$h$a$2(MediaBrowserCompat.h.a parama, ComponentName paramComponentName)
  {
  }

  public final void run()
  {
    if (MediaBrowserCompat.DEBUG)
    {
      new StringBuilder("MediaServiceConnection.onServiceDisconnected name=").append(this.val$name).append(" this=").append(this).append(" mServiceConnection=").append(this.If.Ic.Ia);
      this.If.Ic.dump();
    }
    if (!this.If.N("onServiceDisconnected"));
    while (true)
    {
      return;
      this.If.Ic.HV = null;
      this.If.Ic.HW = null;
      this.If.Ic.HS.a(null);
      this.If.Ic.mState = 4;
      this.If.Ic.HZ.onConnectionSuspended();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.h.a.2
 * JD-Core Version:    0.6.2
 */