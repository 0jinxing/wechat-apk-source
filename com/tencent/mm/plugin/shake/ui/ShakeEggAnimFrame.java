package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.b;
import com.tencent.mm.cb.c;
import com.tencent.mm.cb.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShakeEggAnimFrame extends FrameLayout
{
  List<View> qul;
  int qum;
  int size;

  public ShakeEggAnimFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(24715);
    this.qul = new ArrayList();
    this.size = 0;
    this.qum = 0;
    AppMethodBeat.o(24715);
  }

  static float Y(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(24717);
    float f = (float)Math.random();
    AppMethodBeat.o(24717);
    return f * (paramFloat2 - paramFloat1) + paramFloat1;
  }

  private int getSize()
  {
    AppMethodBeat.i(24718);
    int i;
    if (this.size == 0)
    {
      i = (int)(new TextView(getContext()).getTextSize() * 1.2D);
      AppMethodBeat.o(24718);
    }
    while (true)
    {
      return i;
      i = this.size;
      AppMethodBeat.o(24718);
    }
  }

  public final void aa(Activity paramActivity)
  {
    AppMethodBeat.i(24716);
    Object localObject1 = this.qul.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (View)((Iterator)localObject1).next();
      ((View)localObject2).clearAnimation();
      removeView((View)localObject2);
    }
    localObject1 = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
    setVisibility(0);
    for (int i = 0; i < 30; i++)
    {
      paramActivity = new ShakeEggAnimFrame.b(this, ((DisplayMetrics)localObject1).widthPixels, ((DisplayMetrics)localObject1).heightPixels);
      g.dqQ();
      localObject2 = b.dqD();
      localObject2 = ((b)localObject2).a((c)((b)localObject2).xFK.get(107), true);
      ((Drawable)localObject2).setBounds(0, 0, getSize(), getSize());
      Object localObject3 = new ImageSpan((Drawable)localObject2, 1);
      localObject2 = new SpannableString("  ");
      ((SpannableString)localObject2).setSpan(localObject3, 0, 1, 33);
      localObject3 = new TextView(getContext());
      ((TextView)localObject3).setSingleLine();
      ((TextView)localObject3).setText((CharSequence)localObject2);
      ((TextView)localObject3).setAnimation(paramActivity);
      ((TextView)localObject3).setTag(paramActivity);
      addView((View)localObject3);
      ((ShakeEggAnimFrame.a)paramActivity).targetView = ((View)localObject3);
      this.qul.add(localObject3);
    }
    AppMethodBeat.o(24716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame
 * JD-Core Version:    0.6.2
 */