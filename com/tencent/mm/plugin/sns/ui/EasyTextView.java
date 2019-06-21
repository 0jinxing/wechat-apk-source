package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class EasyTextView extends View
{
  private static final Paint feO;
  private static int textSize;
  private Context context;
  private String text;

  static
  {
    AppMethodBeat.i(38210);
    feO = new Paint();
    textSize = -1;
    feO.setAntiAlias(true);
    feO.setFilterBitmap(true);
    feO.setColor(737373);
    AppMethodBeat.o(38210);
  }

  public EasyTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38207);
    this.text = "";
    this.context = paramContext;
    if (textSize == -1)
    {
      textSize = BackwardSupportUtil.b.b(this.context, 12.0F);
      feO.setTextSize(textSize);
    }
    feO.setColor(this.context.getResources().getColor(2131689761));
    AppMethodBeat.o(38207);
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(38209);
    super.draw(paramCanvas);
    int i = getHeight();
    paramCanvas.drawText(this.text, 0.0F, i / 2, feO);
    AppMethodBeat.o(38209);
  }

  public void setText(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    this.text = str;
  }

  public void setTextSize(int paramInt)
  {
    AppMethodBeat.i(38208);
    feO.setTextSize(paramInt);
    AppMethodBeat.o(38208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.EasyTextView
 * JD-Core Version:    0.6.2
 */