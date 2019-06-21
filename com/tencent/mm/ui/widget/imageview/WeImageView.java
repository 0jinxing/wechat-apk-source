package com.tencent.mm.ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;

public class WeImageView extends AppCompatImageView
{
  private int yDb;
  private boolean zQS;

  public WeImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112705);
    this.zQS = true;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(112705);
  }

  public WeImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112706);
    this.zQS = true;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(112706);
  }

  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(112708);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.WeImageView);
    this.yDb = paramContext.getColor(0, 0);
    paramContext.recycle();
    AppMethodBeat.o(112708);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112709);
    super.onDraw(paramCanvas);
    if ((getDrawable() != null) && (this.zQS))
    {
      paramCanvas = new PorterDuffColorFilter(this.yDb, PorterDuff.Mode.SRC_ATOP);
      getDrawable().setColorFilter(paramCanvas);
      this.zQS = false;
    }
    AppMethodBeat.o(112709);
  }

  public void setIconColor(int paramInt)
  {
    AppMethodBeat.i(112707);
    this.yDb = paramInt;
    this.zQS = true;
    invalidate();
    AppMethodBeat.o(112707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.imageview.WeImageView
 * JD-Core Version:    0.6.2
 */