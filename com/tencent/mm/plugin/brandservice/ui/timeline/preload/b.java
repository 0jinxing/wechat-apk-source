package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.a.ac;
import a.f.b.j;
import a.k.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.buh;
import com.tencent.mm.protocal.protobuf.bui;
import com.tencent.mm.protocal.protobuf.ef;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mmkv.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"SLOT_DURATION", "", "SLOT_SIZE", "currentSlotId", "getCurrentSlotId", "()I", "urlHashCache", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "clearSlots", "", "getContentId", "url", "getCurrentSlot", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "getInfoId", "getInvalidId", "getSlot", "id", "getSlotMMKV", "slot", "", "getStrip", "openScene", "hashUrl", "mmkvSlot", "verifySlot", "", "getBuff", "buffer", "Lcom/tencent/mmkv/NativeBuffer;", "getBuffSize", "getContent", "Lcom/tencent/mm/protocal/protobuf/AppMsgContext;", "hasContent", "slotKey", "plugin-brandservice_release"})
public final class b
{
  private static final int jQJ = 900000;
  private static final int jQK = 3;
  private static HashMap<String, String> jQL;

  static
  {
    AppMethodBeat.i(14798);
    jQJ = 900000;
    jQK = 3;
    jQL = new HashMap();
    AppMethodBeat.o(14798);
  }

  private static final String FH(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(14786);
    Object localObject1;
    if (jQL.containsKey(paramString))
    {
      localObject1 = (Map)jQL;
      j.p(localObject1, "receiver$0");
      j.p(localObject1, "receiver$0");
      if ((localObject1 instanceof ac))
      {
        paramString = ((ac)localObject1).dWu();
        paramString = (String)paramString;
        AppMethodBeat.o(14786);
      }
    }
    while (true)
    {
      return paramString;
      Object localObject2 = ((Map)localObject1).get(paramString);
      if ((localObject2 == null) && (!((Map)localObject1).containsKey(paramString)))
      {
        paramString = (Throwable)new NoSuchElementException("Key " + paramString + " is missing in the map.");
        AppMethodBeat.o(14786);
        throw paramString;
      }
      paramString = (String)localObject2;
      break;
      localObject1 = new StringBuilder("matched_");
      while (true)
      {
        if (i >= 3)
          break label280;
        String str = new String[] { "__biz", "mid", "idx" }[i];
        localObject2 = m.dg(paramString, str);
        if (localObject2 == null)
        {
          localObject2 = Integer.toString(("not_matched_" + m.FT(paramString)).hashCode(), a.UW(16));
          j.o(localObject2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
          jQL.put(paramString, localObject2);
          AppMethodBeat.o(14786);
          paramString = (String)localObject2;
          break;
        }
        ((StringBuilder)localObject1).append(str + ':' + (String)localObject2 + '-');
        i++;
      }
      label280: localObject2 = Integer.toString(((StringBuilder)localObject1).toString().hashCode(), a.UW(16));
      j.o(localObject2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
      jQL.put(paramString, localObject2);
      AppMethodBeat.o(14786);
      paramString = (String)localObject2;
    }
  }

  public static final String FI(String paramString)
  {
    AppMethodBeat.i(14787);
    j.p(paramString, "url");
    paramString = "_info_" + FH(paramString);
    AppMethodBeat.o(14787);
    return paramString;
  }

  public static final String FJ(String paramString)
  {
    AppMethodBeat.i(14788);
    j.p(paramString, "url");
    paramString = "_content_" + FH(paramString);
    AppMethodBeat.o(14788);
    return paramString;
  }

  public static final String FK(String paramString)
  {
    AppMethodBeat.i(14789);
    j.p(paramString, "url");
    paramString = "_invalid_" + FH(paramString);
    AppMethodBeat.o(14789);
    return paramString;
  }

  public static final as FL(String paramString)
  {
    AppMethodBeat.i(14790);
    j.p(paramString, "id");
    long l = aWN();
    as localas = gI(l);
    if (localas.containsKey(paramString))
    {
      AppMethodBeat.o(14790);
      paramString = localas;
    }
    while (true)
    {
      return paramString;
      localas = gI(l - 1L);
      if (localas.containsKey(paramString))
      {
        AppMethodBeat.o(14790);
        paramString = localas;
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(14790);
      }
    }
  }

  public static final String FM(String paramString)
  {
    AppMethodBeat.i(14794);
    j.p(paramString, "receiver$0");
    Object localObject = FL(paramString);
    if (localObject != null)
    {
      localObject = ((as)localObject).getString(paramString, "");
      paramString = (String)localObject;
      if (localObject != null);
    }
    else
    {
      paramString = "";
    }
    AppMethodBeat.o(14794);
    return paramString;
  }

  public static final int FN(String paramString)
  {
    AppMethodBeat.i(14796);
    j.p(paramString, "receiver$0");
    as localas = FL(paramString);
    int i;
    if (localas != null)
    {
      i = localas.getValueActualSize(paramString);
      AppMethodBeat.o(14796);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(14796);
    }
  }

  public static final int a(String paramString, d paramd)
  {
    AppMethodBeat.i(14795);
    j.p(paramString, "receiver$0");
    j.p(paramd, "buffer");
    as localas = FL(paramString);
    int i;
    if (localas != null)
    {
      i = localas.writeValueToNativeBuffer(paramString, paramd);
      AppMethodBeat.o(14795);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(14795);
    }
  }

  public static final String a(ef paramef)
  {
    AppMethodBeat.i(14792);
    j.p(paramef, "receiver$0");
    paramef = paramef.Url;
    j.o(paramef, "this.Url");
    paramef = FJ(paramef);
    AppMethodBeat.o(14792);
    return paramef;
  }

  private static final int aWN()
  {
    AppMethodBeat.i(14780);
    int i = (int)(System.currentTimeMillis() / jQJ);
    AppMethodBeat.o(14780);
    return i;
  }

  public static final as aWO()
  {
    AppMethodBeat.i(14781);
    as localas = gI(aWN());
    AppMethodBeat.o(14781);
    return localas;
  }

  public static final void aWP()
  {
    AppMethodBeat.i(14791);
    long l = aWN();
    gJ(l - 1L);
    gJ(l);
    gJ(l + 1L);
    AppMethodBeat.o(14791);
  }

  public static final boolean b(ef paramef)
  {
    AppMethodBeat.i(14793);
    j.p(paramef, "receiver$0");
    boolean bool;
    if (FL(a(paramef)) != null)
    {
      bool = true;
      AppMethodBeat.o(14793);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14793);
    }
  }

  private static final String gG(long paramLong)
  {
    AppMethodBeat.i(14782);
    String str = "_slots_id_" + paramLong % jQK;
    AppMethodBeat.o(14782);
    return str;
  }

  private static final as gH(long paramLong)
  {
    AppMethodBeat.i(14783);
    as localas = as.eg(gG(paramLong), 2);
    j.o(localas, "MultiProcessMMKV.getMMKV… MMKV.MULTI_PROCESS_MODE)");
    AppMethodBeat.o(14783);
    return localas;
  }

  private static final as gI(long paramLong)
  {
    AppMethodBeat.i(14784);
    if (!gJ(paramLong))
      l.aXy().putLong(gG(paramLong), paramLong);
    as localas = gH(paramLong);
    AppMethodBeat.o(14784);
    return localas;
  }

  private static final boolean gJ(long paramLong)
  {
    AppMethodBeat.i(14785);
    boolean bool;
    if (l.aXy().getLong(gG(paramLong), 0L) != paramLong)
    {
      gH(paramLong).clear();
      bool = false;
      AppMethodBeat.o(14785);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(14785);
    }
  }

  public static final int sk(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(14797);
    Object localObject1 = l.aXy().decodeBytes("_msg_scene_strip");
    j.o(localObject1, "buff");
    int j;
    if (localObject1.length == 0)
    {
      j = 1;
      if (j != 0)
        break label168;
      j = i;
      label38: if (j == 0)
        break label173;
      Object localObject2 = new bui();
      ((bui)localObject2).parseFrom((byte[])localObject1);
      localObject2 = ((bui)localObject2).vKy;
      j.o(localObject2, "SceneControlSets().apply…(buff) }.SceneControlList");
      localObject1 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (buh)((Iterator)localObject1).next();
        if (((buh)localObject2).Scene == paramInt)
        {
          ab.i("MicroMsg.AppMsgContextEx", "strip " + paramInt + ':' + ((buh)localObject2).wVZ);
          paramInt = ((buh)localObject2).wVZ;
          AppMethodBeat.o(14797);
        }
      }
    }
    while (true)
    {
      return paramInt;
      j = 0;
      break;
      label168: j = 0;
      break label38;
      label173: paramInt = 10;
      AppMethodBeat.o(14797);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b
 * JD-Core Version:    0.6.2
 */