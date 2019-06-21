package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

final class MediaBrowserCompat$j
{
  Bundle HR;
  private Messenger Ih;

  public MediaBrowserCompat$j(IBinder paramIBinder, Bundle paramBundle)
  {
    this.Ih = new Messenger(paramIBinder);
    this.HR = paramBundle;
  }

  final void a(int paramInt, Bundle paramBundle, Messenger paramMessenger)
  {
    Message localMessage = Message.obtain();
    localMessage.what = paramInt;
    localMessage.arg1 = 1;
    localMessage.setData(paramBundle);
    localMessage.replyTo = paramMessenger;
    this.Ih.send(localMessage);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.j
 * JD-Core Version:    0.6.2
 */