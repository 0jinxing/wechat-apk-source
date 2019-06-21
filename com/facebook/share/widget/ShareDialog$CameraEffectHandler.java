package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ShareDialog$CameraEffectHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
{
  private ShareDialog$CameraEffectHandler(ShareDialog paramShareDialog)
  {
    super(paramShareDialog);
  }

  public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
  {
    AppMethodBeat.i(97679);
    if (((paramShareContent instanceof ShareCameraEffectContent)) && (ShareDialog.access$500(paramShareContent.getClass())))
    {
      paramBoolean = true;
      AppMethodBeat.o(97679);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(97679);
    }
  }

  public AppCall createAppCall(ShareContent paramShareContent)
  {
    AppMethodBeat.i(97680);
    ShareContentValidation.validateForNativeShare(paramShareContent);
    AppCall localAppCall = this.this$0.createBaseAppCall();
    DialogPresenter.setupAppCallForNativeDialog(localAppCall, new ShareDialog.CameraEffectHandler.1(this, localAppCall, paramShareContent, this.this$0.getShouldFailOnDataError()), ShareDialog.access$800(paramShareContent.getClass()));
    AppMethodBeat.o(97680);
    return localAppCall;
  }

  public Object getMode()
  {
    return ShareDialog.Mode.NATIVE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.widget.ShareDialog.CameraEffectHandler
 * JD-Core Version:    0.6.2
 */