package com.tencent.mm.plugin.voip.video;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;

public final class k
{
  public ArrayList<k.a> jFO;
  public int mRotateAngle;
  public v2protocal sSz;
  public int tbA;
  public boolean tby;
  public int tbz;

  public k()
  {
    AppMethodBeat.i(5116);
    this.tby = false;
    this.mRotateAngle = 0;
    this.jFO = new ArrayList();
    this.sSz = new v2protocal(new ak(Looper.myLooper()));
    AppMethodBeat.o(5116);
  }

  public final void a(k.a parama)
  {
    AppMethodBeat.i(5117);
    if (this.jFO.contains(parama))
      this.jFO.remove(parama);
    AppMethodBeat.o(5117);
  }

  public final class b
  {
    public int tbB;
    public int tbC;
    public int tbD;
    public int tbE;

    public b()
    {
    }

    public final String toString()
    {
      AppMethodBeat.i(5115);
      String str = String.format("topLeftX:%d, topLeftY:%d, rightBottomX:%d, rightBottomY:%d", new Object[] { Integer.valueOf(this.tbB), Integer.valueOf(this.tbC), Integer.valueOf(this.tbD), Integer.valueOf(this.tbE) });
      AppMethodBeat.o(5115);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.k
 * JD-Core Version:    0.6.2
 */