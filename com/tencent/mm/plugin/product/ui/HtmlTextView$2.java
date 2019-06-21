package com.tencent.mm.plugin.product.ui;

import android.graphics.drawable.Drawable;
import android.text.Html.ImageGetter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.URL;

final class HtmlTextView$2
  implements Html.ImageGetter
{
  HtmlTextView$2(HtmlTextView paramHtmlTextView)
  {
  }

  public final Drawable getDrawable(String paramString)
  {
    AppMethodBeat.i(44012);
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString);
      paramString = Drawable.createFromStream(localURL.openStream(), "");
      if (paramString != null)
        paramString.setBounds(0, 0, paramString.getIntrinsicWidth(), paramString.getIntrinsicHeight());
      AppMethodBeat.o(44012);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(44012);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.HtmlTextView.2
 * JD-Core Version:    0.6.2
 */