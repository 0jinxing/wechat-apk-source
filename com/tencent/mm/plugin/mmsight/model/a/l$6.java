package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class l$6 extends ak
{
  l$6(l paraml, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(76599);
    if (this.owx.owt == -1)
    {
      this.owx.owt = Process.myTid();
      ab.i("MicroMsg.MMSightFFMpegRecorder", "writeCameraTid: %s", new Object[] { Integer.valueOf(this.owx.owt) });
    }
    l locall;
    byte[] arrayOfByte;
    int i;
    int j;
    int k;
    if (paramMessage.what == 1)
    {
      this.owx.own.bPM();
      locall = this.owx;
      arrayOfByte = (byte[])paramMessage.obj;
      if (!locall.ouL)
        break label150;
      paramMessage = locall.owo;
      i = arrayOfByte.length;
      j = locall.fcO;
      k = locall.fcP;
    }
    label150: int m;
    while (true)
    {
      paramMessage.ovu = bo.yz();
      if (paramMessage.owR >= 0)
        break;
      ab.e("MicroMsg.MMSightX264YUVRecorder", "write data error, yuv buffer id error");
      j.owk.g(arrayOfByte);
      locall.fda = true;
      AppMethodBeat.o(76599);
      return;
      paramMessage = locall.owo;
      i = arrayOfByte.length;
      if ((locall.fcR == 0) || (locall.fcR == 180));
      for (k = locall.fcO; ; k = locall.fcP)
      {
        if ((locall.fcR != 0) && (locall.fcR != 180))
          break label225;
        m = locall.fcP;
        j = k;
        k = m;
        break;
      }
      label225: m = locall.fcO;
      j = k;
      k = m;
    }
    label655: label662: 
    while (true)
    {
      int n;
      int i1;
      int i2;
      int i3;
      boolean bool2;
      try
      {
        paramMessage.frameCount += 1;
        n = paramMessage.owS;
        bool1 = paramMessage.ouL;
        if (bool1)
          break label549;
        if ((paramMessage.owT == -1) || (paramMessage.owT == paramMessage.owS))
          break label543;
        bool1 = true;
        m = paramMessage.owT;
        if (paramMessage.owS <= 180)
        {
          m -= paramMessage.owS;
          n = Math.max(0, m);
          if (n < 360)
            break label723;
          m = 0;
          n = m;
          SightVideoJNI.setRotateForBufId(paramMessage.owR, n);
          if (!bool1)
            break label584;
          if ((n != 0) && (n != 180))
            break label575;
          m = paramMessage.eTi;
          if (!bool1)
            break label624;
          if ((n != 0) && (n != 180))
            break label615;
          i1 = paramMessage.eTj;
          if (!bool1)
            break label662;
          if ((n != 0) && (n != 180))
            break label655;
          i2 = j;
          if (!bool1)
            break label689;
          if (n != 0)
          {
            i3 = j;
            if (n != 180);
          }
          else
          {
            i3 = k;
          }
          if ((i2 != m) || (i3 != i1))
            break label717;
          bool2 = false;
          SightVideoJNI.writeYuvDataForMMSight(paramMessage.owR, arrayOfByte, i, m, i1, bool1, bool2, i2, i3);
          ab.d("MicroMsg.MMSightX264YUVRecorder", "write data use %dms", new Object[] { Long.valueOf(bo.az(paramMessage.ovu)) });
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(76599);
      }
      m += 360 - paramMessage.owS;
      continue;
      label543: boolean bool1 = false;
      continue;
      label549: label689: if (paramMessage.owT == -1)
      {
        m = paramMessage.owS;
      }
      else
      {
        m = paramMessage.owT;
        continue;
        label575: m = paramMessage.eTj;
        continue;
        label584: label717: label723: if ((n == 0) || (n == 180))
        {
          m = paramMessage.eTj;
        }
        else
        {
          m = paramMessage.eTi;
          continue;
          label615: i1 = paramMessage.eTi;
          continue;
          label624: if ((n == 0) || (n == 180))
          {
            i1 = paramMessage.eTi;
          }
          else
          {
            i1 = paramMessage.eTj;
            continue;
            i2 = k;
            continue;
            if ((n == 0) || (n == 180))
            {
              i2 = k;
            }
            else
            {
              i2 = j;
              continue;
              i3 = j;
              if (n != 0)
              {
                i3 = j;
                if (n != 180)
                {
                  i3 = k;
                  continue;
                  bool2 = true;
                  continue;
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.l.6
 * JD-Core Version:    0.6.2
 */