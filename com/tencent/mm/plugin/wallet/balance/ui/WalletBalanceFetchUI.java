package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.balance.a.d.a;
import com.tencent.mm.plugin.wallet_core.c.v;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.b.a;
import com.tencent.mm.plugin.wallet_core.model.j;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@com.tencent.mm.ui.base.a(2)
public class WalletBalanceFetchUI extends WalletBaseUI
  implements WalletFormView.a
{
  private String czZ;
  private Button gHn;
  private final int gnS;
  private View jcl;
  private double pQV;
  private String rMr;
  private ArrayList<Bankcard> tgB;
  private Bankcard tgC;
  private String tgD;
  private WalletFormView tgE;
  private LinearLayout tgF;
  private View tgG;
  private TextView tgH;
  private TextView tgI;
  private TextView tgJ;
  private TextView tgK;
  private TextView tgL;
  private ViewGroup tgM;
  private ViewGroup tgN;
  private int tgO;
  private int tgP;
  private int tgQ;
  private double tgR;
  private int tgS;
  private int tgT;
  private DecimalFormat tgU;
  private boolean tgV;
  private int tgW;
  private int tgX;
  private com.tencent.mm.plugin.wallet.balance.a.b tgY;
  private Runnable tgZ;
  private boolean tha;
  private boolean thb;
  private boolean thc;
  private boolean thd;

  public WalletBalanceFetchUI()
  {
    AppMethodBeat.i(45386);
    this.gnS = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 270);
    this.czZ = null;
    this.tgO = 0;
    this.tgP = 0;
    this.tgQ = 0;
    this.tgR = 0.0D;
    this.tgS = -1;
    this.tgT = 0;
    this.tgU = new DecimalFormat("0.00");
    this.tgV = false;
    this.tgW = 0;
    this.tgX = 0;
    this.tgZ = new WalletBalanceFetchUI.1(this);
    this.tha = false;
    this.thb = false;
    this.thc = false;
    this.thd = false;
    AppMethodBeat.o(45386);
  }

  private double C(double paramDouble)
  {
    AppMethodBeat.i(45397);
    s.cNC();
    ak localak = s.cND();
    paramDouble = Math.max(com.tencent.mm.wallet_core.ui.e.c(paramDouble - localak.tCX.pPt, this.tgC.field_fetch_charge_rate, RoundingMode.HALF_UP), this.tgR);
    AppMethodBeat.o(45397);
    return paramDouble;
  }

  private void a(com.tencent.mm.plugin.wallet.balance.a.d paramd)
  {
    AppMethodBeat.i(45398);
    if (!bo.isNullOrNil(this.czZ))
    {
      Object localObject = new PayInfo();
      ((PayInfo)localObject).czZ = this.czZ;
      ((PayInfo)localObject).cIf = 21;
      this.mBundle.putParcelable("key_pay_info", (Parcelable)localObject);
      localObject = new Orders();
      ((Orders)localObject).pTN = (paramd.pPz - paramd.pPp);
      ((Orders)localObject).tAa = (paramd.pPz - paramd.pPp);
      ((Orders)localObject).tAq.add(new Orders.Commodity());
      ((Orders)localObject).pPp = paramd.pPp;
      this.mBundle.putParcelable("key_orders", (Parcelable)localObject);
      this.mBundle.putParcelable("key_bankcard", this.tgC);
      this.mBundle.putString("key_fetch_cashier_desc", paramd.tfb);
      this.mBundle.putString("key_report_session_id", this.rMr);
      if (dOD() == null)
      {
        com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.b.class, this.mBundle, null);
        AppMethodBeat.o(45398);
      }
    }
    while (true)
    {
      return;
      dOE().p(new Object[] { this.mBundle });
      AppMethodBeat.o(45398);
      continue;
      ab.w("MicroMsg.WalletBalanceFetchUI", "hy: req key is null. abandon");
      AppMethodBeat.o(45398);
    }
  }

  private void au(Intent paramIntent)
  {
    AppMethodBeat.i(45409);
    this.tgV = av(paramIntent);
    if (this.tgV)
    {
      ab.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card success");
      PayInfo localPayInfo = (PayInfo)this.mBundle.get("key_pay_info");
      paramIntent = localPayInfo;
      if (localPayInfo == null)
      {
        paramIntent = new PayInfo();
        paramIntent.czZ = this.czZ;
        paramIntent.cIf = 21;
      }
      a(new v(paramIntent.czZ), true, false);
    }
    AppMethodBeat.o(45409);
  }

  private static boolean av(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(45411);
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_bind_end", false)))
    {
      bool = true;
      AppMethodBeat.o(45411);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(45411);
    }
  }

  private boolean b(com.tencent.mm.plugin.wallet.balance.a.d paramd)
  {
    AppMethodBeat.i(45403);
    boolean bool1 = false;
    if (!this.tha)
      bool1 = c(paramd);
    boolean bool2 = bool1;
    if (!bool1)
      bool2 = d(paramd);
    bool1 = bool2;
    if (!bool2)
    {
      bool1 = bool2;
      if (!this.thb)
        bool1 = e(paramd);
    }
    bool2 = bool1;
    if (!bool1)
    {
      bool2 = bool1;
      if (!this.thc)
        bool2 = f(paramd);
    }
    AppMethodBeat.o(45403);
    return bool2;
  }

  private boolean c(com.tencent.mm.plugin.wallet.balance.a.d paramd)
  {
    boolean bool = false;
    AppMethodBeat.i(45404);
    if (paramd.teW)
    {
      this.tha = true;
      com.tencent.mm.ui.base.h.a(this, false, paramd.teX, "", getString(2131296994), getString(2131296868), new WalletBalanceFetchUI.4(this, paramd), new WalletBalanceFetchUI.5(this));
      AppMethodBeat.o(45404);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(45404);
    }
  }

  private void cMO()
  {
    AppMethodBeat.i(45392);
    if (this.tgC != null)
    {
      this.tgR = com.tencent.mm.wallet_core.ui.e.b(this.tgC.txn, "100", RoundingMode.HALF_UP);
      ab.i("MicroMsg.WalletBalanceFetchUI", "min charge fee: %s", new Object[] { Double.valueOf(this.tgR) });
    }
    AppMethodBeat.o(45392);
  }

  private void cMP()
  {
    AppMethodBeat.i(45394);
    s.cNC();
    com.tencent.mm.plugin.wallet_core.model.b localb = s.cND().tCX;
    this.mController.removeAllOptionMenu();
    if ((localb != null) && (localb.twB != null) && (localb.twB.twD != null) && (localb.twB.twD.length > 0))
      addIconOptionMenu(0, 2131230740, new WalletBalanceFetchUI.26(this, localb));
    AppMethodBeat.o(45394);
  }

  private void cMQ()
  {
    AppMethodBeat.i(45395);
    if ((this.pQV > 0.0D) && (this.tgC != null))
    {
      this.gHn.setEnabled(true);
      AppMethodBeat.o(45395);
    }
    while (true)
    {
      return;
      this.gHn.setEnabled(false);
      AppMethodBeat.o(45395);
    }
  }

  private void cMR()
  {
    AppMethodBeat.i(45396);
    double d;
    StringBuilder localStringBuilder;
    if (this.tgW == 0)
    {
      this.pQV = bo.getDouble(this.tgE.getText(), 0.0D);
      d = this.pQV;
      s.cNC();
      if ((d != s.cND().thy.twU) && (this.tgC != null))
      {
        d = this.pQV;
        s.cNC();
        if (d != s.cND().thy.twU - this.tgC.field_full_fetch_charge_fee)
          this.tgT = 0;
      }
      localStringBuilder = new StringBuilder();
      d = this.pQV;
      s.cNC();
      if (d <= s.cND().thy.twS)
        break label181;
      this.tgL.setVisibility(8);
      this.tgK.setTextColor(getResources().getColor(2131690384));
      localStringBuilder.append(getString(2131304546));
    }
    while (true)
    {
      this.tgK.setText(localStringBuilder.toString());
      AppMethodBeat.o(45396);
      return;
      label181: String str;
      if ((this.tgC != null) && (this.tgO != 0) && ((this.tgO != 1) || (this.tgC.field_fetch_charge_rate > 0.0D)) && ((this.tgO != 1) || (this.tgC.field_fetch_charge_rate <= 0.0D) || (this.tgP != 0)))
      {
        d = this.tgR;
        s.cNC();
        if (d < s.cND().thy.twU);
      }
      else
      {
        this.tgL.setVisibility(0);
        this.tgK.setTextColor(getResources().getColor(2131690164));
        s.cNC();
        str = s.cND().thy.twZ;
        if (!bo.isNullOrNil(str))
          localStringBuilder.append(str);
        while (true)
        {
          localStringBuilder.append("，");
          break;
          ab.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          s.cNC();
          localStringBuilder.append(getString(2131304537, new Object[] { com.tencent.mm.wallet_core.ui.e.e(s.cND().thy.twU, "CNY") }));
        }
      }
      if ((this.tgO == 1) && (this.tgC.field_fetch_charge_rate > 0.0D) && (this.tgP == 1) && ((this.pQV <= 0.0D) || (!this.tgE.asa())))
      {
        this.tgL.setVisibility(0);
        this.tgK.setTextColor(getResources().getColor(2131690164));
        s.cNC();
        str = s.cND().thy.twZ;
        if (!bo.isNullOrNil(str))
          localStringBuilder.append(str);
        while (true)
        {
          localStringBuilder.append("，");
          break;
          ab.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          s.cNC();
          localStringBuilder.append(getString(2131304537, new Object[] { com.tencent.mm.wallet_core.ui.e.e(s.cND().thy.twU, "CNY") }));
        }
      }
      if ((this.tgO == 1) && (this.tgC.field_fetch_charge_rate > 0.0D) && (this.tgP == 1))
      {
        this.tgL.setVisibility(8);
        this.tgK.setTextColor(getResources().getColor(2131690164));
        d = this.pQV;
        s.cNC();
        if ((d == s.cND().thy.twU - this.tgC.field_full_fetch_charge_fee) && (this.tgC.field_full_fetch_charge_fee > 0.0D))
        {
          if (!bo.isNullOrNil(this.tgC.txm))
            localStringBuilder.append(String.format(this.tgC.txm, new Object[] { com.tencent.mm.wallet_core.ui.e.e(this.tgC.field_full_fetch_charge_fee, "CNY") }));
          else
            localStringBuilder.append(getString(2131304519, new Object[] { com.tencent.mm.wallet_core.ui.e.e(this.tgC.field_full_fetch_charge_fee, "CNY"), this.tgC.field_fetch_charge_rate * 100.0D + "%" }));
        }
        else if (!bo.isNullOrNil(this.tgC.txm))
          localStringBuilder.append(String.format(this.tgC.txm, new Object[] { com.tencent.mm.wallet_core.ui.e.e(C(this.pQV), "CNY") }));
        else
          localStringBuilder.append(getString(2131304519, new Object[] { com.tencent.mm.wallet_core.ui.e.e(C(this.pQV), "CNY"), this.tgC.field_fetch_charge_rate * 100.0D + "%" }));
      }
    }
  }

  private void cMS()
  {
    AppMethodBeat.i(45400);
    cfk();
    cu();
    cMV();
    AppMethodBeat.o(45400);
  }

  private void cMT()
  {
    this.tha = false;
    this.thb = false;
    this.thc = false;
    this.thd = false;
  }

  private void cMU()
  {
    AppMethodBeat.i(45410);
    Object localObject = com.tencent.mm.plugin.wallet_core.model.g.cPl();
    if (((com.tencent.mm.plugin.wallet_core.model.g)localObject).aFF())
    {
      com.tencent.mm.ui.base.h.b(this, ((com.tencent.mm.plugin.wallet_core.model.g)localObject).pbp, getString(2131297061), true);
      AppMethodBeat.o(45410);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      PayInfo localPayInfo = (PayInfo)this.mBundle.get("key_pay_info");
      localObject = localPayInfo;
      if (localPayInfo == null)
      {
        localObject = new PayInfo();
        ((PayInfo)localObject).czZ = this.czZ;
        ((PayInfo)localObject).cIf = 21;
      }
      if (localObject != null)
        localBundle.putParcelable("key_pay_info", (Parcelable)localObject);
      localBundle.putInt("key_scene", 21);
      localBundle.putInt("key_bind_scene", 0);
      localBundle.putBoolean("key_need_bind_response", true);
      localBundle.putInt("key_bind_scene", 0);
      localBundle.putBoolean("key_is_bind_bankcard", true);
      localBundle.putInt("from_bind_ui", com.tencent.mm.plugin.wallet.balance.a.teU);
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.a.class, localBundle, null);
      AppMethodBeat.o(45410);
    }
  }

  private void cMV()
  {
    AppMethodBeat.i(45412);
    if (this.tgO != 0)
    {
      ab.i("MicroMsg.WalletBalanceFetchUI", "showRemainFeeTip is_show_charge =" + this.tgO);
      AppMethodBeat.o(45412);
    }
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RQ();
      boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNv, Boolean.FALSE)).booleanValue();
      s.cNC();
      com.tencent.mm.plugin.wallet_core.model.b localb = s.cND().tCX;
      if ((localb != null) && (!bool))
      {
        com.tencent.mm.ui.base.h.a(this, getString(2131305184, new Object[] { com.tencent.mm.wallet_core.ui.e.G(localb.pPt) }), getString(2131305185), getString(2131304829), getString(2131305186), new WalletBalanceFetchUI.14(this), new WalletBalanceFetchUI.15(this), 2131690683);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xNv, Boolean.TRUE);
      }
      AppMethodBeat.o(45412);
    }
  }

  private void cfk()
  {
    AppMethodBeat.i(45389);
    s.cNC();
    ak localak = s.cND();
    Object localObject2;
    int i;
    Object localObject3;
    Object localObject4;
    if (this.tgV)
    {
      ab.i("MicroMsg.WalletBalanceFetchUI", "is from new bind bankcard");
      localObject1 = new ArrayList();
      localObject2 = new ArrayList();
      if ((this.tgB != null) && (this.tgB.size() > 0))
        ((ArrayList)localObject1).addAll(this.tgB);
      this.tgB = localak.cQD();
      if ((this.tgB != null) && (this.tgB.size() > 0))
        ((ArrayList)localObject2).addAll(this.tgB);
      if ((((ArrayList)localObject1).size() <= 0) || (((ArrayList)localObject2).size() <= 0))
        break label605;
      ArrayList localArrayList = new ArrayList();
      for (i = 0; i < ((ArrayList)localObject1).size(); i++)
      {
        localObject3 = (Bankcard)((ArrayList)localObject1).get(i);
        for (int j = 0; j < ((ArrayList)localObject2).size(); j++)
        {
          localObject4 = (Bankcard)((ArrayList)localObject2).get(j);
          if ((localObject3 != null) && (localObject4 != null) && (((Bankcard)localObject3).field_bindSerial.equals(((Bankcard)localObject4).field_bindSerial)))
            localArrayList.add(localObject4);
        }
      }
      if (localArrayList.size() > 0)
        ((ArrayList)localObject2).removeAll(localArrayList);
      if (((ArrayList)localObject2).size() <= 0)
        break label605;
    }
    label344: label605: for (Object localObject1 = (Bankcard)((ArrayList)localObject2).get(0); ; localObject1 = null)
    {
      if (localObject1 == null)
        localObject1 = localak.a(this.tgB, null, false, true);
      while (true)
      {
        i = 0;
        if ((this.tgB != null) && (i < this.tgB.size()))
        {
          localObject3 = (Bankcard)this.tgB.get(i);
          if ((localObject1 != null) && (localObject3 != null) && (((Bankcard)localObject1).field_bindSerial.equals(((Bankcard)localObject3).field_bindSerial)))
            this.tgS = i;
        }
        else
        {
          this.tgC = ((Bankcard)localObject1);
          this.tgV = false;
          localObject4 = com.tencent.mm.plugin.report.service.h.pYm;
          localObject2 = this.rMr;
          if (this.tgC == null)
            break label575;
          localObject1 = this.tgC.field_bankcardType;
          label369: if (this.tgC == null)
            break label582;
          localObject3 = this.tgC.field_bindSerial;
          ((com.tencent.mm.plugin.report.service.h)localObject4).e(16398, new Object[] { localObject2, Integer.valueOf(1), localObject1, localObject3 });
          if (localak.tCX == null)
            break label590;
          this.tgO = localak.tCX.tgO;
          this.tgP = localak.tCX.tgP;
          cMO();
          this.tgQ = localak.tCX.tgQ;
        }
        while (true)
        {
          this.tgW = 0;
          this.tgX = 0;
          ab.i("MicroMsg.WalletBalanceFetchUI", "is_show_charge:" + this.tgO + " is_cal_charge:" + this.tgP + " min_charge_fee:" + this.tgR + " is_full_fetch_direct:" + this.tgQ);
          AppMethodBeat.o(45389);
          return;
          i++;
          break;
          this.tgB = localak.cQD();
          this.tgC = localak.a(this.tgB, null, false, true);
          break label344;
          localObject1 = "";
          break label369;
          localObject3 = "";
          break label385;
          ab.e("MicroMsg.WalletBalanceFetchUI", "BalanceFetchInfo is null");
        }
      }
    }
  }

  private void cu()
  {
    AppMethodBeat.i(45393);
    ImageView localImageView;
    Object localObject;
    if (this.tgE.getTitleTv() != null)
    {
      this.tgE.getTitleTv().setText(String.format(getString(2131302423), new Object[] { ae.dOd() }));
      localImageView = (ImageView)this.tgF.findViewById(2131828609);
      if (this.tgC == null)
        break label474;
      localObject = "";
      com.tencent.mm.plugin.wallet_core.model.e locale = com.tencent.mm.plugin.wallet_core.d.b.i(this, this.tgC.field_bankcardType, this.tgC.cPb());
      if (locale != null)
        localObject = locale.oRi;
      localImageView.setImageBitmap(null);
      if (!this.tgC.cPc())
        break label383;
      localImageView.setBackgroundResource(2130840657);
      label121: ((TextView)this.tgF.findViewById(2131828610)).setText(getString(2131304572, new Object[] { this.tgC.field_bankName, this.tgC.field_bankcardTail }));
      ((TextView)this.tgF.findViewById(2131828610)).setVisibility(0);
      if (!bo.isNullOrNil(this.tgC.field_fetchArriveTimeWording))
      {
        ((TextView)this.tgF.findViewById(2131828611)).setText(this.tgC.field_fetchArriveTimeWording);
        ((TextView)this.tgF.findViewById(2131828611)).setVisibility(0);
        if (this.tgC.field_is_hightlight_pre_arrive_time_wording != 1)
          break label449;
        ((TextView)this.tgF.findViewById(2131828611)).setTextColor(Color.parseColor("#FA962A"));
      }
      label271: this.tgJ.setText("");
      this.tgJ.setVisibility(8);
      label290: s.cNC();
      localObject = s.cND().thy.twY;
      if (bo.isNullOrNil((String)localObject))
        break label565;
      this.tgI.setVisibility(0);
      this.tgI.setText((CharSequence)localObject);
      label327: if (this.tgW != 1)
        break label577;
      this.tgM.setVisibility(8);
      this.tgN.setVisibility(0);
    }
    while (true)
    {
      cMQ();
      cMR();
      cMP();
      AppMethodBeat.o(45393);
      return;
      ab.i("MicroMsg.WalletBalanceFetchUI", "mTotalFeeEHV.getTitleTv() is null");
      break;
      label383: localObject = x.a(new c((String)localObject));
      x.a(new WalletBalanceFetchUI.25(this, localImageView));
      if ((localObject == null) || (localObject == null))
        break label121;
      localImageView.setImageBitmap(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, getResources().getDimensionPixelOffset(2131428760), getResources().getDimensionPixelOffset(2131428760), true, false));
      break label121;
      label449: ((TextView)this.tgF.findViewById(2131828611)).setTextColor(Color.parseColor("#B2B2B2"));
      break label271;
      label474: localImageView.setImageBitmap(null);
      ((TextView)this.tgF.findViewById(2131828610)).setText(this.tgD);
      ((TextView)this.tgF.findViewById(2131828611)).setText("");
      ((TextView)this.tgF.findViewById(2131828611)).setVisibility(8);
      ((ImageView)this.tgF.findViewById(2131828609)).setImageBitmap(null);
      this.tgJ.setVisibility(8);
      break label290;
      label565: this.tgI.setVisibility(8);
      break label327;
      label577: this.tgM.setVisibility(0);
      this.tgN.setVisibility(8);
    }
  }

  private boolean d(com.tencent.mm.plugin.wallet.balance.a.d paramd)
  {
    AppMethodBeat.i(45405);
    j localj = paramd.tfa;
    boolean bool;
    if (localj == null)
    {
      bool = false;
      AppMethodBeat.o(45405);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.WalletBalanceFetchUI", "show balance Charge tips");
      com.tencent.mm.plugin.wallet_core.ui.k.a(this, localj, new WalletBalanceFetchUI.6(this, paramd), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(45361);
          paramAnonymousDialogInterface.dismiss();
          com.tencent.mm.plugin.report.service.h.pYm.e(16398, new Object[] { WalletBalanceFetchUI.d(WalletBalanceFetchUI.this), Integer.valueOf(6), "", "" });
          AppMethodBeat.o(45361);
        }
      });
      bool = true;
      AppMethodBeat.o(45405);
    }
  }

  private boolean e(com.tencent.mm.plugin.wallet.balance.a.d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(45406);
    com.tencent.mm.plugin.wallet_core.model.b localb = paramd.teY;
    if ((localb != null) && ((!TextUtils.isEmpty(localb.twx)) || ((localb.twy != null) && (localb.twy.size() > 0))))
    {
      this.thb = true;
      com.tencent.mm.plugin.wallet_core.ui.k.a(this, localb, false, new WalletBalanceFetchUI.8(this, paramd), new WalletBalanceFetchUI.9(this));
      AppMethodBeat.o(45406);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(45406);
      bool = false;
    }
  }

  private boolean f(com.tencent.mm.plugin.wallet.balance.a.d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(45407);
    paramd = paramd.teZ;
    if ((paramd != null) && ((!TextUtils.isEmpty(paramd.twx)) || ((paramd.twy != null) && (paramd.twy.size() > 0))))
    {
      this.thc = true;
      com.tencent.mm.plugin.wallet_core.ui.k.a(this, paramd, true, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(45364);
          paramAnonymousDialogInterface.dismiss();
          paramAnonymousDialogInterface = "";
          if (WalletBalanceFetchUI.b(WalletBalanceFetchUI.this) != null)
            paramAnonymousDialogInterface = WalletBalanceFetchUI.b(WalletBalanceFetchUI.this).field_bankcardType;
          WalletBalanceFetchUI.p(WalletBalanceFetchUI.this);
          WalletBalanceFetchUI.q(WalletBalanceFetchUI.this);
          WalletBalanceFetchUI.this.a(new com.tencent.mm.plugin.wallet.balance.a.d(WalletBalanceFetchUI.r(WalletBalanceFetchUI.this), "CNY", paramAnonymousDialogInterface, WalletBalanceFetchUI.s(WalletBalanceFetchUI.this)), true, true);
          AppMethodBeat.o(45364);
        }
      }
      , new WalletBalanceFetchUI.11(this));
      AppMethodBeat.o(45407);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(45407);
    }
  }

  public final boolean bwP()
  {
    return false;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45399);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.wallet.balance.a.d))
      {
        paramString = (com.tencent.mm.plugin.wallet.balance.a.d)paramm;
        this.tha = false;
        if (!this.thd)
          this.thb = false;
        this.thc = false;
        this.thd = false;
        if ("1".equals(paramString.cRb))
        {
          ab.i("MicroMsg.WalletBalanceFetchUI", "need realname verify");
          paramm = new Bundle();
          paramm.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceFetchUI");
          paramm.putString("realname_verify_process_jump_plugin", "wallet");
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramm, null, 0);
        }
        while (bool)
        {
          bool = false;
          AppMethodBeat.o(45399);
          return bool;
          if ("2".equals(paramString.cRb))
          {
            ab.i("MicroMsg.WalletBalanceFetchUI", "need upload credit");
            bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString.cRc, paramString.cRf, paramString.cRd, paramString.cRe, false, null);
          }
          else
          {
            ab.i("MicroMsg.WalletBalanceFetchUI", "realnameGuideFlag =  " + paramString.cRb);
            bool = false;
          }
        }
        if (paramString.tfc)
          if (paramString.tfd != null)
          {
            ab.i("MicroMsg.WalletBalanceFetchUI", "debugIdentifyInfoCompleteDialog() show");
            Object localObject = paramString.tfd.title;
            String str1 = paramString.tfd.content;
            String str2 = paramString.tfd.tff;
            final String str3 = paramString.tfd.tfg;
            ab.i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog()");
            View localView = LayoutInflater.from(this).inflate(2130971047, null);
            ImageView localImageView = (ImageView)localView.findViewById(2131822694);
            paramm = (Button)localView.findViewById(2131828603);
            ((TextView)localView.findViewById(2131828601)).setText((CharSequence)localObject);
            ((TextView)localView.findViewById(2131828602)).setText(str1);
            ((Button)localView.findViewById(2131828603)).setText(str2);
            localObject = new Dialog(this, 2131493867);
            ((Dialog)localObject).setContentView(localView);
            ((Dialog)localObject).setTitle(null);
            ((Dialog)localObject).setOnCancelListener(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                AppMethodBeat.i(45373);
                ab.i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog onCancel");
                if ((this.thm != null) && (this.thm.isShowing()))
                  this.thm.dismiss();
                AppMethodBeat.o(45373);
              }
            });
            localImageView.setOnClickListener(new WalletBalanceFetchUI.18(this, (Dialog)localObject));
            paramm.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                AppMethodBeat.i(45375);
                ab.i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog completeBtn click");
                com.tencent.mm.plugin.account.a.b.a.b(jdField_this, str3, 2, true);
                if ((this.thm != null) && (this.thm.isShowing()))
                  this.thm.dismiss();
                AppMethodBeat.o(45375);
              }
            });
            ((Dialog)localObject).show();
            com.tencent.mm.ui.base.h.a(this, (Dialog)localObject);
          }
        label456: for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if (paramInt1 == 0)
            break label491;
          bool = false;
          AppMethodBeat.o(45399);
          break;
          ab.i("MicroMsg.WalletBalanceFetchUI", "fetchScene.accountTipDialog == null");
          break label456;
        }
        label491: ad.o(21, paramString.cBT, paramInt2);
        if (!b(paramString))
        {
          this.czZ = paramString.cBT;
          a(paramString);
        }
      }
    while (true)
    {
      bool = false;
      AppMethodBeat.o(45399);
      break;
      if ((paramm instanceof y))
      {
        paramString = (y)paramm;
        cMS();
        if (paramString.bLD())
        {
          paramm = paramString.nYe;
          paramm.a(this, new WalletBalanceFetchUI.3(this, paramm, paramString));
          bool = true;
          AppMethodBeat.o(45399);
          break;
          if ((paramm instanceof com.tencent.mm.plugin.wallet.balance.a.d))
          {
            ad.o(21, "", paramInt2);
            cMT();
          }
        }
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971048;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(45401);
    this.tgE.fx(null);
    AppMethodBeat.o(45401);
  }

  public final void initView()
  {
    AppMethodBeat.i(45390);
    setMMTitle(2131304543);
    this.jcl = findViewById(2131828604);
    this.tgF = ((LinearLayout)findViewById(2131828607));
    Object localObject = new WalletBalanceFetchUI.12(this);
    this.tgG = findViewById(2131828607);
    this.tgG.setOnClickListener((View.OnClickListener)localObject);
    this.tgF.setOnClickListener((View.OnClickListener)localObject);
    this.tgE = ((WalletFormView)findViewById(2131828613));
    e(this.tgE, 2, false);
    com.tencent.mm.wallet_core.ui.formview.a.f(this.tgE);
    this.tgE.setOnInputValidChangeListener(this);
    this.gHn = ((Button)findViewById(2131822846));
    this.gHn.setOnClickListener(new WalletBalanceFetchUI.20(this));
    this.gHn.setEnabled(false);
    this.tgH = ((TextView)findViewById(2131828605));
    this.tgI = ((TextView)findViewById(2131828606));
    this.tgJ = ((TextView)findViewById(2131828618));
    this.tgK = ((TextView)findViewById(2131828615));
    this.tgL = ((TextView)findViewById(2131828616));
    this.tgM = ((ViewGroup)findViewById(2131828614));
    this.tgN = ((ViewGroup)findViewById(2131828617));
    this.tgL.setOnClickListener(new WalletBalanceFetchUI.21(this));
    this.tgE.a(new WalletBalanceFetchUI.22(this));
    this.obM = new WalletBalanceFetchUI.23(this);
    localObject = new uo();
    ((uo)localObject).cQJ.cQL = "3";
    ((uo)localObject).callback = new WalletBalanceFetchUI.24(this, (uo)localObject);
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    AppMethodBeat.o(45390);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45402);
    if (paramInt1 == 1)
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        paramInt2 = paramIntent.getIntExtra("key_select_index", -1);
        paramInt1 = this.tgS;
        this.tgS = paramInt2;
        ab.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult select bankcard index is ".concat(String.valueOf(paramInt2)));
        if ((this.tgB == null) || (paramInt2 < 0) || (paramInt2 >= this.tgB.size()))
          if ((this.tgB == null) || (paramInt2 < 0) || (paramInt2 > this.tgB.size()))
          {
            this.tgC = null;
            cMU();
            label108: cu();
            AppMethodBeat.o(45402);
          }
      }
    while (true)
    {
      return;
      this.tgS = paramInt1;
      break;
      this.tgC = ((Bankcard)this.tgB.get(paramInt2));
      break label108;
      ab.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult cancel select");
      AppMethodBeat.o(45402);
      continue;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(45402);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45387);
    this.rMr = UUID.randomUUID().toString();
    super.onCreate(paramBundle);
    au(getIntent());
    cfk();
    this.tgD = getString(2131304573);
    initView();
    cu();
    com.tencent.mm.wallet_core.c.z.hL(4, 0);
    AppMethodBeat.o(45387);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45388);
    al.af(this.tgZ);
    super.onDestroy();
    AppMethodBeat.o(45388);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(45408);
    cMT();
    au(paramIntent);
    AppMethodBeat.o(45408);
  }

  public void onResume()
  {
    AppMethodBeat.i(45391);
    cMT();
    super.onResume();
    AppMethodBeat.o(45391);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI
 * JD-Core Version:    0.6.2
 */