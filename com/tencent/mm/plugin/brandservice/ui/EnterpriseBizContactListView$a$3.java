package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.profile.b.d;
import com.tencent.mm.ui.base.h;

final class EnterpriseBizContactListView$a$3
  implements DialogInterface.OnClickListener
{
  EnterpriseBizContactListView$a$3(EnterpriseBizContactListView.a parama, String paramString, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13961);
    d locald = new d(this.ewn, true);
    g.Rg().a(1394, this.jMd);
    g.Rg().a(locald, 0);
    paramDialogInterface = this.jMd;
    Context localContext = this.val$context;
    this.val$context.getString(2131297061);
    paramDialogInterface.tipDialog = h.b(localContext, this.val$context.getString(2131297086), true, new EnterpriseBizContactListView.a.3.1(this, locald));
    AppMethodBeat.o(13961);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.a.3
 * JD-Core Version:    0.6.2
 */