package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ct extends a
{
  public long dig = 0L;
  public long dih = 0L;
  public long dii = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(73309);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dig);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dih);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dii);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(73309);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73310);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ExptId:").append(this.dig);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("GroupId:").append(this.dih);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExptSeq:").append(this.dii);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73310);
    return localObject;
  }

  public final int getId()
  {
    return 16909;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ct
 * JD-Core Version:    0.6.2
 */