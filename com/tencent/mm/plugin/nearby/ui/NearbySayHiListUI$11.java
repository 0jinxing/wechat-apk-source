package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.i;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bi.d;

final class NearbySayHiListUI$11
  implements AdapterView.OnItemClickListener
{
  NearbySayHiListUI$11(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(55505);
    int i = paramInt;
    if (NearbySayHiListUI.d(this.oQP).getHeaderViewsCount() > 0)
      i = paramInt - NearbySayHiListUI.d(this.oQP).getHeaderViewsCount();
    bf localbf = (bf)NearbySayHiListUI.b(this.oQP).getItem(i);
    if ((localbf == null) || (localbf.field_content == null))
      AppMethodBeat.o(55505);
    while (true)
    {
      return;
      paramView = bi.d.apF(localbf.field_content);
      paramAdapterView = new Intent();
      if (!com.tencent.mm.bn.a.dgL())
        break;
      paramAdapterView.putExtra("Chat_User", localbf.field_sayhiencryptuser);
      paramAdapterView.putExtra("lbs_mode", true);
      paramAdapterView.putExtra("add_scene", 18);
      com.tencent.mm.plugin.nearby.a.gkE.d(paramAdapterView, this.oQP);
      paramAdapterView = new i();
      paramAdapterView.csa.scene = paramView.scene;
      com.tencent.mm.sdk.b.a.xxA.m(paramAdapterView);
      AppMethodBeat.o(55505);
    }
    Intent localIntent = new Intent();
    if (bo.isNullOrNil(paramView.svN))
    {
      paramAdapterView = localbf.field_sayhiuser;
      label196: localIntent.putExtra("Contact_User", paramAdapterView);
      localIntent.putExtra("Contact_Alias", paramView.dFl);
      localIntent.putExtra("Contact_Nick", paramView.nickname);
      localIntent.putExtra("Contact_QuanPin", paramView.gwG);
      localIntent.putExtra("Contact_PyInitial", paramView.gwF);
      localIntent.putExtra("Contact_Sex", paramView.dtS);
      localIntent.putExtra("Contact_Signature", paramView.signature);
      localIntent.putExtra("Contact_Scene", paramView.scene);
      localIntent.putExtra("Contact_FMessageCard", true);
      localIntent.putExtra("Contact_City", paramView.getCity());
      localIntent.putExtra("Contact_Province", paramView.getProvince());
      if (!bo.isNullOrNil(localbf.field_sayhicontent))
        break label572;
    }
    label572: for (paramAdapterView = this.oQP.getString(2131298112); ; paramAdapterView = localbf.field_sayhicontent)
    {
      localIntent.putExtra("Contact_Content", paramAdapterView);
      localIntent.putExtra("Contact_verify_Scene", paramView.scene);
      localIntent.putExtra("Contact_Uin", paramView.pnz);
      localIntent.putExtra("Contact_QQNick", paramView.gwH);
      localIntent.putExtra("Contact_Mobile_MD5", paramView.xZi);
      localIntent.putExtra("User_From_Fmessage", true);
      localIntent.putExtra("Contact_from_msgType", 37);
      localIntent.putExtra("Verify_ticket", paramView.mGZ);
      localIntent.putExtra("Contact_Source_FMessage", paramView.scene);
      localIntent.putExtra("Contact_ShowFMessageList", true);
      paramAdapterView = ((j)g.K(j.class)).XM().aoO(paramView.svN);
      if ((paramAdapterView != null) && ((int)paramAdapterView.ewQ >= 0) && (!com.tencent.mm.n.a.jh(paramAdapterView.field_type)))
      {
        paramInt = paramView.cAd;
        if ((paramInt == 0) || (paramInt == 2) || (paramInt == 5))
          localIntent.putExtra("User_Verify", true);
        localIntent.putExtra("Contact_IsLBSFriend", true);
        localIntent.putExtra("Sns_from_Scene", 18);
      }
      com.tencent.mm.plugin.nearby.a.gkE.c(localIntent, this.oQP);
      break;
      paramAdapterView = paramView.svN;
      break label196;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.11
 * JD-Core Version:    0.6.2
 */