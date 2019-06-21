package com.tencent.recovery.report;

import android.content.Context;
import java.io.File;

public class RecoveryReporter
{
  // ERROR //
  public static <T extends com.tencent.recovery.model.RecoveryPersistentItem> java.util.List<T> a(Context paramContext, String paramString, java.lang.Class<T> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 19	com/tencent/recovery/report/RecoveryReporter:iA	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_0
    //   5: new 21	java/util/LinkedList
    //   8: dup
    //   9: invokespecial 22	java/util/LinkedList:<init>	()V
    //   12: astore_3
    //   13: new 24	java/io/File
    //   16: dup
    //   17: aload_0
    //   18: aload_1
    //   19: invokespecial 27	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: astore 4
    //   24: aload 4
    //   26: invokevirtual 31	java/io/File:length	()J
    //   29: ldc2_w 32
    //   32: lcmp
    //   33: ifle +22 -> 55
    //   36: ldc 35
    //   38: ldc 37
    //   40: iconst_0
    //   41: anewarray 4	java/lang/Object
    //   44: invokestatic 43	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aload 4
    //   49: invokevirtual 47	java/io/File:delete	()Z
    //   52: pop
    //   53: aload_3
    //   54: areturn
    //   55: aload 4
    //   57: invokevirtual 50	java/io/File:exists	()Z
    //   60: ifne +21 -> 81
    //   63: ldc 35
    //   65: ldc 52
    //   67: iconst_1
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: aload_1
    //   74: aastore
    //   75: invokestatic 43	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: goto -25 -> 53
    //   81: new 54	java/io/FileInputStream
    //   84: astore_1
    //   85: aload_1
    //   86: aload 4
    //   88: invokespecial 57	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   91: aload_1
    //   92: astore_0
    //   93: new 59	java/io/ByteArrayOutputStream
    //   96: astore 5
    //   98: aload_1
    //   99: astore_0
    //   100: aload 5
    //   102: aload 4
    //   104: invokevirtual 31	java/io/File:length	()J
    //   107: l2i
    //   108: invokespecial 62	java/io/ByteArrayOutputStream:<init>	(I)V
    //   111: aload_1
    //   112: astore_0
    //   113: sipush 4096
    //   116: newarray byte
    //   118: astore 4
    //   120: aload_1
    //   121: astore_0
    //   122: aload_1
    //   123: aload 4
    //   125: invokevirtual 66	java/io/FileInputStream:read	([B)I
    //   128: istore 6
    //   130: iload 6
    //   132: ifle +44 -> 176
    //   135: aload_1
    //   136: astore_0
    //   137: aload 5
    //   139: aload 4
    //   141: iconst_0
    //   142: iload 6
    //   144: invokevirtual 70	java/io/ByteArrayOutputStream:write	([BII)V
    //   147: goto -27 -> 120
    //   150: astore_2
    //   151: aload_1
    //   152: astore_0
    //   153: ldc 35
    //   155: aload_2
    //   156: ldc 72
    //   158: iconst_0
    //   159: anewarray 4	java/lang/Object
    //   162: invokestatic 76	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload_1
    //   166: ifnull +7 -> 173
    //   169: aload_1
    //   170: invokevirtual 79	java/io/FileInputStream:close	()V
    //   173: goto -120 -> 53
    //   176: aload_1
    //   177: astore_0
    //   178: new 81	java/lang/String
    //   181: astore 4
    //   183: aload_1
    //   184: astore_0
    //   185: aload 4
    //   187: aload 5
    //   189: invokevirtual 85	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   192: invokespecial 88	java/lang/String:<init>	([B)V
    //   195: aload_1
    //   196: astore_0
    //   197: aload 4
    //   199: ldc 90
    //   201: invokevirtual 94	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   204: astore 7
    //   206: aload_1
    //   207: astore_0
    //   208: aload 7
    //   210: arraylength
    //   211: istore 8
    //   213: iconst_0
    //   214: istore 6
    //   216: iload 6
    //   218: iload 8
    //   220: if_icmpge +86 -> 306
    //   223: aload 7
    //   225: iload 6
    //   227: aaload
    //   228: astore 4
    //   230: aload_1
    //   231: astore_0
    //   232: aload_2
    //   233: invokevirtual 100	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   236: checkcast 102	com/tencent/recovery/model/RecoveryPersistentItem
    //   239: astore 5
    //   241: aload_1
    //   242: astore_0
    //   243: aload 5
    //   245: aload 4
    //   247: invokevirtual 106	com/tencent/recovery/model/RecoveryPersistentItem:atL	(Ljava/lang/String;)Z
    //   250: ifeq +20 -> 270
    //   253: aload_1
    //   254: astore_0
    //   255: aload_3
    //   256: aload 5
    //   258: invokeinterface 112 2 0
    //   263: pop
    //   264: iinc 6 1
    //   267: goto -51 -> 216
    //   270: aload_1
    //   271: astore_0
    //   272: ldc 35
    //   274: ldc 114
    //   276: iconst_1
    //   277: anewarray 4	java/lang/Object
    //   280: dup
    //   281: iconst_0
    //   282: aload 4
    //   284: aastore
    //   285: invokestatic 117	com/tencent/recovery/log/RecoveryLog:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -24 -> 264
    //   291: astore_1
    //   292: aload_0
    //   293: astore_2
    //   294: aload_1
    //   295: astore_0
    //   296: aload_2
    //   297: ifnull +7 -> 304
    //   300: aload_2
    //   301: invokevirtual 79	java/io/FileInputStream:close	()V
    //   304: aload_0
    //   305: athrow
    //   306: aload_1
    //   307: invokevirtual 79	java/io/FileInputStream:close	()V
    //   310: goto -137 -> 173
    //   313: astore_0
    //   314: goto -141 -> 173
    //   317: astore_0
    //   318: goto -145 -> 173
    //   321: astore_1
    //   322: goto -18 -> 304
    //   325: astore_0
    //   326: aconst_null
    //   327: astore_2
    //   328: goto -32 -> 296
    //   331: astore_2
    //   332: aconst_null
    //   333: astore_1
    //   334: goto -183 -> 151
    //
    // Exception table:
    //   from	to	target	type
    //   93	98	150	java/lang/Exception
    //   100	111	150	java/lang/Exception
    //   113	120	150	java/lang/Exception
    //   122	130	150	java/lang/Exception
    //   137	147	150	java/lang/Exception
    //   178	183	150	java/lang/Exception
    //   185	195	150	java/lang/Exception
    //   197	206	150	java/lang/Exception
    //   208	213	150	java/lang/Exception
    //   232	241	150	java/lang/Exception
    //   243	253	150	java/lang/Exception
    //   255	264	150	java/lang/Exception
    //   272	288	150	java/lang/Exception
    //   93	98	291	finally
    //   100	111	291	finally
    //   113	120	291	finally
    //   122	130	291	finally
    //   137	147	291	finally
    //   153	165	291	finally
    //   178	183	291	finally
    //   185	195	291	finally
    //   197	206	291	finally
    //   208	213	291	finally
    //   232	241	291	finally
    //   243	253	291	finally
    //   255	264	291	finally
    //   272	288	291	finally
    //   306	310	313	java/io/IOException
    //   169	173	317	java/io/IOException
    //   300	304	321	java/io/IOException
    //   81	91	325	finally
    //   81	91	331	java/lang/Exception
  }

  // ERROR //
  public static boolean a(Context paramContext, String paramString, com.tencent.recovery.model.RecoveryPersistentItem paramRecoveryPersistentItem)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 19	com/tencent/recovery/report/RecoveryReporter:iA	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_0
    //   5: aload_2
    //   6: invokevirtual 124	com/tencent/recovery/model/RecoveryPersistentItem:dQf	()Ljava/lang/String;
    //   9: astore_2
    //   10: ldc 35
    //   12: ldc 126
    //   14: iconst_1
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_2
    //   21: aastore
    //   22: invokestatic 43	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: new 24	java/io/File
    //   28: dup
    //   29: aload_0
    //   30: aload_1
    //   31: invokespecial 27	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   34: astore_0
    //   35: aload_0
    //   36: invokevirtual 31	java/io/File:length	()J
    //   39: ldc2_w 32
    //   42: lcmp
    //   43: ifle +19 -> 62
    //   46: ldc 35
    //   48: ldc 128
    //   50: iconst_0
    //   51: anewarray 4	java/lang/Object
    //   54: invokestatic 43	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: aload_0
    //   58: invokevirtual 47	java/io/File:delete	()Z
    //   61: pop
    //   62: aload_0
    //   63: invokevirtual 50	java/io/File:exists	()Z
    //   66: ifne +8 -> 74
    //   69: aload_0
    //   70: invokevirtual 131	java/io/File:createNewFile	()Z
    //   73: pop
    //   74: new 133	java/io/FileOutputStream
    //   77: astore_1
    //   78: aload_1
    //   79: aload_0
    //   80: iconst_1
    //   81: invokespecial 136	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   84: aload_1
    //   85: astore_0
    //   86: new 138	java/lang/StringBuilder
    //   89: astore_3
    //   90: aload_1
    //   91: astore_0
    //   92: aload_3
    //   93: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   96: aload_1
    //   97: astore_0
    //   98: aload_1
    //   99: aload_3
    //   100: aload_2
    //   101: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: ldc 90
    //   106: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokevirtual 149	java/lang/String:getBytes	()[B
    //   115: invokevirtual 151	java/io/FileOutputStream:write	([B)V
    //   118: aload_1
    //   119: astore_0
    //   120: aload_1
    //   121: invokevirtual 154	java/io/FileOutputStream:flush	()V
    //   124: aload_1
    //   125: invokevirtual 155	java/io/FileOutputStream:close	()V
    //   128: iconst_1
    //   129: ireturn
    //   130: astore_2
    //   131: aconst_null
    //   132: astore_1
    //   133: aload_1
    //   134: astore_0
    //   135: ldc 35
    //   137: aload_2
    //   138: ldc 157
    //   140: iconst_0
    //   141: anewarray 4	java/lang/Object
    //   144: invokestatic 76	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_1
    //   148: ifnull -20 -> 128
    //   151: aload_1
    //   152: invokevirtual 155	java/io/FileOutputStream:close	()V
    //   155: goto -27 -> 128
    //   158: astore_0
    //   159: goto -31 -> 128
    //   162: astore_1
    //   163: aconst_null
    //   164: astore_0
    //   165: aload_0
    //   166: ifnull +7 -> 173
    //   169: aload_0
    //   170: invokevirtual 155	java/io/FileOutputStream:close	()V
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: goto -102 -> 74
    //   179: astore_0
    //   180: goto -52 -> 128
    //   183: astore_0
    //   184: goto -11 -> 173
    //   187: astore_1
    //   188: goto -23 -> 165
    //   191: astore_2
    //   192: goto -59 -> 133
    //
    // Exception table:
    //   from	to	target	type
    //   74	84	130	java/lang/Exception
    //   151	155	158	java/io/IOException
    //   74	84	162	finally
    //   69	74	175	java/io/IOException
    //   124	128	179	java/io/IOException
    //   169	173	183	java/io/IOException
    //   86	90	187	finally
    //   92	96	187	finally
    //   98	118	187	finally
    //   120	124	187	finally
    //   135	147	187	finally
    //   86	90	191	java/lang/Exception
    //   92	96	191	java/lang/Exception
    //   98	118	191	java/lang/Exception
    //   120	124	191	java/lang/Exception
  }

  public static void bX(Context paramContext, String paramString)
  {
    new File(iA(paramContext), paramString).delete();
  }

  // ERROR //
  public static boolean c(Context paramContext, String paramString, java.util.List<? extends com.tencent.recovery.model.RecoveryPersistentItem> paramList)
  {
    // Byte code:
    //   0: ldc 35
    //   2: ldc 163
    //   4: iconst_2
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_1
    //   11: aastore
    //   12: dup
    //   13: iconst_1
    //   14: aload_2
    //   15: invokeinterface 167 1 0
    //   20: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   23: aastore
    //   24: invokestatic 43	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: new 24	java/io/File
    //   30: dup
    //   31: aload_0
    //   32: invokestatic 19	com/tencent/recovery/report/RecoveryReporter:iA	(Landroid/content/Context;)Ljava/io/File;
    //   35: aload_1
    //   36: invokespecial 27	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   39: astore_0
    //   40: aload_0
    //   41: invokevirtual 31	java/io/File:length	()J
    //   44: ldc2_w 32
    //   47: lcmp
    //   48: ifle +19 -> 67
    //   51: ldc 35
    //   53: ldc 128
    //   55: iconst_0
    //   56: anewarray 4	java/lang/Object
    //   59: invokestatic 43	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: aload_0
    //   63: invokevirtual 47	java/io/File:delete	()Z
    //   66: pop
    //   67: aload_0
    //   68: invokevirtual 50	java/io/File:exists	()Z
    //   71: ifne +8 -> 79
    //   74: aload_0
    //   75: invokevirtual 131	java/io/File:createNewFile	()Z
    //   78: pop
    //   79: new 133	java/io/FileOutputStream
    //   82: astore_3
    //   83: aload_3
    //   84: aload_0
    //   85: iconst_1
    //   86: invokespecial 136	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   89: aload_3
    //   90: astore_0
    //   91: aload_2
    //   92: invokeinterface 177 1 0
    //   97: astore 4
    //   99: aload_3
    //   100: astore_0
    //   101: aload 4
    //   103: invokeinterface 182 1 0
    //   108: ifeq +92 -> 200
    //   111: aload_3
    //   112: astore_0
    //   113: aload 4
    //   115: invokeinterface 185 1 0
    //   120: checkcast 102	com/tencent/recovery/model/RecoveryPersistentItem
    //   123: invokevirtual 124	com/tencent/recovery/model/RecoveryPersistentItem:dQf	()Ljava/lang/String;
    //   126: astore_2
    //   127: aload_3
    //   128: astore_0
    //   129: new 138	java/lang/StringBuilder
    //   132: astore 5
    //   134: aload_3
    //   135: astore_0
    //   136: aload 5
    //   138: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   141: aload_3
    //   142: astore_0
    //   143: aload_3
    //   144: aload 5
    //   146: aload_2
    //   147: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc 90
    //   152: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokevirtual 149	java/lang/String:getBytes	()[B
    //   161: invokevirtual 151	java/io/FileOutputStream:write	([B)V
    //   164: goto -65 -> 99
    //   167: astore_0
    //   168: aload_3
    //   169: astore_2
    //   170: aload_0
    //   171: astore_3
    //   172: aload_2
    //   173: astore_0
    //   174: ldc 35
    //   176: aload_3
    //   177: ldc 126
    //   179: iconst_1
    //   180: anewarray 4	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: aload_1
    //   186: aastore
    //   187: invokestatic 76	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_2
    //   191: ifnull +7 -> 198
    //   194: aload_2
    //   195: invokevirtual 155	java/io/FileOutputStream:close	()V
    //   198: iconst_1
    //   199: ireturn
    //   200: aload_3
    //   201: astore_0
    //   202: aload_3
    //   203: invokevirtual 154	java/io/FileOutputStream:flush	()V
    //   206: aload_3
    //   207: invokevirtual 155	java/io/FileOutputStream:close	()V
    //   210: goto -12 -> 198
    //   213: astore_0
    //   214: goto -16 -> 198
    //   217: astore_1
    //   218: aconst_null
    //   219: astore_0
    //   220: aload_0
    //   221: ifnull +7 -> 228
    //   224: aload_0
    //   225: invokevirtual 155	java/io/FileOutputStream:close	()V
    //   228: aload_1
    //   229: athrow
    //   230: astore_3
    //   231: goto -152 -> 79
    //   234: astore_0
    //   235: goto -37 -> 198
    //   238: astore_0
    //   239: goto -11 -> 228
    //   242: astore_1
    //   243: goto -23 -> 220
    //   246: astore_3
    //   247: aconst_null
    //   248: astore_2
    //   249: goto -77 -> 172
    //
    // Exception table:
    //   from	to	target	type
    //   91	99	167	java/lang/Exception
    //   101	111	167	java/lang/Exception
    //   113	127	167	java/lang/Exception
    //   129	134	167	java/lang/Exception
    //   136	141	167	java/lang/Exception
    //   143	164	167	java/lang/Exception
    //   202	206	167	java/lang/Exception
    //   206	210	213	java/io/IOException
    //   79	89	217	finally
    //   74	79	230	java/io/IOException
    //   194	198	234	java/io/IOException
    //   224	228	238	java/io/IOException
    //   91	99	242	finally
    //   101	111	242	finally
    //   113	127	242	finally
    //   129	134	242	finally
    //   136	141	242	finally
    //   143	164	242	finally
    //   174	190	242	finally
    //   202	206	242	finally
    //   79	89	246	java/lang/Exception
  }

  private static File iA(Context paramContext)
  {
    paramContext = new File(paramContext.getFilesDir(), "recovery");
    if (!paramContext.exists())
      paramContext.mkdir();
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.report.RecoveryReporter
 * JD-Core Version:    0.6.2
 */