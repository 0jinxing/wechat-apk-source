package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class m extends j
  implements Serializable
{
  private View qZG;
  private Button qZH;
  private SnsTextProgressBar qZI;
  m.a qZJ;
  private al qZK;
  private m.b qZL;
  private View.OnClickListener qZM;
  AdLandingPagesProxy.e qZN;

  public m(Context paramContext, b paramb, ViewGroup paramViewGroup)
  {
    super(paramContext, paramb, paramViewGroup);
    AppMethodBeat.i(37144);
    this.qZM = new m.1(this);
    this.qZN = new m.2(this);
    this.qZK = new al("apkStateMachine");
    this.qZJ = new m.a(this, "apkStateMachine", this.qZK.oAl.getLooper());
    AppMethodBeat.o(37144);
  }

  private static String gi(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37151);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(37151);
      paramString1 = paramString2;
    }
    while (true)
    {
      return paramString1;
      if (paramString1.matches("#[0-9A-Fa-f]{6}([0-9A-Fa-f]{2})?"))
      {
        AppMethodBeat.o(37151);
      }
      else
      {
        AppMethodBeat.o(37151);
        paramString1 = paramString2;
      }
    }
  }

  public final void coZ()
  {
    AppMethodBeat.i(37148);
    super.coZ();
    ab.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "view destroy");
    this.qZK.oAl.quit();
    if (this.qZL != null)
    {
      this.context.unregisterReceiver(this.qZL);
      this.qZL = null;
    }
    AppMethodBeat.o(37148);
  }

  public final boolean cpK()
  {
    AppMethodBeat.i(37149);
    boolean bool;
    if ((this.context == null) || (TextUtils.isEmpty(((b)this.qZo).csB)) || (TextUtils.isEmpty(((b)this.qZo).Iw)))
    {
      AppMethodBeat.o(37149);
      bool = false;
      return bool;
    }
    Intent localIntent;
    Object localObject;
    if (!TextUtils.isEmpty(((b)this.qZo).qVZ))
    {
      localIntent = new Intent("android.intent.action.VIEW", Uri.parse(((b)this.qZo).qVZ));
      localIntent.addFlags(268435456);
      localObject = bo.H(this.context, localIntent);
      if ((localObject != null) && (!((List)localObject).isEmpty()))
      {
        if ((!TextUtils.isEmpty(localIntent.getPackage())) || (((List)localObject).size() != 1))
          break label209;
        localObject = g.b((ResolveInfo)((List)localObject).get(0));
        label155: if (!bo.nullAsNil(ah.getPackageName()).equals(localObject))
          a.post(new m.3(this, localIntent));
      }
    }
    while (true)
    {
      AdLandingPagesProxy.getInstance().reportDownloadInfo(9, ((b)this.qZo).csB);
      AppMethodBeat.o(37149);
      bool = true;
      break;
      label209: localObject = localIntent.getPackage();
      break label155;
      a.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(37105);
          Intent localIntent = m.this.context.getPackageManager().getLaunchIntentForPackage(m.b(m.this).Iw);
          g.a(m.this.context, localIntent, g.t(m.this.context, m.b(m.this).csB), new m.4.1(this));
          AppMethodBeat.o(37105);
        }
      });
    }
  }

  public final void cpL()
  {
    AppMethodBeat.i(37150);
    ab.d("MicroMsg.AdLandingPageDownloadApkBtnComp", "writing deferred deep link");
    AdLandingPagesProxy.getInstance().writeDeferredDeepLink(((b)this.qZo).Iw, ((b)this.qZo).qVZ);
    AppMethodBeat.o(37150);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37147);
    super.cpa();
    this.qZJ.sendMessage(2);
    AdLandingPagesProxy.getInstance().addReportInfo(((b)this.qZo).csB, cpC().qTL, cpC().hcx);
    AppMethodBeat.o(37147);
  }

  @TargetApi(17)
  public final void cpk()
  {
    AppMethodBeat.i(37146);
    this.clickCount = 0;
    View localView = this.contentView;
    this.qZG = localView.findViewById(2131827615);
    this.qZH = ((Button)localView.findViewById(2131822658));
    this.qZH.setOnClickListener(this.qZM);
    this.qZI = ((SnsTextProgressBar)localView.findViewById(2131827616));
    this.qZI.setProgress(0);
    this.qZI.setVisibility(8);
    this.qZI.setOnClickListener(this.qZM);
    this.qZJ.start();
    AppMethodBeat.o(37146);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37145);
    Object localObject1 = new HashMap();
    ((Map)localObject1).put("fontNormalColor", gi(((b)this.qZo).qVW, "#FFFFFF"));
    ((Map)localObject1).put("fontDisableColor", gi(((b)this.qZo).qVX, "#4CFFFFFF"));
    ((Map)localObject1).put("fontPressedColor", gi(((b)this.qZo).qVY, "#99FFFFFF"));
    ((Map)localObject1).put("NormalColor", gi(((b)this.qZo).qVQ, "#1AAD19"));
    ((Map)localObject1).put("PressedColor", gi(((b)this.qZo).qVS, "#179B16"));
    ((Map)localObject1).put("DisableColor", gi(((b)this.qZo).qVR, "#661AAD19"));
    ((Map)localObject1).put("borderNormalColor", gi(((b)this.qZo).qVT, "#179E16"));
    ((Map)localObject1).put("borderPressedColor", gi(((b)this.qZo).qVV, "#158E14"));
    ((Map)localObject1).put("borderDisableColor", gi(((b)this.qZo).qVU, "#00179E16"));
    int i = Color.parseColor((String)((Map)localObject1).get("fontNormalColor"));
    int j = Color.parseColor((String)((Map)localObject1).get("fontDisableColor"));
    int k = Color.parseColor((String)((Map)localObject1).get("fontPressedColor"));
    int m = Color.parseColor((String)((Map)localObject1).get("NormalColor"));
    int n = Color.parseColor((String)((Map)localObject1).get("PressedColor"));
    int i1 = Color.parseColor((String)((Map)localObject1).get("DisableColor"));
    int i2 = (int)((b)this.qZo).qWo;
    int i3 = Color.parseColor((String)((Map)localObject1).get("borderNormalColor"));
    int i4 = Color.parseColor((String)((Map)localObject1).get("borderPressedColor"));
    int i5 = Color.parseColor((String)((Map)localObject1).get("borderDisableColor"));
    int i6 = this.context.getResources().getDimensionPixelSize(2131427518);
    GradientDrawable localGradientDrawable1 = new GradientDrawable();
    localGradientDrawable1.setShape(0);
    localGradientDrawable1.setCornerRadius(i6);
    localGradientDrawable1.setColor(i1);
    localGradientDrawable1.setStroke(i2, i5);
    Object localObject2 = new GradientDrawable();
    ((GradientDrawable)localObject2).setShape(0);
    ((GradientDrawable)localObject2).setCornerRadius(i6);
    ((GradientDrawable)localObject2).setColor(n);
    ((GradientDrawable)localObject2).setStroke(i2, i4);
    GradientDrawable localGradientDrawable2 = new GradientDrawable();
    localGradientDrawable2.setShape(0);
    localGradientDrawable2.setCornerRadius(i6);
    localGradientDrawable2.setColor(m);
    localGradientDrawable2.setStroke(i2, i3);
    localObject1 = new StateListDrawable();
    ((StateListDrawable)localObject1).addState(new int[] { -16842910 }, localGradientDrawable1);
    ((StateListDrawable)localObject1).addState(new int[] { 16842919 }, (Drawable)localObject2);
    ((StateListDrawable)localObject1).addState(new int[] { 16842910 }, localGradientDrawable2);
    this.qZH.setBackground((Drawable)localObject1);
    localObject1 = new int[] { -16842910 };
    localObject2 = new int[] { 16842919 };
    this.qZH.setTextColor(new ColorStateList(new int[][] { localObject1, localObject2, { 16842910 } }, new int[] { j, k, i }));
    localObject1 = new GradientDrawable();
    ((GradientDrawable)localObject1).setShape(0);
    ((GradientDrawable)localObject1).setCornerRadius(i6);
    ((GradientDrawable)localObject1).setColor(n);
    ((GradientDrawable)localObject1).setStroke(i2, i4);
    localObject2 = new GradientDrawable();
    ((GradientDrawable)localObject2).setShape(0);
    ((GradientDrawable)localObject2).setCornerRadius(i6);
    ((GradientDrawable)localObject2).setColor(m);
    localObject2 = new ClipDrawable((Drawable)localObject2, 3, 1);
    localGradientDrawable2 = new GradientDrawable();
    localGradientDrawable2.setShape(0);
    localGradientDrawable2.setCornerRadius(i6);
    localGradientDrawable2.setColor(m);
    localObject1 = new LayerDrawable(new Drawable[] { localObject1, localObject2, new ClipDrawable(localGradientDrawable2, 3, 1) });
    ((LayerDrawable)localObject1).setId(0, 16908288);
    ((LayerDrawable)localObject1).setId(1, 16908303);
    ((LayerDrawable)localObject1).setId(2, 16908301);
    this.qZI.setProgressDrawable((Drawable)localObject1);
    this.qZI.setPaintColor(((b)this.qZo).qVY);
    if (((b)this.qZo).height > 0.0F)
    {
      localObject1 = (RelativeLayout.LayoutParams)this.qZG.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).height = ((int)((b)this.qZo).height);
      this.qZG.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    this.qZH.setText(((b)this.qZo).title);
    this.qZJ.sendMessage(11);
    AppMethodBeat.o(37145);
  }

  protected final int getLayout()
  {
    return 2130970714;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m
 * JD-Core Version:    0.6.2
 */