package com.tencent.mm.plugin.appbrand.ui.autofill;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.gc;
import com.tencent.mm.protocal.protobuf.gd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.LinkedList;

final class AppBrandIDCardVerifyPwdFrag$2$1
  implements n.c
{
  AppBrandIDCardVerifyPwdFrag$2$1(AppBrandIDCardVerifyPwdFrag.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(133250);
    ab.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_list.size %d", new Object[] { Integer.valueOf(AppBrandIDCardVerifyPwdFrag.b(this.iKq.iKp).vIf.size()) });
    Iterator localIterator = AppBrandIDCardVerifyPwdFrag.b(this.iKq.iKp).vIf.iterator();
    while (localIterator.hasNext())
    {
      gc localgc = (gc)localIterator.next();
      if ((bo.isNullOrNil(localgc.vId)) || (bo.isNullOrNil(localgc.vIe)))
        ab.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_id or show_phone is empty, continue");
      else
        paraml.e(AppBrandIDCardVerifyPwdFrag.b(this.iKq.iKp).vIf.indexOf(localgc), localgc.vIe);
    }
    AppMethodBeat.o(133250);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.2.1
 * JD-Core Version:    0.6.2
 */