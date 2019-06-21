package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;

public final class p extends q
{
  private View WL;
  public ProgressBar iUz;
  private Context mContext;
  private int style;
  private TextView ykU;

  private p(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1);
    AppMethodBeat.i(106711);
    this.mContext = paramContext;
    this.style = paramInt2;
    paramInt1 = i;
    switch (this.style)
    {
    default:
    case 0:
    case 2:
    case 3:
    case 1:
    }
    for (paramInt1 = i; ; paramInt1 = 2130970214)
    {
      this.WL = v.hu(this.mContext).inflate(paramInt1, null);
      this.ykU = ((TextView)this.WL.findViewById(2131821803));
      this.iUz = ((ProgressBar)this.WL.findViewById(2131821802));
      setCanceledOnTouchOutside(true);
      AppMethodBeat.o(106711);
      return;
    }
  }

  private static p a(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106716);
    int i = paramInt2;
    if (paramInt2 <= 0)
      switch (paramInt1)
      {
      default:
        i = 2131493872;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    while (true)
    {
      paramContext = new p(paramContext, i, paramInt1);
      paramContext.setMessage(paramCharSequence);
      paramContext.setCancelable(paramBoolean);
      paramContext.setOnCancelListener(paramOnCancelListener);
      paramContext.setCanceledOnTouchOutside(false);
      AppMethodBeat.o(106716);
      return paramContext;
      i = 2131493867;
      continue;
      i = 2131493867;
      continue;
      i = 2131493867;
      continue;
      i = 2131493872;
    }
  }

  public static p b(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106718);
    paramContext = a(paramContext, paramCharSequence, paramBoolean, paramInt1, paramInt2, paramOnCancelListener);
    paramContext.show();
    AppMethodBeat.o(106718);
    return paramContext;
  }

  public static p b(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106717);
    paramContext = b(paramContext, paramCharSequence, paramBoolean, 0, -1, paramOnCancelListener);
    AppMethodBeat.o(106717);
    return paramContext;
  }

  public static p d(Context paramContext, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(106715);
    paramContext = a(paramContext, paramCharSequence, true, 0, -1, null);
    AppMethodBeat.o(106715);
    return paramContext;
  }

  public final void dismiss()
  {
    AppMethodBeat.i(106720);
    try
    {
      super.dismiss();
      AppMethodBeat.o(106720);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMProgressDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(106720);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(106712);
    super.onCreate(paramBundle);
    setContentView(this.WL, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -1;
    paramBundle.height = -2;
    if (this.style == 2)
    {
      getWindow().addFlags(2);
      paramBundle.dimAmount = 0.65F;
    }
    onWindowAttributesChanged(paramBundle);
    AppMethodBeat.o(106712);
  }

  public final void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(106713);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    AppMethodBeat.o(106713);
  }

  public final void setMessage(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(106714);
    this.ykU.setText(paramCharSequence);
    AppMethodBeat.o(106714);
  }

  public final void show()
  {
    AppMethodBeat.i(106719);
    try
    {
      super.show();
      AppMethodBeat.o(106719);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMProgressDialog", localException, "", new Object[0]);
        AppMethodBeat.o(106719);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.p
 * JD-Core Version:    0.6.2
 */