package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;

final class NormalUserFooterPreference$a$13
  implements View.OnClickListener
{
  NormalUserFooterPreference$a$13(NormalUserFooterPreference.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23690);
    paramView = new Intent();
    paramView.putExtra("sns_permission_userName", NormalUserFooterPreference.a(this.poS.poR).field_username);
    paramView.putExtra("sns_permission_anim", true);
    paramView.putExtra("sns_permission_block_scene", 4);
    d.b(NormalUserFooterPreference.b(this.poS.poR), "sns", ".ui.SnsPermissionUI", paramView);
    AppMethodBeat.o(23690);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.13
 * JD-Core Version:    0.6.2
 */