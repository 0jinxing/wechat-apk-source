package android.support.v4.media;

import android.os.Build.VERSION;

public class MediaBrowserCompat$b
{
  final Object HM;
  a HN;

  public MediaBrowserCompat$b()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (this.HM = new a.b(new MediaBrowserCompat.b.b(this)); ; this.HM = null)
      return;
  }

  public void onConnected()
  {
  }

  public void onConnectionFailed()
  {
  }

  public void onConnectionSuspended()
  {
  }

  static abstract interface a
  {
    public abstract void onConnected();

    public abstract void onConnectionSuspended();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.b
 * JD-Core Version:    0.6.2
 */