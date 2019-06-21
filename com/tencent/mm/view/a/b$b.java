package com.tencent.mm.view.a;

import a.f.b.j;
import a.l;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/view/adapter/CaptureEmojiAdapter$ViewHolder;", "", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/view/adapter/CaptureEmojiAdapter;Landroid/view/View;)V", "captureStatusFailureView", "getCaptureStatusFailureView", "()Landroid/view/View;", "captureStatusLayout", "getCaptureStatusLayout", "captureStatusLoadingView", "getCaptureStatusLoadingView", "iconIV", "Landroid/widget/ImageView;", "getIconIV", "()Landroid/widget/ImageView;", "plugin-emojisdk_release"})
public final class b$b
{
  final View Abk;
  final View Abl;
  final View Abm;
  final ImageView iqT;

  public b$b(View paramView)
  {
    AppMethodBeat.i(63327);
    paramView = localObject.findViewById(2131821503);
    j.o(paramView, "itemView.findViewById(R.id.art_emoji_icon_iv)");
    this.iqT = ((ImageView)paramView);
    paramView = localObject.findViewById(2131823497);
    j.o(paramView, "itemView.findViewById(R.…ji_capture_status_layout)");
    this.Abk = paramView;
    paramView = localObject.findViewById(2131823498);
    j.o(paramView, "itemView.findViewById(R.…oji_capture_loading_view)");
    this.Abl = paramView;
    paramView = localObject.findViewById(2131823499);
    j.o(paramView, "itemView.findViewById(R.…oji_capture_failure_view)");
    this.Abm = paramView;
    AppMethodBeat.o(63327);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.b.b
 * JD-Core Version:    0.6.2
 */