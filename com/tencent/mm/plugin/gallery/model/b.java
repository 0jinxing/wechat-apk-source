package com.tencent.mm.plugin.gallery.model;

import android.database.Cursor;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class b
  implements i
{
  public static String mNs = "date_modified";
  public static String mNt = "datetaken";
  protected int mNq = 100;
  protected String[] mNr = { "camera", "screenshot", "download" };

  // ERROR //
  private static long a(String paramString, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 5
    //   3: lload 5
    //   5: lstore 7
    //   7: aload_0
    //   8: invokestatic 49	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifne +148 -> 159
    //   14: aload_0
    //   15: lconst_0
    //   16: invokestatic 53	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   19: lstore 9
    //   21: lload 9
    //   23: ldc2_w 54
    //   26: lcmp
    //   27: ifle +135 -> 162
    //   30: lload 9
    //   32: lstore 11
    //   34: getstatic 61	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   37: lload 9
    //   39: getstatic 61	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   42: invokevirtual 65	java/util/concurrent/TimeUnit:convert	(JLjava/util/concurrent/TimeUnit;)J
    //   45: lstore 7
    //   47: lload 7
    //   49: lstore 11
    //   51: lload 11
    //   53: lload_1
    //   54: lcmp
    //   55: ifle +30 -> 85
    //   58: iload 4
    //   60: ifeq +133 -> 193
    //   63: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   66: astore_0
    //   67: iload_3
    //   68: ifeq +118 -> 186
    //   71: ldc2_w 72
    //   74: lstore_1
    //   75: aload_0
    //   76: ldc2_w 74
    //   79: lload_1
    //   80: lconst_1
    //   81: iconst_0
    //   82: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   85: lload 9
    //   87: ldc2_w 54
    //   90: lcmp
    //   91: ifle +141 -> 232
    //   94: iload 4
    //   96: ifeq +25 -> 121
    //   99: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   102: astore_0
    //   103: iload_3
    //   104: ifeq +121 -> 225
    //   107: ldc2_w 79
    //   110: lstore_1
    //   111: aload_0
    //   112: ldc2_w 74
    //   115: lload_1
    //   116: lconst_1
    //   117: iconst_0
    //   118: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   121: lload 11
    //   123: lstore 7
    //   125: lload 9
    //   127: lconst_0
    //   128: lcmp
    //   129: ifgt +30 -> 159
    //   132: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   135: astore_0
    //   136: iload 4
    //   138: ifeq +131 -> 269
    //   141: ldc2_w 81
    //   144: lstore_1
    //   145: aload_0
    //   146: ldc2_w 74
    //   149: lload_1
    //   150: lconst_1
    //   151: iconst_0
    //   152: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   155: lload 11
    //   157: lstore 7
    //   159: lload 7
    //   161: lreturn
    //   162: lload 9
    //   164: lstore 11
    //   166: getstatic 61	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   169: lload 9
    //   171: getstatic 85	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   174: invokevirtual 65	java/util/concurrent/TimeUnit:convert	(JLjava/util/concurrent/TimeUnit;)J
    //   177: lstore 7
    //   179: lload 7
    //   181: lstore 11
    //   183: goto -132 -> 51
    //   186: ldc2_w 86
    //   189: lstore_1
    //   190: goto -115 -> 75
    //   193: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   196: astore_0
    //   197: iload_3
    //   198: ifeq +20 -> 218
    //   201: ldc2_w 88
    //   204: lstore_1
    //   205: aload_0
    //   206: ldc2_w 74
    //   209: lload_1
    //   210: lconst_1
    //   211: iconst_0
    //   212: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   215: goto -130 -> 85
    //   218: ldc2_w 90
    //   221: lstore_1
    //   222: goto -17 -> 205
    //   225: ldc2_w 92
    //   228: lstore_1
    //   229: goto -118 -> 111
    //   232: iload 4
    //   234: ifne -113 -> 121
    //   237: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   240: astore_0
    //   241: iload_3
    //   242: ifeq +20 -> 262
    //   245: ldc2_w 94
    //   248: lstore_1
    //   249: aload_0
    //   250: ldc2_w 74
    //   253: lload_1
    //   254: lconst_1
    //   255: iconst_0
    //   256: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   259: goto -138 -> 121
    //   262: ldc2_w 96
    //   265: lstore_1
    //   266: goto -17 -> 249
    //   269: ldc2_w 98
    //   272: lstore_1
    //   273: goto -128 -> 145
    //   276: astore_0
    //   277: lconst_0
    //   278: lstore 9
    //   280: lload 9
    //   282: lstore 11
    //   284: ldc 101
    //   286: aload_0
    //   287: ldc 103
    //   289: iconst_0
    //   290: anewarray 4	java/lang/Object
    //   293: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   296: lconst_0
    //   297: lload_1
    //   298: lcmp
    //   299: ifle +30 -> 329
    //   302: iload 4
    //   304: ifeq +109 -> 413
    //   307: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   310: astore_0
    //   311: iload_3
    //   312: ifeq +94 -> 406
    //   315: ldc2_w 72
    //   318: lstore_1
    //   319: aload_0
    //   320: ldc2_w 74
    //   323: lload_1
    //   324: lconst_1
    //   325: iconst_0
    //   326: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   329: lload 9
    //   331: ldc2_w 54
    //   334: lcmp
    //   335: ifle +117 -> 452
    //   338: iload 4
    //   340: ifeq +25 -> 365
    //   343: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   346: astore_0
    //   347: iload_3
    //   348: ifeq +97 -> 445
    //   351: ldc2_w 79
    //   354: lstore_1
    //   355: aload_0
    //   356: ldc2_w 74
    //   359: lload_1
    //   360: lconst_1
    //   361: iconst_0
    //   362: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   365: lload 5
    //   367: lstore 7
    //   369: lload 9
    //   371: lconst_0
    //   372: lcmp
    //   373: ifgt -214 -> 159
    //   376: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   379: astore_0
    //   380: iload 4
    //   382: ifeq +107 -> 489
    //   385: ldc2_w 81
    //   388: lstore_1
    //   389: aload_0
    //   390: ldc2_w 74
    //   393: lload_1
    //   394: lconst_1
    //   395: iconst_0
    //   396: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   399: lload 5
    //   401: lstore 7
    //   403: goto -244 -> 159
    //   406: ldc2_w 86
    //   409: lstore_1
    //   410: goto -91 -> 319
    //   413: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   416: astore_0
    //   417: iload_3
    //   418: ifeq +20 -> 438
    //   421: ldc2_w 88
    //   424: lstore_1
    //   425: aload_0
    //   426: ldc2_w 74
    //   429: lload_1
    //   430: lconst_1
    //   431: iconst_0
    //   432: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   435: goto -106 -> 329
    //   438: ldc2_w 90
    //   441: lstore_1
    //   442: goto -17 -> 425
    //   445: ldc2_w 92
    //   448: lstore_1
    //   449: goto -94 -> 355
    //   452: iload 4
    //   454: ifne -89 -> 365
    //   457: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   460: astore_0
    //   461: iload_3
    //   462: ifeq +20 -> 482
    //   465: ldc2_w 94
    //   468: lstore_1
    //   469: aload_0
    //   470: ldc2_w 74
    //   473: lload_1
    //   474: lconst_1
    //   475: iconst_0
    //   476: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   479: goto -114 -> 365
    //   482: ldc2_w 96
    //   485: lstore_1
    //   486: goto -17 -> 469
    //   489: ldc2_w 98
    //   492: lstore_1
    //   493: goto -104 -> 389
    //   496: astore_0
    //   497: lconst_0
    //   498: lstore 11
    //   500: lconst_0
    //   501: lload_1
    //   502: lcmp
    //   503: ifle +32 -> 535
    //   506: iload 4
    //   508: ifeq +106 -> 614
    //   511: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   514: astore 13
    //   516: iload_3
    //   517: ifeq +90 -> 607
    //   520: ldc2_w 72
    //   523: lstore_1
    //   524: aload 13
    //   526: ldc2_w 74
    //   529: lload_1
    //   530: lconst_1
    //   531: iconst_0
    //   532: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   535: lload 11
    //   537: ldc2_w 54
    //   540: lcmp
    //   541: ifle +114 -> 655
    //   544: iload 4
    //   546: ifeq +27 -> 573
    //   549: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   552: astore 13
    //   554: iload_3
    //   555: ifeq +93 -> 648
    //   558: ldc2_w 79
    //   561: lstore_1
    //   562: aload 13
    //   564: ldc2_w 74
    //   567: lload_1
    //   568: lconst_1
    //   569: iconst_0
    //   570: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   573: lload 11
    //   575: lconst_0
    //   576: lcmp
    //   577: ifgt +28 -> 605
    //   580: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   583: astore 13
    //   585: iload 4
    //   587: ifeq +107 -> 694
    //   590: ldc2_w 81
    //   593: lstore_1
    //   594: aload 13
    //   596: ldc2_w 74
    //   599: lload_1
    //   600: lconst_1
    //   601: iconst_0
    //   602: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   605: aload_0
    //   606: athrow
    //   607: ldc2_w 86
    //   610: lstore_1
    //   611: goto -87 -> 524
    //   614: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   617: astore 13
    //   619: iload_3
    //   620: ifeq +21 -> 641
    //   623: ldc2_w 88
    //   626: lstore_1
    //   627: aload 13
    //   629: ldc2_w 74
    //   632: lload_1
    //   633: lconst_1
    //   634: iconst_0
    //   635: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   638: goto -103 -> 535
    //   641: ldc2_w 90
    //   644: lstore_1
    //   645: goto -18 -> 627
    //   648: ldc2_w 92
    //   651: lstore_1
    //   652: goto -90 -> 562
    //   655: iload 4
    //   657: ifne -84 -> 573
    //   660: getstatic 71	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   663: astore 13
    //   665: iload_3
    //   666: ifeq +21 -> 687
    //   669: ldc2_w 94
    //   672: lstore_1
    //   673: aload 13
    //   675: ldc2_w 74
    //   678: lload_1
    //   679: lconst_1
    //   680: iconst_0
    //   681: invokevirtual 78	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   684: goto -111 -> 573
    //   687: ldc2_w 96
    //   690: lstore_1
    //   691: goto -18 -> 673
    //   694: ldc2_w 98
    //   697: lstore_1
    //   698: goto -104 -> 594
    //   701: astore_0
    //   702: goto -202 -> 500
    //   705: astore_0
    //   706: goto -426 -> 280
    //
    // Exception table:
    //   from	to	target	type
    //   14	21	276	java/lang/NumberFormatException
    //   14	21	496	finally
    //   34	47	701	finally
    //   166	179	701	finally
    //   284	296	701	finally
    //   34	47	705	java/lang/NumberFormatException
    //   166	179	705	java/lang/NumberFormatException
  }

  protected static GalleryItem.AlbumItem a(Cursor paramCursor, int paramInt, String paramString)
  {
    Object localObject = null;
    long l = bo.anl(paramCursor.getString(paramCursor.getColumnIndexOrThrow("_id")));
    String str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("_data"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(paramString));
    String str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(mNs));
    String str4 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(mNt));
    if (bo.isNullOrNil(str2))
    {
      ab.e("MicroMsg.BaseMediaQuery", "null or nill album name, ignore this folder");
      paramCursor = localObject;
    }
    while (true)
    {
      return paramCursor;
      int i = paramCursor.getInt(3);
      ab.i("MicroMsg.BaseMediaQuery", "%s(%s) path:%s", new Object[] { str2, Integer.valueOf(i), str1 });
      if ((i == 0) || (bo.isNullOrNil(str1)))
      {
        ab.e("MicroMsg.BaseMediaQuery", "query album failed, " + i + ", " + str1);
        paramCursor = localObject;
      }
      else
      {
        paramString = str1;
        if (bo.isNullOrNil(str1))
          paramString = null;
        paramCursor = paramCursor.getString(paramCursor.getColumnIndexOrThrow("mime_type"));
        paramString = GalleryItem.MediaItem.a(paramInt, Long.valueOf(l).longValue(), paramString, null, paramCursor);
        a(str3, str4, paramInt, paramString);
        paramCursor = new GalleryItem.AlbumItem(str2, i);
        paramCursor.mOh = paramString;
      }
    }
  }

  private static void a(String paramString1, String paramString2, int paramInt, GalleryItem.MediaItem paramMediaItem)
  {
    boolean bool1 = true;
    long l1 = System.currentTimeMillis();
    boolean bool2;
    long l2;
    if (paramInt == 1)
    {
      bool2 = true;
      l2 = a(paramString1, l1, bool2, true);
      if (paramInt != 1)
        break label73;
      bool2 = bool1;
      label36: l1 = a(paramString2, l1, bool2, false);
      if (l2 <= 0L)
        break label79;
    }
    while (true)
    {
      paramMediaItem.mOl = l2;
      paramMediaItem.mOm = l1;
      return;
      bool2 = false;
      break;
      label73: bool2 = false;
      break label36;
      label79: l2 = l1;
    }
  }

  protected static GalleryItem.MediaItem b(Cursor paramCursor, int paramInt)
  {
    String str1 = null;
    Object localObject = str1;
    if (paramCursor != null)
    {
      if (!paramCursor.isAfterLast())
        break label21;
      localObject = str1;
    }
    while (true)
    {
      return localObject;
      label21: localObject = str1;
      if (!paramCursor.isAfterLast())
      {
        Long localLong = Long.valueOf(bo.anl(paramCursor.getString(paramCursor.getColumnIndexOrThrow("_id"))));
        String str2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("_data"));
        String str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(mNs));
        localObject = paramCursor.getString(paramCursor.getColumnIndexOrThrow(mNt));
        GalleryItem.MediaItem localMediaItem = GalleryItem.MediaItem.N(paramInt, localLong.longValue());
        localMediaItem.fPT = str2;
        a(str3, (String)localObject, paramInt, localMediaItem);
        if (d.vxp)
          ab.v("MicroMsg.BaseMediaQuery", "[mediaConvertFrom] [" + localLong + " " + str3 + " " + (String)localObject + "] | " + localMediaItem.mOl + " " + paramInt);
        while (true)
        {
          if ((!bo.isNullOrNil(localMediaItem.fPT)) || (!bo.isNullOrNil(localMediaItem.lZg)))
            break label304;
          ab.w("MicroMsg.BaseMediaQuery", "thumb file and orignal file both not exist");
          paramCursor.moveToNext();
          break;
          ab.d("MicroMsg.BaseMediaQuery", "[mediaConvertFrom] [" + localLong + " " + str3 + " " + (String)localObject + "] | " + localMediaItem.mOl + " " + paramInt);
        }
        label304: str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("mime_type"));
        localObject = str1;
        if (bo.isNullOrNil(str1))
          localObject = "";
        localMediaItem.mMimeType = ((String)localObject);
        paramInt = paramCursor.getColumnIndexOrThrow("latitude");
        double d;
        if (paramCursor.getType(paramInt) != 0)
        {
          d = paramCursor.getDouble(paramInt);
          if (a.r(d))
            localMediaItem.bDG = d;
        }
        paramInt = paramCursor.getColumnIndexOrThrow("longitude");
        if (paramCursor.getType(paramInt) != 0)
        {
          d = paramCursor.getDouble(paramInt);
          if (a.q(d))
            localMediaItem.bDH = d;
        }
        localObject = localMediaItem;
      }
    }
  }

  public String a(String[] paramArrayOfString, boolean paramBoolean)
  {
    return null;
  }

  public String aP(String paramString, boolean paramBoolean)
  {
    return null;
  }

  public String[] bBU()
  {
    return new String[0];
  }

  public final void bBV()
  {
    this.mNq = 1000;
  }

  public String[] getProjection()
  {
    return new String[0];
  }

  public String hB(boolean paramBoolean)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.b
 * JD-Core Version:    0.6.2
 */