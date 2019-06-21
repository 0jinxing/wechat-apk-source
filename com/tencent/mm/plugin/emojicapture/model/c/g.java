package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/ResourceCompressConfig;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "copyList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/ResourceCompressItem;", "getCopyList", "()Ljava/util/LinkedList;", "parse", "", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "parseTag", "tag", "", "plugin-emojicapture_release"})
public final class g extends a
{
  public final LinkedList<h> ljF;

  public g()
  {
    AppMethodBeat.i(2730);
    this.ljF = new LinkedList();
    AppMethodBeat.o(2730);
  }

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2729);
    j.p(paramString, "tag");
    j.p(paramXmlPullParser, "parser");
    switch (paramString.hashCode())
    {
    default:
    case 180673241:
    }
    while (true)
    {
      a(paramXmlPullParser);
      AppMethodBeat.o(2729);
      while (true)
      {
        return;
        if (!paramString.equals("EmoticonLensResouceCompreItem"))
          break;
        paramString = new h();
        paramString.f(paramXmlPullParser);
        this.ljF.add(paramString);
        AppMethodBeat.o(2729);
      }
    }
  }

  public final void f(XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2728);
    j.p(paramXmlPullParser, "parser");
    paramXmlPullParser.nextTag();
    super.f(paramXmlPullParser);
    AppMethodBeat.o(2728);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.g
 * JD-Core Version:    0.6.2
 */