package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.cgd;
import com.tencent.mm.protocal.protobuf.cgv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b extends i
{
  public static final int tLO;
  public static final int tLP;
  public static final int tLQ;
  public static final int tLR;
  private ViewGroup ius;
  private View lBD;
  private Context mContext;
  private MyKeyboardWindow mKeyboard;
  public PayInfo pVL;
  public Orders pWy;
  private TextView tJL;
  private TextView tLS;
  private TextView tLT;
  private TextView tLU;
  private WalletTextView tLV;
  private ViewGroup tLW;
  private EditHintPasswdView tLX;
  private ViewGroup tLY;
  private Button tLZ;
  private ImageView tLy;
  public b.a tMA;
  List<b.b> tMB;
  private TextView tMa;
  private ViewGroup tMb;
  private CdnImageView tMc;
  private TextView tMd;
  private Button tMe;
  private ViewGroup tMf;
  private WcPayCashierDetailItemLayout tMg;
  private WcPayCashierDetailItemLayout tMh;
  private WcPayCashierDetailItemLayout tMi;
  private WcPayCashierDetailItemLayout tMj;
  private c tMk;
  private a tMl;
  private com.tencent.mm.plugin.wallet_core.ui.l tMm;
  private int tMn;
  private int tMo;
  private int tMp;
  public Bankcard tMq;
  private boolean tMr;
  private boolean tMs;
  private boolean tMt;
  private boolean tMu;
  private String tMv;
  private String tMw;
  private String tMx;
  private boolean tMy;
  private boolean tMz;
  private com.tencent.mm.plugin.wallet_core.utils.a tln;
  public FavorPayInfo toH;

  static
  {
    AppMethodBeat.i(47823);
    tLO = com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 30);
    tLP = com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 32);
    tLQ = com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 36);
    tLR = com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 23);
    AppMethodBeat.o(47823);
  }

  public b(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(47781);
    this.tMn = 0;
    this.tMo = 0;
    this.tMp = 0;
    this.pVL = new PayInfo();
    this.pWy = new Orders();
    this.tMr = false;
    this.tMt = true;
    this.tMB = new ArrayList();
    this.mContext = paramContext;
    this.ius = ((ViewGroup)View.inflate(getContext(), 2130971195, null));
    this.tLy = ((ImageView)this.ius.findViewById(2131829110));
    this.tLS = ((TextView)this.ius.findViewById(2131829109));
    this.tLT = ((TextView)this.ius.findViewById(2131829111));
    this.tLU = ((TextView)this.ius.findViewById(2131829112));
    this.tJL = ((TextView)this.ius.findViewById(2131829114));
    this.tLV = ((WalletTextView)this.ius.findViewById(2131829113));
    this.tLW = ((ViewGroup)this.ius.findViewById(2131829116));
    this.tLX = ((EditHintPasswdView)this.ius.findViewById(2131829123));
    this.tLY = ((ViewGroup)this.ius.findViewById(2131829122));
    this.tMh = ((WcPayCashierDetailItemLayout)this.ius.findViewById(2131829117));
    this.tLZ = ((Button)this.ius.findViewById(2131829125));
    this.tMa = ((TextView)this.ius.findViewById(2131829124));
    this.tMb = ((ViewGroup)this.ius.findViewById(2131829118));
    this.tMc = ((CdnImageView)this.ius.findViewById(2131829119));
    this.tMd = ((TextView)this.ius.findViewById(2131829120));
    this.tMe = ((Button)this.ius.findViewById(2131829121));
    this.mKeyboard = ((MyKeyboardWindow)this.ius.findViewById(2131822357));
    this.tMf = ((ViewGroup)this.ius.findViewById(2131822356));
    this.lBD = this.ius.findViewById(2131829115);
    paramContext = this.tLy;
    int i = tLO;
    int j = tLO;
    bo.n(paramContext, i, i, j, j);
    paramContext = com.tencent.mm.ui.ah.f(getContext(), 2131230739, getContext().getResources().getColor(2131689762));
    this.tLy.setImageDrawable(paramContext);
    this.tLy.setOnClickListener(new b.9(this));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.tLX);
    this.tLX.setOnInputValidListener(new b.10(this));
    EditText localEditText = (EditText)this.ius.findViewById(2131820687);
    com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(localEditText);
    this.mKeyboard.setInputEditText(localEditText);
    if (Build.VERSION.SDK_INT >= 14)
    {
      paramContext = new com.tencent.mm.ui.a.c();
      this.mKeyboard.setSecureAccessibility(paramContext);
      localEditText.setAccessibilityDelegate(paramContext);
    }
    localEditText.setOnClickListener(new b.11(this));
    this.ius.findViewById(2131822358).setOnClickListener(new b.12(this));
    this.tLZ.setOnClickListener(new b.13(this));
    this.tLT.setOnClickListener(new b.14(this));
    setCancelable(true);
    setCanceledOnTouchOutside(false);
    setOnCancelListener(new b.1(this));
    setOnDismissListener(new b.8(this));
    this.tln = new com.tencent.mm.plugin.wallet_core.utils.a();
    AppMethodBeat.o(47781);
  }

  private void HA(int paramInt)
  {
    AppMethodBeat.i(47799);
    LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.tLY.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)this.tLZ.getLayoutParams();
    if (paramInt == 0)
      localLayoutParams1.topMargin = tLR;
    for (localLayoutParams2.topMargin = tLR; ; localLayoutParams2.topMargin = tLQ)
    {
      this.tLY.setLayoutParams(localLayoutParams1);
      this.tLZ.setLayoutParams(localLayoutParams2);
      this.tMb.setVisibility(paramInt);
      AppMethodBeat.o(47799);
      return;
      localLayoutParams1.topMargin = tLP;
    }
  }

  private void a(Bankcard paramBankcard, CdnImageView paramCdnImageView)
  {
    AppMethodBeat.i(47794);
    if (paramBankcard == null)
    {
      ab.e("MicroMsg.WcPayCashierDialog", "setBankcardText bankcard == null");
      AppMethodBeat.o(47794);
    }
    while (true)
    {
      return;
      if (paramBankcard.cPc())
      {
        paramCdnImageView.setImageResource(2130840657);
        AppMethodBeat.o(47794);
      }
      else if (paramBankcard.cPd())
      {
        this.tln.a(paramBankcard, paramCdnImageView);
        AppMethodBeat.o(47794);
      }
      else if (paramBankcard.cPg())
      {
        paramCdnImageView.setImageDrawable(com.tencent.mm.svg.a.a.f(getContext().getResources(), 2131231368));
        if (!bo.isNullOrNil(paramBankcard.txk))
        {
          paramCdnImageView.setUseSdcardCache(true);
          paramCdnImageView.setImgSavedPath(com.tencent.mm.plugin.wallet_core.d.b.cRb());
          paramCdnImageView.eb(paramBankcard.txk, 2131231368);
          AppMethodBeat.o(47794);
        }
      }
      else
      {
        this.tln.a(getContext(), paramBankcard, paramCdnImageView);
        AppMethodBeat.o(47794);
      }
    }
  }

  private void a(PayInfo paramPayInfo, Orders paramOrders, FavorPayInfo paramFavorPayInfo, String paramString, Bankcard paramBankcard, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(47785);
    ab.i("MicroMsg.WcPayCashierDialog", "set view data: %s, %s, %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramBankcard });
    this.pVL = paramPayInfo;
    this.pWy = paramOrders;
    this.toH = paramFavorPayInfo;
    this.tMq = paramBankcard;
    this.tMs = paramBoolean1;
    this.tMv = paramString;
    cSc();
    cSn();
    cSi();
    cSl();
    cSk();
    cSg();
    cSd();
    cSb();
    cSe();
    cSh();
    cSf();
    if (paramBoolean2)
      setOnShowListener(new b.15(this));
    AppMethodBeat.o(47785);
  }

  private static boolean a(PayInfo paramPayInfo)
  {
    if ((paramPayInfo != null) && ((paramPayInfo.cIf == 31) || (paramPayInfo.cIf == 32) || (paramPayInfo.cIf == 33)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void c(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    AppMethodBeat.i(47805);
    ab.i("MicroMsg.WcPayCashierDialog", "go to bankcard dialog");
    if (this.tMl != null)
      this.tMl.dismiss();
    hide();
    this.tLX.cey();
    int i;
    label62: a locala;
    Object localObject2;
    Object localObject4;
    Object localObject5;
    if (this.pVL == null)
    {
      i = 0;
      if (this.pVL != null)
        break label825;
      localObject1 = "";
      com.tencent.mm.wallet_core.c.ad.e(i, (String)localObject1, 11, "");
      this.tMl = new a(this.mContext);
      locala = this.tMl;
      localObject2 = this.pVL;
      localObject3 = this.pWy;
      localObject4 = this.toH;
      localObject5 = this.tMq;
      if (localObject5 != null)
        break label837;
      localObject1 = "";
      label129: ab.i("MicroMsg.WcPayCashierBankcardDialog", "set view data: %s, %s, %s", new Object[] { localObject1, Boolean.valueOf(paramBoolean1), Integer.valueOf(paramInt) });
      locala.pVL = ((PayInfo)localObject2);
      locala.pWy = ((Orders)localObject3);
      locala.toH = ((FavorPayInfo)localObject4);
      locala.jdField_try = ((Bankcard)localObject5);
      locala.tLC = ((Orders)localObject3).tuo;
      locala.tLD = paramBoolean1;
      locala.tLE = paramInt;
      if (locala.tLD)
        locala.tLF = false;
      if (locala.pVL.cIf != 8)
        break label847;
      localObject1 = (ArrayList)ac.ne(true);
      label247: localObject3 = localObject1;
      if (locala.toH != null)
      {
        if (locala.toH.tzc == 0)
          break label859;
        paramInt = 1;
        label272: localObject3 = localObject1;
        if (paramInt != 0)
        {
          if (locala.tLD)
            break label864;
          localObject3 = localObject1;
        }
      }
      label292: localObject3 = ((List)localObject3).iterator();
      label301: if (!((Iterator)localObject3).hasNext())
        break label1485;
      localObject4 = (Bankcard)((Iterator)localObject3).next();
      localObject2 = new WcPayCashierBankcardItemLayout(locala.getContext());
      locala.tLB.add(localObject2);
      locala.tLz.addView((View)localObject2);
      if (!((Bankcard)localObject4).cPc())
        break label968;
      com.tencent.mm.plugin.wallet_core.utils.a.j(((WcPayCashierBankcardItemLayout)localObject2).kqn);
      label376: if (!((Bankcard)localObject4).cPc())
        break label1172;
      localObject1 = r.cPI().thy;
      if (bo.isNullOrNil(((Bankcard)localObject1).twT))
        break label1097;
      ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setText(((Bankcard)localObject1).twT);
      label416: localObject1 = "";
      switch (((Bankcard)localObject4).a(locala.tLC, locala.pWy))
      {
      default:
        if (!bo.isNullOrNil(((Bankcard)localObject4).field_tips))
          localObject1 = ((Bankcard)localObject4).field_tips;
        label502: localObject5 = new SpannableStringBuilder((CharSequence)localObject1);
        if ((!bo.isNullOrNil(((Bankcard)localObject4).field_forbid_title)) && (!bo.isNullOrNil(((Bankcard)localObject4).field_forbid_url)))
        {
          ((SpannableStringBuilder)localObject5).append("  ");
          ((SpannableStringBuilder)localObject5).append(((Bankcard)localObject4).field_forbid_title);
          ((SpannableStringBuilder)localObject5).setSpan(new ForegroundColorSpan(locala.getContext().getResources().getColor(2131690624)), ((String)localObject1).length() + 2, ((SpannableStringBuilder)localObject5).length(), 34);
          ((WcPayCashierBankcardItemLayout)localObject2).tLK.setOnClickListener(new a.5(locala, (Bankcard)localObject4));
        }
        if (!bo.ac((CharSequence)localObject5))
        {
          ((WcPayCashierBankcardItemLayout)localObject2).tLK.setVisibility(0);
          ((WcPayCashierBankcardItemLayout)localObject2).tLK.setText((CharSequence)localObject5);
        }
        if ((locala.tLF) && (bo.ac((CharSequence)localObject5)))
        {
          localObject1 = locala.g((Bankcard)localObject4);
          if (((LinkedList)localObject1).size() > 0)
          {
            ((WcPayCashierBankcardItemLayout)localObject2).tGP.setVisibility(0);
            ((WcPayCashierBankcardItemLayout)localObject2).tLK.setVisibility(8);
            ((WcPayCashierBankcardItemLayout)localObject2).tGP.setWording((LinkedList)localObject1);
          }
        }
        if ((locala.jdField_try != null) && (((Bankcard)localObject4).field_bindSerial.equals(locala.jdField_try.field_bindSerial)))
          ((WcPayCashierBankcardItemLayout)localObject2).tLL.setChecked(true);
        if (((Bankcard)localObject4).a(locala.tLC, locala.pWy) != 0)
        {
          ((WcPayCashierBankcardItemLayout)localObject2).tLL.setChecked(false);
          ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setTextColor(locala.getContext().getResources().getColor(2131690155));
          ((WcPayCashierBankcardItemLayout)localObject2).setEnabled(false);
        }
        break;
      case 8:
      case 1:
      case 3:
      case 2:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    }
    while (true)
    {
      ((WcPayCashierBankcardItemLayout)localObject2).setOnClickListener(new a.6(locala, (Bankcard)localObject4));
      break label301;
      i = this.pVL.cIf;
      break;
      label825: localObject1 = this.pVL.czZ;
      break label62;
      label837: localObject1 = ((Bankcard)localObject5).field_desc;
      break label129;
      label847: localObject1 = (ArrayList)ac.ne(false);
      break label247;
      label859: paramInt = 0;
      break label272;
      label864: localObject4 = locala.toH.tzd;
      localObject3 = new ArrayList();
      paramInt = 0;
      if (paramInt < ((ArrayList)localObject1).size())
      {
        localObject2 = (Bankcard)((ArrayList)localObject1).get(paramInt);
        if (bo.isNullOrNil((String)localObject4))
          if (!((Bankcard)localObject2).field_bankcardType.equalsIgnoreCase("CFT"))
            ((ArrayList)localObject3).add(localObject2);
        while (true)
        {
          paramInt++;
          break;
          if (((Bankcard)localObject2).field_bankcardType.equals(localObject4))
            ((ArrayList)localObject3).add(localObject2);
        }
      }
      break label292;
      label968: if (((Bankcard)localObject4).cPd())
      {
        locala.tln.a((Bankcard)localObject4, ((WcPayCashierBankcardItemLayout)localObject2).kqn);
        break label376;
      }
      if (((Bankcard)localObject4).cPg())
      {
        ((WcPayCashierBankcardItemLayout)localObject2).kqn.setImageDrawable(com.tencent.mm.svg.a.a.f(locala.getContext().getResources(), 2131231368));
        if (bo.isNullOrNil(((Bankcard)localObject4).txk))
          break label376;
        ((WcPayCashierBankcardItemLayout)localObject2).kqn.setUseSdcardCache(true);
        ((WcPayCashierBankcardItemLayout)localObject2).kqn.setImgSavedPath(com.tencent.mm.plugin.wallet_core.d.b.cRb());
        ((WcPayCashierBankcardItemLayout)localObject2).kqn.eb(((Bankcard)localObject4).txk, 2131231368);
        break label376;
      }
      locala.tln.a(locala.getContext(), (Bankcard)localObject4, ((WcPayCashierBankcardItemLayout)localObject2).kqn);
      break label376;
      label1097: if (((Bankcard)localObject1).twS >= 0.0D)
      {
        localObject5 = ((WcPayCashierBankcardItemLayout)localObject2).tLJ;
        Context localContext = locala.getContext();
        locala.getContext();
        ((TextView)localObject5).setText(localContext.getString(ae.dOh(), new Object[] { com.tencent.mm.wallet_core.ui.e.G(((Bankcard)localObject1).twS) }));
        break label416;
      }
      ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setText("");
      break label416;
      label1172: if (((Bankcard)localObject4).cPd())
      {
        localObject1 = r.cPI().tCZ;
        if (!bo.isNullOrNil(((Bankcard)localObject1).twT))
        {
          ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setText(((Bankcard)localObject1).twT);
          break label416;
        }
        if (((Bankcard)localObject1).twS >= 0.0D)
        {
          ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setText(locala.getContext().getString(2131304913, new Object[] { com.tencent.mm.wallet_core.ui.e.G(((Bankcard)localObject1).twS) }));
          break label416;
        }
        ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setText("");
        break label416;
      }
      if (((Bankcard)localObject4).cPg())
      {
        ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setText(com.tencent.mm.pluginsdk.ui.e.j.b(locala.getContext(), ((Bankcard)localObject4).field_desc, ((WcPayCashierBankcardItemLayout)localObject2).tLJ.getTextSize()));
        break label416;
      }
      ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setText(((Bankcard)localObject4).field_desc);
      break label416;
      localObject1 = ((Bankcard)localObject4).field_forbidWord;
      break label502;
      localObject1 = locala.getContext().getString(2131305163);
      break label502;
      localObject1 = locala.getContext().getString(2131305174);
      break label502;
      localObject1 = locala.getContext().getString(2131305169);
      break label502;
      localObject1 = locala.getContext().getString(2131305165);
      break label502;
      localObject1 = locala.getContext().getString(2131305161);
      break label502;
      localObject1 = locala.getContext().getString(2131305167);
      break label502;
      localObject1 = locala.getContext().getString(2131305172);
      break label502;
      ((WcPayCashierBankcardItemLayout)localObject2).tLJ.setTextColor(locala.getContext().getResources().getColor(2131689761));
      ((WcPayCashierBankcardItemLayout)localObject2).setEnabled(true);
    }
    label1485: Object localObject3 = new WcPayCashierBankcardItemLayout(locala.getContext());
    ((WcPayCashierBankcardItemLayout)localObject3).kqn.setVisibility(4);
    ((WcPayCashierBankcardItemLayout)localObject3).tLJ.setText(2131305157);
    ((WcPayCashierBankcardItemLayout)localObject3).tLJ.setTextColor(locala.getContext().getResources().getColor(2131690208));
    ((WcPayCashierBankcardItemLayout)localObject3).tLL.setVisibility(8);
    Object localObject1 = locala.cRZ();
    if ((locala.tLF) && (((LinkedList)localObject1).size() > 0))
    {
      ((WcPayCashierBankcardItemLayout)localObject3).tGP.setVisibility(0);
      ((WcPayCashierBankcardItemLayout)localObject3).tLK.setVisibility(8);
      ((WcPayCashierBankcardItemLayout)localObject3).tGP.setWording((LinkedList)localObject1);
    }
    ((WcPayCashierBankcardItemLayout)localObject3).setOnClickListener(new a.7(locala));
    locala.tLz.addView((View)localObject3);
    localObject3 = "";
    localObject1 = localObject3;
    if (locala.pWy != null)
    {
      localObject1 = localObject3;
      if (locala.pWy.tAq != null)
      {
        localObject1 = localObject3;
        if (locala.pWy.tAq.size() > 0)
          localObject1 = locala.getContext().getString(2131304727, new Object[] { com.tencent.mm.wallet_core.ui.e.e(locala.pWy.pTN, locala.pWy.pcl), ((Orders.Commodity)locala.pWy.tAq.get(0)).desc });
      }
    }
    if ((locala.toH != null) && (!bo.isNullOrNil(locala.toH.tzf)))
    {
      locala.tLA.setVisibility(0);
      locala.tLA.setText(locala.toH.tzf);
      locala.toH.tzf = "";
    }
    while (true)
    {
      localObject1 = this.tMl.tLH;
      this.tMB.add(localObject1);
      this.tMl.tLG = new b.7(this, paramBoolean2);
      this.tMl.show();
      AppMethodBeat.o(47805);
      return;
      if (locala.tLE != 0)
      {
        locala.tLA.setVisibility(0);
        locala.tLA.setText((CharSequence)localObject1);
      }
      else
      {
        locala.tLA.setVisibility(8);
      }
    }
  }

  private void cSb()
  {
    AppMethodBeat.i(47786);
    if ((this.pWy.field_infos != null) && (!this.pWy.field_infos.isEmpty()))
    {
      Iterator localIterator = this.pWy.field_infos.iterator();
      if (localIterator.hasNext())
      {
        cgd localcgd = (cgd)localIterator.next();
        WcPayCashierDetailItemLayout localWcPayCashierDetailItemLayout = new WcPayCashierDetailItemLayout(getContext());
        localWcPayCashierDetailItemLayout.tLM.setVisibility(8);
        if ((localcgd.xfg != null) && (localcgd.xfg.size() > 0))
          com.tencent.mm.plugin.wallet_core.utils.e.a(localWcPayCashierDetailItemLayout.pQF, (cgv)localcgd.xfg.get(0), null);
        if ((localcgd.xfh != null) && (localcgd.xfh.size() > 0))
          com.tencent.mm.plugin.wallet_core.utils.e.a(localWcPayCashierDetailItemLayout.kRK, (cgv)localcgd.xfh.get(0), null);
        if (localcgd.xfi != null)
        {
          int i = com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 5);
          int j = com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 9);
          com.tencent.mm.plugin.wallet_core.utils.e.a(localWcPayCashierDetailItemLayout.tLN, localcgd.xfi, 2131230917, i, j, true);
          localWcPayCashierDetailItemLayout.tLN.setVisibility(0);
        }
        while (true)
        {
          this.tLW.addView(localWcPayCashierDetailItemLayout);
          break;
          localWcPayCashierDetailItemLayout.tLN.setVisibility(8);
        }
      }
    }
    AppMethodBeat.o(47786);
  }

  private void cSc()
  {
    AppMethodBeat.i(47787);
    Object localObject1 = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
    if (localObject1 != null)
      if ((this.toH != null) && (this.tMq != null))
        if (!this.tMq.field_bankcardType.equalsIgnoreCase("CFT"))
          break label461;
    label193: label203: label461: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WcPayCashierDialog", "selectedFavorCompId %s isFilterNotSupportCft %s", new Object[] { this.toH.tzb, Boolean.valueOf(bool) });
      String str = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).bC(this.toH.tzb, bool);
      ab.i("MicroMsg.WcPayCashierDialog", "nonBankSelectedFaovrCompId %s", new Object[] { str });
      Object localObject2 = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).acS(str);
      Object localObject3 = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).bB(str, true);
      com.tencent.mm.plugin.wallet_core.ui.b.a locala1 = (com.tencent.mm.plugin.wallet_core.ui.b.a)((Map)localObject2).get(this.tMq.field_bindSerial);
      com.tencent.mm.plugin.wallet_core.ui.b.a locala2 = (com.tencent.mm.plugin.wallet_core.ui.b.a)((Map)localObject3).get(this.tMq.field_bankcardType);
      com.tencent.mm.plugin.wallet.a.j localj = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).bA(str, bool);
      if (localj == null)
      {
        localObject1 = "";
        if (locala1 != null)
          break label288;
        localObject3 = "";
        if (locala2 != null)
          break label298;
        localObject2 = "";
        ab.i("MicroMsg.WcPayCashierDialog", "defaultComposeInfo %s wrapperSerial %s wrapper %s", new Object[] { localObject1, localObject3, localObject2 });
        if ((locala1 == null) || (locala1.tDR == null) || (bo.isNullOrNil(locala1.tDR.tnk)))
          break label308;
        this.toH.tzb = locala1.tDR.tnk;
        AppMethodBeat.o(47787);
      }
      while (true)
      {
        return;
        localObject1 = localj.tnk;
        break;
        localObject3 = locala1.toString();
        break label193;
        localObject2 = locala2.toString();
        break label203;
        if ((locala2 != null) && (locala2.tDR != null) && (!bo.isNullOrNil(locala2.tDR.tnk)))
        {
          this.toH.tzb = locala2.tDR.tnk;
          AppMethodBeat.o(47787);
        }
        else if (localj != null)
        {
          this.toH.tzb = localj.tnk;
          AppMethodBeat.o(47787);
        }
        else
        {
          this.toH.tzb = str;
          AppMethodBeat.o(47787);
          continue;
          if (this.pWy.tAr != null)
          {
            this.toH = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).acX(((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).acY(this.pWy.tAr.tmU));
            AppMethodBeat.o(47787);
            continue;
            ab.d("MicroMsg.WcPayCashierDialog", "getFavorLogicHelper null");
          }
          else
          {
            AppMethodBeat.o(47787);
          }
        }
      }
    }
  }

  private void cSd()
  {
    AppMethodBeat.i(47788);
    if (this.tMu)
    {
      ab.i("MicroMsg.WcPayCashierDialog", "don't show foreign currency");
      if (this.tMj != null)
      {
        this.tLW.removeView(this.tMj);
        this.tMj = null;
      }
      AppMethodBeat.o(47788);
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(this.pWy.tAI)) && (!bo.isNullOrNil(this.pWy.tAJ)))
      {
        this.tMj = new WcPayCashierDetailItemLayout(getContext());
        this.tLW.addView(this.tMj, 0);
        this.tMj.tLM.setVisibility(8);
        this.tMj.tLN.setVisibility(8);
        this.tMj.pQF.setText(2131306067);
        StringBuilder localStringBuilder;
        if ((this.pWy.tAI.equals("CNY")) && (!bo.isNullOrNil(this.pWy.tAH)))
        {
          localStringBuilder = new StringBuilder(this.pWy.tAJ);
          localStringBuilder.append(this.pWy.tAH);
          if ((!bo.isNullOrNil(this.pWy.tAL)) && (!bo.isNullOrNil(this.pWy.tAM)))
            localStringBuilder.append(String.format("(%s%s)", new Object[] { this.pWy.tAM, this.pWy.tAK }));
          this.tMj.kRK.setText(localStringBuilder);
          AppMethodBeat.o(47788);
        }
        else
        {
          localStringBuilder = new StringBuilder(this.pWy.tAJ);
          localStringBuilder.append(this.pWy.tAH);
          this.tMj.kRK.setText(localStringBuilder);
        }
      }
      else
      {
        AppMethodBeat.o(47788);
      }
    }
  }

  private void cSe()
  {
    AppMethodBeat.i(47789);
    com.tencent.mm.plugin.wallet_core.ui.b localb = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
    if ((this.toH == null) || ((localb != null) && (!localb.cRi())))
    {
      this.tLW.removeView(this.tMi);
      this.tMi = null;
      AppMethodBeat.o(47789);
    }
    while (true)
    {
      return;
      if (this.tMi == null)
      {
        this.tMi = new WcPayCashierDetailItemLayout(getContext());
        this.tLW.addView(this.tMi);
        this.tMi.pQF.setText(2131306066);
        this.tMi.tLM.setVisibility(8);
        this.tMi.tLN.setVisibility(0);
        this.tMi.kRK.setTextColor(getContext().getResources().getColor(2131689576));
        this.tMi.setOnClickListener(new b.2(this));
      }
      k(this.tMi.kRK);
      AppMethodBeat.o(47789);
    }
  }

  private void cSf()
  {
    AppMethodBeat.i(47791);
    if ((this.tLW.getChildCount() == 0) && (this.tMh.getVisibility() == 8))
    {
      ab.d("MicroMsg.WcPayCashierDialog", "invisible divider");
      this.lBD.setVisibility(8);
      AppMethodBeat.o(47791);
    }
    while (true)
    {
      return;
      this.lBD.setVisibility(0);
      AppMethodBeat.o(47791);
    }
  }

  private void cSg()
  {
    AppMethodBeat.i(47792);
    if (!this.tMu)
    {
      if (this.tMg != null)
      {
        this.tLW.removeView(this.tMg);
        this.tMg = null;
      }
      AppMethodBeat.o(47792);
      return;
    }
    if (this.tMg == null)
    {
      this.tMg = new WcPayCashierDetailItemLayout(getContext());
      this.tLW.addView(this.tMg, 0);
      this.tMg.pQF.setText(2131306068);
      this.tMg.tLM.setVisibility(8);
      this.tMg.tLN.setVisibility(8);
      localObject = com.tencent.mm.wallet_core.ui.e.QQ(7);
      this.tMg.kRK.setTypeface(Typeface.createFromAsset(getContext().getAssets(), (String)localObject));
      this.tMg.kRK.getPaint().setFlags(16);
    }
    double d = com.tencent.mm.wallet_core.ui.e.b(this.pWy.tAH, "100", RoundingMode.HALF_UP);
    Object localObject = "";
    if (d > 0.0D)
      localObject = String.format("%s%s", new Object[] { this.pWy.tAJ, com.tencent.mm.wallet_core.ui.e.F(d) });
    String str = com.tencent.mm.wallet_core.ui.e.e(this.pWy.pTN, this.pWy.pcl);
    if (!bo.isNullOrNil((String)localObject));
    for (localObject = String.format("%s(%s)", new Object[] { str, localObject }); ; localObject = str)
    {
      this.tMg.kRK.setText((CharSequence)localObject);
      AppMethodBeat.o(47792);
      break;
    }
  }

  private void cSh()
  {
    AppMethodBeat.i(47793);
    if (!this.tMs)
    {
      ab.i("MicroMsg.WcPayCashierDialog", "can not change pay way");
      this.tMh.setVisibility(8);
      AppMethodBeat.o(47793);
      return;
    }
    this.tMh.setVisibility(0);
    this.tMh.pQF.setText(2131306069);
    this.tMh.tLM.setVisibility(0);
    this.tMh.tLN.setVisibility(0);
    this.tMh.setOnClickListener(new b.3(this));
    this.tMh.tLM.setImageBitmap(null);
    a(this.tMq, this.tMh.tLM);
    if (this.tMq == null);
    for (String str = ""; ; str = this.tMq.field_desc)
    {
      Object localObject = str;
      if (this.tMq != null)
      {
        localObject = str;
        if (this.tMq.cPg())
          localObject = com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, str);
      }
      this.tMh.kRK.setText((CharSequence)localObject);
      AppMethodBeat.o(47793);
      break;
    }
  }

  private void cSi()
  {
    AppMethodBeat.i(47795);
    cSj();
    cSm();
    AppMethodBeat.o(47795);
  }

  private void cSj()
  {
    AppMethodBeat.i(47796);
    Object localObject1 = "";
    Object localObject2;
    if (this.tMy)
    {
      localObject2 = this.tMw;
      this.tLU.setText((CharSequence)localObject2);
      AppMethodBeat.o(47796);
      return;
    }
    if (this.pVL.vwh == null)
    {
      localObject2 = "";
      label51: if (bo.isNullOrNil((String)localObject2))
        break label209;
    }
    while (true)
    {
      if ((!bo.isNullOrNil((String)localObject2)) || (this.pWy == null) || (this.pWy.tAq == null))
        break label964;
      Object localObject3 = (Orders.Commodity)this.pWy.tAq.get(0);
      if (localObject3 == null)
        break label1000;
      localObject2 = ((Orders.Commodity)localObject3).pca;
      localObject1 = localObject2;
      if (a(this.pVL))
      {
        localObject1 = localObject2;
        if (!bo.isNullOrNil((String)localObject2))
          localObject1 = (String)localObject2 + "\n";
        localObject1 = (String)localObject1 + ((Orders.Commodity)localObject3).desc;
      }
      localObject2 = localObject1;
      if (!bo.isNullOrNil((String)localObject1))
        break;
      localObject2 = ((Orders.Commodity)localObject3).desc;
      break;
      localObject2 = this.pVL.vwh.getString("extinfo_key_19", "");
      break label51;
      label209: if ((this.pVL.cIf == 32) || (this.pVL.cIf == 33))
      {
        String str1 = this.pVL.vwh.getString("extinfo_key_5", "");
        String str2 = this.pVL.vwh.getString("extinfo_key_1", "");
        localObject3 = getContext().getString(2131305241);
        localObject2 = localObject1;
        if (!bo.isNullOrNil(str1))
        {
          localObject3 = str1;
          localObject2 = str1;
        }
        if (!bo.isNullOrNil(str2))
        {
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM(str2);
          if (localObject1 != null)
          {
            localObject2 = ((com.tencent.mm.storage.ad)localObject1).Oj();
            localObject1 = new StringBuilder().append(com.tencent.mm.wallet_core.ui.e.atA((String)localObject2));
            if (bo.isNullOrNil(this.pVL.pPw));
            for (localObject2 = ""; ; localObject2 = "(" + this.pVL.pPw + ")")
            {
              localObject2 = bo.t((String)localObject3, new Object[] { (String)localObject2 });
              break;
            }
          }
          ab.e("MicroMsg.WcPayCashierDialog", "can not found contact for user::".concat(String.valueOf(str2)));
        }
        else
        {
          ab.e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
        }
      }
      else if (this.pVL.cIf == 31)
      {
        localObject2 = this.pVL.vwh.getString("extinfo_key_1", "");
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM((String)localObject2);
          if (localObject3 != null)
          {
            localObject2 = ((com.tencent.mm.storage.ad)localObject3).Oi();
            localObject1 = getContext();
            localObject3 = new StringBuilder().append((String)localObject2);
            if (bo.isNullOrNil(this.pVL.pPw));
            for (localObject2 = ""; ; localObject2 = "(" + this.pVL.pPw + ")")
            {
              localObject2 = ((Context)localObject1).getString(2131305241, new Object[] { (String)localObject2 });
              break;
            }
          }
          ab.e("MicroMsg.WcPayCashierDialog", "can not found contact for user::".concat(String.valueOf(localObject2)));
          localObject2 = localObject1;
        }
        else
        {
          ab.e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
          localObject2 = localObject1;
        }
      }
      else if (this.pVL.cIf == 42)
      {
        localObject3 = this.pVL.vwh.getString("extinfo_key_1", "");
        if (!bo.isNullOrNil((String)localObject3))
        {
          g.RQ();
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM((String)localObject3);
          if (localObject2 != null)
          {
            localObject2 = ((com.tencent.mm.storage.ad)localObject2).Oi();
            localObject1 = getContext();
            localObject3 = new StringBuilder().append((String)localObject2);
            if (bo.isNullOrNil(this.pVL.pPw));
            for (localObject2 = ""; ; localObject2 = "(" + this.pVL.pPw + ")")
            {
              localObject2 = ((Context)localObject1).getString(2131305235, new Object[] { (String)localObject2 });
              break;
            }
          }
          ab.e("MicroMsg.WcPayCashierDialog", "can not found contact for user::".concat(String.valueOf(localObject3)));
          localObject2 = localObject1;
        }
        else
        {
          ab.e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
          localObject2 = localObject1;
        }
      }
      else if (this.pVL.cIf == 48)
      {
        localObject2 = getContext().getString(2131302062);
      }
      else
      {
        localObject2 = localObject1;
        if (this.pVL.cIf == 49)
        {
          localObject2 = this.pVL.vwh.getString("extinfo_key_1", "");
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject2 = getContext().getString(2131305241, new Object[] { localObject2 });
          }
          else
          {
            ab.e("MicroMsg.WcPayCashierDialog", "userName is null, scene is %s", new Object[] { Integer.valueOf(this.pVL.cIf) });
            localObject2 = localObject1;
          }
        }
      }
    }
    label964: localObject1 = new StringBuilder("orders null?:");
    if (this.pWy == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.w("MicroMsg.WcPayCashierDialog", bool);
      label1000: break;
    }
  }

  private void cSk()
  {
    AppMethodBeat.i(47797);
    if (!bo.isNullOrNil(this.tMv))
    {
      this.tJL.setText(this.tMv);
      this.tJL.setVisibility(0);
      AppMethodBeat.o(47797);
    }
    while (true)
    {
      return;
      this.tJL.setVisibility(8);
      AppMethodBeat.o(47797);
    }
  }

  private void cSl()
  {
    AppMethodBeat.i(47798);
    if ((this.tMt) && (this.pWy.tAr.tnh != null) && (this.pWy.tAr.tnh.tmD == 1))
    {
      com.tencent.mm.plugin.wallet.a.b localb = this.pWy.tAr.tnh;
      this.tMc.setUrl(localb.tmK);
      this.tMd.setText(localb.tmF);
      if (!bo.isNullOrNil(localb.tmG))
        this.tMd.setTextColor(Color.parseColor(localb.tmG));
      this.tMe.setText(localb.tmH);
      if (!bo.isNullOrNil(localb.tmI))
        this.tMe.setTextColor(Color.parseColor(localb.tmI));
      this.tMe.setOnClickListener(new b.4(this, localb));
      HA(0);
      AppMethodBeat.o(47798);
    }
    while (true)
    {
      return;
      HA(8);
      AppMethodBeat.o(47798);
    }
  }

  private void cSm()
  {
    AppMethodBeat.i(47800);
    Object localObject1;
    if (this.tMy)
      localObject1 = this.tMx;
    while (true)
    {
      this.tLV.setText((CharSequence)localObject1);
      AppMethodBeat.o(47800);
      return;
      Object localObject2 = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
      localObject1 = com.tencent.mm.wallet_core.ui.e.e(this.pWy.pTN, this.pWy.pcl);
      this.tMu = false;
      if (localObject2 != null)
      {
        localObject1 = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject2).acU(this.toH.tzb);
        localObject2 = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject2).cRl();
        if ((localObject1 != null) && (((com.tencent.mm.plugin.wallet.a.j)localObject1).tnb > 0.0D))
        {
          this.tMu = true;
          localObject1 = com.tencent.mm.wallet_core.ui.e.e(((com.tencent.mm.plugin.wallet.a.j)localObject1).tna, this.pWy.pcl);
        }
        else if ((localObject1 != null) && (((List)localObject2).size() > 0))
        {
          localObject1 = com.tencent.mm.wallet_core.ui.e.e(((com.tencent.mm.plugin.wallet.a.j)localObject1).tna, this.pWy.pcl);
        }
        else
        {
          localObject1 = com.tencent.mm.wallet_core.ui.e.e(this.pWy.pTN, this.pWy.pcl);
        }
      }
    }
  }

  private void cSn()
  {
    AppMethodBeat.i(47801);
    cSo();
    ab.i("MicroMsg.WcPayCashierDialog", "use touch pay: %s", new Object[] { Integer.valueOf(this.pWy.tAo) });
    boolean bool;
    if (this.tMn == 0)
      if (this.tMo > 0)
      {
        bool = false;
        nr(bool);
        AppMethodBeat.o(47801);
      }
    while (true)
    {
      return;
      if ((this.tMp == 1) || (this.tMp == 3))
      {
        this.tMa.setVisibility(8);
        bool = true;
        break;
      }
      if (this.pVL.vwi == 100102)
      {
        g.RP().Ry().set(ac.a.xKS, Boolean.TRUE);
        com.tencent.mm.pluginsdk.l locall = (com.tencent.mm.pluginsdk.l)g.K(com.tencent.mm.pluginsdk.l.class);
        locall.hq(false);
        locall.hr(false);
        g.RP().Ry().set(ac.a.xKQ, Boolean.FALSE);
        this.tMa.setText(2131304808);
      }
      while (true)
      {
        this.tMa.setTextColor(getContext().getResources().getColor(2131690648));
        this.tMa.setVisibility(0);
        bool = true;
        break;
        this.tMa.setText(2131304801);
      }
      if (this.tMn == 1)
      {
        cSp();
        AppMethodBeat.o(47801);
      }
      else
      {
        if (this.tMn == 2)
          cSq();
        AppMethodBeat.o(47801);
      }
    }
  }

  private void cSo()
  {
    AppMethodBeat.i(138559);
    ab.i("MicroMsg.WcPayCashierDialog", "update verify way");
    com.tencent.mm.pluginsdk.l locall;
    if (this.pWy.tAo == 1)
    {
      locall = (com.tencent.mm.pluginsdk.l)g.K(com.tencent.mm.pluginsdk.l.class);
      if ((locall.bxn()) && (locall.bxo()) && (!locall.bxf()) && (locall.bxe()))
      {
        this.tMo = 1;
        if ((r.cPI() == null) || (this.tMo <= 0))
          break label289;
      }
    }
    label289: for (boolean bool = locall.bxz(); ; bool = true)
    {
      if (!bool)
      {
        this.tMo = 0;
        this.tMp = 3;
        label111: this.tMn = this.tMo;
        ab.i("MicroMsg.WcPayCashierDialog", "keystatus: %s, errcode: %s, payway: %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.pVL.vwi), Integer.valueOf(this.tMn) });
        AppMethodBeat.o(138559);
      }
      while (true)
      {
        return;
        if ((locall.bxA()) && (locall.bxB()) && (!locall.bxg()) && (locall.bxh()))
        {
          this.tMo = 2;
          break;
        }
        this.tMo = 0;
        this.tMp = 2;
        break;
        if ((this.pVL.vwi != 100000) && (this.pVL.vwi != 100102))
          break label111;
        this.tMo = 0;
        this.tMp = 4;
        break label111;
        this.tMn = 0;
        this.tMo = 0;
        this.tMp = 1;
        AppMethodBeat.o(138559);
      }
    }
  }

  private void cSp()
  {
    AppMethodBeat.i(47803);
    this.tMn = 1;
    this.tLY.setVisibility(8);
    this.tLZ.setVisibility(0);
    this.tMf.setVisibility(8);
    this.tLS.setVisibility(8);
    this.tLT.setText(2131305244);
    AppMethodBeat.o(47803);
  }

  private void cSq()
  {
    AppMethodBeat.i(47804);
    this.tMn = 2;
    this.tLY.setVisibility(8);
    this.tLZ.setVisibility(0);
    this.tMf.setVisibility(8);
    this.tLS.setVisibility(8);
    this.tLT.setText(2131305244);
    AppMethodBeat.o(47804);
  }

  private void k(TextView paramTextView)
  {
    AppMethodBeat.i(47790);
    com.tencent.mm.plugin.wallet_core.ui.b localb = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
    com.tencent.mm.plugin.wallet.a.j localj = localb.acU(this.toH.tzb);
    List localList = localb.cRl();
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = "";
    int i;
    if ((localj != null) && (localj.tnb > 0.0D))
    {
      localStringBuilder.append(localj.tnd);
      i = 1;
    }
    while (true)
    {
      if ((localj != null) && (localj.tnc != 0) && (!bo.ac(localStringBuilder)))
      {
        localStringBuilder.append(",");
        localStringBuilder.append(localj.tne);
      }
      if ((!bo.ac(localStringBuilder)) && (!bo.isNullOrNil((String)localObject)))
      {
        localStringBuilder.append(",");
        localStringBuilder.append((String)localObject);
        label146: localObject = localStringBuilder.toString();
        ab.i("MicroMsg.WcPayCashierDialog", "favor text: %s", new Object[] { localObject });
        if (i == 0)
          break label339;
        paramTextView.setTextColor(getContext().getResources().getColor(2131689576));
      }
      while (true)
      {
        paramTextView.setText((CharSequence)localObject);
        AppMethodBeat.o(47790);
        return;
        if (localList.size() <= 0)
          break label359;
        localObject = localb.cRk();
        if ((localj == null) && (localb.cRj() == 1) && (localObject != null) && (((com.tencent.mm.plugin.wallet.a.j)localObject).tnc == 0) && (this.tMt) && (this.pWy.tAr.tnh != null) && (this.pWy.tAr.tnh.tmD == 1))
        {
          localObject = getContext().getString(2131306063);
          i = 0;
          break;
        }
        localObject = getContext().getString(2131305238);
        i = 1;
        break;
        if (bo.isNullOrNil((String)localObject))
          break label146;
        localStringBuilder.append((String)localObject);
        break label146;
        label339: paramTextView.setTextColor(getContext().getResources().getColor(2131690155));
      }
      label359: i = 1;
    }
  }

  private void nr(boolean paramBoolean)
  {
    AppMethodBeat.i(47802);
    ab.i("MicroMsg.WcPayCashierDialog", "switch to pwd: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.tMn = 0;
    this.tLY.setVisibility(0);
    this.tLZ.setVisibility(8);
    this.tMf.setVisibility(0);
    this.tLS.setVisibility(0);
    if (paramBoolean)
    {
      this.tLT.setVisibility(8);
      AppMethodBeat.o(47802);
    }
    while (true)
    {
      return;
      this.tLT.setVisibility(0);
      AppMethodBeat.o(47802);
    }
  }

  public final void a(PayInfo paramPayInfo, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(47784);
    a(paramPayInfo, paramOrders, paramFavorPayInfo, "", paramBankcard, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(47784);
  }

  public final void aq(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(47783);
    this.tMw = paramString1;
    this.tMx = paramString2;
    this.tMv = paramString3;
    this.tMy = true;
    this.tMs = false;
    cSn();
    cSi();
    cSk();
    cSh();
    cSf();
    AppMethodBeat.o(47783);
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47782);
    super.onCreate(paramBundle);
    setContentView(this.ius);
    Window localWindow = getWindow();
    localWindow.getDecorView().setPadding(0, 0, 0, 0);
    paramBundle = localWindow.getAttributes();
    paramBundle.width = -1;
    paramBundle.height = -1;
    localWindow.setAttributes(paramBundle);
    localWindow.addFlags(67108864);
    d.iW(21);
    AppMethodBeat.o(47782);
  }

  public final void show()
  {
    AppMethodBeat.i(138093);
    super.show();
    AppMethodBeat.o(138093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b
 * JD-Core Version:    0.6.2
 */