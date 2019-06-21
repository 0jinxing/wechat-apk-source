package com.samsung.android.sdk.look.writingbuddy;

import com.samsung.android.writingbuddy.WritingBuddyImpl.OnTextWritingListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class SlookWritingBuddy$1
  implements WritingBuddyImpl.OnTextWritingListener
{
  SlookWritingBuddy$1(SlookWritingBuddy paramSlookWritingBuddy)
  {
  }

  public void onTextReceived(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(117194);
    SlookWritingBuddy.access$000(this.this$0).onTextReceived(paramCharSequence);
    AppMethodBeat.o(117194);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.writingbuddy.SlookWritingBuddy.1
 * JD-Core Version:    0.6.2
 */