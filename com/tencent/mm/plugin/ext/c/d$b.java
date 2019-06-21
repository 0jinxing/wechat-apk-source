package com.tencent.mm.plugin.ext.c;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d$b
{
  int aIV;
  int aIW;
  byte[] cLa;
  public String cvZ;
  Rect lQX;
  int rotate;

  public d$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, Rect paramRect, String paramString)
  {
    this.cLa = paramArrayOfByte;
    this.aIV = paramInt1;
    this.aIW = paramInt2;
    this.rotate = paramInt3;
    this.lQX = paramRect;
    this.cvZ = paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(20413);
    StringBuilder localStringBuilder = new StringBuilder("RetrieveResult{yuvDataLength=");
    if (this.cLa != null);
    for (Object localObject = Integer.valueOf(this.cLa.length); ; localObject = "null")
    {
      localObject = localObject + ", previewWidth=" + this.aIV + ", previewHeight=" + this.aIW + ", rotate=" + this.rotate + ", scanRect=" + this.lQX + ", md5=" + this.cvZ + '}';
      AppMethodBeat.o(20413);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.d.b
 * JD-Core Version:    0.6.2
 */