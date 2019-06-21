package com.tencent.d.e.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import com.tencent.d.e.a.a.c;
import com.tencent.d.e.a.a.f;
import com.tencent.d.e.a.a.g;
import com.tencent.d.e.a.a.g.a;
import com.tencent.d.e.a.a.h;
import com.tencent.d.e.a.a.k;
import com.tencent.d.f.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class e
{
  private static final j<e> Atp;
  private g Atq;
  private final List<k> Atr;
  private d Ats;
  private b Att;
  private com.tencent.d.e.a.a.d Atu;
  private final Runnable Atv;
  private final a Atw;
  private boolean apg;
  private final Handler mHandler;

  static
  {
    AppMethodBeat.i(114551);
    Atp = new e.1();
    AppMethodBeat.o(114551);
  }

  private e()
  {
    AppMethodBeat.i(114545);
    this.apg = false;
    this.Atr = new ArrayList();
    this.Atv = new e.2(this);
    this.Atw = new a((byte)0);
    HandlerThread localHandlerThread = new HandlerThread("TuringMMCore");
    localHandlerThread.start();
    this.mHandler = new Handler(localHandlerThread.getLooper());
    AppMethodBeat.o(114545);
  }

  public static e dQs()
  {
    AppMethodBeat.i(114544);
    e locale = (e)Atp.get();
    AppMethodBeat.o(114544);
    return locale;
  }

  public final boolean EH()
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(114547);
        if (!this.apg)
        {
          AppMethodBeat.o(114547);
          bool = true;
          return bool;
        }
        this.apg = false;
        if (this.Ats == null)
        {
          AppMethodBeat.o(114547);
          continue;
        }
      }
      finally
      {
      }
      this.mHandler.removeCallbacks(this.Atv);
      this.mHandler.removeCallbacks(this.Atw);
      if (this.Atq != null)
      {
        this.Atq.dQv();
        if ((int)(this.Atq.AtN.dQy() / f.AtG) < 3)
          AppMethodBeat.o(114547);
      }
      else
      {
        AppMethodBeat.o(114547);
        bool = true;
        continue;
        SparseArray localSparseArray = this.Atq.dQw();
        if (localSparseArray.size() == 0)
        {
          AppMethodBeat.o(114547);
        }
        else
        {
          synchronized (this.Atr)
          {
            ArrayList localArrayList = new java/util/ArrayList;
            localArrayList.<init>(this.Atr);
            if (localArrayList.size() < 3)
              AppMethodBeat.o(114547);
          }
          int i = this.Ats.Atn;
          int j = this.Ats.action;
          int k = this.Ats.requestType;
          ??? = this.mHandler;
          e.3 local3 = new com/tencent/d/e/a/e$3;
          local3.<init>(this, i, j, k, localSparseArray, localList);
          ((Handler)???).post(local3);
          AppMethodBeat.o(114547);
          bool = true;
        }
      }
    }
  }

  public final void a(Context paramContext, String paramString, com.tencent.d.e.a.a.e parame)
  {
    try
    {
      AppMethodBeat.i(114548);
      Object localObject = h.dQz();
      if (!((h)localObject).mInit)
        ((h)localObject).init(paramContext);
      paramContext = this.mHandler;
      localObject = new com/tencent/d/e/a/e$4;
      ((e.4)localObject).<init>(this, parame, paramString);
      paramContext.post((Runnable)localObject);
      AppMethodBeat.o(114548);
      return;
    }
    finally
    {
    }
    throw paramContext;
  }

  // ERROR //
  public final boolean a(d paramd)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 255
    //   6: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: getfield 259	com/tencent/d/e/a/d:context	Landroid/content/Context;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnonnull +14 -> 29
    //   18: iconst_0
    //   19: istore_2
    //   20: ldc 255
    //   22: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_0
    //   26: monitorexit
    //   27: iload_2
    //   28: ireturn
    //   29: invokestatic 241	com/tencent/d/e/a/a/h:dQz	()Lcom/tencent/d/e/a/a/h;
    //   32: astore 4
    //   34: aload 4
    //   36: getfield 244	com/tencent/d/e/a/a/h:mInit	Z
    //   39: ifne +9 -> 48
    //   42: aload 4
    //   44: aload_3
    //   45: invokevirtual 248	com/tencent/d/e/a/a/h:init	(Landroid/content/Context;)V
    //   48: aload_0
    //   49: getfield 53	com/tencent/d/e/a/e:apg	Z
    //   52: ifeq +8 -> 60
    //   55: aload_0
    //   56: invokevirtual 261	com/tencent/d/e/a/e:EH	()Z
    //   59: pop
    //   60: aload_0
    //   61: aload_1
    //   62: putfield 96	com/tencent/d/e/a/e:Ats	Lcom/tencent/d/e/a/d;
    //   65: aload_0
    //   66: iconst_1
    //   67: putfield 53	com/tencent/d/e/a/e:apg	Z
    //   70: aload_0
    //   71: getfield 167	com/tencent/d/e/a/e:Atq	Lcom/tencent/d/e/a/a/g;
    //   74: ifnonnull +20 -> 94
    //   77: new 180	com/tencent/d/e/a/a/g
    //   80: astore 4
    //   82: aload 4
    //   84: aload_3
    //   85: invokespecial 263	com/tencent/d/e/a/a/g:<init>	(Landroid/content/Context;)V
    //   88: aload_0
    //   89: aload 4
    //   91: putfield 167	com/tencent/d/e/a/e:Atq	Lcom/tencent/d/e/a/a/g;
    //   94: aload_0
    //   95: getfield 167	com/tencent/d/e/a/e:Atq	Lcom/tencent/d/e/a/a/g;
    //   98: ifnull +27 -> 125
    //   101: aload_0
    //   102: getfield 167	com/tencent/d/e/a/e:Atq	Lcom/tencent/d/e/a/a/g;
    //   105: astore 4
    //   107: aload 4
    //   109: getfield 267	com/tencent/d/e/a/a/g:AtL	Landroid/util/SparseArray;
    //   112: astore_3
    //   113: aload_3
    //   114: monitorenter
    //   115: aload 4
    //   117: getfield 267	com/tencent/d/e/a/a/g:AtL	Landroid/util/SparseArray;
    //   120: invokevirtual 270	android/util/SparseArray:clear	()V
    //   123: aload_3
    //   124: monitorexit
    //   125: aload_0
    //   126: getfield 58	com/tencent/d/e/a/e:Atr	Ljava/util/List;
    //   129: astore_3
    //   130: aload_3
    //   131: monitorenter
    //   132: aload_0
    //   133: getfield 58	com/tencent/d/e/a/e:Atr	Ljava/util/List;
    //   136: invokeinterface 271 1 0
    //   141: aload_3
    //   142: monitorexit
    //   143: aload_0
    //   144: getfield 91	com/tencent/d/e/a/e:mHandler	Landroid/os/Handler;
    //   147: aload_0
    //   148: getfield 65	com/tencent/d/e/a/e:Atv	Ljava/lang/Runnable;
    //   151: aload_1
    //   152: getfield 274	com/tencent/d/e/a/d:xzH	J
    //   155: invokevirtual 278	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   158: pop
    //   159: ldc 255
    //   161: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: goto -139 -> 25
    //   167: astore_1
    //   168: aload_0
    //   169: monitorexit
    //   170: aload_1
    //   171: athrow
    //   172: astore_1
    //   173: aload_3
    //   174: monitorexit
    //   175: ldc 255
    //   177: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: aload_1
    //   181: athrow
    //   182: astore_1
    //   183: aload_3
    //   184: monitorexit
    //   185: ldc 255
    //   187: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: aload_1
    //   191: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   4	14	167	finally
    //   20	25	167	finally
    //   29	48	167	finally
    //   48	60	167	finally
    //   60	94	167	finally
    //   94	115	167	finally
    //   125	132	167	finally
    //   143	164	167	finally
    //   175	182	167	finally
    //   185	192	167	finally
    //   115	125	172	finally
    //   173	175	172	finally
    //   132	143	182	finally
    //   183	185	182	finally
  }

  final class a extends c
  {
    long AtD = 0L;
    int mCount = 1;
    int mMaxCount = 3;

    private a()
    {
    }

    // ERROR //
    public final void dQt()
    {
      // Byte code:
      //   0: ldc 35
      //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: new 43	com/tencent/d/e/a/a/k
      //   8: dup
      //   9: invokespecial 44	com/tencent/d/e/a/a/k:<init>	()V
      //   12: astore_1
      //   13: aload_0
      //   14: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   17: astore_2
      //   18: aload_2
      //   19: monitorenter
      //   20: aload_0
      //   21: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   24: invokestatic 47	com/tencent/d/e/a/e:a	(Lcom/tencent/d/e/a/e;)Lcom/tencent/d/e/a/d;
      //   27: getfield 53	com/tencent/d/e/a/d:context	Landroid/content/Context;
      //   30: astore_3
      //   31: getstatic 58	android/os/Build$VERSION:SDK_INT	I
      //   34: bipush 20
      //   36: if_icmplt +394 -> 430
      //   39: ldc 60
      //   41: invokestatic 66	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
      //   44: astore 4
      //   46: aload_3
      //   47: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   50: ldc 74
      //   52: invokevirtual 78	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   55: astore 5
      //   57: aload 5
      //   59: iconst_1
      //   60: invokevirtual 84	java/lang/reflect/Field:setAccessible	(Z)V
      //   63: aload_3
      //   64: aload 5
      //   66: aload_3
      //   67: invokevirtual 88	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   70: checkcast 90	java/lang/String
      //   73: invokevirtual 96	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
      //   76: astore 5
      //   78: aload 5
      //   80: ifnonnull +176 -> 256
      //   83: iconst_0
      //   84: istore 6
      //   86: aload_1
      //   87: iload 6
      //   89: putfield 99	com/tencent/d/e/a/a/k:AtW	I
      //   92: new 101	java/io/File
      //   95: astore 4
      //   97: aload 4
      //   99: ldc 103
      //   101: invokespecial 106	java/io/File:<init>	(Ljava/lang/String;)V
      //   104: aload 4
      //   106: invokestatic 112	com/tencent/d/f/f:ag	(Ljava/io/File;)Ljava/lang/String;
      //   109: astore 4
      //   111: aload 4
      //   113: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
      //   116: ifne +18 -> 134
      //   119: ldc 120
      //   121: aload 4
      //   123: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   126: ifeq +351 -> 477
      //   129: aload_1
      //   130: iconst_1
      //   131: putfield 127	com/tencent/d/e/a/a/k:AtY	I
      //   134: new 129	android/content/IntentFilter
      //   137: astore 4
      //   139: aload 4
      //   141: ldc 131
      //   143: invokespecial 132	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
      //   146: aload_3
      //   147: aconst_null
      //   148: aload 4
      //   150: invokevirtual 136	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      //   153: astore_3
      //   154: aload_3
      //   155: ifnull +37 -> 192
      //   158: aload_3
      //   159: ldc 138
      //   161: iconst_m1
      //   162: invokevirtual 144	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
      //   165: istore 6
      //   167: iload 6
      //   169: iconst_2
      //   170: if_icmpeq +9 -> 179
      //   173: iload 6
      //   175: iconst_5
      //   176: if_icmpne +347 -> 523
      //   179: iconst_1
      //   180: istore 6
      //   182: iload 6
      //   184: ifne +345 -> 529
      //   187: aload_1
      //   188: iconst_1
      //   189: putfield 147	com/tencent/d/e/a/a/k:AtZ	I
      //   192: aload_2
      //   193: monitorexit
      //   194: aload_0
      //   195: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   198: invokestatic 151	com/tencent/d/e/a/e:b	(Lcom/tencent/d/e/a/e;)Ljava/util/List;
      //   201: astore_2
      //   202: aload_2
      //   203: monitorenter
      //   204: aload_0
      //   205: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   208: invokestatic 151	com/tencent/d/e/a/e:b	(Lcom/tencent/d/e/a/e;)Ljava/util/List;
      //   211: aload_1
      //   212: invokeinterface 156 2 0
      //   217: pop
      //   218: aload_2
      //   219: monitorexit
      //   220: aload_0
      //   221: getfield 23	com/tencent/d/e/a/e$a:mCount	I
      //   224: aload_0
      //   225: getfield 25	com/tencent/d/e/a/e$a:mMaxCount	I
      //   228: if_icmplt +384 -> 612
      //   231: aload_0
      //   232: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   235: astore_1
      //   236: aload_1
      //   237: monitorenter
      //   238: aload_0
      //   239: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   242: invokestatic 160	com/tencent/d/e/a/e:c	(Lcom/tencent/d/e/a/e;)Z
      //   245: ifne +339 -> 584
      //   248: aload_1
      //   249: monitorexit
      //   250: ldc 35
      //   252: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   255: return
      //   256: aload 4
      //   258: ldc 165
      //   260: iconst_0
      //   261: anewarray 62	java/lang/Class
      //   264: invokevirtual 169	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   267: astore 4
      //   269: aload 4
      //   271: ifnonnull +9 -> 280
      //   274: iconst_0
      //   275: istore 6
      //   277: goto -191 -> 86
      //   280: aload 4
      //   282: iconst_1
      //   283: invokevirtual 172	java/lang/reflect/Method:setAccessible	(Z)V
      //   286: aload 4
      //   288: aload 5
      //   290: iconst_0
      //   291: anewarray 68	java/lang/Object
      //   294: invokevirtual 176	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   297: checkcast 178	[Landroid/view/Display;
      //   300: astore 7
      //   302: ldc 180
      //   304: ldc 182
      //   306: iconst_0
      //   307: anewarray 62	java/lang/Class
      //   310: invokevirtual 169	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   313: astore 4
      //   315: aload 4
      //   317: iconst_1
      //   318: invokevirtual 172	java/lang/reflect/Method:setAccessible	(Z)V
      //   321: ldc 180
      //   323: ldc 184
      //   325: invokevirtual 78	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   328: astore 8
      //   330: aload 8
      //   332: iconst_1
      //   333: invokevirtual 84	java/lang/reflect/Field:setAccessible	(Z)V
      //   336: iconst_0
      //   337: istore 6
      //   339: aload 7
      //   341: arraylength
      //   342: istore 9
      //   344: iconst_0
      //   345: istore 10
      //   347: iload 10
      //   349: iload 9
      //   351: if_icmpge +50 -> 401
      //   354: aload 7
      //   356: iload 10
      //   358: aaload
      //   359: astore 5
      //   361: aload 8
      //   363: aload 5
      //   365: invokevirtual 188	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
      //   368: istore 11
      //   370: aload 4
      //   372: aload 5
      //   374: iconst_0
      //   375: anewarray 68	java/lang/Object
      //   378: invokevirtual 176	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   381: checkcast 190	java/lang/Integer
      //   384: invokevirtual 194	java/lang/Integer:intValue	()I
      //   387: iload 11
      //   389: if_icmpeq +314 -> 703
      //   392: iconst_1
      //   393: istore 6
      //   395: iinc 10 1
      //   398: goto -51 -> 347
      //   401: iload 6
      //   403: ifeq +21 -> 424
      //   406: iconst_1
      //   407: istore 6
      //   409: aload_1
      //   410: iload 6
      //   412: putfield 99	com/tencent/d/e/a/a/k:AtW	I
      //   415: aload_1
      //   416: getfield 99	com/tencent/d/e/a/a/k:AtW	I
      //   419: istore 6
      //   421: goto -335 -> 86
      //   424: iconst_2
      //   425: istore 6
      //   427: goto -18 -> 409
      //   430: aload_3
      //   431: ldc 196
      //   433: invokevirtual 96	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
      //   436: checkcast 198	android/os/PowerManager
      //   439: astore 4
      //   441: aload 4
      //   443: ifnull -351 -> 92
      //   446: aload 4
      //   448: invokevirtual 202	android/os/PowerManager:isScreenOn	()Z
      //   451: ifeq +20 -> 471
      //   454: iconst_1
      //   455: istore 6
      //   457: aload_1
      //   458: iload 6
      //   460: putfield 99	com/tencent/d/e/a/a/k:AtW	I
      //   463: goto -371 -> 92
      //   466: astore 4
      //   468: goto -376 -> 92
      //   471: iconst_2
      //   472: istore 6
      //   474: goto -17 -> 457
      //   477: ldc 204
      //   479: aload 4
      //   481: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   484: ifeq +21 -> 505
      //   487: aload_1
      //   488: iconst_2
      //   489: putfield 127	com/tencent/d/e/a/a/k:AtY	I
      //   492: goto -358 -> 134
      //   495: astore_1
      //   496: aload_2
      //   497: monitorexit
      //   498: ldc 35
      //   500: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   503: aload_1
      //   504: athrow
      //   505: ldc 206
      //   507: aload 4
      //   509: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   512: ifeq -378 -> 134
      //   515: aload_1
      //   516: iconst_3
      //   517: putfield 127	com/tencent/d/e/a/a/k:AtY	I
      //   520: goto -386 -> 134
      //   523: iconst_0
      //   524: istore 6
      //   526: goto -344 -> 182
      //   529: aload_3
      //   530: ldc 208
      //   532: iconst_m1
      //   533: invokevirtual 144	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
      //   536: istore 6
      //   538: iload 6
      //   540: iconst_2
      //   541: if_icmpne +11 -> 552
      //   544: aload_1
      //   545: iconst_3
      //   546: putfield 147	com/tencent/d/e/a/a/k:AtZ	I
      //   549: goto -357 -> 192
      //   552: iload 6
      //   554: iconst_1
      //   555: if_icmpne +11 -> 566
      //   558: aload_1
      //   559: iconst_2
      //   560: putfield 147	com/tencent/d/e/a/a/k:AtZ	I
      //   563: goto -371 -> 192
      //   566: aload_1
      //   567: iconst_0
      //   568: putfield 147	com/tencent/d/e/a/a/k:AtZ	I
      //   571: goto -379 -> 192
      //   574: astore_1
      //   575: aload_2
      //   576: monitorexit
      //   577: ldc 35
      //   579: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   582: aload_1
      //   583: athrow
      //   584: aload_0
      //   585: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   588: invokevirtual 211	com/tencent/d/e/a/e:EH	()Z
      //   591: pop
      //   592: aload_1
      //   593: monitorexit
      //   594: ldc 35
      //   596: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   599: goto -344 -> 255
      //   602: astore_2
      //   603: aload_1
      //   604: monitorexit
      //   605: ldc 35
      //   607: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   610: aload_2
      //   611: athrow
      //   612: aload_0
      //   613: aload_0
      //   614: getfield 23	com/tencent/d/e/a/e$a:mCount	I
      //   617: iconst_1
      //   618: iadd
      //   619: putfield 23	com/tencent/d/e/a/e$a:mCount	I
      //   622: aload_0
      //   623: getfield 27	com/tencent/d/e/a/e$a:AtD	J
      //   626: getstatic 216	com/tencent/d/e/a/a/f:AtG	J
      //   629: aload_0
      //   630: getfield 23	com/tencent/d/e/a/e$a:mCount	I
      //   633: i2l
      //   634: lmul
      //   635: ladd
      //   636: invokestatic 222	java/lang/System:currentTimeMillis	()J
      //   639: lsub
      //   640: lstore 12
      //   642: lload 12
      //   644: lconst_0
      //   645: lcmp
      //   646: ifle +31 -> 677
      //   649: aload_0
      //   650: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   653: invokestatic 226	com/tencent/d/e/a/e:e	(Lcom/tencent/d/e/a/e;)Landroid/os/Handler;
      //   656: aload_0
      //   657: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   660: invokestatic 230	com/tencent/d/e/a/e:d	(Lcom/tencent/d/e/a/e;)Lcom/tencent/d/e/a/e$a;
      //   663: lload 12
      //   665: invokevirtual 236	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
      //   668: pop
      //   669: ldc 35
      //   671: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   674: goto -419 -> 255
      //   677: aload_0
      //   678: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   681: invokestatic 226	com/tencent/d/e/a/e:e	(Lcom/tencent/d/e/a/e;)Landroid/os/Handler;
      //   684: aload_0
      //   685: getfield 18	com/tencent/d/e/a/e$a:Atx	Lcom/tencent/d/e/a/e;
      //   688: invokestatic 230	com/tencent/d/e/a/e:d	(Lcom/tencent/d/e/a/e;)Lcom/tencent/d/e/a/e$a;
      //   691: invokevirtual 240	android/os/Handler:post	(Ljava/lang/Runnable;)Z
      //   694: pop
      //   695: ldc 35
      //   697: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   700: goto -445 -> 255
      //   703: goto -308 -> 395
      //
      // Exception table:
      //   from	to	target	type
      //   31	78	466	java/lang/Throwable
      //   86	92	466	java/lang/Throwable
      //   256	269	466	java/lang/Throwable
      //   280	336	466	java/lang/Throwable
      //   339	344	466	java/lang/Throwable
      //   361	392	466	java/lang/Throwable
      //   409	421	466	java/lang/Throwable
      //   430	441	466	java/lang/Throwable
      //   446	454	466	java/lang/Throwable
      //   457	463	466	java/lang/Throwable
      //   20	31	495	finally
      //   31	78	495	finally
      //   86	92	495	finally
      //   92	134	495	finally
      //   134	154	495	finally
      //   158	167	495	finally
      //   187	192	495	finally
      //   192	194	495	finally
      //   256	269	495	finally
      //   280	336	495	finally
      //   339	344	495	finally
      //   361	392	495	finally
      //   409	421	495	finally
      //   430	441	495	finally
      //   446	454	495	finally
      //   457	463	495	finally
      //   477	492	495	finally
      //   496	498	495	finally
      //   505	520	495	finally
      //   529	538	495	finally
      //   544	549	495	finally
      //   558	563	495	finally
      //   566	571	495	finally
      //   204	220	574	finally
      //   575	577	574	finally
      //   238	250	602	finally
      //   584	594	602	finally
      //   603	605	602	finally
    }

    public final void dQu()
    {
      AppMethodBeat.i(114543);
      if (e.f(e.this) != null)
        e.f(e.this);
      AppMethodBeat.o(114543);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.e
 * JD-Core Version:    0.6.2
 */