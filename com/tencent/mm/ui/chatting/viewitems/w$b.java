package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class w$b
{
  public String cRS;
  public String fhu;
  public String fjv;
  public String fjw;
  public String fjx;
  public String fjy;
  public String fjz;
  public long time;
  public String title;
  public int type;
  public String url;

  public static b aX(Map<String, String> paramMap)
  {
    AppMethodBeat.i(33156);
    b localb = new b();
    localb.title = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.title"));
    localb.url = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.url"));
    localb.cRS = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.native_url"));
    localb.fjv = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.shorturl"));
    localb.fjw = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.longurl"));
    localb.time = bo.getLong((String)paramMap.get(".msg.appmsg.mmreader.category.item.pub_time"), 0L);
    localb.fjx = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.cover"));
    localb.fjy = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.tweetid"));
    localb.fjz = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.digest"));
    localb.type = bo.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
    localb.fhu = ((String)paramMap.get(".msg.appmsg.template_id"));
    AppMethodBeat.o(33156);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.b
 * JD-Core Version:    0.6.2
 */