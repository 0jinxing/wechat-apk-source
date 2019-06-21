package com.tencent.mm.plugin.sns.model.a;

import com.tencent.mm.a.p;
import com.tencent.mm.memory.n;
import com.tencent.mm.network.b.b;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class b extends c
{
  private static HashSet<String> qOr = new HashSet();
  protected bau cNr = null;
  private long dnsCostTime = -1L;
  private int ezu = 0;
  private int gcI = -1;
  private String host = "";
  protected c.a qNY;
  protected n qNZ = null;
  protected a qOa = null;
  private String qOb = "";
  private String qOc = "";
  private String qOd = "";
  private int qOe = 0;
  protected int qOf = 0;
  private long qOg = -1L;
  protected long qOh = -1L;
  protected long qOi = -1L;
  protected long qOj = -1L;
  protected String qOk = "";
  protected PString qOl = new PString();
  protected int qOm;
  protected long qOn;
  protected long qOo;
  protected long qOp;
  protected int qOq = 0;
  private Map<String, List<String>> qOs;
  int qOt = 0;
  private int retCode = -1;

  public b(c.a parama, a parama1)
  {
    super(parama, parama1);
    this.qNY = parama;
    this.qOa = parama1;
    if (parama1 == null);
    while (true)
    {
      return;
      this.cNr = parama1.qJh;
      qOr.add(parama1.qJg);
      parama1.EK();
    }
  }

  private static long Yy(String paramString)
  {
    long l1 = 0L;
    long l2 = l1;
    if (paramString != null)
    {
      if (paramString.length() != 0)
        break label19;
      l2 = l1;
    }
    while (true)
    {
      return l2;
      try
      {
        label19: paramString = paramString.split("\\.");
        l2 = bo.getLong(paramString[0], 0L);
        long l3 = bo.getLong(paramString[1], 0L);
        long l4 = bo.getLong(paramString[2], 0L);
        long l5 = bo.getLong(paramString[3], 0L);
        l2 = l5 + (16777216L * l2 + 65536L * l3 + 256L * l4);
      }
      catch (Exception paramString)
      {
        l2 = l1;
      }
    }
  }

  private u a(b.b paramb, String paramString)
  {
    try
    {
      this.qOd = paramb.ip;
      this.gcI = paramb.gcI;
      this.qOh = bo.anU();
      paramb = com.tencent.mm.network.b.a(this.qOa.url, paramb);
      paramb.setRequestMethod("GET");
      paramb.setRequestProperty("referer", paramString);
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsDownloadHttpKeep"), 0) > 0)
      {
        ab.i("MicroMsg.SnsCdnDownloadBase", "header Connection close ");
        paramb.setRequestProperty("Connection", "close");
      }
      paramb.setConnectTimeout(25000);
      paramb.setReadTimeout(25000);
      paramb = b(paramb);
      this.qOs = paramb.getHeaderFields();
      paramString = (List)this.qOs.get("X-ClientIp");
      if ((paramString != null) && (paramString.size() > 0))
        this.qOc = ((String)paramString.get(0));
      paramString = (List)this.qOs.get("X-ServerIp");
      if ((paramString != null) && (paramString.size() > 0))
        this.qOb = ((String)paramString.get(0));
      paramString = (List)this.qOs.get("X-ErrNo");
      if ((paramString != null) && (paramString.size() > 0))
        this.qOe = bo.ank((String)paramString.get(0));
      paramString = (List)this.qOs.get("X-RtFlag");
      if ((paramString != null) && (paramString.size() > 0))
        this.qOf = bo.ank((String)paramString.get(0));
      try
      {
        this.retCode = paramb.getResponseCode();
        this.host = paramb.url.getHost();
        if ((this.retCode != 200) && (this.retCode != 206))
        {
          ac(paramb.getHeaderFields());
          if (this.qOa.qNU)
          {
            if ((this.retCode >= 400) && (this.retCode < 500))
              h.pYm.a(22L, 78L, 1L, true);
            while (true)
            {
              if (this.qOa.qNT)
                h.pYm.a(150L, 14L, 1L, true);
              paramb = new java/lang/StringBuilder;
              paramb.<init>("GprsSetting.checkHttpConnection failed! mediaId : ");
              ab.e("MicroMsg.SnsCdnDownloadBase", this.qOa.cHr + " " + this.qOa.url + " " + this.retCode);
              bW(false);
              paramb = null;
              return paramb;
              if ((this.retCode >= 500) && (this.retCode < 600))
                h.pYm.a(22L, 79L, 1L, true);
            }
          }
        }
      }
      catch (SocketTimeoutException paramb)
      {
        while (true)
        {
          this.retCode = 1;
          bW(false);
          paramb = paramb.getMessage();
          if (!this.qOa.qNU)
            break label796;
          h.pYm.a(22L, 77L, 1L, true);
          if (this.qOa.qNT)
            h.pYm.a(150L, 14L, 1L, true);
          paramString = new java/lang/StringBuilder;
          paramString.<init>("GprsSetting.checkHttpConnection failed! socket timeout mediaId : ");
          ab.e("MicroMsg.SnsCdnDownloadBase", this.qOa.cHr + " " + this.qOa.url + " msg:" + paramb);
          paramb = null;
          continue;
          if ((this.retCode < 400) || (this.retCode >= 500))
            break;
          h.pYm.a(22L, 56L, 1L, true);
        }
      }
      catch (Exception paramb)
      {
        while (true)
        {
          bW(false);
          paramb = paramb.getMessage();
          if (this.qOa.qNT)
            h.pYm.a(150L, 14L, 1L, true);
          paramString = new java/lang/StringBuilder;
          paramString.<init>("GprsSetting.checkHttpConnection failed! mediaId : ");
          ab.e("MicroMsg.SnsCdnDownloadBase", this.qOa.cHr + " " + this.qOa.url + " msg:" + paramb);
          paramb = null;
          continue;
          if ((this.retCode >= 500) && (this.retCode < 600))
          {
            h.pYm.a(22L, 57L, 1L, true);
            continue;
            label796: h.pYm.a(22L, 55L, 1L, true);
          }
        }
      }
    }
    catch (Exception paramb)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramb, "connect fail : " + paramb.getMessage(), new Object[0]);
        this.retCode = 2;
        bW(false);
        paramb = null;
        continue;
        ac(paramb.getHeaderFields());
        if (!d(paramb))
        {
          h.pYm.a(22L, 62L, 1L, true);
          paramb = new java/lang/StringBuilder;
          paramb.<init>("checkHttpConnection failed! nocache mediaId : ");
          ab.e("MicroMsg.SnsCdnDownloadBase", this.qOa.cHr);
          bW(false);
          paramb = null;
        }
        else
        {
          this.qOh = bo.gb(this.qOh);
          paramString = (List)this.qOs.get("Content-Length");
          if ((paramString != null) && (paramString.size() > 0))
            this.qOq = bo.ank((String)paramString.get(0));
          ab.i("MicroMsg.SnsCdnDownloadBase", "ip: url %s client ip %s server ip %s svrlen %d %d", new Object[] { this.qOa.url, this.qOc, this.qOb, Integer.valueOf(this.qOq), Integer.valueOf(this.qOe) });
        }
      }
    }
  }

  protected static boolean a(int paramInt, long paramLong, PString paramPString)
  {
    boolean bool = false;
    long l = System.currentTimeMillis();
    if (l - paramLong < 1000L);
    while (true)
    {
      return bool;
      paramPString.value += String.format("ts=%d&size=%d|", new Object[] { Long.valueOf(l / 1000L), Integer.valueOf(paramInt) });
      bool = true;
    }
  }

  private static void ac(Map<String, List<String>> paramMap)
  {
    if (paramMap == null);
    while (true)
    {
      return;
      StringBuffer localStringBuffer;
      while (true)
      {
        try
        {
          localStringBuffer = new java/lang/StringBuffer;
          localStringBuffer.<init>();
          Iterator localIterator = paramMap.keySet().iterator();
          if (!localIterator.hasNext())
            break label168;
          Object localObject1 = (String)localIterator.next();
          Object localObject2 = (List)paramMap.get(localObject1);
          if (localObject2 == null)
            continue;
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localStringBuffer.append((String)localObject1 + ":");
          localObject3 = ((List)localObject2).iterator();
          if (!((Iterator)localObject3).hasNext())
            break label157;
          localObject2 = (String)((Iterator)localObject3).next();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localStringBuffer.append((String)localObject2 + "|");
          continue;
        }
        catch (Exception paramMap)
        {
        }
        break;
        label157: localStringBuffer.append(";");
      }
      label168: ab.i("MicroMsg.SnsCdnDownloadBase", "header respone %s", new Object[] { localStringBuffer.toString() });
    }
  }

  private void bW(boolean paramBoolean)
  {
    int i;
    label113: int j;
    int k;
    long l2;
    Object localObject;
    String str3;
    label179: int m;
    if ((this.qOa != null) && (this.qOa.qNU))
      if (!paramBoolean)
      {
        h.pYm.a(22L, 74L, 1L, true);
        h.pYm.a(22L, 73L, 1L, true);
        if ((this.qOa != null) && (this.qOa.qNT) && (!paramBoolean) && (!i.b(this.qNZ)))
          h.pYm.a(150L, 66L, 1L, true);
        this.ezu = this.qOt;
        if (!at.isWifi(ah.getContext()))
          break label738;
        i = 1;
        j = at.getStrength(ah.getContext());
        k = this.gcI;
        long l1 = this.dnsCostTime;
        l2 = this.qOh;
        l3 = this.qOi;
        long l4 = this.qOg;
        String str1 = this.qOb;
        localObject = this.qOd;
        String str2 = this.qOc;
        if (this.qOa != null)
          break label743;
        str3 = "";
        ab.v("MicroMsg.SnsCdnDownloadBase", "report dns:%d wifi:%d signal:%d [%d,%d,%d]%d serverIp:[%s,%s] xclientip:%s url[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), str1, localObject, str2, str3 });
        m = at.getNetType(ah.getContext());
        k = 0;
        if (this.qOa != null)
        {
          if (this.qOa.qNV != 4)
            break label755;
          k = 1;
        }
        label303: ab.i("MicroMsg.SnsCdnDownloadBase", "retCode :%d totalSize: %d net: %d downloadType %d xErrorNo %d", new Object[] { Integer.valueOf(this.retCode), Integer.valueOf(this.ezu), Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(this.qOe) });
        localObject = h.pYm;
        if (this.qOa != null)
          break label761;
        str3 = "";
        label377: l2 = Yy(this.qOd);
        if (!paramBoolean)
          break label773;
      }
    label773: for (long l3 = this.qOg; ; l3 = 0L)
    {
      ((h)localObject).e(10736, new Object[] { str3, Long.valueOf(l2), Long.valueOf(l3), "", Integer.valueOf(i), Long.valueOf(this.dnsCostTime), Long.valueOf(this.qOh), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(this.qOi), Long.valueOf(Yy(this.qOc)), Long.valueOf(Yy(this.qOb)), Integer.valueOf(this.gcI), Integer.valueOf(j), Integer.valueOf(this.retCode), Integer.valueOf(this.ezu), Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(this.qOe) });
      boolean bool = at.isConnected(ah.getContext());
      ab.d("MicroMsg.SnsCdnDownloadBase", "isConntected  " + bool + " urlIp: " + this.qOk);
      if ((!paramBoolean) && (!bo.isNullOrNil(this.qOk)) && (bool))
        com.tencent.mm.network.b.reportFailIp(this.qOk);
      cot();
      return;
      h.pYm.a(22L, 75L, this.qOg, true);
      break;
      if (!paramBoolean)
        h.pYm.a(22L, 52L, 1L, true);
      while (true)
      {
        h.pYm.a(22L, 51L, 1L, true);
        break;
        h.pYm.a(22L, 53L, this.qOg, true);
      }
      label738: i = 0;
      break label113;
      label743: str3 = this.qOa.url;
      break label179;
      label755: k = 0;
      break label303;
      label761: str3 = this.qOa.url;
      break label377;
    }
  }

  // ERROR //
  private int c(u paramu)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_2
    //   3: istore_3
    //   4: aload_0
    //   5: invokestatic 166	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   8: putfield 522	com/tencent/mm/plugin/sns/model/a/b:qOp	J
    //   11: aload_1
    //   12: invokevirtual 526	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   15: astore 4
    //   17: aload_0
    //   18: invokestatic 166	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   21: putfield 87	com/tencent/mm/plugin/sns/model/a/b:qOi	J
    //   24: aload_0
    //   25: aload 4
    //   27: invokevirtual 530	com/tencent/mm/plugin/sns/model/a/b:E	(Ljava/io/InputStream;)Z
    //   30: istore 5
    //   32: aload 4
    //   34: invokevirtual 534	java/io/InputStream:close	()V
    //   37: ldc 208
    //   39: ldc_w 536
    //   42: iload 5
    //   44: invokestatic 539	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   47: invokevirtual 542	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   50: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: iload 5
    //   55: ifne +28 -> 83
    //   58: aload_0
    //   59: iconst_0
    //   60: invokespecial 330	com/tencent/mm/plugin/sns/model/a/b:bW	(Z)V
    //   63: iload_3
    //   64: istore 6
    //   66: aload_1
    //   67: ifnull +13 -> 80
    //   70: aload_1
    //   71: getfield 546	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   74: invokevirtual 551	java/net/HttpURLConnection:disconnect	()V
    //   77: iload_3
    //   78: istore 6
    //   80: iload 6
    //   82: ireturn
    //   83: aload_0
    //   84: aload_0
    //   85: getfield 87	com/tencent/mm/plugin/sns/model/a/b:qOi	J
    //   88: invokestatic 368	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   91: putfield 87	com/tencent/mm/plugin/sns/model/a/b:qOi	J
    //   94: aload_0
    //   95: aload_0
    //   96: getfield 89	com/tencent/mm/plugin/sns/model/a/b:qOj	J
    //   99: invokestatic 368	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   102: putfield 79	com/tencent/mm/plugin/sns/model/a/b:qOg	J
    //   105: aload_0
    //   106: invokevirtual 554	com/tencent/mm/plugin/sns/model/a/b:cor	()Z
    //   109: istore 5
    //   111: ldc 208
    //   113: ldc_w 556
    //   116: iload 5
    //   118: invokestatic 539	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   121: invokevirtual 542	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   124: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: iload 5
    //   129: ifne +33 -> 162
    //   132: aload_0
    //   133: iconst_3
    //   134: putfield 98	com/tencent/mm/plugin/sns/model/a/b:retCode	I
    //   137: aload_0
    //   138: iconst_0
    //   139: invokespecial 330	com/tencent/mm/plugin/sns/model/a/b:bW	(Z)V
    //   142: iload_3
    //   143: istore 6
    //   145: aload_1
    //   146: ifnull -66 -> 80
    //   149: aload_1
    //   150: getfield 546	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   153: invokevirtual 551	java/net/HttpURLConnection:disconnect	()V
    //   156: iload_3
    //   157: istore 6
    //   159: goto -79 -> 80
    //   162: aload_1
    //   163: ifnull +10 -> 173
    //   166: aload_1
    //   167: getfield 546	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   170: invokevirtual 551	java/net/HttpURLConnection:disconnect	()V
    //   173: aload_0
    //   174: iconst_1
    //   175: invokespecial 330	com/tencent/mm/plugin/sns/model/a/b:bW	(Z)V
    //   178: aload_0
    //   179: getfield 61	com/tencent/mm/plugin/sns/model/a/b:qOa	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   182: getfield 298	com/tencent/mm/plugin/sns/model/a/a:qNT	Z
    //   185: ifeq +146 -> 331
    //   188: iconst_3
    //   189: istore 6
    //   191: goto -111 -> 80
    //   194: astore_2
    //   195: aconst_null
    //   196: astore 4
    //   198: new 304	java/lang/StringBuilder
    //   201: astore 7
    //   203: aload 7
    //   205: ldc_w 558
    //   208: invokespecial 308	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   211: ldc 208
    //   213: aload_2
    //   214: aload 7
    //   216: aload_2
    //   217: invokevirtual 344	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   220: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 323	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: iconst_0
    //   227: anewarray 352	java/lang/Object
    //   230: invokestatic 356	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: aload_0
    //   234: iconst_4
    //   235: putfield 98	com/tencent/mm/plugin/sns/model/a/b:retCode	I
    //   238: aload_0
    //   239: iconst_0
    //   240: invokespecial 330	com/tencent/mm/plugin/sns/model/a/b:bW	(Z)V
    //   243: aload 4
    //   245: ifnull +8 -> 253
    //   248: aload 4
    //   250: invokevirtual 534	java/io/InputStream:close	()V
    //   253: iload_3
    //   254: istore 6
    //   256: aload_1
    //   257: ifnull -177 -> 80
    //   260: aload_1
    //   261: getfield 546	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   264: invokevirtual 551	java/net/HttpURLConnection:disconnect	()V
    //   267: iload_3
    //   268: istore 6
    //   270: goto -190 -> 80
    //   273: astore 4
    //   275: ldc 208
    //   277: aload 4
    //   279: ldc 65
    //   281: iconst_0
    //   282: anewarray 352	java/lang/Object
    //   285: invokestatic 356	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -35 -> 253
    //   291: astore 4
    //   293: aload_2
    //   294: ifnull +7 -> 301
    //   297: aload_2
    //   298: invokevirtual 534	java/io/InputStream:close	()V
    //   301: aload_1
    //   302: ifnull +10 -> 312
    //   305: aload_1
    //   306: getfield 546	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   309: invokevirtual 551	java/net/HttpURLConnection:disconnect	()V
    //   312: aload 4
    //   314: athrow
    //   315: astore_2
    //   316: ldc 208
    //   318: aload_2
    //   319: ldc 65
    //   321: iconst_0
    //   322: anewarray 352	java/lang/Object
    //   325: invokestatic 356	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   328: goto -27 -> 301
    //   331: iconst_1
    //   332: istore 6
    //   334: goto -254 -> 80
    //   337: astore 7
    //   339: aload 4
    //   341: astore_2
    //   342: aload 7
    //   344: astore 4
    //   346: goto -53 -> 293
    //   349: astore 7
    //   351: aload 4
    //   353: astore_2
    //   354: aload 7
    //   356: astore 4
    //   358: goto -65 -> 293
    //   361: astore_2
    //   362: goto -164 -> 198
    //
    // Exception table:
    //   from	to	target	type
    //   4	17	194	java/lang/Exception
    //   37	53	194	java/lang/Exception
    //   58	63	194	java/lang/Exception
    //   83	127	194	java/lang/Exception
    //   132	142	194	java/lang/Exception
    //   248	253	273	java/io/IOException
    //   4	17	291	finally
    //   37	53	291	finally
    //   58	63	291	finally
    //   83	127	291	finally
    //   132	142	291	finally
    //   297	301	315	java/io/IOException
    //   17	37	337	finally
    //   198	243	349	finally
    //   17	37	361	java/lang/Exception
  }

  private void cot()
  {
    ab.i("MicroMsg.SnsCdnDownloadBase", "ready to report logbuffer(13346) packageRecordList:%s", new Object[] { this.qOl.value });
    int i = cos();
    String str1 = "";
    String str2;
    label61: Object localObject;
    int j;
    switch (i)
    {
    default:
      return;
    case 1:
      str2 = "100105";
      localObject = com.tencent.mm.model.c.c.abi().ll(str2);
      if (((com.tencent.mm.storage.c)localObject).isValid())
      {
        j = bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("needUploadData"), 1);
        str1 = ((com.tencent.mm.storage.c)localObject).field_expId;
      }
      break;
    case 2:
    case 3:
    }
    while (j != 0)
    {
      com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
      locald.l("20ImgSize", this.qOt + ",");
      localObject = new StringBuilder();
      if (at.isWifi(ah.getContext()));
      for (j = 1; ; j = 0)
      {
        locald.l("21NetType", j + ",");
        locald.l("22DelayTime", this.qOg - this.qOh + ",");
        locald.l("23RetCode", this.retCode + ",");
        locald.l("24DnsCostTime", this.dnsCostTime + ",");
        locald.l("25ConnectCostTime", this.qOh + ",");
        locald.l("26SendCostTime", ",");
        locald.l("27WaitResponseCostTime", this.qOo + ",");
        locald.l("28ReceiveCostTime", this.qOi + ",");
        locald.l("29ClientAddrIP", this.qOc + ",");
        locald.l("30ServerAddrIP", this.qOd + ",");
        locald.l("31dnstype", this.gcI + ",");
        locald.l("32signal", at.getStrength(ah.getContext()) + ",");
        locald.l("33host", this.host + ",");
        locald.l("34MediaType", i + ",");
        locald.l("35X_Errno", this.qOe + ",");
        locald.l("36MaxPackageSize", this.qOm + ",");
        locald.l("37MaxPackageTimeStamp", this.qOn + ",");
        locald.l("38PackageRecordList", this.qOl.value + ",");
        locald.l("39ExpLayerId", str2 + ",");
        locald.l("40ExpId", str1 + ",");
        locald.l("41FeedId", ",");
        ab.i("MicroMsg.SnsCdnDownloadBase", "report logbuffer(13480 TLMediaFielDownloadRecord): " + locald.Fk());
        h.pYm.e(13480, new Object[] { locald });
        if (this.retCode == 200)
          break;
        h.pYm.e(14071, new Object[] { locald });
        break;
        str2 = "100106";
        break label61;
        str2 = "100100";
        break label61;
      }
      j = 0;
    }
  }

  private static boolean d(u paramu)
  {
    try
    {
      paramu = (List)paramu.getHeaderFields().get("cache-control");
      if ((paramu == null) || (paramu.size() == 0))
        bool = true;
      while (true)
      {
        return bool;
        if ((bo.isNullOrNil(paramu.toString())) || (!paramu.toString().contains("no-cache")))
        {
          bool = true;
        }
        else
        {
          bool = paramu.toString().contains("no-cache");
          if (bool)
            bool = false;
          else
            bool = false;
        }
      }
    }
    catch (Exception paramu)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramu, "", new Object[0]);
        boolean bool = false;
      }
    }
  }

  public abstract boolean E(InputStream paramInputStream);

  public String Yx(String paramString)
  {
    return paramString;
  }

  public final boolean a(az paramaz, String paramString1, long paramLong, String paramString2)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramString1 == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      try
      {
        URL localURL = new java/net/URL;
        localURL.<init>(paramString1);
        bool2 = bool1;
        if (paramaz != null)
        {
          bool2 = bool1;
          if (paramString2 != null)
          {
            bool2 = bool1;
            if (paramString2.indexOf(localURL.getHost()) != -1)
            {
              bool2 = bool1;
              if (paramaz.oyB != 0)
              {
                long l = bo.fp(paramaz.oyB);
                bool2 = bool1;
                if (l > paramLong)
                  bool2 = true;
              }
            }
          }
        }
      }
      catch (Exception paramaz)
      {
        ab.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", new Object[] { paramaz.getMessage() });
        bool2 = bool1;
      }
    }
  }

  public u b(u paramu)
  {
    return paramu;
  }

  public final com.tencent.mm.sdk.g.b.a cin()
  {
    return af.cnp();
  }

  public boolean coq()
  {
    return true;
  }

  public abstract boolean cor();

  protected abstract int cos();

  public final Integer cou()
  {
    com.tencent.mm.kernel.g.RQ();
    Object localObject1;
    if ((!com.tencent.mm.kernel.g.RP().isSDCardAvailable()) || (this.qOa == null))
    {
      bW(false);
      localObject1 = Integer.valueOf(2);
    }
    while (true)
    {
      return localObject1;
      if (coq())
      {
        localObject1 = this.qOa.qJc + this.qOa.cop();
        ab.i("MicroMsg.SnsCdnDownloadBase", "[tomys] delete img: %s", new Object[] { localObject1 });
        com.tencent.mm.vfs.e.deleteFile((String)localObject1);
      }
      long l1 = System.currentTimeMillis();
      this.qOj = System.currentTimeMillis();
      ab.d("MicroMsg.SnsCdnDownloadBase", "to downloadBitmap " + this.qOa.cHr + " " + this.qOa.qNT + " type " + this.qOa.qNV);
      com.tencent.mm.vfs.e.tf(this.qOa.getPath());
      Object localObject2 = this.qOa.qNW;
      localObject1 = "";
      Object localObject3;
      label198: String str2;
      label318: label333: boolean bool;
      if (localObject2 == null)
      {
        localObject1 = "";
        localObject3 = az.xYU;
        localObject2 = localObject1;
        if (!bo.isNullOrNil((String)localObject1))
          localObject2 = "&scene=".concat(String.valueOf(localObject1));
        str2 = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo), p.getString(af.cnl()), Integer.valueOf(at.getNetTypeForStat(ah.getContext())), Integer.valueOf(at.getStrength(ah.getContext())), localObject2 });
        this.qOa.url = Yx(this.qOa.url);
        this.dnsCostTime = bo.anU();
        if (!this.qOa.qNU)
          break label911;
        localObject1 = "SnsSightDomainList";
        if (!this.qOa.qNU)
          break label918;
        localObject2 = "SnsSightMainStandbyIpSwitchTime";
        localObject1 = com.tencent.mm.m.g.Nu().getValue((String)localObject1);
        long l2 = com.tencent.mm.m.g.Nu().getInt((String)localObject2, 0);
        ab.i("MicroMsg.SnsCdnDownloadBase", "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s", new Object[] { Boolean.valueOf(this.qOa.qNU), Boolean.valueOf(this.qOa.qNT), localObject1, Long.valueOf(l2) });
        long l3 = l2;
        if (l2 <= 0L)
          l3 = 259200L;
        bool = a((az)localObject3, this.qOa.url, l3, (String)localObject1);
        localObject2 = new b.b(this.qOa.url, bool);
        this.dnsCostTime = bo.gb(this.dnsCostTime);
      }
      try
      {
        if (bo.isNullOrNil(((b.b)localObject2).ip));
        for (localObject1 = InetAddress.getByName(((b.b)localObject2).host).getHostAddress(); ; localObject1 = ((b.b)localObject2).ip)
        {
          ab.i("MicroMsg.SnsCdnDownloadBase", "checkAndGetHttpConn[%s] [%s] [id:%s] host ip:%d[%s] [%s] download type[%d] isDcIp[%s] fromScene[%s]", new Object[] { str2, this.qOa.url, this.qOa.cHr, Integer.valueOf(((b.b)localObject2).gcI), localObject1, this.qOa.url, Integer.valueOf(this.qOa.qNV), Boolean.valueOf(bool), ((az)localObject3).toString() });
          this.qOf = 1;
          localObject3 = a((b.b)localObject2, str2);
          localObject1 = ((b.b)localObject2).ip;
          if (localObject3 == null)
            break label943;
          bool = true;
          ab.i("MicroMsg.SnsCdnDownloadBase", "[sns ip strategy]connect ip:%s, result:%b, canRetry(X-RtFlag):%d, isDC(cold ip):%b, url:%s", new Object[] { localObject1, Boolean.valueOf(bool), Integer.valueOf(this.qOf), Boolean.valueOf(((b.b)localObject2).gcL), ((b.b)localObject2).gcK });
          int i = 2;
          if (localObject3 != null)
            i = c((u)localObject3);
          ab.i("MicroMsg.SnsCdnDownloadBase", "DOWN FIN time:%d down:%d mediaId:%s url[%s], size %d", new Object[] { Long.valueOf(bo.gb(l1)), Long.valueOf(this.qOg), this.qOa.cHr, this.qOa.url, Integer.valueOf(this.qOt) });
          localObject1 = Integer.valueOf(i);
          break;
          if (((az)localObject2).equals(az.xYN))
          {
            localObject1 = "album_friend";
            localObject3 = localObject2;
            break label198;
          }
          if (((az)localObject2).equals(az.xYO))
          {
            localObject1 = "album_self";
            localObject3 = localObject2;
            break label198;
          }
          if (((az)localObject2).equals(az.xYP))
          {
            localObject1 = "album_stranger";
            localObject3 = localObject2;
            break label198;
          }
          if (((az)localObject2).equals(az.xYQ))
          {
            localObject1 = "profile_friend";
            localObject3 = localObject2;
            break label198;
          }
          if (((az)localObject2).equals(az.xYR))
          {
            localObject1 = "profile_stranger";
            localObject3 = localObject2;
            break label198;
          }
          if (((az)localObject2).equals(az.xYS))
          {
            localObject1 = "comment";
            localObject3 = localObject2;
            break label198;
          }
          localObject3 = localObject2;
          if (!((az)localObject2).equals(az.xYM))
            break label198;
          localObject1 = "timeline";
          localObject3 = localObject2;
          break label198;
          label911: localObject1 = "SnsAlbumDomainList";
          break label318;
          label918: localObject2 = "SnsAlbumMainStandbyIpSwitchTime";
          break label333;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          String str1 = "-";
          continue;
          label943: bool = false;
        }
      }
    }
  }

  public final void cov()
  {
    if (af.cnn())
      return;
    System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if (this.qOa.qFJ.qFQ == 4)
    {
      ab.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
      localObject1 = i.e(this.cNr);
      localObject2 = i.g(this.cNr);
      this.qNZ = com.tencent.mm.plugin.sns.lucky.a.a.fV(this.qOa.getPath() + (String)localObject1, this.qOa.getPath() + (String)localObject2);
      af.cnC().a(this.qOa.cHr, this.qNZ, this.qOa.qFJ.qFQ);
      label132: localObject2 = null;
      if (this.qOa.qFJ.qFQ != 0)
        break label593;
      localObject2 = "0-" + this.qOa.qFJ.nQB;
    }
    while (true)
    {
      af.cnC().XM((String)localObject2);
      break;
      if (this.qOa.qFJ.qFQ == 5)
      {
        ab.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
        localObject2 = i.e(this.cNr);
        localObject1 = i.h(this.cNr);
        this.qNZ = com.tencent.mm.plugin.sns.lucky.a.a.fV(this.qOa.getPath() + (String)localObject2, this.qOa.getPath() + (String)localObject1);
        af.cnC().a(this.qOa.cHr, this.qNZ, this.qOa.qFJ.qFQ);
        break label132;
      }
      if (this.qOa.qFJ.list.size() <= 1)
      {
        af.cnC().a(this.qOa.cHr, this.qNZ, this.qOa.qFJ.qFQ);
        break label132;
      }
      af.cnC().a(this.qOa.cHr, this.qNZ, 0);
      localObject2 = new LinkedList();
      for (int i = 0; ; i++)
      {
        if ((i >= this.qOa.qFJ.list.size()) || (i >= 4))
          break label501;
        bau localbau = (bau)this.qOa.qFJ.list.get(i);
        localObject1 = af.cnC().XN(localbau.Id);
        if (!i.b((n)localObject1))
          break;
        ((List)localObject2).add(localObject1);
        ab.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + localObject1 + " " + localbau.Id);
      }
      label501: this.qNZ = n.w(i.p((List)localObject2, af.cnN()));
      ab.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + this.qOa.qFJ.nQB + " " + this.qNZ);
      af.cnC().a(this.qOa.qFJ.nQB, this.qNZ, this.qOa.qFJ.qFQ);
      break label132;
      label593: if (this.qOa.qFJ.qFQ == 1)
        localObject2 = "1-" + this.qOa.qFJ.nQB;
      else if (this.qOa.qFJ.qFQ == 4)
        localObject2 = "4-" + this.qOa.qFJ.nQB;
      else if (this.qOa.qFJ.qFQ == 5)
        localObject2 = "5-" + this.qOa.qFJ.nQB;
    }
  }

  public final void onPostExecute(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    if (this.qOa == null)
      return;
    ab.i("MicroMsg.SnsCdnDownloadBase", "download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d", new Object[] { paramInteger, this.qOa.url, this.qOa.cHr, Integer.valueOf(this.ezu), Integer.valueOf(qOr.size()) });
    qOr.remove(this.qOa.qJg);
    if ((this.qOa.qNT) && (paramInteger.intValue() != 2))
    {
      av.Yj(this.qOa.cHr);
      cov();
    }
    while (true)
    {
      this.qNY.a(paramInteger.intValue(), this.cNr, this.qOa.qNV, this.qOa.qNT, this.qOa.qJg, this.ezu, -1, true);
      break;
      if ((!this.qOa.qNT) && (this.qOa.qNV == 4))
      {
        String str = this.qOa.getPath() + i.j(this.cNr);
        af.cnC().fX(this.qOa.cHr, str);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.b
 * JD-Core Version:    0.6.2
 */