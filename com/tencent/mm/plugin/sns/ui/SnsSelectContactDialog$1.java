package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class SnsSelectContactDialog$1
  implements AdapterView.OnItemClickListener
{
  SnsSelectContactDialog$1(SnsSelectContactDialog paramSnsSelectContactDialog)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(39187);
    if (paramInt == SnsSelectContactDialog.a(this.rvq).getCount() - 1)
      SnsSelectContactDialog.b(this.rvq);
    while (true)
    {
      SnsSelectContactDialog.a(this.rvq).refresh();
      AppMethodBeat.o(39187);
      return;
      SnsSelectContactDialog.c(this.rvq).remove(paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSelectContactDialog.1
 * JD-Core Version:    0.6.2
 */