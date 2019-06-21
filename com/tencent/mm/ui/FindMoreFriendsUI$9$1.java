package com.tencent.mm.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.h;

final class FindMoreFriendsUI$9$1
  implements Runnable
{
  FindMoreFriendsUI$9$1(FindMoreFriendsUI.9 param9, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29218);
    Object localObject = new StringBuilder("download url ").append(this.kUU).append(" , result ");
    boolean bool;
    if (this.yhF == null)
    {
      bool = true;
      ab.i("MicroMsg.FindMoreFriendsUI", bool);
      localObject = (IconPreference)FindMoreFriendsUI.a(this.yhG.yhB).aqO("jd_market_entrance");
      if (localObject != null)
      {
        if (!this.kUU.equals(FindMoreFriendsUI.j(this.yhG.yhB)))
          break label461;
        FindMoreFriendsUI.k(this.yhG.yhB);
      }
    }
    while (true)
    {
      FindMoreFriendsUI.a(this.yhG.yhB).notifyDataSetChanged();
      if (this.kUU.equals(FindMoreFriendsUI.n(this.yhG.yhB)))
      {
        ((IconPreference)FindMoreFriendsUI.a(this.yhG.yhB).aqO("find_friends_by_look")).drawable = new BitmapDrawable(this.yhG.yhB.getContext().getResources(), this.yhF);
        FindMoreFriendsUI.o(this.yhG.yhB);
        FindMoreFriendsUI.a(this.yhG.yhB).notifyDataSetChanged();
      }
      if (this.kUU.equals(FindMoreFriendsUI.p(this.yhG.yhB)))
      {
        ((IconPreference)FindMoreFriendsUI.a(this.yhG.yhB).aqO("find_friends_by_search")).drawable = new BitmapDrawable(this.yhG.yhB.getContext().getResources(), this.yhF);
        FindMoreFriendsUI.q(this.yhG.yhB);
        FindMoreFriendsUI.a(this.yhG.yhB).notifyDataSetChanged();
      }
      if (this.kUU.equals(FindMoreFriendsUI.r(this.yhG.yhB)))
      {
        ((IconPreference)FindMoreFriendsUI.a(this.yhG.yhB).aqO("find_friends_by_look")).ap(this.yhF);
        FindMoreFriendsUI.a(this.yhG.yhB, null);
        FindMoreFriendsUI.a(this.yhG.yhB).notifyDataSetChanged();
      }
      if (this.kUU.equals(FindMoreFriendsUI.s(this.yhG.yhB)))
      {
        ((IconPreference)FindMoreFriendsUI.a(this.yhG.yhB).aqO("my_life_around")).ap(d.a(this.yhF, false, this.yhF.getWidth() * 0.1F));
        FindMoreFriendsUI.t(this.yhG.yhB);
        FindMoreFriendsUI.a(this.yhG.yhB).notifyDataSetChanged();
      }
      AppMethodBeat.o(29218);
      return;
      bool = false;
      break;
      label461: if (this.kUU.equals(FindMoreFriendsUI.l(this.yhG.yhB)))
      {
        ((IconPreference)localObject).ap(this.yhF);
        FindMoreFriendsUI.m(this.yhG.yhB);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.9.1
 * JD-Core Version:    0.6.2
 */