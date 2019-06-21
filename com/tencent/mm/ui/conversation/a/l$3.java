package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.be;
import java.lang.ref.WeakReference;

final class l$3
  implements View.OnClickListener
{
  l$3(l paraml, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34678);
    be.ZV().co(this.bVv, this.yhK);
    l.D((Context)this.zwC.vlu.get(), false);
    AppMethodBeat.o(34678);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.l.3
 * JD-Core Version:    0.6.2
 */