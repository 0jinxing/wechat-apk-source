package com.tencent.mm.plugin.report.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.q;
import com.tencent.mm.model.av;
import com.tencent.mm.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class f
{
  public static boolean VZ(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(72678);
    File localFile = new File("/sdcard/cov.txt");
    if (!localFile.exists())
    {
      ab.w("MicroMsg.NetSceneCodeCoverageReport", "codecoverage checkUpload dir never create ?");
      AppMethodBeat.o(72678);
    }
    while (true)
    {
      return bool;
      String str = av.fly.T("login_user_name", "never_login_crash");
      a(str, localFile, paramString);
      paramString = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
      paramString = q.b(localFile, false, "/sdcard/cov/cov_" + paramString + ".zip");
      if (paramString == null)
      {
        ab.e("MicroMsg.NetSceneCodeCoverageReport", "zip file failed");
        AppMethodBeat.o(72678);
      }
      else
      {
        localFile.delete();
        ab.i("MicroMsg.NetSceneCodeCoverageReport", "code coverage try upload :".concat(String.valueOf(str)));
        ad.a(paramString, str, false, false, 20004);
        bool = true;
        AppMethodBeat.o(72678);
      }
    }
  }

  private static void a(String paramString1, File paramFile, String paramString2)
  {
    AppMethodBeat.i(72679);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("#username=".concat(String.valueOf(paramString1)));
    localStringBuffer.append("\n");
    localStringBuffer.append("#rev=" + com.tencent.mm.sdk.platformtools.f.REV);
    localStringBuffer.append("\n");
    localStringBuffer.append("#path=" + com.tencent.mm.sdk.platformtools.f.SVNPATH);
    localStringBuffer.append("\n");
    if (paramString2.length() > 0)
    {
      localStringBuffer.append("#startrev=".concat(String.valueOf(paramString2)));
      localStringBuffer.append("\n");
    }
    e.e(paramFile.getAbsolutePath(), localStringBuffer.toString().getBytes());
    AppMethodBeat.o(72679);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.f
 * JD-Core Version:    0.6.2
 */