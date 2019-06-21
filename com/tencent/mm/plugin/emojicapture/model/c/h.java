package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/ResourceCompressItem;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "fromPath", "", "getFromPath", "()Ljava/lang/String;", "setFromPath", "(Ljava/lang/String;)V", "toPath", "getToPath", "setToPath", "parseTag", "", "tag", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "plugin-emojicapture_release"})
public final class h extends a
{
  public String ljG = "";
  public String ljH = "";

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2731);
    j.p(paramString, "tag");
    j.p(paramXmlPullParser, "parser");
    switch (paramString.hashCode())
    {
    default:
      a(paramXmlPullParser);
      AppMethodBeat.o(2731);
    case 1996335617:
    case 2044488976:
    }
    while (true)
    {
      return;
      if (!paramString.equals("CopyFromImagePath"))
        break;
      this.ljG = d(paramXmlPullParser);
      AppMethodBeat.o(2731);
      continue;
      if (!paramString.equals("CopyToImagePath"))
        break;
      this.ljH = d(paramXmlPullParser);
      AppMethodBeat.o(2731);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.h
 * JD-Core Version:    0.6.2
 */