package com.tencent.mm.plugin.appbrand.page.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$a$4
  implements Runnable
{
  f$a$4(f.a parama, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87356);
    try
    {
      this.ivp.setDescription(this.ivp.ivo.getContext().getResources().getString(this.fEx));
      AppMethodBeat.o(87356);
      return;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      while (true)
      {
        this.ivp.setDescription(null);
        AppMethodBeat.o(87356);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.f.a.4
 * JD-Core Version:    0.6.2
 */