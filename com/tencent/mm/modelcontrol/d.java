package com.tencent.mm.modelcontrol;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class d
  implements at
{
  private static final int fzG;
  private a fzH;
  private byte[] fzI;
  private com.tencent.mm.plugin.a.b fzJ;
  private e[] fzK;
  private e[] fzL;
  private e[] fzM;
  private e[] fzN;
  private e[] fzO;
  private e[] fzP;
  private e[] fzQ;

  static
  {
    AppMethodBeat.i(50616);
    fzG = com.tencent.mm.plugin.a.c.aT("dscp");
    AppMethodBeat.o(50616);
  }

  public d()
  {
    AppMethodBeat.i(50592);
    this.fzI = null;
    this.fzH = new a();
    AppMethodBeat.o(50592);
  }

  public static int a(int paramInt, s params)
  {
    AppMethodBeat.i(50610);
    switch (paramInt)
    {
    default:
      paramInt = 1;
      ab.i("MicroMsg.SubCoreVideoControl", "check c2c video format[%d]", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt == 2)
        h.pYm.a(354L, 130L, 1L, false);
      break;
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(50610);
      return paramInt;
      paramInt = 1;
      break;
      paramInt = a(params);
      break;
      paramInt = a(params);
      break;
      h.pYm.a(354L, 131L, 1L, false);
    }
  }

  public static int a(VideoTransPara paramVideoTransPara)
  {
    int i;
    if (paramVideoTransPara == null)
      i = 0;
    while (true)
    {
      return i;
      switch (paramVideoTransPara.duration)
      {
      default:
        i = paramVideoTransPara.duration;
        break;
      case 10:
        i = 1;
      }
    }
  }

  private static int a(s params)
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(50611);
    if (!lk(1))
      AppMethodBeat.o(50611);
    while (true)
    {
      return j;
      o.all();
      params = t.uh(params.getFileName());
      if (com.tencent.mm.vfs.e.ct(params))
        break;
      AppMethodBeat.o(50611);
      j = 2;
    }
    if (!r.uc(params));
    for (j = i; ; j = 2)
    {
      AppMethodBeat.o(50611);
      break;
    }
  }

  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4, PInt paramPInt1, PInt paramPInt2, PInt paramPInt3, PInt paramPInt4, PInt paramPInt5, PInt paramPInt6)
  {
    AppMethodBeat.i(50596);
    boolean bool;
    if ((bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)) || (bo.isNullOrNil(paramString4)))
    {
      bool = false;
      AppMethodBeat.o(50596);
    }
    while (true)
    {
      return bool;
      try
      {
        int i;
        if (!bo.isNullOrNil(paramString1))
        {
          arrayOfString = paramString1.split("~");
          paramPInt1.value = bo.getInt(arrayOfString[0], -1);
          paramPInt2.value = bo.getInt(arrayOfString[1], -1);
          if (paramPInt1.value >= 0)
          {
            i = paramPInt2.value;
            if (i >= 0)
              break label121;
          }
          bool = false;
          AppMethodBeat.o(50596);
          continue;
        }
        paramPInt2.value = 0;
        paramPInt1.value = 0;
        label121: String[] arrayOfString = paramString2.split("x");
        paramPInt3.value = bo.getInt(arrayOfString[0], -1);
        paramPInt4.value = bo.getInt(arrayOfString[1], -1);
        if (paramPInt3.value >= 0)
        {
          i = paramPInt4.value;
          if (i >= 0);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(50596);
          continue;
        }
        paramPInt5.value = bo.getInt(paramString3, -1);
        paramPInt6.value = bo.getInt(paramString4, -1);
        if (paramPInt5.value >= 0)
        {
          i = paramPInt6.value;
          if (i >= 0);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(50596);
          continue;
        }
        paramPInt6.value *= 1000;
        ab.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramPInt3.value), Integer.valueOf(paramPInt4.value), Integer.valueOf(paramPInt5.value), Integer.valueOf(paramPInt6.value) });
        bool = true;
        AppMethodBeat.o(50596);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.SubCoreVideoControl", "parse video para error." + localException.toString());
      }
    }
  }

  public static d afF()
  {
    AppMethodBeat.i(50593);
    d locald = (d)com.tencent.mm.model.q.Y(d.class);
    AppMethodBeat.o(50593);
    return locald;
  }

  private static VideoTransPara afL()
  {
    AppMethodBeat.i(50605);
    VideoTransPara localVideoTransPara = new VideoTransPara();
    localVideoTransPara.isDefault = true;
    localVideoTransPara.width = 540;
    localVideoTransPara.height = 960;
    localVideoTransPara.fps = 30;
    localVideoTransPara.videoBitrate = 1600000;
    localVideoTransPara.fzT = 10;
    localVideoTransPara.fzS = 64000;
    localVideoTransPara.fzU = 2;
    localVideoTransPara.fzV = 1;
    AppMethodBeat.o(50605);
    return localVideoTransPara;
  }

  public static boolean afM()
  {
    AppMethodBeat.i(50607);
    int i = ((Integer)g.RP().Ry().get(ac.a.xOL, Integer.valueOf(-1))).intValue();
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100136");
    if (localc.isValid());
    for (int j = bo.getInt((String)localc.dru().get("streamingDownload"), 0); ; j = 0)
    {
      boolean bool1 = afO();
      boolean bool2;
      if ((i == 0) || (j == -1) || (!bool1))
        bool2 = false;
      while (true)
      {
        ab.i("MicroMsg.SubCoreVideoControl", "check can c2c online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Integer.valueOf(i), Integer.valueOf(j) });
        AppMethodBeat.o(50607);
        return bool2;
        if (i > 0)
          bool2 = true;
        else if (j > 0)
          bool2 = true;
        else
          bool2 = false;
      }
    }
  }

  public static boolean afN()
  {
    AppMethodBeat.i(50608);
    int i = ((Integer)g.RP().Ry().get(ac.a.xOL, Integer.valueOf(-1))).intValue();
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100153");
    if (localc.isValid());
    for (int j = bo.getInt((String)localc.dru().get("snsStreamDownload"), 0); ; j = 0)
    {
      boolean bool1 = afO();
      boolean bool2;
      if ((i == 0) || (j == -1) || (!bool1))
        bool2 = false;
      while (true)
      {
        ab.i("MicroMsg.SubCoreVideoControl", "check can sns online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Integer.valueOf(i), Integer.valueOf(j) });
        AppMethodBeat.o(50608);
        return bool2;
        if (i > 0)
          bool2 = true;
        else if (j > 0)
          bool2 = true;
        else
          bool2 = false;
      }
    }
  }

  public static boolean afO()
  {
    AppMethodBeat.i(50609);
    long l = bo.yz();
    int i = ((Integer)g.RP().Ry().get(ac.a.xOL, Integer.valueOf(-1))).intValue();
    Object localObject1 = com.tencent.mm.model.c.c.abi().ll("100190");
    Object localObject2;
    int j;
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      localObject2 = ((com.tencent.mm.storage.c)localObject1).dru();
      j = bo.getInt((String)((Map)localObject2).get("player"), 1);
      localObject1 = (String)((Map)localObject2).get("apilevel");
      localObject2 = (String)((Map)localObject2).get("devices");
    }
    while (true)
    {
      int k = Build.VERSION.SDK_INT;
      String str = Build.BRAND + Build.MODEL;
      String[] arrayOfString;
      int m;
      int n;
      if (!bo.isNullOrNil((String)localObject1))
      {
        arrayOfString = ((String)localObject1).split(";");
        m = arrayOfString.length;
        n = 0;
        if (n < m)
          if (bo.getInt(arrayOfString[n], 0) != k);
      }
      for (boolean bool1 = false; ; bool1 = true)
      {
        boolean bool2 = bool1;
        if (!bo.isNullOrNil((String)localObject2))
        {
          arrayOfString = ((String)localObject2).split(";");
          m = arrayOfString.length;
        }
        for (n = 0; ; n++)
        {
          bool2 = bool1;
          if (n < m)
          {
            if (arrayOfString[n].equalsIgnoreCase(str))
              bool2 = false;
          }
          else
          {
            if (com.tencent.mm.compatible.util.d.fP(18))
              bool2 = false;
            if (Build.BRAND.equalsIgnoreCase("meizu"))
              g.RP().Ry().set(ac.a.xQl, Boolean.TRUE);
            if (i == 0)
              bool2 = false;
            if (j <= 0)
              bool2 = false;
            ab.i("MicroMsg.SubCoreVideoControl", "check can use mmvideoplayer[%b] api[%d, %s] device[%s, %s] abTestFlag[%d] costTime[%d]", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(k), localObject1, str, localObject2, Integer.valueOf(j), Long.valueOf(bo.az(l)) });
            AppMethodBeat.o(50609);
            return bool2;
            n++;
            break;
          }
        }
      }
      localObject2 = null;
      localObject1 = null;
      j = 1;
    }
  }

  public static boolean afP()
  {
    AppMethodBeat.i(50614);
    String str = null;
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100253");
    if (((com.tencent.mm.storage.c)localObject).isValid())
      str = (String)((com.tencent.mm.storage.c)localObject).dru().get("noCompleteRange");
    localObject = str;
    if (bo.isNullOrNil(str))
      localObject = "20:00-23:30";
    g.RN();
    int i = i.bL(com.tencent.mm.kernel.a.QF(), 30);
    boolean bool = b.W((String)localObject, i);
    ab.i("MicroMsg.SubCoreVideoControl", "check complete hevc needControl [%b] no complete range[%s] endHash[%d]", new Object[] { Boolean.valueOf(bool), localObject, Integer.valueOf(i) });
    if (!bool)
      AppMethodBeat.o(50614);
    for (bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(50614);
    }
  }

  private static e e(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(50595);
    e locale = new e();
    try
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      label78: PInt localPInt;
      int i;
      int j;
      label218: JSONObject localJSONObject;
      if (paramJSONObject.isNull("time"))
      {
        localObject1 = "";
        localObject2 = paramJSONObject.getString("abr");
        localObject3 = paramJSONObject.getString("intval");
        localObject4 = paramJSONObject.getString("prof");
        localObject5 = paramJSONObject.getString("preset");
        if (!paramJSONObject.isNull("stepbr"))
          break label363;
        localObject6 = "0";
        ab.i("MicroMsg.SubCoreVideoControl", "busy time %s audio bitrate %s iframe %s profile %s preset %s stepbr %s", new Object[] { localObject1, localObject2, localObject3, localObject4, localObject5, localObject6 });
        locale.a((String)localObject1, (String)localObject2, (String)localObject3, (String)localObject4, (String)localObject5, (String)localObject6);
        JSONArray localJSONArray = paramJSONObject.getJSONArray("conf");
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject6 = new com/tencent/mm/pointers/PInt;
        ((PInt)localObject6).<init>();
        localObject2 = new com/tencent/mm/pointers/PInt;
        ((PInt)localObject2).<init>();
        localObject3 = new com/tencent/mm/pointers/PInt;
        ((PInt)localObject3).<init>();
        localPInt = new com/tencent/mm/pointers/PInt;
        localPInt.<init>();
        localObject5 = new com/tencent/mm/pointers/PInt;
        ((PInt)localObject5).<init>();
        localObject4 = new com/tencent/mm/pointers/PInt;
        ((PInt)localObject4).<init>();
        i = localJSONArray.length();
        j = 0;
        if (j >= i)
          break label382;
        localJSONObject = localJSONArray.getJSONObject(j);
        if (localJSONObject.isNull("dura"))
          break label375;
      }
      label363: label375: for (paramJSONObject = localJSONObject.getString("dura"); ; paramJSONObject = "")
      {
        if (a(paramJSONObject, localJSONObject.getString("wh"), localJSONObject.getString("fps"), localJSONObject.getString("vbr"), (PInt)localObject6, (PInt)localObject2, (PInt)localObject3, localPInt, (PInt)localObject5, (PInt)localObject4))
        {
          paramJSONObject = new com/tencent/mm/modelcontrol/f;
          paramJSONObject.<init>(((PInt)localObject6).value, ((PInt)localObject2).value, ((PInt)localObject3).value, localPInt.value, ((PInt)localObject5).value, ((PInt)localObject4).value, ((PInt)localObject4).value);
          ((List)localObject1).add(paramJSONObject);
        }
        j++;
        break label218;
        localObject1 = paramJSONObject.getString("time");
        break;
        localObject6 = paramJSONObject.getString("stepbr");
        break label78;
      }
      label382: Collections.sort((List)localObject1);
      if ((((List)localObject1).size() >= 2) && (!locale.fzW))
      {
        i = ((f)((List)localObject1).get(0)).fAe;
        for (j = 1; j < ((List)localObject1).size(); j++)
        {
          paramJSONObject = (f)((List)localObject1).get(j);
          paramJSONObject.fAd = i;
          i = paramJSONObject.fAe;
        }
      }
      locale.fzX = new f[((List)localObject1).size()];
      ((List)localObject1).toArray(locale.fzX);
      ab.d("MicroMsg.SubCoreVideoControl", "parseJsonObject %s", new Object[] { locale });
      AppMethodBeat.o(50595);
      paramJSONObject = locale;
      return paramJSONObject;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.e("MicroMsg.SubCoreVideoControl", "parseJsonObject error : " + paramJSONObject.toString());
        paramJSONObject = null;
        AppMethodBeat.o(50595);
      }
    }
  }

  private static VideoTransPara lj(int paramInt)
  {
    AppMethodBeat.i(50606);
    VideoTransPara localVideoTransPara = new VideoTransPara();
    localVideoTransPara.isDefault = true;
    localVideoTransPara.fzT = 1;
    localVideoTransPara.fzS = 48000;
    localVideoTransPara.fzU = 2;
    localVideoTransPara.fzV = 1;
    if (paramInt <= 120)
    {
      localVideoTransPara.fps = 30;
      localVideoTransPara.width = 540;
      localVideoTransPara.height = 960;
    }
    for (localVideoTransPara.videoBitrate = 1200000; ; localVideoTransPara.videoBitrate = 544000)
    {
      AppMethodBeat.o(50606);
      return localVideoTransPara;
      localVideoTransPara.fps = 24;
      localVideoTransPara.width = 360;
      localVideoTransPara.height = 640;
    }
  }

  private static boolean lk(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(50615);
    int i = ((Integer)g.RP().Ry().get(ac.a.xRV, Integer.valueOf(-1))).intValue();
    int j = i;
    if (i == -1)
      if (!com.tencent.mm.plugin.n.e.bOS())
        break label93;
    label93: for (j = 1; ; j = 0)
    {
      g.RP().Ry().set(ac.a.xRV, Integer.valueOf(j));
      ab.i("MicroMsg.SubCoreVideoControl", "check device support hevc[%d]", new Object[] { Integer.valueOf(j) });
      if (j > 0)
        break;
      AppMethodBeat.o(50615);
      return bool;
    }
    j = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("VideoDownloadH265Flag", 0);
    switch (paramInt)
    {
    default:
      bool = false;
      label150: i = com.tencent.mm.compatible.e.q.etn.esI;
      if (i != -1)
        if (i != 1)
          break label266;
      break;
    case 1:
    case 2:
    case 3:
    }
    label266: for (bool = true; ; bool = false)
    {
      ab.i("MicroMsg.SubCoreVideoControl", "check checkDeviceSupportHevc, scene:%s, flag:%s, configResult:%s, dynamicConfigResult:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(i) });
      AppMethodBeat.o(50615);
      break;
      if ((j & 0x2) != 0)
      {
        bool = true;
        break label150;
      }
      bool = false;
      break label150;
      if ((j & 0x4) != 0)
      {
        bool = true;
        break label150;
      }
      bool = false;
      break label150;
      if ((j & 0x1) != 0)
      {
        bool = true;
        break label150;
      }
      bool = false;
      break label150;
    }
  }

  private static e[] rS(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(50594);
    Object localObject1 = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue(paramString);
    if (bo.isNullOrNil((String)localObject1))
    {
      ab.i("MicroMsg.SubCoreVideoControl", "key %s config is null", new Object[] { paramString });
      AppMethodBeat.o(50594);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = localObject1;
      if (!((String)localObject1).startsWith("["))
        localObject2 = "[".concat(String.valueOf(localObject1));
      localObject1 = localObject2;
      if (!((String)localObject2).endsWith("]"))
        localObject1 = (String)localObject2 + "]";
      ab.i("MicroMsg.SubCoreVideoControl", "%s=%s ", new Object[] { paramString, localObject1 });
      try
      {
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>((String)localObject1);
        int j = ((JSONArray)localObject2).length();
        ab.d("MicroMsg.SubCoreVideoControl", "parse config root length %d", new Object[] { Integer.valueOf(j) });
        paramString = new e[j];
        while (i < j)
        {
          paramString[i] = e(((JSONArray)localObject2).getJSONObject(i));
          i++;
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.SubCoreVideoControl", "parse Configs error : " + paramString.toString());
        AppMethodBeat.o(50594);
        paramString = null;
      }
      continue;
      AppMethodBeat.o(50594);
    }
  }

  public static int u(int paramInt, String paramString)
  {
    int i = 2;
    AppMethodBeat.i(50612);
    switch (paramInt)
    {
    default:
      paramInt = 1;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      ab.i("MicroMsg.SubCoreVideoControl", "check sns video format[%d]", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(50612);
      return paramInt;
      paramInt = 1;
      continue;
      if (!lk(2))
        break;
      paramInt = i;
      if (com.tencent.mm.vfs.e.ct(paramString))
      {
        if (!r.uc(paramString))
          break;
        paramInt = i;
      }
    }
  }

  public static int v(int paramInt, String paramString)
  {
    int i = 2;
    AppMethodBeat.i(50613);
    switch (paramInt)
    {
    default:
      paramInt = 1;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      ab.i("MicroMsg.SubCoreVideoControl", "check story video format[%d]", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(50613);
      return paramInt;
      paramInt = 1;
      continue;
      if (!lk(3))
        break;
      paramInt = i;
      if (com.tencent.mm.vfs.e.ct(paramString))
      {
        if (!r.uc(paramString))
          break;
        paramInt = i;
      }
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final VideoTransPara afG()
  {
    AppMethodBeat.i(50599);
    long l = bo.yz();
    if (this.fzK == null)
      this.fzK = rS("C2CRecordVideoConfig");
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.fzK != null)
    {
      i = 0;
      if (i < this.fzK.length)
      {
        locale = this.fzK[i];
        if ((locale != null) && (locale.afQ()))
        {
          ab.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get c2c Record config.");
          localVideoTransPara = locale.afR();
        }
      }
    }
    for (boolean bool = locale.fzW; ; bool = true)
    {
      if (localVideoTransPara == null)
      {
        localVideoTransPara = new VideoTransPara();
        localVideoTransPara.isDefault = true;
        localVideoTransPara.width = 540;
        localVideoTransPara.height = 960;
        localVideoTransPara.fps = 30;
        localVideoTransPara.videoBitrate = 1200000;
        localVideoTransPara.fzT = 10;
        localVideoTransPara.fzS = 64000;
        localVideoTransPara.fzU = 2;
        localVideoTransPara.fzV = 1;
      }
      while (true)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.fzT = 10;
        localVideoTransPara.duration = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFF, 10);
        if (!bool)
          h.pYm.a(422L, 11L, 1L, false);
        while (true)
        {
          i = bo.h((Integer)h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 13, 18));
          h.pYm.a(422L, i, 1L, false);
          ab.i("MicroMsg.SubCoreVideoControl", "get c2c record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bo.az(l)), localVideoTransPara, Integer.valueOf(i) });
          AppMethodBeat.o(50599);
          return localVideoTransPara;
          i++;
          break;
          h.pYm.a(422L, 12L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }

  public final VideoTransPara afH()
  {
    AppMethodBeat.i(50600);
    long l = bo.yz();
    if (this.fzL == null)
      this.fzL = rS("SnsRecordVideoConfig");
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.fzL != null)
    {
      i = 0;
      if (i < this.fzL.length)
      {
        locale = this.fzL[i];
        if ((locale != null) && (locale.afQ()))
        {
          ab.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns Record config.");
          localVideoTransPara = locale.afR();
        }
      }
    }
    for (boolean bool = locale.fzW; ; bool = true)
    {
      if (localVideoTransPara == null)
        localVideoTransPara = afL();
      while (true)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.fzT = 10;
        localVideoTransPara.fAf = 200;
        localVideoTransPara.duration = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFD, 10);
        if (!bool)
          h.pYm.a(422L, 31L, 1L, false);
        while (true)
        {
          i = bo.h((Integer)h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 33, 38));
          h.pYm.a(422L, i, 1L, false);
          ab.i("MicroMsg.SubCoreVideoControl", "get sns record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bo.az(l)), localVideoTransPara, Integer.valueOf(i) });
          AppMethodBeat.o(50600);
          return localVideoTransPara;
          i++;
          break;
          h.pYm.a(422L, 32L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }

  public final VideoTransPara afI()
  {
    AppMethodBeat.i(50601);
    long l = bo.yz();
    if (this.fzM == null)
      this.fzM = rS("SnsAlbumVideoConfig");
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.fzM != null)
    {
      i = 0;
      if (i < this.fzM.length)
      {
        locale = this.fzM[i];
        if ((locale != null) && (locale.afQ()))
        {
          ab.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns album config.");
          localVideoTransPara = locale.afR();
        }
      }
    }
    for (boolean bool = locale.fzW; ; bool = true)
    {
      if (localVideoTransPara == null)
        localVideoTransPara = afL();
      while (true)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.fzT = 10;
        localVideoTransPara.fAf = 200;
        localVideoTransPara.duration = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFE, 10);
        if (!bool)
          h.pYm.a(422L, 21L, 1L, false);
        while (true)
        {
          i = bo.h((Integer)h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 23, 28));
          h.pYm.a(422L, i, 1L, false);
          ab.i("MicroMsg.SubCoreVideoControl", "get sns album para cost %d. %s rpt %d ", new Object[] { Long.valueOf(bo.az(l)), localVideoTransPara, Integer.valueOf(i) });
          AppMethodBeat.o(50601);
          return localVideoTransPara;
          i++;
          break;
          h.pYm.a(422L, 22L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }

  public final VideoTransPara afJ()
  {
    AppMethodBeat.i(50602);
    long l = bo.yz();
    if (this.fzN == null)
      this.fzN = rS("StoryRecordVideoConfig");
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.fzN != null)
    {
      i = 0;
      if (i < this.fzN.length)
      {
        locale = this.fzN[i];
        if ((locale != null) && (locale.afQ()))
        {
          ab.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
          localVideoTransPara = locale.afR();
        }
      }
    }
    for (boolean bool = locale.fzW; ; bool = true)
    {
      if (localVideoTransPara == null)
      {
        localVideoTransPara = new VideoTransPara();
        localVideoTransPara.isDefault = true;
        localVideoTransPara.width = 720;
        localVideoTransPara.height = 1280;
        localVideoTransPara.fps = 30;
        localVideoTransPara.videoBitrate = 3500000;
        localVideoTransPara.fzT = 10;
        localVideoTransPara.fzS = 48000;
        localVideoTransPara.fzU = 2;
        localVideoTransPara.fzV = 1;
      }
      while (true)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.fzT = 10;
        localVideoTransPara.fAf = 200;
        if (localVideoTransPara.duration <= 0)
          localVideoTransPara.duration = 15;
        if (!bool)
          h.pYm.a(422L, 31L, 1L, false);
        while (true)
        {
          i = bo.h((Integer)h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 33, 38));
          h.pYm.a(422L, i, 1L, false);
          ab.i("MicroMsg.SubCoreVideoControl", "get story record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bo.az(l)), localVideoTransPara, Integer.valueOf(i) });
          AppMethodBeat.o(50602);
          return localVideoTransPara;
          i++;
          break;
          h.pYm.a(422L, 32L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }

  public final VideoTransPara afK()
  {
    AppMethodBeat.i(50604);
    long l = bo.yz();
    if (this.fzQ == null)
      this.fzQ = rS("NearbyRecordVideoConfig");
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.fzQ != null)
    {
      i = 0;
      if (i < this.fzQ.length)
      {
        locale = this.fzQ[i];
        if ((locale != null) && (locale.afQ()))
        {
          ab.i("MicroMsg.SubCoreVideoControl", "is busy time, try to get nearby record config.");
          localVideoTransPara = locale.afR();
        }
      }
    }
    for (boolean bool = locale.fzW; ; bool = true)
    {
      if (localVideoTransPara == null)
        localVideoTransPara = afL();
      while (true)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.fzT = 10;
        localVideoTransPara.fAf = 200;
        if (localVideoTransPara.duration <= 0)
          localVideoTransPara.duration = 10;
        if (!bool)
          h.pYm.a(422L, 31L, 1L, false);
        while (true)
        {
          i = bo.h((Integer)h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 33, 38));
          h.pYm.a(422L, i, 1L, false);
          ab.i("MicroMsg.SubCoreVideoControl", "get nearby record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bo.az(l)), localVideoTransPara, Integer.valueOf(i) });
          AppMethodBeat.o(50604);
          return localVideoTransPara;
          i++;
          break;
          h.pYm.a(422L, 32L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }

  public final VideoTransPara b(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(50603);
    if (paramVideoTransPara == null)
    {
      ab.e("MicroMsg.SubCoreVideoControl", "get c2c album video para but original video para is null.");
      paramVideoTransPara = null;
      AppMethodBeat.o(50603);
    }
    while (true)
    {
      return paramVideoTransPara;
      if (paramVideoTransPara.duration < 300)
        break;
      ab.w("MicroMsg.SubCoreVideoControl", "this video duration is large than %s s", new Object[] { Integer.valueOf(300) });
      paramVideoTransPara = null;
      AppMethodBeat.o(50603);
    }
    long l = bo.yz();
    VideoTransPara localVideoTransPara = lj(paramVideoTransPara.duration);
    int i = 1;
    Object localObject1 = com.tencent.mm.model.c.c.abi().ll("100157");
    if (((com.tencent.mm.storage.c)localObject1).isValid())
      i = bo.getInt((String)((com.tencent.mm.storage.c)localObject1).dru().get("VideoEncodeStep"), 1);
    ab.i("MicroMsg.SubCoreVideoControl", "check c2c album encode step %d", new Object[] { Integer.valueOf(i) });
    label155: label183: label191: boolean bool;
    if (i > 0)
    {
      i = 1;
      if (i == 0)
        break label413;
      if (this.fzP == null)
        this.fzP = rS("C2CAlbumVideoStepConfig");
      localObject1 = this.fzP;
      if (localObject1 == null)
        break label454;
      i = 0;
      if (i >= localObject1.length)
        break label445;
      Object localObject2 = localObject1[i];
      if ((localObject2 == null) || (!localObject2.afQ()))
        break label439;
      ab.i("MicroMsg.SubCoreVideoControl", "it busy time, try to calc c2c album config.");
      i = a.a(localObject2.fzX, paramVideoTransPara, localVideoTransPara);
      bool = localObject2.fzW;
      label247: if (i > 0)
        break label477;
      localObject1 = lj(paramVideoTransPara.duration);
      label261: if (bool)
        break label490;
      h.pYm.a(422L, 1L, 1L, false);
    }
    while (true)
    {
      int j = bo.h((Integer)h.a(((VideoTransPara)localObject1).videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 3, 8));
      h.pYm.a(422L, j, 1L, false);
      ab.i("MicroMsg.SubCoreVideoControl", "get c2c album para cost %d rpt %d. bitrate %d new para %s, original para %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(j), Integer.valueOf(i), localObject1, paramVideoTransPara });
      AppMethodBeat.o(50603);
      paramVideoTransPara = (VideoTransPara)localObject1;
      break;
      i = 0;
      break label155;
      label413: if (this.fzO == null)
        this.fzO = rS("C2CAlbumVideoConfig");
      localObject1 = this.fzO;
      break label183;
      label439: i++;
      break label191;
      label445: bool = true;
      i = 0;
      break label247;
      label454: ab.i("MicroMsg.SubCoreVideoControl", "it not busy time, try to calc c2c album default config.");
      i = a.a(null, paramVideoTransPara, localVideoTransPara);
      bool = true;
      break label247;
      label477: localVideoTransPara.isDefault = false;
      localObject1 = localVideoTransPara;
      break label261;
      label490: h.pYm.a(422L, 2L, 1L, false);
    }
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
  }

  public final byte[] getWeixinMeta()
  {
    AppMethodBeat.i(50597);
    if (bo.cb(this.fzI));
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("{\"WXVer\":");
      localObject = com.tencent.mm.protocal.d.vxo + "}";
      this.fzI = ((String)localObject).getBytes("UTF-8");
      ab.i("MicroMsg.SubCoreVideoControl", "get weixin video meta %s", new Object[] { localObject });
      localObject = this.fzI;
      AppMethodBeat.o(50597);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.SubCoreVideoControl", "get weixin meta error %s ", new Object[] { localException.toString() });
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    this.fzK = null;
    this.fzP = null;
    this.fzO = null;
    this.fzL = null;
    this.fzM = null;
  }

  // ERROR //
  public final boolean rT(String paramString)
  {
    // Byte code:
    //   0: ldc_w 781
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 783	com/tencent/mm/modelcontrol/d:fzJ	Lcom/tencent/mm/plugin/a/b;
    //   10: ifnonnull +14 -> 24
    //   13: aload_0
    //   14: new 785	com/tencent/mm/plugin/a/b
    //   17: dup
    //   18: invokespecial 786	com/tencent/mm/plugin/a/b:<init>	()V
    //   21: putfield 783	com/tencent/mm/modelcontrol/d:fzJ	Lcom/tencent/mm/plugin/a/b;
    //   24: aload_0
    //   25: getfield 783	com/tencent/mm/modelcontrol/d:fzJ	Lcom/tencent/mm/plugin/a/b;
    //   28: astore_2
    //   29: aload_2
    //   30: ldc2_w 787
    //   33: putfield 792	com/tencent/mm/plugin/a/b:gjO	J
    //   36: aload_2
    //   37: ldc2_w 787
    //   40: putfield 795	com/tencent/mm/plugin/a/b:gjQ	J
    //   43: aload_2
    //   44: aconst_null
    //   45: putfield 799	com/tencent/mm/plugin/a/b:gjR	Lcom/tencent/mm/plugin/a/a;
    //   48: invokestatic 308	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   51: lstore_3
    //   52: aload_0
    //   53: getfield 783	com/tencent/mm/modelcontrol/d:fzJ	Lcom/tencent/mm/plugin/a/b;
    //   56: aload_1
    //   57: invokevirtual 803	com/tencent/mm/plugin/a/b:vB	(Ljava/lang/String;)J
    //   60: lstore 5
    //   62: lload 5
    //   64: lconst_0
    //   65: lcmp
    //   66: ifgt +15 -> 81
    //   69: iconst_0
    //   70: istore 7
    //   72: ldc_w 781
    //   75: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: iload 7
    //   80: ireturn
    //   81: aconst_null
    //   82: astore 8
    //   84: aconst_null
    //   85: astore 9
    //   87: new 805	java/io/File
    //   90: astore_2
    //   91: aload_2
    //   92: aload_1
    //   93: invokespecial 806	java/io/File:<init>	(Ljava/lang/String;)V
    //   96: new 808	java/io/RandomAccessFile
    //   99: astore 10
    //   101: aload 10
    //   103: aload_2
    //   104: ldc_w 810
    //   107: invokespecial 813	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   110: aload 10
    //   112: astore_2
    //   113: aload 10
    //   115: lload 5
    //   117: invokevirtual 817	java/io/RandomAccessFile:seek	(J)V
    //   120: aload 10
    //   122: astore_2
    //   123: bipush 8
    //   125: newarray byte
    //   127: astore 11
    //   129: aload 10
    //   131: astore_2
    //   132: aload 10
    //   134: aload 11
    //   136: getstatic 822	com/tencent/mm/plugin/a/a:aXh	I
    //   139: invokestatic 825	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   142: astore 12
    //   144: aconst_null
    //   145: astore_2
    //   146: aload_2
    //   147: astore 13
    //   149: aload 12
    //   151: ifnull +61 -> 212
    //   154: aload 10
    //   156: astore_2
    //   157: aload 10
    //   159: aload 11
    //   161: getstatic 41	com/tencent/mm/modelcontrol/d:fzG	I
    //   164: invokestatic 825	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   167: astore 14
    //   169: aload 14
    //   171: astore 13
    //   173: aload 14
    //   175: ifnonnull +37 -> 212
    //   178: aload 10
    //   180: astore_2
    //   181: aload 10
    //   183: aload 12
    //   185: invokevirtual 828	com/tencent/mm/plugin/a/a:getEndPos	()J
    //   188: invokevirtual 817	java/io/RandomAccessFile:seek	(J)V
    //   191: aload 10
    //   193: astore_2
    //   194: aload 10
    //   196: aload 11
    //   198: getstatic 822	com/tencent/mm/plugin/a/a:aXh	I
    //   201: invokestatic 825	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   204: astore 12
    //   206: aload 14
    //   208: astore_2
    //   209: goto -63 -> 146
    //   212: aload 9
    //   214: astore 12
    //   216: aload 13
    //   218: ifnull +70 -> 288
    //   221: aload 10
    //   223: astore_2
    //   224: aload 13
    //   226: invokevirtual 831	com/tencent/mm/plugin/a/a:getSize	()J
    //   229: l2i
    //   230: bipush 8
    //   232: isub
    //   233: newarray byte
    //   235: astore 14
    //   237: aload 10
    //   239: astore_2
    //   240: aload 10
    //   242: aload 13
    //   244: getfield 834	com/tencent/mm/plugin/a/a:gjN	J
    //   247: ldc2_w 835
    //   250: ladd
    //   251: invokevirtual 817	java/io/RandomAccessFile:seek	(J)V
    //   254: aload 9
    //   256: astore 12
    //   258: aload 10
    //   260: astore_2
    //   261: aload 10
    //   263: aload 14
    //   265: invokevirtual 840	java/io/RandomAccessFile:read	([B)I
    //   268: ifle +20 -> 288
    //   271: aload 10
    //   273: astore_2
    //   274: new 145	java/lang/String
    //   277: dup
    //   278: aload 14
    //   280: ldc_w 765
    //   283: invokespecial 843	java/lang/String:<init>	([BLjava/lang/String;)V
    //   286: astore 12
    //   288: aload 10
    //   290: invokevirtual 846	java/io/RandomAccessFile:close	()V
    //   293: aload 12
    //   295: astore_2
    //   296: ldc 61
    //   298: ldc_w 848
    //   301: iconst_4
    //   302: anewarray 4	java/lang/Object
    //   305: dup
    //   306: iconst_0
    //   307: aload_2
    //   308: aastore
    //   309: dup
    //   310: iconst_1
    //   311: lload 5
    //   313: invokestatic 365	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   316: aastore
    //   317: dup
    //   318: iconst_2
    //   319: lload_3
    //   320: invokestatic 360	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   323: invokestatic 365	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   326: aastore
    //   327: dup
    //   328: iconst_3
    //   329: aload_1
    //   330: aastore
    //   331: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   334: aload_2
    //   335: invokestatic 141	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   338: ifne +98 -> 436
    //   341: aload_2
    //   342: ldc_w 850
    //   345: invokevirtual 854	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   348: istore 7
    //   350: ldc_w 781
    //   353: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   356: goto -278 -> 78
    //   359: astore 13
    //   361: aconst_null
    //   362: astore 12
    //   364: aload 12
    //   366: astore_2
    //   367: ldc 61
    //   369: ldc_w 856
    //   372: iconst_2
    //   373: anewarray 4	java/lang/Object
    //   376: dup
    //   377: iconst_0
    //   378: aload_1
    //   379: aastore
    //   380: dup
    //   381: iconst_1
    //   382: aload 13
    //   384: invokevirtual 172	java/lang/Exception:toString	()Ljava/lang/String;
    //   387: aastore
    //   388: invokestatic 775	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   391: aload 8
    //   393: astore_2
    //   394: aload 12
    //   396: ifnull -100 -> 296
    //   399: aload 12
    //   401: invokevirtual 846	java/io/RandomAccessFile:close	()V
    //   404: aload 8
    //   406: astore_2
    //   407: goto -111 -> 296
    //   410: astore_2
    //   411: aload 8
    //   413: astore_2
    //   414: goto -118 -> 296
    //   417: astore_1
    //   418: aconst_null
    //   419: astore_2
    //   420: aload_2
    //   421: ifnull +7 -> 428
    //   424: aload_2
    //   425: invokevirtual 846	java/io/RandomAccessFile:close	()V
    //   428: ldc_w 781
    //   431: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   434: aload_1
    //   435: athrow
    //   436: iconst_0
    //   437: istore 7
    //   439: ldc_w 781
    //   442: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   445: goto -367 -> 78
    //   448: astore_2
    //   449: aload 12
    //   451: astore_2
    //   452: goto -156 -> 296
    //   455: astore_2
    //   456: goto -28 -> 428
    //   459: astore_1
    //   460: goto -40 -> 420
    //   463: astore 13
    //   465: aload 10
    //   467: astore 12
    //   469: goto -105 -> 364
    //
    // Exception table:
    //   from	to	target	type
    //   87	110	359	java/lang/Exception
    //   399	404	410	java/io/IOException
    //   87	110	417	finally
    //   288	293	448	java/io/IOException
    //   424	428	455	java/io/IOException
    //   113	120	459	finally
    //   123	129	459	finally
    //   132	144	459	finally
    //   157	169	459	finally
    //   181	191	459	finally
    //   194	206	459	finally
    //   224	237	459	finally
    //   240	254	459	finally
    //   261	271	459	finally
    //   274	288	459	finally
    //   367	391	459	finally
    //   113	120	463	java/lang/Exception
    //   123	129	463	java/lang/Exception
    //   132	144	463	java/lang/Exception
    //   157	169	463	java/lang/Exception
    //   181	191	463	java/lang/Exception
    //   194	206	463	java/lang/Exception
    //   224	237	463	java/lang/Exception
    //   240	254	463	java/lang/Exception
    //   261	271	463	java/lang/Exception
    //   274	288	463	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcontrol.d
 * JD-Core Version:    0.6.2
 */