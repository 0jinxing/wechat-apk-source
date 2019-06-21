package com.tencent.mm.ui.bizchat;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.b;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.bf.a;

final class BizChatroomInfoUI$2
  implements bf.a
{
  BizChatroomInfoUI$2(BizChatroomInfoUI paramBizChatroomInfoUI, ProgressDialog paramProgressDialog)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(30197);
    boolean bool = BizChatroomInfoUI.f(this.yFp);
    AppMethodBeat.o(30197);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(30198);
    if (this.eiD != null)
    {
      z.aeU().fw(BizChatroomInfoUI.g(this.yFp));
      z.aeT().fw(BizChatroomInfoUI.g(this.yFp));
      this.eiD.dismiss();
    }
    AppMethodBeat.o(30198);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.2
 * JD-Core Version:    0.6.2
 */