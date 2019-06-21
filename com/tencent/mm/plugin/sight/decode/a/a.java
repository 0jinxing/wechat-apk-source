package com.tencent.mm.plugin.sight.decode.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;

public abstract interface a
{
  public abstract void bf(String paramString, boolean paramBoolean);

  public abstract void ckX();

  public abstract boolean ckY();

  public abstract void clear();

  public abstract void fi(int paramInt1, int paramInt2);

  public abstract Object getTagObject();

  public abstract Context getUIContext();

  public abstract String getVideoPath();

  public abstract void setCanPlay(boolean paramBoolean);

  public abstract void setDrawableWidth(int paramInt);

  public abstract void setForceRecordState(boolean paramBoolean);

  public abstract void setOnCompletionListener(b.e parame);

  public abstract void setOnDecodeDurationListener(b.f paramf);

  public abstract void setOnSightCompletionAction(b.g paramg);

  public abstract void setPosition(int paramInt);

  public abstract void setSightInfoView(TextView paramTextView);

  public abstract void setTagObject(Object paramObject);

  public abstract void setThumbBmp(Bitmap paramBitmap);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.a
 * JD-Core Version:    0.6.2
 */