package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

final class a
{
  public static BindWordingContent tp(String paramString)
  {
    AppMethodBeat.i(123429);
    BindWordingContent localBindWordingContent = new BindWordingContent("", "");
    Object localObject = XmlPullParserFactory.newInstance();
    ((XmlPullParserFactory)localObject).setNamespaceAware(true);
    XmlPullParser localXmlPullParser = ((XmlPullParserFactory)localObject).newPullParser();
    localXmlPullParser.setInput(new StringReader(paramString));
    int i = localXmlPullParser.getEventType();
    paramString = "";
    if (i != 1)
    {
      localObject = paramString;
      switch (i)
      {
      default:
        localObject = paramString;
      case 3:
      case 2:
      case 4:
      }
      while (true)
      {
        i = localXmlPullParser.next();
        paramString = (String)localObject;
        break;
        localObject = localXmlPullParser.getName();
        continue;
        String str2 = localXmlPullParser.getText();
        localObject = paramString;
        if (str2 != null)
        {
          localObject = paramString;
          if (str2.trim().length() > 0)
          {
            str2 = str2.trim();
            if (paramString.equalsIgnoreCase("title"))
            {
              localBindWordingContent.title = str2;
              localObject = paramString;
            }
            else if (paramString.equalsIgnoreCase("text"))
            {
              localBindWordingContent.content = str2;
              localObject = paramString;
            }
            else
            {
              localObject = paramString;
              if (paramString.equalsIgnoreCase("type"))
                try
                {
                  localBindWordingContent.bWu = Integer.valueOf(str2);
                  localObject = paramString;
                }
                catch (Exception localException)
                {
                  localBindWordingContent.bWu = Integer.valueOf(0);
                  String str1 = paramString;
                }
            }
          }
        }
      }
    }
    AppMethodBeat.o(123429);
    return localBindWordingContent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.a
 * JD-Core Version:    0.6.2
 */