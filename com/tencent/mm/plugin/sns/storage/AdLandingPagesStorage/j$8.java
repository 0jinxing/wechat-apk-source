package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$8
  implements f.a
{
  j$8(j paramj, String paramString)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37774);
    j.a(this.rex, this.val$url);
    AppMethodBeat.o(37774);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37773);
    ab.e("AdLandingPagesPreDownloadResHelper", " pre download " + this.val$url + "is error");
    j.a(this.rex, this.val$url);
    AppMethodBeat.o(37773);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j.8
 * JD-Core Version:    0.6.2
 */