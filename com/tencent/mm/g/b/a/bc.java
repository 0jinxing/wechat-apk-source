package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class bc extends a
{
  private String cVA;
  private int cVB;
  private String cVC;
  private String cVM;
  private long cVN;
  private long cYk;
  private String daT;
  private String daU;
  private String daV;
  private String daW;
  private long daX;
  private long daY;
  private long daZ;
  private long day;
  private long daz;
  private long dba;
  private long dbb;
  private long dbc;
  private long dbd;
  private int dbe;
  private long dbf;
  private long dbg;
  private long dbh;
  private long dbi;
  private long dbj;
  private long dbk;
  private long dbl;

  public bc()
  {
    this.daT = "";
    this.daU = "";
    this.cVB = 0;
    this.daV = "";
    this.cVC = "";
    this.daW = "";
    this.day = 0L;
    this.daz = 0L;
    this.daX = 0L;
    this.daY = 0L;
    this.daZ = 0L;
    this.dba = 0L;
    this.dbb = 0L;
    this.dbc = 0L;
    this.dbd = 0L;
    this.dbe = 0;
    this.dbf = 0L;
    this.dbg = 0L;
    this.dbh = 0L;
    this.dbi = 0L;
    this.dbj = 0L;
    this.dbk = 0L;
    this.dbl = 0L;
    this.cYk = 0L;
    this.cVM = "";
    this.cVN = 0L;
    this.cVA = "";
  }

  public bc(String paramString)
  {
    AppMethodBeat.i(50548);
    this.daT = "";
    this.daU = "";
    this.cVB = 0;
    this.daV = "";
    this.cVC = "";
    this.daW = "";
    this.day = 0L;
    this.daz = 0L;
    this.daX = 0L;
    this.daY = 0L;
    this.daZ = 0L;
    this.dba = 0L;
    this.dbb = 0L;
    this.dbc = 0L;
    this.dbd = 0L;
    this.dbe = 0;
    this.dbf = 0L;
    this.dbg = 0L;
    this.dbh = 0L;
    this.dbi = 0L;
    this.dbj = 0L;
    this.dbk = 0L;
    this.dbl = 0L;
    this.cYk = 0L;
    this.cVM = "";
    this.cVN = 0L;
    this.cVA = "";
    String[] arrayOfString;
    if (paramString != null)
    {
      arrayOfString = paramString.split(",");
      if (arrayOfString != null)
      {
        if (arrayOfString.length >= 27)
          break label542;
        paramString = new String[27];
        Arrays.fill(paramString, 0, 27, "");
        System.arraycopy(arrayOfString, 0, paramString, 0, arrayOfString.length);
      }
    }
    while (true)
    {
      this.daT = t("ToUser", paramString[0], true);
      this.daU = t("MsgSource", paramString[1], true);
      this.cVB = bo.getInt(paramString[2], 0);
      this.daV = t("FieldId", paramString[3], true);
      this.cVC = t("NewMd5", paramString[4], true);
      this.daW = t("SnsInfoId", paramString[5], true);
      this.day = bo.getLong(paramString[6], 0L);
      this.daz = bo.getLong(paramString[7], 0L);
      this.daX = bo.getLong(paramString[8], 0L);
      this.daY = bo.getLong(paramString[9], 0L);
      this.daZ = bo.getLong(paramString[10], 0L);
      this.dba = bo.getLong(paramString[11], 0L);
      this.dbb = bo.getLong(paramString[12], 0L);
      this.dbc = bo.getLong(paramString[13], 0L);
      this.dbd = bo.getLong(paramString[14], 0L);
      this.dbe = bo.getInt(paramString[15], 0);
      this.dbf = bo.getLong(paramString[16], 0L);
      this.dbg = bo.getLong(paramString[17], 0L);
      this.dbh = bo.getLong(paramString[18], 0L);
      this.dbi = bo.getLong(paramString[19], 0L);
      this.dbj = bo.getLong(paramString[20], 0L);
      this.dbk = bo.getLong(paramString[21], 0L);
      this.dbl = bo.getLong(paramString[22], 0L);
      this.cYk = bo.getLong(paramString[23], 0L);
      this.cVM = t("CDNIp", paramString[24], true);
      this.cVN = bo.getLong(paramString[25], 0L);
      this.cVA = t("SnsUrl", paramString[26], true);
      AppMethodBeat.o(50548);
      return;
      label542: paramString = arrayOfString;
    }
  }

  public final String Fj()
  {
    AppMethodBeat.i(50549);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.daT);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.day);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dba);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbd);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbe);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbi);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVA);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(50549);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(50550);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ToUser:").append(this.daT);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MsgSource:").append(this.daU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetType:").append(this.cVB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FieldId:").append(this.daV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NewMd5:").append(this.cVC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SnsInfoId:").append(this.daW);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UploadStartTime:").append(this.day);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UploadEndTime:").append(this.daz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalSize:").append(this.daX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalDuration:").append(this.daY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalVideoBitrate:").append(this.daZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalAudioBitrate:").append(this.dba);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalFps:").append(this.dbb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalWidth:").append(this.dbc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalHeight:").append(this.dbd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpStatus:").append(this.dbe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpSize:").append(this.dbf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpDuration:").append(this.dbg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpVideoBitrate:").append(this.dbh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpAudioiBitrate:").append(this.dbi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpFps:").append(this.dbj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpWidth:").append(this.dbk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CpHeight:").append(this.dbl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SendScene:").append(this.cYk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CDNIp:").append(this.cVM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OriginalAudioChannel:").append(this.cVN);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SnsUrl:").append(this.cVA);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(50550);
    return localObject;
  }

  public final int getId()
  {
    return 13794;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bc
 * JD-Core Version:    0.6.2
 */