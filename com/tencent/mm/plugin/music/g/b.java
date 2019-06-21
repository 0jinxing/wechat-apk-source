package com.tencent.mm.plugin.music.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ag.e;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;

public final class b
  implements IDataSourceFactory
{
  public e fqV;

  public b(e parame)
  {
    this.fqV = parame;
  }

  public final IDataSource createDataSource()
  {
    AppMethodBeat.i(137674);
    a locala = new a(this.fqV);
    AppMethodBeat.o(137674);
    return locala;
  }

  public final INativeDataSource createNativeDataSource()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.g.b
 * JD-Core Version:    0.6.2
 */