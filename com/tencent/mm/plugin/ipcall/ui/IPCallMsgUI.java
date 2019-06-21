package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.g;
import com.tencent.mm.plugin.ipcall.a.g.h;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;

public class IPCallMsgUI extends MMActivity
{
  private View kmT;
  private boolean kmU;
  private ListView nDp;
  private IPCallMsgUI.a nDq;
  private View nDr;
  private k.a nDs;

  public IPCallMsgUI()
  {
    AppMethodBeat.i(22205);
    this.kmU = true;
    this.nDs = new IPCallMsgUI.7(this);
    AppMethodBeat.o(22205);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969899;
  }

  public final void initView()
  {
    AppMethodBeat.i(22208);
    setMMTitle(2131300807);
    this.nDr = findViewById(2131825166);
    this.nDp = ((ListView)findViewById(2131825165));
    this.kmT = v.hu(this).inflate(2130970112, null);
    this.nDp.addFooterView(this.kmT);
    this.nDq = new IPCallMsgUI.a(this, this, new g());
    this.nDq.setGetViewPositionCallback(new IPCallMsgUI.1(this));
    this.nDq.setPerformItemClickListener(new IPCallMsgUI.2(this));
    this.nDq.a(new IPCallMsgUI.3(this));
    this.nDp.setAdapter(this.nDq);
    this.nDp.setOnItemClickListener(new IPCallMsgUI.4(this));
    this.nDp.setOnScrollListener(new IPCallMsgUI.5(this));
    if (this.nDq.getCount() == 0)
    {
      this.nDp.setVisibility(8);
      this.nDr.setVisibility(0);
      enableOptionMenu(false);
    }
    while (true)
    {
      if (this.nDq.bdn())
        this.nDp.removeFooterView(this.kmT);
      setBackBtn(new IPCallMsgUI.6(this));
      if (this.nDq.bdn())
        this.nDp.removeFooterView(this.kmT);
      AppMethodBeat.o(22208);
      return;
      this.nDp.setVisibility(0);
      this.nDr.setVisibility(8);
      enableOptionMenu(true);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22206);
    super.onCreate(paramBundle);
    i.bHz().c(this.nDs);
    initView();
    AppMethodBeat.o(22206);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22207);
    ab.d("MicroMsg.IPCallMsgUI", "msgui onDestroy");
    i.bHz().d(this.nDs);
    this.nDq.bIf();
    h localh = i.bHz();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("isRead", Short.valueOf((short)1));
    localh.bSd.update(localh.getTableName(), localContentValues, "isRead!=? ", new String[] { "1" });
    super.onDestroy();
    AppMethodBeat.o(22207);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI
 * JD-Core Version:    0.6.2
 */