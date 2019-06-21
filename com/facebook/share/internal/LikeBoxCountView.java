package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public class LikeBoxCountView extends FrameLayout
{
  private int additionalTextPadding;
  private Paint borderPaint;
  private float borderRadius;
  private float caretHeight;
  private LikeBoxCountView.LikeBoxCountViewCaretPosition caretPosition;
  private float caretWidth;
  private TextView likeCountLabel;
  private int textPadding;

  @Deprecated
  public LikeBoxCountView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(97076);
    this.caretPosition = LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT;
    initialize(paramContext);
    AppMethodBeat.o(97076);
  }

  private void drawBorder(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(97083);
    Path localPath = new Path();
    float f = this.borderRadius * 2.0F;
    localPath.addArc(new RectF(paramFloat1, paramFloat2, paramFloat1 + f, paramFloat2 + f), -180.0F, 90.0F);
    if (this.caretPosition == LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP)
    {
      localPath.lineTo((paramFloat3 - paramFloat1 - this.caretWidth) / 2.0F + paramFloat1, paramFloat2);
      localPath.lineTo((paramFloat3 - paramFloat1) / 2.0F + paramFloat1, paramFloat2 - this.caretHeight);
      localPath.lineTo((paramFloat3 - paramFloat1 + this.caretWidth) / 2.0F + paramFloat1, paramFloat2);
    }
    localPath.lineTo(paramFloat3 - this.borderRadius, paramFloat2);
    localPath.addArc(new RectF(paramFloat3 - f, paramFloat2, paramFloat3, paramFloat2 + f), -90.0F, 90.0F);
    if (this.caretPosition == LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT)
    {
      localPath.lineTo(paramFloat3, (paramFloat4 - paramFloat2 - this.caretWidth) / 2.0F + paramFloat2);
      localPath.lineTo(this.caretHeight + paramFloat3, (paramFloat4 - paramFloat2) / 2.0F + paramFloat2);
      localPath.lineTo(paramFloat3, (paramFloat4 - paramFloat2 + this.caretWidth) / 2.0F + paramFloat2);
    }
    localPath.lineTo(paramFloat3, paramFloat4 - this.borderRadius);
    localPath.addArc(new RectF(paramFloat3 - f, paramFloat4 - f, paramFloat3, paramFloat4), 0.0F, 90.0F);
    if (this.caretPosition == LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM)
    {
      localPath.lineTo((paramFloat3 - paramFloat1 + this.caretWidth) / 2.0F + paramFloat1, paramFloat4);
      localPath.lineTo((paramFloat3 - paramFloat1) / 2.0F + paramFloat1, this.caretHeight + paramFloat4);
      localPath.lineTo((paramFloat3 - paramFloat1 - this.caretWidth) / 2.0F + paramFloat1, paramFloat4);
    }
    localPath.lineTo(this.borderRadius + paramFloat1, paramFloat4);
    localPath.addArc(new RectF(paramFloat1, paramFloat4 - f, f + paramFloat1, paramFloat4), 90.0F, 90.0F);
    if (this.caretPosition == LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT)
    {
      localPath.lineTo(paramFloat1, (paramFloat4 - paramFloat2 + this.caretWidth) / 2.0F + paramFloat2);
      localPath.lineTo(paramFloat1 - this.caretHeight, (paramFloat4 - paramFloat2) / 2.0F + paramFloat2);
      localPath.lineTo(paramFloat1, (paramFloat4 - paramFloat2 - this.caretWidth) / 2.0F + paramFloat2);
    }
    localPath.lineTo(paramFloat1, this.borderRadius + paramFloat2);
    paramCanvas.drawPath(localPath, this.borderPaint);
    AppMethodBeat.o(97083);
  }

  private void initialize(Context paramContext)
  {
    AppMethodBeat.i(97080);
    setWillNotDraw(false);
    this.caretHeight = getResources().getDimension(2131428237);
    this.caretWidth = getResources().getDimension(2131428238);
    this.borderRadius = getResources().getDimension(2131428235);
    this.borderPaint = new Paint();
    this.borderPaint.setColor(getResources().getColor(2131689903));
    this.borderPaint.setStrokeWidth(getResources().getDimension(2131428236));
    this.borderPaint.setStyle(Paint.Style.STROKE);
    initializeLikeCountLabel(paramContext);
    addView(this.likeCountLabel);
    setCaretPosition(this.caretPosition);
    AppMethodBeat.o(97080);
  }

  private void initializeLikeCountLabel(Context paramContext)
  {
    AppMethodBeat.i(97081);
    this.likeCountLabel = new TextView(paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    this.likeCountLabel.setLayoutParams(paramContext);
    this.likeCountLabel.setGravity(17);
    this.likeCountLabel.setTextSize(0, getResources().getDimension(2131428240));
    this.likeCountLabel.setTextColor(getResources().getColor(2131689904));
    this.textPadding = getResources().getDimensionPixelSize(2131428239);
    this.additionalTextPadding = getResources().getDimensionPixelSize(2131428237);
    AppMethodBeat.o(97081);
  }

  private void setAdditionalTextPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(97082);
    this.likeCountLabel.setPadding(this.textPadding + paramInt1, this.textPadding + paramInt2, this.textPadding + paramInt3, this.textPadding + paramInt4);
    AppMethodBeat.o(97082);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(97079);
    super.onDraw(paramCanvas);
    int i = getPaddingTop();
    int j = getPaddingLeft();
    int k = getWidth() - getPaddingRight();
    int m = getHeight() - getPaddingBottom();
    switch (LikeBoxCountView.1.$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[this.caretPosition.ordinal()])
    {
    default:
    case 4:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      drawBorder(paramCanvas, j, i, k, m);
      AppMethodBeat.o(97079);
      return;
      m = (int)(m - this.caretHeight);
      continue;
      j = (int)(j + this.caretHeight);
      continue;
      i = (int)(i + this.caretHeight);
      continue;
      k = (int)(k - this.caretHeight);
    }
  }

  @Deprecated
  public void setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition paramLikeBoxCountViewCaretPosition)
  {
    AppMethodBeat.i(97078);
    this.caretPosition = paramLikeBoxCountViewCaretPosition;
    switch (LikeBoxCountView.1.$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[paramLikeBoxCountViewCaretPosition.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(97078);
      while (true)
      {
        return;
        setAdditionalTextPadding(this.additionalTextPadding, 0, 0, 0);
        AppMethodBeat.o(97078);
        continue;
        setAdditionalTextPadding(0, this.additionalTextPadding, 0, 0);
        AppMethodBeat.o(97078);
        continue;
        setAdditionalTextPadding(0, 0, this.additionalTextPadding, 0);
        AppMethodBeat.o(97078);
      }
      setAdditionalTextPadding(0, 0, 0, this.additionalTextPadding);
    }
  }

  @Deprecated
  public void setText(String paramString)
  {
    AppMethodBeat.i(97077);
    this.likeCountLabel.setText(paramString);
    AppMethodBeat.o(97077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeBoxCountView
 * JD-Core Version:    0.6.2
 */