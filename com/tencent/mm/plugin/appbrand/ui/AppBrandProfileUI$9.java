package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;

final class AppBrandProfileUI$9
  implements View.OnClickListener
{
  AppBrandProfileUI$9(AppBrandProfileUI paramAppBrandProfileUI, List paramList)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133034);
    if ((AppBrandProfileUI.e(this.iIf) != null) && (!this.iIk.isEmpty()))
    {
      paramView = new Intent(this.iIf.mController.ylL, WxaBindBizInfoUI.class);
      paramView.putExtra("app_id", AppBrandProfileUI.e(this.iIf).appId);
      paramView.putParcelableArrayListExtra("wxa_entry_info_list", new ArrayList(this.iIk));
      this.iIf.mController.ylL.startActivity(paramView);
    }
    AppMethodBeat.o(133034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.9
 * JD-Core Version:    0.6.2
 */