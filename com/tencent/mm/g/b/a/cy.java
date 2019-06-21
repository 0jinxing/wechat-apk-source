package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cy extends a
{
  private String diw = "";
  private String dix = "";
  private String diy = "";

  public final String Fj()
  {
    AppMethodBeat.i(70625);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.diw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dix);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diy);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(70625);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(70626);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("WidgetAppid:").append(this.diw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SrcAppid:").append(this.dix);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DrawData:").append(this.diy);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(70626);
    return localObject;
  }

  public final int getId()
  {
    return 16358;
  }

  public final cy hX(String paramString)
  {
    AppMethodBeat.i(70622);
    this.diw = t("WidgetAppid", paramString, true);
    AppMethodBeat.o(70622);
    return this;
  }

  public final cy hY(String paramString)
  {
    AppMethodBeat.i(70623);
    this.dix = t("SrcAppid", paramString, true);
    AppMethodBeat.o(70623);
    return this;
  }

  public final cy hZ(String paramString)
  {
    AppMethodBeat.i(70624);
    this.diy = t("DrawData", paramString, true);
    AppMethodBeat.o(70624);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cy
 * JD-Core Version:    0.6.2
 */