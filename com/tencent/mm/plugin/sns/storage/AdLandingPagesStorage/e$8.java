package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class e$8
  implements d.a
{
  e$8(f.a parama, String paramString1, String paramString2)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37714);
    ab.i("MicroMsg.AdLandingPageDownloadFileHelper", " download success for cdn file %s, path %s", new Object[] { this.val$url, paramString });
    al.d(new e.8.2(this));
    AppMethodBeat.o(37714);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37713);
    ab.i("MicroMsg.AdLandingPageDownloadFileHelper", " download error for cdn file %s", new Object[] { this.val$url });
    al.d(new e.8.1(this));
    AppMethodBeat.o(37713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.8
 * JD-Core Version:    0.6.2
 */