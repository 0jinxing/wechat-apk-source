package com.tencent.mm.plugin.account.bind.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.ui.base.h;

final class f$1
  implements DialogInterface.OnClickListener
{
  f$1(f paramf, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13750);
    this.gul.gud = null;
    paramDialogInterface = this.gul;
    Object localObject = this.guk.getText().toString().trim();
    paramDialogInterface.Xy();
    paramDialogInterface.guf = ((String)localObject);
    localObject = paramDialogInterface.context;
    paramDialogInterface.context.getString(2131297061);
    paramDialogInterface.guc = h.b((Context)localObject, paramDialogInterface.context.getString(2131302962), true, new f.3(paramDialogInterface));
    g.Rg().a(new aa(5, paramDialogInterface.guf, "", "", "", false, 1), 0);
    AppMethodBeat.o(13750);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.f.1
 * JD-Core Version:    0.6.2
 */