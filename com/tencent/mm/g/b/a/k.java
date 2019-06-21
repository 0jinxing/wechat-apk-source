package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class k extends a
{
  public long cVR = 0L;
  public long cVS = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(138603);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVS);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(138603);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(138604);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Action:").append(this.cVS);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(138604);
    return localObject;
  }

  public final int getId()
  {
    return 17055;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.k
 * JD-Core Version:    0.6.2
 */