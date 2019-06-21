package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.ui.ContactInfoUI;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.a;

final class NewBizInfoFollowPreference$1
  implements View.OnClickListener
{
  NewBizInfoFollowPreference$1(NewBizInfoFollowPreference paramNewBizInfoFollowPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23849);
    Object localObject;
    if ((NewBizInfoFollowPreference.a(this.ppU) != null) && ((NewBizInfoFollowPreference.a(this.ppU) instanceof b)))
    {
      paramView = (b)NewBizInfoFollowPreference.a(this.ppU);
      if (paramView.pmI != null)
      {
        localObject = new of();
        paramView.pmI.fPZ = 5;
        ((of)localObject).cKy.cKz = paramView.pmI;
        a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      localObject = new Intent();
      if (paramView.ppM.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false))
        ((Intent)localObject).setFlags(268435456);
      ((Intent)localObject).putExtra("chat_from_scene", paramView.ppM.getIntent().getIntExtra("chat_from_scene", 0));
      ((Intent)localObject).putExtra("KOpenArticleSceneFromScene", 126);
      ((Intent)localObject).putExtra("specific_chat_from_scene", 5);
      if (!paramView.pli)
        break label213;
      ((Intent)localObject).putExtra("Chat_User", paramView.ehM.field_username);
      ((Intent)localObject).putExtra("Chat_Mode", 1);
      paramView.ppM.setResult(-1, (Intent)localObject);
    }
    while (true)
    {
      paramView.Bj(5);
      c.cP(paramView.ehM.field_username, 300);
      AppMethodBeat.o(23849);
      return;
      label213: ((Intent)localObject).putExtra("Chat_User", paramView.ehM.field_username);
      ((Intent)localObject).putExtra("Chat_Mode", 1);
      ((Intent)localObject).putExtra("finish_direct", true);
      com.tencent.mm.plugin.profile.b.gkE.d((Intent)localObject, paramView.ppM);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoFollowPreference.1
 * JD-Core Version:    0.6.2
 */