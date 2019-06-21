package com.tencent.mm.ui.chatting.m;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.a.a;
import java.lang.ref.WeakReference;

final class b$1 extends a
{
  b$1(b paramb, WeakReference paramWeakReference, Bundle paramBundle, String paramString)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(32741);
    if ((this.ehd != null) && (this.ehd.get() != null))
    {
      paramView = this.val$params.getString("conv_talker_username", null);
      if (t.kH(paramView))
      {
        b.K((Context)this.ehd.get(), this.fwC, paramView);
        AppMethodBeat.o(32741);
      }
    }
    while (true)
    {
      return;
      b.K((Context)this.ehd.get(), this.fwC, null);
      AppMethodBeat.o(32741);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.b.1
 * JD-Core Version:    0.6.2
 */