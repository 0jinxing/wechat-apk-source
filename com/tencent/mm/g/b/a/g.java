package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class g extends a
{
  private String cVb = "";
  private String cVc = "";
  public int cVd = 0;

  public final String Fj()
  {
    AppMethodBeat.i(73280);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVd);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(73280);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73281);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ChatroomName:").append(this.cVb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExptScore:").append(this.cVc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExptFlag:").append(this.cVd);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73281);
    return localObject;
  }

  public final g es(String paramString)
  {
    AppMethodBeat.i(73278);
    this.cVb = t("ChatroomName", paramString, true);
    AppMethodBeat.o(73278);
    return this;
  }

  public final g et(String paramString)
  {
    AppMethodBeat.i(73279);
    this.cVc = t("ExptScore", paramString, true);
    AppMethodBeat.o(73279);
    return this;
  }

  public final int getId()
  {
    return 15459;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.g
 * JD-Core Version:    0.6.2
 */