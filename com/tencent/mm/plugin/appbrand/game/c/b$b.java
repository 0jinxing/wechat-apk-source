package com.tencent.mm.plugin.appbrand.game.c;

import com.tencent.luggage.g.a;
import com.tencent.magicbrush.handler.image.IMBImageHandler;
import com.tencent.magicbrush.handler.image.a.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class b$b extends a.d
{
  private final i hrt;

  private b$b(i parami, IMBImageHandler paramIMBImageHandler)
  {
    super(paramIMBImageHandler);
    this.hrt = parami;
  }

  public final boolean ca(String paramString)
  {
    return true;
  }

  public final InputStream cb(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(130135);
    if (this.hrt == null)
    {
      ab.e("MicroMsg.WAGameRuntimeFileSystemDecoder", "fetch %s, runtime NULL", new Object[] { paramString });
      AppMethodBeat.o(130135);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
      com.tencent.mm.plugin.appbrand.appstorage.j localj1 = this.hrt.asE().b(paramString, localj);
      if ((localj1 == com.tencent.mm.plugin.appbrand.appstorage.j.gXA) && (localj.value != null))
      {
        paramString = new a((ByteBuffer)localj.value);
        AppMethodBeat.o(130135);
      }
      else
      {
        ab.e("MicroMsg.WAGameRuntimeFileSystemDecoder", "fetch %s, ret %s", new Object[] { paramString, localj1.name() });
        AppMethodBeat.o(130135);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.b.b
 * JD-Core Version:    0.6.2
 */