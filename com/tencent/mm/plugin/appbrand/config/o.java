package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.cwx;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public class o extends j<WxaAttributes>
{
  public static final String[] fjY;
  final e bSd;

  static
  {
    AppMethodBeat.i(94153);
    fjY = new String[] { j.a(WxaAttributes.gSs, "WxaAttributesTable") };
    AppMethodBeat.o(94153);
  }

  public o(e parame)
  {
    super(parame, WxaAttributes.gSs, "WxaAttributesTable", WxaAttributes.diI);
    this.bSd = parame;
  }

  private boolean a(WxaAttributes paramWxaAttributes, boolean paramBoolean, String[] paramArrayOfString)
  {
    AppMethodBeat.i(94148);
    if (!bo.isNullOrNil(paramWxaAttributes.field_username))
      paramWxaAttributes.field_usernameHash = paramWxaAttributes.field_username.hashCode();
    paramBoolean = super.a(paramWxaAttributes, paramBoolean, paramArrayOfString);
    AppMethodBeat.o(94148);
    return paramBoolean;
  }

  private boolean a(WxaAttributes paramWxaAttributes, String[] paramArrayOfString)
  {
    AppMethodBeat.i(94147);
    if (!bo.Q(paramArrayOfString));
    for (int i = 0; ; i++)
      if (i < paramArrayOfString.length)
      {
        if (paramArrayOfString[i].equals("username"))
        {
          paramArrayOfString[i] = "usernameHash";
          paramWxaAttributes.field_usernameHash = paramWxaAttributes.field_username.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramWxaAttributes, paramArrayOfString);
        AppMethodBeat.o(94147);
        return bool;
      }
  }

  private static boolean bH(String paramString1, String paramString2)
  {
    AppMethodBeat.i(94146);
    boolean bool = bo.nullAsNil(paramString1).equals(bo.nullAsNil(paramString2));
    AppMethodBeat.o(94146);
    return bool;
  }

  protected boolean a(WxaAttributes paramWxaAttributes, cwx paramcwx)
  {
    boolean bool = true;
    AppMethodBeat.i(94145);
    if (("NickName".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_nickname)))
    {
      paramWxaAttributes.field_nickname = bo.nullAsNil(paramcwx.pXM);
      AppMethodBeat.o(94145);
    }
    while (true)
    {
      return bool;
      if (("BrandIconURL".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_brandIconURL)))
      {
        paramWxaAttributes.field_brandIconURL = paramcwx.pXM;
        AppMethodBeat.o(94145);
        continue;
      }
      if (("BigHeadImgUrl".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_bigHeadURL)))
      {
        paramWxaAttributes.field_bigHeadURL = paramcwx.pXM;
        AppMethodBeat.o(94145);
        continue;
      }
      if (("SmallHeadImgUrl".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_smallHeadURL)))
      {
        paramWxaAttributes.field_smallHeadURL = paramcwx.pXM;
        AppMethodBeat.o(94145);
        continue;
      }
      if (("Signature".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_signature)))
      {
        paramWxaAttributes.field_signature = paramcwx.pXM;
        AppMethodBeat.o(94145);
        continue;
      }
      if ("WxAppOpt".equals(paramcwx.vMU))
      {
        int i = bo.getInt(paramcwx.pXM, 0);
        if (i != paramWxaAttributes.field_appOpt)
        {
          paramWxaAttributes.field_appOpt = i;
          AppMethodBeat.o(94145);
          continue;
        }
      }
      if (("RegisterSource".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_registerSource)))
      {
        paramWxaAttributes.field_registerSource = paramcwx.pXM;
        AppMethodBeat.o(94145);
        continue;
      }
      if (("WxaAppInfo".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_appInfo)))
        paramWxaAttributes.field_appInfo = paramcwx.pXM;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramcwx.pXM);
        paramWxaAttributes.field_appId = localJSONObject.getString("Appid");
        paramWxaAttributes.field_roundedSquareIconURL = localJSONObject.getString("RoundedSquareIconUrl");
        paramWxaAttributes.field_shortNickname = localJSONObject.optString("ShortNickName");
        label387: AppMethodBeat.o(94145);
        continue;
        if (("WxaAppVersionInfo".equalsIgnoreCase(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_versionInfo)))
        {
          paramWxaAttributes.field_versionInfo = paramcwx.pXM;
          AppMethodBeat.o(94145);
          continue;
        }
        if (("BindWxaInfo".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_bindWxaInfo)))
        {
          paramWxaAttributes.field_bindWxaInfo = paramcwx.pXM;
          AppMethodBeat.o(94145);
          continue;
        }
        if (("WxaAppDynamic".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_dynamicInfo)))
        {
          paramWxaAttributes.field_dynamicInfo = paramcwx.pXM;
          AppMethodBeat.o(94145);
          continue;
        }
        if (("MMBizMenu".equals(paramcwx.vMU)) && (!bH(paramcwx.pXM, paramWxaAttributes.field_bizMenu)))
        {
          paramWxaAttributes.field_bizMenu = paramcwx.pXM;
          AppMethodBeat.o(94145);
          continue;
        }
        AppMethodBeat.o(94145);
        bool = false;
      }
      catch (Exception paramWxaAttributes)
      {
        break label387;
      }
    }
  }

  public boolean a(String paramString, b paramb, List<cwx> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(94144);
    if (bo.ek(paramList))
    {
      AppMethodBeat.o(94144);
      return bool;
    }
    WxaAttributes localWxaAttributes = new WxaAttributes();
    localWxaAttributes.field_username = paramString;
    if (!a(localWxaAttributes, new String[] { "username" }));
    for (int i = 1; ; i = 0)
    {
      paramString = paramList.iterator();
      bool = false;
      while (paramString.hasNext())
      {
        paramList = (cwx)paramString.next();
        if (paramList != null)
          bool = a(localWxaAttributes, paramList) | bool;
      }
    }
    if (bool)
    {
      if (i != 0)
        b(localWxaAttributes);
    }
    else
    {
      label130: localWxaAttributes.field_syncTimeSecond = bo.anT();
      if (paramb != null)
        break label198;
    }
    label198: for (paramString = new byte[0]; ; paramString = paramb.wR)
    {
      localWxaAttributes.field_syncVersion = bo.cd(paramString);
      c(localWxaAttributes, new String[] { "username" });
      AppMethodBeat.o(94144);
      break;
      c(localWxaAttributes, new String[] { "username" });
      break label130;
    }
  }

  public final boolean ayG()
  {
    AppMethodBeat.i(94137);
    boolean bool;
    if ((this.bSd != null) && (!this.bSd.dpU()))
    {
      bool = true;
      AppMethodBeat.o(94137);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94137);
    }
  }

  public final WxaAttributes d(String paramString, String[] paramArrayOfString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(94141);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(94141);
      paramArrayOfString = localObject2;
    }
    while (true)
    {
      return paramArrayOfString;
      if (!paramString.endsWith("@app"))
      {
        AppMethodBeat.o(94141);
        paramArrayOfString = localObject2;
      }
      else
      {
        Object localObject3 = this.bSd;
        if (bo.Q(paramArrayOfString))
          paramArrayOfString = null;
        while (true)
        {
          localObject3 = ((e)localObject3).a("WxaAttributesTable", paramArrayOfString, String.format(Locale.US, "%s=?", new Object[] { "usernameHash" }), new String[] { String.valueOf(paramString.hashCode()) }, null, null, null, 2);
          if (localObject3 != null)
            break label134;
          AppMethodBeat.o(94141);
          paramArrayOfString = localObject2;
          break;
        }
        label134: paramArrayOfString = localObject1;
        if (((Cursor)localObject3).moveToFirst())
        {
          paramArrayOfString = new WxaAttributes();
          paramArrayOfString.d((Cursor)localObject3);
          paramArrayOfString.field_username = paramString;
        }
        ((Cursor)localObject3).close();
        AppMethodBeat.o(94141);
      }
    }
  }

  public final WxaAttributes e(String paramString, String[] paramArrayOfString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(94142);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(94142);
      paramArrayOfString = localObject2;
    }
    while (true)
    {
      return paramArrayOfString;
      Object localObject3 = this.bSd;
      if (bo.Q(paramArrayOfString))
        paramArrayOfString = null;
      while (true)
      {
        localObject3 = ((e)localObject3).a("WxaAttributesTable", paramArrayOfString, String.format(Locale.US, "%s=?", new Object[] { "appId" }), new String[] { paramString }, null, null, null, 2);
        if (localObject3 != null)
          break label106;
        AppMethodBeat.o(94142);
        paramArrayOfString = localObject2;
        break;
      }
      label106: paramArrayOfString = localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        paramArrayOfString = new WxaAttributes();
        paramArrayOfString.d((Cursor)localObject3);
        paramArrayOfString.field_appId = paramString;
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(94142);
    }
  }

  protected boolean k(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(94143);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(94143);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      Object localObject = d(paramString, new String[] { "appOpt" });
      if (localObject == null)
      {
        AppMethodBeat.o(94143);
        paramBoolean = false;
      }
      else
      {
        int i = ((WxaAttributes)localObject).field_appOpt;
        if (!paramBoolean);
        for (paramInt = i & (paramInt ^ 0xFFFFFFFF); ; paramInt = i | paramInt)
        {
          localObject = new ContentValues(1);
          ((ContentValues)localObject).put("appOpt", Integer.valueOf(paramInt));
          if (this.bSd.update("WxaAttributesTable", (ContentValues)localObject, String.format("%s=?", new Object[] { "username" }), new String[] { paramString }) <= 0)
            break label154;
          AppMethodBeat.o(94143);
          paramBoolean = true;
          break;
        }
        label154: AppMethodBeat.o(94143);
        paramBoolean = false;
      }
    }
  }

  final long ze(String paramString)
  {
    AppMethodBeat.i(94138);
    paramString = d(paramString, new String[] { "syncTimeSecond" });
    long l;
    if (paramString == null)
    {
      l = 0L;
      AppMethodBeat.o(94138);
    }
    while (true)
    {
      return l;
      l = paramString.field_syncTimeSecond;
      AppMethodBeat.o(94138);
    }
  }

  final b zf(String paramString)
  {
    AppMethodBeat.i(94139);
    paramString = d(paramString, new String[] { "syncVersion" });
    if (paramString == null);
    for (paramString = new byte[0]; ; paramString = bo.anf(bo.nullAsNil(paramString.field_syncVersion)))
    {
      paramString = new b(paramString);
      AppMethodBeat.o(94139);
      return paramString;
    }
  }

  public final boolean zg(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(94140);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WxaAttrStorage", "delete with invalid username");
      AppMethodBeat.o(94140);
    }
    while (true)
    {
      return bool;
      WxaAttributes localWxaAttributes = new WxaAttributes();
      localWxaAttributes.field_username = paramString;
      bool = a(localWxaAttributes, false, new String[0]);
      AppMethodBeat.o(94140);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.o
 * JD-Core Version:    0.6.2
 */