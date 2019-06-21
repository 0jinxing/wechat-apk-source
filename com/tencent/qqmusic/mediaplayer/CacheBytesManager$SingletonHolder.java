package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CacheBytesManager$SingletonHolder
{
  private static final CacheBytesManager INSTANCE;

  static
  {
    AppMethodBeat.i(128393);
    INSTANCE = new CacheBytesManager(262144, null);
    AppMethodBeat.o(128393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.CacheBytesManager.SingletonHolder
 * JD-Core Version:    0.6.2
 */