package com.tencent.qqmusic.mediaplayer.seektable.mpeg4;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

class Mp4SeekTable$1
  implements Mp4SeekTable.Function1<HashSet<String>, Boolean>
{
  Mp4SeekTable$1(Mp4SeekTable paramMp4SeekTable)
  {
  }

  public Boolean call(HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(128480);
    boolean bool = Mp4SeekTable.access$000(paramHashSet);
    AppMethodBeat.o(128480);
    return Boolean.valueOf(bool);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.1
 * JD-Core Version:    0.6.2
 */