package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.ui.MMActivity;

final class c$2$1
  implements DialogInterface.OnClickListener
{
  c$2$1(c.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23457);
    paramDialogInterface = this.pmL.pmK;
    String str = paramDialogInterface.ehM.field_username;
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XO().Ra(str);
    aw.ZK();
    com.tencent.mm.model.c.XL().c(new d(str, ((cy)localObject).field_msgSvrId));
    paramDialogInterface.isDeleteCancel = false;
    localObject = paramDialogInterface.crP;
    paramDialogInterface.crP.getString(2131297061);
    paramDialogInterface.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject, paramDialogInterface.crP.getString(2131297086), true, new c.9(paramDialogInterface));
    bf.a(str, new c.10(paramDialogInterface));
    AppMethodBeat.o(23457);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.2.1
 * JD-Core Version:    0.6.2
 */