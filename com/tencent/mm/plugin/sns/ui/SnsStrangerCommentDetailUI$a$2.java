package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.e.o;

final class SnsStrangerCommentDetailUI$a$2 extends o
{
  SnsStrangerCommentDetailUI$a$2(SnsStrangerCommentDetailUI.a parama, Object paramObject)
  {
    super(paramObject, null);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39323);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramView.getTag().toString());
    a.gkE.c(localIntent, SnsStrangerCommentDetailUI.a.a(this.rxy));
    AppMethodBeat.o(39323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.a.2
 * JD-Core Version:    0.6.2
 */