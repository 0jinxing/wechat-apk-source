package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.sdk.platformtools.ab;

final class j$7
  implements f.a
{
  j$7(j paramj, z paramz)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37772);
    j.a(this.rex, this.reA.qXv);
    AppMethodBeat.o(37772);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37771);
    ab.e("AdLandingPagesPreDownloadResHelper", " pre download " + this.reA.qXv + "is error");
    j.a(this.rex, this.reA.qWH);
    AppMethodBeat.o(37771);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j.7
 * JD-Core Version:    0.6.2
 */