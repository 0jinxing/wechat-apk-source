package com.tencent.mm.hardcoder;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;

public final class a
{
  public static boolean eDw = false;
  private static final int[] eDx = { 0, 1, 2, 3 };
  private static final int[] eDy = { 0, 1, 2, 3 };
  private Thread eDA;
  HardCoderJNI.HCPerfManagerThread eDB;
  LinkedBlockingQueue<Object> eDC;
  private b eDz;

  public a(HardCoderJNI.HCPerfManagerThread paramHCPerfManagerThread, Context paramContext)
  {
    AppMethodBeat.i(93954);
    this.eDC = new LinkedBlockingQueue();
    this.eDz = new b(paramContext);
    this.eDz.start();
    this.eDB = paramHCPerfManagerThread;
    this.eDA = this.eDB.newThread(new a((byte)0), "HCPerfManager", 10);
    this.eDA.start();
    c.i("HardCoder.HCPerfManager", String.format("hardcoder HCPerfManager new thread[%s]", new Object[] { this.eDA }));
    AppMethodBeat.o(93954);
  }

  public final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, int paramInt6, long paramLong, int paramInt7, String paramString)
  {
    AppMethodBeat.i(93955);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt4 < 0) || (paramInt3 < 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length <= 0) || (paramInt5 <= 0) || ((paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0) && (paramArrayOfInt.length == 1) && (paramArrayOfInt[0] == 0)))
      if (paramArrayOfInt == null)
      {
        paramInt6 = 0;
        c.e("HardCoder.HCPerfManager", String.format("start error params, ignore this task! delay:%d, [cpu:%d, io:%d, gpu:%d], bindTids:%d, timeout:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt6), Integer.valueOf(paramInt5) }));
        paramInt1 = 0;
        AppMethodBeat.o(93955);
      }
    while (true)
    {
      return paramInt1;
      paramInt6 = paramArrayOfInt.length;
      break;
      b localb = new b();
      localb.delay = paramInt1;
      localb.eDF = paramInt2;
      localb.eDH = paramInt3;
      localb.eDI = ((int[])paramArrayOfInt.clone());
      localb.eDG = paramInt4;
      localb.azs = paramInt5;
      localb.scene = paramInt6;
      localb.eDJ = paramLong;
      localb.eDM = paramInt7;
      localb.eDK = System.currentTimeMillis();
      localb.startTime = (localb.eDK + paramInt1);
      localb.eDL = (localb.eDK + paramInt1 + paramInt5);
      localb.tag = paramString;
      localb.lastUpdateTime = localb.startTime;
      boolean bool = this.eDC.offer(localb);
      c.d("HardCoder.HCPerfManager", String.format("start ret:%b ,task:%s", new Object[] { Boolean.valueOf(bool), localb.toString(localb.eDK) }));
      if (bool)
      {
        paramInt1 = localb.hashCode();
        AppMethodBeat.o(93955);
      }
      else
      {
        paramInt1 = 0;
        AppMethodBeat.o(93955);
      }
    }
  }

  final class a
    implements Runnable
  {
    private boolean running = false;

    private a()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(93950);
      c.i("HardCoder.HCPerfManager", String.format("HCPerfManager thread run start, id:%d, name:%s", new Object[] { Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName() }));
      this.running = true;
      Object localObject1 = new HashSet();
      long l1 = 30000L;
      ArrayList localArrayList = new ArrayList();
      Object localObject2 = g.PF();
      Object localObject3;
      if (localObject2 != null)
      {
        localObject3 = localObject2;
        if (localObject2.length >= 2);
      }
      else
      {
        localObject3 = new long[2];
        Object tmp94_92 = localObject3;
        tmp94_92[0] = 0L;
        Object tmp98_94 = tmp94_92;
        tmp98_94[1] = 0L;
        tmp98_94;
        c.i("HardCoder.HardCoderReporter", "process jiffes info is invalid");
      }
      c.i("HardCoder.HardCoderReporter", "process:[" + localObject3[0] + "," + localObject3[1] + "]");
      HashMap localHashMap = new HashMap();
      HashSet localHashSet1 = new HashSet();
      Object localObject5 = null;
      Object localObject6 = null;
      Object localObject7 = null;
      label1439: label4511: 
      while (true)
      {
        long l2;
        int i;
        int j;
        int k;
        Object localObject4;
        Object localObject8;
        HashSet localHashSet2;
        long l3;
        Object localObject9;
        long l4;
        long l5;
        Object localObject10;
        Object localObject11;
        label764: Object localObject13;
        label865: int m;
        if (this.running)
        {
          l2 = System.currentTimeMillis();
          i = a.a(a.this).size();
          c.d("HardCoder.HCPerfManager", "startLoop queue:" + i + " startTask:" + localArrayList.size() + " nextWakeInterval:" + l1);
          j = 0;
          while (true)
            if (i == 0)
            {
              k = 1;
              if (j >= k);
            }
            else
            {
              try
              {
                localObject3 = a.a(a.this).poll(l1, TimeUnit.MILLISECONDS);
                if (localObject3 != null)
                  if ((localObject3 instanceof a.b))
                  {
                    localArrayList.add((a.b)localObject3);
                    localHashSet1.add(Integer.valueOf(((a.b)localObject3).hashCode()));
                    j++;
                    continue;
                    k = i;
                  }
              }
              catch (Exception localException)
              {
                while (true)
                {
                  c.e("HardCoder.HCPerfManager", "taskQueue poll: " + localException.getMessage());
                  localObject4 = null;
                  continue;
                  if ((localObject4 instanceof a.c))
                  {
                    k = ((a.c)localObject4).aBR;
                    if (localHashSet1.contains(Integer.valueOf(k)))
                      localHashMap.put(Integer.valueOf(k), (a.c)localObject4);
                  }
                  else
                  {
                    if (!HardCoderJNI.isCheckEnv())
                      break;
                    Assert.fail("taskQueue poll invalid object");
                  }
                }
                this.running = false;
              }
            }
          l1 = 30000L;
          localObject4 = null;
          localObject2 = null;
          localObject8 = null;
          localHashSet2 = new HashSet();
          l3 = System.currentTimeMillis();
          c.d("HardCoder.HCPerfManager", "InLoop startSize:" + localArrayList.size());
          j = 0;
          if (j < localArrayList.size())
          {
            localObject9 = (a.b)localArrayList.get(j);
            l4 = System.currentTimeMillis();
            k = j;
            l5 = l1;
            localObject10 = localObject8;
            localObject11 = localObject2;
            Object localObject12 = localObject4;
            if (localObject9 != null)
            {
              if (localHashMap.containsKey(Integer.valueOf(localObject9.hashCode())))
              {
                ((a.b)localObject9).eDL = l4;
                ((a.b)localObject9).eDE = ((a.c)localHashMap.get(Integer.valueOf(localObject9.hashCode()))).eDE;
                localHashMap.remove(Integer.valueOf(localObject9.hashCode()));
                a.a(a.this, l4, localArrayList, -2, -2, -2, null);
                a.a(a.this, (a.b)localObject9);
              }
              l5 = ((a.b)localObject9).eDL - l4;
              if (l5 > 0L)
                break label764;
              c.d("HardCoder.HCPerfManager", "InLoop STOP:" + j + "/" + localArrayList.size() + " task:" + ((a.b)localObject9).toString(l4));
              localArrayList.remove(localObject9);
              localHashSet1.remove(Integer.valueOf(localObject9.hashCode()));
              k = j - 1;
              localObject12 = localObject4;
              localObject11 = localObject2;
              localObject10 = localObject8;
              l5 = l1;
            }
            while (true)
            {
              j = k + 1;
              l1 = l5;
              localObject8 = localObject10;
              localObject2 = localObject11;
              localObject4 = localObject12;
              break;
              l1 = Math.min(l1, l5);
              l5 = ((a.b)localObject9).startTime - l4;
              if (l5 <= 0L)
                break label865;
              c.d("HardCoder.HCPerfManager", "InLoop WAIT:" + j + "/" + localArrayList.size() + " task:" + ((a.b)localObject9).toString(l4));
              l5 = Math.min(l1, l5);
              k = j;
              localObject10 = localObject8;
              localObject11 = localObject2;
              localObject12 = localObject4;
            }
            c.d("HardCoder.HCPerfManager", "InLoop RUN:" + j + "/" + localArrayList.size() + " task:" + ((a.b)localObject9).toString(l4));
            localObject13 = localObject4;
            if (((a.b)localObject9).eDF > 0)
              if ((localObject4 != null) && (localObject4.eDF <= ((a.b)localObject9).eDF))
              {
                localObject13 = localObject4;
                if (localObject4.eDF == ((a.b)localObject9).eDF)
                {
                  localObject13 = localObject4;
                  if (localObject4.eDL >= ((a.b)localObject9).eDL);
                }
              }
              else
              {
                localObject13 = localObject9;
              }
            localObject4 = localObject2;
            if (((a.b)localObject9).eDG > 0)
              if ((localObject2 != null) && (((a.b)localObject2).eDG <= ((a.b)localObject9).eDG))
              {
                localObject4 = localObject2;
                if (((a.b)localObject2).eDG == ((a.b)localObject9).eDG)
                {
                  localObject4 = localObject2;
                  if (((a.b)localObject2).eDL >= ((a.b)localObject9).eDL);
                }
              }
              else
              {
                localObject4 = localObject9;
              }
            localObject2 = localObject8;
            if (((a.b)localObject9).eDH > 0)
              if ((localObject8 != null) && (((a.b)localObject8).eDH <= ((a.b)localObject9).eDH))
              {
                localObject2 = localObject8;
                if (((a.b)localObject8).eDH == ((a.b)localObject9).eDH)
                {
                  localObject2 = localObject8;
                  if (((a.b)localObject8).eDL >= ((a.b)localObject9).eDL);
                }
              }
              else
              {
                localObject2 = localObject9;
              }
            localObject8 = ((a.b)localObject9).eDI;
            m = localObject8.length;
            for (i = 0; ; i++)
            {
              k = j;
              l5 = l1;
              localObject10 = localObject2;
              localObject11 = localObject4;
              localObject12 = localObject13;
              if (i >= m)
                break;
              if (localObject8[i] > 0)
              {
                localHashSet2.add(localObject9);
                k = j;
                l5 = l1;
                localObject10 = localObject2;
                localObject11 = localObject4;
                localObject12 = localObject13;
                break;
              }
            }
          }
          l4 = System.currentTimeMillis();
          c.d("HardCoder.HCPerfManager", String.format("EndLoop time:[%d,%d] list:%d stop:%d bindCore:%d -> %d", new Object[] { Long.valueOf(l4 - l3), Long.valueOf(l4 - l2), Integer.valueOf(localArrayList.size()), Integer.valueOf(localHashMap.size()), Integer.valueOf(((HashSet)localObject1).size()), Integer.valueOf(localHashSet2.size()) }));
          localObject13 = new StringBuilder("EndLoop CurrCpu:");
          if (localObject7 == null)
          {
            localObject9 = "null";
            label1315: localObject13 = ((StringBuilder)localObject13).append((String)localObject9).append(" -> MaxCpu:");
            if (localObject4 != null)
              break label1603;
            localObject9 = "null";
            label1340: c.d("HardCoder.HCPerfManager", (String)localObject9);
            localObject13 = new StringBuilder("EndLoop CurrGpu:");
            if (localObject6 != null)
              break label1615;
            localObject9 = "null";
            label1377: localObject13 = ((StringBuilder)localObject13).append((String)localObject9).append(" -> MaxGpu:");
            if (localObject6 != null)
              break label1627;
            localObject9 = "null";
            label1402: c.d("HardCoder.HCPerfManager", (String)localObject9);
            localObject13 = new StringBuilder("EndLoop CurrIO:");
            if (localObject5 != null)
              break label1639;
            localObject9 = "null";
            localObject13 = ((StringBuilder)localObject13).append((String)localObject9).append(" -> MaxIO:");
            if (localObject8 != null)
              break label1651;
          }
          label1603: label1615: label1627: label1639: label1651: for (localObject9 = "null"; ; localObject9 = ((a.b)localObject8).toString(l3))
          {
            c.d("HardCoder.HCPerfManager", (String)localObject9);
            c.d("HardCoder.HCPerfManager", String.format("EndLoop BindCore.size cur: %d, need: %d", new Object[] { Integer.valueOf(((HashSet)localObject1).size()), Integer.valueOf(localHashSet2.size()) }));
            localObject10 = new HashSet();
            ((HashSet)localObject10).addAll((Collection)localObject1);
            ((HashSet)localObject10).removeAll(localHashSet2);
            if ((localObject4 != localObject7) || (localObject2 != localObject6) || (localObject8 != localObject5) || (((HashSet)localObject1).size() != localHashSet2.size()) || (!((HashSet)localObject10).isEmpty()))
              break label1663;
            c.d("HardCoder.HCPerfManager", "EndLoop Nothing Changed, Continue.");
            break;
            localObject9 = ((a.b)localObject7).toString(l3);
            break label1315;
            localObject9 = localObject4.toString(l3);
            break label1340;
            localObject9 = ((a.b)localObject6).toString(l3);
            break label1377;
            localObject9 = ((a.b)localObject6).toString(l3);
            break label1402;
            localObject9 = ((a.b)localObject5).toString(l3);
            break label1439;
          }
          label1663: localObject9 = ((HashSet)localObject10).iterator();
          j = 0;
          if (((Iterator)localObject9).hasNext())
          {
            localObject1 = (a.b)((Iterator)localObject9).next();
            if (((a.b)localObject1).eDI == null)
              break label4544;
            j = ((a.b)localObject1).eDI.length + j;
          }
        }
        label1971: label2874: label3903: label4544: 
        while (true)
        {
          break label1673;
          if (j > 0)
          {
            localObject1 = new int[j];
            localObject9 = ((HashSet)localObject10).iterator();
            j = 0;
            label1734: 
            while (((Iterator)localObject9).hasNext())
            {
              localObject13 = (a.b)((Iterator)localObject9).next();
              l5 = System.currentTimeMillis();
              c.i("HardCoder.HCPerfManager", "!cancelBindCore task:" + ((a.b)localObject13).toString(l5));
              if (((a.b)localObject13).eDL > l5)
              {
                c.e("HardCoder.HCPerfManager", "stopTime:" + (((a.b)localObject13).eDL - l5) + ". Error !");
              }
              else
              {
                if (!((a.b)localObject13).PD())
                {
                  if (HardCoderJNI.isCheckEnv())
                    Assert.fail("bindTids:" + ((a.b)localObject13).PE());
                }
                else
                {
                  localObject13 = ((a.b)localObject13).eDI;
                  i = localObject13.length;
                  for (k = 0; k < i; k++)
                  {
                    localObject1[j] = localObject13[k];
                    j++;
                  }
                }
                this.running = false;
              }
            }
            if ((!a.eDw) && (HardCoderJNI.isCheckEnv()))
              HardCoderJNI.cancelCpuCoreForThread((int[])localObject1, Process.myTid(), SystemClock.elapsedRealtimeNanos());
            a.a(a.this, l3, localArrayList, -2, -2, -2, null);
          }
          localObject1 = localHashSet2.iterator();
          j = 0;
          if (((Iterator)localObject1).hasNext())
          {
            localObject9 = (a.b)((Iterator)localObject1).next();
            if (((a.b)localObject9).eDI == null)
              break label4541;
            j = ((a.b)localObject9).eDI.length + j;
          }
          while (true)
          {
            break label1971;
            break label1734;
            localObject11 = new int[j];
            localObject9 = localHashSet2.iterator();
            m = 0;
            l5 = 0L;
            i = 0;
            j = 2147483647;
            k = 0;
            while (((Iterator)localObject9).hasNext())
            {
              localObject13 = (a.b)((Iterator)localObject9).next();
              c.i("HardCoder.HCPerfManager", "requestBindCore task:" + ((a.b)localObject13).toString(l3));
              l2 = System.currentTimeMillis();
              if (((a.b)localObject13).eDL <= l2)
              {
                c.e("HardCoder.HCPerfManager", "stopTime:" + (((a.b)localObject13).eDL - l2) + ". Error !");
              }
              else
              {
                if (!((a.b)localObject13).PD())
                {
                  if (HardCoderJNI.isCheckEnv())
                    Assert.fail("bindTids:" + ((a.b)localObject13).PE());
                }
                else
                {
                  localObject1 = ((a.b)localObject13).eDI;
                  i = localObject1.length;
                  for (k = 0; k < i; k++)
                  {
                    localObject11[m] = localObject1[k];
                    m++;
                  }
                }
                this.running = false;
              }
            }
            if (localObject8 == null)
            {
              if (localObject5 != null)
              {
                c.i("HardCoder.HCPerfManager", "!cancelHighIOFreq task:" + ((a.b)localObject5).toString(l3));
                if ((!a.eDw) && (HardCoderJNI.isCheckEnv()))
                  HardCoderJNI.cancelHighIOFreq(((a.b)localObject5).eDM, SystemClock.elapsedRealtimeNanos());
                a.a(a.this, l3, localArrayList, -2, -2, -1, null);
              }
              if (localObject8 == null)
                break label4535;
              m = ((a.b)localObject8).eDH;
              i = ((a.b)localObject8).scene;
              l5 = ((a.b)localObject8).eDJ;
              k = ((a.b)localObject8).eDM;
              j = Math.min((int)(((a.b)localObject8).eDL - l3), j);
            }
            while (true)
            {
              int n;
              if (localObject2 == null)
              {
                if (localObject6 != null)
                {
                  c.i("HardCoder.HCPerfManager", "!cancelGpuHighFreq task:" + ((a.b)localObject6).toString(l3));
                  if ((!a.eDw) && (HardCoderJNI.isCheckEnv()))
                    HardCoderJNI.cancelGpuHighFreq(((a.b)localObject6).eDM, SystemClock.elapsedRealtimeNanos());
                  a.a(a.this, l3, localArrayList, -2, -1, -2, null);
                }
                if (localObject2 == null)
                  break label4529;
                n = ((a.b)localObject2).eDG;
                i = ((a.b)localObject2).scene;
                l5 = ((a.b)localObject2).eDJ;
                k = ((a.b)localObject2).eDM;
                j = Math.min((int)(((a.b)localObject2).eDL - l3), j);
              }
              while (true)
              {
                int i1;
                if (localObject4 == null)
                {
                  if (localObject7 != null)
                  {
                    c.i("HardCoder.HCPerfManager", "!cancelCpuHighFreq task:" + ((a.b)localObject7).toString(l3));
                    if ((!a.eDw) && (HardCoderJNI.isCheckEnv()))
                      HardCoderJNI.cancelCpuHighFreq(((a.b)localObject7).eDM, SystemClock.elapsedRealtimeNanos());
                    a.a(a.this, l3, localArrayList, -1, -2, -2, null);
                  }
                  if (localObject4 == null)
                    break label4511;
                  k = localObject4.eDF;
                  i1 = localObject4.scene;
                  l5 = localObject4.eDJ;
                  i = localObject4.eDM;
                  j = Math.min((int)(localObject4.eDL - l3), j);
                }
                while (true)
                {
                  if (j < 2147483647)
                  {
                    i2 = localObject11.length;
                    if (localObject4 == null)
                    {
                      localObject7 = "null";
                      label2638: if (localObject2 != null)
                        break label3891;
                      localObject6 = "null";
                      label2648: if (localObject8 != null)
                        break label3903;
                      localObject5 = "null";
                      label2658: if (localObject4 != null)
                        break label3915;
                      localObject1 = "null";
                      label2667: if (localObject2 != null)
                        break label3926;
                      localObject9 = "null";
                      label2677: if (localObject8 != null)
                        break label3938;
                      localObject13 = "null";
                      label2687: c.i("HardCoder.HCPerfManager", String.format("!UnifyRequest [%d,%d,%d] [%d,%d,%d,%d] TO:%d max CPU:%s GPU:%s IO:%s cur CPU:%s GPU:%s IO:%s", new Object[] { Integer.valueOf(i1), Long.valueOf(l5), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(i2), Integer.valueOf(j), localObject7, localObject6, localObject5, localObject1, localObject9, localObject13 }));
                      if (j <= 0)
                        break label3950;
                      bool1 = true;
                      label2812: Assert.assertTrue(bool1);
                      if ((i1 <= 0) && (l5 <= 0L))
                        break label3956;
                      bool1 = true;
                      Assert.assertTrue(bool1);
                      if (i <= 0)
                        break label3962;
                      bool1 = true;
                      Assert.assertTrue(bool1);
                      if ((k <= 0) && (n <= 0) && (m <= 0) && (localObject11.length <= 0))
                        break label3968;
                      bool1 = true;
                      Assert.assertTrue(bool1);
                      if ((!a.eDw) && (HardCoderJNI.isCheckEnv()))
                      {
                        HardCoderJNI.requestUnifyCpuIOThreadCoreGpu(i1, l5, k, n, m, (int[])localObject11, j, i, SystemClock.elapsedRealtimeNanos());
                        boolean bool2 = HardCoderJNI.isHcEnable();
                        if ((!HardCoderJNI.isCheckEnv()) || (HardCoderJNI.isRunning() <= 0))
                          break label3974;
                        bool1 = true;
                        label2934: c.i("HardCoder.HCPerfManager", String.format("hardcoder requestUnifyCpuIOThreadCoreGpu reqScene[%d, %d] running[j %b, c %b]", new Object[] { Integer.valueOf(i1), Long.valueOf(l5), Boolean.valueOf(bool2), Boolean.valueOf(bool1) }));
                        if (HardCoderJNI.sceneReportCallback != null)
                          HardCoderJNI.sceneReportCallback.sceneReport(i1, l5);
                      }
                      a.a(a.this, l3, localArrayList, k, n, m, (int[])localObject11);
                    }
                  }
                  else
                  {
                    if (!a.eDw)
                      break label4547;
                    if (localObject4 != localObject4)
                      break label3980;
                    bool1 = true;
                    label3034: Assert.assertTrue(bool1);
                    if (localObject8 != localObject8)
                      break label3986;
                    bool1 = true;
                    label3049: Assert.assertTrue(bool1);
                    if (localArrayList.isEmpty())
                    {
                      if (l1 != 30000L)
                        break label3992;
                      bool1 = true;
                      Assert.assertTrue(bool1);
                      if (j != 2147483647)
                        break label3998;
                      bool1 = true;
                      Assert.assertTrue(bool1);
                      Assert.assertTrue(localHashSet2.isEmpty());
                      if (localObject4 != null)
                        break label4004;
                      bool1 = true;
                      Assert.assertTrue(bool1);
                      if (localObject2 != null)
                        break label4010;
                      bool1 = true;
                      Assert.assertTrue(bool1);
                      if (localObject8 != null)
                        break label4016;
                      bool1 = true;
                      label3136: Assert.assertTrue(bool1);
                    }
                    i = 0;
                    label3144: if (i >= localArrayList.size())
                      break label4479;
                    localObject7 = (a.b)localArrayList.get(i);
                    c.d("HardCoder.HCPerfManager", "CheckTask:" + i + "/" + localArrayList.size() + " task:" + ((a.b)localObject7).toString(l3));
                    if ((((a.b)localObject7).eDF <= 0) && (((a.b)localObject7).eDG <= 0) && (((a.b)localObject7).eDH <= 0) && (!((a.b)localObject7).PD()))
                      break label4022;
                    bool1 = true;
                    Assert.assertTrue(bool1);
                    if ((((a.b)localObject7).eDJ <= 0L) && (((a.b)localObject7).scene <= 0))
                      break label4028;
                    bool1 = true;
                    label3278: Assert.assertTrue(bool1);
                    localObject6 = "taskInintTime:" + (((a.b)localObject7).eDK - l3);
                    if (((a.b)localObject7).eDK > l3)
                      break label4034;
                    bool1 = true;
                    label3323: Assert.assertTrue((String)localObject6, bool1);
                    localObject6 = "taskStopTime:" + (((a.b)localObject7).eDL - l3);
                    if (((a.b)localObject7).eDL < l3)
                      break label4040;
                    bool1 = true;
                    Assert.assertTrue((String)localObject6, bool1);
                    localObject6 = "taskHash:" + localObject7.hashCode();
                    if (localHashMap.containsKey(Integer.valueOf(localObject7.hashCode())))
                      break label4046;
                    bool1 = true;
                    label3419: Assert.assertTrue((String)localObject6, bool1);
                    if (((a.b)localObject7).startTime <= l3)
                      break label4082;
                    if (localObject7 == localObject4)
                      break label4052;
                    bool1 = true;
                    label3447: Assert.assertTrue(bool1);
                    if (localObject7 == localObject2)
                      break label4058;
                    bool1 = true;
                    Assert.assertTrue(bool1);
                    if (localObject7 == localObject8)
                      break label4064;
                    bool1 = true;
                    Assert.assertTrue(bool1);
                    if (localHashSet2.contains(localObject7))
                      break label4070;
                    bool1 = true;
                    Assert.assertTrue(bool1);
                    localObject6 = "next:" + l1 + " start:" + (((a.b)localObject7).startTime - l3);
                    if (l1 > ((a.b)localObject7).startTime - l3)
                      break label4076;
                    bool1 = true;
                    label3552: Assert.assertTrue((String)localObject6, bool1);
                  }
                  label3915: label3926: label3938: label3950: label3956: label3962: 
                  do
                  {
                    i++;
                    break label3144;
                    i = ((a.b)localObject13).scene;
                    l5 = ((a.b)localObject13).eDJ;
                    k = ((a.b)localObject13).eDM;
                    j = Math.min((int)(((a.b)localObject13).eDL - l3), j);
                    break;
                    if (localObject5 == localObject8)
                      break label2310;
                    localObject1 = new StringBuilder("IOReq:");
                    if (localObject5 == null);
                    for (localObject5 = "null"; ; localObject5 = ((a.b)localObject5).toString(l3))
                    {
                      c.d("HardCoder.HCPerfManager", (String)localObject5 + " -> " + ((a.b)localObject8).toString(l3) + " delay:" + (l4 - ((a.b)localObject8).startTime));
                      break;
                    }
                    if (localObject6 == localObject2)
                      break label2438;
                    localObject5 = new StringBuilder("GPUReq:");
                    if (localObject6 == null);
                    for (localObject6 = "null"; ; localObject6 = ((a.b)localObject6).toString(l3))
                    {
                      c.d("HardCoder.HCPerfManager", (String)localObject6 + " -> " + ((a.b)localObject2).toString(l3) + " delay:" + (l4 - ((a.b)localObject2).startTime));
                      break;
                    }
                    if (localObject7 == localObject4)
                      break label2566;
                    localObject6 = new StringBuilder("CPUReq:");
                    if (localObject7 == null);
                    for (localObject7 = "null"; ; localObject7 = ((a.b)localObject7).toString(l3))
                    {
                      c.d("HardCoder.HCPerfManager", (String)localObject7 + " -> " + localObject4.toString(l3) + " delay:" + (l4 - localObject4.startTime));
                      break;
                    }
                    localObject7 = localObject4.toString(l3);
                    break label2638;
                    localObject6 = ((a.b)localObject2).toString(l3);
                    break label2648;
                    localObject5 = ((a.b)localObject8).toString(l3);
                    break label2658;
                    localObject1 = localObject4.toString(l3);
                    break label2667;
                    localObject9 = ((a.b)localObject2).toString(l3);
                    break label2677;
                    localObject13 = ((a.b)localObject8).toString(l3);
                    break label2687;
                    bool1 = false;
                    break label2812;
                    bool1 = false;
                    break label2832;
                    bool1 = false;
                    break label2845;
                    bool1 = false;
                    break label2874;
                    bool1 = false;
                    break label2934;
                    bool1 = false;
                    break label3034;
                    bool1 = false;
                    break label3049;
                    bool1 = false;
                    break label3073;
                    bool1 = false;
                    break label3089;
                    bool1 = false;
                    break label3110;
                    bool1 = false;
                    break label3123;
                    bool1 = false;
                    break label3136;
                    bool1 = false;
                    break label3252;
                    bool1 = false;
                    break label3278;
                    bool1 = false;
                    break label3323;
                    bool1 = false;
                    break label3370;
                    bool1 = false;
                    break label3419;
                    bool1 = false;
                    break label3447;
                    bool1 = false;
                    break label3462;
                    bool1 = false;
                    break label3477;
                    bool1 = false;
                    break label3495;
                    bool1 = false;
                    break label3552;
                    localObject6 = "nextWake:" + l1 + " stop:" + (((a.b)localObject7).eDL - l3);
                    if (l1 > ((a.b)localObject7).eDL - l3)
                      break label4437;
                    bool1 = true;
                    Assert.assertTrue((String)localObject6, bool1);
                    localObject6 = "reqTimeStamp:".concat(String.valueOf(j));
                    if ((j <= 0) || (j >= 2147483647))
                      break label4443;
                    bool1 = true;
                    Assert.assertTrue((String)localObject6, bool1);
                    localObject6 = "reqTimeStamp:" + j + " stop:" + (((a.b)localObject7).eDL - l3);
                    if (j > ((a.b)localObject7).eDL - l3)
                      break label4449;
                    bool1 = true;
                    Assert.assertTrue((String)localObject6, bool1);
                    localObject6 = "reqCpu:" + k + " task:" + ((a.b)localObject7).eDF;
                    if (k > ((a.b)localObject7).eDF)
                      break label4455;
                    bool1 = true;
                    Assert.assertTrue((String)localObject6, bool1);
                    localObject6 = "reqCpu:" + n + " task:" + ((a.b)localObject7).eDG;
                    if (n > ((a.b)localObject7).eDG)
                      break label4461;
                    bool1 = true;
                    Assert.assertTrue((String)localObject6, bool1);
                    localObject6 = "reqIO:" + m + " task:" + ((a.b)localObject7).eDH;
                    if (m > ((a.b)localObject7).eDH)
                      break label4467;
                    bool1 = true;
                    Assert.assertTrue((String)localObject6, bool1);
                  }
                  while (!((a.b)localObject7).PD());
                  label4034: label4040: label4046: label4052: label4058: label4064: label4070: label4076: label4082: label4338: Assert.assertTrue(localHashSet2.contains(localObject7));
                  label4170: if (!((HashSet)localObject10).contains(localObject7));
                  for (boolean bool1 = true; ; bool1 = false)
                  {
                    Assert.assertTrue(bool1);
                    break;
                    label4437: bool1 = false;
                    break label4134;
                    label4443: bool1 = false;
                    break label4170;
                    label4449: bool1 = false;
                    break label4232;
                    label4455: bool1 = false;
                    break label4285;
                    label4461: bool1 = false;
                    break label4338;
                    label4467: bool1 = false;
                    break label4391;
                  }
                  label4479: localObject1 = localHashSet2;
                  localObject5 = localObject8;
                  localObject6 = localObject2;
                  localObject7 = localObject4;
                  break;
                  c.i("HardCoder.HCPerfManager", "HCPerfManager thread run end");
                  AppMethodBeat.o(93950);
                  return;
                  i1 = i;
                  int i2 = 0;
                  i = k;
                  k = i2;
                }
                n = 0;
              }
              m = 0;
            }
          }
        }
        label3110: label3123: label3252: label4022: label4028: label4285: label4547: localObject1 = localHashSet2;
        label3370: label3891: label4535: label4541: localObject5 = localObject8;
        label3495: label4010: label4016: label4529: localObject6 = localObject2;
        label4004: label4134: label4391: localObject7 = localObject4;
      }
    }
  }

  public static final class b
  {
    public int azs;
    public int delay;
    public long eDE;
    public int eDF;
    public int eDG;
    public int eDH;
    public int[] eDI;
    public long eDJ;
    public long eDK;
    public long eDL;
    public int eDM;
    public int eDN;
    public int eDO;
    public int[] eDP;
    public int[] eDQ;
    public int[] eDR;
    public long[] eDS;
    public long[] eDT;
    public long eDU;
    public int eDV;
    public long eDW;
    public f.a eDX;
    public f.a eDY;
    public long lastUpdateTime;
    public int scene;
    public long startTime;
    public String tag;

    public b()
    {
      AppMethodBeat.i(93951);
      this.eDE = 0L;
      this.delay = 0;
      this.azs = 0;
      this.eDF = 0;
      this.eDG = 0;
      this.eDH = 0;
      this.eDI = null;
      this.scene = 0;
      this.eDJ = 0L;
      this.startTime = 0L;
      this.eDK = 0L;
      this.eDL = 0L;
      this.eDM = 0;
      this.eDN = 0;
      this.eDO = 0;
      this.lastUpdateTime = 0L;
      this.eDP = new int[a.PC().length];
      this.eDQ = new int[a.eDy.length];
      this.eDR = null;
      this.eDS = null;
      this.eDT = null;
      this.eDU = 0L;
      this.eDV = 0;
      this.eDW = 0L;
      this.eDX = null;
      this.eDY = null;
      AppMethodBeat.o(93951);
    }

    public final boolean PD()
    {
      boolean bool1 = true;
      boolean bool2;
      if ((this.eDI != null) && (this.eDI.length > 0))
      {
        bool2 = bool1;
        if (this.eDI.length == 1)
        {
          bool2 = bool1;
          if (this.eDI[0] > 0);
        }
      }
      else
      {
        bool2 = false;
      }
      return bool2;
    }

    public final String PE()
    {
      AppMethodBeat.i(93953);
      if (PD())
      {
        StringBuilder localStringBuilder = new StringBuilder("[");
        for (int k : this.eDI)
          localStringBuilder.append(k + " ");
        localStringBuilder.append("]");
        ??? = localStringBuilder.toString();
        AppMethodBeat.o(93953);
      }
      while (true)
      {
        return ???;
        ??? = "[ ]";
        AppMethodBeat.o(93953);
      }
    }

    public final String toString(long paramLong)
    {
      AppMethodBeat.i(93952);
      String str = String.format("hashCode:%x time:[init:%d,start:%d,stop:%d][delay:%d,timeout:%d][scene:%d,action:%d,callerTid:%d][cpu:%d,io:%d,gpu:%d] bindTids:%s [TAG:%s]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.eDK - paramLong), Long.valueOf(this.startTime - paramLong), Long.valueOf(this.eDL - paramLong), Integer.valueOf(this.delay), Integer.valueOf(this.azs), Integer.valueOf(this.scene), Long.valueOf(this.eDJ), Integer.valueOf(this.eDM), Integer.valueOf(this.eDF), Integer.valueOf(this.eDH), Integer.valueOf(this.eDG), PE(), this.tag });
      AppMethodBeat.o(93952);
      return str;
    }
  }

  static final class c
  {
    public int aBR = 0;
    public long eDE = 0L;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.a
 * JD-Core Version:    0.6.2
 */