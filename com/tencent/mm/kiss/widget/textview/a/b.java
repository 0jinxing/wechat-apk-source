package com.tencent.mm.kiss.widget.textview.a;

import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public a eNR;

  public static b ST()
  {
    AppMethodBeat.i(105816);
    b localb = new b();
    localb.eNR = new a();
    AppMethodBeat.o(105816);
    return localb;
  }

  public final b SU()
  {
    this.eNR.maxLines = 6;
    return this;
  }

  public final b a(TextUtils.TruncateAt paramTruncateAt)
  {
    this.eNR.eND = paramTruncateAt;
    return this;
  }

  public final b ad(float paramFloat)
  {
    this.eNR.eOg = paramFloat;
    return this;
  }

  public final b jU(int paramInt)
  {
    this.eNR.gravity = paramInt;
    return this;
  }

  public final b jV(int paramInt)
  {
    this.eNR.textColor = paramInt;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.a.b
 * JD-Core Version:    0.6.2
 */