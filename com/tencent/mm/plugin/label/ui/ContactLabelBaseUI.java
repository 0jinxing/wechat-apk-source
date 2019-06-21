package com.tencent.mm.plugin.label.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class ContactLabelBaseUI extends MMActivity
{
  private ProgressDialog gqo;

  public final void JN(String paramString)
  {
    AppMethodBeat.i(22539);
    h.a(this, paramString, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(22539);
  }

  public final void PI(String paramString)
  {
    AppMethodBeat.i(22537);
    getString(2131297061);
    this.gqo = h.b(this, paramString, true, new ContactLabelBaseUI.1(this));
    AppMethodBeat.o(22537);
  }

  public final void bJc()
  {
    AppMethodBeat.i(22538);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(22538);
  }

  public int getLayoutId()
  {
    return 0;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelBaseUI
 * JD-Core Version:    0.6.2
 */