package com.tencent.mm.plugin.downloader.d;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.k;
import com.tencent.mm.c.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.RandomAccessFile;

public final class j
{
  private static final k cdq;

  static
  {
    AppMethodBeat.i(2333);
    cdq = new k(101010256L);
    AppMethodBeat.o(2333);
  }

  public static byte[] Im(String paramString)
  {
    RandomAccessFile localRandomAccessFile1 = null;
    AppMethodBeat.i(2332);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(2332);
      paramString = localRandomAccessFile1;
    }
    while (true)
    {
      return paramString;
      RandomAccessFile localRandomAccessFile2 = new RandomAccessFile(paramString, "r");
      if (localRandomAccessFile2.length() == 0L)
      {
        localRandomAccessFile2.close();
        ab.i("MicroMsg.Channel.ZipEocdCommentTool", "apk file length is zero");
        AppMethodBeat.o(2332);
        paramString = localRandomAccessFile1;
        continue;
      }
      try
      {
        Object localObject = new java/io/File;
        ((File)localObject).<init>(paramString);
        localRandomAccessFile1 = new java/io/RandomAccessFile;
        localRandomAccessFile1.<init>((File)localObject, "r");
        localRandomAccessFile1.seek(((Long)h.N((File)localObject).second).longValue() + 22L - 2L);
        localObject = new byte[2];
        localRandomAccessFile1.readFully((byte[])localObject);
        paramString = new com/tencent/mm/c/l;
        paramString.<init>((byte[])localObject);
        int i = paramString.value;
        if (i == 0)
          paramString = null;
        while (true)
        {
          localRandomAccessFile2.close();
          AppMethodBeat.o(2332);
          break;
          paramString = new byte[i];
          localRandomAccessFile1.read(paramString);
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.Channel.ZipEocdCommentTool", "readComment, error: %s", new Object[] { paramString.getMessage() });
          paramString = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.j
 * JD-Core Version:    0.6.2
 */