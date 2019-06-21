package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends a
{
  public long cTr = 0L;
  private long cTs = 0L;
  public long cTt = 0L;
  public long cTu = 0L;
  public long cTv = 0L;
  public long cTw = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(15821);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cTr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTt);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTw);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(15821);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(15822);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("FirstInputTimeStampMs:").append(this.cTr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("LastInputTimeStampMs:").append(this.cTs);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SendStampMs:").append(this.cTt);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClickCount:").append(this.cTu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TextLength:").append(this.cTv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EmojiCount:").append(this.cTw);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(15822);
    return localObject;
  }

  public final b Fl()
  {
    AppMethodBeat.i(15818);
    b localb = aM(bo.anU());
    AppMethodBeat.o(15818);
    return localb;
  }

  public final b Fm()
  {
    AppMethodBeat.i(15820);
    b localb = aN(bo.anU());
    AppMethodBeat.o(15820);
    return localb;
  }

  public final b aM(long paramLong)
  {
    AppMethodBeat.i(15817);
    this.cTr = paramLong;
    super.aj("FirstInputTimeStampMs", this.cTr);
    AppMethodBeat.o(15817);
    return this;
  }

  public final b aN(long paramLong)
  {
    AppMethodBeat.i(15819);
    this.cTs = paramLong;
    super.aj("LastInputTimeStampMs", this.cTs);
    AppMethodBeat.o(15819);
    return this;
  }

  public final int getId()
  {
    return 16113;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.b
 * JD-Core Version:    0.6.2
 */