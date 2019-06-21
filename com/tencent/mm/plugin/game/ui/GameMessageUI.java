package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.game.b.a;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.n.e;
import com.tencent.mm.plugin.game.model.o;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;

public class GameMessageUI extends GameCenterActivity
  implements AdapterView.OnItemClickListener, f
{
  private int edX;
  private int emC;
  private TextView gqv;
  private AbsListView.OnScrollListener nfn;
  private ListView nll;
  private n nlm;
  private View nln;
  private int nlo;
  private boolean nlp;
  private boolean nlq;
  private String nlr;
  private DialogInterface.OnClickListener nls;
  private DialogInterface.OnClickListener nlt;

  public GameMessageUI()
  {
    AppMethodBeat.i(112105);
    this.nlo = 1;
    this.nlp = false;
    this.nlq = false;
    this.edX = 0;
    this.nlr = "";
    this.nfn = new GameMessageUI.4(this);
    AppMethodBeat.o(112105);
  }

  private void bFv()
  {
    AppMethodBeat.i(112115);
    if (e.ec(this))
    {
      this.nln = View.inflate(this, 2130969758, null);
      this.nln.setOnClickListener(new GameMessageUI.5(this));
      this.nll.addHeaderView(this.nln);
      this.nln.setVisibility(0);
      e.ed(this);
      AppMethodBeat.o(112115);
    }
    while (true)
    {
      return;
      if (this.nln != null)
        this.nln.setVisibility(8);
      AppMethodBeat.o(112115);
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(112111);
    ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().bEv();
    finish();
    AppMethodBeat.o(112111);
  }

  private void wN(int paramInt)
  {
    AppMethodBeat.i(112109);
    if (this.gqv == null)
      this.gqv = ((TextView)findViewById(2131824571));
    this.gqv.setVisibility(paramInt);
    AppMethodBeat.o(112109);
  }

  public final int bFf()
  {
    return 13;
  }

  public final int bFg()
  {
    return 1300;
  }

  public final int bFh()
  {
    return this.emC;
  }

  public final int getLayoutId()
  {
    return 2130969754;
  }

  public final void initView()
  {
    AppMethodBeat.i(112108);
    setMMTitle(2131300311);
    setBackBtn(new GameMessageUI.1(this));
    addTextOptionMenu(0, getString(2131296871), new GameMessageUI.2(this));
    this.emC = getIntent().getIntExtra("game_report_from_scene", 0);
    this.nll = ((ListView)findViewById(2131824570));
    this.nll.setOnItemClickListener(this);
    if (this.edX > 20)
      bFv();
    com.tencent.mm.plugin.game.model.n localn = new com.tencent.mm.plugin.game.model.n();
    localn.mXf = true;
    this.nlm = new n(this, localn, this.emC);
    this.nlm.pN(true);
    wN(8);
    this.nlm.a(new GameMessageUI.3(this));
    this.nll.setOnScrollListener(this.nfn);
    this.nll.setAdapter(this.nlm);
    com.tencent.mm.plugin.game.e.b.a(this.mController.ylL, 13, 1300, 0, 1, 0, null, this.emC, 0, null, null, null);
    AppMethodBeat.o(112108);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112106);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Rg().a(573, this);
    this.edX = getIntent().getIntExtra("game_unread_msg_count", 0);
    this.nlr = getIntent().getStringExtra("game_manage_url");
    initView();
    ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
    com.tencent.mm.plugin.game.model.q.bEr();
    AppMethodBeat.o(112106);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112112);
    super.onDestroy();
    if (this.nlm != null)
      this.nlm.bIf();
    com.tencent.mm.kernel.g.Rg().b(573, this);
    r localr = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCY();
    String str = "delete from GameRawMessage where createTime < (" + "select createTime from GameRawMessage order by createTime desc limit 9999,1" + ")";
    ab.i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", new Object[] { Boolean.valueOf(localr.hY("GameRawMessage", str)), str });
    ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().bEv();
    AppMethodBeat.o(112112);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112113);
    paramAdapterView = (com.tencent.mm.plugin.game.model.n)paramAdapterView.getAdapter().getItem(paramInt);
    if (paramAdapterView == null)
    {
      ab.e("MicroMsg.GameMessageUI", "get message null: position:[%d]", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(112113);
    }
    while (true)
    {
      return;
      paramAdapterView.bEl();
      if (paramAdapterView.field_msgType == 100)
      {
        if (!bo.isNullOrNil(paramAdapterView.mWO))
        {
          paramView = (n.e)paramAdapterView.mWu.get(paramAdapterView.mWO);
          if (paramView == null)
          {
            AppMethodBeat.o(112113);
          }
          else
          {
            paramInt = o.a(this, paramAdapterView, paramView, paramAdapterView.field_appId, 1301);
            if (paramInt != 0)
              com.tencent.mm.plugin.game.e.b.a(this.mController.ylL, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.emC, paramAdapterView.mXb, paramAdapterView.field_gameMsgId, paramAdapterView.mXc, null);
          }
        }
        else
        {
          AppMethodBeat.o(112113);
        }
      }
      else
      {
        if (paramAdapterView.mXd == 0)
        {
          switch (paramAdapterView.field_msgType)
          {
          case 3:
          case 4:
          case 7:
          case 8:
          case 9:
          default:
          case 10:
          case 11:
            do
            {
              AppMethodBeat.o(112113);
              break;
            }
            while (bo.isNullOrNil(paramAdapterView.mWh));
            paramInt = com.tencent.mm.plugin.game.f.c.ax(this, paramAdapterView.mWh);
          case 6:
          case 2:
          case 5:
          }
          while (true)
          {
            com.tencent.mm.plugin.game.e.b.a(this.mController.ylL, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.emC, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mXc, null);
            break;
            if (bo.isNullOrNil(paramAdapterView.mWJ))
              break;
            paramInt = com.tencent.mm.plugin.game.f.c.ax(this, paramAdapterView.mWJ);
            continue;
            if (com.tencent.mm.pluginsdk.model.app.g.u(this, paramAdapterView.field_appId))
            {
              e.ak(this, paramAdapterView.field_appId);
              paramInt = 3;
            }
            else
            {
              paramView = new Bundle();
              paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
              paramView.putInt("game_report_from_scene", 1301);
              paramInt = com.tencent.mm.plugin.game.f.c.b(this, paramAdapterView.field_appId, null, paramView);
            }
          }
        }
        switch (paramAdapterView.mXd)
        {
        default:
          ab.e("MicroMsg.GameMessageUI", "unknowed jumptype : " + paramAdapterView.mXd);
          AppMethodBeat.o(112113);
          break;
        case 1:
          if (bo.isNullOrNil(paramAdapterView.field_appId))
          {
            ab.e("MicroMsg.GameMessageUI", "appid is null");
            AppMethodBeat.o(112113);
          }
          else
          {
            paramView = new Bundle();
            paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
            paramView.putInt("game_report_from_scene", 1301);
            paramInt = com.tencent.mm.plugin.game.f.c.b(this, paramAdapterView.field_appId, null, paramView);
            com.tencent.mm.plugin.game.e.b.a(this.mController.ylL, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.emC, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mXc, null);
            AppMethodBeat.o(112113);
          }
          break;
        case 2:
          if (com.tencent.mm.pluginsdk.model.app.g.u(this, paramAdapterView.field_appId))
            e.ak(this, paramAdapterView.field_appId);
          for (paramInt = 3; ; paramInt = com.tencent.mm.plugin.game.f.c.b(this, paramAdapterView.field_appId, null, paramView))
          {
            com.tencent.mm.plugin.game.e.b.a(this.mController.ylL, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.emC, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mXc, null);
            AppMethodBeat.o(112113);
            break;
            paramView = new Bundle();
            paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
            paramView.putInt("game_report_from_scene", 1301);
          }
        case 3:
          if (!bo.isNullOrNil(paramAdapterView.mXe))
          {
            paramInt = com.tencent.mm.plugin.game.f.c.ax(this, paramAdapterView.mXe);
            com.tencent.mm.plugin.game.e.b.a(this.mController.ylL, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.emC, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mXc, null);
            AppMethodBeat.o(112113);
          }
          else
          {
            ab.e("MicroMsg.GameMessageUI", "jumpurl is null");
            AppMethodBeat.o(112113);
          }
          break;
        }
      }
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(112110);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(112110);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(112110);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(112107);
    super.onResume();
    this.nlm.notifyDataSetChanged();
    if ((this.nlq) && (this.nln != null))
      this.nll.removeHeaderView(this.nln);
    AppMethodBeat.o(112107);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(112114);
    ab.i("MicroMsg.GameMessageUI", "onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.getType()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramm.getType() != 573)
        break label170;
      wN(8);
      this.nlm.a(null, null);
      AppMethodBeat.o(112114);
    }
    while (true)
    {
      return;
      if (this.nlm.getCount() > 0)
      {
        ab.i("MicroMsg.GameMessageUI", "has local message, do not show error tips");
        AppMethodBeat.o(112114);
      }
      else if (a.gkF.a(this, paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(112114);
      }
      else
      {
        Toast.makeText(this, getString(2131300270, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        label170: AppMethodBeat.o(112114);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageUI
 * JD-Core Version:    0.6.2
 */