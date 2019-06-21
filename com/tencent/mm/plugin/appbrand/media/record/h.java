package com.tencent.mm.plugin.appbrand.media.record;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.io.File;
import java.io.IOException;

public final class h
{
  public static final String ilL = b.eSn;

  public static boolean CA(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(105638);
    paramString = new File(paramString);
    if (!paramString.exists());
    while (true)
    {
      boolean bool2;
      try
      {
        ab.i("MicroMsg.Record.AudioRecordUtil", "new audio file");
        bool2 = paramString.createNewFile();
        bool1 = bool2;
        AppMethodBeat.o(105638);
        return bool1;
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
        continue;
      }
      ab.i("MicroMsg.Record.AudioRecordUtil", "delete audio file");
      paramString.delete();
      try
      {
        bool2 = paramString.createNewFile();
        bool1 = bool2;
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
      }
    }
  }

  public static long CB(String paramString)
  {
    AppMethodBeat.i(105639);
    File localFile = new File(paramString);
    long l = -1L;
    if (localFile.exists())
    {
      ab.i("MicroMsg.Record.AudioRecordUtil", "exist audio file");
      l = localFile.length();
    }
    while (true)
    {
      AppMethodBeat.o(105639);
      return l;
      ab.i("MicroMsg.Record.AudioRecordUtil", "audio file not exit, path:%s", new Object[] { paramString });
    }
  }

  public static String Cy(String paramString)
  {
    AppMethodBeat.i(105636);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(105636);
    }
    while (true)
    {
      return paramString;
      if ("aac".equalsIgnoreCase(paramString))
      {
        paramString = "m4a";
        AppMethodBeat.o(105636);
      }
      else if ("mp3".equalsIgnoreCase(paramString))
      {
        paramString = "mp3";
        AppMethodBeat.o(105636);
      }
      else if ("wav".equalsIgnoreCase(paramString))
      {
        paramString = "wav";
        AppMethodBeat.o(105636);
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(105636);
      }
    }
  }

  public static boolean Cz(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(105637);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(105637);
    while (true)
    {
      return bool;
      if ("aac".equalsIgnoreCase(paramString))
      {
        AppMethodBeat.o(105637);
        bool = true;
      }
      else if ("mp3".equalsIgnoreCase(paramString))
      {
        AppMethodBeat.o(105637);
        bool = true;
      }
      else if ("wav".equalsIgnoreCase(paramString))
      {
        AppMethodBeat.o(105637);
      }
      else
      {
        AppMethodBeat.o(105637);
      }
    }
  }

  public static short[] D(byte[] paramArrayOfByte, int paramInt)
  {
    short[] arrayOfShort = new short[paramInt / 2];
    for (paramInt = 0; paramInt < arrayOfShort.length; paramInt++)
      arrayOfShort[paramInt] = ((short)(short)(paramArrayOfByte[(paramInt * 2)] & 0xFF | (paramArrayOfByte[(paramInt * 2 + 1)] & 0xFF) << 8));
    return arrayOfShort;
  }

  public static String cE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(105635);
    File localFile = new File(ilL, "AudioRecord");
    if (!localFile.exists())
      localFile.mkdirs();
    paramString2 = new StringBuilder("audio").append(ag.ck(String.valueOf(paramString2)));
    if (!TextUtils.isEmpty(paramString1))
      if ("aac".equalsIgnoreCase(paramString1))
        paramString1 = ".m4a";
    while (true)
    {
      paramString1 = paramString1;
      paramString2 = new File(localFile, paramString1);
      ab.d("MicroMsg.Record.AudioRecordUtil", "getAudioFilePath audio name %s path %s", new Object[] { paramString1, paramString2.getAbsoluteFile() });
      paramString1 = paramString2.getAbsolutePath();
      AppMethodBeat.o(105635);
      return paramString1;
      if ("mp3".equalsIgnoreCase(paramString1))
        paramString1 = ".mp3";
      else if ("wav".equalsIgnoreCase(paramString1))
        paramString1 = ".wav";
      else
        paramString1 = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.h
 * JD-Core Version:    0.6.2
 */