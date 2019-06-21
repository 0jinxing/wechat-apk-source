package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ContentFragment$2
  implements f.a
{
  ContentFragment$2(ContentFragment paramContentFragment, String paramString)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37616);
    ContentFragment.a(this.rdr, paramString, "adId", this.hWi);
    AppMethodBeat.o(37616);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37615);
    ab.i("ContentFragment", "download img fail %s", new Object[] { this.hWi });
    ContentFragment.c(this.rdr);
    AppMethodBeat.o(37615);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.2
 * JD-Core Version:    0.6.2
 */