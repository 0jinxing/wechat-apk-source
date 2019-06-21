package com.tencent.mm.booter;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.p.a.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.xlog.app.XLogSetup;
import java.util.HashMap;

public final class d
{
  private static d ebP;
  private final String[] columns;
  private Context ctx;
  public int ebO;
  private final HashMap<String, Object> values;

  private d(Context paramContext)
  {
    AppMethodBeat.i(57755);
    this.ebO = -1;
    this.columns = new String[] { "_id", "key", "type", "value" };
    this.values = new HashMap();
    this.ctx = paramContext;
    Object localObject1 = paramContext.getContentResolver();
    try
    {
      localObject1 = ((ContentResolver)localObject1).query(a.a.CONTENT_URI, this.columns, null, null, null);
      if (localObject1 == null)
      {
        AppMethodBeat.o(57755);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2 = null;
        continue;
        if (localObject2.getCount() <= 0)
        {
          localObject2.close();
          AppMethodBeat.o(57755);
        }
        else if (!"18c867f0717aa67b2ab7347505ba07ed".equals(bo.l("com.tencent.mm.coolassist", paramContext)))
        {
          localObject2.close();
          AppMethodBeat.o(57755);
        }
        else
        {
          b.dnN();
          int i = localObject2.getColumnIndex("key");
          int j = localObject2.getColumnIndex("type");
          int k = localObject2.getColumnIndex("value");
          while (localObject2.moveToNext())
          {
            paramContext = a.j(localObject2.getInt(j), localObject2.getString(k));
            this.values.put(localObject2.getString(i), paramContext);
          }
          localObject2.close();
          AppMethodBeat.o(57755);
        }
      }
    }
  }

  public static d bo(Context paramContext)
  {
    AppMethodBeat.i(57754);
    if (ebP == null)
      ebP = new d(paramContext);
    paramContext = ebP;
    AppMethodBeat.o(57754);
    return paramContext;
  }

  public final Integer getInteger(String paramString)
  {
    AppMethodBeat.i(57758);
    Object localObject = this.values.get(paramString);
    if ((localObject instanceof Integer))
    {
      ab.d("MicroMsg.Debugger", "getInteger(): key=" + paramString + ", value=" + localObject.toString());
      paramString = (Integer)localObject;
      AppMethodBeat.o(57758);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(57758);
    }
  }

  public final String getString(String paramString)
  {
    AppMethodBeat.i(57757);
    Object localObject = this.values.get(paramString);
    if ((localObject instanceof String))
    {
      ab.d("MicroMsg.Debugger", "getString(): key=" + paramString + ", value=" + localObject.toString());
      paramString = (String)localObject;
      AppMethodBeat.o(57757);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(57757);
    }
  }

  public final void jE(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(57756);
    Integer localInteger = getInteger(".com.tencent.mm.debug.log.level");
    boolean bool2 = bo.a(jF(".com.tencent.mm.debug.log.append_mode"), false);
    boolean bool4;
    if ((bo.isNullOrNil(getString(".com.tencent.mm.debug.log.mmlog"))) && (bo.a(jF(".com.tencent.mm.debug.test.uploadLog"), false)))
    {
      bool3 = true;
      if (bool3)
      {
        String str = getString(".com.tencent.mm.debug.log.tag.skey");
        if ((str != null) && (str.length() > 0))
          com.tencent.mars.xlog.Xlog.logDecryptor = new com.tencent.mm.sdk.platformtools.ac(str);
      }
      bool4 = this.ctx.getSharedPreferences("system_config_prefs", h.Mu()).getBoolean("first_launch_weixin", true);
      if (!"MM".equalsIgnoreCase(paramString))
        bool4 = false;
      if (bool4)
        break label256;
      bool4 = true;
      label134: XLogSetup.keep_setupXLog(bool4, com.tencent.mm.storage.ac.xIE, e.euX, localInteger, Boolean.valueOf(bool2), Boolean.valueOf(bool3), paramString);
      ab.LZ(ab.getLogLevel());
      if (bo.getInt(bo.bc(getString(".com.tencent.mm.debug.monkeyEnv"), "0"), 0) != 1)
        break label262;
      bool3 = true;
      label187: bp.pm(bool3);
      bp.dnM();
      if (getInteger(".com.tencent.mm.debug.log.level") == null)
        break label268;
    }
    label256: label262: label268: for (boolean bool3 = true; ; bool3 = false)
    {
      bp.pn(bool3);
      if (!bp.dnM())
      {
        bool3 = bool1;
        if (!bo.a(jF(".com.tencent.mm.debug.blockReleasedPatch"), false));
      }
      else
      {
        bool3 = true;
      }
      b.pg(bool3);
      AppMethodBeat.o(57756);
      return;
      bool3 = false;
      break;
      bool4 = false;
      break label134;
      bool3 = false;
      break label187;
    }
  }

  public final Boolean jF(String paramString)
  {
    AppMethodBeat.i(57759);
    Object localObject = this.values.get(paramString);
    if (localObject == null)
    {
      AppMethodBeat.o(57759);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if ((localObject instanceof Boolean))
      {
        ab.d("MicroMsg.Debugger", "getBoolean(): key=" + paramString + ", value=" + localObject.toString());
        paramString = (Boolean)localObject;
        AppMethodBeat.o(57759);
      }
      else
      {
        AppMethodBeat.o(57759);
        paramString = null;
      }
    }
  }

  public static final class a
  {
    public static Object j(int paramInt, String paramString)
    {
      AppMethodBeat.i(57753);
      switch (paramInt)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      try
      {
        ab.e("MicroMsg.Debugger.Resolver", "unknown type");
        label51: paramString = null;
        AppMethodBeat.o(57753);
        while (true)
        {
          return paramString;
          paramString = Integer.valueOf(paramString);
          AppMethodBeat.o(57753);
          continue;
          paramString = Long.valueOf(paramString);
          AppMethodBeat.o(57753);
          continue;
          AppMethodBeat.o(57753);
          continue;
          paramString = Boolean.valueOf(paramString);
          AppMethodBeat.o(57753);
          continue;
          paramString = Float.valueOf(paramString);
          AppMethodBeat.o(57753);
          continue;
          paramString = Double.valueOf(paramString);
          AppMethodBeat.o(57753);
        }
      }
      catch (Exception paramString)
      {
        break label51;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.d
 * JD-Core Version:    0.6.2
 */