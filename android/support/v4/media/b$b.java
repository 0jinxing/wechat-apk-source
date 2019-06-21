package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import java.util.List;

final class b$b<T extends b.a> extends a.d<T>
{
  b$b(T paramT)
  {
    super(paramT);
  }

  public final void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList, Bundle paramBundle)
  {
    ((b.a)this.In).l(paramList);
  }

  public final void onError(String paramString, Bundle paramBundle)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.media.b.b
 * JD-Core Version:    0.6.2
 */