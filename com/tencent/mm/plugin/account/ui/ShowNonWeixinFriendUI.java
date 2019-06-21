package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.MMActivity;

public class ShowNonWeixinFriendUI extends MMActivity
  implements d.a
{
  private long gIk = 0L;
  private String gIl = "";

  public final int getLayoutId()
  {
    return 2130969486;
  }

  public final void initView()
  {
    AppMethodBeat.i(125594);
    ImageView localImageView = (ImageView)findViewById(2131823851);
    TextView localTextView1 = (TextView)findViewById(2131823852);
    TextView localTextView2 = (TextView)findViewById(2131823853);
    localImageView.setBackgroundDrawable(a.g(this, 2131231186));
    localImageView.setImageBitmap(b.pS(this.gIk));
    localTextView1.setText(this.gIl);
    localTextView2.setText(getString(2131300637, new Object[] { this.gIl }));
    setBackBtn(new ShowNonWeixinFriendUI.1(this));
    ((Button)findViewById(2131823854)).setOnClickListener(new ShowNonWeixinFriendUI.2(this));
    AppMethodBeat.o(125594);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125591);
    super.onCreate(paramBundle);
    setMMTitle(2131300639);
    this.gIk = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.gIl = getIntent().getStringExtra("Contact_KFacebookName");
    initView();
    AppMethodBeat.o(125591);
  }

  public void onPause()
  {
    AppMethodBeat.i(125592);
    super.onPause();
    o.acd().e(this);
    AppMethodBeat.o(125592);
  }

  public void onResume()
  {
    AppMethodBeat.i(125593);
    super.onResume();
    o.acd().d(this);
    AppMethodBeat.o(125593);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(125595);
    initView();
    AppMethodBeat.o(125595);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShowNonWeixinFriendUI
 * JD-Core Version:    0.6.2
 */