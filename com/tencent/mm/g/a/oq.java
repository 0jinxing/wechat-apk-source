package com.tencent.mm.g.a;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.r;
import com.tencent.mm.sdk.b.b;

public final class oq extends b
{
  public a cKZ;

  public oq()
  {
    this((byte)0);
  }

  private oq(byte paramByte)
  {
    AppMethodBeat.i(28);
    this.cKZ = new a();
    this.xxG = false;
    this.callback = null;
    AppMethodBeat.o(28);
  }

  public static final class a
  {
    public byte[] cLa;
    public Rect cLb;
    public r cLc;
    public int height = -1;
    public int rotate = 90;
    public int width = -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.a.oq
 * JD-Core Version:    0.6.2
 */