package com.tencent.mm.plugin.wallet_payu.order.ui;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.order.model.g;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.a;
import com.tencent.mm.plugin.wallet_payu.order.a.a;
import com.tencent.mm.protocal.protobuf.bjr;
import com.tencent.mm.protocal.protobuf.bkb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class PayUMallOrderRecordListUI extends MallOrderRecordListUI
{
  public final String AI(int paramInt)
  {
    AppMethodBeat.i(48436);
    String str = e.a(paramInt, new SimpleDateFormat("dd MMMM", Locale.ENGLISH), new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH));
    AppMethodBeat.o(48436);
    return str;
  }

  public final void bZf()
  {
    AppMethodBeat.i(48432);
    nf(1519);
    nf(1544);
    AppMethodBeat.o(48432);
  }

  public final void bZg()
  {
    AppMethodBeat.i(48433);
    ng(1519);
    ng(1544);
    AppMethodBeat.o(48433);
  }

  public final void bZh()
  {
    AppMethodBeat.i(48435);
    a(new a(this.Lp), true, true);
    AppMethodBeat.o(48435);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48437);
    Object localObject;
    boolean bool;
    if ((paramm instanceof a))
    {
      if (this.msu != null)
      {
        this.msu.dismiss();
        this.msu = null;
      }
      paramm = (a)paramm;
      localObject = ((bjr)paramm.ehh.fsH.fsP).wNb;
      paramString = new LinkedList();
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        bkb localbkb = (bkb)((Iterator)localObject).next();
        i locali = new i();
        locali.ncH = localbkb.ncH;
        locali.pde = localbkb.pde;
        locali.pdf = localbkb.pdf;
        locali.pcX = localbkb.pcX;
        locali.pda = localbkb.pda;
        locali.pcW = localbkb.pcW;
        locali.pdd = "0";
        locali.pcZ = localbkb.pcZ;
        locali.pdc = localbkb.pdc;
        locali.pdi = 1;
        locali.pdh = localbkb.pdh;
        locali.pdg = localbkb.pdg;
        locali.pdb = localbkb.pdb;
        locali.pcV = localbkb.wMU;
        locali.pcY = localbkb.pcY;
        locali.pcU = localbkb.pcU;
        paramString.add(locali);
      }
      cw(paramString);
      cx(null);
      this.mCount = this.pea.size();
      if (paramm.cTg() > this.mCount)
      {
        bool = true;
        this.ocG = bool;
        this.pdZ.notifyDataSetChanged();
        ab.d("MicroMsg.PayUMallOrderRecordListUI", "orders list count: " + this.mCount);
        ab.d("MicroMsg.PayUMallOrderRecordListUI", "orders list total record: " + paramm.cTg());
        ab.d("MicroMsg.PayUMallOrderRecordListUI", "orders list has more: " + this.ocG);
        this.mHandler.post(new PayUMallOrderRecordListUI.1(this));
        this.isLoading = false;
        label415: if ((this.mCount > 0) || (this.pea.size() != 0))
          break label657;
        showOptionMenu(false);
        findViewById(2131825833).setVisibility(0);
      }
    }
    while (true)
    {
      AppMethodBeat.o(48437);
      return true;
      bool = false;
      break;
      if (!(paramm instanceof g))
        break label415;
      if (this.msu != null)
      {
        this.msu.dismiss();
        this.msu = null;
      }
      paramString = (g)paramm;
      label536: if (paramString.bZa() == 2)
      {
        if (this.pea != null)
          this.pea.clear();
        this.mCount = 0;
        this.ocG = false;
        this.emT.dzO();
      }
      while (true)
      {
        this.mHandler.post(new PayUMallOrderRecordListUI.2(this));
        break;
        paramm = paramString.bZb();
        ab.d("MicroMsg.PayUMallOrderRecordListUI", "delete transId:".concat(String.valueOf(paramm)));
        if (!bo.isNullOrNil(paramm))
        {
          paramString = this.pea.iterator();
          if (paramString.hasNext())
          {
            localObject = (i)paramString.next();
            if (!paramm.equals(((i)localObject).pcU))
              break label536;
            this.pea.remove(localObject);
            this.mCount = this.pea.size();
          }
        }
      }
      label657: showOptionMenu(true);
      findViewById(2131825833).setVisibility(8);
    }
  }

  public final void fz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48434);
    a(new com.tencent.mm.plugin.wallet_payu.order.a.b(paramString1), true, true);
    AppMethodBeat.o(48434);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI
 * JD-Core Version:    0.6.2
 */