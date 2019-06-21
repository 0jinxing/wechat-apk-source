package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.f.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.sns.data.SnsCmdList;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.v;

public class SnsMsgUI extends MMActivity
  implements f, b.b
{
  private long eEO;
  private int ehv;
  private long fAq;
  private String fsg;
  private ak handler;
  private n.d jKa;
  private View kmS;
  private View kmT;
  private boolean kmU;
  private int[] mkD;
  private com.tencent.matrix.trace.e.b mnM;
  private ListView nDp;
  private View nDr;
  long qQp;
  int rfb;
  private an rhs;
  private SnsCmdList rjk;
  private bd rqa;
  private SnsMsgUI.a rtT;
  private boolean rtU;
  private boolean rtV;
  private boolean rtW;
  private com.tencent.mm.ui.base.p rtX;
  private View.OnClickListener rtY;
  private k.a rtZ;
  Runnable rua;

  public SnsMsgUI()
  {
    AppMethodBeat.i(39098);
    this.kmT = null;
    this.handler = af.bCo();
    this.rtU = false;
    this.rtV = false;
    this.rjk = new SnsCmdList();
    this.kmU = false;
    this.rtW = false;
    this.mkD = new int[2];
    this.rtY = new SnsMsgUI.1(this);
    this.eEO = 0L;
    this.fAq = 0L;
    this.mnM = new SnsMsgUI.10(this);
    this.jKa = new SnsMsgUI.5(this);
    this.rtZ = new SnsMsgUI.8(this);
    this.rua = new SnsMsgUI.9(this);
    AppMethodBeat.o(39098);
  }

  private void ctD()
  {
    AppMethodBeat.i(39109);
    if (this.rtU)
      AppMethodBeat.o(39109);
    while (true)
    {
      return;
      this.rtU = true;
      this.handler.postDelayed(this.rua, 500L);
      AppMethodBeat.o(39109);
    }
  }

  public final void Xw(String paramString)
  {
    AppMethodBeat.i(39106);
    this.rtT.notifyDataSetChanged();
    AppMethodBeat.o(39106);
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(39107);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.SnsMsgUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.rjk);
      setResult(-1, paramKeyEvent);
      finish();
      bool = true;
      AppMethodBeat.o(39107);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(39107);
    }
  }

  public final int getLayoutId()
  {
    return 2130970783;
  }

  public final void initView()
  {
    AppMethodBeat.i(39103);
    setMMTitle(2131303723);
    addTextOptionMenu(0, getString(2131296871), new SnsMsgUI.11(this));
    this.rhs = new an(this);
    this.nDr = findViewById(2131827810);
    this.nDp = ((ListView)findViewById(2131827809));
    this.kmS = v.hu(this).inflate(2130970781, null);
    this.kmT = v.hu(this).inflate(2130970112, null);
    ab.d("MicroMsg.SnsMsgUI", "autoLoad " + this.kmU);
    if (this.kmU)
    {
      this.nDp.addFooterView(this.kmT);
      this.rtT = new SnsMsgUI.a(this, this, new com.tencent.mm.plugin.sns.storage.j());
      this.rtT.setGetViewPositionCallback(new SnsMsgUI.12(this));
      this.rtT.setPerformItemClickListener(new MMSlideDelView.g()
      {
        public final void q(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          AppMethodBeat.i(39079);
          SnsMsgUI.c(SnsMsgUI.this).performItemClick(paramAnonymousView, paramAnonymousInt1, paramAnonymousInt2);
          AppMethodBeat.o(39079);
        }
      });
      this.rtT.b(new SnsMsgUI.14(this));
      this.rtT.a(new SnsMsgUI.15(this));
      this.nDp.setAdapter(this.rtT);
      this.nDp.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(39082);
          if (paramAnonymousInt == SnsMsgUI.e(SnsMsgUI.this).getCount())
            if (af.cnK().baS() > 0)
            {
              af.cnK().baT();
              if (SnsMsgUI.e(SnsMsgUI.this).bdn())
              {
                paramAnonymousInt = 0;
                SnsMsgUI.e(SnsMsgUI.this).a(null, null);
                if (!SnsMsgUI.g(SnsMsgUI.this))
                {
                  if (SnsMsgUI.f(SnsMsgUI.this).getParent() != null)
                  {
                    ab.d("MicroMsg.SnsMsgUI", "remove footer");
                    SnsMsgUI.c(SnsMsgUI.this).removeFooterView(SnsMsgUI.f(SnsMsgUI.this));
                  }
                  if ((SnsMsgUI.h(SnsMsgUI.this).getParent() == null) && (paramAnonymousInt > 0))
                  {
                    SnsMsgUI.c(SnsMsgUI.this).addFooterView(SnsMsgUI.h(SnsMsgUI.this));
                    ab.i("MicroMsg.SnsMsgUI", "add mLoadingFooterView");
                  }
                }
                SnsMsgUI.i(SnsMsgUI.this);
                SnsMsgUI.f(SnsMsgUI.this).setVisibility(8);
                AppMethodBeat.o(39082);
              }
            }
          while (true)
          {
            return;
            paramAnonymousInt = 1;
            break;
            paramAnonymousInt = SnsMsgUI.e(SnsMsgUI.this).bdo();
            break;
            paramAnonymousAdapterView = (com.tencent.mm.plugin.sns.storage.j)SnsMsgUI.e(SnsMsgUI.this).getItem(paramAnonymousInt);
            SnsMsgUI.a(SnsMsgUI.this, paramAnonymousAdapterView);
            AppMethodBeat.o(39082);
          }
        }
      });
      new com.tencent.mm.ui.tools.j(this);
      this.nDp.setOnTouchListener(new SnsMsgUI.17(this));
      this.nDp.setOnItemLongClickListener(new SnsMsgUI.2(this));
      this.nDp.setOnScrollListener(new SnsMsgUI.3(this));
      if (this.rtT.getCount() != 0)
        break label469;
      this.nDp.setVisibility(8);
      this.nDr.setVisibility(0);
      enableOptionMenu(false);
    }
    while (true)
    {
      if (((this.rtT.bdn()) && (af.cnK().baS() == 0)) || (af.cnK().baS() == af.cnK().cqG()))
        this.kmS.setVisibility(8);
      if ((this.rtT.bdn()) && (this.kmU))
        this.nDp.removeFooterView(this.kmT);
      setBackBtn(new SnsMsgUI.4(this));
      if ((this.rtT.bdn()) && (this.kmU))
        this.nDp.removeFooterView(this.kmT);
      AppMethodBeat.o(39103);
      return;
      this.nDp.addFooterView(this.kmS);
      break;
      label469: this.nDp.setVisibility(0);
      this.nDr.setVisibility(8);
      enableOptionMenu(true);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39105);
    ab.i("MicroMsg.SnsMsgUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
      AppMethodBeat.o(39105);
    while (true)
    {
      return;
      if ((paramIntent != null) && (paramIntent.getBooleanExtra("result_finish", false)))
      {
        finish();
        AppMethodBeat.o(39105);
      }
      else
      {
        if (paramIntent != null)
        {
          paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
          this.rjk.CK(paramInt1);
        }
        AppMethodBeat.o(39105);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39099);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(210, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(683, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(218, this);
    this.fsg = com.tencent.mm.model.r.Yz();
    this.rqa = af.cnt();
    this.rtV = getIntent().getBooleanExtra("sns_msg_force_show_all", false);
    if (this.rtV)
      this.kmU = true;
    af.cnK().c(this.rtZ);
    xE(this.mController.dyj());
    initView();
    AppMethodBeat.o(39099);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(39104);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    com.tencent.mm.plugin.sns.storage.j localj = (com.tencent.mm.plugin.sns.storage.j)this.rtT.getItem(paramContextMenuInfo.position);
    if (localj == null)
      AppMethodBeat.o(39104);
    while (true)
    {
      return;
      this.rfb = localj.rfb;
      this.qQp = localj.field_snsID;
      try
      {
        paramView = new com/tencent/mm/protocal/protobuf/can;
        paramView.<init>();
        can localcan = (can)paramView.parseFrom(localj.field_curActionBuf);
        if (localcan != null)
        {
          paramView = this.rqa.aoO(localcan.wPm);
          if (paramView == null)
            break label176;
          paramView = paramView.Oj();
          label108: paramContextMenu.setHeaderTitle(bo.nullAsNil(paramView));
          if (localj.field_isSilence != 0)
            break label205;
          paramContextMenu.add(paramContextMenuInfo.position, 1, 1, getString(2131301824));
        }
        while (true)
        {
          paramContextMenu.add(paramContextMenuInfo.position, 0, 0, getString(2131296881));
          AppMethodBeat.o(39104);
          break;
          label176: if (!bo.isNullOrNil(localcan.wZD))
          {
            paramView = localcan.wZD;
            break label108;
          }
          paramView = localcan.wPm;
          break label108;
          label205: paramContextMenu.add(paramContextMenuInfo.position, 2, 1, getString(2131301823));
        }
      }
      catch (Exception paramView)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SnsMsgUI", paramView, "", new Object[0]);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39100);
    ab.d("MicroMsg.SnsMsgUI", "msgui onDestroy");
    af.cnK().baT();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(210, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(683, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(218, this);
    af.cnK().d(this.rtZ);
    this.rtT.bIf();
    af.cnC().ab(this);
    if (this.rtX != null)
    {
      this.rtX.dismiss();
      this.rtX = null;
    }
    super.onDestroy();
    AppMethodBeat.o(39100);
  }

  public void onPause()
  {
    AppMethodBeat.i(39102);
    WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSNSMsgScrollEnable, this.ehv);
    this.ehv = 0;
    af.cnA().b(this);
    super.onPause();
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      c localc = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localc != null)
        localc.b(this.mnM);
    }
    if (bo.anT() > this.fAq);
    for (long l = bo.anT() - this.fAq; ; l = 1L)
    {
      this.fAq = l;
      WXHardCoderJNI.reportFPS(705, WXHardCoderJNI.hcSNSMsgScrollAction, 1, this.eEO, this.fAq);
      this.eEO = 0L;
      this.fAq = 0L;
      AppMethodBeat.o(39102);
      return;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(39101);
    this.fAq = bo.anT();
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      c localc = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localc != null)
        localc.a(this.mnM);
    }
    af.cnA().a(this);
    super.onResume();
    AppMethodBeat.o(39101);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(39108);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.sns.model.q)))
    {
      ab.d("MicroMsg.SnsMsgUI", "onSceneEnd errtype errcode");
      ctD();
    }
    if (paramm.getType() == 218)
    {
      if (((com.tencent.mm.plugin.sns.model.r)paramm).type != 12)
      {
        AppMethodBeat.o(39108);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label125;
      this.rtT.a(null, null);
      Toast.makeText(this, getString(2131301827), 0).show();
    }
    while (true)
    {
      if (this.rtX != null)
      {
        this.rtX.dismiss();
        this.rtX = null;
      }
      AppMethodBeat.o(39108);
      break;
      label125: Toast.makeText(this, getString(2131301826), 0).show();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a$a
  {
    long cND;
    View jJW;
    TextView jJX;
    TextView pnE;
    SnsAvatarImageView ruh;
    TextView rui;
    ImageView ruj;
    TextView ruk;
    MMImageView rul;
    ImageView rum;
    TextView timeTv;

    a$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI
 * JD-Core Version:    0.6.2
 */