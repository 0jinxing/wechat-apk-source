package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.profile.b.d;
import com.tencent.mm.ui.base.h;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$6
  implements DialogInterface.OnClickListener
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$6(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI, String paramString, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34423);
    final d locald = new d(this.ewn, true);
    aw.Rg().a(1394, this.zut);
    aw.Rg().a(locald, 0);
    paramDialogInterface = this.zut;
    Context localContext = this.val$context;
    this.val$context.getString(2131297061);
    EnterpriseConversationUI.EnterpriseConversationFmUI.a(paramDialogInterface, h.b(localContext, this.val$context.getString(2131297086), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(34422);
        aw.Rg().c(locald);
        aw.Rg().b(1394, EnterpriseConversationUI.EnterpriseConversationFmUI.6.this.zut);
        AppMethodBeat.o(34422);
      }
    }));
    AppMethodBeat.o(34423);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.6
 * JD-Core Version:    0.6.2
 */