package com.tencent.mm.plugin.emojicapture.model.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/StringList;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "subTag", "", "(Ljava/lang/String;)V", "list", "Ljava/util/LinkedList;", "getList", "()Ljava/util/LinkedList;", "getSubTag", "()Ljava/lang/String;", "parseTag", "", "tag", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "plugin-emojicapture_release"})
public final class j extends a
{
  private final LinkedList<String> eow;
  private final String ljK;

  public j(String paramString)
  {
    AppMethodBeat.i(2735);
    this.ljK = paramString;
    this.eow = new LinkedList();
    AppMethodBeat.o(2735);
  }

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2734);
    a.f.b.j.p(paramString, "tag");
    a.f.b.j.p(paramXmlPullParser, "parser");
    if (a.f.b.j.j(paramString, this.ljK))
      this.eow.add(d(paramXmlPullParser));
    AppMethodBeat.o(2734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.j
 * JD-Core Version:    0.6.2
 */