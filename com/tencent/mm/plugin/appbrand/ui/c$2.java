package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.preload.a;
import com.tencent.mm.plugin.appbrand.game.preload.a.a;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.j;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

final class c$2
  implements Runnable
{
  c$2(c paramc, String paramString, a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132935);
    a.aBu();
    Object localObject1 = c.e(this.iGs).mAppId;
    Object localObject4 = this.iGv;
    a.a locala = this.iGw;
    if ((!com.tencent.magicbrush.c.isNullOrNil((String)localObject1)) && (!com.tencent.magicbrush.c.isNullOrNil((String)localObject4)))
    {
      localObject1 = a.fqf + File.separator + (String)localObject1 + File.separator;
      j.aih((String)localObject1);
      localObject1 = (String)localObject1 + ag.ck((String)localObject4);
      ab.i("MicroMsg.WAGameLoadingImgManager", "loadingImgPath:%s", new Object[] { localObject1 });
      if (!new File((String)localObject1).exists())
        break label215;
    }
    while (true)
    {
      long l;
      Object localObject5;
      Object localObject2;
      try
      {
        localObject4 = new java/io/FileInputStream;
        ((FileInputStream)localObject4).<init>((String)localObject1);
        localObject1 = localObject4;
        if (localObject4 == null);
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        try
        {
          l = ((InputStream)localObject4).available();
          locala.a(d.decodeStream((InputStream)localObject4), l);
          localObject1 = localObject4;
          com.tencent.magicbrush.c.b((Closeable)localObject1);
          AppMethodBeat.o(132935);
          return;
          localFileNotFoundException1 = localFileNotFoundException1;
          ab.printErrStackTrace("MicroMsg.WAGameLoadingImgManager", localFileNotFoundException1, "", new Object[0]);
          localObject5 = null;
        }
        catch (IOException localIOException1)
        {
          ab.printErrStackTrace("MicroMsg.WAGameLoadingImgManager", localIOException1, "read contentLength", new Object[0]);
          localObject2 = localObject5;
          continue;
        }
      }
      label215: a.bW(localObject2, (String)localObject5);
      try
      {
        localObject5 = new java/io/FileInputStream;
        ((FileInputStream)localObject5).<init>(localObject2);
        localObject2 = localObject5;
        if (localObject5 == null)
          continue;
        try
        {
          l = ((InputStream)localObject5).available();
          locala.a(d.decodeStream((InputStream)localObject5), l);
          localObject2 = localObject5;
        }
        catch (IOException localIOException2)
        {
          ab.printErrStackTrace("MicroMsg.WAGameLoadingImgManager", localIOException2, "read contentLength", new Object[0]);
          Object localObject3 = localObject5;
        }
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WAGameLoadingImgManager", localFileNotFoundException2, "", new Object[0]);
          Object localObject6 = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.2
 * JD-Core Version:    0.6.2
 */