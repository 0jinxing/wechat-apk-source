package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MMScrollView extends ScrollView
  implements View.OnFocusChangeListener
{
  private MMScrollView.a gKw;

  public MMScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  final void a(ViewGroup paramViewGroup, View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    AppMethodBeat.i(16909);
    int i = paramViewGroup.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = paramViewGroup.getChildAt(j);
      if ((localView instanceof AddrEditView))
        localView.setOnFocusChangeListener(paramOnFocusChangeListener);
      while (true)
      {
        j++;
        break;
        if ((localView instanceof ViewGroup))
          a((ViewGroup)localView, paramOnFocusChangeListener);
      }
    }
    AppMethodBeat.o(16909);
  }

  public void onFocusChange(final View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(16910);
    ab.d("MicroMsg.MMScrollView", "onFocusChange:".concat(String.valueOf(paramBoolean)));
    if (!paramBoolean)
      AppMethodBeat.o(16910);
    while (true)
    {
      return;
      postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(16908);
          MMScrollView.this.scrollTo(0, paramView.getTop() - a.fromDPToPix(MMScrollView.this.getContext(), 10));
          AppMethodBeat.o(16908);
        }
      }
      , 200L);
      AppMethodBeat.o(16910);
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(16911);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(16911);
  }

  public void setOnSizeChangeListener(MMScrollView.a parama)
  {
    if (parama != null)
      this.gKw = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.MMScrollView
 * JD-Core Version:    0.6.2
 */