package com.tencent.mm.plugin.voip.a;

import android.app.Notification;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.app.v.c;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ay;
import com.tencent.mm.g.a.ay.a;
import com.tencent.mm.g.a.ba;
import com.tencent.mm.g.a.ba.a;
import com.tencent.mm.g.a.bj;
import com.tencent.mm.g.a.bj.a;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
{
  private static final String SYS_INFO;
  public static Context sZj;
  private static final Uri sZk;

  static
  {
    AppMethodBeat.i(5019);
    sZj = null;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
    localStringBuilder.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
    localStringBuilder.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
    localStringBuilder.append("] BOARD:[" + Build.BOARD);
    localStringBuilder.append("] DEVICE:[" + Build.DEVICE);
    localStringBuilder.append("] DISPLAY:[" + Build.DISPLAY);
    localStringBuilder.append("] FINGERPRINT:[" + Build.FINGERPRINT);
    localStringBuilder.append("] HOST:[" + Build.HOST);
    localStringBuilder.append("] MANUFACTURER:[" + Build.MANUFACTURER);
    localStringBuilder.append("] MODEL:[" + Build.MODEL);
    localStringBuilder.append("] PRODUCT:[" + Build.PRODUCT);
    localStringBuilder.append("] TAGS:[" + Build.TAGS);
    localStringBuilder.append("] TYPE:[" + Build.TYPE);
    localStringBuilder.append("] USER:[" + Build.USER + "]");
    SYS_INFO = localStringBuilder.toString();
    sZk = Uri.parse("content://com.lbe.security.miui.permmgr/active");
    AppMethodBeat.o(5019);
  }

  public static Notification c(v.c paramc)
  {
    AppMethodBeat.i(5018);
    if (com.tencent.mm.compatible.util.d.fP(16))
    {
      paramc = paramc.build();
      AppMethodBeat.o(5018);
    }
    while (true)
    {
      return paramc;
      paramc = paramc.build();
      AppMethodBeat.o(5018);
    }
  }

  public static boolean cLt()
  {
    return true;
  }

  public static int cLu()
  {
    return Build.VERSION.SDK_INT;
  }

  // ERROR //
  private static boolean cLv()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: iconst_0
    //   3: istore_1
    //   4: iconst_0
    //   5: istore_2
    //   6: sipush 5007
    //   9: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: new 155	java/util/Properties
    //   15: astore_3
    //   16: aload_3
    //   17: invokespecial 156	java/util/Properties:<init>	()V
    //   20: new 158	java/io/FileInputStream
    //   23: astore 4
    //   25: new 160	java/io/File
    //   28: astore 5
    //   30: aload 5
    //   32: invokestatic 166	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   35: ldc 168
    //   37: invokespecial 171	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   40: aload 4
    //   42: aload 5
    //   44: invokespecial 174	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: aload 4
    //   49: astore_0
    //   50: aload_3
    //   51: aload 4
    //   53: invokevirtual 178	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   56: aload 4
    //   58: astore_0
    //   59: aload_3
    //   60: ldc 180
    //   62: aconst_null
    //   63: invokevirtual 184	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   66: astore_3
    //   67: iload_2
    //   68: istore 6
    //   70: aload_3
    //   71: ifnull +25 -> 96
    //   74: aload 4
    //   76: astore_0
    //   77: aload_3
    //   78: ldc 186
    //   80: invokevirtual 192	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   83: istore 7
    //   85: iload_2
    //   86: istore 6
    //   88: iload 7
    //   90: ifeq +6 -> 96
    //   93: iconst_1
    //   94: istore 6
    //   96: aload 4
    //   98: invokestatic 197	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   101: ldc 199
    //   103: ldc 201
    //   105: iload 6
    //   107: invokestatic 205	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   110: invokevirtual 209	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   113: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: sipush 5007
    //   119: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: iload 6
    //   124: ireturn
    //   125: astore_0
    //   126: aconst_null
    //   127: astore 4
    //   129: aload 4
    //   131: ifnull +11 -> 142
    //   134: aload 4
    //   136: astore_0
    //   137: aload 4
    //   139: invokevirtual 218	java/io/FileInputStream:close	()V
    //   142: aload 4
    //   144: invokestatic 197	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   147: iload_1
    //   148: istore 6
    //   150: goto -49 -> 101
    //   153: astore 4
    //   155: aload_0
    //   156: invokestatic 197	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   159: sipush 5007
    //   162: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: aload 4
    //   167: athrow
    //   168: astore_0
    //   169: goto -27 -> 142
    //   172: astore 4
    //   174: goto -19 -> 155
    //   177: astore_0
    //   178: goto -49 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   12	47	125	java/io/IOException
    //   12	47	153	finally
    //   137	142	168	java/io/IOException
    //   50	56	172	finally
    //   59	67	172	finally
    //   77	85	172	finally
    //   137	142	172	finally
    //   50	56	177	java/io/IOException
    //   59	67	177	java/io/IOException
    //   77	85	177	java/io/IOException
  }

  public static boolean cLw()
  {
    AppMethodBeat.i(5014);
    ba localba = new ba();
    a.xxA.m(localba);
    boolean bool = localba.cuj.aFV;
    AppMethodBeat.o(5014);
    return bool;
  }

  public static boolean cLx()
  {
    AppMethodBeat.i(5015);
    ui localui = new ui();
    localui.cQx.cAd = 2;
    a.xxA.m(localui);
    boolean bool = localui.cQy.cQz;
    AppMethodBeat.o(5015);
    return bool;
  }

  public static boolean cLy()
  {
    AppMethodBeat.i(5016);
    bj localbj = new bj();
    a.xxA.m(localbj);
    boolean bool = localbj.cuD.aFV;
    AppMethodBeat.o(5016);
    return bool;
  }

  public static boolean cLz()
  {
    AppMethodBeat.i(5017);
    ay localay = new ay();
    a.xxA.m(localay);
    boolean bool = localay.cue.cuf;
    AppMethodBeat.o(5017);
    return bool;
  }

  public static boolean fd(Context paramContext)
  {
    AppMethodBeat.i(5008);
    boolean bool = false;
    if (cLv() == true)
      bool = fg(paramContext);
    ab.d("VoipUtil", "isLbePermissionEnable ret:".concat(String.valueOf(bool)));
    AppMethodBeat.o(5008);
    return bool;
  }

  public static boolean fe(Context paramContext)
  {
    AppMethodBeat.i(5009);
    boolean bool = false;
    if (cLv() == true)
      bool = ff(paramContext);
    ab.d("VoipUtil", "setLbePermissionEnable ret:".concat(String.valueOf(bool)));
    AppMethodBeat.o(5009);
    return bool;
  }

  // ERROR //
  private static boolean ff(Context paramContext)
  {
    // Byte code:
    //   0: sipush 5010
    //   3: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 311	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   10: astore_0
    //   11: aload_0
    //   12: getstatic 124	com/tencent/mm/plugin/voip/a/d:sZk	Landroid/net/Uri;
    //   15: iconst_1
    //   16: anewarray 188	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: ldc_w 313
    //   24: aastore
    //   25: ldc_w 315
    //   28: aconst_null
    //   29: aconst_null
    //   30: invokevirtual 321	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   33: astore_1
    //   34: aload_1
    //   35: ifnull +372 -> 407
    //   38: aload_1
    //   39: astore_2
    //   40: aload_1
    //   41: invokeinterface 326 1 0
    //   46: ifle +361 -> 407
    //   49: aload_1
    //   50: astore_2
    //   51: aload_1
    //   52: invokeinterface 329 1 0
    //   57: ifeq +350 -> 407
    //   60: aload_1
    //   61: astore_2
    //   62: aload_1
    //   63: iconst_0
    //   64: invokeinterface 333 2 0
    //   69: istore_3
    //   70: aload_0
    //   71: astore 4
    //   73: iload_3
    //   74: istore 5
    //   76: aload_1
    //   77: ifnull +15 -> 92
    //   80: aload_1
    //   81: invokeinterface 334 1 0
    //   86: iload_3
    //   87: istore 5
    //   89: aload_0
    //   90: astore 4
    //   92: ldc 199
    //   94: ldc_w 336
    //   97: iconst_3
    //   98: anewarray 4	java/lang/Object
    //   101: dup
    //   102: iconst_0
    //   103: iload 5
    //   105: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   108: aastore
    //   109: dup
    //   110: iconst_1
    //   111: ldc_w 343
    //   114: aastore
    //   115: dup
    //   116: iconst_2
    //   117: ldc_w 344
    //   120: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: aastore
    //   124: invokestatic 347	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: iconst_m1
    //   128: istore_3
    //   129: iload 5
    //   131: iconst_m1
    //   132: if_icmpeq +263 -> 395
    //   135: aload 4
    //   137: ifnull +258 -> 395
    //   140: iload 5
    //   142: ldc_w 344
    //   145: ior
    //   146: istore 6
    //   148: new 349	android/content/ContentValues
    //   151: astore_0
    //   152: aload_0
    //   153: invokespecial 350	android/content/ContentValues:<init>	()V
    //   156: aload_0
    //   157: ldc_w 313
    //   160: iload 6
    //   162: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: invokevirtual 354	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   168: aload 4
    //   170: getstatic 124	com/tencent/mm/plugin/voip/a/d:sZk	Landroid/net/Uri;
    //   173: aload_0
    //   174: ldc_w 315
    //   177: aconst_null
    //   178: invokevirtual 358	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   181: istore 5
    //   183: ldc 199
    //   185: ldc_w 360
    //   188: iconst_5
    //   189: anewarray 4	java/lang/Object
    //   192: dup
    //   193: iconst_0
    //   194: iload 6
    //   196: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: aastore
    //   200: dup
    //   201: iconst_1
    //   202: ldc_w 343
    //   205: aastore
    //   206: dup
    //   207: iconst_2
    //   208: ldc_w 344
    //   211: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   214: aastore
    //   215: dup
    //   216: iconst_3
    //   217: ldc_w 362
    //   220: aastore
    //   221: dup
    //   222: iconst_4
    //   223: iload 5
    //   225: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   228: aastore
    //   229: invokestatic 347	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: iload 5
    //   234: ifle +119 -> 353
    //   237: sipush 5010
    //   240: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: iconst_1
    //   244: istore 7
    //   246: iload 7
    //   248: ireturn
    //   249: astore 8
    //   251: aconst_null
    //   252: astore_0
    //   253: aconst_null
    //   254: astore 4
    //   256: aload_0
    //   257: astore_2
    //   258: ldc 199
    //   260: ldc_w 364
    //   263: iconst_2
    //   264: anewarray 4	java/lang/Object
    //   267: dup
    //   268: iconst_0
    //   269: aload 8
    //   271: aastore
    //   272: dup
    //   273: iconst_1
    //   274: ldc_w 344
    //   277: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   280: aastore
    //   281: invokestatic 367	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: aload_0
    //   285: ifnull +116 -> 401
    //   288: aload_0
    //   289: invokeinterface 334 1 0
    //   294: iconst_m1
    //   295: istore 5
    //   297: goto -205 -> 92
    //   300: astore_0
    //   301: aconst_null
    //   302: astore_2
    //   303: aload_2
    //   304: ifnull +9 -> 313
    //   307: aload_2
    //   308: invokeinterface 334 1 0
    //   313: sipush 5010
    //   316: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   319: aload_0
    //   320: athrow
    //   321: astore_0
    //   322: iload_3
    //   323: istore 5
    //   325: ldc 199
    //   327: ldc_w 369
    //   330: iconst_2
    //   331: anewarray 4	java/lang/Object
    //   334: dup
    //   335: iconst_0
    //   336: aload_0
    //   337: aastore
    //   338: dup
    //   339: iconst_1
    //   340: ldc_w 344
    //   343: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   346: aastore
    //   347: invokestatic 367	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: goto -118 -> 232
    //   353: sipush 5010
    //   356: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   359: iconst_0
    //   360: istore 7
    //   362: goto -116 -> 246
    //   365: astore_0
    //   366: goto -41 -> 325
    //   369: astore_0
    //   370: goto -67 -> 303
    //   373: astore 8
    //   375: aconst_null
    //   376: astore_2
    //   377: aload_0
    //   378: astore 4
    //   380: aload_2
    //   381: astore_0
    //   382: goto -126 -> 256
    //   385: astore 8
    //   387: aload_0
    //   388: astore 4
    //   390: aload_1
    //   391: astore_0
    //   392: goto -136 -> 256
    //   395: iconst_m1
    //   396: istore 5
    //   398: goto -166 -> 232
    //   401: iconst_m1
    //   402: istore 5
    //   404: goto -312 -> 92
    //   407: iconst_m1
    //   408: istore_3
    //   409: goto -339 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   6	11	249	java/lang/Throwable
    //   6	11	300	finally
    //   11	34	300	finally
    //   148	183	321	java/lang/Throwable
    //   183	232	365	java/lang/Throwable
    //   40	49	369	finally
    //   51	60	369	finally
    //   62	70	369	finally
    //   258	284	369	finally
    //   11	34	373	java/lang/Throwable
    //   40	49	385	java/lang/Throwable
    //   51	60	385	java/lang/Throwable
    //   62	70	385	java/lang/Throwable
  }

  // ERROR //
  private static boolean fg(Context paramContext)
  {
    // Byte code:
    //   0: sipush 5011
    //   3: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 311	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   10: getstatic 124	com/tencent/mm/plugin/voip/a/d:sZk	Landroid/net/Uri;
    //   13: iconst_4
    //   14: anewarray 188	java/lang/String
    //   17: dup
    //   18: iconst_0
    //   19: ldc_w 371
    //   22: aastore
    //   23: dup
    //   24: iconst_1
    //   25: ldc_w 313
    //   28: aastore
    //   29: dup
    //   30: iconst_2
    //   31: ldc_w 373
    //   34: aastore
    //   35: dup
    //   36: iconst_3
    //   37: ldc_w 375
    //   40: aastore
    //   41: ldc_w 315
    //   44: aconst_null
    //   45: aconst_null
    //   46: invokevirtual 321	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull +135 -> 186
    //   54: aload_1
    //   55: astore_0
    //   56: aload_1
    //   57: invokeinterface 326 1 0
    //   62: ifle +124 -> 186
    //   65: aload_1
    //   66: astore_0
    //   67: aload_1
    //   68: invokeinterface 329 1 0
    //   73: ifeq +113 -> 186
    //   76: aload_1
    //   77: astore_0
    //   78: aload_1
    //   79: iconst_0
    //   80: invokeinterface 333 2 0
    //   85: istore_2
    //   86: aload_1
    //   87: astore_0
    //   88: aload_1
    //   89: iconst_1
    //   90: invokeinterface 333 2 0
    //   95: istore_3
    //   96: aload_1
    //   97: astore_0
    //   98: aload_1
    //   99: iconst_2
    //   100: invokeinterface 333 2 0
    //   105: istore 4
    //   107: aload_1
    //   108: astore_0
    //   109: aload_1
    //   110: iconst_3
    //   111: invokeinterface 333 2 0
    //   116: istore 5
    //   118: iload_2
    //   119: ldc_w 344
    //   122: iand
    //   123: ldc_w 344
    //   126: if_icmpne +21 -> 147
    //   129: iload 4
    //   131: ldc_w 344
    //   134: iand
    //   135: ifne +12 -> 147
    //   138: iload 5
    //   140: ldc_w 344
    //   143: iand
    //   144: ifeq +14 -> 158
    //   147: iload_3
    //   148: ldc_w 344
    //   151: iand
    //   152: ldc_w 344
    //   155: if_icmpne +25 -> 180
    //   158: iconst_1
    //   159: istore 6
    //   161: aload_1
    //   162: ifnull +9 -> 171
    //   165: aload_1
    //   166: invokeinterface 334 1 0
    //   171: sipush 5011
    //   174: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: iload 6
    //   179: ireturn
    //   180: iconst_0
    //   181: istore 6
    //   183: goto -22 -> 161
    //   186: aload_1
    //   187: ifnull +9 -> 196
    //   190: aload_1
    //   191: invokeinterface 334 1 0
    //   196: sipush 5011
    //   199: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: iconst_0
    //   203: istore 6
    //   205: goto -28 -> 177
    //   208: astore 7
    //   210: aconst_null
    //   211: astore_1
    //   212: aload_1
    //   213: astore_0
    //   214: ldc_w 377
    //   217: ldc_w 379
    //   220: iconst_2
    //   221: anewarray 4	java/lang/Object
    //   224: dup
    //   225: iconst_0
    //   226: aload 7
    //   228: aastore
    //   229: dup
    //   230: iconst_1
    //   231: ldc_w 344
    //   234: invokestatic 341	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   237: aastore
    //   238: invokestatic 367	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: aload_1
    //   242: ifnull -46 -> 196
    //   245: aload_1
    //   246: invokeinterface 334 1 0
    //   251: goto -55 -> 196
    //   254: astore_1
    //   255: aconst_null
    //   256: astore_0
    //   257: aload_0
    //   258: ifnull +9 -> 267
    //   261: aload_0
    //   262: invokeinterface 334 1 0
    //   267: sipush 5011
    //   270: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   273: aload_1
    //   274: athrow
    //   275: astore_1
    //   276: goto -19 -> 257
    //   279: astore 7
    //   281: goto -69 -> 212
    //
    // Exception table:
    //   from	to	target	type
    //   6	50	208	java/lang/Throwable
    //   6	50	254	finally
    //   56	65	275	finally
    //   67	76	275	finally
    //   78	86	275	finally
    //   88	96	275	finally
    //   98	107	275	finally
    //   109	118	275	finally
    //   214	241	275	finally
    //   56	65	279	java/lang/Throwable
    //   67	76	279	java/lang/Throwable
    //   78	86	279	java/lang/Throwable
    //   88	96	279	java/lang/Throwable
    //   98	107	279	java/lang/Throwable
    //   109	118	279	java/lang/Throwable
  }

  public static void fh(Context paramContext)
  {
    AppMethodBeat.i(5012);
    Toast.makeText(paramContext, 2131304426, 0).show();
    AppMethodBeat.o(5012);
  }

  public static int vn(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(5013);
    try
    {
      int j = bo.getInt(g.Nu().getValue(paramString), 0);
      i = j;
      AppMethodBeat.o(5013);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("VoipUtil", "getIntValFromDynamicConfig parseInt failed, val: ".concat(String.valueOf(paramString)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.a.d
 * JD-Core Version:    0.6.2
 */