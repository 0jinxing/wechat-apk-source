package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.LinkedList;

final class ContactSearchResultUI$2
  implements AdapterView.OnItemClickListener
{
  ContactSearchResultUI$2(ContactSearchResultUI paramContactSearchResultUI, int paramInt)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25516);
    int i = paramInt - ContactSearchResultUI.a(this.svk).getHeaderViewsCount();
    if ((i < 0) || (i >= ContactSearchResultUI.a(this.svk).getCount()))
      AppMethodBeat.o(25516);
    while (true)
    {
      return;
      if (i >= ContactSearchResultUI.b(this.svk).size())
      {
        paramAdapterView = (bvk)ContactSearchResultUI.c(this.svk).get(paramInt - ContactSearchResultUI.b(this.svk).size());
        ContactSearchResultUI.a(this.svk, paramAdapterView);
        AppMethodBeat.o(25516);
        continue;
      }
      paramAdapterView = (but)ContactSearchResultUI.b(this.svk).get(i);
      paramView = paramAdapterView.wcB.wVI;
      aw.ZK();
      Object localObject = c.XM().aoO(paramView);
      if (a.jh(((ap)localObject).field_type))
      {
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("Contact_User", paramView);
        paramAdapterView.putExtra("Contact_Scene", 3);
        if ((paramView != null) && (paramView.length() > 0))
        {
          if (((ad)localObject).dsf())
          {
            h.pYm.X(10298, paramView + ",35");
            paramAdapterView.putExtra("Contact_Scene", 35);
          }
          d.b(this.svk, "profile", ".ui.ContactInfoUI", paramAdapterView);
        }
        AppMethodBeat.o(25516);
        continue;
      }
      if ((paramAdapterView.wBT & 0x8) > 0)
        h.pYm.X(10298, paramAdapterView.wcB.wVI + ",35");
      localObject = new Intent();
      ((Intent)localObject).putExtra("Contact_User", paramAdapterView.wcB.wVI);
      ((Intent)localObject).putExtra("Contact_Alias", paramAdapterView.guS);
      ((Intent)localObject).putExtra("Contact_Nick", paramAdapterView.wyX.wVI);
      ((Intent)localObject).putExtra("Contact_Signature", paramAdapterView.guQ);
      ((Intent)localObject).putExtra("Contact_RegionCode", RegionCodeDecoder.aC(paramAdapterView.guW, paramAdapterView.guO, paramAdapterView.guP));
      ((Intent)localObject).putExtra("Contact_Sex", paramAdapterView.guN);
      ((Intent)localObject).putExtra("Contact_VUser_Info", paramAdapterView.wBU);
      ((Intent)localObject).putExtra("Contact_VUser_Info_Flag", paramAdapterView.wBT);
      ((Intent)localObject).putExtra("Contact_KWeibo_flag", paramAdapterView.wBX);
      ((Intent)localObject).putExtra("Contact_KWeibo", paramAdapterView.wBV);
      ((Intent)localObject).putExtra("Contact_KWeiboNick", paramAdapterView.wBW);
      ((Intent)localObject).putExtra("Contact_KSnsIFlag", paramAdapterView.wBZ.guY);
      ((Intent)localObject).putExtra("Contact_KSnsBgId", paramAdapterView.wBZ.gva);
      ((Intent)localObject).putExtra("Contact_KSnsBgUrl", paramAdapterView.wBZ.guZ);
      ((Intent)localObject).putExtra("Contact_Scene", 35);
      if (this.svl != 0)
        ((Intent)localObject).putExtra("add_more_friend_search_scene", this.svl);
      if (paramAdapterView.wCa != null);
      try
      {
        ((Intent)localObject).putExtra("Contact_customInfo", paramAdapterView.wCa.toByteArray());
        if ((paramAdapterView.wBT & 0x8) > 0)
          h.pYm.X(10298, paramAdapterView.wcB.wVI + ",35");
        d.b(this.svk, "profile", ".ui.ContactInfoUI", (Intent)localObject);
        AppMethodBeat.o(25516);
      }
      catch (IOException paramView)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.ContactSearchResultUI", paramView, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI.2
 * JD-Core Version:    0.6.2
 */