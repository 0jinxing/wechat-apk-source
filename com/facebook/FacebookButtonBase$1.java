package com.facebook;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class FacebookButtonBase$1
  implements View.OnClickListener
{
  FacebookButtonBase$1(FacebookButtonBase paramFacebookButtonBase)
  {
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(96593);
    FacebookButtonBase.access$000(this.this$0, this.this$0.getContext());
    if (FacebookButtonBase.access$100(this.this$0) != null)
    {
      FacebookButtonBase.access$100(this.this$0).onClick(paramView);
      AppMethodBeat.o(96593);
    }
    while (true)
    {
      return;
      if (FacebookButtonBase.access$200(this.this$0) != null)
        FacebookButtonBase.access$200(this.this$0).onClick(paramView);
      AppMethodBeat.o(96593);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookButtonBase.1
 * JD-Core Version:    0.6.2
 */