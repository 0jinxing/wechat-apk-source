package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.platformtools.ah;

final class h$12
  implements DialogInterface.OnClickListener
{
  h$12(h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29325);
    paramDialogInterface = this.yih.qmA.getText().toString();
    this.yih.qmA.setText("");
    this.yih.qmA.clearFocus();
    ah.a(this.yih.yhZ, this.yih.qmA);
    if ((paramDialogInterface == null) || (paramDialogInterface.equals("")))
    {
      com.tencent.mm.ui.base.h.a(this.yih.yhZ, 2131304235, 2131297061, new h.12.1(this));
      AppMethodBeat.o(29325);
    }
    while (true)
    {
      return;
      this.yih.dxf();
      aw.Rg().a(384, this.yih.yic);
      final aa localaa = new aa(paramDialogInterface, "", "", "");
      aw.Rg().a(localaa, 0);
      paramDialogInterface = this.yih;
      MMFragmentActivity localMMFragmentActivity = this.yih.yhZ;
      this.yih.getString(2131297061);
      paramDialogInterface.ehJ = com.tencent.mm.ui.base.h.b(localMMFragmentActivity, this.yih.getString(2131303125), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(29324);
          aw.Rg().b(384, h.12.this.yih.yic);
          h.12.this.yih.yic = null;
          aw.Rg().c(localaa);
          AppMethodBeat.o(29324);
        }
      });
      AppMethodBeat.o(29325);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h.12
 * JD-Core Version:    0.6.2
 */