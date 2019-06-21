package com.facebook.login;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class DeviceAuthDialog$2
  implements View.OnClickListener
{
  DeviceAuthDialog$2(DeviceAuthDialog paramDeviceAuthDialog)
  {
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(96712);
    this.this$0.onCancel();
    AppMethodBeat.o(96712);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.2
 * JD-Core Version:    0.6.2
 */