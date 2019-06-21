package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.am;
import com.tencent.mm.j.a.a.a;
import com.tencent.mm.j.a.a.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.protocal.protobuf.qf;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class u extends am
{
  protected static c.a ccO;
  private Map<String, b> fxs;
  private a xIn;
  public a xIo;
  private List<String> xIp;

  static
  {
    AppMethodBeat.i(60102);
    c.a locala = new c.a();
    locala.xDb = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "chatroomname";
    locala.xDd.put("chatroomname", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" chatroomname TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "chatroomname";
    locala.columns[1] = "addtime";
    locala.xDd.put("addtime", "LONG");
    localStringBuilder.append(" addtime LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "memberlist";
    locala.xDd.put("memberlist", "TEXT");
    localStringBuilder.append(" memberlist TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "displayname";
    locala.xDd.put("displayname", "TEXT");
    localStringBuilder.append(" displayname TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "chatroomnick";
    locala.xDd.put("chatroomnick", "TEXT");
    localStringBuilder.append(" chatroomnick TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "roomflag";
    locala.xDd.put("roomflag", "INTEGER");
    localStringBuilder.append(" roomflag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "roomowner";
    locala.xDd.put("roomowner", "TEXT");
    localStringBuilder.append(" roomowner TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "roomdata";
    locala.xDd.put("roomdata", "BLOB");
    localStringBuilder.append(" roomdata BLOB");
    localStringBuilder.append(", ");
    locala.columns[8] = "isShowname";
    locala.xDd.put("isShowname", "INTEGER");
    localStringBuilder.append(" isShowname INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "selfDisplayName";
    locala.xDd.put("selfDisplayName", "TEXT");
    localStringBuilder.append(" selfDisplayName TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "style";
    locala.xDd.put("style", "INTEGER");
    localStringBuilder.append(" style INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "chatroomdataflag";
    locala.xDd.put("chatroomdataflag", "INTEGER");
    localStringBuilder.append(" chatroomdataflag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "modifytime";
    locala.xDd.put("modifytime", "LONG");
    localStringBuilder.append(" modifytime LONG");
    localStringBuilder.append(", ");
    locala.columns[13] = "chatroomnotice";
    locala.xDd.put("chatroomnotice", "TEXT");
    localStringBuilder.append(" chatroomnotice TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "chatroomVersion";
    locala.xDd.put("chatroomVersion", "INTEGER");
    localStringBuilder.append(" chatroomVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "chatroomnoticeEditor";
    locala.xDd.put("chatroomnoticeEditor", "TEXT");
    localStringBuilder.append(" chatroomnoticeEditor TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "chatroomnoticePublishTime";
    locala.xDd.put("chatroomnoticePublishTime", "LONG");
    localStringBuilder.append(" chatroomnoticePublishTime LONG");
    localStringBuilder.append(", ");
    locala.columns[17] = "chatroomLocalVersion";
    locala.xDd.put("chatroomLocalVersion", "LONG");
    localStringBuilder.append(" chatroomLocalVersion LONG");
    localStringBuilder.append(", ");
    locala.columns[18] = "chatroomStatus";
    locala.xDd.put("chatroomStatus", "INTEGER default '0' ");
    localStringBuilder.append(" chatroomStatus INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "memberCount";
    locala.xDd.put("memberCount", "INTEGER default '-1' ");
    localStringBuilder.append(" memberCount INTEGER default '-1' ");
    locala.columns[20] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(60102);
  }

  public u()
  {
    AppMethodBeat.i(60074);
    this.xIn = new a();
    this.xIo = this.xIn;
    this.xIp = new LinkedList();
    this.fxs = new ConcurrentHashMap();
    AppMethodBeat.o(60074);
  }

  private static int YC(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(60090);
    try
    {
      j = bo.getInt(paramString, 0);
      AppMethodBeat.o(60090);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        int j = i;
        if (paramString != null)
        {
          ab.e("MicroMsg.ChatRoomMember", "parserInt error ".concat(String.valueOf(paramString)));
          j = i;
        }
      }
    }
  }

  private void a(a parama)
  {
    AppMethodBeat.i(60077);
    if (this.field_roomdata == null)
      parama = new a();
    Iterator localIterator = parama.eow.iterator();
    while (localIterator.hasNext())
    {
      parama = (b)localIterator.next();
      if ((parama != null) && (parama.userName != null))
        this.fxs.put(parama.userName, parama);
    }
    AppMethodBeat.o(60077);
  }

  private static a aoq(String paramString)
  {
    AppMethodBeat.i(60091);
    a locala = new a();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(60091);
    String str1;
    Map localMap;
    for (paramString = locala; ; paramString = null)
    {
      return paramString;
      i = paramString.indexOf('<');
      str1 = paramString;
      if (i > 0)
        str1 = paramString.substring(i);
      localMap = br.z(str1, "RoomData");
      if (localMap != null)
        break;
      ab.e("MicroMsg.ChatRoomMember", "parse RoomData failed");
      AppMethodBeat.o(60091);
    }
    int i = 0;
    while (true)
    {
      try
      {
        b localb = new com/tencent/mm/j/a/a/b;
        localb.<init>();
        if (i == 0)
        {
          str2 = ".RoomData.Member.$UserName";
          str1 = ".RoomData.Member.DisplayName";
          paramString = ".RoomData.Member.Flag";
          str2 = bo.bc((String)localMap.get(str2), "");
          if (bo.isNullOrNil(str2))
            continue;
          localb.userName = str2;
          localb.eoz = bo.bc((String)localMap.get(str1), "");
          localb.eoA = YC((String)localMap.get(paramString));
          locala.eow.add(localb);
          i++;
          continue;
        }
        if (i == 0)
          break label391;
        paramString = new java/lang/StringBuilder;
        paramString.<init>(".RoomData.Member");
        str2 = i + ".$UserName";
        paramString = new java/lang/StringBuilder;
        paramString.<init>(".RoomData.Member");
        str1 = i + ".DisplayName";
        paramString = new java/lang/StringBuilder;
        paramString.<init>(".RoomData.Member");
        paramString = i + ".Flag";
        continue;
        locala.type = YC((String)localMap.get(".RoomData.Type"));
        locala.status = YC((String)localMap.get(".RoomData.Status"));
        locala.ehD = YC((String)localMap.get(".RoomData.MaxCount"));
        locala.eox = bo.bc((String)localMap.get(".RoomData.ExtInfo.Upgrader"), "");
        AppMethodBeat.o(60091);
        paramString = locala;
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(60091);
        paramString = locala;
      }
      break;
      label391: paramString = null;
      str1 = null;
      String str2 = null;
    }
  }

  public static List<String> aor(String paramString)
  {
    AppMethodBeat.i(60093);
    LinkedList localLinkedList = new LinkedList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(60093);
    while (true)
    {
      return localLinkedList;
      paramString = paramString.split(";");
      for (int i = 0; i < paramString.length; i++)
        localLinkedList.add(paramString[i]);
      AppMethodBeat.o(60093);
    }
  }

  private static String de(List<String> paramList)
  {
    AppMethodBeat.i(60092);
    Object localObject;
    if ((paramList == null) || (paramList.size() == 0))
    {
      localObject = "";
      AppMethodBeat.o(60092);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      for (int i = 0; i < paramList.size(); i++)
      {
        String str = (String)localObject + (String)paramList.get(i);
        localObject = str;
        if (i < paramList.size() - 1)
          localObject = str + ";";
      }
      AppMethodBeat.o(60092);
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean JR()
  {
    boolean bool1 = false;
    AppMethodBeat.i(60100);
    if (bo.isNullOrNil(this.field_roomowner))
      AppMethodBeat.o(60100);
    while (true)
    {
      return bool1;
      String str = r.Yz();
      if ((((c)g.K(c.class)).HH(this.field_chatroomname)) && (aoo(str)));
      for (int i = 1; ; i = 0)
      {
        boolean bool2 = this.field_roomowner.equals(str);
        if ((i == 0) && (!bool2))
          break label96;
        AppMethodBeat.o(60100);
        bool1 = true;
        break;
      }
      label96: AppMethodBeat.o(60100);
    }
  }

  public final void Mk(int paramInt)
  {
    AppMethodBeat.i(60082);
    if (b(this.xIo))
      drS();
    this.xIo.cGj = paramInt;
    try
    {
      this.field_roomdata = this.xIo.toByteArray();
      AppMethodBeat.o(60082);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ChatRoomMember", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(60082);
      }
    }
  }

  public final u a(String paramString, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(60097);
    this.field_modifytime = System.currentTimeMillis();
    Object localObject;
    if (!paramBoolean)
    {
      localObject = null;
      Iterator localIterator = parama.eow.iterator();
      if (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if ((localb.userName == null) || (!localb.userName.equals(paramString)))
          break label226;
        localObject = localb;
      }
    }
    label226: 
    while (true)
    {
      break;
      if (localObject != null)
      {
        this.field_selfDisplayName = localObject.eoz;
        this.field_isShowname = (localObject.eoA & 0x1);
      }
      for (int i = localObject.eoA; ; i = 0)
      {
        ab.d("MicroMsg.ChatRoomMember", "displayName[%s] roomFlag[%d] flag[%d]", new Object[] { this.field_selfDisplayName, Integer.valueOf(this.field_chatroomdataflag), Integer.valueOf(i) });
        parama.bJt = (i & 0x2 | parama.bJt & 0xFFFFFFFD);
        this.field_chatroomdataflag = parama.bJt;
        try
        {
          this.field_roomdata = parama.toByteArray();
          this.xIo = parama;
          a(parama);
          AppMethodBeat.o(60097);
          return this;
        }
        catch (Exception paramString)
        {
          while (true)
            ab.e("MicroMsg.ChatRoomMember", "exception:%s", new Object[] { bo.l(paramString) });
        }
      }
    }
  }

  public final List<String> afg()
  {
    AppMethodBeat.i(60076);
    if ((this.xIp == null) || (this.xIp.size() == 0))
      this.xIp = aor(this.field_memberlist);
    List localList = this.xIp;
    AppMethodBeat.o(60076);
    return localList;
  }

  public final b aon(String paramString)
  {
    AppMethodBeat.i(60080);
    if (this.fxs == null)
    {
      ab.e("MicroMsg.ChatRoomMember", "getChatroomData hashMap is null!");
      paramString = null;
      AppMethodBeat.o(60080);
    }
    while (true)
    {
      return paramString;
      if (this.fxs.size() <= 0)
        drS();
      paramString = (b)this.fxs.get(paramString);
      AppMethodBeat.o(60080);
    }
  }

  public final boolean aoo(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(60086);
    paramString = aon(paramString);
    if (paramString == null)
      AppMethodBeat.o(60086);
    while (true)
    {
      return bool;
      if ((paramString.eoA & 0x800) != 0)
      {
        bool = true;
        AppMethodBeat.o(60086);
      }
      else
      {
        AppMethodBeat.o(60086);
      }
    }
  }

  public final String aop(String paramString)
  {
    AppMethodBeat.i(60088);
    paramString = aon(paramString);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(60088);
    }
    while (true)
    {
      return paramString;
      paramString = bo.bc(paramString.eoB, "");
      AppMethodBeat.o(60088);
    }
  }

  public final boolean aos(String paramString)
  {
    AppMethodBeat.i(60101);
    boolean bool;
    if ((!bo.isNullOrNil(this.field_roomowner)) && (this.field_roomowner.equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(60101);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60101);
    }
  }

  public final boolean b(a parama)
  {
    AppMethodBeat.i(60079);
    boolean bool;
    if (this.xIn.computeSize() == parama.computeSize())
    {
      bool = true;
      AppMethodBeat.o(60079);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60079);
    }
  }

  public final void c(a parama)
  {
    AppMethodBeat.i(60095);
    try
    {
      this.field_roomdata = parama.toByteArray();
      AppMethodBeat.o(60095);
      return;
    }
    catch (Exception parama)
    {
      while (true)
      {
        ab.e("MicroMsg.ChatRoomMember", "exception:%s", new Object[] { bo.l(parama) });
        AppMethodBeat.o(60095);
      }
    }
  }

  public final a drR()
  {
    AppMethodBeat.i(60075);
    if (b(this.xIo))
      drS();
    a locala = this.xIo;
    AppMethodBeat.o(60075);
    return locala;
  }

  public final void drS()
  {
    AppMethodBeat.i(60078);
    if (bo.cb(this.field_roomdata))
      AppMethodBeat.o(60078);
    while (true)
    {
      return;
      try
      {
        a locala = new com/tencent/mm/j/a/a/a;
        locala.<init>();
        this.xIo = ((a)locala.parseFrom(this.field_roomdata));
        a(this.xIo);
        AppMethodBeat.o(60078);
      }
      catch (Exception localException)
      {
        while (true)
          this.xIo = new a();
      }
    }
  }

  public final int drT()
  {
    AppMethodBeat.i(60081);
    if (b(this.xIo))
      drS();
    int i = this.xIo.cGj;
    AppMethodBeat.o(60081);
    return i;
  }

  public final boolean drU()
  {
    AppMethodBeat.i(60083);
    if (b(this.xIo))
      drS();
    boolean bool;
    if (this.xIo.cGj < this.xIo.eoy)
    {
      bool = true;
      AppMethodBeat.o(60083);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60083);
    }
  }

  public final int drV()
  {
    AppMethodBeat.i(60085);
    if (b(this.xIo))
      drS();
    int i = this.xIo.type;
    AppMethodBeat.o(60085);
    return i;
  }

  public final int drW()
  {
    AppMethodBeat.i(60087);
    if (b(this.xIo))
      drS();
    int i = this.xIo.ehD;
    AppMethodBeat.o(60087);
    return i;
  }

  public final boolean drX()
  {
    if (this.field_isShowname > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final a drY()
  {
    AppMethodBeat.i(60099);
    if (b(this.xIo))
      drS();
    a locala = this.xIo;
    AppMethodBeat.o(60099);
    return locala;
  }

  public final u ep(List<String> paramList)
  {
    AppMethodBeat.i(60094);
    this.field_memberlist = de(paramList);
    AppMethodBeat.o(60094);
    return this;
  }

  public final u ib(String paramString1, String paramString2)
  {
    AppMethodBeat.i(60096);
    paramString1 = a(paramString1, aoq(paramString2), false);
    AppMethodBeat.o(60096);
    return paramString1;
  }

  public final void ji(int paramInt)
  {
    AppMethodBeat.i(60084);
    if (b(this.xIo))
      drS();
    this.field_chatroomdataflag = (this.xIo.bJt & 0xFFFFFFFD | paramInt & 0x2);
    AppMethodBeat.o(60084);
  }

  public final String mJ(String paramString)
  {
    AppMethodBeat.i(60089);
    paramString = aon(paramString);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(60089);
    }
    while (true)
    {
      return paramString;
      paramString = bo.bc(paramString.eoz, "");
      AppMethodBeat.o(60089);
    }
  }

  public final u pq(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.field_isShowname = i;
      return this;
    }
  }

  public final void v(String paramString, List<qf> paramList)
  {
    AppMethodBeat.i(60098);
    if (b(this.xIo))
      drS();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (qf)localIterator.next();
      if (this.fxs.containsKey(paramList.jBB))
      {
        b localb = (b)this.fxs.get(paramList.jBB);
        localb.eoz = paramList.vXl;
        localb.eoA = paramList.vXo;
        localb.eoB = paramList.vXp;
      }
    }
    this.xIo.eow.clear();
    localIterator = this.fxs.keySet().iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      this.xIo.eow.add(this.fxs.get(paramList));
    }
    a(paramString, this.xIo, false);
    AppMethodBeat.o(60098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.u
 * JD-Core Version:    0.6.2
 */