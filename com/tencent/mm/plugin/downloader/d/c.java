package com.tencent.mm.plugin.downloader.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public final class c
{
  public static boolean Il(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(2312);
    try
    {
      bool2 = b.Ik(paramString);
      AppMethodBeat.o(2312);
      return bool2;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Channel.ChannelReader", "isV2ChannelApk error: %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(2312);
        boolean bool2 = bool1;
      }
    }
  }

  public static String K(File paramFile)
  {
    Object localObject1 = null;
    AppMethodBeat.i(2310);
    try
    {
      ab.i("MicroMsg.Channel.ChannelReader", "get channel by v1");
      byte[] arrayOfByte = j.Im(paramFile.getAbsolutePath());
      if (arrayOfByte == null)
      {
        AppMethodBeat.o(2310);
        paramFile = localObject1;
      }
      while (true)
      {
        return paramFile;
        Object localObject2 = new com/tencent/mm/plugin/downloader/d/f;
        ((f)localObject2).<init>();
        ((f)localObject2).E(arrayOfByte);
        localObject2 = ((f)localObject2).kMf.getProperty("channelId");
        paramFile = (File)localObject2;
        AppMethodBeat.o(2310);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Channel.ChannelReader", "APK : %s not have channel info from zip comment", new Object[] { paramFile.getAbsolutePath() });
        AppMethodBeat.o(2310);
        paramFile = localObject1;
      }
    }
  }

  public static String L(File paramFile)
  {
    AppMethodBeat.i(2311);
    ab.i("MicroMsg.Channel.ChannelReader", "get channel by v2");
    if ((!paramFile.exists()) || (!paramFile.isFile()))
    {
      paramFile = null;
      if (paramFile != null)
        break label139;
      AppMethodBeat.o(2311);
      paramFile = null;
    }
    while (true)
    {
      return paramFile;
      if ((!paramFile.exists()) || (!paramFile.isFile()))
        paramFile = null;
      while (true)
      {
        if (paramFile == null)
          break label134;
        localObject = paramFile.array();
        int i = paramFile.arrayOffset();
        int j = paramFile.position();
        int k = paramFile.arrayOffset();
        paramFile = Arrays.copyOfRange((byte[])localObject, i + j, paramFile.limit() + k);
        break;
        paramFile = g.M(paramFile);
        if (paramFile != null)
          paramFile = (ByteBuffer)paramFile.get(Integer.valueOf(1903261812));
        else
          paramFile = null;
      }
      label134: paramFile = null;
      break;
      label139: Object localObject = new f();
      ((f)localObject).E(paramFile);
      paramFile = ((f)localObject).kMf.getProperty("channelId");
      AppMethodBeat.o(2311);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.c
 * JD-Core Version:    0.6.2
 */