package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class RoomUpgradeUI extends MMActivity
  implements f
{
  private String chatroomName;
  private ProgressDialog ehJ = null;
  private int ehs;
  private int eht;
  private u eih;
  private View ekM;
  private ImageView ekN;
  private TextView ekO;
  private TextView ekP;
  private TextView ekQ;
  private TextView ekU;
  private View ekV;
  private TextView ekW;
  private com.tencent.mm.chatroom.c.j ekX;
  private String ekY;
  private boolean ekZ;
  private boolean ela;
  private int status;

  private void Kf()
  {
    AppMethodBeat.i(104251);
    kk(this.eih.field_roomowner);
    int i = this.eih.drW();
    this.ekP.setVisibility(0);
    if (i <= 40)
    {
      this.ekP.setText(getString(2131302650, new Object[] { getString(2131302644) }));
      AppMethodBeat.o(104251);
    }
    while (true)
    {
      return;
      this.ekP.setText(getString(2131302650, new Object[] { getString(2131302643) }));
      AppMethodBeat.o(104251);
    }
  }

  private void Kg()
  {
    AppMethodBeat.i(104244);
    Intent localIntent = new Intent(this, RoomAlphaProcessUI.class);
    localIntent.addFlags(67108864);
    localIntent.addFlags(65536);
    localIntent.putExtra("RoomInfo_Id", this.chatroomName);
    startActivity(localIntent);
    AppMethodBeat.o(104244);
  }

  private void Kh()
  {
    AppMethodBeat.i(104245);
    this.chatroomName = getIntent().getStringExtra("room_name");
    ab.i("MicroMsg.RoomUpgradeProductsUI", "the roomName is %s", new Object[] { this.chatroomName });
    g.RO().eJo.a(519, this);
    this.eih = ((c)g.K(c.class)).XV().oa(this.chatroomName);
    if (this.eih == null)
    {
      finish();
      AppMethodBeat.o(104245);
      return;
    }
    this.ekZ = r.Yz().equals(this.eih.field_roomowner);
    if (!aa.doo());
    for (boolean bool = true; ; bool = false)
    {
      this.ela = bool;
      AppMethodBeat.o(104245);
      break;
    }
  }

  private void Ki()
  {
    AppMethodBeat.i(104250);
    Kf();
    if (!this.ela)
      this.ekU.setVisibility(0);
    this.ekU.setText(2131302645);
    this.ekW.setVisibility(8);
    this.ekQ.setVisibility(8);
    AppMethodBeat.o(104250);
  }

  private void Kj()
  {
    AppMethodBeat.i(104255);
    this.ehJ = h.b(this, getString(2131300968), true, new RoomUpgradeUI.5(this));
    this.ekX = new com.tencent.mm.chatroom.c.j(this.chatroomName);
    g.RO().eJo.a(this.ekX, 0);
    AppMethodBeat.o(104255);
  }

  private String kg(String paramString)
  {
    AppMethodBeat.i(104254);
    if (this.eih == null)
    {
      paramString = null;
      AppMethodBeat.o(104254);
    }
    while (true)
    {
      return paramString;
      paramString = this.eih.mJ(paramString);
      AppMethodBeat.o(104254);
    }
  }

  private void kk(final String paramString)
  {
    AppMethodBeat.i(104252);
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    if ((localad != null) && ((int)localad.ewQ <= 0))
    {
      ao.a.flu.a(paramString, this.chatroomName, new ao.b.a()
      {
        public final void o(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(104239);
          if (paramAnonymousBoolean)
            RoomUpgradeUI.g(RoomUpgradeUI.this).post(new RoomUpgradeUI.4.1(this));
          AppMethodBeat.o(104239);
        }
      });
      AppMethodBeat.o(104252);
    }
    while (true)
    {
      return;
      kl(paramString);
      AppMethodBeat.o(104252);
    }
  }

  private void kl(String paramString)
  {
    AppMethodBeat.i(104253);
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    if ((localad != null) && ((int)localad.ewQ > 0));
    for (Object localObject1 = localad.field_conRemark; ; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = kg(paramString);
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
      {
        localObject1 = localObject2;
        if (localad != null)
        {
          localObject1 = localObject2;
          if ((int)localad.ewQ > 0)
            localObject1 = localad.Oi();
        }
      }
      localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = paramString;
      a.b.b(this.ekN, paramString);
      this.ekO.setVisibility(0);
      this.ekO.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject2, (int)this.ekO.getTextSize()));
      AppMethodBeat.o(104253);
      return;
    }
  }

  public final int getLayoutId()
  {
    return 2130969010;
  }

  public final void initView()
  {
    AppMethodBeat.i(104246);
    setMMTitle(2131302642);
    setBackBtn(new RoomUpgradeUI.1(this));
    this.ekM = findViewById(2131822367);
    this.ekV = findViewById(2131822370);
    this.ekN = ((ImageView)findViewById(2131822368));
    this.ekO = ((TextView)findViewById(2131822369));
    this.ekP = ((TextView)findViewById(2131822371));
    this.ekQ = ((TextView)findViewById(2131822373));
    this.ekW = ((TextView)findViewById(2131822372));
    this.ekW.setOnClickListener(new RoomUpgradeUI.2(this));
    this.ekU = ((TextView)findViewById(2131822374));
    this.ekU.setOnClickListener(new RoomUpgradeUI.3(this));
    if (this.ekZ)
      Kj();
    while (true)
    {
      if (this.ela)
        this.ekU.setVisibility(8);
      AppMethodBeat.o(104246);
      return;
      Ki();
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104256);
    ab.d("MicroMsg.RoomUpgradeProductsUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    switch (paramInt1)
    {
    default:
      ab.e("MicroMsg.RoomUpgradeProductsUI", "onActivityResult unknow request");
      AppMethodBeat.o(104256);
    case 400:
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(104256);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104242);
    super.onCreate(paramBundle);
    Kh();
    initView();
    AppMethodBeat.o(104242);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104249);
    g.RO().eJo.c(this.ekX);
    g.RO().eJo.b(519, this);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    super.onDestroy();
    AppMethodBeat.o(104249);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(104243);
    boolean bool;
    if (paramIntent.hasExtra("upgrade_success"))
    {
      bool = paramIntent.getBooleanExtra("upgrade_success", false);
      if (!bool)
        break label188;
      Kh();
      int i = paramIntent.getIntExtra("left_quota", 0);
      Kf();
      this.ekW.setVisibility(8);
      this.eht = i;
      if (this.eht <= 0)
        break label171;
      this.ekQ.setText(getString(2131302648, new Object[] { Integer.valueOf(this.eht) }));
      label95: if (!this.ela)
        this.ekU.setVisibility(0);
      this.ekU.setText(2131302645);
      AppMethodBeat.o(104243);
    }
    while (true)
    {
      return;
      if ((paramIntent.hasExtra("wizard_activity_result_code")) && (paramIntent.getIntExtra("wizard_activity_result_code", -1) == -1))
        Kg();
      if (paramIntent.hasExtra("announce_ok"))
        Kg();
      bool = false;
      break;
      label171: this.ekQ.setText(getString(2131302649));
      break label95;
      label188: AppMethodBeat.o(104243);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(104248);
    super.onPause();
    AppMethodBeat.o(104248);
  }

  public void onResume()
  {
    AppMethodBeat.i(104247);
    super.onResume();
    AppMethodBeat.o(104247);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(104257);
    ab.d("MicroMsg.RoomUpgradeProductsUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      h.a(this, getString(2131302647), getString(2131297061), false, new RoomUpgradeUI.6(this));
      AppMethodBeat.o(104257);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramm.getType() == 519))
    {
      paramString = (com.tencent.mm.chatroom.c.j)paramm;
      this.status = paramString.status;
      this.ehs = paramString.ehs;
      this.eht = paramString.eht;
      Kf();
      this.ekQ.setVisibility(0);
      this.ekW.setText(getString(2131302641));
      if (this.eht <= 0)
        break label285;
      this.ekQ.setText(getString(2131302648, new Object[] { Integer.valueOf(this.eht) }));
      label215: if (!this.ela)
        this.ekU.setVisibility(0);
      switch (this.status)
      {
      default:
      case 1:
      case 2:
      case 5:
      case 3:
      case 4:
      case 6:
      case 7:
      }
    }
    while (true)
    {
      AppMethodBeat.o(104257);
      break;
      label285: this.ekQ.setText(getString(2131302649));
      break label215;
      this.ekW.setVisibility(0);
      this.ekU.setText(2131302646);
      AppMethodBeat.o(104257);
      break;
      this.ekW.setVisibility(0);
      this.ekW.setEnabled(false);
      this.ekU.setText(2131302646);
      AppMethodBeat.o(104257);
      break;
      this.ekW.setVisibility(8);
      this.ekU.setText(2131302645);
      this.ekW.setEnabled(false);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeUI
 * JD-Core Version:    0.6.2
 */