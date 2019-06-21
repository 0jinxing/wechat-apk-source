package com.tencent.mm.plugin.sns.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class RichTextImageView$1
  implements Runnable
{
  RichTextImageView$1(RichTextImageView paramRichTextImageView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38546);
    RichTextImageView.b(this.rmR).setText(RichTextImageView.a(this.rmR).substring(0, this.rmQ));
    RichTextImageView.c(this.rmR).setText(RichTextImageView.a(this.rmR).substring(this.rmQ, RichTextImageView.a(this.rmR).length()));
    RichTextImageView.c(this.rmR).invalidate();
    RichTextImageView.d(this.rmR);
    ab.e("test", "bottomH:" + RichTextImageView.c(this.rmR).getHeight());
    AppMethodBeat.o(38546);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.RichTextImageView.1
 * JD-Core Version:    0.6.2
 */