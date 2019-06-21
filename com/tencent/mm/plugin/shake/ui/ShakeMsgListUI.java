package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.j;

public class ShakeMsgListUI extends MMActivity
{
  private int from;
  private n.d jKa;
  private long jvz;
  private TextView kFs;
  private int limit;
  private int mType;
  private int oQK;
  private int oQL;
  private g quO;
  private d quP;
  private ListView quQ;

  public ShakeMsgListUI()
  {
    AppMethodBeat.i(24758);
    this.quO = null;
    this.limit = 0;
    this.oQK = 0;
    this.oQL = 0;
    this.jKa = new ShakeMsgListUI.6(this);
    AppMethodBeat.o(24758);
  }

  private void ckB()
  {
    AppMethodBeat.i(24764);
    this.kFs.setText(2131303438);
    this.kFs.setVisibility(0);
    enableOptionMenu(false);
    AppMethodBeat.o(24764);
  }

  public final int getLayoutId()
  {
    return 2130970656;
  }

  public final void initView()
  {
    AppMethodBeat.i(24762);
    setMMTitle(getIntent().getStringExtra("shake_msg_list_title"));
    setBackBtn(new ShakeMsgListUI.1(this));
    addTextOptionMenu(0, getString(2131296871), new ShakeMsgListUI.2(this));
    this.kFs = ((TextView)findViewById(2131821807));
    if (this.oQK == 0)
      ckB();
    this.quQ = ((ListView)findViewById(2131827486));
    Object localObject = getLayoutInflater().inflate(2130970536, null);
    ((View)localObject).setOnClickListener(new ShakeMsgListUI.3(this, (View)localObject));
    if ((this.oQK > 0) && (this.limit < this.oQK))
      this.quQ.addFooterView((View)localObject);
    this.quP = new d(this);
    this.quP.quL = this.limit;
    this.quQ.setAdapter(this.quP);
    this.quQ.setOnItemClickListener(new ShakeMsgListUI.4(this));
    localObject = new j(this);
    this.quQ.setOnItemLongClickListener(new ShakeMsgListUI.5(this, (j)localObject));
    AppMethodBeat.o(24762);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24759);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("shake_msg_type", 0);
    this.quO = m.cjT();
    this.oQL = this.quO.baS();
    int i;
    if (this.oQL == 0)
    {
      i = 8;
      this.limit = i;
      this.oQK = this.quO.getCount();
      this.from = getIntent().getIntExtra("shake_msg_from", 1);
      if (this.from != 1)
        break label190;
      h.pYm.e(11313, new Object[] { Integer.valueOf(this.oQL), e.ckT() });
    }
    while (true)
    {
      paramBundle = this.quO;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(1));
      paramBundle.bSd.update(paramBundle.getTableName(), localContentValues, "status!=? ", new String[] { "1" });
      initView();
      AppMethodBeat.o(24759);
      return;
      i = this.oQL;
      break;
      label190: h.pYm.e(11315, new Object[] { Integer.valueOf(this.oQL), e.ckT() });
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(24763);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.jvz = ((f)this.quP.getItem(paramView.position)).field_svrid;
    paramContextMenu.add(paramView.position, 0, 0, 2131296881);
    AppMethodBeat.o(24763);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24761);
    this.quP.bIf();
    super.onDestroy();
    AppMethodBeat.o(24761);
  }

  public void onResume()
  {
    AppMethodBeat.i(24760);
    super.onResume();
    if (this.oQK != this.quO.getCount())
    {
      this.oQK = this.quO.getCount();
      if (this.oQK == 0)
        ckB();
      this.quP.KC();
    }
    this.quP.notifyDataSetChanged();
    AppMethodBeat.o(24760);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI
 * JD-Core Version:    0.6.2
 */