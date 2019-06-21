package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.os.Handler;
import android.os.RemoteException;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21
  implements MediaControllerCompat.b
{
  protected final Object Jr;
  final List<MediaControllerCompat.a> Js = new ArrayList();
  b Jt;
  HashMap<MediaControllerCompat.a, MediaControllerCompat.MediaControllerImplApi21.a> Ju = new HashMap();

  public MediaControllerCompat$MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    this.Jr = new MediaController(paramContext, (MediaSession.Token)paramToken.JG);
    if (this.Jr == null)
      throw new RemoteException();
    this.Jt = paramToken.Jt;
    if (this.Jt == null)
    {
      paramContext = new MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver(this, new Handler());
      ((MediaController)this.Jr).sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, paramContext);
    }
  }

  public final boolean dispatchMediaButtonEvent(KeyEvent paramKeyEvent)
  {
    return ((MediaController)this.Jr).dispatchMediaButtonEvent(paramKeyEvent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21
 * JD-Core Version:    0.6.2
 */