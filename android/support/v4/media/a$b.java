package android.support.v4.media;

import android.media.browse.MediaBrowser.ConnectionCallback;

final class a$b<T extends a.a> extends MediaBrowser.ConnectionCallback
{
  protected final T Im;

  public a$b(T paramT)
  {
    this.Im = paramT;
  }

  public final void onConnected()
  {
    this.Im.onConnected();
  }

  public final void onConnectionFailed()
  {
    this.Im.onConnectionFailed();
  }

  public final void onConnectionSuspended()
  {
    this.Im.onConnectionSuspended();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.media.a.b
 * JD-Core Version:    0.6.2
 */