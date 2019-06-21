package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class s extends Dialog
  implements DialogInterface
{
  private TextView iVf;
  private View jcl;
  private Context mContext;
  private int style;
  private ImageView yxU;

  private s(Context paramContext)
  {
    super(paramContext, 2131493872);
    AppMethodBeat.i(106866);
    this.mContext = paramContext;
    this.style = 0;
    int j = i;
    switch (this.style)
    {
    default:
    case 0:
    case 1:
    }
    for (j = i; ; j = 2130970225)
    {
      this.jcl = View.inflate(this.mContext, j, null);
      this.iVf = ((TextView)this.jcl.findViewById(2131824055));
      this.yxU = ((ImageView)this.jcl.findViewById(2131820915));
      setCanceledOnTouchOutside(true);
      AppMethodBeat.o(106866);
      return;
    }
  }

  public static s a(CharSequence paramCharSequence, Context paramContext)
  {
    AppMethodBeat.i(106868);
    s locals = new s(paramContext);
    locals.iVf.setText(paramCharSequence);
    locals.setCanceledOnTouchOutside(true);
    locals.show();
    locals.setOnDismissListener(null);
    new s.1(Looper.getMainLooper(), paramContext, locals).sendEmptyMessageDelayed(0, 1000L);
    AppMethodBeat.o(106868);
    return locals;
  }

  public final void dismiss()
  {
    AppMethodBeat.i(106869);
    try
    {
      super.dismiss();
      AppMethodBeat.o(106869);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMTipsDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(106869);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(106867);
    super.onCreate(paramBundle);
    setContentView(this.jcl, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -1;
    paramBundle.height = -2;
    onWindowAttributesChanged(paramBundle);
    AppMethodBeat.o(106867);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.s
 * JD-Core Version:    0.6.2
 */