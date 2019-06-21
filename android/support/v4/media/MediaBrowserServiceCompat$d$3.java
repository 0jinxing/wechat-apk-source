package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.f.a;

final class MediaBrowserServiceCompat$d$3
  implements Runnable
{
  MediaBrowserServiceCompat$d$3(MediaBrowserServiceCompat.d paramd, MediaBrowserServiceCompat.e parame, String paramString, IBinder paramIBinder, Bundle paramBundle)
  {
  }

  public final void run()
  {
    Object localObject = this.IH.asBinder();
    localObject = (MediaBrowserServiceCompat.b)this.IL.Iu.Io.get(localObject);
    if (localObject == null)
      new StringBuilder("addSubscription for callback that isn't registered id=").append(this.val$id);
    while (true)
    {
      return;
      this.IL.Iu.a(this.val$id, (MediaBrowserServiceCompat.b)localObject, this.IM, this.val$options);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.d.3
 * JD-Core Version:    0.6.2
 */