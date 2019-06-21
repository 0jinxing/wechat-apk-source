package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public class RichTextImageView extends LinearLayout
{
  private Activity czX;
  private TextView gne;
  private ImageView olT;
  private TextView rii;
  private TextView rmN;
  private boolean rmO;
  private String rmP;

  public RichTextImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38547);
    this.rmO = false;
    this.czX = ((Activity)paramContext);
    paramContext = inflate(this.czX, 2130970794, this);
    this.rii = ((TextView)paramContext.findViewById(2131825690));
    this.gne = ((TextView)paramContext.findViewById(2131825689));
    this.rmN = ((TextView)paramContext.findViewById(2131827837));
    this.olT = ((ImageView)paramContext.findViewById(2131825687));
    AppMethodBeat.o(38547);
  }

  public ImageView getImageView()
  {
    return this.olT;
  }

  public TextView getTitle()
  {
    return this.gne;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(38552);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.rmO)
      AppMethodBeat.o(38552);
    while (true)
    {
      return;
      if (this.rmP == null)
      {
        AppMethodBeat.o(38552);
      }
      else
      {
        ab.d("MicroMsg.RichTextImageView", "onLayout  Heighth:" + this.rii.getHeight() + " LineHeight:" + this.rii.getLineHeight());
        paramInt3 = this.rii.getHeight() / this.rii.getLineHeight();
        int i = this.rii.getLineCount();
        Rect localRect = new Rect();
        paramInt1 = 0;
        paramInt2 = 0;
        while (true)
          if (paramInt1 < paramInt3)
            try
            {
              this.rii.getLineBounds(paramInt1, localRect);
              paramInt2 += localRect.height();
              if (paramInt2 <= this.rii.getHeight())
                paramInt1++;
            }
            catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
            {
            }
        if ((i >= paramInt1) && (this.rmO))
        {
          paramInt2 = paramInt1;
          if (paramInt1 <= 0)
            paramInt2 = 1;
          paramInt1 = this.rii.getLayout().getLineVisibleEnd(paramInt2 - 1);
          StringBuilder localStringBuilder = new StringBuilder("bottomH:").append(this.rmN.getHeight()).append("length");
          String str = this.rmP;
          ab.e("test", str.substring(paramInt1, str.length()).length());
          ab.e("test", "bottomH:" + this.rmN.getHeight());
          if (this.rmN.getText().length() > 0)
          {
            this.rmN.setVisibility(0);
            this.rmO = false;
            new ak().post(new RichTextImageView.1(this, paramInt1));
          }
          ab.e("test", "bottom:" + paramInt4 + "   mesH:" + this.rmN.getMeasuredHeight());
        }
        AppMethodBeat.o(38552);
      }
    }
  }

  public void setImage(int paramInt)
  {
    AppMethodBeat.i(38550);
    this.olT.setImageResource(paramInt);
    AppMethodBeat.o(38550);
  }

  public void setImage(Bitmap paramBitmap)
  {
    AppMethodBeat.i(38551);
    this.olT.setImageBitmap(paramBitmap);
    AppMethodBeat.o(38551);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(38549);
    this.rmO = true;
    String str = paramString;
    if (paramString == null)
      str = "";
    this.rmP = str;
    this.rii.setText(this.rmP);
    requestLayout();
    AppMethodBeat.o(38549);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(38548);
    this.gne.setText(paramString);
    AppMethodBeat.o(38548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.RichTextImageView
 * JD-Core Version:    0.6.2
 */