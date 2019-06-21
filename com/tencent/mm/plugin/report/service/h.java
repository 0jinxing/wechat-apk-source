package com.tencent.mm.plugin.report.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.ag;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

public enum h
  implements com.tencent.mm.plugin.report.d
{
  private long pYn;
  private int pYo;
  private HashMap<String, Long> pYp;
  private int pYq;
  private int pYr;
  private long pYs;
  private volatile boolean pYt;
  private int uin;

  static
  {
    AppMethodBeat.i(72793);
    pYm = new h("INSTANCE");
    pYu = new h[] { pYm };
    AppMethodBeat.o(72793);
  }

  private h()
  {
    AppMethodBeat.i(72763);
    this.pYn = 0L;
    if (ah.bqo())
    {
      com.tencent.mm.kernel.g.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(72751);
          h.a(h.this);
          AppMethodBeat.o(72751);
        }
      });
      localObject = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(72752);
          h.b(h.this);
          AppMethodBeat.o(72752);
        }
      };
      com.tencent.mm.sdk.b.a.xxA.b(new com.tencent.mm.sdk.b.c()
      {
      });
      com.tencent.mm.kernel.g.Rg().a(701, new com.tencent.mm.ai.f()
      {
        public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
        {
          AppMethodBeat.i(72755);
          if (paramAnonymousInt1 != 0)
            AppMethodBeat.o(72755);
          while (true)
          {
            return;
            com.tencent.mm.kernel.g.RS().m(this.pYw, 5000L);
            AppMethodBeat.o(72755);
          }
        }
      });
    }
    AppMethodBeat.o(72763);
  }

  public static Object a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(72764);
    paramArrayOfInt = com.tencent.mm.plugin.report.e.a(paramInt1, paramArrayOfInt, paramInt2, paramInt3);
    AppMethodBeat.o(72764);
    return paramArrayOfInt;
  }

  public static void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(72767);
    KVReportDataInfo localKVReportDataInfo = new KVReportDataInfo();
    localKVReportDataInfo.pXX = paramInt1;
    localKVReportDataInfo.value = paramString;
    localKVReportDataInfo.ctk = paramInt2;
    localKVReportDataInfo.pXA = false;
    localKVReportDataInfo.pXY = paramBoolean1;
    localKVReportDataInfo.pXZ = paramBoolean2;
    KVCommCrossProcessReceiver.a(localKVReportDataInfo);
    AppMethodBeat.o(72767);
  }

  private static void a(int paramInt, List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(72776);
    paramList = cT(paramList);
    if (ah.bqo())
    {
      e.a(paramInt, paramList, paramBoolean, false, false);
      AppMethodBeat.o(72776);
    }
    while (true)
    {
      return;
      b(paramInt, paramList, paramBoolean, false);
      AppMethodBeat.o(72776);
    }
  }

  private void a(final String paramString, final Callable<JSONArray> paramCallable)
  {
    AppMethodBeat.i(72788);
    final long l = System.currentTimeMillis();
    if (!al(paramString, l))
      AppMethodBeat.o(72788);
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.post(new Runnable()
      {
        public final void run()
        {
          Object localObject1 = null;
          AppMethodBeat.i(72758);
          int i;
          if ((ah.bqo()) && (com.tencent.mm.kernel.g.RK()))
          {
            com.tencent.mm.kernel.g.RN();
            i = com.tencent.mm.kernel.a.QF();
            if (com.tencent.mm.kernel.g.RP().Ry() != null);
          }
          try
          {
            while (true)
            {
              localObject2 = ah.getContext().getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
              localObject3 = (JSONArray)paramCallable.call();
              int j = ((JSONArray)localObject3).length();
              for (k = 0; k < j; k++)
              {
                localObject4 = ((JSONArray)localObject3).getJSONObject(k);
                ((JSONObject)localObject4).put("tag", paramString);
                ((JSONObject)localObject4).put("uin", i);
              }
              localObject1 = com.tencent.mm.model.r.Yz();
              continue;
              localObject1 = null;
              i = 0;
            }
            Object localObject4 = new org/json/JSONObject;
            ((JSONObject)localObject4).<init>();
            Object localObject5 = new org/json/JSONObject;
            ((JSONObject)localObject5).<init>();
            Object localObject3 = ((JSONObject)localObject4).put("head", ((JSONObject)localObject5).put("protocol_ver", 1).put("phone", com.tencent.mm.protocal.d.DEVICE_NAME).put("os_ver", com.tencent.mm.protocal.d.eSg).put("report_time", l).put("revision", bo.nullAsNil(com.tencent.mm.sdk.platformtools.f.REV))).put("items", localObject3).toString().getBytes();
            int k = localObject3.length;
            localObject4 = com.tencent.mm.a.g.x(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo), Integer.valueOf(k) }).getBytes()).toLowerCase();
            localObject5 = com.tencent.mm.a.r.compress((byte[])localObject3);
            localObject3 = new com/tencent/mm/pointers/PByteArray;
            ((PByteArray)localObject3).<init>();
            com.tencent.mm.a.c.a((PByteArray)localObject3, (byte[])localObject5, ((String)localObject4).getBytes());
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>(256);
            Object localObject2 = ((StringBuilder)localObject5).append("http://").append((String)localObject2).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(com.tencent.mm.protocal.d.vxo)).append("&devicetype=").append(com.tencent.mm.protocal.d.eSg).append("&filelength=").append(k).append("&sum=").append((String)localObject4).append("&reporttype=1&NewReportType=110");
            if ((localObject1 != null) && (((String)localObject1).length() != 0))
              ((StringBuilder)localObject2).append("&username=").append((String)localObject1);
            if (i != 0)
              ((StringBuilder)localObject2).append("&uin=").append(i);
            localObject4 = ((StringBuilder)localObject2).toString();
            localObject2 = new org/apache/http/impl/client/DefaultHttpClient;
            ((DefaultHttpClient)localObject2).<init>();
            localObject1 = new org/apache/http/client/methods/HttpPost;
            ((HttpPost)localObject1).<init>((String)localObject4);
            localObject4 = new org/apache/http/entity/ByteArrayEntity;
            ((ByteArrayEntity)localObject4).<init>(((PByteArray)localObject3).value);
            ((ByteArrayEntity)localObject4).setContentType("binary/octet-stream");
            ((HttpPost)localObject1).setEntity((HttpEntity)localObject4);
            ab.i("MicroMsg.cLog", "POST returned: ".concat(String.valueOf(bo.convertStreamToString(((HttpClient)localObject2).execute((HttpUriRequest)localObject1).getEntity().getContent()))));
            AppMethodBeat.o(72758);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.ReportManagerKvCheck", localException, "Failed to upload cLog.", new Object[0]);
              AppMethodBeat.o(72758);
            }
          }
        }
      }
      , "ReportManager_cLog");
      AppMethodBeat.o(72788);
    }
  }

  private boolean al(String paramString, long paramLong)
  {
    AppMethodBeat.i(72790);
    boolean bool;
    if (bp.dpL())
    {
      ab.d("MicroMsg.cLog", "[%s] Sampling hit: (debug)", new Object[] { paramString });
      bool = true;
      AppMethodBeat.o(72790);
    }
    while (true)
    {
      return bool;
      Long localLong;
      if (this.pYp != null)
      {
        localLong = (Long)this.pYp.get(paramString);
        label60: if (localLong == null)
          break label337;
        localObject = com.tencent.mm.a.g.y((paramString + this.uin + paramLong).getBytes());
        if ((localObject == null) || (localObject.length != 16))
          break label337;
        paramLong = localObject[0] + localObject[4] + localObject[8] + localObject[12];
        long l1 = localObject[1] + localObject[5] + localObject[9] + localObject[13];
        long l2 = localObject[2] + localObject[6] + localObject[10] + localObject[14];
        int i = localObject[3];
        int j = localObject[7];
        int k = localObject[11];
        paramLong = paramLong & 0xFF | (l1 & 0xFF) << 8 | (l2 & 0xFF) << 16 | (localObject[15] + (i + j + k) & 0xFF) << 24;
        if (paramLong >= localLong.longValue())
          break label323;
        bool = true;
        label265: if (!bool)
          break label329;
      }
      label323: label329: for (Object localObject = "hit"; ; localObject = "miss")
      {
        ab.d("MicroMsg.cLog", "[%s] Sampling %s: 0x%08x / 0x%08x", new Object[] { paramString, localObject, Long.valueOf(paramLong), localLong });
        AppMethodBeat.o(72790);
        break;
        localLong = null;
        break label60;
        bool = false;
        break label265;
      }
      label337: ab.d("MicroMsg.cLog", "[%s] Sampling hit: (default)", new Object[] { paramString });
      bool = true;
      AppMethodBeat.o(72790);
    }
  }

  public static void b(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(72768);
    KVReportDataInfo localKVReportDataInfo = new KVReportDataInfo();
    localKVReportDataInfo.pXX = paramInt;
    localKVReportDataInfo.value = paramString;
    localKVReportDataInfo.ctk = 0L;
    localKVReportDataInfo.pXA = false;
    localKVReportDataInfo.pXY = paramBoolean1;
    localKVReportDataInfo.pXZ = paramBoolean2;
    KVCommCrossProcessReceiver.a(localKVReportDataInfo);
    AppMethodBeat.o(72768);
  }

  private static String cT(List<String> paramList)
  {
    AppMethodBeat.i(72766);
    if ((paramList == null) || (paramList.isEmpty()))
      ab.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
    StringBuilder localStringBuilder;
    for (paramList = ""; ; paramList = localStringBuilder.toString())
    {
      AppMethodBeat.o(72766);
      return paramList;
      localStringBuilder = new StringBuilder();
      int i = paramList.size() - 1;
      for (int j = 0; j < i; j++)
        localStringBuilder.append((String)paramList.get(j)).append(',');
      localStringBuilder.append((String)paramList.get(i));
    }
  }

  public static void cgt()
  {
    AppMethodBeat.i(72784);
    if (ah.bqo())
    {
      BaseEvent.onSingalCrash(0);
      AppMethodBeat.o(72784);
    }
    while (true)
    {
      return;
      KVCommCrossProcessReceiver.cgn();
      AppMethodBeat.o(72784);
    }
  }

  public static void g(int paramInt, List<String> paramList)
  {
    AppMethodBeat.i(72775);
    if (com.tencent.mm.plugin.report.a.c.pXd)
    {
      a(paramInt, paramList, com.tencent.mm.plugin.report.a.c.pXe);
      AppMethodBeat.o(72775);
    }
    while (true)
    {
      return;
      a(paramInt, paramList, false);
      AppMethodBeat.o(72775);
    }
  }

  private static void j(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(72769);
    StIDKeyDataInfo localStIDKeyDataInfo = new StIDKeyDataInfo();
    localStIDKeyDataInfo.lhy = paramLong1;
    localStIDKeyDataInfo.key = paramLong2;
    localStIDKeyDataInfo.value = paramLong3;
    localStIDKeyDataInfo.pXA = false;
    KVCommCrossProcessReceiver.a(localStIDKeyDataInfo);
    AppMethodBeat.o(72769);
  }

  public static String s(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72765);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
      ab.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
    StringBuilder localStringBuilder;
    for (paramArrayOfObject = ""; ; paramArrayOfObject = localStringBuilder.toString())
    {
      AppMethodBeat.o(72765);
      return paramArrayOfObject;
      localStringBuilder = new StringBuilder();
      int i = paramArrayOfObject.length - 1;
      for (int j = 0; j < i; j++)
        localStringBuilder.append(String.valueOf(paramArrayOfObject[j]).replace(',', ' ')).append(',');
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i]));
    }
  }

  public final void X(int paramInt, String paramString)
  {
    AppMethodBeat.i(72770);
    if (com.tencent.mm.plugin.report.a.c.pXd)
    {
      boolean bool = com.tencent.mm.plugin.report.a.c.pXe;
      a(paramInt, paramString, bool, bool);
      AppMethodBeat.o(72770);
    }
    while (true)
    {
      return;
      a(paramInt, paramString, false, false);
      AppMethodBeat.o(72770);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    AppMethodBeat.i(72781);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt3);
    localIDKey1.SetValue(paramInt5);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt2);
    localIDKey2.SetKey(paramInt4);
    localIDKey2.SetValue(paramInt6);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, paramBoolean);
    AppMethodBeat.o(72781);
  }

  public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(72771);
    if (ah.bqo())
      if (com.tencent.mm.plugin.report.a.c.pXd)
      {
        long l = paramInt;
        paramBoolean1 = com.tencent.mm.plugin.report.a.c.pXe;
        e.a(l, paramString, paramBoolean1, paramBoolean1, false);
        AppMethodBeat.o(72771);
      }
    while (true)
    {
      return;
      e.a(paramInt, paramString, paramBoolean1, false, false);
      AppMethodBeat.o(72771);
      continue;
      b(paramInt, paramString, paramBoolean1, false);
      AppMethodBeat.o(72771);
    }
  }

  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72773);
    paramArrayOfObject = s(paramArrayOfObject);
    if (b.dnO())
      ab.v("MicroMsg.ReportManagerKvCheck", "kvTypedStat id:%d [%b,%b] val:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean1), Boolean.FALSE, paramArrayOfObject });
    if (ah.bqo())
    {
      e.a(paramInt, paramArrayOfObject, paramBoolean1, false, false);
      AppMethodBeat.o(72773);
    }
    while (true)
    {
      return;
      b(paramInt, paramArrayOfObject, paramBoolean1, false);
      AppMethodBeat.o(72773);
    }
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    AppMethodBeat.i(72779);
    if ((paramLong1 < 0L) || (paramLong2 < 0L) || (paramLong3 <= 0L))
    {
      ab.e("MicroMsg.ReportManagerKvCheck", "ID %d, key %d, value %d <0", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3) });
      AppMethodBeat.o(72779);
    }
    while (true)
    {
      return;
      if (ah.bqo())
      {
        e.b(paramLong1, paramLong2, paramLong3, false);
        AppMethodBeat.o(72779);
      }
      else
      {
        j(paramLong1, paramLong2, paramLong3);
        AppMethodBeat.o(72779);
      }
    }
  }

  public final void ag(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(72783);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt2);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt1);
    localIDKey2.SetKey(paramInt3);
    localIDKey2.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, false);
    AppMethodBeat.o(72783);
  }

  public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(72780);
    if (paramArrayList == null)
    {
      ab.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat lstIdKeyDataInfos == null return");
      AppMethodBeat.o(72780);
    }
    while (true)
    {
      return;
      Iterator localIterator = paramArrayList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          IDKey localIDKey = (IDKey)localIterator.next();
          if (localIDKey == null)
          {
            ab.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat info == null return");
            AppMethodBeat.o(72780);
            break;
          }
          if ((localIDKey.GetID() < 0L) || (localIDKey.GetKey() < 0L) || (localIDKey.GetValue() <= 0L))
          {
            ab.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat ID %d, key %d, value %d <0", new Object[] { Long.valueOf(localIDKey.GetID()), Long.valueOf(localIDKey.GetKey()), Long.valueOf(localIDKey.GetValue()) });
            AppMethodBeat.o(72780);
            break;
          }
        }
      if (ah.bqo())
      {
        e.d(paramArrayList, false);
        AppMethodBeat.o(72780);
      }
      else
      {
        KVCommCrossProcessReceiver.P(paramArrayList);
        AppMethodBeat.o(72780);
      }
    }
  }

  public final boolean c(int paramInt, com.tencent.mm.bt.a parama)
  {
    boolean bool1 = true;
    AppMethodBeat.i(72774);
    try
    {
      parama.getClass().getField("import_ds_").setInt(parama, 2147483647);
      l1 = bo.anU();
      if (l1 / 86400L != this.pYn)
      {
        localSimpleDateFormat = new java/text/SimpleDateFormat;
        localSimpleDateFormat.<init>("yyyyMMdd");
      }
    }
    catch (Exception parama)
    {
      try
      {
        long l1;
        SimpleDateFormat localSimpleDateFormat;
        Date localDate = new java/util/Date;
        localDate.<init>();
        this.pYo = bo.getInt(localSimpleDateFormat.format(localDate), 0);
        label82: parama.getClass().getField("ds_").setInt(parama, this.pYo);
        long l2 = this.uin;
        parama.getClass().getField("uin_").setLong(parama, l2 & 0xFFFFFFFF);
        parama.getClass().getField("device_").setInt(parama, 2);
        parama.getClass().getField("clientVersion_").setInt(parama, com.tencent.mm.protocal.d.vxo);
        parama.getClass().getField("time_stamp_").setLong(parama, l1);
        try
        {
          parama = parama.toByteArray();
          if (ah.bqo())
          {
            if (com.tencent.mm.plugin.report.a.c.pXd)
            {
              l2 = paramInt;
              boolean bool2 = com.tencent.mm.plugin.report.a.c.pXe;
              e.a(l2, parama, bool2, bool2);
            }
            while (true)
            {
              AppMethodBeat.o(72774);
              while (true)
              {
                return bool1;
                parama = parama;
                ab.e("MicroMsg.ReportManagerKvCheck", "pbKVStat  set values error, %d, %s", new Object[] { Integer.valueOf(paramInt), parama.toString() });
                AppMethodBeat.o(72774);
                bool1 = false;
              }
              l2 = paramInt;
              e.a(l2, parama, false, false);
            }
          }
        }
        catch (IOException parama)
        {
          while (true)
          {
            ab.e("MicroMsg.ReportManagerKvCheck", "pbKVStat LocalReportPb error, %d, %s", new Object[] { Integer.valueOf(paramInt), parama.toString() });
            AppMethodBeat.o(72774);
            bool1 = false;
            continue;
            ab.f("MicroMsg.ReportManagerKvCheck", "not in MM Process");
          }
        }
      }
      catch (Exception localException)
      {
        break label82;
      }
    }
  }

  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(72782);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt2);
    localIDKey1.SetValue(paramInt4);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt1);
    localIDKey2.SetKey(paramInt3);
    localIDKey2.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, false);
    AppMethodBeat.o(72782);
  }

  public final void e(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72772);
    if (com.tencent.mm.plugin.report.a.c.pXd)
    {
      boolean bool = com.tencent.mm.plugin.report.a.c.pXe;
      a(paramInt, bool, bool, paramArrayOfObject);
      AppMethodBeat.o(72772);
    }
    while (true)
    {
      return;
      a(paramInt, false, false, paramArrayOfObject);
      AppMethodBeat.o(72772);
    }
  }

  public final void fP(String paramString1, String paramString2)
  {
    AppMethodBeat.i(138375);
    g(paramString1, paramString2, null);
    AppMethodBeat.o(138375);
  }

  public final void g(String paramString1, final String paramString2, final Map<String, Object> paramMap)
  {
    AppMethodBeat.i(72786);
    a(paramString1, new Callable()
    {
    });
    AppMethodBeat.o(72786);
  }

  public final void hB(int paramInt)
  {
    AppMethodBeat.i(72789);
    this.uin = paramInt;
    SmcLogic.setUin(paramInt);
    AppMethodBeat.o(72789);
  }

  public final void k(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(72778);
    a(paramLong1, paramLong2, paramLong3, false);
    AppMethodBeat.o(72778);
  }

  public final void q(String paramString, final List<String> paramList)
  {
    AppMethodBeat.i(72787);
    a(paramString, new Callable()
    {
    });
    AppMethodBeat.o(72787);
  }

  public final void z(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(138374);
    k(paramLong1, paramLong2, 1L);
    AppMethodBeat.o(138374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.h
 * JD-Core Version:    0.6.2
 */