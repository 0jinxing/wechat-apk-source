package com.tencent.mm.media.g;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/remuxer/RemuxConfig$Companion;", "", "()V", "useAudioRecord", "", "getAudioCpFile", "", "filePath", "getCpVideoFile", "plugin-mediaeditor_release"})
public final class i$a
{
  public static String lX(String paramString)
  {
    AppMethodBeat.i(13083);
    j.p(paramString, "filePath");
    paramString = paramString + "_audio.aac";
    AppMethodBeat.o(13083);
    return paramString;
  }

  public static String lY(String paramString)
  {
    AppMethodBeat.i(13084);
    j.p(paramString, "filePath");
    paramString = paramString + "_cp_video.temp";
    AppMethodBeat.o(13084);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.i.a
 * JD-Core Version:    0.6.2
 */