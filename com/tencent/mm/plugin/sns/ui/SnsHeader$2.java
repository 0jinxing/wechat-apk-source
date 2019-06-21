package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.storage.bd;

final class SnsHeader$2
  implements View.OnClickListener
{
  SnsHeader$2(SnsHeader paramSnsHeader, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 1;
    AppMethodBeat.i(38948);
    paramView = af.cnt().aoO(SnsHeader.e(this.rsb));
    if ((paramView != null) && ((com.tencent.mm.n.a.jh(paramView.field_type)) || (SnsHeader.f(this.rsb))))
    {
      paramView = new Intent();
      paramView.putExtra("Contact_User", SnsHeader.e(this.rsb));
      if ((SnsHeader.e(this.rsb) != null) && (SnsHeader.e(this.rsb).length() > 0))
      {
        if (SnsHeader.c(this.rsb) == 1)
          i = 6;
        paramView.putExtra("CONTACT_INFO_UI_SOURCE", i);
        com.tencent.mm.plugin.sns.c.a.gkE.c(paramView, this.val$context);
      }
      AppMethodBeat.o(38948);
    }
    while (true)
    {
      return;
      paramView = ((Activity)this.val$context).getIntent();
      paramView.putExtra("Contact_User", SnsHeader.e(this.rsb));
      com.tencent.mm.plugin.sns.c.a.gkE.c(paramView, this.val$context);
      AppMethodBeat.o(38948);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsHeader.2
 * JD-Core Version:    0.6.2
 */