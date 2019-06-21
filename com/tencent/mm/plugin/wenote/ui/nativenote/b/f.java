package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class f extends i
{
  private int fgJ;
  private ImageView uUu;

  public f(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27159);
    this.fgJ = 0;
    this.cAw.setVisibility(0);
    this.gCe.setVisibility(8);
    this.uUB.setVisibility(8);
    this.cAw.setTag(this);
    this.cAw.setOnClickListener(this.nij);
    this.uUu = ((ImageView)paramView.findViewById(2131826063));
    this.uUu.setVisibility(8);
    this.fgJ = (k.mScreenWidth - (int)k.aU(20.0F));
    AppMethodBeat.o(27159);
  }

  public final void a(com.tencent.mm.plugin.wenote.model.a.c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27160);
    Object localObject1 = ((com.tencent.mm.plugin.wenote.model.a.f)paramc).cHg;
    Object localObject2 = ((com.tencent.mm.plugin.wenote.model.a.f)paramc).uOq;
    if (!e.ct((String)localObject1))
      if (e.ct((String)localObject2))
        localObject1 = localObject2;
    while (true)
    {
      if (this.uSJ.uQI == 3)
        if (e.ct((String)localObject2))
          localObject1 = localObject2;
      while (true)
      {
        label67: if (bo.isNullOrNil((String)localObject1))
        {
          localObject1 = null;
          label78: this.cAw.setImageBitmap(null);
          localObject2 = this.cAw.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject2).width = -1;
          ((ViewGroup.LayoutParams)localObject2).height = -1;
          this.cAw.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          if (localObject1 == null)
            break label178;
          this.cAw.setImageBitmap((Bitmap)localObject1);
          if (!paramc.uOa)
            break label237;
          this.uUu.setVisibility(0);
        }
        while (true)
        {
          label130: super.a(paramc, paramInt1, paramInt2);
          AppMethodBeat.o(27160);
          return;
          localObject1 = null;
          break;
          break label67;
          localObject1 = com.tencent.mm.plugin.wenote.b.c.ahk((String)localObject1);
          break label78;
          label178: this.cAw.setImageBitmap(null);
          localObject1 = this.cAw.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject1).width = this.fgJ;
          ((ViewGroup.LayoutParams)localObject1).height = this.fgJ;
          this.cAw.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          this.cAw.setBackgroundColor(Color.parseColor("#f6f6f6"));
          break label130;
          label237: this.uUu.setVisibility(8);
        }
      }
    }
  }

  public final int dfW()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.f
 * JD-Core Version:    0.6.2
 */