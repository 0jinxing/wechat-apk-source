package com.tencent.mm.pluginsdk.i;

import android.webkit.MimeTypeMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class e
{
  // ERROR //
  public static final String a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: sipush 27476
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnonnull +13 -> 20
    //   10: sipush 27476
    //   13: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: aconst_null
    //   17: astore_0
    //   18: aload_0
    //   19: areturn
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual 23	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   25: astore_2
    //   26: aload_2
    //   27: invokestatic 27	com/tencent/mm/pluginsdk/i/e:ajn	(Ljava/lang/String;)Ljava/lang/String;
    //   30: astore_3
    //   31: aload_0
    //   32: aload_1
    //   33: invokestatic 30	com/tencent/mm/pluginsdk/i/e:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   36: astore 4
    //   38: aload 4
    //   40: astore 5
    //   42: aload 4
    //   44: invokestatic 36	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   47: ifeq +24 -> 71
    //   50: new 38	java/lang/StringBuilder
    //   53: dup
    //   54: ldc 40
    //   56: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   59: aload_2
    //   60: invokestatic 27	com/tencent/mm/pluginsdk/i/e:ajn	(Ljava/lang/String;)Ljava/lang/String;
    //   63: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: astore 5
    //   71: new 54	com/tencent/mm/vfs/b
    //   74: dup
    //   75: getstatic 60	com/tencent/mm/compatible/util/e:euQ	Ljava/lang/String;
    //   78: aload 5
    //   80: invokespecial 63	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: astore_2
    //   84: aload_2
    //   85: invokevirtual 67	com/tencent/mm/vfs/b:exists	()Z
    //   88: ifeq +235 -> 323
    //   91: invokestatic 73	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   94: pop
    //   95: new 54	com/tencent/mm/vfs/b
    //   98: dup
    //   99: invokestatic 78	com/tencent/mm/model/c:Ye	()Ljava/lang/String;
    //   102: aload 5
    //   104: aload_3
    //   105: invokestatic 84	com/tencent/mm/pluginsdk/model/app/l:X	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokespecial 85	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   111: astore_2
    //   112: aload_2
    //   113: invokestatic 91	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
    //   116: astore 5
    //   118: aload_0
    //   119: aload_1
    //   120: invokevirtual 95	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   123: astore_0
    //   124: aload_0
    //   125: ifnonnull +23 -> 148
    //   128: aload_0
    //   129: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   132: aload 5
    //   134: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   137: sipush 27476
    //   140: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aconst_null
    //   144: astore_0
    //   145: goto -127 -> 18
    //   148: aload_0
    //   149: astore 4
    //   151: aload 5
    //   153: astore_1
    //   154: sipush 1024
    //   157: newarray byte
    //   159: astore_3
    //   160: aload_0
    //   161: astore 4
    //   163: aload 5
    //   165: astore_1
    //   166: aload_0
    //   167: aload_3
    //   168: invokevirtual 104	java/io/InputStream:read	([B)I
    //   171: istore 6
    //   173: iload 6
    //   175: ifle +60 -> 235
    //   178: aload_0
    //   179: astore 4
    //   181: aload 5
    //   183: astore_1
    //   184: aload 5
    //   186: aload_3
    //   187: iconst_0
    //   188: iload 6
    //   190: invokevirtual 110	java/io/OutputStream:write	([BII)V
    //   193: goto -33 -> 160
    //   196: astore_2
    //   197: aload_0
    //   198: astore 4
    //   200: aload 5
    //   202: astore_1
    //   203: ldc 112
    //   205: aload_2
    //   206: ldc 114
    //   208: iconst_0
    //   209: anewarray 4	java/lang/Object
    //   212: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   215: aload_0
    //   216: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   219: aload 5
    //   221: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   224: sipush 27476
    //   227: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: aconst_null
    //   231: astore_0
    //   232: goto -214 -> 18
    //   235: aload_0
    //   236: astore 4
    //   238: aload 5
    //   240: astore_1
    //   241: aload_2
    //   242: invokevirtual 124	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   245: invokestatic 129	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   248: astore_2
    //   249: aload_2
    //   250: astore_1
    //   251: aload_0
    //   252: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   255: aload 5
    //   257: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   260: sipush 27476
    //   263: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_1
    //   267: astore_0
    //   268: goto -250 -> 18
    //   271: astore_0
    //   272: aconst_null
    //   273: astore 4
    //   275: aconst_null
    //   276: astore_1
    //   277: aload 4
    //   279: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   282: aload_1
    //   283: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   286: sipush 27476
    //   289: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: aload_0
    //   293: athrow
    //   294: astore_0
    //   295: aconst_null
    //   296: astore 4
    //   298: aload 5
    //   300: astore_1
    //   301: goto -24 -> 277
    //   304: astore_0
    //   305: goto -28 -> 277
    //   308: astore_2
    //   309: aconst_null
    //   310: astore_0
    //   311: aconst_null
    //   312: astore 5
    //   314: goto -117 -> 197
    //   317: astore_2
    //   318: aconst_null
    //   319: astore_0
    //   320: goto -123 -> 197
    //   323: goto -211 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   154	160	196	java/lang/Exception
    //   166	173	196	java/lang/Exception
    //   184	193	196	java/lang/Exception
    //   241	249	196	java/lang/Exception
    //   112	118	271	finally
    //   118	124	294	finally
    //   154	160	304	finally
    //   166	173	304	finally
    //   184	193	304	finally
    //   203	215	304	finally
    //   241	249	304	finally
    //   112	118	308	java/lang/Exception
    //   118	124	317	java/lang/Exception
  }

  // ERROR //
  public static final String a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: sipush 27478
    //   5: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: ifnonnull +13 -> 22
    //   12: sipush 27478
    //   15: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_3
    //   19: astore_1
    //   20: aload_1
    //   21: areturn
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 23	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   27: astore 4
    //   29: new 54	com/tencent/mm/vfs/b
    //   32: dup
    //   33: invokestatic 137	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   36: invokevirtual 143	android/content/Context:getCacheDir	()Ljava/io/File;
    //   39: new 38	java/lang/StringBuilder
    //   42: dup
    //   43: ldc 145
    //   45: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: iload_2
    //   49: invokevirtual 148	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: aload 4
    //   54: invokestatic 27	com/tencent/mm/pluginsdk/i/e:ajn	(Ljava/lang/String;)Ljava/lang/String;
    //   57: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokespecial 151	com/tencent/mm/vfs/b:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   66: astore 5
    //   68: aload 5
    //   70: invokevirtual 154	com/tencent/mm/vfs/b:delete	()Z
    //   73: pop
    //   74: aload 5
    //   76: invokestatic 91	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
    //   79: astore 4
    //   81: aload_0
    //   82: aload_1
    //   83: invokevirtual 95	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   86: astore_0
    //   87: aload_0
    //   88: ifnonnull +23 -> 111
    //   91: aload_0
    //   92: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   95: aload 4
    //   97: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   100: sipush 27478
    //   103: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: aload_3
    //   107: astore_1
    //   108: goto -88 -> 20
    //   111: aload_0
    //   112: astore 6
    //   114: aload 4
    //   116: astore_1
    //   117: sipush 1024
    //   120: newarray byte
    //   122: astore 7
    //   124: aload_0
    //   125: astore 6
    //   127: aload 4
    //   129: astore_1
    //   130: aload_0
    //   131: aload 7
    //   133: invokevirtual 104	java/io/InputStream:read	([B)I
    //   136: istore_2
    //   137: iload_2
    //   138: ifle +62 -> 200
    //   141: aload_0
    //   142: astore 6
    //   144: aload 4
    //   146: astore_1
    //   147: aload 4
    //   149: aload 7
    //   151: iconst_0
    //   152: iload_2
    //   153: invokevirtual 110	java/io/OutputStream:write	([BII)V
    //   156: goto -32 -> 124
    //   159: astore 5
    //   161: aload_0
    //   162: astore 6
    //   164: aload 4
    //   166: astore_1
    //   167: ldc 112
    //   169: aload 5
    //   171: ldc 114
    //   173: iconst_0
    //   174: anewarray 4	java/lang/Object
    //   177: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   180: aload_0
    //   181: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   184: aload 4
    //   186: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   189: sipush 27478
    //   192: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: aload_3
    //   196: astore_1
    //   197: goto -177 -> 20
    //   200: aload_0
    //   201: astore 6
    //   203: aload 4
    //   205: astore_1
    //   206: aload 5
    //   208: invokevirtual 124	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   211: invokestatic 129	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   214: astore 5
    //   216: aload 5
    //   218: astore_1
    //   219: aload_0
    //   220: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   223: aload 4
    //   225: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   228: sipush 27478
    //   231: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: goto -214 -> 20
    //   237: astore_0
    //   238: aconst_null
    //   239: astore 6
    //   241: aconst_null
    //   242: astore_1
    //   243: aload 6
    //   245: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   248: aload_1
    //   249: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   252: sipush 27478
    //   255: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   258: aload_0
    //   259: athrow
    //   260: astore_0
    //   261: aconst_null
    //   262: astore 6
    //   264: aload 4
    //   266: astore_1
    //   267: goto -24 -> 243
    //   270: astore_0
    //   271: goto -28 -> 243
    //   274: astore 5
    //   276: aconst_null
    //   277: astore_0
    //   278: aconst_null
    //   279: astore 4
    //   281: goto -120 -> 161
    //   284: astore 5
    //   286: aconst_null
    //   287: astore_0
    //   288: goto -127 -> 161
    //
    // Exception table:
    //   from	to	target	type
    //   117	124	159	java/lang/Exception
    //   130	137	159	java/lang/Exception
    //   147	156	159	java/lang/Exception
    //   206	216	159	java/lang/Exception
    //   74	81	237	finally
    //   81	87	260	finally
    //   117	124	270	finally
    //   130	137	270	finally
    //   147	156	270	finally
    //   167	180	270	finally
    //   206	216	270	finally
    //   74	81	274	java/lang/Exception
    //   81	87	284	java/lang/Exception
  }

  private static String ajn(String paramString)
  {
    AppMethodBeat.i(27479);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(27479);
    }
    while (true)
    {
      return paramString;
      String str1 = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString);
      String str2;
      if (str1 != null)
      {
        str2 = str1;
        if (str1.length() != 0);
      }
      else
      {
        paramString = paramString.split("/");
        str2 = str1;
        if (paramString != null)
        {
          str2 = str1;
          if (paramString.length > 1)
            str2 = paramString[1];
        }
      }
      paramString = ".".concat(String.valueOf(str2));
      AppMethodBeat.o(27479);
    }
  }

  // ERROR //
  private static String b(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: sipush 27477
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: iconst_1
    //   9: anewarray 167	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: ldc 188
    //   16: aastore
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: invokevirtual 192	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   23: astore_2
    //   24: aload_2
    //   25: ifnull +182 -> 207
    //   28: aload_2
    //   29: astore_0
    //   30: aload_2
    //   31: invokeinterface 197 1 0
    //   36: ifeq +171 -> 207
    //   39: aload_2
    //   40: astore_0
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface 201 2 0
    //   48: astore_3
    //   49: aload_2
    //   50: astore_0
    //   51: new 54	com/tencent/mm/vfs/b
    //   54: astore 4
    //   56: aload_2
    //   57: astore_0
    //   58: aload 4
    //   60: aload_3
    //   61: invokespecial 85	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   64: aload_2
    //   65: astore_0
    //   66: aload 4
    //   68: invokevirtual 204	com/tencent/mm/vfs/b:getName	()Ljava/lang/String;
    //   71: astore_3
    //   72: aload_3
    //   73: astore_0
    //   74: aload_0
    //   75: astore_1
    //   76: aload_2
    //   77: ifnull +11 -> 88
    //   80: aload_2
    //   81: invokeinterface 208 1 0
    //   86: aload_0
    //   87: astore_1
    //   88: sipush 27477
    //   91: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_1
    //   95: areturn
    //   96: astore_3
    //   97: aconst_null
    //   98: astore_2
    //   99: aload_2
    //   100: astore_0
    //   101: ldc 112
    //   103: aload_3
    //   104: ldc 210
    //   106: iconst_0
    //   107: anewarray 4	java/lang/Object
    //   110: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aload_2
    //   114: astore_0
    //   115: aload_1
    //   116: invokevirtual 213	android/net/Uri:toString	()Ljava/lang/String;
    //   119: ldc 215
    //   121: invokestatic 221	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   124: ldc 173
    //   126: invokevirtual 177	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   129: astore_1
    //   130: aload_2
    //   131: astore_0
    //   132: aload_1
    //   133: aload_1
    //   134: arraylength
    //   135: iconst_1
    //   136: isub
    //   137: aaload
    //   138: astore_1
    //   139: aload_1
    //   140: astore_0
    //   141: aload_0
    //   142: astore_1
    //   143: aload_2
    //   144: ifnull -56 -> 88
    //   147: aload_2
    //   148: invokeinterface 208 1 0
    //   153: aload_0
    //   154: astore_1
    //   155: goto -67 -> 88
    //   158: astore_1
    //   159: aload_2
    //   160: astore_0
    //   161: ldc 112
    //   163: aload_1
    //   164: ldc 223
    //   166: iconst_0
    //   167: anewarray 4	java/lang/Object
    //   170: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: aconst_null
    //   174: astore_0
    //   175: goto -34 -> 141
    //   178: astore_1
    //   179: aconst_null
    //   180: astore_0
    //   181: aload_0
    //   182: ifnull +9 -> 191
    //   185: aload_0
    //   186: invokeinterface 208 1 0
    //   191: sipush 27477
    //   194: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: aload_1
    //   198: athrow
    //   199: astore_1
    //   200: goto -19 -> 181
    //   203: astore_3
    //   204: goto -105 -> 99
    //   207: aconst_null
    //   208: astore_0
    //   209: goto -135 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   6	24	96	java/lang/Exception
    //   115	130	158	java/lang/Exception
    //   132	139	158	java/lang/Exception
    //   6	24	178	finally
    //   30	39	199	finally
    //   41	49	199	finally
    //   51	56	199	finally
    //   58	64	199	finally
    //   66	72	199	finally
    //   101	113	199	finally
    //   115	130	199	finally
    //   132	139	199	finally
    //   161	173	199	finally
    //   30	39	203	java/lang/Exception
    //   41	49	203	java/lang/Exception
    //   51	56	203	java/lang/Exception
    //   58	64	203	java/lang/Exception
    //   66	72	203	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.e
 * JD-Core Version:    0.6.2
 */