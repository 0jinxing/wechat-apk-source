package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.account.ui.FacebookFriendUI;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;

final class h$1
  implements View.OnClickListener
{
  h$1(h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34655);
    aw.ZK();
    c.Ry().set(65833, Integer.valueOf(0));
    ((Context)this.zwp.vlu.get()).startActivity(new Intent((Context)this.zwp.vlu.get(), FacebookFriendUI.class));
    this.zwp.view.setVisibility(8);
    AppMethodBeat.o(34655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.h.1
 * JD-Core Version:    0.6.2
 */