package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bb extends a
{
  public long cVR = 0L;
  public long cVS = 0L;
  public long daS = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77607);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVS);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daS);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77607);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77608);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Action:").append(this.cVS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Status:").append(this.daS);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77608);
    return localObject;
  }

  public final int getId()
  {
    return 16440;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bb
 * JD-Core Version:    0.6.2
 */