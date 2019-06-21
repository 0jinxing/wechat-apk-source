package com.tencent.mm.cb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class b extends com.tencent.mm.api.d
{
  public static final String xFA;
  private static final boolean xFB;
  private static b xFC;
  public static final String xFz;
  private LinkedList<c> jpa;
  private Context mContext;
  private int xFD;
  private int xFE;
  private int xFF;
  private int xFG;
  public long xFH;
  private a xFI;
  private SparseArray<c> xFJ;
  public SparseArray<c> xFK;
  private SparseArray<c> xFL;
  private SparseArray<SparseArray<c>> xFM;
  private SparseArray<String> xFN;
  private f<String, Bitmap> xFO;
  private boolean xFP;
  private LinkedList<d> xFQ;
  private final Spannable.Factory xFR;

  static
  {
    AppMethodBeat.i(62663);
    xFz = com.tencent.mm.compatible.util.e.eSi + "app_font";
    xFA = xFz + "/color_emoji";
    if (Build.VERSION.SDK_INT < 19);
    for (boolean bool = true; ; bool = false)
    {
      xFB = bool;
      AppMethodBeat.o(62663);
      return;
    }
  }

  private b()
  {
    AppMethodBeat.i(62645);
    this.xFD = 0;
    this.xFH = 0L;
    this.xFI = new a();
    this.xFJ = new SparseArray();
    this.xFK = new SparseArray();
    this.xFL = new SparseArray();
    this.xFM = new SparseArray();
    this.xFN = null;
    this.xFO = new com.tencent.mm.memory.a.b(200, getClass());
    this.xFP = false;
    this.xFR = new b.1(this);
    this.mContext = ah.getContext();
    if (!com.tencent.mm.vfs.e.ct(xFA))
    {
      dqF();
      init();
      if (!com.tencent.mm.bz.a.ga(this.mContext))
        break label175;
      this.xFD = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 4);
      AppMethodBeat.o(62645);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.EmojiHelper", "emoji color file exist.");
      break;
      label175: this.xFD = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 2);
      AppMethodBeat.o(62645);
    }
  }

  // ERROR //
  public static long anR(String paramString)
  {
    // Byte code:
    //   0: ldc 180
    //   2: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 184	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   9: astore_1
    //   10: new 186	java/io/DataInputStream
    //   13: astore_0
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial 189	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: aload_0
    //   20: invokevirtual 193	java/io/DataInputStream:readInt	()I
    //   23: pop
    //   24: aload_0
    //   25: invokevirtual 197	java/io/DataInputStream:readLong	()J
    //   28: lstore_2
    //   29: aload_0
    //   30: invokevirtual 200	java/io/DataInputStream:close	()V
    //   33: aload_1
    //   34: ifnull +7 -> 41
    //   37: aload_1
    //   38: invokevirtual 203	java/io/InputStream:close	()V
    //   41: ldc 180
    //   43: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: lload_2
    //   47: lreturn
    //   48: astore_0
    //   49: ldc 168
    //   51: aload_0
    //   52: ldc 205
    //   54: iconst_0
    //   55: anewarray 118	java/lang/Object
    //   58: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: goto -20 -> 41
    //   64: astore_0
    //   65: aconst_null
    //   66: astore 4
    //   68: aconst_null
    //   69: astore_1
    //   70: ldc 168
    //   72: aload_0
    //   73: ldc 205
    //   75: iconst_0
    //   76: anewarray 118	java/lang/Object
    //   79: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   82: aload 4
    //   84: ifnull +8 -> 92
    //   87: aload 4
    //   89: invokevirtual 200	java/io/DataInputStream:close	()V
    //   92: aload_1
    //   93: ifnull +7 -> 100
    //   96: aload_1
    //   97: invokevirtual 203	java/io/InputStream:close	()V
    //   100: lconst_0
    //   101: lstore_2
    //   102: ldc 180
    //   104: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: goto -61 -> 46
    //   110: astore_0
    //   111: ldc 168
    //   113: aload_0
    //   114: ldc 205
    //   116: iconst_0
    //   117: anewarray 118	java/lang/Object
    //   120: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: goto -23 -> 100
    //   126: astore_0
    //   127: aconst_null
    //   128: astore 4
    //   130: aconst_null
    //   131: astore_1
    //   132: aload 4
    //   134: ifnull +8 -> 142
    //   137: aload 4
    //   139: invokevirtual 200	java/io/DataInputStream:close	()V
    //   142: aload_1
    //   143: ifnull +7 -> 150
    //   146: aload_1
    //   147: invokevirtual 203	java/io/InputStream:close	()V
    //   150: ldc 180
    //   152: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: aload_0
    //   156: athrow
    //   157: astore 4
    //   159: ldc 168
    //   161: aload 4
    //   163: ldc 205
    //   165: iconst_0
    //   166: anewarray 118	java/lang/Object
    //   169: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: goto -22 -> 150
    //   175: astore_0
    //   176: aconst_null
    //   177: astore 4
    //   179: goto -47 -> 132
    //   182: astore 5
    //   184: aload_0
    //   185: astore 4
    //   187: aload 5
    //   189: astore_0
    //   190: goto -58 -> 132
    //   193: astore_0
    //   194: goto -62 -> 132
    //   197: astore_0
    //   198: aconst_null
    //   199: astore 4
    //   201: goto -131 -> 70
    //   204: astore 5
    //   206: aload_0
    //   207: astore 4
    //   209: aload 5
    //   211: astore_0
    //   212: goto -142 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   29	33	48	java/io/IOException
    //   37	41	48	java/io/IOException
    //   5	10	64	java/io/IOException
    //   87	92	110	java/io/IOException
    //   96	100	110	java/io/IOException
    //   5	10	126	finally
    //   137	142	157	java/io/IOException
    //   146	150	157	java/io/IOException
    //   10	19	175	finally
    //   19	29	182	finally
    //   70	82	193	finally
    //   10	19	197	java/io/IOException
    //   19	29	204	java/io/IOException
  }

  // ERROR //
  public static int anS(String paramString)
  {
    // Byte code:
    //   0: ldc 212
    //   2: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 184	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   9: astore_0
    //   10: new 186	java/io/DataInputStream
    //   13: astore_1
    //   14: aload_1
    //   15: aload_0
    //   16: invokespecial 189	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: aload_1
    //   20: astore_2
    //   21: aload_0
    //   22: astore_3
    //   23: aload_1
    //   24: invokevirtual 193	java/io/DataInputStream:readInt	()I
    //   27: istore 4
    //   29: aload_1
    //   30: invokevirtual 200	java/io/DataInputStream:close	()V
    //   33: aload_0
    //   34: ifnull +7 -> 41
    //   37: aload_0
    //   38: invokevirtual 203	java/io/InputStream:close	()V
    //   41: ldc 212
    //   43: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: iload 4
    //   48: ireturn
    //   49: astore_0
    //   50: ldc 168
    //   52: aload_0
    //   53: ldc 205
    //   55: iconst_0
    //   56: anewarray 118	java/lang/Object
    //   59: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: goto -21 -> 41
    //   65: astore 5
    //   67: aconst_null
    //   68: astore_1
    //   69: aconst_null
    //   70: astore_0
    //   71: aload_1
    //   72: astore_2
    //   73: aload_0
    //   74: astore_3
    //   75: ldc 168
    //   77: aload 5
    //   79: ldc 205
    //   81: iconst_0
    //   82: anewarray 118	java/lang/Object
    //   85: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload_1
    //   89: ifnull +7 -> 96
    //   92: aload_1
    //   93: invokevirtual 200	java/io/DataInputStream:close	()V
    //   96: aload_0
    //   97: ifnull +7 -> 104
    //   100: aload_0
    //   101: invokevirtual 203	java/io/InputStream:close	()V
    //   104: ldc 212
    //   106: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: iconst_0
    //   110: istore 4
    //   112: goto -66 -> 46
    //   115: astore_0
    //   116: ldc 168
    //   118: aload_0
    //   119: ldc 205
    //   121: iconst_0
    //   122: anewarray 118	java/lang/Object
    //   125: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   128: goto -24 -> 104
    //   131: astore_1
    //   132: aconst_null
    //   133: astore_2
    //   134: aconst_null
    //   135: astore_0
    //   136: aload_2
    //   137: ifnull +7 -> 144
    //   140: aload_2
    //   141: invokevirtual 200	java/io/DataInputStream:close	()V
    //   144: aload_0
    //   145: ifnull +7 -> 152
    //   148: aload_0
    //   149: invokevirtual 203	java/io/InputStream:close	()V
    //   152: ldc 212
    //   154: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: aload_1
    //   158: athrow
    //   159: astore_0
    //   160: ldc 168
    //   162: aload_0
    //   163: ldc 205
    //   165: iconst_0
    //   166: anewarray 118	java/lang/Object
    //   169: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: goto -20 -> 152
    //   175: astore_1
    //   176: aconst_null
    //   177: astore_2
    //   178: goto -42 -> 136
    //   181: astore_1
    //   182: aload_3
    //   183: astore_0
    //   184: goto -48 -> 136
    //   187: astore 5
    //   189: aconst_null
    //   190: astore_1
    //   191: goto -120 -> 71
    //   194: astore 5
    //   196: goto -125 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   29	33	49	java/io/IOException
    //   37	41	49	java/io/IOException
    //   5	10	65	java/io/IOException
    //   92	96	115	java/io/IOException
    //   100	104	115	java/io/IOException
    //   5	10	131	finally
    //   140	144	159	java/io/IOException
    //   148	152	159	java/io/IOException
    //   10	19	175	finally
    //   23	29	181	finally
    //   75	88	181	finally
    //   10	19	187	java/io/IOException
    //   23	29	194	java/io/IOException
  }

  public static boolean anT(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(62654);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(62654);
    while (true)
    {
      return bool;
      paramString = paramString.toString();
      int i = paramString.length();
      int m;
      for (int j = 0; ; j = m)
      {
        if (j >= i)
          break label125;
        int k = paramString.codePointAt(j);
        m = Character.charCount(k) + j;
        if (m < i);
        for (j = paramString.codePointAt(m); ; j = 0)
        {
          if (dqD().Mi(k) == null)
            break label97;
          AppMethodBeat.o(62654);
          bool = true;
          break;
        }
        label97: if (dqD().gY(k, j) != null)
        {
          AppMethodBeat.o(62654);
          bool = true;
          break;
        }
      }
      label125: AppMethodBeat.o(62654);
    }
  }

  public static b dqD()
  {
    AppMethodBeat.i(62646);
    if (xFC == null);
    try
    {
      b localb = new com/tencent/mm/cb/b;
      localb.<init>();
      xFC = localb;
      localb = xFC;
      AppMethodBeat.o(62646);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(62646);
    }
  }

  public static void dqE()
  {
    AppMethodBeat.i(62647);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(xFz);
    if (localb.isFile())
      localb.delete();
    if (!localb.exists())
      localb.mkdirs();
    AppMethodBeat.o(62647);
  }

  private static void dqF()
  {
    AppMethodBeat.i(62648);
    long l = System.currentTimeMillis();
    dqE();
    com.tencent.mm.vfs.e.y("assets:///color_emoji", xFA);
    ab.d("MicroMsg.EmojiHelper", "copyColorEmojiFile. use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(62648);
  }

  private void dqG()
  {
    AppMethodBeat.i(62656);
    Object localObject1 = ah.getContext();
    Object localObject2 = aa.g(((Context)localObject1).getSharedPreferences(ah.doA(), 0));
    if (((String)localObject2).equals("zh_CN"))
      localObject2 = ((Context)localObject1).getResources().getStringArray(2131755016);
    while (true)
    {
      localObject1 = ((Context)localObject1).getResources().getStringArray(2131755015);
      this.xFN = new SparseArray();
      for (int i = 0; (i < localObject1.length) && (i < localObject2.length); i++)
        this.xFN.put(localObject1[i].charAt(0), localObject2[i]);
      if ((((String)localObject2).equals("zh_TW")) || (((String)localObject2).equals("zh_HK")))
        localObject2 = ((Context)localObject1).getResources().getStringArray(2131755018);
      else
        localObject2 = ((Context)localObject1).getResources().getStringArray(2131755017);
    }
    AppMethodBeat.o(62656);
  }

  private void dqH()
  {
    AppMethodBeat.i(138410);
    if (ah.bqo())
    {
      com.tencent.mm.vfs.e.deleteFile(xFA);
      dqF();
      b.c.dif().f(37, 4, -1, false);
      init();
    }
    AppMethodBeat.o(138410);
  }

  private void dqI()
  {
    AppMethodBeat.i(62662);
    this.jpa = new LinkedList(this.xFI.xFy);
    if ((this.jpa == null) || (this.jpa.isEmpty()))
    {
      ab.i("MicroMsg.EmojiHelper", "initIndex failed. items is empty.");
      AppMethodBeat.o(62662);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.jpa.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        if (localc.jik != 0)
        {
          SparseArray localSparseArray1 = (SparseArray)this.xFM.get(localc.jik);
          SparseArray localSparseArray2 = localSparseArray1;
          if (localSparseArray1 == null)
          {
            localSparseArray2 = new SparseArray();
            this.xFM.append(localc.jik, localSparseArray2);
          }
          localSparseArray2.put(localc.jil, localc);
          if (localc.jim != 0)
            this.xFJ.append(localc.jim, localc);
          if (localc.xFV != -1)
            this.xFK.append(localc.xFV, localc);
        }
        else
        {
          this.xFL.append(localc.xFW, localc);
        }
      }
      AppMethodBeat.o(62662);
    }
  }

  public final c Mi(int paramInt)
  {
    AppMethodBeat.i(62659);
    c localc;
    if ((paramInt >= 57345) && (paramInt <= 58679))
    {
      localc = (c)this.xFJ.get(paramInt);
      AppMethodBeat.o(62659);
    }
    while (true)
    {
      return localc;
      localc = null;
      AppMethodBeat.o(62659);
    }
  }

  public final Drawable a(c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(62661);
    if (paramc == null)
    {
      ab.i("MicroMsg.EmojiHelper", "Emoji Item is null.");
      AppMethodBeat.o(62661);
      paramc = null;
    }
    while (true)
    {
      return paramc;
      try
      {
        Object localObject1 = this.xFO;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = (Bitmap)((f)localObject1).get(paramc.coc);
        if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
        {
          paramc = new android/graphics/drawable/BitmapDrawable;
          paramc.<init>(ah.getContext().getResources(), (Bitmap)localObject2);
          AppMethodBeat.o(62661);
        }
        else
        {
          localObject1 = com.tencent.mm.vfs.e.e(xFA, paramc.coc + this.xFF, paramc.size);
          localObject2 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject2).<init>();
          ((BitmapFactory.Options)localObject2).inPreferredConfig = Bitmap.Config.RGB_565;
          localObject2 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
          if (localObject2 != null)
          {
            ((Bitmap)localObject2).setDensity(240);
            localObject1 = this.xFO;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            ((f)localObject1).put(paramc.coc, localObject2);
            paramc = new BitmapDrawable(ah.getContext().getResources(), (Bitmap)localObject2);
            AppMethodBeat.o(62661);
          }
          else
          {
            int i = paramc.size;
            if (localObject1 == null);
            for (int j = 0; ; j = localObject1.length)
            {
              ab.i("MicroMsg.EmojiHelper", "bitmap is null. decode byte array failed. size:%d data length:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              if (!paramBoolean)
                break label423;
              dqD();
              j = anS(xFA);
              dqD();
              long l = anR(xFA);
              ab.i("MicroMsg.EmojiHelper", "emoji error currentSupportVersion:%d currentVersion:%d supportVersion:%d Version:%d", new Object[] { Integer.valueOf(this.xFG), Long.valueOf(this.xFH), Integer.valueOf(j), Long.valueOf(l) });
              if ((j != this.xFG) || (l <= this.xFH))
                break label390;
              init();
              paramc = a(paramc, false);
              AppMethodBeat.o(62661);
              break;
            }
            label390: dqH();
            paramc = a(paramc, false);
            AppMethodBeat.o(62661);
          }
        }
      }
      catch (Exception paramc)
      {
        ab.printErrStackTrace("MicroMsg.EmojiHelper", paramc, "", new Object[0]);
        label423: AppMethodBeat.o(62661);
        paramc = null;
      }
    }
  }

  public final Spannable a(Spannable paramSpannable, int paramInt, PInt paramPInt, Spannable.Factory paramFactory)
  {
    AppMethodBeat.i(62653);
    if ((paramSpannable == null) || (paramSpannable.length() == 0))
    {
      AppMethodBeat.o(62653);
      return paramSpannable;
    }
    Object localObject1 = paramSpannable.toString();
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    int j = ((String)localObject1).length();
    label52: int m;
    int n;
    label94: Object localObject2;
    if (i < j)
    {
      k = ((String)localObject1).codePointAt(i);
      m = i + Character.charCount(k);
      if (m >= j)
        break label171;
      n = ((String)localObject1).codePointAt(m);
      localObject2 = dqD().Mi(k);
      if (localObject2 == null)
        break label177;
      localLinkedList.add(new b.a(this, (c)localObject2, i, i + 1, true));
      k = m;
    }
    while (true)
      label138: if (localLinkedList.size() >= paramPInt.value)
        if (localLinkedList.size() == 0)
        {
          AppMethodBeat.o(62653);
          break;
          label171: n = 0;
          break label94;
          label177: localObject2 = dqD().gY(k, n);
          k = m;
          if (localObject2 == null)
            continue;
          if ((((c)localObject2).jil == 0) && ((127995 > n) || (n > 127999)))
            break label513;
        }
    label513: for (int k = m + Character.charCount(n); ; k = m)
    {
      localLinkedList.add(new b.a(this, (c)localObject2, i, k, false));
      break label138;
      if (xFB)
      {
        localObject2 = new StringBuilder((String)localObject1);
        paramSpannable = localLinkedList.iterator();
        while (paramSpannable.hasNext())
        {
          localObject1 = (b.a)paramSpannable.next();
          if (!((b.a)localObject1).xFU)
            if ((((b.a)localObject1).xFT.jim != 0) && (((b.a)localObject1).end - ((b.a)localObject1).start == 1))
              ((StringBuilder)localObject2).replace(((b.a)localObject1).start, ((b.a)localObject1).end, String.valueOf((char)((b.a)localObject1).xFT.jim));
            else
              ((StringBuilder)localObject2).replace(((b.a)localObject1).start, ((b.a)localObject1).end, "....".substring(0, ((b.a)localObject1).end - ((b.a)localObject1).start));
        }
        paramSpannable = paramFactory.newSpannable(((StringBuilder)localObject2).toString());
      }
      while (true)
      {
        paramFactory = localLinkedList.iterator();
        while (paramFactory.hasNext())
        {
          localObject1 = (b.a)paramFactory.next();
          a(paramSpannable, dqD().a(((b.a)localObject1).xFT, true), ((b.a)localObject1).start, ((b.a)localObject1).end, paramInt);
        }
        paramPInt.value -= localLinkedList.size();
        AppMethodBeat.o(62653);
        break;
      }
      i = k;
      break label52;
    }
  }

  public final SpannableString a(SpannableString paramSpannableString, int paramInt, PInt paramPInt)
  {
    AppMethodBeat.i(62652);
    paramSpannableString = (SpannableString)a(paramSpannableString, paramInt, paramPInt, this.xFR);
    AppMethodBeat.o(62652);
    return paramSpannableString;
  }

  public final void a(Spannable paramSpannable, Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(62657);
    int i = (int)(paramInt3 * 1.3F);
    paramInt3 = (int)(paramInt3 * 1.3F);
    try
    {
      paramDrawable.setBounds(0, 0, i, paramInt3);
      com.tencent.mm.ui.widget.a locala = new com/tencent/mm/ui/widget/a;
      locala.<init>(paramDrawable);
      locala.zLT = this.xFD;
      paramSpannable.setSpan(locala, paramInt1, paramInt2, 33);
      AppMethodBeat.o(62657);
      return;
    }
    catch (Exception paramSpannable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.EmojiHelper", paramSpannable, "", new Object[0]);
        AppMethodBeat.o(62657);
      }
    }
  }

  public final String anU(String paramString)
  {
    AppMethodBeat.i(62655);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(62655);
    while (true)
    {
      return paramString;
      if (this.xFN == null)
        dqG();
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramString.length();
      int j = 0;
      while (j < i)
      {
        int k = paramString.codePointAt(j);
        int m = j + Character.charCount(k);
        if (m < i);
        for (int n = paramString.codePointAt(m); ; n = 0)
        {
          localObject = dqD().Mi(k);
          if (localObject == null)
            break label165;
          localObject = (String)this.xFN.get(((c)localObject).jim);
          if (localObject == null)
            break label143;
          localStringBuilder.append((String)localObject);
          j = m;
          break;
        }
        label143: localStringBuilder.append(this.mContext.getString(2131296896));
        j = m;
        continue;
        label165: Object localObject = dqD().gY(k, n);
        if (localObject != null)
        {
          j = m;
          if (((c)localObject).jil != 0)
            j = Character.charCount(n) + m;
          localObject = (String)this.xFN.get(((c)localObject).jim);
          if (localObject != null)
            localStringBuilder.append((String)localObject);
          else
            localStringBuilder.append(this.mContext.getString(2131296896));
        }
        else
        {
          localStringBuilder.appendCodePoint(k);
          j = m;
        }
      }
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(62655);
    }
  }

  public final c gY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62658);
    if ((this.xFQ == null) || (this.xFQ.isEmpty()) || (this.xFP))
    {
      this.xFQ = new LinkedList(this.xFI.xFx);
      this.xFP = false;
    }
    if ((this.xFQ == null) || (this.xFQ.isEmpty()))
    {
      AppMethodBeat.o(62658);
      localObject = null;
      return localObject;
    }
    Object localObject = this.xFQ.iterator();
    int i = 0;
    label91: if (((Iterator)localObject).hasNext())
    {
      d locald = (d)((Iterator)localObject).next();
      if ((paramInt1 < locald.min) || (paramInt1 > locald.max))
        break label230;
      i = 1;
    }
    label230: 
    while (true)
    {
      break label91;
      if (i == 0)
      {
        AppMethodBeat.o(62658);
        localObject = null;
        break;
      }
      localObject = (SparseArray)this.xFM.get(paramInt1);
      if (localObject != null)
      {
        if ((((SparseArray)localObject).size() == 1) && (((SparseArray)localObject).get(0) != null))
        {
          localObject = (c)((SparseArray)localObject).get(0);
          AppMethodBeat.o(62658);
          break;
        }
        localObject = (c)((SparseArray)localObject).get(paramInt2);
        AppMethodBeat.o(62658);
        break;
      }
      AppMethodBeat.o(62658);
      localObject = null;
      break;
    }
  }

  // ERROR //
  public final void init()
  {
    // Byte code:
    //   0: ldc_w 619
    //   3: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 271	java/lang/System:currentTimeMillis	()J
    //   9: lstore_1
    //   10: getstatic 79	com/tencent/mm/cb/b:xFA	Ljava/lang/String;
    //   13: invokestatic 184	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   16: astore_3
    //   17: new 186	java/io/DataInputStream
    //   20: astore 4
    //   22: aload 4
    //   24: aload_3
    //   25: invokespecial 189	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   28: aload 4
    //   30: astore 5
    //   32: aload_3
    //   33: astore 6
    //   35: aload_0
    //   36: aload 4
    //   38: invokevirtual 193	java/io/DataInputStream:readInt	()I
    //   41: putfield 494	com/tencent/mm/cb/b:xFG	I
    //   44: aload 4
    //   46: astore 5
    //   48: aload_3
    //   49: astore 6
    //   51: aload_0
    //   52: aload 4
    //   54: invokevirtual 197	java/io/DataInputStream:readLong	()J
    //   57: putfield 96	com/tencent/mm/cb/b:xFH	J
    //   60: aload 4
    //   62: astore 5
    //   64: aload_3
    //   65: astore 6
    //   67: aload_0
    //   68: aload 4
    //   70: invokevirtual 193	java/io/DataInputStream:readInt	()I
    //   73: putfield 621	com/tencent/mm/cb/b:xFE	I
    //   76: aload 4
    //   78: astore 5
    //   80: aload_3
    //   81: astore 6
    //   83: aload_0
    //   84: aload_0
    //   85: getfield 621	com/tencent/mm/cb/b:xFE	I
    //   88: iconst_4
    //   89: iadd
    //   90: bipush 8
    //   92: iadd
    //   93: iconst_4
    //   94: iadd
    //   95: putfield 446	com/tencent/mm/cb/b:xFF	I
    //   98: aload 4
    //   100: astore 5
    //   102: aload_3
    //   103: astore 6
    //   105: aload_0
    //   106: getfield 621	com/tencent/mm/cb/b:xFE	I
    //   109: ifle +22 -> 131
    //   112: aload 4
    //   114: astore 5
    //   116: aload_3
    //   117: astore 6
    //   119: aload_0
    //   120: getfield 621	com/tencent/mm/cb/b:xFE	I
    //   123: aload 4
    //   125: invokevirtual 624	java/io/DataInputStream:available	()I
    //   128: if_icmple +93 -> 221
    //   131: aload 4
    //   133: astore 5
    //   135: aload_3
    //   136: astore 6
    //   138: ldc 168
    //   140: ldc_w 626
    //   143: iconst_1
    //   144: anewarray 118	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: aload_0
    //   150: getfield 621	com/tencent/mm/cb/b:xFE	I
    //   153: invokestatic 484	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   156: aastore
    //   157: invokestatic 629	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload 4
    //   162: astore 5
    //   164: aload_3
    //   165: astore 6
    //   167: aload_0
    //   168: invokespecial 498	com/tencent/mm/cb/b:dqH	()V
    //   171: aload 4
    //   173: astore 5
    //   175: aload_3
    //   176: astore 6
    //   178: ldc 168
    //   180: ldc_w 631
    //   183: iconst_1
    //   184: anewarray 118	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: invokestatic 271	java/lang/System:currentTimeMillis	()J
    //   192: lload_1
    //   193: lsub
    //   194: invokestatic 287	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   197: aastore
    //   198: invokestatic 486	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: aload 4
    //   203: invokevirtual 200	java/io/DataInputStream:close	()V
    //   206: aload_3
    //   207: ifnull +7 -> 214
    //   210: aload_3
    //   211: invokevirtual 203	java/io/InputStream:close	()V
    //   214: ldc_w 619
    //   217: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: return
    //   221: aload 4
    //   223: astore 5
    //   225: aload_3
    //   226: astore 6
    //   228: aload_0
    //   229: getfield 621	com/tencent/mm/cb/b:xFE	I
    //   232: newarray byte
    //   234: astore 7
    //   236: aload 4
    //   238: astore 5
    //   240: aload_3
    //   241: astore 6
    //   243: aload 4
    //   245: aload 7
    //   247: invokevirtual 635	java/io/DataInputStream:read	([B)I
    //   250: pop
    //   251: aload 4
    //   253: astore 5
    //   255: aload_3
    //   256: astore 6
    //   258: aload_0
    //   259: getfield 101	com/tencent/mm/cb/b:xFI	Lcom/tencent/mm/cb/a;
    //   262: aload 7
    //   264: invokevirtual 639	com/tencent/mm/cb/a:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   267: pop
    //   268: aload 4
    //   270: astore 5
    //   272: aload_3
    //   273: astore 6
    //   275: aload_0
    //   276: invokespecial 641	com/tencent/mm/cb/b:dqI	()V
    //   279: aload 4
    //   281: astore 5
    //   283: aload_3
    //   284: astore 6
    //   286: aload_0
    //   287: iconst_1
    //   288: putfield 129	com/tencent/mm/cb/b:xFP	Z
    //   291: goto -120 -> 171
    //   294: astore 7
    //   296: aload 4
    //   298: astore 5
    //   300: aload_3
    //   301: astore 6
    //   303: ldc 168
    //   305: aload 7
    //   307: ldc 205
    //   309: iconst_0
    //   310: anewarray 118	java/lang/Object
    //   313: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: aload 4
    //   318: ifnull +8 -> 326
    //   321: aload 4
    //   323: invokevirtual 200	java/io/DataInputStream:close	()V
    //   326: aload_3
    //   327: ifnull +7 -> 334
    //   330: aload_3
    //   331: invokevirtual 203	java/io/InputStream:close	()V
    //   334: ldc_w 619
    //   337: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   340: goto -120 -> 220
    //   343: astore_3
    //   344: ldc 168
    //   346: aload_3
    //   347: ldc 205
    //   349: iconst_0
    //   350: anewarray 118	java/lang/Object
    //   353: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: ldc_w 619
    //   359: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   362: goto -142 -> 220
    //   365: astore_3
    //   366: ldc 168
    //   368: aload_3
    //   369: ldc 205
    //   371: iconst_0
    //   372: anewarray 118	java/lang/Object
    //   375: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   378: ldc_w 619
    //   381: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   384: goto -164 -> 220
    //   387: astore 4
    //   389: aconst_null
    //   390: astore 5
    //   392: aconst_null
    //   393: astore_3
    //   394: aload 5
    //   396: ifnull +8 -> 404
    //   399: aload 5
    //   401: invokevirtual 200	java/io/DataInputStream:close	()V
    //   404: aload_3
    //   405: ifnull +7 -> 412
    //   408: aload_3
    //   409: invokevirtual 203	java/io/InputStream:close	()V
    //   412: ldc_w 619
    //   415: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: aload 4
    //   420: athrow
    //   421: astore_3
    //   422: ldc 168
    //   424: aload_3
    //   425: ldc 205
    //   427: iconst_0
    //   428: anewarray 118	java/lang/Object
    //   431: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   434: goto -22 -> 412
    //   437: astore 4
    //   439: aconst_null
    //   440: astore 5
    //   442: goto -48 -> 394
    //   445: astore 4
    //   447: aload 6
    //   449: astore_3
    //   450: goto -56 -> 394
    //   453: astore 7
    //   455: aconst_null
    //   456: astore 4
    //   458: aconst_null
    //   459: astore_3
    //   460: goto -164 -> 296
    //   463: astore 7
    //   465: aconst_null
    //   466: astore 4
    //   468: goto -172 -> 296
    //
    // Exception table:
    //   from	to	target	type
    //   35	44	294	java/lang/Exception
    //   51	60	294	java/lang/Exception
    //   67	76	294	java/lang/Exception
    //   83	98	294	java/lang/Exception
    //   105	112	294	java/lang/Exception
    //   119	131	294	java/lang/Exception
    //   138	160	294	java/lang/Exception
    //   167	171	294	java/lang/Exception
    //   178	201	294	java/lang/Exception
    //   228	236	294	java/lang/Exception
    //   243	251	294	java/lang/Exception
    //   258	268	294	java/lang/Exception
    //   275	279	294	java/lang/Exception
    //   286	291	294	java/lang/Exception
    //   201	206	343	java/io/IOException
    //   210	214	343	java/io/IOException
    //   321	326	365	java/io/IOException
    //   330	334	365	java/io/IOException
    //   6	17	387	finally
    //   399	404	421	java/io/IOException
    //   408	412	421	java/io/IOException
    //   17	28	437	finally
    //   35	44	445	finally
    //   51	60	445	finally
    //   67	76	445	finally
    //   83	98	445	finally
    //   105	112	445	finally
    //   119	131	445	finally
    //   138	160	445	finally
    //   167	171	445	finally
    //   178	201	445	finally
    //   228	236	445	finally
    //   243	251	445	finally
    //   258	268	445	finally
    //   275	279	445	finally
    //   286	291	445	finally
    //   303	316	445	finally
    //   6	17	453	java/lang/Exception
    //   17	28	463	java/lang/Exception
  }

  public final Drawable qJ(int paramInt)
  {
    AppMethodBeat.i(62660);
    Drawable localDrawable = a((c)this.xFL.get(paramInt), true);
    AppMethodBeat.o(62660);
    return localDrawable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cb.b
 * JD-Core Version:    0.6.2
 */