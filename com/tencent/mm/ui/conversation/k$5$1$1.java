package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.protocal.protobuf.che;
import java.io.File;

final class k$5$1$1
  implements DialogInterface.OnClickListener
{
  k$5$1$1(k.5.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34466);
    q.a(k.a(this.zuT.zuS.zuQ), new File(this.zuT.zuS.zuR.xga), null, false);
    h.pYm.a(614L, 50L, 1L, false);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(34466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.5.1.1
 * JD-Core Version:    0.6.2
 */