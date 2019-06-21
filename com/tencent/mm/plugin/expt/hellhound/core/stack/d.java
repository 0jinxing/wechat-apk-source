package com.tencent.mm.plugin.expt.hellhound.core.stack;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bd;
import com.tencent.mm.protocal.protobuf.be;
import com.tencent.mm.protocal.protobuf.bf;
import com.tencent.mm.protocal.protobuf.cgq;
import com.tencent.mm.protocal.protobuf.chm;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d
{
  private static volatile d lMv;
  public e lMw;

  private d()
  {
    AppMethodBeat.i(73363);
    ab.i("ActivityStackSupervisor", "habbyge-mali, ActivityStackSupervisor");
    this.lMw = new e();
    if (com.tencent.mm.plugin.expt.hellhound.core.b.bqo())
    {
      ab.i("ActivityStackDao", "habbyge-mali, ActivityStackDao reset");
      com.tencent.mm.plugin.expt.hellhound.core.a.b.v("hell_astackd_mmkv_key", new byte[0]);
    }
    AppMethodBeat.o(73363);
  }

  public static void a(String paramString1, String paramString2, a parama)
  {
    AppMethodBeat.i(73366);
    bf localbf = c.bqs();
    if (localbf.vDj == null)
      localbf.vDj = new bd();
    switch (b.1.lMu[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      c.a(localbf);
      AppMethodBeat.o(73366);
      return;
      if (localbf.vDj.vDb == null)
        localbf.vDj.vDb = new be();
      if (localbf.vDj.vDb.vDg == null)
        localbf.vDj.vDb.vDg = new chm();
      localbf.vDj.vDb.vDg.activityName = paramString1;
      localbf.vDj.vDb.vDg.wkp = paramString2;
      localbf.vDj.vDb.state = a.lMo.value;
      continue;
      if (localbf.vDj.vDc == null)
        localbf.vDj.vDc = new be();
      if (localbf.vDj.vDc.vDg == null)
        localbf.vDj.vDc.vDg = new chm();
      localbf.vDj.vDc.vDg.activityName = paramString1;
      localbf.vDj.vDc.vDg.wkp = paramString2;
      localbf.vDj.vDc.state = a.lMp.value;
      continue;
      if (localbf.vDj.vDd == null)
        localbf.vDj.vDd = new be();
      if (localbf.vDj.vDd.vDg == null)
        localbf.vDj.vDd.vDg = new chm();
      localbf.vDj.vDd.vDg.activityName = paramString1;
      localbf.vDj.vDd.vDg.wkp = paramString2;
      localbf.vDj.vDd.state = a.lMq.value;
      continue;
      if (localbf.vDj.vDe == null)
        localbf.vDj.vDe = new be();
      if (localbf.vDj.vDe.vDg == null)
        localbf.vDj.vDe.vDg = new chm();
      localbf.vDj.vDe.vDg.activityName = paramString1;
      localbf.vDj.vDe.vDg.wkp = paramString2;
      localbf.vDj.vDe.state = a.lMr.value;
    }
  }

  public static d bqu()
  {
    AppMethodBeat.i(73362);
    if (lMv == null);
    try
    {
      if (lMv == null)
      {
        locald = new com/tencent/mm/plugin/expt/hellhound/core/stack/d;
        locald.<init>();
        lMv = locald;
      }
      d locald = lMv;
      AppMethodBeat.o(73362);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(73362);
    }
  }

  public static be bqv()
  {
    AppMethodBeat.i(73365);
    be localbe = (be)g.bqz().get(1);
    AppMethodBeat.o(73365);
    return localbe;
  }

  public static com.tencent.mm.vending.j.c<String, String> bqw()
  {
    AppMethodBeat.i(73367);
    Object localObject1 = c.bqs();
    Object localObject2;
    if (((bf)localObject1).vDj == null)
    {
      localObject2 = com.tencent.mm.vending.j.a.F(null, null);
      AppMethodBeat.o(73367);
    }
    while (true)
    {
      return localObject2;
      if (((bf)localObject1).vDj.vDb == null)
      {
        localObject2 = com.tencent.mm.vending.j.a.F(null, null);
        AppMethodBeat.o(73367);
      }
      else
      {
        localObject2 = ((bf)localObject1).vDj.vDb.vDg.activityName;
        localObject1 = ((bf)localObject1).vDj.vDb.vDg.wkp;
        ab.i("ActivityPointerWrapper", "habbyge-mali, getCreateActivity: ".concat(String.valueOf(localObject2)));
        localObject2 = com.tencent.mm.vending.j.a.F(localObject2, localObject1);
        AppMethodBeat.o(73367);
      }
    }
  }

  public static com.tencent.mm.vending.j.c<String, String> bqx()
  {
    AppMethodBeat.i(73368);
    Object localObject1 = c.bqs();
    Object localObject2;
    if (((bf)localObject1).vDj == null)
    {
      localObject2 = com.tencent.mm.vending.j.a.F(null, null);
      AppMethodBeat.o(73368);
    }
    while (true)
    {
      return localObject2;
      if (((bf)localObject1).vDj.vDc == null)
      {
        localObject2 = com.tencent.mm.vending.j.a.F(null, null);
        AppMethodBeat.o(73368);
      }
      else
      {
        localObject2 = ((bf)localObject1).vDj.vDc.vDg.activityName;
        localObject1 = ((bf)localObject1).vDj.vDc.vDg.wkp;
        ab.i("ActivityPointerWrapper", "habbyge-mali, getResumedActivity: ".concat(String.valueOf(localObject2)));
        localObject2 = com.tencent.mm.vending.j.a.F(localObject2, localObject1);
        AppMethodBeat.o(73368);
      }
    }
  }

  public static com.tencent.mm.vending.j.c<String, String> bqy()
  {
    AppMethodBeat.i(73369);
    Object localObject1 = c.bqs();
    Object localObject2;
    if (((bf)localObject1).vDj == null)
    {
      localObject2 = com.tencent.mm.vending.j.a.F(null, null);
      AppMethodBeat.o(73369);
    }
    while (true)
    {
      return localObject2;
      if (((bf)localObject1).vDj.vDd == null)
      {
        localObject2 = com.tencent.mm.vending.j.a.F(null, null);
        AppMethodBeat.o(73369);
      }
      else
      {
        localObject2 = ((bf)localObject1).vDj.vDd.vDg.activityName;
        localObject1 = ((bf)localObject1).vDj.vDd.vDg.wkp;
        ab.i("ActivityPointerWrapper", "habbyge-mali, getPausedActivity: ".concat(String.valueOf(localObject2)));
        localObject2 = com.tencent.mm.vending.j.a.F(localObject2, localObject1);
        AppMethodBeat.o(73369);
      }
    }
  }

  public static boolean k(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(73370);
    ab.d("TokenWrapper", "habbyge-mali, TokenWrapper.equalWithHashCode: " + paramString1 + "=" + paramString2 + "/" + paramString3 + "=" + paramString4);
    boolean bool;
    if ((paramString1.equals(paramString3)) && (paramString2.equals(paramString4)))
    {
      bool = true;
      AppMethodBeat.o(73370);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(73370);
    }
  }

  public final void a(Intent paramIntent, String paramString1, String paramString2)
  {
    AppMethodBeat.i(73364);
    e locale = this.lMw;
    if (paramIntent != null)
      if (TextUtils.isEmpty(paramString1))
      {
        ab.e("ActivityStackWrapper", "habbyge-mali, push: aName=null, action = ".concat(String.valueOf(paramIntent.getAction())));
        AppMethodBeat.o(73364);
      }
    while (true)
    {
      label44: return;
      int i = paramIntent.getFlags();
      ab.d("ActivityStackWrapper", "habbyge-mali, ActivityStackWrapper.push activity/flags: " + paramString1 + "/0x" + Integer.toHexString(i));
      Object localObject;
      int j;
      if (!TextUtils.isEmpty(paramString2))
      {
        localObject = g.bqz();
        paramIntent = (bf)((com.tencent.mm.vending.j.b)localObject).get(0);
        localObject = (be)((com.tencent.mm.vending.j.c)localObject).get(1);
        if (localObject != null)
          ab.d("ActivityStackWrapper", "habbyge-mali, ActivityStackWrapper.push, topAR: " + ((be)localObject).vDg.activityName + "/" + ((be)localObject).vDg.wkp + "/" + paramString1 + "/" + paramString2);
        if ((localObject != null) && (((be)localObject).vDg != null) && (((be)localObject).vDg.activityName.equals(paramString1)) && (TextUtils.isEmpty(((be)localObject).vDg.wkp)));
        for (j = 1; ; j = 0)
        {
          if (j == 0)
            break label278;
          ((be)localObject).vDg.wkp = paramString2;
          ab.d("ActivityStackWrapper", "habbyge-mali, ActivityStackWrapper.push, create/newIntent: only push stack".concat(String.valueOf(paramString1)));
          c.a(paramIntent);
          AppMethodBeat.o(73364);
          break;
        }
        label278: ab.d("ActivityStackWrapper", "habbyge-mali, ActivityStackWrapper.push, create/newIntent: ".concat(String.valueOf(paramString1)));
        label293: localObject = new be();
        ((be)localObject).vDg = new chm();
        ((be)localObject).vDg.activityName = paramString1;
        paramString1 = ((be)localObject).vDg;
        paramIntent = paramString2;
        if (paramString2 == null)
          paramIntent = "";
        paramString1.wkp = paramIntent;
        ((be)localObject).flags = i;
        ((be)localObject).state = a.lMo.value;
        if (i != 0)
          break label466;
        j = 0;
      }
      label466: int k;
      while (true)
        switch (j)
        {
        default:
          ab.e("ActivityStackWrapper", "habbyge-mali, operateStack.exception");
          AppMethodBeat.o(73364);
          break label44;
          ab.d("ActivityStackWrapper", "habbyge-mali, ActivityStackWrapper.push, startActivity: ".concat(String.valueOf(paramString1)));
          break label293;
          if ((0x10000000 & i) == 268435456)
          {
            ab.d("ActivityStackWrapper", "habbyge-mali, push.flags: Intent.FLAG_ACTIVITY_NEW_TASK");
            j = 100;
            i = ((be)localObject).flags;
            ab.d("ActivityStackWrapper", "habbyge-mali, flagActivityNewTask flags = 0x" + Integer.toHexString(i) + "/" + ((be)localObject).vDg.activityName);
            if ((0x8000000 & i) == 134217728)
            {
              ab.d("ActivityStackWrapper", "activity stack push: FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_MULTIPLE_TASK");
              j = 3;
            }
            else if ((0x8000 & i) == 32768)
            {
              ab.d("ActivityStackWrapper", "activity stack push: FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TASK");
              if (TextUtils.isEmpty(((be)localObject).vDg.activityName))
              {
                j = 100;
              }
              else
              {
                ab.d("TaskRecordWrapper", "habbyge-mali, flagNewTaskAndClearTask: " + ((be)localObject).vDg.activityName);
                paramIntent = c.bqs();
                g.c(paramIntent);
                paramString1 = g.a(paramIntent, (be)localObject);
                if (paramString1 == null)
                {
                  j = 101;
                }
                else
                {
                  paramString1 = (cgq)paramString1.get(0);
                  paramString1.xfy.clear();
                  paramString1.xfx = false;
                  paramString1.xfy.addLast(localObject);
                  c.a(paramIntent);
                  j = 100;
                }
              }
            }
            else if ((i & 0x4000000) == 67108864)
            {
              j = 2;
            }
            else
            {
              boolean bool = locale.lMx.d((be)localObject);
              ab.d("ActivityStackWrapper", "habbyge-mali, push activityExisted = ".concat(String.valueOf(bool)));
              if (!bool)
                j = 101;
            }
          }
          else if ((i & 0x4000000) == 67108864)
          {
            ab.d("ActivityStackWrapper", "habbyge-mali, push.flags: Intent.FLAG_ACTIVITY_CLEAR_TOP");
            j = 2;
          }
          else if ((0x20000000 & i) == 536870912)
          {
            ab.d("ActivityStackWrapper", "habbyge-mali, push.flags: Intent.FLAG_ACTIVITY_SINGLE_TOP");
            j = 1;
          }
          else if ((0x20000 & i) == 131072)
          {
            ab.d("ActivityStackWrapper", "habbyge-mali, push.flags: Intent.FLAG_ACTIVITY_REORDER_TO_FRONT");
            if ((i & 0x4000000) == 67108864)
            {
              j = 2;
            }
            else
            {
              ab.d("ActivityStackWrapper", "activity stack push: FLAG_ACTIVITY_REORDER_TO_FRONT");
              ab.d("TaskRecordWrapper", "habbyge-mali, reorderMode: " + ((be)localObject).vDg.activityName);
              paramIntent = c.bqs();
              g.c(paramIntent);
              paramString1 = g.c(paramIntent, (be)localObject);
              k = ((Integer)paramString1.get(0)).intValue();
              i = ((Integer)paramString1.get(1)).intValue();
              if (i < 0)
                g.b(paramIntent, (be)localObject);
              while (true)
              {
                c.a(paramIntent);
                j = 100;
                break;
                if (k == paramIntent.vDi.size() - 1)
                  j = 1;
                while (true)
                  if (j != 0)
                  {
                    paramString1 = (cgq)paramIntent.vDi.getLast();
                    if (paramString1 == null)
                    {
                      g.b(paramIntent, (be)localObject);
                      break;
                      j = 0;
                      continue;
                    }
                    g.b(paramIntent, (be)paramString1.xfy.remove(i));
                    break;
                  }
                paramString1 = (cgq)paramIntent.vDi.remove(k);
                paramIntent.vDi.addLast(paramString1);
                g.b(paramIntent, (be)paramString1.xfy.remove(i));
              }
            }
          }
          else if (((0x8000000 & i) == 134217728) && ((0x80000 & i) == 524288))
          {
            j = 3;
            ab.d("ActivityStackWrapper", "habbyge-mali, Intent.FLAG_ACTIVITY_MULTIPLE_TASK");
          }
          else
          {
            ab.e("ActivityStackWrapper", "activity stack push: activigy/flags = " + ((be)localObject).vDg.activityName + "/0x" + Integer.toHexString(i));
            j = 100;
          }
          break;
        case 0:
        case 2:
        case 1:
        case 3:
        case 101:
        case 100:
        }
      ab.d("ActivityStackWrapper", "habbyge-mali, LAUNCH_MULTIPLE: " + ((be)localObject).vDg.activityName);
      paramIntent = c.bqs();
      g.c(paramIntent);
      if (g.b(paramIntent))
      {
        ab.d("TaskRecordWrapper", "habbyge-mali, standardMode.1: " + ((be)localObject).vDg.activityName);
        g.a(paramIntent, (be)localObject, false);
      }
      while (true)
      {
        c.a(paramIntent);
        AppMethodBeat.o(73364);
        break;
        ab.d("TaskRecordWrapper", "habbyge-mali, standardMode.2: " + ((be)localObject).vDg.activityName);
        g.b(paramIntent, (be)localObject);
      }
      ab.d("ActivityStackWrapper", "habbyge-mali, LAUNCH_SINGLE_TASK: " + ((be)localObject).vDg.activityName);
      paramString2 = locale.lMx;
      ab.d("TaskRecordWrapper", "habbyge-mali, singleTaskMode: " + ((be)localObject).vDg.activityName);
      paramIntent = c.bqs();
      g.c(paramIntent);
      if (g.b(paramIntent))
        g.a(paramIntent, (be)localObject, false);
      while (true)
      {
        c.a(paramIntent);
        AppMethodBeat.o(73364);
        break;
        paramString1 = g.c(paramIntent, (be)localObject);
        k = ((Integer)paramString1.get(0)).intValue();
        i = ((Integer)paramString1.get(1)).intValue();
        if (i >= 0)
          break label1441;
        ab.d("TaskRecordWrapper", "habbyge-mali, singleTaskMode: not in stack !");
        g.b(paramIntent, (be)localObject);
      }
      label1441: if (k == paramIntent.vDi.size() - 1)
      {
        j = 1;
        label1458: if (j == 0)
          break label1577;
        if (i != ((cgq)paramIntent.vDi.getLast()).xfy.size() - 1)
          break label1556;
        j = 1;
        label1489: if (j == 0)
          break label1562;
        ab.d("TaskRecordWrapper", "habbyge-mali, singleTaskMode: in top of stack !");
        j = 0;
      }
      while (true)
      {
        if (j == 1)
          paramString2.a(paramIntent, i + 1);
        if (j != 2)
          break;
        paramString2.a(paramIntent, k + 1, (be)localObject);
        paramString2.a(paramIntent, i + 1);
        break;
        j = 0;
        break label1458;
        label1556: j = 0;
        break label1489;
        label1562: ab.d("TaskRecordWrapper", "habbyge-mali, singleTaskMode: in stack, but not top of stack !");
        j = 1;
        continue;
        label1577: ab.d("TaskRecordWrapper", "habbyge-mali, singleTaskMode: in stack, but not top of stack !");
        j = 2;
      }
      ab.d("ActivityStackWrapper", "habbyge-mali, LAUNCH_SINGLE_TOP: " + ((be)localObject).vDg.activityName);
      ab.d("TaskRecordWrapper", "habbyge-mali, singleTopMode: " + ((be)localObject).vDg.activityName);
      paramString1 = c.bqs();
      g.c(paramString1);
      if (g.b(paramString1))
        g.a(paramString1, (be)localObject, false);
      while (true)
      {
        c.a(paramString1);
        AppMethodBeat.o(73364);
        break;
        if (paramString1 == null)
          paramIntent = null;
        while (true)
        {
          if ((paramIntent == null) || (!h.a(((be)localObject).vDg, paramIntent.vDg)))
            break label1805;
          ab.d("TaskRecordWrapper", "habbyge-mali, singleTopMode = " + ((be)localObject).vDg.activityName);
          break;
          paramIntent = null;
          if (!paramString1.vDi.isEmpty())
            paramIntent = (cgq)paramString1.vDi.getLast();
          if (paramIntent == null)
            paramIntent = null;
          else if (paramIntent.xfy.isEmpty())
            paramIntent = null;
          else
            paramIntent = (be)paramIntent.xfy.getLast();
        }
        label1805: g.b(paramString1, (be)localObject);
      }
      ab.d("ActivityStackWrapper", "habbyge-mali, LAUNCH_SINGLE_INSTANCE: " + ((be)localObject).vDg.activityName);
      g.c((be)localObject);
      AppMethodBeat.o(73364);
      continue;
      ab.d("ActivityStackWrapper", "habbyge-mali, FLAG_ACTIVITY_CREATE_TASKRECORD: " + ((be)localObject).vDg.activityName);
      ab.d("TaskRecordWrapper", "habbyge-mali, newTaskRecord: " + ((be)localObject).vDg.activityName + "/false");
      paramIntent = c.bqs();
      g.c(paramIntent);
      g.a(paramIntent, (be)localObject, false);
      c.a(paramIntent);
      AppMethodBeat.o(73364);
      continue;
      ab.d("ActivityStackWrapper", "habbyge-mali, FLAG_ACTIVITY_DO_NOTHING: " + ((be)localObject).vDg.activityName);
      AppMethodBeat.o(73364);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.stack.d
 * JD-Core Version:    0.6.2
 */