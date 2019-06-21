package com.tencent.sqlitelint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

public final class CheckerWhiteListLogic
{
  private static final String ATTRIBUTE_CHECKER_NAME = "name";
  private static final String TAG = "SQLiteLint.CheckerWhiteListLogic";
  private static final String TAG_CHECKER = "checker";
  private static final String TAG_WHITE_LIST_ELEMENT = "element";

  private static void addToNative(String paramString, Map<String, List<String>> paramMap)
  {
    AppMethodBeat.i(93975);
    if (paramMap == null)
      AppMethodBeat.o(93975);
    while (true)
    {
      return;
      Iterator localIterator = paramMap.entrySet().iterator();
      String[] arrayOfString = new String[paramMap.size()];
      paramMap = new String[paramMap.size()][];
      for (int i = 0; localIterator.hasNext(); i++)
      {
        Object localObject = (Map.Entry)localIterator.next();
        arrayOfString[i] = ((String)((Map.Entry)localObject).getKey());
        localObject = (List)((Map.Entry)localObject).getValue();
        paramMap[i] = new String[((List)localObject).size()];
        for (int j = 0; j < ((List)localObject).size(); j++)
          paramMap[i][j] = ((String)((List)localObject).get(j));
      }
      SQLiteLintNativeBridge.nativeAddToWhiteList(paramString, arrayOfString, paramMap);
      AppMethodBeat.o(93975);
    }
  }

  public static void setWhiteList(Context paramContext, String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(93974);
    while (true)
    {
      XmlResourceParser localXmlResourceParser;
      try
      {
        localXmlResourceParser = paramContext.getResources().getXml(paramInt);
        if (localXmlResourceParser == null)
        {
          SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: parser null", new Object[0]);
          AppMethodBeat.o(93974);
          return;
        }
      }
      catch (Exception paramContext)
      {
        SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: getResources exp=%s", new Object[] { paramContext.getLocalizedMessage() });
        AppMethodBeat.o(93974);
        continue;
      }
      try
      {
        int i = localXmlResourceParser.getEventType();
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        paramInt = 0;
        paramContext = (Context)localObject;
        while (i != 1)
        {
          localObject = paramContext;
          switch (i)
          {
          case 1:
          default:
            SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListMap: default branch , eventType:%d", new Object[] { Integer.valueOf(i) });
            localObject = paramContext;
          case 0:
          case 3:
            localXmlResourceParser.next();
            i = localXmlResourceParser.getEventType();
            int j = paramInt + 1;
            paramContext = (Context)localObject;
            paramInt = j;
            if (j > 10000)
              SLog.e("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListMap:maybe dead loop!!", new Object[0]);
            break;
          case 2:
          }
        }
        addToNative(paramString, localHashMap);
        localXmlResourceParser.close();
        AppMethodBeat.o(93974);
        continue;
        localObject = localXmlResourceParser.getName();
        if ("checker".equalsIgnoreCase((String)localObject))
        {
          paramContext = localXmlResourceParser.getAttributeValue(null, "name");
          if ((!"element".equalsIgnoreCase((String)localObject)) || (SQLiteLintUtil.isNullOrNil(paramContext)))
            break label401;
          String str = localXmlResourceParser.nextText();
          if (localHashMap.get(paramContext) == null)
          {
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            ((List)localObject).add(str);
            localHashMap.put(paramContext, localObject);
          }
          while (true)
          {
            SLog.v("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListMap: add to whiteList[%s]: %s", new Object[] { paramContext, str });
            localObject = paramContext;
            break;
            ((List)localHashMap.get(paramContext)).add(str);
          }
        }
      }
      catch (XmlPullParserException paramContext)
      {
        while (true)
          SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: exp=%s", new Object[] { paramContext.getLocalizedMessage() });
      }
      catch (IOException paramContext)
      {
        while (true)
        {
          SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: exp=%s", new Object[] { paramContext.getLocalizedMessage() });
          continue;
          continue;
          label401: localObject = paramContext;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.CheckerWhiteListLogic
 * JD-Core Version:    0.6.2
 */