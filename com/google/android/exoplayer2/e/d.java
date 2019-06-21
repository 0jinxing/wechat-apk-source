package com.google.android.exoplayer2.e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class d
{
  private static final a beN;
  private static final Pattern beO;
  private static final HashMap<d.a, List<a>> beP;
  private static final SparseIntArray beQ;
  private static final SparseIntArray beR;
  private static final Map<String, Integer> beS;
  private static int beT;

  static
  {
    AppMethodBeat.i(95256);
    beN = new a("OMX.google.raw.decoder", null, null, false, false);
    beO = Pattern.compile("^\\D?(\\d+)$");
    beP = new HashMap();
    beT = -1;
    Object localObject = new SparseIntArray();
    beQ = (SparseIntArray)localObject;
    ((SparseIntArray)localObject).put(66, 1);
    beQ.put(77, 2);
    beQ.put(88, 4);
    beQ.put(100, 8);
    localObject = new SparseIntArray();
    beR = (SparseIntArray)localObject;
    ((SparseIntArray)localObject).put(10, 1);
    beR.put(11, 4);
    beR.put(12, 8);
    beR.put(13, 16);
    beR.put(20, 32);
    beR.put(21, 64);
    beR.put(22, 128);
    beR.put(30, 256);
    beR.put(31, 512);
    beR.put(32, 1024);
    beR.put(40, 2048);
    beR.put(41, 4096);
    beR.put(42, 8192);
    beR.put(50, 16384);
    beR.put(51, 32768);
    beR.put(52, 65536);
    localObject = new HashMap();
    beS = (Map)localObject;
    ((Map)localObject).put("L30", Integer.valueOf(1));
    beS.put("L60", Integer.valueOf(4));
    beS.put("L63", Integer.valueOf(16));
    beS.put("L90", Integer.valueOf(64));
    beS.put("L93", Integer.valueOf(256));
    beS.put("L120", Integer.valueOf(1024));
    beS.put("L123", Integer.valueOf(4096));
    beS.put("L150", Integer.valueOf(16384));
    beS.put("L153", Integer.valueOf(65536));
    beS.put("L156", Integer.valueOf(262144));
    beS.put("L180", Integer.valueOf(1048576));
    beS.put("L183", Integer.valueOf(4194304));
    beS.put("L186", Integer.valueOf(16777216));
    beS.put("H30", Integer.valueOf(2));
    beS.put("H60", Integer.valueOf(8));
    beS.put("H63", Integer.valueOf(32));
    beS.put("H90", Integer.valueOf(128));
    beS.put("H93", Integer.valueOf(512));
    beS.put("H120", Integer.valueOf(2048));
    beS.put("H123", Integer.valueOf(8192));
    beS.put("H150", Integer.valueOf(32768));
    beS.put("H153", Integer.valueOf(131072));
    beS.put("H156", Integer.valueOf(524288));
    beS.put("H180", Integer.valueOf(2097152));
    beS.put("H183", Integer.valueOf(8388608));
    beS.put("H186", Integer.valueOf(33554432));
    AppMethodBeat.o(95256);
  }

  private static List<a> a(d.a parama, d.c paramc)
  {
    AppMethodBeat.i(95253);
    while (true)
    {
      int j;
      String str2;
      Object localObject;
      try
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        String str1 = parama.mimeType;
        int i = paramc.getCodecCount();
        boolean bool1 = paramc.rL();
        j = 0;
        if (j >= i)
          break label1130;
        MediaCodecInfo localMediaCodecInfo = paramc.getCodecInfoAt(j);
        str2 = localMediaCodecInfo.getName();
        int k;
        boolean bool2;
        if ((localMediaCodecInfo.isEncoder()) || ((!bool1) && (str2.endsWith(".secure"))))
        {
          k = 0;
          if (k == 0)
            break label1124;
          String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
          int m = arrayOfString.length;
          k = 0;
          if (k >= m)
            break label1124;
          localObject = arrayOfString[k];
          bool2 = ((String)localObject).equalsIgnoreCase(str1);
          if (!bool2);
        }
        try
        {
          MediaCodecInfo.CodecCapabilities localCodecCapabilities = localMediaCodecInfo.getCapabilitiesForType((String)localObject);
          boolean bool3 = paramc.a(str1, localCodecCapabilities);
          if ((v.SDK_INT <= 22) && ((v.MODEL.equals("ODROID-XU3")) || (v.MODEL.equals("Nexus 10"))) && (("OMX.Exynos.AVC.Decoder".equals(str2)) || ("OMX.Exynos.AVC.Decoder.secure".equals(str2))))
          {
            bool2 = true;
            if (((!bool1) || (parama.bdY != bool3)) && ((bool1) || (parama.bdY)))
              continue;
            localArrayList.add(a.a(str2, str1, localCodecCapabilities, bool2, false));
            k++;
            continue;
            if ((v.SDK_INT < 21) && (("CIPAACDecoder".equals(str2)) || ("CIPMP3Decoder".equals(str2)) || ("CIPVorbisDecoder".equals(str2)) || ("CIPAMRNBDecoder".equals(str2)) || ("AACDecoder".equals(str2)) || ("MP3Decoder".equals(str2))))
            {
              k = 0;
              continue;
            }
            if ((v.SDK_INT < 18) && ("OMX.SEC.MP3.Decoder".equals(str2)))
            {
              k = 0;
              continue;
            }
            if ((v.SDK_INT < 18) && ("OMX.MTK.AUDIO.DECODER.AAC".equals(str2)) && (("a70".equals(v.DEVICE)) || (("Xiaomi".equals(v.MANUFACTURER)) && (v.DEVICE.startsWith("HM")))))
            {
              k = 0;
              continue;
            }
            if ((v.SDK_INT == 16) && ("OMX.qcom.audio.decoder.mp3".equals(str2)) && (("dlxu".equals(v.DEVICE)) || ("protou".equals(v.DEVICE)) || ("ville".equals(v.DEVICE)) || ("villeplus".equals(v.DEVICE)) || ("villec2".equals(v.DEVICE)) || (v.DEVICE.startsWith("gee")) || ("C6602".equals(v.DEVICE)) || ("C6603".equals(v.DEVICE)) || ("C6606".equals(v.DEVICE)) || ("C6616".equals(v.DEVICE)) || ("L36h".equals(v.DEVICE)) || ("SO-02E".equals(v.DEVICE))))
            {
              k = 0;
              continue;
            }
            if ((v.SDK_INT == 16) && ("OMX.qcom.audio.decoder.aac".equals(str2)) && (("C1504".equals(v.DEVICE)) || ("C1505".equals(v.DEVICE)) || ("C1604".equals(v.DEVICE)) || ("C1605".equals(v.DEVICE))))
            {
              k = 0;
              continue;
            }
            if ((v.SDK_INT < 24) && (("OMX.SEC.aac.dec".equals(str2)) || ("OMX.Exynos.AAC.Decoder".equals(str2))) && (v.MANUFACTURER.equals("samsung")) && ((v.DEVICE.startsWith("zeroflte")) || (v.DEVICE.startsWith("zerolte")) || (v.DEVICE.startsWith("zenlte")) || (v.DEVICE.equals("SC-05G")) || (v.DEVICE.equals("marinelteatt")) || (v.DEVICE.equals("404SC")) || (v.DEVICE.equals("SC-04G")) || (v.DEVICE.equals("SCV31"))))
            {
              k = 0;
              continue;
            }
            if ((v.SDK_INT <= 19) && ("OMX.SEC.vp8.dec".equals(str2)) && ("samsung".equals(v.MANUFACTURER)) && ((v.DEVICE.startsWith("d2")) || (v.DEVICE.startsWith("serrano")) || (v.DEVICE.startsWith("jflte")) || (v.DEVICE.startsWith("santos")) || (v.DEVICE.startsWith("t0"))))
            {
              k = 0;
              continue;
            }
            if ((v.SDK_INT <= 19) && (v.DEVICE.startsWith("jflte")))
            {
              bool2 = "OMX.qcom.video.decoder.vp8".equals(str2);
              if (bool2)
              {
                k = 0;
                continue;
              }
            }
            k = 1;
            continue;
          }
          bool2 = false;
          continue;
          if ((bool1) || (!bool3))
            continue;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localArrayList.add(a.a(str2 + ".secure", str1, localCodecCapabilities, bool2, true));
          AppMethodBeat.o(95253);
          return localArrayList;
        }
        catch (Exception localException)
        {
          if (v.SDK_INT > 23)
            break label1081;
        }
        if (!localArrayList.isEmpty())
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("Skipping codec ");
          ((StringBuilder)localObject).append(str2).append(" (failed to query capabilities)");
          continue;
        }
      }
      catch (Exception parama)
      {
        parama = new d.b(parama, (byte)0);
        AppMethodBeat.o(95253);
        throw parama;
      }
      label1081: parama = new java/lang/StringBuilder;
      parama.<init>("Failed to query codec ");
      parama.append(str2).append(" (").append((String)localObject).append(")");
      AppMethodBeat.o(95253);
      throw localException;
      label1124: j++;
      continue;
      label1130: AppMethodBeat.o(95253);
    }
  }

  public static Pair<Integer, Integer> ay(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(95252);
    if (paramString == null)
    {
      AppMethodBeat.o(95252);
      paramString = null;
    }
    while (true)
    {
      label20: return paramString;
      Object localObject = paramString.split("\\.");
      paramString = localObject[0];
      switch (paramString.hashCode())
      {
      default:
        label80: i = -1;
      case 3199032:
      case 3214780:
      case 3006243:
      case 3006244:
      }
      while (true)
        switch (i)
        {
        default:
          AppMethodBeat.o(95252);
          paramString = null;
          break label20;
          if (!paramString.equals("hev1"))
            break label80;
          continue;
          if (!paramString.equals("hvc1"))
            break label80;
          i = 1;
          continue;
          if (!paramString.equals("avc1"))
            break label80;
          i = 2;
          continue;
          if (!paramString.equals("avc2"))
            break label80;
          i = 3;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      if (localObject.length < 4)
      {
        AppMethodBeat.o(95252);
        paramString = null;
      }
      else
      {
        paramString = beO.matcher(localObject[1]);
        if (!paramString.matches())
        {
          AppMethodBeat.o(95252);
          paramString = null;
        }
        else
        {
          String str = paramString.group(1);
          if ("1".equals(str));
          for (i = 1; ; i = 2)
          {
            localObject = (Integer)beS.get(localObject[3]);
            if (localObject != null)
              break label319;
            new StringBuilder("Unknown HEVC level string: ").append(paramString.group(1));
            AppMethodBeat.o(95252);
            paramString = null;
            break;
            if (!"2".equals(str))
              break label308;
          }
          label308: AppMethodBeat.o(95252);
          paramString = null;
          continue;
          label319: paramString = new Pair(Integer.valueOf(i), localObject);
          AppMethodBeat.o(95252);
          continue;
          paramString = e((String[])localObject);
          AppMethodBeat.o(95252);
        }
      }
    }
  }

  private static Pair<Integer, Integer> e(String[] paramArrayOfString)
  {
    AppMethodBeat.i(95255);
    if (paramArrayOfString.length < 2)
    {
      AppMethodBeat.o(95255);
      paramArrayOfString = null;
    }
    while (true)
    {
      return paramArrayOfString;
      Integer localInteger2;
      try
      {
        int i;
        if (paramArrayOfString[1].length() == 6)
        {
          localInteger1 = Integer.valueOf(Integer.parseInt(paramArrayOfString[1].substring(0, 2), 16));
          i = Integer.parseInt(paramArrayOfString[1].substring(4), 16);
        }
        for (paramArrayOfString = Integer.valueOf(i); ; paramArrayOfString = Integer.valueOf(i))
        {
          localInteger2 = Integer.valueOf(beQ.get(localInteger1.intValue()));
          if (localInteger2 != null)
            break label166;
          new StringBuilder("Unknown AVC profile: ").append(localInteger1);
          AppMethodBeat.o(95255);
          paramArrayOfString = null;
          break;
          if (paramArrayOfString.length < 3)
            break label143;
          localInteger1 = Integer.valueOf(Integer.parseInt(paramArrayOfString[1]));
          i = Integer.parseInt(paramArrayOfString[2]);
        }
        label143: AppMethodBeat.o(95255);
        paramArrayOfString = null;
      }
      catch (NumberFormatException paramArrayOfString)
      {
        AppMethodBeat.o(95255);
        paramArrayOfString = null;
      }
      continue;
      label166: Integer localInteger1 = Integer.valueOf(beR.get(paramArrayOfString.intValue()));
      if (localInteger1 == null)
      {
        new StringBuilder("Unknown AVC level: ").append(paramArrayOfString);
        AppMethodBeat.o(95255);
        paramArrayOfString = null;
      }
      else
      {
        paramArrayOfString = new Pair(localInteger2, localInteger1);
        AppMethodBeat.o(95255);
      }
    }
  }

  public static a e(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(95249);
    paramString = f(paramString, paramBoolean);
    if (paramString.isEmpty())
    {
      paramString = null;
      AppMethodBeat.o(95249);
    }
    while (true)
    {
      return paramString;
      paramString = (a)paramString.get(0);
      AppMethodBeat.o(95249);
    }
  }

  private static List<a> f(String paramString, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(95250);
        d.a locala = new com/google/android/exoplayer2/e/d$a;
        locala.<init>(paramString, paramBoolean);
        localObject1 = (List)beP.get(locala);
        if (localObject1 != null)
        {
          AppMethodBeat.o(95250);
          paramString = (String)localObject1;
          return paramString;
        }
        if (v.SDK_INT >= 21)
        {
          localObject1 = new com/google/android/exoplayer2/e/d$e;
          ((d.e)localObject1).<init>(paramBoolean);
          Object localObject2 = a(locala, (d.c)localObject1);
          localObject1 = localObject2;
          if (paramBoolean)
          {
            localObject1 = localObject2;
            if (((List)localObject2).isEmpty())
            {
              localObject1 = localObject2;
              if (21 <= v.SDK_INT)
              {
                localObject1 = localObject2;
                if (v.SDK_INT <= 23)
                {
                  localObject1 = new com/google/android/exoplayer2/e/d$d;
                  ((d.d)localObject1).<init>((byte)0);
                  localObject1 = a(locala, (d.c)localObject1);
                  if (!((List)localObject1).isEmpty())
                  {
                    localObject2 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject2).<init>("MediaCodecList API didn't list secure decoder for: ");
                    ((StringBuilder)localObject2).append(paramString).append(". Assuming: ").append(((a)((List)localObject1).get(0)).name);
                  }
                }
              }
            }
          }
          v((List)localObject1);
          paramString = Collections.unmodifiableList((List)localObject1);
          beP.put(locala, paramString);
          AppMethodBeat.o(95250);
          continue;
        }
      }
      finally
      {
      }
      Object localObject1 = new d.d((byte)0);
    }
  }

  public static a rJ()
  {
    return beN;
  }

  public static int rK()
  {
    int i = 0;
    AppMethodBeat.i(95251);
    int m;
    if (beT == -1)
    {
      Object localObject = e("video/avc", false);
      if (localObject != null)
      {
        localObject = ((a)localObject).rD();
        int j = localObject.length;
        int k = 0;
        m = 0;
        if (k < j)
        {
          switch (localObject[k].level)
          {
          default:
            i = -1;
          case 1:
          case 2:
          case 8:
          case 16:
          case 32:
          case 64:
          case 128:
          case 256:
          case 512:
          case 1024:
          case 2048:
          case 4096:
          case 8192:
          case 16384:
          case 32768:
          case 65536:
          }
          while (true)
          {
            m = Math.max(i, m);
            k++;
            break;
            i = 25344;
            continue;
            i = 25344;
            continue;
            i = 101376;
            continue;
            i = 101376;
            continue;
            i = 101376;
            continue;
            i = 202752;
            continue;
            i = 414720;
            continue;
            i = 414720;
            continue;
            i = 921600;
            continue;
            i = 1310720;
            continue;
            i = 2097152;
            continue;
            i = 2097152;
            continue;
            i = 2228224;
            continue;
            i = 5652480;
            continue;
            i = 9437184;
            continue;
            i = 9437184;
          }
        }
        if (v.SDK_INT < 21)
          break label349;
      }
    }
    label349: for (i = 345600; ; i = 172800)
    {
      i = Math.max(m, i);
      beT = i;
      i = beT;
      AppMethodBeat.o(95251);
      return i;
    }
  }

  private static void v(List<a> paramList)
  {
    int i = 1;
    AppMethodBeat.i(95254);
    if ((v.SDK_INT < 26) && (paramList.size() > 1) && ("OMX.MTK.AUDIO.DECODER.RAW".equals(((a)paramList.get(0)).name)))
      if (i < paramList.size())
      {
        a locala = (a)paramList.get(i);
        if ("OMX.google.raw.decoder".equals(locala.name))
        {
          paramList.remove(i);
          paramList.add(0, locala);
          AppMethodBeat.o(95254);
        }
      }
    while (true)
    {
      return;
      i++;
      break;
      AppMethodBeat.o(95254);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e.d
 * JD-Core Version:    0.6.2
 */