package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import java.util.Map;

public class NewBizConversationUI extends MMActivity
{
  private ak conversation;
  private int ctE;
  private int cvd;
  private TextView emptyTipTv;
  private String fuO;
  private boolean isDeleteCancel;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private long jOA;
  private com.tencent.mm.sdk.b.c jOJ;
  private n.d jOb;
  private String talker;
  private p tipDialog;
  private ListView zqO;
  private String zqQ;
  private NewBizConversationUI.a zvk;
  private final int zvl;

  public NewBizConversationUI()
  {
    AppMethodBeat.i(34558);
    this.cvd = 1;
    this.talker = "";
    this.jOA = 0L;
    this.jLX = 0;
    this.jLY = 0;
    this.zvl = 1;
    this.tipDialog = null;
    this.isDeleteCancel = false;
    this.jOb = new NewBizConversationUI.9(this);
    this.jOJ = new NewBizConversationUI.10(this);
    AppMethodBeat.o(34558);
  }

  private void initActionBar()
  {
    AppMethodBeat.i(34560);
    xE(-1052684);
    setMMTitle(this.zqQ);
    ta(-16777216);
    setBackBtn(new NewBizConversationUI.12(this), 2131230737);
    setTitleBarDoubleClickListener(new NewBizConversationUI.13(this));
    AppMethodBeat.o(34560);
  }

  public final int getLayoutId()
  {
    return 2130970930;
  }

  public final void initView()
  {
    AppMethodBeat.i(34564);
    initActionBar();
    this.zqO = ((ListView)findViewById(2131823620));
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131299203);
    this.zvk = new NewBizConversationUI.a(this, this.fuO, new NewBizConversationUI.15(this));
    this.zvk.setGetViewPositionCallback(new NewBizConversationUI.16(this));
    this.zvk.setPerformItemClickListener(new NewBizConversationUI.17(this));
    this.zqO.setAdapter(this.zvk);
    this.jMO = new com.tencent.mm.ui.widget.b.a(this);
    this.zqO.setOnItemClickListener(new NewBizConversationUI.18(this));
    this.zqO.setOnTouchListener(new NewBizConversationUI.2(this));
    this.zqO.setOnItemLongClickListener(new NewBizConversationUI.3(this));
    this.zvk.setGetViewPositionCallback(new NewBizConversationUI.4(this));
    this.zvk.setPerformItemClickListener(new NewBizConversationUI.5(this));
    this.zvk.a(new NewBizConversationUI.6(this));
    AppMethodBeat.o(34564);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(34565);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((this.talker != null) && (!this.talker.isEmpty()))
      this.talker = "";
    if (paramInt2 != -1)
      AppMethodBeat.o(34565);
    while (true)
    {
      return;
      AppMethodBeat.o(34565);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34559);
    super.onCreate(paramBundle);
    if (!aw.RK())
    {
      ab.e("MicroMsg.NewBizConversationUI", "onCreate acc not ready!!!");
      finish();
      AppMethodBeat.o(34559);
      return;
    }
    this.ctE = getIntent().getIntExtra("biz_time_line_line_session_id", 0);
    this.cvd = getIntent().getIntExtra("biz_enter_source", 1);
    this.fuO = "officialaccounts";
    h.pYm.e(11404, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(this.ctE), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)), Integer.valueOf(this.cvd) });
    this.zqQ = getIntent().getStringExtra("enterprise_biz_display_name");
    if (bo.isNullOrNil(this.zqQ))
      this.zqQ = getString(2131297643);
    initView();
    paramBundle = com.tencent.mm.model.c.c.abi().ll("100045");
    if ((paramBundle.isValid()) && ("1".equals(paramBundle.dru().get("isOpenSearch"))));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.NewBizConversationUI", "open search entrance:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        addIconOptionMenu(1, 2131304082, 2131230741, new NewBizConversationUI.1(this));
      b(getString(2131297678), 2131230740, new NewBizConversationUI.11(this));
      aw.ZK();
      com.tencent.mm.model.c.XR().a(this.zvk);
      this.jOA = System.currentTimeMillis();
      com.tencent.mm.sdk.b.a.xxA.c(this.jOJ);
      AppMethodBeat.o(34559);
      break;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(34566);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    aw.ZK();
    ad localad = com.tencent.mm.model.c.XM().aoO(this.talker);
    if (localad == null)
    {
      ab.e("MicroMsg.NewBizConversationUI", "onCreateContextMenu, contact is null, talker = " + this.talker);
      AppMethodBeat.o(34566);
      return;
    }
    String str = localad.Oj();
    paramView = str;
    if (str.toLowerCase().endsWith("@chatroom"))
    {
      paramView = str;
      if (bo.isNullOrNil(localad.field_nickname))
        paramView = getString(2131298223);
    }
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenu.setHeaderTitle(j.b(this, paramView));
    if (com.tencent.mm.n.a.jh(localad.field_type))
    {
      if (!localad.Oe())
        break label207;
      paramContextMenu.add(paramContextMenuInfo.position, 1, 0, 2131297642);
    }
    while (true)
    {
      paramContextMenu.add(paramContextMenuInfo.position, 2, 0, 2131301280);
      paramContextMenu.add(paramContextMenuInfo.position, 3, 0, 2131301288);
      AppMethodBeat.o(34566);
      break;
      label207: paramContextMenu.add(paramContextMenuInfo.position, 1, 0, 2131297641);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34561);
    aw.RS().aa(new NewBizConversationUI.14(this));
    com.tencent.mm.sdk.b.a.xxA.d(this.jOJ);
    if (aw.RK())
    {
      aw.ZK();
      com.tencent.mm.model.c.XR().b(this.zvk);
    }
    if (this.zvk != null)
      this.zvk.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(34561);
  }

  public void onPause()
  {
    AppMethodBeat.i(34563);
    ab.i("MicroMsg.NewBizConversationUI", "on pause");
    if (this.zvk != null)
      this.zvk.onPause();
    super.onPause();
    AppMethodBeat.o(34563);
  }

  public void onResume()
  {
    AppMethodBeat.i(34562);
    ab.v("MicroMsg.NewBizConversationUI", "on resume");
    if (this.zvk != null)
      this.zvk.onResume();
    super.onResume();
    AppMethodBeat.o(34562);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI
 * JD-Core Version:    0.6.2
 */