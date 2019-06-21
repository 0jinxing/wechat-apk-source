package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.gb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class AppBrandIDCardShowFrag$6
  implements View.OnClickListener
{
  AppBrandIDCardShowFrag$6(AppBrandIDCardShowFrag paramAppBrandIDCardShowFrag, bzo parambzo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133207);
    ab.i("MicroMsg.AppBrandIDCardShowFrag", "urlJump click");
    if (AppBrandIDCardShowFrag.a(this.iJY) != null)
      AppBrandIDCardShowFrag.a(this.iJY).DX(((gb)this.iJZ.wYH.get(0)).url);
    AppMethodBeat.o(133207);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag.6
 * JD-Core Version:    0.6.2
 */