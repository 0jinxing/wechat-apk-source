package android.support.v4.media.session;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.KeyEvent;

final class MediaControllerCompat$e
  implements MediaControllerCompat.b
{
  private b Jw;

  public MediaControllerCompat$e(MediaSessionCompat.Token paramToken)
  {
    this.Jw = b.a.d((IBinder)paramToken.JG);
  }

  public final boolean dispatchMediaButtonEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent == null)
      throw new IllegalArgumentException("event may not be null.");
    try
    {
      this.Jw.a(paramKeyEvent);
      label25: return false;
    }
    catch (RemoteException paramKeyEvent)
    {
      break label25;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.e
 * JD-Core Version:    0.6.2
 */