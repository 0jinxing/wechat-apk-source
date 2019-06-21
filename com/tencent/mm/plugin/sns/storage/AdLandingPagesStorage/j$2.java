package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.sdk.platformtools.ab;

final class j$2
  implements f.a
{
  j$2(j paramj, m paramm)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37762);
    j.a(this.rex, this.rey.qWD);
    AppMethodBeat.o(37762);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37761);
    ab.e("AdLandingPagesPreDownloadResHelper", " pre download " + this.rey.qWD + "is error");
    j.a(this.rex, this.rey.qWD);
    AppMethodBeat.o(37761);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j.2
 * JD-Core Version:    0.6.2
 */