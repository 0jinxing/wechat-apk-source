package com.tencent.mm.plugin.expt.hellhound.core.v2.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.b.a;
import com.tencent.mm.plugin.expt.hellhound.core.stack.f;
import com.tencent.mm.plugin.expt.hellhound.core.stack.g;
import com.tencent.mm.plugin.expt.hellhound.core.stack.h;
import com.tencent.mm.protocal.protobuf.be;
import com.tencent.mm.protocal.protobuf.bf;
import com.tencent.mm.protocal.protobuf.cgq;
import com.tencent.mm.protocal.protobuf.chm;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class c
  implements com.tencent.mm.plugin.expt.hellhound.core.c, d, e
{
  private b.a lMG;
  private b lMH;
  private HellInstrumentationHijack lMI;

  public c()
  {
    AppMethodBeat.i(73396);
    this.lMH = new b(this);
    this.lMI = new HellInstrumentationHijack(this);
    AppMethodBeat.o(73396);
  }

  private static com.tencent.mm.vending.j.c<String, String> K(Activity paramActivity)
  {
    AppMethodBeat.i(73411);
    if (paramActivity == null);
    while (true)
    {
      try
      {
        com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
        paramActivity = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqw();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("habbyge-mali, getActivityOnFinish: ");
        ab.d("ActivityMonitor", (String)paramActivity.get(0) + " / " + (String)paramActivity.get(1));
        AppMethodBeat.o(73411);
        return paramActivity;
      }
      catch (Exception paramActivity)
      {
        ab.printErrStackTrace("ActivityMonitor", paramActivity, "habbyge-mali, getActivityOnFinish", new Object[0]);
        paramActivity = null;
        AppMethodBeat.o(73411);
        continue;
      }
      paramActivity = com.tencent.mm.vending.j.a.F(paramActivity.getClass().getCanonicalName(), String.valueOf(paramActivity.hashCode()));
      AppMethodBeat.o(73411);
    }
  }

  private static void a(Intent paramIntent, String paramString1, String paramString2)
  {
    AppMethodBeat.i(73409);
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu().a(paramIntent, paramString1, paramString2);
    AppMethodBeat.o(73409);
  }

  private static void a(String paramString1, String paramString2, com.tencent.mm.plugin.expt.hellhound.core.stack.a parama)
  {
    AppMethodBeat.i(73410);
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.a(paramString1, paramString2, parama);
    AppMethodBeat.o(73410);
  }

  private static void aD(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(73400);
    a.uX(1);
    if ((!paramBoolean) && ("com.tencent.mm.ui.LauncherUI".equals(paramString)))
    {
      ab.i("ActivityMonitor", "habbyge-mali, _quiteActivity come frome: moveActivityTaskToBack");
      AppMethodBeat.o(73400);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
      be localbe = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqv();
      String str = null;
      if (localbe != null)
        str = localbe.vDg.activityName;
      a.KP(paramString);
      a.KO(str);
      ab.i("ActivityMonitor", "habbyge-mali, _finish: from/to = " + paramString + "/" + str);
      AppMethodBeat.o(73400);
    }
  }

  private static void e(Intent paramIntent, Activity paramActivity)
  {
    AppMethodBeat.i(73404);
    String str = paramActivity.getClass().getCanonicalName();
    paramActivity = String.valueOf(paramActivity.hashCode());
    ab.d("ActivityMonitor", "habbyge-mali, _onCreateEvent: /0x" + Integer.toHexString(paramIntent.getFlags()) + "/" + str + "/" + paramActivity);
    a(paramIntent, str, paramActivity);
    a(str, paramActivity, com.tencent.mm.plugin.expt.hellhound.core.stack.a.lMo);
    AppMethodBeat.o(73404);
  }

  public final void F(Activity paramActivity)
  {
    AppMethodBeat.i(73399);
    Object localObject1 = K(paramActivity);
    if (localObject1 == null)
      AppMethodBeat.o(73399);
    String str;
    while (true)
    {
      return;
      paramActivity = (String)((com.tencent.mm.vending.j.b)localObject1).get(0);
      str = (String)((com.tencent.mm.vending.j.c)localObject1).get(1);
      ab.d("ActivityMonitor", "habbyge-mali, finish: " + paramActivity + " / " + str);
      if (!TextUtils.isEmpty(paramActivity))
        break;
      AppMethodBeat.o(73399);
    }
    Object localObject2 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu().lMw.lMx;
    bf localbf;
    if (!TextUtils.isEmpty(paramActivity))
    {
      ab.d("TaskRecordWrapper", "habbyge-mali, pop_String: " + paramActivity + ":" + str);
      localbf = com.tencent.mm.plugin.expt.hellhound.core.stack.c.bqs();
      if (!localbf.vDi.isEmpty())
      {
        localObject1 = g.a(localbf, paramActivity, str);
        if (localObject1 != null)
          break label204;
        ab.e("TaskRecordWrapper", "habbyge-mali, pop_string: realPopActivityRecord Do-Nothing !!!");
      }
    }
    while (true)
    {
      aD(paramActivity, true);
      if ((!TextUtils.isEmpty(paramActivity)) && (this.lMG != null))
        this.lMG.ea(paramActivity, str);
      AppMethodBeat.o(73399);
      break;
      label204: com.tencent.mm.plugin.expt.hellhound.core.stack.c.a(localbf);
      if (((g)localObject2).lMA != null)
      {
        localObject2 = ((g)localObject2).lMA;
        g.bqz();
        ((f)localObject2).a((be)localObject1);
      }
    }
  }

  public final void G(Activity paramActivity)
  {
    AppMethodBeat.i(73405);
    String str1 = paramActivity.getClass().getCanonicalName();
    String str2 = String.valueOf(paramActivity.hashCode());
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
    bf localbf;
    int i;
    if (!TextUtils.isEmpty(str1))
    {
      ab.d("TaskRecordWrapper", "habbyge-mali, bringTask2FrontWhenActivityResumeIfNeed: ".concat(String.valueOf(str1)));
      localbf = com.tencent.mm.plugin.expt.hellhound.core.stack.c.bqs();
      if ((localbf != null) && (!localbf.vDi.isEmpty()) && (!TextUtils.isEmpty(str1)))
        break label129;
      i = 0;
      if (i == 0)
        break label380;
      com.tencent.mm.plugin.expt.hellhound.core.stack.c.a(localbf);
      ab.d("TaskRecordWrapper", "habbyge-mali, bringTask2FntWhenActivityResume true");
    }
    while (true)
    {
      a(str1, str2, com.tencent.mm.plugin.expt.hellhound.core.stack.a.lMp);
      if (this.lMG != null)
        this.lMG.B(paramActivity);
      AppMethodBeat.o(73405);
      return;
      label129: ab.d("TaskRecordWrapper", "habbyge-mali, bringTask2Front: " + str1 + "/" + str2);
      Object localObject = (cgq)localbf.vDi.getLast();
      if (localObject == null)
      {
        i = 0;
        break;
      }
      if (((cgq)localObject).xfy.isEmpty())
      {
        i = 0;
        break;
      }
      localObject = (be)((cgq)localObject).xfy.getLast();
      if (localObject == null)
      {
        i = 0;
        break;
      }
      if (h.l(((be)localObject).vDg.activityName, ((be)localObject).vDg.wkp, str1, str2))
      {
        i = 0;
        break;
      }
      localObject = g.b(localbf, str1, str2);
      i = ((Integer)((com.tencent.mm.vending.j.b)localObject).get(0)).intValue();
      int j = ((Integer)((com.tencent.mm.vending.j.c)localObject).get(1)).intValue();
      if (i < 0)
      {
        i = 0;
        break;
      }
      localObject = (cgq)localbf.vDi.remove(i);
      i = ((cgq)localObject).xfy.size();
      if (j < i - 1)
      {
        i--;
        while (i > j)
        {
          ((cgq)localObject).xfy.remove(i);
          i--;
        }
      }
      localbf.vDi.addLast(localObject);
      i = 1;
      break;
      label380: ab.d("TaskRecordWrapper", "habbyge-mali, bringTask2FrontWhenActivityResume false");
    }
  }

  public final void H(Activity paramActivity)
  {
    AppMethodBeat.i(73406);
    if (paramActivity == null)
      AppMethodBeat.o(73406);
    while (true)
    {
      return;
      a(paramActivity.getClass().getCanonicalName(), String.valueOf(paramActivity.hashCode()), com.tencent.mm.plugin.expt.hellhound.core.stack.a.lMq);
      if (this.lMG != null)
        this.lMG.C(paramActivity);
      AppMethodBeat.o(73406);
    }
  }

  public final void I(Activity paramActivity)
  {
    AppMethodBeat.i(73407);
    if (paramActivity == null)
      AppMethodBeat.o(73407);
    while (true)
    {
      return;
      String str = paramActivity.getClass().getCanonicalName();
      int i = paramActivity.hashCode();
      if ("com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI".equals(str))
      {
        AppMethodBeat.o(73407);
      }
      else
      {
        a(str, String.valueOf(i), com.tencent.mm.plugin.expt.hellhound.core.stack.a.lMr);
        if (this.lMG != null)
          this.lMG.D(paramActivity);
        AppMethodBeat.o(73407);
      }
    }
  }

  public final void J(Activity paramActivity)
  {
    AppMethodBeat.i(73408);
    if (paramActivity == null)
      AppMethodBeat.o(73408);
    while (true)
    {
      return;
      a(paramActivity.getClass().getCanonicalName(), String.valueOf(paramActivity.hashCode()), com.tencent.mm.plugin.expt.hellhound.core.stack.a.lMs);
      if (this.lMG != null)
        this.lMG.E(paramActivity);
      AppMethodBeat.o(73408);
    }
  }

  public final void a(Activity paramActivity, Intent paramIntent)
  {
    AppMethodBeat.i(73401);
    Object localObject;
    if (paramActivity != null)
    {
      paramActivity = paramActivity.getClass().getCanonicalName();
      ab.i("ActivityMonitor", "habbyge-mali, startActivity, fromActivity: ".concat(String.valueOf(paramActivity)));
      localObject = paramIntent.getComponent();
      if (localObject != null)
      {
        localObject = ((ComponentName)localObject).getClassName();
        label47: a(paramIntent, (String)localObject, null);
        ab.i("ActivityActionWrapper", "habbyge-mali, setStartActivityAction_resume: ".concat(String.valueOf(localObject)));
        com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b.bqC().lMN.KQ((String)localObject);
        ab.i("ActivityActionWrapper", "habbyge-mali, setStartActivityAction_pause: ".concat(String.valueOf(paramActivity)));
        com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b.bqC().lMN.KS(paramActivity);
        a.uX(0);
        if ((localObject != null) && (this.lMG != null))
          this.lMG.KM((String)localObject);
        AppMethodBeat.o(73401);
      }
    }
    else
    {
      com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
      paramActivity = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqv();
      if (paramActivity == null)
        break label180;
    }
    label180: for (paramActivity = paramActivity.vDg.activityName; ; paramActivity = null)
    {
      ab.i("ActivityMonitor", "habbyge-mali, startActivity, fromActivityName: ".concat(String.valueOf(paramActivity)));
      break;
      localObject = null;
      break label47;
    }
  }

  public final void a(Activity paramActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(73398);
    Object localObject = K(paramActivity);
    if (localObject == null)
      AppMethodBeat.o(73398);
    String str;
    while (true)
    {
      return;
      paramActivity = (String)((com.tencent.mm.vending.j.b)localObject).get(0);
      str = (String)((com.tencent.mm.vending.j.c)localObject).get(1);
      ab.d("ActivityMonitor", "habbyge-mali, moveActivityTaskToBack: " + paramActivity + " / " + str);
      if (!TextUtils.isEmpty(paramActivity))
        break;
      AppMethodBeat.o(73398);
    }
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
    ab.d("TaskRecordWrapper", "habbyge-mali, moveActivityTaskToBack: " + paramActivity + ":" + str + ":" + paramBoolean);
    bf localbf = com.tencent.mm.plugin.expt.hellhound.core.stack.c.bqs();
    localObject = new be();
    ((be)localObject).vDg = new chm();
    ((be)localObject).vDg.activityName = paramActivity;
    ((be)localObject).vDg.wkp = str;
    com.tencent.mm.vending.j.c localc = g.a(localbf, (be)localObject);
    if (localc == null)
      ab.e("TaskRecordWrapper", "habbyge-mali, moveActivityTaskToBack tuple2 == null");
    while (true)
    {
      aD(paramActivity, false);
      if ((!TextUtils.isEmpty(paramActivity)) && (this.lMG != null))
        this.lMG.eb(paramActivity, str);
      AppMethodBeat.o(73398);
      break;
      cgq localcgq = (cgq)localc.get(0);
      int i = ((Integer)localc.get(1)).intValue();
      if (!paramBoolean)
      {
        ab.w("TaskRecordWrapper", "habbyge-mali, moveActivityTaskToBack nonRoot: false");
        if (!h.a(((be)localcgq.xfy.getFirst()).vDg, ((be)localObject).vDg))
          ab.w("TaskRecordWrapper", "habbyge-mali, moveActivityTaskToBack nonRoot: 不处理直接返回");
      }
      else
      {
        int j = localbf.vDi.size();
        ab.d("TaskRecordWrapper", "habbyge-mali, moveActivityTaskToBack: taskPosition = " + i + "/" + j);
        if (i == j - 1)
        {
          localbf.vDi.remove(i);
          localbf.vDi.addFirst(localcgq);
          com.tencent.mm.plugin.expt.hellhound.core.stack.c.a(localbf);
          ab.d("TaskRecordWrapper", "habbyge-mali, moveActivityTaskToBack 栈顶");
        }
        else
        {
          ab.e("TaskRecordWrapper", "habbyge-mali, moveActivityTaskToBack 非栈顶，不合法");
        }
      }
    }
  }

  public final void a(b.a parama)
  {
    this.lMG = parama;
  }

  public final void c(Intent paramIntent, Activity paramActivity)
  {
    AppMethodBeat.i(73402);
    if (paramActivity == null)
      AppMethodBeat.o(73402);
    while (true)
    {
      return;
      e(paramIntent, paramActivity);
      AppMethodBeat.o(73402);
    }
  }

  public final void d(Intent paramIntent, Activity paramActivity)
  {
    AppMethodBeat.i(73403);
    if (paramActivity == null)
      AppMethodBeat.o(73403);
    while (true)
    {
      return;
      e(paramIntent, paramActivity);
      AppMethodBeat.o(73403);
    }
  }

  // ERROR //
  public final void g(android.app.Application paramApplication)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 460
    //   5: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: ifnonnull +10 -> 19
    //   12: ldc_w 460
    //   15: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: return
    //   19: aload_0
    //   20: getfield 34	com/tencent/mm/plugin/expt/hellhound/core/v2/activity/c:lMH	Lcom/tencent/mm/plugin/expt/hellhound/core/v2/activity/b;
    //   23: astore_3
    //   24: ldc_w 462
    //   27: ldc_w 464
    //   30: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: getstatic 469	android/os/Build$VERSION:SDK_INT	I
    //   36: bipush 26
    //   38: if_icmpge +503 -> 541
    //   41: ldc_w 471
    //   44: invokestatic 475	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   47: astore 4
    //   49: aload 4
    //   51: ldc_w 477
    //   54: invokevirtual 481	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   57: astore_1
    //   58: aload_1
    //   59: iconst_1
    //   60: invokevirtual 487	java/lang/reflect/Field:setAccessible	(Z)V
    //   63: aload_1
    //   64: aconst_null
    //   65: invokevirtual 490	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: astore 5
    //   70: aload 5
    //   72: astore_2
    //   73: aload_1
    //   74: astore 5
    //   76: aload_2
    //   77: astore_1
    //   78: aload_1
    //   79: ifnonnull +213 -> 292
    //   82: ldc_w 462
    //   85: ldc_w 492
    //   88: invokestatic 257	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield 41	com/tencent/mm/plugin/expt/hellhound/core/v2/activity/c:lMI	Lcom/tencent/mm/plugin/expt/hellhound/core/v2/activity/HellInstrumentationHijack;
    //   95: astore_1
    //   96: ldc_w 494
    //   99: ldc_w 496
    //   102: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: invokestatic 501	com/tencent/mm/plugin/expt/hellhound/core/a/a:bqr	()Ljava/lang/Class;
    //   108: astore_2
    //   109: aload_2
    //   110: ldc_w 503
    //   113: iconst_0
    //   114: anewarray 108	java/lang/Class
    //   117: invokevirtual 507	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   120: astore 5
    //   122: aload 5
    //   124: iconst_1
    //   125: invokevirtual 510	java/lang/reflect/Method:setAccessible	(Z)V
    //   128: aload 5
    //   130: aconst_null
    //   131: iconst_0
    //   132: anewarray 4	java/lang/Object
    //   135: invokevirtual 514	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   138: astore 5
    //   140: aload_2
    //   141: ldc_w 516
    //   144: invokevirtual 481	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   147: astore 4
    //   149: aload 4
    //   151: iconst_1
    //   152: invokevirtual 487	java/lang/reflect/Field:setAccessible	(Z)V
    //   155: aload_1
    //   156: aload 4
    //   158: aload 5
    //   160: invokevirtual 490	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   163: checkcast 518	android/app/Instrumentation
    //   166: putfield 522	com/tencent/mm/plugin/expt/hellhound/core/v2/activity/HellInstrumentationHijack:lMK	Landroid/app/Instrumentation;
    //   169: ldc_w 518
    //   172: invokevirtual 526	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   175: astore_2
    //   176: iconst_0
    //   177: istore 6
    //   179: iload 6
    //   181: aload_2
    //   182: arraylength
    //   183: if_icmpge +519 -> 702
    //   186: aload_2
    //   187: iload 6
    //   189: aaload
    //   190: iconst_1
    //   191: invokevirtual 487	java/lang/reflect/Field:setAccessible	(Z)V
    //   194: aload_2
    //   195: iload 6
    //   197: aaload
    //   198: aload_1
    //   199: getfield 522	com/tencent/mm/plugin/expt/hellhound/core/v2/activity/HellInstrumentationHijack:lMK	Landroid/app/Instrumentation;
    //   202: invokevirtual 490	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   205: astore_3
    //   206: aload_2
    //   207: iload 6
    //   209: aaload
    //   210: aload_1
    //   211: aload_3
    //   212: invokevirtual 530	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   215: iinc 6 1
    //   218: goto -39 -> 179
    //   221: astore_1
    //   222: aconst_null
    //   223: astore_1
    //   224: aload 4
    //   226: ldc_w 532
    //   229: iconst_0
    //   230: anewarray 108	java/lang/Class
    //   233: invokevirtual 507	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   236: astore 5
    //   238: aload 5
    //   240: iconst_1
    //   241: invokevirtual 510	java/lang/reflect/Method:setAccessible	(Z)V
    //   244: aload 5
    //   246: aconst_null
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokevirtual 514	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   254: astore 5
    //   256: aload 5
    //   258: astore_2
    //   259: aload_1
    //   260: astore 5
    //   262: aload_2
    //   263: astore_1
    //   264: goto -186 -> 78
    //   267: astore 5
    //   269: ldc_w 462
    //   272: aload 5
    //   274: ldc_w 534
    //   277: iconst_0
    //   278: anewarray 4	java/lang/Object
    //   281: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: aload_1
    //   285: astore 5
    //   287: aload_2
    //   288: astore_1
    //   289: goto -211 -> 78
    //   292: aload 4
    //   294: aload_1
    //   295: invokevirtual 537	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   298: ifeq +115 -> 413
    //   301: aload_3
    //   302: aload_1
    //   303: putfield 541	com/tencent/mm/plugin/expt/hellhound/core/v2/activity/b:lMB	Ljava/lang/Object;
    //   306: aload_1
    //   307: invokevirtual 106	java/lang/Object:getClass	()Ljava/lang/Class;
    //   310: astore_2
    //   311: aload_2
    //   312: invokestatic 545	com/tencent/mm/plugin/expt/hellhound/core/a/a:ap	(Ljava/lang/Class;)Ljava/util/List;
    //   315: astore_1
    //   316: aload_1
    //   317: ifnull +88 -> 405
    //   320: aload_1
    //   321: invokeinterface 548 1 0
    //   326: ifle +79 -> 405
    //   329: aload_1
    //   330: aload_1
    //   331: invokeinterface 548 1 0
    //   336: anewarray 108	java/lang/Class
    //   339: invokeinterface 552 2 0
    //   344: checkcast 554	[Ljava/lang/Class;
    //   347: astore_1
    //   348: aload_2
    //   349: invokevirtual 558	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   352: aload_1
    //   353: aload_3
    //   354: invokestatic 564	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   357: astore_1
    //   358: aload 5
    //   360: ifnull -269 -> 91
    //   363: aload 5
    //   365: aconst_null
    //   366: aload_1
    //   367: invokevirtual 530	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   370: goto -279 -> 91
    //   373: astore_1
    //   374: ldc_w 462
    //   377: aload_1
    //   378: ldc_w 534
    //   381: iconst_0
    //   382: anewarray 4	java/lang/Object
    //   385: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: getstatic 570	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   391: ldc2_w 571
    //   394: ldc2_w 573
    //   397: lconst_1
    //   398: iconst_0
    //   399: invokevirtual 577	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   402: goto -311 -> 91
    //   405: iconst_0
    //   406: anewarray 108	java/lang/Class
    //   409: astore_1
    //   410: goto -62 -> 348
    //   413: ldc_w 579
    //   416: invokestatic 475	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   419: astore 5
    //   421: aload 5
    //   423: aload_1
    //   424: invokevirtual 537	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   427: ifeq -336 -> 91
    //   430: aload 5
    //   432: ldc_w 581
    //   435: invokevirtual 481	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   438: astore_2
    //   439: aload_2
    //   440: iconst_1
    //   441: invokevirtual 487	java/lang/reflect/Field:setAccessible	(Z)V
    //   444: aload_2
    //   445: aload_1
    //   446: invokevirtual 490	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   449: astore 5
    //   451: aload 5
    //   453: ifnull -362 -> 91
    //   456: aload_3
    //   457: aload 5
    //   459: putfield 541	com/tencent/mm/plugin/expt/hellhound/core/v2/activity/b:lMB	Ljava/lang/Object;
    //   462: aload 5
    //   464: invokevirtual 106	java/lang/Object:getClass	()Ljava/lang/Class;
    //   467: astore 4
    //   469: aload 4
    //   471: invokestatic 545	com/tencent/mm/plugin/expt/hellhound/core/a/a:ap	(Ljava/lang/Class;)Ljava/util/List;
    //   474: astore 5
    //   476: aload 5
    //   478: ifnull +54 -> 532
    //   481: aload 5
    //   483: invokeinterface 548 1 0
    //   488: ifle +44 -> 532
    //   491: aload 5
    //   493: aload 5
    //   495: invokeinterface 548 1 0
    //   500: anewarray 108	java/lang/Class
    //   503: invokeinterface 552 2 0
    //   508: checkcast 554	[Ljava/lang/Class;
    //   511: astore 5
    //   513: aload_2
    //   514: aload_1
    //   515: aload 4
    //   517: invokevirtual 558	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   520: aload 5
    //   522: aload_3
    //   523: invokestatic 564	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   526: invokevirtual 530	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   529: goto -438 -> 91
    //   532: iconst_0
    //   533: anewarray 108	java/lang/Class
    //   536: astore 5
    //   538: goto -25 -> 513
    //   541: ldc_w 583
    //   544: invokestatic 475	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   547: ldc_w 585
    //   550: invokevirtual 481	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   553: astore_1
    //   554: aload_1
    //   555: iconst_1
    //   556: invokevirtual 487	java/lang/reflect/Field:setAccessible	(Z)V
    //   559: aload_1
    //   560: aconst_null
    //   561: invokevirtual 490	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   564: astore_2
    //   565: ldc_w 579
    //   568: invokestatic 475	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   571: ldc_w 581
    //   574: invokevirtual 481	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   577: astore 5
    //   579: aload 5
    //   581: iconst_1
    //   582: invokevirtual 487	java/lang/reflect/Field:setAccessible	(Z)V
    //   585: aload 5
    //   587: aload_2
    //   588: invokevirtual 490	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   591: astore 4
    //   593: aload_3
    //   594: aload 4
    //   596: putfield 541	com/tencent/mm/plugin/expt/hellhound/core/v2/activity/b:lMB	Ljava/lang/Object;
    //   599: aload 4
    //   601: invokevirtual 106	java/lang/Object:getClass	()Ljava/lang/Class;
    //   604: invokestatic 545	com/tencent/mm/plugin/expt/hellhound/core/a/a:ap	(Ljava/lang/Class;)Ljava/util/List;
    //   607: astore_1
    //   608: aload_1
    //   609: ifnull +85 -> 694
    //   612: aload_1
    //   613: invokeinterface 548 1 0
    //   618: ifle +76 -> 694
    //   621: aload_1
    //   622: aload_1
    //   623: invokeinterface 548 1 0
    //   628: anewarray 108	java/lang/Class
    //   631: invokeinterface 552 2 0
    //   636: checkcast 554	[Ljava/lang/Class;
    //   639: astore_1
    //   640: aload 5
    //   642: aload_2
    //   643: aload 4
    //   645: invokevirtual 106	java/lang/Object:getClass	()Ljava/lang/Class;
    //   648: invokevirtual 558	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   651: aload_1
    //   652: aload_3
    //   653: invokestatic 564	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   656: invokevirtual 530	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   659: goto -568 -> 91
    //   662: astore_1
    //   663: ldc_w 462
    //   666: aload_1
    //   667: ldc_w 587
    //   670: iconst_0
    //   671: anewarray 4	java/lang/Object
    //   674: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   677: getstatic 570	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   680: ldc2_w 571
    //   683: ldc2_w 588
    //   686: lconst_1
    //   687: iconst_0
    //   688: invokevirtual 577	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   691: goto -600 -> 91
    //   694: iconst_0
    //   695: anewarray 108	java/lang/Class
    //   698: astore_1
    //   699: goto -59 -> 640
    //   702: aload 4
    //   704: aload 5
    //   706: aload_1
    //   707: invokevirtual 530	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   710: ldc_w 460
    //   713: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   716: goto -698 -> 18
    //   719: astore_1
    //   720: ldc_w 494
    //   723: aload_1
    //   724: ldc_w 591
    //   727: iconst_0
    //   728: anewarray 4	java/lang/Object
    //   731: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   734: getstatic 570	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   737: ldc2_w 571
    //   740: ldc2_w 592
    //   743: lconst_1
    //   744: iconst_0
    //   745: invokevirtual 577	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   748: ldc_w 460
    //   751: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   754: goto -736 -> 18
    //   757: astore 5
    //   759: goto -535 -> 224
    //
    // Exception table:
    //   from	to	target	type
    //   49	58	221	java/lang/NoSuchFieldException
    //   224	256	267	java/lang/Exception
    //   41	49	373	java/lang/Exception
    //   49	58	373	java/lang/Exception
    //   58	70	373	java/lang/Exception
    //   82	91	373	java/lang/Exception
    //   269	284	373	java/lang/Exception
    //   292	316	373	java/lang/Exception
    //   320	348	373	java/lang/Exception
    //   348	358	373	java/lang/Exception
    //   363	370	373	java/lang/Exception
    //   405	410	373	java/lang/Exception
    //   413	451	373	java/lang/Exception
    //   456	476	373	java/lang/Exception
    //   481	513	373	java/lang/Exception
    //   513	529	373	java/lang/Exception
    //   532	538	373	java/lang/Exception
    //   541	608	662	java/lang/Exception
    //   612	640	662	java/lang/Exception
    //   640	659	662	java/lang/Exception
    //   694	699	662	java/lang/Exception
    //   105	176	719	java/lang/Exception
    //   179	215	719	java/lang/Exception
    //   702	710	719	java/lang/Exception
    //   58	70	757	java/lang/NoSuchFieldException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.v2.activity.c
 * JD-Core Version:    0.6.2
 */