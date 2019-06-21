package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class f
{
  private static boolean cdt = false;

  private static void a(Map<String, String> paramMap, String paramString1, String paramString2, Node paramNode, int paramInt)
  {
    AppMethodBeat.i(125708);
    if (paramNode.getNodeName().equals("#text"))
    {
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramMap.put(paramString2, paramNode.getNodeValue());
      AppMethodBeat.o(125708);
    }
    while (true)
    {
      return;
      if (!paramNode.getNodeName().equals("#cdata-section"))
        break;
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramMap.put(paramString2, paramNode.getNodeValue());
      AppMethodBeat.o(125708);
    }
    Object localObject1 = paramString1 + "." + paramNode.getNodeName();
    paramString1 = paramString2 + "." + paramNode.getNodeName();
    if (paramInt > 0)
    {
      paramString2 = localObject1 + paramInt;
      paramMap.put(paramString2, paramNode.getNodeValue());
      paramString1 = paramString1 + "#" + paramInt;
      paramMap.put(paramString1, paramNode.getNodeValue());
      label241: localObject1 = paramNode.getAttributes();
      if (localObject1 == null);
    }
    Object localObject2;
    for (paramInt = 0; ; paramInt++)
    {
      if (paramInt >= ((NamedNodeMap)localObject1).getLength())
      {
        localObject1 = new HashMap();
        localObject2 = paramNode.getChildNodes();
        paramInt = 0;
        if (paramInt < ((NodeList)localObject2).getLength())
          break label447;
        AppMethodBeat.o(125708);
        break;
        paramMap.put(localObject1, paramNode.getNodeValue());
        paramMap.put(paramString1, paramNode.getNodeValue());
        paramString2 = (String)localObject1;
        break label241;
      }
      localObject2 = ((NamedNodeMap)localObject1).item(paramInt);
      paramMap.put(paramString2 + ".$" + ((Node)localObject2).getNodeName(), ((Node)localObject2).getNodeValue());
      paramMap.put(paramString1 + ".$" + ((Node)localObject2).getNodeName(), ((Node)localObject2).getNodeValue());
    }
    label447: Node localNode = ((NodeList)localObject2).item(paramInt);
    paramNode = (Integer)((HashMap)localObject1).get(localNode.getNodeName());
    if (paramNode == null);
    for (int i = 0; ; i = paramNode.intValue())
    {
      a(paramMap, paramString2, paramString1, localNode, i);
      ((HashMap)localObject1).put(localNode.getNodeName(), Integer.valueOf(i + 1));
      paramInt++;
      break;
    }
  }

  private static void e(Map<String, String> paramMap)
  {
    AppMethodBeat.i(125709);
    if (paramMap.size() <= 0)
    {
      System.err.println("empty values");
      AppMethodBeat.o(125709);
      return;
    }
    paramMap = paramMap.entrySet().iterator();
    while (true)
    {
      if (!paramMap.hasNext())
      {
        AppMethodBeat.o(125709);
        break;
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      System.err.println("key=" + (String)localEntry.getKey() + " value=" + (String)localEntry.getValue());
    }
  }

  // ERROR //
  public static Map<String, String> z(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 182
    //   4: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: ifnonnull +26 -> 34
    //   11: iconst_m1
    //   12: istore_3
    //   13: iload_3
    //   14: ifge +30 -> 44
    //   17: getstatic 129	java/lang/System:err	Ljava/io/PrintStream;
    //   20: ldc 184
    //   22: invokevirtual 136	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   25: ldc 182
    //   27: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_2
    //   31: astore_0
    //   32: aload_0
    //   33: areturn
    //   34: aload_0
    //   35: bipush 60
    //   37: invokevirtual 188	java/lang/String:indexOf	(I)I
    //   40: istore_3
    //   41: goto -28 -> 13
    //   44: aload_0
    //   45: astore 4
    //   47: iload_3
    //   48: ifle +25 -> 73
    //   51: getstatic 129	java/lang/System:err	Ljava/io/PrintStream;
    //   54: ldc 190
    //   56: iload_3
    //   57: invokestatic 193	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   60: invokevirtual 197	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   63: invokevirtual 136	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   66: aload_0
    //   67: iload_3
    //   68: invokevirtual 200	java/lang/String:substring	(I)Ljava/lang/String;
    //   71: astore 4
    //   73: aload 4
    //   75: ifnull +11 -> 86
    //   78: aload 4
    //   80: invokevirtual 203	java/lang/String:length	()I
    //   83: ifgt +13 -> 96
    //   86: ldc 182
    //   88: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: aload_2
    //   92: astore_0
    //   93: goto -61 -> 32
    //   96: new 84	java/util/HashMap
    //   99: dup
    //   100: invokespecial 86	java/util/HashMap:<init>	()V
    //   103: astore 5
    //   105: invokestatic 209	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   108: astore_0
    //   109: aload_0
    //   110: invokevirtual 213	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   113: astore_0
    //   114: aload_0
    //   115: ifnonnull +32 -> 147
    //   118: getstatic 129	java/lang/System:err	Ljava/io/PrintStream;
    //   121: ldc 215
    //   123: invokevirtual 136	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   126: ldc 182
    //   128: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: aload_2
    //   132: astore_0
    //   133: goto -101 -> 32
    //   136: astore_0
    //   137: ldc 182
    //   139: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: aload_2
    //   143: astore_0
    //   144: goto -112 -> 32
    //   147: new 217	org/xml/sax/InputSource
    //   150: astore 6
    //   152: new 219	java/io/ByteArrayInputStream
    //   155: astore 7
    //   157: aload 7
    //   159: aload 4
    //   161: invokevirtual 223	java/lang/String:getBytes	()[B
    //   164: invokespecial 226	java/io/ByteArrayInputStream:<init>	([B)V
    //   167: aload 6
    //   169: aload 7
    //   171: invokespecial 229	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   174: aload_0
    //   175: aload 6
    //   177: invokevirtual 235	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   180: astore_0
    //   181: aload_0
    //   182: invokeinterface 240 1 0
    //   187: aload_0
    //   188: ifnonnull +54 -> 242
    //   191: getstatic 129	java/lang/System:err	Ljava/io/PrintStream;
    //   194: ldc 242
    //   196: invokevirtual 136	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   199: ldc 182
    //   201: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: aload_2
    //   205: astore_0
    //   206: goto -174 -> 32
    //   209: astore_0
    //   210: ldc 182
    //   212: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: aload_2
    //   216: astore_0
    //   217: goto -185 -> 32
    //   220: astore_0
    //   221: ldc 182
    //   223: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: aload_2
    //   227: astore_0
    //   228: goto -196 -> 32
    //   231: astore_0
    //   232: ldc 182
    //   234: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload_2
    //   238: astore_0
    //   239: goto -207 -> 32
    //   242: aload_0
    //   243: invokeinterface 246 1 0
    //   248: astore_0
    //   249: aload_0
    //   250: ifnonnull +21 -> 271
    //   253: getstatic 129	java/lang/System:err	Ljava/io/PrintStream;
    //   256: ldc 248
    //   258: invokevirtual 136	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   261: ldc 182
    //   263: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_2
    //   267: astore_0
    //   268: goto -236 -> 32
    //   271: aload_1
    //   272: aload_0
    //   273: invokeinterface 251 1 0
    //   278: invokevirtual 34	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   281: ifeq +36 -> 317
    //   284: aload 5
    //   286: ldc 253
    //   288: ldc 253
    //   290: aload_0
    //   291: iconst_0
    //   292: invokestatic 108	com/tencent/mm/c/f:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   295: getstatic 10	com/tencent/mm/c/f:cdt	Z
    //   298: ifeq +8 -> 306
    //   301: aload 5
    //   303: invokestatic 255	com/tencent/mm/c/f:e	(Ljava/util/Map;)V
    //   306: ldc 182
    //   308: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: aload 5
    //   313: astore_0
    //   314: goto -282 -> 32
    //   317: aload_0
    //   318: aload_1
    //   319: invokeinterface 259 2 0
    //   324: astore_0
    //   325: aload_0
    //   326: invokeinterface 93 1 0
    //   331: ifgt +22 -> 353
    //   334: getstatic 129	java/lang/System:err	Ljava/io/PrintStream;
    //   337: ldc_w 261
    //   340: invokevirtual 136	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   343: ldc 182
    //   345: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   348: aload_2
    //   349: astore_0
    //   350: goto -318 -> 32
    //   353: aload_0
    //   354: invokeinterface 93 1 0
    //   359: iconst_1
    //   360: if_icmple +12 -> 372
    //   363: getstatic 129	java/lang/System:err	Ljava/io/PrintStream;
    //   366: ldc_w 263
    //   369: invokevirtual 136	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   372: aload 5
    //   374: ldc 253
    //   376: ldc 253
    //   378: aload_0
    //   379: iconst_0
    //   380: invokeinterface 100 2 0
    //   385: iconst_0
    //   386: invokestatic 108	com/tencent/mm/c/f:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   389: goto -94 -> 295
    //   392: astore_0
    //   393: aconst_null
    //   394: astore_0
    //   395: goto -208 -> 187
    //   398: astore 4
    //   400: goto -213 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   109	114	136	javax/xml/parsers/ParserConfigurationException
    //   147	181	209	org/xml/sax/SAXException
    //   181	187	209	org/xml/sax/SAXException
    //   147	181	220	java/io/IOException
    //   181	187	220	java/io/IOException
    //   147	181	231	java/lang/Exception
    //   181	187	231	java/lang/Exception
    //   147	181	392	org/w3c/dom/DOMException
    //   181	187	398	org/w3c/dom/DOMException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.f
 * JD-Core Version:    0.6.2
 */