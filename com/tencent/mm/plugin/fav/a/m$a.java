package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum m$a
{
  private int value = 0;

  static
  {
    AppMethodBeat.i(102687);
    mfs = new a("PlayIcon", 0, 1);
    mft = new a("EnterFullScreen", 1, 2);
    mfu = new a("EnterCompleteVideo", 2, 3);
    mfv = new a("DetailInVideo", 3, 4);
    mfw = new a("LeavelFullScreen", 4, 5);
    mfx = new a("LeaveCompleteVideo", 5, 6);
    mfy = new a("SightLoaded", 6, 7);
    mfz = new a[] { mfs, mft, mfu, mfv, mfw, mfx, mfy };
    AppMethodBeat.o(102687);
  }

  private m$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.m.a
 * JD-Core Version:    0.6.2
 */