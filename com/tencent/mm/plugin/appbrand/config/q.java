package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.bt.b;
import com.tencent.mm.g.a.lo;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.cwx;
import com.tencent.mm.protocal.protobuf.dp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class q extends o
{
  public q(com.tencent.mm.sdk.e.e parame)
  {
    super(parame);
    AppMethodBeat.i(129901);
    Cursor localCursor;
    if (ayG())
    {
      parame = (com.tencent.mm.sdk.e.f)parame;
      if (!com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xOz, false))
      {
        ab.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "before fix");
        localCursor = parame.a("select appInfo from WxaAttributesTable", null, 2);
        if ((localCursor == null) || (localCursor.isClosed()))
        {
          ab.e("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "try fix but db not working");
          AppMethodBeat.o(129901);
          return;
        }
        if (!localCursor.moveToFirst())
          break label355;
        Object localObject1 = new LinkedList();
        while (true)
        {
          Object localObject2 = localCursor.getString(0);
          if (!bo.isNullOrNil((String)localObject2));
          try
          {
            Object localObject3 = new org/json/JSONObject;
            ((JSONObject)localObject3).<init>((String)localObject2);
            localObject2 = ((JSONObject)localObject3).optString("Appid");
            String str = ((JSONObject)localObject3).optString("RoundedSquareIconUrl");
            if (!bo.isNullOrNil((String)localObject2))
            {
              boolean bool = bo.isNullOrNil(str);
              if (!bool)
                break label259;
            }
            label166: 
            while (!localCursor.moveToNext())
            {
              localCursor.close();
              l = parame.iV(Thread.currentThread().getId());
              localObject2 = ((List)localObject1).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject1 = (Pair)((Iterator)localObject2).next();
                parame.update("WxaAttributesTable", (ContentValues)((Pair)localObject1).second, "appId=?", new String[] { (String)((Pair)localObject1).first });
              }
              localObject3 = new android/content/ContentValues;
              ((ContentValues)localObject3).<init>(1);
              ((ContentValues)localObject3).put("roundedSquareIconURL", str);
              ((List)localObject1).add(Pair.create(localObject2, localObject3));
            }
          }
          catch (Exception localException)
          {
            long l;
            label259: break label166;
            parame.mB(l);
            ab.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "fix done");
          }
        }
      }
    }
    while (true)
    {
      if (!localCursor.isClosed())
        localCursor.close();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOz, Boolean.TRUE);
      AppMethodBeat.o(129901);
      break;
      label355: ab.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "no contacts available");
    }
  }

  protected final boolean a(WxaAttributes paramWxaAttributes, cwx paramcwx)
  {
    AppMethodBeat.i(129904);
    boolean bool = super.a(paramWxaAttributes, paramcwx);
    if ((bool) && ("WxaAppInfo".equals(paramcwx.vMU)));
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramcwx.pXM);
      paramcwx = m.m(localJSONObject);
      l.b(paramWxaAttributes.field_appId, paramcwx.vFu);
      label59: AppMethodBeat.o(129904);
      return bool;
    }
    catch (Exception paramWxaAttributes)
    {
      break label59;
    }
  }

  public final boolean a(String paramString, b paramb, List<cwx> paramList)
  {
    AppMethodBeat.i(129902);
    boolean bool = super.a(paramString, paramb, paramList);
    paramString = d(paramString, new String[0]);
    paramb = paramString.ayL();
    if ((paramb != null) && (paramb.bQl == 0))
      com.tencent.mm.plugin.appbrand.app.f.auV().a(paramString.field_appId, paramString.ayL());
    if (bool);
    try
    {
      if (com.tencent.mm.kernel.g.RK())
      {
        paramList = paramString.field_username;
        paramb = paramString.field_nickname;
        String str1 = paramString.field_bigHeadURL;
        String str2 = paramString.field_smallHeadURL;
        paramString = com.tencent.mm.ah.o.act().qo(paramList);
        if (paramString != null)
          break label341;
        paramString = new com/tencent/mm/ah/h;
        paramString.<init>();
        i = 1;
        if (!bo.nullAsNil(str2).equals(paramString.acl()))
        {
          paramString.frV = str2;
          i = 1;
        }
        if (!bo.nullAsNil(str1).equals(paramString.ack()))
        {
          paramString.frW = str1;
          i = 1;
        }
        if (i != 0)
        {
          paramString.username = paramList;
          paramString.cB(true);
          paramString.bJt = 31;
          com.tencent.mm.ah.o.act().b(paramString);
        }
        paramString = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramList);
        if (paramString != null)
          break label338;
        paramString = new com/tencent/mm/storage/ad;
        paramString.<init>();
        if ((int)paramString.ewQ != 0)
          break label332;
        paramString.setUsername(paramList);
        i = 1;
        if (!paramb.equals(paramString.field_nickname))
          paramString.iB(paramb);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        try
        {
          paramString.iC(com.tencent.mm.platformtools.g.vp(paramb));
          try
          {
            paramString.iD(com.tencent.mm.platformtools.g.vo(paramb));
            i = 1;
            if (i != 0)
              ((j)com.tencent.mm.kernel.g.K(j.class)).XM().X(paramString);
            AppMethodBeat.o(129902);
            return bool;
            paramString = paramString;
            ab.printErrStackTrace("MicroMsg.WxaAttrStorageWC", paramString, "flushContactInMainDB", new Object[0]);
            continue;
          }
          catch (UnsatisfiedLinkError paramb)
          {
            continue;
          }
        }
        catch (UnsatisfiedLinkError paramList)
        {
          continue;
        }
        label332: int i = 0;
        continue;
        label338: continue;
        label341: i = 0;
      }
    }
  }

  protected final boolean k(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(129903);
    paramBoolean = super.k(paramString, paramInt, paramBoolean);
    if (paramBoolean)
    {
      WxaAttributes localWxaAttributes = d(paramString, new String[] { "appOpt" });
      lo locallo = new lo();
      locallo.cHo.csl = paramString;
      locallo.cHo.cHp = localWxaAttributes.field_appOpt;
      com.tencent.mm.sdk.b.a.xxA.m(locallo);
    }
    AppMethodBeat.o(129903);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.q
 * JD-Core Version:    0.6.2
 */