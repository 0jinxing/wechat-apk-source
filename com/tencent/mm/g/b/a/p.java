package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class p extends a
{
  private String _ID;
  private long cVR;
  private long cWA;
  private String cWB;
  private String cWC;
  private long cWD;
  private long cWE;
  private String cWF;
  private String cWG;
  public long cWH;
  private long cWI;
  private long cWJ;
  private String cWK;
  private String cWL;
  private String cWM;
  private long cWN;
  private String cWO;
  private String cWP;
  private String cWQ;
  private long cWu;
  private long cWv;
  private long cWw;
  private long cWx;
  private long cWy;
  private long cWz;

  public p()
  {
    this._ID = "";
    this.cWu = 0L;
    this.cWv = 0L;
    this.cWw = 0L;
    this.cWx = 0L;
    this.cWy = 0L;
    this.cWz = 0L;
    this.cWA = 0L;
    this.cWB = "";
    this.cWC = "";
    this.cWD = 0L;
    this.cWE = 0L;
    this.cWF = "";
    this.cWG = "";
    this.cWH = 0L;
    this.cVR = 0L;
    this.cWI = 0L;
    this.cWJ = 0L;
    this.cWK = "";
    this.cWL = "";
    this.cWM = "";
    this.cWN = 0L;
    this.cWO = "";
    this.cWP = "";
    this.cWQ = "";
  }

  public p(String paramString)
  {
    AppMethodBeat.i(35556);
    this._ID = "";
    this.cWu = 0L;
    this.cWv = 0L;
    this.cWw = 0L;
    this.cWx = 0L;
    this.cWy = 0L;
    this.cWz = 0L;
    this.cWA = 0L;
    this.cWB = "";
    this.cWC = "";
    this.cWD = 0L;
    this.cWE = 0L;
    this.cWF = "";
    this.cWG = "";
    this.cWH = 0L;
    this.cVR = 0L;
    this.cWI = 0L;
    this.cWJ = 0L;
    this.cWK = "";
    this.cWL = "";
    this.cWM = "";
    this.cWN = 0L;
    this.cWO = "";
    this.cWP = "";
    this.cWQ = "";
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 25)
          break label520;
        String[] arrayOfString = new String[25];
        Arrays.fill(arrayOfString, 0, 25, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label520: 
    while (true)
    {
      this._ID = t("ID", paramString[0], true);
      this.cWu = bo.getLong(paramString[1], 0L);
      this.cWv = bo.getLong(paramString[2], 0L);
      this.cWw = bo.getLong(paramString[3], 0L);
      this.cWx = bo.getLong(paramString[4], 0L);
      this.cWy = bo.getLong(paramString[5], 0L);
      this.cWz = bo.getLong(paramString[6], 0L);
      this.cWA = bo.getLong(paramString[7], 0L);
      this.cWB = t("FNumber", paramString[8], true);
      this.cWC = t("ExposureTime", paramString[9], true);
      this.cWD = bo.getLong(paramString[10], 0L);
      this.cWE = bo.getLong(paramString[11], 0L);
      this.cWF = t("LensModel", paramString[12], true);
      this.cWG = t("CreatTime", paramString[13], true);
      this.cWH = bo.getLong(paramString[14], 0L);
      this.cVR = bo.getLong(paramString[15], 0L);
      this.cWI = bo.getLong(paramString[16], 0L);
      this.cWJ = bo.getLong(paramString[17], 0L);
      this.cWK = t("make", paramString[18], true);
      this.cWL = t("software", paramString[19], true);
      this.cWM = t("fileExt", paramString[20], true);
      this.cWN = bo.getLong(paramString[21], 0L);
      this.cWO = t("YCbCrSubSampling", paramString[22], true);
      this.cWP = t("md5", paramString[23], true);
      eM(paramString[24]);
      AppMethodBeat.o(35556);
      return;
    }
  }

  public final String Fj()
  {
    AppMethodBeat.i(35558);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this._ID);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWH);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWI);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWL);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWP);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWQ);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(35558);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(35559);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ID:").append(this._ID);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MediaType:").append(this.cWu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginWidth:").append(this.cWv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginHeight:").append(this.cWw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CompressedWidth:").append(this.cWx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CompressedHeight:").append(this.cWy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginSize:").append(this.cWz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CompressedSize:").append(this.cWA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FNumber:").append(this.cWB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposureTime:").append(this.cWC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ISO:").append(this.cWD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Flash:").append(this.cWE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("LensModel:").append(this.cWF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CreatTime:").append(this.cWG);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsFromWeChat:").append(this.cWH);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("sceneType:").append(this.cWI);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("fileSource:").append(this.cWJ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("make:").append(this.cWK);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("software:").append(this.cWL);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("fileExt:").append(this.cWM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("faceCount:").append(this.cWN);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("YCbCrSubSampling:").append(this.cWO);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("md5:").append(this.cWP);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("publishId:").append(this.cWQ);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(35559);
    return localObject;
  }

  public final p eM(String paramString)
  {
    AppMethodBeat.i(35557);
    this.cWQ = t("publishId", paramString, true);
    AppMethodBeat.o(35557);
    return this;
  }

  public final int getId()
  {
    return 16585;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.p
 * JD-Core Version:    0.6.2
 */