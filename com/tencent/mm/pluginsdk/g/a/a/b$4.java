package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.pluginsdk.g.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$4
  implements Runnable
{
  b$4(b paramb, String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79472);
    s locals = q.a.diy().ajg(this.vdU);
    int i = this.nWD;
    int j = this.nWE;
    int k = this.gSl;
    int m = this.gVS;
    String str1 = this.vdV;
    boolean bool1 = this.vdT;
    ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoDeleteLogic", "record ".concat(String.valueOf(locals)));
    ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoDeleteLogic", "delete version %d", new Object[] { Integer.valueOf(k) });
    boolean bool2 = false;
    if (locals != null)
      if (bo.getInt(locals.field_fileVersion, 0) <= k)
      {
        bool2 = true;
        String str2 = i.gN(i, j);
        Object localObject = i.aiX(str2);
        ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoDeleteLogic", "doDelete(%b), filePath(%s)", new Object[] { Boolean.valueOf(bool2), localObject });
        if (!bool2)
          break label431;
        q.a.diy().AH(str2);
        b.c.dif().g(i, j, 2, bool1);
        if (!(a.ajj((String)localObject) & true & a.ajj((String)localObject + ".decompressed") & a.ajj((String)localObject + ".decrypted")))
          break label383;
        if (locals != null)
        {
          j.z(locals.field_reportId, 21L);
          j.a(locals.field_resType, locals.field_subType, k, bool1, locals.field_sampleId);
        }
        label259: if (locals != null)
          break label410;
        localObject = new s();
        ((s)localObject).field_urlKey = str2;
        ((s)localObject).field_resType = i;
        ((s)localObject).field_subType = j;
        ((s)localObject).field_deleted = true;
        ((s)localObject).field_fileVersion = String.valueOf(k);
        ((s)localObject).field_reportId = m;
        ((s)localObject).field_sampleId = str1;
        q.a.diy().h((s)localObject);
        AppMethodBeat.o(79472);
      }
    while (true)
    {
      return;
      j.z(locals.field_reportId, 47L);
      j.z(locals.field_reportId, 22L);
      break;
      j.z(m, 47L);
      j.z(m, 22L);
      bool2 = true;
      break;
      label383: if (locals == null)
        break label259;
      j.z(locals.field_reportId, 22L);
      j.z(locals.field_reportId, 47L);
      break label259;
      label410: locals.field_deleted = true;
      locals.field_fileVersion = String.valueOf(k);
      q.a.diy().h(locals);
      label431: AppMethodBeat.o(79472);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b.4
 * JD-Core Version:    0.6.2
 */