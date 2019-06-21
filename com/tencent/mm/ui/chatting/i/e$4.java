package com.tencent.mm.ui.chatting.i;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.protocal.protobuf.abf;
import java.util.LinkedList;
import java.util.List;

final class e$4
  implements DialogInterface.OnClickListener
{
  e$4(e parame, cl paramcl, List paramList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32561);
    if ((this.yOV.cvA.type == 14) && (this.yOV.cvA.cvC.wiv.size() == 0))
      AppMethodBeat.o(32561);
    while (true)
    {
      return;
      e.a(this.yZo, this.yOV);
      e.fj(this.ibp);
      AppMethodBeat.o(32561);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.4
 * JD-Core Version:    0.6.2
 */