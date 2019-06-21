package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bk extends a
{
  public long cVR = 0L;
  public long dco = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(80736);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dco);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(80736);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(80737);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CostTime:").append(this.dco);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(80737);
    return localObject;
  }

  public final int getId()
  {
    return 15509;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bk
 * JD-Core Version:    0.6.2
 */