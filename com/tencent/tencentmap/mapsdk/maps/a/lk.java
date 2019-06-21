package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class lk extends ImageView
{
  public lk(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(100428);
    setClickable(true);
    AppMethodBeat.o(100428);
  }

  public void a()
  {
    AppMethodBeat.i(100430);
    setClickable(false);
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
      localDrawable.setCallback(null);
    setBackgroundDrawable(null);
    AppMethodBeat.o(100430);
  }

  public void a(Context paramContext, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    AppMethodBeat.i(100429);
    StateListDrawable localStateListDrawable = new StateListDrawable();
    paramBitmap1 = new BitmapDrawable(paramContext.getResources(), paramBitmap1);
    paramContext = new BitmapDrawable(paramContext.getResources(), paramBitmap2);
    localStateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, paramContext);
    localStateListDrawable.addState(View.ENABLED_STATE_SET, paramBitmap1);
    setBackgroundDrawable(localStateListDrawable);
    AppMethodBeat.o(100429);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lk
 * JD-Core Version:    0.6.2
 */