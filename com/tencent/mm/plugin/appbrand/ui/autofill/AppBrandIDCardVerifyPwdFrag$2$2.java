package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.gc;
import com.tencent.mm.protocal.protobuf.gd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.LinkedList;

final class AppBrandIDCardVerifyPwdFrag$2$2
  implements n.d
{
  AppBrandIDCardVerifyPwdFrag$2$2(AppBrandIDCardVerifyPwdFrag.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(133251);
    gc localgc = (gc)AppBrandIDCardVerifyPwdFrag.b(this.iKq.iKp).vIf.get(paramMenuItem.getItemId());
    if (localgc == null)
    {
      ab.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "not find phone_id, menuItem id :%d", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
      AppMethodBeat.o(133251);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "select menuItem id:%d, phone_id:%s, show_phone:%s, bank_type:%s", new Object[] { Integer.valueOf(paramMenuItem.getItemId()), localgc.vId, localgc.vIe, localgc.pbn });
      AppBrandIDCardVerifyPwdFrag.a(this.iKq.iKp, localgc);
      AppBrandIDCardVerifyPwdFrag.c(this.iKq.iKp).setText(localgc.vIe);
      AppMethodBeat.o(133251);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.2.2
 * JD-Core Version:    0.6.2
 */