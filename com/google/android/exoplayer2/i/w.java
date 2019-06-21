package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xmlpull.v1.XmlPullParser;

public final class w
{
  public static boolean b(XmlPullParser paramXmlPullParser, String paramString)
  {
    AppMethodBeat.i(95976);
    boolean bool;
    if ((c(paramXmlPullParser)) && (paramXmlPullParser.getName().equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(95976);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95976);
    }
  }

  public static String c(XmlPullParser paramXmlPullParser, String paramString)
  {
    AppMethodBeat.i(95978);
    int i = paramXmlPullParser.getAttributeCount();
    int j = 0;
    if (j < i)
      if (paramString.equals(paramXmlPullParser.getAttributeName(j)))
      {
        paramXmlPullParser = paramXmlPullParser.getAttributeValue(j);
        AppMethodBeat.o(95978);
      }
    while (true)
    {
      return paramXmlPullParser;
      j++;
      break;
      paramXmlPullParser = null;
      AppMethodBeat.o(95978);
    }
  }

  private static boolean c(XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(95977);
    boolean bool;
    if (paramXmlPullParser.getEventType() == 2)
    {
      bool = true;
      AppMethodBeat.o(95977);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95977);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.w
 * JD-Core Version:    0.6.2
 */