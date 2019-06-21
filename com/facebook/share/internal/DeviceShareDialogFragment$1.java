package com.facebook.share.internal;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class DeviceShareDialogFragment$1
  implements View.OnClickListener
{
  DeviceShareDialogFragment$1(DeviceShareDialogFragment paramDeviceShareDialogFragment)
  {
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(96953);
    DeviceShareDialogFragment.access$000(this.this$0).dismiss();
    AppMethodBeat.o(96953);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.DeviceShareDialogFragment.1
 * JD-Core Version:    0.6.2
 */