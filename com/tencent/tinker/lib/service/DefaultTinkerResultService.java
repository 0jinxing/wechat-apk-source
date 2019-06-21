package com.tencent.tinker.lib.service;

import android.os.Process;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.lib.util.b;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;

public class DefaultTinkerResultService extends AbstractResultService
{
  public static void aj(File paramFile)
  {
    if (!SharePatchFileUtil.ap(paramFile));
    while (true)
    {
      return;
      com.tencent.tinker.lib.util.a.w("Tinker.DefaultTinkerResultService", "deleteRawPatchFile rawFile path: %s", new Object[] { paramFile.getPath() });
      Object localObject = paramFile.getName();
      if ((!((String)localObject).startsWith("patch-")) || (!((String)localObject).endsWith(".apk")))
      {
        SharePatchFileUtil.as(paramFile);
      }
      else
      {
        localObject = paramFile.getParentFile();
        if (!((File)localObject).getName().startsWith("patch-"))
          SharePatchFileUtil.as(paramFile);
        else if (!((File)localObject).getParentFile().getName().equals("tinker"))
          SharePatchFileUtil.as(paramFile);
      }
    }
  }

  public void a(a parama)
  {
    if (parama == null)
      com.tencent.tinker.lib.util.a.e("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received null result!!!!", new Object[0]);
    while (true)
    {
      return;
      com.tencent.tinker.lib.util.a.i("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received a result:%s ", new Object[] { parama.toString() });
      b.iY(getApplicationContext());
      if (parama.cxT)
      {
        aj(new File(parama.ABv));
        if (b(parama))
          Process.killProcess(Process.myPid());
        else
          com.tencent.tinker.lib.util.a.i("Tinker.DefaultTinkerResultService", "I have already install the newly patch version!", new Object[0]);
      }
    }
  }

  public final boolean b(a parama)
  {
    Object localObject = com.tencent.tinker.lib.e.a.iX(getApplicationContext());
    if (((com.tencent.tinker.lib.e.a)localObject).ABK)
    {
      localObject = ((com.tencent.tinker.lib.e.a)localObject).ABJ;
      if (localObject != null)
      {
        localObject = ((d)localObject).ABO;
        if ((parama.ABw == null) || (!parama.ABw.equals(localObject)));
      }
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.service.DefaultTinkerResultService
 * JD-Core Version:    0.6.2
 */