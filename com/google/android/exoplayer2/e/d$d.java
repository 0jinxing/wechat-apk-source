package com.google.android.exoplayer2.e;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$d
  implements d.c
{
  public final boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    AppMethodBeat.i(95243);
    boolean bool = "video/avc".equals(paramString);
    AppMethodBeat.o(95243);
    return bool;
  }

  public final int getCodecCount()
  {
    AppMethodBeat.i(95241);
    int i = MediaCodecList.getCodecCount();
    AppMethodBeat.o(95241);
    return i;
  }

  public final MediaCodecInfo getCodecInfoAt(int paramInt)
  {
    AppMethodBeat.i(95242);
    MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(paramInt);
    AppMethodBeat.o(95242);
    return localMediaCodecInfo;
  }

  public final boolean rL()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e.d.d
 * JD-Core Version:    0.6.2
 */