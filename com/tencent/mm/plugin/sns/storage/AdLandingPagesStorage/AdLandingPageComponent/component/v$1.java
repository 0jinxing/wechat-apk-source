package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class v$1
  implements f.a
{
  v$1(v paramv)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37257);
    try
    {
      paramString = BitmapFactory.decodeFile(paramString);
      this.rbD.rbC.setImageBitmap(paramString);
      TextView localTextView = this.rbD.exj;
      Paint localPaint = new android/graphics/Paint;
      localPaint.<init>();
      paramString = localTextView.getText().toString();
      localPaint.setTextSize(localTextView.getTextSize());
      float f = localPaint.measureText(paramString, 0, paramString.length());
      f = this.rbD.qZo.qWU - f - TypedValue.applyDimension(1, 3.0F, this.rbD.context.getResources().getDisplayMetrics());
      int i = (int)(f - v.a(this.rbD).value * f);
      paramString = (RelativeLayout.LayoutParams)this.rbD.rbC.getLayoutParams();
      paramString.setMargins(paramString.leftMargin, paramString.topMargin, i, paramString.leftMargin);
      this.rbD.rbC.setLayoutParams(paramString);
      AppMethodBeat.o(37257);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Sns.AdLandingPageProcessBarComponent", "%s" + bo.l(paramString));
        AppMethodBeat.o(37257);
      }
    }
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v.1
 * JD-Core Version:    0.6.2
 */