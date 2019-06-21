package com.tencent.mm.ui.contact;

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
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.f;
import com.tencent.mm.ui.voicesearch.b;
import java.io.IOException;

final class OpenIMAddressUI$OpenIMAddressUIFragment$15
  implements AdapterView.OnItemClickListener
{
  OpenIMAddressUI$OpenIMAddressUIFragment$15(OpenIMAddressUI.OpenIMAddressUIFragment paramOpenIMAddressUIFragment)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33780);
    paramView = new StringBuilder("onItemClick ").append(paramInt);
    boolean bool1;
    if (OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc) == null)
    {
      paramAdapterView = OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc);
      ab.i("MicroMsg.OpenIMAddressUI", paramAdapterView);
      paramInt -= OpenIMAddressUI.OpenIMAddressUIFragment.c(this.zoc).getHeaderViewsCount();
      if ((OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc) == null) || (!OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).zLy))
        break label803;
      bool1 = OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).wK(paramInt);
      boolean bool2 = OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).PQ(paramInt);
      ab.i("MicroMsg.OpenIMAddressUI", "onItemClick ".concat(String.valueOf(bool2)));
      if (!bool2)
        break label167;
      OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).asx("");
      AppMethodBeat.o(33780);
    }
    label803: 
    while (true)
    {
      return;
      paramAdapterView = Boolean.valueOf(OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).zLy);
      break;
      label167: if (bool1)
      {
        paramView = OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).PO(paramInt);
        paramAdapterView = paramView.wcB.wVI;
        aw.ZK();
        ad localad = c.XM().aoO(paramAdapterView);
        if (a.jh(localad.field_type))
        {
          paramView = new Intent();
          paramView.putExtra("Contact_User", paramAdapterView);
          paramView.putExtra("Contact_Scene", 3);
          if ((paramAdapterView != null) && (paramAdapterView.length() > 0))
          {
            if (localad.dsf())
              h.pYm.X(10298, paramAdapterView + ",3");
            e.a(paramView, paramAdapterView);
            d.b(this.zoc.getContext(), "profile", ".ui.ContactInfoUI", paramView);
          }
          AppMethodBeat.o(33780);
        }
        else
        {
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("Contact_User", paramView.wcB.wVI);
          localIntent2.putExtra("Contact_Alias", paramView.guS);
          localIntent2.putExtra("Contact_Nick", paramView.wyX.wVI);
          localIntent2.putExtra("Contact_Signature", paramView.guQ);
          localIntent2.putExtra("Contact_RegionCode", RegionCodeDecoder.aC(paramView.guW, paramView.guO, paramView.guP));
          localIntent2.putExtra("Contact_Sex", paramView.guN);
          localIntent2.putExtra("Contact_VUser_Info", paramView.wBU);
          localIntent2.putExtra("Contact_VUser_Info_Flag", paramView.wBT);
          localIntent2.putExtra("Contact_KWeibo_flag", paramView.wBX);
          localIntent2.putExtra("Contact_KWeibo", paramView.wBV);
          localIntent2.putExtra("Contact_KWeiboNick", paramView.wBW);
          localIntent2.putExtra("Contact_KSnsIFlag", paramView.wBZ.guY);
          localIntent2.putExtra("Contact_KSnsBgId", paramView.wBZ.gva);
          localIntent2.putExtra("Contact_KSnsBgUrl", paramView.wBZ.guZ);
          if (paramView.wCa != null);
          try
          {
            localIntent2.putExtra("Contact_customInfo", paramView.wCa.toByteArray());
            if ((paramView.wBT & 0x8) > 0)
              h.pYm.X(10298, paramAdapterView + ",3");
            d.b(this.zoc.getContext(), "profile", ".ui.ContactInfoUI", localIntent2);
            AppMethodBeat.o(33780);
          }
          catch (IOException localIOException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.OpenIMAddressUI", localIOException, "", new Object[0]);
          }
        }
      }
      else
      {
        paramAdapterView = OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).PP(paramInt);
        if (paramAdapterView == null)
        {
          ab.e("MicroMsg.OpenIMAddressUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", new Object[] { Integer.valueOf(OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).getCount()), Integer.valueOf(paramInt) });
          AppMethodBeat.o(33780);
        }
        else
        {
          paramAdapterView = paramAdapterView.field_username;
          if (com.tencent.mm.model.t.ny(paramAdapterView))
          {
            paramAdapterView = new Intent(this.zoc.getContext(), OpenIMAddressUI.class);
            paramAdapterView.putExtra("Contact_GroupFilter_Type", "@biz.contact");
            this.zoc.startActivity(paramAdapterView);
            AppMethodBeat.o(33780);
          }
          else
          {
            paramView = new Intent();
            paramView.putExtra("Contact_User", paramAdapterView);
            paramView.putExtra("Contact_Scene", 3);
            if ((paramAdapterView != null) && (paramAdapterView.length() > 0))
              d.b(this.zoc.getContext(), "profile", ".ui.ContactInfoUI", paramView);
            AppMethodBeat.o(33780);
            continue;
            paramAdapterView = (f)OpenIMAddressUI.OpenIMAddressUIFragment.a(this.zoc).MG(paramInt);
            if (paramAdapterView != null)
            {
              paramView = paramAdapterView.field_username;
              paramAdapterView = this.zoc;
              if ((paramView == null) || (paramView.length() <= 0))
              {
                AppMethodBeat.o(33780);
              }
              else if (com.tencent.mm.model.t.ny(paramView))
              {
                ab.e("MicroMsg.OpenIMAddressUI", "error, 4.5 do not contain this contact %s", new Object[] { paramView });
                AppMethodBeat.o(33780);
              }
              else
              {
                Intent localIntent1 = new Intent();
                localIntent1.putExtra("Contact_User", paramView);
                if (com.tencent.mm.model.t.mW(paramView))
                  localIntent1.putExtra("Is_group_card", true);
                if ((paramView != null) && (paramView.length() > 0))
                {
                  e.a(localIntent1, paramView);
                  d.b(paramAdapterView.getContext(), "profile", ".ui.ContactInfoUI", localIntent1);
                }
              }
            }
            else
            {
              AppMethodBeat.o(33780);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment.15
 * JD-Core Version:    0.6.2
 */