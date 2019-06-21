package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver
{
  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
    if ((paramInt != 0) || (paramBundle == null) || (!paramBundle.containsKey("search_results")));
    while (true)
    {
      return;
      Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
      if (arrayOfParcelable != null)
      {
        paramBundle = new ArrayList();
        int i = arrayOfParcelable.length;
        for (paramInt = 0; paramInt < i; paramInt++)
          paramBundle.add((MediaBrowserCompat.MediaItem)arrayOfParcelable[paramInt]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.SearchResultReceiver
 * JD-Core Version:    0.6.2
 */