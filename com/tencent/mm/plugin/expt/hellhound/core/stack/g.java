package com.tencent.mm.plugin.expt.hellhound.core.stack;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.be;
import com.tencent.mm.protocal.protobuf.bf;
import com.tencent.mm.protocal.protobuf.cgq;
import com.tencent.mm.protocal.protobuf.chm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.j.a;
import com.tencent.mm.vending.j.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
{
  public f lMA;

  public static be a(bf parambf, String paramString1, String paramString2)
  {
    AppMethodBeat.i(73375);
    if (parambf == null)
    {
      AppMethodBeat.o(73375);
      parambf = null;
    }
    while (true)
    {
      return parambf;
      ab.d("TaskRecordWrapper", "habbyge-mali, doPopRealActivity: " + paramString1 + "=" + paramString2);
      label246: for (int i = parambf.vDi.size() - 1; ; i--)
      {
        if (i < 0)
          break label252;
        cgq localcgq = (cgq)parambf.vDi.get(i);
        for (int j = localcgq.xfy.size() - 1; ; j--)
        {
          if (j < 0)
            break label246;
          be localbe = (be)localcgq.xfy.get(j);
          if (h.l(localbe.vDg.activityName, localbe.vDg.wkp, paramString1, paramString2))
          {
            ab.d("TaskRecordWrapper", "habbyge-mali, doPopRealActivity.pop YES: " + paramString1 + "=" + paramString2);
            localcgq.xfy.remove(j);
            if (localcgq.xfy.isEmpty())
              parambf.vDi.remove(i);
            AppMethodBeat.o(73375);
            parambf = localbe;
            break;
          }
          ab.e("TaskRecordWrapper", "habbyge-mali, doPopRealActivity.pop NOT: " + paramString1 + "/" + localbe.vDg.activityName);
        }
      }
      label252: AppMethodBeat.o(73375);
      parambf = null;
    }
  }

  public static com.tencent.mm.vending.j.c<cgq, Integer> a(bf parambf, be parambe)
  {
    AppMethodBeat.i(73376);
    if ((parambf == null) || (parambf.vDi.isEmpty()) || (parambe == null))
    {
      AppMethodBeat.o(73376);
      parambf = null;
    }
    while (true)
    {
      return parambf;
      label189: for (int i = parambf.vDi.size() - 1; ; i--)
      {
        if (i < 0)
          break label195;
        cgq localcgq = (cgq)parambf.vDi.get(i);
        if ((localcgq != null) && (!localcgq.xfy.isEmpty()))
          for (int j = localcgq.xfy.size() - 1; ; j--)
          {
            if (j < 0)
              break label189;
            be localbe = (be)localcgq.xfy.get(j);
            if ((localbe != null) && (h.a(parambe.vDg, localbe.vDg)))
            {
              ab.d("TaskRecordWrapper", "habbyge-mali, getTaskOfActivity 2: " + localbe.vDg.activityName + "/" + localbe.vDg.wkp);
              parambf = a.F(localcgq, Integer.valueOf(i));
              AppMethodBeat.o(73376);
              break;
            }
          }
      }
      label195: AppMethodBeat.o(73376);
      parambf = null;
    }
  }

  static void a(bf parambf, be parambe, boolean paramBoolean)
  {
    AppMethodBeat.i(73378);
    if (parambe == null)
      AppMethodBeat.o(73378);
    while (true)
    {
      return;
      cgq localcgq = new cgq();
      localcgq.xfx = paramBoolean;
      localcgq.xfy.addLast(parambe);
      parambe = parambf;
      if (parambf == null)
        parambe = new bf();
      parambe.vDi.addLast(localcgq);
      AppMethodBeat.o(73378);
    }
  }

  public static com.tencent.mm.vending.j.c<Integer, Integer> b(bf parambf, String paramString1, String paramString2)
  {
    AppMethodBeat.i(73383);
    if (TextUtils.isEmpty(paramString1))
    {
      parambf = a.F(Integer.valueOf(-1), Integer.valueOf(-1));
      AppMethodBeat.o(73383);
    }
    int i;
    while (true)
    {
      return parambf;
      ab.d("TaskRecordWrapper", "habbyge-mali, search: " + paramString1 + "/" + paramString2);
      if (parambf == null)
      {
        parambf = com.tencent.mm.vending.j.c.F(Integer.valueOf(-1), Integer.valueOf(-1));
        AppMethodBeat.o(73383);
      }
      else
      {
        i = parambf.vDi.size();
        if (i > 0)
          break;
        parambf = com.tencent.mm.vending.j.c.F(Integer.valueOf(-1), Integer.valueOf(-1));
        AppMethodBeat.o(73383);
      }
    }
    i--;
    int j = -1;
    int k = -1;
    label126: int m;
    if (i >= 0)
    {
      cgq localcgq = (cgq)parambf.vDi.get(i);
      m = localcgq.xfy.size() - 1;
      label155: if (m < 0)
        break label266;
      be localbe = (be)localcgq.xfy.get(m);
      if (h.l(paramString1, paramString2, localbe.vDg.activityName, localbe.vDg.wkp))
      {
        j = m;
        k = i;
      }
    }
    label266: 
    while (true)
    {
      i--;
      break label126;
      m--;
      break label155;
      if (k == -1)
      {
        parambf = com.tencent.mm.vending.j.c.F(Integer.valueOf(-1), Integer.valueOf(-1));
        AppMethodBeat.o(73383);
        break;
      }
      parambf = a.F(Integer.valueOf(k), Integer.valueOf(j));
      AppMethodBeat.o(73383);
      break;
    }
  }

  static void b(bf parambf, be parambe)
  {
    AppMethodBeat.i(73377);
    ab.d("TaskRecordWrapper", "habbyge-mali, push: " + parambe.vDg.activityName);
    cgq localcgq1 = null;
    if (!parambf.vDi.isEmpty())
    {
      ab.d("TaskRecordWrapper", "habbyge-mali, push: stack.taskRecords NOT NULL");
      localcgq1 = (cgq)parambf.vDi.getLast();
    }
    cgq localcgq2 = localcgq1;
    if (localcgq1 == null)
    {
      localcgq2 = new cgq();
      parambf.vDi.addLast(localcgq2);
    }
    localcgq2.xfy.addLast(parambe);
    AppMethodBeat.o(73377);
  }

  static boolean b(bf parambf)
  {
    AppMethodBeat.i(73379);
    boolean bool;
    if (parambf == null)
    {
      AppMethodBeat.o(73379);
      bool = false;
    }
    while (true)
    {
      return bool;
      cgq localcgq = null;
      if (!parambf.vDi.isEmpty())
        localcgq = (cgq)parambf.vDi.getLast();
      if ((localcgq != null) && (localcgq.xfx))
      {
        bool = true;
        AppMethodBeat.o(73379);
      }
      else
      {
        AppMethodBeat.o(73379);
        bool = false;
      }
    }
  }

  public static com.tencent.mm.vending.j.c<bf, be> bqz()
  {
    AppMethodBeat.i(73384);
    Object localObject = c.bqs();
    localObject = a.F(localObject, c((bf)localObject));
    AppMethodBeat.o(73384);
    return localObject;
  }

  static be c(bf parambf)
  {
    AppMethodBeat.i(73385);
    if (parambf == null)
    {
      AppMethodBeat.o(73385);
      parambf = null;
      return parambf;
    }
    if (!parambf.vDi.isEmpty());
    for (parambf = (cgq)parambf.vDi.getLast(); ; parambf = null)
    {
      if (parambf == null)
      {
        AppMethodBeat.o(73385);
        parambf = null;
        break;
      }
      if (parambf.xfy.isEmpty())
      {
        AppMethodBeat.o(73385);
        parambf = null;
        break;
      }
      parambf = (be)parambf.xfy.getLast();
      AppMethodBeat.o(73385);
      break;
    }
  }

  static com.tencent.mm.vending.j.c<Integer, Integer> c(bf parambf, be parambe)
  {
    AppMethodBeat.i(73382);
    parambf = b(parambf, parambe.vDg.activityName, parambe.vDg.wkp);
    AppMethodBeat.o(73382);
    return parambf;
  }

  static void c(be parambe)
  {
    AppMethodBeat.i(73373);
    ab.d("TaskRecordWrapper", "habbyge-mali, singleInstanceMode: " + parambe.vDg.activityName);
    bf localbf = c.bqs();
    c(localbf);
    if (localbf == null);
    for (LinkedList localLinkedList = null; localLinkedList == null; localLinkedList = localbf.vDi)
    {
      ab.d("TaskRecordWrapper", "habbyge-mali, singleInstanceMode: allTaskRecords == null");
      a(localbf, parambe, true);
      c.a(localbf);
      AppMethodBeat.o(73373);
      return;
    }
    int i = 0;
    int j = localLinkedList.size() - 1;
    label92: int k;
    if (j >= 0)
    {
      cgq localcgq = (cgq)localLinkedList.get(j);
      if ((localcgq == null) || (!localcgq.xfx))
        break label240;
      k = localcgq.xfy.size() - 1;
      label133: if (k < 0)
        break label240;
      be localbe = (be)localcgq.xfy.get(k);
      if ((localbe != null) && (h.a(parambe.vDg, localbe.vDg)))
      {
        localLinkedList.addLast((cgq)localLinkedList.remove(j));
        i = 1;
      }
    }
    label240: 
    while (true)
    {
      j--;
      break label92;
      k--;
      break label133;
      if (i != 0)
        break;
      ab.d("TaskRecordWrapper", "habbyge-mali, singleInstanceMode: findThisTask NOT: " + parambe.vDg.activityName);
      a(localbf, parambe, true);
      break;
    }
  }

  final void a(bf parambf, int paramInt)
  {
    AppMethodBeat.i(73380);
    ab.d("TaskRecordWrapper", "habbyge-mali, pop_int: ".concat(String.valueOf(paramInt)));
    if (parambf == null)
      AppMethodBeat.o(73380);
    while (true)
    {
      return;
      cgq localcgq = (cgq)parambf.vDi.getLast();
      int i = localcgq.xfy.size();
      if ((paramInt < 0) || (paramInt >= i))
      {
        AppMethodBeat.o(73380);
      }
      else
      {
        ab.d("TaskRecordWrapper", "habbyge-mali, pop_int activityCount = ".concat(String.valueOf(i)));
        i--;
        while (i >= paramInt)
        {
          be localbe = (be)localcgq.xfy.remove(i);
          ab.d("TaskRecordWrapper", "habbyge-mali, pop_int_activity: " + localbe.vDg.activityName);
          if (this.lMA != null)
            this.lMA.b(localbe);
          i--;
        }
        if ((localcgq.xfy.isEmpty()) && (!parambf.vDi.isEmpty()))
          parambf.vDi.removeLast();
        AppMethodBeat.o(73380);
      }
    }
  }

  final void a(bf parambf, int paramInt, be parambe)
  {
    AppMethodBeat.i(73381);
    ab.d("TaskRecordWrapper", "habbyge-mali, popTask: " + paramInt + "/" + parambe.vDg.activityName);
    if (parambf == null)
      AppMethodBeat.o(73381);
    while (true)
    {
      return;
      int i = parambf.vDi.size();
      if ((paramInt < 0) || (paramInt >= i))
      {
        AppMethodBeat.o(73381);
      }
      else
      {
        ab.d("TaskRecordWrapper", "habbyge-mali, popTask taskCount = ".concat(String.valueOf(i)));
        i--;
        while (i >= paramInt)
        {
          Iterator localIterator = ((cgq)parambf.vDi.remove(i)).xfy.iterator();
          while (localIterator.hasNext())
          {
            parambe = (be)localIterator.next();
            if (this.lMA != null)
              this.lMA.b(parambe);
          }
          i--;
        }
        AppMethodBeat.o(73381);
      }
    }
  }

  final boolean d(be parambe)
  {
    boolean bool = false;
    AppMethodBeat.i(73374);
    if (TextUtils.isEmpty(parambe.vDg.activityName))
      AppMethodBeat.o(73374);
    while (true)
    {
      return bool;
      ab.d("TaskRecordWrapper", "habbyge-mali, flagNewTask: " + parambe.vDg.activityName);
      bf localbf = c.bqs();
      c(localbf);
      Object localObject = a(localbf, parambe);
      if (localObject == null)
      {
        AppMethodBeat.o(73374);
      }
      else
      {
        cgq localcgq = (cgq)((b)localObject).get(0);
        int i = ((Integer)((com.tencent.mm.vending.j.c)localObject).get(1)).intValue();
        localbf.vDi.remove(i);
        localbf.vDi.addLast(localcgq);
        localObject = (be)localcgq.xfy.getLast();
        if ((localObject != null) && (!h.a(((be)localObject).vDg, parambe.vDg)))
        {
          ab.e("TaskRecordWrapper", "habbyge-mali, flagNewTask: " + parambe.vDg.activityName + "/" + ((be)localObject).vDg.activityName);
          for (i = localcgq.xfy.size() - 1; (i >= 0) && (!h.a(((be)localcgq.xfy.get(i)).vDg, parambe.vDg)); i--)
            localcgq.xfy.remove(i);
        }
        c.a(localbf);
        if (this.lMA != null)
          ab.d("TaskRecordWrapper", "habbyge-mali, activityRecord: " + parambe.vDg.activityName);
        AppMethodBeat.o(73374);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.stack.g
 * JD-Core Version:    0.6.2
 */