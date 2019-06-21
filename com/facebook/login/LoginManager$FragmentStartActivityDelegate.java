package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginManager$FragmentStartActivityDelegate
  implements StartActivityDelegate
{
  private final FragmentWrapper fragment;

  LoginManager$FragmentStartActivityDelegate(FragmentWrapper paramFragmentWrapper)
  {
    AppMethodBeat.i(96876);
    Validate.notNull(paramFragmentWrapper, "fragment");
    this.fragment = paramFragmentWrapper;
    AppMethodBeat.o(96876);
  }

  public Activity getActivityContext()
  {
    AppMethodBeat.i(96878);
    Activity localActivity = this.fragment.getActivity();
    AppMethodBeat.o(96878);
    return localActivity;
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(96877);
    this.fragment.startActivityForResult(paramIntent, paramInt);
    AppMethodBeat.o(96877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginManager.FragmentStartActivityDelegate
 * JD-Core Version:    0.6.2
 */