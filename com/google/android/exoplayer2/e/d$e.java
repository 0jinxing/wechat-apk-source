package com.google.android.exoplayer2.e;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(21)
final class d$e
  implements d.c
{
  private final int beU;
  private MediaCodecInfo[] beV;

  public d$e(boolean paramBoolean)
  {
    AppMethodBeat.i(95244);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.beU = i;
      AppMethodBeat.o(95244);
      return;
    }
  }

  private void rM()
  {
    AppMethodBeat.i(95248);
    if (this.beV == null)
      this.beV = new MediaCodecList(this.beU).getCodecInfos();
    AppMethodBeat.o(95248);
  }

  public final boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    AppMethodBeat.i(95247);
    boolean bool = paramCodecCapabilities.isFeatureSupported("secure-playback");
    AppMethodBeat.o(95247);
    return bool;
  }

  public final int getCodecCount()
  {
    AppMethodBeat.i(95245);
    rM();
    int i = this.beV.length;
    AppMethodBeat.o(95245);
    return i;
  }

  public final MediaCodecInfo getCodecInfoAt(int paramInt)
  {
    AppMethodBeat.i(95246);
    rM();
    MediaCodecInfo localMediaCodecInfo = this.beV[paramInt];
    AppMethodBeat.o(95246);
    return localMediaCodecInfo;
  }

  public final boolean rL()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e.d.e
 * JD-Core Version:    0.6.2
 */