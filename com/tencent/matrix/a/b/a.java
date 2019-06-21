package com.tencent.matrix.a.b;

import android.app.AlarmManager.OnAlarmListener;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.tencent.matrix.d.d;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class a extends com.tencent.matrix.c.c
{
  private final int bUH;
  private final int bUI;
  private final f bUJ;
  final b bUK;
  List<a> bUL;
  private long bUM;

  // ERROR //
  public a(com.tencent.matrix.c.c.a parama, com.tencent.matrix.a.a.a parama1)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 45	com/tencent/matrix/c/c:<init>	(Lcom/tencent/matrix/c/c$a;)V
    //   5: aload_0
    //   6: aload_2
    //   7: getfield 51	com/tencent/matrix/a/a/a:bUG	Lcom/tencent/mrs/b/a;
    //   10: getstatic 57	com/tencent/mrs/b/a$a:AjD	Lcom/tencent/mrs/b/a$a;
    //   13: invokevirtual 61	com/tencent/mrs/b/a$a:name	()Ljava/lang/String;
    //   16: bipush 20
    //   18: invokeinterface 67 3 0
    //   23: putfield 69	com/tencent/matrix/a/b/a:bUH	I
    //   26: aload_0
    //   27: aload_2
    //   28: getfield 51	com/tencent/matrix/a/a/a:bUG	Lcom/tencent/mrs/b/a;
    //   31: getstatic 72	com/tencent/mrs/b/a$a:AjE	Lcom/tencent/mrs/b/a$a;
    //   34: invokevirtual 61	com/tencent/mrs/b/a$a:name	()Ljava/lang/String;
    //   37: bipush 12
    //   39: invokeinterface 67 3 0
    //   44: putfield 74	com/tencent/matrix/a/b/a:bUI	I
    //   47: aload_0
    //   48: new 21	com/tencent/matrix/a/b/a$f
    //   51: dup
    //   52: aload_0
    //   53: invokespecial 77	com/tencent/matrix/a/b/a$f:<init>	(Lcom/tencent/matrix/a/b/a;)V
    //   56: putfield 79	com/tencent/matrix/a/b/a:bUJ	Lcom/tencent/matrix/a/b/a$f;
    //   59: aload_0
    //   60: getfield 79	com/tencent/matrix/a/b/a:bUJ	Lcom/tencent/matrix/a/b/a$f;
    //   63: astore_3
    //   64: new 81	java/io/File
    //   67: dup
    //   68: aload_3
    //   69: getfield 85	com/tencent/matrix/a/b/a$f:bVa	Ljava/lang/String;
    //   72: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
    //   75: astore 4
    //   77: aload 4
    //   79: invokevirtual 92	java/io/File:exists	()Z
    //   82: ifne +46 -> 128
    //   85: aload_3
    //   86: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   89: new 98	java/util/ArrayList
    //   92: dup
    //   93: invokespecial 101	java/util/ArrayList:<init>	()V
    //   96: putfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   99: aload_3
    //   100: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   103: ldc2_w 104
    //   106: putfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   109: aload_2
    //   110: invokevirtual 110	com/tencent/matrix/a/a/a:yO	()Z
    //   113: ifeq +399 -> 512
    //   116: aload_0
    //   117: new 9	com/tencent/matrix/a/b/a$b
    //   120: dup
    //   121: invokespecial 111	com/tencent/matrix/a/b/a$b:<init>	()V
    //   124: putfield 113	com/tencent/matrix/a/b/a:bUK	Lcom/tencent/matrix/a/b/a$b;
    //   127: return
    //   128: new 115	java/io/ObjectInputStream
    //   131: astore 5
    //   133: new 117	java/io/BufferedInputStream
    //   136: astore_1
    //   137: new 119	java/io/FileInputStream
    //   140: astore 6
    //   142: aload 6
    //   144: aload 4
    //   146: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   149: aload_1
    //   150: aload 6
    //   152: invokespecial 125	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   155: aload 5
    //   157: aload_1
    //   158: invokespecial 126	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   161: aload 5
    //   163: astore_1
    //   164: aload 5
    //   166: invokevirtual 130	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   169: checkcast 15	com/tencent/matrix/a/b/a$d
    //   172: astore 6
    //   174: aload 6
    //   176: ifnull +33 -> 209
    //   179: aload 5
    //   181: astore_1
    //   182: aload_3
    //   183: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   186: aload 6
    //   188: invokevirtual 134	com/tencent/matrix/a/b/a$d:yR	()Ljava/util/List;
    //   191: putfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   194: aload 5
    //   196: astore_1
    //   197: aload_3
    //   198: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   201: aload 6
    //   203: invokestatic 137	com/tencent/matrix/a/b/a$d:a	(Lcom/tencent/matrix/a/b/a$d;)J
    //   206: putfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   209: aload 5
    //   211: invokevirtual 140	java/io/ObjectInputStream:close	()V
    //   214: aload_3
    //   215: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   218: getfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   221: ifnonnull +27 -> 248
    //   224: aload_3
    //   225: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   228: new 98	java/util/ArrayList
    //   231: dup
    //   232: invokespecial 101	java/util/ArrayList:<init>	()V
    //   235: putfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   238: aload_3
    //   239: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   242: ldc2_w 104
    //   245: putfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   248: ldc 142
    //   250: ldc 144
    //   252: iconst_2
    //   253: anewarray 146	java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: aload_3
    //   259: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   262: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   265: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   268: aastore
    //   269: dup
    //   270: iconst_1
    //   271: aload_3
    //   272: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   275: getfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   278: invokeinterface 158 1 0
    //   283: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   286: aastore
    //   287: invokestatic 169	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: goto -181 -> 109
    //   293: astore_1
    //   294: ldc 142
    //   296: ldc 171
    //   298: iconst_1
    //   299: anewarray 146	java/lang/Object
    //   302: dup
    //   303: iconst_0
    //   304: aload_1
    //   305: aastore
    //   306: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   309: goto -95 -> 214
    //   312: astore 6
    //   314: aconst_null
    //   315: astore 5
    //   317: aload 5
    //   319: astore_1
    //   320: ldc 142
    //   322: ldc 176
    //   324: iconst_1
    //   325: anewarray 146	java/lang/Object
    //   328: dup
    //   329: iconst_0
    //   330: aload 6
    //   332: aastore
    //   333: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   336: aload 5
    //   338: ifnull -124 -> 214
    //   341: aload 5
    //   343: invokevirtual 140	java/io/ObjectInputStream:close	()V
    //   346: goto -132 -> 214
    //   349: astore_1
    //   350: ldc 142
    //   352: ldc 171
    //   354: iconst_1
    //   355: anewarray 146	java/lang/Object
    //   358: dup
    //   359: iconst_0
    //   360: aload_1
    //   361: aastore
    //   362: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   365: goto -151 -> 214
    //   368: astore 6
    //   370: aconst_null
    //   371: astore 5
    //   373: aload 5
    //   375: astore_1
    //   376: ldc 142
    //   378: ldc 176
    //   380: iconst_1
    //   381: anewarray 146	java/lang/Object
    //   384: dup
    //   385: iconst_0
    //   386: aload 6
    //   388: aastore
    //   389: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   392: aload 5
    //   394: ifnull -180 -> 214
    //   397: aload 5
    //   399: invokevirtual 140	java/io/ObjectInputStream:close	()V
    //   402: goto -188 -> 214
    //   405: astore_1
    //   406: ldc 142
    //   408: ldc 171
    //   410: iconst_1
    //   411: anewarray 146	java/lang/Object
    //   414: dup
    //   415: iconst_0
    //   416: aload_1
    //   417: aastore
    //   418: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   421: goto -207 -> 214
    //   424: astore 6
    //   426: aconst_null
    //   427: astore 5
    //   429: aload 5
    //   431: astore_1
    //   432: ldc 142
    //   434: ldc 178
    //   436: iconst_1
    //   437: anewarray 146	java/lang/Object
    //   440: dup
    //   441: iconst_0
    //   442: aload 6
    //   444: aastore
    //   445: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   448: aload 5
    //   450: ifnull -236 -> 214
    //   453: aload 5
    //   455: invokevirtual 140	java/io/ObjectInputStream:close	()V
    //   458: goto -244 -> 214
    //   461: astore_1
    //   462: ldc 142
    //   464: ldc 171
    //   466: iconst_1
    //   467: anewarray 146	java/lang/Object
    //   470: dup
    //   471: iconst_0
    //   472: aload_1
    //   473: aastore
    //   474: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: goto -263 -> 214
    //   480: astore_2
    //   481: aconst_null
    //   482: astore_1
    //   483: aload_1
    //   484: ifnull +7 -> 491
    //   487: aload_1
    //   488: invokevirtual 140	java/io/ObjectInputStream:close	()V
    //   491: aload_2
    //   492: athrow
    //   493: astore_1
    //   494: ldc 142
    //   496: ldc 171
    //   498: iconst_1
    //   499: anewarray 146	java/lang/Object
    //   502: dup
    //   503: iconst_0
    //   504: aload_1
    //   505: aastore
    //   506: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   509: goto -18 -> 491
    //   512: aload_0
    //   513: aconst_null
    //   514: putfield 113	com/tencent/matrix/a/b/a:bUK	Lcom/tencent/matrix/a/b/a$b;
    //   517: goto -390 -> 127
    //   520: astore_2
    //   521: goto -38 -> 483
    //   524: astore 6
    //   526: goto -97 -> 429
    //   529: astore 6
    //   531: goto -158 -> 373
    //   534: astore 6
    //   536: goto -219 -> 317
    //
    // Exception table:
    //   from	to	target	type
    //   209	214	293	java/io/IOException
    //   128	161	312	java/io/IOException
    //   341	346	349	java/io/IOException
    //   128	161	368	java/lang/ClassNotFoundException
    //   397	402	405	java/io/IOException
    //   128	161	424	java/lang/Exception
    //   453	458	461	java/io/IOException
    //   128	161	480	finally
    //   487	491	493	java/io/IOException
    //   164	174	520	finally
    //   182	194	520	finally
    //   197	209	520	finally
    //   320	336	520	finally
    //   376	392	520	finally
    //   432	448	520	finally
    //   164	174	524	java/lang/Exception
    //   182	194	524	java/lang/Exception
    //   197	209	524	java/lang/Exception
    //   164	174	529	java/lang/ClassNotFoundException
    //   182	194	529	java/lang/ClassNotFoundException
    //   197	209	529	java/lang/ClassNotFoundException
    //   164	174	534	java/io/IOException
    //   182	194	534	java/io/IOException
    //   197	209	534	java/io/IOException
  }

  private static Intent u(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      paramArrayOfByte = null;
    while (true)
    {
      return paramArrayOfByte;
      try
      {
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
        localParcel.setDataPosition(0);
        paramArrayOfByte = (Intent)Intent.CREATOR.createFromParcel(localParcel);
        localParcel.recycle();
      }
      catch (IllegalStateException paramArrayOfByte)
      {
        com.tencent.matrix.d.c.e("MicroMsg.AlarmDetector", "[bytesToIntent] %s", new Object[] { paramArrayOfByte });
        paramArrayOfByte = null;
      }
    }
  }

  final void a(AlarmManager.OnAlarmListener paramOnAlarmListener, e parame)
  {
    int i = 0;
    if (i < this.bUL.size())
    {
      a locala = (a)this.bUL.get(i);
      if ((locala.bUQ != null) && (locala.bUQ.equals(paramOnAlarmListener)))
        locala.yQ();
      while (true)
      {
        i++;
        break;
        if (locala.bUP != null)
        {
          e locale = locala.bUP;
          int j;
          if ((locale.bUY != null) && (locale.bUY.equals(parame.bUY)))
            j = 1;
          while (true)
          {
            if (j == 0)
              break label197;
            locala.yQ();
            break;
            if (locale.bUT == parame.bUT)
              j = 1;
            else if ((locale.bUZ != null) && (locale.bUZ.filterEquals(parame.bUZ)))
              j = 1;
            else if ((locale.bUV != null) && (locale.bUV.equals(parame.bUV)))
              j = 1;
            else
              j = 0;
          }
        }
        label197: if ((locala.bUP == null) && (locala.bUQ == null))
          locala.yQ();
      }
    }
  }

  // ERROR //
  final void yP()
  {
    // Byte code:
    //   0: invokestatic 281	java/lang/System:currentTimeMillis	()J
    //   3: lstore_1
    //   4: ldc 142
    //   6: ldc_w 283
    //   9: iconst_2
    //   10: anewarray 146	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: lload_1
    //   16: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: aload_0
    //   23: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   26: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   29: aastore
    //   30: invokestatic 169	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: aload_0
    //   34: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   37: lconst_0
    //   38: lcmp
    //   39: ifgt +8 -> 47
    //   42: aload_0
    //   43: lload_1
    //   44: putfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   47: lload_1
    //   48: aload_0
    //   49: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   52: lsub
    //   53: ldc2_w 284
    //   56: lcmp
    //   57: iflt +71 -> 128
    //   60: aload_0
    //   61: lload_1
    //   62: ldc2_w 286
    //   65: lsub
    //   66: putfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   69: aload_0
    //   70: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   73: ldc2_w 288
    //   76: ladd
    //   77: lload_1
    //   78: lcmp
    //   79: ifgt +664 -> 743
    //   82: aload_0
    //   83: getfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   86: ifnull +15 -> 101
    //   89: aload_0
    //   90: getfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   93: invokeinterface 292 1 0
    //   98: ifeq +58 -> 156
    //   101: ldc 142
    //   103: ldc_w 294
    //   106: iconst_0
    //   107: anewarray 146	java/lang/Object
    //   110: invokestatic 169	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aload_0
    //   114: aload_0
    //   115: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   118: ldc2_w 288
    //   121: ladd
    //   122: putfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   125: goto -56 -> 69
    //   128: lload_1
    //   129: aload_0
    //   130: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   133: lsub
    //   134: ldc2_w 286
    //   137: lcmp
    //   138: iflt -69 -> 69
    //   141: aload_0
    //   142: aload_0
    //   143: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   146: ldc2_w 286
    //   149: ladd
    //   150: putfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   153: goto -84 -> 69
    //   156: new 296	java/lang/StringBuilder
    //   159: dup
    //   160: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   163: astore_3
    //   164: new 296	java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   171: astore 4
    //   173: iconst_0
    //   174: istore 5
    //   176: aload_0
    //   177: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   180: ldc2_w 288
    //   183: ladd
    //   184: lstore 6
    //   186: aload_0
    //   187: getfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   190: invokeinterface 301 1 0
    //   195: astore 8
    //   197: iconst_0
    //   198: istore 9
    //   200: aload 8
    //   202: invokeinterface 306 1 0
    //   207: ifeq +324 -> 531
    //   210: aload 8
    //   212: invokeinterface 309 1 0
    //   217: checkcast 6	com/tencent/matrix/a/b/a$a
    //   220: astore 10
    //   222: aload 10
    //   224: getfield 312	com/tencent/matrix/a/b/a$a:type	I
    //   227: iconst_1
    //   228: if_icmpeq +11 -> 239
    //   231: aload 10
    //   233: getfield 312	com/tencent/matrix/a/b/a$a:type	I
    //   236: ifne +40 -> 276
    //   239: aload 10
    //   241: getfield 315	com/tencent/matrix/a/b/a$a:bUN	J
    //   244: lstore 11
    //   246: lload 11
    //   248: aload_0
    //   249: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   252: lcmp
    //   253: ifge +41 -> 294
    //   256: aload 10
    //   258: getfield 318	com/tencent/matrix/a/b/a$a:bUO	J
    //   261: lconst_0
    //   262: lcmp
    //   263: ifgt +31 -> 294
    //   266: aload 8
    //   268: invokeinterface 321 1 0
    //   273: goto -73 -> 200
    //   276: aload 10
    //   278: getfield 315	com/tencent/matrix/a/b/a$a:bUN	J
    //   281: invokestatic 281	java/lang/System:currentTimeMillis	()J
    //   284: ladd
    //   285: invokestatic 326	android/os/SystemClock:elapsedRealtime	()J
    //   288: lsub
    //   289: lstore 11
    //   291: goto -45 -> 246
    //   294: aload 10
    //   296: getfield 329	com/tencent/matrix/a/b/a$a:bUR	J
    //   299: aload_0
    //   300: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   303: lcmp
    //   304: iflt +14 -> 318
    //   307: aload 10
    //   309: getfield 329	com/tencent/matrix/a/b/a$a:bUR	J
    //   312: lload 11
    //   314: lcmp
    //   315: ifgt +13 -> 328
    //   318: aload 8
    //   320: invokeinterface 321 1 0
    //   325: goto -125 -> 200
    //   328: lload 11
    //   330: lload 6
    //   332: lcmp
    //   333: ifge -133 -> 200
    //   336: aload 10
    //   338: getfield 318	com/tencent/matrix/a/b/a$a:bUO	J
    //   341: lconst_0
    //   342: lcmp
    //   343: ifle +176 -> 519
    //   346: aload 10
    //   348: getfield 329	com/tencent/matrix/a/b/a$a:bUR	J
    //   351: lload 6
    //   353: lcmp
    //   354: ifge +124 -> 478
    //   357: aload 10
    //   359: getfield 329	com/tencent/matrix/a/b/a$a:bUR	J
    //   362: lstore 13
    //   364: aload_0
    //   365: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   368: lload 11
    //   370: lcmp
    //   371: ifgt +114 -> 485
    //   374: lload 13
    //   376: lload 11
    //   378: lsub
    //   379: lconst_1
    //   380: lsub
    //   381: aload 10
    //   383: getfield 318	com/tencent/matrix/a/b/a$a:bUO	J
    //   386: ldiv
    //   387: lconst_1
    //   388: ladd
    //   389: lstore 11
    //   391: iload 5
    //   393: i2l
    //   394: lload 11
    //   396: ladd
    //   397: l2i
    //   398: istore 15
    //   400: aload_3
    //   401: aload 10
    //   403: getfield 332	com/tencent/matrix/a/b/a$a:stackTrace	Ljava/lang/String;
    //   406: invokevirtual 336	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: ldc_w 338
    //   412: invokevirtual 336	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: pop
    //   416: aload 10
    //   418: getfield 312	com/tencent/matrix/a/b/a$a:type	I
    //   421: ifeq +12 -> 433
    //   424: aload 10
    //   426: getfield 312	com/tencent/matrix/a/b/a$a:type	I
    //   429: iconst_2
    //   430: if_icmpne +95 -> 525
    //   433: iconst_1
    //   434: istore 16
    //   436: iload 15
    //   438: istore 5
    //   440: iload 16
    //   442: ifeq -242 -> 200
    //   445: lload 11
    //   447: iload 9
    //   449: i2l
    //   450: ladd
    //   451: l2i
    //   452: istore 9
    //   454: aload 4
    //   456: aload 10
    //   458: getfield 332	com/tencent/matrix/a/b/a$a:stackTrace	Ljava/lang/String;
    //   461: invokevirtual 336	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: ldc_w 338
    //   467: invokevirtual 336	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: iload 15
    //   473: istore 5
    //   475: goto -275 -> 200
    //   478: lload 6
    //   480: lstore 13
    //   482: goto -118 -> 364
    //   485: lload 13
    //   487: aload_0
    //   488: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   491: aload_0
    //   492: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   495: lload 11
    //   497: lsub
    //   498: aload 10
    //   500: getfield 318	com/tencent/matrix/a/b/a$a:bUO	J
    //   503: lrem
    //   504: lsub
    //   505: lsub
    //   506: lconst_1
    //   507: lsub
    //   508: aload 10
    //   510: getfield 318	com/tencent/matrix/a/b/a$a:bUO	J
    //   513: ldiv
    //   514: lstore 11
    //   516: goto -125 -> 391
    //   519: lconst_1
    //   520: lstore 11
    //   522: goto -131 -> 391
    //   525: iconst_0
    //   526: istore 16
    //   528: goto -92 -> 436
    //   531: iconst_m1
    //   532: istore 16
    //   534: aconst_null
    //   535: astore 10
    //   537: iload 5
    //   539: aload_0
    //   540: getfield 69	com/tencent/matrix/a/b/a:bUH	I
    //   543: if_icmplt +67 -> 610
    //   546: aload_3
    //   547: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   550: astore 10
    //   552: iconst_4
    //   553: istore 9
    //   555: iload 9
    //   557: ifle -444 -> 113
    //   560: ldc_w 343
    //   563: iconst_2
    //   564: anewarray 146	java/lang/Object
    //   567: dup
    //   568: iconst_0
    //   569: iload 9
    //   571: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   574: aastore
    //   575: dup
    //   576: iconst_1
    //   577: aload 10
    //   579: aastore
    //   580: invokestatic 347	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   583: invokestatic 353	com/tencent/matrix/d/d:ck	(Ljava/lang/String;)Ljava/lang/String;
    //   586: astore_3
    //   587: aload_0
    //   588: aload_3
    //   589: invokevirtual 357	com/tencent/matrix/a/b/a:cg	(Ljava/lang/String;)Z
    //   592: ifeq +48 -> 640
    //   595: ldc 142
    //   597: ldc_w 359
    //   600: iconst_0
    //   601: anewarray 146	java/lang/Object
    //   604: invokestatic 361	com/tencent/matrix/d/c:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   607: goto -494 -> 113
    //   610: iload 9
    //   612: aload_0
    //   613: getfield 74	com/tencent/matrix/a/b/a:bUI	I
    //   616: if_icmplt +427 -> 1043
    //   619: iconst_5
    //   620: istore 16
    //   622: aload 4
    //   624: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   627: astore 10
    //   629: iload 9
    //   631: istore 5
    //   633: iload 16
    //   635: istore 9
    //   637: goto -82 -> 555
    //   640: new 363	org/json/JSONObject
    //   643: dup
    //   644: invokespecial 364	org/json/JSONObject:<init>	()V
    //   647: astore 4
    //   649: aload 4
    //   651: ldc_w 366
    //   654: aload 10
    //   656: invokevirtual 370	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   659: pop
    //   660: aload 4
    //   662: ldc_w 372
    //   665: iload 5
    //   667: invokevirtual 375	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   670: pop
    //   671: aload 4
    //   673: ldc_w 377
    //   676: ldc_w 379
    //   679: invokevirtual 370	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   682: pop
    //   683: new 381	com/tencent/matrix/c/b
    //   686: dup
    //   687: iload 9
    //   689: invokespecial 383	com/tencent/matrix/c/b:<init>	(I)V
    //   692: astore 10
    //   694: aload 10
    //   696: aload_3
    //   697: putfield 386	com/tencent/matrix/c/b:key	Ljava/lang/String;
    //   700: aload 10
    //   702: aload 4
    //   704: putfield 390	com/tencent/matrix/c/b:bWv	Lorg/json/JSONObject;
    //   707: aload_0
    //   708: aload 10
    //   710: invokevirtual 393	com/tencent/matrix/a/b/a:b	(Lcom/tencent/matrix/c/b;)V
    //   713: aload_0
    //   714: aload_3
    //   715: invokevirtual 396	com/tencent/matrix/a/b/a:cf	(Ljava/lang/String;)V
    //   718: goto -605 -> 113
    //   721: astore 10
    //   723: ldc 142
    //   725: ldc_w 398
    //   728: iconst_1
    //   729: anewarray 146	java/lang/Object
    //   732: dup
    //   733: iconst_0
    //   734: aload 10
    //   736: aastore
    //   737: invokestatic 226	com/tencent/matrix/d/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   740: goto -57 -> 683
    //   743: aload_0
    //   744: getfield 79	com/tencent/matrix/a/b/a:bUJ	Lcom/tencent/matrix/a/b/a$f;
    //   747: astore 4
    //   749: new 81	java/io/File
    //   752: dup
    //   753: aload 4
    //   755: getfield 85	com/tencent/matrix/a/b/a$f:bVa	Ljava/lang/String;
    //   758: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
    //   761: astore 10
    //   763: aload 10
    //   765: invokevirtual 402	java/io/File:getParentFile	()Ljava/io/File;
    //   768: invokevirtual 92	java/io/File:exists	()Z
    //   771: ifne +12 -> 783
    //   774: aload 10
    //   776: invokevirtual 402	java/io/File:getParentFile	()Ljava/io/File;
    //   779: invokevirtual 405	java/io/File:mkdirs	()Z
    //   782: pop
    //   783: new 407	java/io/ObjectOutputStream
    //   786: astore_3
    //   787: new 409	java/io/BufferedOutputStream
    //   790: astore 8
    //   792: new 411	java/io/FileOutputStream
    //   795: astore 17
    //   797: aload 17
    //   799: aload 10
    //   801: invokespecial 412	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   804: aload 8
    //   806: aload 17
    //   808: invokespecial 415	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   811: aload_3
    //   812: aload 8
    //   814: invokespecial 416	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   817: aload_3
    //   818: astore 10
    //   820: new 15	com/tencent/matrix/a/b/a$d
    //   823: astore 8
    //   825: aload_3
    //   826: astore 10
    //   828: aload 8
    //   830: aload 4
    //   832: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   835: getfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   838: aload 4
    //   840: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   843: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   846: invokespecial 419	com/tencent/matrix/a/b/a$d:<init>	(Ljava/util/List;J)V
    //   849: aload_3
    //   850: astore 10
    //   852: aload_3
    //   853: aload 8
    //   855: invokevirtual 423	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   858: aload_3
    //   859: astore 10
    //   861: aload_3
    //   862: invokevirtual 426	java/io/ObjectOutputStream:flush	()V
    //   865: aload_3
    //   866: astore 10
    //   868: ldc 142
    //   870: ldc_w 428
    //   873: iconst_2
    //   874: anewarray 146	java/lang/Object
    //   877: dup
    //   878: iconst_0
    //   879: aload 4
    //   881: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   884: getfield 107	com/tencent/matrix/a/b/a:bUM	J
    //   887: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   890: aastore
    //   891: dup
    //   892: iconst_1
    //   893: aload 4
    //   895: getfield 96	com/tencent/matrix/a/b/a$f:bVb	Lcom/tencent/matrix/a/b/a;
    //   898: getfield 103	com/tencent/matrix/a/b/a:bUL	Ljava/util/List;
    //   901: invokeinterface 158 1 0
    //   906: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   909: aastore
    //   910: invokestatic 169	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   913: aload_3
    //   914: invokevirtual 429	java/io/ObjectOutputStream:close	()V
    //   917: return
    //   918: astore 10
    //   920: ldc 142
    //   922: ldc_w 431
    //   925: iconst_1
    //   926: anewarray 146	java/lang/Object
    //   929: dup
    //   930: iconst_0
    //   931: aload 10
    //   933: aastore
    //   934: invokestatic 169	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   937: goto -20 -> 917
    //   940: astore 4
    //   942: aconst_null
    //   943: astore_3
    //   944: aload_3
    //   945: astore 10
    //   947: ldc 142
    //   949: ldc 171
    //   951: iconst_1
    //   952: anewarray 146	java/lang/Object
    //   955: dup
    //   956: iconst_0
    //   957: aload 4
    //   959: aastore
    //   960: invokestatic 174	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   963: aload_3
    //   964: ifnull -47 -> 917
    //   967: aload_3
    //   968: invokevirtual 429	java/io/ObjectOutputStream:close	()V
    //   971: goto -54 -> 917
    //   974: astore 10
    //   976: ldc 142
    //   978: ldc_w 431
    //   981: iconst_1
    //   982: anewarray 146	java/lang/Object
    //   985: dup
    //   986: iconst_0
    //   987: aload 10
    //   989: aastore
    //   990: invokestatic 169	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   993: goto -76 -> 917
    //   996: astore_3
    //   997: aconst_null
    //   998: astore 10
    //   1000: aload 10
    //   1002: ifnull +8 -> 1010
    //   1005: aload 10
    //   1007: invokevirtual 429	java/io/ObjectOutputStream:close	()V
    //   1010: aload_3
    //   1011: athrow
    //   1012: astore 10
    //   1014: ldc 142
    //   1016: ldc_w 431
    //   1019: iconst_1
    //   1020: anewarray 146	java/lang/Object
    //   1023: dup
    //   1024: iconst_0
    //   1025: aload 10
    //   1027: aastore
    //   1028: invokestatic 169	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1031: goto -21 -> 1010
    //   1034: astore_3
    //   1035: goto -35 -> 1000
    //   1038: astore 4
    //   1040: goto -96 -> 944
    //   1043: iconst_0
    //   1044: istore 5
    //   1046: iload 16
    //   1048: istore 9
    //   1050: goto -495 -> 555
    //
    // Exception table:
    //   from	to	target	type
    //   649	683	721	org/json/JSONException
    //   913	917	918	java/io/IOException
    //   783	817	940	java/io/IOException
    //   967	971	974	java/io/IOException
    //   783	817	996	finally
    //   1005	1010	1012	java/io/IOException
    //   820	825	1034	finally
    //   828	849	1034	finally
    //   852	858	1034	finally
    //   861	865	1034	finally
    //   868	913	1034	finally
    //   947	963	1034	finally
    //   820	825	1038	java/io/IOException
    //   828	849	1038	java/io/IOException
    //   852	858	1038	java/io/IOException
    //   861	865	1038	java/io/IOException
    //   868	913	1038	java/io/IOException
  }

  static final class a
  {
    final long bUN;
    final long bUO;
    final a.e bUP;
    final AlarmManager.OnAlarmListener bUQ;
    long bUR;
    final String stackTrace;
    final int type;

    a(int paramInt, long paramLong1, long paramLong2, PendingIntent paramPendingIntent, AlarmManager.OnAlarmListener paramOnAlarmListener, String paramString)
    {
      this.type = paramInt;
      if ((paramInt == 2) || (paramInt == 3));
      for (long l1 = SystemClock.elapsedRealtime(); ; l1 = System.currentTimeMillis())
      {
        long l2 = l1 + 5000L;
        l1 = paramLong1;
        if (paramLong1 < l2)
          l1 = l2;
        this.bUN = l1;
        paramLong1 = paramLong2;
        if (paramLong2 > 0L)
        {
          paramLong1 = paramLong2;
          if (paramLong2 < 60000L)
            paramLong1 = 60000L;
        }
        this.bUO = paramLong1;
        this.bUP = new a.e(paramPendingIntent);
        this.bUQ = paramOnAlarmListener;
        this.stackTrace = paramString;
        this.bUR = 9223372036854775807L;
        return;
      }
    }

    a(int paramInt, long paramLong1, long paramLong2, a.e parame, String paramString, long paramLong3)
    {
      this.type = paramInt;
      this.bUN = paramLong1;
      this.bUO = paramLong2;
      this.bUP = parame;
      this.bUQ = null;
      this.stackTrace = paramString;
      this.bUR = paramLong3;
    }

    public final void yQ()
    {
      if (this.bUR != 9223372036854775807L);
      while (true)
      {
        return;
        this.bUR = System.currentTimeMillis();
      }
    }
  }

  static final class b
  {
    private final String bUS;

    b()
    {
      String str = d.formatTime("yyyy-MM-dd", System.currentTimeMillis());
      this.bUS = String.format("%s/com.tencent.matrix/alarm-detector-record/%s/alarm-info-record-%s", new Object[] { Environment.getExternalStorageDirectory().getAbsolutePath(), com.tencent.matrix.a.c.a.getPackageName(), str });
      com.tencent.matrix.d.c.i("MicroMsg.AlarmDetector", "AlarmInfoRecorder path:%s", new Object[] { this.bUS });
    }

    // ERROR //
    final void cc(String paramString)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: aconst_null
      //   3: astore_3
      //   4: aconst_null
      //   5: astore 4
      //   7: aload_3
      //   8: astore 5
      //   10: new 37	java/io/File
      //   13: astore 6
      //   15: aload_3
      //   16: astore 5
      //   18: aload 6
      //   20: aload_0
      //   21: getfield 54	com/tencent/matrix/a/b/a$b:bUS	Ljava/lang/String;
      //   24: invokespecial 73	java/io/File:<init>	(Ljava/lang/String;)V
      //   27: aload_3
      //   28: astore 5
      //   30: aload 6
      //   32: invokevirtual 76	java/io/File:getParentFile	()Ljava/io/File;
      //   35: invokevirtual 80	java/io/File:mkdirs	()Z
      //   38: ifne +32 -> 70
      //   41: aload_3
      //   42: astore 5
      //   44: aload 6
      //   46: invokevirtual 76	java/io/File:getParentFile	()Ljava/io/File;
      //   49: invokevirtual 83	java/io/File:exists	()Z
      //   52: ifne +18 -> 70
      //   55: aload_3
      //   56: astore 5
      //   58: ldc 56
      //   60: ldc 85
      //   62: iconst_0
      //   63: anewarray 4	java/lang/Object
      //   66: invokestatic 88	com/tencent/matrix/d/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   69: return
      //   70: aload_3
      //   71: astore 5
      //   73: new 90	java/io/OutputStreamWriter
      //   76: astore 7
      //   78: aload_3
      //   79: astore 5
      //   81: new 92	java/io/FileOutputStream
      //   84: astore 8
      //   86: aload_3
      //   87: astore 5
      //   89: aload 8
      //   91: aload 6
      //   93: iconst_1
      //   94: invokespecial 95	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
      //   97: aload_3
      //   98: astore 5
      //   100: aload 7
      //   102: aload 8
      //   104: invokespecial 98	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
      //   107: aload_3
      //   108: astore 5
      //   110: new 100	java/io/BufferedWriter
      //   113: dup
      //   114: aload 7
      //   116: invokespecial 103	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
      //   119: astore_3
      //   120: aload_3
      //   121: aload_1
      //   122: iconst_0
      //   123: aload_1
      //   124: invokevirtual 107	java/lang/String:length	()I
      //   127: invokevirtual 111	java/io/BufferedWriter:write	(Ljava/lang/String;II)V
      //   130: aload_3
      //   131: invokevirtual 114	java/io/BufferedWriter:flush	()V
      //   134: aload_3
      //   135: invokevirtual 117	java/io/BufferedWriter:close	()V
      //   138: goto -69 -> 69
      //   141: astore_1
      //   142: goto -73 -> 69
      //   145: astore_3
      //   146: aload 4
      //   148: astore_1
      //   149: aload_1
      //   150: astore 5
      //   152: ldc 56
      //   154: ldc 119
      //   156: iconst_1
      //   157: anewarray 4	java/lang/Object
      //   160: dup
      //   161: iconst_0
      //   162: aload_3
      //   163: invokevirtual 122	java/io/FileNotFoundException:getLocalizedMessage	()Ljava/lang/String;
      //   166: aastore
      //   167: invokestatic 125	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   170: aload_1
      //   171: ifnull -102 -> 69
      //   174: aload_1
      //   175: invokevirtual 117	java/io/BufferedWriter:close	()V
      //   178: goto -109 -> 69
      //   181: astore_1
      //   182: goto -113 -> 69
      //   185: astore_3
      //   186: aload_2
      //   187: astore_1
      //   188: aload_1
      //   189: astore 5
      //   191: ldc 56
      //   193: ldc 119
      //   195: iconst_1
      //   196: anewarray 4	java/lang/Object
      //   199: dup
      //   200: iconst_0
      //   201: aload_3
      //   202: invokevirtual 126	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
      //   205: aastore
      //   206: invokestatic 125	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   209: aload_1
      //   210: ifnull -141 -> 69
      //   213: aload_1
      //   214: invokevirtual 117	java/io/BufferedWriter:close	()V
      //   217: goto -148 -> 69
      //   220: astore_1
      //   221: goto -152 -> 69
      //   224: astore_1
      //   225: aload 5
      //   227: ifnull +8 -> 235
      //   230: aload 5
      //   232: invokevirtual 117	java/io/BufferedWriter:close	()V
      //   235: aload_1
      //   236: athrow
      //   237: astore 5
      //   239: goto -4 -> 235
      //   242: astore_1
      //   243: aload_3
      //   244: astore 5
      //   246: goto -21 -> 225
      //   249: astore 5
      //   251: aload_3
      //   252: astore_1
      //   253: aload 5
      //   255: astore_3
      //   256: goto -68 -> 188
      //   259: astore 5
      //   261: aload_3
      //   262: astore_1
      //   263: aload 5
      //   265: astore_3
      //   266: goto -117 -> 149
      //
      // Exception table:
      //   from	to	target	type
      //   134	138	141	java/io/IOException
      //   10	15	145	java/io/FileNotFoundException
      //   18	27	145	java/io/FileNotFoundException
      //   30	41	145	java/io/FileNotFoundException
      //   44	55	145	java/io/FileNotFoundException
      //   58	69	145	java/io/FileNotFoundException
      //   73	78	145	java/io/FileNotFoundException
      //   81	86	145	java/io/FileNotFoundException
      //   89	97	145	java/io/FileNotFoundException
      //   100	107	145	java/io/FileNotFoundException
      //   110	120	145	java/io/FileNotFoundException
      //   174	178	181	java/io/IOException
      //   10	15	185	java/io/IOException
      //   18	27	185	java/io/IOException
      //   30	41	185	java/io/IOException
      //   44	55	185	java/io/IOException
      //   58	69	185	java/io/IOException
      //   73	78	185	java/io/IOException
      //   81	86	185	java/io/IOException
      //   89	97	185	java/io/IOException
      //   100	107	185	java/io/IOException
      //   110	120	185	java/io/IOException
      //   213	217	220	java/io/IOException
      //   10	15	224	finally
      //   18	27	224	finally
      //   30	41	224	finally
      //   44	55	224	finally
      //   58	69	224	finally
      //   73	78	224	finally
      //   81	86	224	finally
      //   89	97	224	finally
      //   100	107	224	finally
      //   110	120	224	finally
      //   152	170	224	finally
      //   191	209	224	finally
      //   230	235	237	java/io/IOException
      //   120	134	242	finally
      //   120	134	249	java/io/IOException
      //   120	134	259	java/io/FileNotFoundException
    }
  }

  static final class c
    implements Serializable
  {
    final long bUN;
    final long bUO;
    long bUR;
    final int bUT;
    final byte[] bUU;
    final String bUV;
    final String stackTrace;
    final int type;

    static
    {
      if (!a.class.desiredAssertionStatus());
      for (boolean bool = true; ; bool = false)
      {
        $assertionsDisabled = bool;
        return;
      }
    }

    c(a.a parama)
    {
      assert (parama != null);
      this.type = parama.type;
      this.bUN = parama.bUN;
      this.bUO = parama.bUO;
      this.bUT = parama.bUP.bUT;
      this.bUU = a.k(parama.bUP.bUZ);
      this.bUV = parama.bUP.bUV;
      this.stackTrace = parama.stackTrace;
      this.bUR = parama.bUR;
    }
  }

  static final class d
    implements Serializable
  {
    private final List<a.c> bUL = new ArrayList();
    private final long bUM;

    d(List<a.a> paramList, long paramLong)
    {
      if (paramList != null)
        for (int i = 0; i < paramList.size(); i++)
          this.bUL.add(new a.c((a.a)paramList.get(i)));
      this.bUM = paramLong;
    }

    public final List<a.a> yR()
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      if (i < this.bUL.size())
      {
        a.c localc = (a.c)this.bUL.get(i);
        Object localObject = a.v(localc.bUU);
        if (localObject == null)
          com.tencent.matrix.d.c.e("MicroMsg.AlarmDetector", "bytesToIntent is null,  alarmInfoSet maybe invalid object", new Object[0]);
        while (true)
        {
          i++;
          break;
          localObject = new a.e(localc.bUT, (Intent)localObject, localc.bUV);
          localArrayList.add(new a.a(localc.type, localc.bUN, localc.bUO, (a.e)localObject, localc.stackTrace, localc.bUR));
        }
      }
      return localArrayList;
    }
  }

  static final class e
  {
    private static Method bUW;
    private static Method bUX;
    final int bUT;
    final String bUV;
    final PendingIntent bUY;
    final Intent bUZ;

    e(int paramInt, Intent paramIntent, String paramString)
    {
      this.bUY = null;
      this.bUT = paramInt;
      this.bUZ = paramIntent;
      this.bUV = paramString;
    }

    e(PendingIntent paramPendingIntent)
    {
      this.bUY = paramPendingIntent;
      if (this.bUY != null)
      {
        this.bUT = paramPendingIntent.hashCode();
        this.bUZ = b(paramPendingIntent);
      }
      for (this.bUV = c(paramPendingIntent); ; this.bUV = null)
      {
        return;
        this.bUT = -1;
        this.bUZ = null;
      }
    }

    // ERROR //
    private static Intent b(PendingIntent paramPendingIntent)
    {
      // Byte code:
      //   0: aload_0
      //   1: ifnonnull +7 -> 8
      //   4: aconst_null
      //   5: astore_0
      //   6: aload_0
      //   7: areturn
      //   8: getstatic 57	com/tencent/matrix/a/b/a$e:bUW	Ljava/lang/reflect/Method;
      //   11: ifnonnull +24 -> 35
      //   14: ldc 35
      //   16: ldc 59
      //   18: iconst_0
      //   19: anewarray 61	java/lang/Class
      //   22: invokevirtual 65	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   25: astore_1
      //   26: aload_1
      //   27: putstatic 57	com/tencent/matrix/a/b/a$e:bUW	Ljava/lang/reflect/Method;
      //   30: aload_1
      //   31: iconst_1
      //   32: invokevirtual 71	java/lang/reflect/Method:setAccessible	(Z)V
      //   35: getstatic 57	com/tencent/matrix/a/b/a$e:bUW	Ljava/lang/reflect/Method;
      //   38: aload_0
      //   39: iconst_0
      //   40: anewarray 4	java/lang/Object
      //   43: invokevirtual 75	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   46: astore_0
      //   47: aload_0
      //   48: instanceof 77
      //   51: istore_2
      //   52: iload_2
      //   53: ifne +29 -> 82
      //   56: aconst_null
      //   57: astore_0
      //   58: goto -52 -> 6
      //   61: astore_0
      //   62: ldc 79
      //   64: ldc 81
      //   66: iconst_1
      //   67: anewarray 4	java/lang/Object
      //   70: dup
      //   71: iconst_0
      //   72: aload_0
      //   73: aastore
      //   74: invokestatic 87	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   77: aconst_null
      //   78: astore_0
      //   79: goto -73 -> 6
      //   82: aload_0
      //   83: checkcast 77	android/content/Intent
      //   86: astore_0
      //   87: goto -81 -> 6
      //   90: astore_0
      //   91: ldc 79
      //   93: ldc 81
      //   95: iconst_1
      //   96: anewarray 4	java/lang/Object
      //   99: dup
      //   100: iconst_0
      //   101: aload_0
      //   102: aastore
      //   103: invokestatic 87	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   106: aconst_null
      //   107: astore_0
      //   108: goto -102 -> 6
      //   111: astore_0
      //   112: ldc 79
      //   114: ldc 81
      //   116: iconst_1
      //   117: anewarray 4	java/lang/Object
      //   120: dup
      //   121: iconst_0
      //   122: aload_0
      //   123: aastore
      //   124: invokestatic 87	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   127: goto -21 -> 106
      //   130: astore_0
      //   131: goto -25 -> 106
      //
      // Exception table:
      //   from	to	target	type
      //   14	35	61	java/lang/NoSuchMethodException
      //   35	52	90	java/lang/IllegalAccessException
      //   82	87	90	java/lang/IllegalAccessException
      //   35	52	111	java/lang/SecurityException
      //   82	87	111	java/lang/SecurityException
      //   35	52	130	java/lang/reflect/InvocationTargetException
      //   82	87	130	java/lang/reflect/InvocationTargetException
    }

    // ERROR //
    private static String c(PendingIntent paramPendingIntent)
    {
      // Byte code:
      //   0: aload_0
      //   1: ifnonnull +7 -> 8
      //   4: aconst_null
      //   5: astore_0
      //   6: aload_0
      //   7: areturn
      //   8: getstatic 89	com/tencent/matrix/a/b/a$e:bUX	Ljava/lang/reflect/Method;
      //   11: ifnonnull +29 -> 40
      //   14: ldc 35
      //   16: ldc 91
      //   18: iconst_1
      //   19: anewarray 61	java/lang/Class
      //   22: dup
      //   23: iconst_0
      //   24: ldc 93
      //   26: aastore
      //   27: invokevirtual 65	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   30: astore_1
      //   31: aload_1
      //   32: putstatic 89	com/tencent/matrix/a/b/a$e:bUX	Ljava/lang/reflect/Method;
      //   35: aload_1
      //   36: iconst_1
      //   37: invokevirtual 71	java/lang/reflect/Method:setAccessible	(Z)V
      //   40: getstatic 89	com/tencent/matrix/a/b/a$e:bUX	Ljava/lang/reflect/Method;
      //   43: aload_0
      //   44: iconst_1
      //   45: anewarray 4	java/lang/Object
      //   48: dup
      //   49: iconst_0
      //   50: ldc 95
      //   52: aastore
      //   53: invokevirtual 75	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   56: astore_0
      //   57: aload_0
      //   58: instanceof 93
      //   61: istore_2
      //   62: iload_2
      //   63: ifne +29 -> 92
      //   66: aconst_null
      //   67: astore_0
      //   68: goto -62 -> 6
      //   71: astore_0
      //   72: ldc 79
      //   74: ldc 97
      //   76: iconst_1
      //   77: anewarray 4	java/lang/Object
      //   80: dup
      //   81: iconst_0
      //   82: aload_0
      //   83: aastore
      //   84: invokestatic 87	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   87: aconst_null
      //   88: astore_0
      //   89: goto -83 -> 6
      //   92: aload_0
      //   93: checkcast 93	java/lang/String
      //   96: astore_0
      //   97: goto -91 -> 6
      //   100: astore_0
      //   101: ldc 79
      //   103: ldc 97
      //   105: iconst_1
      //   106: anewarray 4	java/lang/Object
      //   109: dup
      //   110: iconst_0
      //   111: aload_0
      //   112: aastore
      //   113: invokestatic 87	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   116: aconst_null
      //   117: astore_0
      //   118: goto -112 -> 6
      //   121: astore_0
      //   122: ldc 79
      //   124: ldc 97
      //   126: iconst_1
      //   127: anewarray 4	java/lang/Object
      //   130: dup
      //   131: iconst_0
      //   132: aload_0
      //   133: aastore
      //   134: invokestatic 87	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   137: goto -21 -> 116
      //
      // Exception table:
      //   from	to	target	type
      //   14	40	71	java/lang/NoSuchMethodException
      //   40	62	100	java/lang/IllegalAccessException
      //   92	97	100	java/lang/IllegalAccessException
      //   40	62	121	java/lang/reflect/InvocationTargetException
      //   92	97	121	java/lang/reflect/InvocationTargetException
    }
  }

  final class f
  {
    final String bVa = String.format("%s/com.tencent.matrix/alarm-detector-record/%s/current-alarm-info-%s", new Object[] { Environment.getExternalStorageDirectory().getAbsolutePath(), com.tencent.matrix.a.c.a.getPackageName(), com.tencent.matrix.a.c.a.getProcessName() });

    f()
    {
      com.tencent.matrix.d.c.i("MicroMsg.AlarmDetector", "PersistenceHelper mSaveFileName :%s", new Object[] { this.bVa });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.b.a
 * JD-Core Version:    0.6.2
 */