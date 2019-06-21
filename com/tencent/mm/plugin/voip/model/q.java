package com.tencent.mm.plugin.voip.model;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.kernel.e;
import com.tencent.mm.m.c;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.voip.b;
import com.tencent.mm.plugin.voip.ui.InviteRemindDialog;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class q
{
  private static boolean sSK;
  private static DialogInterface.OnClickListener sSL;

  static
  {
    AppMethodBeat.i(4592);
    sSK = false;
    sSL = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(4578);
        q.access$000();
        AppMethodBeat.o(4578);
      }
    };
    AppMethodBeat.o(4592);
  }

  public static long a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(4580);
    long l = a(paramString1, paramString2, paramInt1, paramInt2, paramString3, false);
    AppMethodBeat.o(4580);
    return l;
  }

  public static long a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(4581);
    bi localbi = new bi();
    localbi.eJ(bf.oC(paramString1));
    localbi.hO(paramInt1);
    localbi.setType(50);
    localbi.ju(paramString1);
    localbi.ix(paramString3);
    localbi.setContent(paramString2);
    localbi.setStatus(paramInt2);
    if (paramBoolean)
      localbi.dtL();
    long l = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Z(localbi);
    if (l < 0L)
      ab.e("MicroMsg.VoipPluginManager", "inset voip  failed!");
    ab.d("MicroMsg.VoipPluginManager", "inset voip  msgId ".concat(String.valueOf(l)));
    AppMethodBeat.o(4581);
    return l;
  }

  public static void aW(Context paramContext, final String paramString)
  {
    AppMethodBeat.i(4584);
    paramContext.getResources().getString(2131304353);
    sSK = false;
    try
    {
      if (((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Rc(paramString) != null)
        sSK = com.tencent.mm.plugin.voip.a.d.cLt();
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.VoipPluginManager", "talker is null");
        AppMethodBeat.o(4584);
        return;
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VoipPluginManager", localException1, "", new Object[0]);
        continue;
        int i = com.tencent.mm.kernel.g.Rg().acS();
        ab.d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus ".concat(String.valueOf(i)));
        if ((i != 4) && (i != 6))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(b.cIj().sSP.sNl.sPp.nwu), Long.valueOf(b.cIj().sSP.sNl.sPp.nwv), Long.valueOf(b.cIj().sSP.sNl.cIK()), Integer.valueOf(4), Integer.valueOf(0) });
          com.tencent.mm.ui.base.h.a(paramContext, 2131304445, 2131304449, sSL);
          AppMethodBeat.o(4584);
        }
        else
        {
          if (!sSK)
          {
            Object localObject3;
            label313: Object localObject4;
            Object localObject5;
            try
            {
              Object localObject1 = i.a.abV((String)com.tencent.mm.kernel.g.RP().Ry().get(77829, null));
              if (localObject1 != null)
                if ((localObject1 != null) && (((Map)localObject1).size() > 0))
                {
                  if (((Map)localObject1).containsKey(paramString))
                  {
                    localObject3 = (i.a)((Map)localObject1).get(paramString);
                    ((i.a)localObject3).hitCount += 1;
                    ((Map)localObject1).put(paramString, localObject3);
                  }
                }
                else
                {
                  com.tencent.mm.kernel.g.RP().Ry().set(77829, i.a.ah((Map)localObject1));
                  localObject3 = ((Map)localObject1).entrySet().iterator();
                  while (((Iterator)localObject3).hasNext())
                  {
                    localObject4 = (Map.Entry)((Iterator)localObject3).next();
                    localObject5 = (i.a)((Map.Entry)localObject4).getValue();
                    localObject1 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject1).<init>("val1 ");
                    ab.d("MicroMsg.VoipPluginManager", ((i.a)localObject5).hitCount + " " + ((i.a)localObject5).fMk + "name " + (String)((Map.Entry)localObject4).getKey());
                  }
                }
            }
            catch (Exception localException2)
            {
              ab.printErrStackTrace("MicroMsg.VoipPluginManager", localException2, "", new Object[0]);
            }
            while (true)
            {
              InviteRemindDialog.p(paramContext, paramString, 0);
              cJW();
              AppMethodBeat.o(4584);
              break;
              localObject3 = new com/tencent/mm/plugin/voip/model/i$a;
              ((i.a)localObject3).<init>();
              ((i.a)localObject3).hitCount += 1;
              localException2.put(paramString, localObject3);
              break label313;
              Object localObject2 = new java/util/HashMap;
              ((HashMap)localObject2).<init>();
              localObject3 = new com/tencent/mm/plugin/voip/model/i$a;
              ((i.a)localObject3).<init>();
              ((i.a)localObject3).hitCount += 1;
              ((Map)localObject2).put(paramString, localObject3);
              com.tencent.mm.kernel.g.RP().Ry().set(77829, i.a.ah((Map)localObject2));
              localObject2 = ((Map)localObject2).entrySet().iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject5 = (Map.Entry)((Iterator)localObject2).next();
                localObject3 = (i.a)((Map.Entry)localObject5).getValue();
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>("val2 ");
                ab.d("MicroMsg.VoipPluginManager", ((i.a)localObject3).hitCount + " " + ((i.a)localObject3).fMk + "  name " + (String)((Map.Entry)localObject5).getKey());
              }
            }
          }
          if (!at.isWap(paramContext))
          {
            if ((at.isWifi(paramContext)) || (cJV()))
            {
              b.cIj().bb(paramContext, paramString);
              AppMethodBeat.o(4584);
            }
            else
            {
              com.tencent.mm.ui.base.h.a(paramContext, 2131304448, 2131304449, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  AppMethodBeat.i(4576);
                  q.cJU();
                  b.cIj().bb(this.val$context, paramString);
                  AppMethodBeat.o(4576);
                }
              }
              , sSL);
              AppMethodBeat.o(4584);
            }
          }
          else
          {
            com.tencent.mm.ui.base.h.a(paramContext, 2131304478, 0, 2131304479, 2131296868, new q.2(paramContext), sSL);
            AppMethodBeat.o(4584);
          }
        }
      }
    }
  }

  public static void aX(Context paramContext, String paramString)
  {
    AppMethodBeat.i(4588);
    com.tencent.mm.m.g.Nv();
    int i;
    if (c.Ng() == 2)
      i = 1;
    while (true)
    {
      com.tencent.mm.bp.d.dlL();
      if (i == 0)
        ab.i("MicroMsg.VoipPluginManager", "showDouble %b, isLiteVersion: %b", new Object[] { Boolean.FALSE, Boolean.FALSE });
      sSK = false;
      try
      {
        if (((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Rc(paramString) != null)
          sSK = com.tencent.mm.plugin.voip.a.d.cLt();
        aZ(paramContext, paramString);
        AppMethodBeat.o(4588);
        return;
        i = 0;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
      }
    }
  }

  public static void aY(Context paramContext, String paramString)
  {
    AppMethodBeat.i(4589);
    sSK = false;
    try
    {
      if (((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Rc(paramString) != null)
        sSK = com.tencent.mm.plugin.voip.a.d.cLt();
      aZ(paramContext, paramString);
      AppMethodBeat.o(4589);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
    }
  }

  private static void aZ(Context paramContext, String paramString)
  {
    AppMethodBeat.i(4590);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.VoipPluginManager", "talker is null");
      AppMethodBeat.o(4590);
    }
    while (true)
    {
      return;
      int i = com.tencent.mm.kernel.g.Rg().acS();
      ab.d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus ".concat(String.valueOf(i)));
      if ((i != 4) && (i != 6))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(b.cIj().sSP.sNl.sPp.nwu), Long.valueOf(b.cIj().sSP.sNl.sPp.nwv), Long.valueOf(b.cIj().sSP.sNl.cIK()), Integer.valueOf(4), Integer.valueOf(0) });
        com.tencent.mm.ui.base.h.a(paramContext, 2131304445, 2131304449, sSL);
        AppMethodBeat.o(4590);
      }
      else
      {
        if (!sSK)
        {
          Object localObject3;
          label255: Object localObject4;
          Object localObject5;
          try
          {
            Object localObject1 = i.a.abV((String)com.tencent.mm.kernel.g.RP().Ry().get(77829, null));
            if (localObject1 != null)
              if ((localObject1 != null) && (((Map)localObject1).size() > 0))
              {
                if (((Map)localObject1).containsKey(paramString))
                {
                  localObject3 = (i.a)((Map)localObject1).get(paramString);
                  ((i.a)localObject3).hitCount += 1;
                  ((Map)localObject1).put(paramString, localObject3);
                }
              }
              else
              {
                com.tencent.mm.kernel.g.RP().Ry().set(77829, i.a.ah((Map)localObject1));
                localObject3 = ((Map)localObject1).entrySet().iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  localObject4 = (Map.Entry)((Iterator)localObject3).next();
                  localObject1 = (i.a)((Map.Entry)localObject4).getValue();
                  localObject5 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject5).<init>("val1 ");
                  ab.d("MicroMsg.VoipPluginManager", ((i.a)localObject1).hitCount + " " + ((i.a)localObject1).fMk + "name " + (String)((Map.Entry)localObject4).getKey());
                }
              }
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
          }
          while (true)
          {
            InviteRemindDialog.p(paramContext, paramString, 1);
            cJW();
            AppMethodBeat.o(4590);
            break;
            localObject3 = new com/tencent/mm/plugin/voip/model/i$a;
            ((i.a)localObject3).<init>();
            ((i.a)localObject3).hitCount += 1;
            localException.put(paramString, localObject3);
            break label255;
            Object localObject2 = new java/util/HashMap;
            ((HashMap)localObject2).<init>();
            localObject3 = new com/tencent/mm/plugin/voip/model/i$a;
            ((i.a)localObject3).<init>();
            ((i.a)localObject3).hitCount += 1;
            ((Map)localObject2).put(paramString, localObject3);
            com.tencent.mm.kernel.g.RP().Ry().set(77829, i.a.ah((Map)localObject2));
            localObject2 = ((Map)localObject2).entrySet().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject5 = (Map.Entry)((Iterator)localObject2).next();
              localObject3 = (i.a)((Map.Entry)localObject5).getValue();
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>("val2 ");
              ab.d("MicroMsg.VoipPluginManager", ((i.a)localObject3).hitCount + " " + ((i.a)localObject3).fMk + "  name " + (String)((Map.Entry)localObject5).getKey());
            }
          }
        }
        if (!at.isWap(paramContext))
        {
          if ((at.isWifi(paramContext)) || (cJV()))
          {
            b.cIj().ba(paramContext, paramString);
            AppMethodBeat.o(4590);
          }
          else
          {
            b.cIj().ba(paramContext, paramString);
            AppMethodBeat.o(4590);
          }
        }
        else
        {
          com.tencent.mm.ui.base.h.a(paramContext, 2131304478, 0, 2131304479, 2131296868, new q.4(paramContext), sSL);
          AppMethodBeat.o(4590);
        }
      }
    }
  }

  public static void cJU()
  {
    AppMethodBeat.i(4582);
    com.tencent.mm.kernel.g.RP().Ry().set(20480, Long.valueOf(System.currentTimeMillis()));
    AppMethodBeat.o(4582);
  }

  public static boolean cJV()
  {
    AppMethodBeat.i(4583);
    try
    {
      long l1 = System.currentTimeMillis();
      long l2 = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(20480, Integer.valueOf(-1))).longValue();
      if (l2 < 0L)
      {
        AppMethodBeat.o(4583);
        bool = false;
      }
      while (true)
      {
        return bool;
        l2 = l1 - l2;
        ab.d("MicroMsg.VoipPluginManager", "diff is".concat(String.valueOf(l2)));
        if (l2 >= 21600000L)
          break;
        bool = true;
        AppMethodBeat.o(4583);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(4583);
        boolean bool = false;
      }
    }
  }

  private static void cJW()
  {
    AppMethodBeat.i(4585);
    ui localui = new ui();
    localui.cQx.cAd = 8;
    a.xxA.m(localui);
    AppMethodBeat.o(4585);
  }

  public static void fb(Context paramContext)
  {
    AppMethodBeat.i(4586);
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("/");
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>("com.android.settings", "com.android.settings.ApnSettings");
      localIntent.setComponent(localComponentName);
      localIntent.setAction("android.intent.action.VIEW");
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(4586);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        searchIntentByClass(paramContext, "ApnSettings");
        AppMethodBeat.o(4586);
      }
    }
  }

  private static Intent searchIntentByClass(Context paramContext, String paramString)
  {
    AppMethodBeat.i(4587);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      List localList = localPackageManager.getInstalledPackages(0);
      if ((localList != null) && (localList.size() > 0))
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("package  size");
        ab.e("MicroMsg.VoipPluginManager", localList.size());
        int i = 0;
        while (true)
        {
          int j = localList.size();
          if (i < j)
            try
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("package ");
              ab.e("MicroMsg.VoipPluginManager", ((PackageInfo)localList.get(i)).packageName);
              localObject = new android/content/Intent;
              ((Intent)localObject).<init>();
              ((Intent)localObject).setPackage(((PackageInfo)localList.get(i)).packageName);
              localObject = localPackageManager.queryIntentActivities((Intent)localObject, 0);
              if (localObject != null)
                j = ((List)localObject).size();
              while (true)
                if (j > 0)
                  try
                  {
                    ab.e("MicroMsg.VoipPluginManager", "activityName count ".concat(String.valueOf(j)));
                    for (int k = 0; ; k++)
                    {
                      if (k >= j)
                        break label327;
                      ActivityInfo localActivityInfo = ((ResolveInfo)((List)localObject).get(k)).activityInfo;
                      if (localActivityInfo.name.contains(paramString))
                      {
                        localObject = new android/content/Intent;
                        ((Intent)localObject).<init>("/");
                        ComponentName localComponentName = new android/content/ComponentName;
                        localComponentName.<init>(localActivityInfo.packageName, localActivityInfo.name);
                        ((Intent)localObject).setComponent(localComponentName);
                        ((Intent)localObject).setAction("android.intent.action.VIEW");
                        paramContext.startActivity((Intent)localObject);
                        AppMethodBeat.o(4587);
                        paramContext = (Context)localObject;
                        return paramContext;
                        j = 0;
                        break;
                      }
                    }
                  }
                  catch (Exception localException1)
                  {
                    ab.printErrStackTrace("MicroMsg.VoipPluginManager", localException1, "", new Object[0]);
                  }
              label327: i++;
            }
            catch (Exception localException2)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.VoipPluginManager", localException2, "", new Object[0]);
            }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VoipPluginManager", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(4587);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.q
 * JD-Core Version:    0.6.2
 */