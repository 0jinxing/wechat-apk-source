package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.gb;
import java.util.LinkedList;

final class AppBrandIDCardShowFrag$5
  implements View.OnClickListener
{
  AppBrandIDCardShowFrag$5(AppBrandIDCardShowFrag paramAppBrandIDCardShowFrag, bzo parambzo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133206);
    if (AppBrandIDCardShowFrag.a(this.iJY) != null)
      AppBrandIDCardShowFrag.a(this.iJY).DX(((gb)this.iJZ.wYH.get(0)).url);
    AppMethodBeat.o(133206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag.5
 * JD-Core Version:    0.6.2
 */