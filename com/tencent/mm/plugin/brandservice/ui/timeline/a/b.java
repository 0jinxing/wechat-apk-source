package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.ui.b.c;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class b extends e
{
  public View jOR;
  public View jOS;
  public View jOT;
  public MMNeat7extView jOU;
  public TextView jOV;
  public View jOW;
  public ImageView jOX;
  public ImageView jOY;
  public View jOZ;
  public TextView jPa;
  private View.OnClickListener jPb;

  public b(com.tencent.mm.plugin.brandservice.ui.timeline.a parama, Context paramContext)
  {
    AppMethodBeat.i(14239);
    this.jPb = new b.2(this);
    super.b(paramContext, parama);
    AppMethodBeat.o(14239);
  }

  private static void M(View paramView, int paramInt)
  {
    AppMethodBeat.i(14241);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.width = paramInt;
    localLayoutParams.height = paramInt;
    paramView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(14241);
  }

  public final void a(ImageView paramImageView, q paramq, int paramInt, String paramString)
  {
    AppMethodBeat.i(14242);
    ((com.tencent.mm.plugin.brandservice.a.a)g.K(com.tencent.mm.plugin.brandservice.a.a.class)).a(paramImageView, paramq.field_msgId, paramString, paramq.field_content, paramInt);
    paramImageView.setOnClickListener(this.jPb);
    AppMethodBeat.o(14242);
  }

  public final void a(p paramp, q paramq, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(14240);
    if (paramp.type == 5)
    {
      this.jOY.setVisibility(0);
      this.jOY.setImageResource(2130837925);
      this.jOY.setOnClickListener(new b.1(this));
    }
    while (true)
    {
      paramInt = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 28);
      if (paramp.type == 7)
        paramInt = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 32);
      M(this.jOY, paramInt);
      AppMethodBeat.o(14240);
      return;
      if (paramp.type == 6)
      {
        this.jOY.setVisibility(0);
        if (paramBoolean)
          if ((paramq.field_msgId + "_" + paramInt).equals(c.aYR()))
            this.jOY.setImageResource(2130838268);
        while (true)
        {
          a(this.jOY, paramq, paramInt, paramp.fjx);
          break;
          this.jOY.setImageResource(2130838269);
          continue;
          if ((paramq.field_msgId + "_" + paramInt).equals(c.aYR()))
            this.jOY.setImageResource(2131231092);
          else
            this.jOY.setImageResource(2131231095);
        }
      }
      if (paramp.type == 7)
      {
        this.jOY.setVisibility(0);
        Drawable localDrawable = this.jOY.getDrawable();
        if (((localDrawable instanceof AnimationDrawable)) && (((AnimationDrawable)localDrawable).isRunning()))
          ((AnimationDrawable)localDrawable).stop();
        if ((paramq.field_msgId + "_" + paramInt).equals(c.aYR()))
        {
          this.jOY.setImageResource(2130838272);
          if ((this.jOY.getDrawable() instanceof AnimationDrawable))
            ((AnimationDrawable)this.jOY.getDrawable()).start();
        }
        while (true)
        {
          a(this.jOY, paramq, paramInt, paramp.fjx);
          break;
          this.jOY.setImageResource(2130838271);
        }
      }
      this.jOY.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.b
 * JD-Core Version:    0.6.2
 */