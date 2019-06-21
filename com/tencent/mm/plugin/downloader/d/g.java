package com.tencent.mm.plugin.downloader.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.xwalk.core.Log;

public final class g
{
  public static Map<Integer, ByteBuffer> M(File paramFile)
  {
    Object localObject = null;
    AppMethodBeat.i(2321);
    if ((paramFile == null) || (!paramFile.exists()) || (!paramFile.isFile()))
    {
      AppMethodBeat.o(2321);
      paramFile = localObject;
    }
    while (true)
    {
      return paramFile;
      try
      {
        Map localMap = i.E(i.P(paramFile));
        paramFile = localMap;
        AppMethodBeat.o(2321);
      }
      catch (b.b localb)
      {
        Log.e("MicroMsg.Channel.IdValueReader", "APK : " + paramFile.getAbsolutePath() + " not have apk signature block");
        AppMethodBeat.o(2321);
        paramFile = localObject;
      }
      catch (IOException paramFile)
      {
        label85: break label85;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.g
 * JD-Core Version:    0.6.2
 */