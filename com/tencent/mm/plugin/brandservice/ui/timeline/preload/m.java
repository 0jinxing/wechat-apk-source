package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.b.j;
import a.k.i;
import a.k.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"isMpArticleUrl", "", "", "(Ljava/lang/String;)Z", "isMpUrl", "clearShortUrl", "rawUrl", "appendStats", "session", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "appendUrlParam", "param", "value", "clearUrlParam", "getUrlParam", "getUrlParamPairRegex", "Lkotlin/text/Regex;", "getUrlParamRegex", "plugin-brandservice_release"})
public final class m
{
  public static final boolean FC(java.lang.String paramString)
  {
    AppMethodBeat.i(14976);
    j.p(paramString, "receiver$0");
    boolean bool;
    if ((a.k.m.jb(paramString, "https://mp.weixin.qq.com/")) || (a.k.m.jb(paramString, "http://mp.weixin.qq.com/")))
    {
      bool = true;
      AppMethodBeat.o(14976);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14976);
    }
  }

  public static final java.lang.String FT(java.lang.String paramString)
  {
    AppMethodBeat.i(14971);
    j.p(paramString, "rawUrl");
    for (int i = 0; i < 9; i++)
      paramString = dh(paramString, new java.lang.String[] { "sessionid", "subscene", "scene", "ascene", "fasttmpl_type", "fasttmpl_fullversion", "fasttmpl_flag", "realreporttime", "reporttime" }[i]);
    char[] arrayOfChar = new char[2];
    char[] tmp91_90 = arrayOfChar;
    tmp91_90[0] = 63;
    char[] tmp96_91 = tmp91_90;
    tmp96_91[1] = 38;
    tmp96_91;
    j.p(paramString, "receiver$0");
    j.p(arrayOfChar, "chars");
    paramString = (CharSequence)paramString;
    int j = paramString.length() - 1;
    if (j >= 0)
    {
      int k = paramString.charAt(j);
      j.p(arrayOfChar, "receiver$0");
      j.p(arrayOfChar, "receiver$0");
      i = 0;
      label155: if (i < 2)
        if (k == arrayOfChar[i])
        {
          label168: if (i < 0)
            break label213;
          i = 1;
          label174: if (i != 0)
            break label218;
        }
    }
    for (paramString = paramString.subSequence(0, j + 1); ; paramString = (CharSequence)"")
    {
      paramString = paramString.toString();
      AppMethodBeat.o(14971);
      return paramString;
      i++;
      break label155;
      i = -1;
      break label168;
      label213: i = 0;
      break label174;
      label218: j--;
      break;
    }
  }

  private static final k FU(java.lang.String paramString)
  {
    AppMethodBeat.i(14973);
    paramString = new k("(?<=" + paramString + "=).+?(?=&)");
    AppMethodBeat.o(14973);
    return paramString;
  }

  private static final k FV(java.lang.String paramString)
  {
    AppMethodBeat.i(14974);
    paramString = new k("(?<=[?|&])" + paramString + "=.+?(?:&|$)");
    AppMethodBeat.o(14974);
    return paramString;
  }

  public static final boolean FW(java.lang.String paramString)
  {
    AppMethodBeat.i(14977);
    j.p(paramString, "receiver$0");
    boolean bool;
    if ((a.k.m.jb(paramString, "https://mp.weixin.qq.com/s?")) || (a.k.m.jb(paramString, "http://mp.weixin.qq.com/s?")))
    {
      bool = true;
      AppMethodBeat.o(14977);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14977);
    }
  }

  public static final java.lang.String G(java.lang.String paramString1, java.lang.String paramString2, java.lang.String paramString3)
  {
    AppMethodBeat.i(14978);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "param");
    j.p(paramString3, "value");
    List localList = a.k.m.a((CharSequence)paramString1, new java.lang.String[] { "#" });
    paramString1 = (java.lang.String)localList.get(0);
    if (!a.k.m.a((CharSequence)paramString1, (CharSequence)"?", false))
      paramString1 = paramString1 + "?";
    while (true)
    {
      if (a.k.m.d((CharSequence)paramString1, (CharSequence)(paramString2 + '=')))
      {
        paramString1 = (CharSequence)paramString1;
        paramString1 = FU(paramString2).c(paramString1, paramString3);
        if (localList.size() <= 1)
          break label243;
        paramString1 = paramString1 + '#' + (java.lang.String)localList.get(1);
        AppMethodBeat.o(14978);
      }
      while (true)
      {
        return paramString1;
        StringBuilder localStringBuilder = new StringBuilder().append(paramString1);
        if (a.k.m.jc(paramString1, "?"));
        for (paramString1 = ""; ; paramString1 = "&")
        {
          paramString1 = paramString1 + paramString2 + '=' + paramString3;
          break;
        }
        label243: AppMethodBeat.o(14978);
      }
    }
  }

  public static final java.lang.String a(java.lang.String paramString, PreloadLogic.PreloadSession paramPreloadSession)
  {
    AppMethodBeat.i(14972);
    j.p(paramString, "receiver$0");
    j.p(paramPreloadSession, "session");
    if (!a.k.m.a((CharSequence)paramString, (CharSequence)"mp.weixin.qq.com", false))
    {
      AppMethodBeat.o(14972);
      return paramString;
    }
    if (paramPreloadSession.jSZ);
    for (int i = 1; ; i = 0)
    {
      int j = i;
      if (paramPreloadSession.jTa)
        j = i | 0x2;
      int k = j;
      if (paramPreloadSession.jTb)
        k = j | 0x4;
      i = k;
      if (paramPreloadSession.jTc)
        i = k | 0x8;
      j = i;
      if (paramPreloadSession.jTd)
        j = i | 0x10;
      i = j;
      if (paramPreloadSession.jTe)
        i = j | 0x20;
      java.lang.String[] arrayOfString1 = { "sessionid", java.lang.String.valueOf(paramPreloadSession.id) };
      k = paramPreloadSession.jSW;
      java.lang.String[] arrayOfString2 = { "scene", java.lang.String.valueOf(paramPreloadSession.jSu) };
      java.lang.String[] arrayOfString3 = { "ascene", java.lang.String.valueOf(paramPreloadSession.jSX) };
      java.lang.String[] arrayOfString4 = { "fasttmpl_type", java.lang.String.valueOf(paramPreloadSession.jSV) };
      paramPreloadSession = new java.lang.String[] { "fasttmpl_fullversion", paramPreloadSession.jSY };
      java.lang.String[] arrayOfString5 = { "fasttmpl_flag", java.lang.String.valueOf(i) };
      long l = System.currentTimeMillis();
      for (j = 0; j < 8; j++)
      {
        [Ljava.lang.String localString; = new java.lang.String[][] { arrayOfString1, { "subscene", java.lang.String.valueOf(k) }, arrayOfString2, arrayOfString3, arrayOfString4, paramPreloadSession, arrayOfString5, { "realreporttime", java.lang.String.valueOf(l) } }[j];
        paramString = G(paramString, localString;[0], localString;[1]);
      }
      AppMethodBeat.o(14972);
      break;
    }
  }

  public static final java.lang.String dg(java.lang.String paramString1, java.lang.String paramString2)
  {
    AppMethodBeat.i(14975);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "param");
    paramString1 = k.a(FU(paramString2), (CharSequence)paramString1);
    if (paramString1 != null)
    {
      paramString1 = paramString1.getValue();
      AppMethodBeat.o(14975);
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(14975);
    }
  }

  public static final java.lang.String dh(java.lang.String paramString1, java.lang.String paramString2)
  {
    AppMethodBeat.i(14979);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "param");
    paramString1 = (CharSequence)a.k.m.a((CharSequence)paramString1, new java.lang.String[] { "#" }).get(0);
    paramString1 = FV(paramString2).c(paramString1, "");
    AppMethodBeat.o(14979);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.m
 * JD-Core Version:    0.6.2
 */