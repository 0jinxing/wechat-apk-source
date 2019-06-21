package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg;
import com.tencent.mm.ui.MMActivity;

final class BizInfoHeaderPreference$1
  implements View.OnClickListener
{
  BizInfoHeaderPreference$1(BizInfoHeaderPreference paramBizInfoHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23306);
    paramView = BizInfoHeaderPreference.a(this.pkZ).field_username;
    Intent localIntent = new Intent(BizInfoHeaderPreference.b(this.pkZ), ProfileHdHeadImg.class);
    localIntent.putExtra("username", paramView);
    localIntent.putExtra("brand_icon_url", BizInfoHeaderPreference.c(this.pkZ));
    BizInfoHeaderPreference.b(this.pkZ).startActivity(localIntent);
    AppMethodBeat.o(23306);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference.1
 * JD-Core Version:    0.6.2
 */