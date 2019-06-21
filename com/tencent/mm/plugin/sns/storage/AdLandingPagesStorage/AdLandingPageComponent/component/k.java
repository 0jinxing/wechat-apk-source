package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.SnsAdProxyUI;
import com.tencent.mm.pluginsdk.ui.e.c;
import com.tencent.mm.pluginsdk.ui.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public class k extends j
{
  RelativeLayout nMG;
  Button qZB;
  View qZC;

  public k(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k paramk, ViewGroup paramViewGroup)
  {
    super(paramContext, paramk, paramViewGroup);
  }

  protected final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k cpI()
  {
    return (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo;
  }

  protected final void cpJ()
  {
    AppMethodBeat.i(37093);
    Object localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo;
    long l = 0L;
    int i;
    if ((this.context instanceof Activity))
    {
      l = com.tencent.mm.plugin.sns.storage.v.Zm(((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
      i = ((Activity)this.context).getIntent().getIntExtra("sns_landig_pages_from_source", 0);
    }
    for (int j = ((Activity)this.context).getIntent().getIntExtra("sns_landing_pages_adType", 0); ; j = 0)
    {
      Object localObject2;
      if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).cuu == 4)
      {
        localObject1 = (e)localObject1;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("key_card_id", ((e)localObject1).kcM);
        if (!bo.isNullOrNil(cpC().YI(((e)localObject1).kcM)))
          ((e)localObject1).kdB = cpC().YI(((e)localObject1).kcM);
        ((Intent)localObject2).putExtra("key_card_ext", ((e)localObject1).kdB);
        ((Intent)localObject2).putExtra("key_from_scene", 21);
        ((Intent)localObject2).putExtra("key_stastic_scene", 15);
        d.b(this.context, "card", ".ui.CardDetailUI", (Intent)localObject2);
        AppMethodBeat.o(37093);
        return;
      }
      if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).cuu == 8)
        if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i))
        {
          localObject2 = "";
          if ((!(this.context instanceof Activity)) || (cpC().qXr != 2))
            break label1351;
          localObject1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
          localObject2 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        }
      while (true)
      {
        localObject2 = String.format("%s:%s:%s:%s:%d:%s:%s:%d", new Object[] { localObject1, localObject2, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i)(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWO, String.valueOf(System.currentTimeMillis() / 1000L), Integer.valueOf(cpC().qXr), cpC().qPj, Long.valueOf(l), Integer.valueOf(i) });
        Object localObject3 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i)this.qZo;
        String str1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.n(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i)localObject3).cOh, new String[] { String.format("gdt_vid=%s", new Object[] { cpC().hcx }), String.format("weixinadinfo=%s.%s.0.0", new Object[] { cpC().qTL, cpC().hcx }) });
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("username", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i)localObject3).username);
        ((Intent)localObject1).putExtra("url", str1);
        ((Intent)localObject1).putExtra("sceneNote", (String)localObject2);
        ((Intent)localObject1).setClass(this.context, SnsAdProxyUI.class);
        this.context.startActivity((Intent)localObject1);
        AppMethodBeat.o(37093);
        break;
        if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).cuu == 9)
        {
          localObject2 = (f)localObject1;
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("map_view_type", 1);
          ((Intent)localObject1).putExtra("kwebmap_slat", ((f)localObject2).qWd.nJu);
          ((Intent)localObject1).putExtra("kwebmap_lng", ((f)localObject2).qWd.nJv);
          ((Intent)localObject1).putExtra("kwebmap_scale", ((f)localObject2).qWd.cED);
          ((Intent)localObject1).putExtra("kPoiName", ((f)localObject2).qWd.cIK);
          ((Intent)localObject1).putExtra("Kwebmap_locaion", ((f)localObject2).qWd.nJx);
          ab.i("MicroMsg.Sns.AdLandingPageBtnComponent", "locatint to slat " + ((f)localObject2).qWd.nJu + ", slong " + ((f)localObject2).qWd.nJv + ", " + ((f)localObject2).qWd.cIK);
          d.b(this.context, "location", ".ui.RedirectUI", (Intent)localObject1, 2);
          AppMethodBeat.o(37093);
          break;
        }
        if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).cuu == 10)
        {
          if (c.a.vrD == null)
          {
            AppMethodBeat.o(37093);
            break;
          }
          localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h)localObject1;
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h)localObject1).qWc.size() > 1)
          {
            c.a.vrD.a(this.context, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h)localObject1).qWc, new k.5(this));
            AppMethodBeat.o(37093);
            break;
          }
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h)localObject1).qWc.size() > 0)
            AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity)this.context, (String)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h)localObject1).qWc.get(0));
          AppMethodBeat.o(37093);
          break;
        }
        if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).cuu == 11)
        {
          SnsAdNativeLandingPagesUI localSnsAdNativeLandingPagesUI;
          String str2;
          boolean bool1;
          label891: boolean bool2;
          if ((this.context instanceof SnsAdNativeLandingPagesUI))
          {
            localSnsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI)this.context;
            localObject2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).qWA;
            str2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).qWx;
            localObject3 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).qWy;
            str1 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).qWz;
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).qWv != 1)
              break label946;
            bool1 = true;
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).qWw != 1)
              break label952;
            bool2 = true;
            label902: if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWu != 1)
              break label958;
          }
          label946: label952: label958: for (boolean bool3 = true; ; bool3 = false)
          {
            localSnsAdNativeLandingPagesUI.a((r)localObject2, str2, (String)localObject3, str1, bool1, bool2, bool3);
            AppMethodBeat.o(37093);
            break;
            bool1 = false;
            break label891;
            bool2 = false;
            break label902;
          }
        }
        localObject3 = new Intent();
        localObject2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)localObject1).qWl;
        localObject1 = localObject2;
        if (!TextUtils.isEmpty(cpC().hcx))
        {
          localObject1 = localObject2;
          if (!TextUtils.isEmpty(cpC().qTL))
            localObject1 = ad.m((String)localObject2, new String[] { "traceid=" + cpC().hcx + "&aid=" + cpC().qTL });
        }
        ab.i("MicroMsg.Sns.AdLandingPageBtnComponent", "open url %s", new Object[] { localObject1 });
        ((Intent)localObject3).putExtra("rawUrl", (String)localObject1);
        ((Intent)localObject3).putExtra("useJs", true);
        ((Intent)localObject3).putExtra("type", -255);
        ((Intent)localObject3).putExtra("geta8key_scene", 2);
        if (cpC().qXr == 0)
        {
          localObject1 = new SnsAdClick(i, l, j);
          localObject2 = new Bundle();
          ((Bundle)localObject2).putParcelable("KSnsAdTag", (Parcelable)localObject1);
          ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject2);
        }
        if (((this.context instanceof Activity)) && (cpC().qXr == 2))
        {
          localObject2 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
          localObject1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
          if (!bo.isNullOrNil((String)localObject2))
          {
            l = System.currentTimeMillis() / 1000L;
            if (bo.isNullOrNil((String)localObject1))
              break label1345;
          }
        }
        while (true)
        {
          localObject1 = String.format("official_mall_%s_%s_%s_%s", new Object[] { localObject1, localObject2, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWO, String.valueOf(l) });
          ((Intent)localObject3).putExtra("prePublishId", (String)localObject1);
          ((Intent)localObject3).putExtra("KPublisherId", (String)localObject1);
          ((Intent)localObject3).putExtra("pay_channel", 47);
          d.b(this.context, "webview", ".ui.tools.WebViewUI", (Intent)localObject3);
          AppMethodBeat.o(37093);
          break;
          label1345: localObject1 = "";
        }
        label1351: localObject1 = "";
      }
      i = 0;
    }
  }

  @TargetApi(17)
  public final void cpk()
  {
    AppMethodBeat.i(37094);
    View localView = this.contentView;
    this.nMG = ((RelativeLayout)localView.findViewById(2131827627));
    this.qZB = ((Button)localView.findViewById(2131827628));
    this.qZC = localView.findViewById(2131827629);
    AppMethodBeat.o(37094);
  }

  @TargetApi(17)
  protected final void cpp()
  {
    AppMethodBeat.i(37091);
    this.clickCount = 0;
    int i = this.ieu;
    int j;
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWU > 0.0F)
    {
      i = (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWU;
      j = (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWS;
      i = (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWT + (i + j);
    }
    this.nMG.setBackgroundColor(this.backgroundColor);
    if (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWs))
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.c("adId", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWs, false, 0, new k.1(this));
    while (true)
    {
      this.qZB.setText(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).title);
      if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWp == 1)
      {
        this.qZB.setTypeface(Typeface.defaultFromStyle(1));
        label166: e(this.qZB);
        this.qZB.setTextSize(0, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).fontSize);
        if ((((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWn == null) || (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWn.length() <= 0));
      }
      try
      {
        j = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWn);
        this.qZB.setTextColor(j);
      }
      catch (Exception localException1)
      {
        try
        {
          while (true)
          {
            while (true)
            {
              this.qZB.setTextAlignment(4);
              if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).height <= 0.0F)
                break label659;
              this.qZB.setLayoutParams(new RelativeLayout.LayoutParams(i - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWS - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWT, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).height));
              if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWt != 1)
                break label711;
              this.qZC.setLayoutParams(new RelativeLayout.LayoutParams(i - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWS - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWT, this.qZC.getLayoutParams().height));
              this.qZC.setVisibility(0);
              this.qZC.setOnLongClickListener(new k.2(this));
              this.qZC.setOnClickListener(new k.3(this));
              AppMethodBeat.o(37091);
              return;
              GradientDrawable localGradientDrawable = new GradientDrawable();
              localGradientDrawable.setShape(0);
              if ((bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWr)) || (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWo <= 0.0F))
                break label729;
              try
              {
                j = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWr);
                localGradientDrawable.setStroke((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWo, j);
                j = 1;
                if (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWq));
              }
              catch (Exception localException3)
              {
                try
                {
                  j = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWq);
                  localGradientDrawable.setColor(j);
                  j = 1;
                  if (j == 0)
                    break;
                  this.qZB.setBackgroundDrawable(localGradientDrawable);
                  break;
                  localException3 = localException3;
                  ab.e("MicroMsg.Sns.AdLandingPageBtnComponent", bo.l(localException3));
                  j = 0;
                }
                catch (Exception localException4)
                {
                  while (true)
                  {
                    ab.e("MicroMsg.Sns.AdLandingPageBtnComponent", bo.l(localException4));
                    j = 0;
                  }
                }
              }
            }
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWp != 2)
              break label166;
            this.qZB.setTypeface(Typeface.defaultFromStyle(2));
            break label166;
            localException1 = localException1;
            ab.e("MicroMsg.Sns.AdLandingPageBtnComponent", "invalid color! %s", new Object[] { ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWn });
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the device has no method btn.setTextAlignment");
            continue;
            label659: this.qZB.setLayoutParams(new RelativeLayout.LayoutParams(i - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWS - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)this.qZo).qWT, this.qZB.getLayoutParams().height));
            continue;
            label711: this.qZC.setVisibility(8);
            AppMethodBeat.o(37091);
            continue;
            label729: j = 0;
          }
        }
      }
    }
  }

  protected void e(Button paramButton)
  {
    AppMethodBeat.i(37092);
    paramButton.setOnClickListener(new k.4(this));
    AppMethodBeat.o(37092);
  }

  protected final int getLayout()
  {
    return 2130970720;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k
 * JD-Core Version:    0.6.2
 */