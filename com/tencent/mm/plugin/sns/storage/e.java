package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.c.f;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.brf;
import com.tencent.mm.protocal.protobuf.bs;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e extends f
{
  protected static c.a ccO;
  protected static Map<String, b> reY;
  protected static Map<String, a> reZ;
  public String reW = null;
  protected int reX;

  static
  {
    AppMethodBeat.i(37824);
    c.a locala = new c.a();
    locala.xDb = new Field[24];
    locala.columns = new String[25];
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
    locala.columns[14] = "adinfo";
    locala.xDd.put("adinfo", "TEXT");
    localStringBuilder.append(" adinfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "adxml";
    locala.xDd.put("adxml", "TEXT");
    localStringBuilder.append(" adxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "createAdTime";
    locala.xDd.put("createAdTime", "INTEGER");
    localStringBuilder.append(" createAdTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "exposureTime";
    locala.xDd.put("exposureTime", "INTEGER");
    localStringBuilder.append(" exposureTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "firstControlTime";
    locala.xDd.put("firstControlTime", "INTEGER");
    localStringBuilder.append(" firstControlTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "recxml";
    locala.xDd.put("recxml", "TEXT");
    localStringBuilder.append(" recxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "subType";
    locala.xDd.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[21] = "exposureCount";
    locala.xDd.put("exposureCount", "INTEGER");
    localStringBuilder.append(" exposureCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[22] = "atAdinfo";
    locala.xDd.put("atAdinfo", "TEXT");
    localStringBuilder.append(" atAdinfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "remindInfoGroup";
    locala.xDd.put("remindInfoGroup", "BLOB");
    localStringBuilder.append(" remindInfoGroup BLOB");
    locala.columns[24] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    reY = new ConcurrentHashMap();
    reZ = new ConcurrentHashMap();
    AppMethodBeat.o(37824);
  }

  private b cqp()
  {
    AppMethodBeat.i(37802);
    b localb;
    if (this.field_recxml != null)
    {
      if (reY.containsKey(this.field_recxml))
      {
        localb = (b)reY.get(this.field_recxml);
        AppMethodBeat.o(37802);
        return localb;
      }
      localb = new b(this.field_recxml);
      reY.put(this.field_recxml, localb);
    }
    while (true)
    {
      if (localb == null)
      {
        localb = new b(null);
        AppMethodBeat.o(37802);
        break;
      }
      AppMethodBeat.o(37802);
      break;
      localb = null;
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void DF(int paramInt)
  {
    this.field_sourceType |= paramInt;
  }

  public final void L(Bundle paramBundle)
  {
    AppMethodBeat.i(37823);
    if (paramBundle == null)
      AppMethodBeat.o(37823);
    while (true)
    {
      return;
      ContentValues localContentValues = (ContentValues)paramBundle.getParcelable("values");
      this.field_snsId = localContentValues.getAsLong("snsId").longValue();
      this.field_userName = localContentValues.getAsString("userName");
      this.field_localFlag = localContentValues.getAsInteger("localFlag").intValue();
      this.field_createTime = localContentValues.getAsInteger("createTime").intValue();
      this.field_head = localContentValues.getAsInteger("head").intValue();
      this.field_localPrivate = localContentValues.getAsInteger("localPrivate").intValue();
      this.field_type = localContentValues.getAsInteger("type").intValue();
      this.field_sourceType = localContentValues.getAsInteger("sourceType").intValue();
      this.field_likeFlag = localContentValues.getAsInteger("likeFlag").intValue();
      this.field_pravited = localContentValues.getAsInteger("pravited").intValue();
      this.field_stringSeq = localContentValues.getAsString("stringSeq");
      this.field_content = localContentValues.getAsByteArray("content");
      this.field_attrBuf = localContentValues.getAsByteArray("attrBuf");
      this.field_postBuf = localContentValues.getAsByteArray("postBuf");
      this.field_adinfo = localContentValues.getAsString("adinfo");
      this.field_adxml = localContentValues.getAsString("adxml");
      this.field_createAdTime = localContentValues.getAsInteger("createAdTime").intValue();
      this.field_exposureTime = localContentValues.getAsInteger("exposureTime").intValue();
      this.field_firstControlTime = localContentValues.getAsInteger("firstControlTime").intValue();
      this.field_recxml = localContentValues.getAsString("recxml");
      this.field_subType = localContentValues.getAsInteger("subType").intValue();
      this.xDa = localContentValues.getAsLong("rowid").longValue();
      this.field_atAdinfo = localContentValues.getAsString("atAdinfo");
      this.field_remindInfoGroup = localContentValues.getAsByteArray("remindInfoGroup");
      this.reX = paramBundle.getInt("localid");
      AppMethodBeat.o(37823);
    }
  }

  public final boolean YR(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(37810);
    paramString = com.tencent.mm.modelsns.e.tC(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.reW = (g.x(this.field_content) + g.x(this.field_attrBuf));
      bool = true;
      AppMethodBeat.o(37810);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AdSnsInfo", paramString, "", new Object[0]);
        AppMethodBeat.o(37810);
      }
    }
  }

  public final void a(bs parambs)
  {
    AppMethodBeat.i(37812);
    try
    {
      this.field_remindInfoGroup = parambs.toByteArray();
      AppMethodBeat.o(37812);
      return;
    }
    catch (Exception parambs)
    {
      while (true)
      {
        ab.e("MicroMsg.AdSnsInfo", "remindInfo toBytes error! " + parambs.getMessage());
        AppMethodBeat.o(37812);
      }
    }
  }

  public final void bi(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(37818);
    this.field_attrBuf = paramArrayOfByte;
    this.reW = (g.x(this.field_content) + g.x(this.field_attrBuf));
    AppMethodBeat.o(37818);
  }

  public final void c(TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(37809);
    try
    {
      this.field_content = paramTimeLineObject.toByteArray();
      AppMethodBeat.o(37809);
      return;
    }
    catch (Exception paramTimeLineObject)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AdSnsInfo", paramTimeLineObject, "", new Object[0]);
        AppMethodBeat.o(37809);
      }
    }
  }

  public final boolean coX()
  {
    AppMethodBeat.i(37805);
    b localb = cqo();
    boolean bool;
    if (localb != null)
    {
      bool = localb.coX();
      AppMethodBeat.o(37805);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37805);
    }
  }

  public final String cqA()
  {
    AppMethodBeat.i(37819);
    String str = v.ao("ad_table_", this.field_snsId);
    AppMethodBeat.o(37819);
    return str;
  }

  public final n cqB()
  {
    AppMethodBeat.i(37820);
    n localn = new n();
    localn.c(cqu());
    ab.d("MicroMsg.AdSnsInfo", "from server xml ok %d", new Object[] { Long.valueOf(this.field_snsId) });
    localn.reX = this.reX;
    localn.field_userName = this.field_userName;
    localn.ls(this.field_createTime);
    localn.field_likeFlag = this.field_likeFlag;
    localn.kz(this.field_snsId);
    localn.field_sourceType = this.field_sourceType;
    localn.field_content = this.field_content;
    localn.DF(2);
    localn.DF(32);
    localn.field_attrBuf = this.field_attrBuf;
    TimeLineObject localTimeLineObject = localn.cqu();
    localTimeLineObject.jBB = this.field_userName;
    localn.field_pravited = localTimeLineObject.wEJ;
    localn.cqR();
    localn.c(localTimeLineObject);
    if (localTimeLineObject.xfI != null)
    {
      localn.field_type = localTimeLineObject.xfI.wbJ;
      localn.field_subType = localTimeLineObject.xfI.wbL;
    }
    localn.rfh = this;
    AppMethodBeat.o(37820);
    return localn;
  }

  public final Bundle cqC()
  {
    AppMethodBeat.i(37822);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.Hl());
    localBundle.putInt("localid", this.reX);
    AppMethodBeat.o(37822);
    return localBundle;
  }

  public final b cqo()
  {
    AppMethodBeat.i(37801);
    b localb;
    if (this.field_adxml != null)
    {
      if (reY.containsKey(this.field_adxml))
      {
        localb = (b)reY.get(this.field_adxml);
        AppMethodBeat.o(37801);
        return localb;
      }
      localb = new b(this.field_adxml);
      reY.put(this.field_adxml, localb);
    }
    while (true)
    {
      if (localb == null)
      {
        localb = new b(null);
        AppMethodBeat.o(37801);
        break;
      }
      AppMethodBeat.o(37801);
      break;
      localb = null;
    }
  }

  public final a cqq()
  {
    AppMethodBeat.i(37803);
    a locala;
    if (this.field_adinfo != null)
    {
      if (reZ.containsKey(this.field_adinfo))
      {
        locala = (a)reZ.get(this.field_adinfo);
        AppMethodBeat.o(37803);
        return locala;
      }
      locala = new a(this.field_adinfo);
      reZ.put(this.field_adinfo, locala);
    }
    while (true)
    {
      if (locala == null)
      {
        locala = new a(null);
        AppMethodBeat.o(37803);
        break;
      }
      AppMethodBeat.o(37803);
      break;
      locala = null;
    }
  }

  public final a cqr()
  {
    AppMethodBeat.i(37804);
    a locala;
    if (this.field_atAdinfo != null)
    {
      if (reZ.containsKey(this.field_atAdinfo))
      {
        locala = (a)reZ.get(this.field_atAdinfo);
        AppMethodBeat.o(37804);
        return locala;
      }
      locala = new a(this.field_atAdinfo);
      reZ.put(this.field_atAdinfo, locala);
    }
    while (true)
    {
      if (locala == null)
      {
        locala = new a(null);
        AppMethodBeat.o(37804);
        break;
      }
      AppMethodBeat.o(37804);
      break;
      locala = null;
    }
  }

  public final int cqs()
  {
    AppMethodBeat.i(37806);
    b localb = cqp();
    int i;
    if (localb == null)
    {
      i = 0;
      AppMethodBeat.o(37806);
    }
    while (true)
    {
      return i;
      i = localb.qUA;
      AppMethodBeat.o(37806);
    }
  }

  public final int cqt()
  {
    AppMethodBeat.i(37808);
    b localb = cqp();
    int i;
    if (localb == null)
    {
      i = 0;
      AppMethodBeat.o(37808);
    }
    while (true)
    {
      return i;
      i = localb.qUB;
      AppMethodBeat.o(37808);
    }
  }

  public final TimeLineObject cqu()
  {
    AppMethodBeat.i(37811);
    TimeLineObject localTimeLineObject1;
    if (this.field_content == null)
    {
      localTimeLineObject1 = com.tencent.mm.modelsns.e.ajM();
      AppMethodBeat.o(37811);
    }
    while (true)
    {
      return localTimeLineObject1;
      if (this.reW == null)
        this.reW = (g.x(this.field_content) + g.x(this.field_attrBuf));
      if (n.rfe.containsKey(this.reW))
      {
        localTimeLineObject1 = (TimeLineObject)n.rfe.get(this.reW);
        if (localTimeLineObject1 != null)
          AppMethodBeat.o(37811);
      }
      else
      {
        try
        {
          localTimeLineObject1 = new com/tencent/mm/protocal/protobuf/TimeLineObject;
          localTimeLineObject1.<init>();
          localTimeLineObject1 = (TimeLineObject)localTimeLineObject1.parseFrom(this.field_content);
          n.rfe.put(this.reW, localTimeLineObject1);
          AppMethodBeat.o(37811);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.AdSnsInfo", "error get snsinfo timeline!");
          TimeLineObject localTimeLineObject2 = com.tencent.mm.modelsns.e.ajM();
          AppMethodBeat.o(37811);
        }
      }
    }
  }

  public final bs cqv()
  {
    AppMethodBeat.i(37813);
    try
    {
      if (this.field_remindInfoGroup != null)
      {
        localbs = new com/tencent/mm/protocal/protobuf/bs;
        localbs.<init>();
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          localbs.parseFrom(this.field_remindInfoGroup);
          AppMethodBeat.o(37813);
          return localbs;
          localException1 = localException1;
          localbs = null;
          ab.e("MicroMsg.AdSnsInfo", "parse remindInfo error! " + localException1.getMessage());
          continue;
        }
        catch (Exception localException2)
        {
          continue;
        }
        bs localbs = null;
      }
    }
  }

  public final com.tencent.mm.bt.b cqw()
  {
    AppMethodBeat.i(37814);
    com.tencent.mm.bt.b localb;
    if ((cqv() != null) && (cqv().vDY != null) && (cqv().vDY.wTA != null))
    {
      localb = cqv().vDY.wTA.getBuffer();
      AppMethodBeat.o(37814);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(37814);
    }
  }

  public final com.tencent.mm.bt.b cqx()
  {
    AppMethodBeat.i(37815);
    com.tencent.mm.bt.b localb;
    if ((cqv() != null) && (cqv().vDY != null) && (cqv().vDY.wTB != null))
    {
      localb = cqv().vDY.wTB.getBuffer();
      AppMethodBeat.o(37815);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(37815);
    }
  }

  public final com.tencent.mm.bt.b cqy()
  {
    AppMethodBeat.i(37816);
    com.tencent.mm.bt.b localb;
    if ((cqv() != null) && (cqv().vDZ != null) && (cqv().vDZ.wTA != null))
    {
      localb = cqv().vDZ.wTA.getBuffer();
      AppMethodBeat.o(37816);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(37816);
    }
  }

  public final com.tencent.mm.bt.b cqz()
  {
    AppMethodBeat.i(37817);
    com.tencent.mm.bt.b localb;
    if ((cqv() != null) && (cqv().vDZ != null) && (cqv().vDZ.wTB != null))
    {
      localb = cqv().vDZ.wTB.getBuffer();
      AppMethodBeat.o(37817);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(37817);
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(37821);
    super.d(paramCursor);
    this.reX = ((int)this.xDa);
    AppMethodBeat.o(37821);
  }

  public final int getSource()
  {
    AppMethodBeat.i(37807);
    b localb = cqp();
    int i;
    if (localb == null)
    {
      i = 0;
      AppMethodBeat.o(37807);
    }
    while (true)
    {
      return i;
      i = localb.qUA;
      AppMethodBeat.o(37807);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.e
 * JD-Core Version:    0.6.2
 */