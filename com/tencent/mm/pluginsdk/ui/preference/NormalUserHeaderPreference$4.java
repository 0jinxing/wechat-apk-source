package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;

final class NormalUserHeaderPreference$4
  implements View.OnClickListener
{
  NormalUserHeaderPreference$4(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28074);
    paramView = new Intent();
    paramView.putExtra("sns_permission_userName", NormalUserHeaderPreference.a(this.vrk).field_username);
    paramView.putExtra("sns_permission_anim", true);
    paramView.putExtra("sns_permission_block_scene", 3);
    d.b(NormalUserHeaderPreference.b(this.vrk), "sns", ".ui.SnsPermissionUI", paramView);
    AppMethodBeat.o(28074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.4
 * JD-Core Version:    0.6.2
 */