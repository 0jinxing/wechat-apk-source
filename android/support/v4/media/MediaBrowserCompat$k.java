package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class MediaBrowserCompat$k
{
  final List<Bundle> Ii = new ArrayList();
  final List<MediaBrowserCompat.l> mO = new ArrayList();

  public final MediaBrowserCompat.l c(Context paramContext, Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.setClassLoader(paramContext.getClassLoader());
    int i = 0;
    if (i < this.Ii.size())
      if (!c.a((Bundle)this.Ii.get(i), paramBundle));
    for (paramContext = (MediaBrowserCompat.l)this.mO.get(i); ; paramContext = null)
    {
      return paramContext;
      i++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.k
 * JD-Core Version:    0.6.2
 */