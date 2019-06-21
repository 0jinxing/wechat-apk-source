package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.c.el;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class n extends el
{
  protected static c.a ccO;
  protected static Map<String, TimeLineObject> rfe;
  protected static Map<String, bav> rff;
  private boolean qFG;
  public String reW;
  public int reX;
  public String rfg;
  public e rfh;
  private bav rfi;

  static
  {
    AppMethodBeat.i(37915);
    c.a locala = new c.a();
    locala.xDb = new Field[15];
    locala.columns = new String[16];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "snsId";
    locala.xDd.put("snsId", "LONG");
    localStringBuilder.append(" snsId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "userName";
    locala.xDd.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "localFlag";
    locala.xDd.put("localFlag", "INTEGER");
    localStringBuilder.append(" localFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.xDd.put("createTime", "INTEGER");
    localStringBuilder.append(" createTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "head";
    locala.xDd.put("head", "INTEGER");
    localStringBuilder.append(" head INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPrivate";
    locala.xDd.put("localPrivate", "INTEGER");
    localStringBuilder.append(" localPrivate INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "type";
    locala.xDd.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "sourceType";
    locala.xDd.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "likeFlag";
    locala.xDd.put("likeFlag", "INTEGER");
    localStringBuilder.append(" likeFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "pravited";
    locala.xDd.put("pravited", "INTEGER");
    localStringBuilder.append(" pravited INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "stringSeq";
    locala.xDd.put("stringSeq", "TEXT");
    localStringBuilder.append(" stringSeq TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "content";
    locala.xDd.put("content", "BLOB");
    localStringBuilder.append(" content BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "attrBuf";
    locala.xDd.put("attrBuf", "BLOB");
    localStringBuilder.append(" attrBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "postBuf";
    locala.xDd.put("postBuf", "BLOB");
    localStringBuilder.append(" postBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "subType";
    locala.xDd.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    locala.columns[15] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    rfe = new ConcurrentHashMap();
    rff = new ConcurrentHashMap();
    AppMethodBeat.o(37915);
  }

  public n()
  {
    this.reW = null;
    this.rfg = null;
    this.qFG = false;
    this.rfi = null;
  }

  public n(byte paramByte)
  {
    AppMethodBeat.i(37883);
    this.reW = null;
    this.rfg = null;
    this.qFG = false;
    this.rfi = null;
    kz(0L);
    AppMethodBeat.o(37883);
  }

  private static int kA(long paramLong)
  {
    AppMethodBeat.i(37887);
    String str = new SimpleDateFormat("yyyyMMdd").format(new Date(1000L * paramLong));
    try
    {
      i = Integer.valueOf(str).intValue();
      AppMethodBeat.o(37887);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SnsInfo", "error valueOf  ".concat(String.valueOf(str)));
        int i = (int)(paramLong / 86400L);
      }
    }
  }

  public static boolean kC(long paramLong)
  {
    AppMethodBeat.i(37897);
    boolean bool;
    if (bo.fp(paramLong / 1000L) > 1200L)
    {
      bool = true;
      AppMethodBeat.o(37897);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37897);
    }
  }

  public static void release()
  {
    try
    {
      AppMethodBeat.i(37893);
      rfe.clear();
      rff.clear();
      AppMethodBeat.o(37893);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static n z(n paramn)
  {
    AppMethodBeat.i(37884);
    n localn = new n();
    localn.reX = paramn.reX;
    localn.field_snsId = paramn.field_snsId;
    localn.field_userName = paramn.field_userName;
    localn.field_localFlag = paramn.field_localFlag;
    localn.field_createTime = paramn.field_createTime;
    localn.field_head = paramn.field_head;
    localn.field_localPrivate = paramn.field_localPrivate;
    localn.field_type = paramn.field_type;
    localn.field_sourceType = paramn.field_sourceType;
    localn.field_likeFlag = paramn.field_likeFlag;
    localn.field_pravited = paramn.field_pravited;
    localn.field_stringSeq = paramn.field_stringSeq;
    localn.field_content = paramn.field_content;
    localn.field_attrBuf = paramn.field_attrBuf;
    AppMethodBeat.o(37884);
    return localn;
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void DF(int paramInt)
  {
    this.field_sourceType |= paramInt;
  }

  public final boolean DI(int paramInt)
  {
    if ((this.field_sourceType & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void DJ(int paramInt)
  {
    this.field_sourceType &= (paramInt ^ 0xFFFFFFFF);
  }

  public final boolean YR(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(37896);
    paramString = com.tencent.mm.modelsns.e.tC(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.reW = (g.x(this.field_content) + g.x(this.field_attrBuf));
      bool = true;
      AppMethodBeat.o(37896);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsInfo", paramString, "", new Object[0]);
        AppMethodBeat.o(37896);
      }
    }
  }

  public final void bi(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(37890);
    this.field_attrBuf = paramArrayOfByte;
    this.reW = (g.x(this.field_content) + g.x(this.field_attrBuf));
    AppMethodBeat.o(37890);
  }

  public final void c(TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(37895);
    try
    {
      this.field_content = paramTimeLineObject.toByteArray();
      this.reW = (g.x(this.field_content) + g.x(this.field_attrBuf));
      AppMethodBeat.o(37895);
      return;
    }
    catch (Exception paramTimeLineObject)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.SnsInfo", paramTimeLineObject, "", new Object[0]);
    }
  }

  public final boolean cnn()
  {
    if (this.field_snsId == 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean coP()
  {
    AppMethodBeat.i(37912);
    boolean bool;
    if ((cqo() != null) && (cqo().coP()))
    {
      bool = true;
      AppMethodBeat.o(37912);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37912);
    }
  }

  public final boolean coQ()
  {
    AppMethodBeat.i(37913);
    boolean bool;
    if ((cqo() != null) && (cqo().coQ()))
    {
      bool = true;
      AppMethodBeat.o(37913);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37913);
    }
  }

  public final boolean coX()
  {
    AppMethodBeat.i(37909);
    b localb = cqo();
    boolean bool;
    if (localb != null)
    {
      bool = localb.coX();
      AppMethodBeat.o(37909);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37909);
    }
  }

  public final String cqA()
  {
    AppMethodBeat.i(37886);
    String str;
    if (DI(32))
    {
      str = v.ao("ad_table_", this.field_snsId);
      AppMethodBeat.o(37886);
    }
    while (true)
    {
      return str;
      str = v.ao("sns_table_", this.field_snsId);
      AppMethodBeat.o(37886);
    }
  }

  public final Bundle cqC()
  {
    AppMethodBeat.i(37914);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.Hl());
    localBundle.putInt("localid", this.reX);
    if (crd() != null)
      localBundle.putBundle("adValues", crd().cqC());
    AppMethodBeat.o(37914);
    return localBundle;
  }

  public final bav cqM()
  {
    AppMethodBeat.i(37882);
    bav localbav1;
    if (this.field_postBuf == null)
    {
      localbav1 = new bav();
      AppMethodBeat.o(37882);
    }
    while (true)
    {
      return localbav1;
      if (this.rfg == null)
        this.rfg = g.x(this.field_postBuf);
      if (rff.containsKey(this.rfg))
      {
        this.rfi = ((bav)rff.get(this.rfg));
        if (this.rfi != null)
        {
          localbav1 = this.rfi;
          AppMethodBeat.o(37882);
        }
      }
      else
      {
        try
        {
          localbav1 = new com/tencent/mm/protocal/protobuf/bav;
          localbav1.<init>();
          this.rfi = ((bav)localbav1.parseFrom(this.field_postBuf));
          rff.put(this.rfg, this.rfi);
          localbav1 = this.rfi;
          AppMethodBeat.o(37882);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
          bav localbav2 = new bav();
          AppMethodBeat.o(37882);
        }
      }
    }
  }

  public final int cqN()
  {
    return this.field_createTime;
  }

  public final void cqO()
  {
    this.field_localPrivate |= 1;
  }

  public final int cqP()
  {
    return this.field_localPrivate;
  }

  public final boolean cqQ()
  {
    if ((this.field_localFlag & 0x80) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cqR()
  {
    this.field_localFlag |= 2;
  }

  public final void cqS()
  {
    this.field_localFlag &= -3;
  }

  public final boolean cqT()
  {
    if ((this.field_localFlag & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String cqU()
  {
    AppMethodBeat.i(37889);
    String str;
    if (DI(32))
    {
      str = v.ao("ad_table_", this.reX);
      AppMethodBeat.o(37889);
    }
    while (true)
    {
      return str;
      str = v.ao("sns_table_", this.reX);
      AppMethodBeat.o(37889);
    }
  }

  public final boolean cqV()
  {
    if ((this.field_localFlag & 0x10) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cqW()
  {
    if (((this.field_localFlag & 0x20) > 0) && (this.field_snsId == 0L));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cqX()
  {
    this.field_localFlag &= -33;
  }

  public final void cqY()
  {
    this.field_localFlag |= 32;
  }

  public final String cqZ()
  {
    AppMethodBeat.i(37901);
    Object localObject = cqq();
    if (localObject == null)
    {
      localObject = "";
      AppMethodBeat.o(37901);
    }
    while (true)
    {
      return localObject;
      localObject = ((a)localObject).qTL;
      AppMethodBeat.o(37901);
    }
  }

  public final b cqo()
  {
    AppMethodBeat.i(37898);
    if (this.rfh == null)
      this.rfh = af.cnI().ku(this.field_snsId);
    b localb;
    if (this.rfh == null)
    {
      localb = new b(null);
      AppMethodBeat.o(37898);
    }
    while (true)
    {
      return localb;
      localb = this.rfh.cqo();
      AppMethodBeat.o(37898);
    }
  }

  public final a cqq()
  {
    AppMethodBeat.i(37899);
    if (this.rfh == null)
      this.rfh = af.cnI().ku(this.field_snsId);
    a locala;
    if (this.rfh == null)
    {
      locala = new a(null);
      AppMethodBeat.o(37899);
    }
    while (true)
    {
      return locala;
      locala = this.rfh.cqq();
      AppMethodBeat.o(37899);
    }
  }

  public final a cqr()
  {
    AppMethodBeat.i(37900);
    if (this.rfh == null)
      this.rfh = af.cnI().ku(this.field_snsId);
    a locala;
    if (this.rfh == null)
    {
      locala = new a(null);
      AppMethodBeat.o(37900);
    }
    while (true)
    {
      return locala;
      locala = this.rfh.cqr();
      AppMethodBeat.o(37900);
    }
  }

  public final TimeLineObject cqu()
  {
    AppMethodBeat.i(37894);
    TimeLineObject localTimeLineObject1;
    if (this.field_content == null)
    {
      localTimeLineObject1 = com.tencent.mm.modelsns.e.ajM();
      AppMethodBeat.o(37894);
    }
    while (true)
    {
      return localTimeLineObject1;
      if (this.reW == null)
        this.reW = (g.x(this.field_content) + g.x(this.field_attrBuf));
      if (rfe.containsKey(this.reW))
      {
        localTimeLineObject1 = (TimeLineObject)rfe.get(this.reW);
        if (localTimeLineObject1 != null)
          AppMethodBeat.o(37894);
      }
      else
      {
        try
        {
          localTimeLineObject1 = new com/tencent/mm/protocal/protobuf/TimeLineObject;
          localTimeLineObject1.<init>();
          localTimeLineObject1 = (TimeLineObject)localTimeLineObject1.parseFrom(this.field_content);
          rfe.put(this.reW, localTimeLineObject1);
          AppMethodBeat.o(37894);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
          TimeLineObject localTimeLineObject2 = com.tencent.mm.modelsns.e.ajM();
          AppMethodBeat.o(37894);
        }
      }
    }
  }

  public final String cra()
  {
    AppMethodBeat.i(37902);
    Object localObject = cqq();
    if (localObject == null)
    {
      localObject = "";
      AppMethodBeat.o(37902);
    }
    while (true)
    {
      return localObject;
      localObject = ((a)localObject).qTK;
      AppMethodBeat.o(37902);
    }
  }

  public final String crb()
  {
    AppMethodBeat.i(37904);
    Object localObject = cqq();
    if (localObject != null)
    {
      localObject = ((a)localObject).qTA;
      AppMethodBeat.o(37904);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(37904);
    }
  }

  public final String crc()
  {
    AppMethodBeat.i(37905);
    Object localObject = cqq();
    if (localObject != null)
    {
      localObject = ((a)localObject).qPj;
      AppMethodBeat.o(37905);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(37905);
    }
  }

  public final e crd()
  {
    AppMethodBeat.i(37906);
    if (this.rfh == null)
      this.rfh = af.cnI().ku(this.field_snsId);
    if (this.rfh != null)
    {
      this.rfh.field_createTime = this.field_createTime;
      this.rfh.field_userName = this.field_userName;
      this.rfh.field_likeFlag = this.field_likeFlag;
      this.rfh.field_attrBuf = this.field_attrBuf;
    }
    e locale = this.rfh;
    AppMethodBeat.o(37906);
    return locale;
  }

  public final int cre()
  {
    AppMethodBeat.i(37908);
    b localb = cqo();
    int i;
    if (localb != null)
    {
      i = localb.qUA;
      AppMethodBeat.o(37908);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(37908);
    }
  }

  public final int crf()
  {
    int i = 1;
    AppMethodBeat.i(37910);
    b localb;
    TimeLineObject localTimeLineObject;
    if (DI(32))
    {
      localb = cqo();
      localTimeLineObject = cqu();
      if (localb.coO())
      {
        i = 3;
        AppMethodBeat.o(37910);
      }
    }
    while (true)
    {
      return i;
      if ((localTimeLineObject != null) && (localTimeLineObject.xfI.wbJ == 27))
      {
        i = 6;
        AppMethodBeat.o(37910);
      }
      else if ((localb.coP()) || (localb.coQ()))
      {
        if ((localTimeLineObject != null) && (localTimeLineObject.xfI.wbJ == 15) && (localTimeLineObject.xfP != 1))
        {
          i = 5;
          AppMethodBeat.o(37910);
        }
        else
        {
          i = 4;
          AppMethodBeat.o(37910);
        }
      }
      else if (this.field_type == 1)
      {
        AppMethodBeat.o(37910);
      }
      else
      {
        i = 2;
        AppMethodBeat.o(37910);
        continue;
        i = -1;
        AppMethodBeat.o(37910);
      }
    }
  }

  public final boolean crg()
  {
    AppMethodBeat.i(37911);
    boolean bool;
    if ((cqu() != null) && (cqu().xfI.wbJ == 27))
    {
      bool = true;
      AppMethodBeat.o(37911);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37911);
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(37892);
    super.d(paramCursor);
    this.reX = ((int)this.xDa);
    AppMethodBeat.o(37892);
  }

  public final String getAdLink()
  {
    AppMethodBeat.i(37903);
    Object localObject = cqo();
    if (localObject != null)
    {
      localObject = ((b)localObject).qTA;
      AppMethodBeat.o(37903);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(37903);
    }
  }

  public final String getUserName()
  {
    return this.field_userName;
  }

  public final boolean isValid()
  {
    if (this.field_snsId != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void kB(long paramLong)
  {
    AppMethodBeat.i(37891);
    this.field_stringSeq = i.jV(paramLong);
    this.field_stringSeq = i.Xl(this.field_stringSeq);
    ab.d("MicroMsg.SnsInfo", paramLong + " stringSeq " + this.field_stringSeq);
    AppMethodBeat.o(37891);
  }

  public final void kz(long paramLong)
  {
    AppMethodBeat.i(37885);
    this.field_snsId = paramLong;
    if (paramLong != 0L)
      kB(paramLong);
    AppMethodBeat.o(37885);
  }

  public final void ls(int paramInt)
  {
    AppMethodBeat.i(37888);
    if ((paramInt - this.field_createTime < 180) && (paramInt - this.field_createTime >= 0))
    {
      if (this.field_head == 0)
        this.field_head = kA(this.field_createTime);
      AppMethodBeat.o(37888);
    }
    while (true)
    {
      return;
      this.field_createTime = paramInt;
      this.field_head = kA(paramInt);
      AppMethodBeat.o(37888);
    }
  }

  public final boolean sh()
  {
    AppMethodBeat.i(138383);
    boolean bool = DI(32);
    AppMethodBeat.o(138383);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.n
 * JD-Core Version:    0.6.2
 */