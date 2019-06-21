package com.tencent.mm.plugin.sns.ui.item;

import android.graphics.BitmapFactory;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;

final class g$1
  implements f.a
{
  g$1(g paramg, PhotosContent paramPhotosContent, b paramb, TagImageView paramTagImageView)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(40153);
    g.a(this.rIU, (MaskImageView)this.rqQ.findViewById(2131827901));
    if (g.a(this.rIU) != null)
    {
      g.a(this.rIU).setVisibility(0);
      paramString = BitmapFactory.decodeFile(paramString);
      g.a(this.rIU).setImageBitmap(paramString);
      float f1 = i.a(this.rqR.qUN, 1, this.rqR.qUJ, this.rqR.qUK);
      float f2 = i.a(this.rqR.qUO, 1, this.rqR.qUJ, this.rqR.qUK);
      float f3 = i.a(this.rqR.qUP, 1, this.rqR.qUJ, this.rqR.qUK);
      float f4 = i.a(this.rqR.qUQ, 1, this.rqR.qUJ, this.rqR.qUK);
      paramString = new FrameLayout.LayoutParams((int)f1, (int)f2);
      paramString.setMargins((int)(this.rqS.getRight() - f3 - f1), (int)(this.rqS.getBottom() - f4 - f2), 0, 0);
      g.a(this.rIU).setLayoutParams(paramString);
    }
    AppMethodBeat.o(40153);
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.g.1
 * JD-Core Version:    0.6.2
 */