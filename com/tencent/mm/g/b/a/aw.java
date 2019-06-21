package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class aw extends a
{
  private long cYQ = 0L;
  private long cYZ = 0L;
  private String dap = "";
  private String daq = "";
  private long dar = 0L;
  private String das = "";
  private String dat = "";

  public final String FZ()
  {
    return this.dap;
  }

  public final String Fj()
  {
    AppMethodBeat.i(108880);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYQ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dap);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dar);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.das);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dat);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108880);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108881);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("EnterTime:").append(this.cYZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PreviewEnterScene:").append(this.cYQ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WaitPlayVideoList:").append(this.dap);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WaitPlayUinList:").append(this.daq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("index:").append(this.dar);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WaitPlayVideoList1:").append(this.das);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WaitPlayVideoList2:").append(this.dat);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108881);
    return localObject;
  }

  public final String Ga()
  {
    return this.das;
  }

  public final String Gb()
  {
    return this.dat;
  }

  public final aw ch(long paramLong)
  {
    this.cYZ = paramLong;
    return this;
  }

  public final aw ci(long paramLong)
  {
    this.cYQ = paramLong;
    return this;
  }

  public final aw cj(long paramLong)
  {
    this.dar = paramLong;
    return this;
  }

  public final aw fK(String paramString)
  {
    AppMethodBeat.i(108877);
    this.dap = t("WaitPlayVideoList", paramString, true);
    AppMethodBeat.o(108877);
    return this;
  }

  public final aw fL(String paramString)
  {
    AppMethodBeat.i(108878);
    this.das = t("WaitPlayVideoList1", paramString, true);
    AppMethodBeat.o(108878);
    return this;
  }

  public final aw fM(String paramString)
  {
    AppMethodBeat.i(108879);
    this.dat = t("WaitPlayVideoList2", paramString, true);
    AppMethodBeat.o(108879);
    return this;
  }

  public final int getId()
  {
    return 16842;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.aw
 * JD-Core Version:    0.6.2
 */