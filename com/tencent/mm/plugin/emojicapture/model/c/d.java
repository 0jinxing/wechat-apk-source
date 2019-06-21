package com.tencent.mm.plugin.emojicapture.model.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/EmoticonLensItem;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "CanIgnoreBackground", "", "getCanIgnoreBackground", "()I", "setCanIgnoreBackground", "(I)V", "EmoticonImageSubtype", "getEmoticonImageSubtype", "setEmoticonImageSubtype", "EmoticonLensCaption", "Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;", "getEmoticonLensCaption", "()Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;", "setEmoticonLensCaption", "(Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;)V", "EmoticonLensCaptionColor", "", "getEmoticonLensCaptionColor", "()Ljava/lang/String;", "setEmoticonLensCaptionColor", "(Ljava/lang/String;)V", "EmoticonLensHongbaoCaption", "Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangStringWithScene;", "getEmoticonLensHongbaoCaption", "()Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangStringWithScene;", "setEmoticonLensHongbaoCaption", "(Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangStringWithScene;)V", "EmoticonLensHongbaoName", "getEmoticonLensHongbaoName", "setEmoticonLensHongbaoName", "EmoticonLensId", "getEmoticonLensId", "setEmoticonLensId", "EmoticonLensName", "getEmoticonLensName", "setEmoticonLensName", "EmoticonLensThumbImagePath", "getEmoticonLensThumbImagePath", "setEmoticonLensThumbImagePath", "EmoticonLensTipContent", "getEmoticonLensTipContent", "setEmoticonLensTipContent", "EmoticonLensTipImageList", "Lcom/tencent/mm/plugin/emojicapture/model/xml/StringList;", "getEmoticonLensTipImageList", "()Lcom/tencent/mm/plugin/emojicapture/model/xml/StringList;", "setEmoticonLensTipImageList", "(Lcom/tencent/mm/plugin/emojicapture/model/xml/StringList;)V", "EmoticonSubtype", "getEmoticonSubtype", "setEmoticonSubtype", "EmoticonVersion", "getEmoticonVersion", "setEmoticonVersion", "getLensCaption", "scene", "getLensName", "parseTag", "", "tag", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "toString", "plugin-emojicapture_release"})
public final class d extends a
{
  private j ljA;
  private String ljo;
  public int ljp;
  private int ljq;
  public int ljr;
  private e ljs;
  private e ljt;
  private String lju;
  private e ljv;
  private f ljw;
  private String ljx;
  private int ljy;
  private e ljz;

  public d()
  {
    AppMethodBeat.i(2723);
    this.ljo = "";
    this.ljs = new e();
    this.ljt = new e();
    this.lju = "";
    this.ljv = new e();
    this.ljw = new f();
    this.ljx = "";
    this.ljz = new e();
    this.ljA = new j("EmoticonLensTipImage");
    AppMethodBeat.o(2723);
  }

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2721);
    a.f.b.j.p(paramString, "tag");
    a.f.b.j.p(paramXmlPullParser, "parser");
    switch (paramString.hashCode())
    {
    default:
      a(paramXmlPullParser);
      AppMethodBeat.o(2721);
    case 967863122:
    case 1721651866:
    case -1236821886:
    case -1325001522:
    case 1016626288:
    case 917282149:
    case 298999039:
    case 1403996450:
    case 1618061313:
    case -623746238:
    case -345334185:
    case -1251312652:
    case -424582801:
    }
    while (true)
    {
      return;
      if (!paramString.equals("EmoticonVersion"))
        break;
      this.ljr = e(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensHongbaoCaption"))
        break;
      this.ljw.f(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensCaption"))
        break;
      this.ljt.f(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensThumbImagePath"))
        break;
      this.ljx = d(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("CanIgnoreBackground"))
        break;
      this.ljy = e(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonImageSubtype"))
        break;
      this.ljq = e(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensId"))
        break;
      this.ljo = d(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensTipImageList"))
        break;
      this.ljA.f(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensCaptionColor"))
        break;
      this.lju = d(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensTipContent"))
        break;
      this.ljz.f(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensHongbaoName"))
        break;
      this.ljv.f(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonSubtype"))
        break;
      this.ljp = e(paramXmlPullParser);
      AppMethodBeat.o(2721);
      continue;
      if (!paramString.equals("EmoticonLensName"))
        break;
      this.ljs.f(paramXmlPullParser);
      AppMethodBeat.o(2721);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(2722);
    String str = "EmoticonLensItem(EmoticonLensId='" + this.ljo + "',\n EmoticonSubtype=" + this.ljp + ",\n EmoticonLensName=" + this.ljs + ",\n EmoticonLensCaption=" + this.ljt + ",\n EmoticonLensCaptionColor='" + this.lju + "',\n EmoticonLensHongbaoName=" + this.ljv + ",\n EmoticonLensHongbaoCaption=" + this.ljw + ",\n EmoticonLensThumbImagePath='" + this.ljx + "',\n CanIgnoreBackground=" + this.ljy + ",\n EmoticonLensTipContent=" + this.ljz + ')';
    AppMethodBeat.o(2722);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.d
 * JD-Core Version:    0.6.2
 */