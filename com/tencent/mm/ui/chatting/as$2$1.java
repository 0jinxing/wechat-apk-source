package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.pluginsdk.model.app.aj;
import java.util.Map;

final class as$2$1
  implements aj
{
  as$2$1(as.2 param2, ShowMessageFromWX.Req paramReq)
  {
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(31087);
    if (paramBoolean)
      as.b(this.yMV.yMU).put(this.vbU.transaction, this.vbU);
    if (this.yMV.yMT != null)
      this.yMV.yMT.dR(paramBoolean);
    AppMethodBeat.o(31087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.as.2.1
 * JD-Core Version:    0.6.2
 */