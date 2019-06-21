package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.graphics.drawable.Drawable;
import android.text.Html.ImageGetter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class aa$1$1
  implements Html.ImageGetter
{
  aa$1$1(aa.1 param1)
  {
  }

  public final Drawable getDrawable(String paramString)
  {
    AppMethodBeat.i(37336);
    Object localObject = null;
    String str = h.gj("adId", paramString);
    int i;
    int j;
    if ((!bo.isNullOrNil(str)) && (e.ct(str)))
    {
      paramString = Drawable.createFromPath(str);
      if (paramString == null)
        break label149;
      if (paramString.getIntrinsicHeight() != 0)
      {
        i = paramString.getIntrinsicWidth() * (int)aa.a(this.rbT.rbS).eOg / paramString.getIntrinsicHeight();
        if (paramString.getIntrinsicHeight() == 0)
          break label119;
        j = (int)aa.a(this.rbT.rbS).eOg;
        label93: paramString.setBounds(0, 0, i, j);
      }
    }
    label149: 
    while (true)
    {
      AppMethodBeat.o(37336);
      return paramString;
      i = paramString.getIntrinsicWidth();
      break;
      label119: j = paramString.getIntrinsicHeight();
      break label93;
      h.c("adId", paramString, false, 0, new aa.1.1.1(this));
      paramString = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.aa.1.1
 * JD-Core Version:    0.6.2
 */