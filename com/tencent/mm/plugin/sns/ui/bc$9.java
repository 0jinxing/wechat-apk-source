package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;

final class bc$9
  implements View.OnClickListener
{
  bc$9(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39872);
    if ((paramView.getTag() instanceof az))
    {
      paramView = (az)paramView.getTag();
      if (bo.isNullOrNil(paramView.rDc))
      {
        ab.e("MicroMsg.TimeLineClickEvent", "show source profile fail, username is null");
        Toast.makeText(this.rDG.context, this.rDG.context.getString(2131299997, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
        AppMethodBeat.o(39872);
      }
    }
    while (true)
    {
      return;
      g.RQ();
      Object localObject = ((j)g.K(j.class)).XM().aoO(paramView.rDc);
      if ((localObject != null) && (((ap)localObject).field_username.equals(paramView.rDc)))
      {
        localObject = new Intent();
        ((Intent)localObject).addFlags(268435456);
        ((Intent)localObject).putExtra("Contact_User", paramView.rDc);
        com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramView.rDc + ",37");
        ((Intent)localObject).putExtra("Contact_Scene", 37);
        a.gkE.c((Intent)localObject, this.rDG.context);
        AppMethodBeat.o(39872);
      }
      else
      {
        ao.a.flu.a(paramView.rDc, "", new bc.9.1(this));
        localObject = this.rDG;
        Context localContext = this.rDG.context;
        this.rDG.context.getString(2131297061);
        ((bc)localObject).tipDialog = com.tencent.mm.ui.base.h.b(localContext, this.rDG.context.getString(2131297086), true, new bc.9.2(this, paramView));
        AppMethodBeat.o(39872);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.9
 * JD-Core Version:    0.6.2
 */