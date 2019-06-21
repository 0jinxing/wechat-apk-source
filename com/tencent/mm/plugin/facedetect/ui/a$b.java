package com.tencent.mm.plugin.facedetect.ui;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public final class a$b extends CountDownTimer
{
  WeakReference<TextView> lWO = null;
  WeakReference<TextView> lWP = null;
  String lWQ = null;
  int lWR = 0;
  int lWS = 0;

  public a$b()
  {
    super(9223372036854775807L, 500L);
  }

  public final void onFinish()
  {
  }

  public final void onTick(long paramLong)
  {
    AppMethodBeat.i(385);
    if ((this.lWO != null) && (this.lWO.get() != null) && (this.lWP != null) && (this.lWP.get() != null))
    {
      TextView localTextView1 = (TextView)this.lWO.get();
      TextView localTextView2 = (TextView)this.lWP.get();
      localTextView1.setText(this.lWQ.substring(0, this.lWR));
      localTextView2.setText(this.lWQ.substring(this.lWR, this.lWR + this.lWS % (this.lWQ.length() - this.lWR + 1)));
    }
    while (true)
    {
      this.lWS += 1;
      AppMethodBeat.o(385);
      return;
      ab.w("MicroMsg.FaceDetectJumper", "hy: tv ref released");
      cancel();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.a.b
 * JD-Core Version:    0.6.2
 */