package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;

final class o$2
  implements Runnable
{
  o$2(u paramu, String paramString, Integer paramInteger)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123678);
    Object localObject = (ab)o.aQN().get(this.hCx);
    if (localObject != null)
    {
      localObject = o.a(this.hCx, ((ab)localObject).getInputId());
      if (localObject != null)
        ((aa)localObject).a(this.gdK, this.jeW);
    }
    AppMethodBeat.o(123678);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.o.2
 * JD-Core Version:    0.6.2
 */