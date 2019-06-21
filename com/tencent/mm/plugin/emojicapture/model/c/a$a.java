package com.tencent.mm.plugin.emojicapture.model.c;

import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent$Companion;", "", "()V", "TAG", "", "safeParse", "", "filePath", "xmlContent", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "plugin-emojicapture_release"})
public final class a$a
{
  // ERROR //
  public static void a(java.lang.String paramString, a parama)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: sipush 2712
    //   7: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ldc 39
    //   13: invokestatic 45	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_1
    //   17: ldc 46
    //   19: invokestatic 45	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: astore 4
    //   25: new 48	java/io/FileInputStream
    //   28: astore 5
    //   30: aload_2
    //   31: astore 4
    //   33: aload 5
    //   35: aload_0
    //   36: invokespecial 51	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   39: aload_2
    //   40: astore 4
    //   42: aload 5
    //   44: checkcast 53	java/io/InputStream
    //   47: astore_0
    //   48: invokestatic 59	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   51: astore 4
    //   53: aload 4
    //   55: ldc 61
    //   57: invokestatic 64	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   60: aload 4
    //   62: ldc 66
    //   64: iconst_0
    //   65: invokeinterface 72 3 0
    //   70: aload 4
    //   72: aload_0
    //   73: aconst_null
    //   74: invokeinterface 76 3 0
    //   79: aload 4
    //   81: invokeinterface 80 1 0
    //   86: pop
    //   87: aload_1
    //   88: aload 4
    //   90: invokevirtual 84	com/tencent/mm/plugin/emojicapture/model/c/a:f	(Lorg/xmlpull/v1/XmlPullParser;)V
    //   93: aload_0
    //   94: invokevirtual 87	java/io/InputStream:close	()V
    //   97: sipush 2712
    //   100: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: return
    //   104: astore_1
    //   105: aload_3
    //   106: astore_0
    //   107: aload_0
    //   108: astore 4
    //   110: invokestatic 93	com/tencent/mm/plugin/emojicapture/model/c/a:access$getTAG$cp	()Ljava/lang/String;
    //   113: aload_1
    //   114: checkcast 95	java/lang/Throwable
    //   117: ldc 97
    //   119: iconst_0
    //   120: anewarray 4	java/lang/Object
    //   123: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: aload_0
    //   127: ifnull +16 -> 143
    //   130: aload_0
    //   131: invokevirtual 87	java/io/InputStream:close	()V
    //   134: sipush 2712
    //   137: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: goto -37 -> 103
    //   143: sipush 2712
    //   146: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: goto -46 -> 103
    //   152: astore_0
    //   153: aload 4
    //   155: astore_1
    //   156: aload_1
    //   157: ifnull +7 -> 164
    //   160: aload_1
    //   161: invokevirtual 87	java/io/InputStream:close	()V
    //   164: sipush 2712
    //   167: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   170: aload_0
    //   171: athrow
    //   172: astore 4
    //   174: aload_0
    //   175: astore_1
    //   176: aload 4
    //   178: astore_0
    //   179: goto -23 -> 156
    //   182: astore_1
    //   183: goto -76 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   25	30	104	java/lang/Exception
    //   33	39	104	java/lang/Exception
    //   42	48	104	java/lang/Exception
    //   25	30	152	finally
    //   33	39	152	finally
    //   42	48	152	finally
    //   110	126	152	finally
    //   48	93	172	finally
    //   48	93	182	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.a.a
 * JD-Core Version:    0.6.2
 */