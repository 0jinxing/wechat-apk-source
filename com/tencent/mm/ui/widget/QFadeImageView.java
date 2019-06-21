package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.memory.ui.QPictureView;

public class QFadeImageView extends QPictureView
{
  String key;
  long mSd;

  public QFadeImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public QFadeImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void D(long paramLong, String paramString)
  {
    this.mSd = paramLong;
    this.key = paramString;
  }

  public String getImageKey()
  {
    return this.key;
  }

  public long getStartTimeMillis()
  {
    return this.mSd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.QFadeImageView
 * JD-Core Version:    0.6.2
 */