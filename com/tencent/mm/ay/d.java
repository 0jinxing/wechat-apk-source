package com.tencent.mm.ay;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;
import java.util.Map;

public final class d extends a
{
  public String cxb;
  public String fLc;
  public LinkedList<String> fLd;
  public int fLf;
  public LinkedList<String> fLg;
  public LinkedList<String> fLh;
  public String fLi;
  public String fLj;
  public String fLk;
  public String text;

  public d(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
    AppMethodBeat.i(5556);
    this.fLd = new LinkedList();
    this.fLg = new LinkedList();
    this.fLh = new LinkedList();
    this.fLi = null;
    this.fLj = null;
    this.fLk = null;
    this.text = null;
    AppMethodBeat.o(5556);
  }

  protected final boolean Yt()
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(5557);
    if (this.values == null)
    {
      ab.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] values == null ");
      AppMethodBeat.o(5557);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bo.nullAsNil(this.TYPE), Integer.valueOf(this.values.size()) });
      if ((!bo.isNullOrNil(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")))
      {
        this.fLc = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.RoomName"));
        if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text"))
          this.fLk = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text"));
        if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername"))
          this.fLi = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername"));
        if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason"))
          this.fLj = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason"));
        if (this.values.containsKey(fKU))
          this.text = bo.nullAsNil((String)this.values.get(fKU));
        if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket"))
          this.cxb = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket"));
        if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize"))
          this.fLf = bo.getInt((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize"), 0);
        if (!this.cKd.dtS())
        {
          this.fKZ.add(Integer.valueOf(this.text.length()));
          this.fKY.add(this.fLk);
          this.fKW = (this.text + this.fLk);
          this.fLa.add(Integer.valueOf(this.fKW.length()));
          if (i >= this.fLf)
            break label766;
          if (i != 0)
            break label631;
          this.fLd.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.username")));
          this.fLg.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.nickname")));
          this.fLh.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.headimgurl")));
        }
        while (true)
        {
          i++;
          break;
          this.fKY.clear();
          this.fKZ.clear();
          this.fLa.clear();
          this.fKW = (this.text + " ");
          this.fKZ.add(Integer.valueOf(this.fKW.length()));
          this.fKY.add(ah.getContext().getString(2131300517));
          this.fKW += ah.getContext().getString(2131300517);
          this.fLa.add(Integer.valueOf(this.fKW.length()));
          break;
          label631: this.fLd.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".username")));
          this.fLg.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".nickname")));
          this.fLh.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".headimgurl")));
        }
        label766: AppMethodBeat.o(5557);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type err :%s", new Object[] { bo.nullAsNil(this.TYPE) });
        AppMethodBeat.o(5557);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ay.d
 * JD-Core Version:    0.6.2
 */