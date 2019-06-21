package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.h;
import com.tencent.mm.aj.a.w;
import com.tencent.mm.aj.z;

final class BizChatFavUI$4
  implements DialogInterface.OnCancelListener
{
  BizChatFavUI$4(BizChatFavUI paramBizChatFavUI, w paramw)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30110);
    z.aeZ();
    h.f(this.yEu);
    AppMethodBeat.o(30110);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatFavUI.4
 * JD-Core Version:    0.6.2
 */