package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class m$i
  implements Runnable
{
  m$i(m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134911);
    Object localObject = this.izd.context;
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
      AppMethodBeat.o(134911);
      throw ((Throwable)localObject);
    }
    ((MMActivity)localObject).aqX();
    AppMethodBeat.o(134911);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.m.i
 * JD-Core Version:    0.6.2
 */