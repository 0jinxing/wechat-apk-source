package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.widget.input.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;

final class d$3
  implements Runnable
{
  d$3(d paramd, q paramq, boolean paramBoolean1, u paramu, int paramInt1, int paramInt2, boolean paramBoolean2, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74798);
    if (this.hVh.hVf != null)
    {
      d.cn(this.hVh.hVf);
      this.hVh.hVf = null;
    }
    if (this.hVh.gGo != null)
      this.hVh.gGo.stopTimer();
    if (!this.hsD.isRunning())
    {
      ab.w("MicroMsg.JsApiShowToast", "service is not running");
      AppMethodBeat.o(74798);
      return;
    }
    if (this.hVi);
    Object localObject1;
    for (this.hVh.hVf = LayoutInflater.from(this.hwF.mContext).inflate(2130968734, null); ; this.hVh.hVf = LayoutInflater.from(this.hwF.mContext).inflate(2130968735, null))
    {
      localObject1 = this.hwF.aBk();
      if (localObject1 != null)
        break label167;
      ab.e("MicroMsg.JsApiShowToast", "the page may be destroy");
      this.hVh.hVf = null;
      AppMethodBeat.o(74798);
      break;
    }
    label167: d.a(this.hVh, (FrameLayout)localObject1);
    v.Zp().y(this.hsD.hashCode() + "toast_name", true).j("toast_view", this.hVh.hVf);
    if (this.hVk)
    {
      localObject2 = new ViewGroup.LayoutParams(-1, -1);
      this.hVh.hVf.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((LinearLayout)this.hVh.hVf.findViewById(2131821368)).setBackgroundColor(0);
      this.hVh.hVf.setOnTouchListener(new d.3.2(this));
    }
    Object localObject2 = (TextView)this.hVh.hVf.findViewById(2131820678);
    int i = a.fromDPToPix(((TextView)localObject2).getContext(), 18);
    label391: ImageView localImageView;
    if (!bo.isNullOrNil(this.chV))
    {
      ((TextView)localObject2).setLineSpacing(0.0F, 1.0F);
      ((TextView)localObject2).setSpannableFactory(new d.3.3(this, i));
      ((TextView)localObject2).setText(this.chV, TextView.BufferType.SPANNABLE);
      ((TextView)localObject2).setVisibility(0);
      if (!this.hVi)
        this.hVh.hVf.findViewById(2131821369).setPadding(0, a.fromDPToPix(((TextView)localObject2).getContext(), 27), 0, 0);
      if (!this.hVi)
      {
        localImageView = (ImageView)this.hVh.hVf.findViewById(2131821371);
        localObject2 = (ProgressBar)this.hVh.hVf.findViewById(2131821370);
        if (!this.hVl.equals("loading"))
          break label601;
        localImageView.setVisibility(8);
        ((ProgressBar)localObject2).setVisibility(0);
      }
    }
    label704: label707: 
    while (true)
    {
      ((FrameLayout)localObject1).addView(this.hVh.hVf);
      localObject1 = n.cG(this.hwF.aBk());
      if (localObject1 != null)
      {
        localObject2 = this.hVh.hVg;
        if ((localObject2 != null) && (!((n)localObject1).jeO.contains(localObject2)))
          ((n)localObject1).jeO.add(localObject2);
      }
      this.hVh.gGo = new ap(new d.3.1(this), false);
      localObject2 = this.hVh.gGo;
      long l = this.hVj;
      ((ap)localObject2).ae(l, l);
      this.hsD.M(this.eIl, this.hVh.j("ok", null));
      AppMethodBeat.o(74798);
      break;
      ((TextView)localObject2).setVisibility(4);
      break label391;
      label601: localImageView.setVisibility(0);
      ((ProgressBar)localObject2).setVisibility(8);
      if (!bo.isNullOrNil(this.hVm))
      {
        localObject2 = s.j(this.hsD.getRuntime(), this.hVm);
        if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled()))
          break label704;
        localObject2 = new BitmapDrawable(localImageView.getResources(), (Bitmap)localObject2);
      }
      while (true)
      {
        if (localObject2 == null)
          break label707;
        localImageView.setImageDrawable((Drawable)localObject2);
        localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        break;
        localObject2 = this.hsD.getContext().getResources().getDrawable(2130837771);
        continue;
        localObject2 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.d.3
 * JD-Core Version:    0.6.2
 */