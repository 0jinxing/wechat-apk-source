package com.tencent.mm.plugin.forcenotify.b;

import a.k.m;
import a.l;
import a.v;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.forcenotify.c.b;
import com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI;
import com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.g.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.cl;
import com.tencent.mm.protocal.protobuf.vs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.ArrayList;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/core/ForceNotifyService;", "Lcom/tencent/mm/plugin/forcenotify/core/BaseForceNotifyService;", "Lcom/tencent/mm/plugin/messenger/foundation/api/storage/ILoadingOpLogService$IOplogResult;", "()V", "ForceNotifyTAG", "", "isSound", "", "()Z", "setSound", "(Z)V", "isTestError", "isVibrate", "setVibrate", "delete", "", "username", "scene", "", "getCount", "getExpireTime", "", "getForceNotifyInfoList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/forcenotify/model/ForceNotifyInfo;", "getForceNotifyStorage", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "hasError", "isNeedNotify", "isNeedShowBanner", "isSilentMode", "context", "Landroid/content/Context;", "isVibrateMode", "notifyShow", "userName", "onModify", "info", "onOpLogResult", "ret", "title", "content", "option", "Lcom/tencent/mm/plugin/messenger/foundation/api/storage/IOpLogStorage$Operation;", "onReceive", "isNeedShow", "release", "setCanSoundAndVibrate", "setForTest", "isTest", "setting", "start", "startForceNotifyShowUI", "intent", "Landroid/content/Intent;", "plugin-force-notify_release"})
public final class c extends a
  implements g.a
{
  private static boolean mtc;
  private static boolean mtd;
  private static boolean mte;
  public static final c mtf;

  static
  {
    AppMethodBeat.i(51050);
    mtf = new c();
    mtd = true;
    mte = true;
    AppMethodBeat.o(51050);
  }

  public static ArrayList<b> bxW()
  {
    AppMethodBeat.i(51040);
    Object localObject = com.tencent.mm.plugin.forcenotify.d.a.mth;
    localObject = com.tencent.mm.plugin.forcenotify.d.a.bxY();
    AppMethodBeat.o(51040);
    return localObject;
  }

  public static boolean dT(Context paramContext)
  {
    AppMethodBeat.i(51037);
    a.f.b.j.p(paramContext, "context");
    paramContext = paramContext.getSystemService("audio");
    if (paramContext == null)
    {
      paramContext = new v("null cannot be cast to non-null type android.media.AudioManager");
      AppMethodBeat.o(51037);
      throw paramContext;
    }
    boolean bool;
    if (((AudioManager)paramContext).getRingerMode() > 0)
    {
      bool = true;
      AppMethodBeat.o(51037);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51037);
    }
  }

  public static boolean isSilentMode(Context paramContext)
  {
    AppMethodBeat.i(51036);
    a.f.b.j.p(paramContext, "context");
    paramContext = paramContext.getSystemService("audio");
    if (paramContext == null)
    {
      paramContext = new v("null cannot be cast to non-null type android.media.AudioManager");
      AppMethodBeat.o(51036);
      throw paramContext;
    }
    boolean bool;
    if (((AudioManager)paramContext).getRingerMode() != 2)
    {
      bool = true;
      AppMethodBeat.o(51036);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51036);
    }
  }

  public final void Mn(String paramString)
  {
    AppMethodBeat.i(51042);
    if (paramString == null)
      AppMethodBeat.o(51042);
    while (true)
    {
      return;
      if (at.isNetworkConnected(ah.getContext()))
        break;
      com.tencent.mm.plugin.forcenotify.d.a.mth.doNotify();
      AppMethodBeat.o(51042);
    }
    Object localObject1 = new cl();
    ((cl)localObject1).vEy = (paramString + "@wxcontact");
    ((cl)localObject1).vEz = 10800;
    Object localObject2 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject2, "MMKernel.service<IMessen…engerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject2).bOl().a((j.b)new j.a(213, (com.tencent.mm.bt.a)localObject1));
    localObject2 = com.tencent.mm.plugin.forcenotify.d.a.mth;
    a.f.b.j.p(paramString, "userName");
    localObject1 = new b();
    ((b)localObject1).field_UserName = paramString;
    ((b)localObject1).field_CreateTime = cb.aaE();
    ((b)localObject1).field_ExpiredTime = (((b)localObject1).field_CreateTime + 10800000L);
    ((b)localObject1).field_Status = 1;
    if (com.tencent.mm.plugin.forcenotify.d.a.fni.replace("ForceNotifyInfo", "UserName", ((b)localObject1).Hl()) >= 0L)
    {
      ((Map)com.tencent.mm.plugin.forcenotify.d.a.mtg).put(paramString, localObject1);
      ((com.tencent.mm.plugin.forcenotify.d.a)localObject2).doNotify();
    }
    for (boolean bool = true; ; bool = false)
    {
      ab.i(this.TAG, "[setting] " + paramString + " ret:%s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(51042);
      break;
    }
  }

  public final long Mo(String paramString)
  {
    AppMethodBeat.i(51041);
    a.f.b.j.p(paramString, "username");
    com.tencent.mm.plugin.forcenotify.d.a locala = com.tencent.mm.plugin.forcenotify.d.a.mth;
    a.f.b.j.p(paramString, "userName");
    b localb = new b();
    localb.field_UserName = paramString;
    long l;
    if (locala.b((com.tencent.mm.sdk.e.c)localb, new String[0]))
    {
      l = localb.field_ExpiredTime;
      AppMethodBeat.o(51041);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(51041);
    }
  }

  public final boolean Mp(String paramString)
  {
    AppMethodBeat.i(51049);
    a.f.b.j.p(paramString, "username");
    com.tencent.mm.plugin.forcenotify.d.a locala = com.tencent.mm.plugin.forcenotify.d.a.mth;
    boolean bool = com.tencent.mm.plugin.forcenotify.d.a.Mp(paramString);
    AppMethodBeat.o(51049);
    return bool;
  }

  public final void a(int paramInt, j.b paramb)
  {
    AppMethodBeat.i(51044);
    a.f.b.j.p(paramb, "option");
    ab.i(this.TAG, "[onOpLogResult] ret:%s %s", new Object[] { Integer.valueOf(paramInt), paramb });
    if (paramb.getCmdId() == 213)
    {
      paramb = paramb.bOI();
      if (paramb == null)
      {
        paramb = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddForcePush");
        AppMethodBeat.o(51044);
        throw paramb;
      }
      paramb = ((cl)paramb).vEy;
      a.f.b.j.o(paramb, "oplog.ForcePushId");
      paramb = m.i(paramb, "@wxcontact", "", false);
      ab.i(this.TAG, "[onOpLogResult] AddForcePush username:%s", new Object[] { paramb });
      if ((paramInt == 0) && (!mtc))
      {
        com.tencent.mm.plugin.forcenotify.d.a.mth.bW(paramb, 1);
        ((com.tencent.mm.plugin.forcenotify.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.a.class)).f(paramb, 1, cb.aaE() / 1000L);
        AppMethodBeat.o(51044);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.forcenotify.d.a.mth.bW(paramb, -1);
      ((com.tencent.mm.plugin.forcenotify.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.a.class)).f(paramb, 6, cb.aaE() / 1000L);
      AppMethodBeat.o(51044);
      continue;
      if (paramb.getCmdId() == 214)
      {
        paramb = paramb.bOI();
        if (paramb == null)
        {
          paramb = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.DelForcePush");
          AppMethodBeat.o(51044);
          throw paramb;
        }
        paramb = (vs)paramb;
        String str = paramb.vEy;
        a.f.b.j.o(str, "oplog.ForcePushId");
        str = m.i(str, "@wxcontact", "", false);
        int i = paramb.scene;
        ab.i(this.TAG, "[onOpLogResult] DelForcePush username:%s", new Object[] { str });
        if (paramInt == 0)
        {
          ((com.tencent.mm.plugin.forcenotify.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.a.class)).f(str, i, cb.aaE() / 1000L);
          com.tencent.mm.plugin.forcenotify.d.a.mth.pI(str);
        }
      }
      AppMethodBeat.o(51044);
    }
  }

  public final void aJ(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(51045);
    a.f.b.j.p(paramString, "userName");
    if (paramBoolean)
    {
      Intent localIntent = new Intent(ah.getContext(), ForceNotifyShowUI.class);
      localIntent.addFlags(268435456);
      localIntent.putExtra("userName", paramString);
      ah.getContext().startActivity(localIntent);
    }
    AppMethodBeat.o(51045);
  }

  public final void am(String paramString, int paramInt)
  {
    AppMethodBeat.i(51043);
    if (paramString == null)
      AppMethodBeat.o(51043);
    while (true)
    {
      return;
      if (!at.isNetworkConnected(ah.getContext()))
      {
        com.tencent.mm.plugin.forcenotify.d.a.mth.doNotify();
        AppMethodBeat.o(51043);
      }
      else
      {
        vs localvs = new vs();
        localvs.vEy = (paramString + "@wxcontact");
        localvs.scene = paramInt;
        com.tencent.mm.kernel.c.a locala = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
        a.f.b.j.o(locala, "MMKernel.service<IMessen…engerStorage::class.java)");
        ((com.tencent.mm.plugin.messenger.foundation.a.j)locala).bOl().a((j.b)new j.a(214, (com.tencent.mm.bt.a)localvs));
        ab.i(this.TAG, "[delete] ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(51043);
      }
    }
  }

  public final boolean bxU()
  {
    AppMethodBeat.i(51047);
    com.tencent.mm.plugin.forcenotify.d.a locala = com.tencent.mm.plugin.forcenotify.d.a.mth;
    boolean bool;
    if (com.tencent.mm.plugin.forcenotify.d.a.bxZ() > 0)
    {
      bool = true;
      AppMethodBeat.o(51047);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51047);
    }
  }

  public final com.tencent.mm.sdk.e.j<?> bxV()
  {
    return (com.tencent.mm.sdk.e.j)com.tencent.mm.plugin.forcenotify.d.a.mth;
  }

  public final void dS(Context paramContext)
  {
    AppMethodBeat.i(51046);
    a.f.b.j.p(paramContext, "context");
    ab.i(this.TAG, "[startForceNotifyShowUI]");
    paramContext.startActivity(new Intent(paramContext, ForceNotifyListUI.class));
    AppMethodBeat.o(51046);
  }

  public final boolean hasError()
  {
    AppMethodBeat.i(51048);
    com.tencent.mm.plugin.forcenotify.d.a locala = com.tencent.mm.plugin.forcenotify.d.a.mth;
    boolean bool;
    if (com.tencent.mm.plugin.forcenotify.d.a.byb() > 0)
    {
      bool = true;
      AppMethodBeat.o(51048);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51048);
    }
  }

  public final void hx(boolean paramBoolean)
  {
    mtc = paramBoolean;
  }

  public final void release()
  {
    AppMethodBeat.i(51039);
    super.release();
    com.tencent.mm.kernel.c.a locala = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(locala, "MMKernel.service<IMessen…engerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)locala).bOl().b(213, (g.a)this);
    locala = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(locala, "MMKernel.service<IMessen…engerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)locala).bOl().b(214, (g.a)this);
    AppMethodBeat.o(51039);
  }

  public final void start()
  {
    AppMethodBeat.i(51038);
    super.start();
    com.tencent.mm.kernel.c.a locala = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(locala, "MMKernel.service<IMessen…engerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)locala).bOl().a(213, (g.a)this);
    locala = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(locala, "MMKernel.service<IMessen…engerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)locala).bOl().a(214, (g.a)this);
    AppMethodBeat.o(51038);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.b.c
 * JD-Core Version:    0.6.2
 */