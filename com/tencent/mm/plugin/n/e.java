package com.tencent.mm.plugin.n;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.util.Range;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class e
{
  private static long ors = 0L;

  private static String a(MediaCodecInfo paramMediaCodecInfo)
  {
    AppMethodBeat.i(117869);
    String[] arrayOfString = paramMediaCodecInfo.getSupportedTypes();
    int i = 0;
    if (i < arrayOfString.length)
    {
      paramMediaCodecInfo = arrayOfString[i];
      if ((!bo.isNullOrNil(paramMediaCodecInfo)) && (paramMediaCodecInfo.contains("hevc")))
        AppMethodBeat.o(117869);
    }
    while (true)
    {
      return paramMediaCodecInfo;
      i++;
      break;
      paramMediaCodecInfo = "";
      AppMethodBeat.o(117869);
    }
  }

  @TargetApi(21)
  public static boolean bOS()
  {
    boolean bool1 = false;
    AppMethodBeat.i(117865);
    try
    {
      if (d.iW(21))
      {
        Object localObject = new android/media/MediaCodecList;
        ((MediaCodecList)localObject).<init>(1);
        MediaCodecInfo[] arrayOfMediaCodecInfo = ((MediaCodecList)localObject).getCodecInfos();
        int i = arrayOfMediaCodecInfo.length;
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        for (int j = 0; j < i; j++)
        {
          String str = a(arrayOfMediaCodecInfo[j]);
          if (!bo.isNullOrNil(str))
          {
            ((ArrayList)localObject).add(Integer.valueOf(j));
            localArrayList.add(str);
          }
        }
        boolean bool2 = ((ArrayList)localObject).isEmpty();
        if (bool2)
          AppMethodBeat.o(117865);
      }
      while (true)
      {
        return bool1;
        AppMethodBeat.o(117865);
        bool1 = true;
        continue;
        AppMethodBeat.o(117865);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecUtil", localException, "isSupportHevc error", new Object[0]);
        AppMethodBeat.o(117865);
      }
    }
  }

  public static boolean bOT()
  {
    AppMethodBeat.i(117866);
    boolean bool;
    if (bo.gb(ors) > 86400000L)
    {
      bool = true;
      AppMethodBeat.o(117866);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117866);
    }
  }

  public static String bOU()
  {
    AppMethodBeat.i(117867);
    ab.d("MicroMsg.MediaCodecUtil", "check hevc info last rpt time[%d]", new Object[] { Long.valueOf(ors) });
    try
    {
      ors = bo.anU();
      if (d.iW(21))
      {
        long l = bo.yz();
        Object localObject1 = new android/media/MediaCodecList;
        ((MediaCodecList)localObject1).<init>(1);
        MediaCodecInfo[] arrayOfMediaCodecInfo = ((MediaCodecList)localObject1).getCodecInfos();
        int i = arrayOfMediaCodecInfo.length;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        for (int j = 0; j < i; j++)
        {
          localObject1 = a(arrayOfMediaCodecInfo[j]);
          if (!bo.isNullOrNil((String)localObject1))
          {
            localArrayList.add(Integer.valueOf(j));
            ((ArrayList)localObject2).add(localObject1);
          }
        }
        if (localArrayList.isEmpty())
        {
          localObject1 = "";
          AppMethodBeat.o(117867);
          return localObject1;
        }
        boolean bool = false;
        i = 0;
        int k = 0;
        m = 0;
        int n = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        j = 0;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        int i7 = 0;
        if (i7 < localArrayList.size())
        {
          int i8 = ((Integer)localArrayList.get(i7)).intValue();
          Object localObject3 = (String)((ArrayList)localObject2).get(i7);
          bool = arrayOfMediaCodecInfo[i8].isEncoder();
          if (!arrayOfMediaCodecInfo[i8].isEncoder())
          {
            i = 1;
            label264: localObject3 = arrayOfMediaCodecInfo[i8].getCapabilitiesForType((String)localObject3);
            if (localObject3 == null)
              break label493;
            k = 1;
            localObject3 = ((MediaCodecInfo.CodecCapabilities)localObject3).getVideoCapabilities();
            if (localObject3 == null)
              break label875;
            n = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getBitrateRange().getLower()).intValue(), n);
            i1 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getBitrateRange().getUpper()).intValue(), i1);
            i2 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedFrameRates().getLower()).intValue(), i2);
            i3 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedFrameRates().getUpper()).intValue(), i3);
            i4 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedWidths().getLower()).intValue(), i4);
            i5 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedWidths().getUpper()).intValue(), i5);
            i6 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedHeights().getLower()).intValue(), i6);
            j = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedHeights().getUpper()).intValue(), j);
            localStringBuilder.append(arrayOfMediaCodecInfo[i8].getName()).append("|");
          }
          while (true)
          {
            i7++;
            break;
            i = 0;
            break label264;
            label493: m = 1;
            ((StringBuilder)localObject1).append(arrayOfMediaCodecInfo[i8].getName()).append("|");
          }
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append(1).append(",");
        if ((i != 0) && (bool))
          ((StringBuilder)localObject2).append(3).append(",");
        while (true)
        {
          if ((k == 0) || (m == 0))
            break label828;
          ((StringBuilder)localObject2).append(3).append(",");
          ((StringBuilder)localObject2).append(localStringBuilder.toString()).append(",");
          ((StringBuilder)localObject2).append(((StringBuilder)localObject1).toString()).append(",");
          ((StringBuilder)localObject2).append(n).append(",").append(i1).append(",");
          ((StringBuilder)localObject2).append(i2).append(",").append(i3).append(",");
          ((StringBuilder)localObject2).append(i4).append(",").append(i5).append(",");
          ((StringBuilder)localObject2).append(i6).append(",").append(j);
          localObject1 = ((StringBuilder)localObject2).toString();
          ab.i("MicroMsg.MediaCodecUtil", "high api 21 cost[%d] hevc info %s", new Object[] { Long.valueOf(bo.az(l)), localObject1 });
          AppMethodBeat.o(117867);
          break;
          if (!bool)
            break label790;
          ((StringBuilder)localObject2).append(2).append(",");
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecUtil", localException, "report hevc info error %s", new Object[] { localException.toString() });
        String str1 = "";
        AppMethodBeat.o(117867);
        continue;
        ((StringBuilder)localObject2).append(1).append(",");
      }
    }
    catch (Throwable localThrowable)
    {
      label790: label828: label875: 
      while (true)
      {
        Object localObject2;
        int m;
        ab.printErrStackTrace("MicroMsg.MediaCodecUtil", localThrowable, "report hevc info error %s", new Object[] { localThrowable.toString() });
        continue;
        if (m != 0)
        {
          ((StringBuilder)localObject2).append(2).append(",");
        }
        else
        {
          ((StringBuilder)localObject2).append(1).append(",");
          continue;
          String str2 = bOV();
          AppMethodBeat.o(117867);
        }
      }
    }
  }

  private static String bOV()
  {
    AppMethodBeat.i(117868);
    long l = bo.yz();
    int i = MediaCodecList.getCodecCount();
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      localObject2 = a(MediaCodecList.getCodecInfoAt(j));
      if (!bo.isNullOrNil((String)localObject2))
      {
        localArrayList.add(Integer.valueOf(j));
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    if (localArrayList.isEmpty())
    {
      localObject2 = "";
      AppMethodBeat.o(117868);
      return localObject2;
    }
    boolean bool = false;
    j = 0;
    i = 0;
    int k = 0;
    Object localObject2 = new StringBuilder();
    StringBuilder localStringBuilder = new StringBuilder();
    int m = 0;
    if (m < localArrayList.size())
    {
      j = ((Integer)localArrayList.get(m)).intValue();
      String str = (String)((ArrayList)localObject1).get(m);
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(j);
      bool = localMediaCodecInfo.isEncoder();
      if (!localMediaCodecInfo.isEncoder())
      {
        j = 1;
        label192: if (localMediaCodecInfo.getCapabilitiesForType(str) == null)
          break label232;
        i = 1;
        ((StringBuilder)localObject2).append(localMediaCodecInfo.getName()).append("|");
      }
      while (true)
      {
        m++;
        break;
        j = 0;
        break label192;
        label232: k = 1;
        localStringBuilder.append(localMediaCodecInfo.getName()).append("|");
      }
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(1).append(",");
    if ((j != 0) && (bool))
    {
      ((StringBuilder)localObject1).append(3).append(",");
      label297: if ((i == 0) || (k == 0))
        break label421;
      ((StringBuilder)localObject1).append(3).append(",");
    }
    while (true)
    {
      ((StringBuilder)localObject1).append(((StringBuilder)localObject2).toString()).append(",");
      ((StringBuilder)localObject1).append(localStringBuilder.toString());
      localObject2 = ((StringBuilder)localObject1).toString();
      ab.i("MicroMsg.MediaCodecUtil", "below api 21 cost[%d] hevc info %s", new Object[] { Long.valueOf(bo.az(l)), localObject2 });
      AppMethodBeat.o(117868);
      break;
      if (bool)
      {
        ((StringBuilder)localObject1).append(2).append(",");
        break label297;
      }
      ((StringBuilder)localObject1).append(1).append(",");
      break label297;
      label421: if (k != 0)
        ((StringBuilder)localObject1).append(2).append(",");
      else
        ((StringBuilder)localObject1).append(1).append(",");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.e
 * JD-Core Version:    0.6.2
 */