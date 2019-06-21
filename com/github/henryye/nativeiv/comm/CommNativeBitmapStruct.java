package com.github.henryye.nativeiv.comm;

import android.support.annotation.Keep;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;

@Keep
class CommNativeBitmapStruct extends NativeBitmapStruct
{

  @Keep
  private int nConfig = -1;

  public CommNativeBitmapStruct convertToCommonStruct()
  {
    int i = 0;
    int j = 5121;
    int k = this.nConfig;
    int m;
    if (k == 4)
    {
      m = j;
      this.glType = m;
      j = this.nConfig;
      if (j != 4)
        break label70;
      m = 6408;
    }
    while (true)
    {
      this.glFormat = m;
      return this;
      m = j;
      if (k == 3)
        break;
      m = j;
      if (k == 2)
        break;
      m = 0;
      break;
      label70: if (j == 3)
      {
        m = 6407;
      }
      else
      {
        m = i;
        if (j == 2)
          m = 6406;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.comm.CommNativeBitmapStruct
 * JD-Core Version:    0.6.2
 */