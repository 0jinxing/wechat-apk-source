package com.tencent.mm.ba;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.h.a;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import junit.framework.Assert;

public final class n extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS packageinfo ( id int  PRIMARY KEY, version int  , name text  , size int  , packname text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE TABLE IF NOT EXISTS packageinfo2 ( localId text  PRIMARY KEY , id int  , version int  , name text  , size int  , packname text  , status int  , type int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  private h fni;

  public n(h paramh)
  {
    this.fni = paramh;
  }

  public static String K(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(78496);
    if (paramBoolean)
    {
      paramString = a.Yd() + paramString + "_chatting_bg_vertical.jpg";
      AppMethodBeat.o(78496);
    }
    while (true)
    {
      return paramString;
      paramString = a.Yd() + paramString + "_chatting_bg_horizontal.jpg";
      AppMethodBeat.o(78496);
    }
  }

  public static String Z(String paramString, int paramInt)
  {
    AppMethodBeat.i(78497);
    switch (paramInt)
    {
    default:
      paramString = null;
      AppMethodBeat.o(78497);
    case 3:
    case 4:
    case 1:
    case 2:
    }
    while (true)
    {
      return paramString;
      paramString = K(paramString, true);
      AppMethodBeat.o(78497);
      continue;
      paramString = K(paramString, false);
      AppMethodBeat.o(78497);
    }
  }

  public static String aiu()
  {
    AppMethodBeat.i(78490);
    String str = a.Yd();
    AppMethodBeat.o(78490);
    return str;
  }

  public static int cb(Context paramContext)
  {
    int i = 1;
    AppMethodBeat.i(78495);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    int j;
    if (localDisplayMetrics.heightPixels > localDisplayMetrics.widthPixels)
    {
      j = 1;
      if (localDisplayMetrics.density > 1.0F)
        break label83;
      if (j == 0)
        break label73;
      j = 4;
      AppMethodBeat.o(78495);
    }
    while (true)
    {
      return j;
      j = 0;
      break;
      label73: j = 2;
      AppMethodBeat.o(78495);
      continue;
      label83: if (j != 0)
      {
        j = 3;
        AppMethodBeat.o(78495);
      }
      else
      {
        AppMethodBeat.o(78495);
        j = i;
      }
    }
  }

  public static String cw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78491);
    String str = paramInt1 + "_" + paramInt2 + "_thumb.jpg";
    AppMethodBeat.o(78491);
    return str;
  }

  public final boolean a(m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(78483);
    if (paramm == null)
      AppMethodBeat.o(78483);
    while (true)
    {
      return bool;
      paramm.bJt = -1;
      paramm = paramm.Hl();
      if ((int)this.fni.insert("packageinfo2", "localId", paramm) != -1)
      {
        doNotify();
        bool = true;
        AppMethodBeat.o(78483);
      }
      else
      {
        AppMethodBeat.o(78483);
      }
    }
  }

  public final Cursor ait()
  {
    AppMethodBeat.i(78486);
    Cursor localCursor = this.fni.a("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=1", null, 0);
    AppMethodBeat.o(78486);
    return localCursor;
  }

  public final boolean b(m paramm)
  {
    boolean bool1 = true;
    AppMethodBeat.i(78484);
    if (paramm != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      ContentValues localContentValues = paramm.Hl();
      if (localContentValues.size() <= 0)
        break label109;
      if (this.fni.update("packageinfo2", localContentValues, "id= ? and type =?", new String[] { paramm.id, paramm.cBc }) <= 0)
        break label109;
      doNotify();
      AppMethodBeat.o(78484);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label109: doNotify();
      AppMethodBeat.o(78484);
    }
  }

  public final m cv(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(78487);
    Object localObject3 = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.id = \"" + bo.vA(String.valueOf(paramInt1)) + "\" and packageinfo2.type = \"" + bo.vA(String.valueOf(paramInt2)) + "\"";
    localObject3 = this.fni.a((String)localObject3, null, 2);
    if (localObject3 == null)
      AppMethodBeat.o(78487);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject2 = new m();
        ((m)localObject2).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(78487);
    }
  }

  public final String cx(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78492);
    Object localObject;
    switch (paramInt2)
    {
    default:
      localObject = "";
      AppMethodBeat.o(78492);
    case 0:
    case 1:
    case 2:
    case 7:
    case 9:
    case 12:
    case 18:
    case 5:
    case 19:
    case 20:
    case 21:
    case 23:
    case 26:
    case 36:
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(78492);
      continue;
      localObject = paramInt1 + "_session_bg.zip";
      AppMethodBeat.o(78492);
      continue;
      localObject = paramInt1 + "_emoji_art.temp";
      AppMethodBeat.o(78492);
      continue;
      localObject = paramInt1 + "_configlist.cfg";
      AppMethodBeat.o(78492);
      continue;
      localObject = "_speex_upload.cfg";
      AppMethodBeat.o(78492);
      continue;
      localObject = "_rcpt_addr";
      AppMethodBeat.o(78492);
      continue;
      localObject = cv(paramInt1, paramInt2);
      localObject = ((m)localObject).version + "_feature.zip";
      AppMethodBeat.o(78492);
      continue;
      localObject = "brand_i18n.apk";
      AppMethodBeat.o(78492);
      continue;
      localObject = "_report_reason.temp";
      AppMethodBeat.o(78492);
      continue;
      localObject = "_pluginDesc.cfg";
      AppMethodBeat.o(78492);
      continue;
      localObject = "_trace_config.cfg";
      AppMethodBeat.o(78492);
      continue;
      localObject = "permissioncfg.cfg";
      AppMethodBeat.o(78492);
      continue;
      localObject = "ipcallCountryCodeConfig.cfg";
      AppMethodBeat.o(78492);
      continue;
      localObject = paramInt1 + "_sensewhere.xml";
      AppMethodBeat.o(78492);
    }
  }

  public final String cy(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78493);
    String str;
    switch (paramInt2)
    {
    default:
      str = "";
      AppMethodBeat.o(78493);
    case 0:
    case 1:
    case 2:
    case 18:
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(78493);
      continue;
      str = a.Yd() + paramInt1 + "_session_bg/";
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(str);
        if (!localFile.exists())
          localFile.mkdirs();
        AppMethodBeat.o(78493);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.PackageInfoStorage", "exception:%s", new Object[] { bo.l(localException) });
          ab.e("MicroMsg.PackageInfoStorage", "can not create dir, dir = ".concat(String.valueOf(str)));
        }
      }
      str = "";
      AppMethodBeat.o(78493);
      continue;
      str = cx(paramInt1, paramInt2);
      str = a.Yd() + str.replace(".zip", "");
      AppMethodBeat.o(78493);
    }
  }

  public final void cz(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78494);
    e.deleteFile(a.Yd() + cx(paramInt1, paramInt2));
    m localm = cv(paramInt1, paramInt2);
    if (localm != null)
    {
      localm.status = 5;
      r.aix().b(localm);
    }
    AppMethodBeat.o(78494);
  }

  public final boolean lS(int paramInt)
  {
    AppMethodBeat.i(78485);
    String str = "update packageinfo2 set status = 2 where status = 1 and type = " + paramInt + ";";
    boolean bool = this.fni.hY("packageinfo2", str);
    doNotify();
    AppMethodBeat.o(78485);
    return bool;
  }

  public final boolean lT(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(78488);
    if (this.fni.delete("packageinfo2", "type =?", new String[] { String.valueOf(paramInt) }) > 0)
    {
      doNotify();
      AppMethodBeat.o(78488);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(78488);
      bool = false;
    }
  }

  public final m[] lU(int paramInt)
  {
    AppMethodBeat.i(78489);
    Object localObject = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=".concat(String.valueOf(paramInt));
    Cursor localCursor = this.fni.a((String)localObject, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      localObject = new m();
      ((m)localObject).d(localCursor);
      localArrayList.add(localObject);
    }
    localCursor.close();
    localObject = (m[])localArrayList.toArray(new m[localArrayList.size()]);
    AppMethodBeat.o(78489);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.n
 * JD-Core Version:    0.6.2
 */