package com.tencent.mm.platformtools;

public final class ag
{
  public final int action;
  public final String content;
  public final int cvG;
  public final int errorCode;
  public final int gjG;
  public final String title;
  public final int type;
  public final String url;

  // ERROR //
  public ag(int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 21	java/lang/Object:<init>	()V
    //   4: ldc 22
    //   6: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: ldc 30
    //   11: astore 4
    //   13: iconst_5
    //   14: istore 5
    //   16: aload_3
    //   17: ldc 32
    //   19: invokestatic 38	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   22: astore 6
    //   24: aload 6
    //   26: ifnonnull +100 -> 126
    //   29: new 40	java/lang/IllegalArgumentException
    //   32: astore_3
    //   33: aload_3
    //   34: ldc 42
    //   36: invokespecial 45	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   39: ldc 22
    //   41: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aload_3
    //   45: athrow
    //   46: astore 6
    //   48: ldc 30
    //   50: astore 7
    //   52: ldc 30
    //   54: astore_3
    //   55: iconst_0
    //   56: istore 8
    //   58: iconst_0
    //   59: istore 9
    //   61: ldc 50
    //   63: aload 6
    //   65: invokevirtual 54	java/lang/Exception:toString	()Ljava/lang/String;
    //   68: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   71: aload 4
    //   73: astore 6
    //   75: aload_0
    //   76: iload_2
    //   77: putfield 61	com/tencent/mm/platformtools/ag:errorCode	I
    //   80: aload_0
    //   81: iload_1
    //   82: putfield 63	com/tencent/mm/platformtools/ag:cvG	I
    //   85: aload_0
    //   86: iload 9
    //   88: putfield 65	com/tencent/mm/platformtools/ag:type	I
    //   91: aload_0
    //   92: iload 8
    //   94: putfield 67	com/tencent/mm/platformtools/ag:action	I
    //   97: aload_0
    //   98: aload 6
    //   100: putfield 69	com/tencent/mm/platformtools/ag:content	Ljava/lang/String;
    //   103: aload_0
    //   104: iload 5
    //   106: putfield 71	com/tencent/mm/platformtools/ag:gjG	I
    //   109: aload_0
    //   110: aload 7
    //   112: putfield 73	com/tencent/mm/platformtools/ag:title	Ljava/lang/String;
    //   115: aload_0
    //   116: aload_3
    //   117: putfield 75	com/tencent/mm/platformtools/ag:url	Ljava/lang/String;
    //   120: ldc 22
    //   122: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: return
    //   126: aload 6
    //   128: ldc 77
    //   130: invokeinterface 83 2 0
    //   135: checkcast 85	java/lang/String
    //   138: invokestatic 91	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   141: invokevirtual 95	java/lang/Integer:intValue	()I
    //   144: istore 9
    //   146: aload 6
    //   148: ldc 97
    //   150: invokeinterface 83 2 0
    //   155: checkcast 85	java/lang/String
    //   158: invokestatic 91	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   161: invokevirtual 95	java/lang/Integer:intValue	()I
    //   164: istore 8
    //   166: aload 6
    //   168: ldc 99
    //   170: invokeinterface 83 2 0
    //   175: checkcast 85	java/lang/String
    //   178: invokestatic 91	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   181: invokevirtual 95	java/lang/Integer:intValue	()I
    //   184: istore 10
    //   186: iload 10
    //   188: istore 5
    //   190: aload 6
    //   192: ldc 101
    //   194: invokeinterface 83 2 0
    //   199: checkcast 85	java/lang/String
    //   202: astore 7
    //   204: aload 6
    //   206: ldc 103
    //   208: invokeinterface 83 2 0
    //   213: checkcast 85	java/lang/String
    //   216: astore_3
    //   217: aload 6
    //   219: ldc 105
    //   221: invokeinterface 83 2 0
    //   226: checkcast 85	java/lang/String
    //   229: astore 6
    //   231: goto -156 -> 75
    //   234: astore 6
    //   236: ldc 30
    //   238: astore 7
    //   240: ldc 30
    //   242: astore_3
    //   243: iconst_0
    //   244: istore 8
    //   246: goto -185 -> 61
    //   249: astore 6
    //   251: ldc 30
    //   253: astore 7
    //   255: ldc 30
    //   257: astore_3
    //   258: goto -197 -> 61
    //   261: astore 6
    //   263: ldc 30
    //   265: astore 7
    //   267: ldc 30
    //   269: astore_3
    //   270: goto -209 -> 61
    //   273: astore 6
    //   275: ldc 30
    //   277: astore_3
    //   278: goto -217 -> 61
    //   281: astore 6
    //   283: goto -222 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   16	24	46	java/lang/Exception
    //   29	46	46	java/lang/Exception
    //   126	146	46	java/lang/Exception
    //   146	166	234	java/lang/Exception
    //   166	186	249	java/lang/Exception
    //   190	204	261	java/lang/Exception
    //   204	217	273	java/lang/Exception
    //   217	231	281	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ag
 * JD-Core Version:    0.6.2
 */