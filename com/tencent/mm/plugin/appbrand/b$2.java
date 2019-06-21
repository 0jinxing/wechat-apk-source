package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipInputStream;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(128926);
    long l = bo.anU();
    int i = -1;
    try
    {
      ZipInputStream localZipInputStream = new java/util/zip/ZipInputStream;
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      File localFile = new java/io/File;
      localFile.<init>("/sdcard/test_zip.zip");
      localFileInputStream.<init>(localFile);
      localZipInputStream.<init>(localFileInputStream);
      j = l.a(localZipInputStream, "/sdcard/test_zip/");
      ab.i("[ZIP]", "unzip Java %d, cost %d", new Object[] { Integer.valueOf(j), Long.valueOf(bo.anU() - l) });
      AppMethodBeat.o(128926);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("[ZIP]", "unzip Java ex=%s", new Object[] { localException });
        int j = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.2
 * JD-Core Version:    0.6.2
 */