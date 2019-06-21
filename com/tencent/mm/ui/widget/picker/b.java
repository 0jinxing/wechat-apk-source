package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private Button grC;
  private View iym;
  private Button jAH;
  private Context mContext;
  private BottomSheetBehavior nA;
  private String[] zSl;
  private ArrayList<List<String>> zSm;
  private int zSn;
  private OptionPicker zSo;
  private OptionPicker zSp;
  public a zSq;
  private c zaW;
  private int zaX;

  public b(Context paramContext, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(112825);
    this.zSm = null;
    this.mContext = paramContext;
    if (paramArrayList != null)
      this.zSl = ((String[])paramArrayList.toArray(new String[paramArrayList.size()]));
    initView();
    AppMethodBeat.o(112825);
  }

  public b(Context paramContext, String[] paramArrayOfString)
  {
    AppMethodBeat.i(112824);
    this.zSm = null;
    this.mContext = paramContext;
    this.zSl = paramArrayOfString;
    initView();
    AppMethodBeat.o(112824);
  }

  private String[] Qr(int paramInt)
  {
    AppMethodBeat.i(112832);
    Object localObject;
    if (this.zSm != null)
    {
      localObject = (ArrayList)this.zSm.get(paramInt);
      if (localObject != null)
      {
        localObject = (String[])((ArrayList)localObject).toArray(new String[((ArrayList)localObject).size()]);
        AppMethodBeat.o(112832);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(112832);
    }
  }

  private void initView()
  {
    AppMethodBeat.i(112826);
    this.zaW = new c(this.mContext);
    this.iym = View.inflate(this.mContext, 2130970339, null);
    this.zSo = ((OptionPicker)this.iym.findViewById(2131826450));
    this.zSo.setOptionsArray(this.zSl);
    this.zSp = ((OptionPicker)this.iym.findViewById(2131826451));
    if (this.zSm != null)
    {
      this.zSp.setVisibility(0);
      this.zSp.setOptionsArray(Qr(this.zSo.getValue()));
      this.zSo.setOnValueChangedListener(new b.1(this));
    }
    while (true)
    {
      this.zSn = aj.fromDPToPix(this.mContext, 288);
      this.grC = ((Button)this.iym.findViewById(2131823196));
      this.grC.setOnClickListener(new b.2(this));
      this.jAH = ((Button)this.iym.findViewById(2131822819));
      this.jAH.setOnClickListener(new b.3(this));
      this.zaW.setContentView(this.iym);
      this.zaX = aj.fromDPToPix(this.mContext, 350);
      this.nA = BottomSheetBehavior.j((View)this.iym.getParent());
      if (this.nA != null)
      {
        this.nA.K(this.zaX);
        this.nA.nj = false;
      }
      this.zaW.setOnDismissListener(new b.4(this));
      AppMethodBeat.o(112826);
      return;
      this.zSp.setVisibility(8);
    }
  }

  public final void Qp(int paramInt)
  {
    AppMethodBeat.i(112827);
    if (paramInt != 0)
      this.zSn = paramInt;
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.iym.getLayoutParams();
    localLayoutParams.height = this.zSn;
    this.iym.setLayoutParams(localLayoutParams);
    this.iym.invalidate();
    AppMethodBeat.o(112827);
  }

  public final void Qq(int paramInt)
  {
    AppMethodBeat.i(112831);
    if (this.zSo != null)
      this.zSo.setValue(paramInt);
    AppMethodBeat.o(112831);
  }

  public final int dLl()
  {
    AppMethodBeat.i(112830);
    int i = 0;
    if (this.zSo != null)
      i = this.zSo.getValue();
    AppMethodBeat.o(112830);
    return i;
  }

  public final void hide()
  {
    AppMethodBeat.i(112829);
    if (this.zaW != null)
      this.zaW.dismiss();
    AppMethodBeat.o(112829);
  }

  public final void onGlobalLayout()
  {
  }

  public final void show()
  {
    AppMethodBeat.i(112828);
    if (this.zaW != null)
      this.zaW.show();
    AppMethodBeat.o(112828);
  }

  public static abstract interface a<T>
  {
    public abstract void d(boolean paramBoolean, T paramT);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.b
 * JD-Core Version:    0.6.2
 */