package com.tencent.mm.plugin.facedetect.d;

import android.os.CountDownTimer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;

final class d$2 extends CountDownTimer
{
  d$2(d paramd)
  {
    super(9223372036854775807L, 1000L);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(311);
    ab.i("MicroMsg.NumberFaceMotion", "hy: on count number finished");
    AppMethodBeat.o(311);
  }

  public final void onTick(long paramLong)
  {
    AppMethodBeat.i(310);
    ab.i("MicroMsg.NumberFaceMotion", "hy: on ticked");
    if (this.lVO.eTf)
    {
      ab.w("MicroMsg.NumberFaceMotion", "hy: isEnd. trigger cancel");
      cancel();
      AppMethodBeat.o(310);
    }
    while (true)
    {
      return;
      if (this.lVO.lVB)
      {
        ab.i("MicroMsg.NumberFaceMotion", "hy: suspend.");
        AppMethodBeat.o(310);
      }
      else
      {
        ab.i("MicroMsg.NumberFaceMotion", "hy: mCurrentShowedIndexInItem: %d, mItemDatas[mCurrentGroupDataIndex].length() - 1: %d, mCurrentGroupDataIndex: %d, mItemDatas.length - 1 : %d", new Object[] { Integer.valueOf(this.lVO.lVw), Integer.valueOf(this.lVO.lVu[this.lVO.lVv].length() - 1), Integer.valueOf(this.lVO.lVv), Integer.valueOf(this.lVO.lVu.length - 1) });
        if (this.lVO.lVw < this.lVO.lVu[this.lVO.lVv].length() - 1)
        {
          d locald = this.lVO;
          locald.lVw += 1;
          this.lVO.lVL.sendEmptyMessage(0);
          AppMethodBeat.o(310);
        }
        else
        {
          ab.i("MicroMsg.NumberFaceMotion", "hy: last number in group");
          al.n(this.lVO.lVN, 1500L);
          this.lVO.eTf = true;
          cancel();
          this.lVO.eTf = true;
          AppMethodBeat.o(310);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.d.2
 * JD-Core Version:    0.6.2
 */