package com.tencent.mm.plugin.sns.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView;

final class CollapsibleTextView$1
  implements Runnable
{
  CollapsibleTextView$1(CollapsibleTextView paramCollapsibleTextView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38199);
    if ((this.rhZ.rhR != null) && ((this.rhZ.rhR.getTag() instanceof ar)) && (((ar)this.rhZ.rhR.getTag()).cFc.equals(CollapsibleTextView.a(this.rhZ))))
    {
      this.rhZ.rhR.setMaxLines(6);
      this.rhZ.rhT.setVisibility(0);
      this.rhZ.rhT.setText(CollapsibleTextView.b(this.rhZ));
    }
    AppMethodBeat.o(38199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.CollapsibleTextView.1
 * JD-Core Version:    0.6.2
 */