package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;

public final class c
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private Button grC;
  private View iym;
  private Button jAH;
  private Context mContext;
  private BottomSheetBehavior nA;
  public CustomTimePicker zSs;
  public c.a zSt;
  public android.support.design.widget.c zaW;
  private int zaX;

  public c(Context paramContext)
  {
    AppMethodBeat.i(112838);
    this.mContext = paramContext;
    this.zaW = new android.support.design.widget.c(this.mContext);
    this.iym = View.inflate(this.mContext, 2130970924, null);
    this.zSs = ((CustomTimePicker)this.iym.findViewById(2131828230));
    this.grC = ((Button)this.iym.findViewById(2131823196));
    this.grC.setOnClickListener(new c.1(this));
    this.jAH = ((Button)this.iym.findViewById(2131822819));
    this.jAH.setOnClickListener(new c.2(this));
    this.zaW.setContentView(this.iym);
    this.zaX = aj.fromDPToPix(this.mContext, 288);
    this.nA = BottomSheetBehavior.j((View)this.iym.getParent());
    if (this.nA != null)
    {
      this.nA.K(this.zaX);
      this.nA.nj = false;
    }
    this.zaW.setOnDismissListener(new c.3(this));
    AppMethodBeat.o(112838);
  }

  public final void onGlobalLayout()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.c
 * JD-Core Version:    0.6.2
 */