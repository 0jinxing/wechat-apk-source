package com.tencent.ttpic.util;

import android.content.Context;
import android.util.Xml;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlSerializer;

public class ResourcePathMapper
{
  public static boolean COPY_XML = false;
  public static final String RES_PREFIX_ASSETS = "assets://";
  private static Map<String, String> lutFilterIdMap;
  private static Map<String, ResourcePathMapper.ResourcePath> resMap;
  private static String resPathXml;

  static
  {
    AppMethodBeat.i(83963);
    COPY_XML = true;
    lutFilterIdMap = new HashMap();
    resMap = new HashMap();
    AppMethodBeat.o(83963);
  }

  private static String bufferedReaderFile(String paramString)
  {
    AppMethodBeat.i(83960);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(83960);
    }
    while (true)
    {
      return paramString;
      paramString = new File(paramString);
      if ((!paramString.exists()) || (paramString.isDirectory()))
      {
        paramString = new FileNotFoundException();
        AppMethodBeat.o(83960);
        throw paramString;
      }
      BufferedReader localBufferedReader = new BufferedReader(new FileReader(paramString));
      StringBuffer localStringBuffer = new StringBuffer();
      for (paramString = localBufferedReader.readLine(); paramString != null; paramString = localBufferedReader.readLine())
        localStringBuffer.append(paramString + " ");
      localBufferedReader.close();
      paramString = localStringBuffer.toString();
      AppMethodBeat.o(83960);
    }
  }

  public static boolean checkFileExist(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(83961);
    if (paramString == null)
      AppMethodBeat.o(83961);
    while (true)
    {
      return bool;
      if (new File(paramString).exists())
      {
        bool = true;
        AppMethodBeat.o(83961);
      }
      else
      {
        AppMethodBeat.o(83961);
      }
    }
  }

  private static void clearResourceMap()
  {
    AppMethodBeat.i(83959);
    if ((resMap != null) && (!resMap.isEmpty()))
    {
      Iterator localIterator = resMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ResourcePathMapper.ResourcePath localResourcePath = (ResourcePathMapper.ResourcePath)resMap.get(str);
        if ((localResourcePath.getType().equals("model")) || (localResourcePath.getType().equals("so")))
        {
          localResourcePath.setPath("");
          resMap.put(str, localResourcePath);
        }
      }
    }
    AppMethodBeat.o(83959);
  }

  public static String getFilterResPath(String paramString)
  {
    AppMethodBeat.i(83953);
    if (paramString == null)
    {
      AppMethodBeat.o(83953);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      String str = paramString.substring(paramString.lastIndexOf('/') + 1);
      paramString = (String)lutFilterIdMap.get(str);
      if (paramString != null)
      {
        paramString = getResPath(paramString) + str;
        AppMethodBeat.o(83953);
      }
      else
      {
        AppMethodBeat.o(83953);
        paramString = null;
      }
    }
  }

  public static String getModelResPath(String paramString)
  {
    AppMethodBeat.i(83956);
    if (paramString == null)
    {
      AppMethodBeat.o(83956);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = (String)lutFilterIdMap.get(paramString);
      if (paramString != null)
      {
        paramString = getResPath(paramString);
        AppMethodBeat.o(83956);
      }
      else
      {
        AppMethodBeat.o(83956);
        paramString = null;
      }
    }
  }

  public static String getResPath(String paramString)
  {
    AppMethodBeat.i(83954);
    if (paramString == null)
    {
      AppMethodBeat.o(83954);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = (ResourcePathMapper.ResourcePath)resMap.get(paramString);
      if ((paramString != null) && (!paramString.getPath().equals("")))
      {
        paramString = paramString.getPath();
        AppMethodBeat.o(83954);
      }
      else
      {
        AppMethodBeat.o(83954);
        paramString = null;
      }
    }
  }

  public static void init(ResourcePathMapper.MODE paramMODE)
  {
    AppMethodBeat.i(83951);
    String str = VideoGlobalContext.getContext().getFilesDir().getAbsolutePath() + File.separator + "resource_path.xml";
    resPathXml = str;
    if ((!checkFileExist(str)) || (COPY_XML))
    {
      FileUtils.copyAssets(VideoGlobalContext.getContext(), "resource_path.xml", resPathXml);
      COPY_XML = false;
    }
    parseXml(resPathXml, resMap, lutFilterIdMap);
    if (paramMODE == ResourcePathMapper.MODE.REMOTE)
      clearResourceMap();
    AppMethodBeat.o(83951);
  }

  // ERROR //
  private static void parseXml(String paramString, Map<String, ResourcePathMapper.ResourcePath> paramMap, Map<String, String> paramMap1)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 224
    //   4: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokestatic 201	com/tencent/ttpic/util/ResourcePathMapper:checkFileExist	(Ljava/lang/String;)Z
    //   11: ifeq +11 -> 22
    //   14: aload_1
    //   15: ifnull +7 -> 22
    //   18: aload_2
    //   19: ifnonnull +9 -> 28
    //   22: ldc 224
    //   24: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: return
    //   28: invokestatic 230	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
    //   31: invokevirtual 234	org/xmlpull/v1/XmlPullParserFactory:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   34: astore 4
    //   36: new 236	java/io/StringReader
    //   39: astore 5
    //   41: aload 5
    //   43: aload_0
    //   44: invokestatic 238	com/tencent/ttpic/util/ResourcePathMapper:bufferedReaderFile	(Ljava/lang/String;)Ljava/lang/String;
    //   47: invokespecial 239	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   50: aload 4
    //   52: aload 5
    //   54: invokeinterface 244 2 0
    //   59: aload 4
    //   61: invokeinterface 248 1 0
    //   66: istore 6
    //   68: aload_3
    //   69: astore_0
    //   70: iload 6
    //   72: iconst_1
    //   73: if_icmpeq +252 -> 325
    //   76: aload 4
    //   78: invokeinterface 251 1 0
    //   83: astore 5
    //   85: iload 6
    //   87: tableswitch	default:+17 -> 104, 2:+42->129
    //   105: astore_3
    //   106: aload 4
    //   108: invokeinterface 253 1 0
    //   113: istore 6
    //   115: aload_3
    //   116: astore_0
    //   117: goto -47 -> 70
    //   120: astore_0
    //   121: ldc 224
    //   123: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: goto -99 -> 27
    //   129: ldc 255
    //   131: aload 5
    //   133: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   136: ifeq +137 -> 273
    //   139: aload 4
    //   141: aconst_null
    //   142: ldc_w 257
    //   145: invokeinterface 261 3 0
    //   150: astore 5
    //   152: aload 4
    //   154: aconst_null
    //   155: ldc_w 263
    //   158: invokeinterface 261 3 0
    //   163: astore 7
    //   165: aload 4
    //   167: aconst_null
    //   168: ldc_w 265
    //   171: invokeinterface 261 3 0
    //   176: astore 8
    //   178: aload 4
    //   180: aconst_null
    //   181: ldc_w 267
    //   184: invokeinterface 261 3 0
    //   189: astore_0
    //   190: aload_0
    //   191: ifnull +142 -> 333
    //   194: aload_0
    //   195: ldc 148
    //   197: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   200: ifne +133 -> 333
    //   203: aload_0
    //   204: getstatic 195	java/io/File:separator	Ljava/lang/String;
    //   207: invokevirtual 270	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   210: ifne +123 -> 333
    //   213: new 83	java/lang/StringBuilder
    //   216: astore_3
    //   217: aload_3
    //   218: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   221: aload_3
    //   222: aload_0
    //   223: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: getstatic 195	java/io/File:separator	Ljava/lang/String;
    //   229: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: astore_0
    //   236: new 8	com/tencent/ttpic/util/ResourcePathMapper$ResourcePath
    //   239: astore_3
    //   240: aload_3
    //   241: aload 7
    //   243: aload 5
    //   245: aload 8
    //   247: aload_0
    //   248: invokespecial 273	com/tencent/ttpic/util/ResourcePathMapper$ResourcePath:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   251: aload_1
    //   252: aload 7
    //   254: aload_3
    //   255: invokeinterface 155 3 0
    //   260: pop
    //   261: goto -155 -> 106
    //   264: astore_0
    //   265: ldc 224
    //   267: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: goto -243 -> 27
    //   273: aload_0
    //   274: astore_3
    //   275: ldc_w 275
    //   278: aload 5
    //   280: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   283: ifeq -177 -> 106
    //   286: aload 4
    //   288: invokeinterface 278 1 0
    //   293: astore_3
    //   294: aload_0
    //   295: aload_3
    //   296: invokevirtual 281	com/tencent/ttpic/util/ResourcePathMapper$ResourcePath:addItem	(Ljava/lang/String;)V
    //   299: aload_2
    //   300: aload_3
    //   301: aload_0
    //   302: invokevirtual 284	com/tencent/ttpic/util/ResourcePathMapper$ResourcePath:getId	()Ljava/lang/String;
    //   305: invokeinterface 155 3 0
    //   310: pop
    //   311: aload_0
    //   312: astore_3
    //   313: goto -207 -> 106
    //   316: astore_0
    //   317: ldc 224
    //   319: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: goto -295 -> 27
    //   325: ldc 224
    //   327: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   330: goto -303 -> 27
    //   333: goto -97 -> 236
    //
    // Exception table:
    //   from	to	target	type
    //   36	59	120	java/lang/Exception
    //   76	85	264	java/io/IOException
    //   106	115	264	java/io/IOException
    //   129	190	264	java/io/IOException
    //   194	236	264	java/io/IOException
    //   236	261	264	java/io/IOException
    //   275	311	264	java/io/IOException
    //   28	36	316	org/xmlpull/v1/XmlPullParserException
    //   36	59	316	org/xmlpull/v1/XmlPullParserException
    //   59	68	316	org/xmlpull/v1/XmlPullParserException
    //   76	85	316	org/xmlpull/v1/XmlPullParserException
    //   106	115	316	org/xmlpull/v1/XmlPullParserException
    //   129	190	316	org/xmlpull/v1/XmlPullParserException
    //   194	236	316	org/xmlpull/v1/XmlPullParserException
    //   236	261	316	org/xmlpull/v1/XmlPullParserException
    //   275	311	316	org/xmlpull/v1/XmlPullParserException
    //   325	330	316	org/xmlpull/v1/XmlPullParserException
  }

  public static void printMap()
  {
    AppMethodBeat.i(83962);
    if (resMap != null)
      new StringBuilder("resMap.size = ").append(resMap.size());
    Iterator localIterator = resMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      new StringBuilder("resMap = ").append(((ResourcePathMapper.ResourcePath)resMap.get(str)).getId()).append(", ").append(((ResourcePathMapper.ResourcePath)resMap.get(str)).getName());
    }
    AppMethodBeat.o(83962);
  }

  public static void setResPath(String paramString1, String paramString2)
  {
    AppMethodBeat.i(83955);
    if ((paramString1 == null) || (paramString2 == null))
      AppMethodBeat.o(83955);
    while (true)
    {
      return;
      String str = paramString2;
      if (!paramString2.endsWith(File.separator))
        str = paramString2 + File.separator;
      paramString2 = (ResourcePathMapper.ResourcePath)resMap.get(paramString1);
      if (paramString2 != null)
      {
        paramString2.setPath(str);
        resMap.put(paramString1, paramString2);
      }
      AppMethodBeat.o(83955);
    }
  }

  public static void updateResoucePathStorage()
  {
    AppMethodBeat.i(83952);
    updateXmlFile(resMap, resPathXml);
    AppMethodBeat.o(83952);
  }

  private static void updateXmlFile(Map<String, ResourcePathMapper.ResourcePath> paramMap, String paramString)
  {
    AppMethodBeat.i(83957);
    if ((paramMap == null) || (paramString == null))
      AppMethodBeat.o(83957);
    while (true)
    {
      return;
      Object localObject1 = new File(paramString);
      if (((File)localObject1).exists())
        ((File)localObject1).delete();
      try
      {
        ((File)localObject1).createNewFile();
        while (true)
        {
          try
          {
            label47: paramString = new java/io/FileOutputStream;
            paramString.<init>((File)localObject1);
            localObject1 = Xml.newSerializer();
            try
            {
              ((XmlSerializer)localObject1).setOutput(paramString, "UTF-8");
              ((XmlSerializer)localObject1).startDocument(null, Boolean.TRUE);
              ((XmlSerializer)localObject1).startTag(null, "resources");
              Iterator localIterator1 = paramMap.keySet().iterator();
              if (!localIterator1.hasNext())
                break label307;
              Object localObject2 = (ResourcePathMapper.ResourcePath)paramMap.get((String)localIterator1.next());
              ((XmlSerializer)localObject1).startTag(null, "resource");
              ((XmlSerializer)localObject1).attribute(null, "type", ((ResourcePathMapper.ResourcePath)localObject2).getType());
              ((XmlSerializer)localObject1).attribute(null, "id", ((ResourcePathMapper.ResourcePath)localObject2).getId());
              ((XmlSerializer)localObject1).attribute(null, "name", ((ResourcePathMapper.ResourcePath)localObject2).getName());
              ((XmlSerializer)localObject1).attribute(null, "path", ((ResourcePathMapper.ResourcePath)localObject2).getPath());
              Iterator localIterator2 = ((ResourcePathMapper.ResourcePath)localObject2).getItems().iterator();
              if (!localIterator2.hasNext())
                break label294;
              localObject2 = (String)localIterator2.next();
              ((XmlSerializer)localObject1).startTag(null, "item");
              ((XmlSerializer)localObject1).text((String)localObject2);
              ((XmlSerializer)localObject1).endTag(null, "item");
              continue;
            }
            catch (Exception paramMap)
            {
              AppMethodBeat.o(83957);
            }
          }
          catch (FileNotFoundException paramMap)
          {
            AppMethodBeat.o(83957);
          }
          break;
          label294: ((XmlSerializer)localObject1).endTag(null, "resource");
        }
        label307: ((XmlSerializer)localObject1).endTag(null, "resources");
        ((XmlSerializer)localObject1).endDocument();
        ((XmlSerializer)localObject1).flush();
        paramString.close();
        AppMethodBeat.o(83957);
      }
      catch (IOException paramString)
      {
        break label47;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.ResourcePathMapper
 * JD-Core Version:    0.6.2
 */