package com.tencent.mm.pluginsdk.ui.preference;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

final class NormalUserHeaderPreference$3
  implements View.OnClickListener
{
  NormalUserHeaderPreference$3(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28073);
    NormalUserHeaderPreference.c(this.vrk);
    paramView = this.vrk;
    aw.ZK();
    Object localObject = c.XM().aoO(paramView.ehM.field_username);
    if ((localObject != null) && ((int)((a)localObject).ewQ != 0) && (((ap)localObject).field_username.equals(paramView.ehM.field_username)))
      paramView.ehM = ((ad)localObject);
    if (!a.jh(paramView.ehM.field_type))
    {
      localObject = new Intent();
      ((Intent)localObject).setClassName(paramView.mContext, "com.tencent.mm.ui.contact.ModRemarkNameUI");
      ((Intent)localObject).putExtra("Contact_Scene", paramView.qvb);
      ((Intent)localObject).putExtra("Contact_mode_name_type", 0);
      ((Intent)localObject).putExtra("Contact_ModStrangerRemark", true);
      ((Intent)localObject).putExtra("Contact_User", paramView.ehM.field_username);
      ((Intent)localObject).putExtra("Contact_Nick", paramView.ehM.field_nickname);
      ((Intent)localObject).putExtra("Contact_RemarkName", paramView.ehM.field_conRemark);
      ((Activity)paramView.mContext).startActivity((Intent)localObject);
      AppMethodBeat.o(28073);
    }
    while (true)
    {
      return;
      localObject = new Intent();
      ((Intent)localObject).setClassName(paramView.mContext, "com.tencent.mm.ui.contact.ContactRemarkInfoModUI");
      ((Intent)localObject).putExtra("Contact_Scene", paramView.qvb);
      ((Intent)localObject).putExtra("Contact_User", paramView.ehM.field_username);
      ((Intent)localObject).putExtra("Contact_RoomNickname", paramView.crP.getIntent().getStringExtra("Contact_RoomNickname"));
      ((Activity)paramView.mContext).startActivity((Intent)localObject);
      AppMethodBeat.o(28073);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.3
 * JD-Core Version:    0.6.2
 */