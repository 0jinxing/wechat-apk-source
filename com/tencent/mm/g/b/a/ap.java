package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ap extends a
{
  private String cWo = "";
  private int cZA = 0;
  private int cZB = 0;
  private int cZC = 0;
  private String cZD = "";
  private int cZE = 0;
  private int cZF = 0;
  private String cZG = "";
  private long cZH = 0L;
  private int cZz = 0;

  public final int FB()
  {
    return this.cZz;
  }

  public final int FC()
  {
    return this.cZC;
  }

  public final int FD()
  {
    return this.cZF;
  }

  public final String Fj()
  {
    AppMethodBeat.i(108857);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cWo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZH);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108857);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108858);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("SessionId:").append(this.cWo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeViewId:").append(this.cZz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeOrder:").append(this.cZA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeNewUinCount:").append(this.cZB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeNewFavorUinCount:").append(this.cZC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeNewUinList:").append(this.cZD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeBeforeUinCount:").append(this.cZE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeBeforeFavorUinCount:").append(this.cZF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeBeforeUinList:").append(this.cZG);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("InteractiveUserCount:").append(this.cZH);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108858);
    return localObject;
  }

  public final ap bD(long paramLong)
  {
    this.cZH = paramLong;
    return this;
  }

  public final ap fw(String paramString)
  {
    AppMethodBeat.i(108854);
    this.cWo = t("SessionId", paramString, true);
    AppMethodBeat.o(108854);
    return this;
  }

  public final ap fx(String paramString)
  {
    AppMethodBeat.i(108855);
    this.cZD = t("ExposeNewUinList", paramString, true);
    AppMethodBeat.o(108855);
    return this;
  }

  public final ap fy(String paramString)
  {
    AppMethodBeat.i(108856);
    this.cZG = t("ExposeBeforeUinList", paramString, true);
    AppMethodBeat.o(108856);
    return this;
  }

  public final ap gJ(int paramInt)
  {
    this.cZz = paramInt;
    return this;
  }

  public final ap gK(int paramInt)
  {
    this.cZA = paramInt;
    return this;
  }

  public final ap gL(int paramInt)
  {
    this.cZB = paramInt;
    return this;
  }

  public final ap gM(int paramInt)
  {
    this.cZC = paramInt;
    return this;
  }

  public final ap gN(int paramInt)
  {
    this.cZE = paramInt;
    return this;
  }

  public final ap gO(int paramInt)
  {
    this.cZF = paramInt;
    return this;
  }

  public final int getId()
  {
    return 16887;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ap
 * JD-Core Version:    0.6.2
 */