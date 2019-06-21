package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class NearLifeCreatePoiUI$2
  implements View.OnClickListener
{
  NearLifeCreatePoiUI$2(NearLifeCreatePoiUI paramNearLifeCreatePoiUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22972);
    paramView = new Intent();
    paramView.setClass(this.oSJ.mController.ylL, SelectPoiCategoryUI.class);
    this.oSJ.startActivityForResult(paramView, 2);
    AppMethodBeat.o(22972);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI.2
 * JD-Core Version:    0.6.2
 */