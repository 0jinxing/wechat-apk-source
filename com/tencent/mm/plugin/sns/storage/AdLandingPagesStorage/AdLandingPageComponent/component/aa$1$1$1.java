package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.text.Html;
import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class aa$1$1$1
  implements f.a
{
  aa$1$1$1(aa.1.1 param1)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37335);
    try
    {
      Object localObject = this.rbU.rbT.rbR;
      paramString = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/aa$1$1$1$1;
      paramString.<init>(this);
      localObject = Html.fromHtml((String)localObject, paramString, null);
      paramString = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/aa$1$1$1$2;
      paramString.<init>(this, (Spanned)localObject);
      al.d(paramString);
      AppMethodBeat.o(37335);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Sns.AdLandingPageTextComponent", "the backgroundCoverUrl is set error ,because " + paramString.toString());
        AppMethodBeat.o(37335);
      }
    }
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.aa.1.1.1
 * JD-Core Version:    0.6.2
 */