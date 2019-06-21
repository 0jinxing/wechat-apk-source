package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class m extends a
{
  public long cVU = 0L;
  public long cVV = 0L;
  public long cVW = 0L;
  public long cVX = 0L;
  public long cVY = 0L;
  public long cVZ = 0L;
  private String cWa = "";
  public long cWb = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77585);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWa);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWb);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77585);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77586);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ActionType:").append(this.cVU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Content:").append(this.cVV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ChangeAmountTimes:").append(this.cVW);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AddSelfieEmoticonTimes:").append(this.cVX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AddCustonEmoticonTimes:").append(this.cVY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AddSelfieEmoticonFormBoardTimes:").append(this.cVZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EmoticonMd5:").append(this.cWa);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AddShopEmoticonTimes:").append(this.cWb);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77586);
    return localObject;
  }

  public final m eE(String paramString)
  {
    AppMethodBeat.i(77584);
    this.cWa = t("EmoticonMd5", paramString, true);
    AppMethodBeat.o(77584);
    return this;
  }

  public final int getId()
  {
    return 16724;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.m
 * JD-Core Version:    0.6.2
 */