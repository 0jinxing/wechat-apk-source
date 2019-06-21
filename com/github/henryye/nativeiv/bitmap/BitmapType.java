package com.github.henryye.nativeiv.bitmap;

import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Keep
public enum BitmapType
{
  static
  {
    AppMethodBeat.i(115756);
    Native = new BitmapType("Native", 0);
    Legacy = new BitmapType("Legacy", 1);
    Undefined = new BitmapType("Undefined", 2);
    $VALUES = new BitmapType[] { Native, Legacy, Undefined };
    AppMethodBeat.o(115756);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.bitmap.BitmapType
 * JD-Core Version:    0.6.2
 */