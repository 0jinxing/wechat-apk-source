package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.f;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.vfs.e;

public final class n extends i
{
  public ImageView uVa;
  public MMPinProgressBtn uVb;
  public ImageView uVc;
  private ImageView uVd;

  public n(View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27182);
    this.uVa = ((ImageView)paramView.findViewById(2131820981));
    this.uVb = ((MMPinProgressBtn)paramView.findViewById(2131822136));
    this.uVc = ((ImageView)paramView.findViewById(2131822133));
    this.uVa.setImageResource(2131231923);
    this.uVd = ((ImageView)paramView.findViewById(2131825005));
    this.gCe.setVisibility(8);
    this.uUB.setVisibility(8);
    this.uVd.setVisibility(8);
    this.uUF.setTag(this);
    this.uUF.setOnClickListener(this.nij);
    AppMethodBeat.o(27182);
  }

  public final void a(com.tencent.mm.plugin.wenote.model.a.c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27183);
    com.tencent.mm.plugin.wenote.model.a.k localk = (com.tencent.mm.plugin.wenote.model.a.k)paramc;
    Object localObject1 = com.tencent.mm.plugin.wenote.b.c.ahk(localk.thumbPath);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = localObject1;
      if (e.ct(localk.cHg))
      {
        localObject1 = com.tencent.mm.plugin.fav.ui.c.LY(localk.cHg);
        localObject2 = localObject1;
        if (localObject1 == null);
      }
    }
    while (true)
    {
      try
      {
        if (e.ct(localk.thumbPath))
          e.deleteFile(localk.thumbPath);
        f.a((Bitmap)localObject1, Bitmap.CompressFormat.JPEG, localk.thumbPath, false);
        localObject2 = localObject1;
        if (localObject2 == null)
          break label193;
        localObject1 = this.uVc.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject1).width = -1;
        ((ViewGroup.LayoutParams)localObject1).height = -1;
        this.uVc.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.uVc.setImageBitmap(localObject2);
        this.uVc.setBackground(null);
        if (!paramc.uOa)
          break label269;
        this.uVd.setVisibility(0);
        super.a(paramc, paramInt1, paramInt2);
        AppMethodBeat.o(27183);
        return;
      }
      catch (Exception localException)
      {
        localObject3 = localObject1;
      }
      continue;
      label193: Object localObject3 = this.uVc.getResources().getDisplayMetrics();
      float f = ((DisplayMetrics)localObject3).density;
      localObject1 = this.uVc.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = (((DisplayMetrics)localObject3).widthPixels - (int)(f * 40.0F + 0.5F));
      ((ViewGroup.LayoutParams)localObject1).height = (((ViewGroup.LayoutParams)localObject1).width * 52 / 68);
      this.uVc.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      continue;
      label269: this.uVd.setVisibility(8);
    }
  }

  public final int dfW()
  {
    return 6;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.n
 * JD-Core Version:    0.6.2
 */