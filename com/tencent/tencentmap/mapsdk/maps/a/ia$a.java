package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

class ia$a
{
  private Bitmap a;
  private TextPaint b;
  private int c;
  private int d;
  private int e;
  private HashMap<String, Integer> f;

  private ia$a()
  {
    AppMethodBeat.i(99745);
    this.a = null;
    this.b = null;
    this.c = 900;
    this.d = 180;
    this.e = -1;
    this.f = new HashMap();
    AppMethodBeat.o(99745);
  }

  void a()
  {
    AppMethodBeat.i(99746);
    if ((this.a != null) && (!this.a.isRecycled()))
    {
      this.a.recycle();
      this.a = null;
    }
    AppMethodBeat.o(99746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ia.a
 * JD-Core Version:    0.6.2
 */