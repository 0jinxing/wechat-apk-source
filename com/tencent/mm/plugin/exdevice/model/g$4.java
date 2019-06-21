package com.tencent.mm.plugin.exdevice.model;

final class g$4
  implements j.a
{
  g$4(g paramg)
  {
  }

  // ERROR //
  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: sipush 19254
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: bipush 14
    //   9: if_icmpne +21 -> 30
    //   12: aload_2
    //   13: ifnull +17 -> 30
    //   16: aload_2
    //   17: arraylength
    //   18: ifle +12 -> 30
    //   21: aload_2
    //   22: iconst_0
    //   23: aaload
    //   24: instanceof 30
    //   27: ifne +10 -> 37
    //   30: sipush 19254
    //   33: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: return
    //   37: aload_2
    //   38: iconst_0
    //   39: aaload
    //   40: checkcast 30	[B
    //   43: astore_3
    //   44: new 35	java/lang/String
    //   47: astore_2
    //   48: aload_2
    //   49: aload_3
    //   50: invokespecial 38	java/lang/String:<init>	([B)V
    //   53: new 40	org/json/JSONObject
    //   56: astore 4
    //   58: aload 4
    //   60: aload_2
    //   61: invokespecial 43	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   64: aload 4
    //   66: ldc 45
    //   68: invokevirtual 49	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   71: astore_2
    //   72: aload_2
    //   73: ldc 51
    //   75: invokevirtual 55	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   78: astore 5
    //   80: aload_2
    //   81: ldc 57
    //   83: invokevirtual 55	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   86: astore_3
    //   87: aload 4
    //   89: ldc 59
    //   91: invokevirtual 63	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   94: ifeq +19 -> 113
    //   97: ldc 65
    //   99: ldc 67
    //   101: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: sipush 19254
    //   107: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -74 -> 36
    //   113: ldc 65
    //   115: ldc 75
    //   117: iconst_1
    //   118: anewarray 4	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload 4
    //   125: ldc 59
    //   127: invokevirtual 79	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   130: invokevirtual 85	org/json/JSONArray:toString	()Ljava/lang/String;
    //   133: aastore
    //   134: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_2
    //   138: astore 4
    //   140: aload 5
    //   142: ifnull +27 -> 169
    //   145: aload_3
    //   146: ifnull +23 -> 169
    //   149: ldc 65
    //   151: ldc 90
    //   153: iconst_2
    //   154: anewarray 4	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: aload 5
    //   161: aastore
    //   162: dup
    //   163: iconst_1
    //   164: aload_3
    //   165: aastore
    //   166: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload_0
    //   170: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   173: getfield 96	com/tencent/mm/plugin/exdevice/model/g:lsJ	Ljava/util/List;
    //   176: invokeinterface 102 1 0
    //   181: istore 6
    //   183: iconst_0
    //   184: istore_1
    //   185: iload_1
    //   186: iload 6
    //   188: if_icmpge +199 -> 387
    //   191: aload_0
    //   192: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   195: getfield 96	com/tencent/mm/plugin/exdevice/model/g:lsJ	Ljava/util/List;
    //   198: iload_1
    //   199: invokeinterface 106 2 0
    //   204: checkcast 108	com/tencent/mm/plugin/exdevice/h/b
    //   207: getfield 112	com/tencent/mm/plugin/exdevice/h/b:field_deviceID	Ljava/lang/String;
    //   210: aload_3
    //   211: invokevirtual 116	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   214: ifeq +138 -> 352
    //   217: aload_0
    //   218: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   221: getfield 96	com/tencent/mm/plugin/exdevice/model/g:lsJ	Ljava/util/List;
    //   224: iload_1
    //   225: invokeinterface 106 2 0
    //   230: checkcast 108	com/tencent/mm/plugin/exdevice/h/b
    //   233: getfield 119	com/tencent/mm/plugin/exdevice/h/b:field_deviceType	Ljava/lang/String;
    //   236: aload 5
    //   238: invokevirtual 116	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   241: ifeq +111 -> 352
    //   244: aload_0
    //   245: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   248: getfield 96	com/tencent/mm/plugin/exdevice/model/g:lsJ	Ljava/util/List;
    //   251: iload_1
    //   252: invokeinterface 106 2 0
    //   257: checkcast 108	com/tencent/mm/plugin/exdevice/h/b
    //   260: getfield 124	com/tencent/mm/g/c/ce:dFr	Ljava/lang/String;
    //   263: ldc 126
    //   265: invokevirtual 130	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   268: ifeq +84 -> 352
    //   271: aload_0
    //   272: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   275: getfield 133	com/tencent/mm/plugin/exdevice/model/g:lsK	Ljava/util/List;
    //   278: aload_0
    //   279: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   282: getfield 96	com/tencent/mm/plugin/exdevice/model/g:lsJ	Ljava/util/List;
    //   285: iload_1
    //   286: invokeinterface 106 2 0
    //   291: invokeinterface 135 2 0
    //   296: ifne +56 -> 352
    //   299: aload_0
    //   300: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   303: getfield 139	com/tencent/mm/plugin/exdevice/model/g:lsL	Ljava/util/HashMap;
    //   306: aload_3
    //   307: aload 4
    //   309: invokevirtual 140	org/json/JSONObject:toString	()Ljava/lang/String;
    //   312: invokevirtual 146	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   315: pop
    //   316: aload_0
    //   317: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   320: getfield 133	com/tencent/mm/plugin/exdevice/model/g:lsK	Ljava/util/List;
    //   323: aload_0
    //   324: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   327: getfield 96	com/tencent/mm/plugin/exdevice/model/g:lsJ	Ljava/util/List;
    //   330: iload_1
    //   331: invokeinterface 106 2 0
    //   336: invokeinterface 149 2 0
    //   341: pop
    //   342: aload_0
    //   343: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   346: getfield 133	com/tencent/mm/plugin/exdevice/model/g:lsK	Ljava/util/List;
    //   349: invokestatic 153	com/tencent/mm/plugin/exdevice/model/g:bx	(Ljava/util/List;)V
    //   352: iinc 1 1
    //   355: goto -170 -> 185
    //   358: astore_3
    //   359: aconst_null
    //   360: astore 4
    //   362: aconst_null
    //   363: astore_2
    //   364: aconst_null
    //   365: astore 5
    //   367: ldc 65
    //   369: ldc 155
    //   371: iconst_1
    //   372: anewarray 4	java/lang/Object
    //   375: dup
    //   376: iconst_0
    //   377: aload_3
    //   378: aastore
    //   379: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   382: aload_2
    //   383: astore_3
    //   384: goto -244 -> 140
    //   387: sipush 19254
    //   390: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: goto -357 -> 36
    //   396: astore_3
    //   397: aconst_null
    //   398: astore 7
    //   400: aconst_null
    //   401: astore 5
    //   403: aload_2
    //   404: astore 4
    //   406: aload 7
    //   408: astore_2
    //   409: goto -42 -> 367
    //   412: astore_3
    //   413: aconst_null
    //   414: astore 7
    //   416: aload_2
    //   417: astore 4
    //   419: aload 7
    //   421: astore_2
    //   422: goto -55 -> 367
    //   425: astore 4
    //   427: aload_3
    //   428: astore 7
    //   430: aload 4
    //   432: astore_3
    //   433: aload_2
    //   434: astore 4
    //   436: aload 7
    //   438: astore_2
    //   439: goto -72 -> 367
    //
    // Exception table:
    //   from	to	target	type
    //   44	72	358	java/lang/Exception
    //   72	80	396	java/lang/Exception
    //   80	87	412	java/lang/Exception
    //   87	104	425	java/lang/Exception
    //   113	137	425	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g.4
 * JD-Core Version:    0.6.2
 */