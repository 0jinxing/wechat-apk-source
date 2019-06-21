package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;

class VideoMaterialDecoder$1
  implements FilenameFilter
{
  VideoMaterialDecoder$1(VideoMaterialDecoder paramVideoMaterialDecoder)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(84044);
    boolean bool = paramString.endsWith(".mp4");
    AppMethodBeat.o(84044);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialDecoder.1
 * JD-Core Version:    0.6.2
 */