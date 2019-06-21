package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class r extends a
{
  public long cWV = 0L;
  public long cWW = 0L;
  public long cWX = 0L;
  public long cWY = 0L;
  public long cWZ = 0L;
  public long cXa = 0L;
  public long cXb = 0L;
  public long cXc = 0L;
  public long cXd = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(138450);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cWV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXa);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXd);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(138450);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(138451);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Source:").append(this.cWV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CaptureTime:").append(this.cWW);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Result:").append(this.cWX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UploadTime:").append(this.cWY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OCRTranslateTime:").append(this.cWZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TotalTime:").append(this.cXa);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ShowOriginCount:").append(this.cXb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasSaveResultImage:").append(this.cXc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasSaveOriginImage:").append(this.cXd);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(138451);
    return localObject;
  }

  public final int getId()
  {
    return 15435;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.r
 * JD-Core Version:    0.6.2
 */