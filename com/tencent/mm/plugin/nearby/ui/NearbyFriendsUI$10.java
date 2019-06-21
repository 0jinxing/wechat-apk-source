package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cache.MCacheItem;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.axv;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

final class NearbyFriendsUI$10
  implements AdapterView.OnItemClickListener
{
  NearbyFriendsUI$10(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(55451);
    if (NearbyFriendsUI.p(this.oQs) <= 0)
    {
      i = paramInt;
      if (NearbyFriendsUI.q(this.oQs) <= 0);
    }
    else
    {
      i = paramInt - 1;
    }
    paramInt = i;
    if (com.tencent.mm.bn.a.dgL())
    {
      paramInt = i;
      if (NearbyFriendsUI.n(this.oQs) != null)
        paramInt = i - 1;
    }
    int i = paramInt;
    if (NearbyFriendsUI.r(this.oQs))
      i = paramInt - 1;
    if ((i < 0) || (i >= NearbyFriendsUI.s(this.oQs).size()))
      AppMethodBeat.o(55451);
    while (true)
    {
      return;
      paramAdapterView = (axv)NearbyFriendsUI.s(this.oQs).get(i);
      if (NearbyFriendsUI.c.Aa(paramAdapterView.guN))
      {
        paramAdapterView = NearbyFriendsUI.c.b(paramAdapterView);
        ab.d("MicroMsg.NearbyFriend", "poi item click, go:" + bo.nullAsNil(paramAdapterView));
        if (!bo.isNullOrNil(paramAdapterView))
        {
          paramView = new Intent();
          paramView.putExtra("rawUrl", paramAdapterView);
          paramView.putExtra("geta8key_scene", 25);
          paramView.putExtra("stastic_scene", 12);
          com.tencent.mm.bp.d.b(this.oQs.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
        }
        AppMethodBeat.o(55451);
      }
      else
      {
        Object localObject = paramAdapterView.jBB;
        ad localad = ((j)g.K(j.class)).XM().aoO((String)localObject);
        if (com.tencent.mm.n.a.jh(localad.field_type))
        {
          paramView = new Intent();
          paramView.putExtra("Contact_User", (String)localObject);
          paramView.putExtra("Contact_Scene", 18);
          paramView.putExtra("Sns_from_Scene", 18);
          paramView.putExtra("lbs_ticket", paramAdapterView.wlF);
          paramView.putExtra("Contact_IsLbsGotoChatting", true);
          if ((localObject != null) && (((String)localObject).length() > 0))
          {
            if (localad.dsf())
              h.pYm.X(10298, (String)localObject + ",18");
            paramAdapterView = new qh();
            paramAdapterView.cMw.intent = paramView;
            paramAdapterView.cMw.username = ((String)localObject);
            com.tencent.mm.sdk.b.a.xxA.m(paramAdapterView);
            paramView.putExtra("CONTACT_INFO_UI_SOURCE", 5);
            com.tencent.mm.plugin.nearby.a.gkE.c(paramView, this.oQs);
          }
          AppMethodBeat.o(55451);
        }
        else
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Contact_User", paramAdapterView.jBB);
          ((Intent)localObject).putExtra("Contact_Alias", paramAdapterView.guS);
          ((Intent)localObject).putExtra("Contact_Nick", paramAdapterView.jCH);
          ((Intent)localObject).putExtra("Contact_Distance", paramAdapterView.wBS);
          ((Intent)localObject).putExtra("Contact_Signature", paramAdapterView.guQ);
          ((Intent)localObject).putExtra("Contact_RegionCode", RegionCodeDecoder.aC(paramAdapterView.guW, paramAdapterView.guO, paramAdapterView.guP));
          ((Intent)localObject).putExtra("Contact_Sex", paramAdapterView.guN);
          ((Intent)localObject).putExtra("Contact_IsLBSFriend", true);
          ((Intent)localObject).putExtra("Contact_Scene", 18);
          ((Intent)localObject).putExtra("Contact_VUser_Info", paramAdapterView.wBU);
          ((Intent)localObject).putExtra("Contact_VUser_Info_Flag", paramAdapterView.wBT);
          ((Intent)localObject).putExtra("Contact_KWeibo_flag", paramAdapterView.wBX);
          ((Intent)localObject).putExtra("Contact_KWeibo", paramAdapterView.wBV);
          ((Intent)localObject).putExtra("Contact_KWeiboNick", paramAdapterView.wBW);
          ((Intent)localObject).putExtra("Contact_KSnsIFlag", paramAdapterView.wBZ.guY);
          ((Intent)localObject).putExtra("Contact_KSnsBgId", paramAdapterView.wBZ.gva);
          ((Intent)localObject).putExtra("Contact_KSnsBgUrl", paramAdapterView.wBZ.guZ);
          ((Intent)localObject).putExtra("lbs_ticket", paramAdapterView.wlF);
          ((Intent)localObject).putExtra("Contact_IsLbsGotoChatting", true);
          if (paramAdapterView.guX != null)
          {
            paramView = new com.tencent.mm.aj.d();
            paramView.field_brandList = paramAdapterView.guX;
            paramView.field_brandFlag = paramAdapterView.wCa.gvb;
            paramView.field_brandIconURL = paramAdapterView.wCa.gve;
            paramView.field_extInfo = paramAdapterView.wCa.gvc;
            paramView.field_brandInfo = paramAdapterView.wCa.gvd;
            ((Intent)localObject).putExtra("KBrandInfo_item", new MCacheItem(paramView));
          }
          ((Intent)localObject).putExtra("Sns_from_Scene", 18);
          ((Intent)localObject).putExtra("CONTACT_INFO_UI_SOURCE", 5);
          com.tencent.mm.plugin.nearby.a.gkE.c((Intent)localObject, this.oQs);
          AppMethodBeat.o(55451);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.10
 * JD-Core Version:    0.6.2
 */