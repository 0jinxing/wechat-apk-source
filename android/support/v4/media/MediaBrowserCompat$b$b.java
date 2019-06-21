package android.support.v4.media;

final class MediaBrowserCompat$b$b
  implements a.a
{
  MediaBrowserCompat$b$b(MediaBrowserCompat.b paramb)
  {
  }

  public final void onConnected()
  {
    if (this.HO.HN != null)
      this.HO.HN.onConnected();
    this.HO.onConnected();
  }

  public final void onConnectionFailed()
  {
    this.HO.onConnectionFailed();
  }

  public final void onConnectionSuspended()
  {
    if (this.HO.HN != null)
      this.HO.HN.onConnectionSuspended();
    this.HO.onConnectionSuspended();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.b.b
 * JD-Core Version:    0.6.2
 */