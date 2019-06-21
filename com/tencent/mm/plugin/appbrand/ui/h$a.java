package com.tencent.mm.plugin.appbrand.ui;

import a.f.a.a;
import a.f.b.k;
import a.l;
import a.y;
import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.task.i.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"doFinish", "", "invoke"})
final class h$a extends k
  implements a<y>
{
  h$a(i.a parama, Activity paramActivity)
  {
    super(0);
  }

  public final void aDt()
  {
    AppMethodBeat.i(134998);
    this.iJd.proceed();
    this.iJe.finish();
    AppMethodBeat.o(134998);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.h.a
 * JD-Core Version:    0.6.2
 */