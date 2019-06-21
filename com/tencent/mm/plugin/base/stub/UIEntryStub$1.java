package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;

final class UIEntryStub$1
  implements bk.a
{
  UIEntryStub$1(UIEntryStub paramUIEntryStub)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(18126);
    if (parame == null)
    {
      this.jDu.finish();
      AppMethodBeat.o(18126);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.UIEntryStub", "onResume mHasHandled: %b", new Object[] { Boolean.valueOf(UIEntryStub.a(this.jDu)) });
      if (!UIEntryStub.a(this.jDu))
      {
        UIEntryStub.b(this.jDu);
        UIEntryStub.a(this.jDu, UIEntryStub.c(this.jDu).getExtras());
      }
      AppMethodBeat.o(18126);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.UIEntryStub.1
 * JD-Core Version:    0.6.2
 */