package com.tencent.mm.g.a;

import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ij extends com.tencent.mm.sdk.b.b
{
  public a cDv;

  public ij()
  {
    this((byte)0);
  }

  private ij(byte paramByte)
  {
    AppMethodBeat.i(105574);
    this.cDv = new a();
    this.xxG = false;
    this.callback = null;
    AppMethodBeat.o(105574);
  }

  public static final class a
  {
    public com.tencent.mm.protocal.b.a.b cDw;
    public DialogInterface.OnClickListener cDx;
    public DialogInterface.OnClickListener cDy;
    public int type = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.a.ij
 * JD-Core Version:    0.6.2
 */