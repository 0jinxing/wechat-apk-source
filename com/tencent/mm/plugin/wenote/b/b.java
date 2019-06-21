package com.tencent.mm.plugin.wenote.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  public static ArrayList<String> ahg(String paramString)
  {
    AppMethodBeat.i(26977);
    if ((bo.isNullOrNil(paramString)) || (paramString.length() == 0))
    {
      paramString = null;
      AppMethodBeat.o(26977);
    }
    while (true)
    {
      return paramString;
      paramString = Pattern.compile("<div><object[^>]*></object></div>", 2).matcher(paramString).replaceAll("<object>");
      paramString = Pattern.compile("<object[^>]*>", 2).matcher(paramString).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#");
      paramString = Pattern.compile("<hr[^>]*>", 2).matcher(paramString).replaceAll("#WNNoteNode#<ThisisNoteNodeHrObj>#WNNoteNode#");
      paramString = Pattern.compile("</object>", 2).matcher(paramString).replaceAll("");
      paramString = Pattern.compile("<div></div>", 2).matcher(paramString).replaceAll("");
      String[] arrayOfString = Pattern.compile("\n", 2).matcher(paramString).replaceAll("").replaceAll("<br>", "<br/>").trim().split("#WNNoteNode#");
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < arrayOfString.length; i++)
      {
        paramString = arrayOfString[i];
        if (paramString.length() > 0)
        {
          String str = paramString.replace("</div>", "<div>");
          int j = -1;
          if (str.endsWith("<div>"))
            j = str.lastIndexOf("<div>");
          paramString = str;
          if (j > 0)
            paramString = str.substring(0, j);
          localArrayList.add(paramString.replace("<div><br/>", "<div>"));
        }
      }
      AppMethodBeat.o(26977);
      paramString = localArrayList;
    }
  }

  public static String ahh(String paramString)
  {
    AppMethodBeat.i(26978);
    if ((bo.isNullOrNil(paramString)) || (paramString.length() == 0))
      AppMethodBeat.o(26978);
    while (true)
    {
      return paramString;
      paramString = Pattern.compile("<br[^>]*>", 2).matcher(paramString).replaceAll("\n");
      paramString = Pattern.compile("<div>", 2).matcher(paramString).replaceAll("");
      paramString = Pattern.compile("</wx-li>", 2).matcher(paramString).replaceAll("\n");
      paramString = Pattern.compile("</wx-todo>", 2).matcher(paramString).replaceAll("\n");
      paramString = Pattern.compile("<hr[^>]*>", 2).matcher(paramString).replaceAll("\n");
      paramString = Pattern.compile("<p [^>]*>", 2).matcher(paramString).replaceAll("");
      paramString = Pattern.compile("</p>", 2).matcher(paramString).replaceAll("");
      paramString = Pattern.compile("<[^>]*>", 2).matcher(paramString).replaceAll("");
      paramString = Pattern.compile("&nbsp;", 2).matcher(paramString).replaceAll(" ");
      AppMethodBeat.o(26978);
    }
  }

  public static boolean ahi(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(26979);
    int i = "<br/>".length();
    if ((bo.isNullOrNil(paramString)) || (paramString.length() < i))
      AppMethodBeat.o(26979);
    while (true)
    {
      return bool;
      int k;
      for (int j = 0; ; j = k)
      {
        if (j >= paramString.length())
          break label100;
        k = j + i;
        if (k > paramString.length())
        {
          AppMethodBeat.o(26979);
          break;
        }
        if (!"<br/>".equalsIgnoreCase(paramString.substring(j, k)))
        {
          AppMethodBeat.o(26979);
          break;
        }
      }
      label100: bool = true;
      AppMethodBeat.o(26979);
    }
  }

  public static String ahj(String paramString)
  {
    AppMethodBeat.i(26980);
    paramString = ahh(Pattern.compile("<object[^>]*>", 2).matcher(paramString).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#"));
    if ((bo.isNullOrNil(paramString)) || (paramString.length() == 0))
      AppMethodBeat.o(26980);
    while (true)
    {
      return paramString;
      paramString = Pattern.compile("\\s*|\t|\r|\n").matcher(paramString).replaceAll("");
      AppMethodBeat.o(26980);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.b.b
 * JD-Core Version:    0.6.2
 */