package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "", "()V", "ns", "", "getNs", "()Ljava/lang/String;", "next", "", "parse", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "parseTag", "tag", "readInt", "", "readString", "skip", "Companion", "plugin-emojicapture_release"})
public class a
{
  private static final String TAG = "MicroMsg.BaseXmlContent";
  public static final a.a ljn;

  static
  {
    AppMethodBeat.i(2718);
    ljn = new a.a((byte)0);
    TAG = "MicroMsg.BaseXmlContent";
    AppMethodBeat.o(2718);
  }

  protected static void a(XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2715);
    j.p(paramXmlPullParser, "parser");
    if (paramXmlPullParser.getEventType() != 2)
    {
      paramXmlPullParser = (Throwable)new IllegalStateException();
      AppMethodBeat.o(2715);
      throw paramXmlPullParser;
    }
    int i = 1;
    while (i != 0)
      switch (paramXmlPullParser.next())
      {
      default:
        break;
      case 2:
        i++;
        break;
      case 3:
        i--;
      }
    AppMethodBeat.o(2715);
  }

  protected static String d(XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2713);
    j.p(paramXmlPullParser, "parser");
    String str = "";
    if (paramXmlPullParser.next() == 4)
    {
      str = paramXmlPullParser.getText();
      j.o(str, "parser.text");
      paramXmlPullParser.nextTag();
    }
    AppMethodBeat.o(2713);
    return str;
  }

  protected static int e(XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2714);
    j.p(paramXmlPullParser, "parser");
    paramXmlPullParser = d(paramXmlPullParser);
    int i;
    if (((CharSequence)paramXmlPullParser).length() == 0)
    {
      i = 1;
      if (i == 0)
        break label50;
      AppMethodBeat.o(2714);
      i = 0;
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      label50: i = Integer.parseInt(paramXmlPullParser);
      AppMethodBeat.o(2714);
    }
  }

  protected void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2717);
    j.p(paramString, "tag");
    j.p(paramXmlPullParser, "parser");
    AppMethodBeat.o(2717);
  }

  public void f(XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2716);
    j.p(paramXmlPullParser, "parser");
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
      {
        String str = paramXmlPullParser.getName();
        if (str != null)
          a(str, paramXmlPullParser);
      }
    AppMethodBeat.o(2716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.a
 * JD-Core Version:    0.6.2
 */