package com.tencent.qqmusic.mediaplayer.upstream;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

public class DummyUriLoader
  implements UriLoader
{
  private final Uri uri;

  public DummyUriLoader()
  {
    this(null);
  }

  public DummyUriLoader(Uri paramUri)
  {
    this.uri = paramUri;
  }

  public void cancelLoading()
  {
  }

  public boolean isLoading()
  {
    return false;
  }

  public void startLoading(int paramInt, TimeUnit paramTimeUnit, UriLoader.Callback paramCallback)
  {
    AppMethodBeat.i(104580);
    if (this.uri == null)
    {
      paramCallback.onSucceed(null);
      AppMethodBeat.o(104580);
    }
    while (true)
    {
      return;
      paramCallback.onSucceed(new StreamingRequest(this.uri, null));
      AppMethodBeat.o(104580);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.DummyUriLoader
 * JD-Core Version:    0.6.2
 */