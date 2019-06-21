package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class v extends a
{
  private String cXU = "";
  private String cXV = "";
  public long cXW = 0L;
  public long cXX = 0L;
  public long cXY = 0L;
  public long cXZ = 0L;
  public long cYa = 0L;
  public long cYb = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77595);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cXU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYa);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYb);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77595);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77596);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("sessionid:").append(this.cXU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("userName:").append(this.cXV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("succeedStatus:").append(this.cXW);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("userStatus:").append(this.cXX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("showSucceedMethod:").append(this.cXY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("clickSucceedAction:").append(this.cXZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("watchMessageRecord:").append(this.cYa);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("sendMessageStatus:").append(this.cYb);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77596);
    return localObject;
  }

  public final v eQ(String paramString)
  {
    AppMethodBeat.i(77593);
    this.cXU = t("sessionid", paramString, true);
    AppMethodBeat.o(77593);
    return this;
  }

  public final v eR(String paramString)
  {
    AppMethodBeat.i(77594);
    this.cXV = t("userName", paramString, true);
    AppMethodBeat.o(77594);
    return this;
  }

  public final int getId()
  {
    return 15855;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.v
 * JD-Core Version:    0.6.2
 */