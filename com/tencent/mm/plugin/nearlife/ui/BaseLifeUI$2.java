package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.axx;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseLifeUI$2
  implements View.OnClickListener
{
  BaseLifeUI$2(BaseLifeUI paramBaseLifeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22937);
    if (this.oRY.oRH == null)
    {
      ab.e("MicroMsg.BaseLifeUI", "Location is null");
      AppMethodBeat.o(22937);
    }
    while (true)
    {
      return;
      h.pYm.e(11138, new Object[] { "1", Integer.valueOf(BaseLifeUI.b(this.oRY).getCount() + 1), this.oRY.hlm });
      paramView = new Intent();
      paramView.setClass(this.oRY, NearLifeCreatePoiUI.class);
      paramView.putExtra("get_lat", this.oRY.oRH.vRq);
      paramView.putExtra("get_lng", this.oRY.oRH.vRp);
      paramView.putExtra("get_preci", this.oRY.oRH.wfG);
      paramView.putExtra("get_poi_name", BaseLifeUI.b(this.oRY).bVk());
      paramView.putExtra("get_cur_lat", this.oRY.oRI);
      paramView.putExtra("get_cur_lng", this.oRY.oRJ);
      paramView.putExtra("get_accuracy", this.oRY.oRL);
      paramView.putExtra("get_loctype", this.oRY.oRK);
      paramView.putExtra("search_id", this.oRY.hlm);
      paramView.putExtra("get_is_mars", this.oRY.fBD);
      this.oRY.startActivityForResult(paramView, 1);
      AppMethodBeat.o(22937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.2
 * JD-Core Version:    0.6.2
 */