package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.List;

abstract interface MediaBrowserServiceCompat$e
{
  public abstract void a(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);

  public abstract void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle);

  public abstract IBinder asBinder();

  public abstract void dO();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.e
 * JD-Core Version:    0.6.2
 */