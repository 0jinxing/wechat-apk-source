package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bc.c.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;

public class ContactRemarkInfoViewUI extends MMActivity
{
  private String bCv;
  private String dul;
  private ad ehM;
  private String fNa;
  private int gwP;
  private String username;
  private TextView zlF;
  private TextView zlG;
  private ImageView zlJ;
  private boolean zlP = false;
  private View zmj;
  private View zmk;

  private void Kh()
  {
    AppMethodBeat.i(33695);
    aw.ZK();
    this.ehM = com.tencent.mm.model.c.XM().aoO(this.username);
    this.bCv = this.ehM.Oj();
    this.dul = this.ehM.dul;
    this.fNa = this.ehM.dum;
    AppMethodBeat.o(33695);
  }

  private void dHJ()
  {
    AppMethodBeat.i(33697);
    com.tencent.mm.bc.c.aiB();
    Bitmap localBitmap = com.tencent.mm.bc.c.sZ(this.username);
    if (localBitmap != null)
    {
      this.zlJ.setImageBitmap(localBitmap);
      this.zlP = true;
    }
    AppMethodBeat.o(33697);
  }

  public final int getLayoutId()
  {
    return 2130969236;
  }

  public final void initView()
  {
    AppMethodBeat.i(33696);
    this.zlF = ((TextView)findViewById(2131823120));
    this.zlG = ((TextView)findViewById(2131823130));
    this.zlJ = ((ImageView)findViewById(2131823133));
    this.zmj = findViewById(2131823134);
    this.zmk = findViewById(2131823135);
    setMMTitle(2131298590);
    this.zlJ.setOnClickListener(new ContactRemarkInfoViewUI.1(this));
    addTextOptionMenu(0, getString(2131296894), new ContactRemarkInfoViewUI.2(this));
    setBackBtn(new ContactRemarkInfoViewUI.3(this));
    AppMethodBeat.o(33696);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33692);
    super.onCreate(paramBundle);
    this.gwP = getIntent().getIntExtra("Contact_Scene", 9);
    this.username = getIntent().getStringExtra("Contact_User");
    if (ah.isNullOrNil(this.username))
    {
      finish();
      AppMethodBeat.o(33692);
    }
    while (true)
    {
      return;
      Kh();
      initView();
      AppMethodBeat.o(33692);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33694);
    super.onDestroy();
    AppMethodBeat.o(33694);
  }

  public void onResume()
  {
    AppMethodBeat.i(33693);
    super.onResume();
    Kh();
    this.zlF.setText(j.b(this, ah.nullAsNil(this.bCv), this.zlF.getTextSize()));
    if (!ah.isNullOrNil(this.dul))
    {
      this.zmj.setVisibility(0);
      this.zlG.setText(ah.nullAsNil(this.dul));
      if (ah.isNullOrNil(this.fNa))
        break label154;
      this.zmk.setVisibility(0);
      com.tencent.mm.bc.c.aiB();
      if (com.tencent.mm.bc.c.sX(this.username))
        break label142;
      com.tencent.mm.bc.c.aiB().a(this.username, this.fNa, new c.a()
      {
        public final void cP(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(33691);
          ContactRemarkInfoViewUI.f(ContactRemarkInfoViewUI.this).post(new ContactRemarkInfoViewUI.4.1(this, paramAnonymousBoolean));
          AppMethodBeat.o(33691);
        }
      });
      AppMethodBeat.o(33693);
    }
    while (true)
    {
      return;
      this.zmj.setVisibility(8);
      break;
      label142: dHJ();
      AppMethodBeat.o(33693);
      continue;
      label154: this.zmk.setVisibility(8);
      AppMethodBeat.o(33693);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoViewUI
 * JD-Core Version:    0.6.2
 */