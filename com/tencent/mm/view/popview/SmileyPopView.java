package com.tencent.mm.view.popview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.b;
import com.tencent.mm.cb.e;
import com.tencent.mm.emoji.a.f;
import com.tencent.mm.sdk.platformtools.ab;

public class SmileyPopView extends AbstractPopView
{
  private WindowManager.LayoutParams AdS;
  private View AdV;
  private ImageView AdW;
  private int AdX;
  private TextView nml;

  public SmileyPopView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SmileyPopView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SmileyPopView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(63070);
    inflate(paramContext, 2130969345, this);
    this.AdV = findViewById(2131823500);
    this.AdW = ((ImageView)findViewById(2131823501));
    this.nml = ((TextView)findViewById(2131823502));
    this.AdS = new WindowManager.LayoutParams(2, 264, 1);
    this.AdX = getResources().getDimensionPixelOffset(2131428660);
    this.AdS.width = paramContext.getResources().getDimensionPixelSize(2131428659);
    this.AdS.height = paramContext.getResources().getDimensionPixelSize(2131428657);
    this.AdS.gravity = 49;
    AppMethodBeat.o(63070);
  }

  public final void fw(View paramView)
  {
    AppMethodBeat.i(63072);
    paramView.setPressed(false);
    paramView.setSelected(false);
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    int i = getResources().getDisplayMetrics().widthPixels;
    int j = arrayOfInt[0] + paramView.getMeasuredWidth() / 2;
    int k = (this.AdS.width - this.AdX) / 2;
    this.AdS.y = (arrayOfInt[1] - this.AdS.height + paramView.getMeasuredHeight());
    if (j < this.AdS.width / 2)
    {
      this.AdV.setBackgroundResource(2131231231);
      this.AdS.x = (j + k - i / 2);
      AppMethodBeat.o(63072);
    }
    while (true)
    {
      return;
      if (this.AdS.width / 2 + j > i)
      {
        this.AdV.setBackgroundResource(2131231232);
        this.AdS.x = (j - k - i / 2);
        AppMethodBeat.o(63072);
      }
      else
      {
        this.AdV.setBackgroundResource(2131231230);
        this.AdS.x = (j - i / 2);
        AppMethodBeat.o(63072);
      }
    }
  }

  public WindowManager.LayoutParams getWindowLayoutParams()
  {
    return this.AdS;
  }

  public void setSmileyItem(f paramf)
  {
    AppMethodBeat.i(63071);
    String str1 = e.dqK().getText(paramf.position);
    String str2 = b.dqD().anU(str1);
    ab.i("MicroMsg.SmileyPopView", "pop smiley %s, %s, %s", new Object[] { Integer.valueOf(paramf.position), str1, str2 });
    int i = str2.indexOf("[");
    int j = str2.indexOf("]");
    int k = j;
    if (j == -1)
      k = str2.length();
    str1 = str2.substring(i + 1, k);
    this.nml.setText(str1);
    this.AdW.setImageDrawable(e.dqK().qJ(paramf.position));
    AppMethodBeat.o(63071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.popview.SmileyPopView
 * JD-Core Version:    0.6.2
 */