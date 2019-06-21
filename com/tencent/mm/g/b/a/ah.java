package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class ah extends a
{
  private String cWo = "";
  private long cYI = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(35566);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cWo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYI);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(35566);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(35567);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("SessionId:").append(this.cWo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClickTimeStampMs:").append(this.cYI);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(35567);
    return localObject;
  }

  public final ah Fs()
  {
    AppMethodBeat.i(35565);
    this.cYI = bo.anU();
    super.aj("ClickTimeStampMs", this.cYI);
    AppMethodBeat.o(35565);
    return this;
  }

  public final ah fk(String paramString)
  {
    AppMethodBeat.i(35564);
    this.cWo = t("SessionId", paramString, true);
    AppMethodBeat.o(35564);
    return this;
  }

  public final int getId()
  {
    return 15988;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ah
 * JD-Core Version:    0.6.2
 */