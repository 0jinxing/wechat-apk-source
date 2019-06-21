package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PBool;

final class c$7
  implements DialogInterface.OnClickListener
{
  c$7(PBool paramPBool, Context paramContext, boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34161);
    this.zqU.value = true;
    c.c(this.val$context, this.zqX, this.ewn);
    if (this.zqY)
      h.pYm.e(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(4), this.ewn });
    AppMethodBeat.o(34161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c.7
 * JD-Core Version:    0.6.2
 */