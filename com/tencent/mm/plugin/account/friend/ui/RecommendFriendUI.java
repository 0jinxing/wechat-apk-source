package com.tencent.mm.plugin.account.friend.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.aa;
import com.tencent.mm.protocal.protobuf.aco;
import com.tencent.mm.protocal.protobuf.bea;
import com.tencent.mm.protocal.protobuf.bed;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import junit.framework.Assert;

public class RecommendFriendUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ;
  private b gxY;
  private ListView gxZ;
  private LinkedList<aco> gxf;
  private boolean gxg;
  private TextView gya;
  private LinkedList<bed> gyb;
  private int gyc;
  private boolean gyd;

  public RecommendFriendUI()
  {
    AppMethodBeat.i(108634);
    this.ehJ = null;
    this.gyb = new LinkedList();
    this.gxf = new LinkedList();
    this.gyc = -1;
    this.gyd = false;
    AppMethodBeat.o(108634);
  }

  private void aqx()
  {
    AppMethodBeat.i(108640);
    this.gyd = true;
    aa localaa = new aa(this.gyc);
    g.Rg().a(localaa, 0);
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.ehJ = h.b(localAppCompatActivity, getString(2131300659), true, new RecommendFriendUI.5(this, localaa));
    AppMethodBeat.o(108640);
  }

  private void aqy()
  {
    AppMethodBeat.i(108642);
    this.gya.setVisibility(0);
    this.gxZ.setVisibility(8);
    AppMethodBeat.o(108642);
  }

  private void aqz()
  {
    AppMethodBeat.i(108644);
    if (this.gyc == 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("dealGetInviteFriendGroupSuccess just only qq", bool);
      ab.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendGroupSuccess  respList.size:" + this.gxf.size());
      this.gxY.gxf = this.gxf;
      this.gxZ.setAdapter(this.gxY);
      showOptionMenu(false);
      this.gxg = true;
      setMMTitle(2131303112);
      this.gxY.gxg = this.gxg;
      this.gxY.notifyDataSetChanged();
      AppMethodBeat.o(108644);
      return;
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(108637);
    if (this.gyc != 0)
    {
      finish();
      AppMethodBeat.o(108637);
    }
    while (true)
    {
      return;
      if ((this.gxg) || (this.gyd))
      {
        finish();
        AppMethodBeat.o(108637);
      }
      else
      {
        aqz();
        AppMethodBeat.o(108637);
      }
    }
  }

  private void nb(int paramInt)
  {
    AppMethodBeat.i(108643);
    ab.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendSuccess  respList.size:" + this.gyb.size());
    this.gxY.a(this.gyb, paramInt);
    this.gxZ.setAdapter(this.gxY);
    this.gxg = false;
    String str;
    int i;
    if (this.gyc == 0)
    {
      str = "";
      i = 0;
      if (i < this.gxf.size())
      {
        if (paramInt != ((aco)this.gxf.get(i)).weB)
          break label155;
        str = ((aco)this.gxf.get(i)).wkk;
      }
    }
    label155: 
    while (true)
    {
      i++;
      break;
      setMMTitle(str);
      this.gxY.gxg = this.gxg;
      this.gxY.notifyDataSetChanged();
      AppMethodBeat.o(108643);
      return;
    }
  }

  public final int getLayoutId()
  {
    return 2130969872;
  }

  public final void initView()
  {
    AppMethodBeat.i(108636);
    this.gya = ((TextView)findViewById(2131825025));
    if (this.gyc == 1)
    {
      setMMTitle(2131303227);
      this.gya.setText(2131303231);
    }
    while (true)
    {
      this.gxY = new b(getLayoutInflater());
      this.gxZ = ((ListView)findViewById(2131825024));
      this.gxZ.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          int i = 0;
          AppMethodBeat.i(108627);
          if (!RecommendFriendUI.a(RecommendFriendUI.this))
          {
            RecommendFriendUI.b(RecommendFriendUI.this).na(paramAnonymousInt);
            if (RecommendFriendUI.b(RecommendFriendUI.this).aqw().length > 0)
            {
              RecommendFriendUI.this.showOptionMenu(true);
              AppMethodBeat.o(108627);
            }
            while (true)
            {
              return;
              RecommendFriendUI.this.showOptionMenu(false);
              AppMethodBeat.o(108627);
            }
          }
          paramAnonymousView = RecommendFriendUI.this;
          paramAnonymousAdapterView = RecommendFriendUI.b(RecommendFriendUI.this);
          if (!paramAnonymousAdapterView.gxg);
          for (paramAnonymousInt = i; ; paramAnonymousInt = ((aco)paramAnonymousAdapterView.gxf.get(paramAnonymousInt)).weB)
          {
            RecommendFriendUI.a(paramAnonymousView, paramAnonymousInt);
            AppMethodBeat.o(108627);
            break;
          }
        }
      });
      this.gxZ.setAdapter(this.gxY);
      addTextOptionMenu(0, getString(2131300656), new RecommendFriendUI.2(this));
      showOptionMenu(false);
      aqx();
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(108630);
          RecommendFriendUI.d(RecommendFriendUI.this);
          AppMethodBeat.o(108630);
          return true;
        }
      });
      new RecommendFriendUI.4(this);
      AppMethodBeat.o(108636);
      return;
      if (this.gyc == 2)
      {
        setMMTitle(2131303226);
        this.gya.setText(2131303230);
      }
      else
      {
        setMMTitle(2131303112);
        this.gya.setText(2131303232);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(108635);
    super.onCreate(paramBundle);
    this.gyc = bo.getInt(getIntent().getStringExtra("recommend_type"), 0);
    this.gxg = false;
    g.Rg().a(135, this);
    initView();
    AppMethodBeat.o(108635);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(108639);
    g.Rg().b(135, this);
    super.onDestroy();
    AppMethodBeat.o(108639);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(108638);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(108638);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(108638);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(108641);
    ab.i("MicroMsg.RecommendFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramm.getType() != 135))
    {
      aqy();
      AppMethodBeat.o(108641);
    }
    while (true)
    {
      return;
      this.gyb = ((bea)((aa)paramm).ehh.fsH.fsP).ndm;
      this.gxf = ((bea)((aa)paramm).ehh.fsH.fsP).vFk;
      this.gyd = false;
      if (this.gyb.size() <= 0)
      {
        aqy();
        AppMethodBeat.o(108641);
      }
      else if ((this.gyc == 0) && (this.gxf.size() <= 0))
      {
        aqy();
        AppMethodBeat.o(108641);
      }
      else if (this.gyc != 0)
      {
        nb(-1);
        AppMethodBeat.o(108641);
      }
      else
      {
        aqz();
        AppMethodBeat.o(108641);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI
 * JD-Core Version:    0.6.2
 */