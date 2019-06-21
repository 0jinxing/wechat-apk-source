package com.tencent.mm.kiss.a;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.reflect.Field;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class b
{
  private static b eMM;
  private ConcurrentHashMap<String, c> eML;
  public Looper eMN;
  public ak eMO;
  public boolean eMP;
  public boolean eMQ;
  public b eMR;
  public LayoutInflater mInflater;
  public int mMode;

  static
  {
    AppMethodBeat.i(105689);
    eMM = null;
    eMM = new b();
    AppMethodBeat.o(105689);
  }

  public b()
  {
    AppMethodBeat.i(105683);
    this.eML = new ConcurrentHashMap();
    this.eMP = false;
    this.mMode = 2;
    this.eMQ = false;
    AppMethodBeat.o(105683);
  }

  public static b SM()
  {
    return eMM;
  }

  public final View a(Activity paramActivity, String paramString, int paramInt)
  {
    AppMethodBeat.i(105684);
    if (this.eMQ)
    {
      ab.i("KISS.InflateRecycler", "not support application inflate");
      paramActivity = paramActivity.getLayoutInflater().inflate(paramInt, null);
      AppMethodBeat.o(105684);
    }
    while (true)
    {
      return paramActivity;
      if (!this.eMP)
      {
        paramActivity = paramActivity.getLayoutInflater().inflate(paramInt, null);
        AppMethodBeat.o(105684);
      }
      else
      {
        c localc = (c)this.eML.get(paramString);
        if (localc != null)
        {
          try
          {
            paramActivity = (View)localc.eNd.poll();
            if (this.mMode == 1)
              localc.eNe.add(paramActivity);
            if (paramActivity != null)
            {
              ab.i("KISS.InflateRecycler", "cache reach %s", new Object[] { paramString });
              paramActivity.addOnAttachStateChangeListener(new a(paramString, this));
              AppMethodBeat.o(105684);
              continue;
            }
          }
          finally
          {
            AppMethodBeat.o(105684);
          }
        }
        else
        {
          ab.i("KISS.InflateRecycler", "no cache reach %s", new Object[] { paramString });
          paramActivity = this.mInflater.inflate(paramInt, null);
          AppMethodBeat.o(105684);
        }
      }
    }
  }

  public final boolean a(String paramString, int paramInt1, int paramInt2, ViewGroup paramViewGroup, boolean paramBoolean, int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(105687);
    if (!this.eMP)
    {
      AppMethodBeat.o(105687);
      paramBoolean = bool1;
    }
    while (true)
    {
      return paramBoolean;
      if (this.eMQ)
      {
        ab.i("KISS.InflateRecycler", "not support application inflate");
        AppMethodBeat.o(105687);
        paramBoolean = bool1;
      }
      else
      {
        if (paramViewGroup != null)
        {
          if (Build.VERSION.SDK_INT >= 19)
            Assert.assertFalse(paramViewGroup.isAttachedToWindow());
          if (paramViewGroup.getParent() != null)
            break label116;
        }
        label116: for (boolean bool2 = true; ; bool2 = false)
        {
          Assert.assertTrue(bool2);
          if ((c)this.eML.get(paramString) == null)
            break label122;
          AppMethodBeat.o(105687);
          paramBoolean = bool1;
          break;
        }
        label122: c localc = new c();
        this.eML.put(paramString, localc);
        localc.mCapacity = paramInt1;
        localc.eMT = paramString;
        localc.Rt = paramInt2;
        localc.eNf = paramArrayOfInt;
        localc.eNg = paramViewGroup;
        localc.eNh = paramBoolean;
        this.eMO.sendMessage(this.eMO.obtainMessage(0, localc));
        AppMethodBeat.o(105687);
        paramBoolean = true;
      }
    }
  }

  public final boolean a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(105686);
    boolean bool = a(paramString, paramInt1, paramInt2, null, false, paramArrayOfInt);
    AppMethodBeat.o(105686);
    return bool;
  }

  public final boolean a(String paramString, int paramInt, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(105685);
    boolean bool = a(paramString, paramInt, 2130970820, null, true, paramArrayOfInt);
    AppMethodBeat.o(105685);
    return bool;
  }

  static final class a
    implements View.OnAttachStateChangeListener
  {
    private String eMT;
    private b eMU;
    private b.c eMV;

    public a(String paramString, b paramb)
    {
      this.eMT = paramString;
      this.eMU = paramb;
      this.eMV = null;
    }

    public final void onViewAttachedToWindow(View paramView)
    {
    }

    // ERROR //
    public final void onViewDetachedFromWindow(View paramView)
    {
      // Byte code:
      //   0: ldc 33
      //   2: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aload_0
      //   6: getfield 24	com/tencent/mm/kiss/a/b$a:eMU	Lcom/tencent/mm/kiss/a/b;
      //   9: invokestatic 43	com/tencent/mm/kiss/a/b:b	(Lcom/tencent/mm/kiss/a/b;)Ljava/util/concurrent/ConcurrentHashMap;
      //   12: aload_0
      //   13: getfield 22	com/tencent/mm/kiss/a/b$a:eMT	Ljava/lang/String;
      //   16: invokevirtual 49	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   19: checkcast 51	com/tencent/mm/kiss/a/c
      //   22: astore_2
      //   23: aload_0
      //   24: getfield 24	com/tencent/mm/kiss/a/b$a:eMU	Lcom/tencent/mm/kiss/a/b;
      //   27: invokestatic 55	com/tencent/mm/kiss/a/b:c	(Lcom/tencent/mm/kiss/a/b;)I
      //   30: iconst_1
      //   31: if_icmpne +88 -> 119
      //   34: aload_2
      //   35: ifnull +36 -> 71
      //   38: aload_2
      //   39: monitorenter
      //   40: aload_2
      //   41: getfield 59	com/tencent/mm/kiss/a/c:eNe	Ljava/util/Queue;
      //   44: aload_1
      //   45: invokeinterface 65 2 0
      //   50: pop
      //   51: aload_2
      //   52: getfield 68	com/tencent/mm/kiss/a/c:eNd	Ljava/util/Queue;
      //   55: aload_1
      //   56: invokeinterface 71 2 0
      //   61: pop
      //   62: aload_2
      //   63: monitorexit
      //   64: aload_0
      //   65: getfield 26	com/tencent/mm/kiss/a/b$a:eMV	Lcom/tencent/mm/kiss/a/b$c;
      //   68: ifnull +3 -> 71
      //   71: aload_1
      //   72: aload_0
      //   73: invokevirtual 77	android/view/View:removeOnAttachStateChangeListener	(Landroid/view/View$OnAttachStateChangeListener;)V
      //   76: aload_0
      //   77: getfield 24	com/tencent/mm/kiss/a/b$a:eMU	Lcom/tencent/mm/kiss/a/b;
      //   80: invokestatic 81	com/tencent/mm/kiss/a/b:d	(Lcom/tencent/mm/kiss/a/b;)Lcom/tencent/mm/kiss/a/b$b;
      //   83: ifnull +83 -> 166
      //   86: aload_0
      //   87: getfield 24	com/tencent/mm/kiss/a/b$a:eMU	Lcom/tencent/mm/kiss/a/b;
      //   90: invokestatic 81	com/tencent/mm/kiss/a/b:d	(Lcom/tencent/mm/kiss/a/b;)Lcom/tencent/mm/kiss/a/b$b;
      //   93: astore_1
      //   94: aload_1
      //   95: invokevirtual 87	com/tencent/mm/kiss/a/b$b:EK	()Z
      //   98: istore_3
      //   99: iload_3
      //   100: ifne +46 -> 146
      //   103: ldc 33
      //   105: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   108: return
      //   109: astore_1
      //   110: aload_2
      //   111: monitorexit
      //   112: ldc 33
      //   114: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   117: aload_1
      //   118: athrow
      //   119: aload_2
      //   120: getfield 94	com/tencent/mm/kiss/a/c:eNh	Z
      //   123: ifeq -52 -> 71
      //   126: aload_0
      //   127: getfield 24	com/tencent/mm/kiss/a/b$a:eMU	Lcom/tencent/mm/kiss/a/b;
      //   130: aload_2
      //   131: invokestatic 97	com/tencent/mm/kiss/a/b:a	(Lcom/tencent/mm/kiss/a/b;Lcom/tencent/mm/kiss/a/c;)V
      //   134: goto -63 -> 71
      //   137: astore_1
      //   138: ldc 33
      //   140: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   143: goto -35 -> 108
      //   146: aload_1
      //   147: getfield 101	com/tencent/mm/kiss/a/b$b:mHandler	Lcom/tencent/mm/sdk/platformtools/ak;
      //   150: aconst_null
      //   151: invokevirtual 107	com/tencent/mm/sdk/platformtools/ak:removeCallbacksAndMessages	(Ljava/lang/Object;)V
      //   154: aload_1
      //   155: getfield 101	com/tencent/mm/kiss/a/b$b:mHandler	Lcom/tencent/mm/sdk/platformtools/ak;
      //   158: iconst_0
      //   159: ldc2_w 108
      //   162: invokevirtual 113	com/tencent/mm/sdk/platformtools/ak:sendEmptyMessageDelayed	(IJ)Z
      //   165: pop
      //   166: ldc 33
      //   168: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   171: goto -63 -> 108
      //
      // Exception table:
      //   from	to	target	type
      //   40	64	109	finally
      //   110	112	109	finally
      //   94	99	137	java/lang/Throwable
    }
  }

  public static final class b
  {
    Class eMW;
    Field eMX;
    Class eMY;
    Field eMZ;
    private boolean eNa;
    private boolean eNb;
    ak mHandler;

    public b(Looper paramLooper)
    {
      AppMethodBeat.i(105681);
      this.eMZ = null;
      this.eNa = false;
      this.eNb = false;
      this.mHandler = new ak(paramLooper)
      {
        // ERROR //
        public final void handleMessage(Message paramAnonymousMessage)
        {
          // Byte code:
          //   0: ldc 26
          //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
          //   5: invokestatic 38	java/lang/System:nanoTime	()J
          //   8: lstore_2
          //   9: aload_0
          //   10: getfield 17	com/tencent/mm/kiss/a/b$b$1:eNc	Lcom/tencent/mm/kiss/a/b$b;
          //   13: astore_1
          //   14: aload_1
          //   15: getfield 42	com/tencent/mm/kiss/a/b$b:eMX	Ljava/lang/reflect/Field;
          //   18: aconst_null
          //   19: invokevirtual 48	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
          //   22: checkcast 50	java/lang/ThreadLocal
          //   25: astore 4
          //   27: aload 4
          //   29: ifnull +45 -> 74
          //   32: aload 4
          //   34: invokevirtual 53	java/lang/ThreadLocal:get	()Ljava/lang/Object;
          //   37: astore 4
          //   39: aload 4
          //   41: ifnull +33 -> 74
          //   44: aload_1
          //   45: getfield 56	com/tencent/mm/kiss/a/b$b:eMZ	Ljava/lang/reflect/Field;
          //   48: aload 4
          //   50: invokevirtual 48	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
          //   53: astore_1
          //   54: aload_1
          //   55: ifnull +19 -> 74
          //   58: aload_1
          //   59: instanceof 58
          //   62: ifeq +12 -> 74
          //   65: aload_1
          //   66: checkcast 58	java/util/List
          //   69: invokeinterface 62 1 0
          //   74: ldc 64
          //   76: ldc 66
          //   78: iconst_1
          //   79: anewarray 68	java/lang/Object
          //   82: dup
          //   83: iconst_0
          //   84: invokestatic 38	java/lang/System:nanoTime	()J
          //   87: lload_2
          //   88: lsub
          //   89: invokestatic 74	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   92: aastore
          //   93: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   96: ldc 26
          //   98: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
          //   101: return
          //   102: astore_1
          //   103: ldc 64
          //   105: aload_1
          //   106: ldc 84
          //   108: iconst_0
          //   109: anewarray 68	java/lang/Object
          //   112: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   115: goto -41 -> 74
          //   118: astore_1
          //   119: ldc 26
          //   121: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
          //   124: goto -23 -> 101
          //   127: astore_1
          //   128: ldc 64
          //   130: aload_1
          //   131: ldc 84
          //   133: iconst_0
          //   134: anewarray 68	java/lang/Object
          //   137: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   140: goto -66 -> 74
          //
          // Exception table:
          //   from	to	target	type
          //   14	27	102	java/lang/IllegalAccessException
          //   5	14	118	java/lang/Throwable
          //   14	27	118	java/lang/Throwable
          //   32	39	118	java/lang/Throwable
          //   44	54	118	java/lang/Throwable
          //   58	74	118	java/lang/Throwable
          //   74	96	118	java/lang/Throwable
          //   103	115	118	java/lang/Throwable
          //   128	140	118	java/lang/Throwable
          //   44	54	127	java/lang/IllegalAccessException
        }
      };
      AppMethodBeat.o(105681);
    }

    // ERROR //
    final boolean EK()
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore_1
      //   2: ldc 54
      //   4: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   7: aload_0
      //   8: getfield 36	com/tencent/mm/kiss/a/b$b:eNa	Z
      //   11: ifeq +15 -> 26
      //   14: aload_0
      //   15: getfield 38	com/tencent/mm/kiss/a/b$b:eNb	Z
      //   18: istore_1
      //   19: ldc 54
      //   21: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   24: iload_1
      //   25: ireturn
      //   26: aload_0
      //   27: iconst_1
      //   28: putfield 36	com/tencent/mm/kiss/a/b$b:eNa	Z
      //   31: aload_0
      //   32: ldc 56
      //   34: invokestatic 62	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
      //   37: putfield 64	com/tencent/mm/kiss/a/b$b:eMW	Ljava/lang/Class;
      //   40: aload_0
      //   41: aload_0
      //   42: getfield 64	com/tencent/mm/kiss/a/b$b:eMW	Ljava/lang/Class;
      //   45: ldc 66
      //   47: invokevirtual 70	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   50: putfield 72	com/tencent/mm/kiss/a/b$b:eMX	Ljava/lang/reflect/Field;
      //   53: aload_0
      //   54: getfield 72	com/tencent/mm/kiss/a/b$b:eMX	Ljava/lang/reflect/Field;
      //   57: iconst_1
      //   58: invokevirtual 78	java/lang/reflect/Field:setAccessible	(Z)V
      //   61: aload_0
      //   62: ldc 80
      //   64: invokestatic 62	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
      //   67: putfield 82	com/tencent/mm/kiss/a/b$b:eMY	Ljava/lang/Class;
      //   70: aload_0
      //   71: aload_0
      //   72: getfield 82	com/tencent/mm/kiss/a/b$b:eMY	Ljava/lang/Class;
      //   75: ldc 84
      //   77: invokevirtual 70	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   80: putfield 34	com/tencent/mm/kiss/a/b$b:eMZ	Ljava/lang/reflect/Field;
      //   83: aload_0
      //   84: getfield 34	com/tencent/mm/kiss/a/b$b:eMZ	Ljava/lang/reflect/Field;
      //   87: iconst_1
      //   88: invokevirtual 78	java/lang/reflect/Field:setAccessible	(Z)V
      //   91: aload_0
      //   92: iconst_1
      //   93: putfield 38	com/tencent/mm/kiss/a/b$b:eNb	Z
      //   96: ldc 54
      //   98: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   101: goto -77 -> 24
      //   104: astore_2
      //   105: ldc 86
      //   107: aload_2
      //   108: ldc 88
      //   110: iconst_0
      //   111: anewarray 4	java/lang/Object
      //   114: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   117: ldc 54
      //   119: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   122: iconst_0
      //   123: istore_1
      //   124: goto -100 -> 24
      //   127: astore_2
      //   128: ldc 86
      //   130: aload_2
      //   131: ldc 88
      //   133: iconst_0
      //   134: anewarray 4	java/lang/Object
      //   137: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   140: ldc 54
      //   142: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   145: iconst_0
      //   146: istore_1
      //   147: goto -123 -> 24
      //   150: astore_2
      //   151: ldc 86
      //   153: aload_2
      //   154: ldc 88
      //   156: iconst_0
      //   157: anewarray 4	java/lang/Object
      //   160: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   163: ldc 54
      //   165: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   168: iconst_0
      //   169: istore_1
      //   170: goto -146 -> 24
      //   173: astore_2
      //   174: ldc 86
      //   176: aload_2
      //   177: ldc 88
      //   179: iconst_0
      //   180: anewarray 4	java/lang/Object
      //   183: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   186: ldc 54
      //   188: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   191: iconst_0
      //   192: istore_1
      //   193: goto -169 -> 24
      //
      // Exception table:
      //   from	to	target	type
      //   31	40	104	java/lang/ClassNotFoundException
      //   40	53	127	java/lang/NoSuchFieldException
      //   61	70	150	java/lang/ClassNotFoundException
      //   70	83	173	java/lang/NoSuchFieldException
    }
  }

  public static abstract interface c
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.a.b
 * JD-Core Version:    0.6.2
 */