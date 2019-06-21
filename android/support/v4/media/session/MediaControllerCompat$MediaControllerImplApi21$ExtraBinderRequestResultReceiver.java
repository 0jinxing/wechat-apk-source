package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver
{
  private WeakReference<MediaControllerCompat.MediaControllerImplApi21> Jv;

  public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21, Handler paramHandler)
  {
    super(paramHandler);
    this.Jv = new WeakReference(paramMediaControllerImplApi21);
  }

  protected void onReceiveResult(int paramInt, Bundle arg2)
  {
    MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)this.Jv.get();
    if ((localMediaControllerImplApi21 == null) || (??? == null));
    while (true)
    {
      return;
      localMediaControllerImplApi21.Jt = b.a.d(e.c(???, "android.support.v4.media.session.EXTRA_BINDER"));
      if (localMediaControllerImplApi21.Jt == null)
        continue;
      synchronized (localMediaControllerImplApi21.Js)
      {
        Iterator localIterator = localMediaControllerImplApi21.Js.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            MediaControllerCompat.a locala = (MediaControllerCompat.a)localIterator.next();
            MediaControllerCompat.MediaControllerImplApi21.a locala1 = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$a;
            locala1.<init>(locala);
            localMediaControllerImplApi21.Ju.put(locala, locala1);
            locala.Jo = true;
            try
            {
              localMediaControllerImplApi21.Jt.a(locala1);
            }
            catch (RemoteException localRemoteException)
            {
            }
          }
        localMediaControllerImplApi21.Js.clear();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver
 * JD-Core Version:    0.6.2
 */