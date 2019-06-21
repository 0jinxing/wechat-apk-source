package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import java.util.LinkedList;

final class UnfamiliarContactDetailUI$7$1
  implements DialogInterface.OnClickListener
{
  UnfamiliarContactDetailUI$7$1(UnfamiliarContactDetailUI.7 param7)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127640);
    if (UnfamiliarContactDetailUI.h(this.qqa.qpX) != null)
    {
      g.RQ();
      g.RO().eJo.a(681, UnfamiliarContactDetailUI.h(this.qqa.qpX));
      paramDialogInterface = UnfamiliarContactDetailUI.h(this.qqa.qpX);
      paramDialogInterface.index = 0;
      paramDialogInterface.oqN = 0;
      paramDialogInterface.qqn = 0;
      paramDialogInterface.qqo.clear();
      paramDialogInterface.qqp.clear();
      d.xDG.remove(paramDialogInterface);
      if (paramDialogInterface.qql != null)
        paramDialogInterface.qql.cjq();
      d.post(paramDialogInterface, "delete_contact_task");
    }
    UnfamiliarContactDetailUI.b(this.qqa.qpX, false);
    AppMethodBeat.o(127640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.7.1
 * JD-Core Version:    0.6.2
 */