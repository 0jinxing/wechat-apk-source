package android.support.v4.media.session;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.b;
import android.support.v4.media.MediaBrowserCompat.d;
import android.view.KeyEvent;

final class MediaButtonReceiver$a extends MediaBrowserCompat.b
{
  private final BroadcastReceiver.PendingResult Jh;
  MediaBrowserCompat Ji;
  private final Context mContext;
  private final Intent mIntent;

  MediaButtonReceiver$a(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    this.mContext = paramContext;
    this.mIntent = paramIntent;
    this.Jh = paramPendingResult;
  }

  private void finish()
  {
    this.Ji.disconnect();
    this.Jh.finish();
  }

  public final void onConnected()
  {
    KeyEvent localKeyEvent;
    try
    {
      Object localObject = new android/support/v4/media/session/MediaControllerCompat;
      ((MediaControllerCompat)localObject).<init>(this.mContext, this.Ji.HJ.dH());
      localKeyEvent = (KeyEvent)this.mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
      if (localKeyEvent == null)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("KeyEvent may not be null");
        throw ((Throwable)localObject);
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    while (true)
    {
      finish();
      return;
      localRemoteException.Jj.dispatchMediaButtonEvent(localKeyEvent);
    }
  }

  public final void onConnectionFailed()
  {
    finish();
  }

  public final void onConnectionSuspended()
  {
    finish();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaButtonReceiver.a
 * JD-Core Version:    0.6.2
 */