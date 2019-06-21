package com.tencent.mm.w.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.ui.InviteFriendUI;
import com.tencent.mm.plugin.fts.ui.a.b.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.RegionCodeDecoder;

public final class c$a extends b.b
{
  public c$a(c paramc)
  {
    super(paramc);
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(124494);
    parama = (c)parama;
    if (parama.eBs == null)
      AppMethodBeat.o(124494);
    while (true)
    {
      return true;
      if ((parama.eBs.status == 1) || (parama.eBs.status == 2))
      {
        ab.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin On Or Weixin Friend");
        parama = new Intent();
        parama.putExtra("Contact_User", this.eBv.eBs.getUsername());
        parama.putExtra("Contact_Nick", this.eBv.eBs.apD());
        parama.putExtra("Contact_Mobile_MD5", this.eBv.eBs.Aq());
        parama.putExtra("Contact_Alias", this.eBv.eBs.guS);
        parama.putExtra("Contact_Sex", this.eBv.eBs.guN);
        parama.putExtra("Contact_Signature", this.eBv.eBs.guQ);
        parama.putExtra("Contact_RegionCode", RegionCodeDecoder.aC(this.eBv.eBs.guW, this.eBv.eBs.guO, this.eBv.eBs.guP));
        parama.putExtra("Contact_Scene", 13);
        parama.putExtra("Contact_ShowUserName", false);
        if (this.eBv.eBt)
          parama.putExtra("add_more_friend_search_scene", 1);
        com.tencent.mm.plugin.account.a.a.gkE.c(parama, paramContext);
        AppMethodBeat.o(124494);
      }
      else if (this.eBv.eBs.status == 0)
      {
        ab.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin Off");
        parama = new Intent(paramContext, InviteFriendUI.class);
        parama.putExtra("friend_type", 1);
        parama.putExtra("friend_user_name", this.eBv.eBs.getUsername());
        parama.putExtra("friend_num", this.eBv.eBs.apG());
        parama.putExtra("friend_nick", this.eBv.eBs.apA());
        parama.putExtra("friend_weixin_nick", this.eBv.eBs.apD());
        parama.putExtra("friend_scene", 13);
        paramContext.startActivity(parama);
        AppMethodBeat.o(124494);
      }
      else
      {
        ab.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin status unknown");
        AppMethodBeat.o(124494);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.a.c.a
 * JD-Core Version:    0.6.2
 */