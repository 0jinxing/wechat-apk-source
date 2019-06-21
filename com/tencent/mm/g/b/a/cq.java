package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cq extends a
{
  private String cYD = "";
  private String cYv = "";
  private long dhn = 0L;
  private long dho = 0L;
  private int dhp = 0;
  private String dhq = "";
  private String dhr = "";
  private String dhs = "";
  private String dht = "";
  private long dhu = 0L;
  private String dhv = "";

  public final String Fj()
  {
    AppMethodBeat.i(128916);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dho);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dht);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYD);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(128916);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(128917);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("appid:").append(this.cYv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appversion:").append(this.dhn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appstate:").append(this.dho);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("errorType:").append(this.dhp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("errorName:").append(this.dhq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("errorMessage:").append(this.dhr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("errorStack:").append(this.dhs);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("sdkversion:").append(this.dht);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("apptype:").append(this.dhu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("route:").append(this.dhv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("query:").append(this.cYD);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128917);
    return localObject;
  }

  public final cq Hj()
  {
    this.dhp = 9;
    return this;
  }

  public final cq eA(long paramLong)
  {
    this.dho = paramLong;
    return this;
  }

  public final cq eB(long paramLong)
  {
    this.dhu = paramLong;
    return this;
  }

  public final cq ez(long paramLong)
  {
    this.dhn = paramLong;
    return this;
  }

  public final int getId()
  {
    return 13582;
  }

  public final cq hA(String paramString)
  {
    AppMethodBeat.i(128913);
    this.dht = t("sdkversion", paramString, true);
    AppMethodBeat.o(128913);
    return this;
  }

  public final cq hB(String paramString)
  {
    AppMethodBeat.i(128914);
    this.dhv = t("route", paramString, true);
    AppMethodBeat.o(128914);
    return this;
  }

  public final cq hC(String paramString)
  {
    AppMethodBeat.i(128915);
    this.cYD = t("query", paramString, true);
    AppMethodBeat.o(128915);
    return this;
  }

  public final cq hx(String paramString)
  {
    AppMethodBeat.i(128910);
    this.cYv = t("appid", paramString, true);
    AppMethodBeat.o(128910);
    return this;
  }

  public final cq hy(String paramString)
  {
    AppMethodBeat.i(128911);
    this.dhr = t("errorMessage", paramString, true);
    AppMethodBeat.o(128911);
    return this;
  }

  public final cq hz(String paramString)
  {
    AppMethodBeat.i(128912);
    this.dhs = t("errorStack", paramString, true);
    AppMethodBeat.o(128912);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cq
 * JD-Core Version:    0.6.2
 */