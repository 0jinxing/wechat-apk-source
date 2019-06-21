package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.mc.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.MMEditText;

final class EditSignatureUI$1 extends c<mc>
{
  EditSignatureUI$1(EditSignatureUI paramEditSignatureUI)
  {
    AppMethodBeat.i(126942);
    this.xxI = mc.class.getName().hashCode();
    AppMethodBeat.o(126942);
  }

  private boolean a(mc parammc)
  {
    AppMethodBeat.i(126943);
    String str1 = parammc.cHU.cHV;
    String str2 = parammc.cHU.cHW;
    int i = parammc.cHU.ret;
    if ((i != 0) && (EditSignatureUI.a(this.qkL) != null))
    {
      h.b(this.qkL, str2, str1, true);
      if (EditSignatureUI.b(this.qkL) != null)
        ((j)g.K(j.class)).XL().d(EditSignatureUI.b(this.qkL));
    }
    while (true)
    {
      if (EditSignatureUI.d(this.qkL) != null)
        EditSignatureUI.d(this.qkL).dismiss();
      AppMethodBeat.o(126943);
      return true;
      if ((i == 0) && (EditSignatureUI.c(this.qkL)))
      {
        parammc = EditSignatureUI.a(this.qkL).getText().toString().trim();
        g.RP().Ry().set(12291, parammc);
        this.qkL.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI.1
 * JD-Core Version:    0.6.2
 */