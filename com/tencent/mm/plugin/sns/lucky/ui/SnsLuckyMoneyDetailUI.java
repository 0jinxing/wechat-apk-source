package com.tencent.mm.plugin.sns.lucky.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.l.a;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

public class SnsLuckyMoneyDetailUI extends LuckyMoneyBaseUI
{
  private ListView nSL;
  AbsListView.OnScrollListener nSS;
  private final int oey;
  private final int oez;
  private b qHe;

  public SnsLuckyMoneyDetailUI()
  {
    AppMethodBeat.i(45185);
    this.nSS = new SnsLuckyMoneyDetailUI.1(this);
    this.oey = 750;
    this.oez = 240;
    AppMethodBeat.o(45185);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45188);
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    AppMethodBeat.o(45188);
    return bool;
  }

  public final int getLayoutId()
  {
    return 2130970832;
  }

  public final void initView()
  {
    AppMethodBeat.i(45187);
    getResources().getDrawable(2130839226);
    setMMTitle(2131303696);
    setBackBtn(new SnsLuckyMoneyDetailUI.2(this));
    this.nSL = ((ListView)findViewById(2131825494));
    this.qHe = new b(this.mController.ylL);
    this.nSL.setAdapter(this.qHe);
    this.nSL.setOnScrollListener(this.nSS);
    this.nSL.setOnItemClickListener(new SnsLuckyMoneyDetailUI.3(this));
    AppMethodBeat.o(45187);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45186);
    super.onCreate(paramBundle);
    initView();
    List localList = a.Qe(getIntent().getStringExtra("key_feedid"));
    if ((localList == null) || (localList.size() == 0))
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        int i = getResources().getColor(2131690488);
        getWindow().setStatusBarColor(i);
      }
      setMMSubTitle(null);
      AppMethodBeat.o(45186);
      return;
    }
    paramBundle = this.qHe;
    if (localList == null)
      new LinkedList();
    while (true)
    {
      paramBundle.notifyDataSetChanged();
      break;
      paramBundle.nSx = localList;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45189);
    super.onDestroy();
    AppMethodBeat.o(45189);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI
 * JD-Core Version:    0.6.2
 */