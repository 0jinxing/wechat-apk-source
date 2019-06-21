package com.tencent.mm.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.q;

public final class g extends q
{
  private View WL;
  private ProgressBar iUz;
  private Context mContext;
  private TextView ykU;

  private g(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(49335);
    this.mContext = paramContext;
    this.WL = null;
    if (this.WL == null)
    {
      this.WL = View.inflate(this.mContext, 2130971156, null);
      this.ykU = ((TextView)this.WL.findViewById(2131821803));
      this.iUz = ((ProgressBar)this.WL.findViewById(2131821802));
      setCanceledOnTouchOutside(true);
    }
    AppMethodBeat.o(49335);
  }

  public static Dialog a(Context paramContext, CharSequence paramCharSequence, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(49339);
    paramContext = new g(paramContext);
    paramContext.setMessage(paramCharSequence);
    paramContext.setCancelable(true);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.show();
    AppMethodBeat.o(49339);
    return paramContext;
  }

  public static Dialog a(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(49341);
    View localView = View.inflate(paramContext, 2130971157, null);
    paramContext = new i(paramContext, 2131493729);
    paramContext.setCancelable(paramBoolean);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    AppMethodBeat.o(49341);
    return paramContext;
  }

  public static Dialog b(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(49343);
    paramContext.getString(2131296899);
    paramContext = h.b(paramContext, paramContext.getString(2131305190), paramBoolean, paramOnCancelListener);
    AppMethodBeat.o(49343);
    return paramContext;
  }

  public static Dialog d(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(49340);
    View localView = View.inflate(paramContext, 2130971157, null);
    ((TextView)localView.findViewById(2131829018)).setText(paramString);
    paramContext = new i(paramContext, 2131493729);
    paramContext.setCancelable(false);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    AppMethodBeat.o(49340);
    return paramContext;
  }

  public static Dialog g(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(49342);
    View localView = View.inflate(paramContext, 2130971157, null);
    paramContext = new i(paramContext, 2131493729);
    paramContext.setCancelable(true);
    paramContext.setContentView(localView);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    AppMethodBeat.o(49342);
    return paramContext;
  }

  public final void dismiss()
  {
    AppMethodBeat.i(49344);
    try
    {
      super.dismiss();
      AppMethodBeat.o(49344);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WalletProgressDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(49344);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(49336);
    super.onCreate(paramBundle);
    setContentView(this.WL, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -2;
    paramBundle.height = -2;
    getWindow().addFlags(2);
    paramBundle.dimAmount = 0.65F;
    onWindowAttributesChanged(paramBundle);
    AppMethodBeat.o(49336);
  }

  public final void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(49337);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    AppMethodBeat.o(49337);
  }

  public final void setMessage(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(49338);
    this.ykU.setText(paramCharSequence);
    AppMethodBeat.o(49338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.g
 * JD-Core Version:    0.6.2
 */