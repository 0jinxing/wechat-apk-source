package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.j;

public class ShakeSayHiListUI extends MMActivity
{
  private ListView gtT;
  private n.d jKa;
  private long jvz;
  private int limit;
  private int oQK;
  private int oQL;
  private bu qui;
  private int qwr;
  private b qws;

  public ShakeSayHiListUI()
  {
    AppMethodBeat.i(24884);
    this.qwr = 0;
    this.qui = null;
    this.limit = 0;
    this.oQK = 0;
    this.oQL = 0;
    this.jKa = new ShakeSayHiListUI.2(this);
    AppMethodBeat.o(24884);
  }

  public final int getLayoutId()
  {
    return 2130969931;
  }

  public final void initView()
  {
    AppMethodBeat.i(24890);
    View localView = getLayoutInflater().inflate(2130970536, null);
    this.gtT = ((ListView)findViewById(2131825251));
    localView.setOnClickListener(new ShakeSayHiListUI.1(this, localView));
    addTextOptionMenu(0, getString(2131296871), new ShakeSayHiListUI.3(this));
    if (this.oQK == 0)
    {
      localObject = (TextView)findViewById(2131821807);
      ((TextView)localObject).setText(2131302720);
      ((TextView)localObject).setVisibility(0);
      enableOptionMenu(false);
    }
    if ((this.oQK > 0) && (this.limit < this.oQK))
      this.gtT.addFooterView(localView);
    this.qws = new b(this, this.qui, this.limit);
    this.qws.setGetViewPositionCallback(new ShakeSayHiListUI.4(this));
    this.qws.setPerformItemClickListener(new ShakeSayHiListUI.5(this));
    this.qws.a(new ShakeSayHiListUI.6(this));
    this.gtT.setAdapter(this.qws);
    this.gtT.setOnItemClickListener(new ShakeSayHiListUI.7(this));
    Object localObject = new j(this);
    this.gtT.setOnItemLongClickListener(new ShakeSayHiListUI.8(this, (j)localObject));
    setBackBtn(new ShakeSayHiListUI.9(this));
    new ShakeSayHiListUI.10(this);
    AppMethodBeat.o(24890);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24885);
    super.onCreate(paramBundle);
    this.qwr = getIntent().getIntExtra("IntentSayHiType", 1);
    if (this.qwr == 1)
    {
      this.qui = d.akR();
      setMMTitle(2131302719);
      this.oQL = this.qui.baS();
      if (this.oQL != 0)
        break label160;
    }
    label160: for (int i = 8; ; i = this.oQL)
    {
      this.limit = i;
      this.oQK = this.qui.getCount();
      paramBundle = this.qui;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(4));
      if (paramBundle.bSd.update(paramBundle.getTableName(), localContentValues, "status!=? ", new String[] { "4" }) != 0)
        paramBundle.doNotify();
      initView();
      AppMethodBeat.o(24885);
      return;
      setMMTitle(2131302717);
      break;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(24891);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.jvz = ((bt)this.qws.getItem(paramView.position)).field_svrid;
    paramContextMenu.add(paramView.position, 0, 0, 2131296881);
    AppMethodBeat.o(24891);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24887);
    this.qws.bIf();
    super.onDestroy();
    AppMethodBeat.o(24887);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(24889);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(24889);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(24888);
    super.onPause();
    if (this.qws.jJR != null)
      this.qws.jJR.bIp();
    AppMethodBeat.o(24888);
  }

  public void onResume()
  {
    AppMethodBeat.i(24886);
    super.onResume();
    if (this.oQK != this.qui.getCount())
    {
      this.oQK = this.qui.getCount();
      if (this.oQK == 0)
      {
        TextView localTextView = (TextView)findViewById(2131821807);
        localTextView.setText(2131302720);
        localTextView.setVisibility(0);
        enableOptionMenu(false);
      }
      this.qws.KC();
    }
    this.qws.notifyDataSetChanged();
    AppMethodBeat.o(24886);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI
 * JD-Core Version:    0.6.2
 */