package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.i;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.profile.ui.ContactInfoUI;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;

final class b$2$2
  implements n.d
{
  b$2$2(b.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(23804);
    switch (paramMenuItem.getItemId())
    {
    default:
      ab.w("MicroMsg.ContactWidgetNewBizInfo", "default onMMMenuItemSelected err");
      AppMethodBeat.o(23804);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return;
      paramMenuItem = this.ppP.ppO;
      Object localObject = new Intent();
      ((Intent)localObject).setClass(paramMenuItem.ppM, NewBizInfoMoreInofUI.class);
      ((Intent)localObject).putExtra("Contact_User", paramMenuItem.ehM.field_username);
      if (paramMenuItem.ppM.getIntent() != null)
        ((Intent)localObject).putExtras(paramMenuItem.ppM.getIntent());
      paramMenuItem.ppM.startActivity((Intent)localObject);
      c.cP(paramMenuItem.ehM.field_username, 700);
      AppMethodBeat.o(23804);
      continue;
      paramMenuItem = this.ppP.ppO;
      localObject = new Intent();
      ((Intent)localObject).putExtra("Select_Talker_Name", paramMenuItem.ehM.field_username);
      ((Intent)localObject).putExtra("Select_block_List", paramMenuItem.ehM.field_username);
      ((Intent)localObject).putExtra("Select_Send_Card", true);
      ((Intent)localObject).putExtra("Select_Conv_Type", 3);
      ((Intent)localObject).putExtra("mutil_select_is_ret", true);
      com.tencent.mm.plugin.profile.b.gkE.a((Intent)localObject, paramMenuItem.ppM);
      c.cP(paramMenuItem.ehM.field_username, 800);
      AppMethodBeat.o(23804);
      continue;
      localObject = this.ppP.ppO;
      paramMenuItem = new Intent();
      paramMenuItem.setClass(((b)localObject).ppM, NewBizInfoSettingUI.class);
      paramMenuItem.putExtra("Contact_User", ((b)localObject).ehM.field_username);
      paramMenuItem.putExtra("key_start_biz_profile_setting_from_scene", 2);
      if (((b)localObject).ppM.getIntent() != null)
        paramMenuItem.putExtras(((b)localObject).ppM.getIntent());
      ((b)localObject).ppM.startActivity(paramMenuItem);
      AppMethodBeat.o(23804);
      continue;
      c.cP(this.ppP.ppO.ehM.field_username, 903);
      i.mn(this.ppP.ppO.ehM.field_username);
      b.a(this.ppP.ppO);
      if ((s.aVO()) && (!f.qY(this.ppP.ppO.ehM.field_username)))
        break;
      h.bQ(this.ppP.ppO.ppM, this.ppP.ppO.ppM.getString(2131301285));
      AppMethodBeat.o(23804);
      continue;
      t.x(this.ppP.ppO.ehM.field_username, true);
      c.cP(this.ppP.ppO.ehM.field_username, 904);
      b.a(this.ppP.ppO);
      if ((s.aVO()) && (!f.qY(this.ppP.ppO.ehM.field_username)))
        break;
      h.bQ(this.ppP.ppO.ppM, this.ppP.ppO.ppM.getString(2131297686));
      AppMethodBeat.o(23804);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.2.2
 * JD-Core Version:    0.6.2
 */