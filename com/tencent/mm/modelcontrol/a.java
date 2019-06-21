package com.tencent.mm.modelcontrol;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  private static f[] fzF;

  static
  {
    AppMethodBeat.i(50591);
    fzF = null;
    f[] arrayOff = new f[2];
    fzF = arrayOff;
    arrayOff[0] = new f(0, 120, 540, 960, 30, 1200000, 1200000);
    fzF[1] = new f(120, 300, 360, 640, 24, 544000, 544000);
    AppMethodBeat.o(50591);
  }

  public static int a(f[] paramArrayOff, VideoTransPara paramVideoTransPara1, VideoTransPara paramVideoTransPara2)
  {
    AppMethodBeat.i(50590);
    f[] arrayOff;
    if (paramArrayOff != null)
      arrayOff = paramArrayOff;
    try
    {
      if (paramArrayOff.length <= 0)
        arrayOff = fzF;
      i = arrayOff.length;
      paramVideoTransPara2.width = paramVideoTransPara1.width;
      paramVideoTransPara2.height = paramVideoTransPara1.height;
      paramVideoTransPara2.fps = paramVideoTransPara1.fps;
      paramVideoTransPara2.videoBitrate = paramVideoTransPara1.videoBitrate;
      paramVideoTransPara2.duration = paramVideoTransPara1.duration;
      int j;
      label89: label100: int n;
      int i1;
      label140: int i2;
      if (paramVideoTransPara1.width > paramVideoTransPara1.height)
      {
        j = 1;
        if (j == 0)
          break label460;
        k = paramVideoTransPara1.width;
        if (j == 0)
          break label469;
        m = paramVideoTransPara1.height;
        n = paramVideoTransPara1.duration;
        if ((paramVideoTransPara2.duration >= arrayOff[(i - 1)].fzZ) && (paramVideoTransPara2.duration >= fzF[1].fzZ))
          break label925;
        i1 = 0;
        if (i1 >= i)
          break label530;
        if ((n < arrayOff[i1].fzY) || (n >= arrayOff[i1].fzZ))
          break label524;
        i2 = arrayOff[i1].fAa;
        n = arrayOff[i1].fAb;
        if ((k <= i2) && (m <= n))
          break label977;
        if (k * n <= m * i2)
          break label478;
        i = 1;
        label219: if (i == 0)
          break label484;
        k = m * i2 / k;
        m = i2;
        label238: m = m + 8 >> 4 << 4;
        k = k + 8 >> 4 << 4;
        if (j == 0)
          break label501;
        i = m;
        label269: paramVideoTransPara2.width = i;
        if (j == 0)
          break label508;
        label280: paramVideoTransPara2.height = k;
        if (paramVideoTransPara2.fps <= arrayOff[i1].fAc)
          break label515;
        k = arrayOff[i1].fAc;
        label309: paramVideoTransPara2.fps = k;
        paramVideoTransPara2.videoBitrate = ((int)((arrayOff[i1].fAd * arrayOff[i1].fzZ + arrayOff[i1].fAe * paramVideoTransPara2.duration - arrayOff[i1].fAd * paramVideoTransPara2.duration - arrayOff[i1].fAe * arrayOff[i1].fzY) / (arrayOff[i1].fzZ - arrayOff[i1].fzY) * Math.sqrt(1.0D * (paramVideoTransPara2.width * paramVideoTransPara2.height) / (arrayOff[i1].fAa * arrayOff[i1].fAb)) * (paramVideoTransPara2.fps + 10) / 40.0D));
        k = paramVideoTransPara2.videoBitrate;
      }
      while (true)
      {
        AppMethodBeat.o(50590);
        return k;
        j = 0;
        break;
        label460: k = paramVideoTransPara1.height;
        break label89;
        label469: m = paramVideoTransPara1.width;
        break label100;
        label478: i = 0;
        break label219;
        label484: m = k * n / m;
        k = n;
        break label238;
        label501: i = k;
        break label269;
        label508: k = m;
        break label280;
        label515: k = paramVideoTransPara2.fps;
        break label309;
        label524: i1++;
        break label140;
        label530: for (i1 = 0; ; i1++)
        {
          if (i1 >= 2)
            break label925;
          if ((n >= fzF[i1].fzY) && (n < fzF[i1].fzZ))
          {
            n = fzF[i1].fAa;
            i2 = fzF[i1].fAb;
            if ((k <= n) && (m <= i2))
              break label962;
            if (k * i2 > m * n)
            {
              i = 1;
              label619: if (i == 0)
                break label879;
              k = m * n / k;
              m = n;
              label638: m = m + 8 >> 4 << 4;
              k = k + 8 >> 4 << 4;
              if (j == 0)
                break label896;
              i = m;
              label669: paramVideoTransPara2.width = i;
              if (j == 0)
                break label903;
              label680: paramVideoTransPara2.height = k;
              if (paramVideoTransPara2.fps <= fzF[i1].fAc)
                break label910;
            }
            for (k = fzF[i1].fAc; ; k = paramVideoTransPara2.fps)
            {
              paramVideoTransPara2.fps = k;
              paramVideoTransPara2.videoBitrate = ((int)((fzF[i1].fAd * fzF[i1].fzZ + fzF[i1].fAe * paramVideoTransPara2.duration - fzF[i1].fAd * paramVideoTransPara2.duration - fzF[i1].fAe * fzF[i1].fzY) / (fzF[i1].fzZ - fzF[i1].fzY) * Math.sqrt(1.0D * (paramVideoTransPara2.width * paramVideoTransPara2.height) / (fzF[i1].fAa * fzF[i1].fAb)) * (paramVideoTransPara2.fps + 10) / 40.0D));
              k = paramVideoTransPara2.videoBitrate;
              break;
              i = 0;
              break label619;
              label879: m = k * i2 / m;
              k = i2;
              break label638;
              i = k;
              break label669;
              k = m;
              break label680;
            }
          }
        }
        label896: label903: label910: label925: k = 0;
      }
    }
    catch (Exception paramArrayOff)
    {
      while (true)
      {
        ab.e("MicroMsg.BitrateCalculator", "do calc bitrate error: " + paramArrayOff.toString());
        int k = 0;
        continue;
        label962: int i = m;
        int m = k;
        k = i;
        continue;
        label977: i = k;
        k = m;
        m = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcontrol.a
 * JD-Core Version:    0.6.2
 */