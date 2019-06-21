package com.facebook.login;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginManager$3
  implements CallbackManagerImpl.Callback
{
  LoginManager$3(LoginManager paramLoginManager)
  {
  }

  public boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(96872);
    boolean bool = this.this$0.onActivityResult(paramInt, paramIntent);
    AppMethodBeat.o(96872);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginManager.3
 * JD-Core Version:    0.6.2
 */