package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class AudioPlayListItemParserFactory
{
  public static AudioPlayListItemParser createParser(String paramString)
  {
    AppMethodBeat.i(104771);
    if ((!paramString.startsWith("http")) && (paramString.endsWith(".cue")))
    {
      paramString = new CueItemParser(paramString);
      AppMethodBeat.o(104771);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(104771);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParserFactory
 * JD-Core Version:    0.6.2
 */