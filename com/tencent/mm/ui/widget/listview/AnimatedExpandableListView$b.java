package com.tencent.mm.ui.widget.listview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class AnimatedExpandableListView$b extends View
{
  private int dividerHeight;
  private Drawable gAf;
  List<View> zRa;
  private int zRb;

  private AnimatedExpandableListView$b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(112712);
    this.zRa = new ArrayList();
    AppMethodBeat.o(112712);
  }

  public final void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112715);
    paramCanvas.save();
    if (this.gAf != null)
      this.gAf.setBounds(0, 0, this.zRb, this.dividerHeight);
    int i = this.zRa.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)this.zRa.get(j);
      localView.draw(paramCanvas);
      paramCanvas.translate(0.0F, localView.getMeasuredHeight());
      if (this.gAf != null)
      {
        this.gAf.draw(paramCanvas);
        paramCanvas.translate(0.0F, this.dividerHeight);
      }
    }
    paramCanvas.restore();
    AppMethodBeat.o(112715);
  }

  public final void fp(View paramView)
  {
    AppMethodBeat.i(112713);
    paramView.layout(0, 0, getWidth(), getHeight());
    this.zRa.add(paramView);
    AppMethodBeat.o(112713);
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112714);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = this.zRa.size();
    for (int j = 0; j < i; j++)
      ((View)this.zRa.get(j)).layout(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(112714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.AnimatedExpandableListView.b
 * JD-Core Version:    0.6.2
 */