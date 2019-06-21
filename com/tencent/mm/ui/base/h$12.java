package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

final class h$12
  implements DialogInterface.OnClickListener
{
  h$12(h.b paramb, MMEditText paramMMEditText, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(106415);
    boolean bool = true;
    if (this.tMW != null)
      bool = this.tMW.s(this.yty.getText().toString().trim());
    if (bool)
    {
      paramDialogInterface.dismiss();
      if ((this.val$context instanceof MMActivity))
        al.d(new h.12.1(this));
    }
    AppMethodBeat.o(106415);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.12
 * JD-Core Version:    0.6.2
 */