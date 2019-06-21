package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.bo;

final class c extends l
{
  private final boolean cuA;
  final String cvZ;
  final long fileSize;
  volatile boolean ufy;
  final long vdK;
  volatile byte[] veh;

  private c(String paramString1, int paramInt1, String paramString2, boolean paramBoolean, long paramLong1, String paramString3, int paramInt2, long paramLong2, int paramInt3, int paramInt4)
  {
    super(paramString1, i.aiX(paramString1), String.valueOf(paramInt1), "CheckResUpdate", paramString3, "GET", paramInt2, paramInt3, paramInt4);
    AppMethodBeat.i(79500);
    this.cvZ = paramString2;
    this.vdK = paramLong1;
    this.cuA = paramBoolean;
    this.fileSize = paramLong2;
    AppMethodBeat.o(79500);
  }

  static c d(s params)
  {
    AppMethodBeat.i(79502);
    params = new c(params.field_urlKey, bo.getInt(params.field_fileVersion, 0), params.field_md5, bo.nullAsNil(params.field_groupId2).equals("NewXml"), params.field_reportId, params.field_url, params.field_maxRetryTimes, params.field_fileSize, params.field_networkType, params.field_priority);
    AppMethodBeat.o(79502);
    return params;
  }

  public final String awa()
  {
    return "CheckResUpdate";
  }

  public final boolean dig()
  {
    return true;
  }

  public final String getFilePath()
  {
    AppMethodBeat.i(79501);
    String str = i.aiX(this.vdC);
    AppMethodBeat.o(79501);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.c
 * JD-Core Version:    0.6.2
 */