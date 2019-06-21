package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.support.v4.f.j;
import java.util.HashMap;
import java.util.List;

final class MediaBrowserServiceCompat$b
  implements IBinder.DeathRecipient
{
  HashMap<String, List<j<IBinder, Bundle>>> IA = new HashMap();
  String Iw;
  Bundle Ix;
  MediaBrowserServiceCompat.e Iy;
  MediaBrowserServiceCompat.a Iz;

  MediaBrowserServiceCompat$b(MediaBrowserServiceCompat paramMediaBrowserServiceCompat)
  {
  }

  public final void binderDied()
  {
    this.Iu.Iq.post(new MediaBrowserServiceCompat.b.1(this));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.b
 * JD-Core Version:    0.6.2
 */