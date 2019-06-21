package com.tencent.mm.plugin.hp.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.c.a.a;
import com.tencent.mm.c.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.RandomAccessFile;

public final class b
{
  public static int b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(90546);
    if ((paramString1 != null) && (paramString2 != null) && (paramString3 != null));
    while (true)
    {
      try
      {
        File localFile1 = new java/io/File;
        localFile1.<init>(paramString1);
        RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
        localRandomAccessFile.<init>(localFile1, "r");
        File localFile2 = new java/io/File;
        localFile2.<init>(paramString3);
        e.cx(paramString3);
        File localFile3 = new java/io/File;
        localFile3.<init>(paramString2);
        if ((localFile1.exists()) && (localFile3.exists()))
        {
          int i = 0;
          paramString1 = a.cL(paramString1);
          j = i;
          if (paramString1 != null)
          {
            j = i;
            if (paramString1.cdb != null)
            {
              j = paramString1.cdb.cde + 8;
              ab.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", new Object[] { Integer.valueOf(j) });
            }
          }
          if (d.a(localRandomAccessFile, localFile2, localFile3, j) != 1)
          {
            ab.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
            localRandomAccessFile.close();
            j = -1;
            AppMethodBeat.o(90546);
            return j;
          }
          localRandomAccessFile.close();
          if (!paramString4.equalsIgnoreCase(g.cz(paramString3)))
          {
            ab.i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", new Object[] { paramString4, g.cz(paramString3) });
            j = -2;
            AppMethodBeat.o(90546);
            continue;
          }
          paramString1 = new com/tencent/mm/c/b;
          paramString1.<init>();
          paramString1.apkMd5 = paramString4;
          paramString2 = new com/tencent/mm/c/a;
          paramString2.<init>(paramString1);
          paramString2.x(localFile2);
          j = 0;
          AppMethodBeat.o(90546);
          continue;
        }
        ab.e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", new Object[] { Boolean.valueOf(localFile1.exists()), Boolean.valueOf(localFile2.exists()), Boolean.valueOf(localFile3.exists()) });
        localRandomAccessFile.close();
        j = -1;
        AppMethodBeat.o(90546);
        continue;
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.Tinker.MergeBsDiffApk", paramString1, "merge apk failed.", new Object[0]);
        j = -1;
        AppMethodBeat.o(90546);
        continue;
      }
      int j = -1;
      AppMethodBeat.o(90546);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.a.b
 * JD-Core Version:    0.6.2
 */