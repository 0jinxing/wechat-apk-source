package com.tencent.mm.modelappbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class b$a
  implements b.g
{
  public final InputStream openRead(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(77322);
    Object localObject2 = b.abS() + paramString;
    if (com.tencent.mm.vfs.e.ct((String)localObject2 + ".wlock"))
    {
      AppMethodBeat.o(77322);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      try
      {
        localObject2 = com.tencent.mm.vfs.e.openRead((String)localObject2);
        paramString = (String)localObject2;
        AppMethodBeat.o(77322);
      }
      catch (IOException localIOException)
      {
        ab.d("MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache", "openRead fileName %s, e %s", new Object[] { paramString, localIOException });
        AppMethodBeat.o(77322);
        paramString = localObject1;
      }
    }
  }

  public final OutputStream pH(String paramString)
  {
    AppMethodBeat.i(77321);
    try
    {
      if (!com.tencent.mm.vfs.e.tf(b.abS()))
      {
        localObject = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject).<init>(b.abS());
        if (!((com.tencent.mm.vfs.b)localObject).isDirectory())
        {
          com.tencent.mm.vfs.e.deleteFile(b.abS());
          com.tencent.mm.vfs.e.tf(b.abS());
        }
      }
      str1 = b.abS() + paramString;
      str2 = str1 + ".wlock";
      com.tencent.mm.vfs.e.deleteFile(str2);
      com.tencent.mm.vfs.e.N(str2, true);
      com.tencent.mm.vfs.e.b(str2, new byte[1], 1);
    }
    catch (Throwable localThrowable)
    {
      try
      {
        String str1;
        String str2;
        com.tencent.mm.vfs.e.deleteFile(str1);
        com.tencent.mm.vfs.e.N(str1, true);
        Object localObject = new com/tencent/mm/modelappbrand/a/b$a$1;
        ((b.a.1)localObject).<init>(this, com.tencent.mm.vfs.e.L(str1, false), str2);
        AppMethodBeat.o(77321);
        paramString = (String)localObject;
        return paramString;
        localThrowable = localThrowable;
        ab.e("MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache", "openWrite mkdirs e=%s", new Object[] { localThrowable });
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache", localIOException, "openWrite fileName %s, parent exists[%b]", new Object[] { paramString, Boolean.valueOf(com.tencent.mm.vfs.e.ct(b.abS())) });
          paramString = null;
          AppMethodBeat.o(77321);
        }
      }
    }
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(77323);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (com.tencent.mm.a.e.deleteFile(b.abS() + paramString)))
    {
      bool = true;
      AppMethodBeat.o(77323);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77323);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.a
 * JD-Core Version:    0.6.2
 */