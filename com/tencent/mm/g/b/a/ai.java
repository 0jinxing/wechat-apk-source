package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class ai extends a
{
  private long cVG;
  private long cVH;
  private String cVM;
  private long cVO;
  private long cVP;
  private long cXA;
  private long cXB;
  private long cXC;
  private int cXD;
  private int cXE;
  private long cXF;
  private int cXG;
  private String cXL;
  private int cXM;
  private long cXN;
  private long cXf;
  private long cXg;
  private long cXh;
  private long cXi;
  private long cXj;
  private long cXk;
  private long cXl;
  private long cXm;
  private long cXn;
  private long cXo;
  private long cXp;
  private int cXq;
  private long cXr;
  private long cXs;
  private long cXt;
  private long cXu;
  private int cXv;
  private long cXw;
  private long cXx;
  private long cXy;
  private long cXz;
  private String cYJ;
  private String cYK;
  private long cYL;
  private int cYM;
  private String cYN;
  private String cYO;

  public ai()
  {
    this.cYJ = "";
    this.cYK = "";
    this.cXf = 0L;
    this.cVG = 0L;
    this.cXg = 0L;
    this.cXh = 0L;
    this.cXi = 0L;
    this.cXj = 0L;
    this.cXk = 0L;
    this.cXl = 0L;
    this.cXm = 0L;
    this.cXn = 0L;
    this.cXo = 0L;
    this.cXp = 0L;
    this.cYL = 0L;
    this.cYM = 0;
    this.cXq = 0;
    this.cXr = 0L;
    this.cXs = 0L;
    this.cXt = 0L;
    this.cXu = 0L;
    this.cXv = 0;
    this.cXw = 0L;
    this.cXx = 0L;
    this.cXy = 0L;
    this.cXz = 0L;
    this.cXA = 0L;
    this.cXB = 0L;
    this.cXC = 0L;
    this.cXD = 0;
    this.cXE = 0;
    this.cXF = 0L;
    this.cXG = 0;
    this.cVH = 0L;
    this.cYN = "";
    this.cVM = "";
    this.cYO = "";
    this.cXL = "";
    this.cXM = 0;
    this.cXN = 0L;
    this.cVO = 0L;
    this.cVP = 0L;
  }

  public ai(String paramString)
  {
    AppMethodBeat.i(50540);
    this.cYJ = "";
    this.cYK = "";
    this.cXf = 0L;
    this.cVG = 0L;
    this.cXg = 0L;
    this.cXh = 0L;
    this.cXi = 0L;
    this.cXj = 0L;
    this.cXk = 0L;
    this.cXl = 0L;
    this.cXm = 0L;
    this.cXn = 0L;
    this.cXo = 0L;
    this.cXp = 0L;
    this.cYL = 0L;
    this.cYM = 0;
    this.cXq = 0;
    this.cXr = 0L;
    this.cXs = 0L;
    this.cXt = 0L;
    this.cXu = 0L;
    this.cXv = 0;
    this.cXw = 0L;
    this.cXx = 0L;
    this.cXy = 0L;
    this.cXz = 0L;
    this.cXA = 0L;
    this.cXB = 0L;
    this.cXC = 0L;
    this.cXD = 0;
    this.cXE = 0;
    this.cXF = 0L;
    this.cXG = 0;
    this.cVH = 0L;
    this.cYN = "";
    this.cVM = "";
    this.cYO = "";
    this.cXL = "";
    this.cXM = 0;
    this.cXN = 0L;
    this.cVO = 0L;
    this.cVP = 0L;
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 42)
          break label795;
        String[] arrayOfString = new String[42];
        Arrays.fill(arrayOfString, 0, 42, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label795: 
    while (true)
    {
      this.cYJ = t("SnsVideoUrl", paramString[0], true);
      this.cYK = t("SnsReserved1", paramString[1], true);
      this.cXf = bo.getLong(paramString[2], 0L);
      this.cVG = bo.getLong(paramString[3], 0L);
      this.cXg = bo.getLong(paramString[4], 0L);
      this.cXh = bo.getLong(paramString[5], 0L);
      this.cXi = bo.getLong(paramString[6], 0L);
      this.cXj = bo.getLong(paramString[7], 0L);
      this.cXk = bo.getLong(paramString[8], 0L);
      this.cXl = bo.getLong(paramString[9], 0L);
      this.cXm = bo.getLong(paramString[10], 0L);
      this.cXn = bo.getLong(paramString[11], 0L);
      this.cXo = bo.getLong(paramString[12], 0L);
      this.cXp = bo.getLong(paramString[13], 0L);
      this.cYL = bo.getLong(paramString[14], 0L);
      this.cYM = bo.getInt(paramString[15], 0);
      this.cXq = bo.getInt(paramString[16], 0);
      this.cXr = bo.getLong(paramString[17], 0L);
      this.cXs = bo.getLong(paramString[18], 0L);
      this.cXt = bo.getLong(paramString[19], 0L);
      this.cXu = bo.getLong(paramString[20], 0L);
      this.cXv = bo.getInt(paramString[21], 0);
      this.cXw = bo.getLong(paramString[22], 0L);
      this.cXx = bo.getLong(paramString[23], 0L);
      this.cXy = bo.getLong(paramString[24], 0L);
      this.cXz = bo.getLong(paramString[25], 0L);
      this.cXA = bo.getLong(paramString[26], 0L);
      this.cXB = bo.getLong(paramString[27], 0L);
      this.cXC = bo.getLong(paramString[28], 0L);
      this.cXD = bo.getInt(paramString[29], 0);
      this.cXE = bo.getInt(paramString[30], 0);
      this.cXF = bo.getLong(paramString[31], 0L);
      this.cXG = bo.getInt(paramString[32], 0);
      this.cVH = bo.getLong(paramString[33], 0L);
      this.cYN = t("postname", paramString[34], true);
      this.cVM = t("CDNIp", paramString[35], true);
      this.cYO = t("SnsPublishid", paramString[36], true);
      this.cXL = t("XClientIp", paramString[37], true);
      this.cXM = bo.getInt(paramString[38], 0);
      this.cXN = bo.getLong(paramString[39], 0L);
      this.cVO = bo.getLong(paramString[40], 0L);
      this.cVP = bo.getLong(paramString[41], 0L);
      AppMethodBeat.o(50540);
      return;
    }
  }

  public final String Fj()
  {
    AppMethodBeat.i(50541);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXi);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYL);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXt);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVH);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXL);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVP);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(50541);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(50542);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("SnsVideoUrl:").append(this.cYJ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SnsReserved1:").append(this.cYK);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FileLength:").append(this.cXf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoDuration:").append(this.cVG);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownloadLength:").append(this.cXg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PlayDuration:").append(this.cXh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FirstPlayWaitTime:").append(this.cXi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MoovWaitTime:").append(this.cXj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("BlockCount:").append(this.cXk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("RegainAvgTime:").append(this.cXl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetworkType:").append(this.cXm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownloadType:").append(this.cXn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StartDownloadTime:").append(this.cXo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EndDownloadTime:").append(this.cXp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ChatName:").append(this.cYL);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HttpStatusCode:").append(this.cYM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("RetCode:").append(this.cXq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EnterQueueTime:").append(this.cXr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FirstReqCostTime:").append(this.cXs);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FirstReqSize:").append(this.cXt);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FirstReqDownloadSize:").append(this.cXu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FirstReqCompleted:").append(this.cXv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AvgSpeed:").append(this.cXw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AvgConnectCost:").append(this.cXx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FirstConnectCostTime:").append(this.cXy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetConnectTimes:").append(this.cXz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MoovReqTimes:").append(this.cXA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MoovCostTime:").append(this.cXB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MoovSize:").append(this.cXC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MoovCompleted:").append(this.cXD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MoovFailReason:").append(this.cXE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UiStayTime:").append(this.cXF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PlayErrorCode:").append(this.cXG);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoBitrate:").append(this.cVH);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("postname:").append(this.cYN);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CDNIp:").append(this.cVM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SnsPublishid:").append(this.cYO);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("XClientIp:").append(this.cXL);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsCrossNet:").append(this.cXM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MoovPosition:").append(this.cXN);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HadPreloadSize:").append(this.cVO);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HadPreloadCompletion:").append(this.cVP);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(50542);
    return localObject;
  }

  public final int getId()
  {
    return 13790;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ai
 * JD-Core Version:    0.6.2
 */