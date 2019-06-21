package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MaskLayout extends RelativeLayout
{
  private ImageView moR;
  private View view;
  private Drawable yyQ;

  public MaskLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MaskLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106966);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MaskLayout, paramInt, 0);
    this.yyQ = paramContext.getDrawable(0);
    paramContext.recycle();
    AppMethodBeat.o(106966);
  }

  private void a(MaskLayout.a parama)
  {
    AppMethodBeat.i(106971);
    removeView(this.moR);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    RelativeLayout.LayoutParams localLayoutParams2 = localLayoutParams1;
    switch (MaskLayout.1.yyR[parama.ordinal()])
    {
    default:
      localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
    case 3:
    case 1:
    case 2:
    case 4:
    }
    while (true)
    {
      addView(this.moR, localLayoutParams2);
      AppMethodBeat.o(106971);
      return;
      localLayoutParams1.addRule(12);
      localLayoutParams1.addRule(11);
      localLayoutParams2 = localLayoutParams1;
      continue;
      localLayoutParams1.addRule(12);
      localLayoutParams1.addRule(9);
      localLayoutParams2 = localLayoutParams1;
      continue;
      localLayoutParams1.addRule(11);
      localLayoutParams2 = localLayoutParams1;
    }
  }

  public final void a(Bitmap paramBitmap, MaskLayout.a parama)
  {
    AppMethodBeat.i(106970);
    a(parama);
    this.moR.setImageBitmap(paramBitmap);
    AppMethodBeat.o(106970);
  }

  public View getContentView()
  {
    return this.view;
  }

  public void onFinishInflate()
  {
    AppMethodBeat.i(106967);
    super.onFinishInflate();
    this.view = findViewById(2131821019);
    if (this.view == null)
    {
      ab.d("MicroMsg.MaskLayout", "%s", new Object[] { "not found view by id, new one" });
      this.view = new View(getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(13);
      this.view.setLayoutParams(localLayoutParams);
      addView(this.view);
    }
    this.moR = new ImageView(getContext());
    this.moR.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.moR.setImageDrawable(this.yyQ);
    addView(this.moR);
    AppMethodBeat.o(106967);
  }

  public void setMaskBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(106968);
    a(MaskLayout.a.yyW);
    this.moR.setImageBitmap(paramBitmap);
    AppMethodBeat.o(106968);
  }

  public void setMaskDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(106969);
    a(MaskLayout.a.yyW);
    this.moR.setImageDrawable(paramDrawable);
    AppMethodBeat.o(106969);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MaskLayout
 * JD-Core Version:    0.6.2
 */