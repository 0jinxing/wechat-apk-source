package com.tencent.mm.plugin.brandservice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.profile.b.d;

final class EnterpriseBizContactListView$a$3$1
  implements DialogInterface.OnCancelListener
{
  EnterpriseBizContactListView$a$3$1(EnterpriseBizContactListView.a.3 param3, d paramd)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13960);
    g.Rg().c(this.jMe);
    g.Rg().b(1394, this.jMf.jMd);
    AppMethodBeat.o(13960);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.a.3.1
 * JD-Core Version:    0.6.2
 */