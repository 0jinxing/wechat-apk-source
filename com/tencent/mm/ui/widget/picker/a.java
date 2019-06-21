package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;
import java.util.Calendar;
import java.util.Locale;

public final class a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private Button grC;
  private View iym;
  private Button jAH;
  private Context mContext;
  private BottomSheetBehavior nA;
  public CustomDatePicker zSi;
  public a.a zSj;
  private c zaW;
  private int zaX;

  public a(Context paramContext)
  {
    AppMethodBeat.i(112812);
    this.mContext = paramContext;
    this.zaW = new c(this.mContext);
    this.iym = View.inflate(this.mContext, 2130969262, null);
    this.zSi = ((CustomDatePicker)this.iym.findViewById(2131823197));
    this.grC = ((Button)this.iym.findViewById(2131823196));
    this.grC.setOnClickListener(new a.1(this));
    this.jAH = ((Button)this.iym.findViewById(2131822819));
    this.jAH.setOnClickListener(new a.2(this));
    this.zaW.setContentView(this.iym);
    this.zaW.setOnCancelListener(new a.3(this));
    this.zaX = aj.fromDPToPix(this.mContext, 288);
    this.nA = BottomSheetBehavior.j((View)this.iym.getParent());
    if (this.nA != null)
    {
      this.nA.K(this.zaX);
      this.nA.nj = false;
    }
    this.zaW.setOnDismissListener(new a.4(this));
    AppMethodBeat.o(112812);
  }

  public final void aB(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112813);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
      AppMethodBeat.o(112813);
    while (true)
    {
      return;
      if (this.zSi != null)
        this.zSi.aA(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(112813);
    }
  }

  public final void aC(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112815);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
      AppMethodBeat.o(112815);
    while (true)
    {
      return;
      Calendar localCalendar = Calendar.getInstance(Locale.US);
      localCalendar.set(paramInt1, paramInt2 - 1, paramInt3);
      if (this.zSi != null)
        this.zSi.setMinDate(localCalendar.getTimeInMillis());
      AppMethodBeat.o(112815);
    }
  }

  public final void aD(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112816);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
      AppMethodBeat.o(112816);
    while (true)
    {
      return;
      Calendar localCalendar = Calendar.getInstance(Locale.US);
      localCalendar.set(paramInt1, paramInt2 - 1, paramInt3);
      if (this.zSi != null)
        this.zSi.setMaxDate(localCalendar.getTimeInMillis());
      AppMethodBeat.o(112816);
    }
  }

  public final void al(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(112814);
    if (this.zSi != null)
      this.zSi.al(paramBoolean1, paramBoolean2);
    AppMethodBeat.o(112814);
  }

  public final void hide()
  {
    AppMethodBeat.i(112818);
    if (this.zaW != null)
      this.zaW.dismiss();
    AppMethodBeat.o(112818);
  }

  public final void onGlobalLayout()
  {
  }

  public final void show()
  {
    AppMethodBeat.i(112817);
    if (this.zaW != null)
    {
      if (this.zSi != null)
        this.zSi.aRJ();
      this.zaW.show();
    }
    AppMethodBeat.o(112817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.a
 * JD-Core Version:    0.6.2
 */