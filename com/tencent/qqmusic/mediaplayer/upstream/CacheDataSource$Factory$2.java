package com.tencent.qqmusic.mediaplayer.upstream;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class CacheDataSource$Factory$2
  implements Loader.Factory
{
  CacheDataSource$Factory$2(UriLoader paramUriLoader, File paramFile)
  {
  }

  public final Loader createLoader(Loader.Listener paramListener)
  {
    AppMethodBeat.i(104591);
    paramListener = new CacheDataSource.Factory.2.1(this, Looper.getMainLooper(), this.val$uriLoader, paramListener);
    AppMethodBeat.o(104591);
    return paramListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.2
 * JD-Core Version:    0.6.2
 */