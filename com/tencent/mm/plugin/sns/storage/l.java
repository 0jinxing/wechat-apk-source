package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ek;
import com.tencent.mm.protocal.protobuf.aao;
import com.tencent.mm.protocal.protobuf.acs;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;

public final class l extends ek
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(37858);
    c.a locala = new c.a();
    locala.xDb = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.xDd.put("userName", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" userName TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "userName";
    locala.columns[1] = "md5";
    locala.xDd.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "newerIds";
    locala.xDd.put("newerIds", "TEXT");
    localStringBuilder.append(" newerIds TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "bgId";
    locala.xDd.put("bgId", "TEXT");
    localStringBuilder.append(" bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bgUrl";
    locala.xDd.put("bgUrl", "TEXT");
    localStringBuilder.append(" bgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "older_bgId";
    locala.xDd.put("older_bgId", "TEXT");
    localStringBuilder.append(" older_bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "local_flag";
    locala.xDd.put("local_flag", "INTEGER");
    localStringBuilder.append(" local_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "istyle";
    locala.xDd.put("istyle", "INTEGER");
    localStringBuilder.append(" istyle INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "iFlag";
    locala.xDd.put("iFlag", "INTEGER");
    localStringBuilder.append(" iFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "icount";
    locala.xDd.put("icount", "INTEGER");
    localStringBuilder.append(" icount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "faultS";
    locala.xDd.put("faultS", "BLOB");
    localStringBuilder.append(" faultS BLOB");
    localStringBuilder.append(", ");
    locala.columns[11] = "snsBgId";
    locala.xDd.put("snsBgId", "LONG");
    localStringBuilder.append(" snsBgId LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "snsuser";
    locala.xDd.put("snsuser", "BLOB");
    localStringBuilder.append(" snsuser BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "adsession";
    locala.xDd.put("adsession", "BLOB");
    localStringBuilder.append(" adsession BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "lastFirstPageRequestErrCode";
    locala.xDd.put("lastFirstPageRequestErrCode", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrCode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "lastFirstPageRequestErrType";
    locala.xDd.put("lastFirstPageRequestErrType", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrType INTEGER");
    locala.columns[16] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(37858);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void a(ccl paramccl)
  {
    AppMethodBeat.i(37855);
    if (paramccl == null)
      AppMethodBeat.o(37855);
    while (true)
    {
      return;
      try
      {
        this.field_snsuser = paramccl.toByteArray();
        AppMethodBeat.o(37855);
      }
      catch (Exception paramccl)
      {
        AppMethodBeat.o(37855);
      }
    }
  }

  public final void cqI()
  {
    this.field_local_flag &= -3;
  }

  public final boolean cqJ()
  {
    if ((this.field_local_flag & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final ccl cqK()
  {
    AppMethodBeat.i(37856);
    try
    {
      ccl localccl = new com/tencent/mm/protocal/protobuf/ccl;
      localccl.<init>();
      localccl = (ccl)localccl.parseFrom(this.field_snsuser);
      AppMethodBeat.o(37856);
      return localccl;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(37856);
      }
    }
  }

  public final aao cqL()
  {
    AppMethodBeat.i(37857);
    new acs();
    Object localObject1 = new aao();
    Object localObject2 = localObject1;
    if (!bo.cb(this.field_faultS));
    try
    {
      localObject2 = new com/tencent/mm/protocal/protobuf/acs;
      ((acs)localObject2).<init>();
      localObject2 = (acs)((acs)localObject2).parseFrom(this.field_faultS);
      if (((acs)localObject2).wkv.size() > 0)
      {
        localObject2 = (aao)((acs)localObject2).wkv.getFirst();
        localObject1 = localObject2;
        localObject2 = localObject1;
        AppMethodBeat.o(37857);
        return localObject2;
      }
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject3 = localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.l
 * JD-Core Version:    0.6.2
 */