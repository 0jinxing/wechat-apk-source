package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.CreExtInfo;
import com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WalletCardElementUI extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private String countryCode;
  private String fHC;
  private String fno;
  private String fnp;
  private Button gEZ;
  private String kGE;
  private String nQt;
  private String nQu;
  private PayInfo pVL;
  private Orders pWy;
  private TextView rvM;
  private TextView tEZ;
  private WalletFormView tEq;
  private Bankcard tEr;
  private WalletFormView tFA;
  private WalletPhoneInputView tFB;
  private ScrollView tFC;
  private WalletFormView tFD;
  private WalletFormView tFE;
  private Map<String, b.a> tFF;
  private boolean tFG;
  private CheckBox tFH;
  private CheckBox tFI;
  private String tFJ;
  private boolean tFK;
  private boolean tFL;
  private boolean tFM;
  private boolean tFN;
  private boolean tFO;
  private boolean tFP;
  private String[] tFQ;
  private String tFR;
  private WalletFormView tFS;
  private List<ElementQuery> tFT;
  private int tFU;
  private int tFV;
  private int tFW;
  private int tFX;
  private int tFY;
  private int tFZ;
  private TextView tFa;
  private TextView tFb;
  private TextView tFc;
  private TextView tFd;
  private TextView tFe;
  private TextView tFf;
  private TextView tFg;
  private TextView tFh;
  private WalletFormView tFi;
  private WalletFormView tFj;
  private WalletFormView tFk;
  private WalletFormView tFl;
  private WalletFormView tFm;
  private WalletFormView tFn;
  private WalletFormView tFo;
  private WalletFormView tFp;
  private WalletFormView tFq;
  private WalletFormView tFr;
  private WalletFormView tFs;
  private WalletFormView tFt;
  private WalletFormView tFu;
  private WalletFormView tFv;
  private WalletFormView tFw;
  private WalletFormView tFx;
  private WalletFormView tFy;
  private WalletFormView tFz;
  private int tGa;
  private int tGb;
  private String tGc;
  private BaseAdapter tGd;
  private View.OnClickListener tGe;
  private Authen toh;
  b tpu;
  private com.tencent.mm.sdk.b.c trF;
  private WalletFormView trX;
  private TextView trY;
  private TextView trZ;
  private int tsb;
  private Profession[] tur;
  private ElementQuery tvu;
  private Profession tvv;
  private boolean tyN;

  public WalletCardElementUI()
  {
    AppMethodBeat.i(47237);
    this.tFD = null;
    this.tvu = new ElementQuery();
    this.toh = new Authen();
    this.pWy = null;
    this.pVL = null;
    this.tEr = null;
    this.tFF = null;
    this.tpu = null;
    this.tFG = false;
    this.tsb = 1;
    this.tFM = false;
    this.tFN = false;
    this.tFO = false;
    this.tFP = false;
    this.tyN = false;
    this.tFQ = null;
    this.tFT = new ArrayList();
    this.tGd = new WalletCardElementUI.8(this);
    this.tGe = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(47222);
        com.tencent.mm.plugin.report.service.h.pYm.e(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
        e.d(WalletCardElementUI.this, r.cPI().bhp());
        AppMethodBeat.o(47222);
      }
    };
    this.trF = new WalletCardElementUI.10(this);
    AppMethodBeat.o(47237);
  }

  private void Hj(int paramInt)
  {
    AppMethodBeat.i(47254);
    if (paramInt == 1)
    {
      a(this.trX, 1, false, false);
      AppMethodBeat.o(47254);
    }
    while (true)
    {
      return;
      a(this.trX, 1, true, false);
      AppMethodBeat.o(47254);
    }
  }

  private static void a(WalletFormView paramWalletFormView, int paramInt)
  {
    AppMethodBeat.i(47253);
    paramWalletFormView = paramWalletFormView.getLogicDelegate();
    if ((paramWalletFormView instanceof a.a))
      ((a.a)paramWalletFormView).QT(paramInt);
    AppMethodBeat.o(47253);
  }

  private static void a(WalletFormView paramWalletFormView, String paramString)
  {
    AppMethodBeat.i(47242);
    if (!bo.isNullOrNil(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      AppMethodBeat.o(47242);
    }
    while (true)
    {
      return;
      paramWalletFormView.setVisibility(8);
      AppMethodBeat.o(47242);
    }
  }

  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2)
  {
    AppMethodBeat.i(47245);
    a(paramArrayOfBoolean, paramArrayOfWalletFormView, paramTextView1, paramTextView2, false);
    AppMethodBeat.o(47245);
  }

  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2, boolean paramBoolean)
  {
    AppMethodBeat.i(47244);
    int i = paramArrayOfBoolean.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      if (paramArrayOfBoolean[j] != 0)
      {
        k = 1;
        paramArrayOfWalletFormView[j].setVisibility(0);
      }
      while (true)
      {
        j++;
        break;
        paramArrayOfWalletFormView[j].setVisibility(8);
        paramArrayOfWalletFormView[j].cey();
      }
    }
    if (k != 0)
    {
      paramTextView1.setVisibility(0);
      if (paramTextView2 == null)
        break label128;
      if (paramBoolean)
      {
        paramTextView2.setVisibility(8);
        AppMethodBeat.o(47244);
      }
    }
    while (true)
    {
      return;
      paramTextView2.setVisibility(4);
      AppMethodBeat.o(47244);
      continue;
      paramTextView1.setVisibility(8);
      if (paramTextView2 != null)
        paramTextView2.setVisibility(8);
      label128: AppMethodBeat.o(47244);
    }
  }

  private boolean arW()
  {
    AppMethodBeat.i(47249);
    WalletFormView localWalletFormView = this.tFD;
    this.tFD = null;
    if (!this.tFi.fx(null))
    {
      if ((this.tFD == null) && (localWalletFormView != this.tFi))
        this.tFD = this.tFi;
      this.tFc.setText(2131304636);
      this.tFc.setTextColor(getResources().getColor(2131690384));
    }
    for (boolean bool1 = false; ; bool1 = true)
    {
      if (!this.tEq.fx(null))
      {
        if ((this.tFD == null) && (localWalletFormView != this.tEq))
          this.tFD = this.tEq;
        bool1 = false;
      }
      if (!this.tFE.fx(this.tFa))
      {
        if ((this.tFD == null) && (localWalletFormView != this.tFE))
          this.tFD = this.tFE;
        bool1 = false;
      }
      int i;
      if ((!this.trX.fx(this.trZ)) && (!this.tFG))
      {
        if ((this.tFD == null) && (localWalletFormView != this.trX))
          this.tFD = this.trX;
        this.trZ.setText(2131304672);
        this.trZ.setTextColor(getResources().getColor(2131690384));
        i = 1;
        bool1 = false;
      }
      while (true)
      {
        boolean bool2 = bool1;
        if (this.tFM)
        {
          bool2 = bool1;
          if (!this.tFq.fx(null))
          {
            if ((this.tFD == null) && (localWalletFormView != this.tFq))
              this.tFD = this.tFq;
            bool2 = false;
          }
        }
        bool1 = bool2;
        if (this.tFN)
        {
          bool1 = bool2;
          if (!this.tFr.fx(null))
          {
            if ((this.tFD == null) && (localWalletFormView != this.tFr))
              this.tFD = this.tFr;
            bool1 = false;
          }
        }
        if (!this.tFn.fx(this.trZ))
          if (i != 0)
          {
            this.trZ.setText(2131304665);
            this.trZ.setTextColor(getResources().getColor(2131690384));
            if ((this.tFD == null) && (localWalletFormView != this.tFn))
              this.tFD = this.tFn;
            bool2 = false;
            label399: if (this.trZ.getVisibility() == 4)
            {
              if (!this.tvu.tyw)
                break label1070;
              this.trZ.setText(getString(2131304673));
              label434: this.trZ.setTextColor(getResources().getColor(2131690164));
              this.trZ.setVisibility(0);
            }
            if (this.tFk.fx(this.tFe))
              break label1127;
            if ((this.tFD == null) && (localWalletFormView != this.tFk))
              this.tFD = this.tFk;
            i = 1;
          }
        for (bool1 = false; ; bool1 = bool2)
        {
          if (!this.tFj.fx(this.tFe))
          {
            if ((this.tFD == null) && (localWalletFormView != this.tFj))
              this.tFD = this.tFj;
            bool2 = false;
            label540: bool1 = bool2;
            if (!this.tFH.isChecked())
              bool1 = false;
            if (!this.tFu.fx(this.tFf))
            {
              if ((this.tFD == null) && (localWalletFormView != this.tFu))
                this.tFD = this.tFu;
              bool1 = false;
            }
            if (!this.tFv.fx(this.tFf))
            {
              if ((this.tFD == null) && (localWalletFormView != this.tFv))
                this.tFD = this.tFv;
              bool1 = false;
            }
            if (!this.tFw.fx(this.tFf))
            {
              if ((this.tFD == null) && (localWalletFormView != this.tFw))
                this.tFD = this.tFw;
              bool1 = false;
            }
            if (!this.tFx.fx(this.tFf))
            {
              if ((this.tFD == null) && (localWalletFormView != this.tFx))
                this.tFD = this.tFx;
              bool1 = false;
            }
            if (!this.tFy.fx(this.tFf))
            {
              if ((this.tFD == null) && (localWalletFormView != this.tFy))
                this.tFD = this.tFy;
              bool1 = false;
            }
            if (!this.tFz.fx(this.tFf))
            {
              if ((this.tFD == null) && (localWalletFormView != this.tFz))
                this.tFD = this.tFz;
              bool1 = false;
            }
            bool2 = bool1;
            if (!this.tFA.fx(this.tFf))
            {
              if ((this.tFD == null) && (localWalletFormView != this.tFA))
                this.tFD = this.tFA;
              bool2 = false;
            }
            bool1 = bool2;
            if (this.tFL)
            {
              bool1 = bool2;
              if (!this.tFo.fx(null))
              {
                if ((this.tFD == null) && (localWalletFormView != this.tFo))
                  this.tFD = this.tFo;
                bool1 = false;
              }
            }
            bool2 = bool1;
            if (this.tFK)
            {
              bool2 = bool1;
              if (!this.tFp.fx(null))
              {
                if ((this.tFD == null) && (localWalletFormView != this.tFp))
                  this.tFD = this.tFp;
                bool2 = false;
              }
            }
            bool1 = bool2;
            if (this.tFO)
            {
              bool1 = bool2;
              if (!this.tFs.fx(null))
              {
                if ((this.tFD == null) && (localWalletFormView != this.tFs))
                  this.tFD = this.tFs;
                bool1 = false;
              }
            }
            if (!bool1)
              break label1108;
            this.gEZ.setEnabled(true);
            this.gEZ.setClickable(true);
            if (localWalletFormView != null)
              localWalletFormView.setImeOptions(1073741824);
          }
          while (true)
          {
            AppMethodBeat.o(47249);
            return bool1;
            this.trZ.setText(2131304666);
            this.trZ.setTextColor(getResources().getColor(2131690384));
            break;
            bool2 = bool1;
            if (i == 0)
              break label399;
            this.trZ.setVisibility(0);
            bool2 = bool1;
            break label399;
            label1070: this.trZ.setText(getString(2131304676));
            break label434;
            bool2 = bool1;
            if (i == 0)
              break label540;
            this.tFe.setVisibility(4);
            bool2 = bool1;
            break label540;
            label1108: this.gEZ.setEnabled(false);
            this.gEZ.setClickable(false);
          }
          label1127: i = 0;
        }
        i = 0;
      }
    }
  }

  private void cRr()
  {
    AppMethodBeat.i(47240);
    if (this.tvu.tyY == 0)
    {
      this.tFB.cSB();
      AppMethodBeat.o(47240);
    }
    while (true)
    {
      return;
      this.tFB.cSC();
      EditText localEditText = (EditText)this.tFB.findViewById(2131829013);
      a(this.tFB.getPhoneNumberEt(), localEditText, 0, false, false, true);
      AppMethodBeat.o(47240);
    }
  }

  private void cRs()
  {
    AppMethodBeat.i(47246);
    Object localObject1;
    boolean bool;
    if (arW())
    {
      d.cSP();
      if (!bo.isNullOrNil(this.tvu.tyI))
      {
        localObject1 = this.mBundle;
        if ((this.tFI.getVisibility() == 0) && (this.tFI.isChecked()))
        {
          bool = true;
          ((Bundle)localObject1).putBoolean("key_is_follow_bank_username", bool);
          this.mBundle.putString("key_bank_username", this.tvu.tyI);
        }
      }
      else
      {
        localObject1 = (FavorPayInfo)this.mBundle.getParcelable("key_favor_pay_info");
        if ((this.tvu != null) && (localObject1 != null) && (this.tpu != null) && (this.tFF != null))
        {
          if (!this.tFF.containsKey(this.tvu.pbn))
            break label1136;
          ((FavorPayInfo)localObject1).tzb = ((b.a)this.tFF.get(this.tvu.pbn)).tDR.tnk;
          label168: this.mBundle.putParcelable("key_favor_pay_info", (Parcelable)localObject1);
        }
        this.toh = new Authen();
        if (this.tEr != null)
        {
          this.toh.pbo = this.tEr.twQ;
          this.toh.twj = this.tEr.field_bankcardTail;
        }
        localObject1 = this.mBundle.getString("key_card_id");
        if (this.tFE.getVisibility() != 0)
          break label1189;
        localObject1 = this.tFE.getText();
      }
    }
    label522: label1171: label1189: 
    while (true)
    {
      this.toh.pGr = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
      this.toh.twg = ((String)localObject1);
      this.toh.pbn = this.tvu.pbn;
      this.toh.twf = this.tsb;
      this.toh.twc = this.mBundle.getString("key_pwd1");
      if (!bo.isNullOrNil(this.tFk.getText()))
        this.toh.twh = this.tFk.getText();
      this.toh.tuk = this.tFn.getText();
      this.toh.twl = this.tFu.getText();
      this.toh.twm = this.tFv.getText();
      this.toh.country = this.tFJ;
      this.toh.duc = this.nQt;
      this.toh.dud = this.nQu;
      this.toh.fBg = this.tFx.getText();
      this.toh.nuN = this.tFy.getText();
      this.toh.gIO = this.tFz.getText();
      this.toh.dtV = this.tFA.getText();
      localObject1 = e.atu(this.toh.tuk);
      this.mBundle.putString("key_mobile", (String)localObject1);
      Object localObject2 = this.mBundle;
      if (this.tvu.tuo == 2)
      {
        bool = true;
        ((Bundle)localObject2).putBoolean("key_is_oversea", bool);
        this.toh.twe = this.trX.getText();
        this.toh.twd = this.tEq.getText();
        this.toh.twi = this.tFj.getText();
        localObject2 = (FavorPayInfo)this.mBundle.getParcelable("key_favor_pay_info");
        if (localObject2 != null)
        {
          this.toh.twn = ((FavorPayInfo)localObject2).tze;
          this.toh.two = ((FavorPayInfo)localObject2).tzb;
        }
        this.toh.twt = ("+" + this.tFB.getCountryCode());
        this.toh.twu = this.tFV;
        this.toh.tww = this.tFr.getText();
        this.toh.twv = this.tFs.getText();
        ab.d("MicroMsg.WalletCardElmentUI", "renewal: %s, expire: %s, birth: %s", new Object[] { Integer.valueOf(this.toh.twu), this.toh.tww, this.toh.twv });
        if ((cRu()) && (!bo.isNullOrNil(this.mBundle.getString("key_identity"))) && (this.mBundle.getInt("key_id_type", -1) != -1) && (!bo.isNullOrNil(this.mBundle.getString("key_true_name"))))
        {
          ab.i("MicroMsg.WalletCardElmentUI", "isForgot process, get identity info from input");
          this.toh.twe = this.mBundle.getString("key_identity");
          this.toh.twf = this.mBundle.getInt("key_id_type", -1);
          this.toh.twd = this.kGE;
          ab.i("MicroMsg.WalletCardElmentUI", "authen.true_name：" + this.toh.twd);
        }
        ab.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.toh.pGr + " elemt.bankcardTag : " + this.tvu.tuo);
        ab.i("MicroMsg.WalletCardElmentUI", " elemt.bankcardTag : " + this.tvu.tuo);
        localObject2 = this.mBundle;
        ((Bundle)localObject2).putString("key_mobile", (String)localObject1);
        ((Bundle)localObject2).putParcelable("key_authen", this.toh);
        ((Bundle)localObject2).putString("key_bank_phone", this.tvu.tyH);
        ((Bundle)localObject2).putString("key_country_code", this.countryCode);
        ((Bundle)localObject2).putString("key_province_code", this.fnp);
        ((Bundle)localObject2).putString("key_city_code", this.fno);
        ((Bundle)localObject2).putParcelable("key_profession", this.tvv);
        ((Bundle)localObject2).putString("key_country_iso", this.fHC);
        ((Bundle)localObject2).putString("key_bind_card_type", this.toh.pbn);
        ((Bundle)localObject2).putString("key_bind_card_show1", this.tvu.nuL);
        if (2 != this.tvu.tyE)
          break label1160;
        localObject1 = getString(2131304760);
        label1079: ((Bundle)localObject2).putString("key_bind_card_show2", (String)localObject1);
        if (!dOE().p(new Object[] { this.toh, this.pWy }))
          break label1171;
        ab.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
        AppMethodBeat.o(47246);
      }
      while (true)
      {
        return;
        bool = false;
        break;
        label1136: ((FavorPayInfo)localObject1).tzb = this.tpu.bC(((FavorPayInfo)localObject1).tzb, false);
        break label168;
        bool = false;
        break label522;
        localObject1 = getString(2131304780);
        break label1079;
        ab.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
        AppMethodBeat.o(47246);
      }
    }
  }

  private void cRt()
  {
    AppMethodBeat.i(47255);
    Object localObject;
    if ((this.tvu != null) && (this.tFF != null) && (this.tFF.containsKey(this.tvu.pbn)))
    {
      localObject = (b.a)this.tFF.get(this.tvu.pbn);
      if ((localObject == null) || (((b.a)localObject).tDR == null))
        break label135;
    }
    label135: for (double d = ((b.a)localObject).tDS; ; d = 0.0D)
    {
      localObject = getString(2131304635, new Object[] { e.G(d) });
      this.tFg.setText((CharSequence)localObject);
      this.tFg.setVisibility(0);
      AppMethodBeat.o(47255);
      while (true)
      {
        return;
        this.tFg.setVisibility(8);
        AppMethodBeat.o(47255);
      }
    }
  }

  private boolean cRu()
  {
    AppMethodBeat.i(47256);
    boolean bool = this.mBundle.getBoolean("key_is_forgot_process", false);
    AppMethodBeat.o(47256);
    return bool;
  }

  private void cu()
  {
    AppMethodBeat.i(47241);
    if (this.tvu == null)
      this.tvu = new ElementQuery();
    ab.i("MicroMsg.WalletCardElmentUI", "element: %s, %s", new Object[] { this.tvu.nuL, this.tvu.pbn });
    cRr();
    cRt();
    com.tencent.mm.wallet_core.a.aE(this);
    Object localObject1 = (Bankcard)this.mBundle.getParcelable("key_bankcard");
    Object localObject2;
    Object localObject3;
    if ((cRu()) && (localObject1 != null))
    {
      this.tFE.setHint(getString(2131304670, new Object[] { ((Bankcard)localObject1).field_bankcardTail }));
      localObject2 = this.tFE;
      localObject1 = this.tEZ;
      localObject3 = this.tFa;
      a(new boolean[] { true }, new WalletFormView[] { localObject2 }, (TextView)localObject1, (TextView)localObject3);
      localObject3 = this.tFi;
      localObject1 = this.tFb;
      localObject2 = this.tFc;
      a(new boolean[] { false }, new WalletFormView[] { localObject3 }, (TextView)localObject1, (TextView)localObject2);
    }
    while (true)
    {
      this.tFM = false;
      this.tFN = false;
      this.tFO = false;
      this.tFP = false;
      if ((this.tvu.tyZ == null) || (this.tvu.tyZ.isEmpty()))
        break;
      ab.i("MicroMsg.WalletCardElmentUI", "identity type： %s", new Object[] { Integer.valueOf(this.tsb) });
      localObject2 = this.tvu.tyZ.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (CreTypeRuleInfo)((Iterator)localObject2).next();
        if (((CreTypeRuleInfo)localObject1).txX == this.tsb)
        {
          if (((CreTypeRuleInfo)localObject1).txY.txT == 1)
          {
            ab.i("MicroMsg.WalletCardElmentUI", "need show cre count");
            this.tFM = true;
          }
          if (((CreTypeRuleInfo)localObject1).txY.txV == 1)
          {
            ab.i("MicroMsg.WalletCardElmentUI", "need show cre expire");
            this.tFN = true;
          }
          if (((CreTypeRuleInfo)localObject1).txY.txU == 1)
          {
            ab.i("MicroMsg.WalletCardElmentUI", "need show birthday");
            this.tFO = true;
          }
          if (((CreTypeRuleInfo)localObject1).txY.txW == 1)
          {
            ab.i("MicroMsg.WalletCardElmentUI", "need show cre type");
            if (r.cPI().cQq() > 0)
            {
              ab.i("MicroMsg.WalletCardElmentUI", "realnamed, show cre type");
              this.tFP = true;
            }
          }
        }
      }
      if (!bo.isNullOrNil(this.tvu.nuL))
      {
        this.tFi.setText(this.tvu.nuL);
        if (!this.tvu.cPe())
          break label599;
        this.tFS.setVisibility(0);
        this.tFS.setText(getString(2131304760));
      }
      while (true)
      {
        localObject1 = this.tFE;
        localObject3 = this.tEZ;
        localObject2 = this.tFa;
        a(new boolean[] { false }, new WalletFormView[] { localObject1 }, (TextView)localObject3, (TextView)localObject2, true);
        localObject1 = this.tFi;
        localObject2 = this.tFb;
        localObject3 = this.tFc;
        a(new boolean[] { true }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3, true);
        this.tFE.setOnInfoIvClickListener(this.tGe);
        if (!r.cPI().cQo().cPX())
          break label634;
        this.tFE.getInfoIv().setImageResource(2131232128);
        this.tFE.getInfoIv().setVisibility(0);
        break;
        label599: if (this.tvu.cPr())
        {
          this.tFS.setVisibility(0);
          this.tFS.setText(getString(2131304780));
        }
      }
      label634: this.tFE.getInfoIv().setVisibility(4);
    }
    if (!this.tFN)
    {
      this.tFW = 0;
      this.tFX = 0;
      this.tFY = 0;
    }
    if (!this.tFO)
    {
      this.tFZ = 0;
      this.tGa = 0;
      this.tGb = 0;
    }
    if (!this.tFM)
      this.tFV = 0;
    this.tFl.setVisibility(8);
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    boolean bool1;
    boolean bool2;
    if (Bankcard.Ho(this.tvu.tuo))
    {
      localObject4 = this.tEq;
      localObject1 = this.tFm;
      localObject5 = this.trX;
      localObject6 = this.tFq;
      localObject7 = this.tFr;
      localObject2 = this.trY;
      localObject3 = this.trZ;
      a(new boolean[] { 0, 0, 0, 0, 0 }, new WalletFormView[] { localObject4, localObject1, localObject5, localObject6, localObject7 }, (TextView)localObject2, (TextView)localObject3);
      this.tFn.setVisibility(8);
      nh(true);
      bool1 = this.tFO;
      if ((this.tsb == 2) && (this.tyN))
      {
        bool2 = true;
        localObject6 = this.tFp;
        localObject1 = this.tFo;
        localObject2 = this.tFs;
        localObject3 = this.tFt;
        localObject5 = this.tFh;
        a(new boolean[] { false, false, bool1, bool2 }, new WalletFormView[] { localObject6, localObject1, localObject2, localObject3 }, (TextView)localObject5, null);
        bool1 = this.tvu.tyy;
        bool2 = this.tvu.tyz;
        localObject1 = this.tFk;
        localObject3 = this.tFj;
        localObject2 = this.tFd;
        localObject5 = this.tFe;
        a(new boolean[] { bool1, bool2 }, new WalletFormView[] { localObject1, localObject3 }, (TextView)localObject2, (TextView)localObject5);
        if (this.tFi.getVisibility() != 0)
          break label2529;
        switch (this.tvu.tyD)
        {
        default:
          this.tFc.setVisibility(8);
          label1069: this.tFc.setTextColor(getResources().getColor(2131690312));
          label1086: if ((!bo.isNullOrNil(this.tvu.tyX)) && (this.tFc.getVisibility() != 0))
          {
            ab.i("MicroMsg.WalletCardElmentUI", "show pre auth word");
            this.tFc.setText(this.tvu.tyX);
            this.tFc.setVisibility(0);
          }
          if ((!bo.isNullOrNil(this.tvu.tyI)) && (com.tencent.mm.model.t.mY(this.tvu.tyI)) && (!cRu()))
          {
            this.tFI.setText(this.tvu.tyJ);
            this.tFI.setVisibility(0);
            AppMethodBeat.o(47241);
          }
          break;
        case 3:
        case 4:
        case 2:
        case 1:
        }
      }
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      int i;
      label1236: label1661: boolean bool3;
      label1333: boolean bool4;
      if ((this.tvu.cPs() != null) && (this.tvu.cPs().size() > 0))
      {
        i = 1;
        if ((!cRu()) && (!r.cPI().cQi()))
          break label2046;
        localObject2 = r.cPI().bhp();
        localObject1 = localObject2;
        if (bo.isNullOrNil((String)localObject2))
        {
          localObject1 = localObject2;
          if (dOD() != null)
            localObject1 = dOD().mqu.getString("key_true_name");
        }
        if (bo.isNullOrNil((String)localObject1))
          break label1885;
        localObject1 = getString(2131304720, new Object[] { e.att((String)localObject1) });
        this.tEq.setHint((CharSequence)localObject1);
        this.tFl.setHint((CharSequence)localObject1);
        if ((!cRu()) || (bo.isNullOrNil(this.mBundle.getString("key_identity"))) || (this.mBundle.getInt("key_id_type", -1) == -1) || (bo.isNullOrNil(this.mBundle.getString("key_true_name"))))
          break label1912;
        ab.i("MicroMsg.WalletCardElmentUI", "is forgot process, hide id info form");
        bool2 = this.tFM;
        bool1 = this.tFN;
        localObject2 = this.tEq;
        localObject6 = this.tFm;
        localObject7 = this.trX;
        localObject3 = this.tFq;
        localObject5 = this.tFr;
        localObject4 = this.trY;
        localObject1 = this.trZ;
        a(new boolean[] { false, false, false, bool2, bool1 }, new WalletFormView[] { localObject2, localObject6, localObject7, localObject3, localObject5 }, (TextView)localObject4, (TextView)localObject1);
        this.kGE = this.mBundle.getString("key_true_name");
        ab.i("MicroMsg.WalletCardElmentUI", "name is " + this.kGE);
        this.tFn.setVisibility(0);
        if (this.tEr != null)
        {
          if (!bo.isNullOrNil(this.tEr.field_mobile))
            a(this.tFn, this.tEr.field_mobile);
          if (!bo.isNullOrNil(this.tEr.twh))
            a(this.tFk, this.tEr.twh);
          if (!bo.isNullOrNil(this.tEr.twP))
            a(this.tFj, this.tEr.twP);
        }
        if (!this.tvu.tyw)
          break label2263;
        this.trZ.setText("");
        this.trX.setText(this.tvu.tyA);
        if (r.cPI().cQq() <= 0)
          break label2280;
        ab.i("MicroMsg.WalletCardElmentUI", "has cre_type: %s", new Object[] { Integer.valueOf(r.cPI().cQq()) });
        this.tFm.setClickable(false);
        this.tFm.setText(r.cPQ().fk(this));
        this.tFm.setInputEnable(false);
        a(this.trX, this.tsb);
        Hj(this.tsb);
        nh(false);
        bool3 = this.tFK;
        bool1 = this.tFL;
        bool4 = this.tFO;
        if ((this.tsb != 2) || (!this.tyN))
          break label2466;
      }
      label2466: for (bool2 = true; ; bool2 = false)
      {
        localObject1 = this.tFp;
        localObject2 = this.tFo;
        localObject3 = this.tFs;
        localObject5 = this.tFt;
        localObject6 = this.tFh;
        a(new boolean[] { bool3, bool1, bool4, bool2 }, new WalletFormView[] { localObject1, localObject2, localObject3, localObject5 }, (TextView)localObject6, null);
        break;
        i = 0;
        break label1236;
        label1885: localObject1 = getString(2131304719);
        this.tEq.setHint((CharSequence)localObject1);
        this.tFl.setHint((CharSequence)localObject1);
        break label1333;
        label1912: if ((this.tFP) || (i != 0));
        for (bool2 = true; ; bool2 = false)
        {
          bool1 = this.tFM;
          bool4 = this.tFN;
          localObject1 = this.tEq;
          localObject6 = this.tFm;
          localObject4 = this.trX;
          localObject2 = this.tFq;
          localObject5 = this.tFr;
          localObject7 = this.trY;
          localObject3 = this.trZ;
          a(new boolean[] { true, bool2, true, bool1, bool4 }, new WalletFormView[] { localObject1, localObject6, localObject4, localObject2, localObject5 }, (TextView)localObject7, (TextView)localObject3);
          break;
        }
        label2046: bool1 = this.tvu.tyw;
        if ((this.tFP) || ((i != 0) && (this.tvu.tyx)));
        for (bool2 = true; ; bool2 = false)
        {
          bool3 = this.tvu.tyx;
          boolean bool5 = this.tFM;
          bool4 = this.tFN;
          localObject7 = this.tEq;
          localObject5 = this.tFm;
          localObject6 = this.trX;
          localObject2 = this.tFq;
          localObject3 = this.tFr;
          localObject4 = this.trY;
          localObject1 = this.trZ;
          a(new boolean[] { bool1, bool2, bool3, bool5, bool4 }, new WalletFormView[] { localObject7, localObject5, localObject6, localObject2, localObject3 }, (TextView)localObject4, (TextView)localObject1);
          this.tFn.setVisibility(0);
          ab.i("MicroMsg.WalletCardElmentUI", "elemt canModifyName:" + this.tvu.tyw + " canModifyIdentity:" + this.tvu.tyx);
          break;
        }
        label2263: this.trZ.setText(getString(2131304676));
        break label1661;
        label2280: ab.i("MicroMsg.WalletCardElmentUI", "cre_type count: %s", new Object[] { Integer.valueOf(this.tGd.getCount()) });
        if (this.tGd.getCount() <= 1)
        {
          this.tFm.setClickable(false);
          this.tFm.setInputEnable(false);
          this.trX.setInputEnable(true);
        }
        while (true)
        {
          localObject1 = this.tvu.cPs();
          if ((localObject1 == null) || (!((List)localObject1).contains(Integer.valueOf(this.tsb))))
            this.tsb = 1;
          if (!r.cPQ().Z(this, this.tsb).equals(this.tGc))
            com.tencent.mm.plugin.report.service.h.pYm.e(16816, new Object[] { Integer.valueOf(this.tsb) });
          this.tFm.setText(r.cPQ().Z(this, this.tsb));
          break;
          this.tFm.setClickable(true);
          this.tFm.setInputEnable(true);
          this.trX.setInputEnable(true);
        }
      }
      this.tFc.setText(2131304641);
      this.tFc.setVisibility(0);
      break label1069;
      this.tFc.setVisibility(8);
      break label1069;
      this.tFc.setVisibility(8);
      break label1069;
      this.tFc.setVisibility(8);
      break label1069;
      label2529: this.tFc.setVisibility(8);
      break label1086;
      this.tFI.setVisibility(8);
      AppMethodBeat.o(47241);
    }
  }

  private void nh(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(47243);
    int j;
    if (paramBoolean)
    {
      Object localObject = this.rvM;
      if (this.tvu.tyL)
      {
        j = 0;
        ((TextView)localObject).setVisibility(j);
        localObject = this.tFu;
        if (!this.tvu.tyL)
          break label226;
        j = 0;
        label54: ((WalletFormView)localObject).setVisibility(j);
        localObject = this.tFv;
        if (!this.tvu.tyM)
          break label233;
        j = 0;
        label78: ((WalletFormView)localObject).setVisibility(j);
        localObject = this.tFw;
        if (!this.tvu.tyN)
          break label240;
        j = 0;
        label102: ((WalletFormView)localObject).setVisibility(j);
        localObject = this.tFx;
        if (!this.tvu.tyQ)
          break label247;
        j = 0;
        label126: ((WalletFormView)localObject).setVisibility(j);
        localObject = this.tFy;
        if (!this.tvu.tyS)
          break label254;
        j = 0;
        label150: ((WalletFormView)localObject).setVisibility(j);
        localObject = this.tFz;
        if (!this.tvu.tyR)
          break label261;
        j = 0;
        label174: ((WalletFormView)localObject).setVisibility(j);
        localObject = this.tFA;
        if (!this.tvu.tyT)
          break label268;
        j = i;
        label198: ((WalletFormView)localObject).setVisibility(j);
        this.tFf.setVisibility(4);
        AppMethodBeat.o(47243);
      }
    }
    while (true)
    {
      return;
      j = 8;
      break;
      label226: j = 8;
      break label54;
      label233: j = 8;
      break label78;
      label240: j = 8;
      break label102;
      label247: j = 8;
      break label126;
      label254: j = 8;
      break label150;
      label261: j = 8;
      break label174;
      label268: j = 8;
      break label198;
      this.rvM.setVisibility(8);
      this.tFu.setVisibility(8);
      this.tFv.setVisibility(8);
      this.tFw.setVisibility(8);
      this.tFx.setVisibility(8);
      this.tFy.setVisibility(8);
      this.tFz.setVisibility(8);
      this.tFA.setVisibility(8);
      this.tFf.setVisibility(8);
      AppMethodBeat.o(47243);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(47247);
    ab.i("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.mBundle;
      ab.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.pVL);
      if ((paramm instanceof y))
      {
        ab.i("MicroMsg.WalletCardElmentUI", "query bound bank card resp, forwardProcess");
        com.tencent.mm.wallet_core.a.j(this, paramString);
        bool = true;
        AppMethodBeat.o(47247);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(47247);
      continue;
      AppMethodBeat.o(47247);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971075;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47250);
    arW();
    AppMethodBeat.o(47250);
  }

  public final void initView()
  {
    AppMethodBeat.i(47239);
    this.tEZ = ((TextView)findViewById(2131828710));
    this.tFE = ((WalletFormView)findViewById(2131828712));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.tFE);
    this.tFa = ((TextView)findViewById(2131828713));
    this.trY = ((TextView)findViewById(2131828718));
    this.tEq = ((WalletFormView)findViewById(2131828681));
    this.tFl = ((WalletFormView)findViewById(2131828711));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.tEq);
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.tFl);
    this.tFm = ((WalletFormView)findViewById(2131828719));
    this.trX = ((WalletFormView)findViewById(2131828720));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.trX);
    this.trZ = ((TextView)findViewById(2131828729));
    this.tFb = ((TextView)findViewById(2131823368));
    this.tFi = ((WalletFormView)findViewById(2131828714));
    this.tFS = ((WalletFormView)findViewById(2131823369));
    this.tFc = ((TextView)findViewById(2131828716));
    this.tFg = ((TextView)findViewById(2131828715));
    this.tFd = ((TextView)findViewById(2131828717));
    this.tFk = ((WalletFormView)findViewById(2131826502));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.tFk);
    this.tFj = ((WalletFormView)findViewById(2131826504));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.tFj);
    this.tFe = ((TextView)findViewById(2131826503));
    this.rvM = ((TextView)findViewById(2131828730));
    this.tFu = ((WalletFormView)findViewById(2131828731));
    this.tFv = ((WalletFormView)findViewById(2131828732));
    this.tFw = ((WalletFormView)findViewById(2131828733));
    this.tFx = ((WalletFormView)findViewById(2131828734));
    this.tFy = ((WalletFormView)findViewById(2131828735));
    this.tFz = ((WalletFormView)findViewById(2131828736));
    this.tFA = ((WalletFormView)findViewById(2131828737));
    com.tencent.mm.wallet_core.ui.formview.a.e(this.tFA);
    this.tFf = ((TextView)findViewById(2131828738));
    this.tFH = ((CheckBox)findViewById(2131828739));
    this.tFI = ((CheckBox)findViewById(2131828740));
    this.gEZ = ((Button)findViewById(2131822846));
    this.tFC = ((ScrollView)findViewById(2131823366));
    this.tFo = ((WalletFormView)findViewById(2131828724));
    this.tFp = ((WalletFormView)findViewById(2131828725));
    this.tFq = ((WalletFormView)findViewById(2131828722));
    this.tFr = ((WalletFormView)findViewById(2131828721));
    this.tFs = ((WalletFormView)findViewById(2131828726));
    this.tFt = ((WalletFormView)findViewById(2131828727));
    this.tFh = ((TextView)findViewById(2131828723));
    this.tFB = ((WalletPhoneInputView)findViewById(2131828728));
    this.tFn = this.tFB.getPhoneNumberEt();
    this.tEq.setOnInputValidChangeListener(this);
    this.tFl.setOnInputValidChangeListener(this);
    this.tFE.setOnInputValidChangeListener(this);
    this.tFm.setOnInputValidChangeListener(this);
    this.trX.setOnInputValidChangeListener(this);
    this.tFn.setOnInputValidChangeListener(new WalletFormView.a()
    {
      public final void hY(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(47211);
        if (!paramAnonymousBoolean)
        {
          WalletCardElementUI.a(WalletCardElementUI.this);
          WalletCardElementUI.this.mBundle.putParcelable("key_history_bankcard", null);
        }
        WalletCardElementUI.b(WalletCardElementUI.this);
        AppMethodBeat.o(47211);
      }
    });
    this.tFk.setOnInputValidChangeListener(this);
    this.tFj.setOnInputValidChangeListener(this);
    this.tFu.setOnInputValidChangeListener(this);
    this.tFv.setOnInputValidChangeListener(this);
    this.tFw.setOnInputValidChangeListener(this);
    this.tFx.setOnInputValidChangeListener(this);
    this.tFy.setOnInputValidChangeListener(this);
    this.tFz.setOnInputValidChangeListener(this);
    this.tFA.setOnInputValidChangeListener(this);
    this.tFo.setOnInputValidChangeListener(this);
    this.tFp.setOnInputValidChangeListener(this);
    this.tEq.setOnEditorActionListener(this);
    this.tFl.setOnEditorActionListener(this);
    this.tFE.setOnEditorActionListener(this);
    this.tFm.setOnEditorActionListener(this);
    this.trX.setOnEditorActionListener(this);
    this.tFn.setOnEditorActionListener(this);
    this.tFk.setOnEditorActionListener(this);
    this.tFj.setOnEditorActionListener(this);
    this.tFu.setOnEditorActionListener(this);
    this.tFv.setOnEditorActionListener(this);
    this.tFw.setOnEditorActionListener(this);
    this.tFx.setOnEditorActionListener(this);
    this.tFy.setOnEditorActionListener(this);
    this.tFz.setOnEditorActionListener(this);
    this.tFA.setOnEditorActionListener(this);
    this.tFp.setOnEditorActionListener(this);
    this.tFo.setOnEditorActionListener(this);
    this.tFi.setOnClickListener(new WalletCardElementUI.11(this));
    this.tFS.setOnClickListener(new WalletCardElementUI.12(this));
    this.tFm.setOnClickListener(new WalletCardElementUI.13(this));
    Object localObject = new String[100];
    for (int i = 0; i < 100; i++)
      localObject[i] = getString(2131304759, new Object[] { Integer.valueOf(i) });
    this.tFq.setOnClickListener(new WalletCardElementUI.14(this, (String[])localObject));
    this.tFr.setOnClickListener(new WalletCardElementUI.15(this));
    this.tFp.setOnClickListener(new WalletCardElementUI.16(this));
    this.tFo.setOnClickListener(new WalletCardElementUI.17(this));
    this.tFs.setOnClickListener(new WalletCardElementUI.18(this));
    this.tFt.setOnClickListener(new WalletCardElementUI.2(this));
    this.tFH.setChecked(true);
    this.tFH.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(47213);
        WalletCardElementUI.b(WalletCardElementUI.this);
        AppMethodBeat.o(47213);
      }
    });
    findViewById(2131826067).setOnClickListener(new WalletCardElementUI.4(this));
    this.tFw.setOnClickListener(new WalletCardElementUI.5(this));
    this.gEZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(47216);
        WalletCardElementUI.u(WalletCardElementUI.this);
        AppMethodBeat.o(47216);
      }
    });
    e(this.tFE, 0, false);
    e(this.trX, 1, false);
    a(this.tFn, 0, false, true, true);
    if ((this.tvu != null) && (!bo.isNullOrNil(this.tvu.tyK)))
    {
      com.tencent.mm.ui.base.h.a(this, this.tvu.tyK, null, true, null);
      this.tvu = null;
    }
    label1442: 
    while (true)
    {
      cu();
      arW();
      localObject = com.tencent.mm.wallet_core.a.aE(this);
      if ((localObject != null) && (((com.tencent.mm.wallet_core.c)localObject).dNG()))
      {
        localObject = (Orders)this.mBundle.getParcelable("key_orders");
        if ((localObject != null) && (((Orders)localObject).tAb == 1))
        {
          this.tFG = true;
          this.tEq.setText(e.att(((Orders)localObject).twd));
          this.tEq.setEnabled(false);
          this.tEq.setFocusable(false);
          this.tsb = ((Orders)localObject).tAc;
          this.tFm.setText(r.cPQ().Z(this, this.tsb));
          this.tFm.setEnabled(false);
          this.trX.setText(((Orders)localObject).tyA);
          this.trX.setInputEnable(false);
          this.trX.setFocusable(false);
          this.trY.setText(2131304634);
          AppMethodBeat.o(47239);
        }
      }
      while (true)
      {
        return;
        if ((this.mBundle.getInt("key_bind_scene", -1) != 5) || (this.tvu.tza))
          break label1442;
        com.tencent.mm.ui.base.h.a(this, getString(2131305457), null, true, null);
        this.tvu.nuL = null;
        break;
        this.tFG = false;
        AppMethodBeat.o(47239);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(47248);
    ab.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (this.tFB.e(paramInt1, paramInt2, paramIntent))
      AppMethodBeat.o(47248);
    while (true)
    {
      return;
      if ((paramInt1 == 6) && (paramInt2 == 100))
      {
        if (!bo.isNullOrNil(paramIntent.getStringExtra("country_name")))
        {
          this.fHC = paramIntent.getStringExtra("iso_code");
          this.tFt.setText(paramIntent.getStringExtra("country_name"));
        }
        AppMethodBeat.o(47248);
      }
      else
      {
        if (paramInt2 == -1)
          break;
        AppMethodBeat.o(47248);
      }
    }
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      arW();
      AppMethodBeat.o(47248);
      break;
      this.tvu = null;
      this.tFU = 0;
      this.tFR = paramIntent.getStringExtra("bank_name");
      this.tFi.setText(this.tFR);
      this.tFS.setVisibility(0);
      this.tFS.setText("");
      paramIntent = r.cPQ().tum;
      this.tFT.clear();
      if (paramIntent != null)
      {
        paramIntent = paramIntent.iterator();
        do
        {
          do
          {
            if (!paramIntent.hasNext())
              break;
            localObject = (ElementQuery)paramIntent.next();
          }
          while (!((ElementQuery)localObject).nuL.equals(this.tFR));
          this.tFT.add(localObject);
          if ((this.mBundle.getInt("key_bind_scene", -1) == 5) && (!((ElementQuery)localObject).tza))
            ((ElementQuery)localObject).tyK = getString(2131305455);
        }
        while (this.tFT.size() < 2);
      }
      if (this.tFT.size() == 1)
        this.tvu = ((ElementQuery)this.tFT.get(0));
      ab.i("MicroMsg.WalletCardElmentUI", "select bank: %s, %s", new Object[] { this.tFR, Integer.valueOf(this.tFT.size()) });
      this.tEr = null;
      cu();
      continue;
      String str1 = paramIntent.getStringExtra("CountryName");
      Object localObject = paramIntent.getStringExtra("Country");
      this.tFJ = (str1 + "|" + (String)localObject);
      String str2 = paramIntent.getStringExtra("ProviceName");
      String str3 = paramIntent.getStringExtra("CityName");
      if (!bo.isNullOrNil(paramIntent.getStringExtra("Contact_City")))
      {
        this.nQt = (str2 + "|" + paramIntent.getStringExtra("Contact_Province"));
        this.nQu = (str3 + "|" + paramIntent.getStringExtra("Contact_City"));
        if (bo.isNullOrNil(str1))
        {
          this.tFw.setText(str2 + " " + str3);
          label605: if ((!"US".equals(localObject)) && (!"CA".equals(localObject)) && (!this.tvu.tyR))
            break label828;
          this.tFz.setVisibility(0);
        }
      }
      while (true)
      {
        ab.i("MicroMsg.WalletCardElmentUI", "onActivityResult for address countryName %s,countryCode %s, provinceName %s, cityName %s, mCity %s", new Object[] { str1, localObject, str2, str3, this.nQu });
        break;
        this.tFw.setText(str1 + " " + str3);
        break label605;
        if (!bo.isNullOrNil(paramIntent.getStringExtra("Contact_Province")))
        {
          this.nQu = (str2 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.tFw.setText(str1 + " " + str2);
          break label605;
        }
        this.nQu = this.tFJ;
        this.tFw.setText(str1);
        break label605;
        label828: this.tFz.setVisibility(8);
      }
      paramIntent = paramIntent.getStringExtra("key_bankcard_id");
      this.tFE.set3DesValStr(paramIntent);
      continue;
      localObject = paramIntent.getStringExtra("CountryName");
      str1 = paramIntent.getStringExtra("ProviceName");
      str2 = paramIntent.getStringExtra("CityName");
      this.countryCode = paramIntent.getStringExtra("Country");
      this.fnp = paramIntent.getStringExtra("Contact_Province");
      this.fno = paramIntent.getStringExtra("Contact_City");
      paramIntent = new StringBuilder();
      if (!bo.isNullOrNil((String)localObject))
        paramIntent.append((String)localObject);
      if (!bo.isNullOrNil(str1))
        paramIntent.append(" ").append(str1);
      if (!bo.isNullOrNil(str2))
        paramIntent.append(" ").append(str2);
      this.tFp.setText(paramIntent.toString());
      continue;
      this.tvv = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
      this.tFo.setText(this.tvv.tvN);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(47238);
    super.onCreate(paramBundle);
    this.tvu = ((ElementQuery)this.mBundle.getParcelable("elemt_query"));
    this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
    this.pVL = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
    this.tsb = r.cPI().cQq();
    this.tEr = ((Bankcard)this.mBundle.getParcelable("key_history_bankcard"));
    this.tFK = this.mBundle.getBoolean("key_need_area", false);
    this.tFL = this.mBundle.getBoolean("key_need_profession", false);
    this.tyN = this.mBundle.getBoolean("key_need_country", false);
    this.tFQ = this.mBundle.getStringArray("key_country_excludes");
    ab.d("MicroMsg.WalletCardElmentUI", "neeCountry: %s", new Object[] { Boolean.valueOf(this.tyN) });
    if ((this.tFK) || (this.tFL))
      setMMTitle(2131304786);
    while (true)
    {
      paramBundle = this.mBundle.getParcelableArray("key_profession_list");
      if (paramBundle == null)
        break;
      this.tur = new Profession[paramBundle.length];
      while (i < paramBundle.length)
      {
        this.tur[i] = ((Profession)paramBundle[i]);
        i++;
      }
      setMMTitle(2131304785);
    }
    if (this.pVL == null)
      this.pVL = new PayInfo();
    ab.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.pVL);
    paramBundle = (FavorPayInfo)this.mBundle.getParcelable("key_favor_pay_info");
    if ((this.pWy != null) && (paramBundle != null))
    {
      this.tpu = c.tDU.a(this.pWy);
      if (this.tpu == null)
        break label407;
      paramBundle = this.tpu.acW(paramBundle.tzb);
      this.tFF = this.tpu.acR(paramBundle);
    }
    while (true)
    {
      initView();
      this.tFC.pageScroll(33);
      d.a(this, this.mBundle, 3);
      com.tencent.mm.sdk.b.a.xxA.c(this.trF);
      AppMethodBeat.o(47238);
      return;
      label407: ab.w("MicroMsg.WalletCardElmentUI", " get favorLogicHelper null");
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47252);
    com.tencent.mm.sdk.b.a.xxA.d(this.trF);
    super.onDestroy();
    AppMethodBeat.o(47252);
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(47251);
    ab.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : ".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    default:
      if (this.tFD == null)
        cRs();
      AppMethodBeat.o(47251);
      return bool2;
    case 5:
    }
    if (this.tFD != null)
    {
      paramTextView = this.tFD;
      if (paramTextView.Aih != null)
      {
        bool2 = paramTextView.Aih.isFocusable();
        label96: if (!bool2)
          break label166;
        paramTextView = this.tFD;
        bool2 = bool1;
        if (paramTextView.Aih != null)
          bool2 = paramTextView.Aih.isClickable();
        if ((!bool2) || (!this.tFD.dOQ()))
          break label166;
        this.tFD.dOS();
      }
    }
    while (true)
    {
      bool2 = true;
      AppMethodBeat.o(47251);
      break;
      bool2 = false;
      break label96;
      label166: this.tFD.performClick();
      continue;
      cRs();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI
 * JD-Core Version:    0.6.2
 */