package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class aq extends a
{
  public long cZI = 0L;
  private String cZJ = "";

  public final String Fj()
  {
    AppMethodBeat.i(108860);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cZI);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZJ);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108860);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108861);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("PageType:").append(this.cZI);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StoryId:").append(this.cZJ);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108861);
    return localObject;
  }

  public final aq bE(long paramLong)
  {
    this.cZI = paramLong;
    return this;
  }

  public final aq fz(String paramString)
  {
    AppMethodBeat.i(108859);
    this.cZJ = t("StoryId", paramString, true);
    AppMethodBeat.o(108859);
    return this;
  }

  public final int getId()
  {
    return 16657;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.aq
 * JD-Core Version:    0.6.2
 */