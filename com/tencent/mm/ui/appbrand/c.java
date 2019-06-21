package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.o;

public final class c
  implements b.i
{
  private Bitmap bitmap;
  private ImageView cDh;
  private ProgressBar cDj;
  private View contentView;
  private Context context;
  private View jWH;
  private View nOh;
  private TextView rwe;
  private TextView rwf;
  o vot;
  public boolean vou;
  private long yro;
  private ImageView yrp;
  private String yrq;
  private boolean yrr;
  private boolean yrs;
  public c.a yrt;
  ak yru;

  public c(Context paramContext, View paramView1, View paramView2, boolean paramBoolean)
  {
    AppMethodBeat.i(29967);
    this.yro = 10000L;
    this.contentView = null;
    this.rwe = null;
    this.rwf = null;
    this.cDh = null;
    this.yrp = null;
    this.cDj = null;
    this.yrq = null;
    this.bitmap = null;
    this.vou = true;
    this.yrr = false;
    this.yrs = false;
    this.yru = null;
    this.context = paramContext;
    this.jWH = paramView1;
    this.nOh = paramView2;
    this.yrs = paramBoolean;
    this.contentView = View.inflate(this.context, 2130969020, null);
    this.rwe = ((TextView)this.contentView.findViewById(2131822428));
    this.rwf = ((TextView)this.contentView.findViewById(2131822429));
    this.cDh = ((ImageView)this.contentView.findViewById(2131822184));
    this.yrp = ((ImageView)this.contentView.findViewById(2131822427));
    this.cDj = ((ProgressBar)this.contentView.findViewById(2131822426));
    this.vot = new o(this.contentView, -2, -2, true);
    this.vot.setBackgroundDrawable(new ColorDrawable(0));
    this.vot.setOutsideTouchable(true);
    this.vot.setFocusable(false);
    this.contentView.setOnClickListener(new c.1(this));
    this.yru = new c.2(this, this.context.getMainLooper());
    AppMethodBeat.o(29967);
  }

  public final void abU()
  {
    AppMethodBeat.i(29963);
    ab.d("MicroMsg.AppBrandServiceImageBubble", "beforeLoadBitmap");
    this.cDj.setVisibility(0);
    this.cDh.setVisibility(8);
    this.yrp.setVisibility(8);
    AppMethodBeat.o(29963);
  }

  public final void mr()
  {
    AppMethodBeat.i(29965);
    ab.i("MicroMsg.AppBrandServiceImageBubble", "onLoadFailed");
    this.yrp.setVisibility(0);
    this.cDj.setVisibility(8);
    this.cDh.setVisibility(8);
    AppMethodBeat.o(29965);
  }

  public final String wP()
  {
    AppMethodBeat.i(29966);
    String str = n.bE(this);
    AppMethodBeat.o(29966);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(29964);
    ab.d("MicroMsg.AppBrandServiceImageBubble", "onBitmapLoaded");
    if (paramBitmap == null)
    {
      ab.w("MicroMsg.AppBrandServiceImageBubble", "bitmap is null");
      AppMethodBeat.o(29964);
    }
    while (true)
    {
      return;
      this.bitmap = paramBitmap;
      this.cDj.setVisibility(8);
      if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      {
        this.cDh.setVisibility(0);
        this.cDh.setImageBitmap(paramBitmap);
        this.yrp.setVisibility(8);
        AppMethodBeat.o(29964);
      }
      else
      {
        this.yrp.setVisibility(0);
        this.cDh.setVisibility(8);
        AppMethodBeat.o(29964);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.c
 * JD-Core Version:    0.6.2
 */