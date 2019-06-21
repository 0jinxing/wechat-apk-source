package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.c;
import com.tencent.mm.pluginsdk.h;

final class NewBizInfoFollowPreference$2
  implements View.OnClickListener
{
  NewBizInfoFollowPreference$2(NewBizInfoFollowPreference paramNewBizInfoFollowPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23850);
    if ((NewBizInfoFollowPreference.a(this.ppU) != null) && ((NewBizInfoFollowPreference.a(this.ppU) instanceof b)))
    {
      paramView = (b)NewBizInfoFollowPreference.a(this.ppU);
      ((h)g.K(h.class)).a(paramView.pkW, paramView.ppM, paramView.ehM, true, new b.3(paramView));
      c.cP(paramView.ehM.field_username, 1000);
    }
    AppMethodBeat.o(23850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoFollowPreference.2
 * JD-Core Version:    0.6.2
 */