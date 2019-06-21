package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg;
import com.tencent.mm.ui.MMActivity;

final class NewBizInfoHeaderPreference$1
  implements View.OnClickListener
{
  NewBizInfoHeaderPreference$1(NewBizInfoHeaderPreference paramNewBizInfoHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23854);
    String str = NewBizInfoHeaderPreference.a(this.ppX).field_username;
    paramView = new Intent(NewBizInfoHeaderPreference.b(this.ppX), ProfileHdHeadImg.class);
    paramView.putExtra("username", str);
    paramView.putExtra("brand_icon_url", NewBizInfoHeaderPreference.c(this.ppX));
    NewBizInfoHeaderPreference.b(this.ppX).startActivity(paramView);
    AppMethodBeat.o(23854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoHeaderPreference.1
 * JD-Core Version:    0.6.2
 */