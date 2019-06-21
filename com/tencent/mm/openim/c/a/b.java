package com.tencent.mm.openim.c.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ay.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;
import java.util.Map;

public final class b extends a
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
  public LinkedList<String> gfr;
  public LinkedList<String> gfs;
  public String gft;
  public String gfu;
  public String text;

  public b(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
    AppMethodBeat.i(78918);
    this.fLd = new LinkedList();
    this.fLg = new LinkedList();
    this.gfr = new LinkedList();
    this.gfs = new LinkedList();
    this.fLh = new LinkedList();
    this.fLi = null;
    this.gft = null;
    this.gfu = null;
    this.fLj = null;
    this.fLk = null;
    this.text = null;
    AppMethodBeat.o(78918);
  }

  public final boolean Yt()
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(78919);
    if (this.values == null)
    {
      ab.e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] values == null ");
      AppMethodBeat.o(78919);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bo.nullAsNil(this.TYPE), Integer.valueOf(this.values.size()) });
      if ((!bo.isNullOrNil(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlOpenIMChatRoomAddChatRoomMemberApplication")))
      {
        this.fLc = ((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.RoomName"));
        if (this.values.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text"))
          this.fLk = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text"));
        if (this.values.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter" + ".username"))
          this.fLi = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter" + ".username"));
        if (this.values.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter" + ".appid"))
          this.gft = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter" + ".appid"));
        if (this.values.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter" + ".descid"))
          this.gfu = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter" + ".descid"));
        if (this.values.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason"))
          this.fLj = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason"));
        if (this.values.containsKey(fKU))
          this.text = bo.nullAsNil((String)this.values.get(fKU));
        if (this.values.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket"))
          this.cxb = ((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket"));
        if (this.values.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize"))
          this.fLf = bo.getInt((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize"), 0);
        if (!this.cKd.dtS())
        {
          this.fKZ.add(Integer.valueOf(this.text.length()));
          this.fKY.add(this.fLk);
          this.fKW = (this.text + this.fLk);
          this.fLa.add(Integer.valueOf(this.fKW.length()));
          if (i >= this.fLf)
            break label1080;
          if (i != 0)
            break label857;
          this.fLd.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.username")));
          this.fLg.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.nickname")));
          this.gfr.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.descid")));
          this.gfs.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.appid")));
          this.fLh.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.headimgurl")));
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
          label857: this.fLd.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".username")));
          this.fLg.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".nickname")));
          this.gfs.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".appid")));
          this.gfr.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".descid")));
          this.fLh.add(bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".headimgurl")));
        }
        label1080: AppMethodBeat.o(78919);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type err :%s", new Object[] { bo.nullAsNil(this.TYPE) });
        AppMethodBeat.o(78919);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.c.a.b
 * JD-Core Version:    0.6.2
 */