package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ContentFragment$6
  implements f.a
{
  ContentFragment$6(ContentFragment paramContentFragment)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37623);
    ab.d("ContentFragment", "onDownloaded nextBtn");
    ContentFragment.a(this.rdr, paramString, ContentFragment.a(this.rdr).rdx);
    this.rdr.cqd();
    AppMethodBeat.o(37623);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37622);
    ab.d("ContentFragment", "onDownloadError nextBtn");
    AppMethodBeat.o(37622);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.6
 * JD-Core Version:    0.6.2
 */