package com.tencent.mm.plugin.sns.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ary;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.db;
import com.tencent.mm.protocal.protobuf.fq;
import com.tencent.mm.protocal.protobuf.fr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  private static int YC(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(36815);
    try
    {
      j = bo.getInt(paramString, 0);
      AppMethodBeat.o(36815);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AlbumBgHelper", "parserInt error ".concat(String.valueOf(paramString)));
        int j = i;
      }
    }
  }

  public static db YD(String paramString)
  {
    AppMethodBeat.i(36817);
    Map localMap = br.z(paramString, "albumList");
    paramString = new db();
    if (localMap != null)
    {
      paramString.nbs = tB((String)localMap.get(".albumList.$lang"));
      paramString = b(localMap, a(localMap, paramString));
    }
    while (true)
    {
      AppMethodBeat.o(36817);
      return paramString;
    }
  }

  private static db a(Map<String, String> paramMap, db paramdb)
  {
    AppMethodBeat.i(36818);
    fq localfq = new fq();
    localfq.Name = tB((String)paramMap.get(".albumList.album.author.name"));
    localfq.Title = tB((String)paramMap.get(".albumList.album.author.title"));
    localfq.vEA = tB((String)paramMap.get(".albumList.album.author.description"));
    localfq.vHz = tB((String)paramMap.get(".albumList.album.author.quote"));
    localfq.vHA = ad(paramMap);
    paramdb.vFj = localfq;
    AppMethodBeat.o(36818);
    return paramdb;
  }

  private static fr ad(Map<String, String> paramMap)
  {
    AppMethodBeat.i(36819);
    fr localfr = new fr();
    baw localbaw = o(paramMap, ".albumList.album.author.icon.media");
    String str1 = (String)paramMap.get(".albumList.album.author.icon.media.id");
    String str2 = (String)paramMap.get(".albumList.album.author.icon.media.type");
    String str3 = (String)paramMap.get(".albumList.album.author.icon.media.title");
    String str4 = (String)paramMap.get(".albumList.album.author.icon.media.desc");
    String str5 = (String)paramMap.get(".albumList.album.author.icon.media.url");
    String str6 = (String)paramMap.get(".albumList.album.author.icon.media.private");
    String str7 = (String)paramMap.get(".albumList.album.author.icon.media.thumb");
    String str8 = (String)paramMap.get(".albumList.album.author.icon.media.url.$type");
    String str9 = (String)paramMap.get(".albumList.album.author.icon.media.thumb.$type");
    paramMap = new bau();
    paramMap.Id = tB(str1);
    paramMap.jCt = YC(str2);
    paramMap.Title = tB(str3);
    paramMap.Desc = tB(str4);
    paramMap.Url = tB(str5);
    paramMap.wEG = YC(str8);
    paramMap.wEH = tB(str7);
    paramMap.wEI = YC(str9);
    paramMap.wEJ = YC(str6);
    paramMap.wEK = localbaw;
    localfr.vHB = paramMap;
    AppMethodBeat.o(36819);
    return localfr;
  }

  private static db b(Map<String, String> paramMap, db paramdb)
  {
    AppMethodBeat.i(36821);
    int i = 0;
    ary localary = new ary();
    String str1;
    if (i == 0)
      str1 = ".albumList.album.groupList.group.name";
    for (String str2 = ".albumList.album.groupList.group.mediaList"; ; str2 = ".albumList.album.groupList.group" + i + ".mediaList")
    {
      str1 = (String)paramMap.get(str1);
      if (str1 == null)
        break label128;
      localary.Name = tB(str1);
      localary.wbK = p(paramMap, str2);
      paramdb.vFk.add(localary);
      i++;
      break;
      str1 = ".albumList.album.groupList.group" + i + ".name";
    }
    label128: AppMethodBeat.o(36821);
    return paramdb;
  }

  private static baw o(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(36820);
    String str1 = paramString + ".size.$width";
    String str2 = paramString + ".size.$height";
    String str3 = paramString + ".size.$totalSize";
    paramString = (String)paramMap.get(str1);
    str2 = (String)paramMap.get(str2);
    str3 = (String)paramMap.get(str3);
    paramMap = new baw();
    paramMap.wFy = 0.0F;
    paramMap.wFx = 0.0F;
    paramMap.wFz = 0.0F;
    if (paramString != null)
      paramMap.wFx = tA(paramString);
    if (str2 != null)
      paramMap.wFy = tA(str2);
    if (str3 != null)
      paramMap.wFz = tA(str3);
    AppMethodBeat.o(36820);
    return paramMap;
  }

  private static LinkedList<bau> p(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(36822);
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    Object localObject1;
    String str8;
    if (i != 0)
    {
      str1 = paramString + ".media" + i + ".id";
      str2 = paramString + ".media" + i + ".type";
      str3 = paramString + ".media" + i + ".title";
      str4 = paramString + ".media" + i + ".desc";
      str5 = paramString + ".media" + i + ".url";
      str6 = paramString + ".media" + i + ".thumb";
      str7 = paramString + ".media" + i + ".url.$type";
      localObject1 = paramString + ".media" + i + ".thumb.$type";
      str8 = paramString + ".media" + i + ".private";
    }
    for (Object localObject2 = paramString + ".media" + i; ; localObject2 = paramString + ".media")
    {
      if ((str1 == null) || (str2 == null))
        break label821;
      localObject2 = o(paramMap, (String)localObject2);
      str1 = (String)paramMap.get(str1);
      str2 = (String)paramMap.get(str2);
      str3 = (String)paramMap.get(str3);
      str4 = (String)paramMap.get(str4);
      str5 = (String)paramMap.get(str5);
      str8 = (String)paramMap.get(str8);
      str6 = (String)paramMap.get(str6);
      str7 = (String)paramMap.get(str7);
      String str9 = (String)paramMap.get(localObject1);
      if ((str1 == null) || (str2 == null))
        break label821;
      localObject1 = new bau();
      ((bau)localObject1).Id = tB(str1);
      ((bau)localObject1).jCt = YC(str2);
      ((bau)localObject1).Title = tB(str3);
      ((bau)localObject1).Desc = tB(str4);
      ((bau)localObject1).Url = tB(str5);
      ((bau)localObject1).wEG = YC(str7);
      ((bau)localObject1).wEH = tB(str6);
      ((bau)localObject1).wEI = YC(str9);
      ((bau)localObject1).wEJ = YC(str8);
      ((bau)localObject1).wEK = ((baw)localObject2);
      localLinkedList.add(localObject1);
      i++;
      break;
      str1 = paramString + ".media.id";
      str2 = paramString + ".media.type";
      str3 = paramString + ".media.title";
      str4 = paramString + ".media.desc";
      str5 = paramString + ".media.url";
      str6 = paramString + ".media.thumb";
      str7 = paramString + ".media.url.$type";
      localObject1 = paramString + ".media.thumb.$type";
      str8 = paramString + ".media.private";
    }
    label821: AppMethodBeat.o(36822);
    return localLinkedList;
  }

  private static float tA(String paramString)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(36816);
    if (paramString == null)
    {
      AppMethodBeat.o(36816);
      f1 = f2;
    }
    while (true)
    {
      return f1;
      try
      {
        f2 = bo.getFloat(paramString, 0.0F);
        f1 = f2;
        AppMethodBeat.o(36816);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.AlbumBgHelper", "parseFloat error ".concat(String.valueOf(paramString)));
      }
    }
  }

  private static String tB(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.h.a
 * JD-Core Version:    0.6.2
 */