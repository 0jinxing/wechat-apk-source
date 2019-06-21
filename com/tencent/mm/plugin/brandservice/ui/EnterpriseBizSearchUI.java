package com.tencent.mm.plugin.brandservice.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.ui.b;
import com.tencent.mm.modelvoiceaddr.ui.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.tools.o;

@a(3)
public class EnterpriseBizSearchUI extends MMActivity
  implements b.a, EnterpriseBizContactListView.b
{
  private b jLK;
  private EnterpriseBizContactListView jLP;
  private String jMp;

  private void aWh()
  {
    AppMethodBeat.i(14005);
    if (bo.isNullOrNil(this.jMp))
    {
      this.jMp = getIntent().getStringExtra("enterprise_biz_name");
      if (bo.isNullOrNil(this.jMp))
        finish();
    }
    AppMethodBeat.o(14005);
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
  }

  public final boolean aWe()
  {
    AppMethodBeat.i(14014);
    aqX();
    AppMethodBeat.o(14014);
    return false;
  }

  public final void amJ()
  {
    AppMethodBeat.i(14010);
    aqX();
    AppMethodBeat.o(14010);
  }

  public final void apo()
  {
    AppMethodBeat.i(14007);
    finish();
    AppMethodBeat.o(14007);
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final int getLayoutId()
  {
    return 2130969399;
  }

  public final void initView()
  {
    AppMethodBeat.i(14006);
    aWh();
    this.jLP = ((EnterpriseBizContactListView)findViewById(2131821896));
    this.jLP.setFatherBizName(this.jMp);
    this.jLP.setExcludeBizChat(true);
    this.jLP.refresh();
    this.jLP.setMode(1);
    this.jLP.aWg();
    this.jLP.dAH();
    this.jLP.ql(false);
    this.jLP.setOnTouchListener(this);
    ((TextView)this.jLP.getNoResultView()).setText(2131299231);
    this.jLK = new b();
    this.jLK.qQ(true);
    this.jLK.a(this);
    this.jLK.gcl = false;
    AppMethodBeat.o(14006);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(14003);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(14003);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(14012);
    this.jLK.a(this, paramMenu);
    AppMethodBeat.o(14012);
    return true;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(14004);
    super.onDestroy();
    if (this.jLP != null)
      EnterpriseBizContactListView.release();
    AppMethodBeat.o(14004);
  }

  public void onPause()
  {
    AppMethodBeat.i(14011);
    super.onPause();
    this.jLK.cancel();
    this.jLK.clearFocus();
    AppMethodBeat.o(14011);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(14013);
    this.jLK.a(this, paramMenu);
    AppMethodBeat.o(14013);
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(14009);
    aqX();
    AppMethodBeat.o(14009);
    return true;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(14008);
    ab.i("MicroMsg.EnterpriseBizSearchUI", "search biz, key word : %s", new Object[] { paramString });
    this.jLP.aqS(paramString);
    AppMethodBeat.o(14008);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizSearchUI
 * JD-Core Version:    0.6.2
 */