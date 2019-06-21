package com.tencent.mm.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.a;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.ui.e.b;
import java.util.ArrayList;
import org.json.JSONObject;

public final class j
  implements com.tencent.mm.api.j
{
  public final void a(Intent paramIntent, but parambut, int paramInt)
  {
    AppMethodBeat.i(11233);
    String str = aa.a(parambut.wcB);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", aa.a(parambut.wyX));
    paramIntent.putExtra("Contact_PyInitial", aa.a(parambut.wce));
    paramIntent.putExtra("Contact_QuanPin", aa.a(parambut.wcf));
    paramIntent.putExtra("Contact_Alias", parambut.guS);
    paramIntent.putExtra("Contact_Sex", parambut.guN);
    paramIntent.putExtra("Contact_VUser_Info", parambut.wBU);
    paramIntent.putExtra("Contact_VUser_Info_Flag", parambut.wBT);
    paramIntent.putExtra("Contact_KWeibo_flag", parambut.wBX);
    paramIntent.putExtra("Contact_KWeibo", parambut.wBV);
    paramIntent.putExtra("Contact_KWeiboNick", parambut.wBW);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aC(parambut.guW, parambut.guO, parambut.guP));
    paramIntent.putExtra("Contact_Signature", parambut.guQ);
    paramIntent.putExtra("Contact_BrandList", parambut.guX);
    paramIntent.putExtra("Contact_KSnsIFlag", parambut.wBZ.guY);
    paramIntent.putExtra("Contact_KSnsBgId", parambut.wBZ.gva);
    paramIntent.putExtra("Contact_KSnsBgUrl", parambut.wBZ.guZ);
    paramIntent.putExtra(e.b.yfT, parambut.wlF);
    ab.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", new Object[] { parambut.wlF });
    paramIntent = new d();
    paramIntent.field_username = str;
    paramIntent.field_brandList = parambut.guX;
    parambut = parambut.wCa;
    if (parambut != null)
    {
      paramIntent.field_brandFlag = parambut.gvb;
      paramIntent.field_brandInfo = parambut.gvd;
      paramIntent.field_extInfo = parambut.gvc;
      paramIntent.field_brandIconURL = parambut.gve;
    }
    if (!z.aeR().e(paramIntent))
      z.aeR().d(paramIntent);
    AppMethodBeat.o(11233);
  }

  public final void a(Intent paramIntent, buv parambuv, int paramInt)
  {
    AppMethodBeat.i(11232);
    String str = aa.a(parambuv.wcB);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", aa.a(parambuv.wyX));
    paramIntent.putExtra("Contact_PyInitial", aa.a(parambuv.wce));
    paramIntent.putExtra("Contact_QuanPin", aa.a(parambuv.wcf));
    paramIntent.putExtra("Contact_Alias", parambuv.guS);
    paramIntent.putExtra("Contact_Sex", parambuv.guN);
    paramIntent.putExtra("Contact_VUser_Info", parambuv.wBU);
    paramIntent.putExtra("Contact_VUser_Info_Flag", parambuv.wBT);
    paramIntent.putExtra("Contact_KWeibo_flag", parambuv.wBX);
    paramIntent.putExtra("Contact_KWeibo", parambuv.wBV);
    paramIntent.putExtra("Contact_KWeiboNick", parambuv.wBW);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aC(parambuv.guW, parambuv.guO, parambuv.guP));
    paramIntent.putExtra("Contact_Signature", parambuv.guQ);
    paramIntent.putExtra("Contact_BrandList", parambuv.guX);
    paramIntent.putExtra("Contact_KSnsIFlag", parambuv.wBZ.guY);
    paramIntent.putExtra("Contact_KSnsBgId", parambuv.wBZ.gva);
    paramIntent.putExtra("Contact_KSnsBgUrl", parambuv.wBZ.guZ);
    paramIntent.putExtra("Contact_BIZ_KF_WORKER_ID", parambuv.wWk);
    paramIntent.putExtra(e.b.yfT, parambuv.wlF);
    paramIntent.putExtra("Contact_BIZ_PopupInfoMsg", parambuv.wWl);
    ab.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", new Object[] { parambuv.wlF });
    paramIntent = new d();
    paramIntent.field_username = str;
    paramIntent.field_brandList = parambuv.guX;
    paramIntent.field_kfWorkerId = parambuv.wWk;
    parambuv = parambuv.wCa;
    if (parambuv != null)
    {
      paramIntent.field_brandFlag = parambuv.gvb;
      paramIntent.field_brandInfo = parambuv.gvd;
      paramIntent.field_extInfo = parambuv.gvc;
      paramIntent.field_brandIconURL = parambuv.gve;
    }
    if (!z.aeR().e(paramIntent))
      z.aeR().d(paramIntent);
    AppMethodBeat.o(11232);
  }

  public final boolean cJ(String paramString)
  {
    AppMethodBeat.i(11230);
    boolean bool;
    if (z.aeR().qP(paramString).adJ())
    {
      bool = true;
      AppMethodBeat.o(11230);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11230);
    }
  }

  public final ArrayList<String> cK(String paramString)
  {
    AppMethodBeat.i(11231);
    try
    {
      paramString = z.aeR().qP(paramString).cJ(false);
      if ((paramString.fvE == null) && (paramString.fvc != null))
        paramString.fvE = d.b.a.qI(paramString.fvc.optString("AcctTransferInfo"));
      paramString = paramString.fvE.fvG;
      AppMethodBeat.o(11231);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = new ArrayList();
        AppMethodBeat.o(11231);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.j
 * JD-Core Version:    0.6.2
 */