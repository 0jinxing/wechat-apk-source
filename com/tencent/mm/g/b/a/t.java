package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class t extends a
{
  private String cXO = "";
  public long cXP = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77588);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cXO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXP);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77588);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77589);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("chatRoomUserName:").append(this.cXO);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("scene:").append(this.cXP);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77589);
    return localObject;
  }

  public final t eO(String paramString)
  {
    AppMethodBeat.i(77587);
    this.cXO = t("chatRoomUserName", paramString, true);
    AppMethodBeat.o(77587);
    return this;
  }

  public final int getId()
  {
    return 15848;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.t
 * JD-Core Version:    0.6.2
 */