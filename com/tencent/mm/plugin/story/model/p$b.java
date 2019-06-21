package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryTimelineConvert$pullXml;", "", "()V", "sb", "Ljava/lang/StringBuffer;", "getSb", "()Ljava/lang/StringBuffer;", "setSb", "(Ljava/lang/StringBuffer;)V", "xml", "", "getXml", "()Ljava/lang/String;", "addTag", "", "tag", "value", "", "emptyTag", "endTag", "setText", "", "startTag", "values", "", "text", "plugin-story_release"})
public final class p$b
{
  StringBuffer jvt;

  public p$b()
  {
    AppMethodBeat.i(109144);
    this.jvt = new StringBuffer();
    AppMethodBeat.o(109144);
  }

  public final void Fi(String paramString)
  {
    AppMethodBeat.i(109138);
    j.p(paramString, "tag");
    this.jvt.append("<" + paramString + '>');
    AppMethodBeat.o(109138);
  }

  public final void Fj(String paramString)
  {
    AppMethodBeat.i(109139);
    j.p(paramString, "tag");
    this.jvt.append("</" + paramString + '>');
    AppMethodBeat.o(109139);
  }

  public final void aaD(String paramString)
  {
    AppMethodBeat.i(109140);
    j.p(paramString, "value");
    setText(paramString);
    AppMethodBeat.o(109140);
  }

  public final void m(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(109143);
    j.p(paramString, "tag");
    j.p(paramMap, "values");
    this.jvt.append("<".concat(String.valueOf(paramString)));
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      paramString = (String)localIterator.next();
      String str = (String)paramMap.get(paramString);
      this.jvt.append(" " + paramString + "=\"" + str + "\" ");
    }
    this.jvt.append(">");
    paramMap.clear();
    AppMethodBeat.o(109143);
  }

  public final void setText(int paramInt)
  {
    AppMethodBeat.i(109142);
    this.jvt.append(paramInt);
    AppMethodBeat.o(109142);
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(109141);
    j.p(paramString, "value");
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(109141);
    while (true)
    {
      return;
      CharSequence localCharSequence = (CharSequence)paramString;
      p.a locala = p.rTj;
      if (m.a(localCharSequence, (CharSequence)p.cyp(), false))
      {
        this.jvt.append("<![CDATA[" + bo.ani(paramString) + "]]>");
        AppMethodBeat.o(109141);
      }
      else
      {
        this.jvt.append("<![CDATA[" + paramString + "]]>");
        AppMethodBeat.o(109141);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.p.b
 * JD-Core Version:    0.6.2
 */