package com.tencent.mm.plugin.account.bind.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bo;

final class BindMContactUI$2
  implements al.a
{
  String ekv;

  BindMContactUI$2(BindMContactUI paramBindMContactUI)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(13461);
    this.ekv = ((a)g.M(a.class)).getPhoneNum(this.grK, BindMContactUI.c(this.grK));
    AppMethodBeat.o(13461);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(13460);
    if (bo.isNullOrNil(BindMContactUI.b(this.grK).getText().trim()))
    {
      if (bo.isNullOrNil(this.ekv))
        break label87;
      BindMContactUI.b(this.grK).setText(this.ekv);
      BindMContactUI.b(this.grK).setSelection(this.ekv.length());
    }
    while (true)
    {
      AppMethodBeat.o(13460);
      return true;
      label87: BindMContactUI.b(this.grK).setText("");
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(13462);
    String str = super.toString() + "|initView";
    AppMethodBeat.o(13462);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactUI.2
 * JD-Core Version:    0.6.2
 */