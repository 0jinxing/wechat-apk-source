package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class au extends a
{
  private long cYQ = 0L;
  private long cYZ = 0L;
  private long cZK = 0L;
  private String daj = "";
  private String dak = "";

  public final long FH()
  {
    return this.cYZ;
  }

  public final String Fj()
  {
    AppMethodBeat.i(108875);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYQ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dak);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108875);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108876);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("PreviewEnterScene:").append(this.cYQ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ProfileSource:").append(this.cZK);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EnterTime:").append(this.cYZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StoryOwnerUserName:").append(this.daj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StoryTid:").append(this.dak);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108876);
    return localObject;
  }

  public final au ce(long paramLong)
  {
    this.cYQ = paramLong;
    return this;
  }

  public final au cf(long paramLong)
  {
    this.cZK = paramLong;
    return this;
  }

  public final au cg(long paramLong)
  {
    this.cYZ = paramLong;
    return this;
  }

  public final au fF(String paramString)
  {
    AppMethodBeat.i(108873);
    this.daj = t("StoryOwnerUserName", paramString, true);
    AppMethodBeat.o(108873);
    return this;
  }

  public final au fG(String paramString)
  {
    AppMethodBeat.i(108874);
    this.dak = t("StoryTid", paramString, true);
    AppMethodBeat.o(108874);
    return this;
  }

  public final int getId()
  {
    return 16763;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.au
 * JD-Core Version:    0.6.2
 */