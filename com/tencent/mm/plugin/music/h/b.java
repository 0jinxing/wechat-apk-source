package com.tencent.mm.plugin.music.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.music.cache.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.io.File;

public final class b
{
  public static String K(e parame)
  {
    AppMethodBeat.i(137692);
    if (parame.fJS == 6)
    {
      parame = "6_" + ag.ck(parame.fJU);
      AppMethodBeat.o(137692);
    }
    while (true)
    {
      return parame;
      parame = "0_" + ag.ck(parame.fJU);
      AppMethodBeat.o(137692);
    }
  }

  public static String Tu(String paramString)
  {
    AppMethodBeat.i(137690);
    paramString = "piece" + ag.ck(new StringBuilder().append(paramString.hashCode()).toString());
    AppMethodBeat.o(137690);
    return paramString;
  }

  public static String Tv(String paramString)
  {
    AppMethodBeat.i(137691);
    File localFile = new File(g.getAccPath(), "music");
    if (!localFile.exists())
      localFile.mkdirs();
    paramString = Tu(paramString);
    localFile = new File(localFile, paramString);
    ab.d("MicroMsg.Music.MusicFileUtil", "getMusicPieceFilePath music name %s path %s", new Object[] { paramString, localFile.getAbsoluteFile() });
    paramString = localFile.getAbsolutePath();
    AppMethodBeat.o(137691);
    return paramString;
  }

  public static String aW(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(137693);
    File localFile = new File(g.getAccPath(), "music");
    if (!localFile.exists())
      ab.i("MicroMsg.Music.MusicFileUtil", "create file folder:%b for path:%s", new Object[] { Boolean.valueOf(localFile.mkdirs()), localFile.getAbsolutePath() });
    paramString = aX(paramString, paramBoolean);
    localFile = new File(localFile, paramString);
    ab.d("MicroMsg.Music.MusicFileUtil", "music name %s path %s", new Object[] { paramString, localFile.getAbsoluteFile() });
    paramString = localFile.getAbsolutePath();
    AppMethodBeat.o(137693);
    return paramString;
  }

  private static String aX(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(137694);
    if (paramBoolean)
    {
      paramString = ag.ck(new StringBuilder().append(paramString).append("temp").toString()) + "-wifi";
      AppMethodBeat.o(137694);
    }
    while (true)
    {
      return paramString;
      paramString = ag.ck(paramString + "temp");
      AppMethodBeat.o(137694);
    }
  }

  public static String aY(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(137695);
    paramString = aW(paramString, false) + "-thumb-" + paramBoolean;
    AppMethodBeat.o(137695);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.h.b
 * JD-Core Version:    0.6.2
 */