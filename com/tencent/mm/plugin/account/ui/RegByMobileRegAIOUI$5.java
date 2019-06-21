package com.tencent.mm.plugin.account.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;

final class RegByMobileRegAIOUI$5
  implements al.a
{
  String ekv;

  RegByMobileRegAIOUI$5(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(125343);
    this.ekv = i.getPhoneNum(this.gGd, RegByMobileRegAIOUI.d(this.gGd));
    AppMethodBeat.o(125343);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(125342);
    if (bo.isNullOrNil(RegByMobileRegAIOUI.c(this.gGd).getText().trim()))
    {
      String str = av.Ps(this.ekv);
      if ((!bo.isNullOrNil(this.ekv)) && ("+86".equals(str)))
        RegByMobileRegAIOUI.c(this.gGd).setText(this.ekv.substring(3));
    }
    AppMethodBeat.o(125342);
    return true;
  }

  public final String toString()
  {
    AppMethodBeat.i(125344);
    String str = super.toString() + "|initView1";
    AppMethodBeat.o(125344);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.5
 * JD-Core Version:    0.6.2
 */