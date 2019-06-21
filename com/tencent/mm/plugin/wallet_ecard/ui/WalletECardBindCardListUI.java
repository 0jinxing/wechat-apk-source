package com.tencent.mm.plugin.wallet_ecard.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_ecard.a.b;
import com.tencent.mm.plugin.wallet_ecard.a.f;
import com.tencent.mm.protocal.protobuf.bnf;
import com.tencent.mm.protocal.protobuf.hb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WalletECardBindCardListUI extends WalletECardBaseUI
{
  private int jSu;
  private boolean tQA;
  private c.a tQB;
  private ListView tQw;
  private TextView tQx;
  private List<hb> tQy;
  private c tQz;

  public WalletECardBindCardListUI()
  {
    AppMethodBeat.i(48125);
    this.tQy = new ArrayList();
    this.tQA = true;
    this.tQB = new WalletECardBindCardListUI.2(this);
    AppMethodBeat.o(48125);
  }

  private void arT()
  {
    AppMethodBeat.i(48131);
    ab.i("MicroMsg.WalletECardBindCardListUI", "load Data");
    a(new f("WEB_DEBIT", this.jSu), true, false);
    AppMethodBeat.o(48131);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48128);
    if ((paramm instanceof f))
    {
      paramm = (f)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (!bo.isNullOrNil(paramm.tQn.wQc))
          this.tQx.setText(paramm.tQn.wQc);
        if (paramm.tQn.kdT == 0)
        {
          ab.i("MicroMsg.WalletECardBindCardListUI", "banklist: %s", new Object[] { Integer.valueOf(paramm.tQn.wQd.size()) });
          ab.d("MicroMsg.WalletECardBindCardListUI", "true name: %s", new Object[] { paramm.tQn.twd });
          this.mBundle.putString(com.tencent.mm.plugin.wallet_ecard.a.a.tPY, paramm.tQn.twd);
          if (paramm.tQn.wQd.size() == 0)
          {
            ab.i("MicroMsg.WalletECardBindCardListUI", "no bind card, isGotoBindCardAfterNoBindCard: %s", new Object[] { Boolean.valueOf(this.tQA) });
            if (this.tQA)
              cST();
            AppMethodBeat.o(48128);
          }
        }
      }
    }
    while (true)
    {
      return bool;
      this.tQy.clear();
      this.tQy.addAll(paramm.tQn.wQd);
      this.tQz.notifyDataSetChanged();
      break;
      if (b.a(this, paramm.tQn.vLc))
        break;
      paramString = b.d(this.mController.ylL, new String[] { paramm.tQn.kdU, paramString });
      h.b(this.mController.ylL, paramString, "", false);
      break;
      ab.w("MicroMsg.WalletECardBindCardListUI", "net error: %s", new Object[] { paramm });
      paramString = b.d(this.mController.ylL, new String[] { paramString });
      h.b(this.mController.ylL, paramString, "", false);
      break;
      AppMethodBeat.o(48128);
      bool = false;
    }
  }

  public final boolean cNR()
  {
    return true;
  }

  public final void cST()
  {
    AppMethodBeat.i(48129);
    Bundle localBundle = new Bundle();
    if (this.jSu == 3)
      localBundle.putInt("key_bind_scene", 18);
    while (true)
    {
      localBundle.putBoolean("key_need_bind_response", true);
      localBundle.putBoolean("key_is_bind_bankcard", true);
      localBundle.putString("key_pwd1", this.mBundle.getString("key_pwd1"));
      ab.i("MicroMsg.WalletECardBindCardListUI", "start bind card, scene: %s", new Object[] { Integer.valueOf(this.jSu) });
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet_ecard.b.a.class, localBundle, this.tQB);
      AppMethodBeat.o(48129);
      return;
      localBundle.putInt("key_bind_scene", 19);
    }
  }

  public final int getLayoutId()
  {
    return 2130969305;
  }

  public final void initView()
  {
    AppMethodBeat.i(48127);
    this.tQw = ((ListView)findViewById(2131823354));
    View localView = LayoutInflater.from(this).inflate(2130969306, this.tQw, false);
    this.tQx = ((TextView)localView.findViewById(2131823356));
    this.tQw.addHeaderView(localView, null, false);
    this.tQz = new c((byte)0);
    this.tQw.setAdapter(this.tQz);
    this.tQw.setOnItemClickListener(new WalletECardBindCardListUI.1(this));
    AppMethodBeat.o(48127);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48126);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131690691));
    dyb();
    this.Ahr.nf(1988);
    this.jSu = this.mBundle.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.tPH, 2);
    ab.i("MicroMsg.WalletECardBindCardListUI", "openScene: %d", new Object[] { Integer.valueOf(this.jSu) });
    setMMTitle("");
    initView();
    this.tQA = true;
    arT();
    AppMethodBeat.o(48126);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48130);
    super.onDestroy();
    this.Ahr.ng(1988);
    AppMethodBeat.o(48130);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class c extends BaseAdapter
  {
    public final int rUc = 0;
    public final int tQD = 1;

    private c()
    {
    }

    public final int getCount()
    {
      AppMethodBeat.i(48118);
      int i = WalletECardBindCardListUI.e(WalletECardBindCardListUI.this).size();
      AppMethodBeat.o(48118);
      return i + 1;
    }

    public final Object getItem(int paramInt)
    {
      AppMethodBeat.i(48119);
      Object localObject;
      if (paramInt < WalletECardBindCardListUI.e(WalletECardBindCardListUI.this).size())
      {
        localObject = WalletECardBindCardListUI.e(WalletECardBindCardListUI.this).get(paramInt);
        AppMethodBeat.o(48119);
      }
      while (true)
      {
        return localObject;
        localObject = null;
        AppMethodBeat.o(48119);
      }
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final int getItemViewType(int paramInt)
    {
      AppMethodBeat.i(48120);
      if (paramInt >= WalletECardBindCardListUI.e(WalletECardBindCardListUI.this).size())
      {
        paramInt = 1;
        AppMethodBeat.o(48120);
      }
      while (true)
      {
        return paramInt;
        paramInt = 0;
        AppMethodBeat.o(48120);
      }
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(48122);
      View localView;
      if (getItemViewType(paramInt) == 1)
      {
        localView = paramView;
        if (paramView == null)
        {
          localView = LayoutInflater.from(WalletECardBindCardListUI.this.mController.ylL).inflate(2130969308, paramViewGroup, false);
          localView.setTag(new WalletECardBindCardListUI.a(WalletECardBindCardListUI.this, localView));
        }
        ((WalletECardBindCardListUI.a)localView.getTag()).iUx.setText(2131298970);
      }
      while (true)
      {
        AppMethodBeat.o(48122);
        return localView;
        localView = paramView;
        if (paramView == null)
        {
          localView = LayoutInflater.from(WalletECardBindCardListUI.this.mController.ylL).inflate(2130969307, paramViewGroup, false);
          localView.setTag(new WalletECardBindCardListUI.d(WalletECardBindCardListUI.this, localView));
        }
        ((WalletECardBindCardListUI.b)localView.getTag()).a(localView, (hb)getItem(paramInt));
      }
    }

    public final int getViewTypeCount()
    {
      return 2;
    }

    public final boolean isEnabled(int paramInt)
    {
      AppMethodBeat.i(48121);
      hb localhb = (hb)getItem(paramInt);
      boolean bool;
      if (localhb != null)
        if (localhb.vJJ)
        {
          bool = false;
          AppMethodBeat.o(48121);
        }
      while (true)
      {
        return bool;
        bool = true;
        AppMethodBeat.o(48121);
        continue;
        bool = super.isEnabled(paramInt);
        AppMethodBeat.o(48121);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI
 * JD-Core Version:    0.6.2
 */