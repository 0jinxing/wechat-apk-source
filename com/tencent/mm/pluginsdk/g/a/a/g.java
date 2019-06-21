package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.bo;

final class g extends a
{
  final boolean cuA;
  final int cut;
  final int cuu;
  private final boolean cuw;
  final long fileSize;
  private final String vdF;
  final int vdG;
  private final byte[] vdH;
  final String vdI;
  final long vdK;
  private final String vdL;
  final byte[] veh;
  final boolean vei;
  final boolean vej;
  private final int vek;

  public g(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, long paramLong1, String paramString3, int paramInt4, int paramInt5, long paramLong2, String paramString4, byte[] paramArrayOfByte1, String paramString5, boolean paramBoolean1, boolean paramBoolean2, String paramString6, int paramInt6, int paramInt7, byte[] paramArrayOfByte2, long paramLong3, boolean paramBoolean3, boolean paramBoolean4, int paramInt8)
  {
  }

  public final int aiW(String paramString)
  {
    AppMethodBeat.i(79519);
    int i = bo.getInt(this.veW, 0);
    int j = bo.getInt(paramString, 0);
    AppMethodBeat.o(79519);
    return i - j;
  }

  public final s dih()
  {
    AppMethodBeat.i(79518);
    s locals = super.dih();
    locals.field_fileUpdated = this.cuw;
    locals.field_resType = this.cut;
    locals.field_subType = this.cuu;
    locals.field_reportId = this.vdK;
    locals.field_sampleId = this.vdL;
    locals.field_eccSignature = this.vdH;
    locals.field_originalMd5 = this.vdI;
    locals.field_fileCompress = this.vei;
    locals.field_fileEncrypt = this.vej;
    locals.field_encryptKey = this.vdF;
    locals.field_keyVersion = this.vdG;
    locals.field_fileSize = this.fileSize;
    locals.field_EID = this.vek;
    AppMethodBeat.o(79518);
    return locals;
  }

  public final String toString()
  {
    AppMethodBeat.i(79517);
    String str = "CheckResUpdateRequest | fileUpdated=" + this.cuw + ", resType=" + this.cut + ", subType=" + this.cuu + ", reportId=" + this.vdK + ", sampleId='" + this.vdL + '\'' + ", originalMd5='" + this.vdI + '\'' + ", fileCompress=" + this.vei + ", fileEncrypt=" + this.vej + ", encryptKey='" + this.vdF + '\'' + ", keyVersion=" + this.vdG + ", EID=" + this.vek + ", fileSize=" + this.fileSize + ", fromNewXml=" + this.cuA + " | " + super.toString();
    AppMethodBeat.o(79517);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.g
 * JD-Core Version:    0.6.2
 */