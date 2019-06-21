package com.tencent.mm.ui;

import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class AddressView$1 extends a
{
  AddressView$1(AddressView paramAddressView)
  {
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    AppMethodBeat.i(29077);
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    CharSequence localCharSequence = this.yem.getContentDescription();
    paramView = localCharSequence;
    if (bo.isNullOrNil((String)localCharSequence))
      paramView = this.yem.nickName;
    paramb.setText(paramView);
    AppMethodBeat.o(29077);
  }

  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(29076);
    super.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    CharSequence localCharSequence = this.yem.getContentDescription();
    paramView = localCharSequence;
    if (bo.isNullOrNil((String)localCharSequence))
      paramView = this.yem.nickName;
    paramAccessibilityEvent.getText().add(paramView);
    AppMethodBeat.o(29076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AddressView.1
 * JD-Core Version:    0.6.2
 */