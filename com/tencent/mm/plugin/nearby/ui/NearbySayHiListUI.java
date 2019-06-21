package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.nearby.a.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

public class NearbySayHiListUI extends MMActivity
  implements f
{
  private int ehD;
  private ListView gtT;
  private View gwR;
  private n.d jKa;
  private int limit;
  private c oPQ;
  private bg oQI;
  private NearbySayHiListUI.a oQJ;
  private int oQK;
  private int oQL;
  private boolean oQM;
  private long oQN;
  private com.tencent.mm.ui.base.p tipDialog;

  public NearbySayHiListUI()
  {
    AppMethodBeat.i(55513);
    this.oQI = null;
    this.limit = 0;
    this.oQK = 0;
    this.oQL = 0;
    this.ehD = 0;
    this.tipDialog = null;
    this.jKa = new NearbySayHiListUI.3(this);
    AppMethodBeat.o(55513);
  }

  public final int getLayoutId()
  {
    return 2130969931;
  }

  public final void initView()
  {
    AppMethodBeat.i(55519);
    this.gtT = ((ListView)findViewById(2131825251));
    if (!com.tencent.mm.bn.a.dgL())
    {
      localObject = getLayoutInflater().inflate(2130970536, null);
      ((View)localObject).setOnClickListener(new NearbySayHiListUI.1(this, (View)localObject));
      if ((this.oQK > 0) && (this.limit < this.oQK))
        this.gtT.addFooterView((View)localObject);
    }
    addTextOptionMenu(0, getString(2131296871), new NearbySayHiListUI.5(this));
    if (this.oQK == 0)
    {
      localObject = (TextView)findViewById(2131821807);
      ((TextView)localObject).setText(2131302720);
      ((TextView)localObject).setVisibility(0);
      enableOptionMenu(false);
    }
    if ((this.oQM) && (this.ehD != 0) && (this.oQL >= this.ehD) && (bo.gT(this)))
    {
      this.gwR = new CleanLocationHeaderView(this);
      this.gwR.setOnClickListener(new NearbySayHiListUI.6(this));
      this.gtT.addHeaderView(this.gwR);
    }
    this.oQJ = new NearbySayHiListUI.a(this, this, this.oQI, this.limit);
    this.oQJ.setGetViewPositionCallback(new NearbySayHiListUI.7(this));
    this.oQJ.setPerformItemClickListener(new NearbySayHiListUI.8(this));
    this.oQJ.a(new NearbySayHiListUI.9(this));
    this.gtT.setAdapter(this.oQJ);
    Object localObject = new com.tencent.mm.ui.tools.j(this);
    this.gtT.setOnItemLongClickListener(new NearbySayHiListUI.10(this, (com.tencent.mm.ui.tools.j)localObject));
    this.gtT.setOnItemClickListener(new NearbySayHiListUI.11(this));
    setBackBtn(new NearbySayHiListUI.12(this));
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(55494);
        BackwardSupportUtil.c.a(NearbySayHiListUI.d(NearbySayHiListUI.this));
        AppMethodBeat.o(55494);
      }
    };
    AppMethodBeat.o(55519);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(55521);
    setResult(0);
    super.onBackPressed();
    AppMethodBeat.o(55521);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55514);
    super.onCreate(paramBundle);
    this.ehD = bo.ank(com.tencent.mm.m.g.Nu().getValue("ThresholdToCleanLocation"));
    this.oQM = getIntent().getBooleanExtra("show_clear_header", false);
    com.tencent.mm.kernel.g.RN().QU();
    this.oQI = ((bg)((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOo());
    setMMTitle(2131302717);
    this.oQL = this.oQI.baS();
    this.oQK = this.oQI.getCount();
    int i;
    if (com.tencent.mm.bn.a.dgL())
      i = this.oQK;
    while (true)
    {
      this.limit = i;
      paramBundle = this.oQI;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(4));
      if (paramBundle.bSd.update(paramBundle.getTableName(), localContentValues, "status!=? ", new String[] { "4" }) != 0)
        paramBundle.doNotify();
      initView();
      AppMethodBeat.o(55514);
      return;
      if (this.oQL == 0)
        i = 8;
      else
        i = this.oQL;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(55520);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = (bf)this.oQJ.getItem(paramView.position);
    if (paramContextMenuInfo == null)
    {
      ab.e("MicroMsg.SayHiListUI", "onItemLongClick, item is null, pos = " + paramView.position);
      AppMethodBeat.o(55520);
    }
    while (true)
    {
      return;
      paramContextMenu.add(0, 0, 0, 2131296881);
      this.oQN = paramContextMenuInfo.field_svrid;
      AppMethodBeat.o(55520);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55516);
    this.oQJ.bIf();
    super.onDestroy();
    AppMethodBeat.o(55516);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(55518);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(55518);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(55517);
    com.tencent.mm.kernel.g.Rg().b(148, this);
    super.onPause();
    AppMethodBeat.o(55517);
  }

  public void onResume()
  {
    AppMethodBeat.i(55515);
    super.onResume();
    if (this.oQK != this.oQI.getCount())
    {
      this.oQK = this.oQI.getCount();
      if (this.oQK == 0)
      {
        TextView localTextView = (TextView)findViewById(2131821807);
        localTextView.setText(2131302720);
        localTextView.setVisibility(0);
        enableOptionMenu(false);
      }
      this.oQJ.KC();
    }
    this.oQJ.notifyDataSetChanged();
    com.tencent.mm.kernel.g.Rg().a(148, this);
    AppMethodBeat.o(55515);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(55522);
    ab.i("MicroMsg.SayHiListUI", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (((c)paramm).Ah() != 2)
        break label126;
      h.a(this.mController.ylL, getString(2131301617), "", new NearbySayHiListUI.4(this));
      this.oPQ = null;
      AppMethodBeat.o(55522);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.SayHiListUI", "[cpan] clear location failed.");
      label126: AppMethodBeat.o(55522);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI
 * JD-Core Version:    0.6.2
 */