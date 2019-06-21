package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.az;
import java.util.LinkedList;

final class SnsCommentDetailUI$22
  implements View.OnAttachStateChangeListener
{
  boolean rqT = false;

  SnsCommentDetailUI$22(SnsCommentDetailUI paramSnsCommentDetailUI, TimeLineObject paramTimeLineObject, n paramn, LinkedList paramLinkedList)
  {
  }

  public final void onViewAttachedToWindow(View paramView)
  {
    AppMethodBeat.i(38802);
    ab.i("MicroMsg.SnsCommentDetailUI", "onViewAttachedToWindow infoHeader %s", new Object[] { Boolean.valueOf(this.rqT) });
    if (!this.rqT)
      AppMethodBeat.o(38802);
    while (true)
    {
      return;
      this.rqT = false;
      if (this.rqU == null)
      {
        AppMethodBeat.o(38802);
      }
      else if (this.rhJ == null)
      {
        AppMethodBeat.o(38802);
      }
      else if (this.rqN.rqJ == null)
      {
        AppMethodBeat.o(38802);
      }
      else
      {
        paramView = SnsCommentDetailUI.D(this.rqN);
        PhotosContent localPhotosContent = this.rqN.rqJ;
        TimeLineObject localTimeLineObject = this.rqU;
        String str = this.rhJ.cqU();
        SnsCommentDetailUI.B(this.rqN);
        paramView.a(localPhotosContent, localTimeLineObject, str, this.rqN.hashCode(), SnsCommentDetailUI.C(this.rqN), -1, this.rhJ.DI(32), false, az.xYT, this.rqV, this.rhJ.cqA());
        AppMethodBeat.o(38802);
      }
    }
  }

  public final void onViewDetachedFromWindow(View paramView)
  {
    AppMethodBeat.i(38803);
    ab.i("MicroMsg.SnsCommentDetailUI", "onViewDetachedFromWindow infoHeader");
    this.rqT = true;
    AppMethodBeat.o(38803);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.22
 * JD-Core Version:    0.6.2
 */