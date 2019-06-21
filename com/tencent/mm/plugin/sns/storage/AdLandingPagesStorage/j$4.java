package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.sdk.platformtools.ab;

final class j$4
  implements f.a
{
  j$4(j paramj, o paramo)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37766);
    j.a(this.rex, this.rez.qWF);
    AppMethodBeat.o(37766);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37765);
    ab.e("AdLandingPagesPreDownloadResHelper", " pre download " + this.rez.qWF + "is error");
    j.a(this.rex, this.rez.qWF);
    AppMethodBeat.o(37765);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j.4
 * JD-Core Version:    0.6.2
 */