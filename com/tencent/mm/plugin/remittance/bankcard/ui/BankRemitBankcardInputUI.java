package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.ListPopupWindow;
import android.widget.Button;
import android.widget.Filter.FilterListener;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.remittance.bankcard.a.k;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.protocal.protobuf.bof;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankRemitBankcardInputUI extends BankRemitBaseUI
{
  private String few = "";
  private Button gHn;
  private Dialog ohk = null;
  private TransferRecordParcel pMA;
  private boolean pMB = true;
  private boolean pMC = false;
  private boolean pMD = false;
  private boolean pME = false;
  private com.tencent.mm.plugin.remittance.bankcard.a.g pMF = null;
  private boolean pMG = false;
  private boolean pMH = false;
  private boolean pMI = true;
  private boolean pMJ = false;
  private boolean pMK = false;
  private boolean pML = false;
  private String pMM;
  private String pMN;
  private CdnImageView pMa;
  private WalletFormView pMh;
  private WalletFormView pMi;
  private WalletFormView pMj;
  private WalletFormView pMk;
  private com.tencent.mm.ui.widget.a.d pMl;
  private ListPopupWindow pMm;
  private c pMn;
  private Filter.FilterListener pMo;
  private ArrayList<TransferRecordParcel> pMp;
  private ArrayList<TransferRecordParcel> pMq;
  private int pMr;
  private String pMs;
  private String pMt;
  private String pMu;
  private String pMv;
  private String pMw;
  private String pMx;
  private EnterTimeParcel pMy;
  private BankcardElemParcel pMz;

  private void Y(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(44553);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by seq: %s", new Object[] { paramString1 });
    a(new com.tencent.mm.plugin.remittance.bankcard.a.a(paramString1, paramString2, paramString3), false, false);
    AppMethodBeat.o(44553);
  }

  private static void a(TransferRecordParcel paramTransferRecordParcel, List<TransferRecordParcel> paramList)
  {
    AppMethodBeat.i(44551);
    int i;
    if (paramList != null)
    {
      i = paramList.size() - 1;
      if (i >= 0)
      {
        TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)paramList.get(i);
        if (localTransferRecordParcel.pMd.equals(paramTransferRecordParcel.pMd))
        {
          localTransferRecordParcel.pMg = paramTransferRecordParcel.pMg;
          AppMethodBeat.o(44551);
        }
      }
    }
    while (true)
    {
      return;
      i--;
      break;
      AppMethodBeat.o(44551);
    }
  }

  private void cfa()
  {
    AppMethodBeat.i(44556);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "do operation");
    this.pMK = true;
    a(new k(), false, false);
    AppMethodBeat.o(44556);
  }

  private void cfb()
  {
    AppMethodBeat.i(44557);
    this.pMh.getInfoIv().setVisibility(0);
    this.pMh.getInfoIv().setClickable(true);
    this.pMh.getInfoIv().setEnabled(true);
    this.pMh.getInfoIv().setOnClickListener(new BankRemitBankcardInputUI.20(this));
    AppMethodBeat.o(44557);
  }

  private void cfc()
  {
    AppMethodBeat.i(44558);
    this.pMi.cex();
    this.pMi.setContentEnabled(false);
    this.pMD = true;
    AppMethodBeat.o(44558);
  }

  private void cfd()
  {
    AppMethodBeat.i(44559);
    this.pMj.setClickable(false);
    this.pME = true;
    AppMethodBeat.o(44559);
  }

  private void cfe()
  {
    AppMethodBeat.i(44560);
    if (this.pMA != null)
    {
      this.pMh.setText(this.pMA.pMf);
      this.pMC = true;
      this.pMi.setText(getString(2131297441, new Object[] { this.pMA.pMe }));
      this.pMj.setText(this.pMA.nuL);
      this.pMa.setUrl(this.pMA.pLH);
      cfc();
      cfd();
    }
    AppMethodBeat.o(44560);
  }

  private void cff()
  {
    AppMethodBeat.i(44561);
    if (this.pMz != null)
    {
      this.pMj.setText(this.pMz.nuL);
      this.pMa.setUrl(this.pMz.pLH);
    }
    AppMethodBeat.o(44561);
  }

  private void cfg()
  {
    AppMethodBeat.i(44562);
    if (this.pMy != null)
      if (!bo.isNullOrNil(this.pMy.color))
      {
        this.pMk.setContentTextColor(Color.parseColor(this.pMy.color));
        this.pMk.setText(this.pMy.pLR);
        this.pMk.setVisibility(0);
        AppMethodBeat.o(44562);
      }
    while (true)
    {
      return;
      this.pMk.setContentTextColorRes(2131689761);
      break;
      if ((this.pMz != null) && (!bo.isNullOrNil(this.pMz.pLK)))
      {
        this.pMk.setText(this.pMz.pLK);
        if (!bo.isNullOrNil(this.pMz.pLL))
          this.pMk.setContentTextColor(Color.parseColor(this.pMz.pLL));
        while (true)
        {
          this.pMk.setVisibility(0);
          AppMethodBeat.o(44562);
          break;
          this.pMk.setContentTextColorRes(2131689761);
        }
      }
      this.pMk.setVisibility(8);
      AppMethodBeat.o(44562);
    }
  }

  private void cfh()
  {
    AppMethodBeat.i(44563);
    if (this.pMk.getVisibility() == 0)
    {
      this.pMj.setBackground(getResources().getDrawable(2130840691));
      AppMethodBeat.o(44563);
    }
    while (true)
    {
      return;
      this.pMj.setBackground(getResources().getDrawable(2130837848));
      AppMethodBeat.o(44563);
    }
  }

  private void cfi()
  {
    AppMethodBeat.i(44564);
    if ((!bo.isNullOrNil(this.pMh.getText())) && (!this.pMh.getText().trim().isEmpty()) && (!bo.isNullOrNil(this.pMi.getText())) && (this.pMh.asa()) && (!this.pMi.getText().trim().isEmpty()) && (this.pMi.asa()) && (!bo.isNullOrNil(this.pMj.getText())) && (this.pMk.getVisibility() == 0) && (!bo.isNullOrNil(this.pMk.getText())) && (this.pMz != null) && (bo.isNullOrNil(this.pMz.pLM)))
    {
      this.gHn.setEnabled(true);
      AppMethodBeat.o(44564);
    }
    while (true)
    {
      return;
      this.gHn.setEnabled(false);
      AppMethodBeat.o(44564);
    }
  }

  private void cfj()
  {
    AppMethodBeat.i(44565);
    if ((this.pMz != null) && (!bo.isNullOrNil(this.pMz.pLK)))
    {
      this.pMy = null;
      AppMethodBeat.o(44565);
    }
    while (true)
    {
      return;
      if ((this.pMz != null) && (this.pMz.pLN != null))
      {
        Iterator localIterator = this.pMz.pLN.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            EnterTimeParcel localEnterTimeParcel = (EnterTimeParcel)localIterator.next();
            if (localEnterTimeParcel.pLT > 0)
            {
              this.pMy = localEnterTimeParcel;
              AppMethodBeat.o(44565);
              break;
            }
          }
      }
      AppMethodBeat.o(44565);
    }
  }

  private void kf(boolean paramBoolean)
  {
    AppMethodBeat.i(44554);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "do fetch transfer record: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      a(new com.tencent.mm.plugin.remittance.bankcard.a.m(), true, false);
      AppMethodBeat.o(44554);
    }
    while (true)
    {
      return;
      a(new com.tencent.mm.plugin.remittance.bankcard.a.m(), false, false);
      AppMethodBeat.o(44554);
    }
  }

  private static void p(String paramString, List<TransferRecordParcel> paramList)
  {
    AppMethodBeat.i(44552);
    int i;
    if (paramList != null)
    {
      i = paramList.size() - 1;
      if (i >= 0)
      {
        TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)paramList.get(i);
        if (localTransferRecordParcel.pMd.equals(paramString))
        {
          paramList.remove(localTransferRecordParcel);
          AppMethodBeat.o(44552);
        }
      }
    }
    while (true)
    {
      return;
      i--;
      break;
      AppMethodBeat.o(44552);
    }
  }

  private void s(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(44555);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "do check bank bind: %s %s", new Object[] { paramString3, paramString4 });
    ab.d("MicroMsg.BankRemitBankcardInputUI", "payeeName: %s, bankCardNo: %s", new Object[] { paramString1, paramString2 });
    a(new com.tencent.mm.plugin.remittance.bankcard.a.d(paramString1, paramString2, paramString3, paramString4), true, true);
    AppMethodBeat.o(44555);
  }

  public final boolean c(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(44548);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " scenetype:" + paramm.getType());
    if ((paramm instanceof com.tencent.mm.plugin.remittance.bankcard.a.a))
    {
      paramString = (com.tencent.mm.plugin.remittance.bankcard.a.a)paramm;
      if (!paramString.pLt.equals(this.pMA.pMd))
      {
        ab.i("MicroMsg.BankRemitBankcardInputUI", "outdated request: %s, %s", new Object[] { paramString.pLt, this.pMu });
        AppMethodBeat.o(44548);
        return bool;
      }
      paramString.a(new BankRemitBankcardInputUI.3(this, paramString)).b(new BankRemitBankcardInputUI.2(this, paramString)).c(new BankRemitBankcardInputUI.28(this));
    }
    while (true)
    {
      AppMethodBeat.o(44548);
      bool = false;
      break;
      if ((paramm instanceof com.tencent.mm.plugin.remittance.bankcard.a.g))
      {
        paramString = (com.tencent.mm.plugin.remittance.bankcard.a.g)paramm;
        if (paramString == this.pMF)
        {
          ab.i("MicroMsg.BankRemitBankcardInputUI", "reset pending scene");
          this.pMF = null;
        }
        if (!paramString.cvZ.equals(this.pMi.getMD5Value()))
        {
          ab.i("MicroMsg.BankRemitBankcardInputUI", "outdated card request: %s, %s", new Object[] { paramString.cvZ, this.pMi.getMD5Value() });
          AppMethodBeat.o(44548);
          break;
        }
        paramString.a(new BankRemitBankcardInputUI.6(this, paramString)).b(new BankRemitBankcardInputUI.5(this, paramString)).c(new BankRemitBankcardInputUI.4(this));
        continue;
      }
      if ((paramm instanceof com.tencent.mm.plugin.remittance.bankcard.a.m))
      {
        paramString = (com.tencent.mm.plugin.remittance.bankcard.a.m)paramm;
        this.pMH = true;
        paramString.a(new BankRemitBankcardInputUI.9(this, paramString)).b(new p.a()
        {
          public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
          {
            AppMethodBeat.i(44520);
            ab.e("MicroMsg.BankRemitBankcardInputUI", "records response error: %s, %s", new Object[] { Integer.valueOf(paramString.pLE.kCl), paramString.pLE.kCm });
            if (!bo.isNullOrNil(paramString.pLE.kCm))
              Toast.makeText(BankRemitBankcardInputUI.this, paramString.pLE.kCm, 1).show();
            BankRemitBankcardInputUI.c(BankRemitBankcardInputUI.this, true);
            AppMethodBeat.o(44520);
          }
        }).c(new BankRemitBankcardInputUI.7(this));
      }
      else if ((paramm instanceof com.tencent.mm.plugin.remittance.bankcard.a.d))
      {
        paramString = (com.tencent.mm.plugin.remittance.bankcard.a.d)paramm;
        paramString.a(new BankRemitBankcardInputUI.13(this, paramString)).b(new BankRemitBankcardInputUI.11(this, paramString)).c(new p.a()
        {
          public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
          {
            AppMethodBeat.i(44522);
            ab.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramAnonymousm });
            AppMethodBeat.o(44522);
          }
        });
      }
      else if ((paramm instanceof k))
      {
        paramString = (k)paramm;
        paramString.a(new BankRemitBankcardInputUI.16(this, paramString)).b(new BankRemitBankcardInputUI.15(this, paramString)).c(new BankRemitBankcardInputUI.14(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968813;
  }

  public final void initView()
  {
    AppMethodBeat.i(44547);
    this.pMh = ((WalletFormView)findViewById(2131821635));
    this.pMi = ((WalletFormView)findViewById(2131821636));
    this.pMj = ((WalletFormView)findViewById(2131821637));
    this.pMa = ((CdnImageView)this.pMj.findViewById(2131821633));
    this.pMk = ((WalletFormView)findViewById(2131821638));
    this.gHn = ((Button)findViewById(2131821639));
    this.pMh.setFilterChar("\\x20\\t\\r\\n".toCharArray());
    this.pMh.a(new BankRemitBankcardInputUI.22(this));
    this.pMh.setOnEditorActionListener(new BankRemitBankcardInputUI.23(this));
    this.pMh.dOS();
    com.tencent.mm.wallet_core.ui.formview.a.b(this.pMi);
    a(this.pMi, 2, false, true);
    this.pMi.a(new BankRemitBankcardInputUI.24(this));
    this.pMj.setOnClickListener(new BankRemitBankcardInputUI.25(this));
    this.pMk.setOnClickListener(new BankRemitBankcardInputUI.26(this));
    this.gHn.setOnClickListener(new BankRemitBankcardInputUI.27(this));
    cfb();
    cfi();
    AppMethodBeat.o(44547);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(44550);
    Object localObject2;
    if (paramInt1 == 1)
    {
      Object localObject1;
      Iterator localIterator;
      if (paramInt2 == -1)
      {
        this.pMB = false;
        this.pMu = paramIntent.getStringExtra("key_bank_card_seqno");
        localObject1 = this.pMu;
        if (this.pMp == null)
          break label240;
        localIterator = this.pMp.iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          localObject2 = (TransferRecordParcel)localIterator.next();
        }
        while (!((TransferRecordParcel)localObject2).pMd.equals(localObject1));
      }
      while (true)
      {
        this.pMA = ((TransferRecordParcel)localObject2);
        cfe();
        cfi();
        if (this.pMA != null)
          Y(this.pMA.pMd, this.pMt, this.pMA.pbn);
        al.n(new BankRemitBankcardInputUI.17(this), 50L);
        ab.i("MicroMsg.BankRemitBankcardInputUI", "resultCode: %s", new Object[] { Integer.valueOf(paramInt2) });
        if (paramIntent == null)
          break label536;
        localObject2 = paramIntent.getStringArrayListExtra("key_delete_seq_no_list");
        paramIntent = paramIntent.getParcelableArrayListExtra("key_modified_record_list");
        if (localObject2 == null)
          break;
        localObject1 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          p((String)localObject2, this.pMp);
          p((String)localObject2, this.pMq);
        }
        label240: if (this.pMq != null)
        {
          localIterator = this.pMq.iterator();
          while (true)
            if (localIterator.hasNext())
            {
              localObject2 = (TransferRecordParcel)localIterator.next();
              if (((TransferRecordParcel)localObject2).pMd.equals(localObject1))
                break;
            }
        }
        localObject2 = null;
      }
      if (paramIntent != null)
      {
        paramIntent = paramIntent.iterator();
        while (paramIntent.hasNext())
        {
          localObject2 = (TransferRecordParcel)paramIntent.next();
          a((TransferRecordParcel)localObject2, this.pMp);
          a((TransferRecordParcel)localObject2, this.pMq);
        }
      }
      AppMethodBeat.o(44550);
    }
    while (true)
    {
      return;
      if (paramInt1 == 3)
      {
        if (paramInt2 == -1)
        {
          paramInt1 = paramIntent.getIntExtra("key_enter_time_scene", -1);
          if ((this.pMz != null) && (this.pMz.pLN != null))
          {
            localObject2 = this.pMz.pLN.iterator();
            while (((Iterator)localObject2).hasNext())
            {
              paramIntent = (EnterTimeParcel)((Iterator)localObject2).next();
              if (paramIntent.pLQ == paramInt1)
                this.pMy = paramIntent;
            }
          }
          while (true)
          {
            cfg();
            cfi();
            AppMethodBeat.o(44550);
            break;
            ab.w("MicroMsg.BankRemitBankcardInputUI", "can't find the right enter scene: %d", new Object[] { Integer.valueOf(paramInt1) });
          }
        }
      }
      else
      {
        if (paramInt1 == 2)
        {
          if (paramInt2 != -1)
            break label536;
          this.pMz = ((BankcardElemParcel)paramIntent.getParcelableExtra("key_bank_card_elem_parcel"));
          cff();
          cfj();
          cfg();
          cfh();
          cfi();
          AppMethodBeat.o(44550);
          continue;
        }
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
      }
      label536: AppMethodBeat.o(44550);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44546);
    super.onCreate(paramBundle);
    dyb();
    initView();
    paramBundle = new uo();
    paramBundle.cQJ.cQL = "12";
    paramBundle.callback = new BankRemitBankcardInputUI.1(this, paramBundle);
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
    nf(1348);
    nf(1542);
    nf(1378);
    nf(1349);
    nf(1280);
    this.pMx = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTS, ""));
    kf(false);
    cfa();
    setMMTitle(2131297489);
    addIconOptionMenu(0, 2131230740, new BankRemitBankcardInputUI.12(this));
    h.pYm.e(14673, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(44546);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44549);
    super.onDestroy();
    ng(1348);
    ng(1542);
    ng(1378);
    ng(1349);
    ng(1280);
    AppMethodBeat.o(44549);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI
 * JD-Core Version:    0.6.2
 */