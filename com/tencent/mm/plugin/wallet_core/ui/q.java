package com.tencent.mm.plugin.wallet_core.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.soter.a.g.f;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class q extends i
  implements d
{
  private static HashMap<String, Boolean> tKp;
  protected DialogInterface.OnCancelListener Ue;
  protected boolean gHY;
  public ImageView gvq;
  private boolean isPaused;
  public View jcl;
  private Context mContext;
  protected MyKeyboardWindow mKeyboard;
  private Animation msx;
  private int msy;
  protected View nTi;
  public ImageView oft;
  protected PayInfo pGr;
  public TextView pUA;
  public TextView qcc;
  public ImageView tGW;
  public TextView tJA;
  public TextView tJB;
  public FavourLayout tJC;
  public CdnImageView tJD;
  public TextView tJE;
  public EditHintPasswdView tJF;
  public View tJH;
  public View tJI;
  public TextView tJJ;
  public ImageView tJK;
  public TextView tJL;
  public TextView tJM;
  public View tJN;
  public TextView tJO;
  protected DialogInterface.OnClickListener tJQ;
  protected boolean tJR;
  protected boolean tJS;
  public Bankcard tJT;
  public TextView tJU;
  public View tJV;
  public TextView tJW;
  protected int tJX;
  protected boolean tJY;
  private int tJZ;
  private Animation tKa;
  private String tKb;
  private long tKc;
  boolean tKf;
  public q.c tKk;
  public Button tKl;
  protected q.a tKm;
  protected int tKn;
  private byte[] tKo;
  protected com.tencent.mm.plugin.wallet_core.utils.a tln;
  protected FavorPayInfo toH;
  public TextView tpG;
  protected b tpu;

  static
  {
    AppMethodBeat.i(47651);
    tKp = new HashMap();
    AppMethodBeat.o(47651);
  }

  public q(Context paramContext)
  {
    super(paramContext, 2131493871);
    AppMethodBeat.i(47605);
    this.tpu = null;
    this.toH = new FavorPayInfo();
    this.tJR = false;
    this.tJS = true;
    this.tJT = null;
    this.tln = new com.tencent.mm.plugin.wallet_core.utils.a();
    this.tJX = 0;
    this.tKn = -1;
    this.tJY = false;
    this.tJZ = 0;
    this.msy = 0;
    this.tKa = null;
    this.tKb = "";
    this.tKc = -1L;
    this.tKo = new byte[0];
    this.tKf = false;
    this.isPaused = false;
    cA(paramContext);
    AppMethodBeat.o(47605);
  }

  public static q a(Context paramContext, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, PayInfo paramPayInfo, q.c paramc, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(47632);
    paramContext = a(paramContext, true, paramOrders, paramFavorPayInfo, paramBankcard, paramPayInfo, null, paramc, paramOnClickListener, paramOnCancelListener);
    AppMethodBeat.o(47632);
    return paramContext;
  }

  public static q a(Context paramContext, String paramString1, double paramDouble, String paramString2, Bankcard paramBankcard, q.c paramc, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    boolean bool = true;
    AppMethodBeat.i(47637);
    if (((Activity)paramContext).isFinishing())
    {
      paramContext = null;
      AppMethodBeat.o(47637);
      return paramContext;
    }
    q localq = new q(paramContext);
    localq.b(paramOnCancelListener);
    localq.setOnCancelListener(paramOnCancelListener);
    localq.setCancelable(true);
    localq.adc(paramString1);
    localq.f(com.tencent.mm.wallet_core.ui.e.e(paramDouble, paramString2), paramDouble);
    localq.tJS = true;
    if (paramBankcard == null)
    {
      paramString1 = "";
      label89: localq.h(paramBankcard);
      if (TextUtils.isEmpty(paramString1))
        break label162;
    }
    while (true)
    {
      localq.no(bool);
      if (paramBankcard != null)
        localq.a(paramString1, paramOnClickListener, false);
      localq.tKk = paramc;
      localq.show();
      com.tencent.mm.ui.base.h.a(paramContext, localq);
      AppMethodBeat.o(47637);
      paramContext = localq;
      break;
      paramString1 = paramBankcard.field_desc;
      break label89;
      label162: bool = false;
    }
  }

  public static q a(Context paramContext, String paramString1, String paramString2, q.c paramc, DialogInterface.OnCancelListener paramOnCancelListener, q.a parama)
  {
    AppMethodBeat.i(47636);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      AppMethodBeat.o(47636);
    for (paramContext = null; ; paramContext = null)
    {
      return paramContext;
      if ((!(paramContext instanceof Activity)) || (!((Activity)paramContext).isFinishing()))
        break;
      AppMethodBeat.o(47636);
    }
    q localq = new q(paramContext);
    localq.b(paramOnCancelListener);
    localq.setOnCancelListener(paramOnCancelListener);
    localq.setCancelable(true);
    localq.adc(paramString1);
    if (!TextUtils.isEmpty(paramString2))
    {
      localq.pUA.setVisibility(0);
      localq.pUA.setText(paramString2);
    }
    while (true)
    {
      localq.tJS = true;
      localq.nn(localq.tJS);
      localq.no(false);
      localq.tJS = false;
      localq.tKm = parama;
      localq.add("");
      localq.tKk = paramc;
      localq.show();
      com.tencent.mm.ui.base.h.a(paramContext, localq);
      AppMethodBeat.o(47636);
      paramContext = localq;
      break;
      localq.pUA.setVisibility(8);
    }
  }

  public static q a(Context paramContext, boolean paramBoolean, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, PayInfo paramPayInfo, String paramString, q.c paramc, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(47633);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(47633);
    }
    while (true)
    {
      return paramContext;
      if ((paramOrders != null) && (paramOrders.tAq != null) && (paramOrders.tAq.size() > 0))
        break;
      paramContext = null;
      AppMethodBeat.o(47633);
    }
    b localb = c.tDU.a(paramOrders);
    Object localObject1;
    label84: Object localObject2;
    label93: Object localObject3;
    if (paramFavorPayInfo == null)
    {
      localObject1 = "";
      if (paramBankcard != null)
        break label1128;
      localObject2 = "";
      if (paramBankcard != null)
        break label1138;
      localObject3 = "";
      label102: ab.i("MicroMsg.WalletPwdDialog", "showAlert with favInfo %s bindSerial %s  bankcardType %s", new Object[] { localObject1, localObject2, localObject3 });
      if (localb == null)
        break label1274;
      if ((paramFavorPayInfo == null) || (paramBankcard == null))
        break label1246;
      if (!paramBankcard.field_bankcardType.equalsIgnoreCase("CFT"))
        break label2208;
    }
    label388: label403: label410: label1309: label2208: for (boolean bool1 = true; ; bool1 = false)
    {
      ab.i("MicroMsg.WalletPwdDialog", "selectedFavorCompId %s isFilterNotSupportCft %s", new Object[] { paramFavorPayInfo.tzb, Boolean.valueOf(bool1) });
      String str1 = localb.bC(paramFavorPayInfo.tzb, bool1);
      ab.i("MicroMsg.WalletPwdDialog", "nonBankSelectedFaovrCompId %s", new Object[] { str1 });
      localObject2 = localb.acS(str1);
      localObject1 = localb.bB(str1, true);
      Object localObject4 = (b.a)((Map)localObject2).get(paramBankcard.field_bindSerial);
      Object localObject5 = (b.a)((Map)localObject1).get(paramBankcard.field_bankcardType);
      Object localObject6 = localb.bA(str1, bool1);
      label293: label302: label311: label378: Object localObject7;
      Object localObject8;
      String str2;
      double d1;
      boolean bool2;
      label689: double d2;
      if (localObject6 == null)
      {
        localObject1 = "";
        if (localObject4 != null)
          break label1158;
        localObject2 = "";
        if (localObject5 != null)
          break label1168;
        localObject3 = "";
        ab.i("MicroMsg.WalletPwdDialog", "defaultComposeInfo %s wrapperSerial %s wrapper %s", new Object[] { localObject1, localObject2, localObject3 });
        if ((localObject4 == null) || (((b.a)localObject4).tDR == null) || (bo.isNullOrNil(((b.a)localObject4).tDR.tnk)))
          break label1178;
        paramFavorPayInfo.tzb = ((b.a)localObject4).tDR.tnk;
        localObject1 = localb.cRl();
        localObject6 = paramFavorPayInfo;
        localObject2 = "";
        if (paramPayInfo.vwh != null)
          break label1292;
        paramFavorPayInfo = "";
        if (bo.isNullOrNil(paramFavorPayInfo))
          break label1309;
        if ((!bo.isNullOrNil(paramFavorPayInfo)) || (paramOrders == null) || (paramOrders.tAq == null))
          break label2018;
        localObject2 = (Orders.Commodity)paramOrders.tAq.get(0);
        if (localObject2 == null)
          break label2053;
        paramString = ((Orders.Commodity)localObject2).pca;
        paramFavorPayInfo = paramString;
        if (a(paramPayInfo))
        {
          paramFavorPayInfo = paramString;
          if (!bo.isNullOrNil(paramString))
            paramFavorPayInfo = paramString + "\n";
          paramFavorPayInfo = paramFavorPayInfo + ((Orders.Commodity)localObject2).desc;
        }
        localObject3 = paramFavorPayInfo;
        if (bo.isNullOrNil(paramFavorPayInfo))
          localObject3 = ((Orders.Commodity)localObject2).desc;
        localObject7 = null;
        localObject8 = null;
        localObject4 = null;
        str2 = null;
        str1 = null;
        localObject5 = null;
        paramString = null;
        d1 = paramOrders.pTN;
        bool2 = false;
        bool1 = false;
        if ((localb == null) || (localObject6 == null))
          break label2198;
        localObject5 = localb.acU(((FavorPayInfo)localObject6).tzb);
        if ((localObject5 == null) || (((com.tencent.mm.plugin.wallet.a.j)localObject5).tnb <= 0.0D))
          break label2065;
        bool1 = true;
        localObject4 = com.tencent.mm.wallet_core.ui.e.e(paramOrders.pTN, paramOrders.pcl);
        localObject1 = com.tencent.mm.wallet_core.ui.e.e(((com.tencent.mm.plugin.wallet.a.j)localObject5).tna, paramOrders.pcl);
        d1 = ((com.tencent.mm.plugin.wallet.a.j)localObject5).tmT;
        str1 = ((com.tencent.mm.plugin.wallet.a.j)localObject5).tnd;
        if (tKp.containsKey(paramPayInfo.czZ))
          break label2193;
        com.tencent.mm.plugin.report.service.h.pYm.e(14530, new Object[] { Integer.valueOf(3) });
        paramFavorPayInfo = null;
        localObject2 = paramString;
        if (localObject5 != null)
        {
          localObject2 = paramString;
          if (((com.tencent.mm.plugin.wallet.a.j)localObject5).tnc != 0)
          {
            paramString = ((com.tencent.mm.plugin.wallet.a.j)localObject5).tne;
            localObject2 = paramString;
            if (!bo.isNullOrNil(str1))
              localObject2 = ",".concat(String.valueOf(paramString));
          }
        }
        if (bo.isNullOrNil(str1))
        {
          localObject5 = localObject2;
          paramString = paramFavorPayInfo;
          d2 = d1;
          str2 = str1;
          localObject8 = localObject4;
          localObject7 = localObject1;
          bool2 = bool1;
          if (bo.isNullOrNil((String)localObject2));
        }
        else
        {
          if (!bo.isNullOrNil(paramFavorPayInfo))
            break label2126;
          paramString = null;
          bool2 = bool1;
          localObject7 = localObject1;
          localObject8 = localObject4;
          str2 = str1;
          d2 = d1;
          localObject5 = localObject2;
        }
      }
      while (true)
      {
        label819: if (paramOrders.pPp > 0.0D);
        for (localObject1 = paramContext.getResources().getString(2131304728, new Object[] { com.tencent.mm.wallet_core.ui.e.e(paramOrders.pPp, paramOrders.pcl) }); ; localObject1 = null)
        {
          if (paramBankcard == null)
          {
            paramFavorPayInfo = "";
            label866: localObject2 = paramFavorPayInfo;
            if (paramBankcard != null)
            {
              localObject2 = paramFavorPayInfo;
              if (paramBankcard.cPg())
                localObject2 = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, paramFavorPayInfo);
            }
            paramFavorPayInfo = new q(paramContext);
            paramFavorPayInfo.a(paramContext, paramOrders, (FavorPayInfo)localObject6, paramBankcard);
            paramFavorPayInfo.no(paramBoolean);
            paramFavorPayInfo.tJS = paramBoolean;
            paramFavorPayInfo.b(new q.b(paramOnCancelListener, (byte)0));
            paramFavorPayInfo.setOnCancelListener(new q.b(paramOnCancelListener, (byte)0));
            paramFavorPayInfo.setCancelable(true);
            paramFavorPayInfo.adc((String)localObject3);
            paramFavorPayInfo.f(localObject7, d2);
            paramFavorPayInfo.ade(localObject8);
            paramFavorPayInfo.a((CharSequence)localObject2, new q.2(paramPayInfo, paramOnClickListener, paramFavorPayInfo), bool2);
            paramFavorPayInfo.h(paramBankcard);
            if (paramOrders.tAo != 1)
              break label2174;
            paramBoolean = true;
            label1010: paramFavorPayInfo.a(paramPayInfo, paramBoolean);
            paramFavorPayInfo.gN(str2, paramString);
            paramFavorPayInfo.adf((String)localObject5);
            paramFavorPayInfo.add((String)localObject1);
            paramFavorPayInfo.tKk = paramc;
            paramFavorPayInfo.aw(a(paramBankcard, paramOrders));
            if (!a(paramBankcard, paramOrders, paramPayInfo.czZ))
              break label2179;
            paramFavorPayInfo.nm(true);
            com.tencent.mm.plugin.report.service.h.pYm.e(14530, new Object[] { Integer.valueOf(1) });
          }
          while (true)
          {
            paramFavorPayInfo.show();
            com.tencent.mm.ui.ae.a(paramFavorPayInfo.getWindow());
            com.tencent.mm.ui.base.h.a(paramContext, paramFavorPayInfo);
            AppMethodBeat.o(47633);
            paramContext = paramFavorPayInfo;
            break;
            localObject1 = paramFavorPayInfo.toString();
            break label84;
            label1128: localObject2 = paramBankcard.field_bindSerial;
            break label93;
            label1138: localObject3 = paramBankcard.field_bankcardType;
            break label102;
            localObject1 = ((com.tencent.mm.plugin.wallet.a.j)localObject6).tnk;
            break label293;
            localObject2 = ((b.a)localObject4).toString();
            break label302;
            localObject3 = ((b.a)localObject5).toString();
            break label311;
            if ((localObject5 != null) && (((b.a)localObject5).tDR != null) && (!bo.isNullOrNil(((b.a)localObject5).tDR.tnk)))
            {
              paramFavorPayInfo.tzb = ((b.a)localObject5).tDR.tnk;
              break label378;
            }
            if (localObject6 != null)
            {
              paramFavorPayInfo.tzb = ((com.tencent.mm.plugin.wallet.a.j)localObject6).tnk;
              break label378;
            }
            paramFavorPayInfo.tzb = str1;
            break label378;
            label1246: if (paramOrders.tAr == null)
              break label378;
            paramFavorPayInfo = localb.acX(localb.acY(paramOrders.tAr.tmU));
            break label378;
            label1274: ab.d("MicroMsg.WalletPwdDialog", "getFavorLogicHelper null");
            localObject1 = null;
            localObject6 = paramFavorPayInfo;
            break label388;
            paramFavorPayInfo = paramPayInfo.vwh.getString("extinfo_key_19", "");
            break label403;
            if ((paramPayInfo.cIf == 32) || (paramPayInfo.cIf == 33))
            {
              str1 = paramPayInfo.vwh.getString("extinfo_key_5", "");
              localObject4 = paramPayInfo.vwh.getString("extinfo_key_1", "");
              localObject3 = paramContext.getString(2131305241);
              paramFavorPayInfo = (FavorPayInfo)localObject2;
              if (!bo.isNullOrNil(str1))
              {
                localObject3 = str1;
                paramFavorPayInfo = str1;
              }
              if (!bo.isNullOrNil((String)localObject4))
              {
                g.RQ();
                localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM((String)localObject4);
                if (localObject2 != null)
                {
                  paramFavorPayInfo = ((ad)localObject2).Oj();
                  localObject2 = new StringBuilder().append(com.tencent.mm.wallet_core.ui.e.atA(paramFavorPayInfo));
                  if (bo.isNullOrNil(paramString));
                  for (paramFavorPayInfo = ""; ; paramFavorPayInfo = "(" + paramString + ")")
                  {
                    paramFavorPayInfo = bo.t((String)localObject3, new Object[] { paramFavorPayInfo });
                    break;
                  }
                }
                ab.e("MicroMsg.WalletPwdDialog", "can not found contact for user::".concat(String.valueOf(localObject4)));
                break label410;
              }
              ab.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
              break label410;
            }
            if (paramPayInfo.cIf == 31)
            {
              localObject3 = paramPayInfo.vwh.getString("extinfo_key_1", "");
              if (!bo.isNullOrNil((String)localObject3))
              {
                g.RQ();
                paramFavorPayInfo = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM((String)localObject3);
                if (paramFavorPayInfo != null)
                {
                  paramFavorPayInfo = paramFavorPayInfo.Oi();
                  localObject2 = new StringBuilder().append(paramFavorPayInfo);
                  if (bo.isNullOrNil(paramString));
                  for (paramFavorPayInfo = ""; ; paramFavorPayInfo = "(" + paramString + ")")
                  {
                    paramFavorPayInfo = paramContext.getString(2131305241, new Object[] { paramFavorPayInfo });
                    break;
                  }
                }
                ab.e("MicroMsg.WalletPwdDialog", "can not found contact for user::".concat(String.valueOf(localObject3)));
                paramFavorPayInfo = (FavorPayInfo)localObject2;
                break label410;
              }
              ab.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
              paramFavorPayInfo = (FavorPayInfo)localObject2;
              break label410;
            }
            if (paramPayInfo.cIf == 42)
            {
              localObject3 = paramPayInfo.vwh.getString("extinfo_key_1", "");
              if (!bo.isNullOrNil((String)localObject3))
              {
                g.RQ();
                paramFavorPayInfo = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM((String)localObject3);
                if (paramFavorPayInfo != null)
                {
                  paramFavorPayInfo = paramFavorPayInfo.Oi();
                  localObject2 = new StringBuilder().append(paramFavorPayInfo);
                  if (bo.isNullOrNil(paramString));
                  for (paramFavorPayInfo = ""; ; paramFavorPayInfo = "(" + paramString + ")")
                  {
                    paramFavorPayInfo = paramContext.getString(2131305235, new Object[] { paramFavorPayInfo });
                    break;
                  }
                }
                ab.e("MicroMsg.WalletPwdDialog", "can not found contact for user::".concat(String.valueOf(localObject3)));
                paramFavorPayInfo = (FavorPayInfo)localObject2;
                break label410;
              }
              ab.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
              paramFavorPayInfo = (FavorPayInfo)localObject2;
              break label410;
            }
            if (paramPayInfo.cIf == 48)
            {
              paramFavorPayInfo = paramContext.getString(2131302062);
              break label410;
            }
            paramFavorPayInfo = (FavorPayInfo)localObject2;
            if (paramPayInfo.cIf != 49)
              break label410;
            paramFavorPayInfo = paramPayInfo.vwh.getString("extinfo_key_1", "");
            if (!bo.isNullOrNil(paramFavorPayInfo))
            {
              paramFavorPayInfo = paramContext.getString(2131305241, new Object[] { paramFavorPayInfo });
              break label410;
            }
            ab.e("MicroMsg.WalletPwdDialog", "userName is null, scene is %s", new Object[] { Integer.valueOf(paramPayInfo.cIf) });
            paramFavorPayInfo = (FavorPayInfo)localObject2;
            break label410;
            label2018: paramString = new StringBuilder("orders null?:");
            if (paramOrders == null);
            for (bool1 = true; ; bool1 = false)
            {
              ab.w("MicroMsg.WalletPwdDialog", bool1);
              localObject3 = paramFavorPayInfo;
              break;
            }
            if ((localObject1 != null) && (((List)localObject1).size() > 0))
            {
              localObject1 = com.tencent.mm.wallet_core.ui.e.e(((com.tencent.mm.plugin.wallet.a.j)localObject5).tna, paramOrders.pcl);
              bool1 = true;
              paramFavorPayInfo = paramContext.getString(2131305238);
              break label689;
            }
            localObject1 = com.tencent.mm.wallet_core.ui.e.e(paramOrders.pTN, paramOrders.pcl);
            paramFavorPayInfo = null;
            break label689;
            label2126: paramString = ",".concat(String.valueOf(paramFavorPayInfo));
            localObject5 = localObject2;
            d2 = d1;
            str2 = str1;
            localObject8 = localObject4;
            localObject7 = localObject1;
            bool2 = bool1;
            break label819;
            paramFavorPayInfo = paramBankcard.field_desc;
            break label866;
            label2174: paramBoolean = false;
            break label1010;
            paramFavorPayInfo.nm(false);
          }
        }
        paramFavorPayInfo = null;
        break label689;
        paramString = null;
        d2 = d1;
      }
    }
  }

  private static LinkedList<String> a(Bankcard paramBankcard, Orders paramOrders)
  {
    AppMethodBeat.i(47634);
    LinkedList localLinkedList = new LinkedList();
    if ((paramOrders != null) && (paramOrders.tAr != null) && (paramOrders.tAr.tnf != null))
    {
      paramOrders = paramOrders.tAr.tnf.tmA.iterator();
      while (paramOrders.hasNext())
      {
        com.tencent.mm.plugin.wallet.a.c localc = (com.tencent.mm.plugin.wallet.a.c)paramOrders.next();
        if (localc.pbo.equals(paramBankcard.field_bindSerial))
        {
          paramBankcard = localc.tmL.iterator();
          while (paramBankcard.hasNext())
          {
            paramOrders = (com.tencent.mm.plugin.wallet.a.d)paramBankcard.next();
            if (paramOrders.tmM != 0)
              localLinkedList.add(paramOrders.pOz);
          }
          AppMethodBeat.o(47634);
        }
      }
    }
    while (true)
    {
      return localLinkedList;
      AppMethodBeat.o(47634);
    }
  }

  private void a(PayInfo arg1, boolean paramBoolean)
  {
    AppMethodBeat.i(47622);
    this.pGr = ???;
    this.tJY = paramBoolean;
    if (com.tencent.mm.model.r.YM())
    {
      AppMethodBeat.o(47622);
      return;
    }
    ab.v("MicroMsg.WalletPwdDialog", "alvinluo updateFingerprintMode");
    synchronized (this.tKo)
    {
      ??? = (l)g.K(l.class);
    }
    if ((!???.bxf()) && (???.bxe()))
    {
      this.tKn = 0;
      label98: ab.i("MicroMsg.WalletPwdDialog", "bio mode: %s", new Object[] { Integer.valueOf(this.tKn) });
      this.tJZ = 0;
      this.tJU.setVisibility(8);
      this.tJV.setVisibility(8);
      this.tKc = bo.yz();
      if ((com.tencent.mm.plugin.wallet_core.model.r.cPI() == null) || (this.tKn < 0))
        break label1207;
    }
    label1207: for (paramBoolean = ???.bxz(); ; paramBoolean = true)
    {
      ab.i("MicroMsg.WalletPwdDialog", "hy: soter key status: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      if (((this.pGr != null) && ((this.pGr.vwi == 100000) || (this.pGr.vwi == 100102))) || (!paramBoolean))
      {
        ab.i("MicroMsg.WalletPwdDialog", "errCode: %s", new Object[] { Integer.valueOf(this.pGr.vwi) });
        if (!this.nTi.isShown())
          this.nTi.setVisibility(0);
        if (this.pGr != null)
        {
          this.pGr.tKd = 0;
          this.pGr.cBU = "";
          this.pGr.cBV = "";
        }
        this.tJV.setVisibility(0);
        this.tJW.setVisibility(0);
        TextView localTextView = this.tJW;
        int i;
        if ((this.pGr != null) && (this.pGr.vwi == 100102))
        {
          i = 2131304808;
          label351: localTextView.setText(i);
          this.tJW.setTextColor(getContext().getResources().getColor(2131690648));
          if (paramBoolean)
            break label589;
          this.tJI.setVisibility(0);
          this.tJJ.setVisibility(0);
        }
        while (true)
        {
          if ((this.pGr != null) && (this.pGr.vwi == 100102))
          {
            g.RP().Ry().set(ac.a.xKS, Boolean.TRUE);
            ???.hq(false);
            ???.hr(false);
            g.RP().Ry().set(ac.a.xKQ, Boolean.FALSE);
          }
          com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          AppMethodBeat.o(47622);
          break;
          localObject = finally;
          AppMethodBeat.o(47622);
          throw localObject;
          if ((!???.bxA()) || (!???.bxB()) || (???.bxg()) || (!???.bxh()))
            break label98;
          this.tKn = 1;
          break label98;
          i = 2131304801;
          break label351;
          label589: this.tJI.setVisibility(8);
          this.tJJ.setVisibility(8);
        }
      }
      if ((this.pGr != null) && (this.pGr.vwi == 100001))
        this.pGr.tKd = 1;
      if ((this.tKn >= 0) && (this.tJY) && (!cRP()))
      {
        this.tJU.setVisibility(0);
        this.tJU.setText(getContext().getString(2131305244));
        this.tJF.setVisibility(8);
        this.nTi.setVisibility(8);
        if (this.pGr != null)
          this.pGr.tKd = 1;
        if (this.tKn == 0)
        {
          this.tJX = 1;
          this.tJV.setVisibility(0);
          this.tGW.setVisibility(0);
          this.tJA.setText(2131305237);
          cRy();
          com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        }
      }
      while (true)
      {
        ab.i("MicroMsg.WalletPwdDialog", "canUseBioMode: %s, use_pay_touch: %s, forcePwdMode：%s", new Object[] { Integer.valueOf(this.tKn), Boolean.valueOf(this.tJY), Boolean.valueOf(cRP()) });
        this.tJU.setOnClickListener(new q.6(this));
        AppMethodBeat.o(47622);
        break;
        if (this.tKn == 1)
        {
          this.tJX = 2;
          this.tKl.setVisibility(0);
          this.tJA.setText(2131305236);
          continue;
          if ((this.tKn >= 0) && (this.tJY) && (cRP()))
          {
            if (this.tKn == 0)
              this.tJU.setText(getContext().getString(2131304802));
            while (true)
            {
              this.tJU.setVisibility(0);
              this.tJX = 0;
              this.tJV.setVisibility(8);
              this.tKl.setVisibility(8);
              this.tJF.setVisibility(0);
              if (!this.nTi.isShown())
                this.nTi.setVisibility(0);
              this.tJA.setText(2131305242);
              if (this.pGr != null)
                this.pGr.tKd = 0;
              com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
              com.tencent.mm.wallet_core.ui.e.QS(8);
              break;
              this.tJU.setText(getContext().getString(2131304794));
            }
          }
          if (this.pGr != null)
            this.pGr.tKd = 0;
          this.tJU.setVisibility(8);
          com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        }
      }
    }
  }

  private static boolean a(Bankcard paramBankcard, Orders paramOrders, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(47635);
    if (paramBankcard == null)
      AppMethodBeat.o(47635);
    while (true)
    {
      return bool;
      if (!tKp.containsKey(paramString))
        break;
      AppMethodBeat.o(47635);
    }
    label89: int j;
    if ((paramOrders.tAr != null) && (paramOrders.tAr.tnf != null))
      if (paramOrders.tAr.tnf.tmA.size() > 0)
      {
        paramString = paramOrders.tAr.tnf.tmA.iterator();
        int i = 0;
        j = i;
        if (!paramString.hasNext())
          break label145;
        com.tencent.mm.plugin.wallet.a.c localc = (com.tencent.mm.plugin.wallet.a.c)paramString.next();
        if ((localc.pbo == null) || (!localc.pbo.equals(paramBankcard.field_bindSerial)))
          break label238;
        i = 1;
      }
    label145: label238: 
    while (true)
    {
      break label89;
      j = 0;
      if (j != 0)
      {
        AppMethodBeat.o(47635);
        break;
      }
      if (paramOrders.tAr.tnf.tmA.size() > 0)
      {
        AppMethodBeat.o(47635);
        bool = true;
        break;
      }
      if ((paramOrders.tAr.tnf.tmB != null) && (paramOrders.tAr.tnf.tmB.tns.size() > 0))
      {
        AppMethodBeat.o(47635);
        bool = true;
        break;
      }
      AppMethodBeat.o(47635);
      break;
    }
  }

  private static boolean a(PayInfo paramPayInfo)
  {
    if ((paramPayInfo != null) && ((paramPayInfo.cIf == 31) || (paramPayInfo.cIf == 32) || (paramPayInfo.cIf == 33)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void add(String paramString)
  {
    AppMethodBeat.i(47619);
    if (!TextUtils.isEmpty(paramString))
    {
      this.tJL.setVisibility(0);
      this.tJL.setText(paramString);
      AppMethodBeat.o(47619);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletPwdDialog", "ChargeFee is null");
      this.tJL.setVisibility(8);
      AppMethodBeat.o(47619);
    }
  }

  private void aw(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(47630);
    if (this.tJC != null)
      if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
      {
        this.tJC.setWording(paramLinkedList);
        this.tJC.setVisibility(0);
        AppMethodBeat.o(47630);
      }
    while (true)
    {
      return;
      this.tJC.setVisibility(8);
      AppMethodBeat.o(47630);
    }
  }

  private void cRN()
  {
    AppMethodBeat.i(47609);
    if (this.tJX == 1)
      this.tJU.setText(2131304802);
    while (true)
    {
      this.tJX = 0;
      this.tKc = bo.yz();
      this.tJV.setVisibility(8);
      this.tKl.setVisibility(8);
      this.tJF.setVisibility(0);
      if (!this.nTi.isShown())
        this.nTi.setVisibility(0);
      this.tJA.setText(2131305242);
      nl(true);
      this.pGr.tKd = 0;
      com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      com.tencent.mm.wallet_core.ui.e.QS(29);
      cRz();
      AppMethodBeat.o(47609);
      return;
      this.tJU.setText(2131304794);
    }
  }

  private static boolean cRP()
  {
    AppMethodBeat.i(47641);
    g.RQ();
    Object localObject = g.RP().Ry().get(ac.a.xKM, Boolean.FALSE);
    if (localObject != null);
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(47641);
      return bool;
    }
  }

  private void cRy()
  {
    AppMethodBeat.i(47610);
    com.tencent.mm.plugin.soter.d.a.cvP();
    lv locallv = new lv();
    locallv.cHD.cBT = this.pGr.czZ;
    locallv.cHD.cHF = 1;
    locallv.cHD.cHH = new q.8(this, locallv);
    com.tencent.mm.sdk.b.a.xxA.m(locallv);
    AppMethodBeat.o(47610);
  }

  private static void cRz()
  {
    AppMethodBeat.i(47611);
    ab.i("MicroMsg.WalletPwdDialog", "hy: send release FPManager");
    ((l)g.K(l.class)).bxk();
    AppMethodBeat.o(47611);
  }

  private void h(Bankcard paramBankcard)
  {
    AppMethodBeat.i(47623);
    if (paramBankcard == null)
    {
      ab.e("MicroMsg.WalletPwdDialog", "setBankcardText bankcard == null");
      AppMethodBeat.o(47623);
    }
    while (true)
    {
      return;
      if (paramBankcard.cPc())
      {
        this.tJD.setImageResource(2130840657);
        AppMethodBeat.o(47623);
      }
      else if (paramBankcard.cPd())
      {
        this.tln.a(paramBankcard, this.tJD);
        AppMethodBeat.o(47623);
      }
      else if (paramBankcard.cPg())
      {
        this.tJD.setImageDrawable(com.tencent.mm.svg.a.a.f(getContext().getResources(), 2131231368));
        if (!bo.isNullOrNil(paramBankcard.txk))
        {
          this.tJD.setUseSdcardCache(true);
          this.tJD.setImgSavedPath(com.tencent.mm.plugin.wallet_core.d.b.cRb());
          this.tJD.eb(paramBankcard.txk, 2131231368);
          AppMethodBeat.o(47623);
        }
      }
      else
      {
        this.tln.a(getContext(), paramBankcard, this.tJD);
        AppMethodBeat.o(47623);
      }
    }
  }

  private static void nl(boolean paramBoolean)
  {
    AppMethodBeat.i(47640);
    g.RQ();
    g.RP().Ry().set(ac.a.xKM, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(47640);
  }

  private void nm(boolean paramBoolean)
  {
    AppMethodBeat.i(47612);
    View localView = this.jcl.findViewById(2131829027);
    if (localView != null)
      if (paramBoolean)
      {
        localView.setVisibility(0);
        this.tKf = true;
        AppMethodBeat.o(47612);
      }
    while (true)
    {
      return;
      localView.setVisibility(8);
      this.tKf = false;
      AppMethodBeat.o(47612);
    }
  }

  private void nn(boolean paramBoolean)
  {
    AppMethodBeat.i(47625);
    if (!paramBoolean)
    {
      this.tJI.setVisibility(8);
      this.tJJ.setVisibility(8);
      AppMethodBeat.o(47625);
    }
    while (true)
    {
      return;
      this.tJI.setVisibility(0);
      this.tJJ.setVisibility(0);
      AppMethodBeat.o(47625);
    }
  }

  public final void a(Context paramContext, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    AppMethodBeat.i(47626);
    this.tpu = c.tDU.a(paramOrders);
    if ((paramOrders != null) && (paramOrders.tAr != null) && (paramOrders.tAr.tmV != null) && (paramOrders.tAr.tmV.size() > 0) && (this.tpu != null))
      if (paramFavorPayInfo == null)
      {
        this.toH = this.tpu.acX(paramOrders.tAr.tmU);
        this.tJE.setVisibility(0);
        if (this.tJI != null)
          this.tJI.setTag(this.toH);
        this.tJT = paramBankcard;
        this.tJN.setOnClickListener(new q.9(this, paramContext, paramOrders));
        Assert.assertNotNull(this.tpu);
        this.tJK.setVisibility(8);
        AppMethodBeat.o(47626);
      }
    while (true)
    {
      return;
      this.toH = paramFavorPayInfo;
      break;
      this.tJE.setVisibility(8);
      AppMethodBeat.o(47626);
    }
  }

  public final void a(q.a parama)
  {
    this.tKm = parama;
  }

  public final void a(CharSequence paramCharSequence, View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    AppMethodBeat.i(47624);
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      this.tJI.setOnClickListener(paramOnClickListener);
      this.tJB.setText(paramCharSequence);
      nn(this.tJS);
      if (!paramBoolean)
      {
        this.tJH.setVisibility(8);
        AppMethodBeat.o(47624);
      }
    }
    while (true)
    {
      return;
      this.tJH.setVisibility(0);
      AppMethodBeat.o(47624);
      continue;
      this.tJI.setVisibility(8);
      this.tJJ.setVisibility(8);
      AppMethodBeat.o(47624);
    }
  }

  public final void adc(String paramString)
  {
    AppMethodBeat.i(47617);
    this.qcc.setText(paramString);
    AppMethodBeat.o(47617);
  }

  public final void ade(String paramString)
  {
    AppMethodBeat.i(47621);
    if (!TextUtils.isEmpty(paramString))
    {
      this.tpG.setVisibility(0);
      this.tpG.setText(paramString);
      AppMethodBeat.o(47621);
    }
    while (true)
    {
      return;
      this.tpG.setVisibility(8);
      AppMethodBeat.o(47621);
    }
  }

  public final void adf(String paramString)
  {
    AppMethodBeat.i(47631);
    if (!bo.isNullOrNil(paramString))
    {
      this.tJM.setText(paramString);
      this.tJM.setVisibility(0);
      AppMethodBeat.o(47631);
    }
    while (true)
    {
      return;
      this.tJM.setVisibility(8);
      AppMethodBeat.o(47631);
    }
  }

  public final void b(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(47628);
    if (this.oft == null)
      AppMethodBeat.o(47628);
    while (true)
    {
      return;
      this.Ue = paramOnCancelListener;
      this.oft.setVisibility(0);
      this.oft.setOnClickListener(new q.10(this, paramOnCancelListener));
      AppMethodBeat.o(47628);
    }
  }

  public int btU()
  {
    return 2130971107;
  }

  protected void cA(Context paramContext)
  {
    AppMethodBeat.i(47606);
    ab.v("MicroMsg.WalletPwdDialog", "alvinluo WalletPwdDialog initView");
    this.mContext = paramContext;
    fl(paramContext);
    fm(paramContext);
    AppMethodBeat.o(47606);
  }

  protected void cRO()
  {
    AppMethodBeat.i(47627);
    nl(false);
    if (this.tJQ != null)
      this.tJQ.onClick(this, 0);
    dismiss();
    if (this.tKk != null)
      this.tKk.a(this.tJF.getText(), this.toH, this.tJR);
    if (this.tKc < 0L)
    {
      ab.e("MicroMsg.WalletPwdDialog", "hy: not set update mode time yet. abandon");
      AppMethodBeat.o(47627);
    }
    while (true)
    {
      return;
      if (this.tJX == 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(686L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(686L, 1L, bo.az(this.tKc), false);
        AppMethodBeat.o(47627);
      }
      else
      {
        if (this.tJX == 1)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(686L, 2L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(686L, 3L, bo.az(this.tKc), false);
        }
        AppMethodBeat.o(47627);
      }
    }
  }

  public final void cRm()
  {
    AppMethodBeat.i(47638);
    this.isPaused = false;
    if (com.tencent.mm.model.r.YM())
      AppMethodBeat.o(47638);
    while (true)
    {
      return;
      AppMethodBeat.o(47638);
    }
  }

  public void dismiss()
  {
    AppMethodBeat.i(47616);
    try
    {
      super.dismiss();
      cRz();
      this.tln.destory();
      if (this.msx != null)
        this.msx.cancel();
      AppMethodBeat.o(47616);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.WalletPwdDialog", "dismiss exception, e = " + localException.getMessage());
    }
  }

  public final void f(String paramString, double paramDouble)
  {
    AppMethodBeat.i(47618);
    if (!TextUtils.isEmpty(paramString))
    {
      this.pUA.setVisibility(0);
      this.pUA.setText(paramString);
      if (paramDouble == 0.0D)
      {
        this.tJS = false;
        nn(this.tJS);
        AppMethodBeat.o(47618);
      }
    }
    while (true)
    {
      return;
      nn(this.tJS);
      AppMethodBeat.o(47618);
      continue;
      this.pUA.setVisibility(8);
      this.tJS = true;
      nn(this.tJS);
      AppMethodBeat.o(47618);
    }
  }

  protected final void fl(Context paramContext)
  {
    AppMethodBeat.i(47607);
    this.jcl = View.inflate(paramContext, btU(), null);
    this.oft = ((ImageView)this.jcl.findViewById(2131826480));
    this.mKeyboard = ((MyKeyboardWindow)this.jcl.findViewById(2131822357));
    this.nTi = this.jcl.findViewById(2131822356);
    this.qcc = ((TextView)this.jcl.findViewById(2131821019));
    this.tJA = ((TextView)this.jcl.findViewById(2131829019));
    this.pUA = ((TextView)this.jcl.findViewById(2131826481));
    this.tpG = ((TextView)this.jcl.findViewById(2131826482));
    this.tpG.getPaint().setFlags(16);
    this.tJB = ((TextView)this.jcl.findViewById(2131825789));
    this.tJC = ((FavourLayout)this.jcl.findViewById(2131828748));
    this.tJD = ((CdnImageView)this.jcl.findViewById(2131829026));
    this.tJH = this.jcl.findViewById(2131829022);
    this.tJE = ((TextView)this.jcl.findViewById(2131826485));
    this.gvq = ((ImageView)this.jcl.findViewById(2131826478));
    this.tJI = this.jcl.findViewById(2131826483);
    this.tJJ = ((TextView)this.jcl.findViewById(2131829025));
    a.b.b(this.gvq, com.tencent.mm.wallet_core.ui.e.getUsername());
    this.tJF = ((EditHintPasswdView)this.jcl.findViewById(2131824902));
    this.tJK = ((ImageView)this.jcl.findViewById(2131826484));
    this.tJU = ((TextView)this.jcl.findViewById(2131829020));
    this.tJV = this.jcl.findViewById(2131828755);
    this.tJW = ((TextView)this.jcl.findViewById(2131828757));
    this.tGW = ((ImageView)this.jcl.findViewById(2131828756));
    this.tJL = ((TextView)this.jcl.findViewById(2131827122));
    this.tJM = ((TextView)this.jcl.findViewById(2131829024));
    this.tJN = this.jcl.findViewById(2131829021);
    this.tJO = ((TextView)this.jcl.findViewById(2131829023));
    this.tKl = ((Button)this.jcl.findViewById(2131829028));
    this.tJC.setVisibility(8);
    AppMethodBeat.o(47607);
  }

  @TargetApi(14)
  protected void fm(Context paramContext)
  {
    AppMethodBeat.i(47608);
    setCanceledOnTouchOutside(true);
    getWindow().setSoftInputMode(2);
    com.tencent.mm.wallet_core.ui.formview.a.a(this.tJF);
    this.tJF.setOnInputValidListener(new q.1(this));
    this.tJF.requestFocus();
    Object localObject = (TextView)this.jcl.findViewById(2131829019);
    if (localObject != null)
      ((TextView)localObject).setText(com.tencent.mm.wallet_core.c.ae.ir(paramContext));
    paramContext = (EditText)this.jcl.findViewById(2131820687);
    com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(paramContext);
    this.mKeyboard.setInputEditText(paramContext);
    if (Build.VERSION.SDK_INT >= 14)
    {
      localObject = new com.tencent.mm.ui.a.c();
      this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
      paramContext.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
    }
    paramContext.setOnClickListener(new q.3(this));
    this.jcl.findViewById(2131822358).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(47590);
        if (q.this.nTi.isShown())
          q.this.nTi.setVisibility(8);
        AppMethodBeat.o(47590);
      }
    });
    this.tKl.setOnClickListener(new q.5(this));
    AppMethodBeat.o(47608);
  }

  public final void gN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(47620);
    if (!TextUtils.isEmpty(paramString2))
    {
      this.tJE.setVisibility(0);
      this.tJE.setText(paramString2);
      if (TextUtils.isEmpty(paramString1))
        break label71;
      this.tJO.setText(paramString1);
      this.tJO.setVisibility(0);
      AppMethodBeat.o(47620);
    }
    while (true)
    {
      return;
      this.tJE.setVisibility(8);
      break;
      label71: this.tJO.setVisibility(8);
      AppMethodBeat.o(47620);
    }
  }

  public final void no(boolean paramBoolean)
  {
    AppMethodBeat.i(47629);
    if (paramBoolean)
    {
      this.tJI.setVisibility(0);
      AppMethodBeat.o(47629);
    }
    while (true)
    {
      return;
      this.tJI.setVisibility(8);
      AppMethodBeat.o(47629);
    }
  }

  public final void onActivityPause()
  {
    AppMethodBeat.i(47639);
    this.isPaused = true;
    if (com.tencent.mm.model.r.YM())
      AppMethodBeat.o(47639);
    while (true)
    {
      return;
      if (this.tJX == 1)
        cRN();
      AppMethodBeat.o(47639);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47614);
    super.onCreate(paramBundle);
    setContentView(this.jcl);
    f.dRn().dRo();
    AppMethodBeat.o(47614);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47613);
    if (paramInt == 4)
    {
      if (this.Ue != null)
        this.Ue.onCancel(this);
      if (this.tKm != null)
        this.tKm.bXx();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(47613);
    return bool;
  }

  public void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(47615);
    super.setCancelable(paramBoolean);
    this.gHY = paramBoolean;
    setCanceledOnTouchOutside(this.gHY);
    AppMethodBeat.o(47615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q
 * JD-Core Version:    0.6.2
 */