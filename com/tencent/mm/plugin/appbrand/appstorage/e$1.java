package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import java.io.File;

final class e$1
  implements Runnable
{
  private void B(File paramFile)
  {
    int i = 0;
    AppMethodBeat.i(129521);
    if ((!paramFile.exists()) || (!paramFile.isDirectory()))
      AppMethodBeat.o(129521);
    while (true)
    {
      return;
      if (com.tencent.mm.vfs.e.ct(paramFile.getAbsolutePath() + "/dir.lock"))
      {
        if (bo.anU() - new b(paramFile.getAbsolutePath() + "/dir.lock").lastModified() < e.awN())
        {
          ab.d("MicroMsg.AppBrandLocalMediaPruner", "pruneAppDir dirName %s, locked", new Object[] { paramFile.getName() });
          AppMethodBeat.o(129521);
        }
        else
        {
          ab.e("MicroMsg.AppBrandLocalMediaPruner", "pruneAppDir dirName %s, lock expired", new Object[] { paramFile.getName() });
        }
      }
      else
      {
        ab.d("MicroMsg.AppBrandLocalMediaPruner", "pruneAppDir dirName %s, lock free", new Object[] { paramFile.getName() });
        paramFile = paramFile.listFiles(new e.1.1(this));
        if ((paramFile == null) || (paramFile.length <= 0))
        {
          AppMethodBeat.o(129521);
        }
        else
        {
          long l = bo.anU();
          int j = paramFile.length;
          while (i < j)
          {
            Object localObject = paramFile[i];
            if (l - localObject.lastModified() >= e.access$100())
              com.tencent.mm.a.e.deleteFile(localObject.getAbsolutePath());
            i++;
          }
          AppMethodBeat.o(129521);
        }
      }
    }
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(129520);
    Object localObject = new File(AppBrandLocalMediaObjectManager.gXn);
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
      AppMethodBeat.o(129520);
    while (true)
    {
      return;
      localObject = ((File)localObject).listFiles();
      if ((localObject == null) || (localObject.length <= 0))
      {
        AppMethodBeat.o(129520);
      }
      else
      {
        int j = localObject.length;
        for (int k = 0; k < j; k++)
          B(localObject[k]);
        localObject = new File(AppBrandVideoDownLoadMgr.hYF);
        if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
        {
          AppMethodBeat.o(129520);
        }
        else
        {
          localObject = ((File)localObject).listFiles();
          if ((localObject == null) || (localObject.length <= 0))
          {
            AppMethodBeat.o(129520);
          }
          else
          {
            j = localObject.length;
            for (k = i; k < j; k++)
              B(localObject[k]);
            AppMethodBeat.o(129520);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.e.1
 * JD-Core Version:    0.6.2
 */