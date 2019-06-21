package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public final class w
{
  public static String a(ao paramao, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(86801);
    if ((paramao == null) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(86801);
      paramao = localObject;
    }
    while (true)
    {
      return paramao;
      paramao.avW();
      InputStream localInputStream = paramao.xy(paramString);
      if (localInputStream == null)
      {
        AppMethodBeat.o(86801);
        paramao = localObject;
      }
      else
      {
        try
        {
          localInputStream.mark(localInputStream.available());
          String str = g.b(localInputStream, 4096);
          localInputStream.reset();
          File localFile = new java/io/File;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localFile.<init>(paramao.gUc.getAbsolutePath() + "_xdir/" + paramString);
          paramao = localFile.getParentFile();
          if ((paramao.exists()) && (paramao.isFile()))
            paramao.delete();
          paramao.mkdirs();
          if (!str.equals(g.v(localFile)))
          {
            if (!localFile.isDirectory())
              break label237;
            paramao = Runtime.getRuntime();
            paramString = new java/lang/StringBuilder;
            paramString.<init>("rm -r ");
            paramao.exec(localFile.getAbsolutePath());
          }
          while (true)
          {
            paramao = new java/io/FileOutputStream;
            paramao.<init>(localFile);
            e.copyStream(localInputStream, paramao);
            bo.b(paramao);
            paramao = localFile.getAbsolutePath();
            bo.b(localInputStream);
            AppMethodBeat.o(86801);
            break;
            label237: localFile.delete();
          }
        }
        catch (Exception paramao)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.PkgPartialCopy", paramao, "copy failed", new Object[0]);
          bo.b(localInputStream);
          AppMethodBeat.o(86801);
          paramao = localObject;
        }
        finally
        {
          bo.b(localInputStream);
          AppMethodBeat.o(86801);
        }
      }
    }
    throw paramao;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.w
 * JD-Core Version:    0.6.2
 */