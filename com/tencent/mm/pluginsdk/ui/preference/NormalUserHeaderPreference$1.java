package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;

final class NormalUserHeaderPreference$1
  implements View.OnClickListener
{
  NormalUserHeaderPreference$1(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28071);
    Object localObject = NormalUserHeaderPreference.a(this.vrk).field_username;
    paramView = (View)localObject;
    if (ad.mR((String)localObject))
      paramView = ad.aoC((String)localObject);
    localObject = new Intent(NormalUserHeaderPreference.b(this.vrk), ProfileHdHeadImg.class);
    ((Intent)localObject).putExtra("username", paramView);
    NormalUserHeaderPreference.b(this.vrk).startActivity((Intent)localObject);
    AppMethodBeat.o(28071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.1
 * JD-Core Version:    0.6.2
 */