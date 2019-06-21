package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class i
{
  public String cdu;
  private Map<String, i.a> cdv;
  public int versionCode;

  public i(String paramString, int paramInt)
  {
    AppMethodBeat.i(125693);
    this.cdv = new HashMap();
    if (paramString == null);
    for (this.cdu = "http://dldir1.qq.com/weixin/android/"; ; this.cdu = paramString)
    {
      this.versionCode = paramInt;
      AppMethodBeat.o(125693);
      return;
    }
  }

  public static i cO(String paramString)
  {
    AppMethodBeat.i(125697);
    Map localMap = f.z(paramString, "patchupdate");
    if (localMap == null)
    {
      paramString = null;
      AppMethodBeat.o(125697);
    }
    i locali;
    int j;
    while (true)
    {
      return paramString;
      locali = new i((String)localMap.get(".patchupdate.$base"), j.getInt((String)localMap.get(".patchupdate.$versioncode"), 0));
      int i = j.getInt((String)localMap.get(".patchupdate.$count"), 0);
      j = 0;
      if (j < i)
        break;
      AppMethodBeat.o(125697);
      paramString = locali;
    }
    StringBuilder localStringBuilder = new StringBuilder(".patchupdate.item");
    if (j > 0)
    {
      paramString = Integer.valueOf(j);
      label116: paramString = paramString;
      paramString = new i.a((String)localMap.get(paramString + ".$old"), (String)localMap.get(paramString + ".$new"), (String)localMap.get(paramString + ".$patch"), (String)localMap.get(paramString + ".$url"), j.getInt((String)localMap.get(paramString + ".$size"), 0));
      if ((paramString.cdw == null) || (paramString.cdx == null) || (paramString.cdy == null) || (paramString.url == null))
        break label341;
    }
    label341: for (int k = 1; ; k = 0)
    {
      if (k != 0)
        locali.cdv.put(paramString.cdw, paramString);
      j++;
      break;
      paramString = "";
      break label116;
    }
  }

  public final String AM()
  {
    AppMethodBeat.i(125696);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("<patchupdate base=\"%s\" count=\"%d\" versioncode=\"%d\">", new Object[] { this.cdu, Integer.valueOf(this.cdv.size()), Integer.valueOf(this.versionCode) }));
    Object localObject = this.cdv.entrySet().iterator();
    while (true)
    {
      if (!((Iterator)localObject).hasNext())
      {
        localStringBuilder.append("</patchupdate>");
        localObject = localStringBuilder.toString();
        AppMethodBeat.o(125696);
        return localObject;
      }
      i.a locala = (i.a)((Map.Entry)((Iterator)localObject).next()).getValue();
      localStringBuilder.append(String.format("<item old=\"%s\" new=\"%s\" patch=\"%s\" url=\"%s\" size=\"%s\"></item>", new Object[] { locala.cdw, locala.cdx, locala.cdy, locala.url, Integer.valueOf(locala.size) }));
    }
  }

  public final void a(i.a parama)
  {
    AppMethodBeat.i(125694);
    this.cdv.put(parama.cdw, parama);
    AppMethodBeat.o(125694);
  }

  public final i.a cN(String paramString)
  {
    AppMethodBeat.i(125695);
    paramString = (i.a)this.cdv.get(paramString);
    AppMethodBeat.o(125695);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.i
 * JD-Core Version:    0.6.2
 */