package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class NormalUserFooterPreference$a$9
  implements bf.a
{
  NormalUserFooterPreference$a$9(NormalUserFooterPreference.a parama)
  {
  }

  public final boolean JU()
  {
    return this.poS.isDeleteCancel;
  }

  public final void JV()
  {
    AppMethodBeat.i(23683);
    if (this.poS.poR.ehJ != null)
      this.poS.poR.ehJ.dismiss();
    AppMethodBeat.o(23683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.9
 * JD-Core Version:    0.6.2
 */