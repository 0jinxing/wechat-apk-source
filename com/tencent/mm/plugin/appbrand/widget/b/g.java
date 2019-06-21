package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.f;

public final class g extends f
  implements j
{
  private View contentView;
  private DialogInterface.OnCancelListener gAs;
  private boolean gHY;
  private DialogInterface.OnShowListener jbC;
  private DialogInterface.OnDismissListener jbD;
  private boolean jbE;
  private k jbF;

  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(102358);
    this.gHY = true;
    try
    {
      onCreate(null);
      AppMethodBeat.o(102358);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        AppMethodBeat.o(102358);
    }
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(102359);
    if (this.jbC != null)
      this.jbC.onShow(this);
    this.jbF = paramk;
    AppMethodBeat.o(102359);
  }

  public final boolean aKP()
  {
    return this.jbE;
  }

  public final void dismiss()
  {
    AppMethodBeat.i(102364);
    if (this.jbF != null)
    {
      this.jbF.c(this);
      if (this.jbD != null)
        this.jbD.onDismiss(this);
    }
    AppMethodBeat.o(102364);
  }

  public final View getContentView()
  {
    return this.contentView;
  }

  public final int getPosition()
  {
    return 1;
  }

  public final boolean isCancelable()
  {
    return this.gHY;
  }

  public final void onCancel()
  {
    AppMethodBeat.i(102363);
    if (this.gAs != null)
      this.gAs.onCancel(this);
    AppMethodBeat.o(102363);
  }

  public final void pF(int paramInt)
  {
  }

  public final void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(102367);
    super.setCancelable(paramBoolean);
    this.gHY = paramBoolean;
    AppMethodBeat.o(102367);
  }

  public final void setCanceledOnTouchOutside(boolean paramBoolean)
  {
    AppMethodBeat.i(102366);
    super.setCanceledOnTouchOutside(paramBoolean);
    this.jbE = paramBoolean;
    AppMethodBeat.o(102366);
  }

  public final void setContentView(int paramInt)
  {
    AppMethodBeat.i(102360);
    setContentView(LayoutInflater.from(getContext()).inflate(paramInt, null));
    AppMethodBeat.o(102360);
  }

  public final void setContentView(View paramView)
  {
    this.contentView = paramView;
  }

  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(102361);
    if (paramLayoutParams != null)
      paramView.setLayoutParams(paramLayoutParams);
    setContentView(paramView);
    AppMethodBeat.o(102361);
  }

  public final void setOnCancelListener(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(102368);
    super.setOnCancelListener(paramOnCancelListener);
    this.gAs = paramOnCancelListener;
    AppMethodBeat.o(102368);
  }

  public final void setOnDismissListener(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(102365);
    super.setOnDismissListener(paramOnDismissListener);
    this.jbD = paramOnDismissListener;
    AppMethodBeat.o(102365);
  }

  public final void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener)
  {
    AppMethodBeat.i(102362);
    super.setOnShowListener(paramOnShowListener);
    this.jbC = paramOnShowListener;
    AppMethodBeat.o(102362);
  }

  public final void show()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.g
 * JD-Core Version:    0.6.2
 */