package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bp;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;

final class NearbyFriendsIntroUI$1
  implements View.OnClickListener
{
  NearbyFriendsIntroUI$1(NearbyFriendsIntroUI paramNearbyFriendsIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55435);
    if (NearbyFriendsIntroUI.a(this.oQa) == null)
    {
      NearbyFriendsIntroUI.a(this.oQa, h.a(this.oQa.mController.ylL, this.oQa.getString(2131297061), NearbyFriendsIntroUI.b(this.oQa), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(55434);
          g.RP().Ry().set(4103, Boolean.TRUE);
          paramAnonymousDialogInterface = g.RP().Ry();
          boolean bool;
          bp localbp;
          if (!NearbyFriendsIntroUI.c(NearbyFriendsIntroUI.1.this.oQa).isChecked())
          {
            bool = true;
            paramAnonymousDialogInterface.set(4104, Boolean.valueOf(bool));
            localbp = bp.aap();
            if (localbp != null)
              break label113;
            NearbyFriendsIntroUI.1.this.oQa.startActivity(new Intent(NearbyFriendsIntroUI.1.this.oQa, NearbyPersonalInfoUI.class));
          }
          while (true)
          {
            NearbyFriendsIntroUI.1.this.oQa.finish();
            AppMethodBeat.o(55434);
            return;
            bool = false;
            break;
            label113: paramAnonymousDialogInterface = bo.nullAsNil(localbp.getProvince());
            bo.nullAsNil(localbp.getCity());
            paramAnonymousInt = bo.a(Integer.valueOf(localbp.dtS), 0);
            if ((paramAnonymousDialogInterface.equals("")) || (paramAnonymousInt == 0))
              NearbyFriendsIntroUI.1.this.oQa.startActivity(new Intent(NearbyFriendsIntroUI.1.this.oQa, NearbyPersonalInfoUI.class));
            else
              NearbyFriendsIntroUI.1.this.oQa.startActivity(new Intent(NearbyFriendsIntroUI.1.this.oQa, NearbyFriendsUI.class));
          }
        }
      }
      , null));
      AppMethodBeat.o(55435);
    }
    while (true)
    {
      return;
      NearbyFriendsIntroUI.a(this.oQa).show();
      AppMethodBeat.o(55435);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI.1
 * JD-Core Version:    0.6.2
 */