package android.support.v4.media;

import android.support.v4.f.a;
import android.support.v4.os.ResultReceiver;

final class MediaBrowserServiceCompat$d$5
  implements Runnable
{
  MediaBrowserServiceCompat$d$5(MediaBrowserServiceCompat.d paramd, MediaBrowserServiceCompat.e parame, String paramString, ResultReceiver paramResultReceiver)
  {
  }

  public final void run()
  {
    Object localObject = this.IH.asBinder();
    MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)this.IL.Iu.Io.get(localObject);
    if (localb == null)
      new StringBuilder("getMediaItem for callback that isn't registered id=").append(this.IN);
    String str;
    do
    {
      return;
      MediaBrowserServiceCompat localMediaBrowserServiceCompat = this.IL.Iu;
      str = this.IN;
      localObject = new MediaBrowserServiceCompat.2(localMediaBrowserServiceCompat, str, this.Iv);
      localMediaBrowserServiceCompat.Ip = localb;
      ((MediaBrowserServiceCompat.c)localObject).Dj = 2;
      ((MediaBrowserServiceCompat.c)localObject).dN();
      localMediaBrowserServiceCompat.Ip = null;
    }
    while (((MediaBrowserServiceCompat.c)localObject).isDone());
    throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(str)));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.d.5
 * JD-Core Version:    0.6.2
 */