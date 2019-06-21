package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

final class MediaControllerCompat$a$b
  implements c.a
{
  private final WeakReference<MediaControllerCompat.a> Jq;

  MediaControllerCompat$a$b(MediaControllerCompat.a parama)
  {
    this.Jq = new WeakReference(parama);
  }

  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((MediaControllerCompat.a)this.Jq.get() != null)
      new MediaControllerCompat.f(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public final void ea()
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.Jq.get();
    if ((locala != null) && (locala.Jo))
      int i = Build.VERSION.SDK_INT;
  }

  public final void eb()
  {
    this.Jq.get();
  }

  public final void ec()
  {
    this.Jq.get();
  }

  public final void onQueueChanged(List<?> paramList)
  {
    if ((MediaControllerCompat.a)this.Jq.get() != null)
      MediaSessionCompat.QueueItem.m(paramList);
  }

  public final void onSessionDestroyed()
  {
    this.Jq.get();
  }

  public final void x(Object paramObject)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.Jq.get();
    if ((locala != null) && (!locala.Jo))
      PlaybackStateCompat.B(paramObject);
  }

  public final void y(Object paramObject)
  {
    if ((MediaControllerCompat.a)this.Jq.get() != null)
      MediaMetadataCompat.w(paramObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a.b
 * JD-Core Version:    0.6.2
 */