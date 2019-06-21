package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShowCommentImageView$1
  implements View.OnClickListener
{
  ShowCommentImageView$1(ShowCommentImageView paramShowCommentImageView, View.OnClickListener paramOnClickListener)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38570);
    ShowCommentImageView.a(this.rna, true);
    this.rmZ.onClick(paramView);
    AppMethodBeat.o(38570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ShowCommentImageView.1
 * JD-Core Version:    0.6.2
 */