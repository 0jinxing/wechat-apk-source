package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "scene", "", "getScene", "()I", "setScene", "(I)V", "textCn", "", "getTextCn", "()Ljava/lang/String;", "setTextCn", "(Ljava/lang/String;)V", "textEn", "getTextEn", "setTextEn", "textHk", "getTextHk", "setTextHk", "textTw", "getTextTw", "setTextTw", "get", "parseTag", "", "tag", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "toString", "plugin-emojicapture_release"})
public final class e extends a
{
  private String ljB = "";
  private String ljC = "";
  private String ljD = "";
  private String ljE = "";
  private int scene;

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2724);
    j.p(paramString, "tag");
    j.p(paramXmlPullParser, "parser");
    switch (paramString.hashCode())
    {
    default:
      AppMethodBeat.o(2724);
    case 115861812:
    case 115861428:
    case 142587723:
    case 3241:
    case 115861276:
    }
    while (true)
    {
      return;
      if (!paramString.equals("zh_TW"))
        break;
      this.ljC = d(paramXmlPullParser);
      AppMethodBeat.o(2724);
      continue;
      if (!paramString.equals("zh_HK"))
        break;
      this.ljD = d(paramXmlPullParser);
      AppMethodBeat.o(2724);
      continue;
      if (!paramString.equals("EmoticonLensScenes"))
        break;
      this.scene = e(paramXmlPullParser);
      AppMethodBeat.o(2724);
      continue;
      if (!paramString.equals("en"))
        break;
      this.ljE = d(paramXmlPullParser);
      break;
      if (!paramString.equals("zh_CN"))
        break;
      this.ljB = d(paramXmlPullParser);
      AppMethodBeat.o(2724);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(2725);
    String str = "MultiLangString(textCn='" + this.ljB + "', textTw='" + this.ljC + "', textHk='" + this.ljD + "', textEn='" + this.ljE + "')";
    AppMethodBeat.o(2725);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.e
 * JD-Core Version:    0.6.2
 */