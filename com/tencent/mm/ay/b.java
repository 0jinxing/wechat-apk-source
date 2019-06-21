package com.tencent.mm.ay;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class b extends a
{
  public String cxb;
  public String fLc;
  public LinkedList<String> fLd;
  public String fLe;
  public String text;

  public b(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
    AppMethodBeat.i(5553);
    this.fLd = new LinkedList();
    this.text = null;
    this.fLe = null;
    this.cxb = null;
    AppMethodBeat.o(5553);
  }

  protected final boolean Yt()
  {
    boolean bool = false;
    AppMethodBeat.i(5554);
    if (this.values == null)
    {
      ab.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] values == null ");
      AppMethodBeat.o(5554);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bo.nullAsNil(this.TYPE), Integer.valueOf(this.values.size()) });
      if ((!bo.isNullOrNil(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")))
      {
        this.fLc = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.RoomName"));
        if (this.values.containsKey(fKU))
          this.text = bo.nullAsNil((String)this.values.get(fKU));
        if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text"))
          this.fLe = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text"));
        if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket"))
          this.cxb = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket"));
        this.fKW = this.text;
        if (!this.cKd.dtS())
        {
          this.fKY.add(this.fLe);
          this.fKZ.add(Integer.valueOf(this.fKW.length()));
          this.fKW += this.fLe;
          this.fLa.add(Integer.valueOf(this.fKW.length()));
        }
        while (true)
        {
          Iterator localIterator = this.values.keySet().iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            if (str.startsWith(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.memberlist.username"))
              this.fLd.add(this.values.get(str));
          }
          this.fKW = (this.fKW + " " + ah.getContext().getString(2131300521));
        }
        AppMethodBeat.o(5554);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type err :%s", new Object[] { bo.nullAsNil(this.TYPE) });
        AppMethodBeat.o(5554);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ay.b
 * JD-Core Version:    0.6.2
 */