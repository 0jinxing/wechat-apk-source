package com.tencent.mm.plugin.profile.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.a;
import com.tencent.mm.plugin.profile.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

final class FriendPreference$1
  implements View.OnClickListener
{
  FriendPreference$1(FriendPreference paramFriendPreference, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23620);
    if ((FriendPreference.a(this.pnC) != null) && (!bo.isNullOrNil(FriendPreference.a(this.pnC).frQ)));
    for (paramView = FriendPreference.b(this.pnC).getResources().getStringArray(2131755043); ; paramView = FriendPreference.b(this.pnC).getResources().getStringArray(2131755044))
    {
      Object localObject = paramView;
      if (b.gkF.BX())
      {
        paramView = bo.P(paramView);
        paramView.add(FriendPreference.b(this.pnC).getResources().getString(2131298197));
        localObject = (String[])paramView.toArray(new String[paramView.size()]);
        com.tencent.mm.plugin.report.service.h.pYm.e(11621, new Object[] { Integer.valueOf(2), Integer.valueOf(3) });
      }
      com.tencent.mm.ui.base.h.a(FriendPreference.b(this.pnC), null, (String[])localObject, null, new FriendPreference.1.1(this, (String[])localObject));
      AppMethodBeat.o(23620);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.FriendPreference.1
 * JD-Core Version:    0.6.2
 */