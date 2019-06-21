package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class SwitchPhoneItemGroupView extends LinearLayout
{
  List<SwitchPhoneItemView> tNt;
  private SwitchPhoneItemGroupView.a tNu;
  private View.OnClickListener tNv;

  public SwitchPhoneItemGroupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(47881);
    this.tNt = new ArrayList();
    this.tNv = new SwitchPhoneItemGroupView.1(this);
    AppMethodBeat.o(47881);
  }

  public SwitchPhoneItemGroupView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47882);
    this.tNt = new ArrayList();
    this.tNv = new SwitchPhoneItemGroupView.1(this);
    AppMethodBeat.o(47882);
  }

  public final void a(SwitchPhoneItemView paramSwitchPhoneItemView, int paramInt)
  {
    AppMethodBeat.i(47883);
    addView(paramSwitchPhoneItemView, paramInt);
    this.tNt.add(paramSwitchPhoneItemView);
    paramSwitchPhoneItemView.setOnClickListener(this.tNv);
    AppMethodBeat.o(47883);
  }

  public void setOnItemSelectListener(SwitchPhoneItemGroupView.a parama)
  {
    this.tNu = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView
 * JD-Core Version:    0.6.2
 */