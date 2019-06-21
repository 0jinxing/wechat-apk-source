package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.luckymoney.model.ai;
import com.tencent.mm.plugin.luckymoney.model.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import java.util.LinkedList;
import java.util.List;

public class LuckyMoneyCanShareListUI extends LuckyMoneyBaseUI
{
  private int Lp;
  private boolean hZu;
  private List<r> nSx;
  private boolean ocG;
  private String ocP;
  private MMLoadMoreListView odn;
  private e odo;

  public LuckyMoneyCanShareListUI()
  {
    AppMethodBeat.i(42639);
    this.Lp = 0;
    this.nSx = new LinkedList();
    this.ocG = true;
    this.hZu = false;
    this.ocP = "";
    AppMethodBeat.o(42639);
  }

  private void bMr()
  {
    AppMethodBeat.i(42643);
    this.hZu = true;
    if (this.Lp == 0)
      this.ocP = "";
    n(new ai(10, this.Lp, 3, "", "v1.0", this.ocP));
    AppMethodBeat.o(42643);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(42642);
    if (((paramm instanceof ai)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (ai)paramm;
      paramm = paramString.nYQ.nXj;
      this.ocP = paramString.nYz;
      if (paramm != null)
      {
        for (paramInt1 = 0; paramInt1 < paramm.size(); paramInt1++)
          this.nSx.add(paramm.get(paramInt1));
        this.Lp += paramm.size();
        this.ocG = paramString.bLF();
        this.hZu = false;
        this.odo.ck(this.nSx);
      }
      if (this.ocG)
      {
        this.odn.dzN();
        bool = true;
        AppMethodBeat.o(42642);
      }
    }
    while (true)
    {
      return bool;
      this.odn.dzO();
      break;
      AppMethodBeat.o(42642);
    }
  }

  public final int getLayoutId()
  {
    return 2130969987;
  }

  public final void initView()
  {
    AppMethodBeat.i(42641);
    setBackBtn(new LuckyMoneyCanShareListUI.1(this));
    this.odn = ((MMLoadMoreListView)findViewById(2131825554));
    setMMTitle(getString(2131301125));
    this.odo = new f(this.mController.ylL);
    this.odn.setAdapter(this.odo);
    this.odn.setOnItemClickListener(new LuckyMoneyCanShareListUI.2(this));
    this.odn.setOnLoadMoreListener(new LuckyMoneyCanShareListUI.3(this));
    AppMethodBeat.o(42641);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42640);
    super.onCreate(paramBundle);
    initView();
    bMr();
    AppMethodBeat.o(42640);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI
 * JD-Core Version:    0.6.2
 */