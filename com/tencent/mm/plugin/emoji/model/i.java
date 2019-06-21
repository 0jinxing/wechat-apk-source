package com.tencent.mm.plugin.emoji.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.a.a.e;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.f.q;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ar;
import java.util.ArrayList;

public final class i
{
  private Context Gn;
  private final String TAG;
  public Context jiq;
  public com.tencent.mm.plugin.emoji.a.a.a kVA;
  public boolean kVB;
  public Fragment kVC;
  public int kVD;
  public long kVE;
  public String kVF;
  public i.b kVG;
  private String kVH;
  private com.tencent.mm.plugin.emoji.h.c kVI;
  public String kVJ;

  public i()
  {
    AppMethodBeat.i(53054);
    this.TAG = "MicroMsg.emoji.PayOrDownloadComponent";
    this.kVB = false;
    this.kVE = 0L;
    this.kVF = "";
    this.Gn = ah.getContext();
    this.kVI = new com.tencent.mm.plugin.emoji.h.c(2003);
    AppMethodBeat.o(53054);
  }

  private void JD(String paramString)
  {
    AppMethodBeat.i(53058);
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = getString(2131299072);
    com.tencent.mm.ui.base.h.a(this.jiq, str, "", new i.1(this));
    AppMethodBeat.o(53058);
  }

  private String getString(int paramInt)
  {
    AppMethodBeat.i(53059);
    String str = this.Gn.getString(paramInt);
    AppMethodBeat.o(53059);
    return str;
  }

  private void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(53056);
    if (this.kVG != null)
      this.kVG.i(paramString1, paramString2, paramString3, paramString4);
    AppMethodBeat.o(53056);
  }

  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    AppMethodBeat.i(53055);
    if ((parama == null) || (parama.kRB == null) || (this.kVA == null) || (this.kVA.kSP == null))
      AppMethodBeat.o(53055);
    while (true)
    {
      return;
      EmotionSummary localEmotionSummary = parama.kRB.kTb;
      if (localEmotionSummary == null)
      {
        AppMethodBeat.o(53055);
      }
      else
      {
        Object localObject1 = localEmotionSummary.ProductID;
        String str1 = localEmotionSummary.PackName;
        Object localObject2 = localEmotionSummary.PriceNum;
        String str2 = localEmotionSummary.PriceType;
        int i = parama.bjn();
        Object localObject3;
        label98: com.tencent.mm.plugin.emoji.a.a.c localc;
        boolean bool1;
        boolean bool2;
        if (parama.kRB == null)
        {
          localObject3 = null;
          ((Integer)localObject3).intValue();
          localc = this.kVA.kSP;
          bool1 = localc.kSY;
          bool2 = parama.kRB.kTf;
          if (!TextUtils.isEmpty((CharSequence)localObject2))
            break label278;
          localObject3 = "";
          label141: ab.i("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { localObject1, localObject3, Integer.valueOf(i) });
          this.kVH = ((String)localObject1);
        }
        switch (i)
        {
        case 1:
        case 2:
        case 6:
        case 8:
        default:
          ab.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] unkonw product status");
        case 9:
        case 0:
        case 7:
        case 4:
        case 12:
          do
          {
            do
            {
              AppMethodBeat.o(53055);
              break;
              localObject3 = Integer.valueOf(parama.kRB.kTd);
              break label98;
              localObject3 = localObject2;
              break label141;
              parama = new q((String)localObject1, 2);
              g.RO().eJo.a(parama, 0);
              AppMethodBeat.o(53055);
              break;
              if (this.kVA != null)
                this.kVA.bW((String)localObject1, 3);
              AppMethodBeat.o(53055);
              break;
              if (bool2)
              {
                if (this.kVC != null)
                {
                  i = 1;
                  if (i == 0)
                    break label477;
                  parama = this.kVI;
                  localObject2 = this.kVC;
                  ab.d("MicroMsg.emoji.UseSmileyTool", "jacks sendToFriend emoji");
                  localObject3 = new Intent();
                  ((Intent)localObject3).putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
                  ((Intent)localObject3).putExtra("MMActivity.OverrideExitAnimation", 2131034227);
                  d.a((Fragment)localObject2, ".ui.transmit.SelectConversationUI", (Intent)localObject3, parama.iGJ);
                  ((Fragment)localObject2).getActivity().overridePendingTransition(2131034229, 2131034181);
                }
                while (true)
                {
                  this.kVI.lgK = ((String)localObject1);
                  com.tencent.mm.plugin.report.service.h.pYm.e(12069, new Object[] { Integer.valueOf(1), localObject1 });
                  AppMethodBeat.o(53055);
                  break;
                  i = 0;
                  break label354;
                  this.kVI.A((Activity)this.jiq);
                }
              }
            }
            while (!parama.kRB.kTh);
            localObject3 = parama.kRB.kTb.ProductID;
            localObject2 = parama.kRB.kTb.PackName;
            parama = this.kVJ;
            if (this.jiq != null)
            {
              if (this.kVD == 9);
              for (i = 3; ; i = 4)
              {
                localObject1 = new Intent();
                ((Intent)localObject1).setClass(this.jiq, EmojiStoreV2RewardUI.class);
                ((Intent)localObject1).putExtra("extra_id", (String)localObject3);
                ((Intent)localObject1).putExtra("extra_name", (String)localObject2);
                ((Intent)localObject1).putExtra("name", parama);
                ((Intent)localObject1).putExtra("scene", this.kVD);
                ((Intent)localObject1).putExtra("pageType", i);
                ((Intent)localObject1).putExtra("searchID", this.kVE);
                this.jiq.startActivity((Intent)localObject1);
                com.tencent.mm.plugin.report.service.h.pYm.e(12738, new Object[] { localObject3, Integer.valueOf(i), Integer.valueOf(this.kVD), Integer.valueOf(0) });
                AppMethodBeat.o(53055);
                break;
              }
            }
            ab.i("MicroMsg.emoji.PayOrDownloadComponent", "start reward ui faild. context is null");
            AppMethodBeat.o(53055);
            break;
          }
          while (this.kVB);
          parama = new Intent();
          parama.putExtra("key_product_id", (String)localObject1);
          ab.i("MicroMsg.emoji.PayOrDownloadComponent", "onProductClick: price %s, currency %s", new Object[] { localObject2, str2 });
          if (bool1)
          {
            parama.putExtra("key_currency_type", str2);
            parama.putExtra("key_price", str2 + (String)localObject2);
          }
          while (true)
          {
            d.b(this.jiq, "wallet_index", ".ui.WalletIapUI", parama, 2001);
            this.kVB = true;
            com.tencent.mm.plugin.report.service.h.pYm.e(12066, new Object[] { Integer.valueOf(2), Integer.valueOf(this.kVD), "", localObject1, Long.valueOf(this.kVE), this.kVF });
            AppMethodBeat.o(53055);
            break;
            parama.putExtra("key_currency_type", str2);
            parama.putExtra("key_price", (String)localObject2);
          }
        case 3:
        case 5:
          if (com.tencent.mm.plugin.emoji.h.a.g(localEmotionSummary))
          {
            com.tencent.mm.plugin.emoji.f.a.bkq();
            com.tencent.mm.plugin.emoji.f.a.bkr();
            AppMethodBeat.o(53055);
          }
          else
          {
            i((String)localObject1, null, str1, localEmotionSummary.IconUrl);
            if (this.kVA != null)
              this.kVA.bX((String)localObject1, 0);
            ab.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { localObject1 });
            com.tencent.mm.plugin.report.service.h.pYm.e(12066, new Object[] { Integer.valueOf(0), Integer.valueOf(this.kVD), "", localObject1, Long.valueOf(this.kVE), this.kVF });
            AppMethodBeat.o(53055);
          }
          break;
        case -1:
          if (e.a(localEmotionSummary))
            i = 3;
          while (true)
          {
            this.kVA.bW((String)localObject1, i);
            AppMethodBeat.o(53055);
            break;
            if ((e.b(localEmotionSummary)) || ((!bool1) && (TextUtils.isEmpty(localEmotionSummary.PackPrice))))
            {
              i = 3;
            }
            else if (bool1)
            {
              parama = localc.IW((String)localObject1);
              if (TextUtils.isEmpty(parama.xYb))
                i = parama.xXX;
              else
                i = 4;
            }
            else
            {
              i = 4;
            }
          }
        case 10:
          parama = localc.IW((String)localObject1);
          if (parama != null)
            switch (parama.xXY)
            {
            default:
              parama = getString(2131299196);
            case 10234:
            case 10233:
            case 10235:
            }
          while (true)
          {
            com.tencent.mm.ui.base.h.b(this.jiq, parama, null, true);
            AppMethodBeat.o(53055);
            break;
            parama = getString(2131299058);
            continue;
            parama = getString(2131299066);
            continue;
            parama = getString(2131299191);
          }
        case 11:
          label278: label354: ab.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
          label477: AppMethodBeat.o(53055);
        }
      }
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53057);
    ab.d("MicroMsg.emoji.PayOrDownloadComponent", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    String str1 = "";
    int i = 0;
    if (paramIntent != null)
    {
      i = paramIntent.getIntExtra("key_err_code", 0);
      ab.w("MicroMsg.emoji.PayOrDownloadComponent", "errCode:".concat(String.valueOf(i)));
      str1 = paramIntent.getStringExtra("key_err_msg");
      ab.w("MicroMsg.emoji.PayOrDownloadComponent", "errMsg:".concat(String.valueOf(str1)));
    }
    this.kVB = false;
    if (paramInt2 != -1)
      if (paramInt1 == 2001)
        if (r.YL())
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(166L, 6L, 1L, false);
          AppMethodBeat.o(53057);
        }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(166L, 2L, 1L, false);
      AppMethodBeat.o(53057);
      continue;
      switch (paramInt1)
      {
      case 2002:
      default:
        ab.e("MicroMsg.emoji.PayOrDownloadComponent", "onActivityResult unknow request");
        AppMethodBeat.o(53057);
        break;
      case 2003:
        str1 = this.kVI.lgK;
        if (bo.isNullOrNil(str1))
        {
          AppMethodBeat.o(53057);
        }
        else
        {
          com.tencent.mm.plugin.emoji.h.c.a(paramIntent, str1, (Activity)this.jiq);
          com.tencent.mm.plugin.report.service.h.pYm.e(12069, new Object[] { Integer.valueOf(3), str1 });
          AppMethodBeat.o(53057);
        }
        break;
      case 2001:
        if ((this.kVA == null) || (this.kVA.kSP == null))
        {
          AppMethodBeat.o(53057);
        }
        else if ((paramIntent != null) && (i == 0))
        {
          ArrayList localArrayList = paramIntent.getStringArrayListExtra("key_response_product_ids");
          paramIntent = paramIntent.getStringArrayListExtra("key_response_series_ids");
          paramInt1 = 0;
          int j = localArrayList.size();
          paramInt2 = 0;
          if (paramInt2 < j)
          {
            String str2 = (String)localArrayList.get(paramInt2);
            String str3 = (String)paramIntent.get(paramInt2);
            ar localar = this.kVA.kSP.IW(str2);
            if (this.kVH.equals(str2))
            {
              i = 1;
              i(str2, str3, localar.lcC, null);
              this.kVA.bX(this.kVH, 0);
              com.tencent.mm.ui.base.h.bQ(this.jiq, str1);
              ab.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { str2 });
              paramInt1 = i;
              if (localArrayList.size() <= 1)
                break label517;
              ab.i("MicroMsg.emoji.PayOrDownloadComponent", "some other product verify.");
              paramInt1 = i;
              if (this.kVG == null)
                break label517;
              this.kVG.bkf();
              paramInt1 = 1;
            }
            label517: 
            while (true)
            {
              paramInt2++;
              break;
              this.kVA.bW(this.kVH, 5);
            }
          }
          if (paramInt1 == 0)
            JD(str1);
          if (r.YL())
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(166L, 4L, 1L, false);
            AppMethodBeat.o(53057);
          }
          else
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(166L, 0L, 1L, false);
            AppMethodBeat.o(53057);
          }
        }
        else
        {
          if ((paramIntent == null) || (i != 100000002))
            break label710;
          paramIntent = this.kVA.kSP.IW(this.kVH);
          i(this.kVH, null, paramIntent.lcC, null);
          this.kVA.bX(this.kVH, 0);
          ab.i("MicroMsg.emoji.PayOrDownloadComponent", "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { this.kVH });
          JD(str1);
          if (r.YL())
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(166L, 7L, 1L, false);
            AppMethodBeat.o(53057);
          }
          else
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(166L, 3L, 1L, false);
            AppMethodBeat.o(53057);
          }
        }
        break;
      }
    }
    label710: if ((paramIntent != null) && (i == 1))
    {
      if (r.YL())
        com.tencent.mm.plugin.report.service.h.pYm.a(166L, 6L, 1L, false);
      while (true)
      {
        ab.i("MicroMsg.emoji.PayOrDownloadComponent", "user cancel pay emoji.");
        AppMethodBeat.o(53057);
        break;
        com.tencent.mm.plugin.report.service.h.pYm.a(166L, 2L, 1L, false);
      }
    }
    if ((this.kVH == null) || (this.kVA == null) || (this.kVA.kSP == null))
    {
      label798: JD(str1);
      if (!r.YL())
        break label887;
      com.tencent.mm.plugin.report.service.h.pYm.a(166L, 5L, 1L, false);
    }
    while (true)
    {
      ab.i("MicroMsg.emoji.PayOrDownloadComponent", "failed pay emoji. errormsg:%s", new Object[] { str1 });
      AppMethodBeat.o(53057);
      break;
      this.kVA.kSP.IU(this.kVH);
      paramIntent = this.kVA.IS(this.kVH);
      if (paramIntent == null)
        break label798;
      paramIntent.bjs();
      break label798;
      label887: com.tencent.mm.plugin.report.service.h.pYm.a(166L, 1L, 1L, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.i
 * JD-Core Version:    0.6.2
 */