package android.support.v4.media;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

class MediaBrowserCompat$l$a
  implements a.c
{
  MediaBrowserCompat$l$a(MediaBrowserCompat.l paraml)
  {
  }

  public final void k(List<?> paramList)
  {
    if (this.Il.Ik == null);
    for (Object localObject1 = null; localObject1 == null; localObject1 = (MediaBrowserCompat.k)this.Il.Ik.get())
    {
      MediaBrowserCompat.MediaItem.j(paramList);
      return;
    }
    paramList = MediaBrowserCompat.MediaItem.j(paramList);
    List localList = ((MediaBrowserCompat.k)localObject1).mO;
    localObject1 = ((MediaBrowserCompat.k)localObject1).Ii;
    int i = 0;
    label57: int j;
    int m;
    int n;
    if (i < localList.size())
    {
      Object localObject2 = (Bundle)((List)localObject1).get(i);
      if ((localObject2 != null) && (paramList != null))
      {
        j = ((Bundle)localObject2).getInt("android.media.browse.extra.PAGE", -1);
        int k = ((Bundle)localObject2).getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if ((j != -1) || (k != -1))
        {
          m = k * j;
          n = m + k;
          if ((j >= 0) && (k > 0) && (m < paramList.size()))
            break label168;
          localObject2 = Collections.EMPTY_LIST;
        }
      }
    }
    while (true)
    {
      i++;
      break label57;
      break;
      label168: j = n;
      if (n > paramList.size())
        j = paramList.size();
      paramList.subList(m, j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.l.a
 * JD-Core Version:    0.6.2
 */