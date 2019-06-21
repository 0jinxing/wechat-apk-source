package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.tencent.matrix.trace.core.AppMethodBeat;

class FacebookDialogFragment$2
  implements WebDialog.OnCompleteListener
{
  FacebookDialogFragment$2(FacebookDialogFragment paramFacebookDialogFragment)
  {
  }

  public void onComplete(Bundle paramBundle, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(96630);
    FacebookDialogFragment.access$100(this.this$0, paramBundle);
    AppMethodBeat.o(96630);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FacebookDialogFragment.2
 * JD-Core Version:    0.6.2
 */