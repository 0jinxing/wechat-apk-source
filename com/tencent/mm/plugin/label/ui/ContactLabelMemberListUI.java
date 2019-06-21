package com.tencent.mm.plugin.label.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class ContactLabelMemberListUI extends MMActivity
{
  private TextView juy;
  private ak mHandler;
  private n.b nIg;
  private ListView nIv;
  private a nIw;
  private String nIx;
  private String nIy;

  public ContactLabelMemberListUI()
  {
    AppMethodBeat.i(22644);
    this.mHandler = new ContactLabelMemberListUI.1(this);
    this.nIg = new ContactLabelMemberListUI.2(this);
    AppMethodBeat.o(22644);
  }

  private void bJk()
  {
    AppMethodBeat.i(22650);
    if (this.nIw != null)
    {
      this.nIw.nIr = com.tencent.mm.plugin.label.a.a.bJa().PH(this.nIx);
      this.nIw.a(null, null);
    }
    this.nIy = com.tencent.mm.plugin.label.a.a.bJa().PD(this.nIx);
    if (!bo.isNullOrNil(this.nIy))
      setMMTitle(this.nIy);
    AppMethodBeat.o(22650);
  }

  public final int getLayoutId()
  {
    return 2130969229;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22649);
    ab.i("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] onActivity result. requestcode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
      ab.e("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] onActivity result. unknow requestcode:%d", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(22649);
    case 10001:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        finish();
        AppMethodBeat.o(22649);
      }
      else
      {
        bJk();
        AppMethodBeat.o(22649);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22645);
    super.onCreate(paramBundle);
    this.nIx = getIntent().getStringExtra("label_id");
    this.nIy = getIntent().getStringExtra("label_name");
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(22641);
        ContactLabelMemberListUI.this.finish();
        AppMethodBeat.o(22641);
        return false;
      }
    });
    addTextOptionMenu(0, getString(2131300887), new ContactLabelMemberListUI.4(this));
    setMMTitle(this.nIy);
    this.nIv = ((ListView)findViewById(2131823069));
    this.juy = ((TextView)findViewById(2131821749));
    if (bo.isNullOrNil(this.nIx))
    {
      ab.e("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] inite view");
      finish();
    }
    this.nIw = new a(this.mController.ylL);
    this.nIv.setAdapter(this.nIw);
    this.nIv.setOnItemClickListener(new ContactLabelMemberListUI.5(this));
    this.nIv.setEmptyView(this.juy);
    AppMethodBeat.o(22645);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22648);
    if (this.nIw != null)
    {
      this.nIw.bIf();
      this.nIw.dww();
    }
    super.onDestroy();
    AppMethodBeat.o(22648);
  }

  public void onPause()
  {
    AppMethodBeat.i(22647);
    aw.ZK();
    c.XM().b(this.nIg);
    super.onPause();
    AppMethodBeat.o(22647);
  }

  public void onResume()
  {
    AppMethodBeat.i(22646);
    aw.ZK();
    c.XM().a(this.nIg);
    super.onResume();
    bJk();
    AppMethodBeat.o(22646);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelMemberListUI
 * JD-Core Version:    0.6.2
 */