package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.h;

final class e$1
  implements DialogInterface.OnClickListener
{
  e$1(e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23502);
    paramDialogInterface = this.pmR;
    paramDialogInterface.isDeleteCancel = false;
    Context localContext = paramDialogInterface.context;
    paramDialogInterface.context.getString(2131297061);
    paramDialogInterface.tipDialog = h.b(localContext, paramDialogInterface.context.getString(2131297086), true, new e.2(paramDialogInterface));
    bf.a("fmessage", new e.3(paramDialogInterface));
    aw.ZK();
    c.XR().aoX("fmessage");
    AppMethodBeat.o(23502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.e.1
 * JD-Core Version:    0.6.2
 */