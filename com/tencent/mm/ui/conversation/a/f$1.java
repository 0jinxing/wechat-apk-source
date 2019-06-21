package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.s;
import java.lang.ref.WeakReference;

final class f$1
  implements View.OnClickListener
{
  f$1(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34650);
    paramView = new Intent((Context)this.zwm.vlu.get(), SelectContactUI.class);
    paramView.putExtra("list_attr", s.hs(s.znD, 256));
    paramView.putExtra("list_type", 10);
    paramView.putExtra("received_card_name", this.zwm.zwk);
    paramView.putExtra("recommend_friends", true);
    paramView.putExtra("titile", ((Context)this.zwm.vlu.get()).getString(2131296486));
    ((Context)this.zwm.vlu.get()).startActivity(paramView);
    aw.ZK().Yk().oW(this.zwm.zwk);
    aw.ZK().Yk().oW(this.zwm.zwl);
    h.pYm.e(11003, new Object[] { this.zwm.zwk, Integer.valueOf(2), Integer.valueOf(0) });
    AppMethodBeat.o(34650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.f.1
 * JD-Core Version:    0.6.2
 */