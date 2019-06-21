package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class g
{
  public static d Hi(String paramString)
  {
    AppMethodBeat.i(88869);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = null;
      AppMethodBeat.o(88869);
    }
    while (true)
    {
      return paramString;
      d locald = new d();
      paramString = br.z(paramString, "msg");
      locald.kde = ((String)paramString.get(".msg.appmsg.carditem.from_username"));
      locald.cMC = ((String)paramString.get(".msg.appmsg.carditem.card_id"));
      locald.iAd = Hk((String)paramString.get(".msg.appmsg.carditem.card_type"));
      locald.cME = Hk((String)paramString.get(".msg.appmsg.carditem.from_scene"));
      locald.color = ((String)paramString.get(".msg.appmsg.carditem.color"));
      locald.kdf = ((String)paramString.get(".msg.appmsg.carditem.card_type_name"));
      locald.kdg = ((String)paramString.get(".msg.appmsg.carditem.brand_name"));
      locald.cMD = ((String)paramString.get(".msg.appmsg.carditem.card_ext"));
      locald.kdh = Hk((String)paramString.get(".msg.appmsg.carditem.is_recommend"));
      locald.kdi = ((String)paramString.get(".msg.appmsg.carditem.recommend_card_id"));
      AppMethodBeat.o(88869);
      paramString = locald;
    }
  }

  public static String Hj(String paramString)
  {
    AppMethodBeat.i(88870);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = null;
      AppMethodBeat.o(88870);
    }
    while (true)
    {
      return paramString;
      paramString = (String)br.z(paramString, "msg").get(".msg.appmsg.fromusername");
      AppMethodBeat.o(88870);
    }
  }

  private static int Hk(String paramString)
  {
    AppMethodBeat.i(88871);
    int i;
    if ((TextUtils.isEmpty(paramString)) || (!l.isNumeric(paramString)))
    {
      i = 0;
      AppMethodBeat.o(88871);
    }
    while (true)
    {
      return i;
      i = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(88871);
    }
  }

  public static String a(d paramd)
  {
    AppMethodBeat.i(88872);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<from_username>").append(paramd.kde).append("</from_username>");
    localStringBuilder.append("<card_id>").append(paramd.cMC).append("</card_id>");
    localStringBuilder.append("<card_type>").append(paramd.iAd).append("</card_type>");
    localStringBuilder.append("<from_scene>").append(paramd.cME).append("</from_scene>");
    localStringBuilder.append("<color>").append(paramd.color).append("</color>");
    localStringBuilder.append("<card_type_name>").append(paramd.kdf).append("</card_type_name>");
    localStringBuilder.append("<brand_name>").append(paramd.kdg).append("</brand_name>");
    if (TextUtils.isEmpty(paramd.cMD))
      localStringBuilder.append("<card_ext></card_ext>");
    while (true)
    {
      localStringBuilder.append("<is_recommend>").append(paramd.kdh).append("</is_recommend>");
      localStringBuilder.append("<recommend_card_id>").append(paramd.kdi).append("</recommend_card_id>");
      paramd = localStringBuilder.toString();
      AppMethodBeat.o(88872);
      return paramd;
      localStringBuilder.append("<card_ext>").append(paramd.cMD).append("</card_ext>");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.g
 * JD-Core Version:    0.6.2
 */