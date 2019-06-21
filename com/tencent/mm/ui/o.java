package com.tencent.mm.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

final class o extends Dialog
  implements DialogInterface
{
  private boolean gHY;
  private View iUw;
  private TextView jao;
  private Context mContext;
  Button tJz;
  private LinearLayout ykT;
  TextView ykU;
  private TextView ykV;
  LinearLayout ykW;
  private LinearLayout ykX;

  public o(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(29538);
    this.mContext = paramContext;
    this.ykT = ((LinearLayout)v.hu(this.mContext).inflate(2130970092, null));
    this.tJz = ((Button)this.ykT.findViewById(2131822912));
    this.jao = ((TextView)this.ykT.findViewById(2131825974));
    this.ykU = ((TextView)this.ykT.findViewById(2131825979));
    this.ykV = ((TextView)this.ykT.findViewById(2131822917));
    this.iUw = this.ykT.findViewById(2131825973);
    this.ykW = ((LinearLayout)this.ykT.findViewById(2131824516));
    this.ykX = ((LinearLayout)this.ykT.findViewById(2131825980));
    setCanceledOnTouchOutside(true);
    AppMethodBeat.o(29538);
  }

  private void dxO()
  {
    AppMethodBeat.i(29542);
    if (this.ykU != null)
      this.ykU.setTextColor(this.ykU.getContext().getResources().getColor(2131689953));
    AppMethodBeat.o(29542);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(29546);
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(29537);
          o.this.dismiss();
          AppMethodBeat.o(29537);
        }
      });
      ab.e("MicroMsg.LiteDependDialog", bo.dpG().toString());
      AppMethodBeat.o(29546);
    }
    while (true)
    {
      return;
      try
      {
        super.dismiss();
        AppMethodBeat.o(29546);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.LiteDependDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(29546);
      }
    }
  }

  public final void dxP()
  {
    AppMethodBeat.i(29544);
    super.setCancelable(true);
    AppMethodBeat.o(29544);
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29539);
    super.onCreate(paramBundle);
    setContentView(this.ykT);
    AppMethodBeat.o(29539);
  }

  public final void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(29543);
    super.setCancelable(paramBoolean);
    this.gHY = paramBoolean;
    setCanceledOnTouchOutside(this.gHY);
    AppMethodBeat.o(29543);
  }

  public final void setTitle(int paramInt)
  {
    AppMethodBeat.i(29541);
    this.iUw.setVisibility(0);
    this.jao.setVisibility(0);
    this.jao.setMaxLines(2);
    this.jao.setText(paramInt);
    dxO();
    AppMethodBeat.o(29541);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(29540);
    this.iUw.setVisibility(0);
    this.jao.setVisibility(0);
    this.jao.setMaxLines(2);
    this.jao.setText(paramCharSequence);
    dxO();
    AppMethodBeat.o(29540);
  }

  public final void show()
  {
    AppMethodBeat.i(29545);
    try
    {
      super.show();
      AppMethodBeat.o(29545);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LiteDependDialog", localException, "", new Object[0]);
        AppMethodBeat.o(29545);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.o
 * JD-Core Version:    0.6.2
 */