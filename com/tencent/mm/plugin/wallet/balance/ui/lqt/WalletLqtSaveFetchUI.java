package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.a.a.aa;
import com.tencent.mm.plugin.wallet.balance.a.a.aa.d;
import com.tencent.mm.plugin.wallet.balance.a.a.p;
import com.tencent.mm.plugin.wallet.balance.a.a.p.a;
import com.tencent.mm.plugin.wallet.balance.a.a.y.c;
import com.tencent.mm.plugin.wallet.balance.a.a.z.6;
import com.tencent.mm.plugin.wallet.balance.a.a.z.7;
import com.tencent.mm.plugin.wallet.balance.a.a.z.8;
import com.tencent.mm.plugin.wallet.balance.a.a.z.9;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.protocal.protobuf.bfi;
import com.tencent.mm.protocal.protobuf.bqr;
import com.tencent.mm.protocal.protobuf.hc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class WalletLqtSaveFetchUI extends WalletLqtBasePresenterUI
{
  private int accountType;
  private Dialog gnn;
  private int mode;
  private HashMap<String, Integer> pas;
  private Bankcard tgC;
  private com.tencent.mm.plugin.wallet.balance.a.a.x tgd;
  private com.tencent.mm.plugin.wallet.balance.a.a.y tge;
  private TextView tkA;
  private WalletLqtArriveTimeLayout tkB;
  private ScrollView tkC;
  private WcPayKeyboard tkD;
  private CharSequence tkE;
  private Bankcard tkF;
  private int tkG;
  private String tkH;
  private String tkI;
  private long tkJ;
  private String tkK;
  private boolean tkL;
  private List<Bankcard> tkM;
  private boolean tkN;
  private p.a tkO;
  private com.tencent.mm.plugin.wallet.balance.a.a.z tkm;
  private aa tkn;
  private ViewGroup tko;
  private WalletFormView tkp;
  private TextView tkq;
  private TextView tkr;
  private ImageView tks;
  private TextView tkt;
  private TextView tku;
  private ViewGroup tkv;
  private TextView tkw;
  private CheckBox tkx;
  private TextView tky;
  private TextView tkz;

  public WalletLqtSaveFetchUI()
  {
    AppMethodBeat.i(45676);
    this.tgd = ((com.tencent.mm.plugin.wallet.balance.a.a.x)Z(com.tencent.mm.plugin.wallet.balance.a.a.x.class));
    this.tge = ((com.tencent.mm.plugin.wallet.balance.a.a.y)V(com.tencent.mm.plugin.wallet.balance.a.a.y.class));
    this.tkm = new com.tencent.mm.plugin.wallet.balance.a.a.z(this.tgd, this.tge, this);
    this.tkn = new aa(this.tkm);
    this.tkJ = -1L;
    this.tkL = false;
    this.tkN = true;
    this.tkO = new WalletLqtSaveFetchUI.12(this);
    this.pas = new HashMap();
    AppMethodBeat.o(45676);
  }

  private void cNn()
  {
    AppMethodBeat.i(45679);
    WalletLqtArriveTimeLayout localWalletLqtArriveTimeLayout = this.tkB;
    localWalletLqtArriveTimeLayout.thY = false;
    if (localWalletLqtArriveTimeLayout.thU != null)
      localWalletLqtArriveTimeLayout.thU.clear();
    localWalletLqtArriveTimeLayout.thW = null;
    localWalletLqtArriveTimeLayout.thV.clear();
    localWalletLqtArriveTimeLayout.setVisibility(4);
    AppMethodBeat.o(45679);
  }

  private List<Bankcard> cNo()
  {
    AppMethodBeat.i(45682);
    Object localObject1 = p.tfu;
    boolean bool;
    Object localObject2;
    Iterator localIterator;
    if (this.mode == 1)
    {
      bool = true;
      localObject2 = ((p)localObject1).mJ(bool);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((List)localObject2).size() != 0);
      }
      else
      {
        com.tencent.mm.plugin.wallet.a.s.cNC();
        localObject1 = com.tencent.mm.plugin.wallet.a.s.cND().cQF();
      }
      localObject2 = new LinkedList();
      if (localObject1 != null)
        localIterator = ((List)localObject1).iterator();
    }
    else
    {
      while (true)
      {
        if (!localIterator.hasNext())
          break label194;
        localObject1 = (Bankcard)localIterator.next();
        if (((Bankcard)localObject1).cPc())
        {
          com.tencent.mm.plugin.wallet.a.s.cNC();
          if (!com.tencent.mm.plugin.wallet.a.s.cND().cQi())
          {
            ((List)localObject2).add(localObject1);
            continue;
            bool = false;
            break;
          }
        }
        if ((this.mode == 1) && ((((Bankcard)localObject1).field_support_lqt_turn_in == 1) || (((Bankcard)localObject1).cPc())))
          ((List)localObject2).add(localObject1);
        if ((this.mode == 2) && ((((Bankcard)localObject1).field_support_lqt_turn_out == 1) || (((Bankcard)localObject1).cPc())))
          ((List)localObject2).add(localObject1);
      }
    }
    label194: AppMethodBeat.o(45682);
    return localObject2;
  }

  private void cNp()
  {
    AppMethodBeat.i(45685);
    this.tkC.postDelayed(new WalletLqtSaveFetchUI.13(this), 100L);
    AppMethodBeat.o(45685);
  }

  private static double gG(String paramString1, String paramString2)
  {
    double d1 = 0.0D;
    AppMethodBeat.i(45696);
    try
    {
      double d2 = bo.getDouble(paramString1.trim(), 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d2 == 0.0D);
      for (paramString1 = "0"; ; paramString1 = paramString1.trim())
      {
        localBigDecimal.<init>(paramString1);
        paramString1 = new java/math/BigDecimal;
        paramString1.<init>(paramString2.trim());
        d2 = localBigDecimal.divide(paramString1, 5, 2).doubleValue();
        d1 = d2;
        AppMethodBeat.o(45696);
        return d1;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
        AppMethodBeat.o(45696);
      }
    }
  }

  private static int gH(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(45697);
    try
    {
      double d1 = bo.getDouble(paramString1, 0.0D);
      double d2 = bo.getDouble(paramString2, 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d1 == 0.0D)
        paramString1 = "0";
      localBigDecimal.<init>(paramString1);
      paramString1 = new java/math/BigDecimal;
      if (d2 == 0.0D)
        paramString2 = "0";
      paramString1.<init>(paramString2);
      j = localBigDecimal.multiply(paramString1).intValue();
      AppMethodBeat.o(45697);
      return j;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
        AppMethodBeat.o(45697);
        int j = i;
      }
    }
  }

  private void mP(boolean paramBoolean)
  {
    AppMethodBeat.i(45681);
    Object localObject1 = p.tfu;
    boolean bool;
    Object localObject2;
    Iterator localIterator;
    if (this.mode == 1)
    {
      bool = true;
      localObject2 = ((p)localObject1).mJ(bool);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((List)localObject2).size() != 0);
      }
      else
      {
        com.tencent.mm.plugin.wallet.a.s.cNC();
        localObject1 = com.tencent.mm.plugin.wallet.a.s.cND().cQF();
      }
      localObject2 = new LinkedList();
      if (localObject1 != null)
        localIterator = ((List)localObject1).iterator();
    }
    else
    {
      while (true)
      {
        if (!localIterator.hasNext())
          break label188;
        localObject1 = (Bankcard)localIterator.next();
        if (((Bankcard)localObject1).cPc())
        {
          com.tencent.mm.plugin.wallet.a.s.cNC();
          if (!com.tencent.mm.plugin.wallet.a.s.cND().cQi())
          {
            ((List)localObject2).add(localObject1);
            continue;
            bool = false;
            break;
          }
        }
        if ((this.mode == 1) && (((Bankcard)localObject1).field_support_lqt_turn_in == 1))
          ((List)localObject2).add(localObject1);
        if ((this.mode == 2) && (((Bankcard)localObject1).field_support_lqt_turn_out == 1))
          ((List)localObject2).add(localObject1);
      }
    }
    label188: int i;
    if (paramBoolean)
    {
      localObject1 = p.tfu;
      if (this.mode == 1);
      for (bool = true; ; bool = false)
      {
        this.tgC = ((p)localObject1).mI(bool);
        if ((bo.isNullOrNil(this.tkK)) || (this.tgC != null))
          break;
        for (i = 0; i < ((List)localObject2).size(); i++)
        {
          localObject1 = (Bankcard)((List)localObject2).get(i);
          if ((!bo.isNullOrNil(((Bankcard)localObject1).field_bindSerial)) && (this.tkK.equals(((Bankcard)localObject1).field_bindSerial)))
            this.tgC = ((Bankcard)localObject1);
        }
      }
    }
    if (!bo.isNullOrNil(this.tkK))
      for (i = 0; i < ((List)localObject2).size(); i++)
      {
        localObject1 = (Bankcard)((List)localObject2).get(i);
        if ((!bo.isNullOrNil(((Bankcard)localObject1).field_bindSerial)) && (this.tkK.equals(((Bankcard)localObject1).field_bindSerial)))
          this.tgC = ((Bankcard)localObject1);
      }
    if (this.tgC != null)
    {
      localObject1 = this.tgC.field_bindSerial;
      ab.i("MicroMsg.WalletLqtSaveFetchUI", "defaultBankcard: %s, save mCurrentSerial: %s, useDefault: %s", new Object[] { localObject1, this.tkK, Boolean.valueOf(paramBoolean) });
      if (this.tgC != null)
        break label464;
      com.tencent.mm.plugin.wallet.a.s.cNC();
      this.tgC = com.tencent.mm.plugin.wallet.a.s.cND().thy;
      if (this.tgC != null)
        break label464;
      finish();
      AppMethodBeat.o(45681);
    }
    while (true)
    {
      return;
      localObject1 = "";
      break;
      label464: if (this.tgC.cPc())
      {
        this.tkr.setText(this.tgC.field_desc);
        label488: this.tkr.setText(this.tgC.field_desc);
        this.tkr.setVisibility(0);
        this.tks.setTag(this.tgC.field_bindSerial);
        if (this.tks != null)
        {
          localObject1 = "";
          localObject2 = com.tencent.mm.plugin.wallet_core.d.b.i(this, this.tgC.field_bankcardType, this.tgC.cPb());
          if (localObject2 != null)
            localObject1 = ((com.tencent.mm.plugin.wallet_core.model.e)localObject2).oRi;
          this.tks.setImageBitmap(null);
          if (!this.tgC.cPc())
            break label982;
          this.tks.setImageResource(2130840657);
        }
        label593: this.tky.setVisibility(8);
        this.tkz.setVisibility(8);
        if ((this.mode != 2) && (this.mode == 1) && (!this.tgC.cPc()) && (!bo.isNullOrNil(this.tgC.field_avail_save_wording)))
        {
          this.tky.setText(this.tgC.field_avail_save_wording);
          this.tky.setVisibility(0);
        }
        if (this.mode != 1)
          break label1060;
        setMMTitle(getString(2131305013));
        localObject1 = getIntent().getStringArrayListExtra("lqt_protocol_list");
        paramBoolean = getIntent().getBooleanExtra("lqt_is_show_protocol", false);
        if ((localObject1 == null) || (((ArrayList)localObject1).size() <= 0) || (!paramBoolean))
          break label1048;
        this.tkv.setVisibility(0);
        this.tkx.setChecked(getIntent().getBooleanExtra("lqt_is_agree_protocol", false));
        this.tkv.setOnClickListener(new WalletLqtSaveFetchUI.4(this));
        this.tkx.setOnCheckedChangeListener(new WalletLqtSaveFetchUI.5(this));
        localObject2 = getString(2131305001);
        i = ((String)localObject2).length();
        localObject2 = new SpannableString((String)localObject2 + getString(2131305002));
        ((SpannableString)localObject2).setSpan(new a(new WalletLqtSaveFetchUI.6(this, (ArrayList)localObject1)), i, ((SpannableString)localObject2).length(), 17);
        this.tkw.setText((CharSequence)localObject2);
        this.tkw.setClickable(true);
        this.tkw.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
      }
      while (true)
        if (this.mode == 1)
        {
          if ((this.tgC != null) && (this.tgC.cPc()))
          {
            this.tkt.setText(this.tkE);
            AppMethodBeat.o(45681);
            break;
            this.tkr.setText(getString(2131304572, new Object[] { this.tgC.field_bankName, this.tgC.field_bankcardTail }));
            break label488;
            label982: localObject1 = com.tencent.mm.platformtools.x.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject1));
            com.tencent.mm.platformtools.x.a(new WalletLqtSaveFetchUI.20(this));
            if (localObject1 == null)
              break label593;
            localObject1 = d.a((Bitmap)localObject1, getResources().getDimensionPixelOffset(2131428760), getResources().getDimensionPixelOffset(2131428760), true, false);
            this.tks.setImageBitmap((Bitmap)localObject1);
            break label593;
            label1048: this.tkv.setVisibility(8);
            continue;
            label1060: if (this.mode != 2)
              continue;
            findViewById(2131828875).setVisibility(8);
            this.tkv.setVisibility(8);
            setMMTitle(getString(2131304942));
            this.tku.setVisibility(8);
            localObject1 = com.tencent.mm.plugin.wallet.balance.a.a.s.cMK();
            if ((this.tgC != null) && (this.tgC.cPc()))
            {
              i = getIntent().getIntExtra("lqt_balance", 0);
              if (com.tencent.mm.platformtools.ae.gjv)
                i = 50000000;
              if (i <= 0)
                continue;
              localObject1 = getString(2131304936, new Object[] { Double.valueOf(gG(String.valueOf(i), "100")) });
              j = ((String)localObject1).length();
              localObject1 = new SpannableString((String)localObject1 + getString(2131304939));
              ((SpannableString)localObject1).setSpan(new a(new WalletLqtSaveFetchUI.17(this, i)), j, ((SpannableString)localObject1).length(), 18);
              this.tkE = ((CharSequence)localObject1);
              this.tkt.setText((CharSequence)localObject1);
              continue;
            }
            if (((com.tencent.mm.plugin.wallet.balance.a.a.s)localObject1).tfI == null)
            {
              i = 0;
              label1281: if (((com.tencent.mm.plugin.wallet.balance.a.a.s)localObject1).tfI != null)
                break label1455;
            }
            label1455: for (int j = 0; ; j = ((com.tencent.mm.plugin.wallet.balance.a.a.s)localObject1).tfI.wJd)
            {
              if (com.tencent.mm.platformtools.ae.gjv)
              {
                i = 100000000;
                j = 50000000;
              }
              localObject2 = getString(2131304937, new Object[] { Double.valueOf(gG(String.valueOf(i), "100")), Double.valueOf(gG(String.valueOf(j), "100")) });
              i = ((String)localObject2).length();
              localObject2 = new SpannableString((String)localObject2 + getString(2131304938));
              ((SpannableString)localObject2).setSpan(new a(new WalletLqtSaveFetchUI.18(this, (com.tencent.mm.plugin.wallet.balance.a.a.s)localObject1)), i, ((SpannableString)localObject2).length(), 18);
              this.tkE = ((CharSequence)localObject2);
              this.tkt.setText((CharSequence)localObject2);
              break;
              i = ((com.tencent.mm.plugin.wallet.balance.a.a.s)localObject1).tfI.wJb;
              break label1281;
            }
          }
          this.tkt.setText("");
        }
      AppMethodBeat.o(45681);
    }
  }

  private void mQ(boolean paramBoolean)
  {
    AppMethodBeat.i(45686);
    this.tkD.Aff.setEnabled(paramBoolean);
    AppMethodBeat.o(45686);
  }

  private void mR(boolean paramBoolean)
  {
    AppMethodBeat.i(45687);
    if (paramBoolean)
      if (this.mode == 1)
        if (this.tkv.getVisibility() == 0)
          if ((this.tkx.isChecked()) && (this.tkL))
          {
            mQ(true);
            AppMethodBeat.o(45687);
          }
    while (true)
    {
      return;
      mQ(false);
      AppMethodBeat.o(45687);
      continue;
      if (this.tkL)
      {
        mQ(true);
        AppMethodBeat.o(45687);
        continue;
        if ((this.tkL) && (this.tkB.getVisibility() == 0) && ((this.tkB.getSelectRedeemType() != null) || (this.tkB.getRedeemTypeList() == null) || (this.tkB.getRedeemTypeList().isEmpty())))
        {
          if (this.tkB.getSelectRedeemType() == null);
          for (Integer localInteger = null; ; localInteger = Integer.valueOf(this.tkB.getSelectRedeemType().wOl))
          {
            ab.v("MicroMsg.WalletLqtSaveFetchUI", "redeem type: %s", new Object[] { localInteger });
            mQ(true);
            AppMethodBeat.o(45687);
            break;
          }
        }
        mQ(false);
      }
      else
      {
        AppMethodBeat.o(45687);
      }
    }
  }

  private void t(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(45680);
    ab.d("MicroMsg.WalletLqtSaveFetchUI", "update arrive time layout: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject;
    boolean bool;
    if (this.mode == 2)
      if (!this.tkB.thY)
      {
        localObject = com.tencent.mm.plugin.wallet.balance.a.a.s.cMK().tfI;
        if (localObject == null)
        {
          ab.w("MicroMsg.WalletLqtSaveFetchUI", "no cache!");
          AppMethodBeat.o(45680);
          return;
        }
        if (this.tgC.cPc())
        {
          ab.d("MicroMsg.WalletLqtSaveFetchUI", "show balance arrive time");
          this.tkB.setRedeemTypeList(((bfi)localObject).wJf);
          this.tkB.acj(paramString);
          if ((((bfi)localObject).wJf == null) || (((bfi)localObject).wJf.isEmpty()))
            break label292;
          bool = true;
        }
      }
    while (true)
    {
      ab.d("MicroMsg.WalletLqtSaveFetchUI", "show title: %s", new Object[] { Boolean.valueOf(bool) });
      cNp();
      AppMethodBeat.o(45680);
      break;
      if (((bfi)localObject).wJg != null)
      {
        Iterator localIterator = ((bfi)localObject).wJg.iterator();
        paramBoolean = false;
        label181: bool = paramBoolean;
        if (localIterator.hasNext())
        {
          localObject = (hc)localIterator.next();
          if (((hc)localObject).vJF.equals(this.tgC.field_bindSerial))
          {
            ab.d("MicroMsg.WalletLqtSaveFetchUI", "show bankcard arrive time");
            this.tkB.setRedeemTypeList(((hc)localObject).vJL);
            this.tkB.acj(paramString);
            if ((((hc)localObject).vJL != null) && (!((hc)localObject).vJL.isEmpty()))
              paramBoolean = true;
          }
          while (true)
          {
            break label181;
            this.tkB.acj(paramString);
            AppMethodBeat.o(45680);
            break;
          }
        }
      }
      else
      {
        label292: bool = false;
      }
    }
  }

  public final void Vz(String paramString)
  {
    AppMethodBeat.i(45694);
    Toast.makeText(this, paramString, 1).show();
    AppMethodBeat.o(45694);
  }

  public final void aDw()
  {
    AppMethodBeat.i(45692);
    if (this.gnn != null)
      this.gnn.dismiss();
    AppMethodBeat.o(45692);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(45690);
    com.tencent.mm.plugin.wallet.balance.a.a.z localz = this.tkm;
    ab.i("MicroMsg.LqtSaveFetchLogic", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.y))
    {
      com.tencent.mm.plugin.wallet.a.s.cNC();
      localz.tgk = com.tencent.mm.plugin.wallet.a.s.cND().thy;
      if (localz.glt != null)
      {
        localz.glt.B(new Object[] { paramm });
        localz.glt.resume();
      }
    }
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "onSceneEnd");
    cNm();
    boolean bool = super.c(paramInt1, paramInt2, paramString, paramm);
    AppMethodBeat.o(45690);
    return bool;
  }

  public final void cNm()
  {
    AppMethodBeat.i(45678);
    Object localObject;
    int i;
    if (this.mode == 1)
    {
      this.tkF = p.tfu.cMF();
      if (this.tkF == null)
      {
        com.tencent.mm.plugin.wallet.a.s.cNC();
        this.tkF = com.tencent.mm.plugin.wallet.a.s.cND().thy;
      }
      if (this.tkF != null)
      {
        localObject = p.tfu.cMG();
        i = p.tfu.cMH();
        if (i != 0)
          break label120;
        this.tkE = ((CharSequence)localObject);
      }
    }
    while (true)
    {
      if (this.tkt != null)
        this.tkt.setText(this.tkE);
      if (this.tko != null)
        this.tko.setVisibility(0);
      mP(true);
      AppMethodBeat.o(45678);
      return;
      label120: if (i == 1)
      {
        i = ((String)localObject).length();
        localObject = new SpannableString((String)localObject + getString(2131304912));
        ((SpannableString)localObject).setSpan(new a(new WalletLqtSaveFetchUI.16(this)), i + 1, ((SpannableString)localObject).length(), 18);
        this.tkE = ((CharSequence)localObject);
      }
      else
      {
        ab.w("MicroMsg.WalletLqtSaveFetchUI", "unknown func: %s", new Object[] { Integer.valueOf(i) });
        this.tkE = ((CharSequence)localObject);
      }
    }
  }

  public final void cNq()
  {
    boolean bool = true;
    AppMethodBeat.i(45693);
    p localp;
    if (this.mode == 1)
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUD, this.tkK);
      localp = p.tfu;
      if (this.mode != 1)
        break label114;
    }
    while (true)
    {
      if (localp.mH(bool))
      {
        ab.i("MicroMsg.WalletLqtSaveFetchUI", "saveOrfetchDone, req again after deal");
        this.tkn.tgs.gf(this.mode, this.accountType);
      }
      AppMethodBeat.o(45693);
      return;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUE, this.tkK);
      break;
      label114: bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130971122;
  }

  public final void mS(boolean paramBoolean)
  {
    AppMethodBeat.i(45691);
    if ((this.gnn == null) || (!this.gnn.isShowing()))
      if (paramBoolean)
      {
        this.gnn = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
        AppMethodBeat.o(45691);
      }
    while (true)
    {
      return;
      this.gnn = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
      AppMethodBeat.o(45691);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45689);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      this.tkn.tgs.gf(this.mode, this.accountType).f(new WalletLqtSaveFetchUI.15(this));
      AppMethodBeat.o(45689);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.wallet.balance.a.a.z localz = this.tkm;
      Object localObject;
      if ((paramInt1 == com.tencent.mm.plugin.wallet.balance.a.a.z.tgb) && (paramInt2 == -1))
      {
        paramIntent = (Orders)paramIntent.getParcelableExtra("key_orders");
        if ((paramIntent != null) && (paramIntent.tAq != null) && (paramIntent.tAq.size() > 0))
        {
          ab.i("MicroMsg.LqtSaveFetchLogic", "%s onActivityResult, doQueryPurchaseResult, accountType: %s, reqkey: %s", new Object[] { Integer.valueOf(localz.hashCode()), Integer.valueOf(localz.accountType), paramIntent.czZ });
          localz.cAa = ((Orders.Commodity)paramIntent.tAq.get(0)).cAa;
          paramIntent = (String)localz.tgl.get(paramIntent.czZ);
          if (!bo.isNullOrNil(paramIntent))
            localz.tgg = paramIntent;
          ab.i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult");
          localz.tgf.mS(false);
          paramIntent = localz.tgf.getIntent().getStringExtra("operate_id");
          localObject = localz.tge.tfX;
          f.a(localz.tgg, localz.cAa, Integer.valueOf(localz.tgh), Integer.valueOf(localz.accountType), paramIntent).c((com.tencent.mm.vending.c.a)localObject).f(new z.7(localz)).a(new z.6(localz));
        }
        AppMethodBeat.o(45689);
      }
      else
      {
        if ((paramInt1 == com.tencent.mm.plugin.wallet.balance.a.a.z.tgc) && (paramInt2 == -1))
        {
          localObject = paramIntent.getStringExtra("lqt_fetch_enc_pwd");
          paramIntent = paramIntent.getStringExtra("lqt_redeem_listid");
          ab.i("MicroMsg.LqtSaveFetchLogic", "%s onActivityResult, doRedeemFund, accountType: %s, redeemListId: %s", new Object[] { Integer.valueOf(localz.hashCode()), Integer.valueOf(localz.accountType), paramIntent });
          ab.i("MicroMsg.LqtSaveFetchLogic", "%s doRedeemFund, redeemListId: %s", new Object[] { Integer.valueOf(localz.hashCode()), paramIntent });
          if (bo.isNullOrNil(localz.tgj))
          {
            ab.i("MicroMsg.LqtSaveFetchLogic", "%s redeemListId is null!!, update from activity result: %s", new Object[] { Integer.valueOf(localz.hashCode()), paramIntent });
            localz.tgj = paramIntent;
          }
          paramIntent = localz.tgf.getIntent().getStringExtra("operate_id");
          localz.tgf.mS(true);
          y.c localc = localz.tge.tfY;
          f.a(Integer.valueOf(localz.tgi), localObject, localz.tgj, Integer.valueOf(localz.accountType), paramIntent).c(localc).f(new z.9(localz)).a(new z.8(localz));
        }
        AppMethodBeat.o(45689);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45677);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131689503));
    dyb();
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "WalletLqtSaveFetchUI onCreate");
    this.tkp = ((WalletFormView)findViewById(2131828873));
    this.tks = ((ImageView)findViewById(2131828609));
    this.tkt = ((TextView)findViewById(2131828874));
    this.tku = ((TextView)findViewById(2131828876));
    this.tkq = ((TextView)findViewById(2131828872));
    this.tkr = ((TextView)findViewById(2131828870));
    this.tkA = ((TextView)findViewById(2131820694));
    this.tkv = ((ViewGroup)findViewById(2131828878));
    this.tkw = ((TextView)findViewById(2131828880));
    this.tkx = ((CheckBox)findViewById(2131828879));
    this.tko = ((ViewGroup)findViewById(2131824519));
    this.tky = ((TextView)findViewById(2131828611));
    this.tkz = ((TextView)findViewById(2131828612));
    this.tkB = ((WalletLqtArriveTimeLayout)findViewById(2131828877));
    this.tkC = ((ScrollView)findViewById(2131828868));
    this.mode = getIntent().getIntExtra("lqt_save_fetch_mode", 1);
    this.tkG = getIntent().getIntExtra("lqt_max_redeem_amount", -1);
    this.tkH = getIntent().getStringExtra("lqt_redeem_invalid_amount_hint");
    this.tkI = getIntent().getStringExtra("lqt_profile_wording");
    this.accountType = getIntent().getIntExtra("lqt_account_type", 0);
    if (this.mode == 1)
    {
      com.tencent.mm.kernel.g.RQ();
      this.tkK = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUD, ""));
      if (bo.isNullOrNil(this.tkK))
      {
        com.tencent.mm.kernel.g.RQ();
        this.tkK = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUC, ""));
      }
      ab.i("MicroMsg.WalletLqtSaveFetchUI", "onCreate, accountType: %s, mode: %s, mCurrentSerial: %s", new Object[] { Integer.valueOf(this.accountType), Integer.valueOf(this.mode), this.tkK });
      this.tkp.getTitleTv().setText(com.tencent.mm.wallet_core.c.ae.dOd());
      this.tkD = ((WcPayKeyboard)findViewById(2131829144));
      if (this.mode != 1)
        break label805;
      e(this.tkp.getContentEt());
      this.tkD.setActionText(getString(2131305013));
      label494: if (this.mode != 1)
        break label838;
      this.tkq.setText(getString(2131305006));
      this.tkA.setText(getString(2131305009));
    }
    while (true)
    {
      this.tkp.a(new WalletLqtSaveFetchUI.7(this));
      this.obM = new WalletLqtSaveFetchUI.8(this);
      paramBundle = new WalletLqtSaveFetchUI.9(this);
      this.tkp.getContentEt().setOnEditorActionListener(new WalletLqtSaveFetchUI.10(this, paramBundle));
      if (!bo.isNullOrNil(this.tkI))
        this.tkD.setTipText(this.tkI);
      if (this.mode == 2)
        this.tkB.setCallback(new WalletLqtSaveFetchUI.11(this));
      this.tkt.setText("");
      this.tkt.setClickable(true);
      this.tkt.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
      mR(false);
      if (this.mode == 1)
        this.tko.setVisibility(4);
      if (this.tkr.findViewById(2131820693) != null)
        this.tkr.findViewById(2131820693).setVisibility(8);
      paramBundle = new WalletLqtSaveFetchUI.1(this);
      this.tkr.setOnClickListener(paramBundle);
      if (findViewById(2131828608) != null)
        findViewById(2131828608).setOnClickListener(paramBundle);
      cNm();
      p localp = p.tfu;
      paramBundle = this.tkO;
      localp.tft.add(paramBundle);
      AppMethodBeat.o(45677);
      return;
      com.tencent.mm.kernel.g.RQ();
      this.tkK = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUE, ""));
      break;
      label805: this.Ahz = false;
      e(this.tkp.getContentEt());
      this.tkD.setActionText(getString(2131304941));
      break label494;
      label838: if (this.mode == 2)
      {
        this.tkq.setText(getString(2131304924));
        this.tkA.setText(getString(2131304929));
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45695);
    super.onDestroy();
    p localp = p.tfu;
    p.a locala = this.tkO;
    localp.tft.remove(locala);
    this.tkm = null;
    this.tkn = null;
    AppMethodBeat.o(45695);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45684);
    boolean bool;
    if ((this.tkD.isShown()) && (bo.isNullOrNil(this.tkp.getText())))
    {
      dOz();
      bool = true;
      AppMethodBeat.o(45684);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(45684);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(45683);
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    paramIntent = cNo();
    if (this.mode == 1)
      this.tkn.tgs.gf(this.mode, this.accountType).f(new WalletLqtSaveFetchUI.2(this, paramIntent));
    AppMethodBeat.o(45683);
  }

  public void onResume()
  {
    AppMethodBeat.i(45688);
    super.onResume();
    AppMethodBeat.o(45688);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI
 * JD-Core Version:    0.6.2
 */