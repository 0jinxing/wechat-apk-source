package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SnsSelectContactDialog$2
  implements View.OnClickListener
{
  SnsSelectContactDialog$2(SnsSelectContactDialog paramSnsSelectContactDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39188);
    paramView = new Intent();
    paramView.putExtra("Select_Contact", bo.c(SnsSelectContactDialog.c(this.rvq), ","));
    this.rvq.setResult(-1, paramView);
    this.rvq.finish();
    AppMethodBeat.o(39188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSelectContactDialog.2
 * JD-Core Version:    0.6.2
 */