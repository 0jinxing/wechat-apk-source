package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.a.d;
import com.tencent.mm.ui.base.h;

final class StartUnbindQQ$2$1
  implements DialogInterface.OnClickListener
{
  StartUnbindQQ$2$1(StartUnbindQQ.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13762);
    paramDialogInterface = new d("");
    g.Rg().a(paramDialogInterface, 0);
    StartUnbindQQ localStartUnbindQQ = this.gur.guq;
    paramDialogInterface = this.gur.guq;
    this.gur.guq.getString(2131297061);
    StartUnbindQQ.a(localStartUnbindQQ, h.b(paramDialogInterface, this.gur.guq.getString(2131303009), true, null));
    AppMethodBeat.o(13762);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ.2.1
 * JD-Core Version:    0.6.2
 */