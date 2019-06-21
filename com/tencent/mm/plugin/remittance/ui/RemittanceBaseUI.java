package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.g.a.fw.a;
import com.tencent.mm.g.a.fx;
import com.tencent.mm.g.a.un;
import com.tencent.mm.g.b.a.bh;
import com.tencent.mm.g.b.a.bl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.remittance.model.aa;
import com.tencent.mm.plugin.remittance.model.t;
import com.tencent.mm.plugin.remittance.model.v;
import com.tencent.mm.plugin.remittance.model.v.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.rn;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.f.a;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@com.tencent.mm.ui.base.a(2)
public abstract class RemittanceBaseUI extends WalletBaseUI
  implements d.a
{
  private String cEW;
  protected int cKs = 0;
  protected String edV;
  protected String eeO;
  protected Button gHn;
  protected int gOW;
  private final int gnS = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 270);
  protected WalletFormView kGa;
  protected String kux;
  protected String mName;
  protected ScrollView nsk;
  private int obL;
  private double pPt;
  protected com.tencent.mm.plugin.wallet.a pQU = null;
  protected double pQV;
  protected String pQW;
  protected String pQX;
  protected int pQY;
  private int pQZ = -1;
  protected int pRA;
  private int pRB;
  protected String pRC;
  protected String pRD;
  protected String pRE;
  private Map<String, a> pRF = new HashMap();
  private String pRG;
  protected boolean pRH = false;
  private v pRI;
  private bh pRJ;
  private boolean pRK = false;
  private com.tencent.mm.sdk.b.c pRL = new com.tencent.mm.sdk.b.c()
  {
  };
  private boolean pRM = false;
  private boolean pRN = false;
  private boolean pRO = false;
  private boolean pRP = false;
  private rn pRQ = null;
  private com.tencent.mm.sdk.b.c pRR = new RemittanceBaseUI.24(this);
  protected double pRS = 0.0D;
  protected String pRT = "";
  protected String pRU = "";
  protected String pRV = "";
  private com.tencent.mm.sdk.b.c<fx> pRW = new RemittanceBaseUI.26(this);
  protected boolean pRa = false;
  protected String pRb;
  protected ImageView pRc;
  protected TextView pRd;
  protected TextView pRe;
  protected TextView pRf;
  protected TextView pRg;
  protected TextView pRh;
  private TextView pRi;
  private TextView pRj;
  protected TextView pRk;
  private LinearLayout pRl;
  private LinearLayout pRm;
  private LinearLayout pRn;
  private TextView pRo;
  private TextView pRp;
  private LinearLayout pRq;
  private LinearLayout pRr;
  protected String pRs;
  protected boolean pRt = true;
  protected String pRu;
  private String pRv;
  private String pRw;
  protected String pRx;
  protected String pRy = null;
  protected String pRz = null;
  protected String pdC;

  private static void VT(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.RemittanceBaseUI", "msgxml is null");
    while (true)
    {
      return;
      String str = URLDecoder.decode(paramString);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "helios:".concat(String.valueOf(str)));
      paramString = (String)br.z(str, "msg").get(".msg.appmsg.wcpayinfo.transferid");
      if (TextUtils.isEmpty(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.RemittanceBaseUI", "paymsgid count't be null in appmsg");
      }
      else
      {
        aa localaa = com.tencent.mm.plugin.remittance.a.c.ceW().ceZ();
        if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(str)))
          com.tencent.mm.sdk.platformtools.ab.e(aa.TAG, "saveMsgContent param error");
        else
          localaa.pQD.put(paramString, str);
      }
    }
  }

  private static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    c.a locala = new c.a(paramContext);
    locala.asD(paramString2);
    locala.asE(paramString1);
    locala.asJ(paramString3).a(paramOnClickListener1);
    locala.asK(paramString4).b(paramOnClickListener2);
    locala.rc(false);
    locala.rd(true);
    paramString1 = locala.aMb();
    paramString1.show();
    com.tencent.mm.ui.base.h.a(paramContext, paramString1);
  }

  private void a(v paramv, rn paramrn)
  {
    this.pRK = true;
    c localc = new c(this);
    localc.pQJ = new RemittanceBaseUI.19(this);
    localc.pPM = paramrn;
    Object localObject = View.inflate(localc.mContext, 2130970465, null);
    TextView localTextView = (TextView)((View)localObject).findViewById(2131826873);
    EditText localEditText = (EditText)((View)localObject).findViewById(2131826872);
    ((MMNeat7extView)((View)localObject).findViewById(2131821019)).ah(localc.pPM.cEh);
    localTextView.setText(paramrn.pcw);
    paramrn = new e.a(localc.mContext);
    paramrn.al(localc.pPM.title).fo((View)localObject);
    localObject = com.tencent.mm.ui.tools.b.c.d(localEditText);
    ((com.tencent.mm.ui.tools.b.c)localObject).jeZ = f.a.zFu;
    localObject = ((com.tencent.mm.ui.tools.b.c)localObject).hz(1, 1);
    ((com.tencent.mm.ui.tools.b.c)localObject).zIx = false;
    ((com.tencent.mm.ui.tools.b.c)localObject).a(null);
    al.n(new c.1(localc, localEditText), 200L);
    localObject = new bl();
    ((bl)localObject).dcq = paramv.nUf;
    localObject = ((bl)localObject).ge(paramv.username);
    ((bl)localObject).dck = 1L;
    ((bl)localObject).ajK();
    paramrn.c(new c.2(localc, paramv, localEditText)).show();
  }

  private void a(boolean paramBoolean, Intent paramIntent)
  {
    if (paramBoolean)
    {
      if (this.pRH)
        com.tencent.mm.plugin.report.service.h.pYm.e(15386, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
      String str = paramIntent.getStringExtra("key_trans_id");
      if (bo.isNullOrNil(this.pRG))
        this.pRG = str;
      if ((this.pQY != 33) && (this.pQY != 32))
        com.tencent.mm.plugin.remittance.model.ab.VQ(this.edV);
      if (this.pPt == 0.0D)
      {
        if (this.gOW == 1)
          com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(17), Integer.valueOf(1) });
      }
      else
        finish();
    }
    while (true)
    {
      if (bo.gW(this.pQZ, 0))
        b(paramBoolean, paramIntent);
      label198: 
      do
        while (true)
        {
          return;
          com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(8), Integer.valueOf(1) });
          break;
          if (!com.tencent.mm.plugin.wallet_core.utils.c.aw(paramIntent))
            break label198;
          finish();
        }
      while (com.tencent.mm.plugin.wallet_core.utils.c.ax(paramIntent));
      if (this.gOW == 1)
        com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(16), Integer.valueOf(1) });
      else
        com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(7), Integer.valueOf(1) });
    }
  }

  private boolean a(v paramv)
  {
    if (!this.pRM);
    for (boolean bool1 = d(paramv); ; bool1 = false)
    {
      boolean bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.pRN)
          bool2 = e(paramv);
      }
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (!this.pRO)
          bool1 = f(paramv);
      }
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.pRP)
          bool2 = c(paramv);
      }
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (!bo.isNullOrNil(paramv.pPA))
        {
          bool1 = bool2;
          if (!bo.isNullOrNil(paramv.pPB))
          {
            String str1 = com.tencent.mm.wallet_core.ui.e.eK(com.tencent.mm.wallet_core.ui.e.mJ(this.edV), 10);
            String str2 = str1;
            if (!bo.isNullOrNil(this.pRx))
              str2 = getString(2131302377, new Object[] { str1, this.pRx });
            bool1 = a(paramv.cBT, paramv.pPB, str2, paramv.pPA, paramv);
          }
        }
      }
      return bool1;
    }
  }

  private boolean a(String paramString1, String paramString2, String paramString3, String paramString4, v paramv)
  {
    View localView = LayoutInflater.from(this).inflate(2130970519, null);
    TextView localTextView1 = (TextView)localView.findViewById(2131827131);
    TextView localTextView2 = (TextView)localView.findViewById(2131827132);
    TextView localTextView3 = (TextView)localView.findViewById(2131827133);
    localTextView1.setText(paramString2);
    localTextView2.setText(j.b(this, paramString3, localTextView2.getTextSize()));
    double d = bo.getDouble(paramString4, 0.0D);
    localTextView3.setText(String.format("%s%.2f", new Object[] { com.tencent.mm.wallet_core.c.ae.dOd(), Double.valueOf(Double.valueOf(d).doubleValue() / 100.0D) }));
    paramString2 = new c.a(this);
    paramString2.rc(false);
    paramString2.PV(2131302466);
    paramString2.fn(localView);
    paramString2.Qc(2131302383);
    paramString2.Qd(2131297763);
    paramString2.a(new RemittanceBaseUI.25(this, paramString1, paramv));
    paramString2.aMb().show();
    return true;
  }

  private void aY(int paramInt, String paramString)
  {
    this.pRJ = new bh();
    this.pRJ.cVR = 2L;
    this.pRJ.cVS = paramInt;
    this.pRJ.gd(paramString);
    this.pRJ.ajK();
  }

  private void b(boolean paramBoolean, Intent paramIntent)
  {
    if (paramBoolean)
      this.cKs = 1;
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "savePayInfoInReRemittanceUI() mLastPayResult:%s mlastTotalFee:%s mLastDesc:%s mLastAddress:%s mLastTransferId:%s", new Object[] { Integer.valueOf(this.cKs), Double.valueOf(this.pRS), this.pRT, this.pRU, this.pRV });
      do
        return;
      while (paramIntent == null);
      this.cKs = paramIntent.getIntExtra("key_pay_reslut_type", 3);
      this.pRS = this.pQV;
      this.pRT = this.eeO;
      this.pRU = this.pRs;
      this.pRV = this.pRG;
    }
  }

  private static boolean b(v paramv)
  {
    boolean bool1 = true;
    if (paramv.pPL == 1)
    {
      bool2 = bool1;
      if (paramv.pPM != null);
    }
    else
    {
      if ((paramv.pPM == null) || (paramv.pPM.vYN <= 0))
        break label40;
    }
    label40: for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  private boolean c(v paramv)
  {
    if ((paramv.cMO != null) && (paramv.cMO.cPa()))
    {
      this.pRP = true;
      com.tencent.mm.ui.base.h.d(this, paramv.cMO.cEh, "", paramv.cMO.nZc, paramv.cMO.nZb, new RemittanceBaseUI.7(this, paramv), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void cfD()
  {
    if (bo.gW(this.pQZ, 0))
    {
      this.pRq.setVisibility(4);
      this.nTi.getViewTreeObserver().addOnGlobalLayoutListener(new RemittanceBaseUI.28(this));
    }
  }

  private void cfE()
  {
    if ((cfK()) && (!bo.isNullOrNil(this.pRz)) && (this.pRB != 0) && (this.pRA == 1))
      addIconOptionMenu(0, 2130840734, new RemittanceBaseUI.29(this));
    while (true)
    {
      return;
      this.mController.removeAllOptionMenu();
    }
  }

  private void cfF()
  {
    int i;
    if ((!bo.isNullOrNil(this.pRy)) && (this.pRB != 0))
      if (this.pRB == 1)
        i = 2;
    while (true)
    {
      try
      {
        this.pRf.setText(String.format(this.pRy, new Object[] { Integer.valueOf(i) }));
        this.pRf.setVisibility(0);
        return;
        i = 24;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.RemittanceBaseUI", localException, "", new Object[0]);
        this.pRf.setText(getString(2131302433, new Object[] { Integer.valueOf(i) }));
        continue;
      }
      this.pRf.setText("");
      this.pRf.setVisibility(8);
    }
  }

  private void cfI()
  {
    final Runnable local31 = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(44862);
        Bitmap localBitmap = com.tencent.mm.ah.b.a(RemittanceBaseUI.this.edV, false, -1);
        if (localBitmap == null)
        {
          RemittanceBaseUI.this.pRc.setImageResource(2130838444);
          AppMethodBeat.o(44862);
        }
        while (true)
        {
          return;
          RemittanceBaseUI.this.pRc.setImageBitmap(localBitmap);
          AppMethodBeat.o(44862);
        }
      }
    };
    if (al.isMainThread())
      local31.run();
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(44863);
          local31.run();
          AppMethodBeat.o(44863);
        }
      });
    }
  }

  private void cfJ()
  {
    this.kGa = ((WalletFormView)findViewById(2131822842));
    if (this.pQY == 33)
    {
      this.pRj.setText(com.tencent.mm.wallet_core.ui.e.F(this.pQV));
      this.pRk.setText(com.tencent.mm.wallet_core.c.ae.dOd());
      this.pRu = getIntent().getStringExtra("desc");
      if (!bo.isNullOrNil(this.pRu))
      {
        this.pRi.setText(j.b(this.mController.ylL, this.pRu, this.pRi.getTextSize()));
        this.pRi.setVisibility(0);
        this.pRl.setVisibility(0);
        this.pRm.setVisibility(8);
      }
    }
    while (true)
    {
      return;
      this.pRi.setVisibility(8);
      break;
      this.kGa.setOnClickListener(new RemittanceBaseUI.2(this));
      this.kGa.getTitleTv().setText(String.format(getString(2131302423), new Object[] { "¥" }));
      this.kGa.a(new RemittanceBaseUI.3(this));
      e(this.kGa, 2, false);
      findViewById(2131827094);
      findViewById(2131822841).setVisibility(0);
      this.pRl.setVisibility(8);
      this.pRm.setVisibility(0);
      this.obM = new RemittanceBaseUI.4(this);
    }
  }

  private boolean d(final v paramv)
  {
    if (!bo.isNullOrNil(paramv.pPn))
    {
      this.pRM = true;
      aY(1, paramv.cEa);
      com.tencent.mm.ui.base.h.d(this, paramv.pPn, getString(2131297031), getString(2131302383), getString(2131296868), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(44833);
          RemittanceBaseUI.a(RemittanceBaseUI.this, 3, paramv.cEa);
          if (!RemittanceBaseUI.a(RemittanceBaseUI.this, paramv))
            RemittanceBaseUI.this.a(paramv.cBT, RemittanceBaseUI.this.edV, RemittanceBaseUI.this.pRx, paramv);
          AppMethodBeat.o(44833);
        }
      }
      , new RemittanceBaseUI.10(this, paramv));
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean e(v paramv)
  {
    boolean bool = false;
    String str1;
    String str3;
    if (paramv.pPl > 0)
    {
      this.pRN = true;
      if (paramv.pPm == null)
        break label143;
      if (!bo.isNullOrNil(paramv.pPm.cEh))
        break label120;
      str1 = getString(2131302453, new Object[] { Integer.valueOf(paramv.pPl) });
      String str2 = getString(2131302383);
      if (!bo.isNullOrNil(paramv.pPm.pPN))
        break label131;
      str3 = getString(2131302442);
      label87: a(this, str1, "", str2, str3, new RemittanceBaseUI.11(this, paramv), new RemittanceBaseUI.13(this, paramv));
    }
    while (true)
    {
      bool = true;
      return bool;
      label120: str1 = paramv.pPm.cEh;
      break;
      label131: str3 = paramv.pPm.pPN;
      break label87;
      label143: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "scene.zaituMessage == null");
      a(this, getString(2131302453, new Object[] { Integer.valueOf(paramv.pPl) }), getString(2131297031), getString(2131302383), getString(2131302442), new RemittanceBaseUI.14(this, paramv), new RemittanceBaseUI.15(this));
    }
  }

  private boolean f(v paramv)
  {
    if (paramv.pPs)
    {
      this.pRO = true;
      f.a(this, this.gOW, paramv.pPv / 100.0D, paramv.pPu / 100.0D, paramv.pPp / 100.0D, paramv.pPr, new RemittanceBaseUI.16(this, paramv));
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract void a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, fw paramfw);

  protected final void a(final String paramString1, final String paramString2, final String paramString3, final v paramv)
  {
    if (b(paramv))
      if (paramv.pPM.vYN == 0)
      {
        this.pRQ = paramv.pPM;
        a(paramv, paramv.pPM);
      }
    while (true)
    {
      return;
      Object localObject;
      if (paramv.pPM.vYN == 1)
      {
        localObject = new bl();
        ((bl)localObject).dcq = ((int)paramv.pPz);
        localObject = ((bl)localObject).ge(paramv.username);
        ((bl)localObject).dck = 4L;
        ((bl)localObject).ajK();
        com.tencent.mm.ui.base.h.a(this, paramv.pPM.cEh, paramv.pPM.title, getResources().getString(2131302476), getResources().getString(2131302475), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(44845);
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "onClick1 realNameCheckMessage %s", new Object[] { RemittanceBaseUI.l(RemittanceBaseUI.this) });
            paramAnonymousDialogInterface = new bl();
            paramAnonymousDialogInterface.dcq = ((int)paramv.pPz);
            paramAnonymousDialogInterface = paramAnonymousDialogInterface.ge(paramv.username);
            paramAnonymousDialogInterface.dck = 9L;
            paramAnonymousDialogInterface.ajK();
            paramv.pPM = null;
            RemittanceBaseUI.this.a(paramString1, paramString2, paramString3, paramv);
            AppMethodBeat.o(44845);
          }
        }
        , new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(44846);
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "onClick1");
            paramAnonymousDialogInterface = new bl();
            paramAnonymousDialogInterface.dcq = ((int)paramv.pPz);
            paramAnonymousDialogInterface = paramAnonymousDialogInterface.ge(paramv.username);
            paramAnonymousDialogInterface.dck = 8L;
            paramAnonymousDialogInterface.ajK();
            AppMethodBeat.o(44846);
          }
        }
        , 2131690363);
      }
      else if (paramv.pPM.vYN == 2)
      {
        com.tencent.mm.ui.base.h.a(this, paramv.pPM.cEh, paramv.pPM.title, getResources().getString(2131305646), new RemittanceBaseUI.22(this));
        continue;
        if (this.pRK)
        {
          localObject = new bl();
          ((bl)localObject).dcq = paramv.nUf;
          localObject = ((bl)localObject).ge(paramv.username);
          ((bl)localObject).dck = 5L;
          ((bl)localObject).ajK();
        }
        this.pRK = false;
        if (this.pQY == 31)
          VT(this.pRw);
        localObject = new PayInfo();
        ((PayInfo)localObject).czZ = paramString1;
        ((PayInfo)localObject).cIf = this.pQY;
        if (this.obL > 0)
          ((PayInfo)localObject).cIb = this.obL;
        boolean bool = false;
        if ((this.gOW == 2) || (this.gOW == 5))
          bool = true;
        paramString1 = new Bundle();
        paramString1.putString("extinfo_key_1", paramString2);
        paramString1.putString("extinfo_key_2", getIntent().getStringExtra("receiver_true_name"));
        paramString1.putString("extinfo_key_3", this.pRu);
        paramString1.putBoolean("extinfo_key_4", bool);
        paramString1.putString("extinfo_key_5", getIntent().getStringExtra("receiver_tips"));
        paramString1.putString("extinfo_key_6", getIntent().getStringExtra("payer_desc"));
        paramString1.putString("extinfo_key_7", this.eeO);
        paramString1.putString("extinfo_key_8", getIntent().getStringExtra("rcvr_new_desc"));
        paramString1.putString("extinfo_key_16", this.pRG);
        if (paramv != null)
          paramString1.putString("extinfo_key_19", paramv.pPJ);
        int i = 0;
        int j = i;
        if (this.gOW == 1)
        {
          j = i;
          if (paramv != null)
          {
            paramString1.putString("extinfo_key_11", paramv.pPx);
            paramString1.putInt("extinfo_key_12", paramv.pPD);
            paramString1.putString("extinfo_key_13", paramv.pPE);
            paramString1.putString("extinfo_key_14", paramv.pPF);
            paramString1.putString("extinfo_key_17", paramv.pPH);
            paramString1.putString("extinfo_key_18", paramv.pPI);
            j = paramv.pPG;
          }
        }
        if (paramv != null)
          paramString1.putInt("extinfo_key_15", paramv.nUf);
        if (this.pRa)
        {
          paramString1.putBoolean("extinfo_key_23", this.pRa);
          paramString1.putString("extinfo_key_24", this.mName);
          paramString1.putString("extinfo_key_25", this.pdC);
          paramString1.putString("extinfo_key_26", this.pRs);
        }
        ((PayInfo)localObject).vwh = paramString1;
        paramString1 = new Intent();
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "dynamic code flag: %s", new Object[] { Integer.valueOf(j) });
        if (j == 1)
        {
          paramString1.setClass(this, RemittanceF2fDynamicCodeUI.class);
          paramString1.putExtra("key_pay_info", (Parcelable)localObject);
          paramString1.putExtra("key_rcvr_open_id", this.pRC);
          paramString1.putExtra("key_mch_info", this.pQX);
          paramString1.putExtra("from_patch_ui", true);
          paramString1.putExtra("get_dynamic_code_sign", paramv.pPH);
          paramString1.putExtra("get_dynamic_code_extend", paramv.pPI);
          paramString1.putExtra("dynamic_code_spam_wording", paramv.pPK);
          paramString1.putExtra("show_paying_wording", paramv.pPJ);
          paramString1.putExtra("key_transfer_qrcode_id", this.pRb);
          com.tencent.mm.plugin.report.service.h.pYm.e(15386, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
          this.pRR.dnU();
          startActivityForResult(paramString1, 5);
        }
        else
        {
          com.tencent.mm.plugin.wallet.a.a(this.pQU, paramString1);
          ((PayInfo)localObject).vwp = this.cEW;
          ((PayInfo)localObject).aPn = this.pRH;
          if ((paramv.pOV != null) && (paramv.pOV.czT.czX != null))
            com.tencent.mm.pluginsdk.wallet.h.a(paramv.pOV.czT.czX, false, "", (PayInfo)localObject, paramString3, paramString1, paramv.pOV.czT.czV);
          else
            com.tencent.mm.pluginsdk.wallet.h.a(this, false, "", (PayInfo)localObject, paramString3, paramString1, 1);
        }
      }
    }
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    this.pRE = "";
    label158: boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof v))
      {
        paramm = (v)paramm;
        com.tencent.mm.wallet_core.c.ad.o(this.pQY, paramm.cBT, paramInt2);
        this.pRw = paramm.pPo;
        if (!bo.isNullOrNil(paramm.pPw))
          this.pRx = paramm.pPw;
        if ((this.pQY == 32) || (this.pQY == 33))
        {
          this.pRG = paramm.kBE;
          if (this.pQU != null)
            this.pQU.i(10000, new Object[] { Integer.valueOf(this.pQY), this.edV, Double.valueOf(paramm.pPz) });
          if (paramm.pPM != null)
            break label282;
          paramString = "";
          this.pRD = paramString;
          if (!a(paramm))
            a(paramm.cBT, this.edV, this.pRx, paramm);
          paramString = new a(paramm.pPx, paramm.kBE, paramm.kDV, paramm.pPy, paramm.nUf, paramm.cEa, paramm.cAa, paramm.pPC, bo.getLong(paramm.pPA, 0L));
          this.pRF.put(paramm.cBT, paramString);
          label264: bool = true;
        }
      }
    while (true)
    {
      return bool;
      this.pRG = paramm.cEa;
      break;
      label282: if (bo.isNullOrNil(paramm.pPM.pRD))
      {
        paramString = this.pRD;
        break label158;
      }
      paramString = paramm.pPM.pRD;
      break label158;
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.ad))
      {
        paramm = (com.tencent.mm.plugin.wallet_core.c.ad)paramm;
        if (!bo.isNullOrNil(paramm.tuy))
        {
          ((TextView)findViewById(2131827096)).setText(paramm.tuy);
          paramString = findViewById(2131827095);
          paramString.setVisibility(0);
          paramString.setOnClickListener(new RemittanceBaseUI.5(this));
        }
        this.pRv = paramm.pRv;
        this.pPt = paramm.pPt;
        if (this.pPt != 0.0D)
          break label264;
        if (this.gOW == 1)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(14), Integer.valueOf(1) });
          break label264;
        }
        com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
        break label264;
      }
      if (!(paramm instanceof com.tencent.mm.plugin.wallet_core.c.ae))
        break label264;
      this.pRy = ((com.tencent.mm.plugin.wallet_core.c.ae)paramm).tuA;
      this.pRz = ((com.tencent.mm.plugin.wallet_core.c.ae)paramm).tuE;
      this.pRA = ((com.tencent.mm.plugin.wallet_core.c.ae)paramm).tuF;
      cfF();
      cfE();
      break label264;
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.ae))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "net error, use hardcode wording");
        this.pRf.setText("");
        this.pRf.setVisibility(8);
      }
      do
      {
        do
        {
          bool = false;
          break;
        }
        while (!(paramm instanceof v));
        this.pRI = ((v)paramm);
        com.tencent.mm.sdk.b.a.xxA.b(this.pRL);
        com.tencent.mm.wallet_core.c.ad.o(this.pQY, "", paramInt2);
      }
      while (!c((v)paramm));
      bool = true;
    }
  }

  public void cfA()
  {
    t localt = new t(this.edV, this.pRb);
    localt.eHT = "RemittanceProcess";
    a(localt, true, true);
  }

  public void cfB()
  {
  }

  public abstract void cfC();

  public abstract void cfG();

  protected final void cfH()
  {
    Object localObject1 = com.tencent.mm.wallet_core.ui.e.eK(com.tencent.mm.wallet_core.ui.e.mJ(this.edV), 10);
    Object localObject2 = localObject1;
    if (!bo.isNullOrNil(this.pRx))
      localObject2 = getString(2131302377, new Object[] { localObject1, this.pRx });
    if (this.gOW == 1)
    {
      localObject2 = getIntent().getStringExtra("receiver_tips");
      this.pRd.setTextColor(getResources().getColor(2131689761));
      this.pRe.setVisibility(0);
      if (bo.isNullOrNil(this.edV))
      {
        localObject1 = getString(2131302380, new Object[] { this.pRx });
        this.pRe.setText(j.b(this, (CharSequence)localObject1, this.pRe.getTextSize()));
        localObject1 = localObject2;
        label142: this.pRd.setText(j.b(this, (CharSequence)localObject1, this.pRd.getTextSize()));
        if (!g.RK())
          break label349;
        localObject1 = o.act();
        if ((localObject1 == null) || (bo.isNullOrNil(this.edV)))
          break label349;
        localObject1 = ((i)localObject1).qo(this.edV);
        if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.ah.h)localObject1).acl())))
          break label349;
        long l = bo.anU();
        ao.a.flu.a(this.edV, "", new RemittanceBaseUI.30(this, l));
      }
    }
    label349: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        cfI();
      return;
      localObject1 = getString(2131302379, new Object[] { com.tencent.mm.wallet_core.ui.e.eK(com.tencent.mm.wallet_core.ui.e.mJ(this.edV), 10), this.pRx });
      break;
      localObject1 = localObject2;
      if (this.gOW != 6)
        break label142;
      localObject1 = getIntent().getStringExtra("receiver_tips");
      if (bo.isNullOrNil((String)localObject1))
      {
        localObject1 = getString(2131302378, new Object[] { localObject2 });
        break label142;
      }
      localObject1 = bo.t((String)localObject1, new Object[] { localObject2 });
      break label142;
    }
  }

  protected final boolean cfK()
  {
    if ((this.gOW == 0) || (this.gOW == 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final void cfL()
  {
    if (this.pQY == 33)
      a(this.eeO, this.pQZ, this.mName, this.pdC, this.pRs, this.pRu, "", null);
    while (true)
    {
      return;
      a(this.eeO, this.pQZ, this.mName, this.pdC, this.pRs, null, "", null);
    }
  }

  protected void cfM()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("recent_remittance_contact_list", com.tencent.mm.plugin.remittance.model.ab.cfr());
    localIntent.setClass(this.mController.ylL, SelectRemittanceContactUI.class);
    startActivityForResult(localIntent, 2);
  }

  public final boolean cfN()
  {
    if ((this.pQY == 33) || (this.pQY == 32));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract void cfz();

  public final int getForceOrientation()
  {
    return 1;
  }

  public int getLayoutId()
  {
    int i;
    if ((this.pQY == 33) || (this.pQY == 32))
      i = 2130970515;
    while (true)
    {
      return i;
      if (bo.gW(this.pQZ, 0))
      {
        dyb();
        i = 2130970516;
      }
      else
      {
        i = 2130970514;
      }
    }
  }

  public final void initView()
  {
    if ((this.pQY == 33) || (this.pQY == 32))
    {
      setMMTitle(2131302373);
      setBackBtn(new RemittanceBaseUI.1(this));
      this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
      this.nTi = findViewById(2131822356);
      this.nsk = ((ScrollView)findViewById(2131820884));
      this.pRc = ((ImageView)findViewById(2131827085));
      this.pRd = ((TextView)findViewById(2131827086));
      this.pRe = ((TextView)findViewById(2131827087));
      this.pRe.setVisibility(8);
      this.pRm = ((LinearLayout)findViewById(2131827088));
      this.pRl = ((LinearLayout)findViewById(2131827089));
      this.pRj = ((TextView)findViewById(2131827092));
      this.pRk = ((TextView)findViewById(2131827091));
      this.pRi = ((TextView)findViewById(2131827090));
      if (bo.gW(this.pQZ, 0))
      {
        this.pRn = ((LinearLayout)findViewById(2131827032));
        this.pRo = ((TextView)findViewById(2131827035));
        this.pRp = ((TextView)findViewById(2131827036));
      }
      cfH();
      cfJ();
      this.gHn = ((Button)findViewById(2131822846));
      this.gHn.setOnClickListener(new RemittanceBaseUI.12(this));
      this.pRg = ((TextView)findViewById(2131822844));
      this.pRh = ((TextView)findViewById(2131827093));
      if ((this.gOW != 1) && (this.gOW != 6))
        break label545;
      this.pRh.setText(2131302359);
      label342: if (!r.YM())
        findViewById(2131822843).setOnClickListener(new RemittanceBaseUI.23(this));
      if (this.gOW == 1)
      {
        g.RQ();
        if (((String)g.RP().Ry().get(327732, "0")).equals("0"))
        {
          com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131302427, 2131302428, new RemittanceBaseUI.27(this));
          g.RQ();
          g.RP().Ry().set(327732, "1");
          g.RQ();
          g.RP().Ry().dsb();
        }
      }
      this.pRf = ((TextView)findViewById(2131827094));
      this.pRq = ((LinearLayout)findViewById(2131827097));
      this.pRr = ((LinearLayout)findViewById(2131822841));
      cfF();
      cfG();
      cfE();
      if ((this.pQY != 33) && (this.pQY != 32))
        break label558;
    }
    while (true)
    {
      return;
      setMMTitle(2131302471);
      break;
      label545: this.pRh.setText(2131302358);
      break label342;
      label558: cfD();
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "reqcode=" + paramInt1 + ", resultCode=" + paramInt2 + ", username=" + this.edV);
    switch (paramInt1)
    {
    case 3:
    case 4:
    default:
    case 5:
    case 1:
    case 2:
    case 6:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      bool1 = bool2;
      if (paramInt2 == -1)
        bool1 = true;
      a(bool1, paramIntent);
      continue;
      if (paramInt2 == -1);
      while (true)
      {
        a(bool1, paramIntent);
        break;
        bool1 = false;
      }
      String str1;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        str1 = paramIntent.getStringExtra("Select_Conv_User");
        if (!bo.isNullOrNil(str1))
        {
          this.edV = str1;
          cfH();
        }
        else
        {
          finish();
        }
      }
      else
      {
        finish();
        continue;
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          aoB();
          String str2 = getString(2131297476);
          String str3 = getString(2131302384);
          String str4 = paramIntent.getStringExtra("userName");
          str1 = paramIntent.getStringExtra("telNumber");
          String str5 = paramIntent.getStringExtra("proviceFirstStageName") + paramIntent.getStringExtra("addressCitySecondStageName") + paramIntent.getStringExtra("addressCountiesThirdStageName") + paramIntent.getStringExtra("addressDetailInfo");
          com.tencent.mm.plugin.wallet_core.ui.view.a.a(this, str2, this.eeO, str3, false, str4, str1, str5, new RemittanceBaseUI.17(this), new RemittanceBaseUI.18(this));
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    this.gOW = getIntent().getIntExtra("scene", 0);
    this.pQY = getIntent().getIntExtra("pay_scene", 31);
    if (!cfK())
    {
      this.cEW = UUID.randomUUID().toString();
      com.tencent.mm.plugin.wallet.pay.a.b.acq(this.cEW);
    }
    long l;
    if ((this instanceof RemittanceUI))
    {
      this.pQZ = 0;
      super.onCreate(paramBundle);
      this.pQU = com.tencent.mm.plugin.wallet.a.at(getIntent());
      this.pRb = getIntent().getStringExtra("scan_remittance_id");
      this.pQV = getIntent().getDoubleExtra("fee", 0.0D);
      this.edV = getIntent().getStringExtra("receiver_name");
      this.kux = getIntent().getStringExtra("receiver_nick_name");
      this.pRx = getIntent().getStringExtra("receiver_true_name");
      this.pQW = getIntent().getStringExtra("mch_name");
      this.pQX = getIntent().getStringExtra("mch_info");
      this.obL = getIntent().getIntExtra("pay_channel", 0);
      this.pRC = bo.bc(getIntent().getStringExtra("rcvr_open_id"), "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "mUserName %s", new Object[] { this.edV });
      g.RQ();
      l = ((Long)g.RP().Ry().get(147457, Long.valueOf(0L))).longValue();
      if ((0x10 & l) == 0L)
        break label331;
      this.pRB = 1;
    }
    while (true)
    {
      cfz();
      o.acd().a(this);
      initView();
      this.pRW.dnU();
      return;
      if ((this instanceof RemittanceHKUI))
      {
        this.pQZ = 1;
        break;
      }
      if (!(this instanceof RemittanceOSUI))
        break;
      this.pQZ = 2;
      break;
      label331: if ((l & 0x20) != 0L)
        this.pRB = 2;
      else
        this.pRB = 0;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.pRL);
    o.acd().b(this);
    this.pRW.dead();
    this.pRR.dead();
    com.tencent.mm.plugin.wallet.pay.a.b.acr(this.cEW);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void qj(String paramString)
  {
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RemittanceBaseUI", "onGet");
    if (bo.nullAsNil(paramString).length() <= 0)
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.RemittanceBaseUI", "notifyChanged: user = ".concat(String.valueOf(paramString)));
    while (true)
    {
      return;
      if (paramString.equals(this.edV))
        cfI();
    }
  }

  static final class a
  {
    String cAa;
    String cEa;
    String kBE;
    String kDV;
    int nUf;
    String pPC;
    String pPx;
    String pPy;
    long pSg;

    a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, String paramString6, String paramString7, long paramLong)
    {
      this.pPx = paramString1;
      this.kBE = paramString2;
      this.kDV = paramString3;
      this.pPy = paramString4;
      this.nUf = paramInt;
      this.cEa = paramString5;
      this.cAa = paramString6;
      this.pPC = paramString7;
      this.pSg = paramLong;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
 * JD-Core Version:    0.6.2
 */