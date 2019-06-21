package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.bt;

final class ShakeSayHiListUI$7
  implements AdapterView.OnItemClickListener
{
  ShakeSayHiListUI$7(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24880);
    paramAdapterView = (bt)ShakeSayHiListUI.b(this.qwt).getItem(paramInt);
    if ((paramAdapterView == null) || (paramAdapterView.field_content == null))
    {
      AppMethodBeat.o(24880);
      return;
    }
    paramView = bi.d.apF(paramAdapterView.field_content);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramView.svN);
    localIntent.putExtra("Contact_Encryptusername", paramView.xZx);
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
    if (bo.isNullOrNil(paramAdapterView.field_sayhicontent));
    for (paramAdapterView = this.qwt.getString(2131298112); ; paramAdapterView = paramAdapterView.field_sayhicontent)
    {
      localIntent.putExtra("Contact_Content", paramAdapterView);
      localIntent.putExtra("Contact_verify_Scene", paramView.scene);
      localIntent.putExtra("Contact_Uin", paramView.pnz);
      localIntent.putExtra("Contact_QQNick", paramView.gwH);
      localIntent.putExtra("Contact_Mobile_MD5", paramView.xZi);
      localIntent.putExtra("User_From_Fmessage", true);
      localIntent.putExtra("Contact_from_msgType", 37);
      localIntent.putExtra("Verify_ticket", paramView.mGZ);
      localIntent.putExtra("Contact_ShowFMessageList", true);
      localIntent.putExtra("Contact_Source_FMessage", paramView.scene);
      aw.ZK();
      paramAdapterView = c.XM().aoO(paramView.svN);
      if ((paramAdapterView != null) && ((int)paramAdapterView.ewQ >= 0) && (!com.tencent.mm.n.a.jh(paramAdapterView.field_type)))
      {
        paramInt = paramView.cAd;
        if ((paramInt == 0) || (paramInt == 2) || (paramInt == 5))
          localIntent.putExtra("User_Verify", true);
        localIntent.putExtra("Contact_IsLBSFriend", true);
        localIntent.putExtra("Sns_from_Scene", 18);
      }
      com.tencent.mm.plugin.shake.a.gkE.c(localIntent, this.qwt);
      AppMethodBeat.o(24880);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.7
 * JD-Core Version:    0.6.2
 */