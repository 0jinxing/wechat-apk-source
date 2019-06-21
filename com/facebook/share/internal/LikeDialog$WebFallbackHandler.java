package com.facebook.share.internal;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LikeDialog$WebFallbackHandler extends FacebookDialogBase<LikeContent, LikeDialog.Result>.ModeHandler
{
  private LikeDialog$WebFallbackHandler(LikeDialog paramLikeDialog)
  {
    super(paramLikeDialog);
  }

  public boolean canShow(LikeContent paramLikeContent, boolean paramBoolean)
  {
    return false;
  }

  public AppCall createAppCall(LikeContent paramLikeContent)
  {
    AppMethodBeat.i(97106);
    AppCall localAppCall = this.this$0.createBaseAppCall();
    DialogPresenter.setupAppCallForWebFallbackDialog(localAppCall, LikeDialog.access$200(paramLikeContent), LikeDialog.access$300());
    AppMethodBeat.o(97106);
    return localAppCall;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeDialog.WebFallbackHandler
 * JD-Core Version:    0.6.2
 */