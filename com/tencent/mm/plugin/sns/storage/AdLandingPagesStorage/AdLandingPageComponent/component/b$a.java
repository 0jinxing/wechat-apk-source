package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a
{
  int count;
  boolean isVisible;
  long qYO;
  long time;

  private b$a(b paramb)
  {
  }

  final void cpm()
  {
    AppMethodBeat.i(37013);
    if (this.isVisible)
      AppMethodBeat.o(37013);
    while (true)
    {
      return;
      this.isVisible = true;
      this.qYO = System.currentTimeMillis();
      this.count += 1;
      AppMethodBeat.o(37013);
    }
  }

  final void cpn()
  {
    AppMethodBeat.i(37014);
    if (this.isVisible)
    {
      this.isVisible = false;
      if (this.qYO > 0L)
      {
        this.time += System.currentTimeMillis() - this.qYO;
        this.qYO = 0L;
      }
    }
    AppMethodBeat.o(37014);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b.a
 * JD-Core Version:    0.6.2
 */