package com.tencent.smtt.export.external.interfaces;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IX5WebViewBase$HitTestResult$ImageAnchorData
{
  public String mAHref;
  public Bitmap mBmp;
  public String mPicUrl;
  public long mRawDataSize;

  public IX5WebViewBase$HitTestResult$ImageAnchorData(IX5WebViewBase.HitTestResult paramHitTestResult)
  {
  }

  public Bitmap getBitmap()
  {
    AppMethodBeat.i(63816);
    Bitmap localBitmap = this.this$0.getBitmapData();
    AppMethodBeat.o(63816);
    return localBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult.ImageAnchorData
 * JD-Core Version:    0.6.2
 */