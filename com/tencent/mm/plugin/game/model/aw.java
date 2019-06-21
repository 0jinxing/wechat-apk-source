package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.ky;
import com.tencent.mm.g.a.ky.a;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.plugin.game.luggage.d.a;
import com.tencent.mm.plugin.game.luggage.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Set;

public class aw extends com.tencent.mm.sdk.b.c<ky>
{
  private static volatile String cOG;
  private static volatile long mYE;
  private static volatile long mYF;
  private static Set<String> mYG;
  private static Set<String> mYH;
  private long mYI;
  private aw.b mYJ;

  static
  {
    AppMethodBeat.i(111486);
    mYG = new HashSet();
    mYH = new HashSet();
    AppMethodBeat.o(111486);
  }

  public aw()
  {
    AppMethodBeat.i(111476);
    this.xxI = ky.class.getName().hashCode();
    AppMethodBeat.o(111476);
  }

  private static boolean NV(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(111480);
    if ((bo.isNullOrNil(paramString)) || (!com.tencent.mm.plugin.wepkg.utils.d.aig(paramString)))
    {
      AppMethodBeat.o(111480);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preloadWePkg, url: %s", new Object[] { paramString });
      GameWebPerformanceInfo localGameWebPerformanceInfo = GameWebPerformanceInfo.kU(paramString);
      localGameWebPerformanceInfo.eBV = System.currentTimeMillis();
      paramString = com.tencent.mm.plugin.wepkg.b.ahx(paramString);
      localGameWebPerformanceInfo.eBW = System.currentTimeMillis();
      if (paramString != null)
      {
        AppMethodBeat.o(111480);
      }
      else
      {
        AppMethodBeat.o(111480);
        bool = false;
      }
    }
  }

  private static void a(Bundle paramBundle, boolean paramBoolean, com.tencent.mm.ipcinvoker.c paramc)
  {
    while (true)
    {
      String str1;
      String str2;
      Object localObject1;
      Object localObject2;
      try
      {
        AppMethodBeat.i(111479);
        ab.d("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preLoadWePkgAndWebCore, preload: %b", new Object[] { Boolean.valueOf(paramBoolean) });
        boolean bool = paramBundle.getBoolean("is_luggage", false);
        str1 = paramBundle.getString("call_raw_url");
        str2 = paramBundle.getString("float_layer_url");
        localObject1 = GameWebPerformanceInfo.kU(str1);
        if (!bool)
          break label292;
        localObject2 = com.tencent.mm.plugin.game.luggage.d.NO(str1);
        if (localObject2 != null)
        {
          if (paramBoolean)
          {
            ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "has preloaded webcore, return");
            paramBundle.putBoolean("has_preload_webcore", true);
            a(paramc, paramBundle);
            AppMethodBeat.o(111479);
            return;
          }
          localObject1 = new com/tencent/mm/plugin/game/model/aw$6;
          ((aw.6)localObject1).<init>((k)localObject2);
          l.q((Runnable)localObject1);
          com.tencent.mm.plugin.game.luggage.c.a((k)localObject2, str1, true);
          continue;
        }
      }
      finally
      {
      }
      if (paramBoolean)
      {
        if (((GameWebPerformanceInfo)localObject1).eBU != 0L)
        {
          paramc.ao(paramBundle);
          AppMethodBeat.o(111479);
        }
        else if (!NV(str1))
        {
          ab.d("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "wepkg is not exists, return");
          GameWebPerformanceInfo.kW(str1);
          a(paramc, paramBundle);
          AppMethodBeat.o(111479);
        }
        else
        {
          NV(str2);
          ((GameWebPerformanceInfo)localObject1).eBM = 1;
          ((GameWebPerformanceInfo)localObject1).eBX = System.currentTimeMillis();
          h.pYm.k(939L, 0L, 1L);
          localObject2 = new com/tencent/mm/plugin/game/model/aw$7;
          ((aw.7)localObject2).<init>(str1, (GameWebPerformanceInfo)localObject1, paramc, paramBundle);
          com.tencent.mm.plugin.game.luggage.d.a(e.class, str1, (d.a)localObject2);
          AppMethodBeat.o(111479);
        }
      }
      else
      {
        NV(str2);
        NV(str1);
        a(paramc, paramBundle);
        AppMethodBeat.o(111479);
        continue;
        label292: NV(str2);
        NV(str1);
        a(paramc, paramBundle);
        AppMethodBeat.o(111479);
      }
    }
  }

  private void a(ky paramky, Bundle paramBundle)
  {
    boolean bool = false;
    while (true)
    {
      Object localObject1;
      try
      {
        AppMethodBeat.i(111478);
        ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turnPage");
        al.af(this.mYJ);
        localObject1 = new com/tencent/mm/plugin/game/model/aw$4;
        ((aw.4)localObject1).<init>(this);
        al.n((Runnable)localObject1, 1000L);
        if (paramky == null)
        {
          AppMethodBeat.o(111478);
          return;
        }
        if (bo.isNullOrNil(paramky.cGQ.group))
          break label130;
        if (mYG.contains(paramky.cGQ.group))
        {
          mYG.remove(paramky.cGQ.group);
          AppMethodBeat.o(111478);
          continue;
        }
      }
      finally
      {
      }
      mYG.add(paramky.cGQ.group);
      label130: label149: Object localObject2;
      label276: long l;
      if (paramky.cGQ.context != null)
      {
        localObject1 = paramky.cGQ.context;
        if (paramky.cGQ.intent == null)
        {
          localObject2 = paramky.cGQ;
          localObject3 = new android/content/Intent;
          ((Intent)localObject3).<init>();
          ((ky.a)localObject2).intent = ((Intent)localObject3);
        }
        localObject2 = paramky.cGQ.intent.getStringExtra("rawUrl");
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("turn page, start web ui, time: ");
        ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", System.currentTimeMillis());
        paramky.cGQ.intent.putExtra("start_activity_time", System.currentTimeMillis());
        switch (paramky.cGQ.type)
        {
        default:
          l = System.currentTimeMillis() - mYE;
          ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn to GameWebViewUI time:%d", new Object[] { Long.valueOf(l) });
        case 0:
        case 1:
        case 2:
        }
      }
      try
      {
        paramky.cGQ.context = null;
        label313: com.tencent.mm.plugin.wepkg.utils.a.b("preloadWebTime", (String)localObject2, com.tencent.mm.plugin.wepkg.utils.d.aid((String)localObject2), null, -1L, l, null);
        AppMethodBeat.o(111478);
        continue;
        localObject1 = ah.getContext();
        break label149;
        com.tencent.mm.bp.d.b((Context)localObject1, "webview", ".ui.tools.game.GameWebViewUI", paramky.cGQ.intent);
        break label276;
        com.tencent.mm.bp.d.b((Context)localObject1, "webview", ".ui.tools.TransparentWebViewUI", paramky.cGQ.intent);
        break label276;
        if (paramBundle != null)
          bool = paramBundle.getBoolean("has_preload_webcore", false);
        paramBundle = new com/tencent/mm/plugin/game/model/aw$5;
        paramBundle.<init>(this, (Context)localObject1, paramky);
        if (bool);
        for (l = 100L; ; l = 0L)
        {
          l.postDelayed(paramBundle, l);
          break;
        }
      }
      catch (Exception paramky)
      {
        break label313;
      }
    }
  }

  private static void a(com.tencent.mm.ipcinvoker.c paramc, Bundle paramBundle)
  {
    AppMethodBeat.i(111481);
    if (paramc != null)
      paramc.ao(paramBundle);
    AppMethodBeat.o(111481);
  }

  private boolean a(ky paramky)
  {
    AppMethodBeat.i(111477);
    ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "callback, type = %d", new Object[] { Integer.valueOf(paramky.cGQ.type) });
    if (paramky.cGQ.intent == null)
      AppMethodBeat.o(111477);
    while (true)
    {
      return false;
      if (paramky.cGQ.type == 3)
      {
        ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval: %d, lastActionTime: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.mYI), Long.valueOf(this.mYI) });
        if (System.currentTimeMillis() - this.mYI < 500L)
        {
          ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval smaller than 500 ms, return");
          AppMethodBeat.o(111477);
          continue;
        }
      }
      this.mYI = System.currentTimeMillis();
      label172: boolean bool;
      label223: Object localObject1;
      switch (paramky.cGQ.type)
      {
      default:
        AppMethodBeat.o(111477);
        break;
      case 0:
      case 1:
      case 2:
        int i = paramky.cGQ.type;
        int j = hashCode();
        int k = paramky.hashCode();
        long l = Thread.currentThread().getId();
        if (Thread.currentThread() == Looper.getMainLooper().getThread())
        {
          bool = true;
          ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "on NotifyGameWebviewOperationListener operation listener, type:%d, hashcode:%s, event hashcode:%s, threadId:%s, isUIThead:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l), Boolean.valueOf(bool) });
          localObject1 = "";
        }
      case 3:
        try
        {
          String str = paramky.cGQ.intent.getStringExtra("rawUrl");
          localObject1 = str;
          label297: str = paramky.cGQ.intent.getStringExtra("game_float_layer_url");
          try
          {
            if (bo.nullAsNil(cOG).equalsIgnoreCase((String)localObject1))
            {
              ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "forbid to open same page two times");
              AppMethodBeat.o(111477);
              continue;
              bool = false;
              break label223;
            }
            cOG = (String)localObject1;
            mYE = System.currentTimeMillis();
            mYF = System.currentTimeMillis();
            if (ah.bqo())
              com.tencent.mm.plugin.wepkg.utils.b.uXV = com.tencent.mm.plugin.game.commlib.a.bDh();
            if (com.tencent.mm.plugin.wepkg.utils.d.aig((String)localObject1))
            {
              ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "exist pkgid:%s, to reload", new Object[] { com.tencent.mm.plugin.wepkg.utils.d.aid((String)localObject1) });
              Object localObject2 = g.x(bo.nullAsNil((String)localObject1).getBytes()) + "_" + System.currentTimeMillis();
              paramky.cGQ.group = ((String)localObject2);
              this.mYJ = new aw.b(this, paramky);
              al.n(this.mYJ, 500L);
              localObject2 = new Bundle();
              ((Bundle)localObject2).putBoolean("is_wepkg_disable", com.tencent.mm.plugin.wepkg.utils.b.uXV);
              ((Bundle)localObject2).putString("call_raw_url", (String)localObject1);
              if (!bo.isNullOrNil(str))
                ((Bundle)localObject2).putString("float_layer_url", str);
              if (paramky.cGQ.type == 2)
                ((Bundle)localObject2).putBoolean("is_luggage", true);
              ToolsProcessIPCService.a((Parcelable)localObject2, aw.a.class, new aw.1(this, paramky));
              break label172;
            }
          }
          finally
          {
            AppMethodBeat.o(111477);
          }
          ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "dont have pkgid or disable wepkg, normal turn page. disableWepkg:" + com.tencent.mm.plugin.wepkg.utils.b.uXV);
          a(paramky, null);
          break label172;
          localObject1 = paramky.cGQ.intent.getStringExtra("rawUrl");
          if ((mYH.contains(localObject1)) || (!com.tencent.mm.plugin.wepkg.utils.d.aig((String)localObject1)))
            break label172;
          mYH.add(localObject1);
          paramky = new Bundle();
          paramky.putString("call_raw_url", (String)localObject1);
          paramky.putBoolean("preload_webcore", true);
          paramky.putBoolean("is_luggage", true);
          ToolsProcessIPCService.a(paramky, aw.a.class, new com.tencent.mm.ipcinvoker.c()
          {
          });
          l.postDelayed(new aw.3(this, (String)localObject1), 10000L);
        }
        catch (Exception localException)
        {
          break label297;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw
 * JD-Core Version:    0.6.2
 */