package android.support.v4.media;

import android.os.IBinder;
import android.support.v4.f.a;

final class MediaBrowserServiceCompat$d$4
  implements Runnable
{
  MediaBrowserServiceCompat$d$4(MediaBrowserServiceCompat.d paramd, MediaBrowserServiceCompat.e parame, String paramString, IBinder paramIBinder)
  {
  }

  public final void run()
  {
    Object localObject = this.IH.asBinder();
    localObject = (MediaBrowserServiceCompat.b)this.IL.Iu.Io.get(localObject);
    if (localObject == null)
      new StringBuilder("removeSubscription for callback that isn't registered id=").append(this.val$id);
    while (true)
    {
      return;
      if (!MediaBrowserServiceCompat.a(this.val$id, (MediaBrowserServiceCompat.b)localObject, this.IM))
        new StringBuilder("removeSubscription called for ").append(this.val$id).append(" which is not subscribed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.d.4
 * JD-Core Version:    0.6.2
 */