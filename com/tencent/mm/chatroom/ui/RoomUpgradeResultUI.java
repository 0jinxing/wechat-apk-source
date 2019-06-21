package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;

@Deprecated
public class RoomUpgradeResultUI extends MMActivity
{
  private String chatroomName;
  private u eih;
  private Button ekL;
  private View ekM;
  private ImageView ekN;
  private TextView ekO;
  private TextView ekP;
  private TextView ekQ;

  private void Kf()
  {
    AppMethodBeat.i(104228);
    this.ekL.setVisibility(0);
    kk(this.eih.field_roomowner);
    int i = this.eih.drW();
    this.ekP.setVisibility(0);
    this.ekP.setText(getString(2131302650, new Object[] { Integer.valueOf(i) }));
    AppMethodBeat.o(104228);
  }

  private void cu()
  {
    AppMethodBeat.i(104227);
    Kf();
    this.ekL.setText(2131302645);
    this.ekQ.setVisibility(8);
    AppMethodBeat.o(104227);
  }

  private void goBack()
  {
    AppMethodBeat.i(104232);
    Intent localIntent = new Intent(this, RoomUpgradeUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("finish_self", true);
    startActivity(localIntent);
    AppMethodBeat.o(104232);
  }

  private void kk(String paramString)
  {
    AppMethodBeat.i(104229);
    ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
    if ((localad != null) && ((int)localad.ewQ <= 0))
    {
      ao.a.flu.a(paramString, this.chatroomName, new RoomUpgradeResultUI.3(this, paramString));
      AppMethodBeat.o(104229);
    }
    while (true)
    {
      return;
      kl(paramString);
      AppMethodBeat.o(104229);
    }
  }

  private void kl(String paramString)
  {
    AppMethodBeat.i(104230);
    Object localObject = ((j)g.K(j.class)).XM().aoO(paramString);
    if ((localObject != null) && ((int)((a)localObject).ewQ > 0))
    {
      localObject = ((ad)localObject).Oi();
      a.b.b(this.ekN, paramString);
      this.ekO.setVisibility(0);
      this.ekO.setText((CharSequence)localObject);
      AppMethodBeat.o(104230);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(104230);
    }
  }

  public final int getLayoutId()
  {
    return 2130969010;
  }

  public final void initView()
  {
    AppMethodBeat.i(104226);
    setMMTitle(2131302642);
    setBackBtn(new RoomUpgradeResultUI.1(this));
    this.ekM = findViewById(2131822367);
    this.ekN = ((ImageView)findViewById(2131822368));
    this.ekO = ((TextView)findViewById(2131822369));
    this.ekP = ((TextView)findViewById(2131822371));
    this.ekQ = ((TextView)findViewById(2131822373));
    this.ekL = ((Button)findViewById(2131822374));
    this.ekL.setOnClickListener(new RoomUpgradeResultUI.2(this));
    cu();
    AppMethodBeat.o(104226);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104224);
    super.onCreate(paramBundle);
    this.chatroomName = getIntent().getStringExtra("chatroom");
    ab.i("MicroMsg.RoomUpgradeResultUI", "the roomName is %s", new Object[] { this.chatroomName });
    this.eih = ((c)g.K(c.class)).XV().oa(this.chatroomName);
    if (this.eih == null)
      goBack();
    initView();
    AppMethodBeat.o(104224);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104225);
    super.onDestroy();
    AppMethodBeat.o(104225);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(104231);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(104231);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(104231);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeResultUI
 * JD-Core Version:    0.6.2
 */