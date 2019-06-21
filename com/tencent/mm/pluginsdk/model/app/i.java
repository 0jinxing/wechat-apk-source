package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.c.s;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public final class i extends com.tencent.mm.sdk.e.j<f>
{
  public static final String[] fnj;
  public final com.tencent.mm.a.f<String, f> vcc;

  static
  {
    AppMethodBeat.i(79326);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(f.ccO, "AppInfo") };
    AppMethodBeat.o(79326);
  }

  public i(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, f.ccO, "AppInfo", s.diI);
    AppMethodBeat.i(79309);
    this.vcc = new c(50);
    parame = new f();
    parame.field_appId = "wx4310bbd51be7d979";
    if (!super.b(parame, new String[0]))
    {
      parame = new f();
      parame.field_appId = "wx4310bbd51be7d979";
      parame.field_appName = "weixinfile";
      parame.field_packageName = "com.tencent.mm.openapi";
      parame.field_status = -1;
      super.b(parame);
    }
    AppMethodBeat.o(79309);
  }

  private void MQ(String paramString)
  {
    AppMethodBeat.i(79311);
    if (!bo.isNullOrNil(paramString))
      this.vcc.remove(paramString);
    AppMethodBeat.o(79311);
  }

  public static String dY(String paramString, int paramInt)
  {
    Object localObject = null;
    int i = 0;
    AppMethodBeat.i(79319);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppInfoStorage", "getIconPath : invalid argument");
      AppMethodBeat.o(79319);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str = a.bYG();
      b localb1 = new b(str);
      b localb2;
      if (!localb1.exists())
        if (!localb1.dMC().exists())
        {
          localb2 = localb1.dMC();
          b localb3 = new b(com.tencent.mm.vfs.j.w(localb2.dMD()) + System.currentTimeMillis());
          if (localb3.mkdirs())
            localb3.o(localb2);
        }
        else
        {
          if ((localb1.mkdirs()) && (localb1.isDirectory()))
            break label201;
          ab.e("MicroMsg.AppInfoStorage", "mkdir error. %s", new Object[] { str });
        }
      while (true)
      {
        if (i != 0)
          break label206;
        AppMethodBeat.o(79319);
        paramString = localObject;
        break;
        ab.e("MicroMsg.AppInfoStorage", "mkdir error, %s", new Object[] { com.tencent.mm.vfs.j.w(localb2.dMD()) });
        continue;
        label201: i = 1;
      }
      switch (paramInt)
      {
      default:
        ab.e("MicroMsg.AppInfoStorage", "getIconPath, unknown iconType = ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(79319);
        paramString = localObject;
        break;
      case 1:
        paramString = a.bYG() + g.x(paramString.getBytes()) + ".png";
        AppMethodBeat.o(79319);
        break;
      case 2:
        paramString = a.bYG() + g.x(paramString.getBytes()) + "_wm.png";
        AppMethodBeat.o(79319);
        break;
      case 3:
        paramString = a.bYG() + g.x(paramString.getBytes()) + "_sg.png";
        AppMethodBeat.o(79319);
        break;
      case 5:
        paramString = a.bYG() + g.x(paramString.getBytes()) + "_sl.png";
        AppMethodBeat.o(79319);
        break;
      case 4:
        label206: paramString = a.bYG() + g.x(paramString.getBytes()) + "_sp.png";
        AppMethodBeat.o(79319);
      }
    }
  }

  public static f dhF()
  {
    AppMethodBeat.i(79322);
    f localf = new f();
    localf.field_appName = "invalid_appname";
    localf.field_packageName = "";
    localf.field_signature = "";
    localf.field_status = 3;
    AppMethodBeat.o(79322);
    return localf;
  }

  private void m(f paramf)
  {
    AppMethodBeat.i(79310);
    if ((paramf == null) || (paramf.field_appId == null))
      AppMethodBeat.o(79310);
    while (true)
    {
      return;
      this.vcc.k(paramf.field_appId, paramf);
      AppMethodBeat.o(79310);
    }
  }

  public final boolean a(f paramf, String[] paramArrayOfString)
  {
    boolean bool = false;
    AppMethodBeat.i(79313);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
      AppMethodBeat.o(79313);
    while (true)
    {
      return bool;
      if ((f.vbQ.equals(paramf.field_appId)) || (f.vbS.equals(paramf.field_appId)))
        ab.i("MicroMsg.AppInfoStorage", "update appinfo: %s, %s, %s, %s, %s", new Object[] { paramf.field_appId, paramf.field_appName, Integer.valueOf(paramf.field_serviceShowFlag), Integer.valueOf(paramf.field_appInfoFlag), bo.dpG() });
      MQ(paramf.field_appId);
      bool = super.b(paramf, false, paramArrayOfString);
      if (bool)
        b(paramf.field_appId, 3, paramf.field_appId);
      AppMethodBeat.o(79313);
    }
  }

  public final f aiJ(String paramString)
  {
    AppMethodBeat.i(79316);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppInfoStorage", "appId is null");
      AppMethodBeat.o(79316);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      f localf = (f)this.vcc.ai(paramString);
      if (localf != null);
      while (true)
      {
        if ((localf == null) || (bo.isNullOrNil(localf.field_appId)))
          break label83;
        AppMethodBeat.o(79316);
        paramString = localf;
        break;
        localf = null;
      }
      label83: localf = new f();
      localf.field_appId = paramString;
      if (super.b(localf, new String[0]))
      {
        m(localf);
        AppMethodBeat.o(79316);
        paramString = localf;
      }
      else
      {
        AppMethodBeat.o(79316);
        paramString = null;
      }
    }
  }

  public final boolean b(f paramf, String[] paramArrayOfString)
  {
    boolean bool = false;
    AppMethodBeat.i(79314);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
      AppMethodBeat.o(79314);
    while (true)
    {
      return bool;
      if ((f.vbQ.equals(paramf.field_appId)) || (f.vbS.equals(paramf.field_appId)))
        ab.i("MicroMsg.AppInfoStorage", "delete appinfo: %s, %s, %s, %s, %s", new Object[] { paramf.field_appId, paramf.field_appName, Integer.valueOf(paramf.field_serviceShowFlag), Integer.valueOf(paramf.field_appInfoFlag), bo.dpG() });
      MQ(paramf.field_appId);
      bool = super.a(paramf, false, paramArrayOfString);
      if (bool)
        b(paramf.field_appId, 5, paramf.field_appId);
      AppMethodBeat.o(79314);
    }
  }

  public final List<String> dhD()
  {
    AppMethodBeat.i(79315);
    ab.d("MicroMsg.AppInfoStorage", "getNullOpenIdList, maxCount = -1");
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = rawQuery("select appId from AppInfo where openId is NULL ", new String[0]);
    if (localCursor == null)
    {
      ab.e("MicroMsg.AppInfoStorage", "get null cursor");
      AppMethodBeat.o(79315);
    }
    while (true)
    {
      return localArrayList;
      int i = localCursor.getCount();
      if (i <= 0)
      {
        ab.w("MicroMsg.AppInfoStorage", "getNullOpenIdList fail, cursor count = ".concat(String.valueOf(i)));
        localCursor.close();
        AppMethodBeat.o(79315);
      }
      else
      {
        if (localCursor.moveToFirst())
          while (!localCursor.isAfterLast())
          {
            i = localCursor.getColumnIndex("appId");
            if (i >= 0)
            {
              String str = localCursor.getString(i);
              if (!bo.isNullOrNil(str))
                localArrayList.add(str);
            }
            localCursor.moveToNext();
          }
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(79315);
      }
    }
  }

  public final Cursor dhE()
  {
    AppMethodBeat.i(79318);
    Cursor localCursor = rawQuery("select * from AppInfo where appType like '%1,%'", new String[0]);
    if (localCursor == null)
    {
      ab.e("MicroMsg.AppInfoStorage", "getGameApp : cursor is null");
      localCursor = null;
      AppMethodBeat.o(79318);
    }
    while (true)
    {
      return localCursor;
      AppMethodBeat.o(79318);
    }
  }

  public final boolean e(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(79321);
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.e("MicroMsg.AppInfoStorage", "saveIcon, invalid argument");
      AppMethodBeat.o(79321);
    }
    while (true)
    {
      return bool;
      Object localObject1 = dY(paramString, paramInt);
      if (localObject1 == null)
      {
        ab.e("MicroMsg.AppInfoStorage", "saveIcon fail, iconPath is null");
        AppMethodBeat.o(79321);
        continue;
      }
      Object localObject2 = new b((String)localObject1);
      if (((b)localObject2).exists())
        ((b)localObject2).delete();
      localObject1 = null;
      try
      {
        localObject2 = com.tencent.mm.vfs.e.q((b)localObject2);
        localObject1 = localObject2;
        ((OutputStream)localObject2).write(paramArrayOfByte);
        localObject1 = localObject2;
        ((OutputStream)localObject2).close();
        localObject1 = localObject2;
        anF(paramString);
        bool = true;
        AppMethodBeat.o(79321);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.AppInfoStorage", paramString, "", new Object[0]);
        ab.e("MicroMsg.AppInfoStorage", "saveIcon, exception, e = " + paramString.getMessage());
        if (localObject1 == null);
      }
      try
      {
        ((OutputStream)localObject1).close();
        label198: AppMethodBeat.o(79321);
      }
      catch (IOException paramString)
      {
        break label198;
      }
    }
  }

  public final Cursor eQ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79317);
    Object localObject = new StringBuilder(256);
    ((StringBuilder)localObject).append("select * from AppInfo");
    ((StringBuilder)localObject).append(" where ");
    if (paramInt1 != 0)
      ((StringBuilder)localObject).append(" ( serviceAppInfoFlag & ").append(paramInt1).append(" ) != 0 and ");
    ((StringBuilder)localObject).append(" ( serviceShowFlag & ").append(paramInt2).append(" ) != 0");
    localObject = rawQuery(((StringBuilder)localObject).toString(), new String[0]);
    if (localObject == null)
    {
      ab.e("MicroMsg.AppInfoStorage", "getServiceByAppInfoFlagAndShowFlag : cursor is null");
      localObject = null;
      AppMethodBeat.o(79317);
    }
    while (true)
    {
      return localObject;
      ab.i("MicroMsg.AppInfoStorage", "getServiceByAppInfoFlagAndShowFlag count = %d", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
      AppMethodBeat.o(79317);
    }
  }

  public final boolean n(f paramf)
  {
    boolean bool = true;
    AppMethodBeat.i(79312);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
    {
      AppMethodBeat.o(79312);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((f.vbQ.equals(paramf.field_appId)) || (f.vbS.equals(paramf.field_appId)))
        ab.i("MicroMsg.AppInfoStorage", "insert appinfo: %s, %s, %s, %s, %s", new Object[] { paramf.field_appId, paramf.field_appName, Integer.valueOf(paramf.field_serviceShowFlag), Integer.valueOf(paramf.field_appInfoFlag), bo.dpG() });
      if (super.a(paramf, false))
      {
        b(paramf.field_appId, 2, paramf.field_appId);
        m(paramf);
        AppMethodBeat.o(79312);
      }
      else
      {
        AppMethodBeat.o(79312);
        bool = false;
      }
    }
  }

  public final boolean t(String paramString, Bitmap paramBitmap)
  {
    boolean bool = false;
    AppMethodBeat.i(79320);
    if ((paramString == null) || (paramString.length() == 0) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      ab.e("MicroMsg.AppInfoStorage", "saveIcon : invalid argument");
      AppMethodBeat.o(79320);
    }
    while (true)
    {
      return bool;
      Object localObject = dY(paramString, 1);
      if (localObject == null)
      {
        ab.e("MicroMsg.AppInfoStorage", "saveIcon fail, iconPath is null");
        AppMethodBeat.o(79320);
      }
      else
      {
        localObject = new b((String)localObject);
        if (((b)localObject).exists())
          ((b)localObject).delete();
        try
        {
          localObject = com.tencent.mm.vfs.e.q((b)localObject);
          paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
          ((OutputStream)localObject).close();
          anF(paramString);
          AppMethodBeat.o(79320);
          bool = true;
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.AppInfoStorage", paramString, "", new Object[0]);
          ab.e("MicroMsg.AppInfoStorage", "saveIcon : compress occurs an exception");
          AppMethodBeat.o(79320);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.i
 * JD-Core Version:    0.6.2
 */