package com.facebook.share.internal;

import com.facebook.share.widget.LikeView.ObjectType;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LikeActionController$CreateLikeActionControllerWorkItem
  implements Runnable
{
  private LikeActionController.CreationCallback callback;
  private String objectId;
  private LikeView.ObjectType objectType;

  LikeActionController$CreateLikeActionControllerWorkItem(String paramString, LikeView.ObjectType paramObjectType, LikeActionController.CreationCallback paramCreationCallback)
  {
    this.objectId = paramString;
    this.objectType = paramObjectType;
    this.callback = paramCreationCallback;
  }

  public void run()
  {
    AppMethodBeat.i(96997);
    LikeActionController.access$2700(this.objectId, this.objectType, this.callback);
    AppMethodBeat.o(96997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.CreateLikeActionControllerWorkItem
 * JD-Core Version:    0.6.2
 */