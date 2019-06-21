package com.tencent.mm.modelstat;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.accessibility.AccessibilityCapture.APIProvider;
import com.tencent.mm.accessibility.AccessibilityCapture.Event;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONObject;

public class c
  implements AccessibilityCapture.APIProvider
{
  private static c fRx;
  private ArrayList<b> fRA;
  private String fRB;
  private long fRC;
  private ArrayList<c.c> fRD;
  private boolean fRE;
  private Map<String, Boolean> fRF;
  private long fRG;
  private long fRH;
  private List<c.d> fRI;
  private ap fRy;
  private final int fRz;
  private ak handler;

  private c()
  {
    AppMethodBeat.i(78678);
    this.handler = null;
    this.fRy = null;
    this.fRz = 20971520;
    this.fRA = new ArrayList();
    this.fRB = null;
    this.fRC = 0L;
    this.fRD = new ArrayList();
    this.fRE = false;
    this.fRF = new HashMap();
    this.fRG = 0L;
    this.fRH = 0L;
    this.fRI = new ArrayList();
    if (b.dnO())
      Assert.assertTrue("Error: ClickFlow internal code can only run in MM process.", ah.bqo());
    HandlerThread localHandlerThread = d.anM("ClickFlow");
    localHandlerThread.start();
    this.handler = new ak(localHandlerThread.getLooper());
    this.fRy = new ap(localHandlerThread.getLooper(), new c.1(this), true);
    AppMethodBeat.o(78678);
  }

  private void a(long paramLong, ArrayList<b> paramArrayList, a parama)
  {
    AppMethodBeat.i(78688);
    long l1 = ((b)paramArrayList.get(0)).time;
    long l2 = ((b)paramArrayList.get(paramArrayList.size() - 1)).fRR;
    long l3 = bo.anT();
    int i = 0;
    try
    {
      if (i < this.fRD.size())
      {
        if ("app".equals(((c.c)this.fRD.get(i)).fRU))
        {
          paramArrayList = (c.c)this.fRD.get(i);
          if (paramArrayList == null)
            break label241;
          if ((paramArrayList.fRS <= l3) || (!a(paramLong, paramArrayList.fRT, this.fRH)))
            break label173;
          ab.i("MicroMsg.ClickFlowStatReceiver", "type: app, handle %s, now:%d", new Object[] { paramArrayList, Long.valueOf(l3) });
          a(parama, paramArrayList.eBH, paramArrayList.id, l1, l2);
          AppMethodBeat.o(78688);
        }
        while (true)
        {
          return;
          i++;
          break;
          label173: ab.i("MicroMsg.ClickFlowStatReceiver", "type: app, skip %s, now:%d", new Object[] { paramArrayList, Long.valueOf(l3) });
          AppMethodBeat.o(78688);
        }
      }
    }
    catch (Exception paramArrayList)
    {
      while (true)
      {
        x(15004, bo.l(paramArrayList));
        ab.e("MicroMsg.ClickFlowStatReceiver", "report ev:1 exception : %s", new Object[] { bo.l(paramArrayList) });
        AppMethodBeat.o(78688);
        continue;
        label241: ab.i("MicroMsg.ClickFlowStatReceiver", "type: app, skip null");
        if (fP(paramLong))
        {
          a(parama, 13604, 100001, l1, l2);
          AppMethodBeat.o(78688);
        }
        else
        {
          ab.i("MicroMsg.ClickFlowStatReceiver", "type: app, event null, uin not zero");
          AppMethodBeat.o(78688);
          continue;
          paramArrayList = null;
        }
      }
    }
  }

  private void a(long paramLong, ArrayList<b> paramArrayList, a parama, int paramInt)
  {
    AppMethodBeat.i(78690);
    try
    {
      long l = bo.anU();
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>();
      Object localObject3;
      for (i = 0; i < paramArrayList.size(); i++)
      {
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        b localb = (b)paramArrayList.get(i);
        if ((localb.fRR < localb.time) || (localb.time < 0L) || (localb.fRR < 0L) || (localb.fRR > l) || (localb.time > l))
        {
          ab.e("MicroMsg.ClickFlowStatReceiver", "reportPage ErrorTime: [%d, %d]  now:%d ", new Object[] { Long.valueOf(localb.time), Long.valueOf(localb.fRR), Long.valueOf(l) });
          AppMethodBeat.o(78690);
          return;
        }
        localJSONObject1.put("p", localb.fRQ).put("tbe", localb.time / 1000L).put("in", (localb.fRR - localb.time) / 1000L);
        if ((localb.fRI != null) && (!localb.fRI.isEmpty()))
        {
          localObject2 = new org/json/JSONArray;
          ((JSONArray)localObject2).<init>();
          for (j = 0; j < localb.fRI.size(); j++)
          {
            localObject3 = (c.d)localb.fRI.get(j);
            JSONObject localJSONObject2 = new org/json/JSONObject;
            localJSONObject2.<init>();
            JSONObject localJSONObject3 = localJSONObject2.put("w", ((c.d)localObject3).fRX).put("t", ((c.d)localObject3).type);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("{");
            localJSONObject3.put("tbp", ((c.d)localObject3).left + ";" + ((c.d)localObject3).top + "}");
            ((JSONArray)localObject2).put(localJSONObject2);
          }
          localJSONObject1.put("wf", localObject2);
        }
        ((JSONArray)localObject1).put(localJSONObject1);
      }
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      ((JSONObject)localObject2).put("t", 2).put("errt", paramInt).put("pf", localObject1);
      if (fP(paramLong))
      {
        paramInt = bo.h(parama.anE("SEQ_13604"));
        parama.ej("SEQ_13604", paramInt + 1);
        b(13604, "100002", paramInt, ((JSONObject)localObject2).toString());
      }
      localObject1 = new android/util/SparseArray;
      ((SparseArray)localObject1).<init>();
      if (this.fRD.size() == 0)
        ab.i("MicroMsg.ClickFlowStatReceiver", "type: page, no event");
      paramInt = 0;
      if (paramInt < this.fRD.size())
      {
        localObject3 = (c.c)this.fRD.get(paramInt);
        if ((((c.c)localObject3).fRS > bo.anT()) && (a(paramLong, ((c.c)localObject3).fRT, this.fRH)))
          a(paramArrayList, (c.c)localObject3, (SparseArray)localObject1);
        while (true)
        {
          paramInt++;
          break;
          ab.i("MicroMsg.ClickFlowStatReceiver", "type: page, skip %s, now: %d", new Object[] { localObject3, Long.valueOf(bo.anT()) });
        }
      }
    }
    catch (Exception paramArrayList)
    {
      while (true)
      {
        Object localObject1;
        int i;
        Object localObject2;
        int j;
        x(15005, bo.l(paramArrayList));
        ab.e("MicroMsg.ClickFlowStatReceiver", "report ev:2 exception : %s", new Object[] { bo.l(paramArrayList) });
        AppMethodBeat.o(78690);
        continue;
        for (paramInt = 0; paramInt < ((SparseArray)localObject1).size(); paramInt++)
        {
          j = ((SparseArray)localObject1).keyAt(paramInt);
          paramArrayList = (String)((SparseArray)localObject1).get(j);
          i = bo.h(parama.anE("SEQ_".concat(String.valueOf(j))));
          parama.ej("SEQ_".concat(String.valueOf(j)), i + 1);
          b(j, paramArrayList, i, ((JSONObject)localObject2).toString());
        }
        AppMethodBeat.o(78690);
      }
    }
  }

  private void a(c.a parama)
  {
    AppMethodBeat.i(78685);
    this.fRG = parama.fRG;
    if ((this.fRG <= 0L) || (this.fRG > 432000L))
      this.fRG = 432000L;
    this.fRH = parama.fRH;
    this.fRD.clear();
    this.fRD.addAll(parama.fRP);
    this.fRF.clear();
    this.fRF.putAll(parama.fRF);
    if ((this.fRF.containsKey("*")) && (((Boolean)this.fRF.get("*")).booleanValue()))
      this.fRE = true;
    ab.i("MicroMsg.ClickFlowStatReceiver", "applyConfig OK evenCount:%d nextUpdateInterval:%d samplePeriod:%d", new Object[] { Integer.valueOf(this.fRD.size()), Long.valueOf(this.fRG), Long.valueOf(this.fRH) });
    AppMethodBeat.o(78685);
  }

  private void a(b paramb, long paramLong)
  {
    AppMethodBeat.i(78682);
    if (paramb.elapsedTime <= 0L)
      AppMethodBeat.o(78682);
    while (true)
    {
      return;
      long l = paramb.elapsedTime;
      if (this.fRI.isEmpty());
      for (int i = 0; ; i = this.fRI.size() - 1)
      {
        i = d(l, 0, i);
        if (i == -1)
          break;
        if (paramb.fRI == null)
          paramb.fRI = new ArrayList();
        int j = this.fRI.size();
        while (i < j)
        {
          c.d locald = (c.d)this.fRI.get(i);
          if ((locald.time > paramb.elapsedTime) && (locald.time <= paramLong))
            paramb.fRI.add(locald);
          if (locald.time >= paramLong)
            break;
          i++;
        }
      }
      AppMethodBeat.o(78682);
    }
  }

  private static void a(a parama, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(78689);
    long l1 = bo.anU();
    if ((paramLong1 > paramLong2) || (paramLong1 < 0L) || (paramLong2 < 0L) || (paramLong1 > l1) || (paramLong2 > l1))
    {
      ab.e("MicroMsg.ClickFlowStatReceiver", "reportAppInternal ErrorParam begin:%d end:%d now:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(l1) });
      AppMethodBeat.o(78689);
    }
    while (true)
    {
      return;
      int i = bo.h(parama.anE("SEQ_".concat(String.valueOf(paramInt1))));
      parama.ej("SEQ_".concat(String.valueOf(paramInt1)), i + 1);
      long l2 = bo.c(parama.anD("LastQuit_".concat(String.valueOf(paramInt2))));
      parama.aK("LastQuit_".concat(String.valueOf(paramInt2)), paramLong2);
      if (l2 > 0L)
      {
        l1 = l2;
        if (l2 <= paramLong1);
      }
      else
      {
        l1 = paramLong1;
      }
      parama = new JSONObject();
      parama.put("t", 1).put("tbe", paramLong1 / 1000L).put("ten", paramLong2 / 1000L).put("in", (paramLong2 - paramLong1) / 1000L).put("lten", l1 / 1000L).put("inbg", (paramLong1 - l1) / 1000L);
      b(paramInt1, String.valueOf(paramInt2), i, parama.toString());
      AppMethodBeat.o(78689);
    }
  }

  // ERROR //
  private void a(String paramString, HashMap<Long, ArrayList<b>> paramHashMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 717
    //   5: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 243	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   11: lstore_3
    //   12: new 719	java/io/FileOutputStream
    //   15: astore 5
    //   17: aload 5
    //   19: aload_1
    //   20: invokespecial 720	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   23: new 722	java/io/ObjectOutputStream
    //   26: astore_1
    //   27: aload_1
    //   28: aload 5
    //   30: invokespecial 725	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   33: aload_1
    //   34: astore 6
    //   36: aload 5
    //   38: astore 7
    //   40: aload_1
    //   41: aload_2
    //   42: invokevirtual 729	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   45: aload_1
    //   46: astore 6
    //   48: aload 5
    //   50: astore 7
    //   52: aload 5
    //   54: invokevirtual 732	java/io/FileOutputStream:flush	()V
    //   57: aload_1
    //   58: astore 6
    //   60: aload 5
    //   62: astore 7
    //   64: ldc 187
    //   66: ldc_w 734
    //   69: iconst_2
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_2
    //   76: invokevirtual 735	java/util/HashMap:size	()I
    //   79: invokestatic 423	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: aastore
    //   83: dup
    //   84: iconst_1
    //   85: lload_3
    //   86: invokestatic 683	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   89: invokestatic 195	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   92: aastore
    //   93: invokestatic 200	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: aload_1
    //   97: invokevirtual 738	java/io/ObjectOutputStream:close	()V
    //   100: aload 5
    //   102: invokevirtual 739	java/io/FileOutputStream:close	()V
    //   105: ldc_w 717
    //   108: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_0
    //   112: monitorexit
    //   113: return
    //   114: astore_1
    //   115: ldc_w 717
    //   118: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: goto -10 -> 111
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    //   129: astore_2
    //   130: aconst_null
    //   131: astore_1
    //   132: aconst_null
    //   133: astore 5
    //   135: aload_1
    //   136: astore 6
    //   138: aload 5
    //   140: astore 7
    //   142: ldc 187
    //   144: ldc_w 741
    //   147: iconst_2
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_2
    //   154: invokevirtual 742	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   157: aastore
    //   158: dup
    //   159: iconst_1
    //   160: aload_2
    //   161: invokestatic 215	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   164: aastore
    //   165: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: aload_1
    //   169: ifnull +7 -> 176
    //   172: aload_1
    //   173: invokevirtual 738	java/io/ObjectOutputStream:close	()V
    //   176: aload 5
    //   178: ifnull +8 -> 186
    //   181: aload 5
    //   183: invokevirtual 739	java/io/FileOutputStream:close	()V
    //   186: ldc_w 717
    //   189: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: goto -81 -> 111
    //   195: astore_1
    //   196: ldc_w 717
    //   199: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -91 -> 111
    //   205: astore_1
    //   206: aconst_null
    //   207: astore 6
    //   209: aconst_null
    //   210: astore 5
    //   212: aload 6
    //   214: ifnull +8 -> 222
    //   217: aload 6
    //   219: invokevirtual 738	java/io/ObjectOutputStream:close	()V
    //   222: aload 5
    //   224: ifnull +8 -> 232
    //   227: aload 5
    //   229: invokevirtual 739	java/io/FileOutputStream:close	()V
    //   232: ldc_w 717
    //   235: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: aload_1
    //   239: athrow
    //   240: astore_1
    //   241: goto -141 -> 100
    //   244: astore_1
    //   245: goto -69 -> 176
    //   248: astore_2
    //   249: goto -27 -> 222
    //   252: astore_2
    //   253: goto -21 -> 232
    //   256: astore_1
    //   257: aconst_null
    //   258: astore 6
    //   260: goto -48 -> 212
    //   263: astore_1
    //   264: aload 7
    //   266: astore 5
    //   268: goto -56 -> 212
    //   271: astore_2
    //   272: aconst_null
    //   273: astore_1
    //   274: goto -139 -> 135
    //   277: astore_2
    //   278: goto -143 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   100	105	114	java/lang/Exception
    //   2	8	124	finally
    //   96	100	124	finally
    //   100	105	124	finally
    //   105	111	124	finally
    //   115	121	124	finally
    //   172	176	124	finally
    //   181	186	124	finally
    //   186	192	124	finally
    //   196	202	124	finally
    //   217	222	124	finally
    //   227	232	124	finally
    //   232	240	124	finally
    //   8	23	129	java/lang/Exception
    //   181	186	195	java/lang/Exception
    //   8	23	205	finally
    //   96	100	240	java/lang/Exception
    //   172	176	244	java/lang/Exception
    //   217	222	248	java/lang/Exception
    //   227	232	252	java/lang/Exception
    //   23	33	256	finally
    //   40	45	263	finally
    //   52	57	263	finally
    //   64	96	263	finally
    //   142	168	263	finally
    //   23	33	271	java/lang/Exception
    //   40	45	277	java/lang/Exception
    //   52	57	277	java/lang/Exception
    //   64	96	277	java/lang/Exception
  }

  private static void a(List<b> paramList, c.c paramc, SparseArray<String> paramSparseArray)
  {
    int i = 0;
    AppMethodBeat.i(78687);
    Object localObject = paramc.fRU;
    int j = -1;
    switch (((String)localObject).hashCode())
    {
    default:
      switch (j)
      {
      default:
        AppMethodBeat.o(78687);
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case 3433103:
    case -929554094:
    case 3117816:
    case 379114255:
    }
    while (true)
    {
      label102: return;
      if (!((String)localObject).equals("page"))
        break;
      j = 0;
      break;
      if (!((String)localObject).equals("respective"))
        break;
      j = 1;
      break;
      if (!((String)localObject).equals("ends"))
        break;
      j = 2;
      break;
      if (!((String)localObject).equals("continuous"))
        break;
      j = 3;
      break;
      ab.i("MicroMsg.ClickFlowStatReceiver", "type: page, handle %s", new Object[] { paramc });
      paramSparseArray.put(paramc.eBH, bo.nullAsNil((String)paramSparseArray.get(paramc.eBH)) + paramc.id + ";");
      AppMethodBeat.o(78687);
    }
    ab.i("MicroMsg.ClickFlowStatReceiver", "type: respective, handle %s", new Object[] { paramc });
    j = 0;
    label263: int k;
    if (j < paramList.size())
    {
      i = 0;
      k = j;
      j = i;
      label283: if (j < paramc.fRV.size())
      {
        if (!((String)((Pair)paramc.fRV.get(j)).first).equals(((b)paramList.get(k)).fRQ))
          break label854;
        paramSparseArray.put(paramc.eBH, bo.nullAsNil((String)paramSparseArray.get(paramc.eBH)) + paramc.id + ";");
        j = paramc.fRV.size();
        k = paramList.size();
      }
    }
    label836: label854: 
    while (true)
    {
      j++;
      break label283;
      j = k + 1;
      break label263;
      AppMethodBeat.o(78687);
      break label102;
      ab.i("MicroMsg.ClickFlowStatReceiver", "type: ends, handle %s", new Object[] { paramc });
      if (paramList.size() < 2)
        break;
      if (paramc.fRV.size() == 2);
      for (j = 1; ; j = 0)
      {
        if (j != 0)
          break label510;
        ab.e("MicroMsg.ClickFlowStatReceiver", "ends's pages size is not 2: " + paramc.fRV.toString());
        AppMethodBeat.o(78687);
        break;
      }
      label510: localObject = (String)((Pair)paramc.fRV.get(0)).first;
      String str = (String)((Pair)paramc.fRV.get(1)).first;
      if ((!((b)paramList.get(0)).fRQ.equals(localObject)) || (!((b)paramList.get(paramList.size() - 1)).fRQ.equals(str)))
        break;
      paramSparseArray.put(paramc.eBH, bo.nullAsNil((String)paramSparseArray.get(paramc.eBH)) + paramc.id + ";");
      AppMethodBeat.o(78687);
      break label102;
      ab.i("MicroMsg.ClickFlowStatReceiver", "type: continuous, handle %s", new Object[] { paramc });
      localObject = paramc.fRV;
      k = i;
      if (((List)localObject).size() > 0);
      for (j = ((List)localObject).size() - 1; ; j = ((List)localObject).size() - k + j)
      {
        k = i;
        if (j < paramList.size())
          k = ((List)localObject).size() - 1;
        while (true)
        {
          if (!((String)((Pair)((List)localObject).get(k)).first).equals(((b)paramList.get(j)).fRQ))
            break label836;
          if (k == 0)
          {
            k = 1;
            if (k == 0)
              break;
            paramSparseArray.put(paramc.eBH, bo.nullAsNil((String)paramSparseArray.get(paramc.eBH)) + paramc.id + ";");
            break;
          }
          k--;
          j--;
        }
      }
    }
  }

  private static boolean a(long paramLong1, float paramFloat, long paramLong2)
  {
    AppMethodBeat.i(78686);
    if (b.dnO())
    {
      bool = true;
      AppMethodBeat.o(78686);
    }
    while (true)
    {
      return bool;
      if (paramFloat > 0.0F)
        break;
      bool = false;
      AppMethodBeat.o(78686);
    }
    int i = 10000 / (int)(10000.0F * paramFloat);
    int j = (int)paramLong1;
    j = (j ^ j >> 16) * 73244475;
    j = (j ^ j >> 16) * 73244475;
    int k = j >> 16 ^ j;
    j = k % i;
    long l1 = bo.anT();
    long l2;
    label119: int m;
    if (paramLong2 == 0L)
    {
      l2 = 259200L;
      m = (int)(l1 / l2 % i);
      if (j != m)
        break label232;
    }
    label232: for (boolean bool = true; ; bool = false)
    {
      ab.v("MicroMsg.ClickFlowStatReceiver", "checkRate %b uin:%s rate:%s period:%s rec:%s x:%s uinMod:%s timeMod:%s", new Object[] { Boolean.valueOf(bool), Long.valueOf(paramLong1), Float.valueOf(paramFloat), Long.valueOf(paramLong2), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m) });
      AppMethodBeat.o(78686);
      break;
      l2 = paramLong2;
      break label119;
    }
  }

  public static c akc()
  {
    AppMethodBeat.i(78670);
    if (fRx == null);
    try
    {
      if (fRx == null)
      {
        localc = new com/tencent/mm/modelstat/c;
        localc.<init>();
        fRx = localc;
      }
      c localc = fRx;
      AppMethodBeat.o(78670);
      return localc;
    }
    finally
    {
      AppMethodBeat.o(78670);
    }
  }

  private static void b(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(78694);
    try
    {
      paramString2 = paramString2.replace(",", ";");
      int i = (int)Math.ceil(paramString2.length() / 6000.0D);
      for (int j = 0; j < i; j++)
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = paramString1 + "," + paramInt2 + "," + j + "," + i + ",0,0,," + paramString2.substring(j * 6000, Math.min((j + 1) * 6000, paramString2.length()));
        ab.i("MicroMsg.ClickFlowStatReceiver", "jsonKVReporter id:%d event[%s] [%s]", new Object[] { Integer.valueOf(paramInt1), paramString1, localObject });
        com.tencent.mm.plugin.report.e.pXa.a(346L, 4L, 1L, false);
        com.tencent.mm.plugin.report.e.pXa.a(paramInt1, (String)localObject, true, true);
      }
      AppMethodBeat.o(78694);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        x(15009, bo.l(paramString1));
        ab.e("MicroMsg.ClickFlowStatReceiver", "jsonKVReporter exception : %s", new Object[] { bo.l(paramString1) });
        AppMethodBeat.o(78694);
      }
    }
  }

  private void b(long paramLong, ArrayList<b> paramArrayList, a parama)
  {
    AppMethodBeat.i(78691);
    long l1 = bo.anU();
    long l2 = ((b)paramArrayList.get(paramArrayList.size() - 1)).fRR;
    if ((l2 <= 0L) || (l2 > l1))
    {
      ab.e("MicroMsg.ClickFlowStatReceiver", "reportStat  ErrorTime end:%d now:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
      AppMethodBeat.o(78691);
    }
    long l3;
    Object localObject1;
    label323: Object localObject2;
    Object localObject3;
    while (true)
    {
      return;
      l3 = bo.anT();
      String str = this.fRB + "stg_20971520_" + paramLong + ".HashMap";
      try
      {
        localObject1 = tG(str);
        ((HashMap)localObject1).put(Long.valueOf(l2), paramArrayList);
        paramArrayList = ((HashMap)localObject1).entrySet().iterator();
        while (paramArrayList.hasNext())
          if (((Long)((Map.Entry)paramArrayList.next()).getKey()).longValue() + 259200000L < l2)
            paramArrayList.remove();
      }
      catch (Exception paramArrayList)
      {
        ab.e("MicroMsg.ClickFlowStatReceiver", "report ev:4 exception : %s", new Object[] { bo.l(paramArrayList) });
        AppMethodBeat.o(78691);
        continue;
        a(str, (HashMap)localObject1);
        if (b.dnO());
        for (l4 = 180000L; ; l4 = 3600000L)
        {
          l5 = bo.a(parama.anD("LAST_REPORT_STATISITIC_TIME"), 0L);
          if (l5 + l4 <= l2)
            break label323;
          ab.i("MicroMsg.ClickFlowStatReceiver", "type: stat, skip all, lastStatisticTime: %d, end: %d, FREQ: %d", new Object[] { Long.valueOf(l5), Long.valueOf(l2), Long.valueOf(l4) });
          AppMethodBeat.o(78691);
          break;
        }
        parama.aK("LAST_REPORT_STATISITIC_TIME", l2);
        localObject2 = new java/util/HashMap;
        ((HashMap)localObject2).<init>();
        paramArrayList = ((HashMap)localObject1).keySet().iterator();
        while (paramArrayList.hasNext())
        {
          localObject3 = (Long)paramArrayList.next();
          if (((Long)localObject3).longValue() > l5)
            ((HashMap)localObject2).put(localObject3, ((HashMap)localObject1).get(localObject3));
        }
      }
      catch (OutOfMemoryError paramArrayList)
      {
        com.tencent.mm.a.e.deleteFile(str);
        System.gc();
        ab.printErrStackTrace("MicroMsg.ClickFlowStatReceiver", paramArrayList, "OutOfMemoryError", new Object[0]);
        x(15010, bo.l(paramArrayList));
        AppMethodBeat.o(78691);
      }
    }
    long l5 = 0L;
    long l4 = 9223372036854775807L;
    HashMap localHashMap1 = new java/util/HashMap;
    localHashMap1.<init>();
    HashMap localHashMap2 = new java/util/HashMap;
    localHashMap2.<init>();
    HashMap localHashMap3 = new java/util/HashMap;
    localHashMap3.<init>();
    Object localObject4 = new java/util/HashMap;
    ((HashMap)localObject4).<init>();
    HashMap localHashMap4 = new java/util/HashMap;
    localHashMap4.<init>();
    int i = 0;
    label507: if (i < this.fRD.size())
      if (!"pagestat".equals(((c.c)this.fRD.get(i)).fRU));
    for (paramArrayList = (c.c)this.fRD.get(i); ; paramArrayList = null)
    {
      ab.i("MicroMsg.ClickFlowStatReceiver", "[oneliang] click flow session count:%s", new Object[] { Integer.valueOf(((HashMap)localObject2).size()) });
      Object localObject5 = ((HashMap)localObject2).keySet().iterator();
      label591: if (((Iterator)localObject5).hasNext())
      {
        localObject1 = (Long)((Iterator)localObject5).next();
        if (l4 <= ((Long)localObject1).longValue())
          break label2536;
        l4 = ((Long)localObject1).longValue();
      }
      label2473: label2506: label2523: label2528: label2533: label2536: 
      while (true)
      {
        ab.i("MicroMsg.ClickFlowStatReceiver", "find min key,min key:%s,cur key:%s", new Object[] { Long.valueOf(l4), localObject1 });
        Object localObject6 = (ArrayList)((HashMap)localObject2).get(localObject1);
        long l6 = l5 + (((b)((ArrayList)localObject6).get(((ArrayList)localObject6).size() - 1)).fRR - ((b)((ArrayList)localObject6).get(0)).time);
        if ((l6 < 0L) || (l6 > 172800000L))
        {
          ab.e("MicroMsg.ClickFlowStatReceiver", "reportStat ErrorTime sumInFg:%d", new Object[] { Long.valueOf(l6) });
          AppMethodBeat.o(78691);
          break;
          i++;
          break label507;
        }
        i = 0;
        localObject1 = null;
        label761: if (i < ((ArrayList)localObject6).size())
        {
          localObject3 = (b)((ArrayList)localObject6).get(i);
          ab.v("MicroMsg.ClickFlowStatReceiver", "pageIntervalMap page:%s old:%d  new[%d,%d,%d]", new Object[] { ((b)localObject3).fRQ, Long.valueOf(bo.c((Long)localHashMap1.get(((b)localObject3).fRQ))), Long.valueOf(((b)localObject3).fRR), Long.valueOf(((b)localObject3).time), Long.valueOf(((b)localObject3).fRR - ((b)localObject3).time) });
          l5 = ((b)localObject3).fRR - ((b)localObject3).time;
          if ((l5 >= 0L) && (l5 <= 86400000L))
            break label2533;
          ab.e("MicroMsg.ClickFlowStatReceiver", "pageIntervalMap ErrorTime [%d,%d] now:%d diff:%d", new Object[] { Long.valueOf(((b)localObject3).time), Long.valueOf(((b)localObject3).fRR), Long.valueOf(l1), Long.valueOf(l5) });
          l5 = 0L;
        }
        while (true)
        {
          localHashMap1.put(((b)localObject3).fRQ, Long.valueOf(l5 + bo.c((Long)localHashMap1.get(((b)localObject3).fRQ))));
          localHashMap2.put(((b)localObject3).fRQ, Long.valueOf(bo.c((Long)localHashMap2.get(((b)localObject3).fRQ)) + 1L));
          Object localObject7;
          if (localObject1 != null)
          {
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            localObject1 = ((b)localObject1).fRQ + "," + ((b)localObject3).fRQ;
            ((HashMap)localObject4).put(localObject1, Long.valueOf(bo.c((Long)((HashMap)localObject4).get(localObject1)) + 1L));
          }
          int j;
          if (((b)localObject3).fRI != null)
          {
            if (localHashMap4.containsKey(((b)localObject3).fRQ))
              localObject1 = (Map)localHashMap4.get(((b)localObject3).fRQ);
            while (true)
            {
              for (j = 0; j < ((b)localObject3).fRI.size(); j++)
              {
                localObject7 = (c.d)((b)localObject3).fRI.get(j);
                ((Map)localObject1).put(((c.d)localObject7).fRX, Long.valueOf(bo.c((Long)((Map)localObject1).get(((c.d)localObject7).fRX)) + 1L));
              }
              localObject1 = new java/util/HashMap;
              ((HashMap)localObject1).<init>();
              localHashMap4.put(((b)localObject3).fRQ, localObject1);
            }
          }
          i++;
          localObject1 = localObject3;
          break label761;
          if (paramArrayList != null)
          {
            localObject1 = paramArrayList.fRW.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (Pair)((Iterator)localObject1).next();
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject6 = (String)((Pair)localObject3).first + "," + (String)((Pair)localObject3).second;
              if (((HashMap)localObject4).containsKey(localObject6))
                localHashMap3.put(((Pair)localObject3).second, ((HashMap)localObject4).get(localObject6));
            }
          }
          l5 = l6;
          break label591;
          l6 = ((b)((ArrayList)((HashMap)localObject2).get(Long.valueOf(l4))).get(0)).time;
          ab.i("MicroMsg.ClickFlowStatReceiver", "min key:%s,tbe:%s", new Object[] { Long.valueOf(l4), Long.valueOf(l6) });
          if ((l6 > l1) || (l6 < 0L))
          {
            ab.e("MicroMsg.ClickFlowStatReceiver", "reportStat ErroTime tbe:%d now:%d", new Object[] { Long.valueOf(l6), Long.valueOf(l1) });
            AppMethodBeat.o(78691);
            break;
          }
          i = 0;
          while (true)
          {
            try
            {
              if (i >= this.fRD.size())
                break label2528;
              if ("appstat".equals(((c.c)this.fRD.get(i)).fRU))
              {
                paramArrayList = (c.c)this.fRD.get(i);
                ab.i("MicroMsg.ClickFlowStatReceiver", "[oneliang] end:%s,tbe:%s,sumInFg:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l6), Long.valueOf(l5) });
                if ((paramArrayList == null) || (l2 - l6 - l5 < 0L))
                  continue;
                if ((paramArrayList.fRS <= l3) || (!a(paramLong, paramArrayList.fRT, this.fRH)))
                  continue;
                ab.i("MicroMsg.ClickFlowStatReceiver", "type: appstat, handle %s, now:%d", new Object[] { paramArrayList, Long.valueOf(l3) });
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("SEQ_");
                j = bo.h(parama.anE(paramArrayList.eBH));
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("SEQ_");
                parama.ej(paramArrayList.eBH, j + 1);
                localObject1 = new org/json/JSONObject;
                ((JSONObject)localObject1).<init>();
                ((JSONObject)localObject1).put("t", 5).put("tbe", l6 / 1000L).put("ten", l2 / 1000L).put("in", l5 / 1000L).put("inbg", (l2 - l6 - l5) / 1000L).put("swc", ((HashMap)localObject2).size());
                i = paramArrayList.eBH;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                b(i, paramArrayList.id, j, ((JSONObject)localObject1).toString());
                i = 0;
                try
                {
                  if (i >= this.fRD.size())
                    break label2523;
                  if (!"pagestat".equals(((c.c)this.fRD.get(i)).fRU))
                    continue;
                  paramArrayList = (c.c)this.fRD.get(i);
                  if (paramArrayList == null)
                    break label2506;
                  if ((paramArrayList.fRS <= l3) || (!a(paramLong, paramArrayList.fRT, this.fRH)))
                    break label2473;
                  ab.i("MicroMsg.ClickFlowStatReceiver", "type: pagestat, handle %s, now:%d", new Object[] { paramArrayList, Long.valueOf(l3) });
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>("SEQ_");
                  i = bo.h(parama.anE(paramArrayList.eBH));
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>("SEQ_");
                  parama.ej(paramArrayList.eBH, i + 1);
                  parama = new org/json/JSONArray;
                  parama.<init>();
                  localObject3 = localHashMap1.keySet().iterator();
                  if (!((Iterator)localObject3).hasNext())
                    continue;
                  localObject4 = (String)((Iterator)localObject3).next();
                  localObject1 = new org/json/JSONObject;
                  ((JSONObject)localObject1).<init>();
                  ((JSONObject)localObject1).put("p", localObject4).put("in", ((Long)localHashMap1.get(localObject4)).longValue() / 1000L).put("c", localHashMap2.get(localObject4)).put("c2", localHashMap3.get(localObject4));
                  if (!localHashMap4.containsKey(localObject4))
                    continue;
                  localObject2 = new org/json/JSONArray;
                  ((JSONArray)localObject2).<init>();
                  localObject5 = (Map)localHashMap4.get(localObject4);
                  localObject6 = ((Map)localObject5).keySet().iterator();
                  if (!((Iterator)localObject6).hasNext())
                    continue;
                  localObject7 = (String)((Iterator)localObject6).next();
                  localObject4 = new org/json/JSONObject;
                  ((JSONObject)localObject4).<init>();
                  ((JSONObject)localObject4).put("w", localObject7).put("c", ((Map)localObject5).get(localObject7));
                  ((JSONArray)localObject2).put(localObject4);
                  continue;
                }
                catch (Exception paramArrayList)
                {
                  x(15007, bo.l(paramArrayList));
                  ab.e("MicroMsg.ClickFlowStatReceiver", "report ev:4 exception : %s", new Object[] { bo.l(paramArrayList) });
                  AppMethodBeat.o(78691);
                }
                break;
              }
              i++;
              continue;
              ab.i("MicroMsg.ClickFlowStatReceiver", "type: appstat, skip %s, now:%d", new Object[] { paramArrayList, Long.valueOf(l3) });
              continue;
            }
            catch (Exception paramArrayList)
            {
              x(15006, bo.l(paramArrayList));
              ab.e("MicroMsg.ClickFlowStatReceiver", "report ev:3 exception : %s", new Object[] { bo.l(paramArrayList) });
              continue;
              ab.i("MicroMsg.ClickFlowStatReceiver", "type: appstat, skip null, event:%s, (end - tbe - sumInFg):%s", new Object[] { paramArrayList, Long.valueOf(l2 - l6 - l5) });
              continue;
              i++;
              continue;
              ((JSONObject)localObject1).put("wa", localObject2);
              parama.put(localObject1);
              continue;
              localObject1 = new org/json/JSONObject;
              ((JSONObject)localObject1).<init>();
              ((JSONObject)localObject1).put("t", 6).put("tbe", l6 / 1000L).put("ten", l2 / 1000L).put("pa", parama);
              j = paramArrayList.eBH;
              parama = new java/lang/StringBuilder;
              parama.<init>();
              b(j, paramArrayList.id, i, ((JSONObject)localObject1).toString());
              AppMethodBeat.o(78691);
            }
            break;
            ab.i("MicroMsg.ClickFlowStatReceiver", "type: pagestat, skip %s, now:%d", new Object[] { paramArrayList, Long.valueOf(l3) });
            AppMethodBeat.o(78691);
            break;
            ab.i("MicroMsg.ClickFlowStatReceiver", "type: pagestat, skip null");
            AppMethodBeat.o(78691);
            break;
            paramArrayList = null;
            continue;
            paramArrayList = null;
          }
        }
      }
    }
  }

  private static String cc(Context paramContext)
  {
    AppMethodBeat.i(78696);
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    int i;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
        if ((localRunningAppProcessInfo.importance == 100) && ((localRunningAppProcessInfo.processName.equals("com.tencent.mm")) || (localRunningAppProcessInfo.processName.equals("com.tencent.mm:tools")) || (localRunningAppProcessInfo.processName.equals("com.tencent.mm:toolsmp"))))
        {
          i = 1;
          if (i != 0)
            break label121;
          paramContext = "";
          AppMethodBeat.o(78696);
        }
      }
    }
    while (true)
    {
      return paramContext;
      i = 0;
      break;
      try
      {
        label121: paramContext = (ActivityManager)paramContext.getSystemService("activity");
        if (Build.VERSION.SDK_INT >= 23)
        {
          paramContext = paramContext.getAppTasks();
          if ((paramContext == null) || (paramContext.size() <= 0))
          {
            paramContext = "";
            AppMethodBeat.o(78696);
          }
          else
          {
            paramContext = paramContext.iterator();
            if (paramContext.hasNext())
            {
              paramContext = ((ActivityManager.AppTask)paramContext.next()).getTaskInfo().topActivity;
              if (paramContext == null)
              {
                paramContext = null;
                AppMethodBeat.o(78696);
                continue;
              }
              localObject = paramContext.getClassName();
              paramContext = (Context)localObject;
              if (((String)localObject).contains("."))
                paramContext = ((String)localObject).substring(((String)localObject).lastIndexOf(".") + 1);
              AppMethodBeat.o(78696);
            }
          }
        }
        else
        {
          localObject = ((ActivityManager.RunningTaskInfo)paramContext.getRunningTasks(1).get(0)).topActivity.getClassName();
          paramContext = (Context)localObject;
          if (((String)localObject).contains("."))
            paramContext = ((String)localObject).substring(((String)localObject).lastIndexOf(".") + 1);
          AppMethodBeat.o(78696);
        }
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.ClickFlowStatReceiver", "getTopActivityName Exception:%s stack:%s", new Object[] { paramContext.getMessage(), bo.l(paramContext) });
        paramContext = "";
        AppMethodBeat.o(78696);
      }
    }
  }

  private int d(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78683);
    if ((this.fRI == null) || (this.fRI.isEmpty()))
    {
      paramInt2 = -1;
      AppMethodBeat.o(78683);
      return paramInt2;
    }
    int i = (paramInt1 + paramInt2) / 2;
    if ((paramInt2 - paramInt1 == 0) || (paramInt2 - paramInt1 == 1))
      if (paramLong < ((c.d)this.fRI.get(paramInt2)).time);
    while (true)
    {
      AppMethodBeat.o(78683);
      break;
      paramInt2 = paramInt1;
      continue;
      if (paramLong < ((c.d)this.fRI.get(i)).time)
        paramInt2 = d(paramLong, paramInt1, i);
      else if (paramLong > ((c.d)this.fRI.get(i)).time)
        paramInt2 = d(paramLong, i, paramInt2);
      else
        paramInt2 = i;
    }
  }

  private static boolean fP(long paramLong)
  {
    if (paramLong == 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static String fQ(long paramLong)
  {
    AppMethodBeat.i(78695);
    String str;
    if (paramLong < 100000000000L)
    {
      str = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(paramLong * 1000L));
      AppMethodBeat.o(78695);
    }
    while (true)
    {
      return str;
      str = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(paramLong)) + String.format(Locale.getDefault(), ".%03d", new Object[] { Long.valueOf(paramLong % 1000L) });
      AppMethodBeat.o(78695);
    }
  }

  private Pair<Integer, ArrayList<b>> h(ArrayList<b> paramArrayList)
  {
    AppMethodBeat.i(78681);
    ArrayList localArrayList = new ArrayList();
    long l1 = bo.anU();
    try
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      l2 = 0L;
      int i = 0;
      if (i < paramArrayList.size())
      {
        localObject2 = (b)paramArrayList.get(i);
        if ((((b)localObject2).time < 0L) || (((b)localObject2).time > l1) || (l1 - ((b)localObject2).time > 50400000L))
        {
          ab.e("MicroMsg.ClickFlowStatReceiver", "getResumeList failed Err timestamp:%d diff:%d opcode:%d page:%s", new Object[] { Long.valueOf(((b)localObject2).time), Long.valueOf(l1 - ((b)localObject2).time), Integer.valueOf(((b)localObject2).czE), ((b)localObject2).fRQ });
          paramArrayList = null;
          AppMethodBeat.o(78681);
        }
      }
      while (true)
      {
        label151: return paramArrayList;
        if (((b)localObject2).czE == 4)
        {
          if (l2 >= ((b)localObject2).time)
            break label245;
          l2 = ((b)localObject2).time;
        }
        label245: 
        while (true)
        {
          i++;
          break;
          if (((b)localObject2).czE != 3)
          {
            ab.e("MicroMsg.ClickFlowStatReceiver", "getResumeList failed Err Opcode:%d %s", new Object[] { Integer.valueOf(((b)localObject2).czE), ((b)localObject2).fRQ });
            paramArrayList = null;
            AppMethodBeat.o(78681);
            break label151;
          }
          ((ArrayList)localObject1).add(localObject2);
        }
        i = ((ArrayList)localObject1).size();
        if (i != 0)
          break label271;
        paramArrayList = null;
        AppMethodBeat.o(78681);
      }
      label271: Collections.sort((List)localObject1);
      Collections.sort(this.fRI);
      localObject2 = new com/tencent/mm/modelstat/c$b;
      ((b)localObject2).<init>();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label479;
        localObject1 = (b)localIterator.next();
        if (!((b)localObject1).fRQ.equals(((b)localObject2).fRQ))
          break;
        if (((b)localObject1).time - ((b)localObject2).time > 10800000L)
        {
          ab.i("MicroMsg.ClickFlowStatReceiver", "[oneliang]Duplicate resume info check,current resume info time:%s,previous resume info time:%s", new Object[] { Long.valueOf(((b)localObject1).time), Long.valueOf(((b)localObject2).time) });
          ((b)localObject2).time = ((b)localObject1).time;
        }
      }
    }
    catch (Exception paramArrayList)
    {
      while (true)
      {
        Object localObject1;
        long l2;
        x(15008, bo.l(paramArrayList));
        ab.e("MicroMsg.ClickFlowStatReceiver", "getResumeList failed %s", new Object[] { bo.l(paramArrayList) });
        paramArrayList = null;
        AppMethodBeat.o(78681);
        continue;
        a((b)localObject2, ((b)localObject1).elapsedTime);
        localArrayList.add(localObject1);
        ((b)localObject2).fRR = ((b)localObject1).time;
        Object localObject2 = localObject1;
        continue;
        label479: if (!localArrayList.isEmpty())
          a((b)localArrayList.get(localArrayList.size() - 1), l2);
        ((b)localObject2).fRR = ((b)paramArrayList.get(paramArrayList.size() - 1)).time;
        if (((b)localArrayList.get(localArrayList.size() - 1)).time > l2)
          ((b)localArrayList.get(localArrayList.size() - 1)).fRR = l1;
        while (true)
        {
          if (((b)localArrayList.get(localArrayList.size() - 1)).fRR - ((b)localArrayList.get(0)).time <= 50400000L)
            break label646;
          ab.e("MicroMsg.ClickFlowStatReceiver", "getResumeList failed Err list time");
          paramArrayList = null;
          AppMethodBeat.o(78681);
          break;
          if (l2 > l1)
            ((b)localArrayList.get(localArrayList.size() - 1)).fRR = l1;
        }
        label646: ab.i("MicroMsg.ClickFlowStatReceiver", "getResumeList errType:%d list:%d time:%d", new Object[] { Integer.valueOf(0), Integer.valueOf(localArrayList.size()), Long.valueOf(bo.gb(l1)) });
        paramArrayList = Pair.create(Integer.valueOf(0), localArrayList);
        AppMethodBeat.o(78681);
      }
    }
  }

  // ERROR //
  @android.annotation.SuppressLint({"UseSparseArrays"})
  private static HashMap<Long, ArrayList<b>> tG(String paramString)
  {
    // Byte code:
    //   0: ldc_w 1111
    //   3: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 243	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   9: lstore_1
    //   10: new 502	java/io/File
    //   13: astore_3
    //   14: aload_3
    //   15: aload_0
    //   16: invokespecial 503	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: aload_3
    //   20: invokevirtual 506	java/io/File:exists	()Z
    //   23: ifeq +12 -> 35
    //   26: aload_3
    //   27: invokevirtual 1113	java/io/File:length	()J
    //   30: lconst_0
    //   31: lcmp
    //   32: ifgt +35 -> 67
    //   35: ldc 187
    //   37: ldc_w 1115
    //   40: iconst_1
    //   41: anewarray 4	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_0
    //   47: aastore
    //   48: invokestatic 1117	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: new 75	java/util/HashMap
    //   54: astore_0
    //   55: aload_0
    //   56: invokespecial 76	java/util/HashMap:<init>	()V
    //   59: ldc_w 1111
    //   62: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: aload_0
    //   66: areturn
    //   67: new 1119	java/io/FileInputStream
    //   70: dup
    //   71: aload_3
    //   72: invokespecial 1122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   75: astore_3
    //   76: new 1124	java/io/ObjectInputStream
    //   79: astore_0
    //   80: aload_0
    //   81: aload_3
    //   82: invokespecial 1127	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   85: aload_0
    //   86: astore 4
    //   88: aload_3
    //   89: astore 5
    //   91: aload_0
    //   92: invokevirtual 1130	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   95: checkcast 75	java/util/HashMap
    //   98: astore 6
    //   100: aload_0
    //   101: astore 4
    //   103: aload_3
    //   104: astore 5
    //   106: ldc 187
    //   108: ldc_w 1132
    //   111: iconst_2
    //   112: anewarray 4	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: aload 6
    //   119: invokevirtual 735	java/util/HashMap:size	()I
    //   122: invokestatic 423	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   125: aastore
    //   126: dup
    //   127: iconst_1
    //   128: lload_1
    //   129: invokestatic 683	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   132: invokestatic 195	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   135: aastore
    //   136: invokestatic 200	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload_0
    //   140: invokevirtual 1133	java/io/ObjectInputStream:close	()V
    //   143: aload_3
    //   144: invokevirtual 1134	java/io/FileInputStream:close	()V
    //   147: ldc_w 1111
    //   150: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: aload 6
    //   155: astore_0
    //   156: goto -91 -> 65
    //   159: astore 6
    //   161: aconst_null
    //   162: astore_0
    //   163: aconst_null
    //   164: astore_3
    //   165: aload_0
    //   166: astore 4
    //   168: aload_3
    //   169: astore 5
    //   171: ldc 187
    //   173: ldc_w 1136
    //   176: iconst_2
    //   177: anewarray 4	java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: aload 6
    //   184: invokevirtual 1137	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   187: aastore
    //   188: dup
    //   189: iconst_1
    //   190: aload 6
    //   192: invokestatic 215	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   195: aastore
    //   196: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload_0
    //   200: ifnull +7 -> 207
    //   203: aload_0
    //   204: invokevirtual 1133	java/io/ObjectInputStream:close	()V
    //   207: aload_3
    //   208: ifnull +7 -> 215
    //   211: aload_3
    //   212: invokevirtual 1134	java/io/FileInputStream:close	()V
    //   215: new 75	java/util/HashMap
    //   218: dup
    //   219: invokespecial 76	java/util/HashMap:<init>	()V
    //   222: astore_0
    //   223: ldc_w 1111
    //   226: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: goto -164 -> 65
    //   232: astore_0
    //   233: aconst_null
    //   234: astore 4
    //   236: aconst_null
    //   237: astore_3
    //   238: aload 4
    //   240: ifnull +8 -> 248
    //   243: aload 4
    //   245: invokevirtual 1133	java/io/ObjectInputStream:close	()V
    //   248: aload_3
    //   249: ifnull +7 -> 256
    //   252: aload_3
    //   253: invokevirtual 1134	java/io/FileInputStream:close	()V
    //   256: ldc_w 1111
    //   259: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   262: aload_0
    //   263: athrow
    //   264: astore_0
    //   265: goto -122 -> 143
    //   268: astore_0
    //   269: goto -122 -> 147
    //   272: astore_0
    //   273: goto -66 -> 207
    //   276: astore_0
    //   277: goto -62 -> 215
    //   280: astore 5
    //   282: goto -34 -> 248
    //   285: astore_3
    //   286: goto -30 -> 256
    //   289: astore_0
    //   290: aconst_null
    //   291: astore 4
    //   293: goto -55 -> 238
    //   296: astore_0
    //   297: aload 5
    //   299: astore_3
    //   300: goto -62 -> 238
    //   303: astore 6
    //   305: aconst_null
    //   306: astore_0
    //   307: goto -142 -> 165
    //   310: astore 6
    //   312: goto -147 -> 165
    //
    // Exception table:
    //   from	to	target	type
    //   10	35	159	java/lang/Throwable
    //   35	59	159	java/lang/Throwable
    //   67	76	159	java/lang/Throwable
    //   10	35	232	finally
    //   35	59	232	finally
    //   67	76	232	finally
    //   139	143	264	java/lang/Exception
    //   143	147	268	java/lang/Exception
    //   203	207	272	java/lang/Exception
    //   211	215	276	java/lang/Exception
    //   243	248	280	java/lang/Exception
    //   252	256	285	java/lang/Exception
    //   76	85	289	finally
    //   91	100	296	finally
    //   106	139	296	finally
    //   171	199	296	finally
    //   76	85	303	java/lang/Throwable
    //   91	100	310	java/lang/Throwable
    //   106	139	310	java/lang/Throwable
  }

  private static void x(int paramInt, String paramString)
  {
    AppMethodBeat.i(78684);
    com.tencent.mm.plugin.report.e.pXa.X(13328, paramInt + ",0,0,0,0,0,0,0,0,0,0,0,0," + paramString);
    AppMethodBeat.o(78684);
  }

  public final void commitNow()
  {
    AppMethodBeat.i(78679);
    long l = bo.anU();
    ab.w("MicroMsg.ClickFlowStatReceiver", "commitNow return:%s time:%d", new Object[] { (Boolean)new c.2(this, Boolean.FALSE).b(this.handler), Long.valueOf(bo.gb(l)) });
    AppMethodBeat.o(78679);
  }

  public void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(78673);
    ab.d("MicroMsg.ClickFlowStatReceiver", paramString2, paramArrayOfObject);
    AppMethodBeat.o(78673);
  }

  public void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(78675);
    ab.e("MicroMsg.ClickFlowStatReceiver", paramString2, paramArrayOfObject);
    AppMethodBeat.o(78675);
  }

  public void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(78674);
    ab.i("MicroMsg.ClickFlowStatReceiver", paramString2, paramArrayOfObject);
    AppMethodBeat.o(78674);
  }

  public void onEvent(AccessibilityCapture.Event paramEvent)
  {
    AppMethodBeat.i(78671);
    if ((paramEvent == null) || (paramEvent.view == null) || (paramEvent.activity == null))
      AppMethodBeat.o(78671);
    while (true)
    {
      return;
      if (paramEvent.activity.getComponentName() == null)
      {
        AppMethodBeat.o(78671);
      }
      else
      {
        Object localObject1 = paramEvent.activity.getComponentName().getShortClassName();
        Object localObject2 = localObject1;
        if (((String)localObject1).contains("."))
          localObject2 = ((String)localObject1).substring(((String)localObject1).lastIndexOf(".") + 1);
        if ((!this.fRE) && (!this.fRF.containsKey(localObject2)))
        {
          AppMethodBeat.o(78671);
        }
        else
        {
          localObject2 = new c.d();
          long l = System.currentTimeMillis();
          ((c.d)localObject2).fRX = Integer.toHexString(paramEvent.view.getId());
          ((c.d)localObject2).type = paramEvent.event.getEventType();
          ((c.d)localObject2).time = paramEvent.elapsedTime;
          this.fRI.add(localObject2);
          localObject1 = new int[2];
          paramEvent.view.getLocationOnScreen((int[])localObject1);
          ((c.d)localObject2).left = localObject1[0];
          ((c.d)localObject2).top = localObject1[1];
          ab.d("MicroMsg.ClickFlowStatReceiver", "[oneliang]id:" + ((c.d)localObject2).fRX + ",ui:" + paramEvent.activity.getComponentName().getShortClassName() + ",left:" + ((c.d)localObject2).left + ",top:" + ((c.d)localObject2).top + ",time:" + ((c.d)localObject2).time + ",cost:" + (System.currentTimeMillis() - l));
          AppMethodBeat.o(78671);
        }
      }
    }
  }

  public void post(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(78676);
    if (this.handler != null)
      this.handler.post(paramRunnable);
    AppMethodBeat.o(78676);
  }

  public void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(78677);
    ab.printErrStackTrace("MicroMsg.ClickFlowStatReceiver", paramThrowable, paramString2, paramArrayOfObject);
    AppMethodBeat.o(78677);
  }

  public final void v(Intent paramIntent)
  {
    AppMethodBeat.i(78680);
    if ((paramIntent == null) || (!paramIntent.getAction().equals("com.tencent.mm.Intent.ACTION_CLICK_FLOW_REPORT")))
      AppMethodBeat.o(78680);
    while (true)
    {
      return;
      this.handler.post(new c.3(this, paramIntent));
      AppMethodBeat.o(78680);
    }
  }

  public void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(78672);
    ab.v("MicroMsg.ClickFlowStatReceiver", paramString2, paramArrayOfObject);
    AppMethodBeat.o(78672);
  }

  static final class b
    implements Serializable, Comparable<b>
  {
    int czE = 0;
    long elapsedTime = 0L;
    List<c.d> fRI = null;
    String fRQ = null;
    long fRR;
    long time = 0L;

    public final String toString()
    {
      AppMethodBeat.i(78666);
      String str = String.format(Locale.getDefault(), "[%s,%d,%s]", new Object[] { this.fRQ, Integer.valueOf(this.czE), c.fR(this.time) });
      AppMethodBeat.o(78666);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c
 * JD-Core Version:    0.6.2
 */