package com.facebook.share.internal;

import com.facebook.GraphRequestBatch;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LikeActionController$9
  implements LikeActionController.RequestCompletionCallback
{
  LikeActionController$9(LikeActionController paramLikeActionController)
  {
  }

  public void onComplete()
  {
    AppMethodBeat.i(96995);
    switch (LikeActionController.12.$SwitchMap$com$facebook$share$widget$LikeView$ObjectType[LikeActionController.access$1700(this.this$0).ordinal()])
    {
    default:
    case 1:
    }
    for (Object localObject = new LikeActionController.GetOGObjectLikesRequestWrapper(this.this$0, LikeActionController.access$1600(this.this$0), LikeActionController.access$1700(this.this$0)); ; localObject = new LikeActionController.GetPageLikesRequestWrapper(this.this$0, LikeActionController.access$1600(this.this$0)))
    {
      LikeActionController.GetEngagementRequestWrapper localGetEngagementRequestWrapper = new LikeActionController.GetEngagementRequestWrapper(this.this$0, LikeActionController.access$1600(this.this$0), LikeActionController.access$1700(this.this$0));
      GraphRequestBatch localGraphRequestBatch = new GraphRequestBatch();
      ((LikeActionController.LikeRequestWrapper)localObject).addToBatch(localGraphRequestBatch);
      localGetEngagementRequestWrapper.addToBatch(localGraphRequestBatch);
      localGraphRequestBatch.addCallback(new LikeActionController.9.1(this, (LikeActionController.LikeRequestWrapper)localObject, localGetEngagementRequestWrapper));
      localGraphRequestBatch.executeAsync();
      AppMethodBeat.o(96995);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.9
 * JD-Core Version:    0.6.2
 */