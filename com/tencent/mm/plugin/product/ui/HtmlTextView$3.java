package com.tencent.mm.plugin.product.ui;

import android.text.Editable;
import android.text.Html.TagHandler;
import android.text.style.StrikethroughSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xml.sax.XMLReader;

final class HtmlTextView$3
  implements Html.TagHandler
{
  HtmlTextView$3(HtmlTextView paramHtmlTextView)
  {
  }

  private static Object a(Editable paramEditable, Class paramClass)
  {
    Object localObject = null;
    AppMethodBeat.i(44014);
    paramClass = paramEditable.getSpans(0, paramEditable.length(), paramClass);
    if (paramClass.length == 0)
    {
      AppMethodBeat.o(44014);
      paramEditable = localObject;
    }
    while (true)
    {
      return paramEditable;
      for (int i = paramClass.length; ; i--)
      {
        if (i <= 0)
          break label79;
        if (paramEditable.getSpanFlags(paramClass[(i - 1)]) == 17)
        {
          paramEditable = paramClass[(i - 1)];
          AppMethodBeat.o(44014);
          break;
        }
      }
      label79: AppMethodBeat.o(44014);
      paramEditable = localObject;
    }
  }

  public final void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader)
  {
    AppMethodBeat.i(44013);
    int i;
    if ((paramString.equalsIgnoreCase("strike")) || (paramString.equals("s")))
    {
      i = paramEditable.length();
      if (paramBoolean)
      {
        paramEditable.setSpan(new StrikethroughSpan(), i, i, 17);
        AppMethodBeat.o(44013);
      }
    }
    while (true)
    {
      return;
      paramString = a(paramEditable, StrikethroughSpan.class);
      int j = paramEditable.getSpanStart(paramString);
      paramEditable.removeSpan(paramString);
      if (j != i)
        paramEditable.setSpan(new StrikethroughSpan(), j, i, 33);
      AppMethodBeat.o(44013);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.HtmlTextView.3
 * JD-Core Version:    0.6.2
 */