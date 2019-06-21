package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class i extends a
{
  public int cVl = 0;
  public int cVm = 0;
  public int cVn = 0;
  private String cVo;
  private String cVp;
  private String cVq;
  private String cVr;
  private String cVs;
  private String cVt;
  private String cVu;
  private String cVv;

  public final String Fj()
  {
    AppMethodBeat.i(40569);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVt);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVv);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(40569);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(40570);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("CgiCmd:").append(this.cVl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ErrType:").append(this.cVm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ErrCode:").append(this.cVn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptKey:").append(this.cVo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptUserinfo:").append(this.cVp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptCellinfoLength:").append(this.cVq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptCellinfo_01:").append(this.cVr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptCellinfo_02:").append(this.cVs);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptCellinfo_03:").append(this.cVt);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptCellinfo_04:").append(this.cVu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EncryptCellinfo_05:").append(this.cVv);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(40570);
    return localObject;
  }

  public final i eA(String paramString)
  {
    AppMethodBeat.i(40565);
    this.cVs = t("EncryptCellinfo_02", paramString, true);
    AppMethodBeat.o(40565);
    return this;
  }

  public final i eB(String paramString)
  {
    AppMethodBeat.i(40566);
    this.cVt = t("EncryptCellinfo_03", paramString, true);
    AppMethodBeat.o(40566);
    return this;
  }

  public final i eC(String paramString)
  {
    AppMethodBeat.i(40567);
    this.cVu = t("EncryptCellinfo_04", paramString, true);
    AppMethodBeat.o(40567);
    return this;
  }

  public final i eD(String paramString)
  {
    AppMethodBeat.i(40568);
    this.cVv = t("EncryptCellinfo_05", paramString, true);
    AppMethodBeat.o(40568);
    return this;
  }

  public final i ew(String paramString)
  {
    AppMethodBeat.i(40561);
    this.cVo = t("EncryptKey", paramString, true);
    AppMethodBeat.o(40561);
    return this;
  }

  public final i ex(String paramString)
  {
    AppMethodBeat.i(40562);
    this.cVp = t("EncryptUserinfo", paramString, true);
    AppMethodBeat.o(40562);
    return this;
  }

  public final i ey(String paramString)
  {
    AppMethodBeat.i(40563);
    this.cVq = t("EncryptCellinfoLength", paramString, true);
    AppMethodBeat.o(40563);
    return this;
  }

  public final i ez(String paramString)
  {
    AppMethodBeat.i(40564);
    this.cVr = t("EncryptCellinfo_01", paramString, true);
    AppMethodBeat.o(40564);
    return this;
  }

  public final int getId()
  {
    return 15548;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.i
 * JD-Core Version:    0.6.2
 */