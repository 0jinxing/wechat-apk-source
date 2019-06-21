package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.bo;

final class b$6
  implements Runnable
{
  b$6(b paramb, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79474);
    s locals = q.a.diy().ajg(this.vdU);
    String str1 = this.vdX;
    String str2 = this.vdY;
    int i = this.vdZ;
    int j = this.gVS;
    String str3 = this.vdV;
    boolean bool = this.vea;
    if (locals == null)
    {
      locals = new s();
      locals.field_keyVersion = i;
      locals.field_encryptKey = str2;
      locals.field_reportId = j;
      locals.field_sampleId = str3;
      locals.field_originalMd5 = str1;
      q.a.diy().h(locals);
      j.z(j, 51L);
      j.z(j, 45L);
      AppMethodBeat.o(79474);
    }
    while (true)
    {
      return;
      if (locals.field_keyVersion < i)
      {
        locals.field_keyVersion = i;
        locals.field_encryptKey = str2;
        locals.field_reportId = j;
        locals.field_sampleId = str3;
        if (bo.isNullOrNil(locals.field_originalMd5))
          locals.field_originalMd5 = str1;
        q.a.diy().h(locals);
        f.b.a(locals, true, bool);
        AppMethodBeat.o(79474);
      }
      else
      {
        if ((bool) && (locals.field_keyVersion == i))
          f.b.a(locals, true, true);
        AppMethodBeat.o(79474);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b.6
 * JD-Core Version:    0.6.2
 */