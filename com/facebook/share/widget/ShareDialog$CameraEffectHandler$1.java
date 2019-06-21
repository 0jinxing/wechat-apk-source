package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.model.ShareContent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ShareDialog$CameraEffectHandler$1
  implements DialogPresenter.ParameterProvider
{
  ShareDialog$CameraEffectHandler$1(ShareDialog.CameraEffectHandler paramCameraEffectHandler, AppCall paramAppCall, ShareContent paramShareContent, boolean paramBoolean)
  {
  }

  public Bundle getLegacyParameters()
  {
    AppMethodBeat.i(97678);
    Bundle localBundle = LegacyNativeDialogParameters.create(this.val$appCall.getCallId(), this.val$content, this.val$shouldFailOnDataError);
    AppMethodBeat.o(97678);
    return localBundle;
  }

  public Bundle getParameters()
  {
    AppMethodBeat.i(97677);
    Bundle localBundle = NativeDialogParameters.create(this.val$appCall.getCallId(), this.val$content, this.val$shouldFailOnDataError);
    AppMethodBeat.o(97677);
    return localBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.widget.ShareDialog.CameraEffectHandler.1
 * JD-Core Version:    0.6.2
 */