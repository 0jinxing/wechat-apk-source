package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bd extends a
{
  private long dbm = 0L;
  private long dbn = 0L;
  private String dbo = "";
  private long dbp = 0L;
  private String dbq = "";
  private long dbr = 0L;
  private long dbs = 0L;
  private long dbt = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(108889);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dbm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbt);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108889);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108890);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("SearchID:").append(this.dbm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("RecommentID:").append(this.dbn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("QueryContent:").append(this.dbo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FinishType:").append(this.dbp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Behavior:").append(this.dbq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MaxIndex:").append(this.dbr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NewSearchID:").append(this.dbs);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NewRecommentID:").append(this.dbt);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108890);
    return localObject;
  }

  public final String Gw()
  {
    return this.dbq;
  }

  public final bd cH(long paramLong)
  {
    this.dbp = paramLong;
    return this;
  }

  public final bd cI(long paramLong)
  {
    this.dbr = paramLong;
    return this;
  }

  public final bd cJ(long paramLong)
  {
    this.dbs = paramLong;
    return this;
  }

  public final bd cK(long paramLong)
  {
    this.dbt = paramLong;
    return this;
  }

  public final bd fT(String paramString)
  {
    AppMethodBeat.i(108887);
    this.dbo = t("QueryContent", paramString, true);
    AppMethodBeat.o(108887);
    return this;
  }

  public final bd fU(String paramString)
  {
    AppMethodBeat.i(108888);
    this.dbq = t("Behavior", paramString, true);
    AppMethodBeat.o(108888);
    return this;
  }

  public final int getId()
  {
    return 17121;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bd
 * JD-Core Version:    0.6.2
 */