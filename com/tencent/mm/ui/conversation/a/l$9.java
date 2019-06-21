package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.be;
import java.lang.ref.WeakReference;

final class l$9
  implements View.OnClickListener
{
  l$9(l paraml, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34684);
    be.ZV().co(this.bVv, this.yhK);
    d.b((Context)this.zwC.vlu.get(), "subapp", ".ui.autoadd.AutoAddFriendUI", new Intent());
    AppMethodBeat.o(34684);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.l.9
 * JD-Core Version:    0.6.2
 */