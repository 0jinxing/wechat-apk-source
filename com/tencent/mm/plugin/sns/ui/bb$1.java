package com.tencent.mm.plugin.sns.ui;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.bo;

final class bb$1
  implements f.a
{
  bb$1(bb parambb, SpannableString paramSpannableString, int paramInt)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(39855);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(39855);
    while (true)
    {
      return;
      paramString = Drawable.createFromPath(paramString);
      if (paramString != null)
      {
        paramString.setBounds(0, 0, (int)(this.rDq.rDj.getTextSize() * 1.3D), (int)(this.rDq.rDj.getTextSize() * 1.3D));
        paramString = new ImageSpan(paramString, 0);
        this.rDo.setSpan(paramString, this.rDp, this.rDp + 3, 33);
        this.rDq.rDj.setText(this.rDo);
      }
      AppMethodBeat.o(39855);
    }
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bb.1
 * JD-Core Version:    0.6.2
 */