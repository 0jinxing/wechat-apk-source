package com.tencent.mm.ui.transmit;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ag;
import com.tencent.mm.ui.aj;

final class SelectConversationUI$5
  implements b.i
{
  SelectConversationUI$5(SelectConversationUI paramSelectConversationUI, ImageView paramImageView, String paramString)
  {
  }

  public final void abU()
  {
  }

  public final void mr()
  {
    AppMethodBeat.i(35129);
    ab.i("Weishi", "dealRetransmitFromWeishiVideoMiniProgram, image load fail:%", new Object[] { this.hWi });
    AppMethodBeat.o(35129);
  }

  public final String wP()
  {
    return "SelectConversationUI#WEISHITHUMB";
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(35128);
    if ((!this.zKj.isFinishing()) && (paramBitmap != null) && (!paramBitmap.isRecycled()) && (this.zKl != null))
    {
      paramBitmap = ag.d(SelectConversationUI.a(this.zKj, paramBitmap, this.zKl, paramBitmap.getWidth(), paramBitmap.getHeight()), aj.fromDPToPix(this.zKj, 3));
      this.zKl.setImageBitmap(paramBitmap);
    }
    AppMethodBeat.o(35128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.5
 * JD-Core Version:    0.6.2
 */