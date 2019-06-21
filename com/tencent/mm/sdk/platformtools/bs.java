package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

@Deprecated
final class bs
{
  public static final Object a(XmlPullParser paramXmlPullParser, String[] paramArrayOfString)
  {
    AppMethodBeat.i(93603);
    int i = paramXmlPullParser.getEventType();
    int j;
    do
    {
      if (i == 2)
      {
        paramXmlPullParser = b(paramXmlPullParser, paramArrayOfString);
        AppMethodBeat.o(93603);
        return paramXmlPullParser;
      }
      if (i == 3)
      {
        paramXmlPullParser = new XmlPullParserException("Unexpected end tag at: " + paramXmlPullParser.getName());
        AppMethodBeat.o(93603);
        throw paramXmlPullParser;
      }
      if (i == 4)
      {
        paramXmlPullParser = new XmlPullParserException("Unexpected text: " + paramXmlPullParser.getText());
        AppMethodBeat.o(93603);
        throw paramXmlPullParser;
      }
      j = paramXmlPullParser.next();
      i = j;
    }
    while (j != 1);
    paramXmlPullParser = new XmlPullParserException("Unexpected end of document");
    AppMethodBeat.o(93603);
    throw paramXmlPullParser;
  }

  private static HashMap<String, Object> a(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(93599);
    HashMap localHashMap = new HashMap();
    int i = paramXmlPullParser.getEventType();
    if (i == 2)
    {
      localObject = b(paramXmlPullParser, paramArrayOfString);
      if (paramArrayOfString[0] != null)
        localHashMap.put(paramArrayOfString[0], localObject);
    }
    while (i != 3)
    {
      Object localObject;
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1)
        break;
      paramXmlPullParser = new XmlPullParserException("Document ended before " + paramString + " end tag");
      AppMethodBeat.o(93599);
      throw paramXmlPullParser;
      paramXmlPullParser = new XmlPullParserException("Map value without name attribute: " + paramXmlPullParser.getName());
      AppMethodBeat.o(93599);
      throw paramXmlPullParser;
    }
    if (paramXmlPullParser.getName().equals(paramString))
    {
      AppMethodBeat.o(93599);
      return localHashMap;
    }
    paramXmlPullParser = new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
    AppMethodBeat.o(93599);
    throw paramXmlPullParser;
  }

  private static void a(Object paramObject, String paramString, XmlSerializer paramXmlSerializer)
  {
    AppMethodBeat.i(93598);
    if (paramObject == null)
    {
      paramXmlSerializer.startTag(null, "null");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      paramXmlSerializer.endTag(null, "null");
      AppMethodBeat.o(93598);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof String))
      {
        paramXmlSerializer.startTag(null, "string");
        if (paramString != null)
          paramXmlSerializer.attribute(null, "name", paramString);
        paramXmlSerializer.text(paramObject.toString());
        paramXmlSerializer.endTag(null, "string");
        AppMethodBeat.o(93598);
      }
      else
      {
        String str;
        if ((paramObject instanceof Integer))
          str = "int";
        while (true)
        {
          paramXmlSerializer.startTag(null, str);
          if (paramString != null)
            paramXmlSerializer.attribute(null, "name", paramString);
          paramXmlSerializer.attribute(null, "value", paramObject.toString());
          paramXmlSerializer.endTag(null, str);
          AppMethodBeat.o(93598);
          break;
          if ((paramObject instanceof Long))
          {
            str = "long";
          }
          else if ((paramObject instanceof Float))
          {
            str = "float";
          }
          else if ((paramObject instanceof Double))
          {
            str = "double";
          }
          else
          {
            if (!(paramObject instanceof Boolean))
              break label228;
            str = "boolean";
          }
        }
        label228: if ((paramObject instanceof byte[]))
        {
          a((byte[])paramObject, paramString, paramXmlSerializer);
          AppMethodBeat.o(93598);
        }
        else if ((paramObject instanceof int[]))
        {
          a((int[])paramObject, paramString, paramXmlSerializer);
          AppMethodBeat.o(93598);
        }
        else if ((paramObject instanceof Map))
        {
          a((Map)paramObject, paramString, paramXmlSerializer);
          AppMethodBeat.o(93598);
        }
        else if ((paramObject instanceof List))
        {
          a((List)paramObject, paramString, paramXmlSerializer);
          AppMethodBeat.o(93598);
        }
        else if ((paramObject instanceof Set))
        {
          a((Set)paramObject, paramString, paramXmlSerializer);
          AppMethodBeat.o(93598);
        }
        else
        {
          if (!(paramObject instanceof CharSequence))
            break;
          paramXmlSerializer.startTag(null, "string");
          if (paramString != null)
            paramXmlSerializer.attribute(null, "name", paramString);
          paramXmlSerializer.text(paramObject.toString());
          paramXmlSerializer.endTag(null, "string");
          AppMethodBeat.o(93598);
        }
      }
    }
    paramObject = new RuntimeException("writeValueXml: unable to write value ".concat(String.valueOf(paramObject)));
    AppMethodBeat.o(93598);
    throw paramObject;
  }

  private static void a(List<Object> paramList, String paramString, XmlSerializer paramXmlSerializer)
  {
    AppMethodBeat.i(93594);
    if (paramList == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      AppMethodBeat.o(93594);
    }
    while (true)
    {
      return;
      paramXmlSerializer.startTag(null, "list");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      int i = paramList.size();
      for (int j = 0; j < i; j++)
        a(paramList.get(j), null, paramXmlSerializer);
      paramXmlSerializer.endTag(null, "list");
      AppMethodBeat.o(93594);
    }
  }

  public static final void a(Map<String, Object> paramMap, String paramString, XmlSerializer paramXmlSerializer)
  {
    AppMethodBeat.i(93593);
    if (paramMap == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      AppMethodBeat.o(93593);
    }
    while (true)
    {
      return;
      paramMap = paramMap.entrySet().iterator();
      paramXmlSerializer.startTag(null, "map");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      while (paramMap.hasNext())
      {
        paramString = (Map.Entry)paramMap.next();
        a(paramString.getValue(), (String)paramString.getKey(), paramXmlSerializer);
      }
      paramXmlSerializer.endTag(null, "map");
      AppMethodBeat.o(93593);
    }
  }

  private static void a(Set<Object> paramSet, String paramString, XmlSerializer paramXmlSerializer)
  {
    AppMethodBeat.i(93595);
    if (paramSet == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      AppMethodBeat.o(93595);
    }
    while (true)
    {
      return;
      paramXmlSerializer.startTag(null, "set");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
        a(paramSet.next(), null, paramXmlSerializer);
      paramXmlSerializer.endTag(null, "set");
      AppMethodBeat.o(93595);
    }
  }

  private static void a(byte[] paramArrayOfByte, String paramString, XmlSerializer paramXmlSerializer)
  {
    AppMethodBeat.i(93596);
    if (paramArrayOfByte == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      AppMethodBeat.o(93596);
    }
    while (true)
    {
      return;
      paramXmlSerializer.startTag(null, "byte-array");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      int i = paramArrayOfByte.length;
      paramXmlSerializer.attribute(null, "num", Integer.toString(i));
      paramString = new StringBuilder(paramArrayOfByte.length * 2);
      int j = 0;
      if (j < i)
      {
        int k = paramArrayOfByte[j];
        int m = k >> 4;
        if (m >= 10)
        {
          m = m + 97 - 10;
          label127: paramString.append(m);
          m = k & 0xFF;
          if (m < 10)
            break label178;
        }
        label178: for (m = m + 97 - 10; ; m += 48)
        {
          paramString.append(m);
          j++;
          break;
          m += 48;
          break label127;
        }
      }
      paramXmlSerializer.text(paramString.toString());
      paramXmlSerializer.endTag(null, "byte-array");
      AppMethodBeat.o(93596);
    }
  }

  private static void a(int[] paramArrayOfInt, String paramString, XmlSerializer paramXmlSerializer)
  {
    AppMethodBeat.i(93597);
    if (paramArrayOfInt == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      AppMethodBeat.o(93597);
    }
    while (true)
    {
      return;
      paramXmlSerializer.startTag(null, "int-array");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      int i = paramArrayOfInt.length;
      paramXmlSerializer.attribute(null, "num", Integer.toString(i));
      for (int j = 0; j < i; j++)
      {
        paramXmlSerializer.startTag(null, "item");
        paramXmlSerializer.attribute(null, "value", Integer.toString(paramArrayOfInt[j]));
        paramXmlSerializer.endTag(null, "item");
      }
      paramXmlSerializer.endTag(null, "int-array");
      AppMethodBeat.o(93597);
    }
  }

  private static final Object b(XmlPullParser paramXmlPullParser, String[] paramArrayOfString)
  {
    Object localObject = null;
    AppMethodBeat.i(93604);
    String str1 = paramXmlPullParser.getAttributeValue(null, "name");
    String str2 = paramXmlPullParser.getName();
    if (str2.equals("null"));
    int i;
    label208: label250: 
    do
    {
      i = paramXmlPullParser.next();
      if (i == 1)
        break;
      if (i == 3)
      {
        if (paramXmlPullParser.getName().equals(str2))
        {
          paramArrayOfString[0] = str1;
          AppMethodBeat.o(93604);
          while (true)
          {
            return localObject;
            if (str2.equals("string"))
            {
              localObject = "";
              do
                while (true)
                {
                  i = paramXmlPullParser.next();
                  if (i == 1)
                    break label250;
                  if (i == 3)
                  {
                    if (paramXmlPullParser.getName().equals("string"))
                    {
                      paramArrayOfString[0] = str1;
                      AppMethodBeat.o(93604);
                      break;
                    }
                    paramXmlPullParser = new XmlPullParserException("Unexpected end tag in <string>: " + paramXmlPullParser.getName());
                    AppMethodBeat.o(93604);
                    throw paramXmlPullParser;
                  }
                  if (i != 4)
                    break label208;
                  localObject = (String)localObject + paramXmlPullParser.getText();
                }
              while (i != 2);
              paramXmlPullParser = new XmlPullParserException("Unexpected start tag in <string>: " + paramXmlPullParser.getName());
              AppMethodBeat.o(93604);
              throw paramXmlPullParser;
              paramXmlPullParser = new XmlPullParserException("Unexpected end of document in <string>");
              AppMethodBeat.o(93604);
              throw paramXmlPullParser;
            }
            if (str2.equals("int"))
            {
              localObject = Integer.valueOf(Integer.parseInt(paramXmlPullParser.getAttributeValue(null, "value")));
              break;
            }
            if (str2.equals("long"))
            {
              localObject = Long.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
              break;
            }
            if (str2.equals("float"))
            {
              localObject = Float.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
              break;
            }
            if (str2.equals("double"))
            {
              localObject = Double.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
              break;
            }
            if (str2.equals("boolean"))
            {
              localObject = Boolean.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
              break;
            }
            if (str2.equals("int-array"))
            {
              paramXmlPullParser.next();
              localObject = d(paramXmlPullParser, "int-array");
              paramArrayOfString[0] = str1;
              AppMethodBeat.o(93604);
            }
            else if (str2.equals("map"))
            {
              paramXmlPullParser.next();
              localObject = a(paramXmlPullParser, "map", paramArrayOfString);
              paramArrayOfString[0] = str1;
              AppMethodBeat.o(93604);
            }
            else if (str2.equals("list"))
            {
              paramXmlPullParser.next();
              localObject = b(paramXmlPullParser, "list", paramArrayOfString);
              paramArrayOfString[0] = str1;
              AppMethodBeat.o(93604);
            }
            else
            {
              if (!str2.equals("set"))
                break label547;
              paramXmlPullParser.next();
              localObject = c(paramXmlPullParser, "set", paramArrayOfString);
              paramArrayOfString[0] = str1;
              AppMethodBeat.o(93604);
            }
          }
          paramXmlPullParser = new XmlPullParserException("Unknown tag: ".concat(String.valueOf(str2)));
          AppMethodBeat.o(93604);
          throw paramXmlPullParser;
        }
        paramXmlPullParser = new XmlPullParserException("Unexpected end tag in <" + str2 + ">: " + paramXmlPullParser.getName());
        AppMethodBeat.o(93604);
        throw paramXmlPullParser;
      }
      if (i == 4)
      {
        paramXmlPullParser = new XmlPullParserException("Unexpected text in <" + str2 + ">: " + paramXmlPullParser.getName());
        AppMethodBeat.o(93604);
        throw paramXmlPullParser;
      }
    }
    while (i != 2);
    label547: paramXmlPullParser = new XmlPullParserException("Unexpected start tag in <" + str2 + ">: " + paramXmlPullParser.getName());
    AppMethodBeat.o(93604);
    throw paramXmlPullParser;
    paramXmlPullParser = new XmlPullParserException("Unexpected end of document in <" + str2 + ">");
    AppMethodBeat.o(93604);
    throw paramXmlPullParser;
  }

  private static ArrayList<Object> b(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(93600);
    ArrayList localArrayList = new ArrayList();
    int i = paramXmlPullParser.getEventType();
    if (i == 2)
      localArrayList.add(b(paramXmlPullParser, paramArrayOfString));
    while (i != 3)
    {
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1)
        break;
      paramXmlPullParser = new XmlPullParserException("Document ended before " + paramString + " end tag");
      AppMethodBeat.o(93600);
      throw paramXmlPullParser;
    }
    if (paramXmlPullParser.getName().equals(paramString))
    {
      AppMethodBeat.o(93600);
      return localArrayList;
    }
    paramXmlPullParser = new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
    AppMethodBeat.o(93600);
    throw paramXmlPullParser;
  }

  private static HashSet<Object> c(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(93601);
    HashSet localHashSet = new HashSet();
    int i = paramXmlPullParser.getEventType();
    if (i == 2)
      localHashSet.add(b(paramXmlPullParser, paramArrayOfString));
    while (i != 3)
    {
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1)
        break;
      paramXmlPullParser = new XmlPullParserException("Document ended before " + paramString + " end tag");
      AppMethodBeat.o(93601);
      throw paramXmlPullParser;
    }
    if (paramXmlPullParser.getName().equals(paramString))
    {
      AppMethodBeat.o(93601);
      return localHashSet;
    }
    paramXmlPullParser = new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
    AppMethodBeat.o(93601);
    throw paramXmlPullParser;
  }

  // ERROR //
  private static int[] d(XmlPullParser paramXmlPullParser, String paramString)
  {
    // Byte code:
    //   0: ldc_w 319
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aconst_null
    //   8: ldc 227
    //   10: invokeinterface 245 3 0
    //   15: invokestatic 258	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   18: istore_2
    //   19: iload_2
    //   20: newarray int
    //   22: astore_3
    //   23: iconst_0
    //   24: istore 4
    //   26: aload_0
    //   27: invokeinterface 20 1 0
    //   32: istore_2
    //   33: iload_2
    //   34: iconst_2
    //   35: if_icmpne +213 -> 248
    //   38: aload_0
    //   39: invokeinterface 40 1 0
    //   44: ldc 240
    //   46: invokevirtual 82	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   49: ifeq +161 -> 210
    //   52: aload_3
    //   53: iload 4
    //   55: aload_0
    //   56: aconst_null
    //   57: ldc 120
    //   59: invokeinterface 245 3 0
    //   64: invokestatic 258	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   67: iastore
    //   68: iload 4
    //   70: istore 5
    //   72: aload_0
    //   73: invokeinterface 56 1 0
    //   78: istore 6
    //   80: iload 5
    //   82: istore 4
    //   84: iload 6
    //   86: istore_2
    //   87: iload 6
    //   89: iconst_1
    //   90: if_icmpne -57 -> 33
    //   93: new 28	org/xmlpull/v1/XmlPullParserException
    //   96: dup
    //   97: new 30	java/lang/StringBuilder
    //   100: dup
    //   101: ldc 72
    //   103: invokespecial 36	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   106: aload_1
    //   107: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: ldc 74
    //   112: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: invokespecial 48	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   121: astore_0
    //   122: ldc_w 319
    //   125: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: aload_0
    //   129: athrow
    //   130: astore_0
    //   131: new 28	org/xmlpull/v1/XmlPullParserException
    //   134: dup
    //   135: ldc_w 321
    //   138: invokespecial 48	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   141: astore_0
    //   142: ldc_w 319
    //   145: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload_0
    //   149: athrow
    //   150: astore_0
    //   151: new 28	org/xmlpull/v1/XmlPullParserException
    //   154: dup
    //   155: ldc_w 323
    //   158: invokespecial 48	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   161: astore_0
    //   162: ldc_w 319
    //   165: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: aload_0
    //   169: athrow
    //   170: astore_0
    //   171: new 28	org/xmlpull/v1/XmlPullParserException
    //   174: dup
    //   175: ldc_w 325
    //   178: invokespecial 48	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   181: astore_0
    //   182: ldc_w 319
    //   185: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: aload_0
    //   189: athrow
    //   190: astore_0
    //   191: new 28	org/xmlpull/v1/XmlPullParserException
    //   194: dup
    //   195: ldc_w 327
    //   198: invokespecial 48	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   201: astore_0
    //   202: ldc_w 319
    //   205: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: aload_0
    //   209: athrow
    //   210: new 28	org/xmlpull/v1/XmlPullParserException
    //   213: dup
    //   214: new 30	java/lang/StringBuilder
    //   217: dup
    //   218: ldc_w 329
    //   221: invokespecial 36	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: aload_0
    //   225: invokeinterface 40 1 0
    //   230: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokespecial 48	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   239: astore_0
    //   240: ldc_w 319
    //   243: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   246: aload_0
    //   247: athrow
    //   248: iload 4
    //   250: istore 5
    //   252: iload_2
    //   253: iconst_3
    //   254: if_icmpne -182 -> 72
    //   257: aload_0
    //   258: invokeinterface 40 1 0
    //   263: aload_1
    //   264: invokevirtual 82	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   267: ifeq +11 -> 278
    //   270: ldc_w 319
    //   273: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   276: aload_3
    //   277: areturn
    //   278: aload_0
    //   279: invokeinterface 40 1 0
    //   284: ldc 240
    //   286: invokevirtual 82	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   289: ifeq +12 -> 301
    //   292: iload 4
    //   294: iconst_1
    //   295: iadd
    //   296: istore 5
    //   298: goto -226 -> 72
    //   301: new 28	org/xmlpull/v1/XmlPullParserException
    //   304: dup
    //   305: new 30	java/lang/StringBuilder
    //   308: dup
    //   309: ldc 84
    //   311: invokespecial 36	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   314: aload_1
    //   315: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: ldc 86
    //   320: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: aload_0
    //   324: invokeinterface 40 1 0
    //   329: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: invokespecial 48	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   338: astore_0
    //   339: ldc_w 319
    //   342: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   345: aload_0
    //   346: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   6	19	130	java/lang/NullPointerException
    //   6	19	150	java/lang/NumberFormatException
    //   52	68	170	java/lang/NullPointerException
    //   52	68	190	java/lang/NumberFormatException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bs
 * JD-Core Version:    0.6.2
 */