package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrsViewControl$3
  implements AdapterView.OnItemClickListener
{
  MailAddrsViewControl$3(MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(68340);
    paramAdapterView = MailAddrsViewControl.e(this.pyG).Bu(paramInt);
    this.pyG.e(paramAdapterView);
    this.pyG.pyz.setText("");
    AppMethodBeat.o(68340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.3
 * JD-Core Version:    0.6.2
 */