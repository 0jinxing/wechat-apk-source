package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/EmoticonLensConfig;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "itemList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/EmoticonLensItem;", "getItemList", "()Ljava/util/LinkedList;", "parseTag", "", "tag", "", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "plugin-emojicapture_release"})
public final class b extends a
{
  public final LinkedList<d> ewZ;

  public b()
  {
    AppMethodBeat.i(2720);
    this.ewZ = new LinkedList();
    AppMethodBeat.o(2720);
  }

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2719);
    j.p(paramString, "tag");
    j.p(paramXmlPullParser, "parser");
    switch (paramString.hashCode())
    {
    default:
      a(paramXmlPullParser);
      AppMethodBeat.o(2719);
    case -424634494:
    case -424713737:
    case -304135898:
    }
    while (true)
    {
      return;
      if (!paramString.equals("EmoticonLensList"))
        break;
      AppMethodBeat.o(2719);
      continue;
      if (!paramString.equals("EmoticonLensItem"))
        break;
      paramString = new d();
      paramString.f(paramXmlPullParser);
      this.ewZ.add(paramString);
      ab.i(c.Ow(), String.valueOf(paramString));
      AppMethodBeat.o(2719);
      continue;
      if (!paramString.equals("EmoticonLensConfig"))
        break;
      AppMethodBeat.o(2719);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.b
 * JD-Core Version:    0.6.2
 */