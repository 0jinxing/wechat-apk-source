package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.lang.ref.WeakReference;

final class MediaBrowserCompat$a extends Handler
{
  private final WeakReference<MediaBrowserCompat.i> HK;
  private WeakReference<Messenger> HL;

  MediaBrowserCompat$a(MediaBrowserCompat.i parami)
  {
    this.HK = new WeakReference(parami);
  }

  final void a(Messenger paramMessenger)
  {
    this.HL = new WeakReference(paramMessenger);
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((this.HL == null) || (this.HL.get() == null) || (this.HK.get() == null));
    while (true)
    {
      return;
      Bundle localBundle = paramMessage.getData();
      localBundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
      MediaBrowserCompat.i locali = (MediaBrowserCompat.i)this.HK.get();
      Messenger localMessenger = (Messenger)this.HL.get();
      try
      {
        switch (paramMessage.what)
        {
        default:
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Unhandled message: ");
          localStringBuilder.append(paramMessage).append("\n  Client version: 1\n  Service version: ").append(paramMessage.arg1);
        case 1:
        case 2:
        case 3:
        }
      }
      catch (BadParcelableException localBadParcelableException)
      {
      }
      if (paramMessage.what == 1)
      {
        locali.b(localMessenger);
        continue;
        locali.a(localMessenger, localBundle.getString("data_media_item_id"), (MediaSessionCompat.Token)localBundle.getParcelable("data_media_session_token"), localBundle.getBundle("data_root_hints"));
        continue;
        locali.b(localMessenger);
        continue;
        String str = localBundle.getString("data_media_item_id");
        localBundle.getParcelableArrayList("data_media_item_list");
        locali.a(localMessenger, str, localBundle.getBundle("data_options"));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.a
 * JD-Core Version:    0.6.2
 */