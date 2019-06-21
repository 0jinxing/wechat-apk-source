package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

public class b extends c
  implements j
{
  private View contentView;
  private DialogInterface.OnCancelListener gAs;
  private boolean gHY;
  private DialogInterface.OnShowListener jbC;
  private DialogInterface.OnDismissListener jbD;
  private boolean jbE;
  private k jbF;
  private boolean jbG;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(87509);
    this.gHY = true;
    this.jbG = false;
    setContentView(super.getContentView());
    setCanceledOnTouchOutside(false);
    AppMethodBeat.o(87509);
  }

  public b(Context paramContext, byte paramByte)
  {
    super(paramContext);
    this.gHY = true;
    this.jbG = false;
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(87510);
    if (this.jbC != null)
      this.jbC.onShow(this);
    this.jbF = paramk;
    AppMethodBeat.o(87510);
  }

  public final boolean aKP()
  {
    return this.jbE;
  }

  public void dismiss()
  {
    AppMethodBeat.i(87517);
    if (this.jbG)
      AppMethodBeat.o(87517);
    while (true)
    {
      return;
      this.jbG = true;
      if (this.jbF != null)
      {
        this.jbF.c(this);
        if (this.jbD != null)
          this.jbD.onDismiss(this);
      }
      AppMethodBeat.o(87517);
    }
  }

  public final View getContentView()
  {
    AppMethodBeat.i(87511);
    View localView;
    if (this.contentView != null)
    {
      localView = this.contentView;
      AppMethodBeat.o(87511);
    }
    while (true)
    {
      return localView;
      localView = super.getContentView();
      AppMethodBeat.o(87511);
    }
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
    AppMethodBeat.i(87516);
    if (this.gAs != null)
      this.gAs.onCancel(this);
    AppMethodBeat.o(87516);
  }

  public final void pF(int paramInt)
  {
  }

  public void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(87520);
    super.setCancelable(paramBoolean);
    this.gHY = paramBoolean;
    AppMethodBeat.o(87520);
  }

  public void setCanceledOnTouchOutside(boolean paramBoolean)
  {
    AppMethodBeat.i(87519);
    super.setCanceledOnTouchOutside(paramBoolean);
    this.jbE = paramBoolean;
    AppMethodBeat.o(87519);
  }

  public void setContentView(int paramInt)
  {
    AppMethodBeat.i(87512);
    setContentView(LayoutInflater.from(getContext()).inflate(paramInt, null));
    AppMethodBeat.o(87512);
  }

  public void setContentView(View paramView)
  {
    AppMethodBeat.i(87513);
    Object localObject = paramView;
    if (!(paramView instanceof a))
      localObject = new a(paramView.getContext(), paramView);
    this.contentView = ((View)localObject);
    AppMethodBeat.o(87513);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(87514);
    if (paramLayoutParams != null)
      paramView.setLayoutParams(paramLayoutParams);
    setContentView(paramView);
    AppMethodBeat.o(87514);
  }

  public void setOnCancelListener(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(87521);
    super.setOnCancelListener(paramOnCancelListener);
    this.gAs = paramOnCancelListener;
    AppMethodBeat.o(87521);
  }

  public void setOnDismissListener(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(87518);
    super.setOnDismissListener(paramOnDismissListener);
    this.jbD = paramOnDismissListener;
    AppMethodBeat.o(87518);
  }

  public void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener)
  {
    AppMethodBeat.i(87515);
    super.setOnShowListener(paramOnShowListener);
    this.jbC = paramOnShowListener;
    AppMethodBeat.o(87515);
  }

  public void show()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.b
 * JD-Core Version:    0.6.2
 */