package android.support.v4.media;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.support.v4.f.a;

final class MediaBrowserServiceCompat$d$2
  implements Runnable
{
  MediaBrowserServiceCompat$d$2(MediaBrowserServiceCompat.d paramd, MediaBrowserServiceCompat.e parame)
  {
  }

  public final void run()
  {
    Object localObject = this.IH.asBinder();
    localObject = (MediaBrowserServiceCompat.b)this.IL.Iu.Io.remove(localObject);
    if (localObject != null)
      ((MediaBrowserServiceCompat.b)localObject).Iy.asBinder().unlinkToDeath((IBinder.DeathRecipient)localObject, 0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.d.2
 * JD-Core Version:    0.6.2
 */