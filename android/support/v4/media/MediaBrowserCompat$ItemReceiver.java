package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

class MediaBrowserCompat$ItemReceiver extends ResultReceiver
{
  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
    if ((paramInt != 0) || (paramBundle == null) || (!paramBundle.containsKey("media_item")));
    while (true)
    {
      return;
      paramBundle.getParcelable("media_item");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ItemReceiver
 * JD-Core Version:    0.6.2
 */