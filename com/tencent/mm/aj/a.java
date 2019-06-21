package com.tencent.mm.aj;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.kc;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static String fuG = "";
  private static long fuH = 0L;

  public static boolean a(ad paramad, d paramd, List<kc> paramList)
  {
    AppMethodBeat.i(11247);
    boolean bool;
    if ((paramad == null) || (paramList == null) || (paramList.size() == 0))
    {
      ab.e("MicroMsg.BizAttrRenovator", "updateBizAttributes failed.");
      bool = false;
      AppMethodBeat.o(11247);
    }
    String str1;
    d locald;
    while (true)
    {
      return bool;
      str1 = paramad.field_username;
      if (!paramad.dsf())
      {
        ab.w("MicroMsg.BizAttrRenovator", "updateBizAttributes failed, contact is not a biz contact.(username : %s)", new Object[] { str1 });
        bool = false;
        AppMethodBeat.o(11247);
      }
      else
      {
        locald = paramd;
        if (paramd == null)
          locald = z.aeR().qP(str1);
        if (locald != null)
          break;
        ab.i("MicroMsg.BizAttrRenovator", "BizInfo is null.(username : %s)", new Object[] { str1 });
        bool = false;
        AppMethodBeat.o(11247);
      }
    }
    h localh = o.act().qo(str1);
    long l1;
    int i;
    int j;
    label184: kc localkc;
    try
    {
      if (bo.isNullOrNil(locald.field_extInfo))
      {
        paramd = new org/json/JSONObject;
        paramd.<init>();
      }
      while (true)
      {
        l1 = -1L;
        l2 = paramad.field_type;
        i = 0;
        Iterator localIterator = paramList.iterator();
        j = 0;
        while (true)
        {
          if (!localIterator.hasNext())
            break label722;
          localkc = (kc)localIterator.next();
          if (localkc != null)
            break;
          ab.w("MicroMsg.BizAttrRenovator", "keyValue is null.");
        }
        paramd = new JSONObject(locald.field_extInfo);
      }
    }
    catch (Exception paramd)
    {
      while (true)
      {
        ab.e("MicroMsg.BizAttrRenovator", "create Json object from extInfo error. %s.", new Object[] { paramd });
        paramd = new JSONObject();
        continue;
        paramList = localkc.vMU;
        ab.i("MicroMsg.BizAttrRenovator", "[BizAttr] UpdateInfoList key = %s, value = %s", new Object[] { paramList, localkc.pXM });
        String str2 = localkc.pXM;
        if (!"UserName".equals(paramList))
        {
          if ("NickName".equals(paramList))
            paramad.iB(str2);
        }
        else
        {
          label324: k = 1;
          label327: if ((k == 0) && (!b(paramd, paramList, localkc.pXM)))
          {
            str2 = localkc.pXM;
            if (!"BrandInfo".equals(paramList))
              break label503;
            locald.field_brandInfo = str2;
            label368: k = 1;
          }
        }
        while (true)
        {
          if (k == 0)
            break label593;
          i++;
          break;
          if ("Alias".equals(paramList))
          {
            paramad.iy(str2);
            break label324;
          }
          if ("PYInitial".equals(paramList))
          {
            paramad.iC(str2);
            break label324;
          }
          if ("QuanPin".equals(paramList))
          {
            paramad.iD(str2);
            break label324;
          }
          if ("VerifyFlag".equals(paramList))
          {
            paramad.hw(bo.getInt(str2, paramad.field_verifyFlag));
            break label324;
          }
          if ("VerifyInfo".equals(paramList))
          {
            paramad.iV(str2);
            break label324;
          }
          if ("Signature".equals(paramList))
          {
            paramad.iQ(str2);
            break label324;
          }
          k = 0;
          break label327;
          label503: if ("BrandIconURL".equals(paramList))
          {
            locald.field_brandIconURL = str2;
            break label368;
          }
          if ("BrandFlag".equals(paramList))
          {
            locald.field_brandFlag = bo.getInt(str2, locald.field_brandFlag);
            break label368;
          }
          if ("Appid".equals(paramList))
          {
            if (str2.equals(locald.field_appId))
            {
              k = 0;
              continue;
            }
            locald.field_appId = str2;
            break label368;
          }
          k = 0;
        }
        label593: str2 = localkc.pXM;
        if ("BigHeadImgUrl".equals(paramList))
          if (localh != null)
            localh.frW = str2;
        label621: for (int k = 1; ; k = 0)
        {
          if (k == 0)
            break label668;
          i++;
          j = 1;
          break;
          if ("SmallHeadImgUrl".equals(paramList))
          {
            if (localh == null)
              break label621;
            localh.frV = str2;
            break label621;
          }
        }
        label668: if (!"BitMask".equals(paramList))
          break;
        l1 = bo.getLong(localkc.pXM, l1);
        i++;
      }
      if (!"BitVal".equals(paramList))
        break label981;
    }
    long l2 = bo.getLong(localkc.pXM, l2);
    i++;
    label722: label981: 
    while (true)
    {
      break label184;
      if (i == 0)
      {
        ab.i("MicroMsg.BizAttrRenovator", "None attribute has been updated.");
        bool = false;
        AppMethodBeat.o(11247);
        break;
      }
      locald.field_extInfo = paramd.toString();
      if ((localh != null) && (j != 0))
      {
        o.act().b(localh);
        o.acd();
        com.tencent.mm.ah.d.E(str1, false);
        o.acd();
        com.tencent.mm.ah.d.E(str1, true);
        o.acv().pZ(str1);
        paramd = z.afb();
        if (!bo.isNullOrNil(str1))
        {
          ab.d("MicroMsg.BrandLogic", "remove cache by brandKey : %s", new Object[] { str1 });
          paramd = (WeakReference)paramd.fwK.remove(str1);
          if (paramd != null)
          {
            paramd = (Bitmap)paramd.get();
            if (paramd != null)
              paramd.isRecycled();
          }
        }
      }
      paramad.setType(paramad.field_type | (int)(l1 & l2));
      i = ((j)g.K(j.class)).XM().b(str1, paramad);
      z.aeR().e(locald);
      if (i == 1)
        ((j)g.K(j.class)).XM().b(4, (n)((j)g.K(j.class)).XM(), str1);
      ab.i("MicroMsg.BizAttrRenovator", "Update bizInfo attributes successfully.");
      bool = true;
      AppMethodBeat.o(11247);
      break;
    }
  }

  public static boolean adG()
  {
    boolean bool = true;
    AppMethodBeat.i(11245);
    Object localObject = g.RP().Ry().get(ac.a.xLa, null);
    int i;
    if ((localObject == null) || (!(localObject instanceof Integer)))
    {
      ab.i("MicroMsg.BizAttrRenovator", "openFlag is null.");
      i = 1;
      ab.i("MicroMsg.BizAttrRenovator", "openFlag is %d.", new Object[] { Integer.valueOf(i) });
      if (i != 1)
        break label86;
      AppMethodBeat.o(11245);
    }
    while (true)
    {
      return bool;
      i = ((Integer)localObject).intValue();
      break;
      label86: AppMethodBeat.o(11245);
      bool = false;
    }
  }

  static boolean b(d paramd)
  {
    AppMethodBeat.i(11244);
    boolean bool;
    if (paramd == null)
    {
      ab.i("MicroMsg.BizAttrRenovator", "BizInfo is null.");
      AppMethodBeat.o(11244);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!adG())
      {
        AppMethodBeat.o(11244);
        bool = false;
      }
      else
      {
        int i = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("MMBizAttrSyncFreq", -1);
        int j = i;
        if (i == -1)
        {
          ab.i("MicroMsg.BizAttrRenovator", "MMBizAttrSyncFreq is null.");
          j = 3600;
        }
        long l1 = System.currentTimeMillis();
        long l2 = paramd.field_incrementUpdateTime;
        ab.i("MicroMsg.BizAttrRenovator", "currentMS(%d), lastUpdateTime(%d), freq(%d), version(%s).", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(j), paramd.field_attrSyncVersion });
        if (l1 - l2 >= j * 1000L)
        {
          AppMethodBeat.o(11244);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(11244);
          bool = false;
        }
      }
    }
  }

  private static boolean b(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(11248);
    try
    {
      if ("IsShowHeadImgInMsg".equals(paramString1))
        paramJSONObject.put(paramString1, paramString2);
      while (true)
      {
        AppMethodBeat.o(11248);
        bool = true;
        return bool;
        if (!"IsHideInputToolbarInMsg".equals(paramString1))
          break;
        paramJSONObject.put(paramString1, paramString2);
      }
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        ab.e("MicroMsg.BizAttrRenovator", "updateExtInfoAttrs failed, key(%s) value(%s), exception : %s.", new Object[] { paramString1, paramString2, paramJSONObject });
        continue;
        if (!"IsAgreeProtocol".equals(paramString1))
          if ("InteractiveMode".equals(paramString1))
            paramJSONObject.put(paramString1, bo.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          else if ("CanReceiveSpeexVoice".equals(paramString1))
            paramJSONObject.put(paramString1, paramString2);
          else if ("ConnectorMsgType".equals(paramString1))
            paramJSONObject.put(paramString1, bo.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          else if ("ReportLocationType".equals(paramString1))
            paramJSONObject.put(paramString1, bo.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          else if ("AudioPlayType".equals(paramString1))
            paramJSONObject.put(paramString1, bo.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          else if ("IsShowMember".equals(paramString1))
            paramJSONObject.put(paramString1, paramString2);
          else if ("ConferenceContactExpireTime".equals(paramString1))
            paramJSONObject.put(paramString1, paramString2);
          else if (!"VerifyMsg2Remark".equals(paramString1))
            if ("VerifyContactPromptTitle".equals(paramString1))
              paramJSONObject.put(paramString1, paramString2);
            else if (!"IsSubscribeStat".equals(paramString1))
              if ("ScanQRCodeType".equals(paramString1))
                paramJSONObject.put(paramString1, bo.getInt(paramString2, paramJSONObject.optInt(paramString1)));
              else if ("ServiceType".equals(paramString1))
                paramJSONObject.put(paramString1, bo.getInt(paramString2, paramJSONObject.optInt(paramString1)));
              else if (!"NeedShowUserAddrObtaining".equals(paramString1))
                if ("SupportEmoticonLinkPrefix".equals(paramString1))
                  paramJSONObject.put(paramString1, paramString2);
                else if ("FunctionFlag".equals(paramString1))
                  paramJSONObject.put(paramString1, bo.getInt(paramString2, paramJSONObject.optInt(paramString1)));
                else if ("NotifyManage".equals(paramString1))
                  paramJSONObject.put(paramString1, paramString2);
                else if ("ServicePhone".equals(paramString1))
                  paramJSONObject.put(paramString1, paramString2);
                else if ("IsTrademarkProtection".equals(paramString1))
                  paramJSONObject.put(paramString1, paramString2);
                else if (!"CanReceiveLongVideo".equals(paramString1))
                  if ("TrademarkUrl".equals(paramString1))
                    paramJSONObject.put(paramString1, paramString2);
                  else if ("TrademarkName".equals(paramString1))
                    paramJSONObject.put(paramString1, paramString2);
                  else if ("MMBizMenu".equals(paramString1))
                    paramJSONObject.put(paramString1, paramString2);
                  else if ("VerifySource".equals(paramString1))
                    paramJSONObject.put(paramString1, paramString2);
                  else if (!"MMBizTabbar".equals(paramString1))
                    if ("PayShowInfo".equals(paramString1))
                      paramJSONObject.put(paramString1, paramString2);
                    else if ("HardwareBizInfo".equals(paramString1))
                      paramJSONObject.put(paramString1, paramString2);
                    else if ("EnterpriseBizInfo".equals(paramString1))
                      paramJSONObject.put(paramString1, paramString2);
                    else if (!"MainPage".equals(paramString1))
                      if ("RegisterSource".equals(paramString1))
                        paramJSONObject.put(paramString1, paramString2);
                      else if (!"IBeaconBizInfo".equals(paramString1))
                        if ("WxaAppInfo".equals(paramString1))
                          paramJSONObject.put(paramString1, paramString2);
                        else if ("WxaAppVersionInfo".equals(paramString1))
                          paramJSONObject.put(paramString1, paramString2);
                        else if ("WXAppType".equals(paramString1))
                          paramJSONObject.put(paramString1, paramString2);
                        else if ("BindWxaInfo".equals(paramString1))
                          paramJSONObject.put(paramString1, paramString2);
                        else if ("AcctTransferInfo".equals(paramString1))
                          paramJSONObject.put(paramString1, paramString2);
                        else
                          AppMethodBeat.o(11248);
      }
    }
  }

  public static boolean qA(String paramString)
  {
    AppMethodBeat.i(11243);
    boolean bool;
    if ((bo.isEqual(fuG, paramString)) && (System.currentTimeMillis() - fuH < 1000L))
    {
      bool = true;
      AppMethodBeat.o(11243);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11243);
    }
  }

  public static void qy(String paramString)
  {
    AppMethodBeat.i(11241);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(11241);
    while (true)
    {
      return;
      paramString = z.aeR().qP(paramString);
      paramString.field_attrSyncVersion = null;
      paramString.field_incrementUpdateTime = 0L;
      z.aeR().e(paramString);
      AppMethodBeat.o(11241);
    }
  }

  public static void qz(String paramString)
  {
    AppMethodBeat.i(11242);
    fuG = paramString;
    fuH = System.currentTimeMillis();
    AppMethodBeat.o(11242);
  }

  public final boolean qB(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11246);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is null or nil.");
      AppMethodBeat.o(11246);
    }
    while (true)
    {
      return bool;
      if (qA(paramString))
      {
        ab.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is just delete.");
        AppMethodBeat.o(11246);
      }
      else
      {
        ab.d("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes");
        d locald = z.aeR().qP(paramString);
        if (!b(locald))
        {
          ab.i("MicroMsg.BizAttrRenovator", "do not need to update biz attrs now.");
          AppMethodBeat.o(11246);
        }
        else
        {
          WeakReference localWeakReference = new WeakReference(null);
          g.RO().eJo.a(new p(paramString, locald.field_attrSyncVersion, new a.1(this, paramString, localWeakReference)), 0);
          bool = true;
          AppMethodBeat.o(11246);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a
 * JD-Core Version:    0.6.2
 */