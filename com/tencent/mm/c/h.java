package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class h
{
  public static int b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int i = -1;
    AppMethodBeat.i(125706);
    int j;
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null))
    {
      AppMethodBeat.o(125706);
      j = i;
      return j;
    }
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
        File localFile3 = new java/io/File;
        localFile3.<init>(paramString2);
        if ((!localFile1.exists()) || (!localFile3.exists()))
        {
          paramString1 = System.err;
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>("MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=");
          paramString1.println(localFile1.exists() + ", newFile.exists()=" + localFile2.exists() + ", patch.exists()=" + localFile3.exists());
          localRandomAccessFile.close();
          AppMethodBeat.o(125706);
          j = i;
          break;
        }
        paramString1 = a.cL(paramString1);
        if ((paramString1 == null) || (paramString1.cdb == null))
          break label345;
        j = paramString1.cdb.cde + 8;
        System.out.println("MicroMsg.MergePatchApk:extLen = ".concat(String.valueOf(j)));
        if (d.a(localRandomAccessFile, localFile2, localFile3, j) != 1)
        {
          System.out.println("MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
          localRandomAccessFile.close();
          AppMethodBeat.o(125706);
          j = i;
          break;
        }
        localRandomAccessFile.close();
        boolean bool = paramString4.equalsIgnoreCase(g.cz(paramString3));
        if (!bool)
        {
          j = -2;
          AppMethodBeat.o(125706);
          break;
        }
        paramString1 = new com/tencent/mm/c/b;
        paramString1.<init>();
        paramString1.apkMd5 = paramString4;
        paramString2 = new com/tencent/mm/c/a;
        paramString2.<init>(paramString1);
        paramString2.x(localFile2);
        AppMethodBeat.o(125706);
        j = 0;
      }
      catch (Exception paramString1)
      {
        System.out.println("MicroMsg.MergePatchApk:Exception in merge()");
        AppMethodBeat.o(125706);
        j = i;
      }
      break;
      label345: j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.h
 * JD-Core Version:    0.6.2
 */