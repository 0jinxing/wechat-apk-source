package android.support.v4.media;

import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class MediaBrowserCompat$l
{
  final IBinder BN = new Binder();
  private final Object Ij;
  WeakReference<MediaBrowserCompat.k> Ik;

  public MediaBrowserCompat$l()
  {
    if (Build.VERSION.SDK_INT >= 26)
      this.Ij = new b.b(new b());
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
        this.Ij = new a.d(new MediaBrowserCompat.l.a(this));
      else
        this.Ij = null;
    }
  }

  final class b extends MediaBrowserCompat.l.a
    implements b.a
  {
    b()
    {
      super();
    }

    public final void l(List<?> paramList)
    {
      MediaBrowserCompat.MediaItem.j(paramList);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.l
 * JD-Core Version:    0.6.2
 */