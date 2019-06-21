package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.statusbar.DrawStatusBarPreference;

public class ContactProfileUI extends DrawStatusBarPreference
{
  public final int JC()
  {
    AppMethodBeat.i(23427);
    int i = super.JC();
    AppMethodBeat.o(23427);
    return i;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23426);
    super.onCreate(paramBundle);
    AppMethodBeat.o(23426);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactProfileUI
 * JD-Core Version:    0.6.2
 */