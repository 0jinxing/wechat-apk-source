package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class an extends a
{
  private String cVC = "";
  public long cVD = 0L;
  public long cVE = 0L;
  public long cVF = 0L;
  public long cVG = 0L;
  public long cVH = 0L;
  public long cVI = 0L;
  public long cVJ = 0L;
  public long cVK = 0L;
  public long cVL = 0L;
  private String cVM = "";
  public long cVN = 0L;
  public long cVO = 0L;
  public long cVP = 0L;
  private String cZt = "";
  private String cZu = "";

  public final String Fj()
  {
    AppMethodBeat.i(50546);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cZt);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVH);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVI);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVL);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVP);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(50546);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(50547);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Tid:").append(this.cZt);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoUrl:").append(this.cZu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NewMd5:").append(this.cVC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownloadStartTime:").append(this.cVD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownloadEndTime:").append(this.cVE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoSize:").append(this.cVF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoDuration:").append(this.cVG);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoBitrate:").append(this.cVH);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AudioBitrate:").append(this.cVI);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoFps:").append(this.cVJ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoWidth:").append(this.cVK);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoHeight:").append(this.cVL);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CDNIp:").append(this.cVM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalAudioChannel:").append(this.cVN);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HadPreloadSize:").append(this.cVO);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HadPreloadCompletion:").append(this.cVP);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(50547);
    return localObject;
  }

  public final an bn(long paramLong)
  {
    this.cVD = paramLong;
    return this;
  }

  public final an bo(long paramLong)
  {
    this.cVE = paramLong;
    return this;
  }

  public final an bp(long paramLong)
  {
    this.cVF = paramLong;
    return this;
  }

  public final an bq(long paramLong)
  {
    this.cVG = paramLong;
    return this;
  }

  public final an br(long paramLong)
  {
    this.cVH = paramLong;
    return this;
  }

  public final an bs(long paramLong)
  {
    this.cVI = paramLong;
    return this;
  }

  public final an bt(long paramLong)
  {
    this.cVJ = paramLong;
    return this;
  }

  public final an bu(long paramLong)
  {
    this.cVK = paramLong;
    return this;
  }

  public final an bv(long paramLong)
  {
    this.cVL = paramLong;
    return this;
  }

  public final an bw(long paramLong)
  {
    this.cVN = paramLong;
    return this;
  }

  public final an bx(long paramLong)
  {
    this.cVO = paramLong;
    return this;
  }

  public final an by(long paramLong)
  {
    this.cVP = paramLong;
    return this;
  }

  public final an ft(String paramString)
  {
    AppMethodBeat.i(50543);
    this.cZu = t("VideoUrl", paramString, true);
    AppMethodBeat.o(50543);
    return this;
  }

  public final an fu(String paramString)
  {
    AppMethodBeat.i(50544);
    this.cVC = t("NewMd5", paramString, true);
    AppMethodBeat.o(50544);
    return this;
  }

  public final an fv(String paramString)
  {
    AppMethodBeat.i(50545);
    this.cVM = t("CDNIp", paramString, true);
    AppMethodBeat.o(50545);
    return this;
  }

  public final int getId()
  {
    return 16665;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.an
 * JD-Core Version:    0.6.2
 */