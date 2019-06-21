package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public class LargeTouchableAreasItemView extends LinearLayout
{
  private static final int ejr;
  private final ArrayList<LargeTouchableAreasItemView.b> ejs;
  private d ejt;
  private LargeTouchableAreasItemView.a eju;
  private int ejv;
  private boolean ejw;
  private int ejx;
  private int ejy;
  private ImageButton ejz;
  private final Paint mPaint;

  static
  {
    AppMethodBeat.i(104110);
    ejr = Color.argb(0, 0, 0, 0);
    AppMethodBeat.o(104110);
  }

  public LargeTouchableAreasItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(104105);
    this.ejs = new ArrayList();
    this.mPaint = new Paint();
    this.ejx = -1;
    this.ejy = -1;
    setOrientation(0);
    setDescendantFocusability(393216);
    this.ejt = new d(this);
    this.mPaint.setStyle(Paint.Style.FILL);
    this.ejv = ((int)(paramContext.getResources().getDisplayMetrics().density * 66.0F + 0.5F));
    LayoutInflater.from(paramContext).inflate(2130969129, this);
    AppMethodBeat.o(104105);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(104108);
    Iterator localIterator = this.ejs.iterator();
    while (localIterator.hasNext())
    {
      LargeTouchableAreasItemView.b localb = (LargeTouchableAreasItemView.b)localIterator.next();
      this.mPaint.setColor(localb.color);
      paramCanvas.drawRect(localb.rect, this.mPaint);
    }
    super.dispatchDraw(paramCanvas);
    AppMethodBeat.o(104108);
  }

  public boolean getSelected()
  {
    return this.ejw;
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(104106);
    super.onFinishInflate();
    this.ejz = ((ImageButton)findViewById(2131822735));
    this.ejz.setOnClickListener(new LargeTouchableAreasItemView.1(this));
    AppMethodBeat.o(104106);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(104107);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if ((paramInt1 != this.ejx) || (paramInt2 != this.ejy))
    {
      this.ejx = paramInt1;
      this.ejy = paramInt2;
      Object localObject1 = this.ejt;
      if (((d)localObject1).eod != null)
        ((d)localObject1).eod.clear();
      ((d)localObject1).eoe = null;
      localObject1 = new Rect(paramInt1 - this.ejz.getWidth() - this.ejv, 0, paramInt1, paramInt2);
      paramInt1 = ejr;
      Object localObject2 = this.ejz;
      d locald = this.ejt;
      localObject2 = new TouchDelegate((Rect)localObject1, (View)localObject2);
      if (locald.eod == null)
        locald.eod = new ArrayList();
      locald.eod.add(localObject2);
      this.ejs.add(new LargeTouchableAreasItemView.b((Rect)localObject1, paramInt1));
      setTouchDelegate(this.ejt);
    }
    AppMethodBeat.o(104107);
  }

  public void setItemViewSelected(boolean paramBoolean)
  {
    AppMethodBeat.i(104109);
    ImageButton localImageButton;
    if (this.ejw != paramBoolean)
    {
      this.ejw = paramBoolean;
      localImageButton = this.ejz;
      if (!this.ejw)
        break label44;
    }
    label44: for (int i = 2131231117; ; i = 2131231120)
    {
      localImageButton.setImageResource(i);
      AppMethodBeat.o(104109);
      return;
    }
  }

  public void setOnLargeTouchableAreasListener(LargeTouchableAreasItemView.a parama)
  {
    this.eju = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView
 * JD-Core Version:    0.6.2
 */