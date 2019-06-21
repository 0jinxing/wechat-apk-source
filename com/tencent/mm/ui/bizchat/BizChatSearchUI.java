package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.AbsListView.OnScrollListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.ui.b;
import com.tencent.mm.modelvoiceaddr.ui.b.a;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;

@a(3)
public class BizChatSearchUI extends MMActivity
  implements b.a, BizChatSearchListView.a
{
  b jLK;
  String jMp;
  private AbsListView.OnScrollListener nfn;
  private int scene;
  private BizChatSearchUI.a yEA;
  private String yEw;
  private BizChatSearchUI.c yEx;
  private BizChatSearchListView yEy;
  private TextView yEz;

  public BizChatSearchUI()
  {
    AppMethodBeat.i(30159);
    this.nfn = new BizChatSearchUI.1(this);
    AppMethodBeat.o(30159);
  }

  private void NY(int paramInt)
  {
    AppMethodBeat.i(30173);
    if (this.yEx != null)
      this.yEx.sd(paramInt);
    AppMethodBeat.o(30173);
  }

  private void aWh()
  {
    AppMethodBeat.i(30161);
    if (bo.isNullOrNil(this.jMp))
    {
      this.jMp = getIntent().getStringExtra("enterprise_biz_name");
      this.scene = getIntent().getIntExtra("biz_chat_search_scene", 1);
      this.yEw = getIntent().getStringExtra("biz_chat_search_text");
      if (bo.isNullOrNil(this.jMp))
        finish();
    }
    AppMethodBeat.o(30161);
  }

  public final void a(BizChatSearchUI.a parama)
  {
    AppMethodBeat.i(30163);
    if (BizChatSearchUI.a.c(parama))
      if (bo.isNullOrNil(BizChatSearchUI.a.d(parama)))
      {
        this.yEz.setVisibility(8);
        this.yEy.setVisibility(8);
        AppMethodBeat.o(30163);
      }
    while (true)
    {
      return;
      if (parama.getCount() <= 0)
      {
        this.yEz.setVisibility(0);
        this.yEy.setVisibility(8);
        AppMethodBeat.o(30163);
      }
      else
      {
        this.yEz.setVisibility(8);
        this.yEy.setVisibility(0);
        AppMethodBeat.o(30163);
        continue;
        if (bo.isNullOrNil(BizChatSearchUI.a.d(parama)))
        {
          this.yEz.setVisibility(0);
          this.yEz.setText("");
          this.yEy.setVisibility(8);
        }
        while (true)
          if (BizChatSearchUI.a.b(parama))
          {
            if (parama.yER)
            {
              NY(1);
              AppMethodBeat.o(30163);
              break;
              if ((BizChatSearchUI.a.b(parama)) && (parama.yEQ))
              {
                this.yEz.setVisibility(0);
                this.yEz.setText(2131297695);
                this.yEy.setVisibility(8);
                continue;
              }
              if ((BizChatSearchUI.a.b(parama)) && (parama.yEU))
              {
                this.yEz.setVisibility(0);
                this.yEz.setText(2131297696);
                this.yEy.setVisibility(8);
                continue;
              }
              if (parama.getCount() <= 0)
              {
                this.yEz.setVisibility(0);
                this.yEz.setText(f.a(getString(2131302819), getString(2131302818), d.b(BizChatSearchUI.a.d(parama), BizChatSearchUI.a.d(parama))).mDR);
                this.yEy.setVisibility(8);
                continue;
              }
              this.yEz.setVisibility(8);
              this.yEy.setVisibility(0);
              continue;
            }
            if (parama.yEP)
            {
              NY(2);
              AppMethodBeat.o(30163);
              break;
            }
            NY(0);
          }
        AppMethodBeat.o(30163);
      }
    }
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
  }

  public final boolean aWe()
  {
    AppMethodBeat.i(30172);
    aqX();
    AppMethodBeat.o(30172);
    return false;
  }

  public final void amJ()
  {
    AppMethodBeat.i(30167);
    aqX();
    AppMethodBeat.o(30167);
  }

  public final void apo()
  {
    AppMethodBeat.i(30164);
    finish();
    AppMethodBeat.o(30164);
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final int getLayoutId()
  {
    return 2130969402;
  }

  public final void initView()
  {
    AppMethodBeat.i(30162);
    aWh();
    this.yEy = ((BizChatSearchListView)findViewById(2131823621));
    this.yEz = ((TextView)findViewById(2131820904));
    this.yEA = new BizChatSearchUI.a(this.mController.ylL, this.jMp, this.scene);
    if (BizChatSearchUI.a.b(this.yEA))
    {
      this.yEx = new BizChatSearchUI.c((byte)0);
      this.yEy.addFooterView(this.yEx.hQ(this.mController.ylL));
      NY(0);
    }
    this.yEy.setAdapter(this.yEA);
    this.yEy.setOnItemClickListener(new BizChatSearchUI.2(this));
    this.yEy.setOnTouchListener(this);
    if (BizChatSearchUI.a.b(this.yEA))
      this.yEy.setOnScrollListener(this.nfn);
    this.jLK = new b();
    this.jLK.qQ(BizChatSearchUI.a.c(this.yEA));
    this.jLK.a(this);
    this.jLK.gcl = false;
    AppMethodBeat.o(30162);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30160);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(30160);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(30170);
    this.jLK.a(this, paramMenu);
    AppMethodBeat.o(30170);
    return true;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30169);
    super.onDestroy();
    AppMethodBeat.o(30169);
  }

  public void onPause()
  {
    AppMethodBeat.i(30168);
    super.onPause();
    this.jLK.cancel();
    this.jLK.clearFocus();
    AppMethodBeat.o(30168);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(30171);
    this.jLK.a(this, paramMenu);
    AppMethodBeat.o(30171);
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(30166);
    aqX();
    AppMethodBeat.o(30166);
    return true;
  }

  public final void vO(String paramString)
  {
    BizChatSearchUI.a locala = null;
    AppMethodBeat.i(30165);
    if ((bo.isNullOrNil(paramString)) && (this.yEw != null))
    {
      paramString = this.yEw;
      this.yEw = null;
      if (!paramString.equals(""))
        this.jLK.setSearchContent(paramString);
      b localb = this.jLK;
      if (BizChatSearchUI.a.c(this.yEA))
      {
        paramString = this.mController.ylL.getResources().getString(2131297697);
        localb.setHint(paramString);
        this.jLK.clearFocus();
        AppMethodBeat.o(30165);
      }
    }
    while (true)
    {
      return;
      if (BizChatSearchUI.a.b(this.yEA))
      {
        paramString = this.mController.ylL.getResources().getString(2131297701);
        break;
      }
      paramString = locala;
      if (!BizChatSearchUI.a.e(this.yEA))
        break;
      paramString = this.mController.ylL.getResources().getString(2131297694);
      break;
      locala = this.yEA;
      locala.ema = paramString;
      if (bo.isNullOrNil(paramString))
      {
        locala.clearData();
        locala.yEQ = false;
        locala.yEU = false;
        locala.qm(true);
        AppMethodBeat.o(30165);
      }
      else if (locala.dAS())
      {
        locala.yEQ = true;
        locala.yEU = false;
        locala.dAW();
        locala.cf(paramString, false);
        locala.aqW(paramString);
        AppMethodBeat.o(30165);
      }
      else
      {
        locala.cf(paramString, true);
        if ((locala.yEE) && (locala.yEQ))
          locala.aqW(paramString);
        AppMethodBeat.o(30165);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSearchUI
 * JD-Core Version:    0.6.2
 */