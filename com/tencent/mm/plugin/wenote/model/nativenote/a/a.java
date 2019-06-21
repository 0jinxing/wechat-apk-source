package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.text.Html;
import android.text.Html.TagHandler;
import android.text.Spanned;
import android.text.style.ParagraphStyle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private static String TAG;
  private static f<String, Spanned> uOH;
  public static Spanned uOI;

  static
  {
    AppMethodBeat.i(26688);
    TAG = "MicroMsg.ConvertHtmlToSpanned";
    uOH = new com.tencent.mm.memory.a.c(30);
    uOI = null;
    AppMethodBeat.o(26688);
  }

  public static Spanned ahb(String paramString)
  {
    AppMethodBeat.i(26686);
    Object localObject = paramString;
    if (paramString == null)
      localObject = "";
    paramString = Pattern.compile("\n", 2).matcher((CharSequence)localObject).replaceAll("<br/>");
    localObject = fromHtml(paramString);
    uOH.put(paramString, localObject);
    AppMethodBeat.o(26686);
    return localObject;
  }

  private static Spanned fromHtml(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(26687);
    Object localObject2 = paramString;
    if (!paramString.startsWith("<html>"))
      localObject2 = "<html>".concat(String.valueOf(paramString));
    paramString = (String)localObject2;
    if (!((String)localObject2).endsWith("</html>"))
      paramString = (String)localObject2 + "</html>";
    try
    {
      uOI = null;
      localObject2 = new com/tencent/mm/plugin/wenote/model/nativenote/a/c;
      ((c)localObject2).<init>();
      paramString = Html.fromHtml(paramString, null, (Html.TagHandler)localObject2);
      if (paramString == null)
      {
        AppMethodBeat.o(26687);
        paramString = localObject1;
        return paramString;
      }
    }
    catch (Throwable paramString)
    {
      while (true)
        if (uOI != null)
        {
          paramString = uOI;
          continue;
          int i = paramString.toString().length();
          if ((i > 1) && (paramString.toString().endsWith("\n")))
          {
            if (paramString.getSpans(i, i, ParagraphStyle.class).length > 0)
            {
              paramString = (Spanned)paramString.subSequence(0, i - 1);
              AppMethodBeat.o(26687);
            }
            else
            {
              AppMethodBeat.o(26687);
            }
          }
          else
            AppMethodBeat.o(26687);
        }
        else
        {
          paramString = null;
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.a.a
 * JD-Core Version:    0.6.2
 */