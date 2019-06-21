package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ak$c extends ContextWrapper
{
  private Resources mResources;

  public ak$c(Context paramContext)
  {
    super(paramContext);
  }

  public final Resources getResources()
  {
    AppMethodBeat.i(134295);
    Resources localResources;
    if ((this.mResources != null) && ((this.mResources instanceof ak.d)))
    {
      localResources = this.mResources;
      AppMethodBeat.o(134295);
    }
    while (true)
    {
      return localResources;
      localResources = super.getResources();
      this.mResources = new ak.d(localResources.getAssets(), localResources.getDisplayMetrics(), localResources.getConfiguration());
      localResources = this.mResources;
      AppMethodBeat.o(134295);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ak.c
 * JD-Core Version:    0.6.2
 */