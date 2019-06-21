package com.tencent.mm.plugin.appbrand.task;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.AppBrandEmbedUI;
import java.util.Collection;
import java.util.LinkedHashMap;

final class a extends j
{
  final long iEd;
  private String iEe;

  a(long paramLong)
  {
    super(AppBrandEmbedUI.class, null, null);
    this.iEd = paramLong;
  }

  final void DI(String paramString)
  {
    AppMethodBeat.i(132778);
    if (this.iEe.equals(paramString))
    {
      this.iFt.clear();
      this.iFu.clear();
      this.iFv = g.iFh;
      AppMethodBeat.o(132778);
    }
    while (true)
    {
      return;
      super.DI(paramString);
      AppMethodBeat.o(132778);
    }
  }

  final void a(String paramString, int paramInt, AppBrandRemoteTaskController paramAppBrandRemoteTaskController)
  {
    AppMethodBeat.i(132777);
    if (this.iFt.keySet().isEmpty())
      this.iEe = paramString;
    super.a(paramString, paramInt, paramAppBrandRemoteTaskController);
    AppMethodBeat.o(132777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.a
 * JD-Core Version:    0.6.2
 */