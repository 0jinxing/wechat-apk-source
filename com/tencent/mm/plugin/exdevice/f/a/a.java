package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.plugin.exdevice.f.b.a.c;
import com.tencent.mm.plugin.exdevice.f.b.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a
{
  public static ArrayList<d> a(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, String> paramMap, List<c> paramList)
  {
    AppMethodBeat.i(19430);
    ab.d("MicroMsg.ExdeviceMsgXmlParser", paramString3);
    if (bo.isNullOrNil(paramString3))
    {
      ab.e("MicroMsg.ExdeviceMsgXmlParser", "rank info is null or nil");
      paramString1 = null;
      AppMethodBeat.o(19430);
    }
    while (true)
    {
      return paramString1;
      paramString3 = j.b.X(paramString3, paramString4);
      if (paramString3 != null)
      {
        Map localMap = paramString3.fgm;
        paramString4 = new ArrayList();
        boolean bool;
        label68: int i;
        Object localObject1;
        if (localMap == null)
        {
          bool = true;
          ab.d("MicroMsg.ExdeviceMsgXmlParser", "map is null :%s", new Object[] { Boolean.valueOf(bool) });
          if ((localMap == null) || (localMap.isEmpty()))
            break label715;
          ab.d("MicroMsg.ExdeviceMsgXmlParser", "ap: map %s", new Object[] { localMap.toString() });
          i = 0;
          localObject1 = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
          if (i != 0)
            break label333;
          paramString3 = "";
          label143: localObject1 = (String)localMap.get(paramString3 + ".username");
          if (!bo.isNullOrNil((String)localObject1))
            break label342;
          ab.i("MicroMsg.ExdeviceMsgXmlParser", "follow should break now : %d", new Object[] { Integer.valueOf(i) });
          i = 0;
          paramList = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
          if (i != 0)
            break label511;
          paramString3 = "";
          label218: paramList = (String)localMap.get(paramString3 + ".username");
          localObject1 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
          if (i != 0)
            break label520;
        }
        label333: label342: label361: Object localObject3;
        label520: for (paramString3 = ""; ; paramString3 = Integer.valueOf(i))
        {
          localObject1 = (String)localMap.get(paramString3 + ".nickname");
          if (!bo.isNullOrNil(paramList))
            break label529;
          ab.i("MicroMsg.ExdeviceMsgXmlParser", "should break now : %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(19430);
          paramString1 = paramString4;
          break;
          bool = false;
          break label68;
          paramString3 = Integer.valueOf(i);
          break label143;
          localObject2 = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
          if (i == 0)
          {
            paramString3 = "";
            localObject2 = (String)localMap.get(paramString3 + ".nickname");
            localObject3 = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
            if (i != 0)
              break label502;
          }
          label502: for (paramString3 = ""; ; paramString3 = Integer.valueOf(i))
          {
            localObject3 = (String)localMap.get(paramString3 + ".step");
            paramString3 = new c();
            paramString3.field_appusername = paramString2;
            paramString3.field_username = ((String)localObject1);
            paramString3.field_rankID = paramString1;
            paramString3.field_step = bo.getInt((String)localObject3, 0);
            paramList.add(paramString3);
            paramMap.put(localObject1, localObject2);
            i++;
            break;
            paramString3 = Integer.valueOf(i);
            break label361;
          }
          label511: paramString3 = Integer.valueOf(i);
          break label218;
        }
        label529: Object localObject2 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
        if (i == 0)
        {
          paramString3 = "";
          label548: localObject2 = (String)localMap.get(paramString3 + ".rank.rankdisplay");
          localObject3 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
          if (i != 0)
            break label706;
        }
        label706: for (paramString3 = ""; ; paramString3 = Integer.valueOf(i))
        {
          int j = bo.getInt((String)localMap.get(paramString3 + ".score.scoredisplay"), 0);
          paramString3 = new d();
          paramString3.field_appusername = paramString2;
          paramString3.field_rankID = paramString1;
          paramString3.field_username = paramList;
          paramString3.field_ranknum = bo.getInt((String)localObject2, 0);
          paramString3.field_score = j;
          paramString3.field_selfLikeState = 2;
          paramString3.field_likecount = 0;
          paramString4.add(paramString3);
          paramMap.put(paramList, localObject1);
          i++;
          break;
          paramString3 = Integer.valueOf(i);
          break label548;
        }
      }
      label715: paramString1 = null;
      AppMethodBeat.o(19430);
    }
  }

  public static void d(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    int i = 0;
    AppMethodBeat.i(19431);
    ab.d("MicroMsg.ExdeviceMsgXmlParser", "ap: only nickname: %s", new Object[] { paramString1 });
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.ExdeviceMsgXmlParser", "rank info is null or nil");
      AppMethodBeat.o(19431);
    }
    while (true)
    {
      return;
      paramString1 = j.b.X(paramString1, paramString2);
      if (paramString1 != null)
      {
        paramString2 = paramString1.fgm;
        if ((paramString2 != null) && (!paramString2.isEmpty()))
        {
          int j = 0;
          Object localObject = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
          label94: int k;
          StringBuilder localStringBuilder;
          if (j == 0)
          {
            paramString1 = "";
            localObject = (String)paramString2.get(paramString1 + ".username");
            k = i;
            if (bo.isNullOrNil((String)localObject))
              break label205;
            localStringBuilder = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
            if (j != 0)
              break label196;
          }
          label196: for (paramString1 = ""; ; paramString1 = Integer.valueOf(j))
          {
            paramMap.put(localObject, (String)paramString2.get(paramString1 + ".nickname"));
            j++;
            break;
            paramString1 = Integer.valueOf(j);
            break label94;
          }
          label205: localObject = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
          if (k == 0)
          {
            paramString1 = "";
            label224: localObject = (String)paramString2.get(paramString1 + ".username");
            localStringBuilder = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
            if (k != 0)
              break label325;
          }
          label325: for (paramString1 = ""; ; paramString1 = Integer.valueOf(k))
          {
            paramString1 = (String)paramString2.get(paramString1 + ".nickname");
            if (bo.isNullOrNil((String)localObject))
              break label334;
            paramMap.put(localObject, paramString1);
            k++;
            break;
            paramString1 = Integer.valueOf(k);
            break label224;
          }
        }
      }
      label334: AppMethodBeat.o(19431);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.a
 * JD-Core Version:    0.6.2
 */