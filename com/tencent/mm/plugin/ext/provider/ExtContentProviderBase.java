package com.tencent.mm.plugin.ext.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.s.a.a;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtContentProviderBase extends ContentProvider
{
  protected static boolean jDQ;
  private static HashMap<String, Long> lPZ;
  protected MatrixCursor jDN;
  private long lPU;
  private String lPV;
  public String lPW;
  private String[] lPX;
  private int lPY;

  static
  {
    AppMethodBeat.i(20340);
    jDQ = false;
    lPZ = new HashMap();
    AppMethodBeat.o(20340);
  }

  public ExtContentProviderBase()
  {
    AppMethodBeat.i(20326);
    this.jDN = new MatrixCursor(new String[0]);
    this.lPU = bo.yz();
    this.lPW = "";
    this.lPY = 0;
    AppMethodBeat.o(20326);
  }

  private int brK()
  {
    AppMethodBeat.i(20330);
    int i = (int)bo.az(this.lPU);
    AppMethodBeat.o(20330);
    return i;
  }

  private void dK(Context paramContext)
  {
    AppMethodBeat.i(20339);
    if (paramContext == null)
    {
      ab.w("MicroMsg.ExtContentProviderBase", "in initCallerPkgName(), context == null");
      AppMethodBeat.o(20339);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ExtContentProviderBase", "Binder.getCallingUid() = " + Binder.getCallingUid());
      this.lPX = paramContext.getPackageManager().getPackagesForUid(Binder.getCallingUid());
      if (this.lPX == null)
        ab.w("MicroMsg.ExtContentProviderBase", "m_pkgs == null");
      AppMethodBeat.o(20339);
    }
  }

  private static String p(Uri paramUri)
  {
    AppMethodBeat.i(20336);
    if (paramUri == null)
    {
      paramUri = "";
      AppMethodBeat.o(20336);
    }
    while (true)
    {
      return paramUri;
      paramUri = bo.nullAsNil(paramUri.getQueryParameter("appid"));
      AppMethodBeat.o(20336);
    }
  }

  protected final void T(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(20329);
    ab.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { brL(), this.lPW, Integer.valueOf(this.lPY), Integer.valueOf(paramInt2), Integer.valueOf(brK()) });
    h.pYm.e(10505, new Object[] { brL(), this.lPW, Integer.valueOf(this.lPY), Integer.valueOf(paramInt2), Integer.valueOf(brK()), Integer.valueOf(paramInt3) });
    h.pYm.a(300L, paramInt1, 1L, false);
    AppMethodBeat.o(20329);
  }

  protected final void a(Uri paramUri, Context paramContext, int paramInt)
  {
    AppMethodBeat.i(20332);
    this.lPW = p(paramUri);
    dK(paramContext);
    this.lPY = paramInt;
    this.lPU = bo.yz();
    AppMethodBeat.o(20332);
  }

  protected final void a(Uri paramUri, Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    AppMethodBeat.i(20333);
    this.lPW = p(paramUri);
    if (paramArrayOfString == null)
      dK(paramContext);
    while (true)
    {
      this.lPY = paramInt;
      this.lPU = bo.yz();
      AppMethodBeat.o(20333);
      return;
      this.lPX = paramArrayOfString;
    }
  }

  protected final void a(Uri paramUri, Context paramContext, UriMatcher paramUriMatcher)
  {
    AppMethodBeat.i(20331);
    this.lPW = p(paramUri);
    dK(paramContext);
    if (paramUriMatcher != null)
    {
      this.lPY = paramUriMatcher.match(paramUri);
      if (this.lPY < 0)
        this.lPY = 0;
    }
    this.lPU = bo.yz();
    AppMethodBeat.o(20331);
  }

  protected final boolean aVl()
  {
    boolean bool1 = false;
    AppMethodBeat.i(20335);
    try
    {
      ab.i("MicroMsg.ExtContentProviderBase", "checkIsLogin()");
      Object localObject;
      if (!jDQ)
      {
        localObject = new com/tencent/mm/pluginsdk/d/a/b;
        ((b)localObject).<init>();
        ExtContentProviderBase.1 local1 = new com/tencent/mm/plugin/ext/provider/ExtContentProviderBase$1;
        local1.<init>(this, (b)localObject);
        ((b)localObject).b(4000L, local1);
      }
      if ((aw.RK()) && (aw.ZM()) && (!aw.QT()));
      for (jDQ = true; ; jDQ = false)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("hasLogin = ");
        ab.i("MicroMsg.ExtContentProviderBase", jDQ);
        boolean bool2 = jDQ;
        AppMethodBeat.o(20335);
        bool1 = bool2;
        return bool1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.ExtContentProviderBase", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtContentProviderBase", localException, "", new Object[0]);
        AppMethodBeat.o(20335);
      }
    }
  }

  protected final String brL()
  {
    AppMethodBeat.i(20334);
    String str;
    if (!bo.isNullOrNil(this.lPV))
    {
      str = this.lPV;
      AppMethodBeat.o(20334);
    }
    while (true)
    {
      return str;
      if ((this.lPX == null) || (this.lPX.length <= 0))
      {
        str = "";
        AppMethodBeat.o(20334);
      }
      else
      {
        str = this.lPX[0];
        AppMethodBeat.o(20334);
      }
    }
  }

  protected final int brM()
  {
    AppMethodBeat.i(20338);
    int i;
    if (bo.isNullOrNil(this.lPW))
    {
      ab.e("MicroMsg.ExtContentProviderBase", "invalid appid, ignore");
      i = 7;
      AppMethodBeat.o(20338);
    }
    while (true)
    {
      return i;
      if ((this.lPX == null) || (this.lPX.length <= 0))
      {
        ab.e("MicroMsg.ExtContentProviderBase", "packageList is null");
        i = 6;
        AppMethodBeat.o(20338);
        continue;
      }
      try
      {
        localf = g.bT(this.lPW, true);
        if (localf == null)
        {
          ab.w("MicroMsg.ExtContentProviderBase", "app not reg, do nothing");
          i = 13;
          AppMethodBeat.o(20338);
          continue;
        }
        if (localf.field_status == 3)
        {
          ab.e("MicroMsg.ExtContentProviderBase", "app is in blacklist.pkg:%s", new Object[] { localf.field_packageName });
          i = 10;
        }
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            f localf;
            Object localObject1 = Long.valueOf(bo.a((Long)lPZ.get(this.lPW), 0L));
            ab.i("MicroMsg.ExtContentProviderBase", "lastCheckTime = %s, current = %s", new Object[] { localObject1, Long.valueOf(System.currentTimeMillis()) });
            if (System.currentTimeMillis() - ((Long)localObject1).longValue() > 3600000L)
            {
              ab.i("MicroMsg.ExtContentProviderBase", "update appInfo %s", new Object[] { this.lPW });
              a.a.bYQ().Us(this.lPW);
              lPZ.put(this.lPW, Long.valueOf(System.currentTimeMillis()));
            }
            AppMethodBeat.o(20338);
            break;
            Object localObject2 = this.lPX;
            int j = localObject2.length;
            i = 0;
            label262: if (i < j)
            {
              localObject1 = localObject2[i];
              if ((((String)localObject1).equals(localf.field_packageName)) && (p.a(ah.getContext(), localf, (String)localObject1, false)))
                ab.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", new Object[] { localObject1 });
              try
              {
                this.lPV = ((String)localObject1);
                i = 1;
                if (i != 1);
              }
              catch (Exception localException2)
              {
                try
                {
                  localObject2 = (Integer)c.b.val.get(Integer.valueOf(this.lPY));
                  localObject1 = localObject2;
                  if (localObject2 == null)
                  {
                    dZ(5, 16);
                    ab.i("MicroMsg.ExtContentProviderBase", "api flag = null");
                    localObject1 = Integer.valueOf(64);
                  }
                  if (!g.b(localf, ((Integer)localObject1).intValue()))
                  {
                    i = 11;
                    continue;
                    i++;
                    break label262;
                  }
                  ab.e("MicroMsg.ExtContentProviderBase", "appInfoFlag not set");
                  continue;
                  localException1 = localException1;
                  for (i = 0; ; i = 1)
                  {
                    label408: ab.e("MicroMsg.ExtContentProviderBase", "Exception in isAppidValid, %s", new Object[] { localException1.getMessage() });
                    ab.printErrStackTrace("MicroMsg.ExtContentProviderBase", localException1, "", new Object[0]);
                    break;
                    localException2 = localException2;
                  }
                }
                catch (Exception localException3)
                {
                  break label408;
                }
              }
            }
          }
        }
        catch (Exception localException4)
        {
          while (true)
          {
            continue;
            i = 0;
          }
        }
      }
    }
  }

  protected final boolean dJ(Context paramContext)
  {
    AppMethodBeat.i(20337);
    boolean bool;
    if (paramContext == null)
    {
      ab.w("MicroMsg.ExtContentProviderBase", "in checkAppId(), context == null");
      AppMethodBeat.o(20337);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(this.lPW))
      {
        ab.e("MicroMsg.ExtContentProviderBase", "invalid appid, ignore");
        AppMethodBeat.o(20337);
        bool = false;
        continue;
      }
      if ((this.lPX == null) || (this.lPX.length <= 0))
      {
        ab.e("MicroMsg.ExtContentProviderBase", "packageList is null");
        AppMethodBeat.o(20337);
        bool = false;
        continue;
      }
      try
      {
        localf = g.bT(this.lPW, true);
        if (localf == null)
        {
          ab.w("MicroMsg.ExtContentProviderBase", "app not reg, do nothing");
          AppMethodBeat.o(20337);
          bool = false;
          continue;
        }
        if (localf.field_status == 3)
        {
          ab.e("MicroMsg.ExtContentProviderBase", "app is in blacklist.pkg:%s", new Object[] { localf.field_packageName });
          bool = false;
        }
      }
      catch (Exception paramContext)
      {
        try
        {
          while (true)
          {
            f localf;
            paramContext = Long.valueOf(bo.a((Long)lPZ.get(this.lPW), 0L));
            ab.i("MicroMsg.ExtContentProviderBase", "lastCheckTime = %s, current = %s", new Object[] { paramContext, Long.valueOf(System.currentTimeMillis()) });
            if (System.currentTimeMillis() - paramContext.longValue() > 3600000L)
            {
              ab.i("MicroMsg.ExtContentProviderBase", "update appInfo %s", new Object[] { this.lPW });
              a.a.bYQ().Us(this.lPW);
              lPZ.put(this.lPW, Long.valueOf(System.currentTimeMillis()));
            }
            AppMethodBeat.o(20337);
            break;
            paramContext = this.lPX;
            int i = paramContext.length;
            int j = 0;
            label280: if (j < i)
            {
              Object localObject = paramContext[j];
              if ((((String)localObject).equals(localf.field_packageName)) && (p.a(ah.getContext(), localf, (String)localObject, false)))
                ab.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", new Object[] { localObject });
              try
              {
                this.lPV = ((String)localObject);
                bool = true;
                if (!bool);
              }
              catch (Exception paramContext)
              {
                try
                {
                  localObject = (Integer)c.b.val.get(Integer.valueOf(this.lPY));
                  paramContext = (Context)localObject;
                  if (localObject == null)
                    paramContext = Integer.valueOf(64);
                  if (!g.b(localf, paramContext.intValue()))
                  {
                    bool = false;
                    continue;
                    j++;
                    break label280;
                  }
                  ab.e("MicroMsg.ExtContentProviderBase", "appInfoFlag not set");
                  continue;
                  paramContext = paramContext;
                  for (bool = false; ; bool = true)
                  {
                    label415: ab.e("MicroMsg.ExtContentProviderBase", "Exception in isAppidValid, %s", new Object[] { paramContext.getMessage() });
                    ab.printErrStackTrace("MicroMsg.ExtContentProviderBase", paramContext, "", new Object[0]);
                    break;
                    paramContext = paramContext;
                  }
                }
                catch (Exception paramContext)
                {
                  break label415;
                }
              }
            }
          }
        }
        catch (Exception paramContext)
        {
          while (true)
          {
            continue;
            bool = false;
          }
        }
      }
    }
  }

  protected final void dZ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(20328);
    ab.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { brL(), this.lPW, Integer.valueOf(this.lPY), Integer.valueOf(paramInt1), Integer.valueOf(brK()) });
    h.pYm.e(10505, new Object[] { brL(), this.lPW, Integer.valueOf(this.lPY), Integer.valueOf(paramInt1), Integer.valueOf(brK()), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(20328);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  protected final void vf(int paramInt)
  {
    AppMethodBeat.i(20327);
    ab.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { brL(), this.lPW, Integer.valueOf(this.lPY), Integer.valueOf(paramInt), Integer.valueOf(brK()) });
    h.pYm.e(10505, new Object[] { brL(), this.lPW, Integer.valueOf(this.lPY), Integer.valueOf(paramInt), Integer.valueOf(brK()) });
    AppMethodBeat.o(20327);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtContentProviderBase
 * JD-Core Version:    0.6.2
 */