package com.tencent.mm.ui.base;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMRadioGroupView$c
  implements ViewGroup.OnHierarchyChangeListener
{
  private ViewGroup.OnHierarchyChangeListener pD;

  private MMRadioGroupView$c(MMRadioGroupView paramMMRadioGroupView)
  {
  }

  public final void onChildViewAdded(View paramView1, View paramView2)
  {
    AppMethodBeat.i(106749);
    if ((paramView1 == this.ywU) && ((paramView2 instanceof MMRadioImageButton)))
    {
      if (paramView2.getId() == -1)
      {
        int i = paramView2.hashCode();
        int j = i;
        if (i < 0)
          j = i & 0x7FFFFFFF;
        paramView2.setId(j);
      }
      ((MMRadioImageButton)paramView2).setOnOtherMMRadioButtonCheckedChangeListener(MMRadioGroupView.b(this.ywU));
    }
    if (this.pD != null)
      this.pD.onChildViewAdded(paramView1, paramView2);
    AppMethodBeat.o(106749);
  }

  public final void onChildViewRemoved(View paramView1, View paramView2)
  {
    AppMethodBeat.i(106750);
    if ((paramView1 == this.ywU) && ((paramView2 instanceof MMRadioImageButton)))
      ((MMRadioImageButton)paramView2).setOnOtherMMRadioButtonCheckedChangeListener(null);
    if (this.pD != null)
      this.pD.onChildViewRemoved(paramView1, paramView2);
    AppMethodBeat.o(106750);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMRadioGroupView.c
 * JD-Core Version:    0.6.2
 */