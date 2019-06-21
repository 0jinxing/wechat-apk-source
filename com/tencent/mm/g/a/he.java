package com.tencent.mm.g.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.b;

public final class he extends b
{
  public a cBW;
  public he.b cBX;

  public he()
  {
    this((byte)0);
  }

  private he(byte paramByte)
  {
    AppMethodBeat.i(135758);
    this.cBW = new a();
    this.cBX = new he.b();
    this.xxG = false;
    this.callback = null;
    AppMethodBeat.o(135758);
  }

  public static final class a
  {
    public int actionCode;
    public Bundle cBY;
    public Context context;
    public String result;
    public String username;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.a.he
 * JD-Core Version:    0.6.2
 */