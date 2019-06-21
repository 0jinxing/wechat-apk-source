package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.h.d;
import com.tencent.mm.plugin.sns.h.f;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.protocal.protobuf.cao;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public final class ad
{
  String ecX;
  private String path;
  private Map<String, Integer> qKA;
  private List<Integer> qKB;
  private Map<Integer, Integer> qKC;
  private d qKy;
  private List<Integer> qKz;

  public ad(String paramString)
  {
    AppMethodBeat.i(36383);
    this.ecX = "";
    this.qKz = new Vector();
    this.qKA = new HashMap();
    this.qKB = new Vector();
    this.qKC = new HashMap();
    this.path = paramString;
    if (!cnh())
      this.qKy = new d();
    this.qKz.clear();
    this.qKA.clear();
    AppMethodBeat.o(36383);
  }

  public static boolean XT(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(36382);
    if (paramString == null)
      AppMethodBeat.o(36382);
    while (true)
    {
      return bool;
      if (paramString.startsWith("_AD_TAG_"))
      {
        bool = true;
        AppMethodBeat.o(36382);
      }
      else
      {
        AppMethodBeat.o(36382);
      }
    }
  }

  private static void a(long paramLong, LinkedList<com.tencent.mm.plugin.sns.h.e> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(36396);
    a(paramLong, paramLinkedList, paramString, false);
    AppMethodBeat.o(36396);
  }

  private static boolean a(long paramLong, LinkedList<com.tencent.mm.plugin.sns.h.e> paramLinkedList, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(36397);
    Iterator localIterator = paramLinkedList.iterator();
    com.tencent.mm.plugin.sns.h.e locale1;
    do
    {
      do
      {
        if (!localIterator.hasNext())
          break;
        locale1 = (com.tencent.mm.plugin.sns.h.e)localIterator.next();
      }
      while (locale1.qIS.vQE != paramLong);
      locale2 = locale1;
      if (paramBoolean)
        break;
    }
    while (!locale1.qQm.equals(paramString));
    for (com.tencent.mm.plugin.sns.h.e locale2 = locale1; ; locale2 = null)
    {
      if (locale2 != null)
      {
        paramLinkedList.remove(locale2);
        paramBoolean = true;
        AppMethodBeat.o(36397);
      }
      while (true)
      {
        return paramBoolean;
        paramBoolean = false;
        AppMethodBeat.o(36397);
      }
    }
  }

  private static boolean a(LinkedList<cat> paramLinkedList, String paramString, int paramInt)
  {
    AppMethodBeat.i(36389);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(36389);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramLinkedList = paramLinkedList.iterator();
      while (true)
        if (paramLinkedList.hasNext())
        {
          cat localcat = (cat)paramLinkedList.next();
          if ((paramString.equals(localcat.ncM)) && (paramInt == localcat.pcX))
          {
            AppMethodBeat.o(36389);
            bool = true;
            break;
          }
        }
      bool = false;
      AppMethodBeat.o(36389);
    }
  }

  private static boolean aq(LinkedList<com.tencent.mm.plugin.sns.h.e> paramLinkedList)
  {
    AppMethodBeat.i(36385);
    com.tencent.mm.plugin.sns.h.e locale;
    boolean bool;
    while (true)
      if (!paramLinkedList.isEmpty())
      {
        locale = (com.tencent.mm.plugin.sns.h.e)paramLinkedList.getFirst();
        if (bo.fp(locale.qQn) > 21600L)
        {
          paramLinkedList.removeFirst();
        }
        else if (XT(locale.qQm))
        {
          g.RQ();
          g.RO().eJo.a(new k(locale.qIS, locale.qQm, locale.qQo), 0);
          bool = true;
          AppMethodBeat.o(36385);
        }
      }
    while (true)
    {
      return bool;
      g.RQ();
      g.RO().eJo.a(new o(locale.qIS, locale.qQm), 0);
      break;
      AppMethodBeat.o(36385);
      bool = false;
    }
  }

  public static cat b(cao paramcao)
  {
    AppMethodBeat.i(36391);
    can localcan = paramcao.wZN;
    paramcao = paramcao.wZO;
    cat localcat = new cat();
    localcat.ncM = localcan.ncM;
    localcat.pcX = localcan.pcX;
    localcat.wCW = localcan.wZD;
    localcat.vFH = localcan.vFH;
    localcat.jCt = localcan.jCt;
    localcat.vHl = localcan.wPm;
    localcat.wZG = localcan.wZG;
    localcat.wZJ = localcan.wZJ;
    localcat.wZL = localcan.wZL;
    localcat.xaa = paramcao.wPm;
    localcat.wZI = paramcao.wZI;
    localcat.wZF = paramcao.wZF;
    AppMethodBeat.o(36391);
    return localcat;
  }

  private boolean cng()
  {
    try
    {
      AppMethodBeat.i(36400);
      try
      {
        byte[] arrayOfByte = this.qKy.toByteArray();
        if (com.tencent.mm.vfs.e.b(this.path, arrayOfByte, arrayOfByte.length) == 0)
        {
          bool = true;
          AppMethodBeat.o(36400);
        }
        while (true)
        {
          return bool;
          AppMethodBeat.o(36400);
          bool = false;
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("listToFile failed: ");
          ab.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", localIOException, this.path, new Object[0]);
          com.tencent.mm.vfs.e.deleteFile(this.path);
          AppMethodBeat.o(36400);
          boolean bool = false;
        }
      }
    }
    finally
    {
    }
  }

  // ERROR //
  private boolean cnh()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 300
    //   5: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 50	com/tencent/mm/plugin/sns/model/ad:path	Ljava/lang/String;
    //   12: iconst_0
    //   13: iconst_m1
    //   14: invokestatic 304	com/tencent/mm/vfs/e:e	(Ljava/lang/String;II)[B
    //   17: astore_1
    //   18: aload_1
    //   19: ifnonnull +15 -> 34
    //   22: ldc_w 300
    //   25: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: iconst_0
    //   29: istore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_2
    //   33: ireturn
    //   34: new 56	com/tencent/mm/plugin/sns/h/d
    //   37: astore_3
    //   38: aload_3
    //   39: invokespecial 57	com/tencent/mm/plugin/sns/h/d:<init>	()V
    //   42: aload_0
    //   43: aload_3
    //   44: aload_1
    //   45: invokevirtual 308	com/tencent/mm/plugin/sns/h/d:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   48: checkcast 56	com/tencent/mm/plugin/sns/h/d
    //   51: putfield 59	com/tencent/mm/plugin/sns/model/ad:qKy	Lcom/tencent/mm/plugin/sns/h/d;
    //   54: iconst_1
    //   55: istore_2
    //   56: ldc_w 300
    //   59: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: goto -32 -> 30
    //   65: astore_3
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_3
    //   69: athrow
    //   70: astore_3
    //   71: ldc_w 282
    //   74: aload_3
    //   75: ldc 32
    //   77: iconst_0
    //   78: anewarray 4	java/lang/Object
    //   81: invokestatic 296	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_0
    //   85: getfield 50	com/tencent/mm/plugin/sns/model/ad:path	Ljava/lang/String;
    //   88: invokestatic 299	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   91: pop
    //   92: ldc_w 300
    //   95: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: iconst_0
    //   99: istore_2
    //   100: goto -70 -> 30
    //
    // Exception table:
    //   from	to	target	type
    //   2	18	65	finally
    //   22	28	65	finally
    //   34	54	65	finally
    //   56	62	65	finally
    //   71	98	65	finally
    //   34	54	70	java/io/IOException
  }

  private void f(long paramLong, int paramInt, String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(36395);
        switch (paramInt)
        {
        case 4:
        case 6:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        default:
          cng();
          AppMethodBeat.o(36395);
          return;
        case 1:
          a(paramLong, this.qKy.qQg, paramString);
          continue;
        case 2:
        case 7:
        case 8:
        case 16:
        case 3:
        case 5:
        }
      }
      finally
      {
      }
      a(paramLong, this.qKy.qQh, paramString);
      continue;
      a(paramLong, this.qKy.qQg, paramString);
      continue;
      a(paramLong, this.qKy.qQh, paramString);
      continue;
      a(paramLong, this.qKy.qQi, paramString);
      continue;
      a(paramLong, this.qKy.qQj, paramString);
    }
  }

  public final boolean CR(int paramInt)
  {
    try
    {
      AppMethodBeat.i(36402);
      boolean bool = this.qKz.contains(Integer.valueOf(paramInt));
      AppMethodBeat.o(36402);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean CS(int paramInt)
  {
    try
    {
      AppMethodBeat.i(36403);
      boolean bool;
      if (this.qKz.contains(Integer.valueOf(paramInt)))
      {
        bool = false;
        AppMethodBeat.o(36403);
      }
      while (true)
      {
        return bool;
        this.qKz.add(Integer.valueOf(paramInt));
        bool = true;
        AppMethodBeat.o(36403);
      }
    }
    finally
    {
    }
  }

  public final boolean CT(int paramInt)
  {
    try
    {
      AppMethodBeat.i(36404);
      this.qKz.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(36404);
      return true;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean CU(int paramInt)
  {
    try
    {
      AppMethodBeat.i(36409);
      boolean bool;
      if (this.qKB.contains(Integer.valueOf(paramInt)))
      {
        bool = false;
        AppMethodBeat.o(36409);
      }
      while (true)
      {
        return bool;
        this.qKB.add(Integer.valueOf(paramInt));
        bool = true;
        AppMethodBeat.o(36409);
      }
    }
    finally
    {
    }
  }

  public final boolean CV(int paramInt)
  {
    try
    {
      AppMethodBeat.i(36410);
      this.qKB.remove(Integer.valueOf(paramInt));
      this.qKC.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(36410);
      return true;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean CW(int paramInt)
  {
    try
    {
      AppMethodBeat.i(36412);
      this.qKC.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(36412);
      return true;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int CX(int paramInt)
  {
    try
    {
      AppMethodBeat.i(36413);
      if (this.qKC.containsKey(Integer.valueOf(paramInt)))
      {
        paramInt = ((Integer)this.qKC.get(Integer.valueOf(paramInt))).intValue();
        AppMethodBeat.o(36413);
      }
      while (true)
      {
        return paramInt;
        paramInt = -1;
        AppMethodBeat.o(36413);
      }
    }
    finally
    {
    }
  }

  public final boolean XU(String paramString)
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(36406);
      if (this.qKA.containsKey(paramString))
        AppMethodBeat.o(36406);
      while (true)
      {
        return bool;
        this.qKA.put(paramString, Integer.valueOf(0));
        bool = true;
        AppMethodBeat.o(36406);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final boolean XV(String paramString)
  {
    try
    {
      AppMethodBeat.i(36407);
      this.qKA.remove(paramString);
      AppMethodBeat.o(36407);
      return true;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final boolean a(String paramString, cao paramcao)
  {
    AppMethodBeat.i(36392);
    boolean bool = a(paramString, paramcao, "");
    AppMethodBeat.o(36392);
    return bool;
  }

  public final boolean a(String paramString1, cao paramcao, String paramString2)
  {
    boolean bool1 = true;
    while (true)
    {
      com.tencent.mm.plugin.sns.h.e locale;
      try
      {
        AppMethodBeat.i(36393);
        locale = new com/tencent/mm/plugin/sns/h/e;
        locale.<init>();
        locale.qQm = paramString1;
        locale.qIS = paramcao;
        locale.qQn = ((int)bo.anT());
        locale.qQo = paramString2;
        bool2 = bool1;
        switch (paramcao.wZN.jCt)
        {
        default:
          bool2 = bool1;
        case 4:
        case 6:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
          if (!cng())
            ab.e("MicroMsg.SnsAsyncQueueMgr", "error listToFile");
          AppMethodBeat.o(36393);
          return bool2;
        case 1:
          this.qKy.qQg.add(locale);
          bool2 = bool1;
          if (!kp(paramcao.vQE))
            continue;
          bool2 = false;
          break;
        case 2:
          this.qKy.qQh.add(locale);
          bool2 = bool1;
          continue;
        case 7:
        case 8:
        case 16:
        case 3:
        case 5:
        }
      }
      finally
      {
      }
      this.qKy.qQg.add(locale);
      boolean bool2 = bool1;
      if (kp(paramcao.vQE))
      {
        bool2 = false;
        continue;
        this.qKy.qQh.add(locale);
        bool2 = bool1;
        continue;
        this.qKy.qQi.add(locale);
        bool2 = bool1;
        continue;
        this.qKy.qQj.add(locale);
        bool2 = bool1;
      }
    }
  }

  public final cbf c(cbf paramcbf)
  {
    long l;
    Object localObject1;
    Object localObject2;
    try
    {
      AppMethodBeat.i(36390);
      if (bo.isNullOrNil(this.ecX))
        this.ecX = com.tencent.mm.model.r.Yz();
      if ((this.qKy.qQg.size() == 0) && (this.qKy.qQh.size() == 0))
      {
        AppMethodBeat.o(36390);
        return paramcbf;
      }
      l = paramcbf.vQE;
      localIterator = this.qKy.qQg.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (com.tencent.mm.plugin.sns.h.e)localIterator.next();
        localObject2 = b(((com.tencent.mm.plugin.sns.h.e)localObject1).qIS);
        if ((((com.tencent.mm.plugin.sns.h.e)localObject1).qIS.vQE == l) && (!a(paramcbf.xaq, ((cat)localObject2).ncM, ((cat)localObject2).pcX)))
        {
          paramcbf.xaq.add(localObject2);
          paramcbf.xao += 1;
        }
      }
    }
    finally
    {
    }
    Iterator localIterator = paramcbf.xaq.iterator();
    label400: label401: 
    while (true)
    {
      int i;
      if (localIterator.hasNext())
      {
        localObject1 = (cat)localIterator.next();
        if (((cat)localObject1).vHl.equals(this.ecX))
        {
          i = 0;
          localObject2 = this.qKy.qQl.iterator();
          label232: if (((Iterator)localObject2).hasNext())
          {
            if (((f)((Iterator)localObject2).next()).qQp != l)
              break label400;
            paramcbf.xaq.remove(localObject1);
            paramcbf.xao -= 1;
            i = 1;
          }
        }
      }
      else
      {
        while (true)
        {
          break label232;
          if (i == 0)
            break label401;
          localIterator = this.qKy.qQh.iterator();
          while (localIterator.hasNext())
          {
            localObject2 = (com.tencent.mm.plugin.sns.h.e)localIterator.next();
            if (((com.tencent.mm.plugin.sns.h.e)localObject2).qIS.vQE == l)
            {
              localObject2 = b(((com.tencent.mm.plugin.sns.h.e)localObject2).qIS);
              if (!a(paramcbf.xat, ((cat)localObject2).ncM, ((cat)localObject2).pcX))
              {
                paramcbf.xat.add(localObject2);
                paramcbf.xar += 1;
              }
            }
          }
          AppMethodBeat.o(36390);
          break;
        }
      }
    }
  }

  public final void cnf()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(36384);
        if (aq(this.qKy.qQg))
        {
          AppMethodBeat.o(36384);
          return;
        }
        if (aq(this.qKy.qQh))
        {
          AppMethodBeat.o(36384);
          continue;
        }
      }
      finally
      {
      }
      if (aq(this.qKy.qQi))
      {
        AppMethodBeat.o(36384);
      }
      else if (aq(this.qKy.qQj))
      {
        AppMethodBeat.o(36384);
      }
      else
      {
        Object localObject2;
        long l;
        Object localObject3;
        while (true)
          if (!this.qKy.qQk.isEmpty())
          {
            localObject2 = (f)this.qKy.qQk.getFirst();
            if (bo.fp(((f)localObject2).qQn) > 21600L)
            {
              this.qKy.qQk.removeFirst();
            }
            else
            {
              l = ((f)localObject2).qQp;
              g.RQ();
              localObject2 = g.RO().eJo;
              localObject3 = new com/tencent/mm/plugin/sns/model/r;
              ((r)localObject3).<init>(l, 1);
              ((p)localObject2).a((m)localObject3, 0);
              AppMethodBeat.o(36384);
              break;
            }
          }
        while (true)
          if (!this.qKy.qQl.isEmpty())
          {
            localObject2 = (f)this.qKy.qQl.getFirst();
            if (bo.fp(((f)localObject2).qQn) > 21600L)
            {
              this.qKy.qQl.removeFirst();
            }
            else
            {
              l = ((f)localObject2).qQp;
              g.RQ();
              localObject3 = g.RO().eJo;
              localObject2 = new com/tencent/mm/plugin/sns/model/r;
              ((r)localObject2).<init>(l, 5);
              ((p)localObject3).a((m)localObject2, 0);
              AppMethodBeat.o(36384);
              break;
            }
          }
        AppMethodBeat.o(36384);
      }
    }
  }

  public final int cni()
  {
    try
    {
      AppMethodBeat.i(36408);
      int i = this.qKA.size();
      AppMethodBeat.o(36408);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void e(long paramLong, int paramInt, String paramString)
  {
    AppMethodBeat.i(36394);
    aj.cnW();
    f(paramLong, paramInt, paramString);
    AppMethodBeat.o(36394);
  }

  public final boolean fk(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(36411);
      this.qKC.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
      AppMethodBeat.o(36411);
      return true;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean isDownloading(String paramString)
  {
    try
    {
      AppMethodBeat.i(36405);
      boolean bool = this.qKA.containsKey(paramString);
      AppMethodBeat.o(36405);
      return bool;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final boolean kl(long paramLong)
  {
    try
    {
      AppMethodBeat.i(36386);
      Iterator localIterator = this.qKy.qQk.iterator();
      boolean bool;
      while (localIterator.hasNext())
        if (((f)localIterator.next()).qQp == paramLong)
        {
          bool = false;
          AppMethodBeat.o(36386);
        }
      while (true)
      {
        return bool;
        bool = true;
        AppMethodBeat.o(36386);
      }
    }
    finally
    {
    }
  }

  public final void km(long paramLong)
  {
    try
    {
      AppMethodBeat.i(36387);
      f localf = new com/tencent/mm/plugin/sns/h/f;
      localf.<init>();
      localf.qQp = paramLong;
      localf.qQn = ((int)bo.anT());
      this.qKy.qQk.add(localf);
      cng();
      AppMethodBeat.o(36387);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void kn(long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(36388);
        Iterator localIterator = this.qKy.qQk.iterator();
        if (localIterator.hasNext())
        {
          f localf = (f)localIterator.next();
          if (localf.qQp != paramLong)
            continue;
          if (localf != null)
            this.qKy.qQk.remove(localf);
          cng();
          AppMethodBeat.o(36388);
          return;
        }
      }
      finally
      {
      }
      Object localObject2 = null;
    }
  }

  public final boolean ko(long paramLong)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(36398);
      f localf = new com/tencent/mm/plugin/sns/h/f;
      localf.<init>();
      localf.qQp = paramLong;
      localf.qQn = ((int)bo.anT());
      this.qKy.qQl.add(localf);
      cng();
      if (!a(paramLong, this.qKy.qQg, "", true))
        AppMethodBeat.o(36398);
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(36398);
      }
    }
    finally
    {
    }
  }

  final boolean kp(long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(36399);
        Iterator localIterator = this.qKy.qQl.iterator();
        if (!localIterator.hasNext())
          break label99;
        f localf = (f)localIterator.next();
        if (localf.qQp != paramLong)
          continue;
        if (localf != null)
        {
          this.qKy.qQl.remove(localf);
          bool = true;
          cng();
          AppMethodBeat.o(36399);
          return bool;
        }
      }
      finally
      {
      }
      boolean bool = false;
      continue;
      label99: Object localObject2 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ad
 * JD-Core Version:    0.6.2
 */