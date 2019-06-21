package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.IOException;

final class CacheDataSource$Factory$1 extends FileDataSource
{
  CacheDataSource$Factory$1(String paramString, File paramFile)
  {
    super(paramString);
  }

  public final void close()
  {
    AppMethodBeat.i(104582);
    try
    {
      super.close();
      label9: if (!this.val$bufferFile.delete())
        Logger.w("CacheDataSource", "failed to delete buffer file: " + this.val$bufferFile);
      AppMethodBeat.o(104582);
      return;
    }
    catch (IOException localIOException)
    {
      break label9;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.1
 * JD-Core Version:    0.6.2
 */