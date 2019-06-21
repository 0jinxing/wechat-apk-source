package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class j extends a
{
  private String cVA;
  private int cVB;
  private String cVC;
  private long cVD;
  private long cVE;
  private long cVF;
  private long cVG;
  private long cVH;
  private long cVI;
  private long cVJ;
  private long cVK;
  private long cVL;
  private String cVM;
  private long cVN;
  private long cVO;
  private long cVP;
  private String cVQ;
  private String cVw;
  private String cVx;
  private long cVy;
  private String cVz;

  public j()
  {
    this.cVw = "";
    this.cVx = "";
    this.cVy = 0L;
    this.cVz = "";
    this.cVA = "";
    this.cVB = 0;
    this.cVC = "";
    this.cVD = 0L;
    this.cVE = 0L;
    this.cVF = 0L;
    this.cVG = 0L;
    this.cVH = 0L;
    this.cVI = 0L;
    this.cVJ = 0L;
    this.cVK = 0L;
    this.cVL = 0L;
    this.cVM = "";
    this.cVN = 0L;
    this.cVO = 0L;
    this.cVP = 0L;
    this.cVQ = "";
  }

  public j(String paramString)
  {
    AppMethodBeat.i(50531);
    this.cVw = "";
    this.cVx = "";
    this.cVy = 0L;
    this.cVz = "";
    this.cVA = "";
    this.cVB = 0;
    this.cVC = "";
    this.cVD = 0L;
    this.cVE = 0L;
    this.cVF = 0L;
    this.cVG = 0L;
    this.cVH = 0L;
    this.cVI = 0L;
    this.cVJ = 0L;
    this.cVK = 0L;
    this.cVL = 0L;
    this.cVM = "";
    this.cVN = 0L;
    this.cVO = 0L;
    this.cVP = 0L;
    this.cVQ = "";
    String[] arrayOfString;
    if (paramString != null)
    {
      arrayOfString = paramString.split(",");
      if (arrayOfString != null)
      {
        if (arrayOfString.length >= 21)
          break label440;
        paramString = new String[21];
        Arrays.fill(paramString, 0, 21, "");
        System.arraycopy(arrayOfString, 0, paramString, 0, arrayOfString.length);
      }
    }
    while (true)
    {
      this.cVw = t("FromUser", paramString[0], true);
      this.cVx = t("Session", paramString[1], true);
      this.cVy = bo.getLong(paramString[2], 0L);
      this.cVz = t("FileId", paramString[3], true);
      this.cVA = t("SnsUrl", paramString[4], true);
      this.cVB = bo.getInt(paramString[5], 0);
      this.cVC = t("NewMd5", paramString[6], true);
      this.cVD = bo.getLong(paramString[7], 0L);
      this.cVE = bo.getLong(paramString[8], 0L);
      this.cVF = bo.getLong(paramString[9], 0L);
      this.cVG = bo.getLong(paramString[10], 0L);
      this.cVH = bo.getLong(paramString[11], 0L);
      this.cVI = bo.getLong(paramString[12], 0L);
      this.cVJ = bo.getLong(paramString[13], 0L);
      this.cVK = bo.getLong(paramString[14], 0L);
      this.cVL = bo.getLong(paramString[15], 0L);
      this.cVM = t("CDNIp", paramString[16], true);
      this.cVN = bo.getLong(paramString[17], 0L);
      this.cVO = bo.getLong(paramString[18], 0L);
      this.cVP = bo.getLong(paramString[19], 0L);
      this.cVQ = t("Publishid", paramString[20], true);
      AppMethodBeat.o(50531);
      return;
      label440: paramString = arrayOfString;
    }
  }

  public final String Fj()
  {
    AppMethodBeat.i(50532);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVB);
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
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVQ);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(50532);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(50533);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("FromUser:").append(this.cVw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Session:").append(this.cVx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ChatNum:").append(this.cVy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FileId:").append(this.cVz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SnsUrl:").append(this.cVA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetType:").append(this.cVB);
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
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Publishid:").append(this.cVQ);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(50533);
    return localObject;
  }

  public final int getId()
  {
    return 13795;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.j
 * JD-Core Version:    0.6.2
 */