package com.tencent.mm.plugin.wenote.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

public final class q
  implements Serializable
{
  public boolean mgQ = false;
  public boolean uOr = false;
  public long uOs = -1L;
  public long uOt = -1L;
  public String uOu = "";
  public String uOv = "";
  public int uOw = 0;
  public int uOx = 0;

  public final String ddR()
  {
    AppMethodBeat.i(26684);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("topIsOpenFromSession=").append(this.uOr).append(" topLocalId=").append(this.uOs).append(" topMsgId=").append(this.uOt).append(" topTitle=").append(this.uOu).append(" topNoteXml=").append(this.uOv).append(" topLastPosition=").append(this.uOw).append(" topLastOffset=").append(this.uOx);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(26684);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.a.q
 * JD-Core Version:    0.6.2
 */