package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.c;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.plugin.wallet_core.ui.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import java.util.List;
import java.util.Map;

public class b extends q
{
  private b.b tUf;
  private int tUg = 0;
  private boolean tUh = false;
  private a tUi;

  public b(Context paramContext)
  {
    super(paramContext);
  }

  public static b a(Context paramContext, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, b.b paramb, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener, boolean paramBoolean)
  {
    AppMethodBeat.i(48499);
    if (((Activity)paramContext).isFinishing())
    {
      paramContext = null;
      AppMethodBeat.o(48499);
      return paramContext;
    }
    Object localObject1 = c.tDU.a(paramOrders);
    Object localObject2;
    Object localObject3;
    label142: label155: Object localObject4;
    label191: String str1;
    String str2;
    double d;
    boolean bool;
    if (localObject1 != null)
      if (paramFavorPayInfo != null)
      {
        localObject2 = paramFavorPayInfo;
        if (paramBankcard != null)
        {
          localObject2 = paramFavorPayInfo;
          if (!paramBankcard.field_bankcardType.equals(paramFavorPayInfo.tzd))
          {
            localObject3 = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).bC(paramFavorPayInfo.tzb, false);
            localObject2 = (com.tencent.mm.plugin.wallet_core.ui.b.a)((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).bB((String)localObject3, true).get(paramBankcard.field_bankcardType);
            if ((localObject2 == null) || (((com.tencent.mm.plugin.wallet_core.ui.b.a)localObject2).tDR == null) || (bo.isNullOrNil(((com.tencent.mm.plugin.wallet_core.ui.b.a)localObject2).tDR.tnk)))
              break label490;
            paramFavorPayInfo.tzb = ((com.tencent.mm.plugin.wallet_core.ui.b.a)localObject2).tDR.tnk;
            localObject2 = paramFavorPayInfo;
          }
        }
        paramFavorPayInfo = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).cRl();
        localObject3 = localObject2;
        localObject2 = paramFavorPayInfo;
        paramFavorPayInfo = (Orders.Commodity)paramOrders.tAq.get(0);
        localObject4 = new StringBuilder();
        if (!bo.isNullOrNil(paramFavorPayInfo.pca))
          break label552;
        paramFavorPayInfo = "";
        str1 = paramFavorPayInfo + ((Orders.Commodity)paramOrders.tAq.get(0)).desc;
        str2 = null;
        localObject4 = null;
        paramFavorPayInfo = null;
        d = paramOrders.pTN;
        if ((localObject1 == null) || (localObject3 == null))
          break label653;
        localObject1 = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).acU(((FavorPayInfo)localObject3).tzb);
        if ((localObject1 == null) || (((j)localObject1).tnl <= 0.0D))
          break label579;
        d = ((j)localObject1).tmT;
        localObject4 = e.e(paramOrders.pTN, paramOrders.pcl);
        localObject2 = e.e(((j)localObject1).tmT, paramOrders.pcl);
        paramFavorPayInfo = paramContext.getString(2131305183, new Object[] { e.F(((j)localObject1).tnl) });
        bool = true;
      }
    while (true)
    {
      label331: if (paramBankcard == null)
      {
        str2 = "";
        label339: localObject1 = new b(paramContext);
        ((b)localObject1).tJT = paramBankcard;
        ((b)localObject1).a(paramContext, paramOrders, (FavorPayInfo)localObject3, paramBankcard);
        ((b)localObject1).b(paramOnCancelListener);
        ((b)localObject1).setOnCancelListener(paramOnCancelListener);
        ((b)localObject1).setCancelable(true);
        ((b)localObject1).adc(str1);
        ((b)localObject1).f((String)localObject2, d);
        ((b)localObject1).ade((String)localObject4);
        ((b)localObject1).a(str2, paramOnClickListener, bool);
        if (TextUtils.isEmpty(paramFavorPayInfo))
          break label640;
        ((b)localObject1).tJE.setVisibility(0);
        ((b)localObject1).tJE.setText(paramFavorPayInfo);
      }
      while (true)
      {
        ((b)localObject1).tUh = paramBoolean;
        ((q)localObject1).tJF.setEncrType(-10);
        ((b)localObject1).tUf = paramb;
        ((b)localObject1).show();
        com.tencent.mm.ui.base.h.a(paramContext, (Dialog)localObject1);
        AppMethodBeat.o(48499);
        paramContext = (Context)localObject1;
        break;
        label490: paramFavorPayInfo.tzb = ((String)localObject3);
        localObject2 = paramFavorPayInfo;
        break label142;
        localObject2 = paramFavorPayInfo;
        if (paramOrders.tAr == null)
          break label142;
        localObject2 = ((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).acX(((com.tencent.mm.plugin.wallet_core.ui.b)localObject1).acY(paramOrders.tAr.tmU));
        break label142;
        ab.d("MicroMsg.WalletPayUPwdDialog", "getFavorLogicHelper null");
        localObject2 = null;
        localObject3 = paramFavorPayInfo;
        break label155;
        label552: paramFavorPayInfo = paramFavorPayInfo.pca + "\n";
        break label191;
        label579: if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          paramFavorPayInfo = paramContext.getString(2131305238);
          bool = true;
          localObject2 = str2;
          break label331;
        }
        localObject2 = e.e(paramOrders.pTN, paramOrders.pcl);
        bool = false;
        break label331;
        str2 = paramBankcard.field_desc;
        break label339;
        label640: ((b)localObject1).tJE.setVisibility(8);
      }
      label653: bool = false;
      localObject2 = str2;
    }
  }

  public final void cA(Context paramContext)
  {
    AppMethodBeat.i(138101);
    fl(paramContext);
    super.fm(paramContext);
    if (this.tJU != null)
      this.tJU.setVisibility(8);
    AppMethodBeat.o(138101);
  }

  public final void cRO()
  {
    AppMethodBeat.i(48500);
    if (this.tJQ != null)
      this.tJQ.onClick(this, 0);
    dismiss();
    Object localObject;
    b.1 local1;
    if (this.tUf != null)
      if (this.tUh)
        if (this.tUg == 0)
        {
          Context localContext = getContext();
          localObject = new a(this.tJF.getText(), this.tJT, this.toH, this.tJR, this.Ue, this.tKm, this.tUf);
          if ((!(localContext instanceof Activity)) || (!((Activity)localContext).isFinishing()))
          {
            local1 = new b.1(localContext, (a)localObject);
            local1.tUg = 1;
            local1.tUh = true;
            local1.tUi = ((a)localObject);
            if (local1.tUi != null)
            {
              local1.b(local1.tUi.tUp);
              local1.setOnCancelListener(local1.tUi.tUp);
              local1.setCancelable(true);
              if (local1.tUi.tUl != null)
                break label250;
              localObject = "";
              local1.f((String)localObject, 0.0D);
              local1.no(false);
              local1.a(local1.tUi.tKm);
              local1.tUf = local1.tUi.tUo;
              local1.tJF.setEncrType(30);
              local1.show();
              com.tencent.mm.ui.base.h.a(localContext, local1);
            }
            AppMethodBeat.o(48500);
          }
        }
    while (true)
    {
      return;
      AppMethodBeat.o(48500);
      continue;
      label250: localObject = local1.tUi.tUl.field_desc;
      break;
      if (this.tUg == 1)
      {
        this.tUf.a(this.tUi.tUk, this.tJF.getText(), this.tUi.tUm);
        AppMethodBeat.o(48500);
      }
      else
      {
        ab.e("MicroMsg.WalletPayUPwdDialog", "hy: error dialog state");
        AppMethodBeat.o(48500);
        continue;
        this.tUf.a(this.tJF.getText(), "", this.toH);
        AppMethodBeat.o(48500);
      }
    }
  }

  public final void fm(Context paramContext)
  {
    AppMethodBeat.i(138570);
    super.fm(paramContext);
    AppMethodBeat.o(138570);
  }

  final class a
  {
    public q.a tKm;
    public String tUk;
    public Bankcard tUl;
    public FavorPayInfo tUm;
    public boolean tUn;
    public b.b tUo;
    public DialogInterface.OnCancelListener tUp;

    public a(String paramBankcard, Bankcard paramFavorPayInfo, FavorPayInfo paramBoolean, boolean paramOnCancelListener, DialogInterface.OnCancelListener parama, q.a paramb, b.b arg8)
    {
      this.tUk = paramBankcard;
      this.tUl = paramFavorPayInfo;
      this.tUm = paramBoolean;
      this.tUn = paramOnCancelListener;
      this.tUp = parama;
      this.tKm = paramb;
      Object localObject;
      this.tUo = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.b
 * JD-Core Version:    0.6.2
 */