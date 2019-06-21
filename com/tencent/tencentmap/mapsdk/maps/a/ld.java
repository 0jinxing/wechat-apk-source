package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ld
  implements le
{
  private Context a;
  private TextView b;
  private jk.a c;

  public ld(Context paramContext)
  {
    AppMethodBeat.i(100325);
    this.a = paramContext;
    this.b = new TextView(this.a);
    AppMethodBeat.o(100325);
  }

  private Bitmap b()
  {
    AppMethodBeat.i(100327);
    this.b.setTextSize(18.0F);
    this.b.setTextColor(-16777216);
    this.b.setText("鉴权失败,请检查你的key");
    Bitmap localBitmap = ht.a(this.b);
    AppMethodBeat.o(100327);
    return localBitmap;
  }

  public void a()
  {
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public void a(jk.a parama)
  {
    this.c = parama;
  }

  public boolean a(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(100326);
    boolean bool;
    if ((paramViewGroup == null) || (this.b == null))
    {
      bool = false;
      AppMethodBeat.o(100326);
    }
    while (true)
    {
      return bool;
      Object localObject = new FrameLayout.LayoutParams(-2, -2);
      ((FrameLayout.LayoutParams)localObject).gravity = 17;
      this.b.setLayoutParams((ViewGroup.LayoutParams)localObject);
      int i = paramViewGroup.getMeasuredWidth();
      int j = paramViewGroup.getMeasuredHeight();
      localObject = b();
      paramViewGroup.addView(this.b);
      if (this.c != null)
        this.c.a((Bitmap)localObject, i, j);
      bool = true;
      AppMethodBeat.o(100326);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ld
 * JD-Core Version:    0.6.2
 */