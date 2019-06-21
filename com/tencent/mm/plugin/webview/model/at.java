package com.tencent.mm.plugin.webview.model;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class at
{
  private static List<d.a> unz;

  static
  {
    AppMethodBeat.i(6815);
    unz = new LinkedList();
    AppMethodBeat.o(6815);
  }

  private static String Fv(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(6811);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(6811);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = com.tencent.mm.plugin.base.model.b.da(paramString, q.LK());
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(6811);
        paramString = localObject;
      }
      else
      {
        paramString = "shortcut_" + com.tencent.mm.plugin.base.model.b.V(paramString.getBytes());
        AppMethodBeat.o(6811);
      }
    }
  }

  public static Intent a(Context paramContext, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(6810);
    ab.i("MicroMsg.WebviewShrotcutManager", "buildIntent, install = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBitmap == null) && (paramBoolean))
    {
      ab.e("MicroMsg.WebviewShrotcutManager", "no bmp");
      AppMethodBeat.o(6810);
    }
    String str;
    for (paramContext = (Context)localObject1; ; paramContext = (Context)localObject1)
    {
      return paramContext;
      str = Fv(paramString1);
      if (!bo.isNullOrNil(str))
        break;
      AppMethodBeat.o(6810);
    }
    if (paramBoolean);
    for (localObject1 = "com.android.launcher.action.INSTALL_SHORTCUT"; ; localObject1 = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      localObject1 = new Intent((String)localObject1);
      ((Intent)localObject1).putExtra("android.intent.extra.shortcut.NAME", paramString3);
      ((Intent)localObject1).putExtra("duplicate", false);
      Object localObject2 = "";
      h localh = o.act().qo(paramString1);
      paramString1 = (String)localObject2;
      if (localh != null)
        paramString1 = com.tencent.mm.a.g.x((paramString3 + localh.acl()).getBytes());
      localObject2 = new Intent("com.tencent.mm.action.WX_SHORTCUT");
      ((Intent)localObject2).putExtra("type", 2);
      ((Intent)localObject2).putExtra("id", str);
      ((Intent)localObject2).putExtra("ext_info", Fv(paramString2));
      ((Intent)localObject2).putExtra("ext_info_1", Fv(paramString3));
      paramString3 = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      ((Intent)localObject2).putExtra("token", db(paramString2, a.QF()));
      ((Intent)localObject2).putExtra("digest", paramString1);
      ((Intent)localObject2).setPackage(paramContext.getPackageName());
      ((Intent)localObject2).addFlags(67108864);
      ((Intent)localObject1).putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)localObject2);
      ((Intent)localObject1).putExtra("android.intent.extra.shortcut.ICON", paramBitmap);
      AppMethodBeat.o(6810);
      paramContext = (Context)localObject1;
      break;
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, at.a parama)
  {
    AppMethodBeat.i(6806);
    if ((paramContext == null) || (bo.isNullOrNil(paramString1)))
    {
      ab.e("MicroMsg.WebviewShrotcutManager", "context or username is null");
      if (parama != null)
        parama.hJ(false);
      AppMethodBeat.o(6806);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.WebviewShrotcutManager", "addShortcut, username = %s", new Object[] { paramString1 });
      if (!com.tencent.mm.kernel.g.RK())
      {
        ab.e("MicroMsg.WebviewShrotcutManager", "acc not ready");
        if (parama != null)
          parama.hJ(false);
        AppMethodBeat.o(6806);
      }
      else
      {
        ad localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramString1);
        String str = "";
        if (localad != null)
          str = localad.Oi();
        if (bo.isNullOrNil(str))
        {
          ab.e("MicroMsg.WebviewShrotcutManager", "displayname is nil, should pull from service");
          ao.a.flu.a(paramString1, "", new at.1(parama, paramString1, paramContext, paramString2));
          AppMethodBeat.o(6806);
        }
        else
        {
          a(paramContext, paramString1, paramString2, str, parama);
          AppMethodBeat.o(6806);
        }
      }
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, at.a parama)
  {
    AppMethodBeat.i(6807);
    if (bj(paramContext, paramString3))
    {
      ab.i("MicroMsg.WebviewShrotcutManager", "shortcut has exist");
      if (parama != null)
        parama.hJ(true);
      AppMethodBeat.o(6807);
    }
    while (true)
    {
      return;
      at.2 local2 = new at.2(paramString1, paramContext, parama, paramString2, paramString3);
      unz.add(local2);
      o.acd().a(local2);
      Bitmap localBitmap = bi(paramContext, paramString1);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        ab.e("MicroMsg.WebviewShrotcutManager", "getAvatarBitmap fail, bmp is null, start timer.");
        new ap(new at.b(new at.3(local2, parama, paramString1)), false).ae(5000L, 5000L);
        AppMethodBeat.o(6807);
      }
      else
      {
        unz.remove(local2);
        o.acd().b(local2);
        paramString1 = a(paramContext, paramString1, paramString2, paramString3, localBitmap, true);
        if (paramString1 == null)
        {
          ab.e("MicroMsg.WebviewShrotcutManager", "intent is null");
          if (parama != null)
            parama.hJ(false);
          AppMethodBeat.o(6807);
        }
        else
        {
          com.tencent.mm.plugin.base.model.b.r(paramContext, paramString1);
          if (parama != null)
            parama.hJ(true);
          AppMethodBeat.o(6807);
        }
      }
    }
  }

  private static Bitmap bi(Context paramContext, String paramString)
  {
    AppMethodBeat.i(6808);
    paramString = com.tencent.mm.ah.b.a(paramString, false, -1);
    if ((paramString != null) && (!paramString.isRecycled()))
    {
      int i = (int)(paramContext.getResources().getDisplayMetrics().density * 48.0F);
      paramContext = Bitmap.createScaledBitmap(paramString, i, i, false);
      AppMethodBeat.o(6808);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(6808);
      paramContext = paramString;
    }
  }

  private static boolean bj(Context paramContext, String paramString)
  {
    AppMethodBeat.i(6813);
    try
    {
      ContentResolver localContentResolver = paramContext.getContentResolver();
      paramContext = ah.getContext().getPackageManager().getInstalledPackages(8);
      int j;
      label67: Object localObject;
      if (paramContext != null)
      {
        paramContext = paramContext.iterator();
        while (true)
          if (paramContext.hasNext())
          {
            ProviderInfo[] arrayOfProviderInfo = ((PackageInfo)paramContext.next()).providers;
            if (arrayOfProviderInfo != null)
            {
              int i = arrayOfProviderInfo.length;
              j = 0;
              if (j < i)
              {
                localObject = arrayOfProviderInfo[j];
                if ("com.android.launcher.permission.READ_SETTINGS".equals(((ProviderInfo)localObject).readPermission))
                {
                  paramContext = ((ProviderInfo)localObject).authority;
                  label100: localObject = new java/lang/StringBuilder;
                  ((StringBuilder)localObject).<init>("content://");
                  paramContext = localContentResolver.query(Uri.parse(paramContext + "/favorites?notify=true"), new String[] { "title", "iconResource" }, "title=?", new String[] { paramString }, null);
                  if (paramContext == null)
                    break label248;
                  if (paramContext.getCount() <= 0)
                    break label229;
                }
              }
            }
          }
      }
      label229: for (bool = true; ; bool = false)
      {
        paramContext.close();
        AppMethodBeat.o(6813);
        return bool;
        if ("com.android.launcher.permission.READ_SETTINGS".equals(((ProviderInfo)localObject).writePermission))
        {
          paramContext = ((ProviderInfo)localObject).authority;
          break label100;
        }
        j++;
        break label67;
        break;
        paramContext = null;
        break label100;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(6813);
        boolean bool = false;
        continue;
        label248: bool = false;
      }
    }
  }

  public static String db(String paramString1, String paramString2)
  {
    AppMethodBeat.i(6812);
    paramString1 = com.tencent.mm.a.g.x((com.tencent.mm.a.g.x(paramString1.getBytes()) + com.tencent.mm.plugin.base.model.b.da(paramString2, paramString1)).getBytes());
    AppMethodBeat.o(6812);
    return paramString1;
  }

  public static void f(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6809);
    if ((paramContext == null) || (bo.isNullOrNil(paramString3)))
      ab.e("MicroMsg.WebviewShrotcutManager", "remove failed, invalid params");
    paramString1 = a(paramContext, paramString1, paramString2, paramString3, null, false);
    if (paramString1 == null)
    {
      ab.e("MicroMsg.WebviewShrotcutManager", "remove failed, intent is null");
      AppMethodBeat.o(6809);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.base.model.b.s(paramContext, paramString1);
      AppMethodBeat.o(6809);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.at
 * JD-Core Version:    0.6.2
 */