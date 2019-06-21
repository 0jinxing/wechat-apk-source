package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r.a;
import com.tencent.mm.storage.r.b;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.b.a;

public class BizTimeLineNewMsgUI extends MMActivity
  implements h
{
  private TextView emptyTipTv;
  private int fromScene;
  private ListView gGW;
  private int jLX;
  private int jLY;
  private a jMO;
  View jNV;
  ProgressBar jNW;
  TextView jNX;
  private View jNY;
  private e jNZ;
  private q jOa;
  private n.d jOb;

  public BizTimeLineNewMsgUI()
  {
    AppMethodBeat.i(14163);
    this.fromScene = 1;
    this.jLX = 0;
    this.jLY = 0;
    this.jOb = new BizTimeLineNewMsgUI.7(this);
    AppMethodBeat.o(14163);
  }

  public final void aWv()
  {
    AppMethodBeat.i(14165);
    if (this.jNZ != null)
      this.jNZ.notifyDataSetChanged();
    AppMethodBeat.o(14165);
  }

  public final int getLayoutId()
  {
    return 2130968868;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(14164);
    super.onCreate(paramBundle);
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131297659);
    setMMTitle(getString(2131297678));
    this.fromScene = getIntent().getIntExtra("biz_time_line_line_enter_scene", 1);
    if (this.fromScene == 1);
    for (paramBundle = t.p(z.aeY().fni.query("BizTimeLineSingleMsgInfo", null, "status!=?", new String[] { "4" }, null, null, "createTime DESC ")); ; paramBundle = t.p(z.aeY().fni.query("BizTimeLineSingleMsgInfo", null, null, null, null, null, "createTime DESC limit 20")))
    {
      this.jNZ = new e(this, paramBundle, this.fromScene);
      this.gGW = ((ListView)findViewById(2131821847));
      paramBundle = this.gGW;
      this.jNV = getLayoutInflater().inflate(2130968860, null);
      this.jNW = ((ProgressBar)this.jNV.findViewById(2131821811));
      this.jNX = ((TextView)this.jNV.findViewById(2131821812));
      this.jNY = this.jNV.findViewById(2131821810);
      paramBundle.addFooterView(this.jNV);
      this.gGW.setAdapter(this.jNZ);
      this.gGW.setFooterDividersEnabled(false);
      this.gGW.setOnScrollListener(new BizTimeLineNewMsgUI.2(this));
      this.gGW.setOnItemClickListener(new BizTimeLineNewMsgUI.3(this));
      this.gGW.setEmptyView(this.emptyTipTv);
      if ((this.fromScene == 1) && (this.jNV != null))
      {
        this.jNW.setVisibility(8);
        this.jNX.setText(getString(2131297677));
        this.jNV.setBackgroundResource(2130837926);
        this.jNY.setVisibility(0);
        this.jNV.setOnClickListener(new BizTimeLineNewMsgUI.6(this));
      }
      this.gGW.setOnTouchListener(new BizTimeLineNewMsgUI.4(this));
      this.jMO = new a(this);
      this.gGW.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(14160);
          BizTimeLineNewMsgUI.a(BizTimeLineNewMsgUI.this, BizTimeLineNewMsgUI.a(BizTimeLineNewMsgUI.this).sg(paramAnonymousInt));
          BizTimeLineNewMsgUI.e(BizTimeLineNewMsgUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, BizTimeLineNewMsgUI.this, BizTimeLineNewMsgUI.b(BizTimeLineNewMsgUI.this), BizTimeLineNewMsgUI.c(BizTimeLineNewMsgUI.this), BizTimeLineNewMsgUI.d(BizTimeLineNewMsgUI.this));
          AppMethodBeat.o(14160);
          return true;
        }
      });
      setBackBtn(new BizTimeLineNewMsgUI.1(this));
      xE(-1052684);
      AppMethodBeat.o(14164);
      return;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(14169);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenu.add(0, 1, 0, 2131297654);
    AppMethodBeat.o(14169);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(14166);
    super.onDestroy();
    Object localObject = this.jNZ;
    z.aeY().a(((e)localObject).jKp);
    t localt = z.aeY();
    localt.fni.hY("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set status = 4 where status != 4");
    localObject = new r.a();
    ((r.a)localObject).xId = r.b.xIh;
    localt.a((r.a)localObject);
    AppMethodBeat.o(14166);
  }

  public void onPause()
  {
    AppMethodBeat.i(14168);
    super.onPause();
    AppMethodBeat.o(14168);
  }

  public void onResume()
  {
    AppMethodBeat.i(14167);
    super.onResume();
    AppMethodBeat.o(14167);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI
 * JD-Core Version:    0.6.2
 */