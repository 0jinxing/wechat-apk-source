package com.tencent.mm.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bw;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.mk;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;

public final class f extends bw
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(59562);
    c.a locala = new c.a();
    locala.xDb = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "cgi";
    locala.xDd.put("cgi", "TEXT");
    localStringBuilder.append(" cgi TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "cmdid";
    locala.xDd.put("cmdid", "INTEGER");
    localStringBuilder.append(" cmdid INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "functionmsgid";
    locala.xDd.put("functionmsgid", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" functionmsgid TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "functionmsgid";
    locala.columns[3] = "version";
    locala.xDd.put("version", "LONG");
    localStringBuilder.append(" version LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "preVersion";
    locala.xDd.put("preVersion", "LONG");
    localStringBuilder.append(" preVersion LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "retryinterval";
    locala.xDd.put("retryinterval", "INTEGER");
    localStringBuilder.append(" retryinterval INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "reportid";
    locala.xDd.put("reportid", "INTEGER");
    localStringBuilder.append(" reportid INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "successkey";
    locala.xDd.put("successkey", "INTEGER");
    localStringBuilder.append(" successkey INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "failkey";
    locala.xDd.put("failkey", "INTEGER");
    localStringBuilder.append(" failkey INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "finalfailkey";
    locala.xDd.put("finalfailkey", "INTEGER");
    localStringBuilder.append(" finalfailkey INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "custombuff";
    locala.xDd.put("custombuff", "TEXT");
    localStringBuilder.append(" custombuff TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "addMsg";
    locala.xDd.put("addMsg", "BLOB");
    localStringBuilder.append(" addMsg BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "status";
    locala.xDd.put("status", "INTEGER default '-1' ");
    localStringBuilder.append(" status INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "needShow";
    locala.xDd.put("needShow", "INTEGER default 'false' ");
    localStringBuilder.append(" needShow INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "defaultContent";
    locala.xDd.put("defaultContent", "TEXT");
    localStringBuilder.append(" defaultContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "actionTime";
    locala.xDd.put("actionTime", "LONG default '-1' ");
    localStringBuilder.append(" actionTime LONG default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "delayTime";
    locala.xDd.put("delayTime", "LONG default '-1' ");
    localStringBuilder.append(" delayTime LONG default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[17] = "retryCount";
    locala.xDd.put("retryCount", "INTEGER default '0' ");
    localStringBuilder.append(" retryCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "retryCountLimit";
    locala.xDd.put("retryCountLimit", "INTEGER default '0' ");
    localStringBuilder.append(" retryCountLimit INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "businessInfo";
    locala.xDd.put("businessInfo", "BLOB");
    localStringBuilder.append(" businessInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[20] = "opCode";
    locala.xDd.put("opCode", "INTEGER default '-1' ");
    localStringBuilder.append(" opCode INTEGER default '-1' ");
    locala.columns[21] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(59562);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final int Ah()
  {
    return this.field_opCode;
  }

  public final String Ai()
  {
    return this.field_functionmsgid;
  }

  public final long Aj()
  {
    return this.field_preVersion;
  }

  public final String Ak()
  {
    return this.field_custombuff;
  }

  public final cm Al()
  {
    return this.field_addMsg;
  }

  public final long Am()
  {
    return this.field_delayTime;
  }

  public final long An()
  {
    return this.field_actionTime;
  }

  public final void Ao()
  {
    this.field_status = -1;
  }

  public final void Ap()
  {
    this.field_retryCount = 0;
  }

  public final void a(cm paramcm)
  {
    if (paramcm != null)
      this.field_addMsg = paramcm;
  }

  public final void a(mk parammk)
  {
    this.field_businessInfo = parammk;
  }

  public final void aG(long paramLong)
  {
    this.field_version = paramLong;
  }

  public final void aH(long paramLong)
  {
    this.field_preVersion = paramLong;
  }

  public final void aI(long paramLong)
  {
    this.field_delayTime = paramLong;
  }

  public final void aJ(long paramLong)
  {
    this.field_actionTime = paramLong;
  }

  public final void be(boolean paramBoolean)
  {
    this.field_needShow = paramBoolean;
  }

  public final void cD(String paramString)
  {
    AppMethodBeat.i(59556);
    if (!bo.isNullOrNil(paramString))
      this.field_cgi = paramString;
    AppMethodBeat.o(59556);
  }

  public final void cE(String paramString)
  {
    AppMethodBeat.i(59557);
    if (!bo.isNullOrNil(paramString))
      this.field_functionmsgid = paramString;
    AppMethodBeat.o(59557);
  }

  public final void cF(String paramString)
  {
    AppMethodBeat.i(59558);
    if (!bo.isNullOrNil(paramString))
      this.field_custombuff = paramString;
    AppMethodBeat.o(59558);
  }

  public final void cG(String paramString)
  {
    if (paramString != null)
      this.field_defaultContent = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(59560);
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      if ((paramObject.field_functionmsgid.equals(this.field_functionmsgid)) && (paramObject.xDa == this.xDa))
      {
        bool = true;
        AppMethodBeat.o(59560);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(59560);
      continue;
      AppMethodBeat.o(59560);
    }
  }

  public final void ga(int paramInt)
  {
    this.field_opCode = paramInt;
  }

  public final void gb(int paramInt)
  {
    this.field_reportid = paramInt;
  }

  public final void gc(int paramInt)
  {
    this.field_successkey = paramInt;
  }

  public final void gd(int paramInt)
  {
    this.field_failkey = paramInt;
  }

  public final void ge(int paramInt)
  {
    this.field_finalfailkey = paramInt;
  }

  public final int getStatus()
  {
    return this.field_status;
  }

  public final long getVersion()
  {
    return this.field_version;
  }

  public final void gf(int paramInt)
  {
    this.field_retryCountLimit = paramInt;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(59559);
    int i = this.field_functionmsgid.hashCode();
    AppMethodBeat.o(59559);
    return i;
  }

  public final void setCmdId(int paramInt)
  {
    this.field_cmdid = paramInt;
  }

  public final void setRetryInterval(int paramInt)
  {
    this.field_retryinterval = paramInt;
  }

  public final String toString()
  {
    AppMethodBeat.i(59561);
    String str1 = "@null";
    String str2 = str1;
    if (!bo.isNullOrNil(this.field_cgi))
    {
      String[] arrayOfString = this.field_cgi.split("/");
      str2 = str1;
      if (arrayOfString.length > 0)
        str2 = arrayOfString[(arrayOfString.length - 1)];
    }
    str2 = "FunctionMsgItem{cgi='" + str2 + '\'' + ", cmdid=" + this.field_cmdid + ", functionmsgid='" + this.field_functionmsgid + '\'' + ", version=" + this.field_version + ", preVersion=" + this.field_preVersion + ", status=" + this.field_status + ", actionTime=" + this.field_actionTime + ", delayTime=" + this.field_delayTime + ", retryCount=" + this.field_retryCount + ", retryCount=" + this.field_opCode + '}';
    AppMethodBeat.o(59561);
    return str2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.api.f
 * JD-Core Version:    0.6.2
 */