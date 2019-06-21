package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.i;
import com.tencent.mm.ba.r;
import com.tencent.mm.g.a.ta;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelmulti.o;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.pluginsdk.j;
import com.tencent.mm.pluginsdk.ui.e.q;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.u.a;

final class x
  implements i, com.tencent.mm.pluginsdk.h, j, com.tencent.mm.pluginsdk.m
{
  public final String B(String paramString1, String paramString2)
  {
    AppMethodBeat.i(15433);
    paramString1 = com.tencent.mm.pluginsdk.model.app.p.B(paramString1, paramString2);
    AppMethodBeat.o(15433);
    return paramString1;
  }

  public final void BS()
  {
    AppMethodBeat.i(15424);
    com.tencent.mm.modelmulti.n.ahW().lN(7);
    AppMethodBeat.o(15424);
  }

  public final com.tencent.mm.ai.h BT()
  {
    AppMethodBeat.i(15426);
    com.tencent.mm.audio.a.a locala = new com.tencent.mm.audio.a.a(ah.getContext());
    AppMethodBeat.o(15426);
    return locala;
  }

  public final void BU()
  {
    AppMethodBeat.i(15436);
    ta localta = new ta();
    localta.cPk.cPm = true;
    com.tencent.mm.sdk.b.a.xxA.m(localta);
    AppMethodBeat.o(15436);
  }

  public final void BV()
  {
    AppMethodBeat.i(15441);
    MMAppMgr.BV();
    AppMethodBeat.o(15441);
  }

  public final Intent BW()
  {
    AppMethodBeat.i(15446);
    Intent localIntent = new Intent(ah.getContext(), LauncherUI.class);
    localIntent.putExtra("nofification_type", "talkroom_notification");
    localIntent.addFlags(67108864);
    AppMethodBeat.o(15446);
    return localIntent;
  }

  public final boolean BX()
  {
    AppMethodBeat.i(15451);
    boolean bool = q.BX();
    AppMethodBeat.o(15451);
    return bool;
  }

  public final void BY()
  {
    AppMethodBeat.i(15453);
    com.tencent.mm.booter.n.BY();
    AppMethodBeat.o(15453);
  }

  public final boolean BZ()
  {
    AppMethodBeat.i(15459);
    boolean bool = com.tencent.mm.modelmulti.k.ahT();
    AppMethodBeat.o(15459);
    return bool;
  }

  public final Bitmap a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject = null;
    AppMethodBeat.i(15445);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(15445);
      paramActivity = localObject;
    }
    while (true)
    {
      return paramActivity;
      switch (paramInt1)
      {
      default:
      case 3:
      case 2:
      case 4:
      }
      while (true)
      {
        AppMethodBeat.o(15445);
        paramActivity = localObject;
        break;
        paramIntent = com.tencent.mm.pluginsdk.ui.tools.n.h(paramActivity.getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.euY);
        if (paramIntent == null)
        {
          AppMethodBeat.o(15445);
          paramActivity = localObject;
          break;
        }
        Intent localIntent = new Intent();
        localIntent.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
        localIntent.putExtra("CropImageMode", 1);
        localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.euY + "temp.avatar");
        localIntent.putExtra("CropImage_ImgPath", paramIntent);
        paramActivity.startActivityForResult(localIntent, 4);
        AppMethodBeat.o(15445);
        paramActivity = localObject;
        break;
        if (paramIntent == null)
        {
          AppMethodBeat.o(15445);
          paramActivity = localObject;
          break;
        }
        localIntent = new Intent();
        localIntent.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
        localIntent.putExtra("CropImageMode", 1);
        localIntent.putExtra("CropImage_Filter", true);
        localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.euY + "temp.avatar");
        localIntent.putExtra("CropImage_ImgPath", null);
        com.tencent.mm.ui.tools.a.a(paramActivity, paramIntent, localIntent, com.tencent.mm.compatible.util.e.euY, 4);
        AppMethodBeat.o(15445);
        paramActivity = localObject;
        break;
        if (paramIntent == null)
        {
          AppMethodBeat.o(15445);
          paramActivity = localObject;
          break;
        }
        paramActivity = paramIntent.getStringExtra("CropImage_OutputPath");
        if (paramActivity != null)
          break label334;
        ab.e("MicroMsg.WorkerModelCallback", "crop picture failed");
      }
      label334: ab.e("MicroMsg.WorkerModelCallback", "crop picture path %s ", new Object[] { paramActivity });
      paramActivity = com.tencent.mm.sdk.platformtools.d.aml(paramActivity);
      AppMethodBeat.o(15445);
    }
  }

  public final com.tencent.mm.ai.m a(com.tencent.mm.ai.g paramg)
  {
    AppMethodBeat.i(15447);
    if (com.tencent.mm.modelmulti.k.ahT())
    {
      paramg = new com.tencent.mm.modelmulti.e(paramg);
      AppMethodBeat.o(15447);
    }
    while (true)
    {
      return paramg;
      com.tencent.mm.modelmulti.n.ahW().lN(4);
      paramg = null;
      AppMethodBeat.o(15447);
    }
  }

  public final void a(Context paramContext, ad paramad, bi.a parama, Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(15455);
    com.tencent.mm.ui.contact.e.a(paramContext, paramad, parama, true, true, paramBundle, paramString);
    AppMethodBeat.o(15455);
  }

  public final void a(Context paramContext, bi.a parama, Bundle paramBundle)
  {
    AppMethodBeat.i(15454);
    com.tencent.mm.ui.contact.e.a(paramContext, parama, true, true, paramBundle);
    AppMethodBeat.o(15454);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(15434);
    com.tencent.mm.plugin.game.a.a locala = a.a.bDb();
    if (locala != null)
      locala.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramString4, paramString5, "");
    AppMethodBeat.o(15434);
  }

  public final void a(Intent paramIntent, buv parambuv, int paramInt)
  {
    AppMethodBeat.i(15452);
    com.tencent.mm.api.b.a(paramIntent, parambuv, paramInt);
    AppMethodBeat.o(15452);
  }

  public final void a(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(15456);
    com.tencent.mm.ui.contact.e.a(paramIntent, paramString);
    AppMethodBeat.o(15456);
  }

  public final void a(com.tencent.mm.aj.d paramd, Activity paramActivity, ad paramad)
  {
    AppMethodBeat.i(15450);
    com.tencent.mm.ui.tools.b.c(paramd, paramActivity, paramad);
    AppMethodBeat.o(15450);
  }

  public final void a(com.tencent.mm.aj.d paramd, Activity paramActivity, ad paramad, boolean paramBoolean, Runnable paramRunnable)
  {
    AppMethodBeat.i(15449);
    com.tencent.mm.ui.tools.b.a(paramd, paramActivity, paramad, paramBoolean, paramRunnable, 0);
    AppMethodBeat.o(15449);
  }

  public final void a(bbv parambbv, String paramString)
  {
    AppMethodBeat.i(15458);
    ((com.tencent.mm.plugin.messenger.foundation.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.d.class)).a(parambbv, paramString);
    AppMethodBeat.o(15458);
  }

  public final void a(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    AppMethodBeat.i(15435);
    com.tencent.mm.plugin.game.a.a locala = a.a.bDb();
    if (locala != null)
      locala.a(paramString1, paramString2, 2, 4, paramString3, paramLong, "");
    AppMethodBeat.o(15435);
  }

  public final boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(15439);
    boolean bool = u.a.a(paramContext, paramInt1, paramInt2, paramString, 4);
    AppMethodBeat.o(15439);
    return bool;
  }

  public final boolean a(ad paramad)
  {
    AppMethodBeat.i(15448);
    boolean bool = com.tencent.mm.modelmulti.a.a(paramad);
    AppMethodBeat.o(15448);
    return bool;
  }

  public final boolean b(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(15440);
    boolean bool = u.a.a(paramContext, paramInt1, paramInt2, paramString, 7);
    AppMethodBeat.o(15440);
    return bool;
  }

  public final void bc(Context paramContext)
  {
    AppMethodBeat.i(15443);
    MMAppMgr.hs(paramContext);
    AppMethodBeat.o(15443);
  }

  public final com.tencent.mm.ai.m bj(boolean paramBoolean)
  {
    AppMethodBeat.i(15437);
    if (paramBoolean)
      r.aix().lT(4);
    com.tencent.mm.ba.k localk = new com.tencent.mm.ba.k(4);
    aw.Rg().a(localk, 0);
    AppMethodBeat.o(15437);
    return localk;
  }

  public final String df(String paramString)
  {
    AppMethodBeat.i(15428);
    if (com.tencent.mm.pluginsdk.model.app.g.bT(paramString, false) != null)
    {
      paramString = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, false).field_packageName;
      AppMethodBeat.o(15428);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(15428);
    }
  }

  public final boolean dg(String paramString)
  {
    AppMethodBeat.i(15430);
    boolean bool = com.tencent.mm.pluginsdk.model.app.g.dg(paramString);
    AppMethodBeat.o(15430);
    return bool;
  }

  public final boolean dk(String paramString)
  {
    AppMethodBeat.i(15438);
    boolean bool = com.tencent.mm.pluginsdk.model.app.g.dk(paramString);
    AppMethodBeat.o(15438);
    return bool;
  }

  public final void dl(String paramString)
  {
    AppMethodBeat.i(15457);
    com.tencent.mm.aq.b.agG();
    com.tencent.mm.aq.b.rX(paramString);
    AppMethodBeat.o(15457);
  }

  public final String f(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(15432);
    paramContext = com.tencent.mm.pluginsdk.model.app.p.f(paramContext, paramString1, paramString2);
    AppMethodBeat.o(15432);
    return paramContext;
  }

  public final void gk(int paramInt)
  {
    AppMethodBeat.i(15425);
    ab.d("MicroMsg.WorkerModelCallback", "trigger netscene sync, scene[%d]", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.modelmulti.n.ahW().lN(paramInt);
    AppMethodBeat.o(15425);
  }

  public final boolean o(Activity paramActivity)
  {
    AppMethodBeat.i(15442);
    boolean bool;
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      t.hO(paramActivity);
      bool = false;
      AppMethodBeat.o(15442);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.pluginsdk.ui.tools.n.k(paramActivity, 2);
      bool = true;
      AppMethodBeat.o(15442);
    }
  }

  public final void p(Activity paramActivity)
  {
    AppMethodBeat.i(15444);
    MMAppMgr.ar(paramActivity);
    AppMethodBeat.o(15444);
  }

  public final String t(Context paramContext, String paramString)
  {
    AppMethodBeat.i(15429);
    paramContext = com.tencent.mm.pluginsdk.model.app.g.t(paramContext, paramString);
    AppMethodBeat.o(15429);
    return paramContext;
  }

  public final String t(String paramString, int paramInt)
  {
    AppMethodBeat.i(15427);
    if (com.tencent.mm.pluginsdk.model.app.g.dX(paramString, paramInt) != null)
    {
      paramString = com.tencent.mm.pluginsdk.model.app.g.dX(paramString, paramInt).field_packageName;
      AppMethodBeat.o(15427);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(15427);
    }
  }

  public final boolean u(Context paramContext, String paramString)
  {
    AppMethodBeat.i(15431);
    boolean bool = com.tencent.mm.pluginsdk.model.app.g.u(paramContext, paramString);
    AppMethodBeat.o(15431);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.x
 * JD-Core Version:    0.6.2
 */