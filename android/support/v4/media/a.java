package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import java.util.List;

final class a
{
  static class d<T extends a.c> extends MediaBrowser.SubscriptionCallback
  {
    protected final T In;

    public d(T paramT)
    {
      this.In = paramT;
    }

    public void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList)
    {
      this.In.k(paramList);
    }

    public void onError(String paramString)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.media.a
 * JD-Core Version:    0.6.2
 */