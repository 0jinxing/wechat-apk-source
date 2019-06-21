package com.tencent.mm.plugin.order.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.plugin.order.model.c;
import com.tencent.mm.plugin.order.model.d;
import com.tencent.mm.plugin.order.model.g;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MallOrderRecordListUI extends WalletBaseUI
{
  protected int Lp;
  public MMLoadMoreListView emT;
  protected boolean isLoading;
  protected int mCount;
  protected ak mHandler;
  protected Dialog msu;
  public boolean ocG;
  public MallOrderRecordListUI.a pdZ;
  protected List<i> pea;
  protected String peb;
  public boolean pec;
  protected Map<String, String> ped;

  public MallOrderRecordListUI()
  {
    AppMethodBeat.i(43860);
    this.mHandler = null;
    this.msu = null;
    this.pdZ = null;
    this.pea = new ArrayList();
    this.ocG = true;
    this.mCount = 0;
    this.Lp = 0;
    this.peb = null;
    this.pec = false;
    this.isLoading = false;
    this.ped = new HashMap();
    AppMethodBeat.o(43860);
  }

  private boolean Uy(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(43870);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(43870);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= this.pea.size())
          break label84;
        i locali = (i)this.pea.get(i);
        if ((locali != null) && (paramString.equals(locali.pcU)))
        {
          bool = true;
          AppMethodBeat.o(43870);
          break;
        }
      }
      label84: AppMethodBeat.o(43870);
    }
  }

  private static String eR(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43874);
    String str = paramInt1 + "-" + paramInt2;
    AppMethodBeat.o(43874);
    return str;
  }

  protected final void AH(int paramInt)
  {
    AppMethodBeat.i(43868);
    if (paramInt >= this.pea.size())
      AppMethodBeat.o(43868);
    while (true)
    {
      return;
      i locali = (i)this.pea.get(paramInt);
      if (locali != null)
      {
        Bundle localBundle = this.mBundle;
        localBundle.putString("key_trans_id", locali.pcU);
        localBundle.putInt("key_pay_type", locali.pdc);
        localBundle.putString("bill_id", locali.pdn);
        com.tencent.mm.wallet_core.a.j(this, localBundle);
      }
      AppMethodBeat.o(43868);
    }
  }

  protected String AI(int paramInt)
  {
    AppMethodBeat.i(43872);
    String str = com.tencent.mm.wallet_core.ui.e.QR(paramInt);
    AppMethodBeat.o(43872);
    return str;
  }

  protected void bZf()
  {
    AppMethodBeat.i(43862);
    nf(388);
    nf(389);
    AppMethodBeat.o(43862);
  }

  protected void bZg()
  {
    AppMethodBeat.i(43863);
    ng(388);
    ng(389);
    AppMethodBeat.o(43863);
  }

  protected void bZh()
  {
    AppMethodBeat.i(43866);
    a(new com.tencent.mm.plugin.order.model.e(this.Lp, this.peb), true, true);
    AppMethodBeat.o(43866);
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43875);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.order.model.e))
    {
      if (this.msu != null)
      {
        this.msu.dismiss();
        this.msu = null;
      }
      paramString = (com.tencent.mm.plugin.order.model.e)paramm;
      this.peb = paramString.pcR;
      cw(paramString.pcP);
      cx(paramString.pcQ);
      this.mCount = this.pea.size();
      if (paramString.kCd > this.mCount)
      {
        bool = true;
        this.ocG = bool;
        this.pdZ.notifyDataSetChanged();
        ab.d("MicroMsg.WalletOrderListUI", "orders list count: " + this.mCount);
        ab.d("MicroMsg.WalletOrderListUI", "orders list total record: " + paramString.kCd);
        ab.d("MicroMsg.WalletOrderListUI", "orders list has more: " + this.ocG);
        this.mHandler.post(new MallOrderRecordListUI.5(this));
        this.isLoading = false;
        label195: if ((this.mCount > 0) || (this.pea.size() != 0))
          break label437;
        showOptionMenu(false);
        findViewById(2131825833).setVisibility(0);
      }
    }
    while (true)
    {
      AppMethodBeat.o(43875);
      return true;
      bool = false;
      break;
      if (!(paramm instanceof g))
        break label195;
      if (this.msu != null)
      {
        this.msu.dismiss();
        this.msu = null;
      }
      paramString = (g)paramm;
      label316: if (paramString.bZa() == 2)
      {
        if (this.pea != null)
          this.pea.clear();
        this.mCount = 0;
        this.ocG = false;
        this.emT.dzO();
      }
      while (true)
      {
        this.mHandler.post(new MallOrderRecordListUI.6(this));
        break;
        paramm = paramString.bZb();
        ab.d("MicroMsg.WalletOrderListUI", "delete transId:".concat(String.valueOf(paramm)));
        if (!bo.isNullOrNil(paramm))
        {
          paramString = this.pea.iterator();
          if (paramString.hasNext())
          {
            i locali = (i)paramString.next();
            if (!paramm.equals(locali.pcU))
              break label316;
            this.pea.remove(locali);
            this.mCount = this.pea.size();
          }
        }
      }
      label437: showOptionMenu(true);
      findViewById(2131825833).setVisibility(8);
    }
  }

  protected final void cw(List<i> paramList)
  {
    AppMethodBeat.i(43869);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(43869);
    while (true)
    {
      return;
      if (this.pea == null)
        this.pea = new ArrayList();
      for (int i = 0; i < paramList.size(); i++)
      {
        i locali = (i)paramList.get(i);
        if (!Uy(locali.pcU))
          this.pea.add(locali);
      }
      AppMethodBeat.o(43869);
    }
  }

  protected final void cx(List<d> paramList)
  {
    AppMethodBeat.i(43873);
    if (paramList == null)
      AppMethodBeat.o(43873);
    while (true)
    {
      return;
      for (int i = 0; i < paramList.size(); i++)
      {
        d locald = (d)paramList.get(i);
        if (locald != null)
        {
          String str = eR(locald.year, locald.month);
          this.ped.put(str, locald.pcO);
        }
      }
      AppMethodBeat.o(43873);
    }
  }

  protected void fz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(43865);
    a(new g(paramString1, paramString2), true, true);
    AppMethodBeat.o(43865);
  }

  public final int getLayoutId()
  {
    return 2130970053;
  }

  public final void initView()
  {
    AppMethodBeat.i(43867);
    if ((com.tencent.mm.wallet_core.a.aE(this) instanceof com.tencent.mm.plugin.order.a.a))
    {
      this.isLoading = true;
      bZh();
    }
    setMMTitle(2131301321);
    this.emT = ((MMLoadMoreListView)findViewById(2131825832));
    this.pdZ = new MallOrderRecordListUI.a(this);
    this.emT.setAdapter(this.pdZ);
    this.emT.setOnItemClickListener(new MallOrderRecordListUI.1(this));
    this.emT.setOnItemLongClickListener(new MallOrderRecordListUI.2(this));
    this.emT.setOnLoadMoreListener(new MallOrderRecordListUI.3(this));
    Object localObject = new uo();
    ((uo)localObject).cQJ.cQL = "6";
    ((uo)localObject).callback = new MallOrderRecordListUI.4(this, (uo)localObject);
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.plugin.order.a.b.bYR().aVU();
    this.pdZ.notifyDataSetChanged();
    localObject = h.pYm;
    com.tencent.mm.plugin.order.a.b.bYR();
    ((h)localObject).e(11036, new Object[] { Integer.valueOf(com.tencent.mm.plugin.order.a.b.bYU().bYZ()) });
    AppMethodBeat.o(43867);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43861);
    super.onCreate(paramBundle);
    this.mHandler = new ak();
    bZf();
    initView();
    this.Lp = 0;
    this.peb = null;
    AppMethodBeat.o(43861);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43871);
    bZg();
    super.onDestroy();
    AppMethodBeat.o(43871);
  }

  public void onResume()
  {
    AppMethodBeat.i(43864);
    super.onResume();
    if (this.pdZ != null)
      this.pdZ.notifyDataSetChanged();
    AppMethodBeat.o(43864);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI
 * JD-Core Version:    0.6.2
 */