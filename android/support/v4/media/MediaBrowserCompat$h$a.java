package android.support.v4.media;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;

final class MediaBrowserCompat$h$a
  implements ServiceConnection
{
  MediaBrowserCompat$h$a(MediaBrowserCompat.h paramh)
  {
  }

  private void e(Runnable paramRunnable)
  {
    if (Thread.currentThread() == this.Ic.HS.getLooper().getThread())
      paramRunnable.run();
    while (true)
    {
      return;
      this.Ic.HS.post(paramRunnable);
    }
  }

  final boolean N(String paramString)
  {
    boolean bool = true;
    if ((this.Ic.Ia != this) || (this.Ic.mState == 0) || (this.Ic.mState == 1))
    {
      if ((this.Ic.mState != 0) && (this.Ic.mState != 1))
        new StringBuilder().append(paramString).append(" for ").append(this.Ic.HY).append(" with mServiceConnection=").append(this.Ic.Ia).append(" this=").append(this);
      bool = false;
    }
    return bool;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    e(new MediaBrowserCompat.h.a.1(this, paramComponentName, paramIBinder));
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    e(new MediaBrowserCompat.h.a.2(this, paramComponentName));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.h.a
 * JD-Core Version:    0.6.2
 */