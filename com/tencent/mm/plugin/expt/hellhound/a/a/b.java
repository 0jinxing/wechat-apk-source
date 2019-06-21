package com.tencent.mm.plugin.expt.hellhound.a.a;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.b.b;
import com.tencent.mm.plugin.expt.a.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.acp;
import com.tencent.mm.protocal.protobuf.be;
import com.tencent.mm.protocal.protobuf.chm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.j.e;
import com.tencent.mm.vending.j.f;

public final class b
{
  private static volatile b lMQ;
  a lMO;
  public b.b lMP;
  private boolean lMR;
  private boolean lMS;
  private boolean lMT;

  private b()
  {
    AppMethodBeat.i(73451);
    this.lMR = false;
    this.lMS = false;
    this.lMT = true;
    this.lMO = new a();
    AppMethodBeat.o(73451);
  }

  private boolean KV(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(73453);
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
    try
    {
      Object localObject = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqy();
      if (localObject != null)
      {
        localObject = (String)((com.tencent.mm.vending.j.b)localObject).get(0);
        ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx resume/pause = " + paramString + "/" + (String)localObject);
        if ((!"com.tencent.mm.plugin.voip.ui.VideoActivity".equals(paramString)) || ((!TextUtils.isEmpty((CharSequence)localObject)) && (!"com.tencent.mm.app.WeChatSplashActivity".equals(localObject))))
          break label119;
        ab.i("HellFrontBackMonitor", "habbyge-mali, VOIP start MM Process");
        AppMethodBeat.o(73453);
        bool = true;
        return bool;
      }
    }
    catch (Exception localException)
    {
      label205: label491: 
      while (true)
      {
        h.pYm.a(932L, 45L, 1L, false);
        CharSequence localCharSequence = null;
        continue;
        label119: if (("com.tencent.mm.app.WeChatSplashActivity".equals(paramString)) && (TextUtils.isEmpty(localCharSequence)))
        {
          ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 1");
          AppMethodBeat.o(73453);
          bool = true;
        }
        else
        {
          if ("com.tencent.mm.app.WeChatSplashActivity".equals(paramString))
          {
            if ((localCharSequence != null) && (localCharSequence.startsWith("com.tencent.mm.splash.")));
            for (int i = 1; ; i = 0)
            {
              if (i == 0)
                break label205;
              ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 splash hook restart ~");
              AppMethodBeat.o(73453);
              bool = true;
              break;
            }
          }
          if (("com.tencent.mm.ui.LauncherUI".equals(paramString)) && (TextUtils.isEmpty(localCharSequence)))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 2");
            AppMethodBeat.o(73453);
            bool = true;
          }
          else if (("com.tencent.mm.app.WeChatSplashActivity".equals(localCharSequence)) && (!"com.tencent.mm.plugin.base.stub.WXEntryActivity".equals(paramString)) && (!"com.tencent.mm.plugin.base.stub.UIEntryStub".equals(paramString)) && (!"com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI".equals(paramString)))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 3");
            AppMethodBeat.o(73453);
            bool = true;
          }
          else if (("com.tencent.mm.app.WeChatSplashActivity".equals(localCharSequence)) && ("com.tencent.mm.ui.LauncherUI".equals(paramString)))
          {
            this.lMR = true;
            ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 4");
            AppMethodBeat.o(73453);
            bool = true;
          }
          else if (("com.tencent.mm.ui.tools.ShareToTimeLineUI".equals(paramString)) && (localCharSequence == null))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx: frome outer jump to Timeline");
            AppMethodBeat.o(73453);
            bool = true;
          }
          else if (("com.tencent.mm.ui.tools.AddFavoriteUI".equals(paramString)) && ("com.tencent.mm.app.WeChatSplashActivity".equals(localCharSequence)))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx: from outer jump to 收藏");
            AppMethodBeat.o(73453);
            bool = true;
          }
          else if (KW(paramString))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 通过小程序桌面快捷方式");
            AppMethodBeat.o(73453);
            bool = true;
          }
          else if ("com.tencent.mm.plugin.base.stub.UIEntryStub".equals(paramString))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 通过第三方拉起微信(第三方登录、分享好友、朋友圈)");
            AppMethodBeat.o(73453);
            bool = true;
          }
          else
          {
            if (("com.tencent.mm.plugin.account.ui.LoginPasswordUI".equals(paramString)) && ("com.tencent.mm.ui.LauncherUI".equals(localCharSequence)))
            {
              ab.i("HellFrontBackMonitor", "habbyge-mali, _launchWx 启动微信进程 之前登录过，登录页");
              if (!this.lMR)
                break label491;
              this.lMR = false;
            }
            while (true)
            {
              AppMethodBeat.o(73453);
              break;
              if (!this.lMS)
                break label506;
              this.lMS = false;
            }
            label506: AppMethodBeat.o(73453);
            bool = true;
          }
        }
      }
    }
  }

  private static boolean KW(String paramString)
  {
    AppMethodBeat.i(73454);
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
    CharSequence localCharSequence;
    try
    {
      Object localObject = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqy();
      if (localObject != null)
      {
        localObject = (String)((com.tencent.mm.vending.j.b)localObject).get(0);
        if ((!com.tencent.mm.plugin.expt.hellhound.core.b.KN(paramString)) || (!"com.tencent.mm.plugin.base.stub.WXShortcutEntryActivity".equals(localObject)))
          break label82;
        i = 1;
        if (i == 0)
          break label87;
        ab.i("HellFrontBackMonitor", "habbyge-mali, isStartWxByLittlePragramShortcut case-1");
        AppMethodBeat.o(73454);
        bool = true;
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("HellFrontBackMonitor", localException, "habbyge-mali, isStartWxByLittlePragramShortcut", new Object[0]);
        localCharSequence = null;
        continue;
        label82: i = 0;
      }
      label87: if ((com.tencent.mm.plugin.expt.hellhound.core.b.KN(paramString)) && (TextUtils.isEmpty(localCharSequence)));
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label129;
        ab.i("HellFrontBackMonitor", "habbyge-mali, isStartWxByLittlePragramShortcut case-2");
        AppMethodBeat.o(73454);
        bool = true;
        break;
      }
      label129: if (!com.tencent.mm.plugin.expt.hellhound.core.b.KN(paramString))
        break label166;
    }
    if ("com.tencent.mm.app.WeChatSplashActivity".equals(localCharSequence));
    label166: for (boolean bool = true; ; bool = false)
    {
      if (bool)
        ab.i("HellFrontBackMonitor", "habbyge-mali, isStartWxByLittlePragramShortcut case-3");
      AppMethodBeat.o(73454);
      break;
    }
  }

  public static b bqF()
  {
    AppMethodBeat.i(73450);
    if (lMQ == null);
    try
    {
      if (lMQ == null)
      {
        localb = new com/tencent/mm/plugin/expt/hellhound/a/a/b;
        localb.<init>();
        lMQ = localb;
      }
      b localb = lMQ;
      AppMethodBeat.o(73450);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(73450);
    }
  }

  private static com.tencent.mm.vending.j.d<String, String, Boolean> ee(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73455);
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
    try
    {
      Object localObject1 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqx();
      Object localObject2 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqy();
      if ((paramString1 == null) || (localObject1 == null) || (localObject2 == null))
      {
        ab.e("HellFrontBackMonitor", "habbyge-mali, isFront2BackOnStop: illeagal Event");
        AppMethodBeat.o(73455);
      }
      for (paramString1 = null; ; paramString1 = null)
      {
        return paramString1;
        if (!"com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI".equals((String)((com.tencent.mm.vending.j.b)localObject1).get(0)))
          break;
        ab.i("HellFrontBackMonitor", "habbyge-mali, isFakeSwitchAccountUI true");
        AppMethodBeat.o(73455);
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("habbyge-mali, isFront2BackOnStop: Resume/pause/stop = ");
      ab.i("HellFrontBackMonitor", localObject1 + "/" + localObject2 + "/" + paramString1);
      int i;
      label149: int j;
      label176: boolean bool1;
      label189: boolean bool2;
      if ((paramString2.equals(((com.tencent.mm.vending.j.c)localObject1).get(1))) && (paramString2.equals(((com.tencent.mm.vending.j.c)localObject2).get(1))))
      {
        i = 1;
        if ((!paramString1.equals(((com.tencent.mm.vending.j.b)localObject1).get(0))) || (!paramString1.equals(((com.tencent.mm.vending.j.b)localObject2).get(0))))
          break label365;
        j = 1;
        if ((j == 0) || (i == 0))
          break label371;
        bool1 = true;
        ab.i("HellFrontBackMonitor", "habbyge-mali, isFront2BackOnStop, case-1：".concat(String.valueOf(bool1)));
        bool2 = bool1;
        if (bool1)
        {
          localObject2 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqv();
          bool2 = bool1;
          if (localObject2 != null)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("habbyge-mali, isFront2BackOnStop isEvent8: ");
            ab.i("HellFrontBackMonitor", ((be)localObject2).vDg.activityName + ":" + ((be)localObject2).vDg.wkp);
            if (!((be)localObject2).vDg.activityName.startsWith("com.tencent.mm"))
              break label417;
            if (!TextUtils.isEmpty(((be)localObject2).vDg.wkp))
              break label377;
            bool2 = bool1;
            if (!((be)localObject2).vDg.activityName.equals(paramString1))
            {
              ab.i("HellFrontBackMonitor", "habbyge-mali, isFront2BackOnStop isEvent8-1: false");
              bool2 = false;
            }
          }
        }
      }
      while (true)
      {
        ab.i("HellFrontBackMonitor", "habbyge-mali, isFront2BackOnStop case1 && case2：".concat(String.valueOf(bool2)));
        paramString1 = com.tencent.mm.vending.j.a.i(paramString1, paramString2, Boolean.valueOf(bool2));
        AppMethodBeat.o(73455);
        break;
        i = 0;
        break label149;
        label365: j = 0;
        break label176;
        label371: bool1 = false;
        break label189;
        label377: bool2 = bool1;
        if (!com.tencent.mm.plugin.expt.hellhound.core.stack.d.k(paramString1, paramString2, ((be)localObject2).vDg.activityName, ((be)localObject2).vDg.wkp))
        {
          ab.i("HellFrontBackMonitor", "habbyge-mali, isFront2BackOnStop isEvent8-2: false");
          bool2 = false;
          continue;
          label417: ab.i("HellFrontBackMonitor", "habbyge-mali, isFront2BackOnStop: NOT wx activity");
          bool2 = bool1;
        }
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("HellFrontBackMonitor", paramString1, "habbyge-mali, isFront2BackOnStop", new Object[0]);
        h.pYm.a(932L, 43L, 1L, false);
        AppMethodBeat.o(73455);
        paramString1 = null;
      }
    }
  }

  private void ef(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73456);
    if (this.lMP != null)
      this.lMP.ec(paramString1, paramString2);
    AppMethodBeat.o(73456);
  }

  private void eg(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73457);
    if (this.lMP != null)
      this.lMP.ed(paramString1, paramString2);
    AppMethodBeat.o(73457);
  }

  public static void s(int paramInt, String paramString1, String paramString2)
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(73452);
    if (!com.tencent.mm.plugin.expt.hellhound.a.bqk())
    {
      ab.w("HellFrontBackMonitor", "habbyge-mali, HellFrontBackMonitor monitor close !!!");
      AppMethodBeat.o(73452);
    }
    Object localObject1;
    while (true)
    {
      return;
      ab.i("HellFrontBackMonitor", "habbyge-mali, HellFrontBackMonitor monitor start !!!");
      localObject1 = bqF();
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(73452);
        break;
      case 100:
      case 101:
      case 102:
      case 103:
        label88: if (!TextUtils.isEmpty(paramString1));
        switch (paramInt)
        {
        default:
          label136: AppMethodBeat.o(73452);
        case 100:
        case 101:
        case 102:
        case 103:
        }
        break;
      case 104:
      case 105:
      case 106:
      }
    }
    if (!TextUtils.isEmpty(paramString1))
    {
      ab.i("HellFrontBackMonitor", "habbyge-mali, judgeBackToFront: " + paramString1 + "/" + paramString2);
      if (!((b)localObject1).KV(paramString1))
        break label328;
      ab.i("HellFrontBackMonitor", "habbyge-mali, judgeBackToFront: _launchWx TRUE");
      com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(7);
      a.uY(7);
      ((b)localObject1).ef(paramString1, paramString2);
    }
    label328: boolean bool;
    label443: Object localObject4;
    while (true)
    {
      localObject1 = a.bqE();
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = new acp();
      if (com.tencent.mm.plugin.expt.hellhound.core.b.bqo())
        ((acp)localObject2).wkn = Process.myPid();
      ((acp)localObject2).wko = paramString1;
      ((acp)localObject2).wkp = paramString2;
      ((acp)localObject2).wkm = System.currentTimeMillis();
      ab.d("FrontBackDao", "habbyge-mali, setLastMMProcessParamsOnResume: " + ((acp)localObject2).wko + "/" + ((acp)localObject2).fQi);
      a.a((acp)localObject2);
      AppMethodBeat.o(73452);
      break;
      ab.i("HellFrontBackMonitor", "habbyge-mali, judgeBackToFront: _launchWx FALSE");
      while (true)
      {
        try
        {
          bool = com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b.bqC().lMN.KR(paramString1);
          ab.i("HellFrontBackMonitor", "habbyge-mali, _doIsBackToFront isStartActivity: ".concat(String.valueOf(bool)));
          if (!bool)
            break label443;
          paramInt = 0;
          if (paramInt == 0)
            break label636;
          paramInt = j;
          if (paramInt == 0)
            break label787;
          ab.i("HellFrontBackMonitor", "habbyge-mali, backToFront: isFrontToBackOfLastAction: YES");
          com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(7);
          a.uY(7);
          ((b)localObject1).ef(paramString1, paramString2);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("HellFrontBackMonitor", localException, "habbyge-mali, backToFront", new Object[0]);
          h.pYm.a(932L, 44L, 1L, false);
        }
        break;
        bool = com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b.bqC().lMN.bqB();
        ab.i("HellFrontBackMonitor", "habbyge-mali, _doIsBackToFront isFinish: ".concat(String.valueOf(bool)));
        if (bool)
        {
          paramInt = 0;
        }
        else if (!TextUtils.isEmpty(paramString1))
        {
          com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
          localObject4 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqy();
          if (localObject4 != null)
          {
            localObject3 = (String)((com.tencent.mm.vending.j.b)localObject4).get(0);
            localObject4 = (String)((com.tencent.mm.vending.j.c)localObject4).get(1);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("habbyge-mali, _doIsBackToFront resume/pause ");
            ab.i("HellFrontBackMonitor", paramString1 + ":" + paramString2 + " / " + (String)localObject3 + ":" + (String)localObject4);
            if ((!paramString1.equals(localObject3)) || (!paramString2.equals(localObject4)))
              paramInt = 0;
          }
        }
        else if (com.tencent.mm.plugin.expt.hellhound.core.b.KN(paramString1))
        {
          ab.e("HellFrontBackMonitor", "habbyge-mali, _doIsBackToFront 7事件，过滤小程序");
          paramInt = 0;
        }
        else
        {
          ab.i("HellFrontBackMonitor", "habbyge-mali, _doIsBackToFront ret: true");
          paramInt = 1;
          continue;
          label636: localObject3 = a.bqE();
          if ((localObject3 != null) && (((acp)localObject3).wkl == 8))
          {
            paramInt = 1;
            label658: if (paramInt == 0)
              break label716;
            ab.i("HellFrontBackMonitor", "habbyge-mali, isFrontToBackAction.lastAction: true");
            if (!"com.tencent.mm.plugin.base.stub.WXEntryActivity".equals(paramString1))
              break label704;
            ab.i("HellFrontBackMonitor", "habbyge-mali, _isBackToFront 过滤掉第三方App进入微信的场景: ".concat(String.valueOf(paramString1)));
          }
          label704: label716: 
          do
          {
            paramInt = 0;
            break;
            paramInt = 0;
            break label658;
            ((b)localObject1).lMS = true;
            paramInt = j;
            break;
            com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
            localObject4 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqy();
            localObject3 = null;
            if (localObject4 != null)
              localObject3 = (String)((com.tencent.mm.vending.j.b)localObject4).get(0);
          }
          while ((TextUtils.isEmpty(paramString1)) || (!TextUtils.isEmpty((CharSequence)localObject3)));
          ab.i("HellFrontBackMonitor", "habbyge-mali, HellFrontBackMonitor _isBackToFront: crash路径 !!!");
          h.pYm.a(932L, 98L, 1L, false);
          paramInt = j;
        }
      }
      label787: ab.i("HellFrontBackMonitor", "habbyge-mali, backToFront: isFrontToBackOfLastAction: FALSE");
    }
    ab.i("HellFrontBackMonitor", "habbyge-mali, frontBack ACTION_PAUSE: ".concat(String.valueOf(paramString1)));
    com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
    Object localObject3 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqv();
    if (localObject3 != null)
    {
      ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnPause topActivity: " + ((be)localObject3).vDg.activityName + ":" + ((be)localObject3).vDg.wkp);
      if (!((be)localObject3).vDg.activityName.startsWith("com.tencent.mm"))
      {
        ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnPause 栈顶非微信页面: " + ((be)localObject3).vDg.activityName);
        paramInt = 1;
      }
    }
    while (true)
    {
      while (true)
      {
        if (paramInt == 0)
        {
          bool = com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b.bqC().lMN.KT(paramString1);
          ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnPause.startActivity: " + bool + "/" + paramString1);
          if (bool)
          {
            ((b)localObject1).lMT = false;
            AppMethodBeat.o(73452);
            break;
            if ((!"com.tencent.mm.ui.transmit.SendAppMessageWrapperUI".equals(((be)localObject3).vDg.activityName)) || (!"com.tencent.mm.plugin.sns.ui.SnsUploadUI".equals(paramString1)))
              break label2066;
            paramInt = 1;
            continue;
          }
          bool = com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b.bqC().lMN.KU(paramString1);
          ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnPause.finish: " + bool + "/" + paramString1);
          if (bool)
          {
            ((b)localObject1).lMT = false;
            AppMethodBeat.o(73452);
            break;
          }
        }
        ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnPause front2back YES: ".concat(String.valueOf(paramString1)));
        com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(8);
        a.uY(8);
        ((b)localObject1).lMT = true;
        ((b)localObject1).eg(paramString1, paramString2);
        AppMethodBeat.o(73452);
        break;
        ab.i("HellFrontBackMonitor", "habbyge-mali, frontBack ACTION_STOP: ".concat(String.valueOf(paramString1)));
        if (TextUtils.isEmpty(paramString1))
        {
          ab.e("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnStop == null");
          AppMethodBeat.o(73452);
          break;
        }
        if (((b)localObject1).lMT)
        {
          ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnStop isFront2Back-1: true");
          AppMethodBeat.o(73452);
          break;
        }
        ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnStop stopActivityName: ".concat(String.valueOf(paramString1)));
        try
        {
          localObject3 = ee(paramString1, paramString2);
          if ((localObject3 == null) || (!((Boolean)((com.tencent.mm.vending.j.d)localObject3).get(2)).booleanValue()))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnStop: false");
            AppMethodBeat.o(73452);
            break;
          }
          localObject4 = (String)((com.tencent.mm.vending.j.b)localObject3).get(0);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("habbyge-mali, judgeFront2BackOnStop: ");
          ab.i("HellFrontBackMonitor", (String)localObject4 + " / true");
          com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(8);
          a.uY(8);
          ((b)localObject1).eg(paramString1, paramString2);
          AppMethodBeat.o(73452);
        }
        catch (Exception paramString1)
        {
          ab.printErrStackTrace("HellFrontBackMonitor", paramString1, "habbyge-mali, judgeFront2BackOnStop", new Object[0]);
          h.pYm.a(932L, 42L, 1L, false);
          AppMethodBeat.o(73452);
        }
      }
      break;
      ab.i("HellFrontBackMonitor", "habbyge-mali, frontBack ACTION_FINISH: ".concat(String.valueOf(paramString1)));
      com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqu();
      if (paramString1 == null);
      while (true)
      {
        try
        {
          ab.e("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnFinish: aName == null");
          localObject3 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqx();
          if (localObject3 != null)
          {
            paramString1 = (String)((com.tencent.mm.vending.j.b)localObject3).get(0);
            paramString2 = null;
          }
          ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnFinish activity==null: ".concat(String.valueOf(paramString1)));
          paramInt = 0;
          ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnFinish, aName: ".concat(String.valueOf(paramString1)));
          if ((paramInt != 0) && ("com.tencent.mm.ui.LauncherUI".equals(paramString1)))
          {
            ab.i("HellFrontBackMonitor", "habbyge-mali, shutdown && isLuancherUI");
            localObject3 = com.tencent.mm.plugin.expt.hellhound.core.stack.d.bqy();
            if (localObject3 == null)
              break label2061;
            localObject3 = (String)((com.tencent.mm.vending.j.b)localObject3).get(0);
            ab.i("HellFrontBackMonitor", "habbyge-mali, _quiteActivity.pause = ".concat(String.valueOf(localObject3)));
            if (!"com.tencent.mm.plugin.setting.ui.setting.SettingsUI".equals(localObject3))
              break label2061;
            paramInt = i;
            if (paramInt != 0)
            {
              a.uY(8);
              com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(8);
              ((b)localObject1).eg(paramString1, paramString2);
            }
          }
          AppMethodBeat.o(73452);
          break;
          ab.i("HellFrontBackMonitor", "habbyge-mali, judgeFront2BackOnFinish: ".concat(String.valueOf(paramString1)));
          paramInt = 1;
          continue;
        }
        catch (Exception paramString1)
        {
          ab.printErrStackTrace("HellFrontBackMonitor", paramString1, "habbyge-mali, judgeFront2BackOnFinish", new Object[0]);
          h.pYm.a(932L, 40L, 1L, false);
        }
        break label136;
        ab.i("HellFrontBackMonitor", "habbyge-mali, add8EventMMProcessEndIfNeed");
        if (!com.tencent.mm.plugin.expt.hellhound.core.b.bqo())
        {
          paramString1 = null;
          if (paramString1 != null)
          {
            a.uY(8);
            com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(8);
            paramString2 = (String)paramString1.get(0);
            localObject3 = (String)paramString1.get(1);
            paramInt = ((Integer)paramString1.get(2)).intValue();
            long l = ((Long)paramString1.get(3)).longValue();
            j = ((Integer)paramString1.get(4)).intValue();
            ab.i("HellFrontBackMonitor", "habbyge-mali, add8EventMMProcessEndIfNeed need 补充8事件: " + paramString2 + "/" + paramInt + "/" + l + "/" + j);
            if (((b)localObject1).lMP != null)
              ((b)localObject1).lMP.a(paramString2, (String)localObject3, paramInt, l, j);
          }
          AppMethodBeat.o(73452);
          break;
        }
        paramInt = Process.myPid();
        paramString2 = a.bqE();
        paramString1 = paramString2;
        if (paramString2 == null)
          paramString1 = new acp();
        if (paramString1.wkn <= 0)
        {
          ab.i("FrontBackDao", "habbyge-mali, handleLastProcessParams lastMMProcessId <= 0");
          paramString1 = null;
        }
        while (true)
        {
          break;
          if (paramString1.wkn != paramInt)
          {
            ab.i("FrontBackDao", "habbyge-mali, handleLastProcessParams last != curr ---1: " + paramString1.wkn + "/" + paramInt);
            if (paramString1.wkl == 7)
            {
              bqF();
              paramString2 = a.bqE();
              if ((paramString2 != null) && (paramString2.wkq));
              for (paramInt = 1; ; paramInt = 0)
              {
                if (paramInt == 0)
                  break label1914;
                ab.w("FrontBackDao", "habbyge-mali, getIsLogoutFromMMPageFlowService true");
                a.gR(false);
                paramString1 = null;
                break;
              }
              label1914: if (TextUtils.isEmpty("page_hell_seq_mmkv_key"));
              for (paramInt = -1; ; paramInt = as.amF("_hellhound_mmkv").getInt("page_hell_seq_mmkv_key", -1))
              {
                paramString1.fQi = paramInt;
                paramString1 = com.tencent.mm.vending.j.a.b(paramString1.wko, paramString1.wkp, Integer.valueOf(paramString1.wkn), Long.valueOf(paramString1.wkm), Integer.valueOf(paramString1.fQi));
                break;
              }
            }
          }
          else
          {
            ab.i("FrontBackDao", "habbyge-mali, handleLastProcessParams last == curr: " + paramString1.wkn + "/" + paramInt);
          }
          paramString1 = null;
        }
        c.a("login", c.a.lMc, 1, bo.anU());
        AppMethodBeat.o(73452);
        break;
        c.a("logout", c.a.lMd, -1, bo.anU());
        break label88;
        label2061: paramInt = 0;
      }
      label2066: paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.a.b
 * JD-Core Version:    0.6.2
 */