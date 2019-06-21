package com.b.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.DecimalFormat;
import org.json.JSONObject;

final class r extends d
{
  private static final DecimalFormat bFD;
  private static final DecimalFormat bFE;
  private static r bFF;
  private String bFG;
  private String bFH;
  private final r.b bFI;
  private int bFJ;
  z bFK;
  private SharedPreferences bFL;
  private f bFM;
  private final Object bFN;
  private final r.d bFO;
  q bFP;
  String bFQ;
  private int mRetryCount;

  static
  {
    AppMethodBeat.i(55546);
    bFD = new DecimalFormat("0000000000");
    bFE = new DecimalFormat("0000000000000000");
    AppMethodBeat.o(55546);
  }

  private r()
  {
    AppMethodBeat.i(55547);
    this.bFI = new r.b((byte)0);
    this.bFN = new Object();
    this.bFO = new r.d(this, (byte)0);
    AppMethodBeat.o(55547);
  }

  private static String a(Long paramLong)
  {
    AppMethodBeat.i(55562);
    if (paramLong == null)
    {
      paramLong = new Exception("OnlineModule: null source id");
      AppMethodBeat.o(55562);
      throw paramLong;
    }
    try
    {
      paramLong = bFD.format(paramLong);
      AppMethodBeat.o(55562);
      return paramLong;
    }
    catch (NumberFormatException paramLong)
    {
      paramLong = new Exception("OnlineModule: invalid source id");
      AppMethodBeat.o(55562);
    }
    throw paramLong;
  }

  @SuppressLint({"NewApi"})
  private void bq(String paramString)
  {
    AppMethodBeat.i(55556);
    if (paramString == null)
      AppMethodBeat.o(55556);
    while (true)
    {
      return;
      synchronized (this.bFN)
      {
        try
        {
          String str = wl().getString("1-115-10127", "");
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(String.valueOf(str));
          str = paramString;
          int i = str.length() - 307200;
          paramString = str;
          if (i > 0)
          {
            int j = str.indexOf("&OD[]=", i);
            if (j >= i)
              paramString = str.substring(j);
          }
          else
          {
            label106: if (Build.VERSION.SDK_INT < 9)
              break label155;
            wl().edit().putString("1-115-10127", paramString).apply();
          }
          while (true)
          {
            label137: AppMethodBeat.o(55556);
            break;
            paramString = "";
            break label106;
            label155: wl().edit().putString("1-115-10127", paramString).commit();
          }
        }
        catch (Exception paramString)
        {
          break label137;
        }
        catch (Error paramString)
        {
          while (true)
          {
            try
            {
              if (Build.VERSION.SDK_INT < 9)
                break label227;
              wl().edit().putString("1-115-10127", "").apply();
            }
            catch (Exception paramString)
            {
            }
            continue;
            label227: wl().edit().putString("1-115-10127", "").commit();
          }
        }
      }
    }
  }

  private static String br(String paramString)
  {
    AppMethodBeat.i(55561);
    try
    {
      long l1 = Long.parseLong(paramString);
      long l2 = System.currentTimeMillis();
      paramString = new java/lang/StringBuilder;
      paramString.<init>("T");
      paramString = bFE.format(l1 + l2);
      AppMethodBeat.o(55561);
      return paramString;
    }
    catch (NumberFormatException paramString)
    {
      paramString = new Exception("OnlineModule: invalid device id, type: 0");
      AppMethodBeat.o(55561);
    }
    throw paramString;
  }

  private static r.f d(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55553);
    while (true)
    {
      long l;
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        int i = ((JSONObject)localObject).optInt("errorcode", -5);
        if (i != 0)
        {
          paramString = new r.f(i, null, null, (byte)0);
          AppMethodBeat.o(55553);
          return paramString;
        }
        l = ((JSONObject)localObject).optLong("hitarea", 0L);
        localObject = ((JSONObject)localObject).optString("swdata", null);
        paramString = new java/lang/String;
        paramString.<init>(Base64.decode((String)localObject, 0), "UTF-8");
        if (y.bIM)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("data_transaction_log_");
          o.s(y.bIT, paramString);
        }
        if ((paramString.length() <= h.bDl) || (!paramString.startsWith("$UP,")))
        {
          paramString = new Exception("OnlineModule: parse data upload reply and generate msg: invalid arg");
          AppMethodBeat.o(55553);
          throw paramString;
        }
      }
      catch (Exception paramString)
      {
        if (y.bIM)
          o.s("data_transaction_log_" + y.bIT, "parse json data error");
        paramString = new Exception("parse json data error");
        AppMethodBeat.o(55553);
        throw paramString;
      }
      switch (paramString.charAt(h.bDl))
      {
      default:
      case '1':
        do
        {
          paramString = new Exception("OnlineModule: unable to parse data upload reply");
          AppMethodBeat.o(55553);
          throw paramString;
        }
        while (paramString.length() <= h.bDm);
        paramString = f(paramString.substring(h.bDm), l);
        paramString.bIA = paramLong1;
        paramString.bFX = paramLong2;
        paramString = new r.f(1, paramString, null, (byte)0);
        AppMethodBeat.o(55553);
      case '0':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      }
    }
    if (paramString.length() > h.bDm);
    for (paramString = paramString.substring(h.bDm); ; paramString = null)
    {
      paramString = new r.f(0, null, paramString, (byte)0);
      AppMethodBeat.o(55553);
      break;
    }
    if (paramString.length() > h.bDm);
    for (paramString = paramString.substring(h.bDm); ; paramString = null)
    {
      paramString = new r.f(2, null, paramString, (byte)0);
      AppMethodBeat.o(55553);
      break;
    }
    if (paramString.length() > h.bDm);
    for (paramString = paramString.substring(h.bDm); ; paramString = null)
    {
      paramString = new r.f(3, null, paramString, (byte)0);
      AppMethodBeat.o(55553);
      break;
    }
    if (paramString.length() > h.bDm);
    for (paramString = paramString.substring(h.bDm); ; paramString = null)
    {
      paramString = new r.f(4, null, paramString, (byte)0);
      AppMethodBeat.o(55553);
      break;
    }
    if (paramString.length() > h.bDm);
    for (paramString = paramString.substring(h.bDm); ; paramString = null)
    {
      paramString = new r.f(5, null, paramString, (byte)0);
      AppMethodBeat.o(55553);
      break;
    }
    if (paramString.length() > h.bDm);
    for (paramString = paramString.substring(h.bDm); ; paramString = null)
    {
      paramString = new r.f(6, null, paramString, (byte)0);
      AppMethodBeat.o(55553);
      break;
    }
  }

  // ERROR //
  private static x f(String paramString, long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc_w 421
    //   5: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnull +244 -> 253
    //   12: aload_0
    //   13: ldc_w 423
    //   16: iconst_m1
    //   17: invokevirtual 427	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   20: astore_0
    //   21: aload_0
    //   22: arraylength
    //   23: bipush 10
    //   25: if_icmpne +228 -> 253
    //   28: aload_0
    //   29: iconst_0
    //   30: aaload
    //   31: invokestatic 433	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   34: dstore 4
    //   36: aload_0
    //   37: iconst_1
    //   38: aaload
    //   39: invokestatic 433	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   42: dstore 6
    //   44: aload_0
    //   45: bipush 8
    //   47: aaload
    //   48: invokestatic 439	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   51: fstore 8
    //   53: aload_0
    //   54: iconst_3
    //   55: aaload
    //   56: invokestatic 445	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   59: istore 9
    //   61: aload_0
    //   62: iconst_4
    //   63: aaload
    //   64: invokestatic 445	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   67: istore 10
    //   69: aload_0
    //   70: iconst_5
    //   71: aaload
    //   72: invokestatic 445	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   75: istore 11
    //   77: aload_0
    //   78: bipush 7
    //   80: aaload
    //   81: invokestatic 445	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   84: istore 12
    //   86: iload 12
    //   88: istore_3
    //   89: fconst_0
    //   90: fstore 13
    //   92: aload_0
    //   93: bipush 9
    //   95: aaload
    //   96: invokestatic 439	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   99: fstore 14
    //   101: fload 14
    //   103: fstore 13
    //   105: new 413	com/b/a/a/x
    //   108: astore 15
    //   110: aload 15
    //   112: invokespecial 446	com/b/a/a/x:<init>	()V
    //   115: aload 15
    //   117: dload 4
    //   119: putfield 450	com/b/a/a/x:latitude	D
    //   122: aload 15
    //   124: dload 6
    //   126: putfield 453	com/b/a/a/x:longitude	D
    //   129: aload 15
    //   131: aload_0
    //   132: iconst_2
    //   133: aaload
    //   134: putfield 456	com/b/a/a/x:bIx	Ljava/lang/String;
    //   137: aload 15
    //   139: iload 9
    //   141: putfield 459	com/b/a/a/x:level	I
    //   144: aload 15
    //   146: iload 10
    //   148: i2l
    //   149: putfield 462	com/b/a/a/x:bIz	J
    //   152: aload 15
    //   154: iload 11
    //   156: putfield 465	com/b/a/a/x:bIC	I
    //   159: aload 15
    //   161: aload_0
    //   162: bipush 6
    //   164: aaload
    //   165: putfield 468	com/b/a/a/x:bIy	Ljava/lang/String;
    //   168: aload 15
    //   170: iload_3
    //   171: putfield 471	com/b/a/a/x:bID	I
    //   174: aload 15
    //   176: fload 8
    //   178: putfield 475	com/b/a/a/x:bEJ	F
    //   181: aload 15
    //   183: getfield 479	com/b/a/a/x:bIB	Lcom/b/a/a/x$a;
    //   186: ifnonnull +17 -> 203
    //   189: new 481	com/b/a/a/x$a
    //   192: astore_0
    //   193: aload_0
    //   194: invokespecial 482	com/b/a/a/x$a:<init>	()V
    //   197: aload 15
    //   199: aload_0
    //   200: putfield 479	com/b/a/a/x:bIB	Lcom/b/a/a/x$a;
    //   203: aload 15
    //   205: getfield 479	com/b/a/a/x:bIB	Lcom/b/a/a/x$a;
    //   208: fload 13
    //   210: putfield 485	com/b/a/a/x$a:bIE	F
    //   213: aload 15
    //   215: lload_1
    //   216: putfield 488	com/b/a/a/x:bFo	J
    //   219: ldc_w 421
    //   222: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: aload 15
    //   227: areturn
    //   228: astore 15
    //   230: iconst_0
    //   231: istore 9
    //   233: goto -172 -> 61
    //   236: astore 15
    //   238: iconst_0
    //   239: istore 10
    //   241: goto -172 -> 69
    //   244: astore 15
    //   246: iconst_0
    //   247: istore 11
    //   249: goto -172 -> 77
    //   252: astore_0
    //   253: new 94	java/lang/Exception
    //   256: dup
    //   257: ldc_w 490
    //   260: invokespecial 97	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   263: astore_0
    //   264: ldc_w 421
    //   267: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: aload_0
    //   271: athrow
    //   272: astore 15
    //   274: goto -169 -> 105
    //   277: astore 15
    //   279: goto -190 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   53	61	228	java/lang/NumberFormatException
    //   61	69	236	java/lang/NumberFormatException
    //   69	77	244	java/lang/NumberFormatException
    //   28	53	252	java/lang/NumberFormatException
    //   105	203	252	java/lang/NumberFormatException
    //   203	219	252	java/lang/NumberFormatException
    //   92	101	272	java/lang/NumberFormatException
    //   77	86	277	java/lang/NumberFormatException
  }

  private void g(String paramString, long paramLong)
  {
    Object localObject = null;
    AppMethodBeat.i(55555);
    String str = paramString;
    if (paramString != null)
    {
      if (paramString.startsWith("&OD[]="))
        str = paramString;
    }
    else
    {
      bq(str);
      AppMethodBeat.o(55555);
      return;
    }
    paramString = v.bt(v.bu(paramString));
    if (paramString == null)
    {
      paramString = null;
      label56: if (paramString != null)
        break label90;
    }
    label90: for (paramString = localObject; ; paramString = paramString.replace("&WD[]=", "|WD,"))
    {
      str = v.b(paramString, paramLong, "1");
      break;
      paramString = paramString.replace("&MD=", "|MD,");
      break label56;
    }
  }

  static r wg()
  {
    AppMethodBeat.i(55548);
    if (bFF == null)
      bFF = new r();
    r localr = bFF;
    AppMethodBeat.o(55548);
    return localr;
  }

  private String wj()
  {
    AppMethodBeat.i(55557);
    try
    {
      String str1 = wl().getString("1-115-10127", "");
      AppMethodBeat.o(55557);
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str2 = "";
        AppMethodBeat.o(55557);
      }
    }
  }

  @SuppressLint({"NewApi"})
  private void wk()
  {
    AppMethodBeat.i(55558);
    try
    {
      if (Build.VERSION.SDK_INT >= 9)
      {
        wl().edit().remove("1-115-10127").apply();
        AppMethodBeat.o(55558);
      }
      while (true)
      {
        return;
        wl().edit().remove("1-115-10127").commit();
        AppMethodBeat.o(55558);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(55558);
    }
  }

  private SharedPreferences wl()
  {
    AppMethodBeat.i(55559);
    if (this.bFL == null)
    {
      localObject = new Exception("OnlineModule: data buffer unavailable");
      AppMethodBeat.o(55559);
      throw ((Throwable)localObject);
    }
    Object localObject = this.bFL;
    AppMethodBeat.o(55559);
    return localObject;
  }

  private void wm()
  {
    String str;
    r.b localb;
    try
    {
      AppMethodBeat.i(55560);
      Object localObject1 = this.bFG;
      str = this.bFH;
      localb = this.bFI;
      if ((localObject1 == null) || (str == null) || (localb == null))
      {
        localObject1 = new java/lang/Exception;
        ((Exception)localObject1).<init>("OnlineModule: authenticate: null arg");
        AppMethodBeat.o(55560);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(String.valueOf(localObject2));
    System.arraycopy(str.getBytes(), 0, localb.bFS, 0, 27);
    localb.code = 1;
    AppMethodBeat.o(55560);
  }

  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    AppMethodBeat.i(55550);
    this.bFK = z.b(paramHandler);
    wh();
    AppMethodBeat.o(55550);
  }

  final void at(Context paramContext)
  {
    AppMethodBeat.i(55549);
    try
    {
      String str = this.bFQ;
      Object localObject = str;
      if (TextUtils.isEmpty(str))
        localObject = "0000000000";
      this.bFG = br((String)localObject);
      this.bFH = a(Long.valueOf(System.currentTimeMillis() / 1000L));
      localObject = new com/b/a/a/f;
      ((f)localObject).<init>(paramContext);
      this.bFM = ((f)localObject);
      label62: this.bFL = paramContext.getSharedPreferences("0-474-85242", 0);
      AppMethodBeat.o(55549);
      return;
    }
    catch (Exception localException)
    {
      break label62;
    }
  }

  final void au(Context paramContext)
  {
  }

  final void bp(String paramString)
  {
    AppMethodBeat.i(55552);
    if (this.bFK != null)
      this.bFK.execute(new r.c(this, paramString, 0L, 1, (byte)0));
    AppMethodBeat.o(55552);
  }

  final void vV()
  {
    this.bFP = null;
  }

  final void wh()
  {
    AppMethodBeat.i(55551);
    if (this.bFK != null);
    while (true)
    {
      try
      {
        this.bFK.execute(r.d.a(this.bFO));
        AppMethodBeat.o(55551);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(55551);
    }
  }

  final boolean wi()
  {
    boolean bool = true;
    if (this.bFI.code == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.b.a.a.r
 * JD-Core Version:    0.6.2
 */