package com.tencent.mm.plugin.forcenotify.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.forcenotify.c.b;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/storage/ForceNotifyStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/plugin/forcenotify/model/ForceNotifyInfo;", "()V", "TABLE_NAME", "", "TAG", "db", "Lcom/tencent/mm/storagebase/SqliteDB;", "mCache", "Ljava/util/concurrent/ConcurrentHashMap;", "delete", "", "userName", "deleteExpireInfo", "", "getErrorCount", "", "getExpireTime", "", "getList", "Ljava/util/ArrayList;", "getUnExpireCount", "isHasSetForceNotify", "isNeedNotify", "set", "updateStatus", "status", "plugin-force-notify_release"})
public final class a extends com.tencent.mm.sdk.e.j<b>
{
  public static final h fni;
  public static final ConcurrentHashMap<String, b> mtg;
  public static final a mth;

  static
  {
    AppMethodBeat.i(51062);
    mth = new a();
    Object localObject = g.RP();
    a.f.b.j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ru();
    if (localObject == null)
      a.f.b.j.dWJ();
    fni = (h)localObject;
    mtg = new ConcurrentHashMap();
    AppMethodBeat.o(51062);
  }

  private a()
  {
    super((com.tencent.mm.sdk.e.e)locale.Ru(), b.ccO, "ForceNotifyInfo", new String[] { "CREATE INDEX IF NOT EXISTS userNameIndex ON ForceNotifyInfo(UserName)", "CREATE INDEX IF NOT EXISTS statusIndex ON ForceNotifyInfo(Status)", "CREATE INDEX IF NOT EXISTS expireTimeIndex ON ForceNotifyInfo(ExpiredTime)" });
    AppMethodBeat.i(51061);
    AppMethodBeat.o(51061);
  }

  // ERROR //
  public static boolean Mp(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc 116
    //   6: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: ldc 117
    //   12: invokestatic 120	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: getstatic 86	com/tencent/mm/plugin/forcenotify/d/a:mtg	Ljava/util/concurrent/ConcurrentHashMap;
    //   18: invokevirtual 124	java/util/concurrent/ConcurrentHashMap:isEmpty	()Z
    //   21: ifne +63 -> 84
    //   24: getstatic 86	com/tencent/mm/plugin/forcenotify/d/a:mtg	Ljava/util/concurrent/ConcurrentHashMap;
    //   27: aload_0
    //   28: invokevirtual 128	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 93	com/tencent/mm/plugin/forcenotify/c/b
    //   34: astore_0
    //   35: aload_0
    //   36: ifnonnull +10 -> 46
    //   39: ldc 116
    //   41: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: iload_2
    //   45: ireturn
    //   46: aload_0
    //   47: ldc 130
    //   49: invokestatic 70	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_0
    //   53: invokevirtual 133	com/tencent/mm/plugin/forcenotify/c/b:bxX	()Z
    //   56: ifne +20 -> 76
    //   59: aload_0
    //   60: invokevirtual 136	com/tencent/mm/plugin/forcenotify/c/b:isEnable	()Z
    //   63: ifeq +13 -> 76
    //   66: ldc 116
    //   68: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: iconst_1
    //   72: istore_2
    //   73: goto -29 -> 44
    //   76: ldc 116
    //   78: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: goto -37 -> 44
    //   84: getstatic 81	com/tencent/mm/plugin/forcenotify/d/a:fni	Lcom/tencent/mm/cd/h;
    //   87: ldc 99
    //   89: iconst_1
    //   90: anewarray 101	java/lang/String
    //   93: dup
    //   94: iconst_0
    //   95: ldc 138
    //   97: aastore
    //   98: ldc 140
    //   100: iconst_1
    //   101: anewarray 101	java/lang/String
    //   104: dup
    //   105: iconst_0
    //   106: aload_0
    //   107: aastore
    //   108: aconst_null
    //   109: aconst_null
    //   110: aconst_null
    //   111: iconst_2
    //   112: invokevirtual 146	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   115: astore_3
    //   116: aload_3
    //   117: checkcast 148	java/io/Closeable
    //   120: astore 4
    //   122: aload_3
    //   123: invokeinterface 153 1 0
    //   128: ifeq +93 -> 221
    //   131: new 93	com/tencent/mm/plugin/forcenotify/c/b
    //   134: astore 5
    //   136: aload 5
    //   138: invokespecial 154	com/tencent/mm/plugin/forcenotify/c/b:<init>	()V
    //   141: aload 5
    //   143: aload_3
    //   144: invokevirtual 158	com/tencent/mm/plugin/forcenotify/c/b:d	(Landroid/database/Cursor;)V
    //   147: getstatic 86	com/tencent/mm/plugin/forcenotify/d/a:mtg	Ljava/util/concurrent/ConcurrentHashMap;
    //   150: checkcast 160	java/util/Map
    //   153: aload_0
    //   154: aload 5
    //   156: invokeinterface 164 3 0
    //   161: pop
    //   162: ldc 166
    //   164: ldc 168
    //   166: iconst_2
    //   167: anewarray 170	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload_0
    //   173: aastore
    //   174: dup
    //   175: iconst_1
    //   176: aload 5
    //   178: aastore
    //   179: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: aload 5
    //   184: invokevirtual 133	com/tencent/mm/plugin/forcenotify/c/b:bxX	()Z
    //   187: ifne +29 -> 216
    //   190: aload 5
    //   192: invokevirtual 136	com/tencent/mm/plugin/forcenotify/c/b:isEnable	()Z
    //   195: istore_2
    //   196: iload_2
    //   197: ifeq +19 -> 216
    //   200: iconst_1
    //   201: istore_2
    //   202: aload 4
    //   204: aconst_null
    //   205: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   208: ldc 116
    //   210: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: goto -169 -> 44
    //   216: iconst_0
    //   217: istore_2
    //   218: goto -16 -> 202
    //   221: getstatic 86	com/tencent/mm/plugin/forcenotify/d/a:mtg	Ljava/util/concurrent/ConcurrentHashMap;
    //   224: checkcast 160	java/util/Map
    //   227: astore_3
    //   228: new 93	com/tencent/mm/plugin/forcenotify/c/b
    //   231: astore 5
    //   233: aload 5
    //   235: invokespecial 154	com/tencent/mm/plugin/forcenotify/c/b:<init>	()V
    //   238: aload_3
    //   239: aload_0
    //   240: aload 5
    //   242: invokeinterface 164 3 0
    //   247: pop
    //   248: getstatic 186	a/y:AUy	La/y;
    //   251: astore_0
    //   252: aload 4
    //   254: aconst_null
    //   255: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   258: ldc 116
    //   260: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: goto -219 -> 44
    //   266: astore_1
    //   267: ldc 116
    //   269: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   272: aload_1
    //   273: athrow
    //   274: astore_0
    //   275: aload 4
    //   277: aload_1
    //   278: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   281: ldc 116
    //   283: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: aload_0
    //   287: athrow
    //   288: astore_0
    //   289: goto -14 -> 275
    //
    // Exception table:
    //   from	to	target	type
    //   122	196	266	java/lang/Throwable
    //   221	252	266	java/lang/Throwable
    //   267	274	274	finally
    //   122	196	288	finally
    //   221	252	288	finally
  }

  // ERROR //
  public static boolean Mq(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 188
    //   4: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: ldc 117
    //   10: invokestatic 120	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   13: getstatic 86	com/tencent/mm/plugin/forcenotify/d/a:mtg	Ljava/util/concurrent/ConcurrentHashMap;
    //   16: invokevirtual 124	java/util/concurrent/ConcurrentHashMap:isEmpty	()Z
    //   19: ifne +35 -> 54
    //   22: getstatic 86	com/tencent/mm/plugin/forcenotify/d/a:mtg	Ljava/util/concurrent/ConcurrentHashMap;
    //   25: aload_0
    //   26: invokevirtual 128	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 93	com/tencent/mm/plugin/forcenotify/c/b
    //   32: ifnonnull +12 -> 44
    //   35: ldc 188
    //   37: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iconst_0
    //   41: istore_2
    //   42: iload_2
    //   43: ireturn
    //   44: ldc 188
    //   46: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: iconst_1
    //   50: istore_2
    //   51: goto -9 -> 42
    //   54: getstatic 81	com/tencent/mm/plugin/forcenotify/d/a:fni	Lcom/tencent/mm/cd/h;
    //   57: ldc 99
    //   59: iconst_1
    //   60: anewarray 101	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: ldc 138
    //   67: aastore
    //   68: ldc 140
    //   70: iconst_1
    //   71: anewarray 101	java/lang/String
    //   74: dup
    //   75: iconst_0
    //   76: aload_0
    //   77: aastore
    //   78: aconst_null
    //   79: aconst_null
    //   80: aconst_null
    //   81: iconst_2
    //   82: invokevirtual 146	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   85: astore_3
    //   86: aload_3
    //   87: checkcast 148	java/io/Closeable
    //   90: astore 4
    //   92: aload_3
    //   93: ifnonnull +6 -> 99
    //   96: invokestatic 79	a/f/b/j:dWJ	()V
    //   99: aload_3
    //   100: invokeinterface 153 1 0
    //   105: ifeq +55 -> 160
    //   108: new 93	com/tencent/mm/plugin/forcenotify/c/b
    //   111: astore 5
    //   113: aload 5
    //   115: invokespecial 154	com/tencent/mm/plugin/forcenotify/c/b:<init>	()V
    //   118: aload 5
    //   120: aload_3
    //   121: invokevirtual 158	com/tencent/mm/plugin/forcenotify/c/b:d	(Landroid/database/Cursor;)V
    //   124: ldc 166
    //   126: ldc 190
    //   128: iconst_2
    //   129: anewarray 170	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload_0
    //   135: aastore
    //   136: dup
    //   137: iconst_1
    //   138: aload 5
    //   140: aastore
    //   141: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: aload 4
    //   146: aconst_null
    //   147: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   150: ldc 188
    //   152: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: iconst_1
    //   156: istore_2
    //   157: goto -115 -> 42
    //   160: getstatic 186	a/y:AUy	La/y;
    //   163: astore_0
    //   164: aload 4
    //   166: aconst_null
    //   167: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   170: ldc 188
    //   172: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: iconst_0
    //   176: istore_2
    //   177: goto -135 -> 42
    //   180: astore_1
    //   181: ldc 188
    //   183: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: aload_1
    //   187: athrow
    //   188: astore_0
    //   189: aload 4
    //   191: aload_1
    //   192: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   195: ldc 188
    //   197: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aload_0
    //   201: athrow
    //   202: astore_0
    //   203: goto -14 -> 189
    //
    // Exception table:
    //   from	to	target	type
    //   96	99	180	java/lang/Throwable
    //   99	144	180	java/lang/Throwable
    //   160	164	180	java/lang/Throwable
    //   181	188	188	finally
    //   96	99	202	finally
    //   99	144	202	finally
    //   160	164	202	finally
  }

  // ERROR //
  public static java.util.ArrayList<b> bxY()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 193
    //   4: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 195	java/util/ArrayList
    //   10: dup
    //   11: invokespecial 196	java/util/ArrayList:<init>	()V
    //   14: astore_1
    //   15: ldc 198
    //   17: invokestatic 202	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   20: astore_2
    //   21: aload_2
    //   22: ldc 204
    //   24: invokestatic 70	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   27: aload_2
    //   28: checkcast 198	com/tencent/mm/plugin/messenger/foundation/a/j
    //   31: invokeinterface 208 1 0
    //   36: astore_3
    //   37: getstatic 81	com/tencent/mm/plugin/forcenotify/d/a:fni	Lcom/tencent/mm/cd/h;
    //   40: astore_2
    //   41: invokestatic 214	com/tencent/mm/model/cb:aaE	()J
    //   44: lstore 4
    //   46: aload_2
    //   47: ldc 99
    //   49: iconst_1
    //   50: anewarray 101	java/lang/String
    //   53: dup
    //   54: iconst_0
    //   55: ldc 138
    //   57: aastore
    //   58: ldc 216
    //   60: iconst_1
    //   61: anewarray 101	java/lang/String
    //   64: dup
    //   65: iconst_0
    //   66: lload 4
    //   68: invokestatic 220	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   71: aastore
    //   72: aconst_null
    //   73: aconst_null
    //   74: ldc 222
    //   76: iconst_2
    //   77: invokevirtual 146	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   80: astore 6
    //   82: aload 6
    //   84: checkcast 148	java/io/Closeable
    //   87: astore_2
    //   88: aload 6
    //   90: invokeinterface 153 1 0
    //   95: pop
    //   96: aload 6
    //   98: ifnonnull +6 -> 104
    //   101: invokestatic 79	a/f/b/j:dWJ	()V
    //   104: aload 6
    //   106: invokeinterface 225 1 0
    //   111: ifne +125 -> 236
    //   114: new 93	com/tencent/mm/plugin/forcenotify/c/b
    //   117: astore 7
    //   119: aload 7
    //   121: invokespecial 154	com/tencent/mm/plugin/forcenotify/c/b:<init>	()V
    //   124: aload 7
    //   126: aload 6
    //   128: invokevirtual 158	com/tencent/mm/plugin/forcenotify/c/b:d	(Landroid/database/Cursor;)V
    //   131: aload 7
    //   133: aload_3
    //   134: aload 7
    //   136: getfield 229	com/tencent/mm/plugin/forcenotify/c/b:field_UserName	Ljava/lang/String;
    //   139: invokeinterface 235 2 0
    //   144: putfield 239	com/tencent/mm/plugin/forcenotify/c/b:ehM	Lcom/tencent/mm/storage/ad;
    //   147: aload_1
    //   148: aload 7
    //   150: invokevirtual 243	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   153: pop
    //   154: ldc 166
    //   156: ldc 245
    //   158: iconst_1
    //   159: anewarray 170	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: aload 7
    //   166: aastore
    //   167: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   170: getstatic 86	com/tencent/mm/plugin/forcenotify/d/a:mtg	Ljava/util/concurrent/ConcurrentHashMap;
    //   173: checkcast 160	java/util/Map
    //   176: astore 8
    //   178: aload 7
    //   180: getfield 229	com/tencent/mm/plugin/forcenotify/c/b:field_UserName	Ljava/lang/String;
    //   183: astore 9
    //   185: aload 9
    //   187: ldc 247
    //   189: invokestatic 70	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   192: aload 8
    //   194: aload 9
    //   196: aload 7
    //   198: invokeinterface 164 3 0
    //   203: pop
    //   204: aload 6
    //   206: invokeinterface 250 1 0
    //   211: pop
    //   212: goto -116 -> 96
    //   215: astore_0
    //   216: ldc 193
    //   218: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: aload_0
    //   222: athrow
    //   223: astore_1
    //   224: aload_2
    //   225: aload_0
    //   226: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   229: ldc 193
    //   231: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: aload_1
    //   235: athrow
    //   236: getstatic 186	a/y:AUy	La/y;
    //   239: astore_3
    //   240: aload_2
    //   241: aconst_null
    //   242: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   245: ldc 193
    //   247: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: aload_1
    //   251: areturn
    //   252: astore_1
    //   253: goto -29 -> 224
    //
    // Exception table:
    //   from	to	target	type
    //   88	96	215	java/lang/Throwable
    //   101	104	215	java/lang/Throwable
    //   104	212	215	java/lang/Throwable
    //   236	240	215	java/lang/Throwable
    //   216	223	223	finally
    //   88	96	252	finally
    //   101	104	252	finally
    //   104	212	252	finally
    //   236	240	252	finally
  }

  // ERROR //
  public static int bxZ()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 255
    //   4: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: getstatic 81	com/tencent/mm/plugin/forcenotify/d/a:fni	Lcom/tencent/mm/cd/h;
    //   10: ldc_w 257
    //   13: iconst_1
    //   14: anewarray 101	java/lang/String
    //   17: dup
    //   18: iconst_0
    //   19: invokestatic 214	com/tencent/mm/model/cb:aaE	()J
    //   22: invokestatic 220	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   25: aastore
    //   26: invokevirtual 261	com/tencent/mm/cd/h:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_1
    //   30: aload_1
    //   31: checkcast 148	java/io/Closeable
    //   34: astore_2
    //   35: aload_1
    //   36: ifnonnull +6 -> 42
    //   39: invokestatic 79	a/f/b/j:dWJ	()V
    //   42: aload_1
    //   43: invokeinterface 153 1 0
    //   48: ifeq +23 -> 71
    //   51: aload_1
    //   52: iconst_0
    //   53: invokeinterface 265 2 0
    //   58: istore_3
    //   59: aload_2
    //   60: aconst_null
    //   61: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   64: ldc 255
    //   66: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: iload_3
    //   70: ireturn
    //   71: getstatic 186	a/y:AUy	La/y;
    //   74: astore_1
    //   75: aload_2
    //   76: aconst_null
    //   77: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   80: ldc 255
    //   82: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: iconst_0
    //   86: istore_3
    //   87: goto -18 -> 69
    //   90: astore_0
    //   91: ldc 255
    //   93: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_0
    //   97: athrow
    //   98: astore_1
    //   99: aload_2
    //   100: aload_0
    //   101: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   104: ldc 255
    //   106: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: aload_1
    //   110: athrow
    //   111: astore_1
    //   112: goto -13 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   39	42	90	java/lang/Throwable
    //   42	59	90	java/lang/Throwable
    //   71	75	90	java/lang/Throwable
    //   91	98	98	finally
    //   39	42	111	finally
    //   42	59	111	finally
    //   71	75	111	finally
  }

  // ERROR //
  public static void bya()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc_w 267
    //   5: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 81	com/tencent/mm/plugin/forcenotify/d/a:fni	Lcom/tencent/mm/cd/h;
    //   11: astore_1
    //   12: invokestatic 214	com/tencent/mm/model/cb:aaE	()J
    //   15: lstore_2
    //   16: aload_1
    //   17: ldc 99
    //   19: iconst_1
    //   20: anewarray 101	java/lang/String
    //   23: dup
    //   24: iconst_0
    //   25: ldc 138
    //   27: aastore
    //   28: ldc_w 269
    //   31: iconst_1
    //   32: anewarray 101	java/lang/String
    //   35: dup
    //   36: iconst_0
    //   37: lload_2
    //   38: invokestatic 220	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   41: aastore
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: iconst_2
    //   46: invokevirtual 146	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   49: astore 4
    //   51: aload 4
    //   53: checkcast 148	java/io/Closeable
    //   56: astore 5
    //   58: aload 4
    //   60: invokeinterface 153 1 0
    //   65: pop
    //   66: aload 4
    //   68: ifnonnull +6 -> 74
    //   71: invokestatic 79	a/f/b/j:dWJ	()V
    //   74: aload 4
    //   76: invokeinterface 225 1 0
    //   81: ifne +78 -> 159
    //   84: new 93	com/tencent/mm/plugin/forcenotify/c/b
    //   87: astore_1
    //   88: aload_1
    //   89: invokespecial 154	com/tencent/mm/plugin/forcenotify/c/b:<init>	()V
    //   92: aload_1
    //   93: aload 4
    //   95: invokevirtual 158	com/tencent/mm/plugin/forcenotify/c/b:d	(Landroid/database/Cursor;)V
    //   98: ldc_w 271
    //   101: invokestatic 202	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   104: checkcast 271	com/tencent/mm/plugin/forcenotify/a/a
    //   107: aload_1
    //   108: getfield 229	com/tencent/mm/plugin/forcenotify/c/b:field_UserName	Ljava/lang/String;
    //   111: iconst_5
    //   112: invokestatic 214	com/tencent/mm/model/cb:aaE	()J
    //   115: ldc2_w 272
    //   118: ldiv
    //   119: invokeinterface 277 5 0
    //   124: aload 4
    //   126: invokeinterface 250 1 0
    //   131: pop
    //   132: goto -66 -> 66
    //   135: astore_0
    //   136: ldc_w 267
    //   139: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: aload_0
    //   143: athrow
    //   144: astore_1
    //   145: aload 5
    //   147: aload_0
    //   148: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   151: ldc_w 267
    //   154: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: aload_1
    //   158: athrow
    //   159: getstatic 186	a/y:AUy	La/y;
    //   162: astore_1
    //   163: aload 5
    //   165: aconst_null
    //   166: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   169: ldc 166
    //   171: ldc_w 279
    //   174: iconst_1
    //   175: anewarray 170	java/lang/Object
    //   178: dup
    //   179: iconst_0
    //   180: getstatic 81	com/tencent/mm/plugin/forcenotify/d/a:fni	Lcom/tencent/mm/cd/h;
    //   183: ldc 99
    //   185: ldc_w 269
    //   188: iconst_1
    //   189: anewarray 101	java/lang/String
    //   192: dup
    //   193: iconst_0
    //   194: invokestatic 214	com/tencent/mm/model/cb:aaE	()J
    //   197: invokestatic 220	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   200: aastore
    //   201: invokevirtual 282	com/tencent/mm/cd/h:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   204: invokestatic 287	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   207: aastore
    //   208: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   211: ldc_w 267
    //   214: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: return
    //   218: astore_1
    //   219: goto -74 -> 145
    //
    // Exception table:
    //   from	to	target	type
    //   58	66	135	java/lang/Throwable
    //   71	74	135	java/lang/Throwable
    //   74	132	135	java/lang/Throwable
    //   159	163	135	java/lang/Throwable
    //   136	144	144	finally
    //   58	66	218	finally
    //   71	74	218	finally
    //   74	132	218	finally
    //   159	163	218	finally
  }

  // ERROR //
  public static int byb()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc_w 289
    //   5: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 81	com/tencent/mm/plugin/forcenotify/d/a:fni	Lcom/tencent/mm/cd/h;
    //   11: ldc_w 291
    //   14: iconst_1
    //   15: anewarray 101	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc_w 293
    //   23: aastore
    //   24: invokevirtual 261	com/tencent/mm/cd/h:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   27: astore_1
    //   28: aload_1
    //   29: checkcast 148	java/io/Closeable
    //   32: astore_2
    //   33: aload_1
    //   34: ifnonnull +6 -> 40
    //   37: invokestatic 79	a/f/b/j:dWJ	()V
    //   40: aload_1
    //   41: invokeinterface 153 1 0
    //   46: ifeq +24 -> 70
    //   49: aload_1
    //   50: iconst_0
    //   51: invokeinterface 265 2 0
    //   56: istore_3
    //   57: aload_2
    //   58: aconst_null
    //   59: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   62: ldc_w 289
    //   65: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: iload_3
    //   69: ireturn
    //   70: getstatic 186	a/y:AUy	La/y;
    //   73: astore_1
    //   74: aload_2
    //   75: aconst_null
    //   76: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   79: ldc_w 289
    //   82: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: iconst_0
    //   86: istore_3
    //   87: goto -19 -> 68
    //   90: astore_0
    //   91: ldc_w 289
    //   94: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: aload_0
    //   98: athrow
    //   99: astore_1
    //   100: aload_2
    //   101: aload_0
    //   102: invokestatic 180	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   105: ldc_w 289
    //   108: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_1
    //   112: athrow
    //   113: astore_1
    //   114: goto -14 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   37	40	90	java/lang/Throwable
    //   40	57	90	java/lang/Throwable
    //   70	74	90	java/lang/Throwable
    //   91	99	99	finally
    //   37	40	113	finally
    //   40	57	113	finally
    //   70	74	113	finally
  }

  public final void bW(String paramString, int paramInt)
  {
    AppMethodBeat.i(51055);
    a.f.b.j.p(paramString, "userName");
    b localb = new b();
    localb.field_UserName = paramString;
    if (b((c)localb, new String[0]))
    {
      localb.field_Status = paramInt;
      ab.i("MicroMsg.ForceNotifyStorage", "[updateStatus] ret:%s %s", new Object[] { Long.valueOf(fni.replace("ForceNotifyInfo", "UserName", localb.Hl())), localb });
      ((Map)mtg).put(paramString, localb);
      doNotify();
    }
    AppMethodBeat.o(51055);
  }

  public final boolean pI(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(51056);
    a.f.b.j.p(paramString, "userName");
    if (fni.delete("ForceNotifyInfo", "UserName=?", new String[] { paramString }) >= 0)
    {
      mtg.remove(paramString);
      doNotify();
      AppMethodBeat.o(51056);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(51056);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.d.a
 * JD-Core Version:    0.6.2
 */