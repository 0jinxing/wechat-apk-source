package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class aj extends a
{
  private String cYP = "";
  public long cYQ = 0L;
  public long cYR = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(108837);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYP);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYQ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYR);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108837);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108838);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("UserName:").append(this.cYP);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PreviewEnterScene:").append(this.cYQ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasUnreadStoryTips:").append(this.cYR);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108838);
    return localObject;
  }

  public final aj fl(String paramString)
  {
    AppMethodBeat.i(108836);
    this.cYP = t("UserName", paramString, true);
    AppMethodBeat.o(108836);
    return this;
  }

  public final int getId()
  {
    return 16656;
  }

  public final String getUserName()
  {
    return this.cYP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.aj
 * JD-Core Version:    0.6.2
 */