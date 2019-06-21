package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp;
import com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp;
import com.tencent.mm.plugin.game.d.aa;
import com.tencent.mm.plugin.game.d.ao;
import com.tencent.mm.plugin.game.d.ap;
import com.tencent.mm.plugin.game.d.z;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.pluginsdk.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(7)
public class CreateOrJoinChatroomUI extends MMBaseActivity
{
  private String JU;
  private ProgressDialog fsh = null;
  private String gHT;
  private String mAppId;
  private String mPackageName;
  private String nep;
  private String neq;
  private String ner;
  private String nes;
  private int neu = 1;

  private void bFd()
  {
    AppMethodBeat.i(111706);
    if ((this.fsh != null) && (this.fsh.isShowing()))
      this.fsh.cancel();
    AppMethodBeat.o(111706);
  }

  private void wE(int paramInt)
  {
    AppMethodBeat.i(111708);
    Object localObject1 = g.bT(this.mAppId, true);
    Bundle localBundle = new Bundle();
    Object localObject2;
    if (this.JU.equals("action_create"))
    {
      localObject2 = new CreateChatroom.Resp();
      if (localObject1 != null)
        ((CreateChatroom.Resp)localObject2).openId = ((f)localObject1).field_openId;
      ((CreateChatroom.Resp)localObject2).transaction = this.nep;
      ((CreateChatroom.Resp)localObject2).extMsg = this.nes;
      ((CreateChatroom.Resp)localObject2).errCode = paramInt;
      ((CreateChatroom.Resp)localObject2).toBundle(localBundle);
    }
    while (true)
    {
      localObject1 = new MMessageActV2.Args();
      ((MMessageActV2.Args)localObject1).targetPkgName = this.mPackageName;
      ((MMessageActV2.Args)localObject1).bundle = localBundle;
      p.at(localBundle);
      p.au(localBundle);
      MMessageActV2.send(ah.getContext(), (MMessageActV2.Args)localObject1);
      AppMethodBeat.o(111708);
      return;
      if (this.JU.equals("action_join"))
      {
        localObject2 = new JoinChatroom.Resp();
        if (localObject1 != null)
          ((JoinChatroom.Resp)localObject2).openId = ((f)localObject1).field_openId;
        ((JoinChatroom.Resp)localObject2).transaction = this.nep;
        ((JoinChatroom.Resp)localObject2).extMsg = this.nes;
        ((JoinChatroom.Resp)localObject2).errCode = paramInt;
        ((JoinChatroom.Resp)localObject2).toBundle(localBundle);
      }
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(111707);
    if (paramInt1 == 5)
    {
      if (paramInt2 != 4)
        break label30;
      wE(0);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(111707);
      return;
      label30: if (paramInt2 == 5)
      {
        if (paramIntent != null)
        {
          paramIntent = paramIntent.getStringExtra("rawUrl");
          r.a.vax.b(this, paramIntent, true, null);
        }
      }
      else if (paramInt2 == 0)
        wE(-2);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111704);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    ab.i("MicroMsg.CreateOrJoinChatroomUI", "onCreate");
    paramBundle = getIntent();
    this.JU = paramBundle.getStringExtra("action");
    this.mPackageName = paramBundle.getStringExtra("package_name");
    this.mAppId = paramBundle.getStringExtra("key_app_id");
    this.nep = paramBundle.getStringExtra("key_transaction");
    this.neq = paramBundle.getStringExtra("group_id");
    this.ner = paramBundle.getStringExtra("chatroom_name");
    this.gHT = paramBundle.getStringExtra("chatroom_nickname");
    this.nes = paramBundle.getStringExtra("ext_msg");
    if ((bo.isNullOrNil(this.JU)) || (bo.isNullOrNil(this.mAppId)) || (bo.isNullOrNil(this.neq)))
    {
      ab.e("MicroMsg.CreateOrJoinChatroomUI", "Invalid args");
      finish();
      AppMethodBeat.o(111704);
      return;
    }
    this.fsh = h.b(this, getBaseContext().getString(2131300359), true, null);
    com.tencent.mm.ai.b localb;
    Object localObject;
    if (this.JU.equals("action_create"))
    {
      ab.i("MicroMsg.CreateOrJoinChatroomUI", "createChatroom, appid = %s, groupId = %s, ChatRoomName = %s", new Object[] { this.mAppId, this.neq, this.ner });
      paramBundle = new b.a();
      paramBundle.fsJ = new z();
      paramBundle.fsK = new aa();
      paramBundle.uri = "/cgi-bin/mmgame-bin/gamecreatechatroom";
      paramBundle.fsI = 1205;
      localb = paramBundle.acD();
      localObject = (z)localb.fsG.fsP;
      ((z)localObject).mZr = this.mAppId;
      ((z)localObject).nat = this.neq;
      if (this.ner == null)
      {
        paramBundle = new byte[0];
        label307: ((z)localObject).nau = new com.tencent.mm.bt.b(paramBundle);
        if (this.gHT != null)
          break label374;
      }
      label374: for (paramBundle = new byte[0]; ; paramBundle = this.gHT.getBytes())
      {
        ((z)localObject).nav = new com.tencent.mm.bt.b(paramBundle);
        w.a(localb, new CreateOrJoinChatroomUI.1(this));
        AppMethodBeat.o(111704);
        break;
        paramBundle = this.ner.getBytes();
        break label307;
      }
    }
    if (this.JU.equals("action_join"))
    {
      paramBundle = new b.a();
      paramBundle.fsJ = new ao();
      paramBundle.fsK = new ap();
      paramBundle.uri = "/cgi-bin/mmgame-bin/gamejoinchatroom";
      paramBundle.fsI = 1206;
      localb = paramBundle.acD();
      localObject = (ao)localb.fsG.fsP;
      ((ao)localObject).mZr = this.mAppId;
      ((ao)localObject).nat = this.neq;
      if (this.gHT != null)
        break label517;
    }
    label517: for (paramBundle = new byte[0]; ; paramBundle = this.gHT.getBytes())
    {
      ((ao)localObject).nav = new com.tencent.mm.bt.b(paramBundle);
      w.a(localb, new CreateOrJoinChatroomUI.2(this));
      AppMethodBeat.o(111704);
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(111705);
    bFd();
    super.onDestroy();
    AppMethodBeat.o(111705);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI
 * JD-Core Version:    0.6.2
 */