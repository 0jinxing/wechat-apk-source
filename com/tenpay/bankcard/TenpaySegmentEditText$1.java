package com.tenpay.bankcard;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TenpaySegmentEditText$1
  implements View.OnClickListener
{
  TenpaySegmentEditText$1(TenpaySegmentEditText paramTenpaySegmentEditText, EditText paramEditText)
  {
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(49519);
    if (TenpaySegmentEditText.access$000(this.this$0) != null)
      TenpaySegmentEditText.access$000(this.this$0).onClick(paramView);
    if (TenpaySegmentEditText.access$100(this.this$0))
    {
      this.this$0.setFocusable(true);
      this.val$edit.requestFocus();
      TenpaySegmentEditText.access$102(this.this$0, false);
    }
    AppMethodBeat.o(49519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tenpay.bankcard.TenpaySegmentEditText.1
 * JD-Core Version:    0.6.2
 */