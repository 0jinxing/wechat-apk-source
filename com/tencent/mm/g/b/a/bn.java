package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bn extends a
{
  public long dcT = 0L;
  public long dcU = 0L;
  public long dcV = 0L;
  public long dcW = 0L;
  public long dcX = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128641);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dcT);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcX);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(128641);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(128642);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("AllPackageSize:").append(this.dcT);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AllPackageClientStoragePercent:").append(this.dcU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClientStorageFreePercent:").append(this.dcV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AbtestStatus:").append(this.dcW);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WeappCountThatHasPackage:").append(this.dcX);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128642);
    return localObject;
  }

  public final int getId()
  {
    return 15401;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bn
 * JD-Core Version:    0.6.2
 */