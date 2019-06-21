package com.tencent.mm.plugin.order.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.order.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c
{
  public List<j> kbM;
  private List<a> pbW;

  public c()
  {
    AppMethodBeat.i(43753);
    this.kbM = new ArrayList();
    this.pbW = new ArrayList();
    loadFromDB();
    bYX();
    bYW();
    bYY();
    AppMethodBeat.o(43753);
  }

  public static j Ut(String paramString)
  {
    AppMethodBeat.i(43757);
    Map localMap = br.z(paramString, "sysmsg");
    if (localMap == null)
    {
      paramString = null;
      AppMethodBeat.o(43757);
    }
    while (true)
    {
      return paramString;
      j localj = new j();
      localj.pdo = ((String)localMap.get(".sysmsg.paymsg.PayMsgType"));
      localj.pdp = ((String)localMap.get(".sysmsg.paymsg.Brief.IconUrl"));
      localj.pdq = ((String)localMap.get(".sysmsg.paymsg.Brief.CreateTime"));
      localj.pdr = ((String)localMap.get(".sysmsg.paymsg.StatusSection.IconUrl"));
      localj.pds = ((String)localMap.get(".sysmsg.paymsg.StatusSection.StatusDesc"));
      localj.cJh = ((String)localMap.get(".sysmsg.paymsg.StatusSection.Content"));
      localj.pdt = ((String)localMap.get(".sysmsg.paymsg.StatusSection.JumpUrl"));
      localj.pdu = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppUserName"));
      localj.pde = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppNickName"));
      localj.pdv = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppTelephone"));
      int i = 0;
      if (i == 0)
        paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.Name");
      for (String str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.JumpUrl"); ; str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".JumpUrl"))
      {
        if (TextUtils.isEmpty(paramString))
          break label345;
        localObject = new j.a();
        ((j.a)localObject).name = paramString;
        ((j.a)localObject).jumpUrl = str;
        if (localj.pdw == null)
          localj.pdw = new ArrayList();
        localj.pdw.add(localObject);
        i++;
        break;
        paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".Name");
      }
      label345: i = 0;
      if (i == 0)
      {
        str = (String)localMap.get(".sysmsg.paymsg.NormalSection.Name");
        paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection.Value");
      }
      for (Object localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection.JumpUrl"); ; localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".JumpUrl"))
      {
        if (TextUtils.isEmpty(str))
          break label560;
        j.b localb = new j.b();
        localb.name = str;
        localb.value = paramString;
        localb.jumpUrl = ((String)localObject);
        if (localj.pdx == null)
          localj.pdx = new ArrayList();
        localj.pdx.add(localb);
        i++;
        break;
        str = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Name");
        paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Value");
      }
      label560: AppMethodBeat.o(43757);
      paramString = localj;
    }
  }

  private boolean a(j paramj)
  {
    boolean bool = false;
    AppMethodBeat.i(43759);
    if (paramj == null)
      AppMethodBeat.o(43759);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= this.pbW.size())
          break label106;
        a locala = (a)this.pbW.get(i);
        if (paramj.cJb.equals(locala.field_msgId))
        {
          this.pbW.remove(locala);
          com.tencent.mm.plugin.order.a.b.bYR();
          bool = com.tencent.mm.plugin.order.a.b.bYT().a(locala, new String[0]);
          AppMethodBeat.o(43759);
          break;
        }
      }
      label106: AppMethodBeat.o(43759);
    }
  }

  private void bYW()
  {
    AppMethodBeat.i(43756);
    if ((this.kbM == null) || (this.kbM.size() == 0))
      AppMethodBeat.o(43756);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(this.kbM);
      for (int i = 0; i < localArrayList.size(); i++)
      {
        j localj = (j)localArrayList.get(i);
        if ((localj.pdo != null) && (com.tencent.mm.plugin.order.c.c.isNumeric(localj.pdo)))
        {
          int j = Integer.valueOf(localj.pdo).intValue();
          if ((j != 2) && (j != 1))
            Uu(localj.cJb);
        }
      }
      AppMethodBeat.o(43756);
    }
  }

  private void bYX()
  {
    AppMethodBeat.i(43760);
    for (int i = 0; i < this.pbW.size(); i++)
    {
      a locala = (a)this.pbW.get(i);
      String str = locala.field_msgContentXml;
      j localj = Ut(str);
      localj.cJb = locala.field_msgId;
      this.kbM.add(localj);
      ab.v("MicroMsg.MallPayMsgManager", "parsePayMsgFromMsgXmlList xml:".concat(String.valueOf(str)));
    }
    AppMethodBeat.o(43760);
  }

  private void loadFromDB()
  {
    AppMethodBeat.i(43755);
    com.tencent.mm.plugin.order.a.b.bYR();
    Cursor localCursor = com.tencent.mm.plugin.order.a.b.bYT().baR();
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      localCursor.moveToFirst();
      int i = localCursor.getColumnIndex("msgId");
      int j = localCursor.getColumnIndex("msgContentXml");
      int k = localCursor.getColumnIndex("isRead");
      while (!localCursor.isAfterLast())
      {
        a locala = new a();
        locala.field_msgId = localCursor.getString(i);
        locala.field_msgContentXml = localCursor.getString(j);
        locala.field_isRead = localCursor.getString(k);
        localCursor.moveToNext();
        this.pbW.add(locala);
      }
    }
    if (localCursor != null)
      localCursor.close();
    AppMethodBeat.o(43755);
  }

  public final boolean Uu(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(43758);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(43758);
    while (true)
    {
      return bool;
      paramString = Uw(paramString);
      if (paramString != null)
      {
        this.kbM.remove(paramString);
        a(paramString);
        bool = true;
        AppMethodBeat.o(43758);
      }
      else
      {
        AppMethodBeat.o(43758);
      }
    }
  }

  public final boolean Uv(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(43761);
    if ((this.kbM == null) || (TextUtils.isEmpty(paramString)))
      AppMethodBeat.o(43761);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= this.kbM.size())
          break label94;
        j localj = (j)this.kbM.get(i);
        if ((localj != null) && (localj.cJb.equals(paramString)))
        {
          bool = true;
          AppMethodBeat.o(43761);
          break;
        }
      }
      label94: AppMethodBeat.o(43761);
    }
  }

  public final j Uw(String paramString)
  {
    AppMethodBeat.i(43762);
    if ((this.kbM == null) || (TextUtils.isEmpty(paramString)))
    {
      AppMethodBeat.o(43762);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      for (int i = 0; ; i++)
      {
        if (i >= this.kbM.size())
          break label87;
        j localj = (j)this.kbM.get(i);
        if (paramString.equals(localj.cJb))
        {
          AppMethodBeat.o(43762);
          paramString = localj;
          break;
        }
      }
      label87: AppMethodBeat.o(43762);
      paramString = null;
    }
  }

  public final a Ux(String paramString)
  {
    AppMethodBeat.i(43763);
    if ((this.pbW == null) || (TextUtils.isEmpty(paramString)))
    {
      AppMethodBeat.o(43763);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      for (int i = 0; ; i++)
      {
        if (i >= this.pbW.size())
          break label87;
        a locala = (a)this.pbW.get(i);
        if (paramString.equals(locala.field_msgId))
        {
          AppMethodBeat.o(43763);
          paramString = locala;
          break;
        }
      }
      label87: AppMethodBeat.o(43763);
      paramString = null;
    }
  }

  public final void a(j paramj, String paramString1, String paramString2)
  {
    AppMethodBeat.i(43754);
    if ((paramj == null) || (TextUtils.isEmpty(paramString1)))
      AppMethodBeat.o(43754);
    while (true)
    {
      return;
      a locala = new a();
      locala.field_msgId = paramj.cJb;
      locala.field_msgContentXml = paramString1;
      locala.field_isRead = paramString2;
      com.tencent.mm.plugin.order.a.b.bYR();
      if (!com.tencent.mm.plugin.order.a.b.bYT().a(locala))
        ab.e("MicroMsg.MallPayMsgManager", "insert CommonMsgXml failed! id:" + paramj.cJb);
      this.pbW.add(locala);
      AppMethodBeat.o(43754);
    }
  }

  public final void bYY()
  {
    AppMethodBeat.i(43764);
    int i = bYZ();
    g.RQ();
    g.RP().Ry().set(204820, Integer.valueOf(i));
    ab.v("MicroMsg.MallPayMsgManager", "save unread msg is :".concat(String.valueOf(i)));
    AppMethodBeat.o(43764);
  }

  public final int bYZ()
  {
    AppMethodBeat.i(43765);
    int i;
    if ((this.pbW == null) || (this.pbW.size() == 0))
    {
      AppMethodBeat.o(43765);
      i = 0;
    }
    while (true)
    {
      return i;
      int j = 0;
      int k;
      for (i = 0; j < this.pbW.size(); i = k)
      {
        a locala = (a)this.pbW.get(j);
        k = i;
        if (locala != null)
        {
          k = i;
          if ("0".equals(locala.field_isRead))
            k = i + 1;
        }
        j++;
      }
      ab.v("MicroMsg.MallPayMsgManager", "msg xml unread msg is %s:".concat(String.valueOf(i)));
      AppMethodBeat.o(43765);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.c
 * JD-Core Version:    0.6.2
 */