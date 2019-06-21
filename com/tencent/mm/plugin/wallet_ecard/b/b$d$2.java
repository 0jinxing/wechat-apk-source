package com.tencent.mm.plugin.wallet_ecard.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_ecard.a.d;
import com.tencent.mm.protocal.protobuf.aur;
import com.tencent.mm.protocal.protobuf.bfx;
import com.tencent.mm.protocal.protobuf.wx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.i;

final class b$d$2
  implements DialogInterface.OnClickListener
{
  b$d$2(b.d paramd, EditText paramEditText, d paramd1, TextView paramTextView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48088);
    ab.i("MicroMsg.OpenECardProcess", "click verify btn");
    paramDialogInterface = this.tQt.getText().toString();
    if (paramDialogInterface.length() == 11)
    {
      this.tQs.Agm.nf(1985);
      bfx localbfx = (bfx)((com.tencent.mm.ai.b)this.tQu.ftl).fsG.fsP;
      paramDialogInterface = new d(b.b(this.tQs.tQp), localbfx.vLa, localbfx.wJK, paramDialogInterface, localbfx.pbn, b.m(this.tQs.tQp), true, 2, localbfx.wJN);
      this.tQs.Agm.a(paramDialogInterface, true, 1);
      AppMethodBeat.o(48088);
    }
    while (true)
    {
      return;
      paramDialogInterface = new aur();
      paramDialogInterface.wyP = new wx();
      paramDialogInterface.wyP.desc = this.tQs.hwd.getString(2131305881);
      paramDialogInterface.wyP.color = "#FA5151";
      paramDialogInterface.wyQ = new wx();
      paramDialogInterface.wyQ.desc = this.tQs.hwd.getString(2131305880);
      paramDialogInterface.wyQ.color = "#0C4F8E";
      this.tQs.a(paramDialogInterface, this.tQv);
      AppMethodBeat.o(48088);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.d.2
 * JD-Core Version:    0.6.2
 */