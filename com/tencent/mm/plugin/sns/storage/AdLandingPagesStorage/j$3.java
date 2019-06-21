package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.sdk.platformtools.ab;

final class j$3
  implements f.a
{
  j$3(j paramj, n paramn)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37764);
    j.a(this.rex, this.rew.qWD);
    AppMethodBeat.o(37764);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37763);
    ab.e("AdLandingPagesPreDownloadResHelper", " pre download " + this.rew.qWD + "is error");
    j.a(this.rex, this.rew.qWD);
    AppMethodBeat.o(37763);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j.3
 * JD-Core Version:    0.6.2
 */