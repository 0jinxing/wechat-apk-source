package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.graphics.drawable.Drawable;
import android.text.Html.ImageGetter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class aa$1$1$1$1
  implements Html.ImageGetter
{
  aa$1$1$1$1(aa.1.1.1 param1)
  {
  }

  public final Drawable getDrawable(String paramString)
  {
    AppMethodBeat.i(37333);
    Object localObject = null;
    String str = h.gj("adId", paramString);
    paramString = localObject;
    int i;
    if (!bo.isNullOrNil(str))
    {
      paramString = localObject;
      if (e.ct(str))
      {
        paramString = Drawable.createFromPath(str);
        if (paramString != null)
        {
          if (paramString.getIntrinsicHeight() == 0)
            break label126;
          i = paramString.getIntrinsicWidth() * (int)aa.a(this.rbV.rbU.rbT.rbS).eOg / paramString.getIntrinsicHeight();
          if (paramString.getIntrinsicHeight() == 0)
            break label135;
        }
      }
    }
    label135: for (int j = (int)aa.a(this.rbV.rbU.rbT.rbS).eOg; ; j = paramString.getIntrinsicHeight())
    {
      paramString.setBounds(0, 0, i, j);
      AppMethodBeat.o(37333);
      return paramString;
      label126: i = paramString.getIntrinsicWidth();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.aa.1.1.1.1
 * JD-Core Version:    0.6.2
 */