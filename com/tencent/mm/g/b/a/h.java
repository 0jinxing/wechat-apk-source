package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class h extends a
{
  private String cVb = "";
  public int cVe = 0;
  public long cVf = 0L;
  public long cVg = 0L;
  public long cVh = 0L;
  private long cVi = 0L;
  public long cVj = 0L;
  private String cVk = "";

  public final String Fj()
  {
    AppMethodBeat.i(73285);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVe);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVi);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVk);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(73285);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73286);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ChatroomName:").append(this.cVb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ChatroomMute:").append(this.cVe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UnreadCount:").append(this.cVf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DisRedDotCount:").append(this.cVg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EnterCount:").append(this.cVh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StayTimeMs:").append(this.cVi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SendCount:").append(this.cVj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Score:").append(this.cVk);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73286);
    return localObject;
  }

  public final h aO(long paramLong)
  {
    AppMethodBeat.i(73283);
    this.cVi = paramLong;
    super.ai("StayTimeMs", this.cVi);
    AppMethodBeat.o(73283);
    return this;
  }

  public final h eu(String paramString)
  {
    AppMethodBeat.i(73282);
    this.cVb = t("ChatroomName", paramString, true);
    AppMethodBeat.o(73282);
    return this;
  }

  public final h ev(String paramString)
  {
    AppMethodBeat.i(73284);
    this.cVk = t("Score", paramString, true);
    AppMethodBeat.o(73284);
    return this;
  }

  public final int getId()
  {
    return 15460;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.h
 * JD-Core Version:    0.6.2
 */