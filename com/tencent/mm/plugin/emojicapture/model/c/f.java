package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangStringWithScene;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "sceneList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;", "getSceneList", "()Ljava/util/LinkedList;", "get", "", "scene", "", "parseTag", "", "tag", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "plugin-emojicapture_release"})
public final class f extends a
{
  private final LinkedList<e> fEM;

  public f()
  {
    AppMethodBeat.i(2727);
    this.fEM = new LinkedList();
    AppMethodBeat.o(2727);
  }

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2726);
    j.p(paramString, "tag");
    j.p(paramXmlPullParser, "parser");
    switch (paramString.hashCode())
    {
    default:
    case -32256679:
    }
    while (true)
    {
      AppMethodBeat.o(2726);
      return;
      if (paramString.equals("EmoticonLensTranslationInScenes"))
      {
        paramString = new e();
        paramString.f(paramXmlPullParser);
        this.fEM.add(paramString);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.f
 * JD-Core Version:    0.6.2
 */