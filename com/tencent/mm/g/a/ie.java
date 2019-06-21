package com.tencent.mm.g.a;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.storage.bi;

public final class ie extends b
{
  public a cDf;
  public ie.b cDg;

  public ie()
  {
    this((byte)0);
  }

  private ie(byte paramByte)
  {
    AppMethodBeat.i(113284);
    this.cDf = new a();
    this.cDg = new ie.b();
    this.xxG = false;
    this.callback = null;
    AppMethodBeat.o(113284);
  }

  public static final class a
  {
    public ImageView cDh;
    public ImageView cDi;
    public ProgressBar cDj;
    public int cDk;
    public bi csG;
    public int h;
    public int w;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.a.ie
 * JD-Core Version:    0.6.2
 */