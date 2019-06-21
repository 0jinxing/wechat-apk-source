package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.f.b;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
  implements f.b
{
  final int cut;
  final int cuu;
  final int cuv;
  final boolean cuw;
  final String filePath;
  final String url;
  final String vdC;
  final boolean vdD;
  final boolean vdE;
  final String vdF;
  final int vdG;
  final byte[] vdH;
  final String vdI;
  final boolean vdJ;
  final long vdK;
  final String vdL;
  final int vdM;
  final int vdN;

  private a(String paramString1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3, String paramString3, int paramInt4, byte[] paramArrayOfByte, String paramString4, boolean paramBoolean4, long paramLong, String paramString5, String paramString6, int paramInt5, int paramInt6)
  {
    this.vdC = paramString1;
    this.cut = paramInt1;
    this.cuu = paramInt2;
    this.cuv = paramInt3;
    this.cuw = paramBoolean1;
    this.filePath = paramString2;
    this.vdD = paramBoolean2;
    this.vdE = paramBoolean3;
    this.vdF = paramString3;
    this.vdG = paramInt4;
    this.vdH = paramArrayOfByte;
    this.vdI = paramString4;
    this.vdJ = paramBoolean4;
    this.vdK = paramLong;
    this.vdL = paramString5;
    this.url = paramString6;
    this.vdM = paramInt5;
    this.vdN = paramInt6;
  }

  public static a a(s params)
  {
    AppMethodBeat.i(79466);
    params = new a(params.field_urlKey, params.field_resType, params.field_subType, bo.getInt(params.field_fileVersion, 0), params.field_fileUpdated, params.field_filePath, params.field_fileEncrypt, params.field_fileCompress, params.field_encryptKey, params.field_keyVersion, params.field_eccSignature, params.field_originalMd5, bo.nullAsNil(params.field_groupId2).equals("NewXml"), params.field_reportId, params.field_sampleId, params.field_url, params.field_maxRetryTimes, params.field_retryTimes);
    AppMethodBeat.o(79466);
    return params;
  }

  public final String dib()
  {
    return this.vdC;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.a
 * JD-Core Version:    0.6.2
 */