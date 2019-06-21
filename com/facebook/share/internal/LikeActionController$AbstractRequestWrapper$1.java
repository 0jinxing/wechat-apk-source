package com.facebook.share.internal;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LikeActionController$AbstractRequestWrapper$1
  implements GraphRequest.Callback
{
  LikeActionController$AbstractRequestWrapper$1(LikeActionController.AbstractRequestWrapper paramAbstractRequestWrapper)
  {
  }

  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(96996);
    this.this$1.error = paramGraphResponse.getError();
    if (this.this$1.error != null)
    {
      this.this$1.processError(this.this$1.error);
      AppMethodBeat.o(96996);
    }
    while (true)
    {
      return;
      this.this$1.processSuccess(paramGraphResponse);
      AppMethodBeat.o(96996);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.AbstractRequestWrapper.1
 * JD-Core Version:    0.6.2
 */