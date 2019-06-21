package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.sdk.platformtools.az;
import java.util.HashMap;
import java.util.LinkedList;

public final class g
{
  private az fwL;
  protected f<String, Bitmap> mQK;
  public LinkedList<String> mQM;
  private boolean mQO;
  private int mScrollState;
  protected HashMap<String, Long> yVB;

  public g()
  {
    AppMethodBeat.i(32163);
    this.mQK = new b(4, new g.1(this), getClass());
    this.yVB = new HashMap();
    this.mQM = new LinkedList();
    this.fwL = new az(1, "chatting-image-gallery-preload-loader");
    this.mQO = false;
    this.mScrollState = 0;
    AppMethodBeat.o(32163);
  }

  public final void bCH()
  {
    AppMethodBeat.i(32164);
    this.mQK.a(new g.2(this));
    AppMethodBeat.o(32164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.g
 * JD-Core Version:    0.6.2
 */