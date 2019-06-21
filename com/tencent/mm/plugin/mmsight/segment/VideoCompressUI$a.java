package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoCompressUI$a
{
  public int audioBitRate = -1;
  public String fPU;
  public String fPV;
  public int fPW = -1;
  public int fPX = -1;
  public int videoBitRate = -1;
  public int videoFrameRate = -1;
  public int videoHeight = -1;
  public int videoWidth = -1;

  private VideoCompressUI$a(VideoCompressUI paramVideoCompressUI)
  {
  }

  public final String toString()
  {
    AppMethodBeat.i(3698);
    String str = "VideoAnalysisStruct{videoTrackMime='" + this.fPU + '\'' + ", audioTrackMime='" + this.fPV + '\'' + ", durationMs=" + this.fPW + ", videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", videoBitRate=" + this.videoBitRate + ", videoIFrameInterval=" + this.fPX + ", videoFrameRate=" + this.videoFrameRate + ", audioBitRate=" + this.audioBitRate + '}';
    AppMethodBeat.o(3698);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoCompressUI.a
 * JD-Core Version:    0.6.2
 */