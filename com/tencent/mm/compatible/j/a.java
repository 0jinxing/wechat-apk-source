package com.tencent.mm.compatible.j;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import java.io.File;

public final class a
{
  // ERROR //
  private static String e(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: ldc 11
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnonnull +12 -> 18
    //   9: ldc 11
    //   11: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   14: aconst_null
    //   15: astore_0
    //   16: aload_0
    //   17: areturn
    //   18: aload_0
    //   19: invokevirtual 26	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   22: astore_2
    //   23: aload_2
    //   24: aload_1
    //   25: invokevirtual 32	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   28: astore_0
    //   29: ldc 34
    //   31: ldc 36
    //   33: aload_0
    //   34: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   37: invokevirtual 46	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   40: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_0
    //   44: invokestatic 57	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   47: ifeq +13 -> 60
    //   50: ldc 11
    //   52: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: aconst_null
    //   56: astore_0
    //   57: goto -41 -> 16
    //   60: aload_0
    //   61: ldc 59
    //   63: invokevirtual 63	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   66: astore_3
    //   67: aload_1
    //   68: invokevirtual 69	android/net/Uri:getHost	()Ljava/lang/String;
    //   71: ldc 71
    //   73: ldc 73
    //   75: invokevirtual 77	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   78: astore_0
    //   79: aload_1
    //   80: invokevirtual 80	android/net/Uri:getPath	()Ljava/lang/String;
    //   83: ldc 59
    //   85: ldc 73
    //   87: invokevirtual 77	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   90: astore 4
    //   92: new 82	java/lang/StringBuilder
    //   95: dup
    //   96: ldc 84
    //   98: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   101: aload_3
    //   102: iconst_1
    //   103: aaload
    //   104: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: astore 5
    //   112: new 82	java/lang/StringBuilder
    //   115: dup
    //   116: ldc 97
    //   118: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: aload_0
    //   122: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: ldc 73
    //   127: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: aload_3
    //   131: iconst_0
    //   132: aaload
    //   133: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: ldc 73
    //   138: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload 4
    //   143: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: astore 4
    //   151: aload 4
    //   153: astore_0
    //   154: aload 4
    //   156: aload 5
    //   158: invokevirtual 101	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   161: ifne +24 -> 185
    //   164: new 82	java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   171: aload 4
    //   173: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: aload 5
    //   178: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: astore_0
    //   185: ldc 34
    //   187: ldc 106
    //   189: aload_0
    //   190: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   193: invokevirtual 46	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   196: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: new 108	com/tencent/mm/vfs/b
    //   202: dup
    //   203: getstatic 114	com/tencent/mm/compatible/util/e:evs	Ljava/lang/String;
    //   206: aload_0
    //   207: invokespecial 116	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: astore 5
    //   212: aload 5
    //   214: invokevirtual 120	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   217: invokevirtual 124	com/tencent/mm/vfs/b:exists	()Z
    //   220: ifne +12 -> 232
    //   223: aload 5
    //   225: invokevirtual 120	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   228: invokevirtual 127	com/tencent/mm/vfs/b:mkdirs	()Z
    //   231: pop
    //   232: aload 5
    //   234: invokevirtual 124	com/tencent/mm/vfs/b:exists	()Z
    //   237: ifeq +9 -> 246
    //   240: aload 5
    //   242: invokevirtual 130	com/tencent/mm/vfs/b:delete	()Z
    //   245: pop
    //   246: aload 5
    //   248: invokevirtual 133	com/tencent/mm/vfs/b:createNewFile	()Z
    //   251: pop
    //   252: aload 5
    //   254: invokestatic 139	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
    //   257: astore_0
    //   258: aload_2
    //   259: aload_1
    //   260: invokevirtual 143	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   263: astore_1
    //   264: aload_1
    //   265: ifnonnull +21 -> 286
    //   268: aload_1
    //   269: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   272: aload_0
    //   273: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   276: ldc 11
    //   278: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: aconst_null
    //   282: astore_0
    //   283: goto -267 -> 16
    //   286: aload_1
    //   287: astore_2
    //   288: aload_0
    //   289: astore 4
    //   291: sipush 1024
    //   294: newarray byte
    //   296: astore_3
    //   297: aload_1
    //   298: astore_2
    //   299: aload_0
    //   300: astore 4
    //   302: aload_1
    //   303: aload_3
    //   304: invokevirtual 155	java/io/InputStream:read	([B)I
    //   307: istore 6
    //   309: iload 6
    //   311: ifle +57 -> 368
    //   314: aload_1
    //   315: astore_2
    //   316: aload_0
    //   317: astore 4
    //   319: aload_0
    //   320: aload_3
    //   321: iconst_0
    //   322: iload 6
    //   324: invokevirtual 161	java/io/OutputStream:write	([BII)V
    //   327: goto -30 -> 297
    //   330: astore 5
    //   332: aload_1
    //   333: astore_2
    //   334: aload_0
    //   335: astore 4
    //   337: ldc 34
    //   339: aload 5
    //   341: ldc 163
    //   343: iconst_0
    //   344: anewarray 4	java/lang/Object
    //   347: invokestatic 167	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: aload_1
    //   351: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   354: aload_0
    //   355: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   358: ldc 11
    //   360: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   363: aconst_null
    //   364: astore_0
    //   365: goto -349 -> 16
    //   368: aload_1
    //   369: astore_2
    //   370: aload_0
    //   371: astore 4
    //   373: aload 5
    //   375: invokevirtual 171	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   378: invokestatic 176	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   381: astore 5
    //   383: aload 5
    //   385: astore 4
    //   387: aload_1
    //   388: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   391: aload_0
    //   392: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   395: ldc 11
    //   397: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: aload 4
    //   402: astore_0
    //   403: goto -387 -> 16
    //   406: astore_1
    //   407: aconst_null
    //   408: astore_2
    //   409: aconst_null
    //   410: astore_0
    //   411: aload_2
    //   412: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   415: aload_0
    //   416: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   419: ldc 11
    //   421: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   424: aload_1
    //   425: athrow
    //   426: astore_1
    //   427: aconst_null
    //   428: astore_2
    //   429: goto -18 -> 411
    //   432: astore_1
    //   433: aload 4
    //   435: astore_0
    //   436: goto -25 -> 411
    //   439: astore 5
    //   441: aconst_null
    //   442: astore_1
    //   443: aconst_null
    //   444: astore_0
    //   445: goto -113 -> 332
    //   448: astore 5
    //   450: aconst_null
    //   451: astore_1
    //   452: goto -120 -> 332
    //
    // Exception table:
    //   from	to	target	type
    //   291	297	330	java/lang/Exception
    //   302	309	330	java/lang/Exception
    //   319	327	330	java/lang/Exception
    //   373	383	330	java/lang/Exception
    //   246	258	406	finally
    //   258	264	426	finally
    //   291	297	432	finally
    //   302	309	432	finally
    //   319	327	432	finally
    //   337	350	432	finally
    //   373	383	432	finally
    //   246	258	439	java/lang/Exception
    //   258	264	448	java/lang/Exception
  }

  @TargetApi(5)
  public static String i(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = null;
    AppMethodBeat.i(93113);
    if ((paramIntent == null) || (paramIntent.getData() == null))
    {
      ab.e("MicroMsg.GetVideoMetadata", "input invalid");
      AppMethodBeat.o(93113);
      paramContext = (Context)localObject1;
    }
    String str;
    Object localObject2;
    Object localObject3;
    while (true)
    {
      return paramContext;
      long l = bo.yz();
      str = paramIntent.getDataString();
      ab.i("MicroMsg.GetVideoMetadata", "get video file name, dataString ".concat(String.valueOf(str)));
      if (str == null)
      {
        ab.e("MicroMsg.GetVideoMetadata", "dataString empty");
        AppMethodBeat.o(93113);
        paramContext = (Context)localObject1;
      }
      else
      {
        localObject2 = paramContext.getContentResolver();
        if (!str.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString()))
          break;
        localObject3 = ((ContentResolver)localObject2).query(paramIntent.getData(), null, null, null, null);
        localObject1 = null;
        label118: localObject2 = localObject1;
        if (localObject3 != null)
        {
          localObject2 = localObject1;
          if (((Cursor)localObject3).getCount() > 0)
          {
            ((Cursor)localObject3).moveToFirst();
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = ((Cursor)localObject3).getString(((Cursor)localObject3).getColumnIndexOrThrow("_data"));
          }
          ((Cursor)localObject3).close();
        }
        ab.i("MicroMsg.GetVideoMetadata", "get video filename:" + (String)localObject2 + ", cost time: " + bo.az(l));
        if ((TextUtils.isEmpty((CharSequence)localObject2)) || (!new b((String)localObject2).exists()))
          break label462;
        AppMethodBeat.o(93113);
        paramContext = (Context)localObject2;
      }
    }
    if (str.startsWith("content://"))
      localObject1 = bo.h(paramContext, paramIntent.getData());
    while (true)
    {
      label266: if (localObject1 != null)
        if (((String)localObject1).startsWith("/storage/emulated/legacy"))
        {
          localObject1 = h.getExternalStorageDirectory().getAbsolutePath() + ((String)localObject1).substring(24);
          label309: localObject3 = "_data LIKE " + DatabaseUtils.sqlEscapeString((String)localObject1);
          localObject3 = ((ContentResolver)localObject2).query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null, (String)localObject3, null, null);
          break label118;
          if (!str.startsWith("file://"))
            break label494;
          if (paramIntent.getExtras() == null)
            break label488;
          localObject1 = (Uri)paramIntent.getExtras().getParcelable("android.intent.extra.STREAM");
          if ((localObject1 == null) || (bo.isNullOrNil(((Uri)localObject1).getPath())))
            break label488;
        }
      label462: label488: for (localObject3 = ((Uri)localObject1).getPath(); ; localObject3 = null)
      {
        localObject1 = localObject3;
        if (localObject3 != null)
          break label266;
        localObject1 = str.substring(7);
        break label266;
        if (((String)localObject1).startsWith("/sdcard"))
        {
          localObject1 = h.getExternalStorageDirectory().getAbsolutePath() + ((String)localObject1).substring(7);
          break label309;
          paramContext = e(paramContext, paramIntent.getData());
          AppMethodBeat.o(93113);
          break;
        }
        break label309;
        localObject3 = null;
        break label118;
      }
      label494: localObject1 = null;
    }
  }

  // ERROR //
  @TargetApi(5)
  public static a.a j(Context paramContext, Intent paramIntent)
  {
    // Byte code:
    //   0: ldc_w 303
    //   3: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnull +10 -> 17
    //   10: aload_1
    //   11: invokevirtual 187	android/content/Intent:getData	()Landroid/net/Uri;
    //   14: ifnonnull +20 -> 34
    //   17: ldc 34
    //   19: ldc 189
    //   21: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aconst_null
    //   25: astore_0
    //   26: ldc_w 303
    //   29: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: invokestatic 195	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   37: lstore_2
    //   38: aload_1
    //   39: invokevirtual 198	android/content/Intent:getDataString	()Ljava/lang/String;
    //   42: astore 4
    //   44: ldc 34
    //   46: ldc_w 305
    //   49: aload 4
    //   51: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   54: invokevirtual 46	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   57: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload 4
    //   62: ifnonnull +21 -> 83
    //   65: ldc 34
    //   67: ldc 202
    //   69: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: aconst_null
    //   73: astore_0
    //   74: ldc_w 303
    //   77: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -48 -> 32
    //   83: aload_0
    //   84: invokevirtual 26	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   87: astore 5
    //   89: new 6	com/tencent/mm/compatible/j/a$a
    //   92: dup
    //   93: invokespecial 306	com/tencent/mm/compatible/j/a$a:<init>	()V
    //   96: astore 6
    //   98: aload 4
    //   100: getstatic 208	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   103: invokevirtual 209	android/net/Uri:toString	()Ljava/lang/String;
    //   106: invokevirtual 212	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   109: ifeq +409 -> 518
    //   112: aload 5
    //   114: aload_1
    //   115: invokevirtual 187	android/content/Intent:getData	()Landroid/net/Uri;
    //   118: aconst_null
    //   119: aconst_null
    //   120: aconst_null
    //   121: aconst_null
    //   122: invokevirtual 216	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   125: astore 4
    //   127: ldc_w 307
    //   130: istore 7
    //   132: iload 7
    //   134: istore 8
    //   136: aload 4
    //   138: ifnull +205 -> 343
    //   141: iload 7
    //   143: istore 8
    //   145: aload 4
    //   147: invokeinterface 222 1 0
    //   152: ifle +184 -> 336
    //   155: aload 4
    //   157: invokeinterface 225 1 0
    //   162: pop
    //   163: aload 4
    //   165: aload 4
    //   167: ldc_w 309
    //   170: invokeinterface 231 2 0
    //   175: invokeinterface 313 2 0
    //   180: istore 7
    //   182: aload 6
    //   184: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   187: ifnonnull +24 -> 211
    //   190: aload 6
    //   192: aload 4
    //   194: aload 4
    //   196: ldc 227
    //   198: invokeinterface 231 2 0
    //   203: invokeinterface 235 2 0
    //   208: putfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   211: aload 6
    //   213: aload 4
    //   215: aload 4
    //   217: ldc_w 318
    //   220: invokeinterface 231 2 0
    //   225: invokeinterface 313 2 0
    //   230: putfield 321	com/tencent/mm/compatible/j/a$a:duration	I
    //   233: aload 6
    //   235: getfield 321	com/tencent/mm/compatible/j/a$a:duration	I
    //   238: ifne +88 -> 326
    //   241: aconst_null
    //   242: astore 9
    //   244: aconst_null
    //   245: astore 10
    //   247: aload 10
    //   249: astore 11
    //   251: aload 9
    //   253: astore_1
    //   254: ldc 34
    //   256: ldc_w 323
    //   259: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   262: aload 10
    //   264: astore 11
    //   266: aload 9
    //   268: astore_1
    //   269: aload_0
    //   270: aload 6
    //   272: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   275: invokestatic 327	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   278: invokestatic 333	com/tencent/mm/compatible/b/k:d	(Landroid/content/Context;Landroid/net/Uri;)Lcom/tencent/mm/compatible/b/k;
    //   281: astore 10
    //   283: aload 10
    //   285: ifnull +489 -> 774
    //   288: aload 10
    //   290: astore 11
    //   292: aload 10
    //   294: astore_1
    //   295: aload 10
    //   297: invokevirtual 338	android/media/MediaPlayer:getDuration	()I
    //   300: istore 8
    //   302: aload 10
    //   304: astore 11
    //   306: aload 10
    //   308: astore_1
    //   309: aload 6
    //   311: iload 8
    //   313: putfield 321	com/tencent/mm/compatible/j/a$a:duration	I
    //   316: aload 10
    //   318: ifnull +8 -> 326
    //   321: aload 10
    //   323: invokevirtual 341	android/media/MediaPlayer:release	()V
    //   326: aload 6
    //   328: aconst_null
    //   329: putfield 345	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   332: iload 7
    //   334: istore 8
    //   336: aload 4
    //   338: invokeinterface 238 1 0
    //   343: iload 8
    //   345: ldc_w 307
    //   348: if_icmpeq +22 -> 370
    //   351: iload 8
    //   353: i2l
    //   354: lstore 12
    //   356: aload 6
    //   358: aload 5
    //   360: lload 12
    //   362: iconst_1
    //   363: aconst_null
    //   364: invokestatic 351	android/provider/MediaStore$Video$Thumbnails:getThumbnail	(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   367: putfield 345	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   370: aload 6
    //   372: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   375: invokestatic 295	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   378: ifne +79 -> 457
    //   381: aload 6
    //   383: getfield 345	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   386: ifnonnull +71 -> 457
    //   389: ldc 34
    //   391: ldc_w 353
    //   394: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   397: aload 6
    //   399: aload 6
    //   401: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   404: iconst_1
    //   405: invokestatic 359	android/media/ThumbnailUtils:createVideoThumbnail	(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    //   408: putfield 345	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   411: aload 6
    //   413: getfield 345	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   416: ifnonnull +41 -> 457
    //   419: aload_0
    //   420: new 184	android/content/Intent
    //   423: dup
    //   424: ldc_w 361
    //   427: new 82	java/lang/StringBuilder
    //   430: dup
    //   431: ldc_w 280
    //   434: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   437: aload 6
    //   439: getfield 345	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   442: invokevirtual 364	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   445: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   448: invokestatic 327	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   451: invokespecial 367	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   454: invokevirtual 371	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   457: ldc 34
    //   459: ldc_w 373
    //   462: iconst_3
    //   463: anewarray 4	java/lang/Object
    //   466: dup
    //   467: iconst_0
    //   468: lload_2
    //   469: invokestatic 246	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   472: invokestatic 378	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   475: aastore
    //   476: dup
    //   477: iconst_1
    //   478: aload 6
    //   480: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   483: aastore
    //   484: dup
    //   485: iconst_2
    //   486: aload 6
    //   488: getfield 321	com/tencent/mm/compatible/j/a$a:duration	I
    //   491: invokestatic 383	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   494: aastore
    //   495: invokestatic 386	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   498: aload 6
    //   500: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   503: ifnull +357 -> 860
    //   506: ldc_w 303
    //   509: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   512: aload 6
    //   514: astore_0
    //   515: goto -483 -> 32
    //   518: aload 4
    //   520: ldc 252
    //   522: invokevirtual 212	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   525: ifeq +117 -> 642
    //   528: aload 6
    //   530: aload_0
    //   531: aload_1
    //   532: invokevirtual 187	android/content/Intent:getData	()Landroid/net/Uri;
    //   535: invokestatic 255	com/tencent/mm/sdk/platformtools/bo:h	(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //   538: putfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   541: aload 6
    //   543: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   546: ifnull +325 -> 871
    //   549: aload 6
    //   551: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   554: ldc_w 257
    //   557: invokevirtual 212	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   560: ifeq +160 -> 720
    //   563: aload 6
    //   565: new 82	java/lang/StringBuilder
    //   568: dup
    //   569: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   572: invokestatic 263	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   575: invokevirtual 268	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   578: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   581: aload 6
    //   583: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   586: bipush 24
    //   588: invokevirtual 271	java/lang/String:substring	(I)Ljava/lang/String;
    //   591: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   594: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   597: putfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   600: new 82	java/lang/StringBuilder
    //   603: dup
    //   604: ldc_w 273
    //   607: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   610: aload 6
    //   612: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   615: invokestatic 278	android/database/DatabaseUtils:sqlEscapeString	(Ljava/lang/String;)Ljava/lang/String;
    //   618: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   624: astore_1
    //   625: aload 5
    //   627: getstatic 208	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   630: aconst_null
    //   631: aload_1
    //   632: aconst_null
    //   633: aconst_null
    //   634: invokevirtual 216	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   637: astore 4
    //   639: goto -512 -> 127
    //   642: aload 4
    //   644: ldc_w 280
    //   647: invokevirtual 212	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   650: ifeq -109 -> 541
    //   653: aload_1
    //   654: invokevirtual 284	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   657: ifnull +40 -> 697
    //   660: aload_1
    //   661: invokevirtual 284	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   664: ldc_w 286
    //   667: invokevirtual 292	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   670: checkcast 65	android/net/Uri
    //   673: astore_1
    //   674: aload_1
    //   675: ifnull +22 -> 697
    //   678: aload_1
    //   679: invokevirtual 80	android/net/Uri:getPath	()Ljava/lang/String;
    //   682: invokestatic 295	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   685: ifne +12 -> 697
    //   688: aload 6
    //   690: aload_1
    //   691: invokevirtual 80	android/net/Uri:getPath	()Ljava/lang/String;
    //   694: putfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   697: aload 6
    //   699: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   702: ifnonnull -161 -> 541
    //   705: aload 6
    //   707: aload 4
    //   709: bipush 7
    //   711: invokevirtual 271	java/lang/String:substring	(I)Ljava/lang/String;
    //   714: putfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   717: goto -176 -> 541
    //   720: aload 6
    //   722: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   725: ldc_w 297
    //   728: invokevirtual 212	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   731: ifeq -131 -> 600
    //   734: aload 6
    //   736: new 82	java/lang/StringBuilder
    //   739: dup
    //   740: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   743: invokestatic 263	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   746: invokevirtual 268	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   749: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   752: aload 6
    //   754: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   757: bipush 7
    //   759: invokevirtual 271	java/lang/String:substring	(I)Ljava/lang/String;
    //   762: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   768: putfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   771: goto -171 -> 600
    //   774: iconst_0
    //   775: istore 8
    //   777: goto -475 -> 302
    //   780: astore 10
    //   782: aload 11
    //   784: astore_1
    //   785: ldc 34
    //   787: aload 10
    //   789: ldc_w 388
    //   792: iconst_1
    //   793: anewarray 4	java/lang/Object
    //   796: dup
    //   797: iconst_0
    //   798: aload 6
    //   800: getfield 316	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   803: aastore
    //   804: invokestatic 167	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   807: aload 11
    //   809: ifnull -483 -> 326
    //   812: aload 11
    //   814: invokevirtual 341	android/media/MediaPlayer:release	()V
    //   817: goto -491 -> 326
    //   820: astore_0
    //   821: aload_1
    //   822: ifnull +7 -> 829
    //   825: aload_1
    //   826: invokevirtual 341	android/media/MediaPlayer:release	()V
    //   829: ldc_w 303
    //   832: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   835: aload_0
    //   836: athrow
    //   837: astore_1
    //   838: ldc 34
    //   840: aload_1
    //   841: ldc_w 390
    //   844: iconst_0
    //   845: anewarray 4	java/lang/Object
    //   848: invokestatic 167	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   851: aload 6
    //   853: aconst_null
    //   854: putfield 345	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   857: goto -487 -> 370
    //   860: aconst_null
    //   861: astore_0
    //   862: ldc_w 303
    //   865: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   868: goto -836 -> 32
    //   871: aconst_null
    //   872: astore 4
    //   874: goto -747 -> 127
    //
    // Exception table:
    //   from	to	target	type
    //   254	262	780	java/lang/Exception
    //   269	283	780	java/lang/Exception
    //   295	302	780	java/lang/Exception
    //   309	316	780	java/lang/Exception
    //   254	262	820	finally
    //   269	283	820	finally
    //   295	302	820	finally
    //   309	316	820	finally
    //   785	807	820	finally
    //   356	370	837	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.j.a
 * JD-Core Version:    0.6.2
 */