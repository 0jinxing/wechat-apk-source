package com.tencent.mm.ay;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class e extends a
{
  public String cGA;
  public LinkedList<String> fLl;
  public String url;

  public e(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
    AppMethodBeat.i(5558);
    this.fLl = new LinkedList();
    AppMethodBeat.o(5558);
  }

  protected final boolean Yt()
  {
    boolean bool = false;
    AppMethodBeat.i(5559);
    if (this.values == null)
    {
      ab.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] values == null ");
      AppMethodBeat.o(5559);
      return bool;
    }
    ab.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bo.nullAsNil(this.TYPE), Integer.valueOf(this.values.size()) });
    Object localObject2;
    int i;
    if ((!bo.isNullOrNil(this.TYPE)) && (this.TYPE.equalsIgnoreCase("delchatroommember")))
    {
      this.url = bo.nullAsNil((String)this.values.get(".sysmsg.delchatroommember.url"));
      this.cGA = bo.nullAsNil((String)this.values.get(".sysmsg.delchatroommember.link.qrcode"));
      this.fLl.add(this.values.get(".sysmsg.delchatroommember.link.memberlist.username"));
      Object localObject1 = this.values.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (((String)localObject2).startsWith(".sysmsg.delchatroommember.link.memberlist.username#"))
          this.fLl.add(this.values.get(localObject2));
      }
      localObject2 = new StringBuilder();
      Iterator localIterator = this.values.keySet().iterator();
      i = 0;
      label240: 
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        if (((String)localObject1).startsWith(fKU))
        {
          if (((StringBuilder)localObject2).length() > 0)
            ((StringBuilder)localObject2).insert(0, (String)this.values.get(localObject1));
          else
            ((StringBuilder)localObject2).append((String)this.values.get(localObject1));
        }
        else
        {
          if (!((String)localObject1).startsWith(".sysmsg.delchatroommember.link.text"))
            break label506;
          ((StringBuilder)localObject2).append((String)this.values.get(localObject1));
          this.fKY.add(this.values.get(localObject1));
          i = ((String)this.values.get(localObject1)).length();
        }
      }
    }
    label506: 
    while (true)
    {
      break label240;
      this.fKZ.addFirst(Integer.valueOf(((StringBuilder)localObject2).length() - i));
      this.fLa.add(Integer.valueOf(((StringBuilder)localObject2).length()));
      this.fKW = ((StringBuilder)localObject2).toString();
      ab.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] url:%s, qrcode:%s, members size :%s", new Object[] { this.url, this.cGA, Integer.valueOf(this.fLl.size()) });
      AppMethodBeat.o(5559);
      bool = true;
      break;
      ab.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type err :%s", new Object[] { bo.nullAsNil(this.TYPE) });
      AppMethodBeat.o(5559);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ay.e
 * JD-Core Version:    0.6.2
 */