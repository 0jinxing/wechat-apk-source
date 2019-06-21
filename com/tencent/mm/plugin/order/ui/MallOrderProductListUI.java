package com.tencent.mm.plugin.order.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallOrderProductListUI extends WalletBaseUI
{
  private ListView Ej;
  private String fhH;
  private List<ProductSectionItem> iJL;
  private String kBE;
  private BaseAdapter khG;

  public MallOrderProductListUI()
  {
    AppMethodBeat.i(43842);
    this.iJL = new ArrayList();
    this.kBE = "";
    this.fhH = "";
    AppMethodBeat.o(43842);
  }

  private void bZe()
  {
    AppMethodBeat.i(43845);
    Bundle localBundle = this.mBundle;
    ArrayList localArrayList = localBundle.getParcelableArrayList("order_product_list");
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      this.iJL.clear();
      this.iJL.addAll(localArrayList);
    }
    this.kBE = localBundle.getString("key_trans_id");
    this.fhH = localBundle.getString("appname");
    AppMethodBeat.o(43845);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130970059;
  }

  @Deprecated
  public final void initView()
  {
    AppMethodBeat.i(43844);
    setMMTitle(2131301341);
    bZe();
    this.Ej = ((ListView)findViewById(2131825850));
    this.khG = new MallOrderProductListUI.a(this, (byte)0);
    this.Ej.setAdapter(this.khG);
    this.khG.notifyDataSetChanged();
    this.Ej.setOnItemClickListener(new MallOrderProductListUI.1(this));
    AppMethodBeat.o(43844);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43843);
    super.onCreate(paramBundle);
    AM(0);
    initView();
    AppMethodBeat.o(43843);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43846);
    super.onDestroy();
    AppMethodBeat.o(43846);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(43847);
    boolean bool;
    if (paramInt == 4)
    {
      if ((com.tencent.mm.wallet_core.a.aE(this) instanceof com.tencent.mm.plugin.order.a.a))
        com.tencent.mm.wallet_core.a.aB(this);
      bool = true;
      AppMethodBeat.o(43847);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(43847);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderProductListUI
 * JD-Core Version:    0.6.2
 */