package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ZoomControls;
import com.tencent.map.lib.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bi.a;

public class lj
  implements le
{
  private Context a;
  private ZoomControls b;
  private lk c;
  private ViewGroup d;
  private le.b e;
  private bi.a f;
  private iz g;
  private int h;

  public lj(Context paramContext, iz paramiz)
  {
    AppMethodBeat.i(100416);
    this.c = null;
    this.e = le.b.c;
    this.f = null;
    this.h = 0;
    this.a = paramContext;
    this.g = paramiz;
    a(paramContext);
    d();
    AppMethodBeat.o(100416);
  }

  private void a(Context paramContext)
  {
    AppMethodBeat.i(100420);
    this.c = new lk(paramContext);
    this.c.setVisibility(8);
    c();
    try
    {
      ZoomControls localZoomControls = new android/widget/ZoomControls;
      localZoomControls.<init>(paramContext);
      this.b = localZoomControls;
      int i = View.MeasureSpec.makeMeasureSpec(0, 0);
      int j = View.MeasureSpec.makeMeasureSpec(0, 0);
      this.b.measure(i, j);
      this.h = this.b.getMeasuredHeight();
      this.b.setVisibility(8);
      AppMethodBeat.o(100420);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        AppMethodBeat.o(100420);
    }
  }

  private void c()
  {
    AppMethodBeat.i(100421);
    Bitmap localBitmap1 = ic.b(ic.b(this.a, "location_enable.png"));
    Bitmap localBitmap2 = ic.b(ic.b(this.a, "location_state_normal.png"));
    Bitmap localBitmap3 = ic.b(ic.b(this.a, "location_state_selected.png"));
    this.c.setScaleType(ImageView.ScaleType.CENTER);
    this.c.setImageBitmap(localBitmap1);
    this.c.a(this.a, localBitmap2, localBitmap3);
    AppMethodBeat.o(100421);
  }

  private void d()
  {
    AppMethodBeat.i(100422);
    if (this.b != null)
    {
      this.b.setOnZoomInClickListener(new lj.1(this));
      this.b.setOnZoomOutClickListener(new lj.2(this));
    }
    this.c.setOnClickListener(new lj.3(this));
    AppMethodBeat.o(100422);
  }

  private FrameLayout.LayoutParams e()
  {
    AppMethodBeat.i(100427);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    switch (lj.4.a[this.e.ordinal()])
    {
    default:
      d.b("Unknown position:" + this.e);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(100427);
      return localLayoutParams;
      localLayoutParams.gravity = 83;
      localLayoutParams.bottomMargin = 5;
      localLayoutParams.leftMargin = 5;
      continue;
      localLayoutParams.gravity = 81;
      localLayoutParams.bottomMargin = 5;
      continue;
      localLayoutParams.gravity = 85;
      localLayoutParams.bottomMargin = 5;
      localLayoutParams.rightMargin = 5;
      continue;
      localLayoutParams.gravity = 51;
      localLayoutParams.topMargin = 5;
      localLayoutParams.leftMargin = 5;
      continue;
      localLayoutParams.gravity = 49;
      localLayoutParams.topMargin = 5;
      continue;
      localLayoutParams.gravity = 53;
      localLayoutParams.topMargin = 5;
      localLayoutParams.rightMargin = 5;
    }
  }

  public void a()
  {
    AppMethodBeat.i(100417);
    if (this.c != null)
      this.c.a();
    AppMethodBeat.o(100417);
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public void a(bi.a parama)
  {
    this.f = parama;
  }

  public void a(le.b paramb)
  {
    AppMethodBeat.i(100419);
    if (this.e != paramb)
    {
      this.e = paramb;
      a(this.d);
    }
    AppMethodBeat.o(100419);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100424);
    ZoomControls localZoomControls;
    if (this.b != null)
    {
      localZoomControls = this.b;
      if (!paramBoolean)
        break label34;
    }
    label34: for (int i = 0; ; i = 4)
    {
      localZoomControls.setVisibility(i);
      AppMethodBeat.o(100424);
      return;
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(100423);
    if (this.b != null)
    {
      this.b.setIsZoomInEnabled(paramBoolean1);
      this.b.setIsZoomOutEnabled(paramBoolean2);
    }
    AppMethodBeat.o(100423);
  }

  public boolean a(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(100418);
    boolean bool;
    if ((paramViewGroup == null) || (this.b == null) || (this.c == null))
    {
      bool = false;
      AppMethodBeat.o(100418);
      return bool;
    }
    this.d = paramViewGroup;
    FrameLayout.LayoutParams localLayoutParams = e();
    if (paramViewGroup.indexOfChild(this.b) < 0)
    {
      paramViewGroup.addView(this.b, localLayoutParams);
      label62: localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 85;
      localLayoutParams.bottomMargin = (this.h + 5);
      localLayoutParams.rightMargin = 5;
      if (paramViewGroup.indexOfChild(this.c) >= 0)
        break label137;
      paramViewGroup.addView(this.c, localLayoutParams);
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(100418);
      break;
      paramViewGroup.updateViewLayout(this.b, localLayoutParams);
      break label62;
      label137: paramViewGroup.updateViewLayout(this.c, localLayoutParams);
    }
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(100426);
    lk locallk = this.c;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      locallk.setVisibility(i);
      AppMethodBeat.o(100426);
      return;
    }
  }

  public boolean b()
  {
    boolean bool = false;
    AppMethodBeat.i(100425);
    if (this.b == null)
      AppMethodBeat.o(100425);
    while (true)
    {
      return bool;
      if (this.b.getVisibility() == 0)
      {
        bool = true;
        AppMethodBeat.o(100425);
      }
      else
      {
        AppMethodBeat.o(100425);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lj
 * JD-Core Version:    0.6.2
 */