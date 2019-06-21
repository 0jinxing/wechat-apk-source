package com.tencent.mm.plugin.appbrand.o;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.ji;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.IOException;

public final class c
{
  public com.tencent.mm.sdk.b.c iDA;
  public com.tencent.mm.sdk.b.c iDB;
  b iDy;
  public com.tencent.mm.sdk.b.c iDz;

  private c()
  {
    AppMethodBeat.i(132719);
    this.iDB = new com.tencent.mm.sdk.b.c()
    {
    };
    this.iDy = new b();
    this.iDz = new c.1(this);
    this.iDA = new c.2(this);
    AppMethodBeat.o(132719);
  }

  private static boolean d(File paramFile, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(132722);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(132722);
    boolean bool2;
    while (true)
    {
      return bool1;
      if (!paramFile.exists())
        paramFile.mkdirs();
      File localFile = new File(paramFile, ".nomedia");
      if (!localFile.exists());
      try
      {
        localFile.createNewFile();
        localFile = new File(paramFile, paramString);
        paramFile = localFile.getAbsolutePath();
        d locald = d.iDE;
        bool2 = d.cM(paramFile, paramString);
        if (bool2)
        {
          paramString = localFile.getParent();
          int i = bo.hU(paramFile, paramString);
          if (i < 0)
          {
            ab.e("MicroMsg.WxaFTSSearchCore", "unzip fail, ret = %s, zipFilePath = %s, unzipPath = %s", new Object[] { Integer.valueOf(i), paramFile, paramString });
            AppMethodBeat.o(132722);
          }
        }
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WxaFTSSearchCore", localIOException, "create nomedia file error", new Object[0]);
        ab.i("MicroMsg.WxaFTSSearchCore", "unzip template files into dir(%s) successfully.", new Object[] { localIOException.getAbsolutePath() });
      }
    }
    while (true)
    {
      AppMethodBeat.o(132722);
      bool1 = bool2;
      break;
      ab.i("MicroMsg.WxaFTSSearchCore", "copy template file from asset fail %s", new Object[] { localIOException.getAbsolutePath() });
    }
  }

  static boolean f(File paramFile1, File paramFile2)
  {
    boolean bool = false;
    AppMethodBeat.i(132723);
    e.t(paramFile2);
    paramFile2.mkdirs();
    File localFile = new File(paramFile2, ".nomedia");
    if (!localFile.exists());
    try
    {
      localFile.createNewFile();
      paramFile1 = paramFile1.getAbsolutePath();
      paramFile2 = paramFile2.getAbsolutePath();
      int i = bo.hU(paramFile1, paramFile2);
      if (i < 0)
      {
        ab.e("MicroMsg.WxaFTSSearchCore", "unzip fail, ret = %s, zipFilePath = %s, unzipPath = ", new Object[] { Integer.valueOf(i), paramFile1, paramFile2 });
        AppMethodBeat.o(132723);
        return bool;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WxaFTSSearchCore", localIOException, "create nomedia file error", new Object[0]);
        continue;
        ab.i("MicroMsg.WxaFTSSearchCore", "Unzip Path : %s.", new Object[] { paramFile2 });
        AppMethodBeat.o(132723);
        bool = true;
      }
    }
  }

  public final void prepare()
  {
    AppMethodBeat.i(132720);
    a.xxA.c(this.iDz);
    a.xxA.c(this.iDA);
    this.iDB.dnU();
    refresh();
    File localFile = new File(this.iDy.gXQ);
    ab.d("MicroMsg.WxaFTSSearchCore", "prepare(cv : %s, bv : %s)", new Object[] { Integer.valueOf(this.iDy.cD), Integer.valueOf(65900182) });
    if ((this.iDy.cD < 65900182) && (d(localFile, "wxa_fts_template.zip")))
      refresh();
    AppMethodBeat.o(132720);
  }

  final void refresh()
  {
    AppMethodBeat.i(132721);
    b localb = this.iDy;
    d locald = d.iDE;
    localb.cD = d.aLE();
    localb = this.iDy;
    locald = d.iDE;
    localb.gXQ = d.aLD();
    AppMethodBeat.o(132721);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.c
 * JD-Core Version:    0.6.2
 */