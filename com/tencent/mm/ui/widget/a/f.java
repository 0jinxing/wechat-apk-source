package com.tencent.mm.ui.widget.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

public class f extends ProgressDialog
{
  private View WL;
  private ProgressBar iUz;
  private Context mContext;
  private TextView ykU;

  public f(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(112694);
    this.mContext = paramContext;
    this.WL = View.inflate(this.mContext, 2130970417, null);
    this.ykU = ((TextView)this.WL.findViewById(2131826670));
    this.iUz = ((ProgressBar)this.WL.findViewById(2131826669));
    setCanceledOnTouchOutside(true);
    AppMethodBeat.o(112694);
  }

  public static f g(Context paramContext, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112695);
    paramContext = new f(paramContext);
    paramContext.setMessage(paramCharSequence);
    paramContext.setCancelable(false);
    paramContext.setOnCancelListener(null);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.show();
    AppMethodBeat.o(112695);
    return paramContext;
  }

  public void dismiss()
  {
    AppMethodBeat.i(112700);
    try
    {
      super.dismiss();
      AppMethodBeat.o(112700);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ai.e("WeUI.WeUIProgresssDialog", "dismiss exception, e = " + localException.getMessage(), new Object[0]);
        AppMethodBeat.o(112700);
      }
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112696);
    super.onCreate(paramBundle);
    setContentView(this.WL, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -1;
    paramBundle.height = -2;
    onWindowAttributesChanged(paramBundle);
    AppMethodBeat.o(112696);
  }

  public void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(112697);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    AppMethodBeat.o(112697);
  }

  public void setMessage(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112698);
    this.ykU.setText(paramCharSequence);
    AppMethodBeat.o(112698);
  }

  public void show()
  {
    AppMethodBeat.i(112699);
    try
    {
      super.show();
      AppMethodBeat.o(112699);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ai.printErrStackTrace("WeUI.WeUIProgresssDialog", localException, "", new Object[0]);
        AppMethodBeat.o(112699);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.f
 * JD-Core Version:    0.6.2
 */